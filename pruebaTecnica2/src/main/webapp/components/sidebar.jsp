

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- Page Wrapper -->
<div id="wrapper">

    <!-- Sidebar -->
    <ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">

        <!-- Sidebar - Brand -->
        <!--Importo algunos iconos de fontawesome-->
        <a class="sidebar-brand d-flex align-items-center justify-content-center" href="index.jsp">
            <div class="sidebar-brand-icon rotate-n-15">                    
                <i class="fa-solid fa-ticket"></i>
            </div>
            <div class="sidebar-brand-text mx-3">Gestor de turnos.</div>
        </a>

        <!-- Divider -->
        <hr class="sidebar-divider my-0">

        <!-- Nav Item - Dashboard -->
        <li class="nav-item active">
            <a class="nav-link" href="index.jsp">
                <i class="fas fa-fw fa-tachometer-alt"></i>
                <span>Barra de utilidades</span></a>
        </li>

        <!-- Divider -->
        <hr class="sidebar-divider">

        <!-- Heading -->
        <div class="sidebar-heading">
            Gestión
        </div>
        
        <!--Enlaces a las páginas de gestion de ciudadanos en una lista desplegable-->
        <!-- Nav Item - Pages Collapse Menu -->
        <li class="nav-item">
            <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseTwo"
               aria-expanded="true" aria-controls="collapseTwo">
                <i class="fa-solid fa-user"></i>
                <span>Ciudadanos</span>
            </a>
            <div id="collapseTwo" class="collapse" aria-labelledby="headingTwo" data-parent="#accordionSidebar">
                <div class="bg-white py-2 collapse-inner rounded">
                    <h6 class="collapse-header">Gestiones: </h6>
                    <a class="collapse-item" href="ciudadanoRegistrar.jsp">Registrar</a>
                    <a class="collapse-item" href="ciudadanoConsultar.jsp">Consultar</a>
                    <a class="collapse-item" href="ciudadanoBuscarEditar.jsp">Editar</a>
                    <a class="collapse-item" href="ciudadanoEliminar.jsp">Borrar</a>
                </div>
            </div>
        </li>

        <!--Enlaces a las páginas de gestion de turnos en una lista desplegable-->        
        <!-- Nav Item - Utilities Collapse Menu -->
        <li class="nav-item">
            <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseUtilities"
               aria-expanded="true" aria-controls="collapseUtilities">
                <i class="fa-solid fa-ticket"></i>
                <span>Turnos</span>
            </a>
            <div id="collapseUtilities" class="collapse" aria-labelledby="headingUtilities"
                 data-parent="#accordionSidebar">
                <div class="bg-white py-2 collapse-inner rounded">
                    <h6 class="collapse-header">Gestiones: </h6>
                    <a class="collapse-item" href="turnoRegistrar.jsp">Registrar</a>
                    <a class="collapse-item" href="turnoConsultar.jsp">Consultar</a>
                    <a class="collapse-item" href="turnoMostrarLista.jsp">Mostrar lista</a>
                    <a class="collapse-item" href="turnoBuscarEditar.jsp">Editar</a>
                    <a class="collapse-item" href="turnoEliminar.jsp">Borrar</a>
                </div>
            </div>
        </li>

        <!-- Divider -->
        <hr class="sidebar-divider">






    </ul>
    <!-- End of Sidebar -->