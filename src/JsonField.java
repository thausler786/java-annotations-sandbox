import java.lang.annotation.*;
  
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface JsonField {
  public String value() default "";
}
