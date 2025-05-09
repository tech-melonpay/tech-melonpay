package C1;

import C.v;
import android.content.ComponentName;
import android.content.Context;
import s1.AbstractC1197g;

/* compiled from: PackageManagerHelper.java */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final String f614a = AbstractC1197g.e("PackageManagerHelper");

    public static void a(Context context, Class<?> cls, boolean z10) {
        String str = f614a;
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z10 ? 1 : 2, 1);
            AbstractC1197g.c().a(str, cls.getName() + " " + (z10 ? "enabled" : "disabled"), new Throwable[0]);
        } catch (Exception e10) {
            AbstractC1197g.c().a(str, v.p(cls.getName(), " could not be ", z10 ? "enabled" : "disabled"), e10);
        }
    }
}
