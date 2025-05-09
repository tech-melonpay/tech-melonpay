package com.sumsub.sns.core.widget;

import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.fragment.app.ActivityC0533g;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.SingleDateSelector;
import com.google.android.material.datepicker.l;
import com.google.android.material.datepicker.n;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$style;
import com.sumsub.sns.core.data.listener.SNSIconHandler;
import com.sumsub.sns.internal.core.common.i;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/sumsub/sns/core/widget/SNSDateInputLayout;", "Lcom/sumsub/sns/core/widget/SNSTextInputLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "LO9/p;", "showCalendar", "()V", "Ljava/text/DateFormat;", "format", "setDateFormatter", "(Ljava/text/DateFormat;)V", "Lcom/google/android/material/datepicker/CalendarConstraints;", "c", "setConstraints", "(Lcom/google/android/material/datepicker/CalendarConstraints;)V", "Landroid/view/View;", "child", FirebaseAnalytics.Param.INDEX, "Landroid/view/ViewGroup$LayoutParams;", "params", "addView", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V", "dateFormat", "Ljava/text/DateFormat;", "constraints", "Lcom/google/android/material/datepicker/CalendarConstraints;", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SNSDateInputLayout extends SNSTextInputLayout {
    private CalendarConstraints constraints;
    private DateFormat dateFormat;

    public SNSDateInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: addView$lambda-0, reason: not valid java name */
    public static final void m41addView$lambda0(SNSDateInputLayout sNSDateInputLayout, View view, boolean z10) {
        if (z10) {
            sNSDateInputLayout.showCalendar();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r4v2, types: [S, java.lang.Long] */
    public final void showCalendar() {
        FragmentManager supportFragmentManager;
        Editable text;
        String obj;
        Date parse;
        final Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        final DateFormat dateFormat = this.dateFormat;
        if (dateFormat == null) {
            dateFormat = DateFormat.getDateInstance();
        }
        dateFormat.setTimeZone(calendar.getTimeZone());
        try {
            EditText editText = getEditText();
            if (editText != null && (text = editText.getText()) != null && (obj = text.toString()) != null && (parse = dateFormat.parse(obj)) != null) {
                calendar.setTime(parse);
            }
        } catch (Exception unused) {
        }
        ActivityC0533g a10 = i.a(getContext());
        if (a10 == null || (supportFragmentManager = a10.getSupportFragmentManager()) == null) {
            return;
        }
        l.d dVar = new l.d(new SingleDateSelector());
        dVar.f9481e = Long.valueOf(calendar.getTimeInMillis());
        CalendarConstraints calendarConstraints = this.constraints;
        if (calendarConstraints != null) {
            dVar.f9479c = calendarConstraints;
        }
        l a11 = dVar.a();
        a11.f9454f0.add(new n() { // from class: com.sumsub.sns.core.widget.b
            @Override // com.google.android.material.datepicker.n
            public final void a(Object obj2) {
                SNSDateInputLayout.m43showCalendar$lambda7$lambda6(calendar, this, dateFormat, (Long) obj2);
            }
        });
        a11.show(supportFragmentManager, (String) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showCalendar$lambda-7$lambda-6, reason: not valid java name */
    public static final void m43showCalendar$lambda7$lambda6(Calendar calendar, SNSDateInputLayout sNSDateInputLayout, DateFormat dateFormat, Long l10) {
        calendar.setTimeInMillis(l10.longValue());
        EditText editText = sNSDateInputLayout.getEditText();
        if (editText != null) {
            editText.setText(dateFormat.format(calendar.getTime()));
        }
    }

    @Override // com.sumsub.sns.core.widget.SNSTextInputLayout, com.google.android.material.textfield.TextInputLayout, android.view.ViewGroup
    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        super.addView(child, index, params);
        if (child instanceof EditText) {
            EditText editText = getEditText();
            if (editText != null) {
                editText.setOnFocusChangeListener(new X2.a(this, 3));
            }
            EditText editText2 = getEditText();
            if (editText2 != null) {
                editText2.setOnClickListener(new J7.b(this, 12));
            }
            EditText editText3 = getEditText();
            if (editText3 == null) {
                return;
            }
            editText3.setKeyListener(null);
        }
    }

    public final void setConstraints(CalendarConstraints c2) {
        this.constraints = c2;
    }

    public final void setDateFormatter(DateFormat format) {
        this.dateFormat = format;
    }

    public /* synthetic */ SNSDateInputLayout(Context context, AttributeSet attributeSet, int i, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? R$attr.sns_DateInputLayoutStyle : i, (i10 & 8) != 0 ? R$style.Widget_SNSDateInputLayout : i9);
    }

    public SNSDateInputLayout(Context context, AttributeSet attributeSet, int i, int i9) {
        super(context, attributeSet, i, i9);
        setStartIconDrawable(com.sumsub.sns.core.presentation.helper.a.f14273a.a(context, SNSIconHandler.SNSCommonIcons.CALENDAR.getImageName()));
    }
}
