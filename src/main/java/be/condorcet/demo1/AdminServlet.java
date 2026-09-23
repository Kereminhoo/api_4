package be.condorcet.demo1;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "AdminServlet", value = "/admin/stats")
public class AdminServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        ServletContext context = getServletContext();

        Integer compteur = (Integer) context.getAttribute("VisitCount");

        if (compteur == null) {
            compteur = 0;
        }

        out.println("<html><body>");
        out.println("<h1>Stats global</h1>");
        out.println("<p>La page a été consultée " + compteur + " fois</p>");
        out.println("</body></html>");
    }
}