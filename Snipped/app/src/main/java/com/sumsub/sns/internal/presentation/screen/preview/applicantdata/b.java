package com.sumsub.sns.internal.presentation.screen.preview.applicantdata;

import C.v;
import O9.p;
import P9.s;
import androidx.lifecycle.C0552s;
import androidx.lifecycle.G;
import ca.InterfaceC0646l;
import ca.InterfaceC0650p;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.core.presentation.base.a;
import com.sumsub.sns.internal.core.common.a1;
import com.sumsub.sns.internal.core.common.b0;
import com.sumsub.sns.internal.core.common.q;
import com.sumsub.sns.internal.core.data.model.Document;
import com.sumsub.sns.internal.core.data.model.FieldName;
import com.sumsub.sns.internal.core.data.model.g;
import com.sumsub.sns.internal.core.data.model.h;
import com.sumsub.sns.internal.core.data.model.o;
import com.sumsub.sns.internal.core.presentation.form.b;
import com.sumsub.sns.internal.core.presentation.form.model.FormItem;
import com.sumsub.sns.internal.log.LoggerType;
import com.sumsub.sns.internal.presentation.screen.preview.a;
import ia.InterfaceC0840h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes2.dex */
public final class b extends com.sumsub.sns.internal.presentation.screen.preview.a<d> implements com.sumsub.sns.internal.core.presentation.form.b {

    /* renamed from: J, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC0840h<Object>[] f17922J;

    /* renamed from: C, reason: collision with root package name */
    public final com.sumsub.sns.internal.domain.m f17923C;

    /* renamed from: D, reason: collision with root package name */
    public final a1 f17924D;

    /* renamed from: E, reason: collision with root package name */
    public com.sumsub.sns.internal.domain.c f17925E;

    /* renamed from: F, reason: collision with root package name */
    public final boolean f17926F;

    /* renamed from: G, reason: collision with root package name */
    public final MutableStateFlow<b.a> f17927G;

    /* renamed from: H, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.presentation.form.d f17928H;

    /* renamed from: I, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.presentation.screen.base.a f17929I;

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.applicantdata.SNSApplicantDataDocumentViewModel$1", f = "SNSApplicantDataDocumentViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements InterfaceC0650p<d, T9.a<? super p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f17930a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f17931b;

        public a(T9.a<? super a> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(d dVar, T9.a<? super p> aVar) {
            return ((a) create(dVar, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            a aVar2 = b.this.new a(aVar);
            aVar2.f17931b = obj;
            return aVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f17930a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            d dVar = (d) this.f17931b;
            MutableStateFlow mutableStateFlow = b.this.f17927G;
            CharSequence p10 = dVar.p();
            String obj2 = p10 != null ? p10.toString() : null;
            CharSequence o10 = dVar.o();
            mutableStateFlow.setValue(new b.a(0, Collections.singletonList(new b.C0241b(0, obj2, o10 != null ? o10.toString() : null, dVar.l())), null, new b.c(null, null, 3, null)));
            return p.f3034a;
        }
    }

    /* renamed from: com.sumsub.sns.internal.presentation.screen.preview.applicantdata.b$b, reason: collision with other inner class name */
    public static final class C0291b implements a.j {

        /* renamed from: a, reason: collision with root package name */
        public final CharSequence f17933a;

        /* renamed from: b, reason: collision with root package name */
        public final CharSequence f17934b;

        public final CharSequence c() {
            return this.f17933a;
        }

