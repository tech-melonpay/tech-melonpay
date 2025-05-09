package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.google.android.material.textfield.TextInputLayout;
import com.luminary.mobile.R;
import java.util.ArrayList;
import pa.C1124b;

/* loaded from: classes.dex */
public class RangeDateSelector implements DateSelector<x0.b<Long, Long>> {
    public static final Parcelable.Creator<RangeDateSelector> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public String f9408a;

    /* renamed from: b, reason: collision with root package name */
    public Long f9409b = null;

    /* renamed from: c, reason: collision with root package name */
    public Long f9410c = null;

    /* renamed from: d, reason: collision with root package name */
    public Long f9411d = null;

    /* renamed from: e, reason: collision with root package name */
    public Long f9412e = null;

    public class a implements Parcelable.Creator<RangeDateSelector> {
        @Override // android.os.Parcelable.Creator
        public final RangeDateSelector createFromParcel(Parcel parcel) {
            RangeDateSelector rangeDateSelector = new RangeDateSelector();
            rangeDateSelector.f9409b = (Long) parcel.readValue(Long.class.getClassLoader());
            rangeDateSelector.f9410c = (Long) parcel.readValue(Long.class.getClassLoader());
            return rangeDateSelector;
        }

        @Override // android.os.Parcelable.Creator
        public final RangeDateSelector[] newArray(int i) {
            return new RangeDateSelector[i];
        }
    }

