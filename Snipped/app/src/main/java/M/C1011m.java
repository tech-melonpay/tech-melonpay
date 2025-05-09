package m;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import g.C0756a;

/* compiled from: AppCompatEmojiTextHelper.java */
/* renamed from: m.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1011m {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f23788a;

    /* renamed from: b, reason: collision with root package name */
    public final K0.f f23789b;

    public C1011m(TextView textView) {
        this.f23788a = textView;
        this.f23789b = new K0.f(textView);
    }

    public final void a(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f23788a.getContext().obtainStyledAttributes(attributeSet, C0756a.i, i, 0);
        try {
            boolean z10 = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            c(z10);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void b(boolean z10) {
        this.f23789b.f2228a.b(z10);
    }

    public final void c(boolean z10) {
        this.f23789b.f2228a.c(z10);
    }
}
