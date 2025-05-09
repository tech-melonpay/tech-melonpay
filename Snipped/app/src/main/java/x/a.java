package x;

import android.util.Range;
import androidx.camera.core.impl.Quirks;
import w.C1553a;

/* compiled from: AeFpsRange.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Range<Integer> f30879a;

    public a(Quirks quirks) {
        C1553a c1553a = (C1553a) quirks.get(C1553a.class);
        if (c1553a == null) {
            this.f30879a = null;
        } else {
            this.f30879a = c1553a.f30770a;
        }
    }
}
