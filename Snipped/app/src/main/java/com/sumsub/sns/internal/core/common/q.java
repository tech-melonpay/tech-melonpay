package com.sumsub.sns.internal.core.common;

import com.sumsub.sns.core.data.model.SNSCompletionResult;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public final String f15159a;

    public static final class a extends q {

        /* renamed from: b, reason: collision with root package name */
        public static final a f15160b = new a();

        public a() {
            super("Cancelled", null);
        }
    }

    public static final class b extends q {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f15161b;

        public b() {
            this(false, 1, null);
        }

        public final boolean b() {
            return this.f15161b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f15161b == ((b) obj).f15161b;
        }

        public int hashCode() {
            boolean z10 = this.f15161b;
            if (z10) {
                return 1;
            }
            return z10 ? 1 : 0;
        }

        @Override // com.sumsub.sns.internal.core.common.q
        public String toString() {
            return androidx.camera.core.impl.utils.a.o(new StringBuilder("Completed(goToNextDocument="), this.f15161b, ')');
        }

        public b(boolean z10) {
            super("Completed", null);
            this.f15161b = z10;
        }

        public /* synthetic */ b(boolean z10, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z10);
        }
    }

    public static final class c extends q {

        /* renamed from: b, reason: collision with root package name */
        public static final c f15162b = new c();

        public c() {
            super("GoBack", null);
        }
    }

    public static final class d extends q {

        /* renamed from: b, reason: collision with root package name */
        public final SNSCompletionResult f15163b;

        public d() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final SNSCompletionResult b() {
            return this.f15163b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && kotlin.jvm.internal.f.b(this.f15163b, ((d) obj).f15163b);
        }

        public int hashCode() {
            SNSCompletionResult sNSCompletionResult = this.f15163b;
            if (sNSCompletionResult == null) {
                return 0;
            }
            return sNSCompletionResult.hashCode();
        }

        @Override // com.sumsub.sns.internal.core.common.q
        public String toString() {
            return "Terminated(result=" + this.f15163b + ')';
        }

        public d(SNSCompletionResult sNSCompletionResult) {
            super("Terminated", null);
            this.f15163b = sNSCompletionResult;
        }

        public /* synthetic */ d(SNSCompletionResult sNSCompletionResult, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : sNSCompletionResult);
        }
    }

    public /* synthetic */ q(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public String toString() {
        return "FinishReason: " + this.f15159a;
    }

    public q(String str) {
        this.f15159a = str;
    }
}
