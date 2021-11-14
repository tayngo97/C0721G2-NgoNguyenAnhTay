package repository.employee_repo;

import bean.Book;
import service.book_service.BaseRepoBook;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BookRepository implements IBookRepositpry {
    @Override
    public List<Book> findAll() {
        List<Book> bookList = new ArrayList<>();
        try {
            Statement statement = BaseRepoBook.connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from book;");

            Book book = null;
            while (resultSet.next()){
                book = new Book();
                book.setId(resultSet.getInt("id"));
                book.setName(resultSet.getString("name"));
                book.setAuthor(resultSet.getString("author"));
                book.setDescription(resultSet.getString("description"));
                book.setQuantity(resultSet.getInt("quantity"));
                bookList.add(book);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return bookList;
    }

    @Override
    public void save(Book book) {
//        try {
//            PreparedStatement preparedStatement =
//                    BaseRepoEmployee.connection.prepareStatement(
//                            " insert into employee(`name`,birthday,salary,phone_number,email,address,position_id,education_degree_id,division_id,username)"+
//                            " values (?,?,?,?,?,?,?,?,?,?)");
//            System.out.println(employee.toString());
//            preparedStatement.setString(1,employee.getName());
//            preparedStatement.setString(2,employee.getBirthday());
//            preparedStatement.setInt(3,employee.getSalary());
//            preparedStatement.setString(4,employee.getPhoneNumberl());
//            preparedStatement.setString(5,employee.getEmail());
//            preparedStatement.setString(6,employee.getAdress());
//            preparedStatement.setInt(7,Integer.parseInt(employee.getDivision()));
//            preparedStatement.setInt(8,Integer.parseInt(employee.getEducation_degree()));
//            preparedStatement.setInt(9,Integer.parseInt(employee.getPosition()));
//            preparedStatement.setString(10,employee.getUserName());
//            preparedStatement.executeUpdate();
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
    }

    @Override
    public void remove(int id) {
//        try {
//            PreparedStatement preparedStatement =
//                    BaseRepoEmployee.connection.prepareStatement("delete from employee where id=?");
//            preparedStatement.setInt(1,id);
//            preparedStatement.executeUpdate();
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
    }

    @Override
    public Book findById(int id) {
        Book book = null;
        try {
            PreparedStatement preparedStatement =
                    BaseRepoBook.connection.prepareStatement("select * from book where id = ?;");
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                book = new Book();
                book.setId(resultSet.getInt("id"));
                book.setName(resultSet.getString("name"));
                book.setAuthor(resultSet.getString("author"));
                book.setDescription(resultSet.getString("description"));
                book.setQuantity(resultSet.getInt("quantity"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return book;
    }

    @Override
    public void update(Book employee) {
//        try {
//            PreparedStatement preparedStatement =
//                    BaseRepoEmployee.connection.prepareStatement("update employee set `name`=?,birthday=?,salary=?,phone_number=?,email=?,address=?,position_id=?,education_degree_id=?,division_id=?,username=? where id=?");
//
//                    preparedStatement.setString(1,employee.getName());
//                    preparedStatement.setString(2,employee.getBirthday());
//                    preparedStatement.setInt(3,employee.getSalary());
//                    preparedStatement.setString(4,employee.getPhoneNumberl());
//                    preparedStatement.setString(5,employee.getEmail());
//                    preparedStatement.setString(6,employee.getAdress());
//                    preparedStatement.setInt(7,Integer.parseInt(employee.getPosition()));
//                    preparedStatement.setInt(8,Integer.parseInt(employee.getEducation_degree()));
//                    preparedStatement.setInt(9,Integer.parseInt(employee.getDivision()));
//                    preparedStatement.setString(10,employee.getUserName());
//                    preparedStatement.setInt(11,employee.getId());
//
//                    preparedStatement.executeUpdate();
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }

    }

    @Override
    public List<Book> findByCountry(String country) {
        return null;
    }

    @Override
    public List<Book> sortByName() {
//        List<Book> employeeList = new ArrayList<>();
//        try {
//            PreparedStatement preparedStatement =
//                    BaseRepoEmployee.connection.prepareStatement("select * from employee order by `name`");
//                    ResultSet resultSet = preparedStatement.executeQuery();
//
//                    Book employee = null;
//
//                    while (resultSet.next()){
//                employee = new Book();
//                employee.setId(resultSet.getInt("id"));
//                employee.setName(resultSet.getString("name"));
//                employee.setBirthday(resultSet.getString("birthday"));
//                employee.setSalary(resultSet.getInt("salary"));
//                employee.setPhoneNumberl(resultSet.getNString("phone_number"));
//                employee.setEmail(resultSet.getString("email"));
//                employee.setAdress(resultSet.getString("address"));
//                employee.setPosition(resultSet.getString("position_id"));
//                employee.setEducation_degree(resultSet.getString("education_degree_id"));
//                employee.setDivision(resultSet.getString("division_id"));
//                employee.setUserName(resultSet.getString("username"));
//                employeeList.add(employee);
//            }
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
        return null;
    }
}
