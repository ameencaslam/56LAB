#!/bin/bash

# Check if arguments are provided
if [ $# -eq 0 ]; then
    echo "Usage: $0 num1 num2 num3 ..."
    exit 1
fi

# Initialize sum and count
sum=0
count=0

# Loop through all command-line arguments
for num in "$@"; do
    sum=$((sum + num))
    count=$((count + 1))
done

# Calculate average
average=$((sum / count))

# Display the result
echo "Average: $average"
