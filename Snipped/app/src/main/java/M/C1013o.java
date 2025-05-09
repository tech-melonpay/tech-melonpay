package m;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import g.C0756a;
import y0.C1596C;

/* compiled from: AppCompatImageHelper.java */
/* renamed from: m.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1013o {

    /* renamed from: a, reason: collision with root package name */
    public final ImageView f23790a;

    /* renamed from: b, reason: collision with root package name */
    public X f23791b;

    /* renamed from: c, reason: collision with root package name */
    public int f23792c = 0;

    public C1013o(ImageView imageView) {
        this.f23790a = imageView;
    }

    public final void a() {
        X x9;
        ImageView imageView = this.f23790a;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            C0996F.a(drawable);
        }
        if (drawable == null || (x9 = this.f23791b) == null) {
            return;
        }
        C1008j.e(drawable, x9, imageView.getDrawableState());
    }

    public final void b(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = this.f23790a;
        Context context = imageView.getContext();
        int[] iArr = C0756a.f20734f;
        Z f10 = Z.f(context, attributeSet, iArr, i, 0);
        C1596C.n(imageView, imageView.getContext(), iArr, attributeSet, f10.f23728b, i);
        try {
            Drawable drawable = imageView.getDrawable();
            TypedArray typedArray = f10.f23728b;
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = U4.b.j(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                C0996F.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(f10.a(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(C0996F.b(typedArray.getInt(3, -1), null));
            }
            f10.g();
        } catch (Throwable th) {
            f10.g();
            throw th;
        }
    }
}
