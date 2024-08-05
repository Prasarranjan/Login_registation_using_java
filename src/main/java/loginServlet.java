import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
      String username = req.getParameter("username");
      String password = req.getParameter("password");
      if(jdbc.getEmployeebyid(username,password)){
          HttpSession session = req.getSession();
          session.setAttribute("username",username);
          RequestDispatcher dispatcher = req.getRequestDispatcher("welcome.jsp");
          dispatcher.forward(req, res);
//          PrintWriter out=res.getWriter();
//          res.sendRedirect("welcome.jsp");
         // out.println("hello "+username);
      }
      else {
          res.sendRedirect("login.jsp?error=1");
          PrintWriter out=res.getWriter();
          out.println("invalid username or password");
      }
    }
}
