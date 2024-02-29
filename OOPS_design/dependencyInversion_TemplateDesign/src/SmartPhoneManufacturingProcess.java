public class SmartPhoneManufacturingProcess extends GeneralManufacturingProcess {

    public SmartPhoneManufacturingProcess(String processName) {
        super(processName);
    }

    @Override
    protected void assembleDevice() {
        System.out.println("Assembled smartphone: " + getProcessName());
    }

    @Override
    protected void testDevice() {
        System.out.println("Tested smartphone: " + getProcessName());
    }

    @Override
    protected void packageDevice() {
        System.out.println("package smartphone: " + getProcessName());
    }

    @Override
    protected void storeDevice() {
        System.out.println("Store smartphone: " + getProcessName());
    }
}
