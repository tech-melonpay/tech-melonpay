package com.sumsub.sns.core.presentation.form.viewutils;

import android.annotation.SuppressLint;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataCalendarFieldView;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @SuppressLint({"ConstantLocale"})
    public static final SimpleDateFormat f14272a;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        f14272a = simpleDateFormat;
    }

    public static final void a(SNSApplicantDataCalendarFieldView sNSApplicantDataCalendarFieldView, String str) {
        Date parse;
        if (str != null) {
            try {
                parse = f14272a.parse(str);
            } catch (Exception unused) {
            }
            sNSApplicantDataCalendarFieldView.setSelectedDate(parse);
        }
        parse = null;
        sNSApplicantDataCalendarFieldView.setSelectedDate(parse);
    }

    public static final String a(SNSApplicantDataCalendarFieldView sNSApplicantDataCalendarFieldView) {
        Date selectedDate = sNSApplicantDataCalendarFieldView.getSelectedDate();
        if (selectedDate != null) {
            return f14272a.format(selectedDate);
        }
        return null;
    }
}
