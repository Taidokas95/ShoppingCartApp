package UIControllers;

import BO.ItemHandler;
import DB.ShoppingCartManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "AddToCartServlet")
public class AddToCartServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String userId = null;
        HttpSession session = request.getSession(false);
        if (session != null) {
            userId = (String) session.getAttribute("userId");
        }

        String itemIdParam = request.getParameter("itemId");
        int itemId = Integer.parseInt(itemIdParam);

        try {
            ItemHandler.addToCart(userId,itemId);

            response.setContentType("text/html");
            response.getWriter().write("Item successfully added to cart.");
            response.getWriter().println("<a href='items.jsp'> Go to Items Page</a>");


        } catch (Exception e) {
            e.printStackTrace();
            response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            response.getWriter().write("Failed to add item to cart.");
        }
    }
}
