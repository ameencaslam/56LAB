#!/bin/bash

# Read three numbers from the user
echo -n "Enter three numbers: "
read num1 num2 num3

# Compare the numbers and find the greatest
if [ $num1 -ge $num2 ] && [ $num1 -ge $num3 ]; then
    echo "The greatest number is $num1"
elif [ $num2 -ge $num1 ] && [ $num2 -ge $num3 ]; then
    echo "The greatest number is $num2"
else
    echo "The greatest number is $num3"
fi

