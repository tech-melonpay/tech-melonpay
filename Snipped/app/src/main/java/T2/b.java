package T2;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: AdjustedCornerSize.java */
/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final c f3444a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3445b;

    public b(float f10, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f3444a;
            f10 += ((b) cVar).f3445b;
        }
        this.f3444a = cVar;
        this.f3445b = f10;
    }

    @Override // T2.c
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.f3444a.a(rectF) + this.f3445b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f3444a.equals(bVar.f3444a) && this.f3445b == bVar.f3445b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3444a, Float.valueOf(this.f3445b)});
    }
}
