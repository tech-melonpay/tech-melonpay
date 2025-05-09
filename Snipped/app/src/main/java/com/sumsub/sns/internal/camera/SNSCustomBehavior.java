package com.sumsub.sns.internal.camera;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import ca.InterfaceC0646l;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.Metadata;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R0\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u000f\u0010\u0013\"\u0004\b\u000f\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/sumsub/sns/internal/camera/SNSCustomBehavior;", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "parent", "child", "", "layoutDirection", "", "a", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/ViewGroup;I)Z", "Lkotlin/Function1;", "Lca/l;", "()Lca/l;", "(Lca/l;)V", "expandedOffsetCallback", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SNSCustomBehavior extends BottomSheetBehavior<ViewGroup> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public InterfaceC0646l<? super CoordinatorLayout, Integer> expandedOffsetCallback;

    public SNSCustomBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean onLayoutChild(CoordinatorLayout parent, ViewGroup child, int layoutDirection) {
        InterfaceC0646l<? super CoordinatorLayout, Integer> interfaceC0646l = this.expandedOffsetCallback;
        int intValue = interfaceC0646l != null ? interfaceC0646l.invoke(parent).intValue() : 0;
        float height = ((parent.getHeight() - intValue) / 2.0f) / parent.getHeight();
        if (intValue > parent.getHeight()) {
            return super.onLayoutChild(parent, child, layoutDirection);
        }
        setExpandedOffset(intValue);
        setHalfExpandedRatio(height);
        return super.onLayoutChild(parent, child, layoutDirection);
    }
}
