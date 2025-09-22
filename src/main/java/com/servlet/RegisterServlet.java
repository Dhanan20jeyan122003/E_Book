package com.servlet;

import com.dao.UserDAO;
import com.entity.User;
import java.io.IOException;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String password = req.getParameter("password");

        UserDAO dao = new UserDAO();
        User u = new User(name, email, password);
        boolean saved = dao.saveUser(u);

        if (saved) {
            resp.sendRedirect("login.jsp");
        } else {
            req.setAttribute("error", "Registration failed");
            req.getRequestDispatcher("register.jsp").forward(req, resp);
        }
    }
}