        public final CharSequence d() {
            return this.f17934b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0291b)) {
                return false;
            }
            C0291b c0291b = (C0291b) obj;
            return kotlin.jvm.internal.f.b(this.f17933a, c0291b.f17933a) && kotlin.jvm.internal.f.b(this.f17934b, c0291b.f17934b);
        }

        public int hashCode() {
            CharSequence charSequence = this.f17933a;
            int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
            CharSequence charSequence2 = this.f17934b;
            return hashCode + (charSequence2 != null ? charSequence2.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("ErrorEvent(message=");
            sb2.append((Object) this.f17933a);
            sb2.append(", positiveButton=");
            return com.google.android.gms.measurement.internal.a.j(sb2, this.f17934b, ')');
        }
    }

    public static final class c extends a.c {

        /* renamed from: a, reason: collision with root package name */
        public static final c f17935a = new c();
    }

    public static final class d extends a.d {

        /* renamed from: a, reason: collision with root package name */
        public final com.sumsub.sns.internal.domain.c f17936a;

        /* renamed from: b, reason: collision with root package name */
        public final List<com.sumsub.sns.internal.domain.b> f17937b;

        /* renamed from: c, reason: collision with root package name */
        public final List<FormItem> f17938c;

        /* renamed from: d, reason: collision with root package name */
        public final String f17939d;

        /* renamed from: e, reason: collision with root package name */
        public final CharSequence f17940e;

        /* renamed from: f, reason: collision with root package name */
        public final CharSequence f17941f;

        /* renamed from: g, reason: collision with root package name */
        public final CharSequence f17942g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f17943h;

        public d() {
            this(null, null, null, null, null, null, null, false, 255, null);
        }

        public final d a(com.sumsub.sns.internal.domain.c cVar, List<com.sumsub.sns.internal.domain.b> list, List<? extends FormItem> list2, String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, boolean z10) {
            return new d(cVar, list, list2, str, charSequence, charSequence2, charSequence3, z10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return kotlin.jvm.internal.f.b(this.f17936a, dVar.f17936a) && kotlin.jvm.internal.f.b(this.f17937b, dVar.f17937b) && kotlin.jvm.internal.f.b(this.f17938c, dVar.f17938c) && kotlin.jvm.internal.f.b(this.f17939d, dVar.f17939d) && kotlin.jvm.internal.f.b(this.f17940e, dVar.f17940e) && kotlin.jvm.internal.f.b(this.f17941f, dVar.f17941f) && kotlin.jvm.internal.f.b(this.f17942g, dVar.f17942g) && this.f17943h == dVar.f17943h;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int f10 = v.f(this.f17938c, v.f(this.f17937b, this.f17936a.hashCode() * 31, 31), 31);
            String str = this.f17939d;
            int hashCode = (f10 + (str == null ? 0 : str.hashCode())) * 31;
            CharSequence charSequence = this.f17940e;
            int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
            CharSequence charSequence2 = this.f17941f;
            int hashCode3 = (hashCode2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
            CharSequence charSequence3 = this.f17942g;
            int hashCode4 = (hashCode3 + (charSequence3 != null ? charSequence3.hashCode() : 0)) * 31;
            boolean z10 = this.f17943h;
            int i = z10;
            if (z10 != 0) {
                i = 1;
            }
            return hashCode4 + i;
        }

        public final CharSequence i() {
            return this.f17942g;
        }

        public final List<FormItem> l() {
            return this.f17938c;
        }

        public final com.sumsub.sns.internal.domain.c m() {
            return this.f17936a;
        }

        public final boolean n() {
            return this.f17943h;
        }

        public final CharSequence o() {
            return this.f17941f;
        }

        public final CharSequence p() {
            return this.f17940e;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("ViewState(resources=");
            sb2.append(this.f17936a);
            sb2.append(", errors=");
            sb2.append(this.f17937b);
            sb2.append(", formItems=");
            sb2.append(this.f17938c);
            sb2.append(", currentCountry=");
            sb2.append(this.f17939d);
            sb2.append(", title=");
            sb2.append((Object) this.f17940e);
            sb2.append(", subtitle=");
            sb2.append((Object) this.f17941f);
            sb2.append(", buttonContinue=");
            sb2.append((Object) this.f17942g);
            sb2.append(", showContent=");
            return androidx.camera.core.impl.utils.a.o(sb2, this.f17943h, ')');
        }

        public d(com.sumsub.sns.internal.domain.c cVar, List list, List list2, String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, boolean z10, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new com.sumsub.sns.internal.domain.c(null, null, null, null, null, 31, null) : cVar, (i & 2) != 0 ? EmptyList.f23104a : list, (i & 4) != 0 ? EmptyList.f23104a : list2, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : charSequence, (i & 32) != 0 ? null : charSequence2, (i & 64) == 0 ? charSequence3 : null, (i & 128) != 0 ? false : z10);
        }

        public static /* synthetic */ d a(d dVar, com.sumsub.sns.internal.domain.c cVar, List list, List list2, String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, boolean z10, int i, Object obj) {
            return dVar.a((i & 1) != 0 ? dVar.f17936a : cVar, (i & 2) != 0 ? dVar.f17937b : list, (i & 4) != 0 ? dVar.f17938c : list2, (i & 8) != 0 ? dVar.f17939d : str, (i & 16) != 0 ? dVar.f17940e : charSequence, (i & 32) != 0 ? dVar.f17941f : charSequence2, (i & 64) != 0 ? dVar.f17942g : charSequence3, (i & 128) != 0 ? dVar.f17943h : z10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public d(com.sumsub.sns.internal.domain.c cVar, List<com.sumsub.sns.internal.domain.b> list, List<? extends FormItem> list2, String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, boolean z10) {
            this.f17936a = cVar;
            this.f17937b = list;
            this.f17938c = list2;
            this.f17939d = str;
            this.f17940e = charSequence;
            this.f17941f = charSequence2;
            this.f17942g = charSequence3;
            this.f17943h = z10;
        }
    }

    public /* synthetic */ class e {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17944a;

        static {
            int[] iArr = new int[FieldName.values().length];
            iArr[FieldName.countryOfBirth.ordinal()] = 1;
            iArr[FieldName.country.ordinal()] = 2;
            iArr[FieldName.taxResidenceCountry.ordinal()] = 3;
            iArr[FieldName.stateOfBirth.ordinal()] = 4;
            iArr[FieldName.state.ordinal()] = 5;
            iArr[FieldName.firstName.ordinal()] = 6;
            iArr[FieldName.lastName.ordinal()] = 7;
            iArr[FieldName.middleName.ordinal()] = 8;
            iArr[FieldName.tin.ordinal()] = 9;
            iArr[FieldName.phone.ordinal()] = 10;
            iArr[FieldName.placeOfBirth.ordinal()] = 11;
            iArr[FieldName.legalName.ordinal()] = 12;
            iArr[FieldName.gender.ordinal()] = 13;
            iArr[FieldName.nationality.ordinal()] = 14;
            iArr[FieldName.dob.ordinal()] = 15;
            iArr[FieldName.email.ordinal()] = 16;
            iArr[FieldName.buildingNumber.ordinal()] = 17;
            iArr[FieldName.flatNumber.ordinal()] = 18;
            iArr[FieldName.postCode.ordinal()] = 19;
            iArr[FieldName.street.ordinal()] = 20;
            iArr[FieldName.subStreet.ordinal()] = 21;
            iArr[FieldName.town.ordinal()] = 22;
            f17944a = iArr;
        }
    }

    public static final class f implements com.sumsub.sns.internal.core.presentation.form.d {
        public f() {
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.d
        public String a(String str, String str2) {
            return (String) b.this.B().get(str2);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.applicantdata.SNSApplicantDataDocumentViewModel$onDataLoaded$3", f = "SNSApplicantDataDocumentViewModel.kt", l = {219}, m = "invokeSuspend")
    public static final class g extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f17946a;

        public g(T9.a<? super g> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
            return ((g) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            return b.this.new g(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f17946a;
            if (i == 0) {
                kotlin.b.b(obj);
                b.this.C();
                b bVar = b.this;
                this.f17946a = 1;
                if (bVar.a((List<com.sumsub.sns.internal.domain.b>) null, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            b.this.c(true);
            return p.f3034a;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.applicantdata.SNSApplicantDataDocumentViewModel$onFieldValueChanged$1", f = "SNSApplicantDataDocumentViewModel.kt", l = {164}, m = "invokeSuspend")
    public static final class h extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f17948a;

        public h(T9.a<? super h> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
            return ((h) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            return b.this.new h(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f17948a;
            if (i == 0) {
                kotlin.b.b(obj);
                b bVar = b.this;
                this.f17948a = 1;
                if (bVar.a((List<com.sumsub.sns.internal.domain.b>) null, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return p.f3034a;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.applicantdata.SNSApplicantDataDocumentViewModel$onPrepare$2", f = "SNSApplicantDataDocumentViewModel.kt", l = {131, 132, 133}, m = "invokeSuspend")
    public static final class i extends SuspendLambda implements InterfaceC0650p<d, T9.a<? super d>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f17950a;

        /* renamed from: b, reason: collision with root package name */
        public Object f17951b;

        /* renamed from: c, reason: collision with root package name */
        public int f17952c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f17953d;

        public i(T9.a<? super i> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(d dVar, T9.a<? super d> aVar) {
            return ((i) create(dVar, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            i iVar = b.this.new i(aVar);
            iVar.f17953d = obj;
            return iVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0080 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0081  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
                int r1 = r12.f17952c
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L3e
                if (r1 == r4) goto L36
                if (r1 == r3) goto L2a
                if (r1 != r2) goto L22
                java.lang.Object r0 = r12.f17951b
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                java.lang.Object r1 = r12.f17950a
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                java.lang.Object r2 = r12.f17953d
                com.sumsub.sns.internal.presentation.screen.preview.applicantdata.b$d r2 = (com.sumsub.sns.internal.presentation.screen.preview.applicantdata.b.d) r2
                kotlin.b.b(r13)
                r6 = r0
                r5 = r1
                r0 = r2
                goto L85
            L22:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L2a:
                java.lang.Object r1 = r12.f17950a
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                java.lang.Object r3 = r12.f17953d
                com.sumsub.sns.internal.presentation.screen.preview.applicantdata.b$d r3 = (com.sumsub.sns.internal.presentation.screen.preview.applicantdata.b.d) r3
                kotlin.b.b(r13)
                goto L6c
            L36:
                java.lang.Object r1 = r12.f17953d
                com.sumsub.sns.internal.presentation.screen.preview.applicantdata.b$d r1 = (com.sumsub.sns.internal.presentation.screen.preview.applicantdata.b.d) r1
                kotlin.b.b(r13)
                goto L55
            L3e:
                kotlin.b.b(r13)
                java.lang.Object r13 = r12.f17953d
                r1 = r13
                com.sumsub.sns.internal.presentation.screen.preview.applicantdata.b$d r1 = (com.sumsub.sns.internal.presentation.screen.preview.applicantdata.b.d) r1
                com.sumsub.sns.internal.presentation.screen.preview.applicantdata.b r13 = com.sumsub.sns.internal.presentation.screen.preview.applicantdata.b.this
                r12.f17953d = r1
                r12.f17952c = r4
                java.lang.String r4 = "sns_step_APPLICANT_DATA_title"
                java.lang.Object r13 = com.sumsub.sns.internal.presentation.screen.preview.applicantdata.b.a(r13, r4, r12)
                if (r13 != r0) goto L55
                return r0
            L55:
                java.lang.CharSequence r13 = (java.lang.CharSequence) r13
                com.sumsub.sns.internal.presentation.screen.preview.applicantdata.b r4 = com.sumsub.sns.internal.presentation.screen.preview.applicantdata.b.this
                r12.f17953d = r1
                r12.f17950a = r13
                r12.f17952c = r3
                java.lang.String r3 = "sns_step_APPLICANT_DATA_prompt"
                java.lang.Object r3 = com.sumsub.sns.internal.presentation.screen.preview.applicantdata.b.a(r4, r3, r12)
                if (r3 != r0) goto L68
                return r0
            L68:
                r11 = r1
                r1 = r13
                r13 = r3
                r3 = r11
            L6c:
                java.lang.CharSequence r13 = (java.lang.CharSequence) r13
                com.sumsub.sns.internal.presentation.screen.preview.applicantdata.b r4 = com.sumsub.sns.internal.presentation.screen.preview.applicantdata.b.this
                r12.f17953d = r3
                r12.f17950a = r1
                r12.f17951b = r13
                r12.f17952c = r2
                java.lang.String r2 = "sns_data_action_submit"
                java.lang.Object r2 = com.sumsub.sns.internal.presentation.screen.preview.applicantdata.b.a(r4, r2, r12)
                if (r2 != r0) goto L81
                return r0
            L81:
                r6 = r13
                r5 = r1
                r13 = r2
                r0 = r3
            L85:
                r7 = r13
                java.lang.CharSequence r7 = (java.lang.CharSequence) r7
                r9 = 143(0x8f, float:2.0E-43)
                r10 = 0
                r1 = 0
                r2 = 0
                r3 = 0
                r4 = 0
                r8 = 0
                com.sumsub.sns.internal.presentation.screen.preview.applicantdata.b$d r13 = com.sumsub.sns.internal.presentation.screen.preview.applicantdata.b.d.a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.presentation.screen.preview.applicantdata.b.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.applicantdata.SNSApplicantDataDocumentViewModel$onSubmitClick$1", f = "SNSApplicantDataDocumentViewModel.kt", l = {371}, m = "invokeSuspend")
    public static final class j extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f17955a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f17956b;

        @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.applicantdata.SNSApplicantDataDocumentViewModel$onSubmitClick$1$1", f = "SNSApplicantDataDocumentViewModel.kt", l = {372, 413, 479}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements InterfaceC0646l<T9.a<? super p>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f17958a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f17959b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CoroutineScope f17960c;

            @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.applicantdata.SNSApplicantDataDocumentViewModel$onSubmitClick$1$1$2", f = "SNSApplicantDataDocumentViewModel.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.sumsub.sns.internal.presentation.screen.preview.applicantdata.b$j$a$a, reason: collision with other inner class name */
            public static final class C0292a extends SuspendLambda implements InterfaceC0650p<d, T9.a<? super d>, Object> {

                /* renamed from: a, reason: collision with root package name */
                public int f17961a;

                /* renamed from: b, reason: collision with root package name */
                public /* synthetic */ Object f17962b;

                public C0292a(T9.a<? super C0292a> aVar) {
                    super(2, aVar);
                }

                @Override // ca.InterfaceC0650p
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(d dVar, T9.a<? super d> aVar) {
                    return ((C0292a) create(dVar, aVar)).invokeSuspend(p.f3034a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final T9.a<p> create(Object obj, T9.a<?> aVar) {
                    C0292a c0292a = new C0292a(aVar);
                    c0292a.f17962b = obj;
                    return c0292a;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
                    if (this.f17961a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.b.b(obj);
                    return d.a((d) this.f17962b, null, EmptyList.f23104a, null, null, null, null, null, false, 253, null);
                }
            }

            /* renamed from: com.sumsub.sns.internal.presentation.screen.preview.applicantdata.b$j$a$b, reason: collision with other inner class name */
            public static final class C0293b extends Lambda implements InterfaceC0646l<h.d, Boolean> {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ b f17963a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0293b(b bVar) {
                    super(1);
                    this.f17963a = bVar;
                }

                @Override // ca.InterfaceC0646l
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(h.d dVar) {
                    Map B10 = this.f17963a.B();
                    FieldName q10 = dVar.q();
                    CharSequence charSequence = (CharSequence) B10.get(q10 != null ? q10.getValue() : null);
                    return Boolean.valueOf(!(charSequence == null || charSequence.length() == 0));
                }
            }

            public static final class c extends Lambda implements InterfaceC0646l<h.d, Pair<? extends String, ? extends String>> {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ b f17964a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(b bVar) {
                    super(1);
                    this.f17964a = bVar;
                }

                @Override // ca.InterfaceC0646l
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Pair<String, String> invoke(h.d dVar) {
                    String str;
                    FieldName q10 = dVar.q();
                    if (q10 == null || (str = q10.getValue()) == null) {
                        str = "";
                    }
                    Map B10 = this.f17964a.B();
                    FieldName q11 = dVar.q();
                    String str2 = (String) B10.get(q11 != null ? q11.getValue() : null);
                    return new Pair<>(str, str2 != null ? str2 : "");
                }
            }

            public static final class d extends Lambda implements InterfaceC0646l<h.d, Boolean> {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ b f17965a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public d(b bVar) {
                    super(1);
                    this.f17965a = bVar;
                }

                @Override // ca.InterfaceC0646l
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(h.d dVar) {
                    Map B10 = this.f17965a.B();
                    FieldName q10 = dVar.q();
                    CharSequence charSequence = (CharSequence) B10.get(q10 != null ? q10.getValue() : null);
                    return Boolean.valueOf((charSequence == null || charSequence.length() == 0 || !dVar.w()) ? false : true);
                }
            }

            public static final class e extends Lambda implements InterfaceC0646l<h.d, Pair<? extends String, ? extends String>> {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ b f17966a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public e(b bVar) {
                    super(1);
                    this.f17966a = bVar;
                }

                @Override // ca.InterfaceC0646l
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Pair<String, String> invoke(h.d dVar) {
                    String str;
                    FieldName q10 = dVar.q();
                    if (q10 == null || (str = q10.getValue()) == null) {
                        str = "";
                    }
                    Map B10 = this.f17966a.B();
                    FieldName q11 = dVar.q();
                    String str2 = (String) B10.get(q11 != null ? q11.getValue() : null);
                    return new Pair<>(str, str2 != null ? str2 : "");
                }
            }

            public static final class f extends Lambda implements InterfaceC0646l<h.c, com.sumsub.sns.internal.core.data.model.remote.e> {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ b f17967a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public f(b bVar) {
                    super(1);
                    this.f17967a = bVar;
                }

                @Override // ca.InterfaceC0646l
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final com.sumsub.sns.internal.core.data.model.remote.e invoke(h.c cVar) {
                    String i = cVar.i();
                    if (i == null) {
                        i = "";
                    }
                    String str = (String) this.f17967a.B().get(cVar.i());
                    return new com.sumsub.sns.internal.core.data.model.remote.e(i, str != null ? str : "");
                }
            }

            public static final class g extends Lambda implements InterfaceC0646l<h.d, Boolean> {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ b f17968a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.sumsub.sns.internal.core.data.model.g f17969b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public g(b bVar, com.sumsub.sns.internal.core.data.model.g gVar) {
                    super(1);
                    this.f17968a = bVar;
                    this.f17969b = gVar;
                }

                @Override // ca.InterfaceC0646l
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(h.d dVar) {
                    b bVar = this.f17968a;
                    com.sumsub.sns.internal.core.data.model.g gVar = this.f17969b;
                    Map B10 = bVar.B();
                    FieldName q10 = dVar.q();
                    String str = (String) B10.get(q10 != null ? q10.getValue() : null);
                    if (str == null) {
                        str = "";
                    }
                    return Boolean.valueOf(bVar.a(dVar, gVar, str));
                }
            }

            public static final class h extends Lambda implements InterfaceC0646l<h.d, String> {

                /* renamed from: a, reason: collision with root package name */
                public static final h f17970a = new h();

                public h() {
                    super(1);
                }

                @Override // ca.InterfaceC0646l
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String invoke(h.d dVar) {
                    FieldName q10 = dVar.q();
                    if (q10 != null) {
                        return q10.getValue();
                    }
                    return null;
                }
            }

            public static final class i extends Lambda implements InterfaceC0646l<h.d, Boolean> {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ b f17971a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.sumsub.sns.internal.core.data.model.g f17972b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public i(b bVar, com.sumsub.sns.internal.core.data.model.g gVar) {
                    super(1);
                    this.f17971a = bVar;
                    this.f17972b = gVar;
                }

                @Override // ca.InterfaceC0646l
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(h.d dVar) {
                    b bVar = this.f17971a;
                    com.sumsub.sns.internal.core.data.model.g gVar = this.f17972b;
                    Map B10 = bVar.B();
                    FieldName q10 = dVar.q();
                    String str = (String) B10.get(q10 != null ? q10.getValue() : null);
                    if (str == null) {
                        str = "";
                    }
                    return Boolean.valueOf(bVar.b(dVar, gVar, str));
                }
            }

            /* renamed from: com.sumsub.sns.internal.presentation.screen.preview.applicantdata.b$j$a$j, reason: collision with other inner class name */
            public static final class C0294j extends Lambda implements InterfaceC0646l<h.d, String> {

                /* renamed from: a, reason: collision with root package name */
                public static final C0294j f17973a = new C0294j();

                public C0294j() {
                    super(1);
                }

                @Override // ca.InterfaceC0646l
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String invoke(h.d dVar) {
                    FieldName q10 = dVar.q();
                    if (q10 != null) {
                        return q10.getValue();
                    }
                    return null;
                }
            }

            public static final class k extends Lambda implements InterfaceC0646l<String, String> {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ b f17974a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public k(b bVar) {
                    super(1);
                    this.f17974a = bVar;
                }

                @Override // ca.InterfaceC0646l
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String invoke(String str) {
                    String str2 = (String) this.f17974a.B().get(str);
                    return str2 == null ? "" : str2;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, CoroutineScope coroutineScope, T9.a<? super a> aVar) {
                super(1, aVar);
                this.f17959b = bVar;
                this.f17960c = coroutineScope;
            }

            @Override // ca.InterfaceC0646l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(T9.a<? super p> aVar) {
                return ((a) create(aVar)).invokeSuspend(p.f3034a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final T9.a<p> create(T9.a<?> aVar) {
                return new a(this.f17959b, this.f17960c, aVar);
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x0319  */
            /* JADX WARN: Removed duplicated region for block: B:9:0x0307  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r21) {
                /*
                    Method dump skipped, instructions count: 829
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.presentation.screen.preview.applicantdata.b.j.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public j(T9.a<? super j> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
            return ((j) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            j jVar = b.this.new j(aVar);
            jVar.f17956b = obj;
            return jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f17955a;
            if (i == 0) {
                kotlin.b.b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f17956b;
                b bVar = b.this;
                a aVar = new a(bVar, coroutineScope, null);
                this.f17955a = 1;
                if (bVar.a(aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return p.f3034a;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.applicantdata.SNSApplicantDataDocumentViewModel", f = "SNSApplicantDataDocumentViewModel.kt", l = {321, 327, 334, 336}, m = "reloadFields")
    public static final class k extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f17975a;

        /* renamed from: b, reason: collision with root package name */
        public Object f17976b;

        /* renamed from: c, reason: collision with root package name */
        public Object f17977c;

        /* renamed from: d, reason: collision with root package name */
        public Object f17978d;

        /* renamed from: e, reason: collision with root package name */
        public Object f17979e;

        /* renamed from: f, reason: collision with root package name */
        public Object f17980f;

        /* renamed from: g, reason: collision with root package name */
        public Object f17981g;

        /* renamed from: h, reason: collision with root package name */
        public Object f17982h;
        public Object i;

        /* renamed from: j, reason: collision with root package name */
        public Object f17983j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f17984k;

        /* renamed from: m, reason: collision with root package name */
        public int f17986m;

        public k(T9.a<? super k> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f17984k = obj;
            this.f17986m |= Integer.MIN_VALUE;
            return b.this.a((List<com.sumsub.sns.internal.domain.b>) null, this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.applicantdata.SNSApplicantDataDocumentViewModel$reloadFields$4", f = "SNSApplicantDataDocumentViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class l extends SuspendLambda implements InterfaceC0650p<d, T9.a<? super d>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f17987a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f17988b;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ List<FormItem> f17990d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(List<FormItem> list, T9.a<? super l> aVar) {
            super(2, aVar);
            this.f17990d = list;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(d dVar, T9.a<? super d> aVar) {
            return ((l) create(dVar, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            l lVar = b.this.new l(this.f17990d, aVar);
            lVar.f17988b = obj;
            return lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f17987a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            d dVar = (d) this.f17988b;
            com.sumsub.sns.internal.domain.c cVar = b.this.f17925E;
            return d.a(dVar, cVar == null ? new com.sumsub.sns.internal.domain.c(null, null, null, null, null, 31, null) : cVar, null, this.f17990d, b.this.s(), null, null, null, false, 242, null);
        }
    }

    public static final class m extends Lambda implements InterfaceC0646l<FieldName, String> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Map<String, String> f17991a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Map<String, String> map) {
            super(1);
            this.f17991a = map;
        }

        @Override // ca.InterfaceC0646l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(FieldName fieldName) {
            return this.f17991a.get(fieldName.getValue());
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.applicantdata.SNSApplicantDataDocumentViewModel$resetCurrentFieldError$1", f = "SNSApplicantDataDocumentViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class n extends SuspendLambda implements InterfaceC0650p<d, T9.a<? super d>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f17992a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f17993b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ FormItem f17994c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(FormItem formItem, T9.a<? super n> aVar) {
            super(2, aVar);
            this.f17994c = formItem;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(d dVar, T9.a<? super d> aVar) {
            return ((n) create(dVar, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            n nVar = new n(this.f17994c, aVar);
            nVar.f17993b = obj;
            return nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f17992a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            d dVar = (d) this.f17993b;
            List<FormItem> l10 = dVar.l();
            FormItem formItem = this.f17994c;
            ArrayList arrayList = new ArrayList(P9.n.u(l10, 10));
            for (FormItem formItem2 : l10) {
                FormItem formItem3 = kotlin.jvm.internal.f.b(com.sumsub.sns.internal.presentation.screen.questionnary.model.f.a(formItem2), com.sumsub.sns.internal.presentation.screen.questionnary.model.f.a(formItem)) ^ true ? formItem2 : null;
                if (formItem3 == null) {
                    formItem3 = com.sumsub.sns.internal.core.presentation.form.model.e.a(formItem2, null);
                }
                arrayList.add(formItem3);
            }
            return d.a(dVar, null, null, arrayList, null, null, null, null, false, 251, null);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.applicantdata.SNSApplicantDataDocumentViewModel$showContent$1", f = "SNSApplicantDataDocumentViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class o extends SuspendLambda implements InterfaceC0650p<d, T9.a<? super d>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f17995a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f17996b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f17997c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(boolean z10, T9.a<? super o> aVar) {
            super(2, aVar);
            this.f17997c = z10;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(d dVar, T9.a<? super d> aVar) {
            return ((o) create(dVar, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            o oVar = new o(this.f17997c, aVar);
            oVar.f17996b = obj;
            return oVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f17995a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            return d.a((d) this.f17996b, null, null, null, null, null, null, null, this.f17997c, 127, null);
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(b.class, "fieldValueCache", "getFieldValueCache()Ljava/util/Map;", 0);
        kotlin.jvm.internal.h.f23186a.getClass();
        f17922J = new InterfaceC0840h[]{mutablePropertyReference1Impl};
    }

    public b(Document document, G g10, com.sumsub.sns.internal.core.data.source.common.a aVar, com.sumsub.sns.internal.core.data.source.dynamic.b bVar, com.sumsub.sns.internal.domain.m mVar, com.sumsub.sns.internal.core.domain.b bVar2, a1 a1Var) {
        super(document, g10, aVar, bVar, bVar2);
        this.f17923C = mVar;
        this.f17924D = a1Var;
        this.f17926F = com.sumsub.sns.internal.ff.a.f16930a.b().g();
        this.f17927G = StateFlowKt.MutableStateFlow(new b.a(0, EmptyList.f23104a, null, new b.c(null, null, 3, null)));
        this.f17928H = new f();
        this.f17929I = new com.sumsub.sns.internal.core.presentation.screen.base.a(g10, "KEY_FIELD_CACHE", kotlin.collections.a.p());
        b0.b(j(), C0552s.b(this), new a(null));
    }

    public final g.c.a A() {
        com.sumsub.sns.internal.core.data.model.g g10;
        g.c.a b9;
        com.sumsub.sns.internal.domain.c cVar = this.f17925E;
        if (cVar == null || (g10 = cVar.g()) == null) {
            return null;
        }
        b9 = com.sumsub.sns.internal.presentation.screen.preview.applicantdata.d.b(g10, u().getType());
        return b9;
    }

    public final Map<String, String> B() {
        return (Map) this.f17929I.a(this, f17922J[0]);
    }

    public final void C() {
        com.sumsub.sns.internal.core.data.model.g g10;
        com.sumsub.sns.internal.domain.c cVar = this.f17925E;
        if (cVar == null || (g10 = cVar.g()) == null) {
            return;
        }
        g.c.a A10 = A();
        if (A10 == null) {
            com.sumsub.sns.core.presentation.base.a.a(this, new q.b(false, 1, null), (Object) null, (Long) null, 6, (Object) null);
            return;
        }
        List<h.d> l10 = A10.l();
        if (l10 != null && B().isEmpty()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(B());
            for (h.d dVar : l10) {
                String a10 = a(g10, dVar);
                if (a10 != null) {
                    linkedHashMap.put(dVar.b(), a10);
                }
            }
            c(linkedHashMap);
        }
    }

    public final void D() {
        Logger.v$default(com.sumsub.sns.internal.log.a.f17535a, "AppData", "submitApplicantData", null, 4, null);
        BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), null, null, new j(null), 3, null);
    }

    @Override // com.sumsub.sns.core.presentation.base.a
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public d e() {
        return new d(null, null, null, null, null, null, null, false, 255, null);
    }

    public final void c(Map<String, String> map) {
        this.f17929I.a(this, f17922J[0], map);
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.b
    public StateFlow<b.a> b() {
        return this.f17927G;
    }

    @Override // com.sumsub.sns.internal.presentation.screen.preview.a
    public void c(boolean z10) {
        com.sumsub.sns.core.presentation.base.a.a(this, false, new o(z10, null), 1, null);
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.b
    public void b(FormItem formItem, String str) {
        Logger.v$default(com.sumsub.sns.internal.log.a.f17535a, "AppData", "onFieldValueChanged: " + formItem.k() + " -> " + str, null, 4, null);
        Map<String, String> B10 = B();
        String p10 = formItem.d().p();
        if (p10 == null) {
            p10 = "";
        }
        c(com.sumsub.sns.internal.core.common.i.a(B10, p10, str));
        int i9 = e.f17944a[FieldName.INSTANCE.a(formItem.d().p()).ordinal()];
        if (i9 == 1) {
            c(com.sumsub.sns.internal.core.common.i.a(B(), FieldName.stateOfBirth.getValue(), (Object) null));
        } else if (i9 == 2) {
            c(com.sumsub.sns.internal.core.common.i.a(B(), FieldName.state.getValue(), (Object) null));
        } else {
            if (i9 != 3) {
                a(formItem);
                return;
            }
            c(com.sumsub.sns.internal.core.common.i.a(B(), FieldName.tin.getValue(), (Object) null));
        }
        BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), null, null, new h(null), 3, null);
    }

    @Override // com.sumsub.sns.core.presentation.base.a
    public Object c(T9.a<? super p> aVar) {
        com.sumsub.sns.core.presentation.base.a.a(this, false, new i(null), 1, null);
        m();
        return p.f3034a;
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.b
    public com.sumsub.sns.internal.core.presentation.form.d a() {
        return this.f17928H;
    }

    public final void a(FormItem formItem) {
        CharSequence b9;
        b.C0241b e10 = this.f17927G.getValue().e();
        if (e10 == null) {
            return;
        }
        List<FormItem> f10 = e10.f();
        if ((f10 instanceof Collection) && f10.isEmpty()) {
            return;
        }
        for (FormItem formItem2 : f10) {
            if (kotlin.jvm.internal.f.b(com.sumsub.sns.internal.presentation.screen.questionnary.model.f.a(formItem2), com.sumsub.sns.internal.presentation.screen.questionnary.model.f.a(formItem)) && (b9 = formItem2.b()) != null && b9.length() != 0) {
                Logger.v$default(com.sumsub.sns.internal.log.a.f17535a, "AppData", "reseting field error: " + com.sumsub.sns.internal.presentation.screen.questionnary.model.f.a(formItem), null, 4, null);
                com.sumsub.sns.core.presentation.base.a.a(this, false, new n(formItem, null), 1, null);
                return;
            }
        }
    }

    @Override // com.sumsub.sns.core.presentation.base.a
    public void b(com.sumsub.sns.internal.core.data.model.o oVar) {
        if ((oVar instanceof o.e) && (oVar.c() instanceof c)) {
            D();
        } else {
            super.b(oVar);
        }
    }

    @Override // com.sumsub.sns.internal.presentation.screen.preview.a
    public Object a(com.sumsub.sns.internal.core.data.model.g gVar, com.sumsub.sns.internal.core.data.model.e eVar, T9.a<? super p> aVar) {
        Map<String, String> p10;
        Map<String, Map<String, String>> p11;
        Map<String, com.sumsub.sns.internal.core.data.model.remote.o> D2;
        if (eVar != null && (D2 = eVar.D()) != null) {
            this.f17924D.a(D2);
        }
        if (gVar == null) {
            Logger.e$default(com.sumsub.sns.internal.log.a.f17535a.a(LoggerType.KIBANA), com.sumsub.sns.internal.log.c.a(this), "onDataLoaded: applicant null!", null, 4, null);
            return p.f3034a;
        }
        Map<String, String> r8 = r();
        if (r8 == null) {
            r8 = kotlin.collections.a.p();
        }
        Map<String, String> map = r8;
        if (eVar == null || (p10 = com.sumsub.sns.internal.core.data.model.f.k(eVar)) == null) {
            p10 = kotlin.collections.a.p();
        }
        Map<String, String> map2 = p10;
        if (eVar == null || (p11 = eVar.u()) == null) {
            p11 = kotlin.collections.a.p();
        }
        this.f17925E = new com.sumsub.sns.internal.domain.c(gVar, eVar, map2, map, p11);
        BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), null, null, new g(null), 3, null);
        return p.f3034a;
    }

    public final boolean b(com.sumsub.sns.internal.core.data.model.h hVar, com.sumsub.sns.internal.core.data.model.g gVar, String str) {
        String a10;
        h.d dVar = hVar instanceof h.d ? (h.d) hVar : null;
        return dVar != null && dVar.z() && str.length() == 0 && (a10 = a(gVar, dVar)) != null && a10.length() > 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x01db, code lost:
    
        if (r12 == null) goto L83;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02e3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0399 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r12v31, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v27, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0414 -> B:13:0x0417). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.util.List<com.sumsub.sns.internal.domain.b> r39, T9.a<? super O9.p> r40) {
        /*
            Method dump skipped, instructions count: 1213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.presentation.screen.preview.applicantdata.b.a(java.util.List, T9.a):java.lang.Object");
    }

    public final boolean a(com.sumsub.sns.internal.core.data.model.h hVar, com.sumsub.sns.internal.core.data.model.g gVar, String str) {
        String a10;
        h.d dVar = hVar instanceof h.d ? (h.d) hVar : null;
        return dVar != null && dVar.x() && str.length() == 0 && (a10 = a(gVar, dVar)) != null && a10.length() > 0;
    }

    public final String a(com.sumsub.sns.internal.core.data.model.g gVar, h.d dVar) {
        List<Map<String, String>> n10;
        Map map;
        FieldName q10 = dVar.q();
        int i9 = q10 == null ? -1 : e.f17944a[q10.ordinal()];
        if (i9 != 1) {
            switch (i9) {
                case 4:
                    g.a C10 = gVar.C();
                    if (C10 != null) {
                        return C10.y();
                    }
                    return null;
                case 5:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                    g.a C11 = gVar.C();
                    if (C11 == null || (n10 = C11.n()) == null || (map = (Map) s.L(n10)) == null) {
                        return null;
                    }
                    FieldName q11 = dVar.q();
                    return (String) map.get(q11 != null ? q11.getValue() : null);
                case 6:
                    g.a C12 = gVar.C();
                    if (C12 != null) {
                        return C12.r();
                    }
                    return null;
                case 7:
                    g.a C13 = gVar.C();
                    if (C13 != null) {
                        return C13.t();
                    }
                    return null;
                case 8:
                    g.a C14 = gVar.C();
                    if (C14 != null) {
                        return C14.v();
                    }
                    return null;
                case 9:
                    g.a C15 = gVar.C();
                    if (C15 != null) {
                        return C15.z();
                    }
                    return null;
                case 10:
                    return gVar.G();
                case 11:
                    g.a C16 = gVar.C();
                    if (C16 != null) {
                        return C16.x();
                    }
                    return null;
                case 12:
                    g.a C17 = gVar.C();
                    if (C17 != null) {
                        return C17.u();
                    }
                    return null;
                case 13:
                    g.a C18 = gVar.C();
                    if (C18 != null) {
                        return C18.s();
                    }
                    return null;
                case 14:
                    g.a C19 = gVar.C();
                    if (C19 != null) {
                        return C19.w();
                    }
                    return null;
                case 15:
                    g.a C20 = gVar.C();
                    if (C20 != null) {
                        return C20.q();
                    }
                    return null;
                case 16:
                    return gVar.x();
                default:
                    return null;
            }
        }
        g.a C21 = gVar.C();
        if (C21 != null) {
            return C21.p();
        }
        return null;
    }

    public final String a(com.sumsub.sns.internal.core.data.model.g gVar, h.c cVar) {
        Object obj;
        List<g.b> F10 = gVar.F();
        if (F10 == null) {
            return null;
        }
        Iterator<T> it = F10.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.f.b(((g.b) obj).c(), cVar.i())) {
                break;
            }
        }
        g.b bVar = (g.b) obj;
        if (bVar != null) {
            return bVar.d();
        }
        return null;
    }
}
