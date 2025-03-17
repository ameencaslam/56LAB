#!/bin/bash

# Read input from the user
echo -n "Enter a number: "
read number

# Check if the number is even or odd
if (( number % 2 == 0 ))
then
  echo "$number is Even"
else
  echo "$number is Odd"
fi

