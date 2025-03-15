<?php
    if ($_SERVER["REQUEST_METHOD"] == "POST") {
            echo "Name: " . $_POST["name"] . "<br>";
            echo "Age: " . $_POST["age"] . "<br>";
            echo "Gender: " . $_POST["gender"] . "<br>";
            echo "Email: " . $_POST["email"] . "<br>";
        } else {
            echo "No data received!";
    }
?>
