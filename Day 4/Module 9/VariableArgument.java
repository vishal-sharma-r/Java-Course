public class VariableArgument {
    static void argument(int...x){
        for(int i: x){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        argument(1,2,3,4,5,6,7,8,9,10,11,12);
        int a[] = {1,2,3,4};
        argument(a);
        argument(new int[]{9,8,7,6,5,4,5});
    }
}
