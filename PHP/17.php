<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    
    $name = $_POST['name'];
    $basic = floatval($_POST['basic']);
    $designation = $_POST['designation'];

    // Initialize allowances
    $conveyance = 0;
    $extra = 0;

    // Assign allowances based on designation using switch
    switch ($designation) {
        case "Manager":
            $conveyance = 1000;
            $extra = 500;
            break;
        case "Supervisor":
            $conveyance = 750;
            $extra = 200;
            break;
        case "Clerk":
            $conveyance = 500;
            $extra = 100;
            break;
        case "Peon":
            $conveyance = 250;
            $extra = 0;
            break;
        default:
            echo "<p>Invalid Designation</p>";
            exit();
    }

    // Calculate HRA (25% of basic salary)
    $hra = 0.25 * $basic;

    // Calculate Gross Salary
    $gross = $basic + $hra + $conveyance + $extra;

    // Calculate Income Tax based on Gross Salary
    switch (true) {
        case ($gross <= 2500):
            $tax = 0;
            break;
        case ($gross <= 4000):
            $tax = 0.03 * $gross;
            break;
        case ($gross <= 5000):
            $tax = 0.05 * $gross;
            break;
        default:
            $tax = 0.08 * $gross;
            break;
    }

    // Calculate Net Salary
    $net = $gross - $tax;

    // Display Pay Slip
    echo "<h2>Employee Pay Slip</h2>
          <p><strong>Name:</strong> $name</p>
          <p><strong>Designation:</strong> $designation</p>
          <p><strong>Basic Salary:</strong> $basic</p>
          <p><strong>HRA (25%):</strong> $hra</p>
          <p><strong>Conveyance Allowance:</strong> $conveyance</p>
          <p><strong>Extra Allowance:</strong> $extra</p>
          <p><strong>Gross Salary:</strong> $gross</p>
          <p><strong>Income Tax:</strong> $tax</p>
          <p><strong>Net Salary:</strong> $net</p>";
}
?>
