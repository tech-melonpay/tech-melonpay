package U8;

import Ra.c;
import U8.g;
import U8.k;
import U8.o;
import V8.p;
import android.content.Context;
import android.widget.TextView;
import d9.C0700c;
import e9.AbstractC0727a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: MarkwonBuilderImpl.java */
/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3675a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3676b = new ArrayList(3);

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3677c;

    public f(Context context) {
        TextView.BufferType bufferType = TextView.BufferType.SPANNABLE;
        this.f3677c = true;
        this.f3675a = context;
    }

    public final h a() {
        ArrayList arrayList = this.f3676b;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No plugins were added to this builder. Use #usePlugin method to add them");
        }
        q qVar = new q(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            qVar.a((i) it.next());
        }
        ArrayList arrayList2 = qVar.f3706b;
        c.a aVar = new c.a();
        float f10 = this.f3675a.getResources().getDisplayMetrics().density;
        p.a aVar2 = new p.a();
        aVar2.f3765e = (int) ((8 * f10) + 0.5f);
        aVar2.f3761a = (int) ((24 * f10) + 0.5f);
        int i = (int) ((4 * f10) + 0.5f);
        aVar2.f3762b = i;
        int i9 = (int) ((1 * f10) + 0.5f);
        aVar2.f3763c = i9;
        aVar2.f3766f = i9;
        aVar2.f3767g = i;
        g.a aVar3 = new g.a();
        o.a aVar4 = new o.a();
        k.a aVar5 = new k.a();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            i iVar = (i) it2.next();
            iVar.configureParser(aVar);
            iVar.configureTheme(aVar2);
            iVar.configureConfiguration(aVar3);
            iVar.configureVisitor(aVar4);
            iVar.configureSpansFactory(aVar5);
        }
        V8.p pVar = new V8.p(aVar2);
        k kVar = new k(Collections.unmodifiableMap(aVar5.f3695a));
        aVar3.f3683a = pVar;
        aVar3.f3689g = kVar;
        if (aVar3.f3684b == null) {
            aVar3.f3684b = new U4.b();
        }
        if (aVar3.f3685c == null) {
            aVar3.f3685c = new U4.b();
        }
        if (aVar3.f3686d == null) {
            aVar3.f3686d = new d();
        }
        if (aVar3.f3687e == null) {
            aVar3.f3687e = new AbstractC0727a.C0394a();
        }
        if (aVar3.f3688f == null) {
            aVar3.f3688f = new C0700c();
        }
        return new h(new Ra.c(aVar), new m(aVar4, new g(aVar3)), Collections.unmodifiableList(arrayList2), this.f3677c);
    }
}
