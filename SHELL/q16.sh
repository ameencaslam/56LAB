#!/bin/bash

# Prompt user for Basic Pay
echo "Enter Basic Pay:"
read basic_pay

# Calculate DA (40% of Basic Pay)
da=$((basic_pay * 40 / 100))

# Calculate HRA (20% of Basic Pay)
hra=$((basic_pay * 20 / 100))

# Calculate Gross Salary
gross_salary=$((basic_pay + da + hra))

# Display the result
echo "Gross Salary: $gross_salary"
