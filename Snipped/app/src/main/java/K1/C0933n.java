package k1;

import java.util.ArrayList;

/* compiled from: FragmentTransitionSupport.java */
/* renamed from: k1.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0933n extends G {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f22898a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f22899b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22900c = null;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f22901d = null;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f22902e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ArrayList f22903f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0932m f22904g;

    public C0933n(C0932m c0932m, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f22904g = c0932m;
        this.f22898a = obj;
        this.f22899b = arrayList;
        this.f22902e = obj2;
        this.f22903f = arrayList2;
    }

    @Override // k1.G, k1.AbstractC0919C.g
    public final void e(AbstractC0919C abstractC0919C) {
        C0932m c0932m = this.f22904g;
        Object obj = this.f22898a;
        if (obj != null) {
            c0932m.z(obj, this.f22899b, null);
        }
        Object obj2 = this.f22900c;
        if (obj2 != null) {
            c0932m.z(obj2, this.f22901d, null);
        }
        Object obj3 = this.f22902e;
        if (obj3 != null) {
            c0932m.z(obj3, this.f22903f, null);
        }
    }

    @Override // k1.G, k1.AbstractC0919C.g
    public final void i(AbstractC0919C abstractC0919C) {
        abstractC0919C.G(this);
    }
}
