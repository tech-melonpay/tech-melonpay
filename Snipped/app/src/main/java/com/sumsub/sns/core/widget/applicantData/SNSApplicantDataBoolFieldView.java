package com.sumsub.sns.core.widget.applicantData;

import O9.p;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import ca.InterfaceC0646l;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.firebase.messaging.Constants;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.R$style;
import com.sumsub.sns.R$styleable;
import com.sumsub.sns.core.widget.SNSCheckGroup;
import com.sumsub.sns.core.widget.SNSStepViewExtensionsKt;
import com.sumsub.sns.internal.core.common.i;
import com.sumsub.sns.internal.core.widget.SNSStepState;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\r\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010RF\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR(\u0010#\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u001e8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010$\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R(\u0010*\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u001e8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b(\u0010 \"\u0004\b)\u0010\"¨\u0006+"}, d2 = {"Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBoolFieldView;", "Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lcom/google/android/material/checkbox/MaterialCheckBox;", "checkBox", "Lcom/google/android/material/checkbox/MaterialCheckBox;", "", "isUpdating", "Z", "Lkotlin/Function1;", "LO9/p;", "value", "onCheckedChanged", "Lca/l;", "getOnCheckedChanged", "()Lca/l;", "setOnCheckedChanged", "(Lca/l;)V", "Lcom/sumsub/sns/core/widget/SNSCheckGroup;", "getCheckGroup", "()Lcom/sumsub/sns/core/widget/SNSCheckGroup;", "checkGroup", "", "getLabel", "()Ljava/lang/CharSequence;", "setLabel", "(Ljava/lang/CharSequence;)V", "label", "isChecked", "()Z", "setChecked", "(Z)V", "getError", "setError", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SNSApplicantDataBoolFieldView extends SNSApplicantDataBaseFieldView {
    private MaterialCheckBox checkBox;
    private boolean isUpdating;
    private InterfaceC0646l<? super Boolean, p> onCheckedChanged;

    public /* synthetic */ SNSApplicantDataBoolFieldView(Context context, AttributeSet attributeSet, int i, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? R$attr.sns_applicantDataBoolFieldViewStyle : i, (i10 & 8) != 0 ? R$style.Widget_SNSApplicantDataBoolFieldView : i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: _set_onCheckedChanged_$lambda-0, reason: not valid java name */
    public static final void m59_set_onCheckedChanged_$lambda0(SNSApplicantDataBoolFieldView sNSApplicantDataBoolFieldView, InterfaceC0646l interfaceC0646l, CompoundButton compoundButton, boolean z10) {
        sNSApplicantDataBoolFieldView.setError(null);
        if (sNSApplicantDataBoolFieldView.isUpdating || interfaceC0646l == null) {
            return;
        }
        interfaceC0646l.invoke(Boolean.valueOf(z10));
    }

    private final SNSCheckGroup getCheckGroup() {
        return (SNSCheckGroup) findViewById(R$id.sns_data_bool);
    }

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    public CharSequence getError() {
        TextView tvError = getTvError();
        if (tvError != null) {
            return tvError.getText();
        }
        return null;
    }

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    public CharSequence getLabel() {
        CharSequence text;
        TextView tvLabel$idensic_mobile_sdk_aar_release = getTvLabel$idensic_mobile_sdk_aar_release();
        return (tvLabel$idensic_mobile_sdk_aar_release == null || (text = tvLabel$idensic_mobile_sdk_aar_release.getText()) == null) ? "" : text;
    }

    public final InterfaceC0646l<Boolean, p> getOnCheckedChanged() {
        return this.onCheckedChanged;
    }

    public final boolean isChecked() {
        MaterialCheckBox materialCheckBox = this.checkBox;
        return materialCheckBox != null && materialCheckBox.isChecked();
    }

    public final void setChecked(boolean z10) {
        this.isUpdating = true;
        MaterialCheckBox materialCheckBox = this.checkBox;
        if (materialCheckBox != null) {
            materialCheckBox.setChecked(z10);
        }
        this.isUpdating = false;
    }

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    public void setError(CharSequence charSequence) {
        TextView tvError = getTvError();
        if (tvError != null) {
            i.a(tvError, charSequence);
        }
        SNSCheckGroup checkGroup = getCheckGroup();
        if (checkGroup == null) {
            return;
        }
        SNSStepViewExtensionsKt.setSnsStepState(checkGroup, (charSequence == null || charSequence.length() == 0) ? SNSStepState.INIT : SNSStepState.REJECTED);
    }

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    public void setLabel(CharSequence charSequence) {
        TextView tvLabel$idensic_mobile_sdk_aar_release = getTvLabel$idensic_mobile_sdk_aar_release();
        if (tvLabel$idensic_mobile_sdk_aar_release != null) {
            i.a(tvLabel$idensic_mobile_sdk_aar_release, charSequence);
        }
    }

    public final void setOnCheckedChanged(InterfaceC0646l<? super Boolean, p> interfaceC0646l) {
        MaterialCheckBox materialCheckBox = this.checkBox;
        if (materialCheckBox != null) {
            materialCheckBox.setOnCheckedChangeListener(new a(0, this, interfaceC0646l));
        }
        this.onCheckedChanged = interfaceC0646l;
    }

    public SNSApplicantDataBoolFieldView(Context context, AttributeSet attributeSet, int i, int i9) {
        super(context, attributeSet, i, 0, 8, null);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SNSApplicantDataBoolFieldView, i, i9);
        LayoutInflater.from(context).inflate(obtainStyledAttributes.getResourceId(R$styleable.SNSApplicantDataBoolFieldView_sns_applicantDataBoolFieldLayout, R$layout.sns_layout_applicant_data_bool_field), (ViewGroup) this, true);
        obtainStyledAttributes.recycle();
        this.checkBox = new MaterialCheckBox(context, null);
        SNSCheckGroup checkGroup = getCheckGroup();
        if (checkGroup != null) {
            checkGroup.addView(this.checkBox);
        }
        onInitializationFinished();
    }
}
