import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MyJDBC {
    public static void main(String[] args) throws  Exception {

        // Creating the sql connection
        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/vishal","root","vsr");
//        Class.forName("com.mysql.jdbc.Driver");
//        Connection connection = DriverManager.getConnection("jdbc:mysql://db4free.net/phpMyAdmin/vishal","vishal1","RjF7Yz35Nb3!nwW");
        // make a connection to execute query
        Statement st = connection.createStatement();
        // Result will be taken to result set
        ResultSet resultSet1 = st.executeQuery("select * from employee");
        while (resultSet1.next())
        {
            System.out.print(resultSet1.getString("name") + " | ");
            System.out.print(resultSet1.getInt("empId") + " | ");
            System.out.print(resultSet1.getInt("supervisor") + " | ");
            System.out.print(resultSet1.getInt("salary"));
            System.out.println();
        }
        st.executeUpdate("insert into  employee values(1,'vishal',2,1000)");
        ResultSet resultSet = st.executeQuery("select * from employee");
        System.out.println("Name | empId | supervisor | salary");
        while (resultSet.next())
        {
            System.out.print(resultSet.getString("name") + " | ");
            System.out.print(resultSet.getInt("empId") + " | ");
            System.out.print(resultSet.getInt("supervisor") + " | ");
            System.out.print(resultSet.getInt("salary"));
            System.out.println();
        }
        st.close();
        connection.close();
    }
}
