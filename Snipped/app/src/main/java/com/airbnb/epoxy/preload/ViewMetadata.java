package com.airbnb.epoxy.preload;

import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import kotlin.Metadata;

/* compiled from: EpoxyPreloader.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/airbnb/epoxy/preload/ViewMetadata;", "", "Companion", "epoxy-adapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ViewMetadata {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: EpoxyPreloader.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/airbnb/epoxy/preload/ViewMetadata$Companion;", "", "()V", "getDefault", "Lcom/airbnb/epoxy/preload/ViewMetadata;", Promotion.ACTION_VIEW, "Landroid/view/View;", "epoxy-adapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final ViewMetadata getDefault(View view) {
            if (view instanceof ImageView) {
                return new ImageViewMetadata(((ImageView) view).getScaleType());
            }
            return null;
        }
    }
}
