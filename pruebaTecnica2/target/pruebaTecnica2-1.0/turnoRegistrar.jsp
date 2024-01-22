
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp" %>
<%@include file="components/body1.jsp" %>
<%@include file="components/sidebar.jsp" %>
<%@include file="components/topbar.jsp" %>

<!DOCTYPE html>

<!-- Begin Page Content -->
<div class="container-fluid">
    <!--pegar aqui-->
    <h1>Registrar turno.</h1>
    <form action="SvTurno" method="POST">
        <div class="form-group" >
            <label for="fecha">Fecha:</label>
            <input type="date" id="fecha" name="fecha" value="" min="2024-01-01" max="2025-12-31" />
        </div>
        <div class="form-group">
            <label for="espera">Espera?</label>
            <input id="espera" name="espera" type="checkbox" />
        </div>
        <div class="form-group">
            <label for="atendido">Atendido?</label>
            <input id="atendido" name="atendido" type="checkbox" />
        </div>
        <div class="form-group">
            <label for="id">ID de ciudadano:</label>
            <input type="id" name="id" id="id" placeholder="ID">
        </div>
        <button type="submit" class="btn btn-primary"/>Registrar</button>
    </form>
    <!--fin del pegado-->
</div>
<!-- End of Main Content -->

<%@include file="components/footer.jsp" %>
<%@include file="components/body2.jsp" %>

