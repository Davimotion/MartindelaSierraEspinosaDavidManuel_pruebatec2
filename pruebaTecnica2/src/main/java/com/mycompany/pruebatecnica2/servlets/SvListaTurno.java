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
import javax.servlet.http.HttpSession;

@WebServlet(name = "SvListaTurno", urlPatterns = {"/SvListaTurno"})
public class SvListaTurno extends HttpServlet {

    Controller control = new Controller();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    
    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        ArrayList<Turno> listaTurnos = new ArrayList<>();
        
//        if ("true".equals(request.getParameter("createTableButton"))) {
            for (Turno turno : control.traerListaTurno()) {
                listaTurnos.add(turno);
            }
            System.out.println(listaTurnos);
//        }

//        HttpSession misession = request.getSession();



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
