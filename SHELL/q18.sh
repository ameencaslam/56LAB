#!/bin/bash

# Get the current hour (24-hour format)
hour=$(date +%H)

# Determine the appropriate greeting
if [ "$hour" -lt 12 ]; then
    echo "Good Morning!"
elif [ "$hour" -lt 18 ]; then
    echo "Good Afternoon!"
else
    echo "Good Evening!"
fi
