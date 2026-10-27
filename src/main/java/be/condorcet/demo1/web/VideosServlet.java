package be.condorcet.demo1.web;

import be.condorcet.demo1.model.Video;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "VideosServlet", value = "/videos")
public class VideosServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Video[] videos = {
                new Video(
                        "Squeezie - Le pire date #4",
                        "Une vidéo de divertissement de Squeezie.",
                        "https://www.youtube.com/watch?v=U0TMAvoPPL8"
                ),
                new Video(
                        "Squeezie - QUI TROUVERA LE MEILLEUR CONTAINER ?",
                        "Une vidéo autour des histoires effrayantes.",
                        "https://www.youtube.com/watch?v=bXwWvtrHr3M"
                ),
                new Video(
                        "Sixquatre - Rainbow Six Siege en DLSS 5… on dirait la VRAIE VIE",
                        "Une vidéo de réaction sur le réalisme de Six Siege",
                        "https://www.youtube.com/watch?v=5EQm_JLCpQk"
                )
        };

        request.setAttribute("videos", videos);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/videos.jsp");
        dispatcher.forward(request, response);
    }
}