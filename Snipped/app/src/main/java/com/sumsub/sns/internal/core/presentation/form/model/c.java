package com.sumsub.sns.internal.core.presentation.form.model;

import P9.s;
import com.sumsub.sns.internal.core.data.source.applicant.remote.l;
import com.sumsub.sns.internal.core.data.source.applicant.remote.m;
import com.sumsub.sns.internal.core.presentation.form.model.a;
import java.util.ArrayList;
import java.util.List;
import ka.C0969n;

/* loaded from: classes2.dex */
public final class c {
    public static final List<a> a(String str) {
        Object bVar;
        ArrayList arrayList = new ArrayList();
        List<String> r02 = str != null ? C0969n.r0(str, new String[]{Logic.OR.getRawValue(), Logic.AND.getRawValue()}) : null;
        if (r02 != null) {
            for (String str2 : r02) {
                if (C0969n.Y(str2, "!=", false)) {
                    List r03 = C0969n.r0(str2, new String[]{"!="});
                    l a10 = m.a((String) r03.get(0), ".");
                    if (a10 != null) {
                        bVar = new a.c(str2, C0969n.u0(a10.c()).toString(), C0969n.u0(a10.d()).toString(), (String) r03.get(1));
                    }
                    bVar = null;
                } else if (C0969n.Y(str2, "=", false)) {
                    List r04 = C0969n.r0(str2, new String[]{"="});
                    l a11 = m.a((String) r04.get(0), ".");
                    if (a11 != null) {
                        bVar = new a.C0243a(str2, C0969n.u0(a11.c()).toString(), C0969n.u0(a11.d()).toString(), (String) r04.get(1));
                    }
                    bVar = null;
                } else {
                    l a12 = m.a(str2, ".");
                    if (a12 != null) {
                        bVar = new a.b(str2, C0969n.u0(a12.c()).toString(), C0969n.u0(a12.d()).toString());
                    }
                    bVar = null;
                }
                if (bVar != null) {
                    arrayList.add(bVar);
                }
            }
        }
        return s.c0(arrayList);
    }
}
