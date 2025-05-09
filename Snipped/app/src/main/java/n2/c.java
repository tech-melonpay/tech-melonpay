package N2;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.luminary.mobile.R;
import t2.C1279a;

/* compiled from: BaseProgressIndicatorSpec.java */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public int f2760a;

    /* renamed from: b, reason: collision with root package name */
    public int f2761b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f2762c;

    /* renamed from: d, reason: collision with root package name */
    public int f2763d;

    /* renamed from: e, reason: collision with root package name */
    public int f2764e;

    /* renamed from: f, reason: collision with root package name */
    public int f2765f;

    /* renamed from: g, reason: collision with root package name */
    public int f2766g;

    public c(Context context, AttributeSet attributeSet, int i, int i9) {
        this.f2762c = new int[0];
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_track_thickness);
        int[] iArr = C1279a.f27487d;
        J2.i.a(context, attributeSet, i, i9);
        J2.i.b(context, attributeSet, iArr, i, i9, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i9);
        this.f2760a = P2.c.c(context, obtainStyledAttributes, 9, dimensionPixelSize);
        this.f2761b = Math.min(P2.c.c(context, obtainStyledAttributes, 8, 0), this.f2760a / 2);
        this.f2764e = obtainStyledAttributes.getInt(5, 0);
        this.f2765f = obtainStyledAttributes.getInt(1, 0);
        this.f2766g = obtainStyledAttributes.getDimensionPixelSize(3, 0);
        if (!obtainStyledAttributes.hasValue(2)) {
            this.f2762c = new int[]{D9.b.y(context, R.attr.colorPrimary, -1)};
        } else if (obtainStyledAttributes.peekValue(2).type != 1) {
            this.f2762c = new int[]{obtainStyledAttributes.getColor(2, -1)};
        } else {
            int[] intArray = context.getResources().getIntArray(obtainStyledAttributes.getResourceId(2, -1));
            this.f2762c = intArray;
            if (intArray.length == 0) {
                throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
            }
        }
        if (obtainStyledAttributes.hasValue(7)) {
            this.f2763d = obtainStyledAttributes.getColor(7, -1);
        } else {
            this.f2763d = this.f2762c[0];
            TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{android.R.attr.disabledAlpha});
            float f10 = obtainStyledAttributes2.getFloat(0, 0.2f);
            obtainStyledAttributes2.recycle();
            this.f2763d = D9.b.m(this.f2763d, (int) (f10 * 255.0f));
        }
        obtainStyledAttributes.recycle();
    }

    public void a() {
        if (this.f2766g < 0) {
            throw new IllegalArgumentException("indicatorTrackGapSize must be >= 0.");
        }
    }
}
