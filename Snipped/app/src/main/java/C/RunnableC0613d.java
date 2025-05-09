package c;

import androidx.activity.ComponentActivity;

/* compiled from: R8$$SyntheticClass */
/* renamed from: c.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0613d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8492a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ComponentActivity f8493b;

    public /* synthetic */ RunnableC0613d(ComponentActivity componentActivity, int i) {
        this.f8492a = i;
        this.f8493b = componentActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8492a) {
            case 0:
                ComponentActivity.menuHostHelper$lambda$0(this.f8493b);
                return;
            default:
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e10) {
                    if (!kotlin.jvm.internal.f.b(e10.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e10;
                    }
                    return;
                } catch (NullPointerException e11) {
                    if (!kotlin.jvm.internal.f.b(e11.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e11;
                    }
                    return;
                }
        }
    }
}
