package com.sumsub.sns.internal.core.presentation.util;

import android.text.InputFilter;
import android.widget.EditText;
import com.sumsub.sns.internal.core.data.model.p;
import java.util.Map;
import ka.C0969n;
import kotlin.jvm.internal.f;

/* loaded from: classes2.dex */
public final class a {
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b3 A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean a(com.sumsub.sns.internal.core.data.model.p r3, java.lang.String r4) {
        /*
            if (r3 == 0) goto Lcb
            if (r4 == 0) goto Lcb
            boolean r0 = ka.C0969n.i0(r4)
            if (r0 == 0) goto Lc
            goto Lcb
        Lc:
            boolean r0 = r3 instanceof com.sumsub.sns.internal.core.data.model.p.a
            if (r0 == 0) goto L16
            boolean r3 = a(r4)
            goto Lcc
        L16:
            boolean r0 = r3 instanceof com.sumsub.sns.internal.core.data.model.p.d
            if (r0 == 0) goto L2a
            com.sumsub.sns.internal.core.data.model.p$d r3 = (com.sumsub.sns.internal.core.data.model.p.d) r3
            com.sumsub.sns.internal.core.data.source.applicant.remote.h r3 = r3.a()
            java.lang.Double r4 = ka.C0966k.R(r4)
            boolean r3 = r3.a(r4)
            goto Lcc
        L2a:
            boolean r0 = r3 instanceof com.sumsub.sns.internal.core.data.model.p.f
            if (r0 == 0) goto L36
            com.sumsub.sns.internal.core.presentation.screen.base.b r3 = com.sumsub.sns.internal.core.presentation.screen.base.b.f16624a
            boolean r3 = r3.a(r4)
            goto Lcc
        L36:
            boolean r0 = r3 instanceof com.sumsub.sns.internal.core.data.model.p.h
            r1 = 0
            if (r0 == 0) goto L52
            java.lang.Double r4 = ka.C0966k.R(r4)
            if (r4 == 0) goto L46
            double r1 = r4.doubleValue()
        L46:
            com.sumsub.sns.internal.core.data.model.p$h r3 = (com.sumsub.sns.internal.core.data.model.p.h) r3
            double r3 = r3.a()
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 > 0) goto Lb3
            goto Lcb
        L52:
            boolean r0 = r3 instanceof com.sumsub.sns.internal.core.data.model.p.j
            if (r0 == 0) goto L6b
            java.lang.Double r4 = ka.C0966k.R(r4)
            if (r4 == 0) goto L60
            double r1 = r4.doubleValue()
        L60:
            com.sumsub.sns.internal.core.data.model.p$j r3 = (com.sumsub.sns.internal.core.data.model.p.j) r3
            double r3 = r3.a()
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 < 0) goto Lb3
            goto Lcb
        L6b:
            boolean r0 = r3 instanceof com.sumsub.sns.internal.core.data.model.p.k
            if (r0 == 0) goto L74
            boolean r3 = android.text.TextUtils.isDigitsOnly(r4)
            goto Lcc
        L74:
            boolean r0 = r3 instanceof com.sumsub.sns.internal.core.data.model.p.l
            if (r0 == 0) goto L88
            kotlin.text.Regex r0 = new kotlin.text.Regex
            com.sumsub.sns.internal.core.data.model.p$l r3 = (com.sumsub.sns.internal.core.data.model.p.l) r3
            java.lang.String r3 = r3.a()
            r0.<init>(r3)
            boolean r3 = r0.b(r4)
            goto Lcc
        L88:
            boolean r0 = r3 instanceof com.sumsub.sns.internal.core.data.model.p.m
            if (r0 == 0) goto L91
            boolean r3 = android.telephony.PhoneNumberUtils.isGlobalPhoneNumber(r4)
            goto Lcc
        L91:
            boolean r0 = r3 instanceof com.sumsub.sns.internal.core.data.model.p.g
            if (r0 == 0) goto La2
            int r4 = r4.length()
            com.sumsub.sns.internal.core.data.model.p$g r3 = (com.sumsub.sns.internal.core.data.model.p.g) r3
            int r3 = r3.a()
            if (r4 > r3) goto Lb3
            goto Lcb
        La2:
            boolean r0 = r3 instanceof com.sumsub.sns.internal.core.data.model.p.i
            if (r0 == 0) goto Lb5
            int r4 = r4.length()
            com.sumsub.sns.internal.core.data.model.p$i r3 = (com.sumsub.sns.internal.core.data.model.p.i) r3
            int r3 = r3.a()
            if (r4 < r3) goto Lb3
            goto Lcb
        Lb3:
            r3 = 0
            goto Lcc
        Lb5:
            boolean r0 = r3 instanceof com.sumsub.sns.internal.core.data.model.p.c
            if (r0 == 0) goto Lba
            goto Lcb
        Lba:
            boolean r3 = r3 instanceof com.sumsub.sns.internal.core.data.model.p.b
            if (r3 == 0) goto Lc5
            com.sumsub.sns.internal.core.presentation.screen.base.b r3 = com.sumsub.sns.internal.core.presentation.screen.base.b.f16624a
            boolean r3 = r3.a(r4)
            goto Lcc
        Lc5:
            kotlin.NoWhenBranchMatchedException r3 = new kotlin.NoWhenBranchMatchedException
            r3.<init>()
            throw r3
        Lcb:
            r3 = 1
        Lcc:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.presentation.util.a.a(com.sumsub.sns.internal.core.data.model.p, java.lang.String):boolean");
    }

    public static final boolean a(String str) {
        for (char c2 : str.toCharArray()) {
            if (!Character.isLetter(c2) && !Character.isSpaceChar(c2)) {
                return false;
            }
        }
        return true;
    }

    public static final String a(p pVar, Map<String, String> map, String str, Boolean bool) {
        String str2;
        if (f.b(bool, Boolean.TRUE) && str != null && C0969n.i0(str)) {
            str2 = map.get("sns_quiestionnaire_field_isRequired");
            if (str2 == null) {
                return "";
            }
        } else if (a(pVar, str) || (str2 = map.get("sns_quiestionnaire_field_isNotValid")) == null) {
            return "";
        }
        return str2;
    }

    public static final O9.p a(p pVar, EditText editText) {
        if (pVar instanceof p.g) {
            InputFilter[] inputFilterArr = {new InputFilter.LengthFilter(((p.g) pVar).a())};
            if (editText != null) {
                editText.setFilters(inputFilterArr);
            }
            return O9.p.f3034a;
        }
        if (editText != null) {
            editText.setFilters(new InputFilter[0]);
        }
        Integer a10 = a(pVar);
        if (a10 == null) {
            return null;
        }
        int intValue = a10.intValue();
        if (editText != null) {
            editText.setInputType(intValue);
        }
        return O9.p.f3034a;
    }

    public static final Integer a(p pVar) {
        if ((pVar instanceof p.h) || (pVar instanceof p.j) || (pVar instanceof p.d)) {
            return 8194;
        }
        if (pVar instanceof p.k) {
            return 2;
        }
        if (pVar instanceof p.f) {
            return 32;
        }
        if (pVar instanceof p.c) {
            return 8193;
        }
        return pVar instanceof p.b ? 32 : null;
    }
}
