package qb;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: Invocation.java */
/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final Method f25950a;

    /* renamed from: b, reason: collision with root package name */
    public final List<?> f25951b;

    public h(Method method, ArrayList arrayList) {
        this.f25950a = method;
        this.f25951b = Collections.unmodifiableList(arrayList);
    }

    public final String toString() {
        Method method = this.f25950a;
        return String.format("%s.%s() %s", method.getDeclaringClass().getName(), method.getName(), this.f25951b);
    }
}
