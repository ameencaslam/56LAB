<?php
function classifyNumber($num) {
    if ($num <= 0) {
        return "Please enter a positive integer.";
    }

    $sum = 0;
    for ($i = 1; $i <= $num / 2; $i++) {
        if ($num % $i == 0) {
            $sum += $i;
        }
    }

    if ($sum == $num) {
        return "$num is a Perfect Number.";
    } elseif ($sum > $num) {
        return "$num is an Abundant Number.";
    } else {
        return "$num is a Deficient Number.";
    }
}

// Example Usage:
$number = 12; // Change this number to test
echo classifyNumber($number);
?>
