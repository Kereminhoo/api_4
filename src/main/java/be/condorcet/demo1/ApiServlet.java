package be.condorcet.demo1;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
        name = "ApiServlet",
        value = "/ApiServlet",
        initParams = {
                @WebInitParam(name = "maxRequests", value = "5"),
                @WebInitParam(name = "apiStatus", value = "ACTIVE")
        }
)
public class ApiServlet extends HttpServlet {

    private int requestCount = 0;

    private int maxRequests;
    private String apiStatus;

    @Override
    public void init() throws ServletException {
        super.init();


        maxRequests = Integer.parseInt(
                getServletConfig().getInitParameter("maxRequests")
        );

        apiStatus = getServletConfig().getInitParameter("apiStatus");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        if (!apiStatus.equals("ACTIVE")) {

            out.println("<h1>API Indisponible</h1>");
            out.println("<img src=\"https://media.giphy.com/media/v1.Y2lkPWVjZjA1ZTQ3YXZldnZ3c2k2cDI4bW8wZXRydnJkMXd5eDNpeno2eW81amczajI4dyZlcD12MV9naWZzX3NlYXJjaCZjdD1n/10hzvF9FTulLxK/giphy.gif\">");

            return;
        }

        requestCount++;
        if (requestCount > maxRequests) {

            out.println("<h1>Limite de requête atteinte</h1>");
            out.println("<p>Maximum : " + maxRequests + "</p>");
            out.println("<img src=\"https://media.giphy.com/media/v1.Y2lkPWVjZjA1ZTQ3YXZldnZ3c2k2cDI4bW8wZXRydnJkMXd5eDNpeno2eW81amczajI4dyZlcD12MV9naWZzX3NlYXJjaCZjdD1n/10hzvF9FTulLxK/giphy.gif\">");

            return;
        }

        out.println("<h1>Données de l'API envoyées avec succès.</h1>");
        out.println("<p>Requête numéro " + requestCount + "/" + maxRequests + "</p>");
    }
}

