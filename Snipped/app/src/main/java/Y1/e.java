package y1;

import B1.p;
import androidx.work.NetworkType;
import s1.AbstractC1197g;
import x1.C1581b;

/* compiled from: NetworkNotRoamingController.java */
/* loaded from: classes.dex */
public final class e extends AbstractC1610b<C1581b> {
    static {
        AbstractC1197g.e("NetworkNotRoamingCtrlr");
    }

    @Override // y1.AbstractC1610b
    public final boolean b(p pVar) {
        return pVar.f251j.f26497a == NetworkType.f8095d;
    }

    @Override // y1.AbstractC1610b
    public final boolean c(C1581b c1581b) {
        C1581b c1581b2 = c1581b;
        return (c1581b2.f30908a && c1581b2.f30911d) ? false : true;
    }
}
