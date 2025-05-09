package androidx.camera.core.processing;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import pa.C1124b;

/* loaded from: classes.dex */
public class TargetUtils {
    private TargetUtils() {
    }

    public static void checkSupportedTargets(Collection<Integer> collection, int i) {
        boolean contains = collection.contains(Integer.valueOf(i));
        Locale locale = Locale.US;
        C1124b.m(contains, s3.b.l("Effects target ", getHumanReadableName(i), " is not in the supported list ", getHumanReadableNames(collection), "."));
    }

    public static String getHumanReadableName(int i) {
        ArrayList arrayList = new ArrayList();
        if ((i & 4) != 0) {
            arrayList.add("IMAGE_CAPTURE");
        }
        if ((i & 1) != 0) {
            arrayList.add("PREVIEW");
        }
        if ((i & 2) != 0) {
            arrayList.add("VIDEO_CAPTURE");
        }
        return String.join("|", arrayList);
    }

    private static String getHumanReadableNames(Collection<Integer> collection) {
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(getHumanReadableName(it.next().intValue()));
        }
        return "[" + String.join(", ", arrayList) + "]";
    }

    public static int getNumberOfTargets(int i) {
        int i9 = 0;
        while (i != 0) {
            i9 += i & 1;
            i >>= 1;
        }
        return i9;
    }

    public static boolean isSuperset(int i, int i9) {
        return (i & i9) == i9;
    }
}
