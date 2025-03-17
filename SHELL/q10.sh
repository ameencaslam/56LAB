#!/bin/bash

# Read the number from the user
echo -n "Enter a number: "
read num

# Find the number of digits in the number
num_digits=${#num}

# Initialize sum variable
sum=0
temp=$num

# Calculate the sum of each digit raised to the power of the number of digits
while [ $temp -gt 0 ]; do
  # Extract the last digit
  digit=$((temp % 10))
  
  # Add the digit raised to the power of the number of digits to sum
  sum=$((sum + digit**num_digits))
  
  # Remove the last digit
  temp=$((temp / 10))
done

# Check if the sum is equal to the original number
if [ $sum -eq $num ]; then
  echo "$num is an Armstrong number."
else
  echo "$num is not an Armstrong number."
fi

