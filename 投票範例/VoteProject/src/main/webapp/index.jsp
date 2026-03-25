<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"
    import="model.T_VOTE,dao.*"
    import="java.util.List"%>
<%

List<T_VOTE> l=new T_VOTEimpl().queryAll();
T_VOTE[] T=l.toArray(new T_VOTE[l.size()]);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>
	<table align=center border=1>
		<caption>歡迎給教師投票</caption>
	<tr bgcolor="yellow">
		<td>編號
		<td>姓名
		<td>得票數
		<td>投票
	<%
	for(int i=0;i<T.length;i++)
	{
		out.println("<tr align=center><td>"+T[i].getTeacherNo()+
				"<td>"+T[i].getTeacherName()+
				"<td>"+T[i].getVote()+
				"<td><a href=voteController?teacherNo="+T[i].getTeacherNo()+">投票</a>");
	}
	
	
	
	
	%>
	</table>

</body>
</html>