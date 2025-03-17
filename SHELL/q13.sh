#!/bin/bash

# Prompt the user for the file name
echo -n "Enter the filename: "
read filename

# Check if the file exists
if [ ! -f "$filename" ]; then
  echo "File does not exist."
  exit 1
fi

# Convert the content of the file to uppercase and overwrite it
tr '[:lower:]' '[:upper:]' < "$filename" > temp_file && mv temp_file "$filename"

echo "File content has been converted to uppercase."

