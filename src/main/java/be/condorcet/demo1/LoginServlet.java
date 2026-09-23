package be.condorcet.demo1;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
        name = "Login",
        value = "/connection",
        initParams = {
                @WebInitParam(name = "Username", value = "admin"),
                @WebInitParam(name = "password", value = "Secret123"),
        }
)
public class LoginServlet extends HttpServlet {

    private String username;
    private String password;

    @Override
    public void init() throws ServletException {
        super.init();

        // 2. recuperation les init param

        username = getServletConfig().getInitParameter("Username");
        password = getServletConfig().getInitParameter("password");




    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        // 3. simulation : recuperation des donnees saisie ( dans le navigateur)
        // exemple : /connection?user=admin&pass=Secret123

        String typeUser = request.getParameter("user");
        String typePassword = request.getParameter("pass");

        out.println("<html>");
        out.println("<h1>Verification des identification<h1>");

        // 4. logic de verification
        if (typeUser != null && typePassword != null) {
            if (typeUser.equals(username) && typePassword.equals(password)) {
                out.println("<h1>Welcome " + username + "</h1>");
                out.println("<p>Your are Inside BROOOOOOO \uD83E\uDD73 </p>");
                out.println("<img src=\"https://media.giphy.com/media/v1.Y2lkPWVjZjA1ZTQ3N2oxemlwbmt3cWVjN2h4eHE0cDA4eWZxcW0zZjE4cnZ3YjU0dmI0MSZlcD12MV9naWZzX3NlYXJjaCZjdD1n/zG1lyG4UhKo03SrLpA/giphy.gif\" width=\"400\">");
            }
            else{

                out.println("<h1>GET OUT HAHAHAHAHAHAAH</h1>");
                out.println("<img src=\"https://media.giphy.com/media/v1.Y2lkPWVjZjA1ZTQ3N2oxemlwbmt3cWVjN2h4eHE0cDA4eWZxcW0zZjE4cnZ3YjU0dmI0MSZlcD12MV9naWZzX3NlYXJjaCZjdD1n/VZXJyfOqpvuiIw3oJM/giphy.gif\" width=\"400\">");
            }
        }
        else {
            out.println("<h1>GET OUT HAHAHAHAHAHAAH</h1>");
            out.println("<img src=\"https://media.giphy.com/media/v1.Y2lkPWVjZjA1ZTQ3N2oxemlwbmt3cWVjN2h4eHE0cDA4eWZxcW0zZjE4cnZ3YjU0dmI0MSZlcD12MV9naWZzX3NlYXJjaCZjdD1n/VZXJyfOqpvuiIw3oJM/giphy.gif\" width=\"400\">");

        }


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
