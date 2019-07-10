package com.sapient;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public RegisterServlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name=request.getParameter("t1");
		String pwd=request.getParameter("t2");
		String cpwd=request.getParameter("t3");
		PrintWriter out=response.getWriter();
		Jdbccon jd=new Jdbccon();
		
		if(pwd.equals(cpwd) && jd.check1(name,pwd)==true)
		{	//System.out.println("sucess");
		RequestDispatcher rd=request.getRequestDispatcher("reg.jsp");
		rd.forward(request,response);
		}
		else
		{	out.println("<h1>Sorry Invalid Credentials .....</h1>");
			RequestDispatcher rd=request.getRequestDispatcher("reg1.jsp");
			rd.include(request, response);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
