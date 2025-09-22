package com.servlet;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import com.dao.BookDAO;

@WebServlet("/DeleteBookServlet")
public class DeleteBookServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));

        BookDAO dao = new BookDAO();
        boolean result = dao.deleteBook(id);

        if(result) {
            response.sendRedirect("index.jsp"); // back to book list
        } else {
            response.getWriter().println("Something went wrong while deleting the book!");
        }
    }
}
