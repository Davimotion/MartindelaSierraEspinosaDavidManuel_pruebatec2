
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp" %>
<%@include file="components/body1.jsp" %>
<%@include file="components/sidebar.jsp" %>
<%@include file="components/topbar.jsp" %>

<!DOCTYPE html>

<!-- Begin Page Content -->
<div class="container-fluid">
    <h1>Ciudadano Eliminado</h1>
    <form action="SvEditCiudadano" method="POST">
         <input type="text" name="idElim" id="idElim" placeholder="Id a editar">    
    </form>
    <button type="submit">Editar Producto</button>
</div>
<!-- End of Main Content -->

<%@include file="components/footer.jsp" %>
<%@include file="components/body2.jsp" %>
