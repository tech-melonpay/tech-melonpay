package T2;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: AbsoluteCornerSize.java */
/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final float f3443a;

    public a(float f10) {
        this.f3443a = f10;
    }

    @Override // T2.c
    public final float a(RectF rectF) {
        return this.f3443a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f3443a == ((a) obj).f3443a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f3443a)});
    }
}
