package com.airbnb.epoxy;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes.dex */
public @interface EpoxyAttribute {

    public enum Option {
        NoGetter,
        NoSetter,
        DoNotHash,
        IgnoreRequireHashCode,
        DoNotUseInToString
    }

    @Deprecated
    boolean hash() default true;

    @Deprecated
    boolean setter() default true;

    Option[] value() default {};
}
