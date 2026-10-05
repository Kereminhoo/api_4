package be.condorcet.demo1.web;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ConnectionServlet1", value = "/connection1")
public class ConnectionServlet1 extends HttpServlet {

    private String connectionString;

    @Override
    public void init() throws ServletException {
        super.init();

        ServletContext context = getServletContext();

        connectionString = context.getInitParameter("dbConnectionString");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h1>Connexion a la base de donnee</h1>");
        out.println("<p>Chaine de connexion : " + connectionString + "</p>");
        out.println("<img src=\"https://media.giphy.com/media/v1.Y2lkPWVjZjA1ZTQ3N2oxemlwbmt3cWVjN2h4eHE0cDA4eWZxcW0zZjE4cnZ3YjU0dmI0MSZlcD12MV9naWZzX3NlYXJjaCZjdD1n/zG1lyG4UhKo03SrLpA/giphy.gif\" width=\"400\">");
        out.println("</body></html>");
    }
}