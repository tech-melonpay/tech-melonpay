package R9;

import java.util.Comparator;

/* compiled from: Comparisons.kt */
/* loaded from: classes2.dex */
public final class b implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public static final b f3317b = new b(0);

    /* renamed from: c, reason: collision with root package name */
    public static final b f3318c = new b(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3319a;

    public /* synthetic */ b(int i) {
        this.f3319a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f3319a) {
            case 0:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            default:
                return ((Comparable) obj2).compareTo((Comparable) obj);
        }
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        switch (this.f3319a) {
            case 0:
                return f3318c;
            default:
                return f3317b;
        }
    }
}
