package b7;

import B6.i;
import O9.p;
import androidx.lifecycle.C0559z;
import com.luminary.business.domain.entity.company.CorporateDetailsDomain;
import java.util.List;
import n6.C1072b;

/* compiled from: CompaniesListViewModel.kt */
/* renamed from: b7.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0606e extends i {

    /* renamed from: T0, reason: collision with root package name */
    public final c6.i f8375T0;

    /* renamed from: U0, reason: collision with root package name */
    public final K5.a f8376U0;

    /* renamed from: V0, reason: collision with root package name */
    public final C1072b f8377V0;

    /* renamed from: W0, reason: collision with root package name */
    public final C0559z<List<CorporateDetailsDomain>> f8378W0;

    /* renamed from: X0, reason: collision with root package name */
    public final C0559z<List<CorporateDetailsDomain>> f8379X0;

    /* renamed from: Y0, reason: collision with root package name */
    public final J8.d<p> f8380Y0;

    /* renamed from: Z0, reason: collision with root package name */
    public final J8.d<p> f8381Z0;

    /* renamed from: a1, reason: collision with root package name */
    public final J8.d<p> f8382a1;

    /* renamed from: b1, reason: collision with root package name */
    public final J8.d<p> f8383b1;

    /* renamed from: c1, reason: collision with root package name */
    public final C0559z<Integer> f8384c1;

    /* renamed from: d1, reason: collision with root package name */
    public final C0559z<CorporateDetailsDomain> f8385d1;

    /* renamed from: e1, reason: collision with root package name */
    public final C0559z<CorporateDetailsDomain> f8386e1;

    public C0606e(c6.i iVar, K5.a aVar, C1072b c1072b) {
        this.f8375T0 = iVar;
        this.f8376U0 = aVar;
        this.f8377V0 = c1072b;
        C0559z<List<CorporateDetailsDomain>> c0559z = new C0559z<>();
        this.f8378W0 = c0559z;
        this.f8379X0 = c0559z;
        J8.d<p> dVar = new J8.d<>();
        this.f8380Y0 = dVar;
        this.f8381Z0 = dVar;
        this.f8382a1 = new J8.d<>();
        this.f8383b1 = new J8.d<>();
        this.f8384c1 = new C0559z<>();
        this.f8385d1 = new C0559z<>();
        this.f8386e1 = new C0559z<>();
    }

    public final void m(boolean z10) {
        if (z10 && this.f8376U0.h() != 0) {
            this.f8380Y0.setValue(null);
            return;
        }
        A8.b bVar = new A8.b(this, 19);
        this.f418J0 = bVar;
        bVar.invoke();
    }
}
