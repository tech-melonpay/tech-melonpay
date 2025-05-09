package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.material.datepicker.o;
import java.util.ArrayList;

/* loaded from: classes.dex */
public interface DateSelector<S> extends Parcelable {
    static void G(EditText... editTextArr) {
        if (editTextArr.length == 0) {
            return;
        }
        X2.a aVar = new X2.a(editTextArr, 2);
        for (EditText editText : editTextArr) {
            editText.setOnFocusChangeListener(aVar);
        }
        EditText editText2 = editTextArr[0];
        editText2.postDelayed(new c(0, editText2), 100L);
    }

    ArrayList C();

    void D(S s10);

    View E(LayoutInflater layoutInflater, ViewGroup viewGroup, CalendarConstraints calendarConstraints, o.a aVar);

    int H();

    String M(Context context);

    int N(Context context);

    boolean Q();

    ArrayList W();

    S a0();

    void g0(long j10);

    String i(Context context);
}
