package B2;

import android.view.View;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.view.PreviewView;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.sumsub.sns.core.widget.SNSFlaggedInputLayout;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f282a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f283b;

    public /* synthetic */ c(Object obj, int i) {
        this.f282a = i;
        this.f283b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
        Object obj = this.f283b;
        switch (this.f282a) {
            case 0:
                CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) obj;
                carouselLayoutManager.getClass();
                if (i != i12 || i9 != i13 || i10 != i14 || i11 != i15) {
                    view.post(new d(carouselLayoutManager, 0));
                    break;
                }
            case 1:
                int i16 = PreviewView.f5807l;
                PreviewView previewView = (PreviewView) obj;
                previewView.getClass();
                if (i10 - i != i14 - i12 || i11 - i9 != i15 - i13) {
                    previewView.a();
                    Threads.checkMainThread();
                    previewView.getViewPort();
                    break;
                }
                break;
            default:
                SNSFlaggedInputLayout.m52addView$lambda2$lambda1((SNSFlaggedInputLayout) obj, view, i, i9, i10, i11, i12, i13, i14, i15);
                break;
        }
    }
}
