package com.sumsub.sns.internal.presentation.consent;

import C.v;
import O9.p;
import P9.m;
import P9.s;
import androidx.lifecycle.C0552s;
import androidx.lifecycle.G;
import ca.InterfaceC0650p;
import ca.InterfaceC0651q;
import com.sumsub.sns.core.data.listener.SNSCountryPicker;
import com.sumsub.sns.core.presentation.base.a;
import com.sumsub.sns.internal.core.data.source.dynamic.b;
import com.sumsub.sns.internal.core.domain.n;
import ia.InterfaceC0840h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes2.dex */
public final class a extends com.sumsub.sns.core.presentation.base.a<d> {

    /* renamed from: y, reason: collision with root package name */
    public static final C0285a f17833y;

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC0840h<Object>[] f17834z;

    /* renamed from: q, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.dynamic.b f17835q;

    /* renamed from: r, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.applicant.b f17836r;

    /* renamed from: s, reason: collision with root package name */
    public final n f17837s;

    /* renamed from: t, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.extensions.a f17838t;

    /* renamed from: u, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.presentation.screen.base.a f17839u;

    /* renamed from: v, reason: collision with root package name */
    public final StateFlow<Integer> f17840v;

    /* renamed from: w, reason: collision with root package name */
    public final Flow<List<b>> f17841w;

    /* renamed from: x, reason: collision with root package name */
    public final StateFlow<d> f17842x;

    /* renamed from: com.sumsub.sns.internal.presentation.consent.a$a, reason: collision with other inner class name */
    public static final class C0285a {
        public /* synthetic */ C0285a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C0285a() {
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f17843a;

        /* renamed from: b, reason: collision with root package name */
        public final SNSCountryPicker.CountryItem f17844b;

        public b(int i, SNSCountryPicker.CountryItem countryItem) {
            this.f17843a = i;
            this.f17844b = countryItem;
        }

        public final SNSCountryPicker.CountryItem c() {
            return this.f17844b;
        }

        public final int d() {
            return this.f17843a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f17843a == bVar.f17843a && kotlin.jvm.internal.f.b(this.f17844b, bVar.f17844b);
        }

        public int hashCode() {
            return this.f17844b.hashCode() + (Integer.hashCode(this.f17843a) * 31);
        }

        public String toString() {
            return "CountryWrapperItem(id=" + this.f17843a + ", country=" + this.f17844b + ')';
        }
    }

    public static final class c implements a.j {

        /* renamed from: a, reason: collision with root package name */
        public final String f17845a;

        public c(String str) {
            this.f17845a = str;
        }

        public final String b() {
            return this.f17845a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && kotlin.jvm.internal.f.b(this.f17845a, ((c) obj).f17845a);
        }

        public int hashCode() {
            return this.f17845a.hashCode();
        }

        public String toString() {
            return v.q(new StringBuilder("ShowAgreementEvent(text="), this.f17845a, ')');
        }
    }

    public static final class d implements a.l {

        /* renamed from: a, reason: collision with root package name */
        public final Integer f17846a;

        /* renamed from: b, reason: collision with root package name */
        public final CharSequence f17847b;

        /* renamed from: c, reason: collision with root package name */
        public final CharSequence f17848c;

        /* renamed from: d, reason: collision with root package name */
        public final CharSequence f17849d;

        /* renamed from: e, reason: collision with root package name */
        public final CharSequence f17850e;

        /* renamed from: f, reason: collision with root package name */
        public final List<b> f17851f;

