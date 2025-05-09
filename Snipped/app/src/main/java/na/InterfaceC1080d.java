package na;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: Annotations.kt */
@Target({ElementType.TYPE, ElementType.TYPE_USE})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: na.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public @interface InterfaceC1080d {
    Class<? extends InterfaceC1078b<?>> with() default InterfaceC1078b.class;
}
