package services;

import models.person.Employee;

public interface EmployeeService extends Service {
    public void addNewEmployee();
    public void editInfoEmployee();
    public void showInfoList();
}
