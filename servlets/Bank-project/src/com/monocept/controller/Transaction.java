package com.monocept.controller;

import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.monocept.service.BankService;
import com.mysql.cj.Session;

/**
 * Servlet implementation class Transaction
 */
@WebServlet("/dotransaction")
public class Transaction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Transaction() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("transaction do get");
		RequestDispatcher display = request.getRequestDispatcher("/view/transaction.jsp");
		display.forward(request, response);
		return;

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Double amount = Double.parseDouble(request.getParameter("amount"));

		// String username = request.getParameter("name");
		HttpSession session = request.getSession();
		String username = (String) session.getAttribute("sessionName");

		System.out.println("check kaustubh - " + request.getParameter("tarnsac"));

		String transactype = request.getParameter("tarnsac");
		BankService bankservice = BankService.getInstance();
		
		
		if (transactype.equals("deposit")) {

			try {
				boolean trsanSuccess = bankservice.depositMoney(amount, username);

				if (trsanSuccess) {
					RequestDispatcher display = request.getRequestDispatcher("/view/success.jsp");
					display.forward(request, response);
					return;
				}
				RequestDispatcher display = request.getRequestDispatcher("/view/fail.jsp");
				display.forward(request, response);
				return;

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		else {

			try {
				boolean trsanSuccess = bankservice.withDrawMoney(amount, username);

				if (trsanSuccess) {
					RequestDispatcher display = request.getRequestDispatcher("/view/success.jsp");
					display.forward(request, response);
					return;
				}
				RequestDispatcher display = request.getRequestDispatcher("/view/fail.jsp");
				display.forward(request, response);
				return;

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
