package ManagerOmsi;

import java.sql.Connection;
import java.sql.DriverManager;

public class Verbindung {


    public static Connection getConnection() throws Exception {
        try {
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/omsimanager?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            String username = "root";
            String password = "omsimanagersql";

            Class.forName(driver);

            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Verbunden");
            return conn;
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }


}
