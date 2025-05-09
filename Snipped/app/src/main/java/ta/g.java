package ta;

import g9.C0771a;

/* compiled from: Composers.kt */
/* loaded from: classes2.dex */
public final class g extends C0771a {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f29985c;

    public g(Na.a aVar, boolean z10) {
        super(aVar);
        this.f29985c = z10;
    }

    @Override // g9.C0771a
    public final void e(byte b9) {
        if (this.f29985c) {
            k(String.valueOf(b9 & 255));
        } else {
            i(String.valueOf(b9 & 255));
        }
    }

    @Override // g9.C0771a
    public final void g(int i) {
        boolean z10 = this.f29985c;
        String unsignedString = Integer.toUnsignedString(i);
        if (z10) {
            k(unsignedString);
        } else {
            i(unsignedString);
        }
    }

    @Override // g9.C0771a
    public final void h(long j10) {
        boolean z10 = this.f29985c;
        String unsignedString = Long.toUnsignedString(j10);
        if (z10) {
            k(unsignedString);
        } else {
            i(unsignedString);
        }
    }

    @Override // g9.C0771a
    public final void j(short s10) {
        if (this.f29985c) {
            k(String.valueOf(s10 & 65535));
        } else {
            i(String.valueOf(s10 & 65535));
        }
    }
}
