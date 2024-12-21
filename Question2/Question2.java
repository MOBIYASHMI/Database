import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Question2 {
    private static final String DB_url="jdbc:mysql://localhost:3306/sqltask";

    private static final String USER="root";

    private static final String PASSWORD="PoojaYashu@2001";

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            Connection connection= DriverManager.getConnection(DB_url,USER,PASSWORD);
            for(int i=1;i<6;i++){
                System.out.println("Employee "+i);
                System.out.println("Enter empcode: ");
                int empcode=sc.nextInt();
                System.out.println("Enter empname: ");
                String name=sc.next();
                System.out.println("Enter empage: ");
                int age=sc.nextInt();
                System.out.println("Enter esalary: ");
                int salary=sc.nextInt();
                String query= """
                    insert into empdetails (empcode,empname,empage,esalary)
                    values (?,?,?,?);
                    """;

                PreparedStatement preparedStatement=connection.prepareStatement(query);
                preparedStatement.setInt(1,empcode);
                preparedStatement.setString(2,name);
                preparedStatement.setInt(3,age);
                preparedStatement.setInt(4,salary);

                preparedStatement.executeUpdate();
            }
            System.out.println("Data inserted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
