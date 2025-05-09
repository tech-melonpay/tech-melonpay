package A8;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import com.luminary.business.presentation.ui.fragments.loans.LoansFragment;
import com.luminary.business.presentation.ui.views.toolbar.CustomToolbarView;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import ka.C0966k;
import ka.C0967l;
import ka.C0969n;

/* compiled from: TextView.kt */
/* loaded from: classes2.dex */
public final class c implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f134b;

    public /* synthetic */ c(Object obj, int i) {
        this.f133a = i;
        this.f134b = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.f133a) {
            case 0:
                d dVar = ((CustomToolbarView) this.f134b).V.f13273l;
                if (dVar != null) {
                    dVar.c(String.valueOf(editable));
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        int i11 = this.f133a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        switch (this.f133a) {
            case 0:
                break;
            case 1:
                String charSequence2 = charSequence.toString();
                H3.e eVar = (H3.e) this.f134b;
                TextView textView = eVar.f1463f;
                textView.setVisibility(8);
                String lowerCase = charSequence2.toLowerCase();
                if (lowerCase.length() > 0 && lowerCase.charAt(0) == '+') {
                    lowerCase = lowerCase.substring(1);
                }
                ArrayList d10 = eVar.d(lowerCase);
                eVar.f1461d = d10;
                if (d10.size() == 0) {
                    textView.setVisibility(0);
                }
                eVar.notifyDataSetChanged();
                if (!charSequence.toString().trim().equals("")) {
                    eVar.f1468l.setVisibility(0);
                    break;
                } else {
                    eVar.f1468l.setVisibility(8);
                    break;
                }
                break;
            default:
                if (charSequence != null && charSequence.length() != 0) {
                    int length = charSequence.length();
                    LoansFragment loansFragment = (LoansFragment) this.f134b;
                    if (length < 2) {
                        loansFragment.u0().f29138u.setText("£0");
                    }
                    if (C0969n.s0(charSequence, "£")) {
                        Integer S = C0966k.S(C0967l.X(C0967l.X(charSequence.toString(), "£", "", false), ",", "", false));
                        if ((S != null ? S.intValue() : 0) == loansFragment.f12361r0) {
                        }
                    }
                    Integer S4 = C0966k.S(C0967l.X(C0967l.X(charSequence.toString(), "£", "", false), ",", "", false));
                    int intValue = S4 != null ? S4.intValue() : 0;
                    if (intValue > 1000000) {
                        intValue = 1000000;
                    } else if (1 <= intValue && intValue < 10) {
                        intValue *= 1000;
                    } else if (10 <= intValue && intValue < 100) {
                        intValue *= 100;
                    } else if (100 <= intValue && intValue < 1000) {
                        intValue *= 10;
                    }
                    loansFragment.f12361r0 = intValue;
                    DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getNumberInstance(Locale.US);
                    decimalFormat.applyPattern("£#,###");
                    loansFragment.u0().f29138u.setText(decimalFormat.format(Integer.valueOf(intValue)));
                    if (intValue != 0) {
                        loansFragment.u0().f29138u.setSelection(r5.length() - 4);
                    }
                    loansFragment.T0();
                    break;
                }
                break;
        }
    }

    private final void a(Editable editable) {
    }

    private final void b(Editable editable) {
    }

    private final void c(int i, int i9, int i10, CharSequence charSequence) {
    }

    private final void d(int i, int i9, int i10, CharSequence charSequence) {
    }

    private final void e(int i, int i9, int i10, CharSequence charSequence) {
    }

    private final void f(int i, int i9, int i10, CharSequence charSequence) {
    }
}
