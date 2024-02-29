public class EmployeeFactory {
    public static Employee getEmployee(String employee)
    {
        employee = employee.trim();


        if(employee.equalsIgnoreCase("ANDROID DEVELOPER"))
        {
            return new AndroidDeveloper();
        }
        else if(employee.equalsIgnoreCase("WEB DEVELOPER"))
        {
            return new WebDeveloper();
        }
        else {
            return null;
        }
    }
}
