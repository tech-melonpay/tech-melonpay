package com.sumsub.sns.core.presentation.form.viewutils;

import P9.n;
import com.sumsub.sns.core.data.listener.SNSCountryPicker;
import com.sumsub.sns.core.presentation.form.model.a;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataPhoneFieldView;
import com.sumsub.sns.internal.core.presentation.form.model.FieldError;
import com.sumsub.sns.internal.core.presentation.form.model.FormItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import ka.C0969n;

/* loaded from: classes2.dex */
public final class h {
    public static final void a(SNSApplicantDataPhoneFieldView sNSApplicantDataPhoneFieldView, FormItem.k kVar, com.sumsub.sns.core.presentation.form.f fVar) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Set<Map.Entry<String, String>> entrySet = kVar.t().entrySet();
        ArrayList arrayList = new ArrayList(n.u(entrySet, 10));
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            arrayList.add(new SNSCountryPicker.CountryItem((String) entry.getKey(), (String) entry.getValue()));
        }
        if (arrayList.isEmpty()) {
            return;
        }
        Map<String, com.sumsub.sns.internal.core.data.model.remote.c> v10 = kVar.v();
        String a10 = fVar.a(kVar);
        if (a10 == null) {
            a10 = "";
        }
        Iterator<T> it2 = v10.entrySet().iterator();
        while (true) {
            obj = null;
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            String c2 = ((com.sumsub.sns.internal.core.data.model.remote.c) ((Map.Entry) obj2).getValue()).c();
            if (c2 == null) {
                c2 = "-1";
            }
            if (a10.startsWith("+".concat(c2))) {
                break;
            }
        }
        Map.Entry entry2 = (Map.Entry) obj2;
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj3 = null;
                break;
            } else {
                obj3 = it3.next();
                if (kotlin.jvm.internal.f.b(((SNSCountryPicker.CountryItem) obj3).getCode(), entry2 != null ? (String) entry2.getKey() : null)) {
                    break;
                }
            }
        }
        SNSCountryPicker.CountryItem countryItem = (SNSCountryPicker.CountryItem) obj3;
        if (countryItem == null) {
            String u6 = kVar.u();
            if (u6 != null) {
                Iterator it4 = arrayList.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        obj4 = null;
                        break;
                    } else {
                        obj4 = it4.next();
                        if (kotlin.jvm.internal.f.b(((SNSCountryPicker.CountryItem) obj4).getCode(), u6)) {
                            break;
                        }
                    }
                }
                countryItem = (SNSCountryPicker.CountryItem) obj4;
            } else {
                countryItem = null;
            }
        }
        if (a10.length() <= 0) {
            if (countryItem != null) {
                sNSApplicantDataPhoneFieldView.setCountry(countryItem);
                return;
            }
            return;
        }
        String a11 = fVar.a(a.a(kVar));
        if (a11 != null) {
            Iterator it5 = arrayList.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    break;
                }
                Object next = it5.next();
                if (kotlin.jvm.internal.f.b(((SNSCountryPicker.CountryItem) next).getCode(), a11)) {
                    obj = next;
                    break;
                }
            }
            SNSCountryPicker.CountryItem countryItem2 = (SNSCountryPicker.CountryItem) obj;
            if (countryItem2 != null) {
                sNSApplicantDataPhoneFieldView.setCountry(countryItem2);
            }
        }
        sNSApplicantDataPhoneFieldView.setValue(a10);
    }

    public static final boolean a(SNSApplicantDataPhoneFieldView sNSApplicantDataPhoneFieldView, FormItem.k kVar) {
        FieldError a10 = com.sumsub.sns.internal.core.presentation.form.model.g.a(kVar.d(), sNSApplicantDataPhoneFieldView.getPurePhoneNumber());
        if (a10 == null) {
            a10 = FieldError.NOT_VALID;
            if (sNSApplicantDataPhoneFieldView.isValid() || !(!C0969n.i0(sNSApplicantDataPhoneFieldView.getPurePhoneNumber()))) {
                a10 = null;
            }
        }
        return !((kotlin.jvm.internal.f.b(kVar.d().v(), Boolean.TRUE) && C0969n.i0(sNSApplicantDataPhoneFieldView.getPurePhoneNumber())) || a10 != null);
    }

    public static final String a(SNSApplicantDataPhoneFieldView sNSApplicantDataPhoneFieldView) {
        String value = sNSApplicantDataPhoneFieldView.getValue();
        StringBuilder sb2 = new StringBuilder();
        int length = value.length();
        for (int i = 0; i < length; i++) {
            char charAt = value.charAt(i);
            if (!j3.e.u(charAt)) {
                sb2.append(charAt);
            }
        }
        return sb2.toString();
    }
}
