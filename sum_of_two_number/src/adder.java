import javax.servlet.http.*;

import com.sun.org.apache.xml.internal.serialize.Printer;

import javax.servlet.*;
import java.io.*;

public class adder extends HttpServlet{
	public void doGet(HttpServletRequest request,
			HttpServletResponse response)
	throws ServletException, IOException{
	
		String str1=request.getParameter("num1");
		String str2=request.getParameter("num2");	
		
		int num1=Integer.parseInt(str1);
		int num2=Integer.parseInt(str2);
		
		int sum= num1+num2;
		
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter out =response.getWriter();
		out.println("<HTML>");
		out.println("<HEAD><TITLE>µ¡¼À ÇÁ·Î±×·¥ - °á°ú È­¸é</TITLE></HEAD>");
		out.println("<BODY>");
		out.printf("%d + %d = %d", num1,num2,sum);
		out.println("</BODY>");
		out.println("</HTML>");
	}
}