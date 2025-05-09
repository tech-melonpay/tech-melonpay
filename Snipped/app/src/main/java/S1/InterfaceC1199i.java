package s1;

import android.annotation.SuppressLint;
import androidx.camera.core.n;

/* compiled from: Operation.java */
/* renamed from: s1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1199i {

    /* renamed from: a, reason: collision with root package name */
    @SuppressLint({"SyntheticAccessor"})
    public static final a.c f26514a = new a.c();

    /* renamed from: b, reason: collision with root package name */
    @SuppressLint({"SyntheticAccessor"})
    public static final a.b f26515b = new a.b();

    /* compiled from: Operation.java */
    /* renamed from: s1.i$a */
    public static abstract class a {

        /* compiled from: Operation.java */
        /* renamed from: s1.i$a$a, reason: collision with other inner class name */
        public static final class C0470a extends a {

            /* renamed from: a, reason: collision with root package name */
            public final Throwable f26516a;

            public C0470a(Throwable th) {
                this.f26516a = th;
            }

            public final String toString() {
                return n.a("FAILURE (", this.f26516a.getMessage(), ")");
            }
        }

        /* compiled from: Operation.java */
        /* renamed from: s1.i$a$b */
        public static final class b extends a {
            public final String toString() {
                return "IN_PROGRESS";
            }
        }

        /* compiled from: Operation.java */
        /* renamed from: s1.i$a$c */
        public static final class c extends a {
            public final String toString() {
                return "SUCCESS";
            }
        }
    }
}
