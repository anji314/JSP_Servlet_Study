import javax.servlet.http.*;

import com.sun.org.apache.xml.internal.serialize.Printer;

import javax.servlet.*;
import java.io.*;

public class pinfo_servlet extends HttpServlet{
	public void doGet(HttpServletRequest request,
			HttpServletResponse response)
	throws ServletException, IOException{
		request.setCharacterEncoding("euc-kr");
	
		String name=request.getParameter("name");
		String id=request.getParameter("ID");	
		String password=request.getParameter("password");
		
		String gender=request.getParameter("gender");
		if(gender.equals("male"))gender="��";
		else gender="��";
		
		String inotice=request.getParameter("inotice");
		String cnotice=request.getParameter("cnotice");
		String dnotice=request.getParameter("dnotice");
		
		String job=request.getParameter("job");
		
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter out =response.getWriter();
		out.println("<HTML>");
		out.println("<HEAD><TITLE>���� ���� �Է� - ��� ȭ��</TITLE></HEAD>");
		out.println("<BODY>");
		out.println("<h2>���� ���� �Է�</h2>");
		
		out.printf("�̸� : %s <br>", name);
		out.printf("���̵� : %s <br>", id);
		out.printf("��ȣ : %s <br>", password);
		out.printf("���� : %s <br>", gender);
		out.printf("���� ���� : %s <br>", noticeck(inotice));
		out.printf("���� ���� : %s <br>", noticeck(cnotice));
		out.printf("��� Ȯ�� ���� : %s <br>", noticeck(dnotice));
		out.printf("���� : %s <br>", job);
		
		
		out.println("</BODY>");
		out.println("</HTML>");
	}
	
	private String noticeck(String notice) {
		if(notice==null) return "���� ����";
		else if(notice.equals("on"))return "����";
		else return notice;
	}
}