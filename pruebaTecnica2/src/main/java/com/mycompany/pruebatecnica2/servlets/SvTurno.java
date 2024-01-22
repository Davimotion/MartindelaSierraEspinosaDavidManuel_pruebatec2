package com.mycompany.pruebatecnica2.servlets;

import com.mycompany.pruebatecnica2.logic.Ciudadano;
import com.mycompany.pruebatecnica2.logic.Controller;
import com.mycompany.pruebatecnica2.logic.Turno;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SvTurno", urlPatterns = {"/SvTurno"})
public class SvTurno extends HttpServlet {

    Controller control = new Controller();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String inputId = request.getParameter("consultaId");
        Integer id = Integer.valueOf(inputId);

        Turno turno = control.traerTurno(id);

        ArrayList<Turno> listaTurnos = new ArrayList<Turno>();

        listaTurnos.add(turno);

        request.setAttribute("listaTurnos", listaTurnos);

        request.getRequestDispatcher("turnoConsultar.jsp").forward(request, response);
        System.out.println("HE LLEGADOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        Turno turno = new Turno();

        String inputFecha = request.getParameter("fecha");
        LocalDate fecha = LocalDate.parse(inputFecha);
        String inputEspera = request.getParameter("espera");
        boolean espera = Boolean.parseBoolean(inputEspera);
        String inputAtendido = request.getParameter("atendido");
        boolean atendido = Boolean.parseBoolean(inputAtendido);
        String inputId = request.getParameter("id");
        Integer id = Integer.valueOf(inputId);

        turno.setFecha(fecha);
        turno.setEspera(espera);
        turno.setAtendido(atendido);
        Ciudadano ciudadano = control.traerCiudadanoId(id);
        turno.setCiudadano(ciudadano);

        control.crearTurno(turno);
        response.sendRedirect("index.jsp");

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
