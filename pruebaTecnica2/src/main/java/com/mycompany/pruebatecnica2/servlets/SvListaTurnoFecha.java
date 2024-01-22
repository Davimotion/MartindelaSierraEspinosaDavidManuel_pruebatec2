
package com.mycompany.pruebatecnica2.servlets;

import com.mycompany.pruebatecnica2.logic.Controller;
import com.mycompany.pruebatecnica2.logic.Turno;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet(name = "SvListaTurnoFecha", urlPatterns = {"/SvListaTurnoFecha"})
public class SvListaTurnoFecha extends HttpServlet {

    public static Comparator<Turno> dateComparator = Comparator.comparing(Turno::getFecha);
    
    Controller control = new Controller();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<Turno> listaTurnos = new ArrayList<>();

        for (Turno turno : control.traerListaTurno()) {
            listaTurnos.add(turno);
        }
        System.out.println(listaTurnos);
        Collections.sort(listaTurnos, dateComparator);

        request.setAttribute("listaTurnos", listaTurnos);
        request.getRequestDispatcher("turnoMostrarLista.jsp").forward(request, response);
        System.out.println("HE LLEGADOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO");
        System.out.println(listaTurnos);
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
