package com.sumsub.sns.internal.presentation.screen.questionnary.model;

import P9.m;
import P9.n;
import P9.s;
import P9.z;
import ca.InterfaceC0646l;
import com.sumsub.sns.internal.core.data.model.FieldType;
import com.sumsub.sns.internal.core.data.model.p;
import com.sumsub.sns.internal.core.data.source.applicant.remote.c0;
import com.sumsub.sns.internal.core.data.source.applicant.remote.k;
import com.sumsub.sns.internal.core.data.source.applicant.remote.u;
import com.sumsub.sns.internal.core.data.source.applicant.remote.w;
import com.sumsub.sns.internal.core.data.source.applicant.remote.y;
import com.sumsub.sns.internal.core.presentation.form.b;
import com.sumsub.sns.internal.core.presentation.form.model.FormItem;
import com.sumsub.sns.internal.core.presentation.form.model.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class b {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18789a;

        static {
            int[] iArr = new int[FieldType.values().length];
            iArr[FieldType.text.ordinal()] = 1;
            iArr[FieldType.textArea.ordinal()] = 2;
            iArr[FieldType.phone.ordinal()] = 3;
            iArr[FieldType.date.ordinal()] = 4;
            iArr[FieldType.dateTime.ordinal()] = 5;
            iArr[FieldType.bool.ordinal()] = 6;
            iArr[FieldType.select.ordinal()] = 7;
            iArr[FieldType.selectDropdown.ordinal()] = 8;
            iArr[FieldType.multiSelect.ordinal()] = 9;
            iArr[FieldType.countrySelect.ordinal()] = 10;
            iArr[FieldType.fileAttachment.ordinal()] = 11;
            iArr[FieldType.multiFileAttachments.ordinal()] = 12;
            f18789a = iArr;
        }
    }

    public static final List<b.C0241b> a(w wVar, com.sumsub.sns.internal.core.presentation.form.model.d dVar, y yVar, Map<String, String> map, InterfaceC0646l<? super String, String> interfaceC0646l) {
        u uVar;
        List<u> e10;
        Object obj;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = null;
        if (yVar == null || (e10 = yVar.e()) == null) {
            uVar = null;
        } else {
            Iterator<T> it = e10.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.f.b(((u) obj).c(), wVar.o())) {
                    break;
                }
            }
            uVar = (u) obj;
        }
        List<c0> u6 = wVar.u();
        if (u6 != null) {
            int i = 0;
            ArrayList arrayList3 = null;
            for (Object obj2 : u6) {
                int i9 = i + 1;
                if (i < 0) {
                    m.t();
                    throw null;
                }
                c0 c0Var = (c0) obj2;
                if (kotlin.jvm.internal.f.b(c0Var.l(), Boolean.TRUE)) {
                    if (arrayList3 != null) {
                        arrayList.add(new b.C0241b(arrayList.size(), wVar.w(), wVar.m(), new ArrayList(arrayList3)));
                    }
                    arrayList3 = null;
                    i = i9;
                } else {
                    k kVar = new k((String) null, c0Var.t(), c0Var.n(), "section", Boolean.FALSE, (String) null, (String) null, c0Var.h(), (List) null, 256, (DefaultConstructorMarker) null);
                    String p10 = c0Var.p();
                    if (p10 == null) {
                        p10 = "sectionId";
                    }
                    FormItem.l lVar = new FormItem.l(kVar, p10);
                    lVar.a(c0Var.h());
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    ArrayList arrayList4 = arrayList3;
                    arrayList4.add(lVar);
                    List<k> r8 = c0Var.r();
                    if (r8 != null) {
                        for (k kVar2 : r8) {
                            String p11 = c0Var.p();
                            if (p11 == null) {
                                p11 = "";
                            }
                            FormItem a10 = a(kVar2, p11, dVar, uVar, map, interfaceC0646l);
                            if (a10 != null) {
                                arrayList4.add(a10);
                            }
                        }
                    }
                    i = i9;
                    arrayList3 = arrayList4;
                }
            }
            arrayList2 = arrayList3;
        }
        if (arrayList2 != null) {
            int size = arrayList.size();
            String w2 = wVar.w();
            String m2 = wVar.m();
            Collection c02 = s.c0(arrayList2);
            if (c02 == null) {
                c02 = EmptyList.f23104a;
            }
            arrayList.add(new b.C0241b(size, w2, m2, new ArrayList(c02)));
        }
        return arrayList;
    }

    public static final FormItem a(k kVar, String str, com.sumsub.sns.internal.core.presentation.form.model.d dVar, u uVar, Map<String, String> map, InterfaceC0646l<? super String, String> interfaceC0646l) {
        FormItem formItem;
        String str2;
        LinkedHashMap linkedHashMap;
        String n10;
        FieldType c2 = g.c(kVar);
        switch (c2 == null ? -1 : a.f18789a[c2.ordinal()]) {
            case -1:
                formItem = null;
                break;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                if (g.a(kVar) instanceof p.m) {
                    Map<String, String> h9 = dVar.c().h();
                    if (h9 == null) {
                        h9 = kotlin.collections.a.p();
                    }
                    Map<String, String> map2 = h9;
                    Map<String, com.sumsub.sns.internal.core.data.model.remote.c> k3 = dVar.c().k();
                    if (k3 == null) {
                        k3 = kotlin.collections.a.p();
                    }
                    formItem = new FormItem.k(str, kVar, map2, k3, dVar.c().i(), false, uVar != null ? c.a(uVar, str, kVar.p()) : null, null, 160, null);
                    break;
                } else {
                    formItem = new FormItem.p(kVar, str, uVar != null ? c.a(uVar, str, kVar.p()) : null, true, null, null, 48, null);
                    break;
                }
            case 2:
                formItem = new FormItem.q(kVar, str, uVar != null ? c.a(uVar, str, kVar.p()) : null, null, 8, null);
                break;
            case 3:
                Map<String, String> h10 = dVar.c().h();
                if (h10 == null) {
                    h10 = kotlin.collections.a.p();
                }
                Map<String, String> map3 = h10;
                Map<String, com.sumsub.sns.internal.core.data.model.remote.c> k10 = dVar.c().k();
                if (k10 == null) {
                    k10 = kotlin.collections.a.p();
                }
                formItem = new FormItem.k(str, kVar, map3, k10, dVar.c().i(), false, uVar != null ? c.a(uVar, str, kVar.p()) : null, null, 160, null);
                break;
            case 4:
                formItem = new FormItem.d(kVar, str, false, uVar != null ? c.a(uVar, str, kVar.p()) : null, null, 20, null);
                break;
            case 5:
                formItem = new FormItem.e(kVar, str, uVar != null ? c.a(uVar, str, kVar.p()) : null, null, 8, null);
                break;
            case 6:
                formItem = new FormItem.a(kVar, str, uVar != null ? c.a(uVar, str, kVar.p()) : null, null, 8, null);
                break;
            case 7:
                formItem = new FormItem.m(kVar, str, uVar != null ? c.a(uVar, str, kVar.p()) : null, null, 8, null);
                break;
            case 8:
                formItem = new FormItem.n(kVar, str, uVar != null ? c.a(uVar, str, kVar.p()) : null, false, null, 24, null);
                break;
            case 9:
                formItem = new FormItem.j(kVar, str, uVar != null ? c.b(uVar, str, kVar.p()) : null, null, false, 24, null);
                break;
            case 10:
                Map<String, String> h11 = dVar.c().h();
                if (h11 == null) {
                    h11 = kotlin.collections.a.p();
                }
                formItem = new FormItem.c(str, kVar, h11, uVar != null ? c.a(uVar, str, kVar.p()) : null, true, null, 32, null);
                break;
            case 11:
                String a10 = uVar != null ? c.a(uVar, str, kVar.p()) : null;
                String str3 = map.get("sns_quiestionnaire_action_addFile");
                if (uVar == null || (str2 = c.a(uVar, str, kVar.p())) == null) {
                    str2 = "";
                }
                formItem = new FormItem.g(kVar, str, a10, str3, null, null, null, interfaceC0646l.invoke(str2), 112, null);
                break;
            case 12:
                List<String> b9 = uVar != null ? c.b(uVar, str, kVar.p()) : null;
                k kVar2 = (kotlin.jvm.internal.f.b(kVar.v(), Boolean.TRUE) && ((n10 = kVar.n()) == null || n10.length() == 0)) ? null : kVar;
                if (kVar2 == null) {
                    kVar2 = kVar.a((r20 & 1) != 0 ? kVar.id : null, (r20 & 2) != 0 ? kVar.org.bouncycastle.i18n.MessageBundle.TITLE_ENTRY java.lang.String : null, (r20 & 4) != 0 ? kVar.desc : null, (r20 & 8) != 0 ? kVar.type : null, (r20 & 16) != 0 ? kVar.required : null, (r20 & 32) != 0 ? kVar.format : "min_value:1", (r20 & 64) != 0 ? kVar.placeholder : null, (r20 & 128) != 0 ? kVar.condition : null, (r20 & 256) != 0 ? kVar.options : null);
                }
                k kVar3 = kVar2;
                String str4 = map.get("sns_quiestionnaire_action_addFile");
                if (b9 != null) {
                    int n11 = z.n(n.u(b9, 10));
                    if (n11 < 16) {
                        n11 = 16;
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(n11);
                    for (String str5 : b9) {
                        linkedHashMap2.put(str5, interfaceC0646l.invoke(str5));
                    }
                    linkedHashMap = linkedHashMap2;
                } else {
                    linkedHashMap = null;
                }
                formItem = new FormItem.i(kVar3, str, b9, str4, null, false, null, null, linkedHashMap, 240, null);
                break;
        }
        if (formItem == null) {
            return null;
        }
        formItem.a(kVar.j());
        return formItem;
    }
}
