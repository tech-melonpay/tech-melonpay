package A;

import android.text.TextUtils;
import java.math.BigInteger;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: Version.java */
/* loaded from: classes.dex */
public abstract class d implements Comparable<d> {

    /* renamed from: a, reason: collision with root package name */
    public static final a f11a;

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f12b;

    static {
        new a(1, 0, 0, "");
        new a(1, 1, 0, "");
        new a(1, 2, 0, "");
        f11a = new a(1, 3, 0, "");
        new a(1, 4, 0, "");
        f12b = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:\\-(.+))?");
    }

    public static BigInteger a(d dVar) {
        return BigInteger.valueOf(dVar.d()).shiftLeft(32).or(BigInteger.valueOf(dVar.e())).shiftLeft(32).or(BigInteger.valueOf(dVar.f()));
    }

    public static a g(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Matcher matcher = f12b.matcher(str);
        if (matcher.matches()) {
            return new a(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)), Integer.parseInt(matcher.group(3)), matcher.group(4) != null ? matcher.group(4) : "");
        }
        return null;
    }

    public abstract String c();

    @Override // java.lang.Comparable
    public final int compareTo(d dVar) {
        return a(this).compareTo(a(dVar));
    }

    public abstract int d();

    public abstract int e();

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Integer.valueOf(d()).equals(Integer.valueOf(dVar.d())) && Integer.valueOf(e()).equals(Integer.valueOf(dVar.e())) && Integer.valueOf(f()).equals(Integer.valueOf(dVar.f()));
    }

    public abstract int f();

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(d()), Integer.valueOf(e()), Integer.valueOf(f()));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(d() + "." + e() + "." + f());
        if (!TextUtils.isEmpty(c())) {
            sb2.append("-" + c());
        }
        return sb2.toString();
    }
}
