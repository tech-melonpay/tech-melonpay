package com.sumsub.sns.core.widget.applicantData;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.google.android.material.textfield.TextInputLayout;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.R$style;
import com.sumsub.sns.R$styleable;
import com.sumsub.sns.core.data.listener.SNSCountryPicker;
import com.sumsub.sns.core.widget.PhoneKit;
import com.sumsub.sns.core.widget.SNSFlaggedInputLayout;
import com.sumsub.sns.core.widget.autocompletePhone.Constants;
import com.sumsub.sns.internal.core.common.i;
import ka.C0969n;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\r\n\u0002\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR*\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R0\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0011\u0010#\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010$\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0011\u0010(\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b&\u0010'R(\u0010/\u001a\u0004\u0018\u00010)2\b\u0010*\u001a\u0004\u0018\u00010)8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u00060"}, d2 = {"Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataPhoneFieldView;", "Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lcom/sumsub/sns/core/data/listener/SNSCountryPicker$CountryItem;", "country", "LO9/p;", "setCountry", "(Lcom/sumsub/sns/core/data/listener/SNSCountryPicker$CountryItem;)V", "Lkotlin/Function0;", "", "phoneNumberValidator", "Lca/a;", "getPhoneNumberValidator", "()Lca/a;", "setPhoneNumberValidator", "(Lca/a;)V", "Lkotlin/Function1;", "", "phoneNumberPurifier", "Lca/l;", "getPhoneNumberPurifier", "()Lca/l;", "setPhoneNumberPurifier", "(Lca/l;)V", "Lcom/sumsub/sns/core/widget/SNSFlaggedInputLayout;", "getPhoneInputLayout", "()Lcom/sumsub/sns/core/widget/SNSFlaggedInputLayout;", "phoneInputLayout", "isValid", "()Z", "getPurePhoneNumber", "()Ljava/lang/String;", "purePhoneNumber", "", "value", "getLabel", "()Ljava/lang/CharSequence;", "setLabel", "(Ljava/lang/CharSequence;)V", "label", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SNSApplicantDataPhoneFieldView extends SNSApplicantDataBaseFieldView {
    private InterfaceC0646l<? super String, String> phoneNumberPurifier;
    private InterfaceC0635a<Boolean> phoneNumberValidator;

    public /* synthetic */ SNSApplicantDataPhoneFieldView(Context context, AttributeSet attributeSet, int i, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? R$attr.sns_applicantDataPhoneFieldLayout : i, (i10 & 8) != 0 ? R$style.Widget_SNSApplicantDataFieldView_Phone : i9);
    }

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    public CharSequence getLabel() {
        CharSequence text;
        TextView tvLabel$idensic_mobile_sdk_aar_release = getTvLabel$idensic_mobile_sdk_aar_release();
        return (tvLabel$idensic_mobile_sdk_aar_release == null || (text = tvLabel$idensic_mobile_sdk_aar_release.getText()) == null) ? "" : text;
    }

    public final SNSFlaggedInputLayout getPhoneInputLayout() {
        return (SNSFlaggedInputLayout) getInputLayout();
    }

    public final InterfaceC0646l<String, String> getPhoneNumberPurifier() {
        return this.phoneNumberPurifier;
    }

    public final InterfaceC0635a<Boolean> getPhoneNumberValidator() {
        return this.phoneNumberValidator;
    }

    public final String getPurePhoneNumber() {
        String invoke;
        InterfaceC0646l<? super String, String> interfaceC0646l = this.phoneNumberPurifier;
        return (interfaceC0646l == null || (invoke = interfaceC0646l.invoke(getValue())) == null) ? getValue() : invoke;
    }

    public final boolean isValid() {
        InterfaceC0635a<Boolean> interfaceC0635a = this.phoneNumberValidator;
        return interfaceC0635a != null ? interfaceC0635a.invoke().booleanValue() : !C0969n.i0(getPurePhoneNumber());
    }

    public final void setCountry(SNSCountryPicker.CountryItem country) {
        Object tag = getPhoneInputLayout().getTag(Constants.INSTANCE.getTOOLKIT_TAG());
        PhoneKit phoneKit = tag instanceof PhoneKit ? (PhoneKit) tag : null;
        if (phoneKit != null) {
            phoneKit.setCountry(country, true);
        }
    }

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    public void setLabel(CharSequence charSequence) {
        TextView tvLabel$idensic_mobile_sdk_aar_release = getTvLabel$idensic_mobile_sdk_aar_release();
        if (tvLabel$idensic_mobile_sdk_aar_release != null) {
            i.a(tvLabel$idensic_mobile_sdk_aar_release, charSequence);
        }
    }

    public final void setPhoneNumberPurifier(InterfaceC0646l<? super String, String> interfaceC0646l) {
        this.phoneNumberPurifier = interfaceC0646l;
    }

    public final void setPhoneNumberValidator(InterfaceC0635a<Boolean> interfaceC0635a) {
        this.phoneNumberValidator = interfaceC0635a;
    }

    /* JADX WARN: Type inference failed for: r9v3, types: [com.sumsub.sns.core.widget.applicantData.SNSApplicantDataPhoneFieldView$2] */
    public SNSApplicantDataPhoneFieldView(Context context, AttributeSet attributeSet, int i, int i9) {
        super(context, attributeSet, i, 0, 8, null);
        EditText editText;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SNSApplicantDataPhoneFieldView, i, i9);
        LayoutInflater.from(context).inflate(obtainStyledAttributes.getResourceId(R$styleable.SNSApplicantDataPhoneFieldView_sns_applicantDataPhoneFieldLayout, R$layout.sns_layout_applicant_data_phone_field), (ViewGroup) this, true);
        obtainStyledAttributes.recycle();
        EditText editText2 = getEditText();
        if (editText2 != null) {
            editText2.setInputType(3);
        }
        EditText editText3 = getEditText();
        if (editText3 != null) {
            editText3.setFilters(new AnonymousClass2[]{new InputFilter() { // from class: com.sumsub.sns.core.widget.applicantData.SNSApplicantDataPhoneFieldView.2
                @Override // android.text.InputFilter
                public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
                    StringBuilder sb2 = new StringBuilder();
                    int length = source.length();
                    for (int i10 = 0; i10 < length; i10++) {
                        char charAt = source.charAt(i10);
                        if (Character.isDigit(charAt) || charAt == '+') {
                            sb2.append(charAt);
                        }
                    }
                    return sb2;
                }
            }});
        }
        setInputLayout$idensic_mobile_sdk_aar_release((TextInputLayout) findViewById(R$id.sns_phone));
        TextInputLayout inputLayout = getInputLayout();
        if (inputLayout != null && (editText = inputLayout.getEditText()) != null) {
            editText.addTextChangedListener(new TextWatcher() { // from class: com.sumsub.sns.core.widget.applicantData.SNSApplicantDataPhoneFieldView$special$$inlined$doAfterTextChanged$1
                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable s10) {
                    TextInputLayout inputLayout2 = SNSApplicantDataPhoneFieldView.this.getInputLayout();
                    if (inputLayout2 != null) {
                        inputLayout2.setError(null);
                    }
                    TextInputLayout inputLayout3 = SNSApplicantDataPhoneFieldView.this.getInputLayout();
                    if (inputLayout3 == null) {
                        return;
                    }
                    inputLayout3.setErrorEnabled(false);
                }

                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence text, int start, int count, int after) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence text, int start, int before, int count) {
                }
            });
        }
        onInitializationFinished();
    }
}
