<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="ISO-8859-1">
        <title>JSP file</title>
    </head>
    <body>
        <h1>Welcome</h1>
        <%
            String n = request.getParameter("um");
            int no = Integer.parseInt(n);
            System.out.println(no);
            System.out.println(no*no*no);
        %>
    </body>
</html>