package com.sumsub.sns.internal.domain;

import P9.z;
import android.content.Context;
import android.provider.Settings;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.sumsub.sns.internal.core.analytics.SdkEvent;
import com.sumsub.sns.internal.core.common.i0;
import com.sumsub.sns.internal.core.common.j0;
import com.sumsub.sns.internal.core.common.u0;
import com.sumsub.sns.internal.core.data.model.DocumentType;
import com.sumsub.sns.internal.core.data.source.dynamic.b;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Lambda;
import org.bouncycastle.tls.CipherSuite;

/* loaded from: classes2.dex */
public final class g extends com.sumsub.sns.internal.core.domain.base.b<b, a> {

    /* renamed from: b, reason: collision with root package name */
    public final Context f16810b;

    /* renamed from: c, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.settings.b f16811c;

    /* renamed from: d, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.log.a f16812d;

    /* renamed from: e, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.analythic.a f16813e;

    /* renamed from: f, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.dynamic.b f16814f;

    /* renamed from: g, reason: collision with root package name */
    public final O9.f f16815g;

    /* renamed from: h, reason: collision with root package name */
    public final O9.f f16816h;

    public static final class a {
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final com.sumsub.sns.internal.core.data.model.e f16817a;

        /* renamed from: b, reason: collision with root package name */
        public final com.sumsub.sns.internal.core.data.model.g f16818b;

        /* renamed from: c, reason: collision with root package name */
        public final b.c f16819c;

        public b(com.sumsub.sns.internal.core.data.model.e eVar, com.sumsub.sns.internal.core.data.model.g gVar, b.c cVar) {
            this.f16817a = eVar;
            this.f16818b = gVar;
            this.f16819c = cVar;
        }

        public final com.sumsub.sns.internal.core.data.model.g d() {
            return this.f16818b;
        }

        public final com.sumsub.sns.internal.core.data.model.e e() {
            return this.f16817a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.f.b(this.f16817a, bVar.f16817a) && kotlin.jvm.internal.f.b(this.f16818b, bVar.f16818b) && kotlin.jvm.internal.f.b(this.f16819c, bVar.f16819c);
        }

        public int hashCode() {
            return this.f16819c.hashCode() + ((this.f16818b.hashCode() + (this.f16817a.hashCode() * 31)) * 31);
        }

        public String toString() {
            return "Result(config=" + this.f16817a + ", applicant=" + this.f16818b + ", strings=" + this.f16819c + ')';
        }
    }

