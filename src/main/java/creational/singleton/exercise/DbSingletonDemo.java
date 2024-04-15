package creational.singleton.exercise;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DbSingletonDemo {
    public static void main(String[] args) throws SQLException {
        DbSingleton dbSingleton = DbSingleton.getInstance();
//        DbSingleton testConstant = new DbSingleton(); // wont compile as constructor is private

        System.out.println(dbSingleton);

        Connection conn = dbSingleton.getConnection();

        Statement statement = conn.createStatement();
        statement.execute("Create table students(id int primary key, name varchar(255))");

        System.out.println("Create table students");
        int rows = statement.executeUpdate("Insert into students(id, name) values(1, 'John')");

        if(rows > 0) {
            System.out.println("inserted a new row.");
        }

        conn.close();

    }
}
