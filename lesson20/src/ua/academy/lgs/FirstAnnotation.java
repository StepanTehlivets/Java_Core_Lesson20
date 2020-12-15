package ua.academy.lgs;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface FirstAnnotation {
	String value() default "My first annotation";
}
