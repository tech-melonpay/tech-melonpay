package ia;

import java.util.List;
import java.util.Map;
import kotlin.reflect.KVisibility;

/* compiled from: KCallable.kt */
/* renamed from: ia.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC0834b<R> extends InterfaceC0833a {
    R call(Object... objArr);

    R callBy(Map<Object, ? extends Object> map);

    List<Object> getParameters();

    k getReturnType();

    List<Object> getTypeParameters();

    KVisibility getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();

    boolean isSuspend();
}
