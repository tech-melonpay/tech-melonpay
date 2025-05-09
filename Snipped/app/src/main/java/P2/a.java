package P2;

import android.graphics.Typeface;

/* compiled from: CancelableFontCallback.java */
/* loaded from: classes.dex */
public final class a extends Ha.c {

    /* renamed from: a, reason: collision with root package name */
    public final Typeface f3049a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0036a f3050b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3051c;

    /* compiled from: CancelableFontCallback.java */
    /* renamed from: P2.a$a, reason: collision with other inner class name */
    public interface InterfaceC0036a {
        void a(Typeface typeface);
    }

    public a(InterfaceC0036a interfaceC0036a, Typeface typeface) {
        this.f3049a = typeface;
        this.f3050b = interfaceC0036a;
    }

    @Override // Ha.c
    public final void I(int i) {
        if (this.f3051c) {
            return;
        }
        this.f3050b.a(this.f3049a);
    }

    @Override // Ha.c
    public final void J(Typeface typeface, boolean z10) {
        if (this.f3051c) {
            return;
        }
        this.f3050b.a(typeface);
    }
}
