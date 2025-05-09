package fb;

import db.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.UUID;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.instance.SingleInstanceFactory;

/* compiled from: Module.kt */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f20722a;

    /* renamed from: b, reason: collision with root package name */
    public final String f20723b;

    /* renamed from: c, reason: collision with root package name */
    public final HashSet<SingleInstanceFactory<?>> f20724c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap<String, b<?>> f20725d;

    /* renamed from: e, reason: collision with root package name */
    public final HashSet<hb.a> f20726e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f20727f;

    public a(boolean z10) {
        this.f20722a = z10;
        this.f20723b = UUID.randomUUID().toString();
        this.f20724c = new HashSet<>();
        this.f20725d = new HashMap<>();
        this.f20726e = new HashSet<>();
        this.f20727f = new ArrayList();
    }

    public final void a(b<?> bVar) {
        BeanDefinition<?> beanDefinition = bVar.f20487a;
        String o10 = U4.b.o(beanDefinition.f25542b, beanDefinition.f25543c, beanDefinition.f25541a);
        HashMap<String, b<?>> hashMap = this.f20725d;
        if (hashMap.containsKey(o10)) {
            U4.b.s(bVar, o10);
            throw null;
        }
        hashMap.put(o10, bVar);
    }

    public final void b(SingleInstanceFactory<?> singleInstanceFactory) {
        this.f20724c.add(singleInstanceFactory);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && f.b(h.a(a.class), h.a(obj.getClass())) && f.b(this.f20723b, ((a) obj).f20723b);
    }

    public final int hashCode() {
        return this.f20723b.hashCode();
    }

    public a() {
        this(false);
    }
}
