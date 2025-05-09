package com.sumsub.sns.core.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c.RunnableC0615f;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import y0.C1596C;
import y0.E;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 *2\u00020\u0001:\u0001*B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\fJ\r\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\fJ\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R*\u0010\"\u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u00138\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0015\"\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "LO9/p;", "onDetachedFromWindow", "()V", "layout", "Landroid/view/View;", "inflate", "(I)Landroid/view/View;", "show", "hide", "", "isHidden", "()Z", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "behavior", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroid/graphics/drawable/ColorDrawable;", "backgroundDrawable", "Landroid/graphics/drawable/ColorDrawable;", "bottomSheet", "Landroid/view/View;", "Landroid/view/ViewGroup;", FirebaseAnalytics.Param.CONTENT, "Landroid/view/ViewGroup;", "value", "dismissOnTouchOutside", "Z", "getDismissOnTouchOutside", "setDismissOnTouchOutside", "(Z)V", "Ljava/lang/Runnable;", "showCallback", "Ljava/lang/Runnable;", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SNSCommonBottomSheetView extends CoordinatorLayout {
    private final ColorDrawable backgroundDrawable;
    private BottomSheetBehavior<View> behavior;
    private final View bottomSheet;
    private final ViewGroup content;
    private boolean dismissOnTouchOutside;
    private final Runnable showCallback;

    public SNSCommonBottomSheetView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: _set_dismissOnTouchOutside_$lambda-0, reason: not valid java name */
    public static final void m39_set_dismissOnTouchOutside_$lambda0(boolean z10, SNSCommonBottomSheetView sNSCommonBottomSheetView, View view) {
        if (z10) {
            sNSCommonBottomSheetView.hide();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showCallback$lambda-1, reason: not valid java name */
    public static final void m40showCallback$lambda1(SNSCommonBottomSheetView sNSCommonBottomSheetView) {
        BottomSheetBehavior<View> bottomSheetBehavior = sNSCommonBottomSheetView.behavior;
        if (bottomSheetBehavior == null) {
            return;
        }
        bottomSheetBehavior.setState(3);
    }

    public final boolean getDismissOnTouchOutside() {
        return this.dismissOnTouchOutside;
    }

    public final void hide() {
        BottomSheetBehavior<View> bottomSheetBehavior = this.behavior;
        if (bottomSheetBehavior == null) {
            return;
        }
        bottomSheetBehavior.setState(5);
    }

    public final View inflate(int layout) {
        ViewGroup viewGroup = this.content;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        return LayoutInflater.from(getContext()).inflate(layout, this.content, true);
    }

    public final boolean isHidden() {
        BottomSheetBehavior<View> bottomSheetBehavior = this.behavior;
        return bottomSheetBehavior != null && bottomSheetBehavior.getState() == 5;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.showCallback);
    }

    public final void setDismissOnTouchOutside(boolean z10) {
        this.dismissOnTouchOutside = z10;
        setOnClickListener(new a(z10, this, 0));
    }

    public final void show() {
        setVisibility(0);
        postDelayed(this.showCallback, 250L);
    }

    public /* synthetic */ SNSCommonBottomSheetView(Context context, AttributeSet attributeSet, int i, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? R$attr.sns_BottomSheetViewStyle : i);
    }

    public SNSCommonBottomSheetView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ColorDrawable colorDrawable = new ColorDrawable(context.getResources().getColor(R.color.black));
        this.backgroundDrawable = colorDrawable;
        this.dismissOnTouchOutside = true;
        this.showCallback = new RunnableC0615f(this, 5);
        View inflate = LayoutInflater.from(context).inflate(R$layout.sns_layout_common_bottom_sheet, (ViewGroup) this, true);
        View findViewById = inflate.findViewById(R$id.sns_bottom_sheet);
        this.bottomSheet = findViewById;
        this.content = (ViewGroup) inflate.findViewById(R$id.sns_content);
        colorDrawable.setAlpha(0);
        setBackground(colorDrawable);
        BottomSheetBehavior<View> from = BottomSheetBehavior.from(findViewById);
        from.setHideable(true);
        from.setDraggable(true);
        from.setSkipCollapsed(true);
        from.addBottomSheetCallback(new BottomSheetBehavior.g() { // from class: com.sumsub.sns.core.widget.SNSCommonBottomSheetView$3$1
            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
            public void onSlide(View bottomSheet, float slideOffset) {
                ColorDrawable colorDrawable2;
                colorDrawable2 = SNSCommonBottomSheetView.this.backgroundDrawable;
                colorDrawable2.setAlpha((int) ((slideOffset + 1.0f) * 128));
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
            public void onStateChanged(View bottomSheet, int newState) {
                SNSCommonBottomSheetView.this.setVisibility(newState == 5 ? 8 : 0);
            }
        });
        this.behavior = from;
        setDismissOnTouchOutside(true);
        WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
        if (isAttachedToWindow()) {
            BottomSheetBehavior bottomSheetBehavior = this.behavior;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.setState(5);
            }
            setVisibility(8);
            return;
        }
        addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.sumsub.sns.core.widget.SNSCommonBottomSheetView$special$$inlined$doOnAttach$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                this.removeOnAttachStateChangeListener(this);
                BottomSheetBehavior bottomSheetBehavior2 = this.behavior;
                if (bottomSheetBehavior2 != null) {
                    bottomSheetBehavior2.setState(5);
                }
                this.setVisibility(8);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
            }
        });
    }
}
