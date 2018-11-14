package com.test.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public LoginServlet() {
        System.out.println("LoginServlet Constructor called!");
    }

    public void init(ServletConfig config) throws ServletException {
        System.out.println("LoginServlet \"Init\" method called");
    }

    public void destroy() {
        System.out.println("LoginServlet \"Destroy\" method called");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,
			IOException {
        System.out.println("LoginServlet \"Service\" method(inherited) called");
        System.out.println("LoginServlet \"DoGet\" method called");

        storeInSessionAndRespond(request, response);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,
			IOException {
        System.out.println("LoginServlet \"Service\" method(inherited) called");
        System.out.println("LoginServlet \"DoPost\" method called");

        storeInSessionAndRespond(request, response);

    }

    private void storeInSessionAndRespond(HttpServletRequest request,
                                          HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        String uname = request.getParameter("uname");
        String emailId = request.getParameter("email");
        System.out.println("Username from jsp page is " + uname + " and email id is " + emailId);
        //Create a session
        HttpSession session = request.getSession(true);
        if (session != null) {
            //store the attributes
            session.setAttribute("uname", uname);
            session.setAttribute("emailId", emailId);
            System.out.println("Username and email id is stored in the session");
        }

        out.write("<html><body><h2>Username and email id is stored in the session</h2></body></html>");
    }


}
