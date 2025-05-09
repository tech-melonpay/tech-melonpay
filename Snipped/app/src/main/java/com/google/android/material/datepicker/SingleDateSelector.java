package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import com.luminary.mobile.R;
import java.util.ArrayList;
import java.util.Locale;

/* loaded from: classes.dex */
public class SingleDateSelector implements DateSelector<Long> {
    public static final Parcelable.Creator<SingleDateSelector> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public Long f9413a;

    public class a implements Parcelable.Creator<SingleDateSelector> {
        @Override // android.os.Parcelable.Creator
        public final SingleDateSelector createFromParcel(Parcel parcel) {
            SingleDateSelector singleDateSelector = new SingleDateSelector();
            singleDateSelector.f9413a = (Long) parcel.readValue(Long.class.getClassLoader());
            return singleDateSelector;
        }

        @Override // android.os.Parcelable.Creator
        public final SingleDateSelector[] newArray(int i) {
            return new SingleDateSelector[i];
        }
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final ArrayList C() {
        return new ArrayList();
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final void D(Long l10) {
        Long l11 = l10;
        this.f9413a = l11 == null ? null : Long.valueOf(y.a(l11.longValue()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x003a, code lost:
    
        if ((r0 != null ? r0.toLowerCase(java.util.Locale.ENGLISH) : "").equals("samsung") != false) goto L12;
     */
    @Override // com.google.android.material.datepicker.DateSelector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View E(android.view.LayoutInflater r10, android.view.ViewGroup r11, com.google.android.material.datepicker.CalendarConstraints r12, com.google.android.material.datepicker.o.a r13) {
        /*
            r9 = this;
            r0 = 2131558745(0x7f0d0159, float:1.8742814E38)
            r1 = 0
            android.view.View r10 = r10.inflate(r0, r11, r1)
            r11 = 2131362991(0x7f0a04af, float:1.8345778E38)
            android.view.View r11 = r10.findViewById(r11)
            r7 = r11
            com.google.android.material.textfield.TextInputLayout r7 = (com.google.android.material.textfield.TextInputLayout) r7
            android.widget.EditText r11 = r7.getEditText()
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = ""
            if (r0 == 0) goto L23
            java.util.Locale r2 = java.util.Locale.ENGLISH
            java.lang.String r2 = r0.toLowerCase(r2)
            goto L24
        L23:
            r2 = r1
        L24:
            java.lang.String r3 = "lge"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L3c
            if (r0 == 0) goto L34
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.String r1 = r0.toLowerCase(r1)
        L34:
            java.lang.String r0 = "samsung"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L41
        L3c:
            r0 = 17
            r11.setInputType(r0)
        L41:
            java.text.SimpleDateFormat r3 = com.google.android.material.datepicker.y.d()
            android.content.res.Resources r0 = r10.getResources()
            java.lang.String r2 = com.google.android.material.datepicker.y.e(r0, r3)
            r7.setPlaceholderText(r2)
            java.lang.Long r0 = r9.f9413a
            if (r0 == 0) goto L5b
            java.lang.String r0 = r3.format(r0)
            r11.setText(r0)
        L5b:
            com.google.android.material.datepicker.v r8 = new com.google.android.material.datepicker.v
            r0 = r8
            r1 = r9
            r4 = r7
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r11.addTextChangedListener(r8)
            android.widget.EditText[] r11 = new android.widget.EditText[]{r11}
            com.google.android.material.datepicker.DateSelector.G(r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.SingleDateSelector.E(android.view.LayoutInflater, android.view.ViewGroup, com.google.android.material.datepicker.CalendarConstraints, com.google.android.material.datepicker.o$a):android.view.View");
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final int H() {
        return R.string.mtrl_picker_date_header_title;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final String M(Context context) {
        Resources resources = context.getResources();
        Long l10 = this.f9413a;
        return resources.getString(R.string.mtrl_picker_announce_current_selection, l10 == null ? resources.getString(R.string.mtrl_picker_announce_current_selection_none) : d.d(l10.longValue(), Locale.getDefault()));
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final int N(Context context) {
        return P2.b.c(context, R.attr.materialCalendarTheme, l.class.getCanonicalName()).data;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final boolean Q() {
        return this.f9413a != null;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final ArrayList W() {
        ArrayList arrayList = new ArrayList();
        Long l10 = this.f9413a;
        if (l10 != null) {
            arrayList.add(l10);
        }
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final Long a0() {
        return this.f9413a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final void g0(long j10) {
        this.f9413a = Long.valueOf(j10);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final String i(Context context) {
        Resources resources = context.getResources();
        Long l10 = this.f9413a;
        return l10 == null ? resources.getString(R.string.mtrl_picker_date_header_unselected) : resources.getString(R.string.mtrl_picker_date_header_selected, d.d(l10.longValue(), Locale.getDefault()));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.f9413a);
    }
}
