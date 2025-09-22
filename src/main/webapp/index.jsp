<%@ page import="com.entity.User" %>
<%@ page import="com.entity.Book" %>
<%@ page import="com.dao.BookDAO" %>
<%@ page session="true" %>
<%
   User user = (User) session.getAttribute("user");
   if (user == null) {
       response.sendRedirect("login.jsp");
       return;
   }
%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Book Website</title>
  <link rel="stylesheet" href="Style.css">
</head>
<body>

  <!-- Navbar -->
  <div class="Navbar">
    <h1>Books <span>Key</span></h1>
    <div style="float:right; padding-right:20px;">
      Hello, <b><%= user.getName() %></b> | <a href="LogoutServlet">Logout</a>
    </div>
  </div>

  <!-- Container: Book List Table -->
  <div class="Container">
    <h2>Book List</h2>
    <table border="1" style="width:100%; text-align:left;">
        <thead>
            <tr>
                <th>ID</th>
                <th>Book Name</th>
                <th>Owner</th>
                <th>Description</th>
                <th>Action</th>
            </tr>
        </thead>
        <tbody>
            <%
                BookDAO dao = new BookDAO();
                java.util.List<Book> books = dao.getAllBooks();
                for(Book book : books){
            %>
            <tr>
                <td><%= book.getId() %></td>
                <td><%= book.getName() %></td>
                <td><%= book.getOwner() %></td>
                <td><%= book.getDescription() %></td>
                <td>
                    <form action="DeleteBookServlet" method="post" style="display:inline;">
                        <input type="hidden" name="id" value="<%= book.getId() %>">
                        <button type="submit">Delete</button>
                    </form>
                </td>
            </tr>
            <% } %>
        </tbody>
    </table>
  </div>

  <!-- Popup Overlay -->
  <div class="Popup-Overlay"></div>
  <div class="Popup-item">
    <h2>Add Book</h2>
    <form action="AddBookServlet" method="post">
      <input type="text" placeholder="Book Name" name="name" required>
      <input type="text" placeholder="Book Owner" name="owner" required>
      <textarea placeholder="Short Description" name="description" required></textarea>
      <button type="submit">Add</button>
      <button type="button" id="cancel">Cancel</button>
    </form>
  </div>

  <!-- Add Button -->
  <button class="Add-Button" id="AddPopup">+</button>

  <!-- JS -->
  <script>
    // Pop Up Section
    let popupItem = document.querySelector(".Popup-item")
    let popupOverlay = document.querySelector(".Popup-Overlay")
    let btnAddPopup = document.getElementById("AddPopup")

    btnAddPopup.addEventListener("click", () => {
        popupOverlay.style.display = "block";
        popupItem.style.display = "block";
    })

    let btnCancel = document.getElementById("cancel")
    btnCancel.addEventListener("click", () => {
        popupOverlay.style.display = "none";
        popupItem.style.display = "none";
    })
  </script>

</body>
</html>
