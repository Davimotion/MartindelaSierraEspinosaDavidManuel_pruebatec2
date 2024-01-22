
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp" %>
<%@include file="components/body1.jsp" %>
<%@include file="components/sidebar.jsp" %>
<%@include file="components/topbar.jsp" %>

<!DOCTYPE html>

<!-- Begin Page Content -->
<div class="container-fluid">
    <h1>Eliminar turno</h1>
    <form action="SvElimTurno" method="POST">
         <input type="text" name="idElim" id="idElim" placeholder="Id a eliminar">    
    <button type="submit" class="btn btn-primary" >Eliminar turno</button>
    </form>
</div>
<!-- End of Main Content -->

<%@include file="components/footer.jsp" %>
<%@include file="components/body2.jsp" %>