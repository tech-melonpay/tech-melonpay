package J2;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* compiled from: TextDrawableHelper.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    public float f2127c;

    /* renamed from: d, reason: collision with root package name */
    public float f2128d;

    /* renamed from: f, reason: collision with root package name */
    public final WeakReference<b> f2130f;

    /* renamed from: g, reason: collision with root package name */
    public P2.d f2131g;

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f2125a = new TextPaint(1);

    /* renamed from: b, reason: collision with root package name */
    public final a f2126b = new a();

    /* renamed from: e, reason: collision with root package name */
    public boolean f2129e = true;

    /* compiled from: TextDrawableHelper.java */
    public class a extends Ha.c {
        public a() {
        }

        @Override // Ha.c
        public final void I(int i) {
            f fVar = f.this;
            fVar.f2129e = true;
            b bVar = fVar.f2130f.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // Ha.c
        public final void J(Typeface typeface, boolean z10) {
            if (z10) {
                return;
            }
            f fVar = f.this;
            fVar.f2129e = true;
            b bVar = fVar.f2130f.get();
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    /* compiled from: TextDrawableHelper.java */
    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public f(b bVar) {
        this.f2130f = new WeakReference<>(null);
        this.f2130f = new WeakReference<>(bVar);
    }

    public final void a(String str) {
        TextPaint textPaint = this.f2125a;
        this.f2127c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        this.f2128d = str != null ? Math.abs(textPaint.getFontMetrics().ascent) : 0.0f;
        this.f2129e = false;
    }

    public final void b(P2.d dVar, Context context) {
        if (this.f2131g != dVar) {
            this.f2131g = dVar;
            if (dVar != null) {
                TextPaint textPaint = this.f2125a;
                a aVar = this.f2126b;
                dVar.f(context, textPaint, aVar);
                b bVar = this.f2130f.get();
                if (bVar != null) {
                    textPaint.drawableState = bVar.getState();
                }
                dVar.e(context, textPaint, aVar);
                this.f2129e = true;
            }
            b bVar2 = this.f2130f.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }
}
