package be.condorcet.demo1;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;
/* Description : Servlet PageServlet




 */
// singleton (instance seule) Thread (plusieurs instances)


@WebServlet(name = "PageServlet", value = "/PageServlet")
public class PageServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        // 1. recup contexte ( de l'app )
        ServletContext context = getServletContext();


        // 2. lire le compteur de visite actual du texte
        Integer compteur = (Integer) context.getAttribute("VisitCount");

        // 3. s'il n'existe pas -> 1. sinon j'incrémente.
        if (compteur == null)
            compteur = 1;
        else
            compteur++;


        // 4. ré-enregistrer la nouvelle valeur dans le contexte
        context.setAttribute("VisitCount", compteur);

        // 5. affichage

        out.println("<html><body><h1>Bienvenue</h1>");
        out.println("<p>Merci de votre visite</p>");
        out.println("<p>" + compteur + "</p>");
        out.println("</body></html>");


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }
}
