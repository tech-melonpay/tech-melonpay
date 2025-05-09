package C;

import C.AbstractC0497m;
import java.io.File;

/* compiled from: FileOutputOptions.java */
/* renamed from: C.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0495k extends AbstractC0497m {

    /* renamed from: b, reason: collision with root package name */
    public final a f558b;

    /* compiled from: FileOutputOptions.java */
    /* renamed from: C.k$a */
    public static abstract class a extends AbstractC0497m.a {

        /* compiled from: FileOutputOptions.java */
        /* renamed from: C.k$a$a, reason: collision with other inner class name */
        public static abstract class AbstractC0004a extends AbstractC0497m.a.AbstractC0005a<AbstractC0004a> {
        }

        public abstract File d();
    }

    public C0495k(a aVar) {
        super(aVar);
        this.f558b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0495k)) {
            return false;
        }
        return this.f558b.equals(((C0495k) obj).f558b);
    }

    public final int hashCode() {
        return this.f558b.hashCode();
    }

    public final String toString() {
        return this.f558b.toString().replaceFirst("FileOutputOptionsInternal", "FileOutputOptions");
    }
}
