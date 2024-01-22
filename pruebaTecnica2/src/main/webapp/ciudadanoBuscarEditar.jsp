
<%@page import="com.mycompany.pruebatecnica2.logic.Ciudadano"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp" %>
<%@include file="components/body1.jsp" %>
<%@include file="components/sidebar.jsp" %>
<%@include file="components/topbar.jsp" %>

<!DOCTYPE html>

<!-- Begin Page Content -->
<div class="container-fluid">
    <h1>Buscar ciudadano a editar.</h1>  
    <form action="SvEditCiudadano" method="GET">
        <div class="form-group">
            <label for="idEdit">Introduzca ID a editar</label>
            <input type="text" name="idEdit" id="idEdit" placeholder="ID a editar">                
        </div>
        <button type="submit" class="btn btn-primary" >Buscar</button>            
    </form>
    <br>
    <br>
    <br>
</div>    

<%@include file="components/footer.jsp" %>
<%@include file="components/body2.jsp" %>