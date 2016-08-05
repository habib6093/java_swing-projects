import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;




public class Hello
{
    public static void main(String arg[]) throws SQLException{
    {   String JDBC_DRIVER="com.mysql.jdbc.Driver";
        String host="jdbc:mysql://localhost:3306/temp";
        String user_name="root";
        String password="";
        Connection con=DriverManager.getConnection(host,user_name,password);

         Statement stmt=null;
         ResultSet rs;
         stmt = con.createStatement();
         rs=stmt.executeQuery("select * from dmp");

      while(rs.next())
      {
        String n=rs.getString("name");
        int i=rs.getInt("id");
        System.out.println("ID is: "+i);
        System.out.println("name is: "+n);
      }

    }
  }
}
