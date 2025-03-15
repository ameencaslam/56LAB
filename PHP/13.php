<?php
function reverseString($str) {
    return strrev($str);
}

// Example Usage
$string = "abcd";
echo ("Original String : $string <br>");
echo ("Reversed String : ".reverseString($string));
?>
