package com.monocept.controller;

import java.io.IOException;
import java.io.OutputStream;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.monocept.model.Customer;
import com.monocept.service.BankService;

@WebServlet("/AdminViewTransactionsController")
public class AdminViewTransactionsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	List<Customer> transactions;

	public AdminViewTransactionsController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		BankService bankService = BankService.getInstance();

		try {
			transactions = bankService.getAllTransactions();
			
			request.setAttribute("customerTransactions", transactions);
			
			RequestDispatcher dispatch = request.getRequestDispatcher("/view/adminTransactionsView.jsp");
			dispatch.forward(request, response);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();

		response.setContentType("text/csv");
		response.setHeader("Content-Disposition",
				"attachment; filename=\"Admin-" + session.getAttribute("sessionName") + ".csv\"");

		try {
			OutputStream outputStream = response.getOutputStream();
			String outputResult = "";
			for (Customer txns : transactions) {
				outputResult = outputResult + txns.getName() + ", " + txns.getBalance() + ", "
						+ txns.getType() + ", " + txns.getDate() + "\n";
			}
			outputStream.write(outputResult.getBytes());
			outputStream.flush();
			outputStream.close();
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

}
