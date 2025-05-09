package J5;

import ca.InterfaceC0646l;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.f;

/* compiled from: Either.kt */
/* loaded from: classes.dex */
public abstract class a<L, R> {

    /* compiled from: Either.kt */
    /* renamed from: J5.a$a, reason: collision with other inner class name */
    public static final class C0026a<L> extends a {

        /* renamed from: a, reason: collision with root package name */
        public final L f2145a;

        /* JADX WARN: Multi-variable type inference failed */
        public C0026a(J5.b bVar) {
            this.f2145a = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0026a) && f.b(this.f2145a, ((C0026a) obj).f2145a);
        }

        public final int hashCode() {
            L l10 = this.f2145a;
            if (l10 == null) {
                return 0;
            }
            return l10.hashCode();
        }

        public final String toString() {
            return "Left(a=" + this.f2145a + ")";
        }
    }

    /* compiled from: Either.kt */
    public static final class b<R> extends a {

        /* renamed from: a, reason: collision with root package name */
        public final R f2146a;

        public b(R r8) {
            this.f2146a = r8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && f.b(this.f2146a, ((b) obj).f2146a);
        }

        public final int hashCode() {
            R r8 = this.f2146a;
            if (r8 == null) {
                return 0;
            }
            return r8.hashCode();
        }

        public final String toString() {
            return "Right(b=" + this.f2146a + ")";
        }
    }

    public final void a(InterfaceC0646l interfaceC0646l, InterfaceC0646l interfaceC0646l2) {
        if (this instanceof C0026a) {
            interfaceC0646l.invoke(((C0026a) this).f2145a);
        } else {
            if (!(this instanceof b)) {
                throw new NoWhenBranchMatchedException();
            }
            interfaceC0646l2.invoke(((b) this).f2146a);
        }
    }
}
