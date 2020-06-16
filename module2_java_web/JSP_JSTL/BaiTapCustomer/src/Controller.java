import java.util.HashMap;
import java.util.Map;

@javax.servlet.annotation.WebServlet(name = "impl",urlPatterns = "display")
public class Controller extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, java.io.IOException {
        Map<Integer,Customer> customerList = new HashMap<>();
        customerList.put(1,new Customer("Katy Perry", "01-01-1985","USA","katy.jpg"));
        customerList.put(2,new Customer("Miley Cyrus", "01-01-1985","USA","miley.jpg"));
        customerList.put(3,new Customer("Adele", "01-01-1985","UK","adele.jpg"));
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, java.io.IOException {

    }
}
