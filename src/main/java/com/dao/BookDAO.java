package com.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.entity.Book;
import com.DB.DBConnect;

public class BookDAO {
    private Connection conn;

    public BookDAO() {
        conn = DBConnect.getConn(); // uses your DBConnect
    }

    // Fetch all books
    public List<Book> getAllBooks() {
        List<Book> list = new ArrayList<>();
        try {
            String sql = "SELECT * FROM books"; 
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Book b = new Book(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("owner"),
                    rs.getString("description")
                );
                list.add(b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    // Add a book
    public boolean addBook(Book book) {
        boolean flag = false;
        try {
            String sql = "INSERT INTO books(name, owner, description) VALUES(?,?,?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, book.getName());
            pst.setString(2, book.getOwner());
            pst.setString(3, book.getDescription());
            int i = pst.executeUpdate();
            if(i > 0) flag = true;
        } catch(Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    // Delete a book
    public boolean deleteBook(int id) {
        boolean flag = false;
        try {
            String sql = "DELETE FROM books WHERE id=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, id);
            int i = pst.executeUpdate();
            if(i > 0) flag = true;
        } catch(Exception e) {
            e.printStackTrace();
        }
        return flag;
    }
}
