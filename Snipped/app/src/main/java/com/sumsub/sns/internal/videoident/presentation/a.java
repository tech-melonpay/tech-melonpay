package com.sumsub.sns.internal.videoident.presentation;

import C.v;
import O9.p;
import android.os.Build;
import android.os.Bundle;
import ca.InterfaceC0650p;
import com.sumsub.sns.core.presentation.base.a;
import com.sumsub.sns.internal.core.data.source.applicant.remote.n;
import com.sumsub.sns.videoident.presentation.LanguageSelectionFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class a extends com.sumsub.sns.core.presentation.base.a<c> {

    /* renamed from: s, reason: collision with root package name */
    public static final C0359a f19195s = new C0359a(null);

    /* renamed from: q, reason: collision with root package name */
    public final Bundle f19196q;

    /* renamed from: r, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.dynamic.b f19197r;

    /* renamed from: com.sumsub.sns.internal.videoident.presentation.a$a, reason: collision with other inner class name */
    public static final class C0359a {
        public /* synthetic */ C0359a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C0359a() {
        }
    }

    public static final class b implements a.j {

        /* renamed from: a, reason: collision with root package name */
        public final String f19198a;

        /* renamed from: b, reason: collision with root package name */
        public final long f19199b;

        public b(String str, long j10) {
            this.f19198a = str;
            this.f19199b = j10;
        }

        public final String c() {
            return this.f19198a;
        }

        public final long d() {
            return this.f19199b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.f.b(this.f19198a, bVar.f19198a) && this.f19199b == bVar.f19199b;
        }

        public int hashCode() {
            return Long.hashCode(this.f19199b) + (this.f19198a.hashCode() * 31);
        }

        public String toString() {
            return "FinishWithLanguage(language=" + this.f19198a + ", waitTimeSec=" + this.f19199b + ')';
        }
    }

    public static final class c extends SNSViewState {

        /* renamed from: a, reason: collision with root package name */
        public final String f19200a;

        /* renamed from: b, reason: collision with root package name */
        public final List<b> f19201b;

        public static final class b {

            /* renamed from: a, reason: collision with root package name */
            public final String f19202a;

            /* renamed from: b, reason: collision with root package name */
            public final String f19203b;

            /* renamed from: c, reason: collision with root package name */
            public final String f19204c;

            /* renamed from: d, reason: collision with root package name */
            public final String f19205d;

            /* renamed from: e, reason: collision with root package name */
            public final Boolean f19206e;

            /* renamed from: f, reason: collision with root package name */
            public final long f19207f;

            public b(String str, String str2, String str3, String str4, Boolean bool, long j10) {
                this.f19202a = str;
                this.f19203b = str2;
                this.f19204c = str3;
                this.f19205d = str4;
                this.f19206e = bool;
                this.f19207f = j10;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return kotlin.jvm.internal.f.b(this.f19202a, bVar.f19202a) && kotlin.jvm.internal.f.b(this.f19203b, bVar.f19203b) && kotlin.jvm.internal.f.b(this.f19204c, bVar.f19204c) && kotlin.jvm.internal.f.b(this.f19205d, bVar.f19205d) && kotlin.jvm.internal.f.b(this.f19206e, bVar.f19206e) && this.f19207f == bVar.f19207f;
            }

            public final String g() {
                return this.f19202a;
            }

            public final Boolean h() {
                return this.f19206e;
            }

            public int hashCode() {
                String str = this.f19202a;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f19203b;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.f19204c;
                int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.f19205d;
                int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
                Boolean bool = this.f19206e;
                return Long.hashCode(this.f19207f) + ((hashCode4 + (bool != null ? bool.hashCode() : 0)) * 31);
            }

            public final String i() {
                return this.f19204c;
            }

            public final String j() {
                return this.f19205d;
            }

            public final String k() {
                return this.f19203b;
            }

            public final long l() {
                return this.f19207f;
            }

            public String toString() {
                return "Language(id=" + this.f19202a + ", title=" + this.f19203b + ", status=" + this.f19204c + ", time=" + this.f19205d + ", selected=" + this.f19206e + ", waitTimeSec=" + this.f19207f + ')';
            }
        }

        public c(String str, List<b> list) {
            super(null);
            this.f19200a = str;
            this.f19201b = list;
        }

        public final c a(String str, List<b> list) {
            return new c(str, list);
        }

        public final List<b> c() {
            return this.f19201b;
        }

        public final String d() {
            return this.f19200a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return kotlin.jvm.internal.f.b(this.f19200a, cVar.f19200a) && kotlin.jvm.internal.f.b(this.f19201b, cVar.f19201b);
        }

        public int hashCode() {
            String str = this.f19200a;
            return this.f19201b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("ViewState(title=");
            sb2.append(this.f19200a);
            sb2.append(", languages=");
            return v.r(sb2, this.f19201b, ')');
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.videoident.presentation.LanguageSelectionViewModel$updateViewState$1", f = "LanguageSelectionViewModel.kt", l = {51, 53, 59, 60}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements InterfaceC0650p<c, T9.a<? super c>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f19208a;

        /* renamed from: b, reason: collision with root package name */
        public Object f19209b;

        /* renamed from: c, reason: collision with root package name */
        public Object f19210c;

        /* renamed from: d, reason: collision with root package name */
        public Object f19211d;

        /* renamed from: e, reason: collision with root package name */
        public Object f19212e;

        /* renamed from: f, reason: collision with root package name */
        public Object f19213f;

        /* renamed from: g, reason: collision with root package name */
        public Object f19214g;

        /* renamed from: h, reason: collision with root package name */
        public Object f19215h;
        public Object i;

        /* renamed from: j, reason: collision with root package name */
        public Object f19216j;

        /* renamed from: k, reason: collision with root package name */
        public Object f19217k;

        /* renamed from: l, reason: collision with root package name */
        public long f19218l;

        /* renamed from: m, reason: collision with root package name */
        public int f19219m;

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f19220n;

        public d(T9.a<? super d> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(c cVar, T9.a<? super c> aVar) {
            return ((d) create(cVar, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            d dVar = a.this.new d(aVar);
            dVar.f19220n = obj;
            return dVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x01e2  */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0205  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x013d  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x01d0 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x01d1  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x021e  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x020c  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x01f0  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x01d1 -> B:8:0x01de). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r28) {
            /*
                Method dump skipped, instructions count: 549
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.videoident.presentation.a.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public a(Bundle bundle, com.sumsub.sns.internal.core.data.source.common.a aVar, com.sumsub.sns.internal.core.data.source.dynamic.b bVar) {
        super(aVar, bVar);
        this.f19196q = bundle;
        this.f19197r = bVar;
    }

    public final Bundle p() {
        return this.f19196q;
    }

    public final List<n> q() {
        Bundle bundle = this.f19196q;
        ArrayList parcelableArrayList = Build.VERSION.SDK_INT >= 33 ? bundle.getParcelableArrayList("languages", n.class) : bundle.getParcelableArrayList("languages");
        return parcelableArrayList == null ? EmptyList.f23104a : parcelableArrayList;
    }

    @Override // com.sumsub.sns.core.presentation.base.a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public c e() {
        return new c("", EmptyList.f23104a);
    }

    public final String s() {
        return this.f19196q.getString(LanguageSelectionFragment.RESULT_KEY_SELECTED_LANGUAGE, null);
    }

    public final void t() {
        com.sumsub.sns.core.presentation.base.a.a(this, false, new d(null), 1, null);
    }

    @Override // com.sumsub.sns.core.presentation.base.a
    public Object c(T9.a<? super p> aVar) {
        t();
        return p.f3034a;
    }

    public final void a(c.b bVar) {
        String g10 = bVar.g();
        if (g10 == null) {
            g10 = "en";
        }
        a(new b(g10, bVar.l()));
    }
}
