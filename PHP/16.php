<?php
// Database connection
$conn = pg_connect("host=localhost dbname=test user=postgres password=root");

if (!$conn) {
    die("Database connection failed!");
}

// Check if roll number is provided
if (isset($_POST['roll_no'])) {
    
    $roll_no = $_POST['roll_no'];

    // Fetch student details
    $query = "SELECT * FROM student WHERE roll_no = $roll_no";
    $result = pg_query($conn, $query);

    if ($row = pg_fetch_assoc($result)) {
        echo "<h3>Student Mark List</h3>";
        echo "<p><strong>Roll No:</strong> " . $row['roll_no'] . "</p>";
        echo "<p><strong>Name:</strong> " . $row['name'] . "</p>";
        echo "<p><strong>Mark:</strong> " . $row['mark'] . "</p>";
        echo "<p><strong>Grade:</strong> " . $row['grade'] . "</p>";
    } else {
        echo "<p>No student found with Roll No: $roll_no</p>";
    }
}
?>
