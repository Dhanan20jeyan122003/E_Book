package com.servlet;

import com.dao.UserDAO;
import com.entity.User;
import java.io.IOException;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String password = req.getParameter("password");

        UserDAO dao = new UserDAO();
        User user = dao.getUserByEmail(email);

        if (user != null && user.getPassword().equals(password)) {
            HttpSession session = req.getSession();
            session.setAttribute("user", user);
            resp.sendRedirect("index.jsp");
        } else {
            req.setAttribute("error", "Invalid email or password");
            req.getRequestDispatcher("login.jsp").forward(req, resp);
        }
    }
}