    public static void a(RangeDateSelector rangeDateSelector, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, s sVar) {
        Long l10 = rangeDateSelector.f9411d;
        if (l10 == null || rangeDateSelector.f9412e == null) {
            if (textInputLayout.getError() != null && rangeDateSelector.f9408a.contentEquals(textInputLayout.getError())) {
                textInputLayout.setError(null);
            }
            if (textInputLayout2.getError() != null && " ".contentEquals(textInputLayout2.getError())) {
                textInputLayout2.setError(null);
            }
            sVar.a();
        } else if (l10.longValue() <= rangeDateSelector.f9412e.longValue()) {
            Long l11 = rangeDateSelector.f9411d;
            rangeDateSelector.f9409b = l11;
            Long l12 = rangeDateSelector.f9412e;
            rangeDateSelector.f9410c = l12;
            sVar.b(new x0.b(l11, l12));
        } else {
            textInputLayout.setError(rangeDateSelector.f9408a);
            textInputLayout2.setError(" ");
            sVar.a();
        }
        if (!TextUtils.isEmpty(textInputLayout.getError())) {
            textInputLayout.getError();
        } else {
            if (TextUtils.isEmpty(textInputLayout2.getError())) {
                return;
            }
            textInputLayout2.getError();
        }
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final ArrayList C() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new x0.b(this.f9409b, this.f9410c));
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final void D(x0.b<Long, Long> bVar) {
        x0.b<Long, Long> bVar2 = bVar;
        Long l10 = bVar2.f30903a;
        Long l11 = bVar2.f30904b;
        if (l10 != null && l11 != null) {
            C1124b.l(l10.longValue() <= l11.longValue());
        }
        Long l12 = bVar2.f30903a;
        this.f9409b = l12 == null ? null : Long.valueOf(y.a(l12.longValue()));
        this.f9410c = l11 != null ? Long.valueOf(y.a(l11.longValue())) : null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x004e, code lost:
    
        if ((r0 != null ? r0.toLowerCase(java.util.Locale.ENGLISH) : "").equals("samsung") != false) goto L12;
     */
    @Override // com.google.android.material.datepicker.DateSelector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View E(android.view.LayoutInflater r21, android.view.ViewGroup r22, com.google.android.material.datepicker.CalendarConstraints r23, com.google.android.material.datepicker.o.a r24) {
        /*
            r20 = this;
            r10 = r20
            r0 = 2131558746(0x7f0d015a, float:1.8742817E38)
            r1 = 0
            r2 = r21
            r3 = r22
            android.view.View r11 = r2.inflate(r0, r3, r1)
            r0 = 2131362993(0x7f0a04b1, float:1.8345782E38)
            android.view.View r0 = r11.findViewById(r0)
            r12 = r0
            com.google.android.material.textfield.TextInputLayout r12 = (com.google.android.material.textfield.TextInputLayout) r12
            r0 = 2131362992(0x7f0a04b0, float:1.834578E38)
            android.view.View r0 = r11.findViewById(r0)
            r13 = r0
            com.google.android.material.textfield.TextInputLayout r13 = (com.google.android.material.textfield.TextInputLayout) r13
            android.widget.EditText r14 = r12.getEditText()
            android.widget.EditText r15 = r13.getEditText()
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = ""
            if (r0 == 0) goto L37
            java.util.Locale r2 = java.util.Locale.ENGLISH
            java.lang.String r2 = r0.toLowerCase(r2)
            goto L38
        L37:
            r2 = r1
        L38:
            java.lang.String r3 = "lge"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L50
            if (r0 == 0) goto L48
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.String r1 = r0.toLowerCase(r1)
        L48:
            java.lang.String r0 = "samsung"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L58
        L50:
            r0 = 17
            r14.setInputType(r0)
            r15.setInputType(r0)
        L58:
            android.content.res.Resources r0 = r11.getResources()
            r1 = 2132017971(0x7f140333, float:1.9674235E38)
            java.lang.String r0 = r0.getString(r1)
            r10.f9408a = r0
            java.text.SimpleDateFormat r9 = com.google.android.material.datepicker.y.d()
            java.lang.Long r0 = r10.f9409b
            if (r0 == 0) goto L78
            java.lang.String r0 = r9.format(r0)
            r14.setText(r0)
            java.lang.Long r0 = r10.f9409b
            r10.f9411d = r0
        L78:
            java.lang.Long r0 = r10.f9410c
            if (r0 == 0) goto L87
            java.lang.String r0 = r9.format(r0)
            r15.setText(r0)
            java.lang.Long r0 = r10.f9410c
            r10.f9412e = r0
        L87:
            android.content.res.Resources r0 = r11.getResources()
            java.lang.String r8 = com.google.android.material.datepicker.y.e(r0, r9)
            r12.setPlaceholderText(r8)
            r13.setPlaceholderText(r8)
            com.google.android.material.datepicker.u r7 = new com.google.android.material.datepicker.u
            r16 = 0
            r0 = r7
            r1 = r20
            r2 = r8
            r3 = r9
            r4 = r12
            r5 = r23
            r6 = r12
            r17 = r7
            r7 = r13
            r18 = r8
            r8 = r24
            r19 = r9
            r9 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = r17
            r14.addTextChangedListener(r0)
            com.google.android.material.datepicker.u r9 = new com.google.android.material.datepicker.u
            r16 = 1
            r0 = r9
            r2 = r18
            r3 = r19
            r4 = r13
            r12 = r9
            r9 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r15.addTextChangedListener(r12)
            android.widget.EditText[] r0 = new android.widget.EditText[]{r14, r15}
            com.google.android.material.datepicker.DateSelector.G(r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.RangeDateSelector.E(android.view.LayoutInflater, android.view.ViewGroup, com.google.android.material.datepicker.CalendarConstraints, com.google.android.material.datepicker.o$a):android.view.View");
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final int H() {
        return R.string.mtrl_picker_range_header_title;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final String M(Context context) {
        Resources resources = context.getResources();
        x0.b<String, String> a10 = d.a(this.f9409b, this.f9410c);
        String str = a10.f30903a;
        String string = str == null ? resources.getString(R.string.mtrl_picker_announce_current_selection_none) : str;
        String str2 = a10.f30904b;
        return resources.getString(R.string.mtrl_picker_announce_current_range_selection, string, str2 == null ? resources.getString(R.string.mtrl_picker_announce_current_selection_none) : str2);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final int N(Context context) {
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        return P2.b.c(context, Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) > resources.getDimensionPixelSize(R.dimen.mtrl_calendar_maximum_default_fullscreen_minor_axis) ? R.attr.materialCalendarTheme : R.attr.materialCalendarFullscreenTheme, l.class.getCanonicalName()).data;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final boolean Q() {
        Long l10 = this.f9409b;
        return (l10 == null || this.f9410c == null || l10.longValue() > this.f9410c.longValue()) ? false : true;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final ArrayList W() {
        ArrayList arrayList = new ArrayList();
        Long l10 = this.f9409b;
        if (l10 != null) {
            arrayList.add(l10);
        }
        Long l11 = this.f9410c;
        if (l11 != null) {
            arrayList.add(l11);
        }
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final x0.b<Long, Long> a0() {
        return new x0.b<>(this.f9409b, this.f9410c);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final void g0(long j10) {
        Long l10 = this.f9409b;
        if (l10 == null) {
            this.f9409b = Long.valueOf(j10);
        } else if (this.f9410c == null && l10.longValue() <= j10) {
            this.f9410c = Long.valueOf(j10);
        } else {
            this.f9410c = null;
            this.f9409b = Long.valueOf(j10);
        }
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final String i(Context context) {
        Resources resources = context.getResources();
        Long l10 = this.f9409b;
        if (l10 == null && this.f9410c == null) {
            return resources.getString(R.string.mtrl_picker_range_header_unselected);
        }
        Long l11 = this.f9410c;
        if (l11 == null) {
            return resources.getString(R.string.mtrl_picker_range_header_only_start_selected, d.b(l10.longValue()));
        }
        if (l10 == null) {
            return resources.getString(R.string.mtrl_picker_range_header_only_end_selected, d.b(l11.longValue()));
        }
        x0.b<String, String> a10 = d.a(l10, l11);
        return resources.getString(R.string.mtrl_picker_range_header_selected, a10.f30903a, a10.f30904b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.f9409b);
        parcel.writeValue(this.f9410c);
    }
}
