package com.sapient;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




public class CheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public CheckServlet() {
        super();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String name=request.getParameter("t1");
		String pwd=request.getParameter("t2");
		PrintWriter out=response.getWriter();
		Jdbccon jd=new Jdbccon();
		
		if(jd.check(name,pwd)==true)
		{	//System.out.println("sucess");
		RequestDispatcher rd=request.getRequestDispatcher("final.jsp");
		rd.forward(request,response);
		}
		else
		{	out.println("<h1>Sorry Invalid Credentials .....</h1>");
			RequestDispatcher rd=request.getRequestDispatcher("final2.jsp");
			rd.include(request, response);
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}


}
