<?php
if (isset($_GET['num'])) {
    $num = intval($_GET['num']);
    echo "<h3>Multiplication Table of $num</h3>";
    echo "<table border='1' cellpadding='10'>";
    for ($i = 1; $i <= 10; $i++) {
        echo "<tr><td>$num × $i</td><td>" . ($num * $i) . "</td></tr>";
    }
    echo "</table>";
}
?>
