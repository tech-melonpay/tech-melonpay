package com.sumsub.sns.internal.presentation.screen.questionnary.model;

import C.v;
import android.content.Context;
import android.net.Uri;
import androidx.lifecycle.C0552s;
import androidx.lifecycle.G;
import ca.InterfaceC0646l;
import ca.InterfaceC0650p;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.core.presentation.base.a;
import com.sumsub.sns.internal.core.common.b0;
import com.sumsub.sns.internal.core.common.q;
import com.sumsub.sns.internal.core.data.model.DocumentType;
import com.sumsub.sns.internal.core.data.model.o;
import com.sumsub.sns.internal.core.data.source.applicant.remote.u;
import com.sumsub.sns.internal.core.data.source.applicant.remote.w;
import com.sumsub.sns.internal.core.data.source.applicant.remote.y;
import com.sumsub.sns.internal.core.presentation.form.FieldId;
import com.sumsub.sns.internal.core.presentation.form.b;
import com.sumsub.sns.internal.core.presentation.form.model.FormItem;
import com.sumsub.sns.internal.log.LoggerType;
import ia.InterfaceC0840h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.NonCancellable;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.bouncycastle.tls.CipherSuite;

/* loaded from: classes2.dex */
public final class d extends com.sumsub.sns.core.presentation.base.a<C0345d> implements com.sumsub.sns.internal.core.presentation.form.b {

    /* renamed from: H, reason: collision with root package name */
    public static final b f18790H;

    /* renamed from: I, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC0840h<Object>[] f18791I;

    /* renamed from: A, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.presentation.screen.base.a f18792A;

    /* renamed from: B, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.presentation.screen.base.a f18793B;

    /* renamed from: C, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.presentation.screen.base.a f18794C;

    /* renamed from: D, reason: collision with root package name */
    public final MutableStateFlow<b.a> f18795D;

    /* renamed from: E, reason: collision with root package name */
    public InterfaceC0646l<? super String, String> f18796E;

    /* renamed from: F, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.presentation.form.d f18797F;

    /* renamed from: G, reason: collision with root package name */
    public final Map<FieldId, Job> f18798G;

    /* renamed from: q, reason: collision with root package name */
    public final com.sumsub.sns.internal.domain.i f18799q;

    /* renamed from: r, reason: collision with root package name */
    public final com.sumsub.sns.internal.domain.k f18800r;

    /* renamed from: s, reason: collision with root package name */
    public final com.sumsub.sns.internal.domain.o f18801s;

    /* renamed from: t, reason: collision with root package name */
    public final com.sumsub.sns.internal.domain.d f18802t;

    /* renamed from: u, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.applicant.b f18803u;

    /* renamed from: v, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.dynamic.b f18804v;

    /* renamed from: w, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.domain.b f18805w;

    /* renamed from: x, reason: collision with root package name */
    public final String f18806x;

    /* renamed from: y, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.presentation.screen.base.a f18807y;

    /* renamed from: z, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.presentation.screen.base.a f18808z;

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.questionnary.model.SNSQuestionnaireViewModel$1", f = "SNSQuestionnaireViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements InterfaceC0650p<C0345d, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f18809a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f18810b;

        public a(T9.a<? super a> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C0345d c0345d, T9.a<? super O9.p> aVar) {
            return ((a) create(c0345d, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            a aVar2 = d.this.new a(aVar);
            aVar2.f18810b = obj;
            return aVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f18809a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            C0345d c0345d = (C0345d) this.f18810b;
            d.this.f18795D.setValue(new b.a(c0345d.f(), c0345d.h(), c0345d.g(), d.this.p()));
            return O9.p.f3034a;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public b() {
        }
    }

    /* renamed from: com.sumsub.sns.internal.presentation.screen.questionnary.model.d$d, reason: collision with other inner class name */
    public static final class C0345d implements a.l {

        /* renamed from: a, reason: collision with root package name */
        public final String f18812a;

        /* renamed from: b, reason: collision with root package name */
        public final int f18813b;

        /* renamed from: c, reason: collision with root package name */
        public final a f18814c;

        /* renamed from: d, reason: collision with root package name */
        public final List<b.C0241b> f18815d;

        /* renamed from: com.sumsub.sns.internal.presentation.screen.questionnary.model.d$d$a */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public final boolean f18816a;

            /* renamed from: b, reason: collision with root package name */
            public final CharSequence f18817b;

            public a(boolean z10, CharSequence charSequence) {
                this.f18816a = z10;
                this.f18817b = charSequence;
            }

            public final a a(boolean z10, CharSequence charSequence) {
                return new a(z10, charSequence);
            }

            public final boolean c() {
                return this.f18816a;
            }

            public final CharSequence d() {
                return this.f18817b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f18816a == aVar.f18816a && kotlin.jvm.internal.f.b(this.f18817b, aVar.f18817b);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [int] */
            /* JADX WARN: Type inference failed for: r0v4 */
            /* JADX WARN: Type inference failed for: r0v5 */
            public int hashCode() {
                boolean z10 = this.f18816a;
                ?? r02 = z10;
                if (z10) {
                    r02 = 1;
                }
                int i = r02 * 31;
                CharSequence charSequence = this.f18817b;
                return i + (charSequence == null ? 0 : charSequence.hashCode());
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("Button(enabled=");
                sb2.append(this.f18816a);
                sb2.append(", text=");
                return com.google.android.gms.measurement.internal.a.j(sb2, this.f18817b, ')');
            }
        }

        public C0345d() {
            this(null, 0, null, null, 15, null);
        }

        public final C0345d a(String str, int i, a aVar, List<b.C0241b> list) {
            return new C0345d(str, i, aVar, list);
        }

