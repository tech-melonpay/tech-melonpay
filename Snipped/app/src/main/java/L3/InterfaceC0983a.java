package l3;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: JsonAdapter.java */
@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: l3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public @interface InterfaceC0983a {
    boolean nullSafe() default true;

    Class<?> value();
}
