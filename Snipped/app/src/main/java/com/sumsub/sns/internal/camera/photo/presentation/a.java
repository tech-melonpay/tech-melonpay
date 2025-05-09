package com.sumsub.sns.internal.camera.photo.presentation;

import C.v;
import androidx.lifecycle.C0552s;
import ca.InterfaceC0650p;
import ca.InterfaceC0651q;
import ca.t;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.core.data.listener.SNSCountryPicker;
import com.sumsub.sns.core.data.listener.SNSEvent;
import com.sumsub.sns.core.data.listener.SNSEventHandler;
import com.sumsub.sns.core.presentation.base.a;
import com.sumsub.sns.internal.core.common.e0;
import com.sumsub.sns.internal.core.common.w;
import com.sumsub.sns.internal.core.domain.e;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.bouncycastle.asn1.BERTags;

/* loaded from: classes2.dex */
public final class a extends com.sumsub.sns.core.presentation.base.a<e> {

    /* renamed from: B, reason: collision with root package name */
    public static final C0176a f14496B = new C0176a(null);

    /* renamed from: A, reason: collision with root package name */
    public final StateFlow<e> f14497A;

    /* renamed from: q, reason: collision with root package name */
    public final String f14498q;

    /* renamed from: r, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.extensions.a f14499r;

    /* renamed from: s, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.domain.b f14500s;

    /* renamed from: t, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.domain.e f14501t;

    /* renamed from: u, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.common.a f14502u;

    /* renamed from: v, reason: collision with root package name */
    public final StateFlow<com.sumsub.sns.internal.core.domain.c> f14503v;

    /* renamed from: w, reason: collision with root package name */
    public final MutableStateFlow<Boolean> f14504w;

    /* renamed from: x, reason: collision with root package name */
    public final MutableStateFlow<SNSCountryPicker.CountryItem> f14505x;

    /* renamed from: y, reason: collision with root package name */
    public final StateFlow<c> f14506y;

    /* renamed from: z, reason: collision with root package name */
    public final StateFlow<List<SNSCountryPicker.CountryItem>> f14507z;

