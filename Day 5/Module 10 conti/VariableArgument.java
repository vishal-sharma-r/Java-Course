public class VariableArgument {

    static void show(int ...x){
        for(int i: x){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        
        show(1,2,3,4,5,6,7,8,9,10,11,12);
        int a[] = {1 , 2 , 3 , 4 , 5 , 6 };

        show(a);
    }
    
}
