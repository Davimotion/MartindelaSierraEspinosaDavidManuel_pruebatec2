package com.mycompany.pruebatecnica2.servlets;

import com.mycompany.pruebatecnica2.logic.Controller;
import com.mycompany.pruebatecnica2.logic.Turno;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SvListaTurno", urlPatterns = {"/SvListaTurno"})
public class SvListaTurno extends HttpServlet {

    Controller control = new Controller();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ArrayList listaTurnos = new ArrayList();
        for (Turno turno : control.traerListaTurno()) {
            listaTurnos.add(turno);
        }

        request.setAttribute("listaTurno", listaTurnos);

        request.getRequestDispatcher("turnoMostrarLista.jsp").forward(request, response);
        System.out.println("HE LLEGADOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
