import java.sql.*;

class EmployeeJDBC {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/CompanyDB"; // Database URL
        String user = "root"; // Change if needed
        String password = ""; // Set your MySQL password

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish Connection
            Connection con = DriverManager.getConnection(url, user, password);

            // SQL Query
            String query = "SELECT * FROM employee";

            // Create Statement
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            // Display Results
            System.out.println("Employee Details:");
            while (rs.next()) {
                System.out.println(
                    "ID: " + rs.getInt("id") +
                    ", Name: " + rs.getString("name") +
                    ", Designation: " + rs.getString("design") +
                    ", Department: " + rs.getString("dept")
                );
            }

            // Close Connections
            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
