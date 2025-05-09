package b8;

import B6.i;
import O9.p;
import android.app.Application;
import androidx.lifecycle.C0559z;
import com.luminary.business.domain.entity.account.BankAccountDomain;
import com.luminary.business.domain.entity.payments.PaymentDomain;
import java.util.Iterator;
import java.util.List;
import k6.C0947a;
import o6.k;
import p6.C1109b;

/* compiled from: NewPaymentViewModel.kt */
/* loaded from: classes2.dex */
public final class h extends i {

    /* renamed from: T0, reason: collision with root package name */
    public final K5.a f8456T0;

    /* renamed from: U0, reason: collision with root package name */
    public final a6.g f8457U0;

    /* renamed from: V0, reason: collision with root package name */
    public final k6.e f8458V0;

    /* renamed from: W0, reason: collision with root package name */
    public final k6.f f8459W0;

    /* renamed from: X0, reason: collision with root package name */
    public final k6.d f8460X0;

    /* renamed from: Y0, reason: collision with root package name */
    public final k6.g f8461Y0;

    /* renamed from: Z0, reason: collision with root package name */
    public final k6.h f8462Z0;

    /* renamed from: a1, reason: collision with root package name */
    public final a6.h f8463a1;

    /* renamed from: b1, reason: collision with root package name */
    public final C0947a f8464b1;

    /* renamed from: c1, reason: collision with root package name */
    public final k6.b f8465c1;

    /* renamed from: d1, reason: collision with root package name */
    public final k f8466d1;

    /* renamed from: e1, reason: collision with root package name */
    public final C1109b f8467e1;

    /* renamed from: f1, reason: collision with root package name */
    public final C0559z<List<BankAccountDomain>> f8468f1;

    /* renamed from: g1, reason: collision with root package name */
    public final C0559z<List<BankAccountDomain>> f8469g1;

    /* renamed from: h1, reason: collision with root package name */
    public final C0559z<List<BankAccountDomain>> f8470h1;

    /* renamed from: i1, reason: collision with root package name */
    public final J8.d<p> f8471i1;

    /* renamed from: j1, reason: collision with root package name */
    public final C0559z<s5.e> f8472j1;

    /* renamed from: k1, reason: collision with root package name */
    public final C0559z<String> f8473k1;

    /* renamed from: l1, reason: collision with root package name */
    public final C0559z<B5.h> f8474l1;

    /* renamed from: m1, reason: collision with root package name */
    public final C0559z<B5.c> f8475m1;
    public final C0559z<B5.a> n1;

    /* renamed from: o1, reason: collision with root package name */
    public final C0559z<PaymentDomain> f8476o1;

    /* renamed from: p1, reason: collision with root package name */
    public final C0559z<String> f8477p1;

    /* renamed from: q1, reason: collision with root package name */
    public final C0559z<List<u5.f>> f8478q1;

    /* renamed from: r1, reason: collision with root package name */
    public final C0559z<String> f8479r1;

    /* renamed from: s1, reason: collision with root package name */
    public final J8.d<p> f8480s1;

    /* renamed from: t1, reason: collision with root package name */
    public final O9.f f8481t1;

    /* renamed from: u1, reason: collision with root package name */
    public f f8482u1;

    /* renamed from: v1, reason: collision with root package name */
    public E6.c f8483v1;

    /* renamed from: w1, reason: collision with root package name */
    public E6.c f8484w1;

    public h(K5.a aVar, a6.g gVar, k6.e eVar, k6.f fVar, k6.d dVar, k6.g gVar2, k6.h hVar, a6.h hVar2, C0947a c0947a, k6.b bVar, k kVar, C1109b c1109b) {
        this.f8456T0 = aVar;
        this.f8457U0 = gVar;
        this.f8458V0 = eVar;
        this.f8459W0 = fVar;
        this.f8460X0 = dVar;
        this.f8461Y0 = gVar2;
        this.f8462Z0 = hVar;
        this.f8463a1 = hVar2;
        this.f8464b1 = c0947a;
        this.f8465c1 = bVar;
        this.f8466d1 = kVar;
        this.f8467e1 = c1109b;
        C0559z<List<BankAccountDomain>> c0559z = new C0559z<>();
        this.f8468f1 = c0559z;
        this.f8469g1 = new C0559z<>();
        this.f8470h1 = c0559z;
        this.f8471i1 = new J8.d<>();
        this.f8472j1 = new C0559z<>();
        this.f8473k1 = new C0559z<>();
        this.f8474l1 = new C0559z<>();
        this.f8475m1 = new C0559z<>();
        this.n1 = new C0559z<>();
        this.f8476o1 = new C0559z<>();
        this.f8477p1 = new C0559z<>();
        this.f8478q1 = new C0559z<>();
        new C0559z();
        this.f8479r1 = new C0559z<>();
        this.f8480s1 = new J8.d<>();
        this.f8481t1 = org.koin.java.a.a(Application.class);
    }

    public final String m(String str) {
        Object obj;
        List<u5.f> value = this.f8478q1.getValue();
        if (value == null) {
            return null;
        }
        Iterator<T> it = value.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.f.b(((u5.f) obj).f30276c, str)) {
                break;
            }
        }
        u5.f fVar = (u5.f) obj;
        if (fVar != null) {
            return fVar.f30277d;
        }
        return null;
    }

    public final void n(int i) {
        C0559z<List<BankAccountDomain>> c0559z = this.f8468f1;
        List<BankAccountDomain> value = c0559z.getValue();
        if (value != null && !value.isEmpty()) {
            c0559z.postValue(c0559z.getValue());
            return;
        }
        Z6.e eVar = new Z6.e(this, i, 3);
        this.f422O0 = eVar;
        eVar.invoke();
    }

    public final void o(String str, String str2, String str3, PaymentDomain paymentDomain) {
        E6.c cVar = new E6.c(this, str3, str, str2, paymentDomain, 4);
        this.f8483v1 = cVar;
        cVar.invoke();
    }
}
