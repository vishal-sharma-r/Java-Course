public class Nurse extends Employee {

    public Nurse(int employeeID, String name, String department, boolean working) {
        super(employeeID, name, department, working);
    }

    private void checkVitalSigns() {
        System.out.println("Checking Vitals");
    }

    ;

    private void drawblood() {
        System.out.println("Drawing Blood");
    }

    private void cleanPatientArea() {
        System.out.println("Cleaning Patient Area");
    }

    @Override
    public void performDuties() {
        checkVitalSigns();
        drawblood();
        cleanPatientArea();
    }
}
