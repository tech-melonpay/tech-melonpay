package la;

import kotlin.time.DurationUnit;

/* compiled from: Duration.kt */
/* loaded from: classes2.dex */
public final class c implements Comparable<c> {

    /* renamed from: b, reason: collision with root package name */
    public static final a f23587b = new a();

    /* renamed from: c, reason: collision with root package name */
    public static final long f23588c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f23589d;

    /* renamed from: a, reason: collision with root package name */
    public final long f23590a;

    /* compiled from: Duration.kt */
    public static final class a {
    }

    static {
        int i = d.f23591a;
        f23588c = e.b(4611686018427387903L);
        f23589d = e.b(-4611686018427387903L);
    }

    public static final long a(long j10, long j11) {
        long j12 = 1000000;
        long j13 = j11 / j12;
        long j14 = j10 + j13;
        if (-4611686018426L > j14 || j14 >= 4611686018427L) {
            return e.b(ha.h.T(j14));
        }
        return e.d((j14 * j12) + (j11 - (j13 * j12)));
    }

    public static final void c(StringBuilder sb2, int i, int i9, int i10, String str, boolean z10) {
        CharSequence charSequence;
        sb2.append(i);
        if (i9 != 0) {
            sb2.append('.');
            String valueOf = String.valueOf(i9);
            if (i10 < 0) {
                throw new IllegalArgumentException(s3.b.i("Desired length ", i10, " is less than zero."));
            }
            if (i10 <= valueOf.length()) {
                charSequence = valueOf.subSequence(0, valueOf.length());
            } else {
                StringBuilder sb3 = new StringBuilder(i10);
                int length = i10 - valueOf.length();
                int i11 = 1;
                if (1 <= length) {
                    while (true) {
                        sb3.append('0');
                        if (i11 == length) {
                            break;
                        } else {
                            i11++;
                        }
                    }
                }
                sb3.append((CharSequence) valueOf);
                charSequence = sb3;
            }
            String obj = charSequence.toString();
            int i12 = -1;
            int length2 = obj.length() - 1;
            if (length2 >= 0) {
                while (true) {
                    int i13 = length2 - 1;
                    if (obj.charAt(length2) != '0') {
                        i12 = length2;
                        break;
                    } else if (i13 < 0) {
                        break;
                    } else {
                        length2 = i13;
                    }
                }
            }
            int i14 = i12 + 1;
            if (z10 || i14 >= 3) {
                sb2.append((CharSequence) obj, 0, ((i12 + 3) / 3) * 3);
            } else {
                sb2.append((CharSequence) obj, 0, i14);
            }
        }
        sb2.append(str);
    }

    public static int d(long j10, long j11) {
        long j12 = j10 ^ j11;
        if (j12 >= 0 && (((int) j12) & 1) != 0) {
            int i = (((int) j10) & 1) - (((int) j11) & 1);
            return j(j10) ? -i : i;
        }
        if (j10 < j11) {
            return -1;
        }
        return j10 == j11 ? 0 : 1;
    }

    public static final long e(long j10) {
        return ((((int) j10) & 1) == 1 && (i(j10) ^ true)) ? j10 >> 1 : l(j10, DurationUnit.MILLISECONDS);
    }

    public static final int f(long j10) {
        if (i(j10)) {
            return 0;
        }
        return (int) (l(j10, DurationUnit.MINUTES) % 60);
    }

    public static final int g(long j10) {
        if (i(j10)) {
            return 0;
        }
        return (int) ((((int) j10) & 1) == 1 ? ((j10 >> 1) % 1000) * 1000000 : (j10 >> 1) % 1000000000);
    }

    public static final int h(long j10) {
        if (i(j10)) {
            return 0;
        }
        return (int) (l(j10, DurationUnit.SECONDS) % 60);
    }

    public static final boolean i(long j10) {
        return j10 == f23588c || j10 == f23589d;
    }

    public static final boolean j(long j10) {
        return j10 < 0;
    }

    public static final long k(long j10, long j11) {
        if (i(j10)) {
            if ((!i(j11)) || (j11 ^ j10) >= 0) {
                return j10;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (i(j11)) {
            return j11;
        }
        int i = ((int) j10) & 1;
        if (i != (((int) j11) & 1)) {
            return i == 1 ? a(j10 >> 1, j11 >> 1) : a(j11 >> 1, j10 >> 1);
        }
        long j12 = (j10 >> 1) + (j11 >> 1);
        return i == 0 ? (-4611686018426999999L > j12 || j12 >= 4611686018427000000L) ? e.b(j12 / 1000000) : e.d(j12) : e.c(j12);
    }

    public static final long l(long j10, DurationUnit durationUnit) {
        if (j10 == f23588c) {
            return Long.MAX_VALUE;
        }
        if (j10 == f23589d) {
            return Long.MIN_VALUE;
        }
        return durationUnit.f23215a.convert(j10 >> 1, ((((int) j10) & 1) == 0 ? DurationUnit.NANOSECONDS : DurationUnit.MILLISECONDS).f23215a);
    }

    public static String m(long j10) {
        if (j10 == 0) {
            return "0s";
        }
        if (j10 == f23588c) {
            return "Infinity";
        }
        if (j10 == f23589d) {
            return "-Infinity";
        }
        boolean j11 = j(j10);
        StringBuilder sb2 = new StringBuilder();
        if (j11) {
            sb2.append('-');
        }
        if (j(j10)) {
            j10 = n(j10);
        }
        long l10 = l(j10, DurationUnit.DAYS);
        int i = 0;
        int l11 = i(j10) ? 0 : (int) (l(j10, DurationUnit.HOURS) % 24);
        int f10 = f(j10);
        int h9 = h(j10);
        int g10 = g(j10);
        boolean z10 = l10 != 0;
        boolean z11 = l11 != 0;
        boolean z12 = f10 != 0;
        boolean z13 = (h9 == 0 && g10 == 0) ? false : true;
        if (z10) {
            sb2.append(l10);
            sb2.append('d');
            i = 1;
        }
        if (z11 || (z10 && (z12 || z13))) {
            int i9 = i + 1;
            if (i > 0) {
                sb2.append(' ');
            }
            sb2.append(l11);
            sb2.append('h');
            i = i9;
        }
        if (z12 || (z13 && (z11 || z10))) {
            int i10 = i + 1;
            if (i > 0) {
                sb2.append(' ');
            }
            sb2.append(f10);
            sb2.append('m');
            i = i10;
        }
        if (z13) {
            int i11 = i + 1;
            if (i > 0) {
                sb2.append(' ');
            }
            if (h9 != 0 || z10 || z11 || z12) {
                c(sb2, h9, g10, 9, "s", false);
            } else if (g10 >= 1000000) {
                c(sb2, g10 / 1000000, g10 % 1000000, 6, "ms", false);
            } else if (g10 >= 1000) {
                c(sb2, g10 / 1000, g10 % 1000, 3, "us", false);
            } else {
                sb2.append(g10);
                sb2.append("ns");
            }
            i = i11;
        }
        if (j11 && i > 1) {
            sb2.insert(1, '(').append(')');
        }
        return sb2.toString();
    }

    public static final long n(long j10) {
        long j11 = ((-(j10 >> 1)) << 1) + (((int) j10) & 1);
        int i = d.f23591a;
        return j11;
    }

    @Override // java.lang.Comparable
    public final int compareTo(c cVar) {
        return d(this.f23590a, cVar.f23590a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            return this.f23590a == ((c) obj).f23590a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f23590a);
    }

    public final String toString() {
        return m(this.f23590a);
    }
}
