package com.mycompany.pruebatecnica2.servlets;

import com.mycompany.pruebatecnica2.logic.Controller;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.mycompany.pruebatecnica2.logic.Ciudadano;
import javax.servlet.http.HttpSession;

@WebServlet(name = "SvEditCiudadano", urlPatterns = {"/SvEditCiudadano"})
public class SvEditCiudadano extends HttpServlet {

    Controller control = new Controller();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int idEditar = Integer.parseInt(request.getParameter("idEdit"));

        Ciudadano ciudadano = control.traerCiudadanoId(idEditar);

        HttpSession misesion = request.getSession();
        misesion.setAttribute("ciudEdit", ciudadano);

        response.sendRedirect("ciudadanoEditar.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombre = request.getParameter("nombre");
        String apellidos = request.getParameter("apellidos");
        
        Ciudadano ciudEdit = (Ciudadano)request.getSession().getAttribute("ciudEdit");
        ciudEdit.setNombre(nombre);
        ciudEdit.setApellidos(apellidos);
        
        control.editarCiudadano(ciudEdit);
        
        response.sendRedirect("index.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
