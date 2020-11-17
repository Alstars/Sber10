import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Metric {
    float tm = System.currentTimeMillis();

}
