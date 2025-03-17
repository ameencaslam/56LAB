#!/bin/bash

# Ask the user for a file or directory name
echo -n "Enter the file or directory name: "
read filename

# Check if the file/directory exists
if [ -e "$filename" ]; then
    echo "$filename exists."

    # Check if it's a file or directory
    [ -f "$filename" ] && echo "$filename is a regular file." || echo "$filename is not a regular file."
    [ -d "$filename" ] && echo "$filename is a directory." || echo "$filename is not a directory."
    [ -s "$filename" ] && echo "$filename is not empty." || echo "$filename is empty"

    # Check permissions
    [ -r "$filename" ] && echo "$filename is readable." || echo "$filename is not readable."
    [ -w "$filename" ] && echo "$filename is writable." || echo "$filename is not writable."
    [ -x "$filename" ] && echo "$filename is executable." || echo "$filename is not executable."

else
    echo "'$filename' does not exist."
fi
