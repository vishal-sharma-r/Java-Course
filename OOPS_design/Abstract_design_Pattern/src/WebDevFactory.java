public class WebDevFactory extends EmployeeAbstractFactory{
    public Employee creatEmployee(){
        return new WebDeveloper();
    }
}
