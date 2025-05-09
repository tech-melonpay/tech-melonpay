package com.sumsub.sns.core.widget.applicantData;

import O9.p;
import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.widget.EditText;
import ca.InterfaceC0646l;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.firebase.messaging.Constants;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$style;
import com.sumsub.sns.core.widget.SNSApplicantDataFieldView;
import com.sumsub.sns.core.widget.SNSDateInputLayout;
import java.text.DateFormat;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u0006\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u0004\u0018\u00010\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0016\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R.\u0010\u0019\u001a\u0004\u0018\u00010\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u0004\u0018\u00010\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R$\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R(\u0010,\u001a\u0004\u0018\u00010'2\b\u0010\u0018\u001a\u0004\u0018\u00010'8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataCalendarFieldView;", "Lcom/sumsub/sns/core/widget/SNSApplicantDataFieldView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "Ljava/util/Date;", "parseAsPrintFormat", "(Ljava/lang/String;)Ljava/util/Date;", "Lcom/google/android/material/datepicker/CalendarConstraints;", "constraints", "LO9/p;", "setConstraints", "(Lcom/google/android/material/datepicker/CalendarConstraints;)V", "Ljava/text/DateFormat;", "kotlin.jvm.PlatformType", "printDateFormat", "Ljava/text/DateFormat;", "value", "selectedDate", "Ljava/util/Date;", "getSelectedDate", "()Ljava/util/Date;", "setSelectedDate", "(Ljava/util/Date;)V", "Lcom/sumsub/sns/core/widget/SNSDateInputLayout;", "getDateInput", "()Lcom/sumsub/sns/core/widget/SNSDateInputLayout;", "dateInput", "getValue", "()Ljava/lang/String;", "setValue", "(Ljava/lang/String;)V", "", "getError", "()Ljava/lang/CharSequence;", "setError", "(Ljava/lang/CharSequence;)V", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SNSApplicantDataCalendarFieldView extends SNSApplicantDataFieldView {
    private final DateFormat printDateFormat;
    private Date selectedDate;

    public /* synthetic */ SNSApplicantDataCalendarFieldView(Context context, AttributeSet attributeSet, int i, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? R$attr.sns_applicantDataFieldViewStyle : i, (i10 & 8) != 0 ? R$style.Widget_SNSApplicantDataFieldView_Date : i9);
    }

    private final SNSDateInputLayout getDateInput() {
        return (SNSDateInputLayout) findViewById(R$id.sns_data_date);
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
        SNSDateInputLayout dateInput = getDateInput();
        if (dateInput != null) {
            return dateInput.getError();
        }
        return null;
    }

    public final Date getSelectedDate() {
        EditText editText;
        SNSDateInputLayout dateInput = getDateInput();
        return parseAsPrintFormat(String.valueOf((dateInput == null || (editText = dateInput.getEditText()) == null) ? null : editText.getText()));
    }

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    public String getValue() {
        Date selectedDate = getSelectedDate();
        String format = selectedDate != null ? this.printDateFormat.format(selectedDate) : null;
        return format == null ? "" : format;
    }

    public final void setConstraints(CalendarConstraints constraints) {
        SNSDateInputLayout dateInput = getDateInput();
        if (dateInput != null) {
            dateInput.setConstraints(constraints);
        }
    }

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    public void setError(CharSequence charSequence) {
        SNSDateInputLayout dateInput = getDateInput();
        if (dateInput == null) {
            return;
        }
        dateInput.setError(charSequence);
    }

    public final void setSelectedDate(Date date) {
        EditText editText;
        SNSDateInputLayout dateInput = getDateInput();
        if (dateInput != null && (editText = dateInput.getEditText()) != null) {
            String format = date != null ? this.printDateFormat.format(date) : null;
            if (format == null) {
                format = "";
            }
            editText.setText(format);
        }
        this.selectedDate = date;
    }

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    public void setValue(String str) {
        setSelectedDate(parseAsPrintFormat(str));
    }

    public SNSApplicantDataCalendarFieldView(Context context, AttributeSet attributeSet, int i, int i9) {
        super(context, attributeSet, i, i9);
        EditText editText;
        DateFormat dateInstance = DateFormat.getDateInstance();
        this.printDateFormat = dateInstance;
        setFocusable(true);
        setFocusableInTouchMode(true);
        SNSDateInputLayout dateInput = getDateInput();
        if (dateInput != null) {
            dateInput.setDateFormatter(dateInstance);
        }
        SNSDateInputLayout dateInput2 = getDateInput();
        if (dateInput2 != null && (editText = dateInput2.getEditText()) != null) {
            editText.addTextChangedListener(new TextWatcher() { // from class: com.sumsub.sns.core.widget.applicantData.SNSApplicantDataCalendarFieldView$special$$inlined$addTextChangedListener$default$1
                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable s10) {
                    SNSApplicantDataCalendarFieldView.this.setError(null);
                    InterfaceC0646l<String, p> textChangedCallback = SNSApplicantDataCalendarFieldView.this.getTextChangedCallback();
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
