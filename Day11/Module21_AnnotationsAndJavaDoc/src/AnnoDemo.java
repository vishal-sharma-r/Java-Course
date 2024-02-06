import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
@SuppressWarnings("all")
@Documented // Available in javaDoc documentation

@Retention(RetentionPolicy.CLASS)
// if we compile this annotation will
// available in the class file also.

//@Target(value = ElementType.____)
// available to only these methods.

//    @Repeatable(MyAnno.class)
        // But for that the method should be public
        // i.e public @interface MyAnno{}
@interface MyAnno {
    String name();

    String version();

    String date() default "today";
}
@SuppressWarnings("all")
@MyAnno(name = "Vishal", version = "1.0")
public class AnnoDemo {
    @MyAnno(name = "Vishal", version = "1.0")
    static int z = 10;

    public static void main(@MyAnno(name = "Vishal", version = "1.0") String[] args) {
        @MyAnno(name = "Vishal", version = "1.0")
        int x = 10;
    }
}

/*
 *
 * inbuilt annotations
 * @Retention(RetentionPolicy.___)
 * @Documented
 * @Target(value = ElementType.___)
 * @Inherited  -- available for all the inherited classes
 * @Repeatable(Annotation_interface.___) --same as SuppressWarning
 */

