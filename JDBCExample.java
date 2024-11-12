import java.sql.*;

public class JDBCExample {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/testdb";
        String jdbcUsername = "root";
        String jdbcPassword = "password";


        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
           
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
            statement = connection.createStatement();
            String sql = "SELECT * FROM students";
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
            }

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace(); 
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
