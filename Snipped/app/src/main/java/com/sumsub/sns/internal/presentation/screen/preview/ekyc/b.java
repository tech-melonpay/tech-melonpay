package com.sumsub.sns.internal.presentation.screen.preview.ekyc;

import android.net.Uri;
import android.os.Bundle;
import androidx.lifecycle.AbstractC0535a;
import androidx.lifecycle.C0552s;
import androidx.lifecycle.G;
import androidx.lifecycle.Q;
import b1.InterfaceC0584d;
import ca.InterfaceC0646l;
import ca.InterfaceC0650p;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.core.data.listener.SNSIconHandler;
import com.sumsub.sns.core.data.model.SNSException;
import com.sumsub.sns.core.presentation.base.a;
import com.sumsub.sns.internal.core.common.a1;
import com.sumsub.sns.internal.core.common.q;
import com.sumsub.sns.internal.core.common.u0;
import com.sumsub.sns.internal.core.common.z0;
import com.sumsub.sns.internal.core.data.model.Document;
import com.sumsub.sns.internal.core.data.model.DocumentType;
import com.sumsub.sns.internal.core.data.model.FieldName;
import com.sumsub.sns.internal.core.data.model.h;
import com.sumsub.sns.internal.core.data.source.applicant.remote.ConfirmationStatus;
import com.sumsub.sns.internal.core.data.source.applicant.remote.ConfirmationType;
import com.sumsub.sns.internal.core.data.source.applicant.remote.EKycFlowStatus;
import com.sumsub.sns.internal.core.data.source.applicant.remote.e0;
import com.sumsub.sns.internal.core.data.source.dynamic.b;
import com.sumsub.sns.internal.core.presentation.form.b;
import com.sumsub.sns.internal.core.presentation.form.model.FormItem;
import com.sumsub.sns.internal.presentation.screen.preview.a;
import ia.InterfaceC0840h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executors;
import ka.C0969n;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.ExecutorsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.tls.NamedGroup;

/* loaded from: classes2.dex */
public final class b extends com.sumsub.sns.internal.presentation.screen.preview.a<f> implements com.sumsub.sns.internal.core.presentation.form.b {

    /* renamed from: C, reason: collision with root package name */
    public static final C0295b f18001C;

    /* renamed from: D, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC0840h<Object>[] f18002D;
    public final com.sumsub.sns.internal.core.data.source.extensions.a Y;

    /* renamed from: Z, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.applicant.e f18003Z;

    /* renamed from: a0, reason: collision with root package name */
    public final a1 f18004a0;

    /* renamed from: b0, reason: collision with root package name */
    public com.sumsub.sns.internal.core.data.model.g f18005b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f18006c0;

    /* renamed from: d0, reason: collision with root package name */
    public Job f18007d0;

    /* renamed from: e0, reason: collision with root package name */
    public final CoroutineScope f18008e0;

    /* renamed from: f0, reason: collision with root package name */
    public com.sumsub.sns.internal.domain.c f18009f0;

    /* renamed from: g0, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.presentation.screen.base.a f18010g0;

    /* renamed from: h0, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.presentation.screen.base.a f18011h0;

    /* renamed from: i0, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.presentation.screen.base.a f18012i0;

    /* renamed from: j0, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.presentation.screen.base.a f18013j0;

    /* renamed from: k0, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.presentation.form.d f18014k0;

    /* renamed from: l0, reason: collision with root package name */
    public final MutableStateFlow<b.a> f18015l0;

