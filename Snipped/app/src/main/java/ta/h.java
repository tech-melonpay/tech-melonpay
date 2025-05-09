package ta;

import g9.C0771a;
import sa.AbstractC1244a;

/* compiled from: Composers.kt */
/* loaded from: classes2.dex */
public final class h extends C0771a {

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1244a f29986c;

    /* renamed from: d, reason: collision with root package name */
    public int f29987d;

    public h(Na.a aVar, AbstractC1244a abstractC1244a) {
        super(aVar);
        this.f29986c = abstractC1244a;
    }

    @Override // g9.C0771a
    public final void b() {
        this.f20837a = true;
        this.f29987d++;
    }

    @Override // g9.C0771a
    public final void c() {
        this.f20837a = false;
        i("\n");
        int i = this.f29987d;
        for (int i9 = 0; i9 < i; i9++) {
            i(this.f29986c.f27065a.f27095g);
        }
    }

    @Override // g9.C0771a
    public final void d() {
        if (this.f20837a) {
            this.f20837a = false;
        } else {
            c();
        }
    }

    @Override // g9.C0771a
    public final void n() {
        f(' ');
    }

    @Override // g9.C0771a
    public final void o() {
        this.f29987d--;
    }
}
