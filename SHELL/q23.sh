#!/bin/bash

# Read input
echo -n "Enter a string: "
read str

# Initialize counters
v=0
c=0
n=0

# Convert to lowercase
str=$(echo "$str" | tr 'A-Z' 'a-z')

# Loop through characters
for (( i=0; i<${#str}; i++ )); do
    ch=${str:$i:1}   # Extract one character

    case "$ch" in
        [aeiou]) ((v++)) ;;     # If character is a vowel, increment vowels count
        [0-9]) ((n++)) ;;       # If character is a number, increment numbers count
        [b-df-hj-np-tv-z]) ((c++)) ;; # If character is a consonant, increment consonants count
    esac
done

# Output results
echo "Vowels: $v"
echo "Consonants: $c"
echo "Numbers: $n"
