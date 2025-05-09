package z8;

import android.view.ViewTreeObserver;
import com.luminary.business.presentation.ui.views.tagview.TagView;

/* compiled from: TagView.java */
/* renamed from: z8.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC1653c implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TagView f31344a;

    public ViewTreeObserverOnGlobalLayoutListenerC1653c(TagView tagView) {
        this.f31344a = tagView;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        TagView tagView = this.f31344a;
        if (tagView.f13244e) {
            return;
        }
        tagView.f13244e = true;
        tagView.b();
    }
}
