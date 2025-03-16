<?php
// Database connection
$conn = pg_connect("host=localhost dbname=test user=postgres password=root");

if (!$conn) {
    die("Database connection failed!");
}

// Get form inputs
$accno = $_POST['accno'];
$amount = $_POST['amount'];
$transaction = $_POST['transaction'];

// Check if account exists
$query = "SELECT balance FROM bank WHERE accno = $accno";
$result = pg_query($conn, $query);

if ($row = pg_fetch_assoc($result)) {
    $balance = $row['balance'];

    if ($transaction === 'deposit') {
        $new_balance = $balance + $amount;
    } elseif ($transaction === 'withdraw') {
        if ($amount > $balance) {
            die("Insufficient balance!");
        }
        $new_balance = $balance - $amount;
    } else {
        die("Invalid transaction type!");
    }

    // Update balance
    $update_query = "UPDATE bank SET balance = $new_balance WHERE accno = $accno";
    pg_query($conn, $update_query);

    echo "<h3>Transaction Successful!</h3>";
    echo "<p>New Balance: $new_balance</p>";
} else {
    echo "<p>Account not found!</p>";
}

pg_close($conn);
?>
