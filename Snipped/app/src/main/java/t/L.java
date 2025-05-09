package t;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.util.Size;
import android.view.Display;
import androidx.camera.core.impl.SurfaceConfig;
import androidx.camera.core.internal.utils.SizeUtil;
import com.google.firebase.messaging.Constants;
import java.util.Locale;

/* compiled from: DisplayInfoManager.java */
/* loaded from: classes.dex */
public final class L {

    /* renamed from: e, reason: collision with root package name */
    public static final Size f27131e = new Size(1920, 1080);

    /* renamed from: f, reason: collision with root package name */
    public static final Size f27132f = new Size(320, 240);

    /* renamed from: g, reason: collision with root package name */
    public static final Size f27133g = new Size(640, 480);

    /* renamed from: h, reason: collision with root package name */
    public static final Object f27134h = new Object();
    public static volatile L i;

    /* renamed from: a, reason: collision with root package name */
    public final DisplayManager f27135a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Size f27136b = null;

    /* renamed from: c, reason: collision with root package name */
    public final x.h f27137c = new x.h();

    /* renamed from: d, reason: collision with root package name */
    public final C.N f27138d = new C.N(28, (byte) 0);

    public L(Context context) {
        this.f27135a = (DisplayManager) context.getSystemService(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
    }

    public static L b(Context context) {
        if (i == null) {
            synchronized (f27134h) {
                try {
                    if (i == null) {
                        i = new L(context);
                    }
                } finally {
                }
            }
        }
        return i;
    }

    public static Display d(Display[] displayArr, boolean z10) {
        Display display = null;
        int i9 = -1;
        for (Display display2 : displayArr) {
            if (!z10 || display2.getState() != 1) {
                Point point = new Point();
                display2.getRealSize(point);
                int i10 = point.x * point.y;
                if (i10 > i9) {
                    display = display2;
                    i9 = i10;
                }
            }
        }
        return display;
    }

    public final Size a() {
        Size c2;
        Point point = new Point();
        c(false).getRealSize(point);
        Size size = new Size(point.x, point.y);
        if (SizeUtil.isSmallerByArea(size, f27132f)) {
            size = ((w.C) this.f27138d.f535b) != null ? (Size) w.C.f30768a.get(Build.MODEL.toUpperCase(Locale.US)) : null;
            if (size == null) {
                size = f27133g;
            }
        }
        if (size.getHeight() > size.getWidth()) {
            size = new Size(size.getHeight(), size.getWidth());
        }
        int height = size.getHeight() * size.getWidth();
        Size size2 = f27131e;
        if (height > size2.getHeight() * size2.getWidth()) {
            size = size2;
        }
        return (this.f27137c.f30886a == null || (c2 = w.m.c(SurfaceConfig.ConfigType.PRIV)) == null) ? size : c2.getHeight() * c2.getWidth() > size.getHeight() * size.getWidth() ? c2 : size;
    }

    public final Display c(boolean z10) {
        Display[] displays = this.f27135a.getDisplays();
        if (displays.length == 1) {
            return displays[0];
        }
        Display d10 = d(displays, z10);
        if (d10 == null && z10) {
            d10 = d(displays, false);
        }
        if (d10 != null) {
            return d10;
        }
        throw new IllegalArgumentException("No display can be found from the input display manager!");
    }

    public final Size e() {
        if (this.f27136b != null) {
            return this.f27136b;
        }
        this.f27136b = a();
        return this.f27136b;
    }
}
