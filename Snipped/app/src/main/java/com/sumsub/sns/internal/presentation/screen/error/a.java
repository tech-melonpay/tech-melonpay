package com.sumsub.sns.internal.presentation.screen.error;

import O9.p;
import V9.d;
import androidx.lifecycle.C0552s;
import ca.InterfaceC0650p;
import com.sumsub.sns.core.presentation.base.a;
import com.sumsub.sns.internal.core.data.model.o;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.f;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes2.dex */
public final class a extends com.sumsub.sns.core.presentation.base.a<b> {

    /* renamed from: t, reason: collision with root package name */
    public static final C0286a f17871t = new C0286a(null);

    /* renamed from: q, reason: collision with root package name */
    public final o f17872q;

    /* renamed from: r, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.extensions.a f17873r;

    /* renamed from: s, reason: collision with root package name */
    public final StateFlow<b> f17874s;

    /* renamed from: com.sumsub.sns.internal.presentation.screen.error.a$a, reason: collision with other inner class name */
    public static final class C0286a {
        public /* synthetic */ C0286a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C0286a() {
        }
    }

    public static abstract class b implements a.l {

        /* renamed from: com.sumsub.sns.internal.presentation.screen.error.a$b$a, reason: collision with other inner class name */
        public static final class C0287a extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final C0287a f17875a = new C0287a();

            public C0287a() {
                super(null);
            }
        }

        /* renamed from: com.sumsub.sns.internal.presentation.screen.error.a$b$b, reason: collision with other inner class name */
        public static final class C0288b extends b {

            /* renamed from: a, reason: collision with root package name */
            public final CharSequence f17876a;

            /* renamed from: b, reason: collision with root package name */
            public final CharSequence f17877b;

            /* renamed from: c, reason: collision with root package name */
            public final CharSequence f17878c;

            public C0288b() {
                this(null, null, null, 7, null);
            }

            public final CharSequence d() {
                return this.f17878c;
            }

            public final CharSequence e() {
                return this.f17877b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0288b)) {
                    return false;
                }
                C0288b c0288b = (C0288b) obj;
                return f.b(this.f17876a, c0288b.f17876a) && f.b(this.f17877b, c0288b.f17877b) && f.b(this.f17878c, c0288b.f17878c);
            }

            public final CharSequence f() {
                return this.f17876a;
            }

            public int hashCode() {
                CharSequence charSequence = this.f17876a;
                int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
                CharSequence charSequence2 = this.f17877b;
                int hashCode2 = (hashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
                CharSequence charSequence3 = this.f17878c;
                return hashCode2 + (charSequence3 != null ? charSequence3.hashCode() : 0);
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("Normal(title=");
                sb2.append((Object) this.f17876a);
                sb2.append(", subtitle=");
                sb2.append((Object) this.f17877b);
                sb2.append(", button=");
                return com.google.android.gms.measurement.internal.a.j(sb2, this.f17878c, ')');
            }

            public /* synthetic */ C0288b(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : charSequence, (i & 2) != 0 ? null : charSequence2, (i & 4) != 0 ? null : charSequence3);
            }

            public C0288b(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
                super(null);
                this.f17876a = charSequence;
                this.f17877b = charSequence2;
                this.f17878c = charSequence3;
            }
        }

        public static final class c extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final c f17879a = new c();

            public c() {
                super(null);
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public b() {
        }
    }

    @d(c = "com.sumsub.sns.internal.presentation.screen.error.SNSErrorViewModel$viewState$1", f = "SNSErrorViewModel.kt", l = {33, 34, 35, 38, 39, 40, 43, 44, 45, 63, 65}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements InterfaceC0650p<FlowCollector<? super b>, T9.a<? super p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f17880a;

        /* renamed from: b, reason: collision with root package name */
        public Object f17881b;

        /* renamed from: c, reason: collision with root package name */
        public int f17882c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f17883d;

        public c(T9.a<? super c> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(FlowCollector<? super b> flowCollector, T9.a<? super p> aVar) {
            return ((c) create(flowCollector, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            c cVar = a.this.new c(aVar);
            cVar.f17883d = obj;
            return cVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x01ba  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x01e1  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0208  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0225 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0251 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0185  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x01a6 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0191  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0160  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x017c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:56:0x017d  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x016b  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0124  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0141 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0142  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x012f  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0101  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x011c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:76:0x011d  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x010c  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x00e0 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:84:0x00e1  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x00c9 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:89:0x00ca  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                Method dump skipped, instructions count: 626
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.presentation.screen.error.a.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public a(o oVar, com.sumsub.sns.internal.core.data.source.extensions.a aVar, com.sumsub.sns.internal.core.data.source.common.a aVar2, com.sumsub.sns.internal.core.data.source.dynamic.b bVar) {
        super(aVar2, bVar);
        this.f17872q = oVar;
        this.f17873r = aVar;
        this.f17874s = FlowKt.stateIn(FlowKt.flow(new c(null)), C0552s.b(this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 0L, 0L, 3, null), b.C0287a.f17875a);
    }

    @Override // com.sumsub.sns.core.presentation.base.a
    public void b(o oVar) {
    }

    @Override // com.sumsub.sns.core.presentation.base.a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public StateFlow<b> j() {
        return this.f17874s;
    }
}
