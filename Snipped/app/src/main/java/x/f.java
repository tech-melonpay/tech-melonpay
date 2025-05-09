package x;

import androidx.camera.core.Logger;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.Quirks;
import java.util.Iterator;
import java.util.List;
import w.C1561i;
import w.E;
import w.z;

/* compiled from: ForceCloseDeferrableSurface.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f30883a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f30884b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f30885c;

    public f(Quirks quirks, Quirks quirks2) {
        this.f30883a = quirks2.contains(E.class);
        this.f30884b = quirks.contains(z.class);
        this.f30885c = quirks.contains(C1561i.class);
    }

    public final void a(List<DeferrableSurface> list) {
        if ((this.f30883a || this.f30884b || this.f30885c) && list != null) {
            Iterator<DeferrableSurface> it = list.iterator();
            while (it.hasNext()) {
                it.next().close();
            }
            Logger.d("ForceCloseDeferrableSurface", "deferrableSurface closed");
        }
    }
}
