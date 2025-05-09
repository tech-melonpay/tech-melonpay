package Ra;

import B1.f;
import Na.h;
import Na.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: Parser.java */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f3320a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3321b;

    /* renamed from: c, reason: collision with root package name */
    public final b f3322c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f3323d;

    /* compiled from: Parser.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f3324a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f3325b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f3326c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        public final LinkedHashSet f3327d = h.f2884p;
    }

    public c(a aVar) {
        ArrayList arrayList = aVar.f3324a;
        LinkedHashSet linkedHashSet = aVar.f3327d;
        LinkedHashSet linkedHashSet2 = h.f2884p;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(arrayList);
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList2.add(h.f2885q.get((Class) it.next()));
        }
        this.f3320a = arrayList2;
        this.f3322c = new b();
        this.f3323d = aVar.f3326c;
        ArrayList arrayList3 = aVar.f3325b;
        this.f3321b = arrayList3;
        new m(new f(6, arrayList3, Collections.emptyMap()));
    }
}
