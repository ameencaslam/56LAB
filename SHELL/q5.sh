#!/bin/bash

# Read three numbers from the user
echo -n "Enter three numbers: "
read num1 num2 num3

# Calculate the mean (average)
mean=$(echo "($num1 + $num2 + $num3) / 3" | bc -l)

# Calculate the variance and standard deviation
variance=$(echo "((($num1 - $mean)^2 + ($num2 - $mean)^2 + ($num3 - $mean)^2) / 3)" | bc -l)
std_dev=$(echo "scale=2; sqrt($variance)" | bc -l)

# Display the results with 2 decimal places
printf "Mean: %.4f\n" $mean
printf "Standard Deviation: %.4f\n" $std_dev

