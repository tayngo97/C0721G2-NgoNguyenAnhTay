package controller;

import bean.Customer;
import service.ICustomerService;
import service.impl.CustomerServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomerServlet")
public class CustomerServlet extends HttpServlet {
    private ICustomerService customerService = new CustomerServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String actionUser = request.getParameter("actionUser");
        if(actionUser == null){
            actionUser = "";
        }
        switch (actionUser){
            case "create":
                break;
            case "edit":
                break;
            case "delete":
                break;
            default:
                break;
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String actionUser = request.getParameter("actionUser");
        if (actionUser == null) {
            actionUser = "";
        }

        switch (actionUser) {
            case "create":
                break;
            case "edit":
                break;
            case "delete":
                break;
            case "view":
                break;
            default:
                listCustomers(request, response);
                break;
        }
    }

    private void listCustomers(HttpServletRequest request, HttpServletResponse response) {
        List<Customer> customers = this.customerService.findAll();
        request.setAttribute("customers", customers);

        RequestDispatcher dispatcher = request.getRequestDispatcher("customer/list.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
