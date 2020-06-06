import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@WebServlet(name = "displaySystemTime",urlPatterns = "/time")
public class displaySystemTime extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        writer.println("<html><h5 style=color:blue>HELLO KATY</h5></html>");

//        Date today = new Date();
        LocalDateTime today = LocalDateTime.now();
        writer.println("<h3 style=color:red>Before formatting: " + today +"</h3>");

        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String line = myFormatObj.format(today);
        writer.println("<h1 style=color:red>After formatting: " + line+"</h1>");
    }
}

