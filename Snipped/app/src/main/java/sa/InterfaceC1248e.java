package sa;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: JsonAnnotations.kt */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: sa.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public @interface InterfaceC1248e {
    String discriminator();
}
