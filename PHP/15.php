<?php
session_start();

// Database connection
$conn = pg_connect("host=localhost dbname=userdb user=postgres password=root");

if (!$conn) {
    die("Database connection failed!");
}

// Handle login
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $username = pg_escape_string($conn, $_POST['username']);
    $password = $_POST['password'];
    
    $query = "SELECT * FROM users WHERE username = '$username' AND password = '$password'";
    $result = pg_query($conn, $query);

    if (pg_num_rows($result) == 1) {
        echo "Login successful! ";
        echo "<h2>Welcome, ".$username."!</h2><br>";
        $word = "Logout";
    } else {
        echo "Invalid username or password.<br>";
        $word = "Try Again";
    }

    echo '<a href="15.html">'.$word.'</a>';
}
?>
