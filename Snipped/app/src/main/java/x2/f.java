package X2;

import T2.f;
import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: CutoutDrawable.java */
/* loaded from: classes.dex */
public class f extends T2.f {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f3962z = 0;

    /* renamed from: y, reason: collision with root package name */
    public a f3963y;

    /* compiled from: CutoutDrawable.java */
    @TargetApi(18)
    public static class b extends f {
        @Override // T2.f
        public final void g(Canvas canvas) {
            if (this.f3963y.f3964v.isEmpty()) {
                super.g(canvas);
                return;
            }
            canvas.save();
            canvas.clipOutRect(this.f3963y.f3964v);
            super.g(canvas);
            canvas.restore();
        }
    }

    public f(a aVar) {
        super(aVar);
        this.f3963y = aVar;
    }

    @Override // T2.f, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f3963y = new a(this.f3963y);
        return this;
    }

    public final void w(float f10, float f11, float f12, float f13) {
        RectF rectF = this.f3963y.f3964v;
        if (f10 == rectF.left && f11 == rectF.top && f12 == rectF.right && f13 == rectF.bottom) {
            return;
        }
        rectF.set(f10, f11, f12, f13);
        invalidateSelf();
    }

    /* compiled from: CutoutDrawable.java */
    public static final class a extends f.b {

        /* renamed from: v, reason: collision with root package name */
        public final RectF f3964v;

        public a(T2.i iVar, RectF rectF) {
            super(iVar);
            this.f3964v = rectF;
        }

        @Override // T2.f.b, android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            b bVar = new b(this);
            bVar.invalidateSelf();
            return bVar;
        }

        public a(a aVar) {
            super(aVar);
            this.f3964v = aVar.f3964v;
        }
    }
}
