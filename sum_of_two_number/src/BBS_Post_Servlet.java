import javax.servlet.http.*;

import com.sun.org.apache.xml.internal.serialize.Printer;

import javax.servlet.*;
import java.io.*;

public class BBS_Post_Servlet extends HttpServlet{
	public void doPost(HttpServletRequest request,
			HttpServletResponse response)
	throws ServletException, IOException{
		request.setCharacterEncoding("euc-kr");
	
		String name=request.getParameter("name");
		String title=request.getParameter("title");	
		String content=request.getParameter("content");
		
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter out =response.getWriter();
		out.println("<HTML>");
		out.println("<HEAD><TITLE>�Խ��� �۾��� - ��� ȭ��</TITLE></HEAD>");
		out.println("<BODY>");
		out.printf("�̸� : %s <br>", name);
		out.printf("���� : %s <br>", title);
		
		out.println("----------------------<br>");
		out.printf("<pre>%s</pre>", content);
		out.println("----------------------<br>");
		out.println("����Ǿ����ϴ�.");
		out.println("</BODY>");
		out.println("</HTML>");
	}
}