#!/bin/bash

echo "=========================="
echo "   System Information"
echo "=========================="

# Display current date and time
echo "Current Date and Time: $(date)"

# Display number of logged-in users
echo "Number of Logged-in Users: $(who | wc -l)"

# Display terminal name
echo "Terminal Name: $TERM"

# Display login date and time
echo "Your Login Time: $(whoami) logged in on $(who -u | grep $(whoami) | awk '{print $3, $4}')"

echo "=========================="
