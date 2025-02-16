package reflectionproblems.intermediatereflectionproblems.retrieveannotation;
import java.lang.annotation.*;
import java.lang.reflect.*;



public class RetrieveAnnotation {
    public static void main(String[] args) {

        Class<MyClass> obj = MyClass.class;

        if (obj.isAnnotationPresent(Author.class)) {
            Author author = obj.getAnnotation(Author.class);
            System.out.println("Author: " + author.name());
        } else {
            System.out.println("No @Author annotation present.");
        }
    }
}
