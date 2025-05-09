package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import k0.C0913a;
import m.C1022y;

/* compiled from: TintTypedArray.java */
/* loaded from: classes.dex */
public final class Z {

    /* renamed from: a, reason: collision with root package name */
    public final Context f23727a;

    /* renamed from: b, reason: collision with root package name */
    public final TypedArray f23728b;

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f23729c;

    public Z(Context context, TypedArray typedArray) {
        this.f23727a = context;
        this.f23728b = typedArray;
    }

    public static Z e(Context context, AttributeSet attributeSet, int[] iArr) {
        return new Z(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static Z f(Context context, AttributeSet attributeSet, int[] iArr, int i, int i9) {
        return new Z(context, context.obtainStyledAttributes(attributeSet, iArr, i, i9));
    }

    public final ColorStateList a(int i) {
        int resourceId;
        ColorStateList colorStateList;
        TypedArray typedArray = this.f23728b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateList = C0913a.getColorStateList(this.f23727a, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateList;
    }

    public final Drawable b(int i) {
        int resourceId;
        TypedArray typedArray = this.f23728b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : U4.b.j(this.f23727a, resourceId);
    }

    public final Drawable c(int i) {
        int resourceId;
        Drawable f10;
        if (!this.f23728b.hasValue(i) || (resourceId = this.f23728b.getResourceId(i, 0)) == 0) {
            return null;
        }
        C1008j a10 = C1008j.a();
        Context context = this.f23727a;
        synchronized (a10) {
            f10 = a10.f23778a.f(context, resourceId, true);
        }
        return f10;
    }

    public final Typeface d(int i, int i9, C1022y.a aVar) {
        int resourceId = this.f23728b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f23729c == null) {
            this.f23729c = new TypedValue();
        }
        TypedValue typedValue = this.f23729c;
        ThreadLocal<TypedValue> threadLocal = m0.f.f23858a;
        Context context = this.f23727a;
        if (context.isRestricted()) {
            return null;
        }
        return m0.f.b(context, resourceId, typedValue, i9, aVar, true, false);
    }

    public final void g() {
        this.f23728b.recycle();
    }
}
