<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>1���� 100������ ��</title>
</head>
<body>
<% 
int total=0;
for(int cnt=1;cnt<=100;cnt++) total+=cnt;
%>
1���� 100���� ���� ���� ? <%= total %>
</body>
</html>