<h2>Welcome to My Page</h2>
<p>Refresh the page to see the last visited time update.</p>

<?php
// Set cookie name
$cookie_name = "last_visit";

// Check if cookie exists
if (isset($_COOKIE[$cookie_name])) {
    $last_visit = $_COOKIE[$cookie_name];
    echo "<p><strong>Last Visited:</strong> $last_visit</p>";
} else {
    echo "<p>This is your first visit!</p>";
}

// Set the new cookie with current date-time, expires in 1 year
date_default_timezone_set("Asia/Kolkata");
setcookie("$cookie_name", date("Y-m-d H:i:s"), time() + 60*60*24*30, "/");
?>
