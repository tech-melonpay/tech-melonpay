package com.sumsub.sns.core.widget.applicantData;

import O9.p;
import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.widget.EditText;
import ca.InterfaceC0646l;
import com.google.firebase.messaging.Constants;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$style;
import com.sumsub.sns.core.widget.SNSApplicantDataFieldView;
import com.sumsub.sns.core.widget.SNSDateTimeInputLayout;
import java.text.DateFormat;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\u000e\u0010#\u001a\u0004\u0018\u00010\u0018*\u00020\u001eH\u0002R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR(\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\n \u0017*\u0004\u0018\u00010\u00160\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u000e\u001a\u0004\u0018\u00010\u00188F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u000e\u001a\u00020\u001e2\u0006\u0010\u000e\u001a\u00020\u001e8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataDateTimeFieldView;", "Lcom/sumsub/sns/core/widget/SNSApplicantDataFieldView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "dateTimeInput", "Lcom/sumsub/sns/core/widget/SNSDateTimeInputLayout;", "getDateTimeInput", "()Lcom/sumsub/sns/core/widget/SNSDateTimeInputLayout;", "value", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "getError", "()Ljava/lang/CharSequence;", "setError", "(Ljava/lang/CharSequence;)V", "printDateFormat", "Ljava/text/DateFormat;", "kotlin.jvm.PlatformType", "Ljava/util/Date;", "selectedDate", "getSelectedDate", "()Ljava/util/Date;", "setSelectedDate", "(Ljava/util/Date;)V", "", "getValue", "()Ljava/lang/String;", "setValue", "(Ljava/lang/String;)V", "parseAsPrintFormat", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class SNSApplicantDataDateTimeFieldView extends SNSApplicantDataFieldView {
    private final DateFormat printDateFormat;
    private Date selectedDate;

    public /* synthetic */ SNSApplicantDataDateTimeFieldView(Context context, AttributeSet attributeSet, int i, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? R$attr.sns_applicantDataFieldViewStyle : i, (i10 & 8) != 0 ? R$style.Widget_SNSApplicantDataFieldView_DateTime : i9);
    }

    private final SNSDateTimeInputLayout getDateTimeInput() {
        return (SNSDateTimeInputLayout) findViewById(R$id.sns_data_datetime);
    }

    private final Date parseAsPrintFormat(String str) {
        try {
            return this.printDateFormat.parse(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    public CharSequence getError() {
        SNSDateTimeInputLayout dateTimeInput = getDateTimeInput();
        if (dateTimeInput != null) {
            return dateTimeInput.getError();
        }
        return null;
    }

    public final Date getSelectedDate() {
        EditText editText;
        SNSDateTimeInputLayout dateTimeInput = getDateTimeInput();
        return parseAsPrintFormat(String.valueOf((dateTimeInput == null || (editText = dateTimeInput.getEditText()) == null) ? null : editText.getText()));
    }

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    public String getValue() {
        Date selectedDate = getSelectedDate();
        String format = selectedDate != null ? this.printDateFormat.format(selectedDate) : null;
        return format == null ? "" : format;
    }

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    public void setError(CharSequence charSequence) {
        SNSDateTimeInputLayout dateTimeInput = getDateTimeInput();
        if (dateTimeInput == null) {
            return;
        }
        dateTimeInput.setError(charSequence);
    }

    public final void setSelectedDate(Date date) {
        EditText editText;
        SNSDateTimeInputLayout dateTimeInput = getDateTimeInput();
        if (dateTimeInput != null && (editText = dateTimeInput.getEditText()) != null) {
            editText.setText(date != null ? this.printDateFormat.format(date) : null);
        }
        this.selectedDate = date;
    }

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    public void setValue(String str) {
        setSelectedDate(parseAsPrintFormat(str));
    }

    public SNSApplicantDataDateTimeFieldView(Context context, AttributeSet attributeSet, int i, int i9) {
        super(context, attributeSet, i, i9);
        EditText editText;
        DateFormat dateTimeInstance = DateFormat.getDateTimeInstance();
        this.printDateFormat = dateTimeInstance;
        setFocusable(true);
        setFocusableInTouchMode(true);
        SNSDateTimeInputLayout dateTimeInput = getDateTimeInput();
        if (dateTimeInput != null) {
            dateTimeInput.setDateFormatter(dateTimeInstance);
        }
        SNSDateTimeInputLayout dateTimeInput2 = getDateTimeInput();
        if (dateTimeInput2 != null && (editText = dateTimeInput2.getEditText()) != null) {
            editText.addTextChangedListener(new TextWatcher() { // from class: com.sumsub.sns.core.widget.applicantData.SNSApplicantDataDateTimeFieldView$special$$inlined$addTextChangedListener$default$1
                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable s10) {
                    SNSApplicantDataDateTimeFieldView.this.setError(null);
                    InterfaceC0646l<String, p> textChangedCallback = SNSApplicantDataDateTimeFieldView.this.getTextChangedCallback();
                    if (textChangedCallback != null) {
                        textChangedCallback.invoke(s10 != null ? s10.toString() : null);
                    }
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