    /* renamed from: com.sumsub.sns.internal.camera.photo.presentation.a$a, reason: collision with other inner class name */
    public static final class C0176a {
        public /* synthetic */ C0176a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C0176a() {
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final com.sumsub.sns.internal.core.data.model.q f14508a;

        /* renamed from: b, reason: collision with root package name */
        public final CharSequence f14509b;

        public b(com.sumsub.sns.internal.core.data.model.q qVar, CharSequence charSequence) {
            this.f14508a = qVar;
            this.f14509b = charSequence;
        }

        public final com.sumsub.sns.internal.core.data.model.q c() {
            return this.f14508a;
        }

        public final CharSequence d() {
            return this.f14509b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.f.b(this.f14508a, bVar.f14508a) && kotlin.jvm.internal.f.b(this.f14509b, bVar.f14509b);
        }

        public int hashCode() {
            int hashCode = this.f14508a.hashCode() * 31;
            CharSequence charSequence = this.f14509b;
            return hashCode + (charSequence == null ? 0 : charSequence.hashCode());
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("DocumentWrapper(document=");
            sb2.append(this.f14508a);
            sb2.append(", title=");
            return com.google.android.gms.measurement.internal.a.j(sb2, this.f14509b, ')');
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final List<b> f14510a;

        /* renamed from: b, reason: collision with root package name */
        public final String f14511b;

        public c() {
            this(null, null, 3, null);
        }

        public final String c() {
            return this.f14511b;
        }

        public final List<b> d() {
            return this.f14510a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return kotlin.jvm.internal.f.b(this.f14510a, cVar.f14510a) && kotlin.jvm.internal.f.b(this.f14511b, cVar.f14511b);
        }

        public int hashCode() {
            int hashCode = this.f14510a.hashCode() * 31;
            String str = this.f14511b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Documents(documents=");
            sb2.append(this.f14510a);
            sb2.append(", currentCountryKey=");
            return v.q(sb2, this.f14511b, ')');
        }

        public c(List<b> list, String str) {
            this.f14510a = list;
            this.f14511b = str;
        }

        public c(List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? EmptyList.f23104a : list, (i & 2) != 0 ? null : str);
        }
    }

    public static final class d implements a.j {

        /* renamed from: a, reason: collision with root package name */
        public final String f14512a;

        /* renamed from: b, reason: collision with root package name */
        public final com.sumsub.sns.internal.core.data.model.q f14513b;

        public d(String str, com.sumsub.sns.internal.core.data.model.q qVar) {
            this.f14512a = str;
            this.f14513b = qVar;
        }

        public final String c() {
            return this.f14512a;
        }

        public final com.sumsub.sns.internal.core.data.model.q d() {
            return this.f14513b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return kotlin.jvm.internal.f.b(this.f14512a, dVar.f14512a) && kotlin.jvm.internal.f.b(this.f14513b, dVar.f14513b);
        }

        public int hashCode() {
            int hashCode = this.f14512a.hashCode() * 31;
            com.sumsub.sns.internal.core.data.model.q qVar = this.f14513b;
            return hashCode + (qVar == null ? 0 : qVar.hashCode());
        }

        public String toString() {
            return "SelectionChanged(countryKey=" + this.f14512a + ", identityType=" + this.f14513b + ')';
        }
    }

    public static final class e implements a.l {

        /* renamed from: a, reason: collision with root package name */
        public final com.sumsub.sns.internal.core.domain.c f14514a;

        /* renamed from: b, reason: collision with root package name */
        public final String f14515b;

        /* renamed from: c, reason: collision with root package name */
        public final c f14516c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f14517d;

        /* renamed from: e, reason: collision with root package name */
        public final List<SNSCountryPicker.CountryItem> f14518e;

        /* renamed from: f, reason: collision with root package name */
        public final SNSCountryPicker.CountryItem f14519f;

        /* renamed from: g, reason: collision with root package name */
        public final f f14520g;

        public e() {
            this(null, null, null, false, null, null, null, 127, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return kotlin.jvm.internal.f.b(this.f14514a, eVar.f14514a) && kotlin.jvm.internal.f.b(this.f14515b, eVar.f14515b) && kotlin.jvm.internal.f.b(this.f14516c, eVar.f14516c) && this.f14517d == eVar.f14517d && kotlin.jvm.internal.f.b(this.f14518e, eVar.f14518e) && kotlin.jvm.internal.f.b(this.f14519f, eVar.f14519f) && kotlin.jvm.internal.f.b(this.f14520g, eVar.f14520g);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            com.sumsub.sns.internal.core.domain.c cVar = this.f14514a;
            int hashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
            String str = this.f14515b;
            int hashCode2 = (this.f14516c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
            boolean z10 = this.f14517d;
            int i = z10;
            if (z10 != 0) {
                i = 1;
            }
            int i9 = (hashCode2 + i) * 31;
            List<SNSCountryPicker.CountryItem> list = this.f14518e;
            int hashCode3 = (i9 + (list == null ? 0 : list.hashCode())) * 31;
            SNSCountryPicker.CountryItem countryItem = this.f14519f;
            int hashCode4 = (hashCode3 + (countryItem == null ? 0 : countryItem.hashCode())) * 31;
            f fVar = this.f14520g;
            return hashCode4 + (fVar != null ? fVar.hashCode() : 0);
        }

        public final List<SNSCountryPicker.CountryItem> j() {
            return this.f14518e;
        }

        public final boolean k() {
            return this.f14517d;
        }

        public final c l() {
            return this.f14516c;
        }

        public final SNSCountryPicker.CountryItem m() {
            return this.f14519f;
        }

        public final f n() {
            return this.f14520g;
        }

        public String toString() {
            return "ViewState(countries=" + this.f14514a + ", currentCountryKey=" + this.f14515b + ", documents=" + this.f14516c + ", dialogIsVisible=" + this.f14517d + ", dialogCountryItems=" + this.f14518e + ", selectedCountry=" + this.f14519f + ", viewText=" + this.f14520g + ')';
        }

        public e(com.sumsub.sns.internal.core.domain.c cVar, String str, c cVar2, boolean z10, List<SNSCountryPicker.CountryItem> list, SNSCountryPicker.CountryItem countryItem, f fVar) {
            this.f14514a = cVar;
            this.f14515b = str;
            this.f14516c = cVar2;
            this.f14517d = z10;
            this.f14518e = list;
            this.f14519f = countryItem;
            this.f14520g = fVar;
        }

        public /* synthetic */ e(com.sumsub.sns.internal.core.domain.c cVar, String str, c cVar2, boolean z10, List list, SNSCountryPicker.CountryItem countryItem, f fVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : cVar, (i & 2) != 0 ? null : str, (i & 4) != 0 ? new c(null, null, 3, null) : cVar2, (i & 8) != 0 ? false : z10, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : countryItem, (i & 64) != 0 ? null : fVar);
        }
    }

    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        public final CharSequence f14521a;

        /* renamed from: b, reason: collision with root package name */
        public final CharSequence f14522b;

        /* renamed from: c, reason: collision with root package name */
        public final CharSequence f14523c;

        /* renamed from: d, reason: collision with root package name */
        public final CharSequence f14524d;

        /* renamed from: e, reason: collision with root package name */
        public final CharSequence f14525e;

        public f(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, CharSequence charSequence5) {
            this.f14521a = charSequence;
            this.f14522b = charSequence2;
            this.f14523c = charSequence3;
            this.f14524d = charSequence4;
            this.f14525e = charSequence5;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return kotlin.jvm.internal.f.b(this.f14521a, fVar.f14521a) && kotlin.jvm.internal.f.b(this.f14522b, fVar.f14522b) && kotlin.jvm.internal.f.b(this.f14523c, fVar.f14523c) && kotlin.jvm.internal.f.b(this.f14524d, fVar.f14524d) && kotlin.jvm.internal.f.b(this.f14525e, fVar.f14525e);
        }

        public final CharSequence f() {
            return this.f14525e;
        }

        public final CharSequence g() {
            return this.f14521a;
        }

        public final CharSequence h() {
            return this.f14522b;
        }

        public int hashCode() {
            CharSequence charSequence = this.f14521a;
            int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
            CharSequence charSequence2 = this.f14522b;
            int hashCode2 = (hashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
            CharSequence charSequence3 = this.f14523c;
            int hashCode3 = (hashCode2 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
            CharSequence charSequence4 = this.f14524d;
            int hashCode4 = (hashCode3 + (charSequence4 == null ? 0 : charSequence4.hashCode())) * 31;
            CharSequence charSequence5 = this.f14525e;
            return hashCode4 + (charSequence5 != null ? charSequence5.hashCode() : 0);
        }

        public final CharSequence i() {
            return this.f14523c;
        }

        public final CharSequence j() {
            return this.f14524d;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("ViewText(countryTitleText=");
            sb2.append((Object) this.f14521a);
            sb2.append(", documentTitleText=");
            sb2.append((Object) this.f14522b);
            sb2.append(", footerText=");
            sb2.append((Object) this.f14523c);
            sb2.append(", infoText=");
            sb2.append((Object) this.f14524d);
            sb2.append(", countryPlaceholder=");
            return com.google.android.gms.measurement.internal.a.j(sb2, this.f14525e, ')');
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.camera.photo.presentation.SNSDocumentSelectorViewModel", f = "SNSDocumentSelectorViewModel.kt", l = {213, 214}, m = "buildViewText")
    public static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f14526a;

        /* renamed from: b, reason: collision with root package name */
        public Object f14527b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f14528c;

        /* renamed from: e, reason: collision with root package name */
        public int f14530e;

        public g(T9.a<? super g> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f14528c = obj;
            this.f14530e |= Integer.MIN_VALUE;
            return a.this.d(this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.camera.photo.presentation.SNSDocumentSelectorViewModel$countries$1", f = "SNSDocumentSelectorViewModel.kt", l = {49, 55}, m = "invokeSuspend")
    public static final class h extends SuspendLambda implements InterfaceC0650p<FlowCollector<? super com.sumsub.sns.internal.core.domain.c>, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14531a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f14532b;

        public h(T9.a<? super h> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(FlowCollector<? super com.sumsub.sns.internal.core.domain.c> flowCollector, T9.a<? super O9.p> aVar) {
            return ((h) create(flowCollector, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            h hVar = a.this.new h(aVar);
            hVar.f14532b = obj;
            return hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            FlowCollector flowCollector;
            Object a10;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f14531a;
            if (i == 0) {
                kotlin.b.b(obj);
                flowCollector = (FlowCollector) this.f14532b;
                com.sumsub.sns.internal.core.domain.b bVar = a.this.f14500s;
                this.f14532b = flowCollector;
                this.f14531a = 1;
                a10 = bVar.a(true, this);
                if (a10 == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.b.b(obj);
                    return O9.p.f3034a;
                }
                flowCollector = (FlowCollector) this.f14532b;
                kotlin.b.b(obj);
                a10 = ((Result) obj).f23091a;
            }
            boolean z10 = a10 instanceof Result.Failure;
            if (z10) {
                Exception exc = (Exception) Result.a(a10);
                com.sumsub.sns.internal.log.a aVar = com.sumsub.sns.internal.log.a.f17535a;
                String a11 = com.sumsub.sns.internal.log.c.a(flowCollector);
                String message = exc.getMessage();
                if (message == null) {
                    message = "";
                }
                aVar.e(a11, message, exc);
                a aVar2 = a.this;
                com.sumsub.sns.core.presentation.base.a.a(aVar2, exc, aVar2.f14498q, (Object) null, 4, (Object) null);
            } else {
                if (z10) {
                    a10 = null;
                }
                this.f14532b = null;
                this.f14531a = 2;
                if (flowCollector.emit(a10, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return O9.p.f3034a;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.camera.photo.presentation.SNSDocumentSelectorViewModel$countries$2", f = "SNSDocumentSelectorViewModel.kt", l = {59}, m = "invokeSuspend")
    public static final class i extends SuspendLambda implements InterfaceC0650p<com.sumsub.sns.internal.core.domain.c, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14534a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f14535b;

        @V9.d(c = "com.sumsub.sns.internal.camera.photo.presentation.SNSDocumentSelectorViewModel$countries$2$1", f = "SNSDocumentSelectorViewModel.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.sumsub.sns.internal.camera.photo.presentation.a$i$a, reason: collision with other inner class name */
        public static final class C0177a extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f14537a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.sumsub.sns.internal.core.domain.c f14538b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0177a(com.sumsub.sns.internal.core.domain.c cVar, T9.a<? super C0177a> aVar) {
                super(2, aVar);
                this.f14538b = cVar;
            }

            @Override // ca.InterfaceC0650p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
                return ((C0177a) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
                return new C0177a(this.f14538b, aVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                String i;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
                if (this.f14537a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
                SNSEventHandler eventHandler = e0.f15081a.getEventHandler();
                if (eventHandler != null) {
                    com.sumsub.sns.internal.core.domain.c cVar = this.f14538b;
                    if (cVar == null || (i = cVar.i()) == null) {
                        return O9.p.f3034a;
                    }
                    eventHandler.onEvent(new SNSEvent.CountrySelected(i, false));
                }
                return O9.p.f3034a;
            }
        }

        public i(T9.a<? super i> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.sumsub.sns.internal.core.domain.c cVar, T9.a<? super O9.p> aVar) {
            return ((i) create(cVar, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            i iVar = a.this.new i(aVar);
            iVar.f14535b = obj;
            return iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f14534a;
            if (i == 0) {
                kotlin.b.b(obj);
                com.sumsub.sns.internal.core.domain.c cVar = (com.sumsub.sns.internal.core.domain.c) this.f14535b;
                S0.a b9 = C0552s.b(a.this);
                C0177a c0177a = new C0177a(cVar, null);
                this.f14534a = 1;
                if (BuildersKt.withContext(b9.f3328a, c0177a, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return O9.p.f3034a;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.camera.photo.presentation.SNSDocumentSelectorViewModel$documents$3", f = "SNSDocumentSelectorViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class j extends SuspendLambda implements InterfaceC0651q<FlowCollector<? super c>, Throwable, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14539a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f14540b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f14541c;

        public j(T9.a<? super j> aVar) {
            super(3, aVar);
        }

        @Override // ca.InterfaceC0651q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(FlowCollector<? super c> flowCollector, Throwable th, T9.a<? super O9.p> aVar) {
            j jVar = a.this.new j(aVar);
            jVar.f14540b = flowCollector;
            jVar.f14541c = th;
            return jVar.invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f14539a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            FlowCollector flowCollector = (FlowCollector) this.f14540b;
            Throwable th = (Throwable) this.f14541c;
            com.sumsub.sns.internal.log.a aVar = com.sumsub.sns.internal.log.a.f17535a;
            String a10 = com.sumsub.sns.internal.log.c.a(flowCollector);
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            aVar.e(a10, message, th);
            a aVar2 = a.this;
            com.sumsub.sns.core.presentation.base.a.a(aVar2, th, aVar2.f14498q, (Object) null, 4, (Object) null);
            return O9.p.f3034a;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.camera.photo.presentation.SNSDocumentSelectorViewModel$documents$4", f = "SNSDocumentSelectorViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class k extends SuspendLambda implements InterfaceC0650p<c, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14543a;

        public k(T9.a<? super k> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(c cVar, T9.a<? super O9.p> aVar) {
            return ((k) create(cVar, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return a.this.new k(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f14543a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            a.this.f14504w.setValue(Boolean.FALSE);
            return O9.p.f3034a;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.camera.photo.presentation.SNSDocumentSelectorViewModel", f = "SNSDocumentSelectorViewModel.kt", l = {157}, m = "getCountryTitle")
    public static final class l extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f14545a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f14546b;

        /* renamed from: d, reason: collision with root package name */
        public int f14548d;

        public l(T9.a<? super l> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f14546b = obj;
            this.f14548d |= Integer.MIN_VALUE;
            return a.this.e(this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.camera.photo.presentation.SNSDocumentSelectorViewModel", f = "SNSDocumentSelectorViewModel.kt", l = {168}, m = "getDocumentsTitle")
    public static final class m extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f14549a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f14550b;

        /* renamed from: d, reason: collision with root package name */
        public int f14552d;

        public m(T9.a<? super m> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f14550b = obj;
            this.f14552d |= Integer.MIN_VALUE;
            return a.this.f(this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.camera.photo.presentation.SNSDocumentSelectorViewModel$selectedDialogCountryItems$2", f = "SNSDocumentSelectorViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class n extends SuspendLambda implements InterfaceC0650p<List<? extends SNSCountryPicker.CountryItem>, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14553a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f14554b;

        public n(T9.a<? super n> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(List<SNSCountryPicker.CountryItem> list, T9.a<? super O9.p> aVar) {
            return ((n) create(list, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            n nVar = a.this.new n(aVar);
            nVar.f14554b = obj;
            return nVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f14553a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            List list = (List) this.f14554b;
            MutableStateFlow mutableStateFlow = a.this.f14505x;
            a aVar = a.this;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                String code = ((SNSCountryPicker.CountryItem) next).getCode();
                com.sumsub.sns.internal.core.domain.c cVar = (com.sumsub.sns.internal.core.domain.c) aVar.f14503v.getValue();
                if (kotlin.jvm.internal.f.b(code, cVar != null ? cVar.i() : null)) {
                    str = next;
                    break;
                }
            }
            mutableStateFlow.setValue(str);
            return O9.p.f3034a;
        }
    }

    public static final class o implements Flow<e.b> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Flow f14556a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a f14557b;

        /* renamed from: com.sumsub.sns.internal.camera.photo.presentation.a$o$a, reason: collision with other inner class name */
        public static final class C0178a<T> implements FlowCollector {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ FlowCollector f14558a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a f14559b;

            @V9.d(c = "com.sumsub.sns.internal.camera.photo.presentation.SNSDocumentSelectorViewModel$special$$inlined$map$1$2", f = "SNSDocumentSelectorViewModel.kt", l = {BERTags.FLAGS, 229, 226}, m = "emit")
            /* renamed from: com.sumsub.sns.internal.camera.photo.presentation.a$o$a$a, reason: collision with other inner class name */
            public static final class C0179a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f14560a;

                /* renamed from: b, reason: collision with root package name */
                public int f14561b;

                /* renamed from: c, reason: collision with root package name */
                public Object f14562c;

                /* renamed from: e, reason: collision with root package name */
                public Object f14564e;

                /* renamed from: f, reason: collision with root package name */
                public Object f14565f;

                public C0179a(T9.a aVar) {
                    super(aVar);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f14560a = obj;
                    this.f14561b |= Integer.MIN_VALUE;
                    return C0178a.this.emit(null, this);
                }
            }

            public C0178a(FlowCollector flowCollector, a aVar) {
                this.f14558a = flowCollector;
                this.f14559b = aVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:20:0x00a6 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x0050  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r10, T9.a r11) {
                /*
                    r9 = this;
                    boolean r0 = r11 instanceof com.sumsub.sns.internal.camera.photo.presentation.a.o.C0178a.C0179a
                    if (r0 == 0) goto L13
                    r0 = r11
                    com.sumsub.sns.internal.camera.photo.presentation.a$o$a$a r0 = (com.sumsub.sns.internal.camera.photo.presentation.a.o.C0178a.C0179a) r0
                    int r1 = r0.f14561b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f14561b = r1
                    goto L18
                L13:
                    com.sumsub.sns.internal.camera.photo.presentation.a$o$a$a r0 = new com.sumsub.sns.internal.camera.photo.presentation.a$o$a$a
                    r0.<init>(r11)
                L18:
                    java.lang.Object r11 = r0.f14560a
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
                    int r2 = r0.f14561b
                    r3 = 2
                    r4 = 1
                    r5 = 3
                    r6 = 0
                    if (r2 == 0) goto L50
                    if (r2 == r4) goto L3f
                    if (r2 == r3) goto L37
                    if (r2 != r5) goto L2f
                    kotlin.b.b(r11)
                    goto La7
                L2f:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r11)
                    throw r10
                L37:
                    java.lang.Object r10 = r0.f14562c
                    kotlinx.coroutines.flow.FlowCollector r10 = (kotlinx.coroutines.flow.FlowCollector) r10
                    kotlin.b.b(r11)
                    goto L98
                L3f:
                    java.lang.Object r10 = r0.f14565f
                    com.sumsub.sns.core.data.listener.SNSCountryPicker$CountryItem r10 = (com.sumsub.sns.core.data.listener.SNSCountryPicker.CountryItem) r10
                    java.lang.Object r2 = r0.f14564e
                    kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
                    java.lang.Object r4 = r0.f14562c
                    com.sumsub.sns.internal.camera.photo.presentation.a$o$a r4 = (com.sumsub.sns.internal.camera.photo.presentation.a.o.C0178a) r4
                    kotlin.b.b(r11)
                    r11 = r2
                    goto L69
                L50:
                    kotlin.b.b(r11)
                    kotlinx.coroutines.flow.FlowCollector r11 = r9.f14558a
                    com.sumsub.sns.core.data.listener.SNSCountryPicker$CountryItem r10 = (com.sumsub.sns.core.data.listener.SNSCountryPicker.CountryItem) r10
                    com.sumsub.sns.internal.camera.photo.presentation.a r2 = r9.f14559b
                    r0.f14562c = r9
                    r0.f14564e = r11
                    r0.f14565f = r10
                    r0.f14561b = r4
                    java.lang.Object r2 = com.sumsub.sns.internal.camera.photo.presentation.a.a(r2, r0)
                    if (r2 != r1) goto L68
                    return r1
                L68:
                    r4 = r9
                L69:
                    if (r10 != 0) goto L74
                    com.sumsub.sns.internal.core.domain.e$b r10 = new com.sumsub.sns.internal.core.domain.e$b
                    r10.<init>(r6, r6, r5, r6)
                L70:
                    r8 = r11
                    r11 = r10
                    r10 = r8
                    goto L98
                L74:
                    com.sumsub.sns.internal.camera.photo.presentation.a r2 = r4.f14559b
                    com.sumsub.sns.internal.core.domain.e r2 = com.sumsub.sns.internal.camera.photo.presentation.a.e(r2)
                    com.sumsub.sns.internal.core.domain.e$a r7 = new com.sumsub.sns.internal.core.domain.e$a
                    java.lang.String r10 = r10.getCode()
                    com.sumsub.sns.internal.camera.photo.presentation.a r4 = r4.f14559b
                    java.lang.String r4 = com.sumsub.sns.internal.camera.photo.presentation.a.d(r4)
                    r7.<init>(r10, r4)
                    r0.f14562c = r11
                    r0.f14564e = r6
                    r0.f14565f = r6
                    r0.f14561b = r3
                    java.lang.Object r10 = r2.a(r7, r0)
                    if (r10 != r1) goto L70
                    return r1
                L98:
                    r0.f14562c = r6
                    r0.f14564e = r6
                    r0.f14565f = r6
                    r0.f14561b = r5
                    java.lang.Object r10 = r10.emit(r11, r0)
                    if (r10 != r1) goto La7
                    return r1
                La7:
                    O9.p r10 = O9.p.f3034a
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.camera.photo.presentation.a.o.C0178a.emit(java.lang.Object, T9.a):java.lang.Object");
            }
        }

        public o(Flow flow, a aVar) {
            this.f14556a = flow;
            this.f14557b = aVar;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super e.b> flowCollector, T9.a aVar) {
            Object collect = this.f14556a.collect(new C0178a(flowCollector, this.f14557b), aVar);
            return collect == CoroutineSingletons.f23158a ? collect : O9.p.f3034a;
        }
    }

    public static final class p implements Flow<c> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Flow f14566a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a f14567b;

        /* renamed from: com.sumsub.sns.internal.camera.photo.presentation.a$p$a, reason: collision with other inner class name */
        public static final class C0180a<T> implements FlowCollector {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ FlowCollector f14568a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a f14569b;

            @V9.d(c = "com.sumsub.sns.internal.camera.photo.presentation.SNSDocumentSelectorViewModel$special$$inlined$map$2$2", f = "SNSDocumentSelectorViewModel.kt", l = {230}, m = "emit")
            /* renamed from: com.sumsub.sns.internal.camera.photo.presentation.a$p$a$a, reason: collision with other inner class name */
            public static final class C0181a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f14570a;

                /* renamed from: b, reason: collision with root package name */
                public int f14571b;

                public C0181a(T9.a aVar) {
                    super(aVar);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f14570a = obj;
                    this.f14571b |= Integer.MIN_VALUE;
                    return C0180a.this.emit(null, this);
                }
            }

            public C0180a(FlowCollector flowCollector, a aVar) {
                this.f14568a = flowCollector;
                this.f14569b = aVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r12, T9.a r13) {
                /*
                    r11 = this;
                    boolean r0 = r13 instanceof com.sumsub.sns.internal.camera.photo.presentation.a.p.C0180a.C0181a
                    if (r0 == 0) goto L13
                    r0 = r13
                    com.sumsub.sns.internal.camera.photo.presentation.a$p$a$a r0 = (com.sumsub.sns.internal.camera.photo.presentation.a.p.C0180a.C0181a) r0
                    int r1 = r0.f14571b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f14571b = r1
                    goto L18
                L13:
                    com.sumsub.sns.internal.camera.photo.presentation.a$p$a$a r0 = new com.sumsub.sns.internal.camera.photo.presentation.a$p$a$a
                    r0.<init>(r13)
                L18:
                    java.lang.Object r13 = r0.f14570a
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
                    int r2 = r0.f14571b
                    r3 = 1
                    if (r2 == 0) goto L2f
                    if (r2 != r3) goto L27
                    kotlin.b.b(r13)
                    goto L80
                L27:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                    r12.<init>(r13)
                    throw r12
                L2f:
                    kotlin.b.b(r13)
                    kotlinx.coroutines.flow.FlowCollector r13 = r11.f14568a
                    com.sumsub.sns.internal.core.domain.e$b r12 = (com.sumsub.sns.internal.core.domain.e.b) r12
                    java.util.ArrayList r2 = new java.util.ArrayList
                    r2.<init>()
                    java.util.List r4 = r12.d()
                    java.util.Iterator r4 = r4.iterator()
                L43:
                    boolean r5 = r4.hasNext()
                    if (r5 == 0) goto L6e
                    java.lang.Object r5 = r4.next()
                    com.sumsub.sns.internal.core.data.model.q r5 = (com.sumsub.sns.internal.core.data.model.q) r5
                    com.sumsub.sns.internal.camera.photo.presentation.a$b r6 = new com.sumsub.sns.internal.camera.photo.presentation.a$b
                    com.sumsub.sns.internal.camera.photo.presentation.a r7 = r11.f14569b
                    com.sumsub.sns.internal.core.data.source.extensions.a r7 = com.sumsub.sns.internal.camera.photo.presentation.a.f(r7)
                    com.sumsub.sns.internal.camera.photo.presentation.a r8 = r11.f14569b
                    com.sumsub.sns.internal.core.data.source.dynamic.b$c r8 = com.sumsub.sns.internal.camera.photo.presentation.a.h(r8)
                    r9 = 2
                    r10 = 0
                    java.lang.CharSequence r8 = com.sumsub.sns.internal.core.data.model.q.a(r5, r8, r10, r9, r10)
                    android.text.Spanned r7 = r7.a(r8)
                    r6.<init>(r5, r7)
                    r2.add(r6)
                    goto L43
                L6e:
                    com.sumsub.sns.internal.camera.photo.presentation.a$c r4 = new com.sumsub.sns.internal.camera.photo.presentation.a$c
                    java.lang.String r12 = r12.c()
                    r4.<init>(r2, r12)
                    r0.f14571b = r3
                    java.lang.Object r12 = r13.emit(r4, r0)
                    if (r12 != r1) goto L80
                    return r1
                L80:
                    O9.p r12 = O9.p.f3034a
                    return r12
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.camera.photo.presentation.a.p.C0180a.emit(java.lang.Object, T9.a):java.lang.Object");
            }
        }

        public p(Flow flow, a aVar) {
            this.f14566a = flow;
            this.f14567b = aVar;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super c> flowCollector, T9.a aVar) {
            Object collect = this.f14566a.collect(new C0180a(flowCollector, this.f14567b), aVar);
            return collect == CoroutineSingletons.f23158a ? collect : O9.p.f3034a;
        }
    }

    public static final class q implements Flow<List<? extends SNSCountryPicker.CountryItem>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Flow f14573a;

        /* renamed from: com.sumsub.sns.internal.camera.photo.presentation.a$q$a, reason: collision with other inner class name */
        public static final class C0182a<T> implements FlowCollector {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ FlowCollector f14574a;

            @V9.d(c = "com.sumsub.sns.internal.camera.photo.presentation.SNSDocumentSelectorViewModel$special$$inlined$map$3$2", f = "SNSDocumentSelectorViewModel.kt", l = {BERTags.FLAGS}, m = "emit")
            /* renamed from: com.sumsub.sns.internal.camera.photo.presentation.a$q$a$a, reason: collision with other inner class name */
            public static final class C0183a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f14575a;

                /* renamed from: b, reason: collision with root package name */
                public int f14576b;

                public C0183a(T9.a aVar) {
                    super(aVar);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f14575a = obj;
                    this.f14576b |= Integer.MIN_VALUE;
                    return C0182a.this.emit(null, this);
                }
            }

            public C0182a(FlowCollector flowCollector) {
                this.f14574a = flowCollector;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.collections.EmptyList] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r9v2, types: [kotlinx.coroutines.flow.FlowCollector] */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r8, T9.a r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof com.sumsub.sns.internal.camera.photo.presentation.a.q.C0182a.C0183a
                    if (r0 == 0) goto L13
                    r0 = r9
                    com.sumsub.sns.internal.camera.photo.presentation.a$q$a$a r0 = (com.sumsub.sns.internal.camera.photo.presentation.a.q.C0182a.C0183a) r0
                    int r1 = r0.f14576b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f14576b = r1
                    goto L18
                L13:
                    com.sumsub.sns.internal.camera.photo.presentation.a$q$a$a r0 = new com.sumsub.sns.internal.camera.photo.presentation.a$q$a$a
                    r0.<init>(r9)
                L18:
                    java.lang.Object r9 = r0.f14575a
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
                    int r2 = r0.f14576b
                    r3 = 1
                    if (r2 == 0) goto L2f
                    if (r2 != r3) goto L27
                    kotlin.b.b(r9)
                    goto L7b
                L27:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L2f:
                    kotlin.b.b(r9)
                    kotlinx.coroutines.flow.FlowCollector r9 = r7.f14574a
                    com.sumsub.sns.internal.core.domain.c r8 = (com.sumsub.sns.internal.core.domain.c) r8
                    if (r8 == 0) goto L70
                    java.util.Map r8 = r8.h()
                    if (r8 == 0) goto L70
                    java.util.ArrayList r2 = new java.util.ArrayList
                    int r4 = r8.size()
                    r2.<init>(r4)
                    java.util.Set r8 = r8.entrySet()
                    java.util.Iterator r8 = r8.iterator()
                L4f:
                    boolean r4 = r8.hasNext()
                    if (r4 == 0) goto L72
                    java.lang.Object r4 = r8.next()
                    java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                    java.lang.Object r5 = r4.getKey()
                    java.lang.String r5 = (java.lang.String) r5
                    java.lang.Object r4 = r4.getValue()
                    java.lang.String r4 = (java.lang.String) r4
                    com.sumsub.sns.core.data.listener.SNSCountryPicker$CountryItem r6 = new com.sumsub.sns.core.data.listener.SNSCountryPicker$CountryItem
                    r6.<init>(r5, r4)
                    r2.add(r6)
                    goto L4f
                L70:
                    kotlin.collections.EmptyList r2 = kotlin.collections.EmptyList.f23104a
                L72:
                    r0.f14576b = r3
                    java.lang.Object r8 = r9.emit(r2, r0)
                    if (r8 != r1) goto L7b
                    return r1
                L7b:
                    O9.p r8 = O9.p.f3034a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.camera.photo.presentation.a.q.C0182a.emit(java.lang.Object, T9.a):java.lang.Object");
            }
        }

        public q(Flow flow) {
            this.f14573a = flow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super List<? extends SNSCountryPicker.CountryItem>> flowCollector, T9.a aVar) {
            Object collect = this.f14573a.collect(new C0182a(flowCollector), aVar);
            return collect == CoroutineSingletons.f23158a ? collect : O9.p.f3034a;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.camera.photo.presentation.SNSDocumentSelectorViewModel$viewState$1", f = "SNSDocumentSelectorViewModel.kt", l = {116, 124}, m = "invokeSuspend")
    public static final class r extends SuspendLambda implements t<com.sumsub.sns.internal.core.domain.c, Boolean, c, List<? extends SNSCountryPicker.CountryItem>, SNSCountryPicker.CountryItem, T9.a<? super e>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14578a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f14579b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ boolean f14580c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f14581d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f14582e;

        /* renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f14583f;

        public r(T9.a<? super r> aVar) {
            super(6, aVar);
        }

        public final Object a(com.sumsub.sns.internal.core.domain.c cVar, boolean z10, c cVar2, List<SNSCountryPicker.CountryItem> list, SNSCountryPicker.CountryItem countryItem, T9.a<? super e> aVar) {
            r rVar = a.this.new r(aVar);
            rVar.f14579b = cVar;
            rVar.f14580c = z10;
            rVar.f14581d = cVar2;
            rVar.f14582e = list;
            rVar.f14583f = countryItem;
            return rVar.invokeSuspend(O9.p.f3034a);
        }

        @Override // ca.t
        public /* bridge */ /* synthetic */ Object invoke(com.sumsub.sns.internal.core.domain.c cVar, Boolean bool, c cVar2, List<? extends SNSCountryPicker.CountryItem> list, SNSCountryPicker.CountryItem countryItem, T9.a<? super e> aVar) {
            return a(cVar, bool.booleanValue(), cVar2, list, countryItem, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            com.sumsub.sns.internal.core.domain.c cVar;
            boolean z10;
            SNSCountryPicker.CountryItem countryItem;
            c cVar2;
            List list;
            SNSCountryPicker.CountryItem countryItem2;
            c cVar3;
            List list2;
            boolean z11;
            com.sumsub.sns.internal.core.domain.c cVar4;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f14578a;
            if (i == 0) {
                kotlin.b.b(obj);
                cVar = (com.sumsub.sns.internal.core.domain.c) this.f14579b;
                z10 = this.f14580c;
                c cVar5 = (c) this.f14581d;
                List list3 = (List) this.f14582e;
                SNSCountryPicker.CountryItem countryItem3 = (SNSCountryPicker.CountryItem) this.f14583f;
                a aVar = a.this;
                this.f14579b = cVar;
                this.f14581d = cVar5;
                this.f14582e = list3;
                this.f14583f = countryItem3;
                this.f14580c = z10;
                this.f14578a = 1;
                if (aVar.a(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                countryItem = countryItem3;
                cVar2 = cVar5;
                list = list3;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z12 = this.f14580c;
                    SNSCountryPicker.CountryItem countryItem4 = (SNSCountryPicker.CountryItem) this.f14583f;
                    List list4 = (List) this.f14582e;
                    cVar3 = (c) this.f14581d;
                    com.sumsub.sns.internal.core.domain.c cVar6 = (com.sumsub.sns.internal.core.domain.c) this.f14579b;
                    kotlin.b.b(obj);
                    countryItem2 = countryItem4;
                    list2 = list4;
                    cVar4 = cVar6;
                    z11 = z12;
                    return new e(cVar4, null, cVar3, z11, list2, countryItem2, (f) obj, 2, null);
                }
                z10 = this.f14580c;
                countryItem = (SNSCountryPicker.CountryItem) this.f14583f;
                list = (List) this.f14582e;
                cVar2 = (c) this.f14581d;
                com.sumsub.sns.internal.core.domain.c cVar7 = (com.sumsub.sns.internal.core.domain.c) this.f14579b;
                kotlin.b.b(obj);
                cVar = cVar7;
            }
            a aVar2 = a.this;
            this.f14579b = cVar;
            this.f14581d = cVar2;
            this.f14582e = list;
            this.f14583f = countryItem;
            this.f14580c = z10;
            this.f14578a = 2;
            Object d10 = aVar2.d(this);
            if (d10 == coroutineSingletons) {
                return coroutineSingletons;
            }
            countryItem2 = countryItem;
            cVar3 = cVar2;
            list2 = list;
            z11 = z10;
            cVar4 = cVar;
            obj = d10;
            return new e(cVar4, null, cVar3, z11, list2, countryItem2, (f) obj, 2, null);
        }
    }

    public a(String str, com.sumsub.sns.internal.core.data.source.extensions.a aVar, com.sumsub.sns.internal.core.domain.b bVar, com.sumsub.sns.internal.core.domain.e eVar, com.sumsub.sns.internal.core.data.source.common.a aVar2, com.sumsub.sns.internal.core.data.source.dynamic.b bVar2) {
        super(aVar2, bVar2);
        this.f14498q = str;
        this.f14499r = aVar;
        this.f14500s = bVar;
        this.f14501t = eVar;
        this.f14502u = aVar2;
        StateFlow<com.sumsub.sns.internal.core.domain.c> a10 = a((Flow<? extends Flow>) FlowKt.flowOn(FlowKt.onEach(FlowKt.flow(new h(null)), new i(null)), Dispatchers.getIO()), (Flow) null);
        this.f14503v = a10;
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.f14504w = MutableStateFlow;
        MutableStateFlow<SNSCountryPicker.CountryItem> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this.f14505x = MutableStateFlow2;
        StateFlow<c> a11 = a((Flow<? extends Flow>) FlowKt.flowOn(FlowKt.onEach(FlowKt.m142catch(new p(new o(MutableStateFlow2, this), this), new j(null)), new k(null)), Dispatchers.getIO()), (Flow) new c(null, null, 3, null));
        this.f14506y = a11;
        StateFlow<List<SNSCountryPicker.CountryItem>> a12 = a((Flow<? extends Flow>) FlowKt.onEach(new q(a10), new n(null)), (Flow) EmptyList.f23104a);
        this.f14507z = a12;
        this.f14497A = a((Flow<? extends Flow>) FlowKt.flowOn(FlowKt.combine(a10, MutableStateFlow, a11, a12, MutableStateFlow2, new r(null)), Dispatchers.getMain()), (Flow) new e(null, null, null, false, null, null, null, 127, null));
    }

    public final CharSequence p() {
        return w.a(h(), String.format("sns_step_%s_selector_country_placeholder", Arrays.copyOf(new Object[]{this.f14498q}, 1)), String.format("sns_step_%s_selector_country_placeholder", Arrays.copyOf(new Object[]{"defaults"}, 1)));
    }

    public final CharSequence q() {
        return w.a(h(), String.format("sns_step_%s_selector_footerHtml", Arrays.copyOf(new Object[]{this.f14498q}, 1)), String.format("sns_step_%s_selector_footerHtml", Arrays.copyOf(new Object[]{"defaults"}, 1)));
    }

    public final CharSequence r() {
        return w.a(h(), String.format("sns_step_%s_selector_iddoc_listIsEmpty", Arrays.copyOf(new Object[]{this.f14498q}, 1)), String.format("sns_step_%s_selector_iddoc_listIsEmpty", Arrays.copyOf(new Object[]{"defaults"}, 1)));
    }

    @Override // com.sumsub.sns.core.presentation.base.a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public StateFlow<e> j() {
        return this.f14497A;
    }

    public final void t() {
        if (this.f14504w.getValue().booleanValue()) {
            this.f14504w.setValue(Boolean.FALSE);
        }
    }

    public final void u() {
        if (this.f14507z.getValue().isEmpty()) {
            return;
        }
        if (this.f14504w.getValue().booleanValue()) {
            Logger.d$default(com.sumsub.sns.internal.log.a.f17535a, com.sumsub.sns.internal.log.c.a(this), "onSelectCountryClick: dialog already shown", null, 4, null);
        } else {
            this.f14504w.setValue(Boolean.TRUE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(T9.a<? super java.lang.CharSequence> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.sumsub.sns.internal.camera.photo.presentation.a.l
            if (r0 == 0) goto L13
            r0 = r5
            com.sumsub.sns.internal.camera.photo.presentation.a$l r0 = (com.sumsub.sns.internal.camera.photo.presentation.a.l) r0
            int r1 = r0.f14548d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14548d = r1
            goto L18
        L13:
            com.sumsub.sns.internal.camera.photo.presentation.a$l r0 = new com.sumsub.sns.internal.camera.photo.presentation.a$l
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f14546b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f14548d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.f14545a
            com.sumsub.sns.internal.camera.photo.presentation.a r0 = (com.sumsub.sns.internal.camera.photo.presentation.a) r0
            kotlin.b.b(r5)
            goto L42
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            kotlin.b.b(r5)
            r0.f14545a = r4
            r0.f14548d = r3
            java.lang.Object r5 = r4.b(r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            r0 = r4
        L42:
            com.sumsub.sns.internal.core.data.source.dynamic.b$c r5 = (com.sumsub.sns.internal.core.data.source.dynamic.b.c) r5
            java.lang.String r0 = r0.f14498q
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r3)
            java.lang.String r1 = "sns_step_%s_selector_country_prompt"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            java.lang.String r2 = "defaults"
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r3)
            java.lang.String r1 = java.lang.String.format(r1, r2)
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.lang.CharSequence r5 = com.sumsub.sns.internal.core.common.w.a(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.camera.photo.presentation.a.e(T9.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(T9.a<? super java.lang.CharSequence> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.sumsub.sns.internal.camera.photo.presentation.a.m
            if (r0 == 0) goto L13
            r0 = r5
            com.sumsub.sns.internal.camera.photo.presentation.a$m r0 = (com.sumsub.sns.internal.camera.photo.presentation.a.m) r0
            int r1 = r0.f14552d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14552d = r1
            goto L18
        L13:
            com.sumsub.sns.internal.camera.photo.presentation.a$m r0 = new com.sumsub.sns.internal.camera.photo.presentation.a$m
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f14550b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f14552d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.f14549a
            com.sumsub.sns.internal.camera.photo.presentation.a r0 = (com.sumsub.sns.internal.camera.photo.presentation.a) r0
            kotlin.b.b(r5)
            goto L42
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            kotlin.b.b(r5)
            r0.f14549a = r4
            r0.f14552d = r3
            java.lang.Object r5 = r4.b(r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            r0 = r4
        L42:
            com.sumsub.sns.internal.core.data.source.dynamic.b$c r5 = (com.sumsub.sns.internal.core.data.source.dynamic.b.c) r5
            java.lang.String r0 = r0.f14498q
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r3)
            java.lang.String r1 = "sns_step_%s_selector_iddoc_prompt"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            java.lang.String r2 = "defaults"
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r3)
            java.lang.String r1 = java.lang.String.format(r1, r2)
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.lang.CharSequence r5 = com.sumsub.sns.internal.core.common.w.a(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.camera.photo.presentation.a.f(T9.a):java.lang.Object");
    }

    public final void a(SNSCountryPicker.CountryItem countryItem) {
        if (countryItem == null || kotlin.jvm.internal.f.b(this.f14505x.getValue(), countryItem)) {
            return;
        }
        this.f14505x.setValue(countryItem);
        this.f14502u.a(countryItem.getCode());
        SNSEventHandler eventHandler = e0.f15081a.getEventHandler();
        if (eventHandler != null) {
            eventHandler.onEvent(new SNSEvent.CountrySelected(countryItem.getCode(), true));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0060 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(T9.a<? super com.sumsub.sns.internal.camera.photo.presentation.a.f> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.sumsub.sns.internal.camera.photo.presentation.a.g
            if (r0 == 0) goto L13
            r0 = r9
            com.sumsub.sns.internal.camera.photo.presentation.a$g r0 = (com.sumsub.sns.internal.camera.photo.presentation.a.g) r0
            int r1 = r0.f14530e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14530e = r1
            goto L18
        L13:
            com.sumsub.sns.internal.camera.photo.presentation.a$g r0 = new com.sumsub.sns.internal.camera.photo.presentation.a$g
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f14528c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f14530e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L43
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r1 = r0.f14527b
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.Object r0 = r0.f14526a
            com.sumsub.sns.internal.camera.photo.presentation.a r0 = (com.sumsub.sns.internal.camera.photo.presentation.a) r0
            kotlin.b.b(r9)
            r2 = r1
            goto L65
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3b:
            java.lang.Object r2 = r0.f14526a
            com.sumsub.sns.internal.camera.photo.presentation.a r2 = (com.sumsub.sns.internal.camera.photo.presentation.a) r2
            kotlin.b.b(r9)
            goto L52
        L43:
            kotlin.b.b(r9)
            r0.f14526a = r8
            r0.f14530e = r4
            java.lang.Object r9 = r8.e(r0)
            if (r9 != r1) goto L51
            return r1
        L51:
            r2 = r8
        L52:
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            r0.f14526a = r2
            r0.f14527b = r9
            r0.f14530e = r3
            java.lang.Object r0 = r2.f(r0)
            if (r0 != r1) goto L61
            return r1
        L61:
            r7 = r2
            r2 = r9
            r9 = r0
            r0 = r7
        L65:
            r3 = r9
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            com.sumsub.sns.internal.core.data.source.extensions.a r9 = r0.f14499r
            java.lang.CharSequence r1 = r0.q()
            android.text.Spanned r4 = r9.a(r1)
            com.sumsub.sns.internal.core.data.source.extensions.a r9 = r0.f14499r
            java.lang.CharSequence r1 = r0.r()
            android.text.Spanned r5 = r9.a(r1)
            java.lang.CharSequence r6 = r0.p()
            com.sumsub.sns.internal.camera.photo.presentation.a$f r9 = new com.sumsub.sns.internal.camera.photo.presentation.a$f
            r1 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.camera.photo.presentation.a.d(T9.a):java.lang.Object");
    }

    public final void a(com.sumsub.sns.internal.core.data.model.q qVar) {
        String c2 = this.f14506y.getValue().c();
        if (c2 != null) {
            SNSEventHandler eventHandler = e0.f15081a.getEventHandler();
            if (eventHandler != null) {
                eventHandler.onEvent(new SNSEvent.DocumentTypeSelected(c2, qVar.b()));
            }
            a(new d(c2, qVar));
        }
    }

    public final <T> StateFlow<T> a(Flow<? extends T> flow, T t3) {
        return FlowKt.stateIn(flow, C0552s.b(this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 0L, 0L, 3, null), t3);
    }
}
