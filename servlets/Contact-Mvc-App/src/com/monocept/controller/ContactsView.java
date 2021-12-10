package com.monocept.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.moncept.Service.ContactService;
import com.monocept.model.Contact;

@WebServlet("/view")
public class ContactsView extends HttpServlet {
  private static final long serialVersionUID = 1L;

  public ContactsView() {
    super();
  }

  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    ContactService contservie=ContactService.getInstance();
    List<Contact> contactlist = contservie.getContacts();

    request.setAttribute("contacts", contactlist);
    RequestDispatcher view = request.getRequestDispatcher("/view/contactsView.jsp");
    view.forward(request, response);

  }

}