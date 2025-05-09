package com.sumsub.sns.internal.core.domain.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.f;

/* loaded from: classes2.dex */
public abstract class a<L, R> {

    /* renamed from: com.sumsub.sns.internal.core.domain.model.a$a, reason: collision with other inner class name */
    public static final class C0240a<L> extends a {

        /* renamed from: a, reason: collision with root package name */
        public final L f16426a;

        public C0240a(L l10) {
            super(null);
            this.f16426a = l10;
        }

        public final L d() {
            return this.f16426a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0240a) && f.b(this.f16426a, ((C0240a) obj).f16426a);
        }

        public int hashCode() {
            L l10 = this.f16426a;
            if (l10 == null) {
                return 0;
            }
            return l10.hashCode();
        }

        public String toString() {
            return "Left(a=" + this.f16426a + ')';
        }
    }

    public static final class b<R> extends a {

        /* renamed from: a, reason: collision with root package name */
        public final R f16427a;

        public b(R r8) {
            super(null);
            this.f16427a = r8;
        }

        public final R d() {
            return this.f16427a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && f.b(this.f16427a, ((b) obj).f16427a);
        }

        public int hashCode() {
            R r8 = this.f16427a;
            if (r8 == null) {
                return 0;
            }
            return r8.hashCode();
        }

        public String toString() {
            return "Right(b=" + this.f16427a + ')';
        }
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean a() {
        return this instanceof C0240a;
    }

    public final boolean b() {
        return this instanceof b;
    }

    public a() {
    }
}
