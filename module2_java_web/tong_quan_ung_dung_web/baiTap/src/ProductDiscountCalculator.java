import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ProductDiscountCalculator",urlPatterns = "/calculate")
public class ProductDiscountCalculator extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String description = request.getParameter("description-product");
        Float price = Float.parseFloat(request.getParameter("price-product"));
        Float discount = Float.parseFloat(request.getParameter("discount")) / 100;
        //Discount Amount = List Price * Discount Percent * 0.1
        Float discountAmount = price * discount;
        Float amountAfterDiscount = price * (1-discount);

        PrintWriter display = response.getWriter();
        display.println("<html><h1>");
        display.println("Description of Product: " + description);
        display.println("<br/>Price After Discount: " + price
                    + "<br/>Discount Amount: " + discountAmount
                    + "<br/>Price After Discount: " + amountAfterDiscount);
        display.println("</h1></html>");
    }
}
