package K4;

import com.luminary.business.domain.entity.account.FeeDomain;
import f4.h;

/* compiled from: FeeRawMapper.kt */
/* loaded from: classes.dex */
public final class c {
    public static final FeeDomain a(h.a aVar) {
        String f10 = aVar.f();
        String c2 = aVar.c();
        Double a10 = aVar.a();
        String h9 = aVar.h();
        String e10 = aVar.e();
        String d10 = aVar.d();
        String g10 = aVar.g();
        String b9 = aVar.b();
        return new FeeDomain(f10, c2, a10, h9, e10, d10, g10, b9 != null ? U4.b.E(b9) : null);
    }
}
