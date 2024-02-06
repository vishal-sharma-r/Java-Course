package Module20_Java_lang;

enum Dept {
    CS, IT, EXTC, CIVIL, PR;
    private  Dept(){
        System.out.println(this.name());
    }
}
enum Dept1{
    CS("Vishal","Ba"),IT("Dsjw","Bb");
    String name;
    String block;
    private  Dept1(String name, String block)
    {
        this.name = name;
        this.block = block;
    }
    public String getName(){
        return name;
    }
    public String getBlock(){
        return  block;
    }


}

public class EnumDemo {
    public static void main(String[] args) {
        /*
        Dept d = Dept.IT;
        System.out.println(d.ordinal());
        System.out.println(Dept.valueOf("EXTC"));
        Dept [] list = Dept.values();
        for(Dept dt: list)
        {
            System.out.print(dt + " ");
        }
        System.out.println();

         */
        Dept1 d1 = Dept1.CS;
        System.out.println(d1.getName()+ " " + d1.getBlock());

    }
}