    public static final class c extends Lambda implements InterfaceC0635a<Boolean> {
        public c() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(new i0(g.this.f16810b).b());
        }
    }

    public static final class d extends Lambda implements InterfaceC0635a<Boolean> {
        public d() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            Boolean f10;
            com.sumsub.sns.internal.core.common.f fVar = new com.sumsub.sns.internal.core.common.f();
            return Boolean.valueOf(new j0(g.this.f16810b, fVar).f() || ((f10 = fVar.f()) != null && f10.booleanValue()));
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.domain.PrepareSDKUseCase", f = "PrepareSDKUseCase.kt", l = {77, 94, 99, 126, 140, 143, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384}, m = "run")
    public static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f16822a;

        /* renamed from: b, reason: collision with root package name */
        public Object f16823b;

        /* renamed from: c, reason: collision with root package name */
        public Object f16824c;

        /* renamed from: d, reason: collision with root package name */
        public Object f16825d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f16826e;

        /* renamed from: g, reason: collision with root package name */
        public int f16828g;

        public e(T9.a<? super e> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f16826e = obj;
            this.f16828g |= Integer.MIN_VALUE;
            return g.this.a((a) null, (T9.a<? super com.sumsub.sns.internal.core.domain.model.a<? extends Exception, b>>) this);
        }
    }

    public static final class f extends Lambda implements InterfaceC0646l<DocumentType, CharSequence> {

        /* renamed from: a, reason: collision with root package name */
        public static final f f16829a = new f();

        public f() {
            super(1);
        }

        @Override // ca.InterfaceC0646l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(DocumentType documentType) {
            return documentType.c();
        }
    }

    public g(Context context, com.sumsub.sns.internal.core.data.source.common.a aVar, com.sumsub.sns.internal.core.data.source.settings.b bVar, com.sumsub.sns.internal.core.data.source.log.a aVar2, com.sumsub.sns.internal.core.data.source.analythic.a aVar3, com.sumsub.sns.internal.core.data.source.dynamic.b bVar2) {
        super(aVar);
        this.f16810b = context;
        this.f16811c = bVar;
        this.f16812d = aVar2;
        this.f16813e = aVar3;
        this.f16814f = bVar2;
        this.f16815g = kotlin.a.a(new c());
        this.f16816h = kotlin.a.a(new d());
    }

    @Override // com.sumsub.sns.internal.core.domain.base.b
    public /* bridge */ /* synthetic */ Object b(a aVar, T9.a<? super com.sumsub.sns.internal.core.domain.model.a<? extends Exception, ? extends b>> aVar2) {
        return a(aVar, (T9.a<? super com.sumsub.sns.internal.core.domain.model.a<? extends Exception, b>>) aVar2);
    }

    public final boolean c() {
        return ((Boolean) this.f16816h.getValue()).booleanValue();
    }

    public final void d() {
        Pair[] pairArr = {new Pair("isDKAEnabled", Boolean.valueOf(Settings.System.getInt(this.f16810b.getContentResolver(), "always_finish_activities", 0) == 1)), new Pair("isRooted", Boolean.valueOf(b() || c())), new Pair("isVideoIdentAvailable", Boolean.valueOf(u0.b())), new Pair("isEidAvailable", Boolean.valueOf(u0.a()))};
        LinkedHashMap linkedHashMap = new LinkedHashMap(z.n(4));
        kotlin.collections.a.u(linkedHashMap, pairArr);
        com.sumsub.sns.internal.core.analytics.l.a(com.sumsub.sns.internal.core.analytics.f.a(0L, 1, null).a(SdkEvent.Init).a(linkedHashMap), false, 1, null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|8))|182|6|7|8|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x004c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0049, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0078, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0079, code lost:
    
        r10 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0074, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0075, code lost:
    
        r10 = r9;
     */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x0075: MOVE (r10 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]), block:B:181:0x0075 */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x0079: MOVE (r10 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]), block:B:179:0x0079 */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x015e A[Catch: Exception -> 0x0074, SNSApplicantNotFoundException -> 0x0078, TryCatch #5 {SNSApplicantNotFoundException -> 0x0078, Exception -> 0x0074, blocks: (B:70:0x005b, B:78:0x006f, B:79:0x027b, B:85:0x0184, B:87:0x019c, B:89:0x01a6, B:91:0x01b3, B:92:0x01ba, B:94:0x01c0, B:96:0x01c6, B:98:0x01d3, B:99:0x01da, B:100:0x01eb, B:102:0x01f1, B:107:0x0206, B:113:0x020a, B:115:0x021a, B:121:0x009f, B:122:0x0154, B:124:0x015e, B:126:0x0166, B:127:0x016c, B:136:0x00fa, B:138:0x0109, B:140:0x010f, B:142:0x0120, B:143:0x0126, B:144:0x0138, B:149:0x012a, B:150:0x0411, B:151:0x0417), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0109 A[Catch: Exception -> 0x0074, SNSApplicantNotFoundException -> 0x0078, TryCatch #5 {SNSApplicantNotFoundException -> 0x0078, Exception -> 0x0074, blocks: (B:70:0x005b, B:78:0x006f, B:79:0x027b, B:85:0x0184, B:87:0x019c, B:89:0x01a6, B:91:0x01b3, B:92:0x01ba, B:94:0x01c0, B:96:0x01c6, B:98:0x01d3, B:99:0x01da, B:100:0x01eb, B:102:0x01f1, B:107:0x0206, B:113:0x020a, B:115:0x021a, B:121:0x009f, B:122:0x0154, B:124:0x015e, B:126:0x0166, B:127:0x016c, B:136:0x00fa, B:138:0x0109, B:140:0x010f, B:142:0x0120, B:143:0x0126, B:144:0x0138, B:149:0x012a, B:150:0x0411, B:151:0x0417), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0411 A[Catch: Exception -> 0x0074, SNSApplicantNotFoundException -> 0x0078, TRY_ENTER, TryCatch #5 {SNSApplicantNotFoundException -> 0x0078, Exception -> 0x0074, blocks: (B:70:0x005b, B:78:0x006f, B:79:0x027b, B:85:0x0184, B:87:0x019c, B:89:0x01a6, B:91:0x01b3, B:92:0x01ba, B:94:0x01c0, B:96:0x01c6, B:98:0x01d3, B:99:0x01da, B:100:0x01eb, B:102:0x01f1, B:107:0x0206, B:113:0x020a, B:115:0x021a, B:121:0x009f, B:122:0x0154, B:124:0x015e, B:126:0x0166, B:127:0x016c, B:136:0x00fa, B:138:0x0109, B:140:0x010f, B:142:0x0120, B:143:0x0126, B:144:0x0138, B:149:0x012a, B:150:0x0411, B:151:0x0417), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0453 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x02b4 A[Catch: Exception -> 0x0049, SNSApplicantNotFoundException -> 0x004c, TryCatch #7 {SNSApplicantNotFoundException -> 0x004c, Exception -> 0x0049, blocks: (B:17:0x0044, B:18:0x02b0, B:20:0x02b4, B:21:0x02d9, B:23:0x02e0, B:25:0x02f7, B:27:0x02fd, B:28:0x030a, B:30:0x0310, B:33:0x031f, B:39:0x0338, B:43:0x0324, B:47:0x0331, B:49:0x033c, B:53:0x0343, B:56:0x0354, B:57:0x0359, B:59:0x035d, B:62:0x0364, B:63:0x03ac, B:64:0x03b3, B:67:0x0387, B:72:0x028f, B:74:0x029a, B:83:0x008c), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0338 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x030a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x035d A[Catch: Exception -> 0x0049, SNSApplicantNotFoundException -> 0x004c, TryCatch #7 {SNSApplicantNotFoundException -> 0x004c, Exception -> 0x0049, blocks: (B:17:0x0044, B:18:0x02b0, B:20:0x02b4, B:21:0x02d9, B:23:0x02e0, B:25:0x02f7, B:27:0x02fd, B:28:0x030a, B:30:0x0310, B:33:0x031f, B:39:0x0338, B:43:0x0324, B:47:0x0331, B:49:0x033c, B:53:0x0343, B:56:0x0354, B:57:0x0359, B:59:0x035d, B:62:0x0364, B:63:0x03ac, B:64:0x03b3, B:67:0x0387, B:72:0x028f, B:74:0x029a, B:83:0x008c), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x029a A[Catch: Exception -> 0x0049, SNSApplicantNotFoundException -> 0x004c, TryCatch #7 {SNSApplicantNotFoundException -> 0x004c, Exception -> 0x0049, blocks: (B:17:0x0044, B:18:0x02b0, B:20:0x02b4, B:21:0x02d9, B:23:0x02e0, B:25:0x02f7, B:27:0x02fd, B:28:0x030a, B:30:0x0310, B:33:0x031f, B:39:0x0338, B:43:0x0324, B:47:0x0331, B:49:0x033c, B:53:0x0343, B:56:0x0354, B:57:0x0359, B:59:0x035d, B:62:0x0364, B:63:0x03ac, B:64:0x03b3, B:67:0x0387, B:72:0x028f, B:74:0x029a, B:83:0x008c), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x028e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x019c A[Catch: Exception -> 0x0074, SNSApplicantNotFoundException -> 0x0078, TryCatch #5 {SNSApplicantNotFoundException -> 0x0078, Exception -> 0x0074, blocks: (B:70:0x005b, B:78:0x006f, B:79:0x027b, B:85:0x0184, B:87:0x019c, B:89:0x01a6, B:91:0x01b3, B:92:0x01ba, B:94:0x01c0, B:96:0x01c6, B:98:0x01d3, B:99:0x01da, B:100:0x01eb, B:102:0x01f1, B:107:0x0206, B:113:0x020a, B:115:0x021a, B:121:0x009f, B:122:0x0154, B:124:0x015e, B:126:0x0166, B:127:0x016c, B:136:0x00fa, B:138:0x0109, B:140:0x010f, B:142:0x0120, B:143:0x0126, B:144:0x0138, B:149:0x012a, B:150:0x0411, B:151:0x0417), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r0v64, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v38, types: [T, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(com.sumsub.sns.internal.domain.g.a r33, T9.a<? super com.sumsub.sns.internal.core.domain.model.a<? extends java.lang.Exception, com.sumsub.sns.internal.domain.g.b>> r34) {
        /*
            Method dump skipped, instructions count: 1136
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.domain.g.a(com.sumsub.sns.internal.domain.g$a, T9.a):java.lang.Object");
    }

    public final boolean b() {
        return ((Boolean) this.f16815g.getValue()).booleanValue();
    }

    public g(com.sumsub.sns.internal.core.a aVar) {
        this(aVar.j(), aVar.n(), aVar.F(), aVar.u(), aVar.c(), aVar.p());
    }
}
