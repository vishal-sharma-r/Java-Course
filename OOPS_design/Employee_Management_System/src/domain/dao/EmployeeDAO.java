package domain.dao;

import database.DatabaseConnectionManager;
import domain.Employee;

public class EmployeeDAO {
    public EmployeeDAO(){

    }
    public void saveEmployee(Employee employee) {

//         DatabaseConnectionManager databaseConnection =
//         DatabaseConnectionManager.getManagerInstance();
//         databaseConnection.connect();
//         DatabaseConnectionManager.getManagerInstance().getConnectionObject().
//         prepareStatement("Some SQL..."); databaseConnection.disconnect();


        System.out.println("Saved Employee to Database");
    }

    public void deleteEmployee(Employee employee) {
        // DatabaseConnectionManager.getManagerInstance().getConnectionObject().prepareStatement("Some
        // SQL...");

        System.out.println("Removed employee from database");
    }

}