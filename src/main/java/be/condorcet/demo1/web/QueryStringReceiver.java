package be.condorcet.demo1.web;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "QueryStringReceiver", value = "/QueryStringReceiver")
public class QueryStringReceiver extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        String name = request.getParameter("name");
        String firstname = request.getParameter("firstname");
        String age = request.getParameter("age");

        response.getWriter().println(
                "<h1>Bonjour " + firstname + " " + name + ", vous avez " + age + " ans.</h1>"
        );
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }
}