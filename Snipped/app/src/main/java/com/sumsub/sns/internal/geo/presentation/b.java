package com.sumsub.sns.internal.geo.presentation;

import P9.n;
import com.sumsub.sns.internal.core.data.model.FieldName;
import com.sumsub.sns.internal.core.data.model.p;
import com.sumsub.sns.internal.core.data.source.applicant.remote.k;
import com.sumsub.sns.internal.core.data.source.applicant.remote.r;
import com.sumsub.sns.internal.core.presentation.form.model.FormItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ka.C0969n;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class b {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17406a;

        static {
            int[] iArr = new int[FieldName.values().length];
            iArr[FieldName.country.ordinal()] = 1;
            iArr[FieldName.town.ordinal()] = 2;
            iArr[FieldName.street.ordinal()] = 3;
            iArr[FieldName.subStreet.ordinal()] = 4;
            iArr[FieldName.postCode.ordinal()] = 5;
            iArr[FieldName.flatNumber.ordinal()] = 6;
            iArr[FieldName.buildingNumber.ordinal()] = 7;
            iArr[FieldName.state.ordinal()] = 8;
            f17406a = iArr;
        }
    }

    public static final FormItem a(com.sumsub.sns.internal.geo.presentation.a aVar, com.sumsub.sns.internal.core.presentation.form.model.d dVar, Map<String, ? extends Map<String, String>> map) {
        FormItem.p pVar;
        Set<Map.Entry<String, String>> entrySet;
        k a10 = a(aVar);
        FieldName q10 = aVar.g().q();
        r4 = null;
        ArrayList arrayList = null;
        switch (q10 == null ? -1 : a.f17406a[q10.ordinal()]) {
            case 1:
                Map<String, String> h9 = dVar.c().h();
                if (h9 == null) {
                    h9 = kotlin.collections.a.p();
                }
                Map<String, String> map2 = h9;
                CharSequence j10 = aVar.j();
                String obj = j10 != null ? j10.toString() : null;
                CharSequence j11 = aVar.j();
                return new FormItem.c("geo+poa", a10, map2, obj, j11 == null || C0969n.i0(j11), aVar.f());
            case 2:
                CharSequence j12 = aVar.j();
                String obj2 = j12 != null ? j12.toString() : null;
                CharSequence j13 = aVar.j();
                pVar = new FormItem.p(a10, "geo+poa", obj2, j13 == null || C0969n.i0(j13), aVar.f(), null, 32, null);
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                CharSequence j14 = aVar.j();
                pVar = new FormItem.p(a10, "geo+poa", j14 != null ? j14.toString() : null, false, aVar.f(), null, 40, null);
                break;
            case 8:
                CharSequence j15 = aVar.j();
                String obj3 = j15 != null ? j15.toString() : null;
                CharSequence j16 = aVar.j();
                boolean z10 = j16 == null || C0969n.i0(j16);
                CharSequence f10 = aVar.f();
                FieldName q11 = aVar.g().q();
                String value = q11 != null ? q11.getValue() : null;
                CharSequence i = aVar.i();
                String obj4 = i != null ? i.toString() : null;
                CharSequence h10 = aVar.h();
                String obj5 = h10 != null ? h10.toString() : null;
                Boolean valueOf = Boolean.valueOf(aVar.g().getIsRequired());
                String i9 = dVar.c().i();
                if (i9 == null) {
                    i9 = "";
                }
                Map<String, String> map3 = map.get(i9);
                if (map3 != null && (entrySet = map3.entrySet()) != null) {
                    arrayList = new ArrayList(n.u(entrySet, 10));
                    Iterator<T> it = entrySet.iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        arrayList.add(new r((String) entry.getKey(), (String) entry.getValue()));
                    }
                }
                return new FormItem.n(new k(value, obj4, obj5, (String) null, valueOf, (String) null, (String) null, (String) null, arrayList, 232, (DefaultConstructorMarker) null), "geo+poa", obj3, z10, f10);
            default:
                return null;
        }
        return pVar;
    }

    public static final k a(com.sumsub.sns.internal.geo.presentation.a aVar) {
        String b9 = aVar.g().b();
        CharSequence i = aVar.i();
        String obj = i != null ? i.toString() : null;
        CharSequence h9 = aVar.h();
        return new k(b9, obj, h9 != null ? h9.toString() : null, (String) null, Boolean.valueOf(aVar.g().getIsRequired()), p.f15543c, (String) null, (String) null, (List) null, 456, (DefaultConstructorMarker) null);
    }
}
