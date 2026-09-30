package be.condorcet.demo1;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DataReceiver", value = "/DataReceiver")
public class DataReceiver extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();

        String lastname = request.getParameter("lastname");
        String firstname = request.getParameter("firstname");
        String description = request.getParameter("description");

        out.println("<html><body>");

        if (firstname != null && lastname != null && description != null) {

            if (description.length() >= 10) {

                out.println("<h1>Donnee recue</h1>");

                out.println("<p><strong>Nom :</strong> " + lastname + "</p>");
                out.println("<p><strong>Prenom :</strong> " + firstname + "</p>");
                out.println("<p><strong>Description :</strong> " + description + "</p>");
                out.println("<br/><br/>");
                out.println("<img src=\"https://media.giphy.com/media/v1.Y2lkPTc5MGI3NjExeXJpN29qOG43Y3N4eWRrY3ZqMWc1Y3g0OHV0M29ibTc4ZHIydGt0MiZlcD12MV9naWZzX3NlYXJjaCZjdD1n/iJgoGwkqb1mmH1mES3/giphy.gif\"width=\"400\">");
            } else {

                out.println("<h1>Erreur</h1>");
                out.println("<p>La description n'est pas assez longue.</p>");
                out.println("<p>La description doit contenir au moins 10 caracteres.</p>");

            }

        } else {

            out.println("<h1>Erreur</h1>");
            out.println("<p>Veuillez remplir tous les champs.</p>");

        }

        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
}