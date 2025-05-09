package W6;

import androidx.lifecycle.C0559z;
import b6.C0594c;
import b6.C0600i;
import b6.C0601j;
import b6.u;
import com.luminary.business.domain.entity.account.CardsDomain;
import i6.C0823a;
import java.util.List;

/* compiled from: CardDetailsViewModel.kt */
/* loaded from: classes2.dex */
public final class m extends B6.i {

    /* renamed from: T0, reason: collision with root package name */
    public final K5.a f3856T0;

    /* renamed from: U0, reason: collision with root package name */
    public final b6.k f3857U0;

    /* renamed from: V0, reason: collision with root package name */
    public final C0600i f3858V0;

    /* renamed from: W0, reason: collision with root package name */
    public final u f3859W0;

    /* renamed from: X0, reason: collision with root package name */
    public final C0594c f3860X0;

    /* renamed from: Y0, reason: collision with root package name */
    public final C0823a f3861Y0;

    /* renamed from: Z0, reason: collision with root package name */
    public final C0601j f3862Z0;

    /* renamed from: a1, reason: collision with root package name */
    public final C0559z<List<CardsDomain>> f3863a1 = new C0559z<>();

    /* renamed from: b1, reason: collision with root package name */
    public final C0559z<CardsDomain> f3864b1 = new C0559z<>();

    /* renamed from: c1, reason: collision with root package name */
    public final C0559z<z5.c> f3865c1 = new C0559z<>();

    /* renamed from: d1, reason: collision with root package name */
    public final C0559z<CardsDomain> f3866d1 = new C0559z<>();

    public m(K5.a aVar, b6.k kVar, C0600i c0600i, u uVar, C0594c c0594c, C0823a c0823a, C0601j c0601j) {
        this.f3856T0 = aVar;
        this.f3857U0 = kVar;
        this.f3858V0 = c0600i;
        this.f3859W0 = uVar;
        this.f3860X0 = c0594c;
        this.f3861Y0 = c0823a;
        this.f3862Z0 = c0601j;
    }

    public final CardsDomain m(int i) {
        List<CardsDomain> value = this.f3863a1.getValue();
        if (value != null) {
            return value.get(i);
        }
        return null;
    }
}
