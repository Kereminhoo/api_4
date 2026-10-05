package be.condorcet.demo1.web;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "PokemonReceiver", value = "/PokemonReceiver")
public class PokemonReceiver extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();

        String pokemon = request.getParameter("pokemon");
        String level = request.getParameter("level");
        String evolution = request.getParameter("evolution");

        out.println("<html><body>");

        if (pokemon != null) {

            out.println("<h3>Vous avez choisi :</h3>");

            out.println("<p>Pokémon : " + pokemon + "</p>");
            out.println("<p>Niveau : " + level + "</p>");

            int niveau = Integer.parseInt(level);

            boolean evolue = false;
            String nouveauPokemon = pokemon;

            if (evolution != null) {

                if (niveau >= 36) {

                    if (pokemon.equals("Salamèche"))
                    {
                        nouveauPokemon = "Dracaufeu";
                        evolue = true;
                    } else if (pokemon.equals("Carapuce")) {
                        nouveauPokemon = "Tortank";
                        evolue = true;
                    } else if (pokemon.equals("Bulbizarre")) {
                        nouveauPokemon = "Florizarre";
                        evolue = true;
                    }

                } else if (niveau >= 16) {

                    if (pokemon.equals("Salamèche"))
                    {
                        nouveauPokemon = "Reptincelle";
                        evolue = true;
                    } else if (pokemon.equals("Carapuce")) {
                        nouveauPokemon = "Carabaffe";
                        evolue = true;
                    } else if (pokemon.equals("Bulbizarre")) {
                        nouveauPokemon = "Herbizarre";
                        evolue = true;
                    }
                }
            }

            out.println("<p>Pokémon évolué : " + (evolue ? "Oui" : "Non") + "</p>");
            out.println("<p>Nouveau Pokémon : " + nouveauPokemon + "</p>");


            // pikachu, salameche, carapuce, bulbizarre, evali, reptincelle, carabaffe, herbizarre, dracafeu, tortank, florizarre

            if (pokemon.equals("Pikachu")) {

                out.println("<img src=\"https://media.giphy.com/media/v1.Y2lkPTc5MGI3NjExejg1NnBmNm0ybmMyZmkxNTNpMHM4NDV6ZDNlbjQ2M2drbzAyOWNjNCZlcD12MV9naWZzX3NlYXJjaCZjdD1n/U2nN0ridM4lXy/giphy.gif\">");

            } else if (nouveauPokemon.equals("Bulbizarre"))
            {
                out.println("<img src=\"https://media.giphy.com/media/v1.Y2lkPTc5MGI3NjExbmFnNmpjcWVxZjE0dDBhbnExN254bnAxNmx5czR0OGF3dTRlemx2dSZlcD12MV9naWZzX3NlYXJjaCZjdD1n/N7UQCEtGgRMRi/giphy.gif\">");
            } else if (nouveauPokemon.equals("Salamèche")) {
                out.println("<img src=\"https://media.giphy.com/media/v1.Y2lkPTc5MGI3NjExOGNtcXprajE0bGgwMWZhcGQ3MmZ1YnJqYWZxNWFsNzVjeXV2Y2VscSZlcD12MV9naWZzX3NlYXJjaCZjdD1n/bkQAAeOePeK3e/giphy.gif\">");
            } else if (nouveauPokemon.equals("Carapuce")) {
                out.println("<img src=\"https://media.giphy.com/media/v1.Y2lkPTc5MGI3NjExbW1vOGxsam1za3hkNHFuemtsYmt4cTE5cHMxeGRvNjhpdW5wOHFhZSZlcD12MV9naWZzX3NlYXJjaCZjdD1n/3xgR6JaucMaXe/giphy.gif\">");
            } else if (pokemon.equals("Évoli")) {
                out.println("<img src=\"https://media.giphy.com/media/v1.Y2lkPWVjZjA1ZTQ3ZTNlc2c3ZG1zYmx6M3N1eTY5YTZ4cWtkemFvOTVmc3Bib3hqaHJ5ZyZlcD12MV9naWZzX3NlYXJjaCZjdD1n/td02jbtsXIxpBv45rJ/giphy.gif\">");
            } else if (nouveauPokemon.equals("Florizarre")) {
                out.println("<img src=\"https://media.giphy.com/media/v1.Y2lkPTc5MGI3NjExNTEyZzZsNDR4bW9kdXJ2cGhtaHo2cjlpdDFkOWx3ZjlwOXB1N2J6diZlcD12MV9naWZzX3NlYXJjaCZjdD1n/ueSWiQi1BXNWl75l1S/giphy.gif\">");
            } else if (nouveauPokemon.equals("Reptincelle")) {
                out.println("<img src=\"https://media.giphy.com/media/v1.Y2lkPTc5MGI3NjExcXFoaWN5enZ6dm10ejk5dXNnZXB1b2ZjZjFudWEyYWlldG81NXdyYyZlcD12MV9naWZzX3NlYXJjaCZjdD1n/Ue3StBZUi6zvXFCzcj/giphy.gif\">");
            } else if (nouveauPokemon.equals("Carabaffe")) {
                out.println("<img src=\"https://media.giphy.com/media/v1.Y2lkPTc5MGI3NjExbjZ2dXpwdWl3cW41bm1lOWFzdnE0emNtc3Njb2VyOHVhamNsazJiYyZlcD12MV9naWZzX3NlYXJjaCZjdD1n/JMPAslYn9YTEA/giphy.gif\">");
            } else if (nouveauPokemon.equals("Herbizarre")) {
                out.println("<img src=\"https://media.giphy.com/media/v1.Y2lkPTc5MGI3NjExYjdhMTVsZHk2bnJjam1vMTA2bTJodXFub2dkcTJuOHpjdThuN2oydyZlcD12MV9naWZzX3NlYXJjaCZjdD1n/VusIjpwXKGE4yr1Cto/giphy.gif\">");
            } else if (nouveauPokemon.equals("Dracaufeu")) {
                out.println("<img src=\"https://media.giphy.com/media/v1.Y2lkPWVjZjA1ZTQ3aWR6eTM4dHRrbzUzNGVoZzd2dWxwbzMwOHJtaDc3d2thNWZwZXh4cyZlcD12MV9naWZzX3NlYXJjaCZjdD1n/aOiiut0WA77nYsDddq/giphy.gif\">");
            } else if (nouveauPokemon.equals("Tortank")) {
                out.println("<img src=\"https://media.giphy.com/media/v1.Y2lkPTc5MGI3NjExeTFhMDVrdjFucTJ0MDhjMG5waDBjNWo1cGdld3c1aHB1dDR3MTdpMiZlcD12MV9naWZzX3NlYXJjaCZjdD1n/WJzYiFUnQhlTFa5aZY/giphy.gif\">");
            }


            out.println("<br><br/>");
            out.println("<p>Merci pour votre choix !</p>");
            out.println("<p>Amusez-vous bien avec votre Pokémon !</p>");

        } else {

            out.println("<p>Vous n'avez choisi aucun Pokémon.</p>");

        }

        out.println("</body></html>");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
}