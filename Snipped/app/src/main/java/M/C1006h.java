package m;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;

/* compiled from: AppCompatCheckedTextViewHelper.java */
/* renamed from: m.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1006h {

    /* renamed from: a, reason: collision with root package name */
    public final CheckedTextView f23764a;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f23765b = null;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f23766c = null;

    /* renamed from: d, reason: collision with root package name */
    public boolean f23767d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f23768e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f23769f;

    public C1006h(CheckedTextView checkedTextView) {
        this.f23764a = checkedTextView;
    }

    public final void a() {
        CheckedTextView checkedTextView = this.f23764a;
        Drawable checkMarkDrawable = checkedTextView.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f23767d || this.f23768e) {
                Drawable mutate = checkMarkDrawable.mutate();
                if (this.f23767d) {
                    mutate.setTintList(this.f23765b);
                }
                if (this.f23768e) {
                    mutate.setTintMode(this.f23766c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(checkedTextView.getDrawableState());
                }
                checkedTextView.setCheckMarkDrawable(mutate);
            }
        }
    }
}
