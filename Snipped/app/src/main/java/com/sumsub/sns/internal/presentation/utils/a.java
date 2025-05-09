package com.sumsub.sns.internal.presentation.utils;

import ca.InterfaceC0650p;
import com.sumsub.sns.internal.core.data.model.FieldName;
import com.sumsub.sns.internal.core.data.model.h;
import com.sumsub.sns.internal.core.data.source.applicant.remote.k;
import com.sumsub.sns.internal.core.data.source.applicant.remote.r;
import com.sumsub.sns.internal.core.data.source.dynamic.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: com.sumsub.sns.internal.presentation.utils.a$a, reason: collision with other inner class name */
    public static final class C0348a extends Lambda implements InterfaceC0650p<String, String, String> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.c f18978a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0348a(b.c cVar) {
            super(2);
            this.f18978a = cVar;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str, String str2) {
            return this.f18978a.a(String.format("sns_data_%s_%s", Arrays.copyOf(new Object[]{str, str2}, 2)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:178:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.sumsub.sns.internal.core.presentation.form.model.FormItem a(com.sumsub.sns.internal.core.data.model.h.d r30, java.lang.String r31, com.sumsub.sns.internal.core.data.model.e r32, com.sumsub.sns.internal.domain.c r33, com.sumsub.sns.internal.core.data.source.dynamic.b.c r34, ca.InterfaceC0650p<? super java.lang.String, ? super java.lang.String, java.lang.String> r35, java.lang.CharSequence r36, java.lang.Boolean r37, ca.InterfaceC0646l<? super com.sumsub.sns.internal.core.data.model.FieldName, java.lang.String> r38) {
        /*
            Method dump skipped, instructions count: 1124
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.presentation.utils.a.a(com.sumsub.sns.internal.core.data.model.h$d, java.lang.String, com.sumsub.sns.internal.core.data.model.e, com.sumsub.sns.internal.domain.c, com.sumsub.sns.internal.core.data.source.dynamic.b$c, ca.p, java.lang.CharSequence, java.lang.Boolean, ca.l):com.sumsub.sns.internal.core.presentation.form.model.FormItem");
    }

    public static /* synthetic */ k a(h.d dVar, b.c cVar, List list, InterfaceC0650p interfaceC0650p, Boolean bool, int i, Object obj) {
        if ((i & 8) != 0) {
            bool = null;
        }
        return a(dVar, cVar, list, interfaceC0650p, bool);
    }

    public static final k a(h.d dVar, b.c cVar, List<r> list, InterfaceC0650p<? super String, ? super String, String> interfaceC0650p, Boolean bool) {
        FieldName q10 = dVar.q();
        String value = q10 != null ? q10.getValue() : null;
        FieldName q11 = dVar.q();
        String invoke = interfaceC0650p.invoke("field", q11 != null ? q11.getValue() : null);
        FieldName q12 = dVar.q();
        return new k(value, invoke, interfaceC0650p.invoke("hint", q12 != null ? q12.getValue() : null), (String) null, Boolean.valueOf(bool != null ? bool.booleanValue() : dVar.getIsRequired()), (String) null, a(dVar, cVar), (String) null, list, 168, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ k a(h.d dVar, b.c cVar, String str, InterfaceC0650p interfaceC0650p, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return a(dVar, cVar, str, interfaceC0650p);
    }

    public static final k a(h.d dVar, b.c cVar, String str, InterfaceC0650p<? super String, ? super String, String> interfaceC0650p) {
        String b9 = dVar.b();
        FieldName q10 = dVar.q();
        String invoke = interfaceC0650p.invoke("field", q10 != null ? q10.getValue() : null);
        FieldName q11 = dVar.q();
        return new k(b9, invoke, interfaceC0650p.invoke("hint", q11 != null ? q11.getValue() : null), (String) null, Boolean.valueOf(dVar.getIsRequired()), str, a(dVar, cVar), (String) null, (List) null, 392, (DefaultConstructorMarker) null);
    }

    public static final String a(h.d dVar, b.c cVar) {
        String s10 = dVar.s();
        if (s10 != null) {
            return s10;
        }
        if (dVar.getIsRequired()) {
            return cVar.a("sns_data_placeholder_required");
        }
        return cVar.a("sns_data_placeholder_optional");
    }

    public static final List<r> a(Map<String, String> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(new r(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }
}