        public d() {
            this(null, null, null, null, null, null, 63, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return kotlin.jvm.internal.f.b(this.f17846a, dVar.f17846a) && kotlin.jvm.internal.f.b(this.f17847b, dVar.f17847b) && kotlin.jvm.internal.f.b(this.f17848c, dVar.f17848c) && kotlin.jvm.internal.f.b(this.f17849d, dVar.f17849d) && kotlin.jvm.internal.f.b(this.f17850e, dVar.f17850e) && kotlin.jvm.internal.f.b(this.f17851f, dVar.f17851f);
        }

        public final CharSequence g() {
            return this.f17849d;
        }

        public final List<b> h() {
            return this.f17851f;
        }

        public int hashCode() {
            Integer num = this.f17846a;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            CharSequence charSequence = this.f17847b;
            int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
            CharSequence charSequence2 = this.f17848c;
            int hashCode3 = (hashCode2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
            CharSequence charSequence3 = this.f17849d;
            int hashCode4 = (hashCode3 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
            CharSequence charSequence4 = this.f17850e;
            return this.f17851f.hashCode() + ((hashCode4 + (charSequence4 != null ? charSequence4.hashCode() : 0)) * 31);
        }

        public final CharSequence i() {
            return this.f17850e;
        }

        public final Integer j() {
            return this.f17846a;
        }

        public final CharSequence k() {
            return this.f17848c;
        }

        public final CharSequence l() {
            return this.f17847b;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("ViewState(selectedAgreementId=");
            sb2.append(this.f17846a);
            sb2.append(", titleText=");
            sb2.append((Object) this.f17847b);
            sb2.append(", subtitleText=");
            sb2.append((Object) this.f17848c);
            sb2.append(", acceptText=");
            sb2.append((Object) this.f17849d);
            sb2.append(", footerText=");
            sb2.append((Object) this.f17850e);
            sb2.append(", countries=");
            return v.r(sb2, this.f17851f, ')');
        }

        public d(Integer num, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, List<b> list) {
            this.f17846a = num;
            this.f17847b = charSequence;
            this.f17848c = charSequence2;
            this.f17849d = charSequence3;
            this.f17850e = charSequence4;
            this.f17851f = list;
        }

        public d(Integer num, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : charSequence, (i & 4) != 0 ? null : charSequence2, (i & 8) != 0 ? null : charSequence3, (i & 16) == 0 ? charSequence4 : null, (i & 32) != 0 ? EmptyList.f23104a : list);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.consent.SNSAgreementSelectorViewModel$agreementsItems$1", f = "SNSAgreementSelectorViewModel.kt", l = {54, 66}, m = "invokeSuspend")
    public static final class e extends SuspendLambda implements InterfaceC0650p<FlowCollector<? super List<? extends b>>, T9.a<? super p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f17852a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f17853b;

        public e(T9.a<? super e> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(FlowCollector<? super List<b>> flowCollector, T9.a<? super p> aVar) {
            return ((e) create(flowCollector, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            e eVar = a.this.new e(aVar);
            eVar.f17853b = obj;
            return eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            FlowCollector flowCollector;
            Object b9;
            ArrayList arrayList;
            String str;
            String str2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f17852a;
            if (i == 0) {
                kotlin.b.b(obj);
                flowCollector = (FlowCollector) this.f17853b;
                a aVar = a.this;
                this.f17853b = flowCollector;
                this.f17852a = 1;
                b9 = aVar.b(this);
                if (b9 == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.b.b(obj);
                    return p.f3034a;
                }
                flowCollector = (FlowCollector) this.f17853b;
                kotlin.b.b(obj);
                b9 = obj;
            }
            List<com.sumsub.sns.internal.core.data.model.d> c2 = ((b.c) b9).c();
            if (c2 != null) {
                a aVar2 = a.this;
                arrayList = new ArrayList(P9.n.u(c2, 10));
                int i9 = 0;
                for (Object obj2 : c2) {
                    int i10 = i9 + 1;
                    if (i9 < 0) {
                        m.t();
                        throw null;
                    }
                    com.sumsub.sns.internal.core.data.model.d dVar = (com.sumsub.sns.internal.core.data.model.d) obj2;
                    com.sumsub.sns.internal.core.data.model.c e10 = dVar.e();
                    String str3 = "";
                    if (e10 == null || (str = e10.b()) == null) {
                        str = "";
                    }
                    com.sumsub.sns.internal.core.data.model.e d10 = aVar2.d();
                    if (d10 != null) {
                        com.sumsub.sns.internal.core.data.model.b c10 = dVar.c();
                        str2 = com.sumsub.sns.internal.core.data.model.f.b(d10, c10 != null ? c10.q() : null);
                    } else {
                        str2 = null;
                    }
                    if (str2 != null) {
                        str3 = str2;
                    }
                    arrayList.add(new b(i9, new SNSCountryPicker.CountryItem(str, str3)));
                    i9 = i10;
                }
            } else {
                arrayList = new ArrayList();
            }
            if (c2 != null && c2.size() == 1) {
                a.this.a(new Integer(0));
            }
            this.f17853b = null;
            this.f17852a = 2;
            if (flowCollector.emit(arrayList, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return p.f3034a;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.consent.SNSAgreementSelectorViewModel$onAgreeClicked$1", f = "SNSAgreementSelectorViewModel.kt", l = {102, 111}, m = "invokeSuspend")
    public static final class f extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f17855a;

        public f(T9.a<? super f> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
            return ((f) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            return a.this.new f(aVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0078  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x006f  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
                int r1 = r12.f17855a
                r2 = 0
                r3 = 2
                r4 = 1
                r5 = 0
                if (r1 == 0) goto L23
                if (r1 == r4) goto L1f
                if (r1 != r3) goto L17
                kotlin.b.b(r13)
                kotlin.Result r13 = (kotlin.Result) r13
                r13.getClass()
                goto L60
            L17:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L1f:
                kotlin.b.b(r13)
                goto L35
            L23:
                kotlin.b.b(r13)
                com.sumsub.sns.internal.presentation.consent.a r13 = com.sumsub.sns.internal.presentation.consent.a.this
                com.sumsub.sns.internal.core.data.source.dynamic.b r13 = com.sumsub.sns.internal.presentation.consent.a.c(r13)
                r12.f17855a = r4
                java.lang.Object r13 = com.sumsub.sns.internal.core.data.source.dynamic.b.e(r13, r5, r12, r4, r2)
                if (r13 != r0) goto L35
                return r0
            L35:
                com.sumsub.sns.internal.core.data.source.dynamic.e r13 = (com.sumsub.sns.internal.core.data.source.dynamic.e) r13
                java.lang.Object r13 = r13.d()
                r8 = r13
                com.sumsub.sns.internal.core.data.model.g r8 = (com.sumsub.sns.internal.core.data.model.g) r8
                com.sumsub.sns.internal.presentation.consent.a r13 = com.sumsub.sns.internal.presentation.consent.a.this
                com.sumsub.sns.internal.core.data.model.b r9 = r13.q()
                if (r8 == 0) goto L87
                if (r9 != 0) goto L49
                goto L87
            L49:
                com.sumsub.sns.internal.presentation.consent.a r13 = com.sumsub.sns.internal.presentation.consent.a.this
                com.sumsub.sns.internal.core.domain.n r6 = com.sumsub.sns.internal.presentation.consent.a.e(r13)
                com.sumsub.sns.internal.presentation.consent.a r13 = com.sumsub.sns.internal.presentation.consent.a.this
                com.sumsub.sns.internal.core.data.source.applicant.b r7 = com.sumsub.sns.internal.presentation.consent.a.a(r13)
                r12.f17855a = r3
                r10 = 0
                r11 = r12
                java.lang.Object r13 = r6.a(r7, r8, r9, r10, r11)
                if (r13 != r0) goto L60
                return r0
            L60:
                com.sumsub.sns.internal.presentation.consent.a r13 = com.sumsub.sns.internal.presentation.consent.a.this
                r13.b(r5)
                com.sumsub.sns.internal.presentation.consent.a r6 = com.sumsub.sns.internal.presentation.consent.a.this
                com.sumsub.sns.internal.core.common.q$b r7 = new com.sumsub.sns.internal.core.common.q$b
                com.sumsub.sns.internal.core.data.model.e r13 = com.sumsub.sns.internal.presentation.consent.a.b(r6)
                if (r13 == 0) goto L73
                com.sumsub.sns.core.data.model.FlowType r2 = r13.y()
            L73:
                com.sumsub.sns.core.data.model.FlowType r13 = com.sumsub.sns.core.data.model.FlowType.Standalone
                if (r2 == r13) goto L78
                goto L79
            L78:
                r4 = r5
            L79:
                r7.<init>(r4)
                java.lang.Boolean r8 = java.lang.Boolean.TRUE
                r10 = 4
                r11 = 0
                r9 = 0
                com.sumsub.sns.core.presentation.base.a.a(r6, r7, r8, r9, r10, r11)
                O9.p r13 = O9.p.f3034a
                return r13
            L87:
                com.sumsub.sns.internal.presentation.consent.a r13 = com.sumsub.sns.internal.presentation.consent.a.this
                r13.b(r5)
                com.sumsub.sns.internal.presentation.consent.a r6 = com.sumsub.sns.internal.presentation.consent.a.this
                com.sumsub.sns.internal.core.common.q$b r7 = new com.sumsub.sns.internal.core.common.q$b
                r7.<init>(r5)
                java.lang.Boolean r8 = java.lang.Boolean.TRUE
                r10 = 4
                r11 = 0
                r9 = 0
                com.sumsub.sns.core.presentation.base.a.a(r6, r7, r8, r9, r10, r11)
                O9.p r13 = O9.p.f3034a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.presentation.consent.a.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.consent.SNSAgreementSelectorViewModel$onTermsLinksClicked$1", f = "SNSAgreementSelectorViewModel.kt", l = {128, 129, 138, 139}, m = "invokeSuspend")
    public static final class g extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f17857a;

        /* renamed from: b, reason: collision with root package name */
        public int f17858b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f17859c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ a f17860d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, a aVar, T9.a<? super g> aVar2) {
            super(2, aVar2);
            this.f17859c = str;
            this.f17860d = aVar;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
            return ((g) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            return new g(this.f17859c, this.f17860d, aVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x00e3  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x00e9  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00db  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00b8  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00d2 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00d3  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0082  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0067 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0068  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                Method dump skipped, instructions count: 260
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.presentation.consent.a.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.consent.SNSAgreementSelectorViewModel$viewState$1", f = "SNSAgreementSelectorViewModel.kt", l = {74, 76, 76, 83, 84}, m = "invokeSuspend")
    public static final class h extends SuspendLambda implements InterfaceC0651q<Integer, List<? extends b>, T9.a<? super d>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f17861a;

        /* renamed from: b, reason: collision with root package name */
        public Object f17862b;

        /* renamed from: c, reason: collision with root package name */
        public Object f17863c;

        /* renamed from: d, reason: collision with root package name */
        public int f17864d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f17865e;

        /* renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f17866f;

        public h(T9.a<? super h> aVar) {
            super(3, aVar);
        }

        @Override // ca.InterfaceC0651q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Integer num, List<b> list, T9.a<? super d> aVar) {
            h hVar = a.this.new h(aVar);
            hVar.f17865e = num;
            hVar.f17866f = list;
            return hVar.invokeSuspend(p.f3034a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:11:0x011c  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00f1 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00f2  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00c8 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00c9  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 302
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.presentation.consent.a.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.consent.SNSAgreementSelectorViewModel$viewState$2", f = "SNSAgreementSelectorViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class i extends SuspendLambda implements InterfaceC0651q<FlowCollector<? super d>, Throwable, T9.a<? super p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f17868a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f17869b;

        public i(T9.a<? super i> aVar) {
            super(3, aVar);
        }

        @Override // ca.InterfaceC0651q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(FlowCollector<? super d> flowCollector, Throwable th, T9.a<? super p> aVar) {
            i iVar = new i(aVar);
            iVar.f17869b = th;
            return iVar.invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f17868a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            Throwable th = (Throwable) this.f17869b;
            com.sumsub.sns.internal.log.a.f17535a.e("SNSAgreementSelectorViewModel", "Error building state: " + th.getMessage(), th);
            return p.f3034a;
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(a.class, "selectedAgreement", "getSelectedAgreement()Ljava/lang/Integer;", 0);
        kotlin.jvm.internal.h.f23186a.getClass();
        f17834z = new InterfaceC0840h[]{mutablePropertyReference1Impl};
        f17833y = new C0285a(null);
    }

    public a(com.sumsub.sns.internal.core.data.source.common.a aVar, com.sumsub.sns.internal.core.data.source.dynamic.b bVar, com.sumsub.sns.internal.core.data.source.applicant.b bVar2, n nVar, com.sumsub.sns.internal.core.data.source.extensions.a aVar2, G g10) {
        super(aVar, bVar);
        this.f17835q = bVar;
        this.f17836r = bVar2;
        this.f17837s = nVar;
        this.f17838t = aVar2;
        this.f17839u = new com.sumsub.sns.internal.core.presentation.screen.base.a(g10, "consent_selected_agreement", null);
        StateFlow<Integer> c2 = g10.c(null, "consent_selected_agreement");
        this.f17840v = c2;
        Flow<List<b>> flow = FlowKt.flow(new e(null));
        this.f17841w = flow;
        this.f17842x = FlowKt.stateIn(FlowKt.m142catch(FlowKt.combine(c2, flow, new h(null)), new i(null)), C0552s.b(this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 0L, 0L, 3, null), new d(null, null, null, null, null, null, 63, null));
    }

    public final b p() {
        Object obj;
        Iterator<T> it = j().getValue().h().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            int d10 = ((b) obj).d();
            Integer r8 = r();
            if (r8 != null && d10 == r8.intValue()) {
                break;
            }
        }
        return (b) obj;
    }

    public final com.sumsub.sns.internal.core.data.model.b q() {
        com.sumsub.sns.internal.core.data.model.d dVar;
        Integer r8 = r();
        if (r8 == null) {
            return null;
        }
        int intValue = r8.intValue();
        List<com.sumsub.sns.internal.core.data.model.d> c2 = h().c();
        if (c2 == null || (dVar = (com.sumsub.sns.internal.core.data.model.d) s.M(intValue, c2)) == null) {
            return null;
        }
        return dVar.c();
    }

    public final Integer r() {
        return (Integer) this.f17839u.a(this, f17834z[0]);
    }

    @Override // com.sumsub.sns.core.presentation.base.a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public StateFlow<d> j() {
        return this.f17842x;
    }

    public final void t() {
        b(true);
        BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), null, null, new f(null), 3, null);
    }

    public final Job b(String str) {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), null, null, new g(str, this, null), 3, null);
        return launch$default;
    }

    public final void a(Integer num) {
        this.f17839u.a(this, f17834z[0], num);
    }

    public final void a(int i9) {
        a(Integer.valueOf(i9));
    }
}
