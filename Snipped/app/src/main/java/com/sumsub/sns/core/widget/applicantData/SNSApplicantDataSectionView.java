package com.sumsub.sns.core.widget.applicantData;

import O9.p;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import ca.InterfaceC0646l;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.R$style;
import com.sumsub.sns.R$styleable;
import com.sumsub.sns.internal.core.common.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\t\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nRF\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b8V@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R(\u0010\u001e\u001a\u0004\u0018\u00010\u00192\b\u0010\u000e\u001a\u0004\u0018\u00010\u00198V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR(\u0010!\u001a\u0004\u0018\u00010\u00192\b\u0010\u000e\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001d¨\u0006\""}, d2 = {"Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataSectionView;", "Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lkotlin/Function1;", "", "LO9/p;", "value", "onLinkClicked", "Lca/l;", "getOnLinkClicked", "()Lca/l;", "setOnLinkClicked", "(Lca/l;)V", "Landroid/widget/TextView;", "getTvDescription", "()Landroid/widget/TextView;", "tvDescription", "", "getLabel", "()Ljava/lang/CharSequence;", "setLabel", "(Ljava/lang/CharSequence;)V", "label", "getDescription", "setDescription", "description", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SNSApplicantDataSectionView extends SNSApplicantDataBaseFieldView {
    private InterfaceC0646l<? super String, p> onLinkClicked;

    public /* synthetic */ SNSApplicantDataSectionView(Context context, AttributeSet attributeSet, int i, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? R$attr.sns_applicantDataSectionViewStyle : i, (i10 & 8) != 0 ? R$style.Widget_SNSApplicantDataSectionView : i9);
    }

    private final TextView getTvDescription() {
        return (TextView) findViewById(R$id.sns_description);
    }

    public final CharSequence getDescription() {
        TextView tvDescription = getTvDescription();
        if (tvDescription != null) {
            return tvDescription.getText();
        }
        return null;
    }

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    public CharSequence getLabel() {
        CharSequence text;
        TextView tvLabel$idensic_mobile_sdk_aar_release = getTvLabel$idensic_mobile_sdk_aar_release();
        return (tvLabel$idensic_mobile_sdk_aar_release == null || (text = tvLabel$idensic_mobile_sdk_aar_release.getText()) == null) ? "" : text;
    }

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    public InterfaceC0646l<String, p> getOnLinkClicked() {
        return super.getOnLinkClicked();
    }

    public final void setDescription(CharSequence charSequence) {
        TextView tvDescription = getTvDescription();
        if (tvDescription != null) {
            i.a(tvDescription, charSequence);
        }
    }

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    public void setLabel(CharSequence charSequence) {
        TextView tvLabel$idensic_mobile_sdk_aar_release = getTvLabel$idensic_mobile_sdk_aar_release();
        if (tvLabel$idensic_mobile_sdk_aar_release != null) {
            i.a(tvLabel$idensic_mobile_sdk_aar_release, charSequence);
        }
    }

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    public void setOnLinkClicked(InterfaceC0646l<? super String, p> interfaceC0646l) {
        TextView tvLabel$idensic_mobile_sdk_aar_release = getTvLabel$idensic_mobile_sdk_aar_release();
        if (tvLabel$idensic_mobile_sdk_aar_release != null) {
            com.sumsub.sns.core.common.b.a(tvLabel$idensic_mobile_sdk_aar_release, interfaceC0646l);
        }
        TextView tvDescription = getTvDescription();
        if (tvDescription != null) {
            com.sumsub.sns.core.common.b.a(tvDescription, interfaceC0646l);
        }
        this.onLinkClicked = interfaceC0646l;
    }

    public SNSApplicantDataSectionView(Context context, AttributeSet attributeSet, int i, int i9) {
        super(context, attributeSet, i, 0, 8, null);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SNSApplicantDataSectionView, i, i9);
        LayoutInflater.from(context).inflate(obtainStyledAttributes.getResourceId(R$styleable.SNSApplicantDataSectionView_sns_applicantDataSectionLayout, R$layout.sns_layout_applicant_data_section), (ViewGroup) this, true);
        obtainStyledAttributes.recycle();
        onInitializationFinished();
    }
}
