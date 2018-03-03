<%@ page import="java.io.PrintWriter" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Users</title>
    </head>
    <body>

    <%--<%--%>
    <%----%>
    <%--for (int i = 0; i < 10; i++) {--%>
    <%--writer.println(i);--%>
    <%--}--%>
    <%--%>--%>

    <form method="post" action="<%=request.getContextPath().concat("/users/")%>">
        <input type="text" name="name" id="name"/>
        <input type="submit" value="add user">
    </form>
    <%
        PrintWriter writer = response.getWriter();
        Object attribute = request.getAttribute("userList");
        writer.println(attribute);
    %>
    </body>
</html>
