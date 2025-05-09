package com.sumsub.sns.internal.core.data.model.remote.response;

import P9.n;
import com.sumsub.sns.internal.core.data.model.DocumentType;
import com.sumsub.sns.internal.core.data.model.IdentitySide;
import com.sumsub.sns.internal.core.data.model.ReviewAnswerType;
import com.sumsub.sns.internal.core.data.model.ReviewRejectType;
import com.sumsub.sns.internal.core.data.model.ReviewStatusType;
import com.sumsub.sns.internal.core.data.model.g;
import com.sumsub.sns.internal.core.data.model.remote.response.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* loaded from: classes2.dex */
public final class e {
    public static final g.c.a a(d.c.e.C0220c c0220c) {
        DocumentType a10 = DocumentType.INSTANCE.a(c0220c.p());
        List<String> x9 = c0220c.x();
        if (x9 == null) {
            x9 = EmptyList.f23104a;
        }
        List<String> list = x9;
        List<IdentitySide> v10 = c0220c.v();
        if (v10 == null) {
            v10 = EmptyList.f23104a;
        }
        return new g.c.a(a10, list, v10, c0220c.z(), c0220c.n(), c0220c.l(), c0220c.t(), c0220c.r(), c0220c.j());
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x004d, code lost:
    
        if (r0 == null) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.sumsub.sns.internal.core.data.model.g b(com.sumsub.sns.internal.core.data.model.remote.response.d.c.C0219d r20) {
        /*
            com.sumsub.sns.internal.core.data.model.g r18 = new com.sumsub.sns.internal.core.data.model.g
            java.lang.String r1 = r20.getId()
            java.lang.String r2 = r20.y()
            java.lang.String r3 = r20.m0()
            java.lang.String r4 = r20.getClientId()
            java.lang.String r5 = r20.getCreatedAt()
            java.lang.String r6 = r20.getInspectionId()
            com.sumsub.sns.internal.core.data.model.remote.response.d$c$e r0 = r20.getRequiredIdDocs()
            com.sumsub.sns.internal.core.data.model.g$c r7 = a(r0)
            java.lang.String r8 = r20.getExternalUserId()
            com.sumsub.sns.internal.core.data.model.b r9 = r20.w()
            com.sumsub.sns.internal.core.data.model.remote.response.d$c$f r0 = r20.getReview()
            com.sumsub.sns.internal.core.data.model.g$d r10 = a(r0)
            java.lang.String r11 = r20.getEnv()
            com.sumsub.sns.internal.core.data.model.remote.response.d$c$c r0 = r20.getFixedInfo()
            r12 = 0
            if (r0 == 0) goto L52
            com.sumsub.sns.internal.core.data.model.remote.response.d$c$c r13 = r20.getInfo()
            if (r13 == 0) goto L48
            java.lang.String r13 = r13.p()
            goto L49
        L48:
            r13 = r12
        L49:
            com.sumsub.sns.internal.core.data.model.g$a r0 = a(r0, r13)
            if (r0 != 0) goto L50
            goto L52
        L50:
            r13 = r0
            goto L5f
        L52:
            com.sumsub.sns.internal.core.data.model.remote.response.d$c$c r0 = r20.getInfo()
            if (r0 == 0) goto L5e
            r13 = 1
            com.sumsub.sns.internal.core.data.model.g$a r0 = a(r0, r12, r13, r12)
            goto L50
        L5e:
            r13 = r12
        L5f:
            java.lang.String r14 = r20.getLang()
            java.util.List r0 = r20.a0()
            if (r0 == 0) goto L70
            java.util.List r0 = a(r0)
            r19 = r0
            goto L72
        L70:
            r19 = r12
        L72:
            java.lang.String r15 = r20.getEmail()
            java.lang.String r16 = r20.getPhone()
            java.util.List r17 = r20.e0()
            r0 = r18
            r12 = r13
            r13 = r14
            r14 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.data.model.remote.response.e.b(com.sumsub.sns.internal.core.data.model.remote.response.d$c$d):com.sumsub.sns.internal.core.data.model.g");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList] */
    public static final g.c a(d.c.e eVar) {
        ?? r12;
        List<d.c.e.C0220c> g10 = eVar.g();
        if (g10 != null) {
            r12 = new ArrayList(n.u(g10, 10));
            Iterator it = g10.iterator();
            while (it.hasNext()) {
                r12.add(a((d.c.e.C0220c) it.next()));
            }
        } else {
            r12 = EmptyList.f23104a;
        }
        List list = r12;
        Boolean o10 = eVar.o();
        return new g.c(list, o10 != null ? o10.booleanValue() : false, eVar.q(), eVar.m(), eVar.k(), eVar.i());
    }

    public static final g.d.a a(d.c.f.C0221c c0221c) {
        String h9 = c0221c.h();
        String f10 = c0221c.f();
        ReviewAnswerType l10 = c0221c.l();
        if (l10 == null) {
            l10 = ReviewAnswerType.Unknown;
        }
        ReviewAnswerType reviewAnswerType = l10;
        List<String> j10 = c0221c.j();
        if (j10 == null) {
            j10 = EmptyList.f23104a;
        }
        List<String> list = j10;
        ReviewRejectType n10 = c0221c.n();
        if (n10 == null) {
            n10 = ReviewRejectType.Unknown;
        }
        return new g.d.a(h9, f10, reviewAnswerType, list, n10);
    }

    public static final g.d a(d.c.f fVar) {
        Integer v10 = fVar.v();
        ReviewStatusType reviewStatus = fVar.getReviewStatus();
        if (reviewStatus == null) {
            reviewStatus = ReviewStatusType.Unknown;
        }
        ReviewStatusType reviewStatusType = reviewStatus;
        Integer x9 = fVar.x();
        String n10 = fVar.n();
        d.c.f.C0221c result = fVar.getResult();
        return new g.d(v10, reviewStatusType, x9, n10, result != null ? a(result) : null, fVar.r(), fVar.p(), fVar.t());
    }

    public static /* synthetic */ g.a a(d.c.C0218c c0218c, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return a(c0218c, str);
    }

    public static final g.a a(d.c.C0218c c0218c, String str) {
        ArrayList arrayList;
        String p10 = c0218c.p();
        String str2 = p10 == null ? str : p10;
        String v10 = c0218c.v();
        String z10 = c0218c.z();
        String middleName = c0218c.getMiddleName();
        String legalName = c0218c.getLegalName();
        String x9 = c0218c.x();
        String t3 = c0218c.t();
        String placeOfBirth = c0218c.getPlaceOfBirth();
        String r8 = c0218c.r();
        String stateOfBirth = c0218c.getStateOfBirth();
        String nationality = c0218c.getNationality();
        List<Map<String, Object>> n10 = c0218c.n();
        if (n10 != null) {
            arrayList = new ArrayList(n.u(n10, 10));
            Iterator it = n10.iterator();
            while (it.hasNext()) {
                Map map = (Map) it.next();
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = map.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    String str3 = (String) entry.getKey();
                    Iterator it3 = it;
                    Object value = entry.getValue();
                    Iterator it4 = it2;
                    String str4 = value instanceof String ? (String) value : null;
                    Pair pair = str4 != null ? new Pair(str3, str4) : null;
                    if (pair != null) {
                        arrayList2.add(pair);
                    }
                    it2 = it4;
                    it = it3;
                }
                arrayList.add(kotlin.collections.a.v(arrayList2));
                it = it;
            }
        } else {
            arrayList = null;
        }
        return new g.a(str2, v10, z10, middleName, legalName, x9, t3, placeOfBirth, r8, stateOfBirth, nationality, arrayList, c0218c.getTin());
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0049, code lost:
    
        if (r0 == null) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.sumsub.sns.internal.core.data.model.g a(com.sumsub.sns.internal.core.data.model.remote.response.d.c.C0219d r19) {
        /*
            com.sumsub.sns.internal.core.data.model.g r18 = new com.sumsub.sns.internal.core.data.model.g
            java.lang.String r1 = r19.getId()
            java.lang.String r3 = r19.m0()
            java.lang.String r4 = r19.getClientId()
            java.lang.String r5 = r19.getCreatedAt()
            java.lang.String r6 = r19.getInspectionId()
            com.sumsub.sns.internal.core.data.model.remote.response.d$c$e r0 = r19.getRequiredIdDocs()
            com.sumsub.sns.internal.core.data.model.g$c r7 = a(r0)
            java.lang.String r8 = r19.getExternalUserId()
            com.sumsub.sns.internal.core.data.model.b r9 = r19.w()
            com.sumsub.sns.internal.core.data.model.remote.response.d$c$f r0 = r19.getReview()
            com.sumsub.sns.internal.core.data.model.g$d r10 = a(r0)
            java.lang.String r11 = r19.getEnv()
            com.sumsub.sns.internal.core.data.model.remote.response.d$c$c r0 = r19.getFixedInfo()
            r2 = 0
            if (r0 == 0) goto L4e
            com.sumsub.sns.internal.core.data.model.remote.response.d$c$c r12 = r19.getInfo()
            if (r12 == 0) goto L44
            java.lang.String r12 = r12.p()
            goto L45
        L44:
            r12 = r2
        L45:
            com.sumsub.sns.internal.core.data.model.g$a r0 = a(r0, r12)
            if (r0 != 0) goto L4c
            goto L4e
        L4c:
            r12 = r0
            goto L5b
        L4e:
            com.sumsub.sns.internal.core.data.model.remote.response.d$c$c r0 = r19.getInfo()
            if (r0 == 0) goto L5a
            r12 = 1
            com.sumsub.sns.internal.core.data.model.g$a r0 = a(r0, r2, r12, r2)
            goto L4c
        L5a:
            r12 = r2
        L5b:
            java.lang.String r13 = r19.getLang()
            java.util.List r0 = r19.a0()
            if (r0 == 0) goto L6b
            java.util.List r0 = a(r0)
            r14 = r0
            goto L6c
        L6b:
            r14 = r2
        L6c:
            java.lang.String r15 = r19.getEmail()
            java.lang.String r16 = r19.getPhone()
            java.util.List r17 = r19.e0()
            r2 = 0
            r0 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.data.model.remote.response.e.a(com.sumsub.sns.internal.core.data.model.remote.response.d$c$d):com.sumsub.sns.internal.core.data.model.g");
    }

    public static final List<g.b> a(List<com.sumsub.sns.internal.core.data.model.remote.e> list) {
        ArrayList arrayList = new ArrayList(n.u(list, 10));
        for (com.sumsub.sns.internal.core.data.model.remote.e eVar : list) {
            String c2 = eVar.c();
            String e10 = eVar.e();
            if (e10 == null) {
                e10 = "";
            }
            arrayList.add(new g.b(c2, e10));
        }
        return arrayList;
    }
}
