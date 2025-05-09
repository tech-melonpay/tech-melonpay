package com.sumsub.sns.internal.presentation.utils;

import P9.n;
import P9.s;
import com.sumsub.sns.internal.core.data.model.h;
import com.sumsub.sns.internal.core.data.source.applicant.remote.k;
import com.sumsub.sns.internal.core.data.source.applicant.remote.r;
import com.sumsub.sns.internal.core.presentation.form.model.FormItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class c {
    public static /* synthetic */ FormItem a(h.e eVar, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return a(eVar, str);
    }

    public static final FormItem a(h.e eVar, String str) {
        if (!(eVar instanceof h.e.a)) {
            if (eVar instanceof h.e.b) {
                return new FormItem.f(((h.e.b) eVar).e().toString(), "appdata");
            }
            throw new NoWhenBranchMatchedException();
        }
        h.e.a aVar = (h.e.a) eVar;
        List<h.e.a.C0209a> h9 = aVar.h();
        ArrayList arrayList = new ArrayList(n.u(h9, 10));
        for (h.e.a.C0209a c0209a : h9) {
            arrayList.add(new r(c0209a.c(), c0209a.d()));
        }
        k kVar = new k(str, aVar.i(), (String) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, arrayList, 252, (DefaultConstructorMarker) null);
        r rVar = (r) s.M(aVar.g(), arrayList);
        return new FormItem.n(kVar, "appdata", rVar != null ? rVar.e() : null, false, null, 24, null);
    }
}
