package UIControllers;

import BO.Item;
import DB.ShoppingCartManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ShoppingCartServlet")
public class ShoppingCartServlet extends HttpServlet {

    private List<Item> items = new ArrayList<Item>();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        items.clear();
        getShoppingCart();
        if (!items.isEmpty()) {
            request.setAttribute("items", items);
            request.getRequestDispatcher("/shoppingcart.jsp").forward(request, response);
        } else {
            throw new ServletException("No items found");
        }
    }

    private void getShoppingCart() {
        items.addAll(ShoppingCartManager.getShoppingCart("user"));
    }
}
