import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DDLusingJDBC {
    public static void main(String[] args) throws  Exception {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vishal","root","vsr");
        Statement stm = con.createStatement();
//        stm.executeUpdate("CREATE TABLE temp(rollno int primary key , name varchar(50))");
        stm.executeUpdate("drop table temp");
        stm.close();
        con.close();
    }
}
