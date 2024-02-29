public class Main{
    public static void main(String[] args) {
        System.out.println("Creating a Object using prototype design pattern...");
        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp("192.168.1.2");
        networkConnection.loadVeryImportantData();
        System.out.println(networkConnection);
        try{
           NetworkConnection nw2 =  (NetworkConnection)networkConnection.clone();
           System.out.println(nw2);
        } catch(CloneNotSupportedException e) { 

        }
    }
}