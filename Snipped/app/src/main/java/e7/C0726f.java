package e7;

import B6.i;
import O9.p;
import androidx.lifecycle.C0559z;
import b6.s;
import b6.t;
import com.luminary.business.domain.entity.cards.VaultDomain;
import java.util.ArrayList;
import java.util.List;
import ka.C0969n;
import kotlin.collections.EmptyList;

/* compiled from: CreateNewVirtualCardViewModel.kt */
/* renamed from: e7.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0726f extends i {

    /* renamed from: T0, reason: collision with root package name */
    public final K5.a f20550T0;

    /* renamed from: U0, reason: collision with root package name */
    public final s f20551U0;

    /* renamed from: V0, reason: collision with root package name */
    public final t f20552V0;

    /* renamed from: W0, reason: collision with root package name */
    public final C0559z<List<VaultDomain>> f20553W0 = new C0559z<>();

    /* renamed from: X0, reason: collision with root package name */
    public VaultDomain f20554X0;

    /* renamed from: Y0, reason: collision with root package name */
    public final C0559z<Boolean> f20555Y0;

    /* renamed from: Z0, reason: collision with root package name */
    public final C0559z f20556Z0;

    /* renamed from: a1, reason: collision with root package name */
    public String f20557a1;

    /* renamed from: b1, reason: collision with root package name */
    public List<h4.i> f20558b1;

    /* renamed from: c1, reason: collision with root package name */
    public final C0559z<h4.i> f20559c1;

    /* renamed from: d1, reason: collision with root package name */
    public final C0559z f20560d1;

    /* renamed from: e1, reason: collision with root package name */
    public final J8.d<p> f20561e1;

    public C0726f(K5.a aVar, s sVar, t tVar) {
        this.f20550T0 = aVar;
        this.f20551U0 = sVar;
        this.f20552V0 = tVar;
        C0559z<Boolean> c0559z = new C0559z<>(null);
        this.f20555Y0 = c0559z;
        this.f20556Z0 = c0559z;
        this.f20557a1 = "";
        this.f20558b1 = EmptyList.f23104a;
        C0559z<h4.i> c0559z2 = new C0559z<>(null);
        this.f20559c1 = c0559z2;
        this.f20560d1 = c0559z2;
        this.f20561e1 = new J8.d<>();
    }

    public final void h0() {
        this.f20555Y0.setValue(Boolean.valueOf((C0969n.i0(this.f20557a1) ^ true) && this.f20557a1.length() <= 20 && this.f20554X0 != null));
    }

    public final void m(int i) {
        List<h4.i> list = this.f20558b1;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((h4.i) obj).f21118a == i) {
                arrayList.add(obj);
            }
        }
        h4.i iVar = (h4.i) P9.s.L(arrayList);
        if (iVar != null) {
            this.f20559c1.postValue(iVar);
        }
    }
}
