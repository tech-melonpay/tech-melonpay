package s1;

import android.net.Uri;
import java.util.HashSet;

/* compiled from: ContentUriTriggers.java */
/* renamed from: s1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1193c {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f26505a = new HashSet();

    /* compiled from: ContentUriTriggers.java */
    /* renamed from: s1.c$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f26506a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f26507b;

        public a(Uri uri, boolean z10) {
            this.f26506a = uri;
            this.f26507b = z10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f26507b == aVar.f26507b && this.f26506a.equals(aVar.f26506a);
        }

        public final int hashCode() {
            return (this.f26506a.hashCode() * 31) + (this.f26507b ? 1 : 0);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1193c.class != obj.getClass()) {
            return false;
        }
        return this.f26505a.equals(((C1193c) obj).f26505a);
    }

    public final int hashCode() {
        return this.f26505a.hashCode();
    }
}
