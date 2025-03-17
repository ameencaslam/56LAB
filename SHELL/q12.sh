#!/bin/bash

# Read the file name from the user
echo -n "Enter the file name: "
read filename

# Check if the file exists
if [ ! -f "$filename" ]; then
  echo "File does not exist."
  exit 1
fi

# Use wc command to count lines, words, and characters
line_count=$(wc -l < "$filename")
word_count=$(wc -w < "$filename")
char_count=$(wc -m < "$filename")	

# Display the results
echo "Lines: $line_count"
echo "Words: $word_count"
echo "Characters: $char_count"

