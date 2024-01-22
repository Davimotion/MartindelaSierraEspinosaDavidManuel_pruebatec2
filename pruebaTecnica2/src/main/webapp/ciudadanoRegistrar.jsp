
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp" %>
<%@include file="components/body1.jsp" %>
<%@include file="components/sidebar.jsp" %>
<%@include file="components/topbar.jsp" %>

<!DOCTYPE html>
<!--Esta página contiene un formulario que presenta un formulario 
para rellenar y luego manda los datos del formulario a un servlet 
mediante botón, y el servlet después es el que lo manda a
la controladora siguiendo el modelo de capas.-->
<!-- Begin Page Content -->
<div class="container-fluid">
    <h1>Registrar ciudadano.</h1>
    <form action="SvCiudadano" method="POST">
        <div class="form-group" >
            <label for="nombre">Nombre:</label>
            <input type="text" name="nombre" id="nombre" placeholder="Nombre">
        </div>
        <div class="form-group">
            <label for="apellido">Apellido:</label>
            <input type="text" name="apellidos" id="apellidos" placeholder="Apellidos">
        </div>
        <button type="submit" class="btn btn-primary"/>Registrar</button>
    </form>
</div>
<!-- End of Main Content -->

<%@include file="components/footer.jsp" %>
<%@include file="components/body2.jsp" %>
