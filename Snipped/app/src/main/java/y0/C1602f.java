package y0;

import android.view.DisplayCutout;
import java.util.Objects;

/* compiled from: DisplayCutoutCompat.java */
/* renamed from: y0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1602f {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayCutout f31072a;

    /* compiled from: DisplayCutoutCompat.java */
    /* renamed from: y0.f$a */
    public static class a {
        public static int a(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        public static int b(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        public static int c(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        public static int d(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }

    public C1602f(DisplayCutout displayCutout) {
        this.f31072a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1602f.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f31072a, ((C1602f) obj).f31072a);
    }

    public final int hashCode() {
        int hashCode;
        DisplayCutout displayCutout = this.f31072a;
        if (displayCutout == null) {
            return 0;
        }
        hashCode = displayCutout.hashCode();
        return hashCode;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f31072a + "}";
    }
}
