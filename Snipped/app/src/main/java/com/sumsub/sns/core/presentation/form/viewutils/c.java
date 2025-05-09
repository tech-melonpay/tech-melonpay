package com.sumsub.sns.core.presentation.form.viewutils;

import android.annotation.SuppressLint;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataDateTimeFieldView;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @SuppressLint({"ConstantLocale"})
    public static final SimpleDateFormat f14271a;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm", Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        f14271a = simpleDateFormat;
    }

    public static final void a(SNSApplicantDataDateTimeFieldView sNSApplicantDataDateTimeFieldView, String str) {
        Date parse;
        if (str != null) {
            try {
                parse = f14271a.parse(str);
            } catch (Exception unused) {
            }
            sNSApplicantDataDateTimeFieldView.setSelectedDate(parse);
        }
        parse = null;
        sNSApplicantDataDateTimeFieldView.setSelectedDate(parse);
    }

    public static final String a(SNSApplicantDataDateTimeFieldView sNSApplicantDataDateTimeFieldView) {
        Date selectedDate = sNSApplicantDataDateTimeFieldView.getSelectedDate();
        if (selectedDate != null) {
            return f14271a.format(selectedDate);
        }
        return null;
    }
}
