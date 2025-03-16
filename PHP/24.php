<?php
// Create "uploads" directory if not exists
$uploadDir = "uploads/";
if (!is_dir($uploadDir)) {
    mkdir($uploadDir, 0777, true);
}

// Check if file is uploaded
if (isset($_FILES["fileToUpload"])) {
    $fileName = basename($_FILES["fileToUpload"]["name"]);
    $targetFile = $uploadDir . $fileName;
    
    // Move uploaded file to "uploads" folder
    if (move_uploaded_file($_FILES["fileToUpload"]["tmp_name"], $targetFile)) {
        echo "File uploaded successfully: <a href='$targetFile'>$fileName</a>";
    } else {
        echo "Error uploading file.";
    }
} else {
    echo "No file uploaded.";
}
?>
