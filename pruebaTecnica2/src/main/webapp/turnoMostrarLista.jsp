
<%@page import="com.mycompany.pruebatecnica2.logic.Turno"%>
<%@page import="java.util.List"%>
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
    <h1>Lista de turnos.</h1>  
    <form action="SvListaTurno" method="GET">
        <div class="form-group">
            <button class="btn btn-primary" type="submit" name="createTableButton">Mostrar ordenado por ID</button> 
        </div>
    </form>
    <form action="SvListaTurnoFecha" method="GET">
        <div class="form-group">
            <button class="btn btn-primary" type="submit" name="createTableButton">Mostrar ordenado por fecha</button> 
        </div>
    </form>
    <form action="SvListaTurnoFiltrarFecha" method="GET">
        <div class="form-group">
            <label for="start">Filtrar por fecha específica:</label>
            <input type="date" id="targetDate" name="targetDate" value="" min="2018-01-01" max="2030-12-31" />
             <button class="btn btn-primary" type="submit" name="createTableButton">Mostrar</button> 
        </div>
    </form>    
    <br>
    <br>
    <br>

    <div class="results-table">
        <% if (request.getParameter("createTableButton") != null && request.getAttribute("listaTurnos") != null) { %>
        <table class="table" border="1">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Ciudadano</th>
                    <th>Fecha</th>
                    <th>Atendido</th>
                    <th>Espera</th>
                </tr>
            </thead>
            <tbody>
                <% for (Turno turno : (List<Turno>) request.getAttribute("listaTurnos")) {%>
                <tr>
                    <td><%= turno.getIdTurno()%></td>
                    <td><%= turno.getCiudadano()%></td>
                    <td><%= turno.getFecha()%></td>
                    <td><%= turno.isEspera()%></td>
                    <td><%= turno.isAtendido()%></td>                     
                </tr>
                <% } %>
            </tbody>                                
        </table>
        <% }%>
    </div>

</div>
<!-- End of Main Content -->

<%@include file="components/footer.jsp" %>
<%@include file="components/body2.jsp" %>