package ta;

import g9.C0771a;

/* compiled from: Composers.kt */
/* loaded from: classes2.dex */
public final class f extends C0771a {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f29984c;

    public f(Na.a aVar, boolean z10) {
        super(aVar);
        this.f29984c = z10;
    }

    @Override // g9.C0771a
    public final void k(String str) {
        if (this.f29984c) {
            super.k(str);
        } else {
            i(str);
        }
    }
}
