package Servlet;

import bean.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "StudentServlet",urlPatterns = {"","/student_servlet"})
public class StudentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Mai Văn Hoàn","1983-08-20","Hà nội","https://toplist.vn/images/800px/sera-studio-316585.jpg"));
        studentList.add(new Student("Nguyễn Văn Nam","1983-08-21","Bắc Giang","https://toplist.vn/images/800px/sera-studio-554098.jpg"));
        studentList.add(new Student("Nguyễn Thái Hoàn","1983-08-22","Nam Định","https://toplist.vn/images/800px/kamiwedding-316252.jpg"));
        studentList.add(new Student("Trần Đăng Khóa","1983-08-17","Hà Tây","https://toplist.vn/images/800px/kamiwedding-554101.jpg"));

        request.setAttribute("studentListServlet",studentList);
        request.getRequestDispatcher("index.jsp").forward(request,response);
    }
}
