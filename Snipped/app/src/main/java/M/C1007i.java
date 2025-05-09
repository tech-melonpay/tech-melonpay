package m;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;

/* compiled from: AppCompatCompoundButtonHelper.java */
/* renamed from: m.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1007i {

    /* renamed from: a, reason: collision with root package name */
    public final CompoundButton f23770a;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f23771b = null;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f23772c = null;

    /* renamed from: d, reason: collision with root package name */
    public boolean f23773d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f23774e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f23775f;

    public C1007i(CompoundButton compoundButton) {
        this.f23770a = compoundButton;
    }

    public final void a() {
        CompoundButton compoundButton = this.f23770a;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.f23773d || this.f23774e) {
                Drawable mutate = buttonDrawable.mutate();
                if (this.f23773d) {
                    mutate.setTintList(this.f23771b);
                }
                if (this.f23774e) {
                    mutate.setTintMode(this.f23772c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(mutate);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0054 A[Catch: all -> 0x0034, TryCatch #1 {all -> 0x0034, blocks: (B:3:0x001c, B:5:0x0022, B:8:0x0028, B:9:0x004d, B:11:0x0054, B:12:0x005b, B:14:0x0062, B:21:0x0036, B:23:0x003c, B:25:0x0042), top: B:2:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062 A[Catch: all -> 0x0034, TRY_LEAVE, TryCatch #1 {all -> 0x0034, blocks: (B:3:0x001c, B:5:0x0022, B:8:0x0028, B:9:0x004d, B:11:0x0054, B:12:0x005b, B:14:0x0062, B:21:0x0036, B:23:0x003c, B:25:0x0042), top: B:2:0x001c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(android.util.AttributeSet r11, int r12) {
        /*
            r10 = this;
            android.widget.CompoundButton r6 = r10.f23770a
            android.content.Context r0 = r6.getContext()
            int[] r2 = g.C0756a.f20740m
            r7 = 0
            m.Z r8 = m.Z.f(r0, r11, r2, r12, r7)
            android.content.res.TypedArray r9 = r8.f23728b
            android.content.Context r1 = r6.getContext()
            android.content.res.TypedArray r4 = r8.f23728b
            r0 = r6
            r3 = r11
            r5 = r12
            y0.C1596C.n(r0, r1, r2, r3, r4, r5)
            r11 = 1
            boolean r12 = r9.hasValue(r11)     // Catch: java.lang.Throwable -> L34
            if (r12 == 0) goto L36
            int r11 = r9.getResourceId(r11, r7)     // Catch: java.lang.Throwable -> L34
            if (r11 == 0) goto L36
            android.content.Context r12 = r6.getContext()     // Catch: java.lang.Throwable -> L34 android.content.res.Resources.NotFoundException -> L36
            android.graphics.drawable.Drawable r11 = U4.b.j(r12, r11)     // Catch: java.lang.Throwable -> L34 android.content.res.Resources.NotFoundException -> L36
            r6.setButtonDrawable(r11)     // Catch: java.lang.Throwable -> L34 android.content.res.Resources.NotFoundException -> L36
            goto L4d
        L34:
            r11 = move-exception
            goto L73
        L36:
            boolean r11 = r9.hasValue(r7)     // Catch: java.lang.Throwable -> L34
            if (r11 == 0) goto L4d
            int r11 = r9.getResourceId(r7, r7)     // Catch: java.lang.Throwable -> L34
            if (r11 == 0) goto L4d
            android.content.Context r12 = r6.getContext()     // Catch: java.lang.Throwable -> L34
            android.graphics.drawable.Drawable r11 = U4.b.j(r12, r11)     // Catch: java.lang.Throwable -> L34
            r6.setButtonDrawable(r11)     // Catch: java.lang.Throwable -> L34
        L4d:
            r11 = 2
            boolean r12 = r9.hasValue(r11)     // Catch: java.lang.Throwable -> L34
            if (r12 == 0) goto L5b
            android.content.res.ColorStateList r11 = r8.a(r11)     // Catch: java.lang.Throwable -> L34
            r6.setButtonTintList(r11)     // Catch: java.lang.Throwable -> L34
        L5b:
            r11 = 3
            boolean r12 = r9.hasValue(r11)     // Catch: java.lang.Throwable -> L34
            if (r12 == 0) goto L6f
            r12 = -1
            int r11 = r9.getInt(r11, r12)     // Catch: java.lang.Throwable -> L34
            r12 = 0
            android.graphics.PorterDuff$Mode r11 = m.C0996F.b(r11, r12)     // Catch: java.lang.Throwable -> L34
            r6.setButtonTintMode(r11)     // Catch: java.lang.Throwable -> L34
        L6f:
            r8.g()
            return
        L73:
            r8.g()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: m.C1007i.b(android.util.AttributeSet, int):void");
    }
}
