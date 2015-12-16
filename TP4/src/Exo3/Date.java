package Exo3;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by olivier on 03/11/2015.
 */

@Retention(RetentionPolicy.RUNTIME)
public @interface Date {
    int value();
}
