package la;

import kotlin.time.DurationUnit;
import la.c;

/* compiled from: TimeSources.kt */
/* renamed from: la.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0989a implements h {
    private final DurationUnit unit;
    private final O9.f zero$delegate = kotlin.a.a(new g8.g(this, 11));

    /* compiled from: TimeSources.kt */
    /* renamed from: la.a$a, reason: collision with other inner class name */
    public static final class C0429a implements InterfaceC0990b {

        /* renamed from: a, reason: collision with root package name */
        public final long f23584a;

        /* renamed from: b, reason: collision with root package name */
        public final AbstractC0989a f23585b;

        /* renamed from: c, reason: collision with root package name */
        public final long f23586c = 0;

        public C0429a(long j10, AbstractC0989a abstractC0989a) {
            this.f23584a = j10;
            this.f23585b = abstractC0989a;
        }

        public final long a(InterfaceC0990b interfaceC0990b) {
            long g10;
            if (interfaceC0990b instanceof C0429a) {
                C0429a c0429a = (C0429a) interfaceC0990b;
                AbstractC0989a abstractC0989a = c0429a.f23585b;
                AbstractC0989a abstractC0989a2 = this.f23585b;
                if (kotlin.jvm.internal.f.b(abstractC0989a2, abstractC0989a)) {
                    DurationUnit unit = abstractC0989a2.getUnit();
                    long j10 = c0429a.f23584a;
                    long j11 = (j10 - 1) | 1;
                    long j12 = this.f23584a;
                    long j13 = 0;
                    if (j11 == Long.MAX_VALUE) {
                        if (j12 == j10) {
                            c.f23587b.getClass();
                        } else {
                            j13 = c.n(f.a(j10));
                        }
                    } else if (((j12 - 1) | 1) == Long.MAX_VALUE) {
                        j13 = f.a(j12);
                    } else {
                        long j14 = j12 - j10;
                        if (((~(j14 ^ j10)) & (j14 ^ j12)) < 0) {
                            DurationUnit durationUnit = DurationUnit.MILLISECONDS;
                            if (unit.compareTo(durationUnit) < 0) {
                                long convert = unit.f23215a.convert(1L, durationUnit.f23215a);
                                long j15 = (j12 / convert) - (j10 / convert);
                                long j16 = (j12 % convert) - (j10 % convert);
                                c.a aVar = c.f23587b;
                                g10 = c.k(e.g(j15, durationUnit), e.g(j16, unit));
                            } else {
                                g10 = c.n(f.a(j14));
                            }
                        } else {
                            g10 = e.g(j14, unit);
                        }
                        j13 = g10;
                    }
                    return c.k(j13, c.k(this.f23586c, c.n(c0429a.f23586c)));
                }
            }
            throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + this + " and " + interfaceC0990b);
        }

        @Override // java.lang.Comparable
        public final int compareTo(InterfaceC0990b interfaceC0990b) {
            long a10 = a(interfaceC0990b);
            c.f23587b.getClass();
            return c.d(a10, 0L);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof C0429a) {
                if (kotlin.jvm.internal.f.b(this.f23585b, ((C0429a) obj).f23585b)) {
                    long a10 = a((InterfaceC0990b) obj);
                    c.f23587b.getClass();
                    if (a10 == 0) {
                        return true;
                    }
                }
            }
            return false;
        }

        public final int hashCode() {
            c.a aVar = c.f23587b;
            return Long.hashCode(this.f23584a) + (Long.hashCode(this.f23586c) * 37);
        }

        public final String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder("LongTimeMark(");
            sb2.append(this.f23584a);
            AbstractC0989a abstractC0989a = this.f23585b;
            DurationUnit unit = abstractC0989a.getUnit();
            switch (unit) {
                case NANOSECONDS:
                    str = "ns";
                    break;
                case MICROSECONDS:
                    str = "us";
                    break;
                case MILLISECONDS:
                    str = "ms";
                    break;
                case SECONDS:
                    str = "s";
                    break;
                case MINUTES:
                    str = "m";
                    break;
                case HOURS:
                    str = "h";
                    break;
                case DAYS:
                    str = "d";
                    break;
                default:
                    throw new IllegalStateException(("Unknown unit: " + unit).toString());
            }
            sb2.append(str);
            sb2.append(" + ");
            sb2.append((Object) c.m(this.f23586c));
            sb2.append(", ");
            sb2.append(abstractC0989a);
            sb2.append(')');
            return sb2.toString();
        }
    }

    public AbstractC0989a(DurationUnit durationUnit) {
        this.unit = durationUnit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long adjustedRead() {
        return read() - getZero();
    }

    private final long getZero() {
        return ((Number) this.zero$delegate.getValue()).longValue();
    }

    public final DurationUnit getUnit() {
        return this.unit;
    }

    public abstract long read();

    /* renamed from: markNow, reason: merged with bridge method [inline-methods] */
    public InterfaceC0990b m196markNow() {
        long adjustedRead = adjustedRead();
        c.f23587b.getClass();
        return new C0429a(adjustedRead, this);
    }
}
