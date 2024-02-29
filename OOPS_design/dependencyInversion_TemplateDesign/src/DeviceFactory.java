public class DeviceFactory {
    public static void main(String[] args) {
        GeneralManufacturingProcess manufacturer = new SmartPhoneManufacturingProcess("IPhone Process");
        manufacturer.launchProcess();
    }
}
