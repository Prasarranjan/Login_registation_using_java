import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet("/registerServlet")
public class registerServlet extends HttpServlet {
public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    String email = req.getParameter("email");
    String username = req.getParameter("username");
    String password = req.getParameter("password");
    jdbc.loginUser(email,username,password);
    res.sendRedirect("login.jsp");
}
}
