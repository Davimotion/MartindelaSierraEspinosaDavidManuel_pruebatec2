
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp" %>
<%@include file="components/body1.jsp" %>
<%@include file="components/sidebar.jsp" %>
<%@include file="components/topbar.jsp" %>

<!DOCTYPE html>

<!-- Begin Page Content -->
<div class="container-fluid">
    <h1>Eliminar Ciudadano</h1>
    <form action="SvElimCiudadano" method="POST">
         <input type="text" name="idElim" id="idElim" placeholder="Id a eliminar">    
    </form>
    <button type="submit" class="btn btn-primary" >Eliminar Producto</button>
</div>
<!-- End of Main Content -->

<%@include file="components/footer.jsp" %>
<%@include file="components/body2.jsp" %>