package com.placide;

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

/**
 * Servlet Filter implementation class nameFilter
 */
@WebFilter("/addStudent")
public class nameFilter implements Filter {

	public void destroy() {
		// TODO Auto-generated method stub
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		
		PrintWriter out=response.getWriter();
		HttpServletRequest req=(HttpServletRequest)request;
		int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		int marks=Integer.parseInt(request.getParameter("marks"));
		if(id<1||name.length()<3) {
			
			out.println("error in login :invalid input");
			return;
		}
		else
			chain.doFilter(request, response);
		
		chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
