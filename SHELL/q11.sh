#!/bin/bash

# Read the string from the user
echo -n "Enter a string: "
read str

# Reverse the string
reversed=$(echo $str | rev)

echo "Reversed string : $reversed"

# Check if the original string is equal to the reversed string
if [ "$str" == "$reversed" ]; then
  echo "$str is a palindrome."
else
  echo "$str is not a palindrome."
fi

