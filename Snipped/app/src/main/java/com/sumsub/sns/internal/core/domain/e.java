package com.sumsub.sns.internal.core.domain;

import C.v;
import com.sumsub.sns.internal.core.data.model.q;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class e extends com.sumsub.sns.internal.core.domain.base.a<b, a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.dynamic.b f16382a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f16383a;

        /* renamed from: b, reason: collision with root package name */
        public final String f16384b;

        public a(String str, String str2) {
            this.f16383a = str;
            this.f16384b = str2;
        }

        public final String a() {
            return this.f16383a;
        }

        public final String b() {
            return this.f16384b;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f16385a;

        /* renamed from: b, reason: collision with root package name */
        public final List<q> f16386b;

        public b() {
            this(null, null, 3, null);
        }

        public final String c() {
            return this.f16385a;
        }

        public final List<q> d() {
            return this.f16386b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.f.b(this.f16385a, bVar.f16385a) && kotlin.jvm.internal.f.b(this.f16386b, bVar.f16386b);
        }

        public int hashCode() {
            String str = this.f16385a;
            return this.f16386b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Result(currentCountryKey=");
            sb2.append(this.f16385a);
            sb2.append(", documents=");
            return v.r(sb2, this.f16386b, ')');
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(String str, List<? extends q> list) {
            this.f16385a = str;
            this.f16386b = list;
        }

        public b(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? EmptyList.f23104a : list);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.domain.DocumentsUseCase", f = "DocumentsUseCase.kt", l = {17, 22}, m = "run")
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f16387a;

        /* renamed from: b, reason: collision with root package name */
        public Object f16388b;

        /* renamed from: c, reason: collision with root package name */
        public Object f16389c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f16390d;

        /* renamed from: f, reason: collision with root package name */
        public int f16392f;

        public c(T9.a<? super c> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f16390d = obj;
            this.f16392f |= Integer.MIN_VALUE;
            return e.this.a(null, this);
        }
    }

    public e(com.sumsub.sns.internal.core.data.source.dynamic.b bVar) {
        this.f16382a = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x016f, code lost:
    
        if (r14 == null) goto L87;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0106 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00d6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x012f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x015d A[LOOP:0: B:17:0x0157->B:19:0x015d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v30, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r14v31, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v35, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(com.sumsub.sns.internal.core.domain.e.a r13, T9.a<? super com.sumsub.sns.internal.core.domain.e.b> r14) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.domain.e.a(com.sumsub.sns.internal.core.domain.e$a, T9.a):java.lang.Object");
    }

    public e(com.sumsub.sns.internal.core.a aVar) {
        this(aVar.p());
    }
}
