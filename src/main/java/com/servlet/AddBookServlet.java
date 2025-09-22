package com.servlet;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import com.dao.BookDAO;
import com.entity.Book;

@WebServlet("/AddBookServlet")
public class AddBookServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String name = request.getParameter("name");
        String owner = request.getParameter("owner");
        String description = request.getParameter("description");

        Book book = new Book();
        book.setName(name);
        book.setOwner(owner);
        book.setDescription(description);

        BookDAO dao = new BookDAO();
        boolean result = dao.addBook(book);

        if(result) {
            response.sendRedirect("index.jsp"); // redirect back to book list
        } else {
            response.getWriter().println("Something went wrong while adding the book!");
        }
    }
}
