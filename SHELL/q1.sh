#!/bin/bash

# Prompt the user to enter the radius of the circle
echo -n "Enter the radius of the circle: "
read radius

# Define the value of pi
pi=3.14159

# Calculate the area of the circle (Area = pi * radius^2)
area=$(echo "$pi * $radius * $radius" | bc)

# Display the result
echo "The area of the circle with radius $radius is: $area"
