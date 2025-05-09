package com.sumsub.sns.internal.presentation.screen.intro;

import O9.p;
import ca.InterfaceC0650p;
import com.sumsub.sns.core.presentation.base.a;
import com.sumsub.sns.internal.core.data.model.e;
import com.sumsub.sns.internal.core.data.source.dynamic.b;
import com.sumsub.sns.internal.core.presentation.intro.f;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class a extends com.sumsub.sns.core.presentation.base.a<a.l> {

    /* renamed from: v, reason: collision with root package name */
    public static final C0289a f17887v = new C0289a(null);

    /* renamed from: q, reason: collision with root package name */
    public final String f17888q;

    /* renamed from: r, reason: collision with root package name */
    public final String f17889r;

    /* renamed from: s, reason: collision with root package name */
    public final String f17890s;

    /* renamed from: t, reason: collision with root package name */
    public final String f17891t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f17892u;

    /* renamed from: com.sumsub.sns.internal.presentation.screen.intro.a$a, reason: collision with other inner class name */
    public static final class C0289a {
        public /* synthetic */ C0289a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C0289a() {
        }
    }

    public static final class b implements a.l {

        /* renamed from: a, reason: collision with root package name */
        public static final b f17893a = new b();
    }

    public static final class c implements a.l {

        /* renamed from: a, reason: collision with root package name */
        public final f f17894a;

        /* renamed from: b, reason: collision with root package name */
        public final Map<String, Object> f17895b;

        public c(f fVar, Map<String, ? extends Object> map) {
            this.f17894a = fVar;
            this.f17895b = map;
        }

        public final Map<String, Object> c() {
            return this.f17895b;
        }

        public final f d() {
            return this.f17894a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return kotlin.jvm.internal.f.b(this.f17894a, cVar.f17894a) && kotlin.jvm.internal.f.b(this.f17895b, cVar.f17895b);
        }

        public int hashCode() {
            return this.f17895b.hashCode() + (this.f17894a.hashCode() * 31);
        }

        public String toString() {
            return "IntroViewState(stepInfo=" + this.f17894a + ", data=" + this.f17895b + ')';
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.intro.SNSIntroViewModel$onPrepare$2", f = "SNSIntroViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements InterfaceC0650p<a.l, T9.a<? super a.l>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f17896a;

        public d(T9.a<? super d> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(a.l lVar, T9.a<? super a.l> aVar) {
            return ((d) create(lVar, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            return a.this.new d(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f17896a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            f fVar = new f(a.this.f17888q, a.this.f17890s, a.this.f17889r);
            b.c h9 = a.this.h();
            e d10 = a.this.d();
            return new c(fVar, new com.sumsub.sns.internal.core.presentation.intro.b(h9, d10 != null ? d10.C() : null, a.this.f17888q, a.this.f17889r, a.this.f17890s, false, 32, null).c());
        }
    }

    public a(String str, String str2, String str3, String str4, boolean z10, com.sumsub.sns.internal.core.data.source.common.a aVar, com.sumsub.sns.internal.core.data.source.dynamic.b bVar) {
        super(aVar, bVar);
        this.f17888q = str;
        this.f17889r = str2;
        this.f17890s = str3;
        this.f17891t = str4;
        this.f17892u = z10;
    }

    public final String p() {
        return this.f17891t;
    }

    @Override // com.sumsub.sns.core.presentation.base.a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public b e() {
        return b.f17893a;
    }

    public final String r() {
        return this.f17888q;
    }

    public final boolean s() {
        return this.f17892u;
    }

    @Override // com.sumsub.sns.core.presentation.base.a
    public Object c(T9.a<? super p> aVar) {
        com.sumsub.sns.core.presentation.base.a.a(this, false, new d(null), 1, null);
        return p.f3034a;
    }
}
