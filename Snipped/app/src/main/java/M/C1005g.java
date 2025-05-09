package m;

import B0.d;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;

/* compiled from: AppCompatCheckedTextView.java */
/* renamed from: m.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1005g extends CheckedTextView {

    /* renamed from: a, reason: collision with root package name */
    public final C1006h f23760a;

    /* renamed from: b, reason: collision with root package name */
    public final C1002d f23761b;

    /* renamed from: c, reason: collision with root package name */
    public final C1022y f23762c;

    /* renamed from: d, reason: collision with root package name */
    public C1011m f23763d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0080 A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:3:0x0048, B:5:0x004e, B:8:0x0054, B:9:0x0079, B:11:0x0080, B:12:0x0087, B:14:0x008e, B:21:0x0062, B:23:0x0068, B:25:0x006e), top: B:2:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008e A[Catch: all -> 0x0060, TRY_LEAVE, TryCatch #0 {all -> 0x0060, blocks: (B:3:0x0048, B:5:0x004e, B:8:0x0054, B:9:0x0079, B:11:0x0080, B:12:0x0087, B:14:0x008e, B:21:0x0062, B:23:0x0068, B:25:0x006e), top: B:2:0x0048 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1005g(android.content.Context r10, android.util.AttributeSet r11) {
        /*
            r9 = this;
            m.W.a(r10)
            r6 = 2130968822(0x7f0400f6, float:1.7546308E38)
            r9.<init>(r10, r11, r6)
            android.content.Context r10 = r9.getContext()
            m.U.a(r9, r10)
            m.y r10 = new m.y
            r10.<init>(r9)
            r9.f23762c = r10
            r10.f(r11, r6)
            r10.b()
            m.d r10 = new m.d
            r10.<init>(r9)
            r9.f23761b = r10
            r10.d(r11, r6)
            m.h r10 = new m.h
            r10.<init>(r9)
            r9.f23760a = r10
            android.content.Context r10 = r9.getContext()
            int[] r2 = g.C0756a.f20739l
            r7 = 0
            m.Z r10 = m.Z.f(r10, r11, r2, r6, r7)
            android.content.res.TypedArray r8 = r10.f23728b
            android.content.Context r1 = r9.getContext()
            android.content.res.TypedArray r4 = r10.f23728b
            r0 = r9
            r3 = r11
            r5 = r6
            y0.C1596C.n(r0, r1, r2, r3, r4, r5)
            r0 = 1
            boolean r1 = r8.hasValue(r0)     // Catch: java.lang.Throwable -> L60
            if (r1 == 0) goto L62
            int r0 = r8.getResourceId(r0, r7)     // Catch: java.lang.Throwable -> L60
            if (r0 == 0) goto L62
            android.content.Context r1 = r9.getContext()     // Catch: java.lang.Throwable -> L60 android.content.res.Resources.NotFoundException -> L62
            android.graphics.drawable.Drawable r0 = U4.b.j(r1, r0)     // Catch: java.lang.Throwable -> L60 android.content.res.Resources.NotFoundException -> L62
            r9.setCheckMarkDrawable(r0)     // Catch: java.lang.Throwable -> L60 android.content.res.Resources.NotFoundException -> L62
            goto L79
        L60:
            r11 = move-exception
            goto La6
        L62:
            boolean r0 = r8.hasValue(r7)     // Catch: java.lang.Throwable -> L60
            if (r0 == 0) goto L79
            int r0 = r8.getResourceId(r7, r7)     // Catch: java.lang.Throwable -> L60
            if (r0 == 0) goto L79
            android.content.Context r1 = r9.getContext()     // Catch: java.lang.Throwable -> L60
            android.graphics.drawable.Drawable r0 = U4.b.j(r1, r0)     // Catch: java.lang.Throwable -> L60
            r9.setCheckMarkDrawable(r0)     // Catch: java.lang.Throwable -> L60
        L79:
            r0 = 2
            boolean r1 = r8.hasValue(r0)     // Catch: java.lang.Throwable -> L60
            if (r1 == 0) goto L87
            android.content.res.ColorStateList r0 = r10.a(r0)     // Catch: java.lang.Throwable -> L60
            r9.setCheckMarkTintList(r0)     // Catch: java.lang.Throwable -> L60
        L87:
            r0 = 3
            boolean r1 = r8.hasValue(r0)     // Catch: java.lang.Throwable -> L60
            if (r1 == 0) goto L9b
            r1 = -1
            int r0 = r8.getInt(r0, r1)     // Catch: java.lang.Throwable -> L60
            r1 = 0
            android.graphics.PorterDuff$Mode r0 = m.C0996F.b(r0, r1)     // Catch: java.lang.Throwable -> L60
            r9.setCheckMarkTintMode(r0)     // Catch: java.lang.Throwable -> L60
        L9b:
            r10.g()
            m.m r10 = r9.getEmojiTextViewHelper()
            r10.a(r11, r6)
            return
        La6:
            r10.g()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: m.C1005g.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private C1011m getEmojiTextViewHelper() {
        if (this.f23763d == null) {
            this.f23763d = new C1011m(this);
        }
        return this.f23763d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1022y c1022y = this.f23762c;
        if (c1022y != null) {
            c1022y.b();
        }
        C1002d c1002d = this.f23761b;
        if (c1002d != null) {
            c1002d.a();
        }
        C1006h c1006h = this.f23760a;
        if (c1006h != null) {
            c1006h.a();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof d.c ? ((d.c) customSelectionActionModeCallback).f215a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1002d c1002d = this.f23761b;
        if (c1002d != null) {
            return c1002d.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1002d c1002d = this.f23761b;
        if (c1002d != null) {
            return c1002d.c();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C1006h c1006h = this.f23760a;
        if (c1006h != null) {
            return c1006h.f23765b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C1006h c1006h = this.f23760a;
        if (c1006h != null) {
            return c1006h.f23766c;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f23762c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f23762c.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        j3.e.x(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().b(z10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1002d c1002d = this.f23761b;
        if (c1002d != null) {
            c1002d.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1002d c1002d = this.f23761b;
        if (c1002d != null) {
            c1002d.f(i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C1006h c1006h = this.f23760a;
        if (c1006h != null) {
            if (c1006h.f23769f) {
                c1006h.f23769f = false;
            } else {
                c1006h.f23769f = true;
                c1006h.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1022y c1022y = this.f23762c;
        if (c1022y != null) {
            c1022y.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1022y c1022y = this.f23762c;
        if (c1022y != null) {
            c1022y.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(B0.d.f(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().c(z10);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1002d c1002d = this.f23761b;
        if (c1002d != null) {
            c1002d.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1002d c1002d = this.f23761b;
        if (c1002d != null) {
            c1002d.i(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C1006h c1006h = this.f23760a;
        if (c1006h != null) {
            c1006h.f23765b = colorStateList;
            c1006h.f23767d = true;
            c1006h.a();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C1006h c1006h = this.f23760a;
        if (c1006h != null) {
            c1006h.f23766c = mode;
            c1006h.f23768e = true;
            c1006h.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C1022y c1022y = this.f23762c;
        c1022y.k(colorStateList);
        c1022y.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C1022y c1022y = this.f23762c;
        c1022y.l(mode);
        c1022y.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1022y c1022y = this.f23762c;
        if (c1022y != null) {
            c1022y.g(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(U4.b.j(getContext(), i));
    }
}
