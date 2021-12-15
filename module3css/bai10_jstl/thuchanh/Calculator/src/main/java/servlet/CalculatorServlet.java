package servlet;

import bean.Calculator;

import java.io.IOException;
import java.io.PrintWriter;

@javax.servlet.annotation.WebServlet(name = "CalculatorServlet",urlPatterns = "/calculate")
public class CalculatorServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        float firstOperand = Integer.parseInt(request.getParameter("first-operand"));
        float secondOperand = Integer.parseInt(request.getParameter("second-operand"));
        char operator = request.getParameter("operator").charAt(0);



        float result = Calculator.calculate(firstOperand,secondOperand,operator);
        request.setAttribute("result",result);
        request.getRequestDispatcher("index.jsp").forward(request,response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
