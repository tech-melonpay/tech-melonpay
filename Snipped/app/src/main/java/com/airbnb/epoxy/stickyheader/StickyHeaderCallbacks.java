package com.airbnb.epoxy.stickyheader;

import android.view.View;
import kotlin.Metadata;

/* compiled from: StickyHeaderCallbacks.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/airbnb/epoxy/stickyheader/StickyHeaderCallbacks;", "", "", "position", "", "isStickyHeader", "(I)Z", "Landroid/view/View;", "stickyHeader", "LO9/p;", "setupStickyHeaderView", "(Landroid/view/View;)V", "teardownStickyHeaderView", "epoxy-adapter_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public interface StickyHeaderCallbacks {
    boolean isStickyHeader(int position);

    void setupStickyHeaderView(View stickyHeader);

    void teardownStickyHeaderView(View stickyHeader);

    /* compiled from: StickyHeaderCallbacks.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void setupStickyHeaderView(StickyHeaderCallbacks stickyHeaderCallbacks, View view) {
        }

        public static void teardownStickyHeaderView(StickyHeaderCallbacks stickyHeaderCallbacks, View view) {
        }
    }
}
