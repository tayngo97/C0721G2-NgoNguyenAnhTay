package controller;

import bean.User;
import service.IUserService;
import service.impl.UserServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "UserServlet" ,urlPatterns = {"","/users"})
public class UserServlet extends HttpServlet {
    IUserService iUserService = new UserServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userAction = request.getParameter("userAction");
        if (userAction == null){
            userAction ="";
        }
        switch (userAction){
            case "create":
                createUser(request,response);
                break;
            case "edit":
                updateUser(request,response);
                break;

            case "search":
                searchUser(request,response);
                break;
            default:
                break;


        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userAction = request.getParameter("userAction");
        if (userAction == null){
            userAction ="";
        }
        switch (userAction){
            case "create":
                showCreateForm(request,response);
                break;
            case "edit":
                showEditForm(request,response);
                break;
            case "delete":
                deleteUser(request,response);
                break;
            case "sort":
                sortUser(request,response);
                break;
            default:
                userList(request,response);
                break;

        }
    }

    public void userList(HttpServletRequest request, HttpServletResponse response){
        List<User> userList = this.iUserService.findAll();
        request.setAttribute("userList",userList);
        try {
            request.getRequestDispatcher("user/list.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showCreateForm(HttpServletRequest request, HttpServletResponse response){
        try {
            request.getRequestDispatcher("user/create.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void createUser(HttpServletRequest request, HttpServletResponse response){
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String country = request.getParameter("country");
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        user.setCountry(country);
        this.iUserService.save(user);

        //cách 1
//        RequestDispatcher dispatcher;
//        request.setAttribute("user_create", user);
//        request.setAttribute("message", "user information was create");
//        dispatcher = request.getRequestDispatcher("user/create.jsp");
//        try {
//            dispatcher.forward(request, response);
//        } catch (ServletException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }



        // cách 2
        try {
            response.sendRedirect("/users");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deleteUser(HttpServletRequest request, HttpServletResponse response){
        int id = Integer.parseInt(request.getParameter("id"));
        this.iUserService.remove(id);
        try {
            response.sendRedirect("/users");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showEditForm(HttpServletRequest request, HttpServletResponse response){
        int id = Integer.parseInt(request.getParameter("id"));
        User user = this.iUserService.findById(id);
        request.setAttribute("user_show_edit",user);
        try {
            request.getRequestDispatcher("user/edit.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void updateUser(HttpServletRequest request, HttpServletResponse response){
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String country = request.getParameter("country");
        User user = new User(id,name,email,country);
        this.iUserService.update(user);


        // cách 1 dùng forward
//        RequestDispatcher dispatcher;
//        request.setAttribute("user_update", user);// đặt tên sao cũng được ví chỉ cần điều hướng tới file edit.jsp
//                                                  // thông qua forward đặt tên trong hter html đúng với tên user_update
//        request.setAttribute("message", "user information was updated");
//        dispatcher = request.getRequestDispatcher("user/edit.jsp");
//        try {
//            dispatcher.forward(request, response);
//        } catch (ServletException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        // cách 2 dùng redirect
        try {
            response.sendRedirect("/users");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void sortUser(HttpServletRequest request, HttpServletResponse response){
        List<User> userList = this.iUserService.sortByName();
        request.setAttribute("userList",userList);
        try {
            request.getRequestDispatcher("user/list.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void searchUser(HttpServletRequest request, HttpServletResponse response){
        String country = request.getParameter("country");
        List<User> userList = this.iUserService.findByCountry(country);
        request.setAttribute("userList",userList);
        try {
            request.getRequestDispatcher("user/list.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

