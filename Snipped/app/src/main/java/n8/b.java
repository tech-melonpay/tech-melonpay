package N8;

import C.v;
import android.content.Context;
import android.content.pm.PackageManager;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: RootBeer.java */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2856a;

    public b(Context context) {
        this.f2856a = context;
    }

    public static boolean a(String str) {
        boolean z10 = false;
        for (String str2 : a.a()) {
            String n10 = v.n(str2, str);
            if (new File(str2, str).exists()) {
                Ja.a.R(n10 + " binary detected!");
                z10 = true;
            }
        }
        return z10;
    }

    public final boolean b(ArrayList arrayList) {
        PackageManager packageManager = this.f2856a.getPackageManager();
        Iterator it = arrayList.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                packageManager.getPackageInfo(str, 0);
                Ja.a.i(str + " ROOT management app detected!");
                z10 = true;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return z10;
    }
}
