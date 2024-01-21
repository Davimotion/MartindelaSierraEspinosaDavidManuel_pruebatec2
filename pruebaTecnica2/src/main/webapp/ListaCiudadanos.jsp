
<%@page import="java.util.ArrayList"%>
<%@page import="com.mycompany.pruebatecnica2.logic.Ciudadano"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp" %>
<%@include file="components/body1.jsp" %>
<%@include file="components/sidebar.jsp" %>
<%@include file="components/topbar.jsp" %>

<!DOCTYPE html>

<!-- Begin Page Content -->
<div class="container-fluid">
    <h1>Lista de Ciudadanos</h1>
    <form action="SvCiudadano" method="GET">
        <div class="results-table">
            <% if (request.getAttribute("listaCiudadanos") != null) { %>
            <table class="table">
                <thead>
                    <tr>
                        <th>Nombre</th>
                        <th>Apellido</th>
                    </tr>
                </thead>
                <tbody>
                    <% for (Ciudadano ciudadano : (ArrayList<Ciudadano>) request.getAttribute("listaCiudadanos")) {%>
                    <tr>
                        <td><%= ciudadano.getNombre()%></td>
                        <td><%= ciudadano.getApellidos()%></td>
                    </tr>
                    <% } %>
                </tbody>                                
            </table>
            <% }%>
        </div>
        <div>
            <table>
                <thead>
                    <tr>
                        <th>Column 1</th>
                        <th>Column 2</th>
                        <th>Column 3</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Random Content 1</td>
                        <td>Random Content 2</td>
                        <td>Random Content 3</td>
                    </tr>
                    <tr>
                        <td>Random Content 4</td>
                        <td>Random Content 5</td>
                        <td>Random Content 6</td>
                    </tr>
                    <tr>
                        <td>Random Content 7</td>
                        <td>Random Content 8</td>
                        <td>Random Content 9</td>
                    </tr>
                </tbody>
            </table>
        </div>
</div>    
<!-- End of Main Content -->

<%@include file="components/footer.jsp" %>
<%@include file="components/body2.jsp" %>