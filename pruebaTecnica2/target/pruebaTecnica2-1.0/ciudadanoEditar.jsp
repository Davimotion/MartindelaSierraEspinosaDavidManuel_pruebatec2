
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
        Ciudadano ciudadano = (Ciudadano) request.getSession().getAttribute("ciudEdit");
    %>
    <form action="SvEditCiudadano" method="POST">        
         <input type="text" id="nombre" name="nombre" placeholder="Nombre" value="<%=ciudadano.getNombre()%>">
         <input type="text" id="apellidos" name="apellidos" placeholder="Apellidos" value="<%=ciudadano.getApellidos()%>">
         <button type="submit">Editar Ciudadano</button>
    </form>
    
</div>
<!-- End of Main Content -->

<%@include file="components/footer.jsp" %>
<%@include file="components/body2.jsp" %>
