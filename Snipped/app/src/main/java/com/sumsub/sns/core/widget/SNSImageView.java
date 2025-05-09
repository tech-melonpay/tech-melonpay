package com.sumsub.sns.core.widget;

import O9.p;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$style;
import com.sumsub.sns.R$styleable;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.internal.core.common.i;
import com.sumsub.sns.internal.core.widget.SNSStepState;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import y0.C1596C;
import y0.E;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/sumsub/sns/core/widget/SNSImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Lcom/sumsub/sns/internal/core/widget/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "extraSpace", "", "onCreateDrawableState", "(I)[I", "Lcom/sumsub/sns/internal/core/widget/SNSStepState;", "getSNSStepState", "()Lcom/sumsub/sns/internal/core/widget/SNSStepState;", "state", "LO9/p;", "setSNSStepState", "(Lcom/sumsub/sns/internal/core/widget/SNSStepState;)V", "stepState", "Lcom/sumsub/sns/internal/core/widget/SNSStepState;", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SNSImageView extends AppCompatImageView implements com.sumsub.sns.internal.core.widget.a {
    private SNSStepState stepState;

    public SNSImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    @Override // com.sumsub.sns.internal.core.widget.a
    public SNSStepState getSNSStepState() {
        SNSStepState sNSStepState = this.stepState;
        return sNSStepState == null ? SNSStepState.INIT : sNSStepState;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int extraSpace) {
        return View.mergeDrawableStates(super.onCreateDrawableState(extraSpace + 1), this.stepState != null ? SNSStepViewExtensionsKt.getSnsStepStateDrawable(this) : new int[]{R$attr.sns_stateInit});
    }

    @Override // com.sumsub.sns.internal.core.widget.a
    public void setSNSStepState(SNSStepState state) {
        if (state != this.stepState) {
            this.stepState = state;
            refreshDrawableState();
        }
    }

    public /* synthetic */ SNSImageView(Context context, AttributeSet attributeSet, int i, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? R$attr.sns_ImageViewStyle : i, (i10 & 8) != 0 ? R$style.Widget_SNSImageView : i9);
    }

    public SNSImageView(Context context, AttributeSet attributeSet, int i, int i9) {
        super(context, attributeSet, i);
        this.stepState = SNSStepState.INIT;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SNSImageView, i, i9);
        int i10 = R$styleable.SNSImageView_android_tint;
        if (obtainStyledAttributes.hasValue(i10)) {
            setImageTintList(i.a(obtainStyledAttributes, context, i10));
        }
        int i11 = R$styleable.SNSImageView_android_backgroundTint;
        if (obtainStyledAttributes.hasValue(i11)) {
            ColorStateList a10 = i.a(obtainStyledAttributes, context, i11);
            WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
            C1596C.d.j(this, a10);
        }
        p pVar = p.f3034a;
        obtainStyledAttributes.recycle();
        com.sumsub.sns.core.presentation.helper.a aVar = com.sumsub.sns.core.presentation.helper.a.f14273a;
        if (aVar.a() != null) {
            int[][] b9 = aVar.b();
            SNSColorElement sNSColorElement = SNSColorElement.BACKGROUND_NEUTRAL;
            Integer a11 = aVar.a(this, sNSColorElement);
            int intValue = a11 != null ? a11.intValue() : 0;
            SNSColorElement sNSColorElement2 = SNSColorElement.BACKGROUND_WARNING;
            Integer a12 = aVar.a(this, sNSColorElement2);
            int intValue2 = a12 != null ? a12.intValue() : 0;
            Integer a13 = aVar.a(this, SNSColorElement.BACKGROUND_SUCCESS);
            int intValue3 = a13 != null ? a13.intValue() : 0;
            Integer a14 = aVar.a(this, SNSColorElement.BACKGROUND_CRITICAL);
            int intValue4 = a14 != null ? a14.intValue() : 0;
            Integer a15 = aVar.a(this, sNSColorElement2);
            int intValue5 = a15 != null ? a15.intValue() : 0;
            Integer a16 = aVar.a(this, sNSColorElement);
            ColorStateList colorStateList = new ColorStateList(b9, new int[]{intValue, intValue2, intValue3, intValue4, intValue5, a16 != null ? a16.intValue() : 0});
            WeakHashMap<View, E> weakHashMap2 = C1596C.f30963a;
            C1596C.d.j(this, colorStateList);
        }
    }
}
