package androidx.lifecycle;

import androidx.lifecycle.C0537c;
import androidx.lifecycle.Lifecycle;
import java.util.HashMap;
import java.util.List;

/* compiled from: ReflectiveGenericLifecycleObserver.java */
@Deprecated
/* loaded from: classes.dex */
public final class E implements InterfaceC0550p {

    /* renamed from: a, reason: collision with root package name */
    public final Object f6951a;

    /* renamed from: b, reason: collision with root package name */
    public final C0537c.a f6952b;

    public E(Object obj) {
        this.f6951a = obj;
        C0537c c0537c = C0537c.f7071c;
        Class<?> cls = obj.getClass();
        C0537c.a aVar = (C0537c.a) c0537c.f7072a.get(cls);
        this.f6952b = aVar == null ? c0537c.a(cls, null) : aVar;
    }

    @Override // androidx.lifecycle.InterfaceC0550p
    public final void d(r rVar, Lifecycle.Event event) {
        HashMap hashMap = this.f6952b.f7074a;
        List list = (List) hashMap.get(event);
        Object obj = this.f6951a;
        C0537c.a.a(list, rVar, event, obj);
        C0537c.a.a((List) hashMap.get(Lifecycle.Event.ON_ANY), rVar, event, obj);
    }
}
