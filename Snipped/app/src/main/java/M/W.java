package m;

import android.content.Context;
import android.content.ContextWrapper;

/* compiled from: TintContextWrapper.java */
/* loaded from: classes.dex */
public final class W extends ContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f23722a = null;

    public static void a(Context context) {
        if ((context instanceof W) || (context.getResources() instanceof Y)) {
            return;
        }
        context.getResources();
        int i = d0.f23752a;
    }
}
