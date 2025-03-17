#!/bin/bash

# Read the number from the user
echo -n "Enter a number: "
read num

# Initialize the reversed number
reversed=0

# Loop through each digit of the number
while [ $num -gt 0 ]; do
  # Get the last digit of the number
  digit=$((num % 10))
  
  # Add the digit to the reversed number (shift the previous digits to the left)
  reversed=$((reversed * 10 + digit))
  
  # Remove the last digit from the number
  num=$((num / 10))
done

# Display the reversed number
echo "Reversed number: $reversed"

