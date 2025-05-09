package com.sumsub.sns.internal.presentation.utils;

import P9.s;
import android.util.Patterns;
import ca.InterfaceC0646l;
import com.sumsub.sns.internal.core.data.model.FieldName;
import com.sumsub.sns.internal.core.data.model.h;
import com.sumsub.sns.internal.core.data.model.p;
import com.sumsub.sns.internal.core.data.model.remote.o;
import com.sumsub.sns.internal.core.data.source.dynamic.b;
import com.sumsub.sns.internal.domain.l;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import ka.C0967l;
import ka.C0969n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.f;

/* loaded from: classes2.dex */
public final class d {
    public static final l a(String str, com.sumsub.sns.internal.core.data.model.e eVar, b.c cVar) {
        String a10;
        String str2;
        List<String> c2;
        String P4;
        List<String> c10;
        Map<String, Map<String, String>> t3;
        Map<String, String> map;
        Map<String, o> D2;
        o oVar = (eVar == null || (D2 = eVar.D()) == null) ? null : D2.get(str);
        if (eVar == null || (t3 = eVar.t()) == null || (map = t3.get(str)) == null || (a10 = map.get("tin")) == null) {
            a10 = cVar.a(String.format("sns_data_%s_%s", Arrays.copyOf(new Object[]{"field", "tin"}, 2)));
        }
        String str3 = "";
        if (oVar == null || (c10 = oVar.c()) == null || (str2 = (String) s.L(c10)) == null) {
            str2 = "";
        }
        if (oVar != null && (c2 = oVar.c()) != null && (P4 = s.P(c2, ", ", null, null, a.f18989a, 30)) != null) {
            String a11 = cVar.a(String.format("sns_data_%s_%s", Arrays.copyOf(new Object[]{"hint", "tin"}, 2)));
            String X = a11 != null ? C0967l.X(a11, "{example}", P4, false) : null;
            if (X != null) {
                str3 = X;
            }
        }
        return new l(a10, oVar, str2, str3);
    }

    public static final String a(h.c cVar, String str, b.c cVar2) {
        if ((!C0969n.i0(str)) || !f.b(cVar.k(), Boolean.TRUE)) {
            return null;
        }
        return cVar2.a("sns_data_error_fieldIsRequired");
    }

    public static final String a(h.d dVar, String str, b.c cVar, Boolean bool) {
        String str2;
        p k3 = dVar.k();
        if (k3 == null || (str2 = com.sumsub.sns.internal.core.presentation.util.a.a(k3, cVar.d(), str, Boolean.FALSE)) == null || str2.length() <= 0) {
            str2 = null;
        }
        if (str2 != null) {
            return str2;
        }
        if ((dVar.getIsRequired() && str.length() == 0) || (dVar.getIsRequired() && dVar.q() == FieldName.phone && f.b(bool, Boolean.FALSE))) {
            return cVar.a("sns_data_error_fieldIsRequired");
        }
        if (dVar.y() && str.length() > 0) {
            try {
                Date parse = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).parse(str);
                if (parse == null) {
                    return null;
                }
                if (parse.compareTo(Calendar.getInstance().getTime()) < 0) {
                    parse = null;
                }
                if (parse != null) {
                    return cVar.a("sns_data_error_fieldIsMalformed");
                }
                return null;
            } catch (Exception unused) {
                return cVar.a("sns_data_error_fieldIsMalformed");
            }
        }
        if (dVar.q() == FieldName.email && str.length() > 0) {
            boolean matches = Patterns.EMAIL_ADDRESS.matcher(str).matches();
            Boolean valueOf = Boolean.valueOf(matches);
            if (!(!matches)) {
                valueOf = null;
            }
            if (valueOf != null) {
                return cVar.a("sns_data_error_fieldIsMalformed");
            }
            return null;
        }
        if (dVar.q() == FieldName.phone && str.length() > 0 && f.b(bool, Boolean.FALSE)) {
            return cVar.a("sns_data_error_fieldIsMalformed");
        }
        return null;
    }

    public static final class a extends Lambda implements InterfaceC0646l<String, CharSequence> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f18989a = new a();

        public a() {
            super(1);
        }

        @Override // ca.InterfaceC0646l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(String str) {
            return str;
        }
    }

    public static final String a(h hVar, String str, b.c cVar, Boolean bool) {
        if (hVar instanceof h.d) {
            return a((h.d) hVar, str, cVar, bool);
        }
        if (hVar instanceof h.c) {
            return a((h.c) hVar, str, cVar);
        }
        if (hVar instanceof h.e) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
