#!/bin/bash

# Read the upper limit from the user
echo -n "Enter a number: "
read limit

# Function to check if a number is prime
is_prime() {
  num=$1
  if [ $num -le 1 ]; then
    return 1  # Not a prime number
  fi
  for ((i=2; i<=num/2; i++)); do
    if [ $((num % i)) -eq 0 ]; then
      return 1  # Not a prime number
    fi
  done
  return 0  # Prime number
}

# Print all prime numbers up to the limit
echo "Prime numbers up to $limit:"
for ((num=2; num<=limit; num++)); do
  if is_prime $num; then
    echo $num
  fi
done

