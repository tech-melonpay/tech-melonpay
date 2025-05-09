package v;

import android.hardware.camera2.params.InputConfiguration;
import android.os.Build;
import java.util.Objects;

/* compiled from: InputConfigurationCompat.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final c f30491a;

    /* compiled from: InputConfigurationCompat.java */
    public static class a implements c {

        /* renamed from: a, reason: collision with root package name */
        public final InputConfiguration f30492a;

        public a(InputConfiguration inputConfiguration) {
            this.f30492a = inputConfiguration;
        }

        @Override // v.e.c
        public final InputConfiguration a() {
            return this.f30492a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            return Objects.equals(this.f30492a, ((c) obj).a());
        }

        public final int hashCode() {
            return this.f30492a.hashCode();
        }

        public final String toString() {
            return this.f30492a.toString();
        }
    }

    /* compiled from: InputConfigurationCompat.java */
    public static final class b extends a {
    }

    /* compiled from: InputConfigurationCompat.java */
    public interface c {
        InputConfiguration a();
    }

    public e(a aVar) {
        this.f30491a = aVar;
    }

    public static e a(InputConfiguration inputConfiguration) {
        if (inputConfiguration == null) {
            return null;
        }
        return Build.VERSION.SDK_INT >= 31 ? new e(new b(inputConfiguration)) : new e(new a(inputConfiguration));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        return this.f30491a.equals(((e) obj).f30491a);
    }

    public final int hashCode() {
        return this.f30491a.hashCode();
    }

    public final String toString() {
        return this.f30491a.toString();
    }
}
