package UIControllers;

import BO.UserHandler;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (username != null && password != null) {

            UserInfo user = UserHandler.authenticateUser(username,password);

            if (user != null) {
                response.sendRedirect("LoadItemsServlet");
                HttpSession session = request.getSession();
                session.setAttribute("userId", username);  // Store user ID in session

            } else {
                response.getWriter().println("<h2>Invalid username or password. Please try again.</h2>");
            }
        } else {
            response.getWriter().println("<h2>Username or password cannot be empty.</h2>");
        }
    }
}
