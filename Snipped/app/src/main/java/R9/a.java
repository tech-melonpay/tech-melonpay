package R9;

/* compiled from: Comparisons.kt */
/* loaded from: classes2.dex */
public class a {
    public static <T extends Comparable<?>> int a(T t3, T t10) {
        if (t3 == t10) {
            return 0;
        }
        if (t3 == null) {
            return -1;
        }
        if (t10 == null) {
            return 1;
        }
        return t3.compareTo(t10);
    }
}
