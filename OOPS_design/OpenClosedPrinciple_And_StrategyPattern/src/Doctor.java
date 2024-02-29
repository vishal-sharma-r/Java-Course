public class Doctor extends Employee{
    public Doctor(int employeeID, String name, String department, boolean working) {
        super(employeeID, name, department, working);
    }

    private void prescribeMedicine() {
        System.out.println("Priscribe Medicine");
    }

    private void diagnosePatient() {
        System.out.println("Diagnose Patient");
    }

    @Override
    public void performDuties() {
        prescribeMedicine();
        diagnosePatient();
    }
}
