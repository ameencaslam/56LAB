#!/bin/bash

# Read input from the user
echo -n "Enter a number: "
read num

# Initialize factorial variable to 1
factorial=1

# Check if the number is negative
if [ $num -lt 0 ]; then
    echo "Factorial is not defined for negative numbers."
else
    # Loop to calculate factorial
    for (( i=1; i<=num; i++ ))
    do
        factorial=$((factorial * i))
    done
    echo "The factorial of $num is $factorial"
fi

