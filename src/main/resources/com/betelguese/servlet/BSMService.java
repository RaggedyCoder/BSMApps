package com.betelguese.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.betelguese.utils.HttpRequestProcess;

/**
 * Servlet implementation class BSMService
 */
@WebServlet(asyncSupported = true, description = "This Servlet is for the Book Store manager Client Application", urlPatterns = { "/BSMService" })
public final class BSMService extends HttpServlet {

	private static final long serialVersionUID = -5908758671269573120L;

	// private HttpRequestProcess requestProcess;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public BSMService() {
		super();
		requestProcess = new HttpRequestProcess();
	}

	/**
	 * Handles the HTTP <code>GET</code> method.
	 *
	 * @param request
	 *            servlet request
	 * @param response
	 *            servlet response
	 * @throws ServletException
	 *             if a servlet-specific error occurs
	 * @throws IOException
	 *             if an I/O error occurs
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// String serverProcessedService = requestProcess.getRequestProcess(
		// request, response);
		// response.setContentType("text/html;charset=UTF-8");
		 PrintWriter out = response.getWriter();
		 out.println("tuman");
	}

	/**
	 * Handles the HTTP <code>POST</code> method.
	 *
	 * @param request
	 *            servlet request
	 * @param response
	 *            servlet response
	 * @throws ServletException
	 *             if a servlet-specific error occurs
	 * @throws IOException
	 *             if an I/O error occurs
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// String serverProcessedService = requestProcess.postRequestProcess(
		// request, response);
		// response.setContentType("text/html;charset=UTF-8");
		// PrintWriter out = response.getWriter();
		// out.println(serverProcessedService);
	}
}
