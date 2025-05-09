package androidx.profileinstaller;

import java.io.File;

/* compiled from: BenchmarkOperation.java */
/* loaded from: classes.dex */
public final class a {
    public static boolean a(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return false;
        }
        boolean z10 = true;
        for (File file2 : listFiles) {
            z10 = a(file2) && z10;
        }
        return z10;
    }
}
