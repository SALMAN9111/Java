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

@WebServlet("/viewpassbook")
public class ViewPassbookController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	List<Customer> custHistory;

	public ViewPassbookController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		BankService bankservice = BankService.getInstance();

		HttpSession session = request.getSession();
		String username = (String) session.getAttribute("sessionName");
		String fromdate = request.getParameter("fromDate");
		String todate = request.getParameter("toDate");

		try {
			custHistory = bankservice.showPassbook(username);

			request.setAttribute("customerHistory", custHistory);
			RequestDispatcher display = request.getRequestDispatcher("/view/passbook.jsp");
			display.forward(request, response);
			return;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("passbook do get");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();

		response.setContentType("text/csv");
		response.setHeader("Content-Disposition",
				"attachment; filename=\"" + session.getAttribute("sessionName") + ".csv\"");

		try {
			OutputStream outputStream = response.getOutputStream();
			String outputResult = "";
			for (Customer transactions : custHistory) {
				outputResult = outputResult + transactions.getName() + ", " + transactions.getBalance() + ", "
						+ transactions.getType() + ", " + transactions.getDate() + "\n";
			}
			outputStream.write(outputResult.getBytes());
			outputStream.flush();
			outputStream.close();
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
