package T2;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: RelativeCornerSize.java */
/* loaded from: classes.dex */
public final class g implements c {

    /* renamed from: a, reason: collision with root package name */
    public final float f3491a;

    public g(float f10) {
        this.f3491a = f10;
    }

    @Override // T2.c
    public final float a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f3491a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.f3491a == ((g) obj).f3491a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f3491a)});
    }
}
