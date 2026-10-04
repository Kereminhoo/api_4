package be.condorcet.demo1;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ResponseHandler", value = "/ResponseHandler")
public class ResponseHandler extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();

        String username = request.getParameter("username");
        String responseType = request.getParameter("responseType");

        out.println("<html><body>");

        if (responseType.equals("bienvenue"))
        {
            out.println("<h1>Bienvenue, " + username + " !</h1>");
            out.println("<p>Nous sommes ravis de vous voir.</p>");

        } else if (responseType.equals("encouragement")) {

            out.println("<h1>Continuez comme ça, " + username + " !</h1>");
            out.println("<p>Vous etes sur la bonne voie !</p>");

        } else if (responseType.equals("remerciement")) {

            out.println("<h1>Merci, " + username + " !</h1>");
            out.println("<p>Merci d'avoir utilise notre service !</p>");
        }
        out.println("</body></html>");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
}