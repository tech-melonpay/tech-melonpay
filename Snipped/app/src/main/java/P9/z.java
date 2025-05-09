package P9;

import java.util.Collections;
import java.util.Map;
import kotlin.Pair;

/* compiled from: MapsJVM.kt */
/* loaded from: classes2.dex */
public class z extends i {
    public static int n(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static <K, V> Map<K, V> o(Pair<? extends K, ? extends V> pair) {
        return Collections.singletonMap(pair.f23089a, pair.f23090b);
    }
}
