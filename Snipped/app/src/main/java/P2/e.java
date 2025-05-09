package P2;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* compiled from: TextAppearance.java */
/* loaded from: classes.dex */
public final class e extends Ha.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f3067a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextPaint f3068b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ha.c f3069c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f3070d;

    public e(d dVar, Context context, TextPaint textPaint, Ha.c cVar) {
        this.f3070d = dVar;
        this.f3067a = context;
        this.f3068b = textPaint;
        this.f3069c = cVar;
    }

    @Override // Ha.c
    public final void I(int i) {
        this.f3069c.I(i);
    }

    @Override // Ha.c
    public final void J(Typeface typeface, boolean z10) {
        this.f3070d.g(this.f3067a, this.f3068b, typeface);
        this.f3069c.J(typeface, z10);
    }
}
