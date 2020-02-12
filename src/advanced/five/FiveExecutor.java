package advanced.five;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
//java.io
//JDBC
//JDBC služi nama programerima da uradimo sljedeće tri aktivnosti:
//1. Povezati na IZVOR podataka
//1.1 dodati konektor baze na koju se povezujemo(MySQL)
//1.2 na kojoj adresi url, username i password
//1.3 Connection objekat cemo dobiti iz DriverManager

//2. Slati upite(queries) i pisati nekakve izraze(SQL)
// 2.1 Statement objekat pomoću kojeg ćemo pisati SQL statement
// 2.2 kreirati statement SQL
// 
//3. Dohvatiti podatke i analizirati dohvaćene podatke
// 3.1 izvrši statement
// 3.2 analiziramo dohvaćene podatke
public class FiveExecutor {

    public static final String URL = "jdbc:mysql://localhost:3306/person";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "";

    public static void main(String[] args) throws IOException {
        List<Person> persons = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);) {
            //DML - Data Manipulation Language -select,update, insert, delete
            Statement statement = connection.createStatement();
            String sqlStatement = "SELECT * FROM person LIMIT 100";
            //izvrši statement
            ResultSet resultSet = statement.executeQuery(sqlStatement);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String lastName = resultSet.getString("LastName");
                String firstName = resultSet.getString(3);
                if (firstName.equals("Osman")) {
                    String sqlUpdate = "UPDATE person.person SET `Address`=? WHERE id=?";
                    PreparedStatement ps = connection.prepareStatement(sqlUpdate);
                    ps.setString(1, "Trg OSMANOV 1 ");
                    ps.setInt(2, id);
                    int rowNumber = ps.executeUpdate();
                    // System.out.println("Broj redova na koje je uticao ovaj statement je = " + rowNumber);
                }
                Person person = new Person(resultSet.getInt("id"), resultSet.getString("LastName"), resultSet.getString("FirstName"), resultSet.getString(4), resultSet.getString(5));
                persons.add(person);
            }
        } catch (SQLException sQLException) {
            System.err.println(sQLException.getMessage());
        }

        PersonPrinter printer = new PersonPrinter(persons);
        printer.printPersonsFromCity("Novo Sarajevo");
        System.out.println("LAMBDA");
        PersonTester personTester = new MojTest();
        printer.printPersonAfterTesting(personTester);
        PersonTester personTester1 = p->p.getAddress().startsWith("Trg");
        printer.printPersonAfterTesting(personTester1);
    }

    static class MojTest implements PersonTester {

        @Override
        public boolean test(Person p) {
            return p.getCity().equals("Novo Sarajevo");
        }

    }
}
