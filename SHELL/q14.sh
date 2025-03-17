#!/bin/bash

# Prompt user to enter two numbers
echo -n "Enter the base number: "
read base

echo -n "Enter the exponent number: "
read exponent

# Calculate the power using bc
result=$(echo "$base ^ $exponent" | bc)

# Display the result
echo "$base raised to the power of $exponent is: $result"

