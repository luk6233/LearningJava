package Alishev.src.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(/*{*/ElementType.METHOD/*, ElementType.TYPE}*/)
@Retention(RetentionPolicy.RUNTIME)
public @interface MethodInfo {
    String author() default "Luk";
    int dateOfCraation() default 2019;
    String purpose();
}
