#!/bin/bash

echo "Select operation: 1. Add 2. Subtract 3. Multiply 4. Divide"
read choice
echo -n "Enter two numbers: "
read num1 num2

case $choice in
  1) echo "Result: $(echo "$num1 + $num2" | bc)" ;;
  2) echo "Result: $(echo "$num1 - $num2" | bc)" ;;
  3) echo "Result: $(echo "$num1 * $num2" | bc)" ;;
  4) if [ $num2 -eq 0 ]; then echo "Error! Division by zero." ; else echo "Result: $(echo "scale=2; $num1 / $num2" | bc)" ; fi ;;
  *) echo "Invalid choice" ;;
esac
