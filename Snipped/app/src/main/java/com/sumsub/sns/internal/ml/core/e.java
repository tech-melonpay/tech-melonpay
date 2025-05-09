package com.sumsub.sns.internal.ml.core;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public interface e<Input, Output> {

    public static abstract class a<Output> {

        /* renamed from: a, reason: collision with root package name */
        public static final C0275a f17675a = new C0275a(null);

        /* renamed from: com.sumsub.sns.internal.ml.core.e$a$a, reason: collision with other inner class name */
        public static final class C0275a {
            public /* synthetic */ C0275a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public C0275a() {
            }
        }

        public static final class b<Output> extends a<Output> {

            /* renamed from: c, reason: collision with root package name */
            public final Throwable f17676c;

            public b(Throwable th) {
                super(null);
                this.f17676c = th;
            }

            @Override // com.sumsub.sns.internal.ml.core.e.a
            public String a() {
                return Constants.IPC_BUNDLE_KEY_SEND_ERROR;
            }

            public final Throwable c() {
                return this.f17676c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && kotlin.jvm.internal.f.b(this.f17676c, ((b) obj).f17676c);
            }

            public int hashCode() {
                return this.f17676c.hashCode();
            }

            public String toString() {
                return "Error(throwable=" + this.f17676c + ')';
            }
        }

        public static final class c<Output> extends a<Output> {
            public c() {
                super(null);
            }

            @Override // com.sumsub.sns.internal.ml.core.e.a
            public String a() {
                return "skip";
            }
        }

        public static final class d<Output> extends a<Output> {

            /* renamed from: c, reason: collision with root package name */
            public final Output f17677c;

            public d(Output output) {
                super(null);
                this.f17677c = output;
            }

            @Override // com.sumsub.sns.internal.ml.core.e.a
            public String a() {
                return FirebaseAnalytics.Param.SUCCESS;
            }

            public final Output c() {
                return this.f17677c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && kotlin.jvm.internal.f.b(this.f17677c, ((d) obj).f17677c);
            }

            public int hashCode() {
                Output output = this.f17677c;
                if (output == null) {
                    return 0;
                }
                return output.hashCode();
            }

            public String toString() {
                return "Success(result=" + this.f17677c + ')';
            }
        }

        /* renamed from: com.sumsub.sns.internal.ml.core.e$a$e, reason: collision with other inner class name */
        public static final class C0276e<Output> extends a<Output> {
            public C0276e() {
                super(null);
            }

            @Override // com.sumsub.sns.internal.ml.core.e.a
            public String a() {
                return "timeout";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract String a();

        public a() {
        }
    }

    Object a(Input input, T9.a<? super a<Output>> aVar);
}
