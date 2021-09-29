package services;

import models.person.Employee;

public interface EmployeeService extends Service {
     void addNewEmployee();
     void editInfoEmployee();
     void showInfoList();
    void deleteEmployee();
    void searchEmployee();
}
