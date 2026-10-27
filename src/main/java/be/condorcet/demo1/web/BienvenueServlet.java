package be.condorcet.demo1.web;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "BienvenueServlet", value = "/bienvenue")
public class BienvenueServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String faction = request.getParameter("faction");

        if (faction == null ||
                (!faction.equals("jedi") && !faction.equals("sith"))) {

            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Faction invalide.");
            return;
        }

        String page;

        if (faction.equals("jedi")) {
            page = "/WEB-INF/jedi.jsp";
        } else {
            page = "/WEB-INF/sith.jsp";
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher(page);
        dispatcher.forward(request, response);
    }
}