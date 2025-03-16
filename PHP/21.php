<?php
if (isset($_POST['fruits'])) {
    echo "<h2>Selected Fruits</h2>";
    echo "<ul>";
    foreach ($_POST['fruits'] as $fruit) {
        echo "<li>$fruit</li>";
    }
    echo "</ul>";
} else {
    echo "<p>No fruit selected!</p>";
}
?>
