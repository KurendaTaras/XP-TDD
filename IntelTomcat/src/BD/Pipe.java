package BD;

import java.sql.*;

public class Pipe implements Connector {
    public  boolean is_Person(String name1, String password)throws SQLException {


        try (Connection connection = DriverManager.getConnection(url, name, this.password);
             Statement statemnt = connection.createStatement()
        ) {

            String query= "Select Name " +
                    "from trucker.trucker  "
                    + " Where Name like "+name1;
            String query1 = "Select Password " +
                    "from trucker.trucker  "
                    + " Where Password like "+password;

           return ( statemnt.execute(query) &&
                       statemnt.execute(query1));



        }




    }

        @Override
        public void connect (String name1,int age) throws SQLException {


            try (Connection connection = DriverManager.getConnection(url, name, password);
                 Statement statemnt = connection.createStatement();
            ) {

                String query1 = "insert into trucker.trucker (Surname,Age) values(?,?)";

                PreparedStatement preparedStatemnt = connection.prepareStatement(query1);
                preparedStatemnt.setString(1, name1);
                preparedStatemnt.setInt(2, age);
                preparedStatemnt.execute();
                ResultSet result = preparedStatemnt.executeQuery("SELECT * from trucker.trucker");
                while (result.next()) {
                    System.out.println(result.getString(" name    " + 1));
                    System.out.println(result.getString("Surname   " + 2));
                    System.out.println(result.getInt("Age   " + 3));
                    System.out.println(result.getInt("id " + 4));
                    System.out.println(result.getInt(" id  " + 5));
                }
            }
        }
        public void connect (String name1, String PAssword) throws SQLException {

            try (Connection connection = DriverManager.getConnection(url, name, password);
                 Statement statemnt = connection.createStatement();
            ) {

                String query1 = "insert into trucker.trucker (Surname,Password) values(?,?)";

                PreparedStatement preparedStatemnt = connection.prepareStatement(query1);
                preparedStatemnt.setString(1, name1);
                preparedStatemnt.setString(2, PAssword);
                preparedStatemnt.execute();
                ResultSet result = preparedStatemnt.executeQuery("SELECT * from trucker.trucker");
                while (result.next()) {
                    System.out.println(result.getString(" name    " + 1));
                    System.out.println(result.getString("Surname   " + 2));
                    System.out.println(result.getInt("Age   " + 3));
                    System.out.println(result.getInt("id " + 4));
                    System.out.println(result.getInt(" id  " + 5));
                }
            }
        }


    }

