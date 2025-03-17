#!/bin/bash

while true; do
    echo "Select an operation:"
    echo "1. Display file contents"
    echo "2. List files in directory"
    echo "3. Create a directory"
    echo "4. Copy a file"
    echo "5. Rename a file"
    echo "6. Delete a file"
    echo "7. Exit"

    read -p "Enter your choice: " choice

    case $choice in
        1)
            read -p "Enter filename to display: " file
            [ -f "$file" ] && cat "$file" || echo "File does not exist"
            ;;
        2)
            read -p "Enter directory (press Enter for current dir): " dir
            ls ${dir:-.}  # Lists files in the given directory or current directory
            ;;
        3)
            read -p "Enter directory name to create: " dir
            [ -d "$dir" ] && echo "Directory already exists" || mkdir "$dir" && echo "Directory created"
            ;;
        4)
            read -p "Enter source file: " src
            read -p "Enter destination file: " dest
            [ -f "$src" ] && [ ! -e "$dest" ] && cp "$src" "$dest" && echo "File copied" || echo "Copy failed"
            ;;
        5)
            read -p "Enter file to rename: " old
            read -p "Enter new name: " new
            [ -e "$old" ] && mv "$old" "$new" && echo "File renamed" || echo "Rename failed"
            ;;
        6)
            read -p "Enter file to delete: " file
            [ -f "$file" ] && rm "$file" && echo "File deleted" || echo "File not found"
            ;;
        7)
            echo "Exiting..."
            exit 0
            ;;
        *)
            echo "Invalid choice, try again."
            ;;
    esac
done
