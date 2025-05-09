package com.sumsub.sns.internal.core.data.model;

import P9.z;
import com.sumsub.sns.internal.core.data.model.g;
import com.sumsub.sns.internal.core.data.model.h;
import com.sumsub.sns.internal.core.data.model.remote.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ka.C0969n;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class f {
    public static final Map<String, String> a(Map<String, String> map, g gVar) {
        g.c I10;
        List<String> h9;
        LinkedHashMap linkedHashMap;
        g.c I11;
        List<String> i;
        if (gVar != null && (I11 = gVar.I()) != null && (i = I11.i()) != null) {
            if (!(!i.isEmpty())) {
                i = null;
            }
            if (i != null) {
                linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    if (i.contains(entry.getKey())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                return linkedHashMap;
            }
        }
        if (gVar == null || (I10 = gVar.I()) == null || (h9 = I10.h()) == null) {
            return map;
        }
        if ((h9.isEmpty() ^ true ? h9 : null) == null) {
            return map;
        }
        linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry2 : map.entrySet()) {
            if (!r0.contains(entry2.getKey())) {
                linkedHashMap.put(entry2.getKey(), entry2.getValue());
            }
        }
        return linkedHashMap;
    }

    public static final String b(e eVar, String str) {
        Object C10;
        if (str == null || (C10 = eVar.C()) == null) {
            return null;
        }
        List<String> r02 = C0969n.r0(str, new String[]{"."});
        if (r02.isEmpty()) {
            return null;
        }
        for (String str2 : r02) {
            if (C10 instanceof Map) {
                C10 = ((Map) C10).get(str2);
            }
            if (C10 instanceof String) {
                return (String) C10;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005d A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v15, types: [T, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean d(com.sumsub.sns.internal.core.data.model.e r9, java.lang.String r10) {
        /*
            r0 = 1
            java.util.Map r1 = r9.E()     // Catch: java.lang.Exception -> L4a
            r2 = 0
            if (r1 == 0) goto Laa
            java.lang.String r3 = "steps"
            java.lang.String r4 = "documentSelectorMode"
            java.lang.String[] r10 = new java.lang.String[]{r3, r10, r4}     // Catch: java.lang.Exception -> L4a
            java.util.List r10 = P9.m.q(r10)     // Catch: java.lang.Exception -> L4a
            kotlin.jvm.internal.Ref$ObjectRef r3 = new kotlin.jvm.internal.Ref$ObjectRef     // Catch: java.lang.Exception -> L4a
            r3.<init>()     // Catch: java.lang.Exception -> L4a
            r3.f23179a = r1     // Catch: java.lang.Exception -> L4a
            int r1 = r10.size()     // Catch: java.lang.Exception -> L4a
            int r1 = r1 - r0
            r4 = 0
            ha.e r1 = ha.h.V(r4, r1)     // Catch: java.lang.Exception -> L4a
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> L4a
        L29:
            r4 = r1
            ha.d r4 = (ha.C0805d) r4     // Catch: java.lang.Exception -> L4a
            boolean r4 = r4.f21231c     // Catch: java.lang.Exception -> L4a
            if (r4 == 0) goto L96
            r4 = r1
            P9.w r4 = (P9.w) r4     // Catch: java.lang.Exception -> L4a
            int r4 = r4.a()     // Catch: java.lang.Exception -> L4a
            T r5 = r3.f23179a     // Catch: java.lang.Exception -> L4a
            java.util.Map r5 = (java.util.Map) r5     // Catch: java.lang.Exception -> L4a
            java.lang.Object r4 = r10.get(r4)     // Catch: java.lang.Exception -> L4a
            java.lang.Object r4 = r5.get(r4)     // Catch: java.lang.Exception -> L4a
            boolean r5 = r4 instanceof java.util.Map     // Catch: java.lang.Exception -> L4a
            if (r5 == 0) goto L4d
            java.util.Map r4 = (java.util.Map) r4     // Catch: java.lang.Exception -> L4a
            goto L4e
        L4a:
            r10 = move-exception
            goto Lb1
        L4d:
            r4 = r2
        L4e:
            if (r4 == 0) goto Laa
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Exception -> L4a
            r5.<init>()     // Catch: java.lang.Exception -> L4a
            java.util.Set r4 = r4.entrySet()     // Catch: java.lang.Exception -> L4a
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Exception -> L4a
        L5d:
            boolean r6 = r4.hasNext()     // Catch: java.lang.Exception -> L4a
            if (r6 == 0) goto L8f
            java.lang.Object r6 = r4.next()     // Catch: java.lang.Exception -> L4a
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch: java.lang.Exception -> L4a
            java.lang.Object r7 = r6.getKey()     // Catch: java.lang.Exception -> L4a
            boolean r8 = r7 instanceof java.lang.String     // Catch: java.lang.Exception -> L4a
            if (r8 != 0) goto L72
            r7 = r2
        L72:
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> L4a
            if (r7 != 0) goto L77
            goto L82
        L77:
            java.lang.Object r6 = r6.getValue()     // Catch: java.lang.Exception -> L4a
            boolean r8 = r6 instanceof java.lang.Object     // Catch: java.lang.Exception -> L4a
            if (r8 != 0) goto L80
            r6 = r2
        L80:
            if (r6 != 0) goto L84
        L82:
            r8 = r2
            goto L89
        L84:
            kotlin.Pair r8 = new kotlin.Pair     // Catch: java.lang.Exception -> L4a
            r8.<init>(r7, r6)     // Catch: java.lang.Exception -> L4a
        L89:
            if (r8 == 0) goto L5d
            r5.add(r8)     // Catch: java.lang.Exception -> L4a
            goto L5d
        L8f:
            java.util.Map r4 = kotlin.collections.a.v(r5)     // Catch: java.lang.Exception -> L4a
            r3.f23179a = r4     // Catch: java.lang.Exception -> L4a
            goto L29
        L96:
            T r1 = r3.f23179a     // Catch: java.lang.Exception -> L4a
            java.util.Map r1 = (java.util.Map) r1     // Catch: java.lang.Exception -> L4a
            java.lang.Object r10 = P9.s.R(r10)     // Catch: java.lang.Exception -> L4a
            java.lang.Object r10 = r1.get(r10)     // Catch: java.lang.Exception -> L4a
            boolean r1 = r10 instanceof java.lang.String     // Catch: java.lang.Exception -> L4a
            if (r1 != 0) goto La7
            goto La8
        La7:
            r2 = r10
        La8:
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L4a
        Laa:
            java.lang.String r10 = "disabled"
            boolean r0 = kotlin.jvm.internal.f.b(r2, r10)     // Catch: java.lang.Exception -> L4a
            goto Lcc
        Lb1:
            com.sumsub.sns.internal.log.a r1 = com.sumsub.sns.internal.log.a.f17535a
            java.lang.String r2 = com.sumsub.sns.internal.log.c.a(r9)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Can't parse documentSelectorMode "
            r3.<init>(r4)
            java.util.Map r9 = r9.E()
            r3.append(r9)
            java.lang.String r9 = r3.toString()
            com.sumsub.sns.internal.log.b.b(r1, r2, r9, r10)
        Lcc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.data.model.f.d(com.sumsub.sns.internal.core.data.model.e, java.lang.String):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0057 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v13, types: [T, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean f(com.sumsub.sns.internal.core.data.model.e r10) {
        /*
            r0 = 0
            java.util.Map r1 = r10.E()     // Catch: java.lang.Exception -> L44
            if (r1 == 0) goto Lc6
            java.lang.String r2 = "disableStepsScreen"
            java.util.List r2 = java.util.Collections.singletonList(r2)     // Catch: java.lang.Exception -> L44
            kotlin.jvm.internal.Ref$ObjectRef r3 = new kotlin.jvm.internal.Ref$ObjectRef     // Catch: java.lang.Exception -> L44
            r3.<init>()     // Catch: java.lang.Exception -> L44
            r3.f23179a = r1     // Catch: java.lang.Exception -> L44
            int r1 = r2.size()     // Catch: java.lang.Exception -> L44
            int r1 = r1 + (-1)
            ha.e r1 = ha.h.V(r0, r1)     // Catch: java.lang.Exception -> L44
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> L44
        L22:
            r4 = r1
            ha.d r4 = (ha.C0805d) r4     // Catch: java.lang.Exception -> L44
            boolean r4 = r4.f21231c     // Catch: java.lang.Exception -> L44
            r5 = 0
            if (r4 == 0) goto L90
            r4 = r1
            P9.w r4 = (P9.w) r4     // Catch: java.lang.Exception -> L44
            int r4 = r4.a()     // Catch: java.lang.Exception -> L44
            T r6 = r3.f23179a     // Catch: java.lang.Exception -> L44
            java.util.Map r6 = (java.util.Map) r6     // Catch: java.lang.Exception -> L44
            java.lang.Object r4 = r2.get(r4)     // Catch: java.lang.Exception -> L44
            java.lang.Object r4 = r6.get(r4)     // Catch: java.lang.Exception -> L44
            boolean r6 = r4 instanceof java.util.Map     // Catch: java.lang.Exception -> L44
            if (r6 == 0) goto L47
            java.util.Map r4 = (java.util.Map) r4     // Catch: java.lang.Exception -> L44
            goto L48
        L44:
            r1 = move-exception
            goto Lab
        L47:
            r4 = r5
        L48:
            if (r4 == 0) goto La4
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Exception -> L44
            r6.<init>()     // Catch: java.lang.Exception -> L44
            java.util.Set r4 = r4.entrySet()     // Catch: java.lang.Exception -> L44
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Exception -> L44
        L57:
            boolean r7 = r4.hasNext()     // Catch: java.lang.Exception -> L44
            if (r7 == 0) goto L89
            java.lang.Object r7 = r4.next()     // Catch: java.lang.Exception -> L44
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch: java.lang.Exception -> L44
            java.lang.Object r8 = r7.getKey()     // Catch: java.lang.Exception -> L44
            boolean r9 = r8 instanceof java.lang.String     // Catch: java.lang.Exception -> L44
            if (r9 != 0) goto L6c
            r8 = r5
        L6c:
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Exception -> L44
            if (r8 != 0) goto L71
            goto L7c
        L71:
            java.lang.Object r7 = r7.getValue()     // Catch: java.lang.Exception -> L44
            boolean r9 = r7 instanceof java.lang.Object     // Catch: java.lang.Exception -> L44
            if (r9 != 0) goto L7a
            r7 = r5
        L7a:
            if (r7 != 0) goto L7e
        L7c:
            r9 = r5
            goto L83
        L7e:
            kotlin.Pair r9 = new kotlin.Pair     // Catch: java.lang.Exception -> L44
            r9.<init>(r8, r7)     // Catch: java.lang.Exception -> L44
        L83:
            if (r9 == 0) goto L57
            r6.add(r9)     // Catch: java.lang.Exception -> L44
            goto L57
        L89:
            java.util.Map r4 = kotlin.collections.a.v(r6)     // Catch: java.lang.Exception -> L44
            r3.f23179a = r4     // Catch: java.lang.Exception -> L44
            goto L22
        L90:
            T r1 = r3.f23179a     // Catch: java.lang.Exception -> L44
            java.util.Map r1 = (java.util.Map) r1     // Catch: java.lang.Exception -> L44
            java.lang.Object r2 = P9.s.R(r2)     // Catch: java.lang.Exception -> L44
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Exception -> L44
            boolean r2 = r1 instanceof java.lang.Boolean     // Catch: java.lang.Exception -> L44
            if (r2 != 0) goto La1
            goto La2
        La1:
            r5 = r1
        La2:
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Exception -> L44
        La4:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L44
            boolean r0 = kotlin.jvm.internal.f.b(r5, r1)     // Catch: java.lang.Exception -> L44
            goto Lc6
        Lab:
            com.sumsub.sns.internal.log.a r2 = com.sumsub.sns.internal.log.a.f17535a
            java.lang.String r3 = com.sumsub.sns.internal.log.c.a(r10)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Can't parse "
            r4.<init>(r5)
            java.util.Map r10 = r10.E()
            r4.append(r10)
            java.lang.String r10 = r4.toString()
            com.sumsub.sns.internal.log.b.b(r2, r3, r10, r1)
        Lc6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.data.model.f.f(com.sumsub.sns.internal.core.data.model.e):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0057 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v13, types: [T, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean h(com.sumsub.sns.internal.core.data.model.e r10) {
        /*
            r0 = 0
            java.util.Map r1 = r10.E()     // Catch: java.lang.Exception -> L44
            if (r1 == 0) goto Lc6
            java.lang.String r2 = "disableTemporarilyDeclinedStatusScreen"
            java.util.List r2 = java.util.Collections.singletonList(r2)     // Catch: java.lang.Exception -> L44
            kotlin.jvm.internal.Ref$ObjectRef r3 = new kotlin.jvm.internal.Ref$ObjectRef     // Catch: java.lang.Exception -> L44
            r3.<init>()     // Catch: java.lang.Exception -> L44
            r3.f23179a = r1     // Catch: java.lang.Exception -> L44
            int r1 = r2.size()     // Catch: java.lang.Exception -> L44
            int r1 = r1 + (-1)
            ha.e r1 = ha.h.V(r0, r1)     // Catch: java.lang.Exception -> L44
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> L44
        L22:
            r4 = r1
            ha.d r4 = (ha.C0805d) r4     // Catch: java.lang.Exception -> L44
            boolean r4 = r4.f21231c     // Catch: java.lang.Exception -> L44
            r5 = 0
            if (r4 == 0) goto L90
            r4 = r1
            P9.w r4 = (P9.w) r4     // Catch: java.lang.Exception -> L44
            int r4 = r4.a()     // Catch: java.lang.Exception -> L44
            T r6 = r3.f23179a     // Catch: java.lang.Exception -> L44
            java.util.Map r6 = (java.util.Map) r6     // Catch: java.lang.Exception -> L44
            java.lang.Object r4 = r2.get(r4)     // Catch: java.lang.Exception -> L44
            java.lang.Object r4 = r6.get(r4)     // Catch: java.lang.Exception -> L44
            boolean r6 = r4 instanceof java.util.Map     // Catch: java.lang.Exception -> L44
            if (r6 == 0) goto L47
            java.util.Map r4 = (java.util.Map) r4     // Catch: java.lang.Exception -> L44
            goto L48
        L44:
            r1 = move-exception
            goto Lab
        L47:
            r4 = r5
        L48:
            if (r4 == 0) goto La4
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Exception -> L44
            r6.<init>()     // Catch: java.lang.Exception -> L44
            java.util.Set r4 = r4.entrySet()     // Catch: java.lang.Exception -> L44
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Exception -> L44
        L57:
            boolean r7 = r4.hasNext()     // Catch: java.lang.Exception -> L44
            if (r7 == 0) goto L89
            java.lang.Object r7 = r4.next()     // Catch: java.lang.Exception -> L44
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch: java.lang.Exception -> L44
            java.lang.Object r8 = r7.getKey()     // Catch: java.lang.Exception -> L44
            boolean r9 = r8 instanceof java.lang.String     // Catch: java.lang.Exception -> L44
            if (r9 != 0) goto L6c
            r8 = r5
        L6c:
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Exception -> L44
            if (r8 != 0) goto L71
            goto L7c
        L71:
            java.lang.Object r7 = r7.getValue()     // Catch: java.lang.Exception -> L44
            boolean r9 = r7 instanceof java.lang.Object     // Catch: java.lang.Exception -> L44
            if (r9 != 0) goto L7a
            r7 = r5
        L7a:
            if (r7 != 0) goto L7e
        L7c:
            r9 = r5
            goto L83
        L7e:
            kotlin.Pair r9 = new kotlin.Pair     // Catch: java.lang.Exception -> L44
            r9.<init>(r8, r7)     // Catch: java.lang.Exception -> L44
        L83:
            if (r9 == 0) goto L57
            r6.add(r9)     // Catch: java.lang.Exception -> L44
            goto L57
        L89:
            java.util.Map r4 = kotlin.collections.a.v(r6)     // Catch: java.lang.Exception -> L44
            r3.f23179a = r4     // Catch: java.lang.Exception -> L44
            goto L22
        L90:
            T r1 = r3.f23179a     // Catch: java.lang.Exception -> L44
            java.util.Map r1 = (java.util.Map) r1     // Catch: java.lang.Exception -> L44
            java.lang.Object r2 = P9.s.R(r2)     // Catch: java.lang.Exception -> L44
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Exception -> L44
            boolean r2 = r1 instanceof java.lang.Boolean     // Catch: java.lang.Exception -> L44
            if (r2 != 0) goto La1
            goto La2
        La1:
            r5 = r1
        La2:
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Exception -> L44
        La4:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L44
            boolean r0 = kotlin.jvm.internal.f.b(r5, r1)     // Catch: java.lang.Exception -> L44
            goto Lc6
        Lab:
            com.sumsub.sns.internal.log.a r2 = com.sumsub.sns.internal.log.a.f17535a
            java.lang.String r3 = com.sumsub.sns.internal.log.c.a(r10)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Can't parse disableTemporarilyDeclinedStatusScreen "
            r4.<init>(r5)
            java.util.Map r10 = r10.E()
            r4.append(r10)
            java.lang.String r10 = r4.toString()
            com.sumsub.sns.internal.log.b.b(r2, r3, r10, r1)
        Lc6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.data.model.f.h(com.sumsub.sns.internal.core.data.model.e):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x009a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.util.Map<java.lang.String, java.lang.String> j(com.sumsub.sns.internal.core.data.model.e r5) {
        /*
            java.util.Map r5 = r5.C()
            r0 = 0
            if (r5 == 0) goto Le
            java.lang.String r1 = "idDocErrors"
            java.lang.Object r5 = r5.get(r1)
            goto Lf
        Le:
            r5 = r0
        Lf:
            boolean r1 = r5 instanceof java.util.Map
            if (r1 == 0) goto L16
            java.util.Map r5 = (java.util.Map) r5
            goto L17
        L16:
            r5 = r0
        L17:
            if (r5 == 0) goto L4e
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L26:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L4f
            java.lang.Object r2 = r5.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            boolean r3 = r3 instanceof java.lang.String
            if (r3 == 0) goto L26
            java.lang.Object r3 = r2.getValue()
            boolean r3 = r3 instanceof java.lang.String
            if (r3 == 0) goto L26
            java.lang.Object r3 = r2.getKey()
            java.lang.Object r2 = r2.getValue()
            r1.put(r3, r2)
            goto L26
        L4e:
            r1 = r0
        L4f:
            if (r1 == 0) goto L5a
            boolean r5 = r1.isEmpty()
            r2 = 1
            r5 = r5 ^ r2
            if (r5 != r2) goto L5a
            goto L5b
        L5a:
            r1 = r0
        L5b:
            if (r1 == 0) goto La2
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L6a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L9e
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            boolean r4 = r3 instanceof java.lang.String
            if (r4 != 0) goto L7f
            r3 = r0
        L7f:
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L84
            goto L91
        L84:
            java.lang.Object r2 = r2.getValue()
            boolean r4 = r2 instanceof java.lang.String
            if (r4 != 0) goto L8d
            r2 = r0
        L8d:
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L93
        L91:
            r4 = r0
            goto L98
        L93:
            kotlin.Pair r4 = new kotlin.Pair
            r4.<init>(r3, r2)
        L98:
            if (r4 == 0) goto L6a
            r5.add(r4)
            goto L6a
        L9e:
            java.util.Map r0 = kotlin.collections.a.v(r5)
        La2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.data.model.f.j(com.sumsub.sns.internal.core.data.model.e):java.util.Map");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x009a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.util.Map<java.lang.String, java.lang.String> k(com.sumsub.sns.internal.core.data.model.e r5) {
        /*
            java.util.Map r5 = r5.C()
            r0 = 0
            if (r5 == 0) goto Le
            java.lang.String r1 = "genders"
            java.lang.Object r5 = r5.get(r1)
            goto Lf
        Le:
            r5 = r0
        Lf:
            boolean r1 = r5 instanceof java.util.Map
            if (r1 == 0) goto L16
            java.util.Map r5 = (java.util.Map) r5
            goto L17
        L16:
            r5 = r0
        L17:
            if (r5 == 0) goto L4e
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L26:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L4f
            java.lang.Object r2 = r5.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            boolean r3 = r3 instanceof java.lang.String
            if (r3 == 0) goto L26
            java.lang.Object r3 = r2.getValue()
            boolean r3 = r3 instanceof java.lang.String
            if (r3 == 0) goto L26
            java.lang.Object r3 = r2.getKey()
            java.lang.Object r2 = r2.getValue()
            r1.put(r3, r2)
            goto L26
        L4e:
            r1 = r0
        L4f:
            if (r1 == 0) goto L5a
            boolean r5 = r1.isEmpty()
            r2 = 1
            r5 = r5 ^ r2
            if (r5 != r2) goto L5a
            goto L5b
        L5a:
            r1 = r0
        L5b:
            if (r1 == 0) goto La2
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L6a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L9e
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            boolean r4 = r3 instanceof java.lang.String
            if (r4 != 0) goto L7f
            r3 = r0
        L7f:
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L84
            goto L91
        L84:
            java.lang.Object r2 = r2.getValue()
            boolean r4 = r2 instanceof java.lang.String
            if (r4 != 0) goto L8d
            r2 = r0
        L8d:
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L93
        L91:
            r4 = r0
            goto L98
        L93:
            kotlin.Pair r4 = new kotlin.Pair
            r4.<init>(r3, r2)
        L98:
            if (r4 == 0) goto L6a
            r5.add(r4)
            goto L6a
        L9e:
            java.util.Map r0 = kotlin.collections.a.v(r5)
        La2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.data.model.f.k(com.sumsub.sns.internal.core.data.model.e):java.util.Map");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x009a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.util.Map<java.lang.String, java.lang.String> l(com.sumsub.sns.internal.core.data.model.e r5) {
        /*
            java.util.Map r5 = r5.C()
            r0 = 0
            if (r5 == 0) goto Le
            java.lang.String r1 = "languages"
            java.lang.Object r5 = r5.get(r1)
            goto Lf
        Le:
            r5 = r0
        Lf:
            boolean r1 = r5 instanceof java.util.Map
            if (r1 == 0) goto L16
            java.util.Map r5 = (java.util.Map) r5
            goto L17
        L16:
            r5 = r0
        L17:
            if (r5 == 0) goto L4e
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L26:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L4f
            java.lang.Object r2 = r5.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            boolean r3 = r3 instanceof java.lang.String
            if (r3 == 0) goto L26
            java.lang.Object r3 = r2.getValue()
            boolean r3 = r3 instanceof java.lang.String
            if (r3 == 0) goto L26
            java.lang.Object r3 = r2.getKey()
            java.lang.Object r2 = r2.getValue()
            r1.put(r3, r2)
            goto L26
        L4e:
            r1 = r0
        L4f:
            if (r1 == 0) goto L5a
            boolean r5 = r1.isEmpty()
            r2 = 1
            r5 = r5 ^ r2
            if (r5 != r2) goto L5a
            goto L5b
        L5a:
            r1 = r0
        L5b:
            if (r1 == 0) goto La2
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L6a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L9e
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            boolean r4 = r3 instanceof java.lang.String
            if (r4 != 0) goto L7f
            r3 = r0
        L7f:
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L84
            goto L91
        L84:
            java.lang.Object r2 = r2.getValue()
            boolean r4 = r2 instanceof java.lang.String
            if (r4 != 0) goto L8d
            r2 = r0
        L8d:
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L93
        L91:
            r4 = r0
            goto L98
        L93:
            kotlin.Pair r4 = new kotlin.Pair
            r4.<init>(r3, r2)
        L98:
            if (r4 == 0) goto L6a
            r5.add(r4)
            goto L6a
        L9e:
            java.util.Map r0 = kotlin.collections.a.v(r5)
        La2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.data.model.f.l(com.sumsub.sns.internal.core.data.model.e):java.util.Map");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0057 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v13, types: [T, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean m(com.sumsub.sns.internal.core.data.model.e r10) {
        /*
            r0 = 0
            java.util.Map r1 = r10.E()     // Catch: java.lang.Exception -> L44
            if (r1 == 0) goto Lc6
            java.lang.String r2 = "livenessSaveMode"
            java.util.List r2 = java.util.Collections.singletonList(r2)     // Catch: java.lang.Exception -> L44
            kotlin.jvm.internal.Ref$ObjectRef r3 = new kotlin.jvm.internal.Ref$ObjectRef     // Catch: java.lang.Exception -> L44
            r3.<init>()     // Catch: java.lang.Exception -> L44
            r3.f23179a = r1     // Catch: java.lang.Exception -> L44
            int r1 = r2.size()     // Catch: java.lang.Exception -> L44
            int r1 = r1 + (-1)
            ha.e r1 = ha.h.V(r0, r1)     // Catch: java.lang.Exception -> L44
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> L44
        L22:
            r4 = r1
            ha.d r4 = (ha.C0805d) r4     // Catch: java.lang.Exception -> L44
            boolean r4 = r4.f21231c     // Catch: java.lang.Exception -> L44
            r5 = 0
            if (r4 == 0) goto L90
            r4 = r1
            P9.w r4 = (P9.w) r4     // Catch: java.lang.Exception -> L44
            int r4 = r4.a()     // Catch: java.lang.Exception -> L44
            T r6 = r3.f23179a     // Catch: java.lang.Exception -> L44
            java.util.Map r6 = (java.util.Map) r6     // Catch: java.lang.Exception -> L44
            java.lang.Object r4 = r2.get(r4)     // Catch: java.lang.Exception -> L44
            java.lang.Object r4 = r6.get(r4)     // Catch: java.lang.Exception -> L44
            boolean r6 = r4 instanceof java.util.Map     // Catch: java.lang.Exception -> L44
            if (r6 == 0) goto L47
            java.util.Map r4 = (java.util.Map) r4     // Catch: java.lang.Exception -> L44
            goto L48
        L44:
            r1 = move-exception
            goto Lab
        L47:
            r4 = r5
        L48:
            if (r4 == 0) goto La4
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Exception -> L44
            r6.<init>()     // Catch: java.lang.Exception -> L44
            java.util.Set r4 = r4.entrySet()     // Catch: java.lang.Exception -> L44
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Exception -> L44
        L57:
            boolean r7 = r4.hasNext()     // Catch: java.lang.Exception -> L44
            if (r7 == 0) goto L89
            java.lang.Object r7 = r4.next()     // Catch: java.lang.Exception -> L44
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch: java.lang.Exception -> L44
            java.lang.Object r8 = r7.getKey()     // Catch: java.lang.Exception -> L44
            boolean r9 = r8 instanceof java.lang.String     // Catch: java.lang.Exception -> L44
            if (r9 != 0) goto L6c
            r8 = r5
        L6c:
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Exception -> L44
            if (r8 != 0) goto L71
            goto L7c
        L71:
            java.lang.Object r7 = r7.getValue()     // Catch: java.lang.Exception -> L44
            boolean r9 = r7 instanceof java.lang.Object     // Catch: java.lang.Exception -> L44
            if (r9 != 0) goto L7a
            r7 = r5
        L7a:
            if (r7 != 0) goto L7e
        L7c:
            r9 = r5
            goto L83
        L7e:
            kotlin.Pair r9 = new kotlin.Pair     // Catch: java.lang.Exception -> L44
            r9.<init>(r8, r7)     // Catch: java.lang.Exception -> L44
        L83:
            if (r9 == 0) goto L57
            r6.add(r9)     // Catch: java.lang.Exception -> L44
            goto L57
        L89:
            java.util.Map r4 = kotlin.collections.a.v(r6)     // Catch: java.lang.Exception -> L44
            r3.f23179a = r4     // Catch: java.lang.Exception -> L44
            goto L22
        L90:
            T r1 = r3.f23179a     // Catch: java.lang.Exception -> L44
            java.util.Map r1 = (java.util.Map) r1     // Catch: java.lang.Exception -> L44
            java.lang.Object r2 = P9.s.R(r2)     // Catch: java.lang.Exception -> L44
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Exception -> L44
            boolean r2 = r1 instanceof java.lang.Boolean     // Catch: java.lang.Exception -> L44
            if (r2 != 0) goto La1
            goto La2
        La1:
            r5 = r1
        La2:
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Exception -> L44
        La4:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L44
            boolean r0 = kotlin.jvm.internal.f.b(r5, r1)     // Catch: java.lang.Exception -> L44
            goto Lc6
        Lab:
            com.sumsub.sns.internal.log.a r2 = com.sumsub.sns.internal.log.a.f17535a
            java.lang.String r3 = com.sumsub.sns.internal.log.c.a(r10)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Can't parse livenessSaveMode "
            r4.<init>(r5)
            java.util.Map r10 = r10.E()
            r4.append(r10)
            java.lang.String r10 = r4.toString()
            com.sumsub.sns.internal.log.b.b(r2, r3, r10, r1)
        Lc6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.data.model.f.m(com.sumsub.sns.internal.core.data.model.e):boolean");
    }

    public static final Map<String, com.sumsub.sns.internal.core.data.model.remote.c> o(e eVar) {
        Map<String, com.sumsub.sns.internal.core.data.model.remote.c> B10 = eVar.B();
        if (B10 == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(z.n(B10.size()));
        Iterator<T> it = B10.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), ((com.sumsub.sns.internal.core.data.model.remote.c) entry.getValue()).h());
        }
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x009a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.util.Map<java.lang.String, java.lang.String> p(com.sumsub.sns.internal.core.data.model.e r5) {
        /*
            java.util.Map r5 = r5.C()
            r0 = 0
            if (r5 == 0) goto Le
            java.lang.String r1 = "idDocWarnings"
            java.lang.Object r5 = r5.get(r1)
            goto Lf
        Le:
            r5 = r0
        Lf:
            boolean r1 = r5 instanceof java.util.Map
            if (r1 == 0) goto L16
            java.util.Map r5 = (java.util.Map) r5
            goto L17
        L16:
            r5 = r0
        L17:
            if (r5 == 0) goto L4e
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L26:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L4f
            java.lang.Object r2 = r5.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            boolean r3 = r3 instanceof java.lang.String
            if (r3 == 0) goto L26
            java.lang.Object r3 = r2.getValue()
            boolean r3 = r3 instanceof java.lang.String
            if (r3 == 0) goto L26
            java.lang.Object r3 = r2.getKey()
            java.lang.Object r2 = r2.getValue()
            r1.put(r3, r2)
            goto L26
        L4e:
            r1 = r0
        L4f:
            if (r1 == 0) goto L5a
            boolean r5 = r1.isEmpty()
            r2 = 1
            r5 = r5 ^ r2
            if (r5 != r2) goto L5a
            goto L5b
        L5a:
            r1 = r0
        L5b:
            if (r1 == 0) goto La2
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L6a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L9e
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            boolean r4 = r3 instanceof java.lang.String
            if (r4 != 0) goto L7f
            r3 = r0
        L7f:
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L84
            goto L91
        L84:
            java.lang.Object r2 = r2.getValue()
            boolean r4 = r2 instanceof java.lang.String
            if (r4 != 0) goto L8d
            r2 = r0
        L8d:
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L93
        L91:
            r4 = r0
            goto L98
        L93:
            kotlin.Pair r4 = new kotlin.Pair
            r4.<init>(r3, r2)
        L98:
            if (r4 == 0) goto L6a
            r5.add(r4)
            goto L6a
        L9e:
            java.util.Map r0 = kotlin.collections.a.v(r5)
        La2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.data.model.f.p(com.sumsub.sns.internal.core.data.model.e):java.util.Map");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0057 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v13, types: [T, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean b(com.sumsub.sns.internal.core.data.model.e r10) {
        /*
            r0 = 0
            java.util.Map r1 = r10.E()     // Catch: java.lang.Exception -> L44
            if (r1 == 0) goto Lc6
            java.lang.String r2 = "disableFinalStateStatusScreen"
            java.util.List r2 = java.util.Collections.singletonList(r2)     // Catch: java.lang.Exception -> L44
            kotlin.jvm.internal.Ref$ObjectRef r3 = new kotlin.jvm.internal.Ref$ObjectRef     // Catch: java.lang.Exception -> L44
            r3.<init>()     // Catch: java.lang.Exception -> L44
            r3.f23179a = r1     // Catch: java.lang.Exception -> L44
            int r1 = r2.size()     // Catch: java.lang.Exception -> L44
            int r1 = r1 + (-1)
            ha.e r1 = ha.h.V(r0, r1)     // Catch: java.lang.Exception -> L44
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> L44
        L22:
            r4 = r1
            ha.d r4 = (ha.C0805d) r4     // Catch: java.lang.Exception -> L44
            boolean r4 = r4.f21231c     // Catch: java.lang.Exception -> L44
            r5 = 0
            if (r4 == 0) goto L90
            r4 = r1
            P9.w r4 = (P9.w) r4     // Catch: java.lang.Exception -> L44
            int r4 = r4.a()     // Catch: java.lang.Exception -> L44
            T r6 = r3.f23179a     // Catch: java.lang.Exception -> L44
            java.util.Map r6 = (java.util.Map) r6     // Catch: java.lang.Exception -> L44
            java.lang.Object r4 = r2.get(r4)     // Catch: java.lang.Exception -> L44
            java.lang.Object r4 = r6.get(r4)     // Catch: java.lang.Exception -> L44
            boolean r6 = r4 instanceof java.util.Map     // Catch: java.lang.Exception -> L44
            if (r6 == 0) goto L47
            java.util.Map r4 = (java.util.Map) r4     // Catch: java.lang.Exception -> L44
            goto L48
        L44:
            r1 = move-exception
            goto Lab
        L47:
            r4 = r5
        L48:
            if (r4 == 0) goto La4
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Exception -> L44
            r6.<init>()     // Catch: java.lang.Exception -> L44
            java.util.Set r4 = r4.entrySet()     // Catch: java.lang.Exception -> L44
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Exception -> L44
        L57:
            boolean r7 = r4.hasNext()     // Catch: java.lang.Exception -> L44
            if (r7 == 0) goto L89
            java.lang.Object r7 = r4.next()     // Catch: java.lang.Exception -> L44
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch: java.lang.Exception -> L44
            java.lang.Object r8 = r7.getKey()     // Catch: java.lang.Exception -> L44
            boolean r9 = r8 instanceof java.lang.String     // Catch: java.lang.Exception -> L44
            if (r9 != 0) goto L6c
            r8 = r5
        L6c:
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Exception -> L44
            if (r8 != 0) goto L71
            goto L7c
        L71:
            java.lang.Object r7 = r7.getValue()     // Catch: java.lang.Exception -> L44
            boolean r9 = r7 instanceof java.lang.Object     // Catch: java.lang.Exception -> L44
            if (r9 != 0) goto L7a
            r7 = r5
        L7a:
            if (r7 != 0) goto L7e
        L7c:
            r9 = r5
            goto L83
        L7e:
            kotlin.Pair r9 = new kotlin.Pair     // Catch: java.lang.Exception -> L44
            r9.<init>(r8, r7)     // Catch: java.lang.Exception -> L44
        L83:
            if (r9 == 0) goto L57
            r6.add(r9)     // Catch: java.lang.Exception -> L44
            goto L57
        L89:
            java.util.Map r4 = kotlin.collections.a.v(r6)     // Catch: java.lang.Exception -> L44
            r3.f23179a = r4     // Catch: java.lang.Exception -> L44
            goto L22
        L90:
            T r1 = r3.f23179a     // Catch: java.lang.Exception -> L44
            java.util.Map r1 = (java.util.Map) r1     // Catch: java.lang.Exception -> L44
            java.lang.Object r2 = P9.s.R(r2)     // Catch: java.lang.Exception -> L44
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Exception -> L44
            boolean r2 = r1 instanceof java.lang.Boolean     // Catch: java.lang.Exception -> L44
            if (r2 != 0) goto La1
            goto La2
        La1:
            r5 = r1
        La2:
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Exception -> L44
        La4:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L44
            boolean r0 = kotlin.jvm.internal.f.b(r5, r1)     // Catch: java.lang.Exception -> L44
            goto Lc6
        Lab:
            com.sumsub.sns.internal.log.a r2 = com.sumsub.sns.internal.log.a.f17535a
            java.lang.String r3 = com.sumsub.sns.internal.log.c.a(r10)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Can't parse disableFinalStateStatusScreen "
            r4.<init>(r5)
            java.util.Map r10 = r10.E()
            r4.append(r10)
            java.lang.String r10 = r4.toString()
            com.sumsub.sns.internal.log.b.b(r2, r3, r10, r1)
        Lc6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.data.model.f.b(com.sumsub.sns.internal.core.data.model.e):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.util.ArrayList] */
    public static final Map<String, List<j>> a(a aVar) {
        Set<Map.Entry<String, List<com.sumsub.sns.internal.core.data.model.remote.h>>> entrySet;
        ?? i;
        String f10;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        com.sumsub.sns.internal.ff.a aVar2 = com.sumsub.sns.internal.ff.a.f16930a;
        JSONObject jSONObject = (!aVar2.k().g() || (f10 = aVar2.k().f()) == null) ? null : new JSONObject(f10);
        Map<String, List<com.sumsub.sns.internal.core.data.model.remote.h>> b9 = aVar.b();
        if (b9 != null && (entrySet = b9.entrySet()) != null && (r1 = entrySet.iterator()) != null) {
            for (Map.Entry<String, List<com.sumsub.sns.internal.core.data.model.remote.h>> entry : entrySet) {
                ArrayList arrayList = new ArrayList();
                String key = entry.getKey();
                JSONObject optJSONObject = jSONObject != null ? jSONObject.optJSONObject(key) : null;
                for (com.sumsub.sns.internal.core.data.model.remote.h hVar : entry.getValue()) {
                    JSONObject optJSONObject2 = optJSONObject != null ? optJSONObject.optJSONObject(hVar.k()) : null;
                    if (optJSONObject2 != null) {
                        List<h.d> i9 = hVar.i();
                        if (i9 != null) {
                            i = new ArrayList(P9.n.u(i9, 10));
                            for (h.d dVar : i9) {
                                FieldName q10 = dVar.q();
                                JSONArray optJSONArray = optJSONObject2.optJSONArray(q10 != null ? q10.getValue() : null);
                                List<String> b10 = optJSONArray != null ? com.sumsub.sns.internal.core.theme.c.b(optJSONArray) : null;
                                if (b10 != null) {
                                    dVar = h.d.a(dVar, null, false, null, null, b10, null, null, 103, null);
                                }
                                i.add(dVar);
                            }
                        } else {
                            i = 0;
                        }
                    } else {
                        i = hVar.i();
                    }
                    arrayList.add(new j(hVar.k(), hVar.g(), hVar.e(), i));
                }
                linkedHashMap.put(key, arrayList);
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0057 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v13, types: [T, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean d(com.sumsub.sns.internal.core.data.model.e r10) {
        /*
            r0 = 0
            java.util.Map r1 = r10.E()     // Catch: java.lang.Exception -> L44
            if (r1 == 0) goto Lc6
            java.lang.String r2 = "disablePendingScreen"
            java.util.List r2 = java.util.Collections.singletonList(r2)     // Catch: java.lang.Exception -> L44
            kotlin.jvm.internal.Ref$ObjectRef r3 = new kotlin.jvm.internal.Ref$ObjectRef     // Catch: java.lang.Exception -> L44
            r3.<init>()     // Catch: java.lang.Exception -> L44
            r3.f23179a = r1     // Catch: java.lang.Exception -> L44
            int r1 = r2.size()     // Catch: java.lang.Exception -> L44
            int r1 = r1 + (-1)
            ha.e r1 = ha.h.V(r0, r1)     // Catch: java.lang.Exception -> L44
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> L44
        L22:
            r4 = r1
            ha.d r4 = (ha.C0805d) r4     // Catch: java.lang.Exception -> L44
            boolean r4 = r4.f21231c     // Catch: java.lang.Exception -> L44
            r5 = 0
            if (r4 == 0) goto L90
            r4 = r1
            P9.w r4 = (P9.w) r4     // Catch: java.lang.Exception -> L44
            int r4 = r4.a()     // Catch: java.lang.Exception -> L44
            T r6 = r3.f23179a     // Catch: java.lang.Exception -> L44
            java.util.Map r6 = (java.util.Map) r6     // Catch: java.lang.Exception -> L44
            java.lang.Object r4 = r2.get(r4)     // Catch: java.lang.Exception -> L44
            java.lang.Object r4 = r6.get(r4)     // Catch: java.lang.Exception -> L44
            boolean r6 = r4 instanceof java.util.Map     // Catch: java.lang.Exception -> L44
            if (r6 == 0) goto L47
            java.util.Map r4 = (java.util.Map) r4     // Catch: java.lang.Exception -> L44
            goto L48
        L44:
            r1 = move-exception
            goto Lab
        L47:
            r4 = r5
        L48:
            if (r4 == 0) goto La4
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Exception -> L44
            r6.<init>()     // Catch: java.lang.Exception -> L44
            java.util.Set r4 = r4.entrySet()     // Catch: java.lang.Exception -> L44
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Exception -> L44
        L57:
            boolean r7 = r4.hasNext()     // Catch: java.lang.Exception -> L44
            if (r7 == 0) goto L89
            java.lang.Object r7 = r4.next()     // Catch: java.lang.Exception -> L44
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch: java.lang.Exception -> L44
            java.lang.Object r8 = r7.getKey()     // Catch: java.lang.Exception -> L44
            boolean r9 = r8 instanceof java.lang.String     // Catch: java.lang.Exception -> L44
            if (r9 != 0) goto L6c
            r8 = r5
        L6c:
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Exception -> L44
            if (r8 != 0) goto L71
            goto L7c
        L71:
            java.lang.Object r7 = r7.getValue()     // Catch: java.lang.Exception -> L44
            boolean r9 = r7 instanceof java.lang.Object     // Catch: java.lang.Exception -> L44
            if (r9 != 0) goto L7a
            r7 = r5
        L7a:
            if (r7 != 0) goto L7e
        L7c:
            r9 = r5
            goto L83
        L7e:
            kotlin.Pair r9 = new kotlin.Pair     // Catch: java.lang.Exception -> L44
            r9.<init>(r8, r7)     // Catch: java.lang.Exception -> L44
        L83:
            if (r9 == 0) goto L57
            r6.add(r9)     // Catch: java.lang.Exception -> L44
            goto L57
        L89:
            java.util.Map r4 = kotlin.collections.a.v(r6)     // Catch: java.lang.Exception -> L44
            r3.f23179a = r4     // Catch: java.lang.Exception -> L44
            goto L22
        L90:
            T r1 = r3.f23179a     // Catch: java.lang.Exception -> L44
            java.util.Map r1 = (java.util.Map) r1     // Catch: java.lang.Exception -> L44
            java.lang.Object r2 = P9.s.R(r2)     // Catch: java.lang.Exception -> L44
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Exception -> L44
            boolean r2 = r1 instanceof java.lang.Boolean     // Catch: java.lang.Exception -> L44
            if (r2 != 0) goto La1
            goto La2
        La1:
            r5 = r1
        La2:
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Exception -> L44
        La4:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L44
            boolean r0 = kotlin.jvm.internal.f.b(r5, r1)     // Catch: java.lang.Exception -> L44
            goto Lc6
        Lab:
            com.sumsub.sns.internal.log.a r2 = com.sumsub.sns.internal.log.a.f17535a
            java.lang.String r3 = com.sumsub.sns.internal.log.c.a(r10)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Can't parse disablePendingScreen "
            r4.<init>(r5)
            java.util.Map r10 = r10.E()
            r4.append(r10)
            java.lang.String r10 = r4.toString()
            com.sumsub.sns.internal.log.b.b(r2, r3, r10, r1)
        Lc6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.data.model.f.d(com.sumsub.sns.internal.core.data.model.e):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x009a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.util.Map<java.lang.String, java.lang.String> a(com.sumsub.sns.internal.core.data.model.e r5) {
        /*
            java.util.Map r5 = r5.C()
            r0 = 0
            if (r5 == 0) goto Le
            java.lang.String r1 = "countries"
            java.lang.Object r5 = r5.get(r1)
            goto Lf
        Le:
            r5 = r0
        Lf:
            boolean r1 = r5 instanceof java.util.Map
            if (r1 == 0) goto L16
            java.util.Map r5 = (java.util.Map) r5
            goto L17
        L16:
            r5 = r0
        L17:
            if (r5 == 0) goto L4e
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L26:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L4f
            java.lang.Object r2 = r5.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            boolean r3 = r3 instanceof java.lang.String
            if (r3 == 0) goto L26
            java.lang.Object r3 = r2.getValue()
            boolean r3 = r3 instanceof java.lang.String
            if (r3 == 0) goto L26
            java.lang.Object r3 = r2.getKey()
            java.lang.Object r2 = r2.getValue()
            r1.put(r3, r2)
            goto L26
        L4e:
            r1 = r0
        L4f:
            if (r1 == 0) goto L5a
            boolean r5 = r1.isEmpty()
            r2 = 1
            r5 = r5 ^ r2
            if (r5 != r2) goto L5a
            goto L5b
        L5a:
            r1 = r0
        L5b:
            if (r1 == 0) goto La2
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L6a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L9e
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            boolean r4 = r3 instanceof java.lang.String
            if (r4 != 0) goto L7f
            r3 = r0
        L7f:
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L84
            goto L91
        L84:
            java.lang.Object r2 = r2.getValue()
            boolean r4 = r2 instanceof java.lang.String
            if (r4 != 0) goto L8d
            r2 = r0
        L8d:
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L93
        L91:
            r4 = r0
            goto L98
        L93:
            kotlin.Pair r4 = new kotlin.Pair
            r4.<init>(r3, r2)
        L98:
            if (r4 == 0) goto L6a
            r5.add(r4)
            goto L6a
        L9e:
            java.util.Map r0 = kotlin.collections.a.v(r5)
        La2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.data.model.f.a(com.sumsub.sns.internal.core.data.model.e):java.util.Map");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0062 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v14, types: [T, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean a(com.sumsub.sns.internal.core.data.model.e r8, java.lang.String r9, boolean r10) {
        /*
            r0 = 0
            java.util.Map r1 = r8.E()     // Catch: java.lang.Exception -> Lf
            r2 = 0
            if (r1 == 0) goto Laf
            java.lang.String r3 = "steps"
            if (r10 == 0) goto L12
            java.lang.String r10 = "backsideInstructionsScreen"
            goto L14
        Lf:
            r9 = move-exception
            goto Lb6
        L12:
            java.lang.String r10 = "introScreen"
        L14:
            java.lang.String[] r9 = new java.lang.String[]{r3, r9, r10}     // Catch: java.lang.Exception -> Lf
            java.util.List r9 = P9.m.q(r9)     // Catch: java.lang.Exception -> Lf
            kotlin.jvm.internal.Ref$ObjectRef r10 = new kotlin.jvm.internal.Ref$ObjectRef     // Catch: java.lang.Exception -> Lf
            r10.<init>()     // Catch: java.lang.Exception -> Lf
            r10.f23179a = r1     // Catch: java.lang.Exception -> Lf
            int r1 = r9.size()     // Catch: java.lang.Exception -> Lf
            int r1 = r1 + (-1)
            ha.e r1 = ha.h.V(r0, r1)     // Catch: java.lang.Exception -> Lf
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> Lf
        L31:
            r3 = r1
            ha.d r3 = (ha.C0805d) r3     // Catch: java.lang.Exception -> Lf
            boolean r3 = r3.f21231c     // Catch: java.lang.Exception -> Lf
            if (r3 == 0) goto L9b
            r3 = r1
            P9.w r3 = (P9.w) r3     // Catch: java.lang.Exception -> Lf
            int r3 = r3.a()     // Catch: java.lang.Exception -> Lf
            T r4 = r10.f23179a     // Catch: java.lang.Exception -> Lf
            java.util.Map r4 = (java.util.Map) r4     // Catch: java.lang.Exception -> Lf
            java.lang.Object r3 = r9.get(r3)     // Catch: java.lang.Exception -> Lf
            java.lang.Object r3 = r4.get(r3)     // Catch: java.lang.Exception -> Lf
            boolean r4 = r3 instanceof java.util.Map     // Catch: java.lang.Exception -> Lf
            if (r4 == 0) goto L52
            java.util.Map r3 = (java.util.Map) r3     // Catch: java.lang.Exception -> Lf
            goto L53
        L52:
            r3 = r2
        L53:
            if (r3 == 0) goto Laf
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Exception -> Lf
            r4.<init>()     // Catch: java.lang.Exception -> Lf
            java.util.Set r3 = r3.entrySet()     // Catch: java.lang.Exception -> Lf
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Exception -> Lf
        L62:
            boolean r5 = r3.hasNext()     // Catch: java.lang.Exception -> Lf
            if (r5 == 0) goto L94
            java.lang.Object r5 = r3.next()     // Catch: java.lang.Exception -> Lf
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch: java.lang.Exception -> Lf
            java.lang.Object r6 = r5.getKey()     // Catch: java.lang.Exception -> Lf
            boolean r7 = r6 instanceof java.lang.String     // Catch: java.lang.Exception -> Lf
            if (r7 != 0) goto L77
            r6 = r2
        L77:
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> Lf
            if (r6 != 0) goto L7c
            goto L87
        L7c:
            java.lang.Object r5 = r5.getValue()     // Catch: java.lang.Exception -> Lf
            boolean r7 = r5 instanceof java.lang.Object     // Catch: java.lang.Exception -> Lf
            if (r7 != 0) goto L85
            r5 = r2
        L85:
            if (r5 != 0) goto L89
        L87:
            r7 = r2
            goto L8e
        L89:
            kotlin.Pair r7 = new kotlin.Pair     // Catch: java.lang.Exception -> Lf
            r7.<init>(r6, r5)     // Catch: java.lang.Exception -> Lf
        L8e:
            if (r7 == 0) goto L62
            r4.add(r7)     // Catch: java.lang.Exception -> Lf
            goto L62
        L94:
            java.util.Map r3 = kotlin.collections.a.v(r4)     // Catch: java.lang.Exception -> Lf
            r10.f23179a = r3     // Catch: java.lang.Exception -> Lf
            goto L31
        L9b:
            T r10 = r10.f23179a     // Catch: java.lang.Exception -> Lf
            java.util.Map r10 = (java.util.Map) r10     // Catch: java.lang.Exception -> Lf
            java.lang.Object r9 = P9.s.R(r9)     // Catch: java.lang.Exception -> Lf
            java.lang.Object r9 = r10.get(r9)     // Catch: java.lang.Exception -> Lf
            boolean r10 = r9 instanceof java.lang.Boolean     // Catch: java.lang.Exception -> Lf
            if (r10 != 0) goto Lac
            goto Lad
        Lac:
            r2 = r9
        Lad:
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Exception -> Lf
        Laf:
            java.lang.Boolean r9 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> Lf
            boolean r0 = kotlin.jvm.internal.f.b(r2, r9)     // Catch: java.lang.Exception -> Lf
            goto Ld1
        Lb6:
            com.sumsub.sns.internal.log.a r10 = com.sumsub.sns.internal.log.a.f17535a
            java.lang.String r1 = com.sumsub.sns.internal.log.c.a(r8)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Can't parse showIntroScreen "
            r2.<init>(r3)
            java.util.Map r8 = r8.E()
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            com.sumsub.sns.internal.log.b.b(r10, r1, r8, r9)
        Ld1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.data.model.f.a(com.sumsub.sns.internal.core.data.model.e, java.lang.String, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005d A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v14, types: [T, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean a(com.sumsub.sns.internal.core.data.model.e r9, java.lang.String r10) {
        /*
            r0 = 0
            java.util.Map r1 = r9.E()     // Catch: java.lang.Exception -> L4a
            r2 = 0
            if (r1 == 0) goto Laa
            java.lang.String r3 = "steps"
            java.lang.String r4 = "allowManualUpload"
            java.lang.String[] r10 = new java.lang.String[]{r3, r10, r4}     // Catch: java.lang.Exception -> L4a
            java.util.List r10 = P9.m.q(r10)     // Catch: java.lang.Exception -> L4a
            kotlin.jvm.internal.Ref$ObjectRef r3 = new kotlin.jvm.internal.Ref$ObjectRef     // Catch: java.lang.Exception -> L4a
            r3.<init>()     // Catch: java.lang.Exception -> L4a
            r3.f23179a = r1     // Catch: java.lang.Exception -> L4a
            int r1 = r10.size()     // Catch: java.lang.Exception -> L4a
            int r1 = r1 + (-1)
            ha.e r1 = ha.h.V(r0, r1)     // Catch: java.lang.Exception -> L4a
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> L4a
        L29:
            r4 = r1
            ha.d r4 = (ha.C0805d) r4     // Catch: java.lang.Exception -> L4a
            boolean r4 = r4.f21231c     // Catch: java.lang.Exception -> L4a
            if (r4 == 0) goto L96
            r4 = r1
            P9.w r4 = (P9.w) r4     // Catch: java.lang.Exception -> L4a
            int r4 = r4.a()     // Catch: java.lang.Exception -> L4a
            T r5 = r3.f23179a     // Catch: java.lang.Exception -> L4a
            java.util.Map r5 = (java.util.Map) r5     // Catch: java.lang.Exception -> L4a
            java.lang.Object r4 = r10.get(r4)     // Catch: java.lang.Exception -> L4a
            java.lang.Object r4 = r5.get(r4)     // Catch: java.lang.Exception -> L4a
            boolean r5 = r4 instanceof java.util.Map     // Catch: java.lang.Exception -> L4a
            if (r5 == 0) goto L4d
            java.util.Map r4 = (java.util.Map) r4     // Catch: java.lang.Exception -> L4a
            goto L4e
        L4a:
            r10 = move-exception
            goto Lb1
        L4d:
            r4 = r2
        L4e:
            if (r4 == 0) goto Laa
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Exception -> L4a
            r5.<init>()     // Catch: java.lang.Exception -> L4a
            java.util.Set r4 = r4.entrySet()     // Catch: java.lang.Exception -> L4a
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Exception -> L4a
        L5d:
            boolean r6 = r4.hasNext()     // Catch: java.lang.Exception -> L4a
            if (r6 == 0) goto L8f
            java.lang.Object r6 = r4.next()     // Catch: java.lang.Exception -> L4a
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch: java.lang.Exception -> L4a
            java.lang.Object r7 = r6.getKey()     // Catch: java.lang.Exception -> L4a
            boolean r8 = r7 instanceof java.lang.String     // Catch: java.lang.Exception -> L4a
            if (r8 != 0) goto L72
            r7 = r2
        L72:
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> L4a
            if (r7 != 0) goto L77
            goto L82
        L77:
            java.lang.Object r6 = r6.getValue()     // Catch: java.lang.Exception -> L4a
            boolean r8 = r6 instanceof java.lang.Object     // Catch: java.lang.Exception -> L4a
            if (r8 != 0) goto L80
            r6 = r2
        L80:
            if (r6 != 0) goto L84
        L82:
            r8 = r2
            goto L89
        L84:
            kotlin.Pair r8 = new kotlin.Pair     // Catch: java.lang.Exception -> L4a
            r8.<init>(r7, r6)     // Catch: java.lang.Exception -> L4a
        L89:
            if (r8 == 0) goto L5d
            r5.add(r8)     // Catch: java.lang.Exception -> L4a
            goto L5d
        L8f:
            java.util.Map r4 = kotlin.collections.a.v(r5)     // Catch: java.lang.Exception -> L4a
            r3.f23179a = r4     // Catch: java.lang.Exception -> L4a
            goto L29
        L96:
            T r1 = r3.f23179a     // Catch: java.lang.Exception -> L4a
            java.util.Map r1 = (java.util.Map) r1     // Catch: java.lang.Exception -> L4a
            java.lang.Object r10 = P9.s.R(r10)     // Catch: java.lang.Exception -> L4a
            java.lang.Object r10 = r1.get(r10)     // Catch: java.lang.Exception -> L4a
            boolean r1 = r10 instanceof java.lang.Boolean     // Catch: java.lang.Exception -> L4a
            if (r1 != 0) goto La7
            goto La8
        La7:
            r2 = r10
        La8:
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Exception -> L4a
        Laa:
            java.lang.Boolean r10 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L4a
            boolean r0 = kotlin.jvm.internal.f.b(r2, r10)     // Catch: java.lang.Exception -> L4a
            goto Lcc
        Lb1:
            com.sumsub.sns.internal.log.a r1 = com.sumsub.sns.internal.log.a.f17535a
            java.lang.String r2 = com.sumsub.sns.internal.log.c.a(r9)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Can't parse allowManualUpload "
            r3.<init>(r4)
            java.util.Map r9 = r9.E()
            r3.append(r9)
            java.lang.String r9 = r3.toString()
            com.sumsub.sns.internal.log.b.b(r1, r2, r9, r10)
        Lcc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.data.model.f.a(com.sumsub.sns.internal.core.data.model.e, java.lang.String):boolean");
    }
}
