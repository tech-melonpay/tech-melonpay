package A7;

import B6.i;
import a6.C0515c;
import a6.g;
import androidx.lifecycle.C0559z;
import com.luminary.business.domain.entity.account.BankAccountDomain;
import com.luminary.business.domain.entity.account.FeeDomain;
import com.luminary.business.domain.entity.cryptoaccount.CryptoAccountDomain;
import com.luminary.business.domain.entity.cryptowallet.CryptoExchangeDomain;
import com.luminary.business.presentation.entity.transaction.TransactionUI;
import d6.C0689c;
import e6.C0720d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import o6.j;
import u5.f;

/* compiled from: HomeViewModel.kt */
/* loaded from: classes2.dex */
public final class e extends i {

    /* renamed from: T0, reason: collision with root package name */
    public final g f110T0;

    /* renamed from: U0, reason: collision with root package name */
    public final j f111U0;

    /* renamed from: V0, reason: collision with root package name */
    public final C0515c f112V0;

    /* renamed from: W0, reason: collision with root package name */
    public final K5.a f113W0;

    /* renamed from: X0, reason: collision with root package name */
    public final C0689c f114X0;

    /* renamed from: Y0, reason: collision with root package name */
    public final C0720d f115Y0;

    /* renamed from: Z0, reason: collision with root package name */
    public final a6.i f116Z0;

    /* renamed from: a1, reason: collision with root package name */
    public final C0559z<List<BankAccountDomain>> f117a1;

    /* renamed from: b1, reason: collision with root package name */
    public final C0559z<List<BankAccountDomain>> f118b1;

    /* renamed from: c1, reason: collision with root package name */
    public final C0559z<List<TransactionUI>> f119c1;

    /* renamed from: d1, reason: collision with root package name */
    public final ArrayList<TransactionUI> f120d1;

    /* renamed from: e1, reason: collision with root package name */
    public final ArrayList<CryptoExchangeDomain> f121e1;

    /* renamed from: f1, reason: collision with root package name */
    public final C0559z<List<CryptoAccountDomain>> f122f1;

    /* renamed from: g1, reason: collision with root package name */
    public final C0559z<List<CryptoExchangeDomain>> f123g1;

    /* renamed from: h1, reason: collision with root package name */
    public final C0559z<List<FeeDomain>> f124h1;

    /* renamed from: i1, reason: collision with root package name */
    public final C0559z<List<f>> f125i1;

    /* renamed from: j1, reason: collision with root package name */
    public int f126j1;

    /* renamed from: k1, reason: collision with root package name */
    public int f127k1;

    /* renamed from: l1, reason: collision with root package name */
    public boolean f128l1;

    public e(g gVar, j jVar, C0515c c0515c, K5.a aVar, C0689c c0689c, C0720d c0720d, a6.i iVar) {
        this.f110T0 = gVar;
        this.f111U0 = jVar;
        this.f112V0 = c0515c;
        this.f113W0 = aVar;
        this.f114X0 = c0689c;
        this.f115Y0 = c0720d;
        this.f116Z0 = iVar;
        C0559z<List<BankAccountDomain>> c0559z = new C0559z<>();
        this.f117a1 = c0559z;
        this.f118b1 = c0559z;
        this.f119c1 = new C0559z<>();
        this.f120d1 = new ArrayList<>();
        this.f121e1 = new ArrayList<>();
        this.f122f1 = new C0559z<>();
        this.f123g1 = new C0559z<>();
        this.f124h1 = new C0559z<>();
        new HashMap();
        C0559z<List<f>> c0559z2 = new C0559z<>();
        this.f125i1 = c0559z2;
        this.f126j1 = 1;
        this.f127k1 = 1;
        c0559z2.postValue(aVar.f());
    }
}
