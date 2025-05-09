package kb;

import ia.InterfaceC0835c;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: KClassExt.kt */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f23083a = new ConcurrentHashMap();

    public static final String a(InterfaceC0835c<?> interfaceC0835c) {
        ConcurrentHashMap concurrentHashMap = f23083a;
        String str = (String) concurrentHashMap.get(interfaceC0835c);
        if (str != null) {
            return str;
        }
        String name = ((kotlin.jvm.internal.a) interfaceC0835c).g().getName();
        concurrentHashMap.put(interfaceC0835c, name);
        return name;
    }
}
