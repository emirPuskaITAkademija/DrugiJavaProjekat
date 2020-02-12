package advanced.four;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//1. dodati library od dotične baze tzv. connector 
//2. Connector kojeg cemo dobiti iz DriverManager
//3. Statement objekat ćemo dobiti iz prethodno dobijenog Connector
//4. Obraditi rezultate upita na bazu ResultSet
public class DbConnector {
    // root jdbc::mysql//localhost:3306/person
    public static void main(String[] args) {
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/person", "root", "")){
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM person.person LIMIT 100";
            ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
                String name = resultSet.getString(2);
                System.out.println(name);
            }
        }catch(SQLException e){
            System.err.println(e.getCause());
        }
    }
}
