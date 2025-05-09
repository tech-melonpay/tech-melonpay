package com.sumsub.sns.internal.core.presentation.intro;

import com.sumsub.sns.internal.core.common.e0;
import com.sumsub.sns.internal.core.data.source.dynamic.b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import ka.C0969n;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.bouncycastle.i18n.MessageBundle;
import org.bouncycastle.i18n.TextBundle;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final b.c f16602a;

    /* renamed from: b, reason: collision with root package name */
    public final Map<String, Object> f16603b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16604c;

    /* renamed from: d, reason: collision with root package name */
    public final String f16605d;

    /* renamed from: e, reason: collision with root package name */
    public final Map<String, Object> f16606e;

    public b(b.c cVar, Map<String, ? extends Object> map, String str, String str2, String str3, boolean z10) {
        this.f16602a = cVar;
        this.f16603b = map;
        this.f16604c = str;
        this.f16605d = str3;
        Map<String, Object> b9 = b();
        LinkedHashMap linkedHashMap = b9 != null ? new LinkedHashMap(b9) : new LinkedHashMap();
        this.f16606e = linkedHashMap;
        f fVar = new f(str, str3, str2);
        e b10 = z10 ? d.b(fVar, cVar) : d.a(fVar, cVar);
        if (linkedHashMap.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            c o10 = b10.o();
            if (o10 != null) {
                arrayList.add(kotlin.collections.a.s(new Pair("type", "single"), new Pair("image", o10.d()), new Pair("header", o10.f()), new Pair(TextBundle.TEXT_ENTRY, o10.e())));
            }
            c k3 = b10.k();
            if (k3 != null) {
                arrayList.add(kotlin.collections.a.s(new Pair("type", "do"), new Pair("image", k3.d()), new Pair("header", k3.f()), new Pair(TextBundle.TEXT_ENTRY, k3.e())));
            }
            c l10 = b10.l();
            if (l10 != null) {
                arrayList.add(kotlin.collections.a.s(new Pair("type", "dont"), new Pair("image", l10.d()), new Pair("header", l10.f()), new Pair(TextBundle.TEXT_ENTRY, l10.e())));
            }
            String n10 = b10.n();
            if (n10 != null) {
                arrayList.add(kotlin.collections.a.s(new Pair("type", "image"), new Pair("image", n10)));
            }
            String m2 = b10.m();
            if (m2 != null) {
                arrayList.add(kotlin.collections.a.s(new Pair("type", "header"), new Pair("header", m2)));
            }
            String q10 = b10.q();
            if (q10 != null) {
                arrayList.add(kotlin.collections.a.s(new Pair("type", TextBundle.TEXT_ENTRY), new Pair(TextBundle.TEXT_ENTRY, q10)));
            }
            linkedHashMap.put("contentBlocks", arrayList);
        }
        if ((!linkedHashMap.containsKey(MessageBundle.TITLE_ENTRY) || z10) && b10.r() != null) {
            linkedHashMap.put(MessageBundle.TITLE_ENTRY, b10.r());
        }
        if ((!linkedHashMap.containsKey("subtitle") || z10) && b10.p() != null) {
            linkedHashMap.put("subtitle", b10.p());
        }
        if ((!linkedHashMap.containsKey("actionTitle") || z10) && b10.j() != null) {
            linkedHashMap.put("actionTitle", b10.j());
        }
    }

    public final String a() {
        Object obj = c().get("actionTitle");
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v17, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v5, types: [T, java.util.Map<java.lang.String, java.lang.Object>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map<java.lang.String, java.lang.Object> b() {
        /*
            r9 = this;
            r0 = 0
            r1 = 1
            com.sumsub.sns.internal.core.data.source.dynamic.b$c r2 = r9.f16602a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "sns_step_"
            r3.<init>(r4)
            java.lang.String r4 = r9.f16604c
            r3.append(r4)
            r4 = 95
            r3.append(r4)
            java.lang.String r4 = r9.f16605d
            r3.append(r4)
            java.lang.String r4 = "_instructions_definitionKey"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r2 = r2.a(r3)
            r3 = 0
            if (r2 == 0) goto Ld1
            java.util.Map<java.lang.String, java.lang.Object> r4 = r9.f16603b
            if (r4 == 0) goto Ld1
            char[] r5 = new char[r1]
            r6 = 46
            r5[r0] = r6
            java.util.List r2 = ka.C0969n.q0(r2, r5)
            kotlin.jvm.internal.Ref$ObjectRef r5 = new kotlin.jvm.internal.Ref$ObjectRef
            r5.<init>()
            r5.f23179a = r4
            int r4 = r2.size()
            int r4 = r4 - r1
            ha.e r0 = ha.h.V(r0, r4)
            java.util.Iterator r0 = r0.iterator()
        L4c:
            r1 = r0
            ha.d r1 = (ha.C0805d) r1
            boolean r1 = r1.f21231c
            if (r1 == 0) goto Lb6
            r1 = r0
            P9.w r1 = (P9.w) r1
            int r1 = r1.a()
            T r4 = r5.f23179a
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r1 = r2.get(r1)
            java.lang.Object r1 = r4.get(r1)
            boolean r4 = r1 instanceof java.util.Map
            if (r4 == 0) goto L6d
            java.util.Map r1 = (java.util.Map) r1
            goto L6e
        L6d:
            r1 = r3
        L6e:
            if (r1 == 0) goto Ld1
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L7d:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto Laf
            java.lang.Object r6 = r1.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r7 = r6.getKey()
            boolean r8 = r7 instanceof java.lang.String
            if (r8 != 0) goto L92
            r7 = r3
        L92:
            java.lang.String r7 = (java.lang.String) r7
            if (r7 != 0) goto L97
            goto La2
        L97:
            java.lang.Object r6 = r6.getValue()
            boolean r8 = r6 instanceof java.lang.Object
            if (r8 != 0) goto La0
            r6 = r3
        La0:
            if (r6 != 0) goto La4
        La2:
            r8 = r3
            goto La9
        La4:
            kotlin.Pair r8 = new kotlin.Pair
            r8.<init>(r7, r6)
        La9:
            if (r8 == 0) goto L7d
            r4.add(r8)
            goto L7d
        Laf:
            java.util.Map r1 = kotlin.collections.a.v(r4)
            r5.f23179a = r1
            goto L4c
        Lb6:
            T r0 = r5.f23179a
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r1 = P9.s.R(r2)
            java.lang.Object r0 = r0.get(r1)
            boolean r1 = r0 instanceof java.util.Map
            if (r1 == 0) goto Lcf
            boolean r1 = r0 instanceof da.InterfaceC0701a
            if (r1 == 0) goto Lce
            boolean r1 = r0 instanceof da.c
            if (r1 == 0) goto Lcf
        Lce:
            r3 = r0
        Lcf:
            java.util.Map r3 = (java.util.Map) r3
        Ld1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.presentation.intro.b.b():java.util.Map");
    }

    public final Map<String, Object> c() {
        return this.f16606e;
    }

    public final boolean f() {
        if (e0.f15081a.getInstructionsViewHandler() == null) {
            Object obj = this.f16606e.get(MessageBundle.TITLE_ENTRY);
            String str = obj instanceof String ? (String) obj : null;
            if (str == null || C0969n.i0(str)) {
                return false;
            }
        }
        return true;
    }

    public /* synthetic */ b(b.c cVar, Map map, String str, String str2, String str3, boolean z10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, map, str, str2, str3, (i & 32) != 0 ? false : z10);
    }
}
