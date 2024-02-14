import java.sql.*;
import java.util.Scanner;

public class DMLusingJDBC {
    public static void main(String[] args) throws  Exception {

        Connection con  = DriverManager.getConnection("jdbc:mysql://localhost/vishal","root","vsr");
//        Statement stm = con.createStatement();
        PreparedStatement stm= con.prepareStatement("insert into employee values(?,?,?,?)");
//        stm.executeUpdate("insert into  employee values(1,'vishal',2,1000)");
//        stm.executeUpdate("update employee set salary = 5000 where supervisor = 3");
//        stm.executeUpdate("update employee set supervisor = empId");
        Scanner sc = new Scanner(System.in);
        int empId = sc.nextInt();
        String name  = sc.next();
        int supervisor = sc.nextInt();
        int salary = sc.nextInt();
        stm.setInt(1,empId);
        stm.setString(2,name);
        stm.setInt(3,supervisor);
        stm.setInt(4,salary);
        stm.executeUpdate();
        stm.close();
        con.close();

    }

}