    /* renamed from: m0, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.presentation.screen.base.a f18016m0;

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.ekyc.SNSEkycViewModel$1", f = "SNSEkycViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements InterfaceC0650p<f, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f18017a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f18018b;

        public a(T9.a<? super a> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(f fVar, T9.a<? super O9.p> aVar) {
            return ((a) create(fVar, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            a aVar2 = b.this.new a(aVar);
            aVar2.f18018b = obj;
            return aVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f18017a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            f fVar = (f) this.f18018b;
            if (fVar instanceof f.a) {
                MutableStateFlow mutableStateFlow = b.this.f18015l0;
                f.a aVar = (f.a) fVar;
                CharSequence p10 = aVar.p();
                String obj2 = p10 != null ? p10.toString() : null;
                CharSequence o10 = aVar.o();
                mutableStateFlow.setValue(new b.a(0, Collections.singletonList(new b.C0241b(0, obj2, o10 != null ? o10.toString() : null, aVar.m())), null, new b.c(null, null, 3, null)));
            }
            return O9.p.f3034a;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.ekyc.SNSEkycViewModel$updateCountry$1", f = "SNSEkycViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class a0 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f18020a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f18022c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ List<com.sumsub.sns.internal.domain.b> f18023d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(String str, List<com.sumsub.sns.internal.domain.b> list, T9.a<? super a0> aVar) {
            super(2, aVar);
            this.f18022c = str;
            this.f18023d = list;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((a0) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return b.this.new a0(this.f18022c, this.f18023d, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            com.sumsub.sns.internal.core.data.model.j jVar;
            String B10;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f18020a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            Logger.i$default(com.sumsub.sns.internal.log.a.f17535a, "EKyc", "Update country, oldCountry=" + b.this.s() + ", newCountry=" + this.f18022c + ", errors=" + this.f18023d.size(), null, 4, null);
            boolean b9 = kotlin.jvm.internal.f.b(b.this.s(), this.f18022c) ^ true;
            b.this.b(this.f18022c);
            com.sumsub.sns.internal.core.data.model.e d10 = b.this.d();
            String str = null;
            Map<String, List<com.sumsub.sns.internal.core.data.model.j>> w2 = d10 != null ? d10.w() : null;
            List<com.sumsub.sns.internal.core.data.model.j> list = w2 != null ? w2.get(this.f18022c) : null;
            if (!b9 && (B10 = b.this.B()) != null && !C0969n.i0(B10)) {
                str = b.this.B();
            } else if (list != null && (jVar = (com.sumsub.sns.internal.core.data.model.j) P9.s.M(0, list)) != null) {
                str = jVar.h();
            }
            b.this.b(str, this.f18023d);
            return O9.p.f3034a;
        }
    }

    /* renamed from: com.sumsub.sns.internal.presentation.screen.preview.ekyc.b$b, reason: collision with other inner class name */
    public static final class C0295b {
        public /* synthetic */ C0295b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C0295b() {
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.ekyc.SNSEkycViewModel$updateSource$1", f = "SNSEkycViewModel.kt", l = {216, BERTags.FLAGS, 243, 248, NamedGroup.ffdhe4096}, m = "invokeSuspend")
    public static final class b0 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f18024a;

        /* renamed from: b, reason: collision with root package name */
        public Object f18025b;

        /* renamed from: c, reason: collision with root package name */
        public Object f18026c;

        /* renamed from: d, reason: collision with root package name */
        public Object f18027d;

        /* renamed from: e, reason: collision with root package name */
        public Object f18028e;

        /* renamed from: f, reason: collision with root package name */
        public Object f18029f;

        /* renamed from: g, reason: collision with root package name */
        public Object f18030g;

        /* renamed from: h, reason: collision with root package name */
        public Object f18031h;
        public Object i;

        /* renamed from: j, reason: collision with root package name */
        public Object f18032j;

        /* renamed from: k, reason: collision with root package name */
        public Object f18033k;

        /* renamed from: l, reason: collision with root package name */
        public int f18034l;

        /* renamed from: m, reason: collision with root package name */
        public int f18035m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f18036n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ b f18037o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ List<com.sumsub.sns.internal.domain.b> f18038p;

        @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.ekyc.SNSEkycViewModel$updateSource$1$11", f = "SNSEkycViewModel.kt", l = {295, 299}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements InterfaceC0650p<f, T9.a<? super f>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public Object f18039a;

            /* renamed from: b, reason: collision with root package name */
            public int f18040b;

            /* renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f18041c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ b f18042d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ String f18043e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ ArrayList<FormItem> f18044f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, String str, ArrayList<FormItem> arrayList, T9.a<? super a> aVar) {
                super(2, aVar);
                this.f18042d = bVar;
                this.f18043e = str;
                this.f18044f = arrayList;
            }

            @Override // ca.InterfaceC0650p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(f fVar, T9.a<? super f> aVar) {
                return ((a) create(fVar, aVar)).invokeSuspend(O9.p.f3034a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
                a aVar2 = new a(this.f18042d, this.f18043e, this.f18044f, aVar);
                aVar2.f18041c = obj;
                return aVar2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                String str;
                f.a aVar;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
                int i = this.f18040b;
                if (i == 0) {
                    kotlin.b.b(obj);
                    f fVar = (f) this.f18041c;
                    b bVar = this.f18042d;
                    this.f18040b = 1;
                    obj = bVar.a(fVar, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        String str2 = (String) this.f18039a;
                        f.a aVar2 = (f.a) this.f18041c;
                        kotlin.b.b(obj);
                        str = str2;
                        aVar = aVar2;
                        return f.a.a(aVar, null, null, (String) obj, null, null, str, this.f18043e, this.f18044f, 27, null);
                    }
                    kotlin.b.b(obj);
                }
                f.a aVar3 = (f.a) obj;
                String s10 = this.f18042d.s();
                b bVar2 = this.f18042d;
                this.f18041c = aVar3;
                this.f18039a = s10;
                this.f18040b = 2;
                Object a10 = bVar2.a("sns_ekyc_action_continue", this);
                if (a10 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                str = s10;
                aVar = aVar3;
                obj = a10;
                return f.a.a(aVar, null, null, (String) obj, null, null, str, this.f18043e, this.f18044f, 27, null);
            }
        }

        /* renamed from: com.sumsub.sns.internal.presentation.screen.preview.ekyc.b$b0$b, reason: collision with other inner class name */
        public static final class C0296b extends Lambda implements InterfaceC0646l<FieldName, String> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ b f18045a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0296b(b bVar) {
                super(1);
                this.f18045a = bVar;
            }

            @Override // ca.InterfaceC0646l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(FieldName fieldName) {
                return (String) this.f18045a.D().get(fieldName.getValue());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(String str, b bVar, List<com.sumsub.sns.internal.domain.b> list, T9.a<? super b0> aVar) {
            super(2, aVar);
            this.f18036n = str;
            this.f18037o = bVar;
            this.f18038p = list;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((b0) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return new b0(this.f18036n, this.f18037o, this.f18038p, aVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:102:0x01c4  */
        /* JADX WARN: Removed duplicated region for block: B:11:0x032b  */
        /* JADX WARN: Removed duplicated region for block: B:124:0x0412  */
        /* JADX WARN: Removed duplicated region for block: B:126:0x019d  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0346  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0391  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0368  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x028e  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x02e8  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x0324 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:84:0x0325  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x0251  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x0265 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:99:0x019a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x02cb -> B:57:0x02cd). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r33) {
            /*
                Method dump skipped, instructions count: 1055
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.presentation.screen.preview.ekyc.b.b0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class c implements a.j {

        /* renamed from: a, reason: collision with root package name */
        public final String f18046a;

        /* renamed from: b, reason: collision with root package name */
        public final String f18047b;

        /* renamed from: c, reason: collision with root package name */
        public final String f18048c;

        public c(String str, String str2, String str3) {
            this.f18046a = str;
            this.f18047b = str2;
            this.f18048c = str3;
        }

        public final String d() {
            return this.f18048c;
        }

        public final String e() {
            return this.f18046a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return kotlin.jvm.internal.f.b(this.f18046a, cVar.f18046a) && kotlin.jvm.internal.f.b(this.f18047b, cVar.f18047b) && kotlin.jvm.internal.f.b(this.f18048c, cVar.f18048c);
        }

        public final String f() {
            return this.f18047b;
        }

        public int hashCode() {
            String str = this.f18046a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f18047b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f18048c;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("EidConfirmationEvent(mobileToken=");
            sb2.append(this.f18046a);
            sb2.append(", url=");
            sb2.append(this.f18047b);
            sb2.append(", hash=");
            return C.v.q(sb2, this.f18048c, ')');
        }
    }

    public static final class d implements a.j {

        /* renamed from: a, reason: collision with root package name */
        public final CharSequence f18049a;

        /* renamed from: b, reason: collision with root package name */
        public final CharSequence f18050b;

        public d(CharSequence charSequence, CharSequence charSequence2) {
            this.f18049a = charSequence;
            this.f18050b = charSequence2;
        }

        public final CharSequence c() {
            return this.f18050b;
        }

        public final CharSequence d() {
            return this.f18049a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return kotlin.jvm.internal.f.b(this.f18049a, dVar.f18049a) && kotlin.jvm.internal.f.b(this.f18050b, dVar.f18050b);
        }

        public int hashCode() {
            CharSequence charSequence = this.f18049a;
            int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
            CharSequence charSequence2 = this.f18050b;
            return hashCode + (charSequence2 != null ? charSequence2.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("ErrorEvent(errorText=");
            sb2.append((Object) this.f18049a);
            sb2.append(", buttonText=");
            return com.google.android.gms.measurement.internal.a.j(sb2, this.f18050b, ')');
        }
    }

    public static final class e extends AbstractC0535a {

        /* renamed from: a, reason: collision with root package name */
        public final Document f18051a;

        /* renamed from: b, reason: collision with root package name */
        public final com.sumsub.sns.internal.core.a f18052b;

        public e(Document document, InterfaceC0584d interfaceC0584d, com.sumsub.sns.internal.core.a aVar, Bundle bundle) {
            super(interfaceC0584d, bundle);
            this.f18051a = document;
            this.f18052b = aVar;
        }

        @Override // androidx.lifecycle.AbstractC0535a
        public <T extends Q> T create(String str, Class<T> cls, G g10) {
            return new b(this.f18051a, this.f18052b.q(), this.f18052b.h(), g10, this.f18052b.n(), this.f18052b.p(), new com.sumsub.sns.internal.core.domain.b(this.f18052b.n(), this.f18052b.p()));
        }
    }

    public static abstract class f extends a.d {

        public static final class a extends f {

            /* renamed from: a, reason: collision with root package name */
            public final CharSequence f18053a;

            /* renamed from: b, reason: collision with root package name */
            public final CharSequence f18054b;

            /* renamed from: c, reason: collision with root package name */
            public final CharSequence f18055c;

            /* renamed from: d, reason: collision with root package name */
            public final CharSequence f18056d;

            /* renamed from: e, reason: collision with root package name */
            public final com.sumsub.sns.internal.domain.c f18057e;

            /* renamed from: f, reason: collision with root package name */
            public final String f18058f;

            /* renamed from: g, reason: collision with root package name */
            public final String f18059g;

            /* renamed from: h, reason: collision with root package name */
            public final List<FormItem> f18060h;

            public a() {
                this(null, null, null, null, null, null, null, null, 255, null);
            }

            public final a a(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, com.sumsub.sns.internal.domain.c cVar, String str, String str2, List<? extends FormItem> list) {
                return new a(charSequence, charSequence2, charSequence3, charSequence4, cVar, str, str2, list);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return kotlin.jvm.internal.f.b(this.f18053a, aVar.f18053a) && kotlin.jvm.internal.f.b(this.f18054b, aVar.f18054b) && kotlin.jvm.internal.f.b(this.f18055c, aVar.f18055c) && kotlin.jvm.internal.f.b(this.f18056d, aVar.f18056d) && kotlin.jvm.internal.f.b(this.f18057e, aVar.f18057e) && kotlin.jvm.internal.f.b(this.f18058f, aVar.f18058f) && kotlin.jvm.internal.f.b(this.f18059g, aVar.f18059g) && kotlin.jvm.internal.f.b(this.f18060h, aVar.f18060h);
            }

            public int hashCode() {
                CharSequence charSequence = this.f18053a;
                int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
                CharSequence charSequence2 = this.f18054b;
                int hashCode2 = (hashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
                CharSequence charSequence3 = this.f18055c;
                int hashCode3 = (hashCode2 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
                CharSequence charSequence4 = this.f18056d;
                int hashCode4 = (this.f18057e.hashCode() + ((hashCode3 + (charSequence4 == null ? 0 : charSequence4.hashCode())) * 31)) * 31;
                String str = this.f18058f;
                int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.f18059g;
                return this.f18060h.hashCode() + ((hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 31);
            }

            public final CharSequence i() {
                return this.f18055c;
            }

            public final CharSequence j() {
                return this.f18056d;
            }

            public final String k() {
                return this.f18058f;
            }

            public final String l() {
                return this.f18059g;
            }

            public final List<FormItem> m() {
                return this.f18060h;
            }

            public final com.sumsub.sns.internal.domain.c n() {
                return this.f18057e;
            }

            public final CharSequence o() {
                return this.f18054b;
            }

            public final CharSequence p() {
                return this.f18053a;
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("AppData(title=");
                sb2.append((Object) this.f18053a);
                sb2.append(", subtitle=");
                sb2.append((Object) this.f18054b);
                sb2.append(", buttonContinue=");
                sb2.append((Object) this.f18055c);
                sb2.append(", buttonSkip=");
                sb2.append((Object) this.f18056d);
                sb2.append(", resources=");
                sb2.append(this.f18057e);
                sb2.append(", currentCountry=");
                sb2.append(this.f18058f);
                sb2.append(", currentSourceId=");
                sb2.append(this.f18059g);
                sb2.append(", formItems=");
                return C.v.r(sb2, this.f18060h, ')');
            }

            public a(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, com.sumsub.sns.internal.domain.c cVar, String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : charSequence, (i & 2) != 0 ? null : charSequence2, (i & 4) != 0 ? null : charSequence3, (i & 8) != 0 ? null : charSequence4, (i & 16) != 0 ? new com.sumsub.sns.internal.domain.c(null, null, null, null, null, 31, null) : cVar, (i & 32) != 0 ? null : str, (i & 64) == 0 ? str2 : null, (i & 128) != 0 ? EmptyList.f23104a : list);
            }

            public static /* synthetic */ a a(a aVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, com.sumsub.sns.internal.domain.c cVar, String str, String str2, List list, int i, Object obj) {
                return aVar.a((i & 1) != 0 ? aVar.f18053a : charSequence, (i & 2) != 0 ? aVar.f18054b : charSequence2, (i & 4) != 0 ? aVar.f18055c : charSequence3, (i & 8) != 0 ? aVar.f18056d : charSequence4, (i & 16) != 0 ? aVar.f18057e : cVar, (i & 32) != 0 ? aVar.f18058f : str, (i & 64) != 0 ? aVar.f18059g : str2, (i & 128) != 0 ? aVar.f18060h : list);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, com.sumsub.sns.internal.domain.c cVar, String str, String str2, List<? extends FormItem> list) {
                super(null);
                this.f18053a = charSequence;
                this.f18054b = charSequence2;
                this.f18055c = charSequence3;
                this.f18056d = charSequence4;
                this.f18057e = cVar;
                this.f18058f = str;
                this.f18059g = str2;
                this.f18060h = list;
            }
        }

        /* renamed from: com.sumsub.sns.internal.presentation.screen.preview.ekyc.b$f$b, reason: collision with other inner class name */
        public static final class C0297b extends f {

            /* renamed from: a, reason: collision with root package name */
            public static final C0297b f18061a = new C0297b();

            public C0297b() {
                super(null);
            }
        }

        public static final class c extends f {

            /* renamed from: a, reason: collision with root package name */
            public static final c f18062a = new c();

            public c() {
                super(null);
            }
        }

        public static final class d extends f {

            /* renamed from: a, reason: collision with root package name */
            public final String f18063a;

            /* renamed from: b, reason: collision with root package name */
            public final String f18064b;

            public d(String str, String str2) {
                super(null);
                this.f18063a = str;
                this.f18064b = str2;
            }

            public final String c() {
                return this.f18064b;
            }

            public final String d() {
                return this.f18063a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return kotlin.jvm.internal.f.b(this.f18063a, dVar.f18063a) && kotlin.jvm.internal.f.b(this.f18064b, dVar.f18064b);
            }

            public int hashCode() {
                String str = this.f18063a;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f18064b;
                return hashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("OAuth(url=");
                sb2.append(this.f18063a);
                sb2.append(", callbackUrl=");
                return C.v.q(sb2, this.f18064b, ')');
            }
        }

        public static final class e extends f {

            /* renamed from: a, reason: collision with root package name */
            public final CharSequence f18065a;

            /* renamed from: b, reason: collision with root package name */
            public final CharSequence f18066b;

            /* renamed from: c, reason: collision with root package name */
            public final CharSequence f18067c;

            /* renamed from: d, reason: collision with root package name */
            public final CharSequence f18068d;

            /* renamed from: e, reason: collision with root package name */
            public final long f18069e;

            /* renamed from: f, reason: collision with root package name */
            public final e0 f18070f;

            public e() {
                this(null, null, null, null, 0L, null, 63, null);
            }

            public final e a(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, long j10, e0 e0Var) {
                return new e(charSequence, charSequence2, charSequence3, charSequence4, j10, e0Var);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return kotlin.jvm.internal.f.b(this.f18065a, eVar.f18065a) && kotlin.jvm.internal.f.b(this.f18066b, eVar.f18066b) && kotlin.jvm.internal.f.b(this.f18067c, eVar.f18067c) && kotlin.jvm.internal.f.b(this.f18068d, eVar.f18068d) && this.f18069e == eVar.f18069e && kotlin.jvm.internal.f.b(this.f18070f, eVar.f18070f);
            }

            public final CharSequence g() {
                return this.f18067c;
            }

            public final CharSequence h() {
                return this.f18068d;
            }

            public int hashCode() {
                CharSequence charSequence = this.f18065a;
                int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
                CharSequence charSequence2 = this.f18066b;
                int hashCode2 = (hashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
                CharSequence charSequence3 = this.f18067c;
                int hashCode3 = (hashCode2 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
                CharSequence charSequence4 = this.f18068d;
                int e10 = C.v.e(this.f18069e, (hashCode3 + (charSequence4 == null ? 0 : charSequence4.hashCode())) * 31, 31);
                e0 e0Var = this.f18070f;
                return e10 + (e0Var != null ? e0Var.hashCode() : 0);
            }

            public final long i() {
                return this.f18069e;
            }

            public final e0 j() {
                return this.f18070f;
            }

            public final CharSequence k() {
                return this.f18066b;
            }

            public final CharSequence l() {
                return this.f18065a;
            }

            public String toString() {
                return "OtpConfirm(title=" + ((Object) this.f18065a) + ", subtitle=" + ((Object) this.f18066b) + ", buttonResendCode=" + ((Object) this.f18067c) + ", error=" + ((Object) this.f18068d) + ", secondsRemaining=" + this.f18069e + ", submitResponse=" + this.f18070f + ')';
            }

            public /* synthetic */ e(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, long j10, e0 e0Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : charSequence, (i & 2) != 0 ? null : charSequence2, (i & 4) != 0 ? null : charSequence3, (i & 8) != 0 ? null : charSequence4, (i & 16) != 0 ? 0L : j10, (i & 32) != 0 ? null : e0Var);
            }

            public static /* synthetic */ e a(e eVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, long j10, e0 e0Var, int i, Object obj) {
                if ((i & 1) != 0) {
                    charSequence = eVar.f18065a;
                }
                if ((i & 2) != 0) {
                    charSequence2 = eVar.f18066b;
                }
                CharSequence charSequence5 = charSequence2;
                if ((i & 4) != 0) {
                    charSequence3 = eVar.f18067c;
                }
                CharSequence charSequence6 = charSequence3;
                if ((i & 8) != 0) {
                    charSequence4 = eVar.f18068d;
                }
                CharSequence charSequence7 = charSequence4;
                if ((i & 16) != 0) {
                    j10 = eVar.f18069e;
                }
                long j11 = j10;
                if ((i & 32) != 0) {
                    e0Var = eVar.f18070f;
                }
                return eVar.a(charSequence, charSequence5, charSequence6, charSequence7, j11, e0Var);
            }

            public e(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, long j10, e0 e0Var) {
                super(null);
                this.f18065a = charSequence;
                this.f18066b = charSequence2;
                this.f18067c = charSequence3;
                this.f18068d = charSequence4;
                this.f18069e = j10;
                this.f18070f = e0Var;
            }
        }

        /* renamed from: com.sumsub.sns.internal.presentation.screen.preview.ekyc.b$f$f, reason: collision with other inner class name */
        public static final class C0298f extends f {

            /* renamed from: a, reason: collision with root package name */
            public final CharSequence f18071a;

            /* renamed from: b, reason: collision with root package name */
            public final CharSequence f18072b;

            /* renamed from: c, reason: collision with root package name */
            public final String f18073c;

            /* renamed from: d, reason: collision with root package name */
            public final CharSequence f18074d;

            /* renamed from: e, reason: collision with root package name */
            public final boolean f18075e;

            public C0298f(CharSequence charSequence, CharSequence charSequence2, String str, CharSequence charSequence3, boolean z10) {
                super(null);
                this.f18071a = charSequence;
                this.f18072b = charSequence2;
                this.f18073c = str;
                this.f18074d = charSequence3;
                this.f18075e = z10;
            }

            public final String a() {
                return this.f18073c;
            }

            public final CharSequence b() {
                return this.f18074d;
            }

            public final CharSequence c() {
                return this.f18072b;
            }

            public final CharSequence d() {
                return this.f18071a;
            }

            public final boolean e() {
                return this.f18075e;
            }
        }

        public /* synthetic */ f(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public f() {
        }
    }

    public /* synthetic */ class g {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18076a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f18077b;

        static {
            int[] iArr = new int[ConfirmationType.values().length];
            iArr[ConfirmationType.OTP.ordinal()] = 1;
            iArr[ConfirmationType.OAUTH.ordinal()] = 2;
            iArr[ConfirmationType.EID.ordinal()] = 3;
            f18076a = iArr;
            int[] iArr2 = new int[EKycFlowStatus.values().length];
            iArr2[EKycFlowStatus.COMPLETED.ordinal()] = 1;
            iArr2[EKycFlowStatus.SKIPPED.ordinal()] = 2;
            iArr2[EKycFlowStatus.REJECTED.ordinal()] = 3;
            f18077b = iArr2;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.ekyc.SNSEkycViewModel$confirmEid$1", f = "SNSEkycViewModel.kt", l = {617, 619}, m = "invokeSuspend")
    public static final class h extends SuspendLambda implements InterfaceC0646l<T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f18078a;

        /* renamed from: b, reason: collision with root package name */
        public int f18079b;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f18081d;

        @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.ekyc.SNSEkycViewModel$confirmEid$1$1", f = "SNSEkycViewModel.kt", l = {627, 629, 631}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements InterfaceC0650p<f, T9.a<? super f>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public Object f18082a;

            /* renamed from: b, reason: collision with root package name */
            public Object f18083b;

            /* renamed from: c, reason: collision with root package name */
            public Object f18084c;

            /* renamed from: d, reason: collision with root package name */
            public int f18085d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ b f18086e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ Exception f18087f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, Exception exc, T9.a<? super a> aVar) {
                super(2, aVar);
                this.f18086e = bVar;
                this.f18087f = exc;
            }

            @Override // ca.InterfaceC0650p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(f fVar, T9.a<? super f> aVar) {
                return ((a) create(fVar, aVar)).invokeSuspend(O9.p.f3034a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
                return new a(this.f18086e, this.f18087f, aVar);
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0085 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:16:0x0086  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                /*
                    r11 = this;
                    kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
                    int r1 = r11.f18085d
                    r2 = 3
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L3f
                    if (r1 == r4) goto L3b
                    if (r1 == r3) goto L2b
                    if (r1 != r2) goto L23
                    java.lang.Object r0 = r11.f18084c
                    java.lang.String r0 = (java.lang.String) r0
                    java.lang.Object r1 = r11.f18083b
                    com.sumsub.sns.internal.core.data.source.applicant.remote.e0 r1 = (com.sumsub.sns.internal.core.data.source.applicant.remote.e0) r1
                    java.lang.Object r2 = r11.f18082a
                    com.sumsub.sns.internal.presentation.screen.preview.ekyc.b$f$e r2 = (com.sumsub.sns.internal.presentation.screen.preview.ekyc.b.f.e) r2
                    kotlin.b.b(r12)
                    r4 = r0
                    r7 = r1
                    r0 = r2
                    goto L8a
                L23:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r12.<init>(r0)
                    throw r12
                L2b:
                    java.lang.Object r1 = r11.f18084c
                    java.lang.Throwable r1 = (java.lang.Throwable) r1
                    java.lang.Object r3 = r11.f18083b
                    com.sumsub.sns.internal.core.data.source.applicant.remote.e0 r3 = (com.sumsub.sns.internal.core.data.source.applicant.remote.e0) r3
                    java.lang.Object r4 = r11.f18082a
                    com.sumsub.sns.internal.presentation.screen.preview.ekyc.b$f$e r4 = (com.sumsub.sns.internal.presentation.screen.preview.ekyc.b.f.e) r4
                    kotlin.b.b(r12)
                    goto L6d
                L3b:
                    kotlin.b.b(r12)
                    goto L4d
                L3f:
                    kotlin.b.b(r12)
                    com.sumsub.sns.internal.presentation.screen.preview.ekyc.b r12 = r11.f18086e
                    r11.f18085d = r4
                    java.lang.Object r12 = com.sumsub.sns.internal.presentation.screen.preview.ekyc.b.b(r12, r11)
                    if (r12 != r0) goto L4d
                    return r0
                L4d:
                    com.sumsub.sns.internal.presentation.screen.preview.ekyc.b$f$e r12 = (com.sumsub.sns.internal.presentation.screen.preview.ekyc.b.f.e) r12
                    com.sumsub.sns.internal.presentation.screen.preview.ekyc.b r1 = r11.f18086e
                    com.sumsub.sns.internal.core.data.source.applicant.remote.e0 r1 = com.sumsub.sns.internal.presentation.screen.preview.ekyc.b.i(r1)
                    java.lang.Exception r4 = r11.f18087f
                    com.sumsub.sns.internal.presentation.screen.preview.ekyc.b r5 = r11.f18086e
                    r11.f18082a = r12
                    r11.f18083b = r1
                    r11.f18084c = r4
                    r11.f18085d = r3
                    java.lang.Object r3 = com.sumsub.sns.internal.presentation.screen.preview.ekyc.b.d(r5, r11)
                    if (r3 != r0) goto L68
                    return r0
                L68:
                    r10 = r4
                    r4 = r12
                    r12 = r3
                    r3 = r1
                    r1 = r10
                L6d:
                    com.sumsub.sns.internal.core.data.source.dynamic.b$c r12 = (com.sumsub.sns.internal.core.data.source.dynamic.b.c) r12
                    java.lang.String r12 = com.sumsub.sns.internal.core.common.o.a(r1, r12)
                    com.sumsub.sns.internal.presentation.screen.preview.ekyc.b r1 = r11.f18086e
                    r11.f18082a = r4
                    r11.f18083b = r3
                    r11.f18084c = r12
                    r11.f18085d = r2
                    java.lang.String r2 = "sns_confirmation_code_action_resend"
                    java.lang.Object r1 = com.sumsub.sns.internal.presentation.screen.preview.ekyc.b.a(r1, r2, r11)
                    if (r1 != r0) goto L86
                    return r0
                L86:
                    r7 = r3
                    r0 = r4
                    r4 = r12
                    r12 = r1
                L8a:
                    r3 = r12
                    java.lang.String r3 = (java.lang.String) r3
                    r8 = 3
                    r9 = 0
                    r1 = 0
                    r2 = 0
                    r5 = 0
                    com.sumsub.sns.internal.presentation.screen.preview.ekyc.b$f$e r12 = com.sumsub.sns.internal.presentation.screen.preview.ekyc.b.f.e.a(r0, r1, r2, r3, r4, r5, r7, r8, r9)
                    return r12
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.presentation.screen.preview.ekyc.b.h.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, T9.a<? super h> aVar) {
            super(1, aVar);
            this.f18081d = str;
        }

        @Override // ca.InterfaceC0646l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(T9.a<? super O9.p> aVar) {
            return ((h) create(aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(T9.a<?> aVar) {
            return b.this.new h(this.f18081d, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String h9;
            String B10;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f18079b;
            try {
            } catch (Exception e10) {
                b bVar = b.this;
                com.sumsub.sns.core.presentation.base.a.a(bVar, false, new a(bVar, e10, null), 1, null);
            } catch (Throwable th) {
                com.sumsub.sns.internal.presentation.screen.preview.a.a(b.this, th, (Object) null, 2, (Object) null);
            }
            if (i == 0) {
                kotlin.b.b(obj);
                e0 F10 = b.this.F();
                if (F10 == null || (h9 = F10.h()) == null) {
                    return O9.p.f3034a;
                }
                b bVar2 = b.this;
                this.f18078a = h9;
                this.f18079b = 1;
                obj = bVar2.f(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.b.b(obj);
                    b.this.a((e0) obj);
                    return O9.p.f3034a;
                }
                h9 = (String) this.f18078a;
                kotlin.b.b(obj);
            }
            com.sumsub.sns.internal.core.data.model.g gVar = (com.sumsub.sns.internal.core.data.model.g) obj;
            if (gVar == null || (B10 = gVar.B()) == null) {
                return O9.p.f3034a;
            }
            com.sumsub.sns.internal.core.data.source.applicant.e eVar = b.this.f18003Z;
            com.sumsub.sns.internal.core.data.source.applicant.remote.a aVar = new com.sumsub.sns.internal.core.data.source.applicant.remote.a((com.sumsub.sns.internal.core.data.source.applicant.remote.t) null, (com.sumsub.sns.internal.core.data.source.applicant.remote.q) null, new com.sumsub.sns.internal.core.data.source.applicant.remote.j(this.f18081d), 3, (DefaultConstructorMarker) null);
            this.f18078a = null;
            this.f18079b = 2;
            obj = eVar.a(B10, h9, aVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            b.this.a((e0) obj);
            return O9.p.f3034a;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.ekyc.SNSEkycViewModel$confirmOAuthData$1", f = "SNSEkycViewModel.kt", l = {589}, m = "invokeSuspend")
    public static final class i extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f18088a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f18090c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f18091d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ com.sumsub.sns.internal.core.data.source.applicant.remote.a f18092e;

        @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.ekyc.SNSEkycViewModel$confirmOAuthData$1$1", f = "SNSEkycViewModel.kt", l = {601, 602, 604}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements InterfaceC0650p<f, T9.a<? super f>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public Object f18093a;

            /* renamed from: b, reason: collision with root package name */
            public Object f18094b;

            /* renamed from: c, reason: collision with root package name */
            public Object f18095c;

            /* renamed from: d, reason: collision with root package name */
            public int f18096d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ b f18097e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ Exception f18098f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, Exception exc, T9.a<? super a> aVar) {
                super(2, aVar);
                this.f18097e = bVar;
                this.f18098f = exc;
            }

            @Override // ca.InterfaceC0650p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(f fVar, T9.a<? super f> aVar) {
                return ((a) create(fVar, aVar)).invokeSuspend(O9.p.f3034a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
                return new a(this.f18097e, this.f18098f, aVar);
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0083 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                /*
                    r7 = this;
                    kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
                    int r1 = r7.f18096d
                    r2 = 3
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L3b
                    if (r1 == r4) goto L37
                    if (r1 == r3) goto L2b
                    if (r1 != r2) goto L23
                    java.lang.Object r0 = r7.f18095c
                    java.lang.String r0 = (java.lang.String) r0
                    java.lang.Object r1 = r7.f18094b
                    java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                    java.lang.Object r2 = r7.f18093a
                    java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                    kotlin.b.b(r8)
                    r3 = r0
                    r6 = r2
                L20:
                    r2 = r1
                    r1 = r6
                    goto L88
                L23:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L2b:
                    java.lang.Object r1 = r7.f18094b
                    java.lang.Throwable r1 = (java.lang.Throwable) r1
                    java.lang.Object r3 = r7.f18093a
                    java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                    kotlin.b.b(r8)
                    goto L65
                L37:
                    kotlin.b.b(r8)
                    goto L4b
                L3b:
                    kotlin.b.b(r8)
                    com.sumsub.sns.internal.presentation.screen.preview.ekyc.b r8 = r7.f18097e
                    r7.f18096d = r4
                    java.lang.String r1 = "sns_confirmation_result_ekyc_failure_title"
                    java.lang.Object r8 = com.sumsub.sns.internal.presentation.screen.preview.ekyc.b.a(r8, r1, r7)
                    if (r8 != r0) goto L4b
                    return r0
                L4b:
                    java.lang.String r8 = (java.lang.String) r8
                    if (r8 != 0) goto L51
                    java.lang.String r8 = "Error"
                L51:
                    java.lang.Exception r1 = r7.f18098f
                    com.sumsub.sns.internal.presentation.screen.preview.ekyc.b r4 = r7.f18097e
                    r7.f18093a = r8
                    r7.f18094b = r1
                    r7.f18096d = r3
                    java.lang.Object r3 = com.sumsub.sns.internal.presentation.screen.preview.ekyc.b.d(r4, r7)
                    if (r3 != r0) goto L62
                    return r0
                L62:
                    r6 = r3
                    r3 = r8
                    r8 = r6
                L65:
                    com.sumsub.sns.internal.core.data.source.dynamic.b$c r8 = (com.sumsub.sns.internal.core.data.source.dynamic.b.c) r8
                    java.lang.String r1 = com.sumsub.sns.internal.core.common.o.a(r1, r8)
                    com.sumsub.sns.core.data.listener.SNSIconHandler$SNSResultIcons r8 = com.sumsub.sns.core.data.listener.SNSIconHandler.SNSResultIcons.FAILURE
                    java.lang.String r8 = r8.getImageName()
                    com.sumsub.sns.internal.presentation.screen.preview.ekyc.b r4 = r7.f18097e
                    r7.f18093a = r3
                    r7.f18094b = r1
                    r7.f18095c = r8
                    r7.f18096d = r2
                    java.lang.String r2 = "sns_confirmation_result_action_tryAgain"
                    java.lang.Object r2 = com.sumsub.sns.internal.presentation.screen.preview.ekyc.b.a(r4, r2, r7)
                    if (r2 != r0) goto L84
                    return r0
                L84:
                    r6 = r3
                    r3 = r8
                    r8 = r2
                    goto L20
                L88:
                    r4 = r8
                    java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                    com.sumsub.sns.internal.presentation.screen.preview.ekyc.b$f$f r8 = new com.sumsub.sns.internal.presentation.screen.preview.ekyc.b$f$f
                    r5 = 1
                    r0 = r8
                    r0.<init>(r1, r2, r3, r4, r5)
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.presentation.screen.preview.ekyc.b.i.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, String str2, com.sumsub.sns.internal.core.data.source.applicant.remote.a aVar, T9.a<? super i> aVar2) {
            super(2, aVar2);
            this.f18090c = str;
            this.f18091d = str2;
            this.f18092e = aVar;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((i) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return b.this.new i(this.f18090c, this.f18091d, this.f18092e, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f18088a;
            try {
                if (i == 0) {
                    kotlin.b.b(obj);
                    Logger.d$default(com.sumsub.sns.internal.log.a.f17535a, "EKyc", "confirmOAuthData ...", null, 4, null);
                    com.sumsub.sns.internal.core.data.source.applicant.e eVar = b.this.f18003Z;
                    String str = this.f18090c;
                    String str2 = this.f18091d;
                    com.sumsub.sns.internal.core.data.source.applicant.remote.a aVar = this.f18092e;
                    this.f18088a = 1;
                    obj = eVar.a(str, str2, aVar, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.b.b(obj);
                }
                b.this.a((e0) obj);
            } catch (Exception e10) {
                b.this.b(false);
                b.this.c(true);
                b bVar = b.this;
                com.sumsub.sns.core.presentation.base.a.a(bVar, false, new a(bVar, e10, null), 1, null);
            } catch (Throwable th) {
                com.sumsub.sns.internal.presentation.screen.preview.a.a(b.this, th, (Object) null, 2, (Object) null);
            }
            return O9.p.f3034a;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.ekyc.SNSEkycViewModel$confirmOtp$1", f = "SNSEkycViewModel.kt", l = {448, 450}, m = "invokeSuspend")
    public static final class j extends SuspendLambda implements InterfaceC0646l<T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f18099a;

        /* renamed from: b, reason: collision with root package name */
        public int f18100b;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e0 f18102d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ CharSequence f18103e;

        @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.ekyc.SNSEkycViewModel$confirmOtp$1$1", f = "SNSEkycViewModel.kt", l = {458, 460, 462}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements InterfaceC0650p<f, T9.a<? super f>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public Object f18104a;

            /* renamed from: b, reason: collision with root package name */
            public Object f18105b;

            /* renamed from: c, reason: collision with root package name */
            public int f18106c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ b f18107d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ Exception f18108e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ e0 f18109f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, Exception exc, e0 e0Var, T9.a<? super a> aVar) {
                super(2, aVar);
                this.f18107d = bVar;
                this.f18108e = exc;
                this.f18109f = e0Var;
            }

            @Override // ca.InterfaceC0650p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(f fVar, T9.a<? super f> aVar) {
                return ((a) create(fVar, aVar)).invokeSuspend(O9.p.f3034a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
                return new a(this.f18107d, this.f18108e, this.f18109f, aVar);
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x006f A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                /*
                    r11 = this;
                    kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
                    int r1 = r11.f18106c
                    r2 = 3
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L35
                    if (r1 == r4) goto L31
                    if (r1 == r3) goto L25
                    if (r1 != r2) goto L1d
                    java.lang.Object r0 = r11.f18105b
                    java.lang.String r0 = (java.lang.String) r0
                    java.lang.Object r1 = r11.f18104a
                    com.sumsub.sns.internal.presentation.screen.preview.ekyc.b$f$e r1 = (com.sumsub.sns.internal.presentation.screen.preview.ekyc.b.f.e) r1
                    kotlin.b.b(r12)
                    r4 = r0
                    r0 = r1
                    goto L73
                L1d:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r12.<init>(r0)
                    throw r12
                L25:
                    java.lang.Object r1 = r11.f18105b
                    java.lang.Throwable r1 = (java.lang.Throwable) r1
                    java.lang.Object r3 = r11.f18104a
                    com.sumsub.sns.internal.presentation.screen.preview.ekyc.b$f$e r3 = (com.sumsub.sns.internal.presentation.screen.preview.ekyc.b.f.e) r3
                    kotlin.b.b(r12)
                    goto L59
                L31:
                    kotlin.b.b(r12)
                    goto L43
                L35:
                    kotlin.b.b(r12)
                    com.sumsub.sns.internal.presentation.screen.preview.ekyc.b r12 = r11.f18107d
                    r11.f18106c = r4
                    java.lang.Object r12 = com.sumsub.sns.internal.presentation.screen.preview.ekyc.b.b(r12, r11)
                    if (r12 != r0) goto L43
                    return r0
                L43:
                    com.sumsub.sns.internal.presentation.screen.preview.ekyc.b$f$e r12 = (com.sumsub.sns.internal.presentation.screen.preview.ekyc.b.f.e) r12
                    java.lang.Exception r1 = r11.f18108e
                    com.sumsub.sns.internal.presentation.screen.preview.ekyc.b r4 = r11.f18107d
                    r11.f18104a = r12
                    r11.f18105b = r1
                    r11.f18106c = r3
                    java.lang.Object r3 = com.sumsub.sns.internal.presentation.screen.preview.ekyc.b.d(r4, r11)
                    if (r3 != r0) goto L56
                    return r0
                L56:
                    r10 = r3
                    r3 = r12
                    r12 = r10
                L59:
                    com.sumsub.sns.internal.core.data.source.dynamic.b$c r12 = (com.sumsub.sns.internal.core.data.source.dynamic.b.c) r12
                    java.lang.String r12 = com.sumsub.sns.internal.core.common.o.a(r1, r12)
                    com.sumsub.sns.internal.presentation.screen.preview.ekyc.b r1 = r11.f18107d
                    r11.f18104a = r3
                    r11.f18105b = r12
                    r11.f18106c = r2
                    java.lang.String r2 = "sns_confirmation_code_action_resend"
                    java.lang.Object r1 = com.sumsub.sns.internal.presentation.screen.preview.ekyc.b.a(r1, r2, r11)
                    if (r1 != r0) goto L70
                    return r0
                L70:
                    r4 = r12
                    r12 = r1
                    r0 = r3
                L73:
                    r3 = r12
                    java.lang.String r3 = (java.lang.String) r3
                    com.sumsub.sns.internal.core.data.source.applicant.remote.e0 r7 = r11.f18109f
                    r8 = 3
                    r9 = 0
                    r1 = 0
                    r2 = 0
                    r5 = 0
                    com.sumsub.sns.internal.presentation.screen.preview.ekyc.b$f$e r12 = com.sumsub.sns.internal.presentation.screen.preview.ekyc.b.f.e.a(r0, r1, r2, r3, r4, r5, r7, r8, r9)
                    return r12
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.presentation.screen.preview.ekyc.b.j.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(e0 e0Var, CharSequence charSequence, T9.a<? super j> aVar) {
            super(1, aVar);
            this.f18102d = e0Var;
            this.f18103e = charSequence;
        }

        @Override // ca.InterfaceC0646l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(T9.a<? super O9.p> aVar) {
            return ((j) create(aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(T9.a<?> aVar) {
            return b.this.new j(this.f18102d, this.f18103e, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String h9;
            String B10;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f18100b;
            try {
            } catch (Exception e10) {
                b bVar = b.this;
                com.sumsub.sns.core.presentation.base.a.a(bVar, false, new a(bVar, e10, this.f18102d, null), 1, null);
            } catch (Throwable th) {
                com.sumsub.sns.internal.presentation.screen.preview.a.a(b.this, th, (Object) null, 2, (Object) null);
            }
            if (i == 0) {
                kotlin.b.b(obj);
                Job job = b.this.f18007d0;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
                e0 e0Var = this.f18102d;
                if (e0Var == null || (h9 = e0Var.h()) == null) {
                    return O9.p.f3034a;
                }
                b bVar2 = b.this;
                this.f18099a = h9;
                this.f18100b = 1;
                obj = bVar2.f(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.b.b(obj);
                    b.this.a((e0) obj);
                    return O9.p.f3034a;
                }
                h9 = (String) this.f18099a;
                kotlin.b.b(obj);
            }
            com.sumsub.sns.internal.core.data.model.g gVar = (com.sumsub.sns.internal.core.data.model.g) obj;
            if (gVar == null || (B10 = gVar.B()) == null) {
                return O9.p.f3034a;
            }
            com.sumsub.sns.internal.core.data.source.applicant.e eVar = b.this.f18003Z;
            com.sumsub.sns.internal.core.data.source.applicant.remote.a aVar = new com.sumsub.sns.internal.core.data.source.applicant.remote.a(new com.sumsub.sns.internal.core.data.source.applicant.remote.t(this.f18103e.toString()), (com.sumsub.sns.internal.core.data.source.applicant.remote.q) null, (com.sumsub.sns.internal.core.data.source.applicant.remote.j) null, 6, (DefaultConstructorMarker) null);
            this.f18099a = null;
            this.f18100b = 2;
            obj = eVar.a(B10, h9, aVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            b.this.a((e0) obj);
            return O9.p.f3034a;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.ekyc.SNSEkycViewModel", f = "SNSEkycViewModel.kt", l = {762, 763, 765}, m = "defaultAppDataState")
    public static final class k extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f18110a;

        /* renamed from: b, reason: collision with root package name */
        public Object f18111b;

        /* renamed from: c, reason: collision with root package name */
        public Object f18112c;

        /* renamed from: d, reason: collision with root package name */
        public Object f18113d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f18114e;

        /* renamed from: g, reason: collision with root package name */
        public int f18116g;

        public k(T9.a<? super k> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f18114e = obj;
            this.f18116g |= Integer.MIN_VALUE;
            return b.this.d(this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.ekyc.SNSEkycViewModel", f = "SNSEkycViewModel.kt", l = {770, 771, 772}, m = "defaultOtpConfirmState")
    public static final class l extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f18117a;

        /* renamed from: b, reason: collision with root package name */
        public Object f18118b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f18119c;

        /* renamed from: e, reason: collision with root package name */
        public int f18121e;

        public l(T9.a<? super l> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f18119c = obj;
            this.f18121e |= Integer.MIN_VALUE;
            return b.this.e(this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.ekyc.SNSEkycViewModel", f = "SNSEkycViewModel.kt", l = {804}, m = "formatSourceId")
    public static final class m extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f18122a;

        /* renamed from: b, reason: collision with root package name */
        public Object f18123b;

        /* renamed from: c, reason: collision with root package name */
        public Object f18124c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f18125d;

        /* renamed from: f, reason: collision with root package name */
        public int f18127f;

        public m(T9.a<? super m> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f18125d = obj;
            this.f18127f |= Integer.MIN_VALUE;
            return b.this.a((String) null, (String) null, this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.ekyc.SNSEkycViewModel", f = "SNSEkycViewModel.kt", l = {199}, m = "getApplicant")
    public static final class n extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f18128a;

        /* renamed from: c, reason: collision with root package name */
        public int f18130c;

        public n(T9.a<? super n> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f18128a = obj;
            this.f18130c |= Integer.MIN_VALUE;
            return b.this.f(this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.ekyc.SNSEkycViewModel", f = "SNSEkycViewModel.kt", l = {782}, m = "getResendCodeText")
    public static final class o extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f18131a;

        /* renamed from: b, reason: collision with root package name */
        public Object f18132b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f18133c;

        /* renamed from: e, reason: collision with root package name */
        public int f18135e;

        public o(T9.a<? super o> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f18133c = obj;
            this.f18135e |= Integer.MIN_VALUE;
            return b.this.a(0L, this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.ekyc.SNSEkycViewModel$handleDefaultConfirmResponse$1", f = "SNSEkycViewModel.kt", l = {663, 666}, m = "invokeSuspend")
    public static final class p extends SuspendLambda implements InterfaceC0650p<f, T9.a<? super f>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f18136a;

        /* renamed from: b, reason: collision with root package name */
        public Object f18137b;

        /* renamed from: c, reason: collision with root package name */
        public int f18138c;

        public p(T9.a<? super p> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(f fVar, T9.a<? super f> aVar) {
            return ((p) create(fVar, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return b.this.new p(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CharSequence charSequence;
            String str;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f18138c;
            if (i == 0) {
                kotlin.b.b(obj);
                b bVar = b.this;
                this.f18138c = 1;
                obj = bVar.a("sns_confirmation_result_ekyc_failure_title", this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    String str2 = (String) this.f18137b;
                    charSequence = (CharSequence) this.f18136a;
                    kotlin.b.b(obj);
                    str = str2;
                    return new f.C0298f(charSequence, null, str, (CharSequence) obj, true);
                }
                kotlin.b.b(obj);
            }
            String str3 = (String) obj;
            if (str3 == null) {
                str3 = "Error";
            }
            charSequence = str3;
            String imageName = SNSIconHandler.SNSResultIcons.FAILURE.getImageName();
            b bVar2 = b.this;
            this.f18136a = charSequence;
            this.f18137b = imageName;
            this.f18138c = 2;
            Object a10 = bVar2.a("sns_confirmation_result_action_tryAgain", this);
            if (a10 == coroutineSingletons) {
                return coroutineSingletons;
            }
            str = imageName;
            obj = a10;
            return new f.C0298f(charSequence, null, str, (CharSequence) obj, true);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.ekyc.SNSEkycViewModel$handleOtpConfirmResponse$1", f = "SNSEkycViewModel.kt", l = {679, 681, 683}, m = "invokeSuspend")
    public static final class q extends SuspendLambda implements InterfaceC0650p<f, T9.a<? super f>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f18140a;

        /* renamed from: b, reason: collision with root package name */
        public Object f18141b;

        /* renamed from: c, reason: collision with root package name */
        public int f18142c;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e0 f18144e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(e0 e0Var, T9.a<? super q> aVar) {
            super(2, aVar);
            this.f18144e = e0Var;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(f fVar, T9.a<? super f> aVar) {
            return ((q) create(fVar, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return b.this.new q(this.f18144e, aVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0057  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0069 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
                int r1 = r11.f18142c
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L31
                if (r1 == r4) goto L2d
                if (r1 == r3) goto L25
                if (r1 != r2) goto L1d
                java.lang.Object r0 = r11.f18141b
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r1 = r11.f18140a
                com.sumsub.sns.internal.presentation.screen.preview.ekyc.b$f$e r1 = (com.sumsub.sns.internal.presentation.screen.preview.ekyc.b.f.e) r1
                kotlin.b.b(r12)
                r4 = r0
                r0 = r1
                goto L6d
            L1d:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L25:
                java.lang.Object r1 = r11.f18140a
                com.sumsub.sns.internal.presentation.screen.preview.ekyc.b$f$e r1 = (com.sumsub.sns.internal.presentation.screen.preview.ekyc.b.f.e) r1
                kotlin.b.b(r12)
                goto L53
            L2d:
                kotlin.b.b(r12)
                goto L3f
            L31:
                kotlin.b.b(r12)
                com.sumsub.sns.internal.presentation.screen.preview.ekyc.b r12 = com.sumsub.sns.internal.presentation.screen.preview.ekyc.b.this
                r11.f18142c = r4
                java.lang.Object r12 = com.sumsub.sns.internal.presentation.screen.preview.ekyc.b.b(r12, r11)
                if (r12 != r0) goto L3f
                return r0
            L3f:
                com.sumsub.sns.internal.presentation.screen.preview.ekyc.b$f$e r12 = (com.sumsub.sns.internal.presentation.screen.preview.ekyc.b.f.e) r12
                com.sumsub.sns.internal.presentation.screen.preview.ekyc.b r1 = com.sumsub.sns.internal.presentation.screen.preview.ekyc.b.this
                r11.f18140a = r12
                r11.f18142c = r3
                java.lang.String r3 = "sns_confirmation_code_isNotValid"
                java.lang.Object r1 = com.sumsub.sns.internal.presentation.screen.preview.ekyc.b.a(r1, r3, r11)
                if (r1 != r0) goto L50
                return r0
            L50:
                r10 = r1
                r1 = r12
                r12 = r10
            L53:
                java.lang.String r12 = (java.lang.String) r12
                if (r12 != 0) goto L59
                java.lang.String r12 = "Unknown error"
            L59:
                com.sumsub.sns.internal.presentation.screen.preview.ekyc.b r3 = com.sumsub.sns.internal.presentation.screen.preview.ekyc.b.this
                r11.f18140a = r1
                r11.f18141b = r12
                r11.f18142c = r2
                java.lang.String r2 = "sns_confirmation_code_action_resend"
                java.lang.Object r2 = com.sumsub.sns.internal.presentation.screen.preview.ekyc.b.a(r3, r2, r11)
                if (r2 != r0) goto L6a
                return r0
            L6a:
                r4 = r12
                r0 = r1
                r12 = r2
            L6d:
                r3 = r12
                java.lang.String r3 = (java.lang.String) r3
                com.sumsub.sns.internal.core.data.source.applicant.remote.e0 r7 = r11.f18144e
                r8 = 3
                r9 = 0
                r1 = 0
                r2 = 0
                r5 = 0
                com.sumsub.sns.internal.presentation.screen.preview.ekyc.b$f$e r12 = com.sumsub.sns.internal.presentation.screen.preview.ekyc.b.f.e.a(r0, r1, r2, r3, r4, r5, r7, r8, r9)
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.presentation.screen.preview.ekyc.b.q.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class r implements com.sumsub.sns.internal.core.presentation.form.d {
        public r() {
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.d
        public String a(String str, String str2) {
            return (String) b.this.D().get(str2);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.ekyc.SNSEkycViewModel", f = "SNSEkycViewModel.kt", l = {158}, m = "onDataLoaded")
    public static final class s extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f18146a;

        /* renamed from: b, reason: collision with root package name */
        public Object f18147b;

        /* renamed from: c, reason: collision with root package name */
        public Object f18148c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f18149d;

        /* renamed from: f, reason: collision with root package name */
        public int f18151f;

        public s(T9.a<? super s> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f18149d = obj;
            this.f18151f |= Integer.MIN_VALUE;
            return b.this.a((com.sumsub.sns.internal.core.data.model.g) null, (com.sumsub.sns.internal.core.data.model.e) null, this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.ekyc.SNSEkycViewModel$onSubmitAppDataClick$1", f = "SNSEkycViewModel.kt", l = {404, 412, 417, 417}, m = "invokeSuspend")
    public static final class t extends SuspendLambda implements InterfaceC0646l<T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f18152a;

        /* renamed from: b, reason: collision with root package name */
        public Object f18153b;

        /* renamed from: c, reason: collision with root package name */
        public int f18154c;

        public static final class a extends Lambda implements InterfaceC0646l<String, String> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ b f18156a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar) {
                super(1);
                this.f18156a = bVar;
            }

            @Override // ca.InterfaceC0646l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(String str) {
                String str2 = (String) this.f18156a.D().get(str);
                return str2 == null ? "" : str2;
            }
        }

        public t(T9.a<? super t> aVar) {
            super(1, aVar);
        }

        @Override // ca.InterfaceC0646l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(T9.a<? super O9.p> aVar) {
            return ((t) create(aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(T9.a<?> aVar) {
            return b.this.new t(aVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:67:0x00b2, code lost:
        
            if (r0 != null) goto L38;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                Method dump skipped, instructions count: 540
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.presentation.screen.preview.ekyc.b.t.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.ekyc.SNSEkycViewModel$requestOAuth$1", f = "SNSEkycViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class u extends SuspendLambda implements InterfaceC0650p<f, T9.a<? super f>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f18157a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f18158b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f18159c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(String str, String str2, T9.a<? super u> aVar) {
            super(2, aVar);
            this.f18158b = str;
            this.f18159c = str2;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(f fVar, T9.a<? super f> aVar) {
            return ((u) create(fVar, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return new u(this.f18158b, this.f18159c, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f18157a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            return new f.d(this.f18158b, this.f18159c);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.ekyc.SNSEkycViewModel$requestOtpConfirmation$1", f = "SNSEkycViewModel.kt", l = {722, 723}, m = "invokeSuspend")
    public static final class v extends SuspendLambda implements InterfaceC0650p<f, T9.a<? super f>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f18160a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f18161b;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e0 f18163d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(e0 e0Var, T9.a<? super v> aVar) {
            super(2, aVar);
            this.f18163d = e0Var;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(f fVar, T9.a<? super f> aVar) {
            return ((v) create(fVar, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            v vVar = b.this.new v(this.f18163d, aVar);
            vVar.f18161b = obj;
            return vVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            f.e eVar;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f18160a;
            if (i == 0) {
                kotlin.b.b(obj);
                f fVar = (f) this.f18161b;
                b bVar = b.this;
                this.f18160a = 1;
                obj = bVar.b(fVar, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    eVar = (f.e) this.f18161b;
                    kotlin.b.b(obj);
                    return f.e.a(eVar, null, null, (CharSequence) obj, null, 0L, this.f18163d, 27, null);
                }
                kotlin.b.b(obj);
            }
            f.e eVar2 = (f.e) obj;
            b bVar2 = b.this;
            this.f18161b = eVar2;
            this.f18160a = 2;
            Object a10 = bVar2.a(60L, this);
            if (a10 == coroutineSingletons) {
                return coroutineSingletons;
            }
            eVar = eVar2;
            obj = a10;
            return f.e.a(eVar, null, null, (CharSequence) obj, null, 0L, this.f18163d, 27, null);
        }
    }

    public static final class w extends Lambda implements InterfaceC0650p<String, String, String> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f18164a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f18165b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f18166c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ b.c f18167d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(String str, b bVar, String str2, b.c cVar) {
            super(2);
            this.f18164a = str;
            this.f18165b = bVar;
            this.f18166c = str2;
            this.f18167d = cVar;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str, String str2) {
            String str3;
            com.sumsub.sns.internal.core.data.model.e f10;
            Map<String, Map<String, String>> t3;
            Map<String, String> map;
            com.sumsub.sns.internal.core.data.model.e f11;
            Map<String, com.sumsub.sns.internal.core.data.model.w> x9;
            com.sumsub.sns.internal.core.data.model.w wVar;
            Map<String, String> c2;
            String a10 = z0.a((List<String>) C0969n.q0(this.f18164a, new char[]{'.'}));
            com.sumsub.sns.internal.domain.c cVar = this.f18165b.f18009f0;
            String str4 = (cVar == null || (f11 = cVar.f()) == null || (x9 = f11.x()) == null || (wVar = x9.get(a10)) == null || (c2 = wVar.c()) == null) ? null : c2.get(str2);
            com.sumsub.sns.internal.domain.c cVar2 = this.f18165b.f18009f0;
            if (cVar2 == null || (f10 = cVar2.f()) == null || (t3 = f10.t()) == null || (map = t3.get(this.f18166c)) == null || (str3 = map.get(str2)) == null || !kotlin.jvm.internal.f.b(str, "field")) {
                str3 = null;
            }
            String a11 = this.f18167d.a(String.format("sns_data_%s_%s", Arrays.copyOf(new Object[]{str, str2}, 2)));
            if (str4 != null) {
                if (!kotlin.jvm.internal.f.b(str, "field")) {
                    str4 = null;
                }
                if (str4 != null) {
                    return str4;
                }
            }
            if (str3 == null || !kotlin.jvm.internal.f.b(str, "field")) {
                str3 = null;
            }
            if (str3 != null) {
                return str3;
            }
            if (a11 != null) {
                return a11;
            }
            if (str2 == null || !kotlin.jvm.internal.f.b(str, "field")) {
                return null;
            }
            return str2;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.ekyc.SNSEkycViewModel$showContent$1", f = "SNSEkycViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class x extends SuspendLambda implements InterfaceC0650p<f, T9.a<? super f>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f18168a;

        public x(T9.a<? super x> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(f fVar, T9.a<? super f> aVar) {
            return ((x) create(fVar, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return new x(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f18168a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            return f.c.f18062a;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.ekyc.SNSEkycViewModel$skipStep$1", f = "SNSEkycViewModel.kt", l = {365, 365, 369, 369}, m = "invokeSuspend")
    public static final class y extends SuspendLambda implements InterfaceC0646l<T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f18169a;

        /* renamed from: b, reason: collision with root package name */
        public Object f18170b;

        /* renamed from: c, reason: collision with root package name */
        public int f18171c;

        public y(T9.a<? super y> aVar) {
            super(1, aVar);
        }

        @Override // ca.InterfaceC0646l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(T9.a<? super O9.p> aVar) {
            return ((y) create(aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(T9.a<?> aVar) {
            return b.this.new y(aVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x006b A[Catch: all -> 0x0034, Api -> 0x0036, TryCatch #2 {Api -> 0x0036, all -> 0x0034, blocks: (B:20:0x0030, B:21:0x0063, B:22:0x0067, B:24:0x006b, B:25:0x0071, B:28:0x0038, B:29:0x004a, B:31:0x004e, B:33:0x0054, B:38:0x003f), top: B:2:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
                int r1 = r7.f18171c
                r2 = 4
                r3 = 3
                r4 = 1
                r5 = 2
                r6 = 0
                if (r1 == 0) goto L3c
                if (r1 == r4) goto L38
                if (r1 == r5) goto L30
                if (r1 == r3) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r0 = r7.f18170b
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                java.lang.Object r1 = r7.f18169a
                com.sumsub.sns.internal.presentation.screen.preview.ekyc.b r1 = (com.sumsub.sns.internal.presentation.screen.preview.ekyc.b) r1
                kotlin.b.b(r8)
                goto La6
            L20:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L28:
                java.lang.Object r1 = r7.f18169a
                com.sumsub.sns.internal.presentation.screen.preview.ekyc.b r1 = (com.sumsub.sns.internal.presentation.screen.preview.ekyc.b) r1
                kotlin.b.b(r8)
                goto L91
            L30:
                kotlin.b.b(r8)     // Catch: java.lang.Throwable -> L34 com.sumsub.sns.core.data.model.SNSException.Api -> L36
                goto L63
            L34:
                r8 = move-exception
                goto L75
            L36:
                r8 = move-exception
                goto L7b
            L38:
                kotlin.b.b(r8)     // Catch: java.lang.Throwable -> L34 com.sumsub.sns.core.data.model.SNSException.Api -> L36
                goto L4a
            L3c:
                kotlin.b.b(r8)
                com.sumsub.sns.internal.presentation.screen.preview.ekyc.b r8 = com.sumsub.sns.internal.presentation.screen.preview.ekyc.b.this     // Catch: java.lang.Throwable -> L34 com.sumsub.sns.core.data.model.SNSException.Api -> L36
                r7.f18171c = r4     // Catch: java.lang.Throwable -> L34 com.sumsub.sns.core.data.model.SNSException.Api -> L36
                java.lang.Object r8 = com.sumsub.sns.internal.presentation.screen.preview.ekyc.b.c(r8, r7)     // Catch: java.lang.Throwable -> L34 com.sumsub.sns.core.data.model.SNSException.Api -> L36
                if (r8 != r0) goto L4a
                return r0
            L4a:
                com.sumsub.sns.internal.core.data.model.g r8 = (com.sumsub.sns.internal.core.data.model.g) r8     // Catch: java.lang.Throwable -> L34 com.sumsub.sns.core.data.model.SNSException.Api -> L36
                if (r8 == 0) goto L66
                java.lang.String r8 = r8.B()     // Catch: java.lang.Throwable -> L34 com.sumsub.sns.core.data.model.SNSException.Api -> L36
                if (r8 == 0) goto L66
                com.sumsub.sns.internal.presentation.screen.preview.ekyc.b r1 = com.sumsub.sns.internal.presentation.screen.preview.ekyc.b.this     // Catch: java.lang.Throwable -> L34 com.sumsub.sns.core.data.model.SNSException.Api -> L36
                com.sumsub.sns.internal.core.data.source.applicant.e r1 = com.sumsub.sns.internal.presentation.screen.preview.ekyc.b.a(r1)     // Catch: java.lang.Throwable -> L34 com.sumsub.sns.core.data.model.SNSException.Api -> L36
                r7.f18171c = r5     // Catch: java.lang.Throwable -> L34 com.sumsub.sns.core.data.model.SNSException.Api -> L36
                java.lang.Object r8 = r1.d(r8, r7)     // Catch: java.lang.Throwable -> L34 com.sumsub.sns.core.data.model.SNSException.Api -> L36
                if (r8 != r0) goto L63
                return r0
            L63:
                com.sumsub.sns.internal.core.data.source.applicant.remote.d0 r8 = (com.sumsub.sns.internal.core.data.source.applicant.remote.d0) r8     // Catch: java.lang.Throwable -> L34 com.sumsub.sns.core.data.model.SNSException.Api -> L36
                goto L67
            L66:
                r8 = r6
            L67:
                com.sumsub.sns.internal.presentation.screen.preview.ekyc.b r1 = com.sumsub.sns.internal.presentation.screen.preview.ekyc.b.this     // Catch: java.lang.Throwable -> L34 com.sumsub.sns.core.data.model.SNSException.Api -> L36
                if (r8 == 0) goto L70
                com.sumsub.sns.internal.core.data.source.applicant.remote.EKycFlowStatus r8 = r8.b()     // Catch: java.lang.Throwable -> L34 com.sumsub.sns.core.data.model.SNSException.Api -> L36
                goto L71
            L70:
                r8 = r6
            L71:
                com.sumsub.sns.internal.presentation.screen.preview.ekyc.b.a(r1, r8)     // Catch: java.lang.Throwable -> L34 com.sumsub.sns.core.data.model.SNSException.Api -> L36
                goto Lb0
            L75:
                com.sumsub.sns.internal.presentation.screen.preview.ekyc.b r0 = com.sumsub.sns.internal.presentation.screen.preview.ekyc.b.this
                com.sumsub.sns.internal.presentation.screen.preview.a.a(r0, r8, r6, r5, r6)
                goto Lb0
            L7b:
                com.sumsub.sns.internal.presentation.screen.preview.ekyc.b r1 = com.sumsub.sns.internal.presentation.screen.preview.ekyc.b.this
                java.lang.String r4 = com.sumsub.sns.internal.presentation.screen.preview.ekyc.b.d(r1)
                com.sumsub.sns.internal.presentation.screen.preview.ekyc.b.a(r1, r4, r6, r5, r6)
                com.sumsub.sns.internal.presentation.screen.preview.ekyc.b r1 = com.sumsub.sns.internal.presentation.screen.preview.ekyc.b.this
                r7.f18169a = r1
                r7.f18171c = r3
                java.lang.Object r8 = com.sumsub.sns.internal.presentation.screen.preview.ekyc.b.a(r1, r8, r7)
                if (r8 != r0) goto L91
                return r0
            L91:
                java.lang.CharSequence r8 = (java.lang.CharSequence) r8
                com.sumsub.sns.internal.presentation.screen.preview.ekyc.b r3 = com.sumsub.sns.internal.presentation.screen.preview.ekyc.b.this
                r7.f18169a = r1
                r7.f18170b = r8
                r7.f18171c = r2
                java.lang.String r2 = "sns_alert_action_dismiss"
                java.lang.Object r2 = com.sumsub.sns.internal.presentation.screen.preview.ekyc.b.a(r3, r2, r7)
                if (r2 != r0) goto La4
                return r0
            La4:
                r0 = r8
                r8 = r2
            La6:
                java.lang.CharSequence r8 = (java.lang.CharSequence) r8
                com.sumsub.sns.internal.presentation.screen.preview.ekyc.b$d r2 = new com.sumsub.sns.internal.presentation.screen.preview.ekyc.b$d
                r2.<init>(r0, r8)
                com.sumsub.sns.internal.presentation.screen.preview.ekyc.b.a(r1, r2)
            Lb0:
                O9.p r8 = O9.p.f3034a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.presentation.screen.preview.ekyc.b.y.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.ekyc.SNSEkycViewModel$startResendCodeTimer$1", f = "SNSEkycViewModel.kt", l = {709}, m = "invokeSuspend")
    public static final class z extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f18173a;

        /* renamed from: b, reason: collision with root package name */
        public Object f18174b;

        /* renamed from: c, reason: collision with root package name */
        public int f18175c;

        @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.ekyc.SNSEkycViewModel$startResendCodeTimer$1$1$1", f = "SNSEkycViewModel.kt", l = {704, 706}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements InterfaceC0650p<f, T9.a<? super f>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f18177a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f18178b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b f18179c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ long f18180d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, long j10, T9.a<? super a> aVar) {
                super(2, aVar);
                this.f18179c = bVar;
                this.f18180d = j10;
            }

            @Override // ca.InterfaceC0650p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(f fVar, T9.a<? super f> aVar) {
                return ((a) create(fVar, aVar)).invokeSuspend(O9.p.f3034a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
                a aVar2 = new a(this.f18179c, this.f18180d, aVar);
                aVar2.f18178b = obj;
                return aVar2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                f.e eVar;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
                int i = this.f18177a;
                if (i == 0) {
                    kotlin.b.b(obj);
                    f fVar = (f) this.f18178b;
                    b bVar = this.f18179c;
                    this.f18177a = 1;
                    obj = bVar.b(fVar, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        eVar = (f.e) this.f18178b;
                        kotlin.b.b(obj);
                        return f.e.a(eVar, null, null, (CharSequence) obj, null, this.f18180d, null, 43, null);
                    }
                    kotlin.b.b(obj);
                }
                f.e eVar2 = (f.e) obj;
                b bVar2 = this.f18179c;
                long j10 = this.f18180d;
                this.f18178b = eVar2;
                this.f18177a = 2;
                Object a10 = bVar2.a(j10, this);
                if (a10 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                eVar = eVar2;
                obj = a10;
                return f.e.a(eVar, null, null, (CharSequence) obj, null, this.f18180d, null, 43, null);
            }
        }

        @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.ekyc.SNSEkycViewModel$startResendCodeTimer$1$2", f = "SNSEkycViewModel.kt", l = {713, 714}, m = "invokeSuspend")
        /* renamed from: com.sumsub.sns.internal.presentation.screen.preview.ekyc.b$z$b, reason: collision with other inner class name */
        public static final class C0299b extends SuspendLambda implements InterfaceC0650p<f, T9.a<? super f>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f18181a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f18182b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b f18183c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0299b(b bVar, T9.a<? super C0299b> aVar) {
                super(2, aVar);
                this.f18183c = bVar;
            }

            @Override // ca.InterfaceC0650p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(f fVar, T9.a<? super f> aVar) {
                return ((C0299b) create(fVar, aVar)).invokeSuspend(O9.p.f3034a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
                C0299b c0299b = new C0299b(this.f18183c, aVar);
                c0299b.f18182b = obj;
                return c0299b;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                f.e eVar;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
                int i = this.f18181a;
                if (i == 0) {
                    kotlin.b.b(obj);
                    f fVar = (f) this.f18182b;
                    b bVar = this.f18183c;
                    this.f18181a = 1;
                    obj = bVar.b(fVar, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        eVar = (f.e) this.f18182b;
                        kotlin.b.b(obj);
                        return f.e.a(eVar, null, null, (CharSequence) obj, null, 0L, null, 59, null);
                    }
                    kotlin.b.b(obj);
                }
                f.e eVar2 = (f.e) obj;
                b bVar2 = this.f18183c;
                this.f18182b = eVar2;
                this.f18181a = 2;
                Object a10 = bVar2.a("sns_confirmation_code_action_resend", this);
                if (a10 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                eVar = eVar2;
                obj = a10;
                return f.e.a(eVar, null, null, (CharSequence) obj, null, 0L, null, 59, null);
            }
        }

        public z(T9.a<? super z> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((z) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return b.this.new z(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            b bVar;
            Iterator fVar;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f18175c;
            if (i == 0) {
                kotlin.b.b(obj);
                long j10 = 0;
                if (60 > j10) {
                    long j11 = j10 % 1;
                    if (j11 < 0) {
                        j11++;
                    }
                    long j12 = (0 - j11) % 1;
                    if (j12 < 0) {
                        j12++;
                    }
                    j10 += j12;
                }
                long j13 = j10;
                bVar = b.this;
                fVar = new ha.f(60L, j13, -1L);
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fVar = (Iterator) this.f18174b;
                bVar = (b) this.f18173a;
                kotlin.b.b(obj);
            }
            while (fVar.hasNext()) {
                com.sumsub.sns.core.presentation.base.a.a(bVar, false, new a(bVar, ((P9.x) fVar).a(), null), 1, null);
                this.f18173a = bVar;
                this.f18174b = fVar;
                this.f18175c = 1;
                if (DelayKt.delay(1000L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            b bVar2 = b.this;
            com.sumsub.sns.core.presentation.base.a.a(bVar2, false, new C0299b(bVar2, null), 1, null);
            return O9.p.f3034a;
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(b.class, "currentSourceId", "getCurrentSourceId()Ljava/lang/String;", 0);
        kotlin.jvm.internal.i iVar = kotlin.jvm.internal.h.f23186a;
        iVar.getClass();
        MutablePropertyReference1Impl mutablePropertyReference1Impl2 = new MutablePropertyReference1Impl(b.class, "currentConfirmationId", "getCurrentConfirmationId()Ljava/lang/String;", 0);
        iVar.getClass();
        f18002D = new InterfaceC0840h[]{mutablePropertyReference1Impl, mutablePropertyReference1Impl2, C.v.t(b.class, "lastOAuthConfirmModel", "getLastOAuthConfirmModel()Lcom/sumsub/sns/internal/core/data/source/applicant/remote/ApplicantDataConfirmModel;", 0, iVar), C.v.t(b.class, "submitResponse", "getSubmitResponse()Lcom/sumsub/sns/internal/core/data/source/applicant/remote/SubmitApplicantDataResponse;", 0, iVar), C.v.t(b.class, "fieldValueCache", "getFieldValueCache()Ljava/util/Map;", 0, iVar)};
        f18001C = new C0295b(null);
    }

    public b(Document document, com.sumsub.sns.internal.core.data.source.extensions.a aVar, com.sumsub.sns.internal.core.data.source.applicant.e eVar, G g10, com.sumsub.sns.internal.core.data.source.common.a aVar2, com.sumsub.sns.internal.core.data.source.dynamic.b bVar, com.sumsub.sns.internal.core.domain.b bVar2) {
        super(document, g10, aVar2, bVar, bVar2);
        this.Y = aVar;
        this.f18003Z = eVar;
        this.f18004a0 = new a1();
        this.f18008e0 = CoroutineScopeKt.CoroutineScope(ExecutorsKt.from(Executors.newSingleThreadExecutor()));
        this.f18010g0 = new com.sumsub.sns.internal.core.presentation.screen.base.a(g10, "currentSourceId", null);
        this.f18011h0 = new com.sumsub.sns.internal.core.presentation.screen.base.a(g10, "currentConfirmationId", null);
        this.f18012i0 = new com.sumsub.sns.internal.core.presentation.screen.base.a(g10, "lastOAuthConfirmModel", null);
        this.f18013j0 = new com.sumsub.sns.internal.core.presentation.screen.base.a(g10, "submitResponse", null);
        this.f18014k0 = new r();
        this.f18015l0 = StateFlowKt.MutableStateFlow(new b.a(0, EmptyList.f23104a, null, new b.c(null, null, 3, null)));
        this.f18016m0 = new com.sumsub.sns.internal.core.presentation.screen.base.a(g10, "KEY_FIELD_CACHE", kotlin.collections.a.p());
        com.sumsub.sns.internal.core.common.b0.b(j(), C0552s.b(this), new a(null));
    }

    public final String A() {
        return (String) this.f18011h0.a(this, f18002D[1]);
    }

    public final String B() {
        return (String) this.f18010g0.a(this, f18002D[0]);
    }

    @Override // com.sumsub.sns.core.presentation.base.a
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public f.C0297b e() {
        return f.C0297b.f18061a;
    }

    public final Map<String, String> D() {
        return (Map) this.f18016m0.a(this, f18002D[4]);
    }

    public final e0 F() {
        return (e0) this.f18013j0.a(this, f18002D[3]);
    }

    public final void G() {
        Logger.v$default(com.sumsub.sns.internal.log.a.f17535a, "EKyc", "onCloseOAuthClick", null, 4, null);
        K();
    }

    public final void H() {
        Logger.v$default(com.sumsub.sns.internal.log.a.f17535a, "EKyc", "E-ID confirm cancelled", null, 4, null);
        K();
    }

    public final void I() {
        a((InterfaceC0646l<? super T9.a<? super O9.p>, ? extends Object>) new t(null));
    }

    public final void J() {
        Logger.v$default(com.sumsub.sns.internal.log.a.f17535a, "EKyc", "onTryAgainClick", null, 4, null);
        K();
    }

    public final Job K() {
        return a(this, s(), (List) null, 2, (Object) null);
    }

    public final void L() {
        a((InterfaceC0646l<? super T9.a<? super O9.p>, ? extends Object>) new y(null));
    }

    public final void M() {
        Job launch$default;
        Job job = this.f18007d0;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.f18008e0, null, null, new z(null), 3, null);
        this.f18007d0 = launch$default;
    }

    @Override // com.sumsub.sns.core.presentation.base.a, androidx.lifecycle.Q
    public void onCleared() {
        super.onCleared();
        CoroutineScopeKt.cancel$default(this.f18008e0, null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean z() {
        Job job = this.f18007d0;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        f fVar = (f) c();
        if (!(fVar instanceof f.d) && !(fVar instanceof f.e)) {
            return true;
        }
        K();
        return false;
    }

    public final void f(String str) {
        this.f18010g0.a(this, f18002D[0], str);
    }

    public final void g(e0 e0Var) {
        com.sumsub.sns.core.presentation.base.a.a(this, false, new v(e0Var, null), 1, null);
        M();
    }

    public final void h(e0 e0Var) {
        this.f18013j0.a(this, f18002D[3], e0Var);
    }

    public final void d(Map<String, String> map) {
        this.f18016m0.a(this, f18002D[4], map);
    }

    public final void e(String str) {
        this.f18011h0.a(this, f18002D[1], str);
    }

    @Override // com.sumsub.sns.core.presentation.base.a
    public Object c(T9.a<? super O9.p> aVar) {
        m();
        return O9.p.f3034a;
    }

    public final void d(e0 e0Var) {
        if (e0Var == null) {
            return;
        }
        h(e0Var);
        if (e0Var.t() == EKycFlowStatus.CONFIRMATION_REQUIRED) {
            e(e0Var.h());
            ConfirmationType l10 = e0Var.l();
            int i9 = l10 == null ? -1 : g.f18076a[l10.ordinal()];
            if (i9 == 1) {
                g(e0Var);
                return;
            }
            if (i9 == 2) {
                f(e0Var);
                return;
            } else if (i9 != 3) {
                a(e0Var.t());
                return;
            } else {
                e(e0Var);
                return;
            }
        }
        a(e0Var.t());
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(T9.a<? super com.sumsub.sns.internal.core.data.model.g> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.sumsub.sns.internal.presentation.screen.preview.ekyc.b.n
            if (r0 == 0) goto L14
            r0 = r8
            com.sumsub.sns.internal.presentation.screen.preview.ekyc.b$n r0 = (com.sumsub.sns.internal.presentation.screen.preview.ekyc.b.n) r0
            int r1 = r0.f18130c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f18130c = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            com.sumsub.sns.internal.presentation.screen.preview.ekyc.b$n r0 = new com.sumsub.sns.internal.presentation.screen.preview.ekyc.b$n
            r0.<init>(r8)
            goto L12
        L1a:
            java.lang.Object r8 = r4.f18128a
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r1 = r4.f18130c
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            kotlin.b.b(r8)
            goto L49
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L31:
            kotlin.b.b(r8)
            com.sumsub.sns.internal.core.data.model.g r8 = r7.f18005b0
            if (r8 != 0) goto L51
            com.sumsub.sns.internal.core.data.source.dynamic.b r1 = r7.t()
            r4.f18130c = r2
            r5 = 3
            r6 = 0
            r2 = 0
            r3 = 0
            java.lang.Object r8 = com.sumsub.sns.internal.core.data.source.dynamic.b.d(r1, r2, r3, r4, r5, r6)
            if (r8 != r0) goto L49
            return r0
        L49:
            com.sumsub.sns.internal.core.data.source.dynamic.e r8 = (com.sumsub.sns.internal.core.data.source.dynamic.e) r8
            java.lang.Object r8 = r8.d()
            com.sumsub.sns.internal.core.data.model.g r8 = (com.sumsub.sns.internal.core.data.model.g) r8
        L51:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.presentation.screen.preview.ekyc.b.f(T9.a):java.lang.Object");
    }

    public final com.sumsub.sns.internal.core.data.source.applicant.remote.b c(Map<String, String> map) {
        Map<String, List<com.sumsub.sns.internal.core.data.model.j>> w2;
        Object obj;
        com.sumsub.sns.internal.core.data.model.e d10 = d();
        if (d10 != null && (w2 = d10.w()) != null) {
            String s10 = s();
            if (s10 != null) {
                List<com.sumsub.sns.internal.core.data.model.j> list = w2.get(s10);
                if (list != null) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (kotlin.jvm.internal.f.b(((com.sumsub.sns.internal.core.data.model.j) obj).h(), B())) {
                            break;
                        }
                    }
                    com.sumsub.sns.internal.core.data.model.j jVar = (com.sumsub.sns.internal.core.data.model.j) obj;
                    if (jVar != null) {
                        if (kotlin.jvm.internal.f.b(jVar.f(), "TAX_PAYER_NUMBER_DOC")) {
                            return new com.sumsub.sns.internal.core.data.source.applicant.remote.b((Map) null, map, 1, (DefaultConstructorMarker) null);
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                        String f10 = jVar.f();
                        if (f10 != null) {
                            linkedHashMap.put("idDocType", f10);
                        }
                        return new com.sumsub.sns.internal.core.data.source.applicant.remote.b(linkedHashMap, (Map) null, 2, (DefaultConstructorMarker) null);
                    }
                }
                throw new IllegalArgumentException("ApplicantDataSource is null");
            }
            throw new IllegalArgumentException("country is null");
        }
        throw new IllegalArgumentException("eKycConfig is null");
    }

    public final void e(e0 e0Var) {
        com.sumsub.sns.internal.core.data.source.applicant.remote.i n10;
        String f10;
        if (!u0.a()) {
            com.sumsub.sns.core.presentation.base.a.a(this, new Exception("Eid not available"), DocumentType.f15255l, (Object) null, 4, (Object) null);
            return;
        }
        if (e0Var != null && (n10 = e0Var.n()) != null && (f10 = n10.f()) != null) {
            String d10 = e0Var.n().d();
            if (d10 != null) {
                String h9 = e0Var.n().h();
                if (h9 != null) {
                    b(false);
                    a(new c(f10, h9, d10));
                    return;
                }
                throw new IllegalStateException("No url".toString());
            }
            throw new IllegalStateException("No hash".toString());
        }
        throw new IllegalStateException("No mobile token".toString());
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.b
    public StateFlow<b.a> b() {
        return this.f18015l0;
    }

    public final void f(e0 e0Var) {
        com.sumsub.sns.internal.core.data.source.applicant.remote.p p10 = e0Var.p();
        String c2 = p10 != null ? p10.c() : null;
        com.sumsub.sns.internal.core.data.source.applicant.remote.p p11 = e0Var.p();
        String e10 = p11 != null ? p11.e() : null;
        if (e10 != null && e10.length() != 0 && c2 != null && c2.length() != 0) {
            com.sumsub.sns.core.presentation.base.a.a(this, false, new u(e10, c2, null), 1, null);
        } else {
            com.sumsub.sns.internal.presentation.screen.preview.a.a(this, new Exception("url or redirect url is empty"), (Object) null, 2, (Object) null);
        }
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.b
    public void b(FormItem formItem, String str) {
        Logger.d$default(com.sumsub.sns.internal.log.a.f17535a, "EKyc", "onFieldValueChanged: " + formItem.k() + " -> " + str, null, 4, null);
        Map<String, String> D2 = D();
        String p10 = formItem.d().p();
        if (p10 == null) {
            p10 = "";
        }
        d(com.sumsub.sns.internal.core.common.i.a(D2, p10, str));
        if (formItem instanceof FormItem.c) {
            a(this, str, (List) null, 2, (Object) null);
        } else if (kotlin.jvm.internal.f.b(formItem.d().p(), "source_id")) {
            b(this, str, null, 2, null);
        }
    }

    public final void d(String str) {
        a((InterfaceC0646l<? super T9.a<? super O9.p>, ? extends Object>) new h(str, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0094 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(T9.a<? super com.sumsub.sns.internal.presentation.screen.preview.ekyc.b.f.a> r22) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.presentation.screen.preview.ekyc.b.d(T9.a):java.lang.Object");
    }

    public final Job b(String str, List<com.sumsub.sns.internal.domain.b> list) {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), null, null, new b0(str, this, list, null), 3, null);
        return launch$default;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0088 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(T9.a<? super com.sumsub.sns.internal.presentation.screen.preview.ekyc.b.f.e> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof com.sumsub.sns.internal.presentation.screen.preview.ekyc.b.l
            if (r0 == 0) goto L13
            r0 = r12
            com.sumsub.sns.internal.presentation.screen.preview.ekyc.b$l r0 = (com.sumsub.sns.internal.presentation.screen.preview.ekyc.b.l) r0
            int r1 = r0.f18121e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18121e = r1
            goto L18
        L13:
            com.sumsub.sns.internal.presentation.screen.preview.ekyc.b$l r0 = new com.sumsub.sns.internal.presentation.screen.preview.ekyc.b$l
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f18119c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f18121e
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L52
            if (r2 == r5) goto L4a
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r1 = r0.f18118b
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.f18117a
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            kotlin.b.b(r12)
            r3 = r0
            goto L8c
        L36:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L3e:
            java.lang.Object r2 = r0.f18118b
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            java.lang.Object r4 = r0.f18117a
            com.sumsub.sns.internal.presentation.screen.preview.ekyc.b r4 = (com.sumsub.sns.internal.presentation.screen.preview.ekyc.b) r4
            kotlin.b.b(r12)
            goto L78
        L4a:
            java.lang.Object r2 = r0.f18117a
            com.sumsub.sns.internal.presentation.screen.preview.ekyc.b r2 = (com.sumsub.sns.internal.presentation.screen.preview.ekyc.b) r2
            kotlin.b.b(r12)
            goto L63
        L52:
            kotlin.b.b(r12)
            r0.f18117a = r11
            r0.f18121e = r5
            r5 = 60
            java.lang.Object r12 = r11.a(r5, r0)
            if (r12 != r1) goto L62
            return r1
        L62:
            r2 = r11
        L63:
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            r0.f18117a = r2
            r0.f18118b = r12
            r0.f18121e = r4
            java.lang.String r4 = "sns_confirmation_code_ekyc_title"
            java.lang.Object r4 = r2.a(r4, r0)
            if (r4 != r1) goto L74
            return r1
        L74:
            r10 = r2
            r2 = r12
            r12 = r4
            r4 = r10
        L78:
            java.lang.String r12 = (java.lang.String) r12
            r0.f18117a = r2
            r0.f18118b = r12
            r0.f18121e = r3
            java.lang.String r3 = "sns_confirmation_code_ekyc_subtitle"
            java.lang.Object r0 = r4.a(r3, r0)
            if (r0 != r1) goto L89
            return r1
        L89:
            r1 = r12
            r12 = r0
            r3 = r2
        L8c:
            r2 = r12
            java.lang.String r2 = (java.lang.String) r2
            com.sumsub.sns.internal.presentation.screen.preview.ekyc.b$f$e r12 = new com.sumsub.sns.internal.presentation.screen.preview.ekyc.b$f$e
            r8 = 40
            r9 = 0
            r4 = 0
            r5 = 60
            r7 = 0
            r0 = r12
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.presentation.screen.preview.ekyc.b.e(T9.a):java.lang.Object");
    }

    public final void b(e0 e0Var) {
        if (e0Var.t() == EKycFlowStatus.CONFIRMATION_REQUIRED && e0Var.j() == ConfirmationStatus.RETRY) {
            b(false);
            c(true);
            com.sumsub.sns.core.presentation.base.a.a(this, false, new p(null), 1, null);
            return;
        }
        a(e0Var.t());
    }

    public final void a(com.sumsub.sns.internal.core.data.source.applicant.remote.a aVar) {
        this.f18012i0.a(this, f18002D[2], aVar);
    }

    public final void c(e0 e0Var) {
        if (e0Var.j() == ConfirmationStatus.RETRY) {
            com.sumsub.sns.core.presentation.base.a.a(this, false, new q(e0Var, null), 1, null);
        } else {
            g(e0Var);
        }
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.b
    public com.sumsub.sns.internal.core.presentation.form.d a() {
        return this.f18014k0;
    }

    @Override // com.sumsub.sns.internal.presentation.screen.preview.a
    public void a(com.sumsub.sns.internal.core.domain.c cVar) {
        String s10 = s();
        if (s10 == null) {
            s10 = cVar.i();
        }
        b(s10);
        a(cVar.h());
    }

    @Override // com.sumsub.sns.internal.presentation.screen.preview.a
    public void c(boolean z10) {
        if (z10) {
            return;
        }
        com.sumsub.sns.core.presentation.base.a.a(this, false, new x(null), 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // com.sumsub.sns.internal.presentation.screen.preview.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(com.sumsub.sns.internal.core.data.model.g r21, com.sumsub.sns.internal.core.data.model.e r22, T9.a<? super O9.p> r23) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.presentation.screen.preview.ekyc.b.a(com.sumsub.sns.internal.core.data.model.g, com.sumsub.sns.internal.core.data.model.e, T9.a):java.lang.Object");
    }

    public final Object b(f fVar, T9.a<? super f.e> aVar) {
        f.e eVar = fVar instanceof f.e ? (f.e) fVar : null;
        return eVar == null ? e(aVar) : eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Job b(b bVar, String str, List list, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            list = EmptyList.f23104a;
        }
        return bVar.b(str, (List<com.sumsub.sns.internal.domain.b>) list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Job a(b bVar, String str, List list, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            list = EmptyList.f23104a;
        }
        return bVar.a(str, (List<com.sumsub.sns.internal.domain.b>) list);
    }

    public final com.sumsub.sns.internal.domain.b a(List<com.sumsub.sns.internal.domain.b> list, FieldName fieldName) {
        Object obj;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            com.sumsub.sns.internal.core.data.model.h c2 = ((com.sumsub.sns.internal.domain.b) obj).c();
            if ((c2 instanceof h.d) && ((h.d) c2).q() == fieldName) {
                break;
            }
        }
        return (com.sumsub.sns.internal.domain.b) obj;
    }

    public final InterfaceC0650p<String, String, String> a(b.c cVar, String str, String str2) {
        return new w(str2, this, str, cVar);
    }

    public final Job a(String str, List<com.sumsub.sns.internal.domain.b> list) {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), null, null, new a0(str, list, null), 3, null);
        return launch$default;
    }

    public final void a(CharSequence charSequence, e0 e0Var) {
        a((InterfaceC0646l<? super T9.a<? super O9.p>, ? extends Object>) new j(e0Var, charSequence, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(CharSequence charSequence) {
        e0 j10;
        com.sumsub.sns.internal.core.data.source.applicant.remote.s r8;
        if (charSequence == null) {
            return;
        }
        S c2 = c();
        f.e eVar = c2 instanceof f.e ? (f.e) c2 : null;
        if (eVar == null || (j10 = eVar.j()) == null || (r8 = j10.r()) == null) {
            return;
        }
        int length = charSequence.length();
        Integer b9 = r8.b();
        if (b9 != null && length == b9.intValue()) {
            Job job = this.f18007d0;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            a(charSequence, eVar.j());
        }
    }

    public final boolean a(Uri uri, String str) {
        String B10;
        String A10;
        Logger.d$default(com.sumsub.sns.internal.log.a.f17535a, "EKyc", com.google.android.gms.measurement.internal.a.h("onCallbackUrl: ", uri), null, 4, null);
        if (str == null || str.length() == 0 || !uri.toString().startsWith(str)) {
            return false;
        }
        b(true);
        c(false);
        com.sumsub.sns.internal.core.data.model.g gVar = this.f18005b0;
        if (gVar == null || (B10 = gVar.B()) == null || (A10 = A()) == null) {
            return true;
        }
        com.sumsub.sns.internal.core.data.source.applicant.remote.a aVar = new com.sumsub.sns.internal.core.data.source.applicant.remote.a((com.sumsub.sns.internal.core.data.source.applicant.remote.t) null, new com.sumsub.sns.internal.core.data.source.applicant.remote.q(uri.toString()), (com.sumsub.sns.internal.core.data.source.applicant.remote.j) null, 5, (DefaultConstructorMarker) null);
        a(aVar);
        a(B10, A10, aVar);
        return true;
    }

    public final void a(String str, String str2, com.sumsub.sns.internal.core.data.source.applicant.remote.a aVar) {
        b(true);
        c(false);
        BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), null, null, new i(str, str2, aVar, null), 3, null);
    }

    public final void a(e0 e0Var) {
        if (e0Var == null) {
            return;
        }
        if (e0Var.t() == EKycFlowStatus.CONFIRMATION_REQUIRED) {
            ConfirmationType l10 = e0Var.l();
            int i9 = l10 == null ? -1 : g.f18076a[l10.ordinal()];
            if (i9 == 1) {
                c(e0Var);
                return;
            } else if (i9 != 2 && i9 != 3) {
                a(e0Var.t());
                return;
            } else {
                b(e0Var);
                return;
            }
        }
        a(e0Var.t());
    }

    public final void a(EKycFlowStatus eKycFlowStatus) {
        int i9 = eKycFlowStatus == null ? -1 : g.f18077b[eKycFlowStatus.ordinal()];
        if (i9 == 1 || i9 == 2) {
            com.sumsub.sns.core.presentation.base.a.a(this, new q.b(false, 1, null), (Object) null, (Long) null, 6, (Object) null);
        } else if (i9 != 3) {
            com.sumsub.sns.core.presentation.base.a.a(this, new q.b(false), (Object) null, (Long) null, 6, (Object) null);
        } else {
            com.sumsub.sns.core.presentation.base.a.a(this, new q.b(false), (Object) null, (Long) null, 6, (Object) null);
        }
    }

    public final Object a(f fVar, T9.a<? super f.a> aVar) {
        f.a aVar2 = fVar instanceof f.a ? (f.a) fVar : null;
        return aVar2 == null ? d(aVar) : aVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(long r9, T9.a<? super java.lang.CharSequence> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.sumsub.sns.internal.presentation.screen.preview.ekyc.b.o
            if (r0 == 0) goto L13
            r0 = r11
            com.sumsub.sns.internal.presentation.screen.preview.ekyc.b$o r0 = (com.sumsub.sns.internal.presentation.screen.preview.ekyc.b.o) r0
            int r1 = r0.f18135e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18135e = r1
            goto L18
        L13:
            com.sumsub.sns.internal.presentation.screen.preview.ekyc.b$o r0 = new com.sumsub.sns.internal.presentation.screen.preview.ekyc.b$o
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f18133c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f18135e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            long r9 = r0.f18131a
            java.lang.Object r0 = r0.f18132b
            java.lang.String r0 = (java.lang.String) r0
            kotlin.b.b(r11)
            goto L69
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            kotlin.b.b(r11)
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.SECONDS
            long r4 = r11.toMinutes(r9)
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.MINUTES
            long r6 = r11.toSeconds(r4)
            long r9 = r9 - r6
            java.lang.Long r11 = new java.lang.Long
            r11.<init>(r9)
            java.lang.Object[] r9 = new java.lang.Object[]{r11}
            java.lang.Object[] r9 = java.util.Arrays.copyOf(r9, r3)
            java.lang.String r10 = "%02d"
            java.lang.String r9 = java.lang.String.format(r10, r9)
            r0.f18132b = r9
            r0.f18131a = r4
            r0.f18135e = r3
            java.lang.String r10 = "sns_confirmation_code_resendCountdown"
            java.lang.Object r11 = r8.a(r10, r0)
            if (r11 != r1) goto L67
            return r1
        L67:
            r0 = r9
            r9 = r4
        L69:
            java.lang.String r11 = java.lang.String.valueOf(r11)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r9)
            r9 = 58
            r1.append(r9)
            r1.append(r0)
            java.lang.String r9 = r1.toString()
            r10 = 0
            java.lang.String r0 = "{time}"
            java.lang.String r9 = ka.C0967l.X(r11, r0, r9, r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.presentation.screen.preview.ekyc.b.a(long, T9.a):java.lang.Object");
    }

    public final Object a(SNSException.Api api, T9.a<? super String> aVar) {
        String description;
        if (api.getErrorCode() != null && (description = api.getDescription()) != null && !C0969n.i0(description)) {
            return api.getDescription();
        }
        return a("sns_ekyc_error_common", aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r8, java.lang.String r9, T9.a<? super java.lang.String> r10) {
        /*
            r7 = this;
            r0 = 1
            boolean r1 = r10 instanceof com.sumsub.sns.internal.presentation.screen.preview.ekyc.b.m
            if (r1 == 0) goto L14
            r1 = r10
            com.sumsub.sns.internal.presentation.screen.preview.ekyc.b$m r1 = (com.sumsub.sns.internal.presentation.screen.preview.ekyc.b.m) r1
            int r2 = r1.f18127f
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L14
            int r2 = r2 - r3
            r1.f18127f = r2
            goto L19
        L14:
            com.sumsub.sns.internal.presentation.screen.preview.ekyc.b$m r1 = new com.sumsub.sns.internal.presentation.screen.preview.ekyc.b$m
            r1.<init>(r10)
        L19:
            java.lang.Object r10 = r1.f18125d
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r3 = r1.f18127f
            r4 = 0
            if (r3 == 0) goto L3c
            if (r3 != r0) goto L34
            java.lang.Object r8 = r1.f18124c
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r1.f18123b
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r0 = r1.f18122a
            com.sumsub.sns.internal.presentation.screen.preview.ekyc.b r0 = (com.sumsub.sns.internal.presentation.screen.preview.ekyc.b) r0
            kotlin.b.b(r10)
            goto L76
        L34:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3c:
            kotlin.b.b(r10)
            if (r8 == 0) goto Lac
            if (r9 != 0) goto L45
            goto Lac
        L45:
            char[] r10 = new char[r0]
            r3 = 46
            r5 = 0
            r10[r5] = r3
            java.util.List r9 = ka.C0969n.q0(r9, r10)
            java.lang.String r9 = com.sumsub.sns.internal.core.common.z0.a(r9)
            java.lang.Object[] r10 = new java.lang.Object[]{r8, r9}
            r3 = 2
            java.lang.Object[] r10 = java.util.Arrays.copyOf(r10, r3)
            java.lang.String r3 = "sns_ekyc_source_%s::%s"
            java.lang.String r10 = java.lang.String.format(r3, r10)
            r1.f18122a = r7
            r1.f18123b = r8
            r1.f18124c = r9
            r1.f18127f = r0
            java.lang.Object r10 = r7.a(r10, r1)
            if (r10 != r2) goto L72
            return r2
        L72:
            r0 = r7
            r6 = r9
            r9 = r8
            r8 = r6
        L76:
            java.lang.String r10 = (java.lang.String) r10
            if (r10 == 0) goto L87
            int r1 = r10.length()
            if (r1 <= 0) goto L81
            goto L82
        L81:
            r10 = r4
        L82:
            if (r10 != 0) goto L85
            goto L87
        L85:
            r4 = r10
            goto Lac
        L87:
            com.sumsub.sns.internal.domain.c r10 = r0.f18009f0
            if (r10 == 0) goto Lac
            com.sumsub.sns.internal.core.data.model.e r10 = r10.f()
            if (r10 == 0) goto Lac
            java.util.Map r10 = r10.x()
            if (r10 == 0) goto Lac
            java.lang.Object r8 = r10.get(r8)
            com.sumsub.sns.internal.core.data.model.w r8 = (com.sumsub.sns.internal.core.data.model.w) r8
            if (r8 == 0) goto Lac
            java.util.Map r8 = r8.e()
            if (r8 == 0) goto Lac
            java.lang.Object r8 = r8.get(r9)
            r4 = r8
            java.lang.String r4 = (java.lang.String) r4
        Lac:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.presentation.screen.preview.ekyc.b.a(java.lang.String, java.lang.String, T9.a):java.lang.Object");
    }
}
