package br.com.intelbras.sdk.annotations;

import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Component;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE) // @Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})
@Component
public @interface MyComponent {

     @AliasFor(annotation = Component.class) // @AliasFor(annotation = Component.class, attribute = "value")
     String value();

     public boolean isActive() default true;
     public int id() default 0;
}