        public final a e() {
            return this.f18814c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0345d)) {
                return false;
            }
            C0345d c0345d = (C0345d) obj;
            return kotlin.jvm.internal.f.b(this.f18812a, c0345d.f18812a) && this.f18813b == c0345d.f18813b && kotlin.jvm.internal.f.b(this.f18814c, c0345d.f18814c) && kotlin.jvm.internal.f.b(this.f18815d, c0345d.f18815d);
        }

        public final int f() {
            return this.f18813b;
        }

        public final String g() {
            return this.f18812a;
        }

        public final List<b.C0241b> h() {
            return this.f18815d;
        }

        public int hashCode() {
            String str = this.f18812a;
            int b9 = v.b(this.f18813b, (str == null ? 0 : str.hashCode()) * 31, 31);
            a aVar = this.f18814c;
            return this.f18815d.hashCode() + ((b9 + (aVar != null ? aVar.hashCode() : 0)) * 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("ViewState(mimeTypes=");
            sb2.append(this.f18812a);
            sb2.append(", currentPageIndex=");
            sb2.append(this.f18813b);
            sb2.append(", buttonContinue=");
            sb2.append(this.f18814c);
            sb2.append(", pages=");
            return v.r(sb2, this.f18815d, ')');
        }

        public C0345d(String str, int i, a aVar, List<b.C0241b> list) {
            this.f18812a = str;
            this.f18813b = i;
            this.f18814c = aVar;
            this.f18815d = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C0345d a(C0345d c0345d, String str, int i, a aVar, List list, int i9, Object obj) {
            if ((i9 & 1) != 0) {
                str = c0345d.f18812a;
            }
            if ((i9 & 2) != 0) {
                i = c0345d.f18813b;
            }
            if ((i9 & 4) != 0) {
                aVar = c0345d.f18814c;
            }
            if ((i9 & 8) != 0) {
                list = c0345d.f18815d;
            }
            return c0345d.a(str, i, aVar, list);
        }

        public C0345d(String str, int i, a aVar, List list, int i9, DefaultConstructorMarker defaultConstructorMarker) {
            this((i9 & 1) != 0 ? null : str, (i9 & 2) != 0 ? 0 : i, (i9 & 4) != 0 ? null : aVar, (i9 & 8) != 0 ? EmptyList.f23104a : list);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.questionnary.model.SNSQuestionnaireViewModel", f = "SNSQuestionnaireViewModel.kt", l = {771}, m = "getPickResults")
    public static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f18819a;

        /* renamed from: b, reason: collision with root package name */
        public Object f18820b;

        /* renamed from: c, reason: collision with root package name */
        public Object f18821c;

        /* renamed from: d, reason: collision with root package name */
        public Object f18822d;

        /* renamed from: e, reason: collision with root package name */
        public Object f18823e;

        /* renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f18824f;

        /* renamed from: h, reason: collision with root package name */
        public int f18826h;

        public f(T9.a<? super f> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f18824f = obj;
            this.f18826h |= Integer.MIN_VALUE;
            return d.this.a((Context) null, (List<? extends Uri>) null, (String) null, this);
        }
    }

    public static final class g implements com.sumsub.sns.internal.core.presentation.form.d {
        public g() {
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.d
        public String a(String str, String str2) {
            return c.a(d.this.w(), str, str2);
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.d
        public List<String> b(String str, String str2) {
            return c.b(d.this.w(), str, str2);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.questionnary.model.SNSQuestionnaireViewModel", f = "SNSQuestionnaireViewModel.kt", l = {266, 278}, m = "loadCountryData")
    public static final class h extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f18828a;

        /* renamed from: b, reason: collision with root package name */
        public Object f18829b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f18830c;

        /* renamed from: e, reason: collision with root package name */
        public int f18832e;

        public h(T9.a<? super h> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f18830c = obj;
            this.f18832e |= Integer.MIN_VALUE;
            return d.this.d(this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.questionnary.model.SNSQuestionnaireViewModel$loadQuestionnaire$1", f = "SNSQuestionnaireViewModel.kt", l = {214, 218, 226, 233, 244}, m = "invokeSuspend")
    public static final class i extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f18833a;

        /* renamed from: b, reason: collision with root package name */
        public int f18834b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f18835c;

        public i(T9.a<? super i> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((i) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            i iVar = d.this.new i(aVar);
            iVar.f18835c = obj;
            return iVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0189  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x018e  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x012d  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0154  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00d8  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0107  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x00c3  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                Method dump skipped, instructions count: 428
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.presentation.screen.questionnary.model.d.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class j extends Lambda implements InterfaceC0646l<Throwable, O9.p> {
        public j() {
            super(1);
        }

        public final void a(Throwable th) {
            d.this.b(false);
        }

        @Override // ca.InterfaceC0646l
        public /* bridge */ /* synthetic */ O9.p invoke(Throwable th) {
            a(th);
            return O9.p.f3034a;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.questionnary.model.SNSQuestionnaireViewModel$onDeleteFile$1", f = "SNSQuestionnaireViewModel.kt", l = {476}, m = "invokeSuspend")
    public static final class k extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f18838a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ FormItem f18840c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f18841d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(FormItem formItem, String str, T9.a<? super k> aVar) {
            super(2, aVar);
            this.f18840c = formItem;
            this.f18841d = str;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((k) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return d.this.new k(this.f18840c, this.f18841d, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a10;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f18838a;
            if (i == 0) {
                kotlin.b.b(obj);
                d.this.a(com.sumsub.sns.internal.presentation.screen.questionnary.model.f.a(this.f18840c), this.f18841d, FormItem.ItemState.LOADING);
                com.sumsub.sns.internal.domain.d dVar = d.this.f18802t;
                List<String> singletonList = Collections.singletonList(this.f18841d);
                this.f18838a = 1;
                a10 = dVar.a(singletonList, this);
                if (a10 == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
                a10 = ((Result) obj).f23091a;
            }
            boolean z10 = a10 instanceof Result.Failure;
            if (z10) {
                d.this.a(com.sumsub.sns.internal.presentation.screen.questionnary.model.f.a(this.f18840c), this.f18841d, FormItem.ItemState.DEFAULT);
                d.this.a("Send file error", (Exception) Result.a(a10));
                return O9.p.f3034a;
            }
            d.this.a(com.sumsub.sns.internal.presentation.screen.questionnary.model.f.a(this.f18840c), this.f18841d, FormItem.ItemState.DEFAULT);
            if (z10) {
                a10 = null;
            }
            List list = (List) a10;
            if (list != null) {
                d.this.b(this.f18840c, (List<String>) list);
            }
            return O9.p.f3034a;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.questionnary.model.SNSQuestionnaireViewModel$onPickedFiles$1", f = "SNSQuestionnaireViewModel.kt", l = {600, 613, 609}, m = "invokeSuspend")
    public static final class l extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f18842a;

        /* renamed from: b, reason: collision with root package name */
        public Object f18843b;

        /* renamed from: c, reason: collision with root package name */
        public Object f18844c;

        /* renamed from: d, reason: collision with root package name */
        public int f18845d;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ FieldId f18847f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Context f18848g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ List<Uri> f18849h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public l(FieldId fieldId, Context context, List<? extends Uri> list, T9.a<? super l> aVar) {
            super(2, aVar);
            this.f18847f = fieldId;
            this.f18848g = context;
            this.f18849h = list;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((l) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return d.this.new l(this.f18847f, this.f18848g, this.f18849h, aVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0107  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00db A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x00fb  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 304
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.presentation.screen.questionnary.model.d.l.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class m extends Lambda implements InterfaceC0646l<Throwable, O9.p> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ FieldId f18850a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f18851b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(FieldId fieldId, d dVar) {
            super(1);
            this.f18850a = fieldId;
            this.f18851b = dVar;
        }

        public final void a(Throwable th) {
            Logger.v$default(com.sumsub.sns.internal.log.a.f17535a, "Questionnaire", "stopped job for " + this.f18850a, null, 4, null);
            this.f18851b.f18798G.remove(this.f18850a);
        }

        @Override // ca.InterfaceC0646l
        public /* bridge */ /* synthetic */ O9.p invoke(Throwable th) {
            a(th);
            return O9.p.f3034a;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.questionnary.model.SNSQuestionnaireViewModel", f = "SNSQuestionnaireViewModel.kt", l = {163, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384}, m = "onPrepare")
    public static final class n extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f18852a;

        /* renamed from: b, reason: collision with root package name */
        public Object f18853b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f18854c;

        /* renamed from: e, reason: collision with root package name */
        public int f18856e;

        public n(T9.a<? super n> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f18854c = obj;
            this.f18856e |= Integer.MIN_VALUE;
            return d.this.c(this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.questionnary.model.SNSQuestionnaireViewModel$onPrepare$2", f = "SNSQuestionnaireViewModel.kt", l = {167, CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256}, m = "invokeSuspend")
    public static final class o extends SuspendLambda implements InterfaceC0650p<C0345d, T9.a<? super C0345d>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f18857a;

        /* renamed from: b, reason: collision with root package name */
        public int f18858b;

        /* renamed from: c, reason: collision with root package name */
        public int f18859c;

        /* renamed from: d, reason: collision with root package name */
        public int f18860d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f18861e;

        public o(T9.a<? super o> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C0345d c0345d, T9.a<? super C0345d> aVar) {
            return ((o) create(c0345d, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            o oVar = d.this.new o(aVar);
            oVar.f18861e = obj;
            return oVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0077  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
                int r1 = r12.f18860d
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L30
                if (r1 == r4) goto L27
                if (r1 != r3) goto L1f
                int r0 = r12.f18859c
                int r1 = r12.f18858b
                java.lang.Object r3 = r12.f18857a
                java.lang.String r3 = (java.lang.String) r3
                java.lang.Object r5 = r12.f18861e
                com.sumsub.sns.internal.presentation.screen.questionnary.model.d$d r5 = (com.sumsub.sns.internal.presentation.screen.questionnary.model.d.C0345d) r5
                kotlin.b.b(r13)
                r7 = r1
                r6 = r3
                goto L71
            L1f:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L27:
                java.lang.Object r1 = r12.f18861e
                com.sumsub.sns.internal.presentation.screen.questionnary.model.d$d r1 = (com.sumsub.sns.internal.presentation.screen.questionnary.model.d.C0345d) r1
                kotlin.b.b(r13)
                r5 = r1
                goto L48
            L30:
                kotlin.b.b(r13)
                java.lang.Object r13 = r12.f18861e
                com.sumsub.sns.internal.presentation.screen.questionnary.model.d$d r13 = (com.sumsub.sns.internal.presentation.screen.questionnary.model.d.C0345d) r13
                com.sumsub.sns.internal.presentation.screen.questionnary.model.d r1 = com.sumsub.sns.internal.presentation.screen.questionnary.model.d.this
                r12.f18861e = r13
                r12.f18860d = r4
                java.lang.String r5 = "sns_questionnaire_mime_types"
                java.lang.Object r1 = com.sumsub.sns.internal.presentation.screen.questionnary.model.d.a(r1, r5, r12)
                if (r1 != r0) goto L46
                return r0
            L46:
                r5 = r13
                r13 = r1
            L48:
                r1 = r13
                java.lang.String r1 = (java.lang.String) r1
                if (r1 == 0) goto L55
                boolean r1 = ka.C0969n.i0(r1)
                r1 = r1 ^ r4
                if (r1 != r4) goto L55
                goto L56
            L55:
                r13 = 0
            L56:
                java.lang.String r13 = (java.lang.String) r13
                com.sumsub.sns.internal.presentation.screen.questionnary.model.d r1 = com.sumsub.sns.internal.presentation.screen.questionnary.model.d.this
                r12.f18861e = r5
                r12.f18857a = r13
                r12.f18858b = r2
                r12.f18859c = r4
                r12.f18860d = r3
                java.lang.String r3 = "sns_quiestionnaire_action_continue"
                java.lang.Object r1 = com.sumsub.sns.internal.presentation.screen.questionnary.model.d.a(r1, r3, r12)
                if (r1 != r0) goto L6d
                return r0
            L6d:
                r6 = r13
                r13 = r1
                r7 = r2
                r0 = r4
            L71:
                java.lang.CharSequence r13 = (java.lang.CharSequence) r13
                com.sumsub.sns.internal.presentation.screen.questionnary.model.d$d$a r8 = new com.sumsub.sns.internal.presentation.screen.questionnary.model.d$d$a
                if (r0 == 0) goto L78
                r2 = r4
            L78:
                r8.<init>(r2, r13)
                r10 = 10
                r11 = 0
                r9 = 0
                com.sumsub.sns.internal.presentation.screen.questionnary.model.d$d r13 = com.sumsub.sns.internal.presentation.screen.questionnary.model.d.C0345d.a(r5, r6, r7, r8, r9, r10, r11)
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.presentation.screen.questionnary.model.d.o.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.questionnary.model.SNSQuestionnaireViewModel$sendLog$1", f = "SNSQuestionnaireViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class p extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f18863a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f18864b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f18865c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Exception f18866d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(String str, Exception exc, T9.a<? super p> aVar) {
            super(2, aVar);
            this.f18865c = str;
            this.f18866d = exc;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((p) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            p pVar = new p(this.f18865c, this.f18866d, aVar);
            pVar.f18864b = obj;
            return pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f18863a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            com.sumsub.sns.internal.log.a.f17535a.a(LoggerType.KIBANA).e(com.sumsub.sns.internal.log.c.a((CoroutineScope) this.f18864b), this.f18865c, this.f18866d);
            return O9.p.f3034a;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.questionnary.model.SNSQuestionnaireViewModel$showPageWithIndex$2", f = "SNSQuestionnaireViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class q extends SuspendLambda implements InterfaceC0650p<C0345d, T9.a<? super C0345d>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f18867a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f18868b;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ List<b.C0241b> f18870d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f18871e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(List<b.C0241b> list, boolean z10, T9.a<? super q> aVar) {
            super(2, aVar);
            this.f18870d = list;
            this.f18871e = z10;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C0345d c0345d, T9.a<? super C0345d> aVar) {
            return ((q) create(c0345d, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            q qVar = d.this.new q(this.f18870d, this.f18871e, aVar);
            qVar.f18868b = obj;
            return qVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f18867a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            C0345d c0345d = (C0345d) this.f18868b;
            int r8 = d.this.r();
            C0345d.a e10 = c0345d.e();
            return C0345d.a(c0345d, null, r8, e10 != null ? e10.a(this.f18871e, e10.d()) : null, this.f18870d, 1, null);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.questionnary.model.SNSQuestionnaireViewModel$submitForm$1", f = "SNSQuestionnaireViewModel.kt", l = {293}, m = "invokeSuspend")
    public static final class r extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f18872a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f18873b;

        /* renamed from: c, reason: collision with root package name */
        public int f18874c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f18875d;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f18877f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ boolean f18878g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(String str, boolean z10, T9.a<? super r> aVar) {
            super(2, aVar);
            this.f18877f = str;
            this.f18878g = z10;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((r) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            r rVar = d.this.new r(this.f18877f, this.f18878g, aVar);
            rVar.f18875d = obj;
            return rVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x00ce  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 226
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.presentation.screen.questionnary.model.d.r.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.questionnary.model.SNSQuestionnaireViewModel$updateFileAttachmentFieldItemStateWithId$1", f = "SNSQuestionnaireViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class s extends SuspendLambda implements InterfaceC0650p<C0345d, T9.a<? super C0345d>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f18879a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f18880b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List<b.C0241b> f18881c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f18882d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(List<b.C0241b> list, boolean z10, T9.a<? super s> aVar) {
            super(2, aVar);
            this.f18881c = list;
            this.f18882d = z10;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C0345d c0345d, T9.a<? super C0345d> aVar) {
            return ((s) create(c0345d, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            s sVar = new s(this.f18881c, this.f18882d, aVar);
            sVar.f18880b = obj;
            return sVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f18879a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            C0345d c0345d = (C0345d) this.f18880b;
            C0345d.a e10 = c0345d.e();
            return C0345d.a(c0345d, null, 0, e10 != null ? e10.a(this.f18882d, e10.d()) : null, this.f18881c, 3, null);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.questionnary.model.SNSQuestionnaireViewModel$updateFileAttachmentFieldStateWithId$1", f = "SNSQuestionnaireViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class t extends SuspendLambda implements InterfaceC0650p<C0345d, T9.a<? super C0345d>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f18883a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f18884b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List<b.C0241b> f18885c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f18886d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(List<b.C0241b> list, boolean z10, T9.a<? super t> aVar) {
            super(2, aVar);
            this.f18885c = list;
            this.f18886d = z10;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C0345d c0345d, T9.a<? super C0345d> aVar) {
            return ((t) create(c0345d, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            t tVar = new t(this.f18885c, this.f18886d, aVar);
            tVar.f18884b = obj;
            return tVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f18883a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            C0345d c0345d = (C0345d) this.f18884b;
            C0345d.a e10 = c0345d.e();
            return C0345d.a(c0345d, null, 0, e10 != null ? e10.a(this.f18886d, e10.d()) : null, this.f18885c, 3, null);
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(d.class, "questionnaireResponseDelegate", "getQuestionnaireResponseDelegate()Lcom/sumsub/sns/internal/core/data/source/applicant/remote/QuestionnaireResponse;", 0);
        kotlin.jvm.internal.i iVar = kotlin.jvm.internal.h.f23186a;
        iVar.getClass();
        MutablePropertyReference1Impl mutablePropertyReference1Impl2 = new MutablePropertyReference1Impl(d.class, "submitModelDelegate", "getSubmitModelDelegate()Lcom/sumsub/sns/internal/core/data/source/applicant/remote/QuestionnaireSubmitModel;", 0);
        iVar.getClass();
        f18791I = new InterfaceC0840h[]{mutablePropertyReference1Impl, mutablePropertyReference1Impl2, v.t(d.class, "countriesDataDelegate", "getCountriesDataDelegate()Lcom/sumsub/sns/internal/core/presentation/form/model/CountriesData;", 0, iVar), v.t(d.class, "currentPageIndex", "getCurrentPageIndex()I", 0, iVar), v.t(d.class, "uploadingFields", "getUploadingFields()Ljava/util/List;", 0, iVar)};
        f18790H = new b(null);
    }

    public d(G g10, com.sumsub.sns.internal.domain.i iVar, com.sumsub.sns.internal.domain.k kVar, com.sumsub.sns.internal.domain.o oVar, com.sumsub.sns.internal.domain.d dVar, com.sumsub.sns.internal.core.data.source.common.a aVar, com.sumsub.sns.internal.core.data.source.applicant.b bVar, com.sumsub.sns.internal.core.data.source.dynamic.b bVar2, com.sumsub.sns.internal.core.domain.b bVar3, w wVar, y yVar, com.sumsub.sns.internal.core.presentation.form.model.d dVar2) {
        super(aVar, bVar2);
        this.f18799q = iVar;
        this.f18800r = kVar;
        this.f18801s = oVar;
        this.f18802t = dVar;
        this.f18803u = bVar;
        this.f18804v = bVar2;
        this.f18805w = bVar3;
        String str = (String) g10.b("IDDOCSETTYPE");
        this.f18806x = str == null ? DocumentType.f15253j : str;
        this.f18807y = new com.sumsub.sns.internal.core.presentation.screen.base.a(g10, "KEY_QUESTIONNAIRE_RESPONSE", wVar);
        this.f18808z = new com.sumsub.sns.internal.core.presentation.screen.base.a(g10, "KEY_QUESTIONNAIRE_SUBMIT_MODEL", yVar);
        this.f18792A = new com.sumsub.sns.internal.core.presentation.screen.base.a(g10, "KEY_COUNTRIES_DATA_MODEL", dVar2);
        this.f18793B = new com.sumsub.sns.internal.core.presentation.screen.base.a(g10, "KEY_CURRENT_PAGE_NUMBER", 0);
        EmptyList emptyList = EmptyList.f23104a;
        this.f18794C = new com.sumsub.sns.internal.core.presentation.screen.base.a(g10, "KEY_UPLOADED_FIELDS", emptyList);
        this.f18795D = StateFlowKt.MutableStateFlow(new b.a(0, emptyList, null, new b.c(null, null, 3, null)));
        this.f18796E = e.f18818a;
        b0.b(j(), C0552s.b(this), new a(null));
        this.f18797F = new g();
        this.f18798G = new LinkedHashMap();
    }

    public final void A() {
        b(true);
        e(true);
        b(false);
    }

    public final void B() {
        b(r());
    }

    public final void C() {
        a(r() + 1);
        Logger.v$default(com.sumsub.sns.internal.log.a.f17535a, "Questionnaire", "showNextPage: " + r(), null, 4, null);
        b(r());
        c(true);
    }

    public final void D() {
        a(r() - 1);
        Logger.v$default(com.sumsub.sns.internal.log.a.f17535a, "Questionnaire", "showPreviousPage: " + r(), null, 4, null);
        b(r());
        c(false);
    }

    public final b.c p() {
        return new b.c(h().a("sns_quiestionnaire_field_isRequired"), h().a("sns_quiestionnaire_field_isNotValid"));
    }

    public final com.sumsub.sns.internal.core.presentation.form.model.d q() {
        return (com.sumsub.sns.internal.core.presentation.form.model.d) this.f18792A.a(this, f18791I[2]);
    }

    public final int r() {
        return ((Number) this.f18793B.a(this, f18791I[3])).intValue();
    }

    @Override // com.sumsub.sns.core.presentation.base.a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public C0345d e() {
        return new C0345d(null, 0, null, null, 15, null);
    }

    public final w t() {
        return (w) this.f18807y.a(this, f18791I[0]);
    }

    public final y u() {
        return (y) this.f18808z.a(this, f18791I[1]);
    }

    public final List<FieldId> v() {
        return (List) this.f18794C.a(this, f18791I[4]);
    }

    public final u w() {
        List<u> e10;
        Object obj;
        w t3 = t();
        String o10 = t3 != null ? t3.o() : null;
        y u6 = u();
        if (u6 != null && (e10 = u6.e()) != null) {
            Iterator<T> it = e10.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.f.b(((u) obj).c(), o10)) {
                    break;
                }
            }
            u uVar = (u) obj;
            if (uVar != null) {
                return uVar;
            }
        }
        return new u(o10, (Map) null, 2, (DefaultConstructorMarker) null);
    }

    public final boolean x() {
        if (r() == 0) {
            return false;
        }
        if (r() <= 0) {
            throw new IllegalStateException("Check failed.".toString());
        }
        D();
        return true;
    }

    public final List<b.C0241b> y() {
        w t3;
        com.sumsub.sns.internal.core.presentation.form.model.d q10 = q();
        if (q10 == null || (t3 = t()) == null) {
            return null;
        }
        return com.sumsub.sns.internal.presentation.screen.questionnary.model.b.a(t3, q10, u(), h().d(), this.f18796E);
    }

    public final void z() {
        Job launch$default;
        b(true);
        launch$default = BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), null, null, new i(null), 3, null);
        launch$default.invokeOnCompletion(new j());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.sumsub.sns.core.presentation.base.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object c(T9.a<? super O9.p> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.sumsub.sns.internal.presentation.screen.questionnary.model.d.n
            if (r0 == 0) goto L13
            r0 = r8
            com.sumsub.sns.internal.presentation.screen.questionnary.model.d$n r0 = (com.sumsub.sns.internal.presentation.screen.questionnary.model.d.n) r0
            int r1 = r0.f18856e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18856e = r1
            goto L18
        L13:
            com.sumsub.sns.internal.presentation.screen.questionnary.model.d$n r0 = new com.sumsub.sns.internal.presentation.screen.questionnary.model.d$n
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f18854c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f18856e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r1 = r0.f18853b
            com.sumsub.sns.internal.presentation.screen.questionnary.model.d r1 = (com.sumsub.sns.internal.presentation.screen.questionnary.model.d) r1
            java.lang.Object r0 = r0.f18852a
            com.sumsub.sns.internal.presentation.screen.questionnary.model.d r0 = (com.sumsub.sns.internal.presentation.screen.questionnary.model.d) r0
            kotlin.b.b(r8)
            goto L6c
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3a:
            java.lang.Object r2 = r0.f18852a
            com.sumsub.sns.internal.presentation.screen.questionnary.model.d r2 = (com.sumsub.sns.internal.presentation.screen.questionnary.model.d) r2
            kotlin.b.b(r8)
            goto L51
        L42:
            kotlin.b.b(r8)
            r0.f18852a = r7
            r0.f18856e = r4
            java.lang.Object r8 = super.c(r0)
            if (r8 != r1) goto L50
            return r1
        L50:
            r2 = r7
        L51:
            com.sumsub.sns.internal.presentation.screen.questionnary.model.d$o r8 = new com.sumsub.sns.internal.presentation.screen.questionnary.model.d$o
            r5 = 0
            r8.<init>(r5)
            r6 = 0
            com.sumsub.sns.core.presentation.base.a.a(r2, r6, r8, r4, r5)
            com.sumsub.sns.internal.core.data.source.applicant.b r8 = r2.f18803u
            r0.f18852a = r2
            r0.f18853b = r2
            r0.f18856e = r3
            java.lang.Object r8 = r8.a(r0)
            if (r8 != r1) goto L6a
            return r1
        L6a:
            r0 = r2
            r1 = r0
        L6c:
            ca.l r8 = (ca.InterfaceC0646l) r8
            r1.f18796E = r8
            com.sumsub.sns.internal.core.data.source.applicant.remote.w r8 = r0.t()
            if (r8 != 0) goto L7a
            r0.z()
            goto Laa
        L7a:
            java.util.List r8 = r0.v()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r8 = r8.iterator()
        L87:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto La0
            java.lang.Object r2 = r8.next()
            r3 = r2
            com.sumsub.sns.internal.core.presentation.form.FieldId r3 = (com.sumsub.sns.internal.core.presentation.form.FieldId) r3
            java.util.Map<com.sumsub.sns.internal.core.presentation.form.FieldId, kotlinx.coroutines.Job> r4 = r0.f18798G
            boolean r3 = r4.containsKey(r3)
            if (r3 == 0) goto L87
            r1.add(r2)
            goto L87
        La0:
            r0.a(r1)
            int r8 = r0.r()
            r0.b(r8)
        Laa:
            O9.p r8 = O9.p.f3034a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.presentation.screen.questionnary.model.d.c(T9.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(T9.a<? super java.lang.Boolean> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.sumsub.sns.internal.presentation.screen.questionnary.model.d.h
            if (r0 == 0) goto L13
            r0 = r11
            com.sumsub.sns.internal.presentation.screen.questionnary.model.d$h r0 = (com.sumsub.sns.internal.presentation.screen.questionnary.model.d.h) r0
            int r1 = r0.f18832e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18832e = r1
            goto L18
        L13:
            com.sumsub.sns.internal.presentation.screen.questionnary.model.d$h r0 = new com.sumsub.sns.internal.presentation.screen.questionnary.model.d$h
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f18830c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f18832e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L46
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r1 = r0.f18829b
            java.lang.Object r0 = r0.f18828a
            com.sumsub.sns.internal.presentation.screen.questionnary.model.d r0 = (com.sumsub.sns.internal.presentation.screen.questionnary.model.d) r0
            kotlin.b.b(r11)
            goto La7
        L31:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L39:
            java.lang.Object r2 = r0.f18828a
            com.sumsub.sns.internal.presentation.screen.questionnary.model.d r2 = (com.sumsub.sns.internal.presentation.screen.questionnary.model.d) r2
            kotlin.b.b(r11)
            kotlin.Result r11 = (kotlin.Result) r11
            java.lang.Object r11 = r11.f23091a
            r4 = r2
            goto L61
        L46:
            kotlin.b.b(r11)
            com.sumsub.sns.internal.core.domain.b r11 = r10.f18805w
            com.sumsub.sns.internal.ff.a r2 = com.sumsub.sns.internal.ff.a.f16930a
            com.sumsub.sns.internal.ff.core.a r2 = r2.m()
            boolean r2 = r2.g()
            r0.f18828a = r10
            r0.f18832e = r4
            java.lang.Object r11 = r11.a(r2, r0)
            if (r11 != r1) goto L60
            return r1
        L60:
            r4 = r10
        L61:
            boolean r2 = r11 instanceof kotlin.Result.Failure
            if (r2 == 0) goto L88
            java.lang.Throwable r11 = kotlin.Result.a(r11)
            r5 = r11
            java.lang.Exception r5 = (java.lang.Exception) r5
            com.sumsub.sns.internal.log.a r11 = com.sumsub.sns.internal.log.a.f17535a
            java.lang.String r0 = com.sumsub.sns.internal.log.c.a(r4)
            java.lang.String r1 = r5.getMessage()
            if (r1 != 0) goto L7a
            java.lang.String r1 = ""
        L7a:
            r11.e(r0, r1, r5)
            java.lang.String r6 = r4.f18806x
            r8 = 4
            r9 = 0
            r7 = 0
            com.sumsub.sns.core.presentation.base.a.a(r4, r5, r6, r7, r8, r9)
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            return r11
        L88:
            if (r2 == 0) goto L8c
            r2 = 0
            goto L8d
        L8c:
            r2 = r11
        L8d:
            com.sumsub.sns.internal.core.domain.c r2 = (com.sumsub.sns.internal.core.domain.c) r2
            if (r2 != 0) goto L94
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            return r11
        L94:
            com.sumsub.sns.internal.core.data.source.dynamic.b r2 = r4.f18804v
            r0.f18828a = r4
            r0.f18829b = r11
            r0.f18832e = r3
            r3 = 0
            java.lang.Object r0 = r2.a(r3, r0)
            if (r0 != r1) goto La4
            return r1
        La4:
            r1 = r11
            r11 = r0
            r0 = r4
        La7:
            com.sumsub.sns.internal.core.data.model.e r11 = (com.sumsub.sns.internal.core.data.model.e) r11
            java.util.Map r11 = r11.B()
            kotlin.b.b(r1)
            com.sumsub.sns.internal.core.domain.c r1 = (com.sumsub.sns.internal.core.domain.c) r1
            com.sumsub.sns.internal.core.presentation.form.model.d r2 = new com.sumsub.sns.internal.core.presentation.form.model.d
            r2.<init>(r11, r1)
            r0.a(r2)
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.presentation.screen.questionnary.model.d.d(T9.a):java.lang.Object");
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.b
    public StateFlow<b.a> b() {
        return this.f18795D;
    }

    public final void e(boolean z10) {
        w t3;
        String o10;
        Logger.v$default(com.sumsub.sns.internal.log.a.f17535a, "Questionnaire", "submitForm: andContinue=" + z10, null, 4, null);
        if (u() == null || (t3 = t()) == null || (o10 = t3.o()) == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), null, null, new r(o10, z10, null), 3, null);
    }

    public final void b(int i9) {
        boolean b9;
        Logger.i$default(com.sumsub.sns.internal.log.a.f17535a, "Questionnaire", com.google.android.gms.measurement.internal.a.g(i9, "Show page with index "), null, 4, null);
        a(i9);
        List<b.C0241b> y10 = y();
        if (y10 != null) {
            ArrayList arrayList = new ArrayList(P9.n.u(y10, 10));
            for (b.C0241b c0241b : y10) {
                if (c0241b.e() == r()) {
                    c0241b = a(c0241b, v());
                }
                arrayList.add(c0241b);
            }
            Logger.v$default(com.sumsub.sns.internal.log.a.f17535a, "Questionnaire", "pages total " + arrayList.size(), null, 4, null);
            if (arrayList.size() <= r()) {
                com.sumsub.sns.core.presentation.base.a.a(this, new IllegalStateException("Empty questionnaire"), this.f18806x, (Object) null, 4, (Object) null);
                return;
            }
            b.C0241b c0241b2 = (b.C0241b) P9.s.M(r(), arrayList);
            if (c0241b2 != null) {
                a(c0241b2);
            }
            b9 = com.sumsub.sns.internal.presentation.screen.questionnary.model.f.b((b.C0241b) arrayList.get(r()));
            com.sumsub.sns.core.presentation.base.a.a(this, false, new q(arrayList, b9, null), 1, null);
        }
    }

    public final void a(w wVar) {
        this.f18807y.a(this, f18791I[0], wVar);
    }

    public final void a(y yVar) {
        this.f18808z.a(this, f18791I[1], yVar);
    }

    public final void a(com.sumsub.sns.internal.core.presentation.form.model.d dVar) {
        this.f18792A.a(this, f18791I[2], dVar);
    }

    public final void a(int i9) {
        this.f18793B.a(this, f18791I[3], Integer.valueOf(i9));
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0100 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(boolean r12) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.presentation.screen.questionnary.model.d.c(boolean):void");
    }

    public final void a(List<FieldId> list) {
        this.f18794C.a(this, f18791I[4], list);
    }

    @Override // com.sumsub.sns.core.presentation.base.a
    public void a(com.sumsub.sns.internal.core.data.model.o oVar) {
        if (oVar instanceof o.e) {
            com.sumsub.sns.core.presentation.base.a.a(this, (com.sumsub.sns.internal.core.common.q) null, (Object) null, (Long) null, 7, (Object) null);
        } else {
            super.a(oVar);
        }
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.b
    public com.sumsub.sns.internal.core.presentation.form.d a() {
        return this.f18797F;
    }

    public final void d(boolean z10) {
        Logger.v$default(com.sumsub.sns.internal.log.a.f17535a, "Questionnaire", "handleSubmitSuccess: andContinue=" + z10, null, 4, null);
        if (z10) {
            C0345d c2 = c();
            if (c2.f() < P9.m.p(c2.h())) {
                C();
            } else {
                com.sumsub.sns.core.presentation.base.a.a(this, new q.b(true), (Object) null, (Long) null, 6, (Object) null);
            }
        }
    }

    public final void a(b.C0241b c0241b) {
        u w2 = w();
        u uVar = null;
        for (FormItem formItem : c0241b.f()) {
            if (formItem instanceof FormItem.l) {
                uVar = c.a(w2, ((FormItem.l) formItem).e());
            }
        }
        if (uVar != null) {
            a(uVar);
        }
    }

    public static final class e extends Lambda implements InterfaceC0646l<String, String> {

        /* renamed from: a, reason: collision with root package name */
        public static final e f18818a = new e();

        public e() {
            super(1);
        }

        @Override // ca.InterfaceC0646l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str) {
            return str;
        }
    }

    public final void b(FormItem formItem, List<String> list) {
        u a10;
        if (list.isEmpty()) {
            return;
        }
        Logger.v$default(com.sumsub.sns.internal.log.a.f17535a, "Questionnaire", "handleFilesDeleted: " + formItem, null, 4, null);
        if (formItem instanceof FormItem.g) {
            a10 = c.a(w(), ((FormItem.g) formItem).e(), formItem.d().p(), (String) null);
        } else {
            if (!(formItem instanceof FormItem.i)) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            FormItem.i iVar = (FormItem.i) formItem;
            List<String> b9 = c.b(w(), iVar.e(), formItem.d().p());
            if (b9 != null) {
                arrayList.addAll(b9);
            }
            arrayList.removeAll(list);
            a10 = c.a(w(), iVar.e(), formItem.d().p(), arrayList);
        }
        a(a10);
        B();
        e(false);
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.b
    public void a(FormItem formItem, String str) {
        BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), null, null, new k(formItem, str, null), 3, null);
    }

    public final void a(FieldId fieldId, String str, FormItem.ItemState itemState) {
        boolean b9;
        String str2;
        String str3;
        b.C0241b c0241b = (b.C0241b) P9.s.M(this.f18795D.getValue().f(), this.f18795D.getValue().h());
        if (c0241b == null) {
            return;
        }
        List<b.C0241b> h9 = this.f18795D.getValue().h();
        int i9 = 10;
        ArrayList arrayList = new ArrayList(P9.n.u(h9, 10));
        for (b.C0241b c0241b2 : h9) {
            if (c0241b2 == c0241b) {
                c0241b2 = null;
            }
            if (c0241b2 == null) {
                List<FormItem> f10 = c0241b.f();
                ArrayList arrayList2 = new ArrayList(P9.n.u(f10, i9));
                for (FormItem formItem : f10) {
                    FormItem formItem2 = kotlin.jvm.internal.f.b(com.sumsub.sns.internal.presentation.screen.questionnary.model.f.a(formItem), fieldId) ^ true ? formItem : null;
                    if (formItem2 == null) {
                        if (formItem instanceof FormItem.g) {
                            formItem2 = r13.a((r18 & 1) != 0 ? r13.d() : null, (r18 & 2) != 0 ? r13.e() : null, (r18 & 4) != 0 ? r13.f() : null, (r18 & 8) != 0 ? r13.f16506n : null, (r18 & 16) != 0 ? r13.b() : null, (r18 & 32) != 0 ? r13.f16508p : itemState, (r18 & 64) != 0 ? r13.f16509q : null, (r18 & 128) != 0 ? ((FormItem.g) formItem).f16510r : null);
                            formItem2.a(formItem.a());
                        } else if (formItem instanceof FormItem.i) {
                            FormItem.i iVar = (FormItem.i) formItem;
                            List<FormItem.ItemState> u6 = iVar.u();
                            ArrayList arrayList3 = new ArrayList(P9.n.u(u6, i9));
                            int i10 = 0;
                            for (Object obj : u6) {
                                int i11 = i10 + 1;
                                if (i10 >= 0) {
                                    FormItem.ItemState itemState2 = (FormItem.ItemState) obj;
                                    List<String> g10 = formItem.g();
                                    if (g10 != null) {
                                        str3 = (String) P9.s.M(i10, g10);
                                        str2 = str;
                                    } else {
                                        str2 = str;
                                        str3 = null;
                                    }
                                    if (!(!kotlin.jvm.internal.f.b(str3, str2))) {
                                        itemState2 = null;
                                    }
                                    arrayList3.add(itemState2 == null ? itemState : itemState2);
                                    i10 = i11;
                                } else {
                                    P9.m.t();
                                    throw null;
                                }
                            }
                            formItem2 = iVar.a((r20 & 1) != 0 ? iVar.d() : null, (r20 & 2) != 0 ? iVar.e() : null, (r20 & 4) != 0 ? iVar.g() : null, (r20 & 8) != 0 ? iVar.f16516n : null, (r20 & 16) != 0 ? iVar.b() : null, (r20 & 32) != 0 ? iVar.i() : false, (r20 & 64) != 0 ? iVar.f16519q : arrayList3, (r20 & 128) != 0 ? iVar.f16520r : null, (r20 & 256) != 0 ? iVar.f16521s : null);
                            formItem2.a(formItem.a());
                        } else {
                            continue;
                            arrayList2.add(formItem);
                            i9 = 10;
                        }
                    }
                    formItem = formItem2;
                    arrayList2.add(formItem);
                    i9 = 10;
                }
                c0241b2 = b.C0241b.a(c0241b, 0, null, null, arrayList2, 7, null);
            }
            arrayList.add(c0241b2);
            i9 = 10;
        }
        b9 = com.sumsub.sns.internal.presentation.screen.questionnary.model.f.b((b.C0241b) arrayList.get(this.f18795D.getValue().f()));
        com.sumsub.sns.core.presentation.base.a.a(this, false, new s(arrayList, b9, null), 1, null);
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.b
    public void b(FormItem formItem, String str) {
        a(c.a(w(), formItem.e(), formItem.d().p(), str));
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.b
    public void a(Context context, FieldId fieldId, List<? extends Uri> list) {
        Job launch$default;
        Logger.v$default(com.sumsub.sns.internal.log.a.f17535a, "Questionnaire", "onPickedFiles: $" + fieldId, null, 4, null);
        a(fieldId, FormItem.ItemState.LOADING);
        launch$default = BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), null, null, new l(fieldId, context, list, null), 3, null);
        this.f18798G.put(fieldId, launch$default);
        launch$default.invokeOnCompletion(new m(fieldId, this));
    }

    public final void a(FieldId fieldId, FormItem.ItemState itemState) {
        boolean b9;
        b.C0241b c0241b = (b.C0241b) P9.s.M(this.f18795D.getValue().f(), this.f18795D.getValue().h());
        if (c0241b == null) {
            return;
        }
        List<b.C0241b> h9 = this.f18795D.getValue().h();
        ArrayList arrayList = new ArrayList(P9.n.u(h9, 10));
        for (b.C0241b c0241b2 : h9) {
            if (c0241b2 == c0241b) {
                c0241b2 = null;
            }
            if (c0241b2 == null) {
                List<FormItem> f10 = c0241b.f();
                ArrayList arrayList2 = new ArrayList(P9.n.u(f10, 10));
                for (FormItem formItem : f10) {
                    FormItem formItem2 = kotlin.jvm.internal.f.b(com.sumsub.sns.internal.presentation.screen.questionnary.model.f.a(formItem), fieldId) ^ true ? formItem : null;
                    if (formItem2 == null) {
                        if (formItem instanceof FormItem.g) {
                            formItem2 = r13.a((r18 & 1) != 0 ? r13.d() : null, (r18 & 2) != 0 ? r13.e() : null, (r18 & 4) != 0 ? r13.f() : null, (r18 & 8) != 0 ? r13.f16506n : null, (r18 & 16) != 0 ? r13.b() : null, (r18 & 32) != 0 ? r13.f16508p : null, (r18 & 64) != 0 ? r13.f16509q : itemState, (r18 & 128) != 0 ? ((FormItem.g) formItem).f16510r : null);
                            formItem2.a(formItem.a());
                        } else {
                            if (formItem instanceof FormItem.i) {
                                formItem = r13.a((r20 & 1) != 0 ? r13.d() : null, (r20 & 2) != 0 ? r13.e() : null, (r20 & 4) != 0 ? r13.g() : null, (r20 & 8) != 0 ? r13.f16516n : null, (r20 & 16) != 0 ? r13.b() : null, (r20 & 32) != 0 ? r13.i() : false, (r20 & 64) != 0 ? r13.f16519q : null, (r20 & 128) != 0 ? r13.f16520r : itemState, (r20 & 256) != 0 ? ((FormItem.i) formItem).f16521s : null);
                            }
                            arrayList2.add(formItem);
                        }
                    }
                    formItem = formItem2;
                    arrayList2.add(formItem);
                }
                c0241b2 = b.C0241b.a(c0241b, 0, null, null, arrayList2, 7, null);
            }
            arrayList.add(c0241b2);
        }
        b9 = com.sumsub.sns.internal.presentation.screen.questionnary.model.f.b((b.C0241b) arrayList.get(this.f18795D.getValue().f()));
        com.sumsub.sns.core.presentation.base.a.a(this, false, new t(arrayList, b9, null), 1, null);
    }

    public final b.C0241b a(b.C0241b c0241b, List<FieldId> list) {
        FormItem.ItemState itemState;
        FormItem a10;
        List<FormItem> f10 = c0241b.f();
        ArrayList arrayList = new ArrayList(P9.n.u(f10, 10));
        for (FormItem formItem : f10) {
            if (formItem instanceof FormItem.g) {
                FormItem.g gVar = (FormItem.g) formItem;
                itemState = list.contains(com.sumsub.sns.internal.presentation.screen.questionnary.model.f.a(formItem)) ? FormItem.ItemState.LOADING : null;
                a10 = gVar.a((r18 & 1) != 0 ? gVar.d() : null, (r18 & 2) != 0 ? gVar.e() : null, (r18 & 4) != 0 ? gVar.f() : null, (r18 & 8) != 0 ? gVar.f16506n : null, (r18 & 16) != 0 ? gVar.b() : null, (r18 & 32) != 0 ? gVar.f16508p : null, (r18 & 64) != 0 ? gVar.f16509q : itemState == null ? FormItem.ItemState.DEFAULT : itemState, (r18 & 128) != 0 ? gVar.f16510r : null);
                a10.a(formItem.a());
            } else if (formItem instanceof FormItem.i) {
                FormItem.i iVar = (FormItem.i) formItem;
                itemState = list.contains(com.sumsub.sns.internal.presentation.screen.questionnary.model.f.a(formItem)) ? FormItem.ItemState.LOADING : null;
                a10 = iVar.a((r20 & 1) != 0 ? iVar.d() : null, (r20 & 2) != 0 ? iVar.e() : null, (r20 & 4) != 0 ? iVar.g() : null, (r20 & 8) != 0 ? iVar.f16516n : null, (r20 & 16) != 0 ? iVar.b() : null, (r20 & 32) != 0 ? iVar.i() : false, (r20 & 64) != 0 ? iVar.f16519q : null, (r20 & 128) != 0 ? iVar.f16520r : itemState == null ? FormItem.ItemState.DEFAULT : itemState, (r20 & 256) != 0 ? iVar.f16521s : null);
                a10.a(formItem.a());
            } else {
                arrayList.add(formItem);
            }
            formItem = a10;
            arrayList.add(formItem);
        }
        return b.C0241b.a(c0241b, 0, null, null, arrayList, 7, null);
    }

    public final void a(FieldId fieldId, List<com.sumsub.sns.internal.core.data.model.remote.k> list) {
        u a10;
        String q10;
        if (list.isEmpty()) {
            return;
        }
        Logger.v$default(com.sumsub.sns.internal.log.a.f17535a, "Questionnaire", "handleFilesUploaded: " + fieldId, null, 4, null);
        FormItem a11 = a(fieldId);
        if (a11 == null) {
            return;
        }
        if (a11 instanceof FormItem.g) {
            com.sumsub.sns.internal.core.data.model.remote.k kVar = (com.sumsub.sns.internal.core.data.model.remote.k) P9.s.L(list);
            if (kVar == null || (q10 = kVar.q()) == null) {
                return;
            } else {
                a10 = c.a(w(), fieldId.getSectionId(), fieldId.getItemId(), q10);
            }
        } else {
            if (!(a11 instanceof FormItem.i)) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (com.sumsub.sns.internal.core.data.model.remote.k kVar2 : list) {
                String q11 = kVar2 != null ? kVar2.q() : null;
                if (q11 != null) {
                    arrayList.add(q11);
                }
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            List<String> b9 = c.b(w(), fieldId.getSectionId(), fieldId.getItemId());
            if (b9 != null) {
                arrayList2.addAll(b9);
            }
            a10 = c.a(w(), fieldId.getSectionId(), fieldId.getItemId(), arrayList2);
        }
        a(a10);
        e(false);
        B();
    }

    public final FormItem a(FieldId fieldId) {
        FormItem a10 = com.sumsub.sns.internal.presentation.screen.questionnary.model.f.a(c().h(), fieldId);
        if (a10 != null) {
            return a10;
        }
        if (!c().h().isEmpty()) {
            return null;
        }
        Logger.v$default(com.sumsub.sns.internal.log.a.f17535a, "Questionnaire", "loading page list ...", null, 4, null);
        List<b.C0241b> y10 = y();
        if (y10 != null) {
            return com.sumsub.sns.internal.presentation.screen.questionnary.model.f.a(y10, fieldId);
        }
        return null;
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:96)
        */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00ab -> B:11:0x00da). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00c8 -> B:10:0x00cf). Please report as a decompilation issue!!! */
    public final java.lang.Object a(android.content.Context r24, java.util.List<? extends android.net.Uri> r25, java.lang.String r26, T9.a<? super java.util.List<com.sumsub.sns.internal.core.data.model.n>> r27) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.presentation.screen.questionnary.model.d.a(android.content.Context, java.util.List, java.lang.String, T9.a):java.lang.Object");
    }

    public final void a(String str, Exception exc) {
        BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), NonCancellable.INSTANCE, null, new p(str, exc, null), 2, null);
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.b
    public void a(FormItem formItem, List<String> list) {
        a(c.a(w(), formItem.e(), formItem.d().p(), list));
    }

    public final void a(u uVar) {
        y u6 = u();
        a(u6 != null ? y.a(u6, null, P9.m.r(uVar), 1, null) : null);
    }
}
