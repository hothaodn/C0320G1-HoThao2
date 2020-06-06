import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "simpleDictionary",urlPatterns = "/search")
public class simpleDictionary extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String,String> dictionary = new HashMap<>();
        dictionary.put("blue","xanh duong");
        dictionary.put("red","do");
        dictionary.put("pink","hong");
        dictionary.put("green","xanh la");
        dictionary.put("black","den");
        dictionary.put("white","trang");
        dictionary.put("orange","cam");
        dictionary.put("yellow","vang");

        String word = request.getParameter("word");
        PrintWriter display = response.getWriter();
        String result = dictionary.get(word);

        display.println("<html><h1>");
        if(result != null){
            display.println("Word: " + word);
            display.println("<br/>Result: " + result);
        }else{
            display.println("Not found your word");
        }
        display.println("</html></h1>");
    }
}
