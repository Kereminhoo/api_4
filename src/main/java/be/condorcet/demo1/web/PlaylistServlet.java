package be.condorcet.demo1.web;

import be.condorcet.demo1.model.Playlist;
import be.condorcet.demo1.model.Song;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "PlaylistServlet", value = "/playlist")
public class PlaylistServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Song song1 = new Song(
                "Don't Stop The Music",
                "Rihanna",
                "https://www.youtube.com/watch?v=yd8jh9QYfEs",
                false
        );

        Song song2 = new Song(
                "Mr. Saxobeat",
                "Alexandra Stan",
                "https://www.youtube.com/watch?v=nwsewSMWIas",
                true
        );

        Song song3 = new Song(
                "Fireball",
                "Pitbull",
                "https://www.youtube.com/watch?v=HMqgVXSvwGo",
                false
        );

        Playlist playlist = new Playlist(
                "Mes musiques préférées",
                "Kerem",
                List.of(song1, song2, song3)
        );

        request.setAttribute("playlist", playlist);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/playlist.jsp");
        dispatcher.forward(request, response);
    }
}