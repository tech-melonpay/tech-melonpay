package c;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.C0552s;
import androidx.lifecycle.C0553t;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.r;
import b1.C0582b;
import b1.C0583c;
import b1.InterfaceC0584d;
import com.luminary.mobile.R;

/* compiled from: ComponentDialog.kt */
/* renamed from: c.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogC0616g extends Dialog implements r, InterfaceC0619j, InterfaceC0584d {

    /* renamed from: a, reason: collision with root package name */
    public C0553t f8498a;

    /* renamed from: b, reason: collision with root package name */
    public final C0583c f8499b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.activity.a f8500c;

    public DialogC0616g(Context context, int i) {
        super(context, i);
        this.f8499b = new C0583c(this);
        this.f8500c = new androidx.activity.a(new RunnableC0615f(this, 0));
    }

    public static void c(DialogC0616g dialogC0616g) {
        super.onBackPressed();
    }

    public void a() {
        dismiss();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        e();
        super.addContentView(view, layoutParams);
    }

    public final C0553t d() {
        C0553t c0553t = this.f8498a;
        if (c0553t != null) {
            return c0553t;
        }
        C0553t c0553t2 = new C0553t(this);
        this.f8498a = c0553t2;
        return c0553t2;
    }

    public final void e() {
        C0552s.c(getWindow().getDecorView(), this);
        getWindow().getDecorView().setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        U4.b.D(getWindow().getDecorView(), this);
    }

    @Override // androidx.lifecycle.r
    public final Lifecycle getLifecycle() {
        return d();
    }

    @Override // c.InterfaceC0619j
    public final androidx.activity.a getOnBackPressedDispatcher() {
        return this.f8500c;
    }

    @Override // b1.InterfaceC0584d
    public final C0582b getSavedStateRegistry() {
        return this.f8499b.f8286b;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f8500c.d();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            androidx.activity.a aVar = this.f8500c;
            aVar.f4560f = onBackInvokedDispatcher;
            aVar.e(aVar.f4562h);
        }
        this.f8499b.b(bundle);
        d().f(Lifecycle.Event.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        this.f8499b.c(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        d().f(Lifecycle.Event.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        d().f(Lifecycle.Event.ON_DESTROY);
        this.f8498a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        e();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        e();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        e();
        super.setContentView(view, layoutParams);
    }
}
