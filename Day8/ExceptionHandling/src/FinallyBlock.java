
class MyExceptionHandling extends Exception{
    public String toString(){
        return "Exception Handled by me";
    }
}

@SuppressWarnings("All")
public class FinallyBlock {
    static void vishal() throws MyExceptionHandling{
        throw new MyExceptionHandling();
    }
    public void methds1() throws  Exception{
        try{
            throw new Exception();
        }
        finally{
            System.out.println("Final msg 3");
        }
    }
    public static void main(String[] args) throws Exception {
        FinallyBlock fc = new FinallyBlock(); // if not a static methods
//        fc.methds1();
        try{
            vishal();
        }
        catch(MyExceptionHandling e)
        {
            System.out.println(e);
        }
//       try{
//           System.out.println(100/0);
//           System.out.println("FInal msg1");
//       }
//       finally {
//           System.out.println("FInal msg 2");
//       }
    }
}
