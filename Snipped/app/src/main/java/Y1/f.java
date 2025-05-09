package y1;

import B1.p;
import android.os.Build;
import androidx.work.NetworkType;
import x1.C1581b;

/* compiled from: NetworkUnmeteredController.java */
/* loaded from: classes.dex */
public final class f extends AbstractC1610b<C1581b> {
    @Override // y1.AbstractC1610b
    public final boolean b(p pVar) {
        NetworkType networkType = pVar.f251j.f26497a;
        return networkType == NetworkType.f8094c || (Build.VERSION.SDK_INT >= 30 && networkType == NetworkType.f8097f);
    }

    @Override // y1.AbstractC1610b
    public final boolean c(C1581b c1581b) {
        C1581b c1581b2 = c1581b;
        return !c1581b2.f30908a || c1581b2.f30910c;
    }
}
