package classes;

import java.lang.annotation.*;

@Documented
@Target({ElementType.FIELD, ElementType.LOCAL_VARIABLE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Romch{
}