<!DOCTYPE html>
<html>
<head>
    <title>Register</title>
    <link rel="stylesheet" href="Style.css">
</head>
<body>
		<div class="login-navbar">
		    Books <span>Key</span>
		</div>
    <div class="login-page">
        <form class="login-register-form" action="RegisterServlet" method="post">
            <h2>Register</h2>
            <input type="text" name="name" placeholder="Name" required><br>
            <input type="email" name="email" placeholder="Email" required><br>
            <input type="password" name="password" placeholder="Password" required><br>
            <button type="submit">Register</button>
            <p>Already registered? <a href="login.jsp">Login</a></p>
            <div style="color:red;">
                <%= request.getAttribute("error") == null ? "" : request.getAttribute("error") %>
            </div>
        </form>
    </div>
</body>
</html>
