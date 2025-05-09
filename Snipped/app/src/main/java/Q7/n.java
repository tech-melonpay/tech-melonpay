package q7;

import O9.p;
import androidx.lifecycle.C0559z;
import com.luminary.business.domain.entity.cryptoaccount.CryptoAccountDomain;
import com.luminary.business.domain.entity.cryptowallet.CryptoExchangeDomain;
import d6.C0689c;
import e6.C0720d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: ExchangeListViewModel.kt */
/* loaded from: classes2.dex */
public final class n extends B6.i {

    /* renamed from: T0, reason: collision with root package name */
    public final K5.a f25918T0;

    /* renamed from: U0, reason: collision with root package name */
    public final C0689c f25919U0;

    /* renamed from: V0, reason: collision with root package name */
    public final C0720d f25920V0;

    /* renamed from: W0, reason: collision with root package name */
    public final e6.l f25921W0;

    /* renamed from: X0, reason: collision with root package name */
    public final e6.h f25922X0;

    /* renamed from: Y0, reason: collision with root package name */
    public final C0559z<List<CryptoAccountDomain>> f25923Y0 = new C0559z<>();

    /* renamed from: Z0, reason: collision with root package name */
    public final C0559z<List<CryptoExchangeDomain>> f25924Z0 = new C0559z<>();

    /* renamed from: a1, reason: collision with root package name */
    public final J8.d<p> f25925a1 = new J8.d<>();

    /* renamed from: b1, reason: collision with root package name */
    public final Map<String, v5.j> f25926b1 = P9.i.m(new HashMap(), new Z3.a(20));

    /* renamed from: c1, reason: collision with root package name */
    public int f25927c1 = 1;

    /* renamed from: d1, reason: collision with root package name */
    public final ArrayList<CryptoExchangeDomain> f25928d1 = new ArrayList<>();

    public n(K5.a aVar, C0689c c0689c, C0720d c0720d, e6.l lVar, e6.h hVar) {
        this.f25918T0 = aVar;
        this.f25919U0 = c0689c;
        this.f25920V0 = c0720d;
        this.f25921W0 = lVar;
        this.f25922X0 = hVar;
        j jVar = new j(this, 1);
        this.f419K0 = jVar;
        jVar.invoke();
        i0(null);
    }

    public final ArrayList h0() {
        List<CryptoExchangeDomain> value = this.f25924Z0.getValue();
        if (value == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : value) {
            if (((CryptoExchangeDomain) obj).f11008A == CryptoExchangeDomain.ExchangeStatus.i) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void i0(String str) {
        A7.c cVar = new A7.c(21, this, str);
        this.f420L0 = cVar;
        cVar.invoke();
    }
}
