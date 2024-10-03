package UI;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        String validUsername = "user";
        String validPassword = "password";

        if (username != null && password != null && username.equals(validUsername) && password.equals(validPassword)) {
            response.getWriter().println("<h2>Login successful! Welcome, " + username + ".</h2>");
        } else {
            response.getWriter().println("<h2>Invalid username or password. Please try again.</h2>");
        }
    }
}
