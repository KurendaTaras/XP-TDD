package ee;

import BD.Pipe;

 import javax.servlet.RequestDispatcher;
 import javax.servlet.ServletConfig;
 import javax.servlet.ServletException;
 import javax.servlet.annotation.WebServlet;
 import javax.servlet.http.HttpServlet;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;
 import java.io.IOException;
 import java.sql.SQLException;
 import java.util.ArrayList;
 import java.util.Map;
 import java.util.stream.Collectors;

@WebServlet("/registration")
public class Registration extends HttpServlet {


    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/REgistration.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(" sdasdadsasd asdjka sdjao;s dhaposudapsudy aousdhpa9 su yhpoiasudyapoisu yaoiusda");

        ArrayList<Person> person = new ArrayList<>();
        int age = 0;
        String name = "";
        String Password = "";
        for (Map.Entry<String, String[]> map : req.getParameterMap().entrySet()) {

            if (map.getKey().equals("Username")) {
                name = String.join("and", map.getValue());

            }
            if (map.getKey().equals("Password")) {
                Password = String.join("and", map.getValue());

            }

        }
        Pipe pipe = new Pipe();

        try {
            pipe.connect(name, Password);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/cabinet.jsp");
        requestDispatcher.forward(req, resp);

    }

    private String getParameter(HttpServletRequest req) {
        return req.getParameterMap()
                .entrySet()
                .stream()
                .map(stringEntry -> {
                    String param = String.join("and", stringEntry.getValue());
                    return stringEntry.getKey() + "=>>" + param;
                }).collect(Collectors.joining("\n"));
    }


}
