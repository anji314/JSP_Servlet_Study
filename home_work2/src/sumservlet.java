import javax.servlet.http.*;

import com.sun.org.apache.xml.internal.serialize.Printer;

import javax.servlet.*;
import java.io.*;

public class sumservlet extends HttpServlet{
	public void doGet(HttpServletRequest request,
			HttpServletResponse response)
	throws ServletException, IOException{
		int total=0;
		for(int cnt=1;cnt<=100;cnt++)total+=cnt;
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter out =response.getWriter();
		out.println("<HTML>");
		out.println("<HEAD><TITLE>1���� 100���� ���ϴ� ����</TITLE></HEAD>");
		out.println("<BODY>");
		out.printf("1���� 100������ ����  = %d",total);
		out.println("</BODY>");
		out.println("</HTML>");
	}
}