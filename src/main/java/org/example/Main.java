package org.example;
import java.sql.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }
            String url = "jdbc:postgresql://localhost:5432/dbFun";
            String uname = "postgres";
            String pass = "NachoEetKoekjes";
         //   String sql = "SELECT sname FROM public.student WHERE sid = 1";
            String sql = "SELECT * FROM public.student";
            try {
                Connection con = DriverManager.getConnection(url, uname, pass);
                Statement st = con.createStatement();
                ResultSet rs  = st.executeQuery(sql);
//                rs.next();
//                String name = rs.getString("sname");
//                System.out.println(name);
                while (rs.next()){
                    System.out.println(rs.getString("sname"));
                }

            } catch (SQLException e) {
                throw new RuntimeException(e);





        }
    }
}