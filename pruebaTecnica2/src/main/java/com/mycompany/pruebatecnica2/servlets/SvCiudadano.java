package com.mycompany.pruebatecnica2.servlets;

import com.mycompany.pruebatecnica2.logic.Ciudadano;
import com.mycompany.pruebatecnica2.logic.Controller;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SvCiudadano", urlPatterns = {"/SvCiudadano"})
public class SvCiudadano extends HttpServlet {
    
    Controller control = new Controller();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        
    }

    
    
    
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        Ciudadano ciudadano = new Ciudadano();

        String nombre = request.getParameter("nombre");
        String apellidos = request.getParameter("apellidos");

        ciudadano.setNombre(nombre);
        ciudadano.setApellidos(apellidos);

        System.out.println("servlet" + ciudadano);
        control.crearCiudadano(ciudadano);
        response.sendRedirect("index.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
