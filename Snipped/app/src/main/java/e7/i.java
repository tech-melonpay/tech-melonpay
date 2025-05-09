package E7;

import android.view.View;
import android.view.ViewTreeObserver;
import com.luminary.business.presentation.ui.fragments.invoices.invoice_details.StickyHeaderLinearLayoutManager;

/* compiled from: StickyHeaderLinearLayoutManager.kt */
/* loaded from: classes2.dex */
public final class i implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f1096a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StickyHeaderLinearLayoutManager f1097b;

    public i(View view, StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager) {
        this.f1096a = view;
        this.f1097b = stickyHeaderLinearLayoutManager;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.f1096a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager = this.f1097b;
        int i = stickyHeaderLinearLayoutManager.f12318f;
        if (i != -1) {
            stickyHeaderLinearLayoutManager.scrollToPositionWithOffset(i, stickyHeaderLinearLayoutManager.f12319g);
            stickyHeaderLinearLayoutManager.f12318f = -1;
            stickyHeaderLinearLayoutManager.f12319g = Integer.MIN_VALUE;
        }
    }
}
