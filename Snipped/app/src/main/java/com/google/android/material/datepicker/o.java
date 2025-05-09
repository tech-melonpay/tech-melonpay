package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* compiled from: MaterialTextInputPicker.java */
/* loaded from: classes.dex */
public final class o<S> extends t<S> {

    /* renamed from: g0, reason: collision with root package name */
    public int f9485g0;

    /* renamed from: h0, reason: collision with root package name */
    public DateSelector<S> f9486h0;

    /* renamed from: i0, reason: collision with root package name */
    public CalendarConstraints f9487i0;

    /* compiled from: MaterialTextInputPicker.java */
    public class a extends s<S> {
        public a() {
        }

        @Override // com.google.android.material.datepicker.s
        public final void a() {
            Iterator<s<S>> it = o.this.f9506f0.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }

        @Override // com.google.android.material.datepicker.s
        public final void b(S s10) {
            Iterator<s<S>> it = o.this.f9506f0.iterator();
            while (it.hasNext()) {
                it.next().b(s10);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f9485g0 = bundle.getInt("THEME_RES_ID_KEY");
        this.f9486h0 = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f9487i0 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f9486h0.E(layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.f9485g0)), viewGroup, this.f9487i0, new a());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f9485g0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f9486h0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f9487i0);
    }
}
