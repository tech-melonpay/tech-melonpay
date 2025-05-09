package F;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.camera.core.Logger;
import androidx.camera.video.Recorder;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import k0.C0913a;
import t.C1257i;
import t.RunnableC1255g;
import y0.C1596C;
import y0.L;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1124a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f1125b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1126c;

    public /* synthetic */ b(View view) {
        this.f1124a = 1;
        this.f1126c = view;
        this.f1125b = false;
    }

    @Override // java.lang.Runnable
    public final void run() {
        L h9;
        switch (this.f1124a) {
            case 0:
                Recorder recorder = Recorder.this;
                boolean z10 = recorder.V;
                boolean z11 = this.f1125b;
                if (z10 == z11) {
                    Logger.w("Recorder", "Audio source silenced transitions to the same state " + z11);
                    break;
                } else {
                    recorder.V = z11;
                    recorder.H();
                    break;
                }
            case 1:
                boolean z12 = this.f1125b;
                View view = (View) this.f1126c;
                if (z12 && (h9 = C1596C.h(view)) != null) {
                    h9.f31039a.f(8);
                    break;
                } else {
                    ((InputMethodManager) C0913a.getSystemService(view.getContext(), InputMethodManager.class)).showSoftInput(view, 1);
                    break;
                }
                break;
            default:
                z.c cVar = (z.c) this.f1126c;
                boolean z13 = cVar.f31204a;
                boolean z14 = this.f1125b;
                if (z13 != z14) {
                    cVar.f31204a = z14;
                    if (!z14) {
                        CallbackToFutureAdapter.a<Void> aVar = cVar.f31210g;
                        if (aVar != null) {
                            s3.b.v("The camera control has became inactive.", aVar);
                            cVar.f31210g = null;
                            break;
                        }
                    } else if (cVar.f31205b) {
                        C1257i c1257i = cVar.f31206c;
                        c1257i.getClass();
                        c1257i.f27245b.execute(new RunnableC1255g(c1257i, 1));
                        cVar.f31205b = false;
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ b(boolean z10, int i, Object obj) {
        this.f1124a = i;
        this.f1126c = obj;
        this.f1125b = z10;
    }
}
