package controller;

import model.Product;
import service.IProductService;
import service.impl.ProductServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "PRoductServlet", urlPatterns = {"", "/product"})
public class ProductServlet extends HttpServlet {
    private IProductService productService = new ProductServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("actionUser");
        if(action == null){
            action = "";
        }
        switch (action){
            case "create":
                createCustomer(request, response);
                break;
            case "edit":
                updateProduct(request,response);
                break;
            case "delete":
                deleteCustomer(request,response);
                break;
            case "search":
                searchForm(request,response);
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
                showCreateFrom(request, response);
                break;
            case "edit":
                showEditForm(request,response);
                break;
            case "delete":
                showDeleteForm(request,response);
                break;
            case "view":
                viewProduct(request,response);
                break;
            case "search":
                searchForm(request,response);
                break;
            default:
                listProduct(request, response);
                break;
        }
    }

    private void searchForm(HttpServletRequest request, HttpServletResponse response){
        String nameSearch = request.getParameter("nameSearch");
        Product product = this.productService.findByName(nameSearch);
        RequestDispatcher requestDispatcher;
        if (product == null){
            requestDispatcher = request.getRequestDispatcher("product/error-404.jsp");
        } else {
            request.setAttribute("product",product);
            requestDispatcher = request.getRequestDispatcher("product/search.jsp");
        }
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void listProduct(HttpServletRequest request, HttpServletResponse response) {
        List<Product> productList = this.productService.findAll();
        request.setAttribute("product", productList);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("product/list.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showCreateFrom(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("product/create.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createCustomer(HttpServletRequest request,HttpServletResponse response){

        try {
            int id = Integer.parseInt(request.getParameter("id"));
            String name = request.getParameter("name");
            int price = Integer.parseInt(request.getParameter("price"));
            Product product = new Product(id,name,price);
            this.productService.save(product);
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("product/create.jsp");
            request.setAttribute("message","New customer was created");
            try {
                requestDispatcher.forward(request,response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }catch (Exception exception){
            try {
                RequestDispatcher requestDispatcher = request.getRequestDispatcher("product/create.jsp");
                request.setAttribute("message","Can not add new product !");

                try {
                    requestDispatcher.forward(request,response);
                } catch (ServletException e) {
                    e.printStackTrace();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        Product product = this.productService.findByName(name);
        RequestDispatcher requestDispatcher;
        if (product == null){
            requestDispatcher = request.getRequestDispatcher("product/error-404.jsp");
        } else {
            request.setAttribute("product",product);
            requestDispatcher = request.getRequestDispatcher("product/edit.jsp");
        }
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void updateProduct(HttpServletRequest request, HttpServletResponse response){
        int id = Integer.parseInt(request.getParameter("id"));
        String newName = request.getParameter("nameProduct");
        int price = Integer.parseInt(request.getParameter("price"));

        String oldName = request.getParameter("name");
        Product product = this.productService.findByName(oldName);
        RequestDispatcher requestDispatcher;
        if (product == null){
            requestDispatcher = request.getRequestDispatcher("product/error-404.jsp");
        } else {
            product.setId(id);
            product.setName(newName);
            product.setPrice(price);
            this.productService.update(id,product);
            request.setAttribute("product",product);
            request.setAttribute("message","Successful");
            requestDispatcher = request.getRequestDispatcher("product/edit.jsp");
        }
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showDeleteForm(HttpServletRequest request, HttpServletResponse response){
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = this.productService.findById(id);
        RequestDispatcher dispatcher;
        if(product == null){
            dispatcher = request.getRequestDispatcher("error-404.jsp");
        } else {
            request.setAttribute("product", product);
            dispatcher = request.getRequestDispatcher("product/delete.jsp");
        }
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void deleteCustomer(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = this.productService.findById(id);
        RequestDispatcher dispatcher;
        if(product == null){
            dispatcher = request.getRequestDispatcher("error-404.jsp");
        } else {
            this.productService.remove(id);
            try {
                response.sendRedirect("/product");
//                listProduct(request,response);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void viewProduct(HttpServletRequest request, HttpServletResponse response){
            int id = Integer.parseInt(request.getParameter("id"));
            Product product = this.productService.findById(id);
            RequestDispatcher requestDispatcher;
            if (product == null){
                requestDispatcher = request.getRequestDispatcher("product/error-404.jsp");
            } else {
                request.setAttribute("product",product);
                requestDispatcher = request.getRequestDispatcher("product/view.jsp");
            }
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }





}
