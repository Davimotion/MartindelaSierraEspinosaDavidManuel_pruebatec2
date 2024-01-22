
<%@page import="com.mycompany.pruebatecnica2.logic.Turno"%>
<%@page import="com.mycompany.pruebatecnica2.logic.Ciudadano"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp" %>
<%@include file="components/body1.jsp" %>
<%@include file="components/sidebar.jsp" %>
<%@include file="components/topbar.jsp" %>

<!DOCTYPE html>

<!-- Begin Page Content -->
<div class="container-fluid">
    <h1>Editar Ciudadano por ID</h1>
    <%
        Turno turno = (Turno) request.getSession().getAttribute("turnEdit");
    %>
    <form action="SvEditTurno" method="POST">        

        <label for="fecha">Fecha:</label>
        <input type="date" id="fecha" name="fecha" placeholder="<%=turno.getFecha()%> min="2024-01-01" max="2025-12-31" />

        <label for="espera">Espera?</label>
        <input type="checkbox" id="espera" name="espera" value="true" />

        <label for="atendido">Atendido?</label>
        <input type="checkbox" id="atendido" name="atendido" value="true" />
        <div>
            <button type="submit" class="btn btn-primary">Editar</button>
        </div>
    </form>

</div>

<!-- End of Main Content -->

<%@include file="components/footer.jsp" %>
<%@include file="components/body2.jsp" %>
