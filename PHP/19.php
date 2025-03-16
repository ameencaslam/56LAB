<?php
// Database connection
$conn = pg_connect("host=localhost dbname=test user=postgres password=root");

if (!$conn) {
    die("Database connection failed!");
}

// Insert records only if table is empty
$query_check = "SELECT COUNT(*) FROM product";
$result_check = pg_query($conn, $query_check);
$count = pg_fetch_result($result_check, 0, 0);

if ($count == 0) {
    $query_insert = "
        INSERT INTO product (itemname, unitprice) VALUES
        ('Laptop', 75000.00),
        ('Keyboard', 1500.00),
        ('Mouse', 700.00),
        ('Monitor', 12000.00),
        ('Printer', 8500.00)";
    pg_query($conn, $query_insert);
}

// Fetch records
$query_select = "SELECT * FROM product ORDER BY itemcode ASC";
$result = pg_query($conn, $query_select);

echo "<h3>Product List</h3>";
echo "<table border='1' cellpadding='10'>
        <tr>
            <th>Item Code</th>
            <th>Item Name</th>
            <th>Unit Price</th>
        </tr>";

while ($row = pg_fetch_assoc($result)) {
    echo "<tr>
            <td>{$row['itemcode']}</td>
            <td>{$row['itemname']}</td>
            <td>{$row['unitprice']}</td>
        </tr>";
}

echo "</table>";

// Close connection
pg_close($conn);
?>
