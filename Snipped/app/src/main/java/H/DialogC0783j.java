package h;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C0552s;
import c.DialogC0616g;
import com.luminary.mobile.R;
import h.AbstractC0777d;
import k.AbstractC0912a;
import y0.C1603g;

/* compiled from: AppCompatDialog.java */
/* renamed from: h.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogC0783j extends DialogC0616g implements InterfaceC0776c {

    /* renamed from: d, reason: collision with root package name */
    public LayoutInflaterFactory2C0778e f20945d;

    /* renamed from: e, reason: collision with root package name */
    public final C0782i f20946e;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v2, types: [h.i] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public DialogC0783j(android.content.Context r5, int r6) {
        /*
            r4 = this;
            r0 = 1
            r1 = 2130969022(0x7f0401be, float:1.7546714E38)
            if (r6 != 0) goto L15
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r3 = r5.getTheme()
            r3.resolveAttribute(r1, r2, r0)
            int r2 = r2.resourceId
            goto L16
        L15:
            r2 = r6
        L16:
            r4.<init>(r5, r2)
            h.i r2 = new h.i
            r2.<init>()
            r4.f20946e = r2
            h.d r2 = r4.f()
            if (r6 != 0) goto L34
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.res.Resources$Theme r5 = r5.getTheme()
            r5.resolveAttribute(r1, r6, r0)
            int r6 = r6.resourceId
        L34:
            r5 = r2
            h.e r5 = (h.LayoutInflaterFactory2C0778e) r5
            r5.U = r6
            r2.n()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.DialogC0783j.<init>(android.content.Context, int):void");
    }

    @Override // c.DialogC0616g, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        f().c(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        f().o();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C1603g.b(this.f20946e, getWindow().getDecorView(), this, keyEvent);
    }

    public final AbstractC0777d f() {
        if (this.f20945d == null) {
            AbstractC0777d.c cVar = AbstractC0777d.f20849a;
            this.f20945d = new LayoutInflaterFactory2C0778e(getContext(), getWindow(), this, this);
        }
        return this.f20945d;
    }

    @Override // android.app.Dialog
    public final <T extends View> T findViewById(int i) {
        return (T) f().e(i);
    }

    public final void g() {
        C0552s.c(getWindow().getDecorView(), this);
        U4.b.D(getWindow().getDecorView(), this);
        getWindow().getDecorView().setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
    }

    public final boolean h(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        f().k();
    }

    @Override // c.DialogC0616g, android.app.Dialog
    public void onCreate(Bundle bundle) {
        f().j();
        super.onCreate(bundle);
        f().n();
    }

    @Override // c.DialogC0616g, android.app.Dialog
    public void onStop() {
        super.onStop();
        f().s();
    }

    @Override // h.InterfaceC0776c
    public final AbstractC0912a onWindowStartingSupportActionMode(AbstractC0912a.InterfaceC0418a interfaceC0418a) {
        return null;
    }

    @Override // c.DialogC0616g, android.app.Dialog
    public void setContentView(int i) {
        g();
        f().v(i);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        f().A(charSequence);
    }

    @Override // c.DialogC0616g, android.app.Dialog
    public void setContentView(View view) {
        g();
        f().w(view);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        f().A(getContext().getString(i));
    }

    @Override // c.DialogC0616g, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        g();
        f().x(view, layoutParams);
    }

    @Override // h.InterfaceC0776c
    public final void onSupportActionModeFinished(AbstractC0912a abstractC0912a) {
    }

    @Override // h.InterfaceC0776c
    public final void onSupportActionModeStarted(AbstractC0912a abstractC0912a) {
    }
}
