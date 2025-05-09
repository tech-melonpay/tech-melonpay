package P9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: Collections.kt */
/* loaded from: classes2.dex */
public class m extends i {
    public static <T> ArrayList<T> n(T... tArr) {
        return tArr.length == 0 ? new ArrayList<>() : new ArrayList<>(new g(tArr, true));
    }

    public static EmptyList o() {
        return EmptyList.f23104a;
    }

    public static <T> int p(List<? extends T> list) {
        return list.size() - 1;
    }

    public static <T> List<T> q(T... tArr) {
        return tArr.length > 0 ? Arrays.asList(tArr) : EmptyList.f23104a;
    }

    public static ArrayList r(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new g(objArr, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> s(List<? extends T> list) {
        int size = list.size();
        return size != 0 ? size != 1 ? list : Collections.singletonList(list.get(0)) : EmptyList.f23104a;
    }

    public static void t() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
