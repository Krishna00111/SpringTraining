package com.vrush;

import javax.servlet.http.HttpServletRequest;

public classAddController extends AbstractController
{
	@Override
	protected ModelandView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
	{
		int i=Integer.parseInt(request.getParameter("t1"));
		int j=Integer.parseInt(request.getParameter("t2"));
		int k=Integer.parseInt(request.getParameter("t3"));
		int total=i+j+k; 
		int total=i+j+k; 
		int total=i+j+k; 

		
		
		ModelAndView mv = new ModealAndView();
		mv.setViewName("display");
		mv.addObject("Result", total);
		
		return mv;
	}
}