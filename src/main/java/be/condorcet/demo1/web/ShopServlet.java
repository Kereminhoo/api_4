
package be.condorcet.demo1.web;

import be.condorcet.demo1.model.Item;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "ShopServlet", value = "/shop")
public class ShopServlet extends HttpServlet {

    private Item[] items;

    @Override
    public void init() throws ServletException {
        items = new Item[] {
                new Item("Potion de soin", 30),
                new Item("Bouclier en bois", 80),
                new Item("Arc du héros", 120)
        };
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setAttribute("items", items);
        request.getRequestDispatcher("/WEB-INF/shop.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setAttribute("items", items);

        String selectedItem = request.getParameter("item");
        String rubiesText = request.getParameter("rubies");

        String message;

        if (selectedItem == null || selectedItem.isEmpty()) {
            message = "Choisissez un objet.";

        } else if (rubiesText == null || !rubiesText.matches("\\d+")) {
            message = "Rubis doit être un nombre entier.";

        } else {
            int rubies = Integer.parseInt(rubiesText);

            Item item = null;

            for (Item currentItem : items) {
                if (currentItem.getName().equals(selectedItem)) {
                    item = currentItem;
                    break;
                }
            }

            if (item == null) {
                message = "Choisissez un objet.";

            } else if (item.canBeBoughtwith(rubies)) {
                int remaining = rubies - item.getPrice();
                message = "Achat réussi. Il vous reste " + remaining + " rubis.";

            } else {
                int missing = item.getPrice() - rubies;
                message = "Pas assez de rubis. Il en manque " + missing + ".";
            }
        }

        request.setAttribute("message", message);

        request.getRequestDispatcher("/WEB-INF/shop.jsp")
                .forward(request, response);
    }
}
