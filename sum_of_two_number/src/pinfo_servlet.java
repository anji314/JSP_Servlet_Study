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
		if(gender.equals("male"))gender="남";
		else gender="여";
		
		String inotice=request.getParameter("inotice");
		String cnotice=request.getParameter("cnotice");
		String dnotice=request.getParameter("dnotice");
		
		String job=request.getParameter("job");
		
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter out =response.getWriter();
		out.println("<HTML>");
		out.println("<HEAD><TITLE>개인 정보 입력 - 결과 화면</TITLE></HEAD>");
		out.println("<BODY>");
		out.println("<h2>개인 정보 입력</h2>");
		
		out.printf("이름 : %s <br>", name);
		out.printf("아이디 : %s <br>", id);
		out.printf("엄호 : %s <br>", password);
		out.printf("성별 : %s <br>", gender);
		out.printf("공지 메일 : %s <br>", noticeck(inotice));
		out.printf("광고 메일 : %s <br>", noticeck(cnotice));
		out.printf("배송 확인 메일 : %s <br>", noticeck(dnotice));
		out.printf("직업 : %s <br>", job);
		
		
		out.println("</BODY>");
		out.println("</HTML>");
	}
	
	private String noticeck(String notice) {
		if(notice==null) return "받지 않음";
		else if(notice.equals("on"))return "받음";
		else return notice;
	}
}