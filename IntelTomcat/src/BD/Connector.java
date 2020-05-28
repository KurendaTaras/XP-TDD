package BD;

import java.sql.SQLException;

/*
 * An interface that contains all statement for connecting
 *
 * */
public interface Connector {

    final static String name = "Taras";
    final static String password = "20pudge00";
    final static String url = "jdbc:mysql://localhost:3306";

    public void connect(String name, int age) throws SQLException;


}
