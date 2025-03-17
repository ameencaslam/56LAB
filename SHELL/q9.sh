#!/bin/bash

# Read the value of n (number of Fibonacci numbers)
echo -n "Enter the number of Fibonacci numbers to generate: "
read n

# Initialize the first two Fibonacci numbers
a=0
b=1

# Generate and display Fibonacci numbers
echo "First $n Fibonacci numbers : "
for ((i=0; i<n; i++)); do
  echo -n "$a "
  
  # Calculate the next Fibonacci number
  next=$((a + b))
  a=$b
  b=$next
done
echo

