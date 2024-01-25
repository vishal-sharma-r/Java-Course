public class Challenge2_2 {
    static boolean isValid(String str){
        if(str.matches("[a-zA-Z\\s]+")) return true;
        else return false;
    }
    static boolean isValid(int age){
        if(age > 4 && age < 18) return true;
        return false;
    }
    public static void main(String[] args) {
        String str = "abc";
        int age = 10;
        System.out.println(isValid(str));
        System.out.println(isValid(age));
    }
}
