read -p "Enter first file name  : " file1
read -p "Enter second file name  : " file2

cmp -s "$file1" "$file2" && { echo "Files are identical. Removing $file2."; rm "$file2"; } || echo "Files are different. No files were deleted."