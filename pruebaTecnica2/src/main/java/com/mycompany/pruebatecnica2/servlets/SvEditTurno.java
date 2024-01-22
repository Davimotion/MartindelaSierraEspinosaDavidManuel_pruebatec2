
package com.mycompany.pruebatecnica2.servlets;

import com.mycompany.pruebatecnica2.logic.Ciudadano;
import com.mycompany.pruebatecnica2.logic.Controller;
import com.mycompany.pruebatecnica2.logic.Turno;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "SvEditTurno", urlPatterns = {"/SvEditTurno"})
public class SvEditTurno extends HttpServlet {

    Controller control = new Controller();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int idEditar = Integer.parseInt(request.getParameter("idEdit"));

        Turno turno = control.traerTurno(idEditar);

        HttpSession misesion = request.getSession();
        misesion.setAttribute("turnEdit", turno);

        response.sendRedirect("turnoEditar.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String inputFecha = request.getParameter("fecha");
        LocalDate fecha = LocalDate.parse(inputFecha);
        String inputEspera = request.getParameter("espera");
        boolean espera = Boolean.parseBoolean(inputEspera);
        String inputAtendido = request.getParameter("atendido");
        boolean atendido = Boolean.parseBoolean(inputAtendido);
      

        
        Turno turnEdit = (Turno)request.getSession().getAttribute("turnEdit");
        turnEdit.setFecha(fecha);
        turnEdit.setEspera(espera);
        turnEdit.setAtendido(atendido);
        
        control.editarTurno(turnEdit);
        
        response.sendRedirect("index.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
