
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.mycompany.pruebatecnica2.logic.Ciudadano"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp" %>
<%@include file="components/body1.jsp" %>
<%@include file="components/sidebar.jsp" %>
<%@include file="components/topbar.jsp" %>

<!DOCTYPE html>

<!--Esta pagina contiene un formulario que pide un apellido y manda el atributo 
apellido al servlet que hace una petición por controladora y devuelve una lista
filtrada por el apellido que se le ha pedido-->

<!-- Begin Page Content -->
<div class="container-fluid">
    <h1>Consultar ciudadano.</h1>  
    <form action="SvCiudadano" method="GET">
        <div class="form-group">
            <label for="consultaApellido">Introduzca Apellido</label>
            <input type="text" name="consultaApellido" id="consultaApellido" placeholder="Apellido">                
        </div>
        <button type="submit" class="btn btn-primary" >Buscar</button>            
    </form>
    <br>
    <br>
    <br>

    <div class="results-table">
        <% if (request.getAttribute("listaCiudadanos") != null) { %>
        <table class="table" border="1">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Nombre</th>
                    <th>Apellido</th>
                </tr>
            </thead>
            <tbody>
                <% for (Ciudadano ciudadano : (List<Ciudadano>) request.getAttribute("listaCiudadanos")) {%>
                <tr>
                    <td><%= ciudadano.getIdCiudadano()%></td>
                    <td><%= ciudadano.getNombre()%></td>
                    <td><%= ciudadano.getApellidos()%></td>                   
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