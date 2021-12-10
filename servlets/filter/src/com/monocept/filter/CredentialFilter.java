package com.monocept.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter("/FilterServlet")
public class CredentialFilter implements Filter {

	public CredentialFilter() {
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		PrintWriter pw = response.getWriter();
		HttpServletRequest req = (HttpServletRequest) request;
		int id = Integer.parseInt(request.getParameter("userid"));
		String name = request.getParameter("username");

		if (id > 0 && name.length() > 5) {
			chain.doFilter(request, response);
		}

		else {
			pw.println("Invalid Input");
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
