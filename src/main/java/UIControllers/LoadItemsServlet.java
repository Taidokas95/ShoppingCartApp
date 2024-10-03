package UIControllers;

import BO.Item;
import DB.ItemManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "LoadItemsServlet", urlPatterns = "/items")
public class LoadItemsServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private List<Item> items = new ArrayList<Item>();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getItems();
        if (!items.isEmpty()) {
            request.setAttribute("items", items);
            request.getRequestDispatcher("/items.jsp").forward(request, response);
        } else {
            throw new ServletException("No items found");
        }
    }

    private void getItems() {
        items.addAll(ItemManager.getItems());
    }
}

