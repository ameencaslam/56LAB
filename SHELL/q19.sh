#!/bin/bash

echo -n "Enter the Year : "

read year  # Store the provided year

# Display banner
echo "==== Calendar for $year ===="

# figlet "Calendar for 2025"
# may work in linux, for banner i think

# Use Python to generate the calendar
python -c "import calendar; print(calendar.calendar($year))"

# cal "$year"
# maybe work in linux if python not available
