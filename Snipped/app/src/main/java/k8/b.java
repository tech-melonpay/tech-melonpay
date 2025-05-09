package K8;

import android.view.Window;
import com.luminary.business.presentation.utils.loader.LoadingView;

/* compiled from: LoadingManagerImpl.kt */
/* loaded from: classes2.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    public LoadingView f2274a;

    @Override // K8.a
    public final void a() {
        LoadingView loadingView = this.f2274a;
        if (loadingView != null) {
            loadingView.show();
        }
    }

    @Override // K8.a
    public final void b() {
        LoadingView loadingView = this.f2274a;
        if (loadingView != null) {
            Window window = loadingView.getWindow();
            if (window != null) {
                window.setWindowAnimations(0);
            }
            loadingView.f13338b = true;
            loadingView.dismiss();
        }
    }

    @Override // K8.a
    public final void c() {
        LoadingView loadingView = this.f2274a;
        if (loadingView != null) {
            loadingView.dismiss();
        }
    }
}
