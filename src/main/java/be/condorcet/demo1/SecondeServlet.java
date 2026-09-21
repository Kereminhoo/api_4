package be.condorcet.demo1;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
        name = "SecondeServelet",
        value = "/SecondeServelet",
        initParams = {
                @WebInitParam(name = "maintenanceMode", value = "false")
        }
)
public class SecondeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String maintenanceMode = getServletConfig().getInitParameter("maintenanceMode");
        out.println("<html><body>");

        if ("true".equalsIgnoreCase(maintenanceMode)) {
            out.println("<h1>désolé, nous sommes en maintenance</h1>");
        } else {
            String nom = request.getParameter("nom");
            String age = request.getParameter("age");

            out.println("<h1>Bienvenue</h1>");

            if (nom != null && age != null && !age.isEmpty()) {
                try {
                    int age1 = Integer.parseInt(age);
                    out.print("<p>Bonjour " + nom + " | ");

                    if (age1 >= 18) {
                        out.print("tu peux passer ton permis !</p>");
                    } else {
                        out.print("J'espère que tu as ton skateboard.</p>");
                    }
                } catch (NumberFormatException e) {
                    out.println("<p>Erreur : l'age doit etre un nombre valide.</p>");
                }
            } else {
                out.println("<p>Veuillez fournir un nom et un âge valides dans le lien.</p>");
            }
        }

        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}