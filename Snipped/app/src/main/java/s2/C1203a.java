package s2;

import android.util.SparseArray;
import com.google.android.datatransport.Priority;
import java.util.HashMap;

/* compiled from: PriorityMapping.java */
/* renamed from: s2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1203a {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseArray<Priority> f26521a = new SparseArray<>();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap<Priority, Integer> f26522b;

    static {
        HashMap<Priority, Integer> hashMap = new HashMap<>();
        f26522b = hashMap;
        hashMap.put(Priority.f8901a, 0);
        hashMap.put(Priority.f8902b, 1);
        hashMap.put(Priority.f8903c, 2);
        for (Priority priority : hashMap.keySet()) {
            f26521a.append(f26522b.get(priority).intValue(), priority);
        }
    }

    public static int a(Priority priority) {
        Integer num = f26522b.get(priority);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + priority);
    }

    public static Priority b(int i) {
        Priority priority = f26521a.get(i);
        if (priority != null) {
            return priority;
        }
        throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.g(i, "Unknown Priority for value "));
    }
}
