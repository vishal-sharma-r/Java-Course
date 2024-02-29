public class EmergencyRoomProcess {
    public static void main(String[] args) {
        HospitalManagement ERDirector = new HospitalManagement();

        Nurse jessi = new Nurse(1, "Jessi", "emergency", true);
        ERDirector.callUpon(jessi);
        System.out.println();
        Employee suzan = new Doctor(2, "Suzan", "emergency", true);
        ERDirector.callUpon(suzan);
    }
}