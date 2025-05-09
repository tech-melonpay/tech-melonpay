package H3;

import android.content.SharedPreferences;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.hbb20.CountryCodePicker;
import java.util.ArrayList;

/* compiled from: CountryCodeAdapter.java */
/* loaded from: classes.dex */
public final class d implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1459a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f1460b;

    public d(e eVar, int i) {
        this.f1460b = eVar;
        this.f1459a = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ArrayList arrayList;
        e eVar = this.f1460b;
        ArrayList arrayList2 = eVar.f1461d;
        int i = this.f1459a;
        if (arrayList2 != null && arrayList2.size() > i) {
            CountryCodePicker countryCodePicker = eVar.f1464g;
            com.hbb20.a aVar = (com.hbb20.a) eVar.f1461d.get(i);
            CountryCodePicker countryCodePicker2 = countryCodePicker.f10583r;
            if (countryCodePicker2.f10542I) {
                String str = aVar.f10619a;
                SharedPreferences.Editor edit = countryCodePicker2.f10559e.getSharedPreferences(countryCodePicker2.f10553b, 0).edit();
                edit.putString(countryCodePicker2.f10550Q, str);
                edit.apply();
            }
            countryCodePicker.setSelectedCountry(aVar);
        }
        if (view == null || (arrayList = eVar.f1461d) == null || arrayList.size() <= i || eVar.f1461d.get(i) == null) {
            return;
        }
        ((InputMethodManager) eVar.f1467k.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        eVar.f1466j.dismiss();
    }
}
