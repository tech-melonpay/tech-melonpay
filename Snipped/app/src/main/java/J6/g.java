package J6;

import B6.i;
import I5.k;
import O9.p;
import android.util.Base64;
import androidx.lifecycle.C0559z;
import com.luminary.business.data.TokenManager;
import com.luminary.business.presentation.entity.register.RegisterSuccessUI;
import f6.C0746a;
import ka.C0956a;
import kotlin.Pair;
import m6.C1041i;
import m6.C1042j;
import m6.y;
import s5.n;

/* compiled from: LoginViewModel.kt */
/* loaded from: classes2.dex */
public final class g extends i {

    /* renamed from: T0, reason: collision with root package name */
    public final C1042j f2181T0;

    /* renamed from: U0, reason: collision with root package name */
    public final C1041i f2182U0;

    /* renamed from: V0, reason: collision with root package name */
    public final C0746a f2183V0;

    /* renamed from: W0, reason: collision with root package name */
    public final K5.a f2184W0;

    /* renamed from: X0, reason: collision with root package name */
    public final y f2185X0;

    /* renamed from: Y0, reason: collision with root package name */
    public final TokenManager f2186Y0;

    /* renamed from: Z0, reason: collision with root package name */
    public final C0559z<RegisterSuccessUI> f2187Z0;

    /* renamed from: a1, reason: collision with root package name */
    public final C0559z<Pair<k, Integer>> f2188a1;

    /* renamed from: b1, reason: collision with root package name */
    public final C0559z<n> f2189b1;

    /* renamed from: c1, reason: collision with root package name */
    public final J8.d<p> f2190c1;

    public g(C1042j c1042j, C1041i c1041i, C0746a c0746a, K5.a aVar, y yVar, TokenManager tokenManager) {
        this.f2181T0 = c1042j;
        this.f2182U0 = c1041i;
        this.f2183V0 = c0746a;
        this.f2184W0 = aVar;
        this.f2185X0 = yVar;
        this.f2186Y0 = tokenManager;
        new J8.d();
        this.f2187Z0 = new C0559z<>();
        new C0559z();
        this.f2188a1 = new C0559z<>();
        this.f2189b1 = new C0559z<>();
        this.f2190c1 = new J8.d<>();
        aVar.p();
    }

    public final void h0() {
        l();
        p pVar = p.f3034a;
        this.f2182U0.a(new f(this, 3), pVar);
    }

    public final void i0() {
        this.f2183V0.a(new f(this, 2), "");
    }

    public final void j0(String str, String str2) {
        l();
        K5.a aVar = this.f2184W0;
        aVar.V("default");
        aVar.q(Base64.encodeToString((str + com.sumsub.sns.internal.core.data.model.p.f15541a + str2).getBytes(C0956a.f23054b), 0));
        this.f2181T0.a(new f(this, str, str2), aVar.D());
    }
}
