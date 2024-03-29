
package com.mycompany.pruebatecnica2.servlets;

import com.mycompany.pruebatecnica2.logic.Controller;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "SvElimCiudadano", urlPatterns = {"/SvElimCiudadano"})
public class SvElimCiudadano extends HttpServlet {

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
        int idEliminar = Integer.parseInt(request.getParameter("idElim"));
        control.borrarCiudadano(idEliminar);
        response.sendRedirect("index.jsp");
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }

}