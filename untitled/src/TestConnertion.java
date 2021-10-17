import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

import java.sql.Connection;
import java.sql.SQLException;

public class TestConnertion {
    public static void main(String[] args) {
        SQLServerDataSource ds= new SQLServerDataSource();
        ds.setUser("");
        ds.setPassword("");
        ds.setServerName("");
        ds.setPortNumber();
        ds.setDatabaseName("");

        try(Connection connection = ds.getConnection()){
            System.out.println("Connection success!");
            System.out.println(connection.getMetaData());
        } catch (SQLServerException throwables) {
            throwables.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }
}
