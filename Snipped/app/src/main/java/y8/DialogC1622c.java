package y8;

import F8.o;
import O9.p;
import android.app.DatePickerDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.DatePicker;
import androidx.databinding.DataBinderMapperImpl;
import ca.InterfaceC0650p;
import com.luminary.mobile.R;
import java.util.Calendar;
import java.util.Date;
import t6.AbstractC1291a2;
import v8.DialogC1549a;

/* compiled from: FilterDialog.kt */
/* renamed from: y8.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class DialogC1622c extends DialogC1549a {

    /* renamed from: q, reason: collision with root package name */
    public final Context f31128q;

    /* renamed from: r, reason: collision with root package name */
    public final AbstractC1291a2 f31129r;

    /* renamed from: s, reason: collision with root package name */
    public InterfaceC0650p<? super Date, ? super Date, p> f31130s;

    /* renamed from: t, reason: collision with root package name */
    public Date f31131t;

    /* renamed from: u, reason: collision with root package name */
    public Date f31132u;

    public DialogC1622c(Context context) {
        super(context);
        this.f31128q = context;
        LayoutInflater from = LayoutInflater.from(getContext());
        int i = AbstractC1291a2.f28784s;
        DataBinderMapperImpl dataBinderMapperImpl = F0.d.f1140a;
        AbstractC1291a2 abstractC1291a2 = (AbstractC1291a2) F0.f.f(from, R.layout.dialog_filter, null, false, null);
        this.f31129r = abstractC1291a2;
        setCancelable(false);
        setContentView(abstractC1291a2.f1148d);
        setCanceledOnTouchOutside(false);
        j().setHideable(true);
        o.c(abstractC1291a2.f28787p, 500L, new C1620a(this, 4));
    }

    public final void l(final boolean z10) {
        final Calendar calendar = Calendar.getInstance();
        DatePickerDialog datePickerDialog = new DatePickerDialog(this.f31128q, R.style.my_dialog_theme, new DatePickerDialog.OnDateSetListener() { // from class: y8.b
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i, int i9, int i10) {
                Calendar calendar2 = calendar;
                calendar2.set(1, i);
                calendar2.set(2, i9);
                calendar2.set(5, i10);
                boolean z11 = z10;
                if (z11) {
                    calendar2.set(11, 0);
                    calendar2.set(12, 0);
                    calendar2.set(13, 0);
                } else {
                    calendar2.set(11, 23);
                    calendar2.set(12, 59);
                    calendar2.set(13, 59);
                }
                DialogC1622c dialogC1622c = this;
                Date time = calendar2.getTime();
                if (z11) {
                    dialogC1622c.f31131t = time;
                } else {
                    dialogC1622c.f31132u = time;
                }
                AbstractC1291a2 abstractC1291a2 = dialogC1622c.f31129r;
                if (z11) {
                    abstractC1291a2.f28788q.setText(D9.b.F0(calendar2.getTime(), "dd MMM yyyy"));
                } else {
                    abstractC1291a2.f28789r.setText(D9.b.F0(calendar2.getTime(), "dd MMM yyyy"));
                }
            }
        }, calendar.get(1), calendar.get(2), calendar.get(5));
        if (z10) {
            Date date = this.f31132u;
            if ((date != null ? Long.valueOf(date.getTime()) : null) != null) {
                DatePicker datePicker = datePickerDialog.getDatePicker();
                Date date2 = this.f31132u;
                datePicker.setMaxDate(date2 != null ? date2.getTime() : calendar.getTimeInMillis());
            }
        }
        if (!z10) {
            Date date3 = this.f31131t;
            if ((date3 != null ? Long.valueOf(date3.getTime()) : null) != null) {
                DatePicker datePicker2 = datePickerDialog.getDatePicker();
                Date date4 = this.f31131t;
                datePicker2.setMinDate(date4 != null ? date4.getTime() : calendar.getTimeInMillis());
            }
        }
        datePickerDialog.show();
    }

    @Override // com.google.android.material.bottomsheet.e, h.DialogC0783j, c.DialogC0616g, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        j().setState(3);
        AbstractC1291a2 abstractC1291a2 = this.f31129r;
        o.c(abstractC1291a2.f28788q, 500L, new C1620a(this, 0));
        o.c(abstractC1291a2.f28789r, 500L, new C1620a(this, 1));
        o.c(abstractC1291a2.f28785n, 500L, new C1620a(this, 2));
        o.c(abstractC1291a2.f28786o, 500L, new C1620a(this, 3));
    }
}
