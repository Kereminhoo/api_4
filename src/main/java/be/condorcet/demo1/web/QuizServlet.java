package be.condorcet.demo1.web;

import be.condorcet.demo1.model.Question;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "QuizServlet", value = "/QuizServlet")
public class QuizServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Question question = new Question(
                "Qui est le créateur de Naruto ?",
                List.of(
                        "Eiichiro Oda",
                        "Masashi Kishimoto",
                        "Akira Toriyama",
                        "Tite Kubo"
                )
        );

        request.setAttribute("question", question);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/quiz.jsp");
        dispatcher.forward(request, response);
    }
}