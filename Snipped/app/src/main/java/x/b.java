package x;

import androidx.camera.core.impl.Quirks;
import w.C1556d;
import w.r;

/* compiled from: AutoFlashAEModeDisabler.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f30880a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f30881b;

    public b(Quirks quirks, int i) {
        switch (i) {
            case 1:
                this.f30881b = false;
                this.f30880a = quirks.get(C1556d.class) != null;
                break;
            default:
                this.f30880a = quirks.contains(r.class);
                this.f30881b = w.k.f30775a.get(w.j.class) != null;
                break;
        }
    }
}
