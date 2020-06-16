package controllers;

import models.Calculator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(name = "CalculateController", urlPatterns = "/")
public class CalculateController extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        Float firstOper = Float.parseFloat(request.getParameter("firstOper"));
        Float secondtOper = Float.parseFloat(request.getParameter("secondOper"));
        String operator = request.getParameter("operator");

        Calculator calculator = new Calculator(firstOper,secondtOper,operator);
        Double result = calculator.calculate();
        RequestDispatcher dispatcher;
        if(result == null){
            dispatcher = request.getRequestDispatcher("error-404.jsp");
        } else {
            request.setAttribute("result",result);
            dispatcher = request.getRequestDispatcher("index.jsp");
        }
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
