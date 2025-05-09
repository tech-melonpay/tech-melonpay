package P9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: Iterables.kt */
/* loaded from: classes2.dex */
public class n extends m {
    public static <T> int u(Iterable<? extends T> iterable, int i) {
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }

    public static ArrayList v(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            q.x(arrayList, (Iterable) it.next());
        }
        return arrayList;
    }
}
