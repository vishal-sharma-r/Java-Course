import java.sql.*;
import java.util.Scanner;
@SuppressWarnings("all ")
public class Database {
    public static void main(String[] args) throws  Exception {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vishal","root","vsr");

//        Statement st = con.createStatement();
//        st.executeUpdate("delete from employee where empId = 1");
//        ResultSet rs = st.executeQuery("select * from employee");
//        while(rs.next())
//        {
//            System.out.println(rs.getInt("empId"));
//        }
//        st.close();

        PreparedStatement pstm = con.prepareStatement("select * from employee where empId = ?");
        Scanner sc = new Scanner(System.in);
        int empId = sc.nextInt();
        pstm.setInt(1,empId);
        ResultSet rs = pstm.executeQuery();
        while (rs.next()) {
            System.out.print(rs.getString("name") + " | ");
            System.out.print(rs.getInt("empId") + " | ");
            System.out.print(rs.getInt("supervisor") + " | ");
            System.out.print(rs.getInt("salary"));
            System.out.println();
        }
        pstm.close();
        con.close();
        sc.close();
    }
}
