package be.condorcet.demo1.web;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "FactionRedirectServlet", value = "/faction")
public class FactionRedirectServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/faction.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String faction = request.getParameter("faction");

        if (faction == null ||
                (!faction.equals("jedi") && !faction.equals("sith"))) {

            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Faction invalide.");
            return;
        }

        response.sendRedirect(
                request.getContextPath() + "/bienvenue?faction=" + faction
        );
    }
}