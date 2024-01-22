<%@page import="java.util.ArrayList"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Create Table Button</title>
</head>
<body>

    <form method="get" action="SvPrueba">
        <button type="submit" name="createTableButton">Create Table</button>
    </form>

    <div id="tableContainer">
        <%-- Java code to generate the table dynamically --%>
        <% if (request.getParameter("createTableButton") != null && request.getAttribute("attributeList") != null) { %>
            <table border="1">
                <thead>
                    <tr>
                        <th>Attributes</th>
                    </tr>
                </thead>
                <tbody>
                    <% 
                        ArrayList<String> attributeList = (ArrayList<String>)request.getAttribute("attributeList");
                        for (String attribute : attributeList) { 
                    %>
                        <tr>
                            <td><%= attribute %></td>
                        </tr>
                    <% } %>
                </tbody>
            </table>
        <% } %>
    </div>

</body>
</html>
