package f4;

import androidx.camera.core.n;
import e4.C0715a;

/* compiled from: StatisticRaw.kt */
/* loaded from: classes.dex */
public final class i extends C0715a {

    /* renamed from: b, reason: collision with root package name */
    @l3.b("period")
    private final String f20698b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("report")
    private final a f20699c;

    /* compiled from: StatisticRaw.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @l3.b("incoming")
        private final C0399a f20700a;

        /* renamed from: b, reason: collision with root package name */
        @l3.b("outgoing")
        private final C0399a f20701b;

        /* compiled from: StatisticRaw.kt */
        /* renamed from: f4.i$a$a, reason: collision with other inner class name */
        public static final class C0399a {

            /* renamed from: a, reason: collision with root package name */
            @l3.b("value_of_total_transactions")
            private final String f20702a;

            public final String a() {
                return this.f20702a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0399a) && kotlin.jvm.internal.f.b(this.f20702a, ((C0399a) obj).f20702a);
            }

            public final int hashCode() {
                return this.f20702a.hashCode();
            }

            public final String toString() {
                return n.a("TotalTransactoinsRaw(value=", this.f20702a, ")");
            }
        }

        public final C0399a a() {
            return this.f20700a;
        }

        public final C0399a b() {
            return this.f20701b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.f.b(this.f20700a, aVar.f20700a) && kotlin.jvm.internal.f.b(this.f20701b, aVar.f20701b);
        }

        public final int hashCode() {
            return this.f20701b.hashCode() + (this.f20700a.hashCode() * 31);
        }

        public final String toString() {
            return "ReportRaw(incoming=" + this.f20700a + ", outgoing=" + this.f20701b + ")";
        }
    }

    public final String b() {
        return this.f20698b;
    }

    public final a c() {
        return this.f20699c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return kotlin.jvm.internal.f.b(this.f20698b, iVar.f20698b) && kotlin.jvm.internal.f.b(this.f20699c, iVar.f20699c);
    }

    public final int hashCode() {
        return this.f20699c.hashCode() + (this.f20698b.hashCode() * 31);
    }

    public final String toString() {
        return "StatisticRaw(period=" + this.f20698b + ", report=" + this.f20699c + ")";
    }
}
