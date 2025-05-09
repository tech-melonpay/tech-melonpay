package com.sumsub.sns.internal.core.data.source.dynamic;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.f;

/* loaded from: classes2.dex */
public abstract class e<T> {

    /* renamed from: a, reason: collision with root package name */
    public static final a f16308a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <T> d<T> a(T t3) {
            return new d<>(t3);
        }

        public a() {
        }

        public final <T> c<T> a(T t3, Throwable th) {
            return new c<>(th, t3);
        }
    }

    public static final class c<T> extends e<T> {

        /* renamed from: b, reason: collision with root package name */
        public final Throwable f16309b;

        /* renamed from: c, reason: collision with root package name */
        public final T f16310c;

        public c(Throwable th, T t3) {
            super(null);
            this.f16309b = th;
            this.f16310c = t3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return f.b(this.f16309b, cVar.f16309b) && f.b(this.f16310c, cVar.f16310c);
        }

        public final T h() {
            return this.f16310c;
        }

        public int hashCode() {
            int hashCode = this.f16309b.hashCode() * 31;
            T t3 = this.f16310c;
            return hashCode + (t3 == null ? 0 : t3.hashCode());
        }

        public final Throwable i() {
            return this.f16309b;
        }

        public String toString() {
            return "Failure(throwable=" + this.f16309b + ", lastValue=" + this.f16310c + ')';
        }
    }

    public static final class d<T> extends e<T> {

        /* renamed from: b, reason: collision with root package name */
        public final T f16311b;

        public d(T t3) {
            super(null);
            this.f16311b = t3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && f.b(this.f16311b, ((d) obj).f16311b);
        }

        public final T g() {
            return this.f16311b;
        }

        public int hashCode() {
            T t3 = this.f16311b;
            if (t3 == null) {
                return 0;
            }
            return t3.hashCode();
        }

        public String toString() {
            return "Success(value=" + this.f16311b + ')';
        }
    }

    public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final Throwable a() {
        c cVar = this instanceof c ? (c) this : null;
        if (cVar != null) {
            return cVar.i();
        }
        return null;
    }

    public final boolean b() {
        return c() != null;
    }

    public final T c() {
        if (this instanceof d) {
            return (T) ((d) this).g();
        }
        if (this instanceof c) {
            return (T) ((c) this).h();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final T d() {
        d dVar = this instanceof d ? (d) this : null;
        if (dVar != null) {
            return (T) dVar.g();
        }
        return null;
    }

    public final T e() {
        if (this instanceof c) {
            throw ((c) this).i();
        }
        T c2 = c();
        if (c2 != null) {
            return c2;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public e() {
    }
}
