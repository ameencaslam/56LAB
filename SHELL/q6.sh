#!/bin/bash

# Read the number from the user
echo -n "Enter a number: "
read num

# Initialize the sum variable
sum=0

# Loop through each digit of the number
while [ $num -gt 0 ]; do
  # Get the last digit of the number
  digit=$((num % 10))
  
  # Add the digit to the sum
  sum=$((sum + digit))
  
  # Remove the last digit from the number
  num=$((num / 10))
done

# Display the sum of the digits
echo "Sum of digits: $sum"

