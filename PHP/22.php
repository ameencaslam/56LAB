<?php
// Step 1: Create an array with 10 names (some duplicates included)
$names = ["John", "Alice", "Bob", "Eve", "Charlie", "Alice", "David", "Eve", "Frank", "Grace"];

// a. Display the contents using foreach
echo "<h3>Original Array:</h3>";
foreach ($names as $name) {
    echo "$name <br>";
}

// b. Display the array in a sorted order
$sorted_names = $names;
sort($sorted_names);
echo "<h3>Sorted Array:</h3>";
foreach ($sorted_names as $name) {
    echo "$name <br>";
}

// c. Display the array without duplicate elements
$unique_names = array_unique($names);
echo "<h3>Array Without Duplicates:</h3>";
foreach ($unique_names as $name) {
    echo "$name <br>";
}

// d. Remove the last element and display
array_pop($names);
echo "<h3>Array After Removing Last Element:</h3>";
foreach ($names as $name) {
    echo "$name <br>";
}

// e. Display the array in reverse order
$reversed_names = array_reverse($names);
echo "<h3>Array in Reverse Order:</h3>";
foreach ($reversed_names as $name) {
    echo "$name <br>";
}

// f. Search for an element in the array
$search_name = "Alice"; // Name to search
if (in_array($search_name, $names)) {
    echo "<h3>$search_name is found in the array.</h3>";
} else {
    echo "<h3>$search_name is NOT found in the array.</h3>";
}
?>
