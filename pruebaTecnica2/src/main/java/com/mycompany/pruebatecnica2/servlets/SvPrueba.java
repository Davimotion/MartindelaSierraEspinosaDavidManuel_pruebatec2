package com.mycompany.pruebatecnica2.servlets;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SvPrueba")
public class SvPrueba extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Generate sample data (replace with your actual data retrieval logic)
        ArrayList<String> attributeList = new ArrayList<>();
        attributeList.add("Attribute 1");
        attributeList.add("Attribute 2");
        attributeList.add("Attribute 3");

        // Set the ArrayList as an attribute in the request
        request.setAttribute("attributeList", attributeList);

        // Forward the request to the JSP page
        request.getRequestDispatcher("prueba.jsp").forward(request, response);
    }
}