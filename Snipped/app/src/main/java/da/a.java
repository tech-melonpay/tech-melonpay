package Da;

import Ka.c;
import Ka.d;
import Ka.p;
import Ka.z;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Logger;

/* compiled from: FileSystem.kt */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f984a = new a();

    public final c a(File file) {
        try {
            Logger logger = p.f2319a;
            return new c(1, new FileOutputStream(file, true), new z());
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            Logger logger2 = p.f2319a;
            return new c(1, new FileOutputStream(file, true), new z());
        }
    }

    public final void b(File file) {
        if (file.delete() || !file.exists()) {
            return;
        }
        throw new IOException("failed to delete " + file);
    }

    public final void c(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            throw new IOException("not a readable directory: " + file);
        }
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                c(file2);
            }
            if (!file2.delete()) {
                throw new IOException("failed to delete " + file2);
            }
        }
    }

    public final boolean d(File file) {
        return file.exists();
    }

    public final void e(File file, File file2) {
        b(file2);
        if (file.renameTo(file2)) {
            return;
        }
        throw new IOException("failed to rename " + file + " to " + file2);
    }

    public final c f(File file) {
        try {
            return Ja.a.z(file);
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            return Ja.a.z(file);
        }
    }

    public final long g(File file) {
        return file.length();
    }

    public final d h(File file) {
        Logger logger = p.f2319a;
        return new d(1, new FileInputStream(file), z.f2346d);
    }

    public final String toString() {
        return "FileSystem.SYSTEM";
    }
}
