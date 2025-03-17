source=$1
dest=$2

[ $# -ne 2 ] && { echo "Enter both file names."; exit 1; }

[ ! -e "$dest" ] && { cp "$source" "$dest"; } || { echo "Dest file exist"; exit 1; }

echo "Done"; exit 0;