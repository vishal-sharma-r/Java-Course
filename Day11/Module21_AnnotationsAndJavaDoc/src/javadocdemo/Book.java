/**
 * @author Vishal
 * @version 1.0
 * @since 2024
 */
package javadocdemo;

public class Book {
    /**
     * @value 10 default value
     */
    static int value = 10;

    /**
     * parameterized constructor
     * @param b is  book name
     */
    public Book(String b) {

    }

    /**
     * @param rollno  - rollno of Student
     * @throws Exception when no book is available
     */
    public void issue (int rollno) throws  Exception{

    }

    /**
     *
     * @param s is th book we have to check
     * @return true if book is available
     */
    public boolean check(String s)
    {
        return true;
    }

}
