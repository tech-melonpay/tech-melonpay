package com.airbnb.epoxy;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes.dex */
public @interface ModelView {

    public enum Size {
        NONE,
        MANUAL,
        WRAP_WIDTH_WRAP_HEIGHT,
        WRAP_WIDTH_MATCH_HEIGHT,
        MATCH_WIDTH_WRAP_HEIGHT,
        MATCH_WIDTH_MATCH_HEIGHT
    }

    Size autoLayout() default Size.NONE;

    Class<?> baseModelClass() default Void.class;

    int defaultLayout() default 0;

    boolean fullSpan() default true;

    boolean saveViewState() default false;
}
