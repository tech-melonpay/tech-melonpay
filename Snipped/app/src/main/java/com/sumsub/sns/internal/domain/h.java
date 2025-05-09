package com.sumsub.sns.internal.domain;

import O9.p;
import android.nfc.tech.IsoDep;
import android.util.Base64;
import ca.InterfaceC0646l;
import ca.InterfaceC0650p;
import com.sumsub.sns.core.data.model.SNSException;
import com.sumsub.sns.internal.core.common.z0;
import com.sumsub.sns.internal.nfc.NfcResult;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.f;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: c, reason: collision with root package name */
    public static final a f16830c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.applicant.e f16831a;

    /* renamed from: b, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.common.a f16832b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static abstract class b {

        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            public final Exception f16833a;

            public a(Exception exc) {
                super(null);
                this.f16833a = exc;
            }

            public final Exception b() {
                return this.f16833a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && f.b(this.f16833a, ((a) obj).f16833a);
            }

            public int hashCode() {
                return this.f16833a.hashCode();
            }

            public String toString() {
                return "Error(e=" + this.f16833a + ')';
            }
        }

        /* renamed from: com.sumsub.sns.internal.domain.h$b$b, reason: collision with other inner class name */
        public static final class C0251b extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final C0251b f16834a = new C0251b();

            public C0251b() {
                super(null);
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public b() {
        }
    }

    public static final class c extends Exception {
    }

    @V9.d(c = "com.sumsub.sns.internal.domain.ReadMRTDUseCase$invoke$2", f = "ReadMRTDUseCase.kt", l = {36, 46}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super b>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f16835a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ IsoDep f16836b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f16837c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ h f16838d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f16839e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l<Integer, p> f16840f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f16841g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f16842h;
        public final /* synthetic */ String i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f16843j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(IsoDep isoDep, String str, h hVar, String str2, InterfaceC0646l<? super Integer, p> interfaceC0646l, String str3, String str4, String str5, String str6, T9.a<? super d> aVar) {
            super(2, aVar);
            this.f16836b = isoDep;
            this.f16837c = str;
            this.f16838d = hVar;
            this.f16839e = str2;
            this.f16840f = interfaceC0646l;
            this.f16841g = str3;
            this.f16842h = str4;
            this.i = str5;
            this.f16843j = str6;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super b> aVar) {
            return ((d) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            return new d(this.f16836b, this.f16837c, this.f16838d, this.f16839e, this.f16840f, this.f16841g, this.f16842h, this.i, this.f16843j, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Integer k3;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f16835a;
            try {
                if (i == 0) {
                    kotlin.b.b(obj);
                    com.sumsub.sns.internal.nfc.e eVar = new com.sumsub.sns.internal.nfc.e(this.f16836b, z0.a(this.f16837c), this.f16838d.a(this.f16839e));
                    InterfaceC0646l<Integer, p> interfaceC0646l = this.f16840f;
                    this.f16835a = 1;
                    obj = eVar.a(interfaceC0646l, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.b.b(obj);
                        k3 = ((com.sumsub.sns.internal.core.data.source.applicant.remote.g) obj).k();
                        if (k3 != null && k3.intValue() == 1) {
                            return b.C0251b.f16834a;
                        }
                        return new b.a(new SNSException.Unknown(null, 1, null));
                    }
                    kotlin.b.b(obj);
                }
                NfcResult nfcResult = (NfcResult) obj;
                ArrayList arrayList = new ArrayList();
                if (!(nfcResult instanceof NfcResult.a)) {
                    return new b.a(new c());
                }
                Iterator<T> it = ((NfcResult.a) nfcResult).b().iterator();
                while (it.hasNext()) {
                    arrayList.add(Base64.encodeToString((byte[]) it.next(), 2));
                }
                com.sumsub.sns.internal.core.data.source.applicant.e eVar2 = this.f16838d.f16831a;
                String str = this.f16841g;
                String str2 = this.f16842h;
                String str3 = this.i;
                String str4 = this.f16843j;
                this.f16835a = 2;
                obj = eVar2.a(str, str2, str3, str4, arrayList, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                k3 = ((com.sumsub.sns.internal.core.data.source.applicant.remote.g) obj).k();
                if (k3 != null) {
                    return b.C0251b.f16834a;
                }
                return new b.a(new SNSException.Unknown(null, 1, null));
            } catch (Exception e10) {
                com.sumsub.sns.internal.log.a aVar = com.sumsub.sns.internal.log.a.f17535a;
                String message = e10.getMessage();
                if (message == null) {
                    message = "";
                }
                aVar.e("ReadMRTDUseCase", message, e10);
                return new b.a(com.sumsub.sns.internal.core.domain.base.d.a(this.f16838d.f16832b, e10));
            }
        }
    }

    public h(com.sumsub.sns.internal.core.data.source.applicant.e eVar, com.sumsub.sns.internal.core.data.source.common.a aVar) {
        this.f16831a = eVar;
        this.f16832b = aVar;
    }

    public final Object a(String str, String str2, String str3, IsoDep isoDep, String str4, String str5, String str6, InterfaceC0646l<? super Integer, p> interfaceC0646l, T9.a<? super b> aVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new d(isoDep, str4, this, str5, interfaceC0646l, str, str6, str2, str3, null), aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001a A[Catch: Exception -> 0x000e, TryCatch #0 {Exception -> 0x000e, blocks: (B:12:0x0005, B:4:0x0012, B:6:0x001a, B:9:0x0020, B:3:0x0010), top: B:11:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020 A[Catch: Exception -> 0x000e, TRY_LEAVE, TryCatch #0 {Exception -> 0x000e, blocks: (B:12:0x0005, B:4:0x0012, B:6:0x001a, B:9:0x0020, B:3:0x0010), top: B:11:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.sumsub.sns.internal.nfc.b a(java.lang.String r7) {
        /*
            r6 = this;
            r0 = 3
            r1 = 0
            r2 = 0
            if (r7 == 0) goto L10
            com.sumsub.sns.internal.nfc.e$b r3 = com.sumsub.sns.internal.nfc.e.f17784d     // Catch: java.lang.Exception -> Le
            java.util.List r7 = r3.a(r7)     // Catch: java.lang.Exception -> Le
            if (r7 != 0) goto L12
            goto L10
        Le:
            r7 = move-exception
            goto L26
        L10:
            kotlin.collections.EmptyList r7 = kotlin.collections.EmptyList.f23104a     // Catch: java.lang.Exception -> Le
        L12:
            boolean r3 = r7.isEmpty()     // Catch: java.lang.Exception -> Le
            r4 = 1
            r3 = r3 ^ r4
            if (r3 == 0) goto L20
            com.sumsub.sns.internal.nfc.b r3 = new com.sumsub.sns.internal.nfc.b     // Catch: java.lang.Exception -> Le
            r3.<init>(r1, r7, r4, r2)     // Catch: java.lang.Exception -> Le
            goto L34
        L20:
            com.sumsub.sns.internal.nfc.b r3 = new com.sumsub.sns.internal.nfc.b     // Catch: java.lang.Exception -> Le
            r3.<init>(r1, r2, r0, r2)     // Catch: java.lang.Exception -> Le
            goto L34
        L26:
            com.sumsub.sns.internal.nfc.c r3 = com.sumsub.sns.internal.nfc.c.f17776a
            java.lang.String r4 = "ReadMRTDUseCase"
            java.lang.String r5 = "Failed to parse server config"
            r3.a(r4, r5, r7)
            com.sumsub.sns.internal.nfc.b r3 = new com.sumsub.sns.internal.nfc.b
            r3.<init>(r1, r2, r0, r2)
        L34:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.domain.h.a(java.lang.String):com.sumsub.sns.internal.nfc.b");
    }
}
