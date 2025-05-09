package com.sumsub.sns.core.widget;

import O9.p;
import android.R;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c.RunnableC0615f;
import ca.InterfaceC0635a;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.core.data.listener.SNSIconHandler;
import com.sumsub.sns.internal.core.common.e0;
import com.sumsub.sns.internal.core.common.i;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.bouncycastle.i18n.TextBundle;
import y0.C1596C;
import y0.E;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 /2\u00020\u0001:\u0001/B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJU\u0010\u0014\u001a\u00020\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00112\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\fR\u001e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\u000e\u001a\u0004\u0018\u00010 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010!R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010#R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010#R*\u0010&\u001a\u00020$2\u0006\u0010%\u001a\u00020$8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, d2 = {"Lcom/sumsub/sns/core/widget/SNSErrorBottomSheetView;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "LO9/p;", "onDetachedFromWindow", "()V", "", TextBundle.TEXT_ENTRY, "primaryButton", "secondaryButton", "Lkotlin/Function0;", "onPrimaryButtonClicked", "onSecondaryButtonClicked", "show", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lca/a;Lca/a;)V", "hide", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroid/view/View;", "behavior", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroid/graphics/drawable/ColorDrawable;", "backgroundDrawable", "Landroid/graphics/drawable/ColorDrawable;", "bottomSheet", "Landroid/view/View;", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "Landroid/widget/Button;", "Landroid/widget/Button;", "", "value", "dismissOnTouchOutside", "Z", "getDismissOnTouchOutside", "()Z", "setDismissOnTouchOutside", "(Z)V", "Ljava/lang/Runnable;", "showCallback", "Ljava/lang/Runnable;", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SNSErrorBottomSheetView extends CoordinatorLayout {
    private final ColorDrawable backgroundDrawable;
    private BottomSheetBehavior<View> behavior;
    private final View bottomSheet;
    private boolean dismissOnTouchOutside;
    private final Button primaryButton;
    private final Button secondaryButton;
    private final Runnable showCallback;
    private final TextView text;

    public SNSErrorBottomSheetView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: _set_dismissOnTouchOutside_$lambda-0, reason: not valid java name */
    public static final void m48_set_dismissOnTouchOutside_$lambda0(boolean z10, SNSErrorBottomSheetView sNSErrorBottomSheetView, View view) {
        if (z10) {
            sNSErrorBottomSheetView.hide();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void show$default(SNSErrorBottomSheetView sNSErrorBottomSheetView, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, InterfaceC0635a interfaceC0635a, InterfaceC0635a interfaceC0635a2, int i, Object obj) {
        if ((i & 1) != 0) {
            charSequence = null;
        }
        if ((i & 2) != 0) {
            charSequence2 = null;
        }
        if ((i & 4) != 0) {
            charSequence3 = null;
        }
        if ((i & 8) != 0) {
            interfaceC0635a = null;
        }
        if ((i & 16) != 0) {
            interfaceC0635a2 = null;
        }
        sNSErrorBottomSheetView.show(charSequence, charSequence2, charSequence3, interfaceC0635a, interfaceC0635a2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: show$lambda-6, reason: not valid java name */
    public static final void m49show$lambda6(InterfaceC0635a interfaceC0635a, SNSErrorBottomSheetView sNSErrorBottomSheetView, View view) {
        if (interfaceC0635a != null) {
            interfaceC0635a.invoke();
        }
        sNSErrorBottomSheetView.hide();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: show$lambda-7, reason: not valid java name */
    public static final void m50show$lambda7(InterfaceC0635a interfaceC0635a, SNSErrorBottomSheetView sNSErrorBottomSheetView, View view) {
        if (interfaceC0635a != null) {
            interfaceC0635a.invoke();
        }
        sNSErrorBottomSheetView.hide();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showCallback$lambda-1, reason: not valid java name */
    public static final void m51showCallback$lambda1(SNSErrorBottomSheetView sNSErrorBottomSheetView) {
        BottomSheetBehavior<View> bottomSheetBehavior = sNSErrorBottomSheetView.behavior;
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

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.showCallback);
    }

    public final void setDismissOnTouchOutside(boolean z10) {
        this.dismissOnTouchOutside = z10;
        setOnClickListener(new a(z10, this, 1));
    }

    public final void show(CharSequence text, CharSequence primaryButton, CharSequence secondaryButton, final InterfaceC0635a<p> onPrimaryButtonClicked, final InterfaceC0635a<p> onSecondaryButtonClicked) {
        TextView textView = this.text;
        if (textView != null) {
            i.a(textView, text);
        }
        Button button = this.primaryButton;
        if (button != null) {
            i.a(button, primaryButton);
        }
        Button button2 = this.secondaryButton;
        if (button2 != null) {
            i.a(button2, secondaryButton);
        }
        Button button3 = this.primaryButton;
        if (button3 != null) {
            final int i = 0;
            button3.setOnClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.core.widget.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i) {
                        case 0:
                            SNSErrorBottomSheetView.m49show$lambda6(onPrimaryButtonClicked, this, view);
                            break;
                        default:
                            SNSErrorBottomSheetView.m50show$lambda7(onPrimaryButtonClicked, this, view);
                            break;
                    }
                }
            });
        }
        Button button4 = this.secondaryButton;
        if (button4 != null) {
            final int i9 = 1;
            button4.setOnClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.core.widget.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i9) {
                        case 0:
                            SNSErrorBottomSheetView.m49show$lambda6(onSecondaryButtonClicked, this, view);
                            break;
                        default:
                            SNSErrorBottomSheetView.m50show$lambda7(onSecondaryButtonClicked, this, view);
                            break;
                    }
                }
            });
        }
        setVisibility(0);
        postDelayed(this.showCallback, 250L);
    }

    public /* synthetic */ SNSErrorBottomSheetView(Context context, AttributeSet attributeSet, int i, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? R$attr.sns_BottomSheetViewStyle : i);
    }

    public SNSErrorBottomSheetView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ColorDrawable colorDrawable = new ColorDrawable(context.getResources().getColor(R.color.black));
        this.backgroundDrawable = colorDrawable;
        this.dismissOnTouchOutside = true;
        this.showCallback = new RunnableC0615f(this, 6);
        View inflate = LayoutInflater.from(context).inflate(R$layout.sns_layout_error_bottom_sheet, (ViewGroup) this, true);
        View findViewById = inflate.findViewById(R$id.sns_bottom_sheet);
        this.bottomSheet = findViewById;
        this.text = (TextView) inflate.findViewById(R$id.sns_text);
        this.primaryButton = (Button) inflate.findViewById(R$id.sns_primary_button);
        this.secondaryButton = (Button) inflate.findViewById(R$id.sns_secondary_button);
        ((ImageView) inflate.findViewById(R$id.sns_start_icon)).setImageDrawable(e0.f15081a.getIconHandler().onResolveIcon(context, SNSIconHandler.SNSCommonIcons.WARNING_OUTLINE.getImageName()));
        colorDrawable.setAlpha(0);
        setBackground(colorDrawable);
        BottomSheetBehavior<View> from = BottomSheetBehavior.from(findViewById);
        from.setHideable(true);
        from.setDraggable(true);
        from.setSkipCollapsed(true);
        from.addBottomSheetCallback(new BottomSheetBehavior.g() { // from class: com.sumsub.sns.core.widget.SNSErrorBottomSheetView$3$1
            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
            public void onSlide(View bottomSheet, float slideOffset) {
                ColorDrawable colorDrawable2;
                colorDrawable2 = SNSErrorBottomSheetView.this.backgroundDrawable;
                colorDrawable2.setAlpha((int) ((slideOffset + 1.0f) * 128));
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
            public void onStateChanged(View bottomSheet, int newState) {
                SNSErrorBottomSheetView.this.setVisibility(newState == 5 ? 8 : 0);
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
        addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.sumsub.sns.core.widget.SNSErrorBottomSheetView$special$$inlined$doOnAttach$1
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
