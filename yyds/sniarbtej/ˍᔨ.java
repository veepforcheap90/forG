package yyds.sniarbtej;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface ˍᔨ {
  String ʾ();
  
  String[] ˊ() default {};
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ˍᔨ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */