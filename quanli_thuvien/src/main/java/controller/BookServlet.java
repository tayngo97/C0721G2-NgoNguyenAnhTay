package controller;

import bean.Book;
import service.book_service.BookServiceImpl;
import service.book_service.IBookService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name ="BookServlet",urlPatterns = "/book")
public class BookServlet extends HttpServlet {
    IBookService bookService = new BookServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String bookAction = request.getParameter("bookAction");
        if (bookAction == null) {
            bookAction = "";
        }

        switch (bookAction) {
            case "create":
                createBook(request, response);
                break;
            case "edit":
                updateBook(request,response);
                break;
            case "delete":
//                showDeleteForm(request,response);
                break;
            case "view":
//                viewProduct(request,response);
                break;
            case "search":
                searchById(request,response);
                break;
            default:
                listBook(request, response);
                break;
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String bookAction = request.getParameter("bookAction");
        if (bookAction == null) {
            bookAction = "";
        }

        switch (bookAction) {
//            case "create":
//                showCreateFrom(request, response);
//                break;
            case "rental":
                rentalBook(request,response);
                break;
            case "edit":
                showEditForm(request,response);
                break;
            case "delete":
                deleteBook(request,response);
                break;
            case "sort":
                sortBook(request,response);
                break;
//            case "search":
//                searchById(request,response);
//                break;
            default:
                listBook(request, response);
                break;
        }
    }

    private void listBook(HttpServletRequest request, HttpServletResponse response) {
        List<Book> employeeList = this.bookService.findAll();
        request.setAttribute("bookList", employeeList);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("book/book.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    private void rentalBook(HttpServletRequest request, HttpServletResponse response){
        int id = Integer.parseInt(request.getParameter("id"));
        Book book = this.bookService.findById(id);
        System.out.println(book);
        request.setAttribute("book",book);
        try {
            request.getRequestDispatcher("book/rental_form.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createBook(HttpServletRequest request, HttpServletResponse response){
//            String name = request.getParameter("name");
//            String birthday = request.getParameter("birthday");
//            int salary = Integer.parseInt(request.getParameter("salary"));
//            String phoneNumber = request.getParameter("phoneNumber");
//            String email = request.getParameter("email");
//            String address = request.getParameter("address");
//            String division = request.getParameter("division");
//            String education = request.getParameter("education");
//            String position = request.getParameter("position");
//            String userName = request.getParameter("userName");
//
//            Book employee = new Book();
//            employee.setName(name);
//            employee.setBirthday(birthday);
//            employee.setSalary(salary);
//            employee.setPhoneNumberl(phoneNumber);
//            employee.setEmail(email);
//            employee.setAdress(address);
//            employee.setDivision(division);
//            employee.setEducation_degree(education);
//            employee.setPosition(position);
//            employee.setUserName(userName);
//
//             System.out.println(name);
//            this.bookService.save(employee);
//
//        try {
//            response.sendRedirect("/employee");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response){
        int id = Integer.parseInt(request.getParameter("id"));
        Book employee = this.bookService.findById(id);
        System.out.println(employee);
        request.setAttribute("employee",employee);
        try {
            request.getRequestDispatcher("employee/edit_employee1.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void updateBook(HttpServletRequest request, HttpServletResponse response){
//        int id = Integer.parseInt(request.getParameter("id"));
////        System.out.println(id);
//        String name = request.getParameter("name");
////        System.out.println(name);
//        String birthday = request.getParameter("birthday");
//        int salary = Integer.parseInt(request.getParameter("salary"));
////        System.out.println(salary);
//        String phoneNumber = request.getParameter("phoneNumber");
//        String email = request.getParameter("email");
//        String address = request.getParameter("address");
//        String division = request.getParameter("division");
//        String education = request.getParameter("education");
//        String position = request.getParameter("position");
//        String userName = request.getParameter("userName");
//
//        Book employee = new Book(id,name,birthday,salary,phoneNumber,email,address,division,education,position,userName);
//        this.bookService.update(employee);
//        try {
//            response.sendRedirect("/employee");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    private void deleteBook(HttpServletRequest request, HttpServletResponse response){
        int id = Integer.parseInt(request.getParameter("id"));
        this.bookService.remove(id);
        try {
            response.sendRedirect("/employee");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void sortBook(HttpServletRequest request, HttpServletResponse response){
        List<Book> employeeList = this.bookService.sortByName();
        request.setAttribute("employeeList",employeeList);
        try {
            request.getRequestDispatcher("book/book.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void searchById(HttpServletRequest request, HttpServletResponse response){
        int id = Integer.parseInt(request.getParameter("id"));
        Book employee = this.bookService.findById(id);
        System.out.println(employee);
        request.setAttribute("employee1",employee);
        try {
            request.getRequestDispatcher("employee/search.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
