package com.airbnb.epoxy;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.analytics.ecommerce.Promotion;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: EpoxyVisibilityItem.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\bJ%\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u001cJ'\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010 \u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b \u0010\u001cJ\u001d\u0010\"\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u0006¢\u0006\u0004\b\"\u0010#J\u0015\u0010%\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u0002¢\u0006\u0004\b%\u0010\u0018R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R$\u0010\u0003\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010,R\u0016\u0010-\u001a\u00020\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b-\u0010*R\u0016\u0010.\u001a\u00020\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b.\u0010*R\u0016\u0010/\u001a\u00020\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b/\u0010*R\u0016\u00100\u001a\u00020\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b0\u0010*R\u0016\u00101\u001a\u00020\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b1\u0010*R\u0016\u00102\u001a\u00020\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b2\u0010*R\u0016\u00103\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00105\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00104R\u0016\u00106\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00104R\u0016\u00107\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00104R\u0016\u00108\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010*R\u0018\u00109\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010;\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010:R\u0018\u0010<\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010:¨\u0006="}, d2 = {"Lcom/airbnb/epoxy/EpoxyVisibilityItem;", "", "", "adapterPosition", "<init>", "(Ljava/lang/Integer;)V", "", "isVisible", "()Z", "isInFocusVisible", "thresholdPercentage", "isPartiallyVisible", "(I)Z", "isFullyVisible", "Landroid/view/View;", Promotion.ACTION_VIEW, "Landroid/view/ViewGroup;", "parent", "detachEvent", "update", "(Landroid/view/View;Landroid/view/ViewGroup;Z)Z", "newAdapterPosition", "LO9/p;", "reset", "(I)V", "Lcom/airbnb/epoxy/EpoxyViewHolder;", "epoxyHolder", "handleVisible", "(Lcom/airbnb/epoxy/EpoxyViewHolder;Z)V", "handleFocus", "handlePartialImpressionVisible", "(Lcom/airbnb/epoxy/EpoxyViewHolder;ZI)V", "handleFullImpressionVisible", "visibilityChangedEnabled", "handleChanged", "(Lcom/airbnb/epoxy/EpoxyViewHolder;Z)Z", "offsetPosition", "shiftBy", "Landroid/graphics/Rect;", "localVisibleRect", "Landroid/graphics/Rect;", "<set-?>", "I", "getAdapterPosition", "()I", "height", "width", "visibleHeight", "visibleWidth", "viewportHeight", "viewportWidth", "partiallyVisible", "Z", "fullyVisible", "visible", "focusedVisible", "viewVisibility", "lastVisibleHeightNotified", "Ljava/lang/Integer;", "lastVisibleWidthNotified", "lastVisibilityNotified", "epoxy-adapter_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class EpoxyVisibilityItem {
    private int adapterPosition;
    private boolean focusedVisible;
    private boolean fullyVisible;
    private int height;
    private Integer lastVisibilityNotified;
    private Integer lastVisibleHeightNotified;
    private Integer lastVisibleWidthNotified;
    private final Rect localVisibleRect;
    private boolean partiallyVisible;
    private int viewVisibility;
    private int viewportHeight;
    private int viewportWidth;
    private boolean visible;
    private int visibleHeight;
    private int visibleWidth;
    private int width;

    public EpoxyVisibilityItem() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final boolean isFullyVisible() {
        return this.viewVisibility == 0 && this.visibleHeight == this.height && this.visibleWidth == this.width;
    }

    private final boolean isInFocusVisible() {
        int i = (this.viewportHeight * this.viewportWidth) / 2;
        int i9 = this.height * this.width;
        int i10 = this.visibleHeight * this.visibleWidth;
        return this.viewVisibility == 0 && (i9 < i ? i9 == i10 : i10 >= i);
    }

    private final boolean isPartiallyVisible(int thresholdPercentage) {
        if (thresholdPercentage == 0) {
            return isVisible();
        }
        return this.viewVisibility == 0 && (((float) (this.visibleHeight * this.visibleWidth)) / ((float) (this.height * this.width))) * ((float) 100) >= ((float) thresholdPercentage);
    }

    private final boolean isVisible() {
        return this.viewVisibility == 0 && this.visibleHeight > 0 && this.visibleWidth > 0;
    }

    public final int getAdapterPosition() {
        return this.adapterPosition;
    }

    public final boolean handleChanged(EpoxyViewHolder epoxyHolder, boolean visibilityChangedEnabled) {
        int i = this.visibleHeight;
        Integer num = this.lastVisibleHeightNotified;
        if (num != null && i == num.intValue()) {
            int i9 = this.visibleWidth;
            Integer num2 = this.lastVisibleWidthNotified;
            if (num2 != null && i9 == num2.intValue()) {
                int i10 = this.viewVisibility;
                Integer num3 = this.lastVisibilityNotified;
                if (num3 != null && i10 == num3.intValue()) {
                    return false;
                }
            }
        }
        if (visibilityChangedEnabled) {
            if (this.viewVisibility == 8) {
                epoxyHolder.visibilityChanged(0.0f, 0.0f, 0, 0);
            } else {
                int i11 = this.visibleHeight;
                int i12 = this.visibleWidth;
                epoxyHolder.visibilityChanged((100.0f / this.height) * i11, (100.0f / this.width) * i12, i11, i12);
            }
        }
        this.lastVisibleHeightNotified = Integer.valueOf(this.visibleHeight);
        this.lastVisibleWidthNotified = Integer.valueOf(this.visibleWidth);
        this.lastVisibilityNotified = Integer.valueOf(this.viewVisibility);
        return true;
    }

    public final void handleFocus(EpoxyViewHolder epoxyHolder, boolean detachEvent) {
        boolean z10 = this.focusedVisible;
        boolean z11 = !detachEvent && isInFocusVisible();
        this.focusedVisible = z11;
        if (z11 != z10) {
            if (z11) {
                epoxyHolder.visibilityStateChanged(2);
            } else {
                epoxyHolder.visibilityStateChanged(3);
            }
        }
    }

    public final void handleFullImpressionVisible(EpoxyViewHolder epoxyHolder, boolean detachEvent) {
        boolean z10 = this.fullyVisible;
        boolean z11 = !detachEvent && isFullyVisible();
        this.fullyVisible = z11;
        if (z11 == z10 || !z11) {
            return;
        }
        epoxyHolder.visibilityStateChanged(4);
    }

    public final void handlePartialImpressionVisible(EpoxyViewHolder epoxyHolder, boolean detachEvent, int thresholdPercentage) {
        boolean z10 = this.partiallyVisible;
        boolean z11 = !detachEvent && isPartiallyVisible(thresholdPercentage);
        this.partiallyVisible = z11;
        if (z11 != z10) {
            if (z11) {
                epoxyHolder.visibilityStateChanged(5);
            } else {
                epoxyHolder.visibilityStateChanged(6);
            }
        }
    }

    public final void handleVisible(EpoxyViewHolder epoxyHolder, boolean detachEvent) {
        boolean z10 = this.visible;
        boolean z11 = !detachEvent && isVisible();
        this.visible = z11;
        if (z11 != z10) {
            if (z11) {
                epoxyHolder.visibilityStateChanged(0);
            } else {
                epoxyHolder.visibilityStateChanged(1);
            }
        }
    }

    public final void reset(int newAdapterPosition) {
        this.fullyVisible = false;
        this.visible = false;
        this.focusedVisible = false;
        this.adapterPosition = newAdapterPosition;
        this.lastVisibleHeightNotified = null;
        this.lastVisibleWidthNotified = null;
        this.lastVisibilityNotified = null;
    }

    public final void shiftBy(int offsetPosition) {
        this.adapterPosition += offsetPosition;
    }

    public final boolean update(View view, ViewGroup parent, boolean detachEvent) {
        this.localVisibleRect.setEmpty();
        boolean z10 = view.getLocalVisibleRect(this.localVisibleRect) && !detachEvent;
        this.height = view.getHeight();
        this.width = view.getWidth();
        this.viewportHeight = parent.getHeight();
        this.viewportWidth = parent.getWidth();
        this.visibleHeight = z10 ? this.localVisibleRect.height() : 0;
        this.visibleWidth = z10 ? this.localVisibleRect.width() : 0;
        this.viewVisibility = view.getVisibility();
        return this.height > 0 && this.width > 0;
    }

    public EpoxyVisibilityItem(Integer num) {
        this.localVisibleRect = new Rect();
        this.adapterPosition = -1;
        this.viewVisibility = 8;
        if (num != null) {
            reset(num.intValue());
        }
    }

    public /* synthetic */ EpoxyVisibilityItem(Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num);
    }
}
