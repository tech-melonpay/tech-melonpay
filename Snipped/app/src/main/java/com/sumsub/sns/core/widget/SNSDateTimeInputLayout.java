package com.sumsub.sns.core.widget;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.fragment.app.ActivityC0533g;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.datepicker.SingleDateSelector;
import com.google.android.material.datepicker.l;
import com.google.android.material.datepicker.n;
import com.google.android.material.timepicker.f;
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
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ-\u0010\u0012\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/sumsub/sns/core/widget/SNSDateTimeInputLayout;", "Lcom/sumsub/sns/core/widget/SNSTextInputLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "LO9/p;", "showCalendar", "()V", "Ljava/util/Calendar;", "cal", "hours", "minutes", "showTime", "(Ljava/util/Calendar;Ljava/lang/Integer;Ljava/lang/Integer;)V", "Ljava/text/DateFormat;", "format", "setDateFormatter", "(Ljava/text/DateFormat;)V", "Landroid/view/View;", "child", FirebaseAnalytics.Param.INDEX, "Landroid/view/ViewGroup$LayoutParams;", "params", "addView", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V", "dateFormat", "Ljava/text/DateFormat;", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SNSDateTimeInputLayout extends SNSTextInputLayout {
    private DateFormat dateFormat;

    public SNSDateTimeInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: addView$lambda-0, reason: not valid java name */
    public static final void m44addView$lambda0(SNSDateTimeInputLayout sNSDateTimeInputLayout, View view, boolean z10) {
        if (z10) {
            sNSDateTimeInputLayout.showCalendar();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v11, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r1v8, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v2, types: [S, java.lang.Long] */
    public final void showCalendar() {
        FragmentManager supportFragmentManager;
        Editable text;
        String obj;
        Date parse;
        final Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        DateFormat dateFormat = this.dateFormat;
        if (dateFormat == null) {
            dateFormat = DateFormat.getDateInstance();
        }
        DateFormat dateFormat2 = this.dateFormat;
        if (dateFormat2 != null) {
            dateFormat2.setTimeZone(calendar.getTimeZone());
        }
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        final Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        try {
            EditText editText = getEditText();
            if (editText != null && (text = editText.getText()) != null && (obj = text.toString()) != null && (parse = dateFormat.parse(obj)) != null) {
                calendar.setTime(parse);
                ref$ObjectRef.f23179a = Integer.valueOf(calendar.get(12));
                ref$ObjectRef2.f23179a = Integer.valueOf(calendar.get(10));
            }
        } catch (Exception unused) {
        }
        ActivityC0533g a10 = i.a(getContext());
        if (a10 == null || (supportFragmentManager = a10.getSupportFragmentManager()) == null) {
            return;
        }
        l.d dVar = new l.d(new SingleDateSelector());
        dVar.f9481e = Long.valueOf(calendar.getTimeInMillis());
        l a11 = dVar.a();
        a11.f9454f0.add(new n() { // from class: com.sumsub.sns.core.widget.c
            @Override // com.google.android.material.datepicker.n
            public final void a(Object obj2) {
                SNSDateTimeInputLayout sNSDateTimeInputLayout = this;
                Ref$ObjectRef ref$ObjectRef3 = ref$ObjectRef2;
                SNSDateTimeInputLayout.m46showCalendar$lambda5$lambda4(calendar, sNSDateTimeInputLayout, ref$ObjectRef3, ref$ObjectRef, (Long) obj2);
            }
        });
        a11.show(supportFragmentManager, (String) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: showCalendar$lambda-5$lambda-4, reason: not valid java name */
    public static final void m46showCalendar$lambda5$lambda4(Calendar calendar, SNSDateTimeInputLayout sNSDateTimeInputLayout, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, Long l10) {
        calendar.setTimeInMillis(l10.longValue());
        sNSDateTimeInputLayout.showTime(calendar, (Integer) ref$ObjectRef.f23179a, (Integer) ref$ObjectRef2.f23179a);
    }

    private final void showTime(Calendar cal, Integer hours, Integer minutes) {
        FragmentManager supportFragmentManager;
        f.d dVar = new f.d();
        dVar.c();
        if (minutes != null) {
            dVar.b(minutes.intValue());
        }
        if (hours != null) {
            dVar.a(hours.intValue());
        }
        com.google.android.material.timepicker.f fVar = new com.google.android.material.timepicker.f();
        Bundle bundle = new Bundle();
        bundle.putParcelable("TIME_PICKER_TIME_MODEL", dVar.f10012a);
        bundle.putInt("TIME_PICKER_TITLE_RES", 0);
        bundle.putInt("TIME_PICKER_POSITIVE_BUTTON_TEXT_RES", 0);
        bundle.putInt("TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES", 0);
        bundle.putInt("TIME_PICKER_OVERRIDE_THEME_RES_ID", 0);
        fVar.setArguments(bundle);
        fVar.f9989f0.add(new d(cal, fVar, this, 0));
        ActivityC0533g a10 = i.a(getContext());
        if (a10 == null || (supportFragmentManager = a10.getSupportFragmentManager()) == null) {
            return;
        }
        fVar.show(supportFragmentManager, (String) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showTime$lambda-8, reason: not valid java name */
    public static final void m47showTime$lambda8(Calendar calendar, com.google.android.material.timepicker.f fVar, SNSDateTimeInputLayout sNSDateTimeInputLayout, View view) {
        Date time;
        EditText editText;
        if (calendar != null) {
            calendar.set(10, fVar.o0());
        }
        if (calendar != null) {
            calendar.set(12, fVar.p0());
        }
        if (calendar == null || (time = calendar.getTime()) == null) {
            return;
        }
        DateFormat dateFormat = sNSDateTimeInputLayout.dateFormat;
        String format = dateFormat != null ? dateFormat.format(time) : null;
        if (format == null || (editText = sNSDateTimeInputLayout.getEditText()) == null) {
            return;
        }
        editText.setText(format);
    }

    @Override // com.sumsub.sns.core.widget.SNSTextInputLayout, com.google.android.material.textfield.TextInputLayout, android.view.ViewGroup
    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        super.addView(child, index, params);
        if (child instanceof EditText) {
            EditText editText = getEditText();
            if (editText != null) {
                editText.setOnFocusChangeListener(new X2.a(this, 4));
            }
            EditText editText2 = getEditText();
            if (editText2 != null) {
                editText2.setOnClickListener(new J7.b(this, 13));
            }
            EditText editText3 = getEditText();
            if (editText3 != null) {
                editText3.setKeyListener(null);
            }
            setFocusable(true);
            setFocusableInTouchMode(true);
        }
    }

    public final void setDateFormatter(DateFormat format) {
        this.dateFormat = format;
    }

    public /* synthetic */ SNSDateTimeInputLayout(Context context, AttributeSet attributeSet, int i, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? R$attr.sns_DateTimeInputLayoutStyle : i, (i10 & 8) != 0 ? R$style.Widget_SNSDateTimeInputLayout : i9);
    }

    public SNSDateTimeInputLayout(Context context, AttributeSet attributeSet, int i, int i9) {
        super(context, attributeSet, i, i9);
        EditText editText = getEditText();
        if (editText != null) {
            editText.setKeyListener(null);
        }
        setStartIconDrawable(com.sumsub.sns.core.presentation.helper.a.f14273a.a(context, SNSIconHandler.SNSCommonIcons.CALENDAR.getImageName()));
    }
}
