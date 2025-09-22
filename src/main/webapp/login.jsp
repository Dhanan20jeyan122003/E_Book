<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
    <link rel="stylesheet" href="Style.css">
</head>
<body>
		<div class="login-navbar">
		    Books <span>Key</span>
		</div>
    <div class="login-page">
        <form class="login-register-form" action="LoginServlet" method="post">
            <h2>Login</h2>
            <input type="email" name="email" placeholder="Email" required><br>
            <input type="password" name="password" placeholder="Password" required><br>
            <button type="submit">Login</button>
            <p>No account? <a href="register.jsp">Register</a></p>
            <div style="color:red;">
                <%= request.getAttribute("error") == null ? "" : request.getAttribute("error") %>
            </div>
        </form>
    </div>
</body>
</html>
