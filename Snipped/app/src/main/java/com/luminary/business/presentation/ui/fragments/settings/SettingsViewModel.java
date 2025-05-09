package com.luminary.business.presentation.ui.fragments.settings;

import B6.i;
import I5.k;
import J8.d;
import K5.a;
import O9.p;
import P9.m;
import android.app.Application;
import android.content.Context;
import androidx.lifecycle.C0559z;
import com.luminary.business.domain.entity.company.CorporateDetailsDomain;
import com.luminary.mobile.R;
import java.util.Iterator;
import java.util.List;
import m6.C1029A;
import m6.C1035c;
import m6.C1036d;
import m6.C1040h;
import m8.j;
import u5.f;
import v6.C1546a;

/* compiled from: SettingsViewModel.kt */
/* loaded from: classes2.dex */
public final class SettingsViewModel extends i {

    /* renamed from: T0, reason: collision with root package name */
    public final a f12999T0;

    /* renamed from: U0, reason: collision with root package name */
    public final C1040h f13000U0;

    /* renamed from: V0, reason: collision with root package name */
    public final c6.i f13001V0;

    /* renamed from: W0, reason: collision with root package name */
    public final C1029A f13002W0;

    /* renamed from: X0, reason: collision with root package name */
    public final a f13003X0;

    /* renamed from: Y0, reason: collision with root package name */
    public final C1036d f13004Y0;

    /* renamed from: Z0, reason: collision with root package name */
    public final C1035c f13005Z0;

    /* renamed from: a1, reason: collision with root package name */
    public final C0559z<k> f13006a1 = new C0559z<>();

    /* renamed from: b1, reason: collision with root package name */
    public final C0559z<CorporateDetailsDomain> f13007b1 = new C0559z<>();

    /* renamed from: c1, reason: collision with root package name */
    public final C0559z<CorporateDetailsDomain> f13008c1 = new C0559z<>();

    /* renamed from: d1, reason: collision with root package name */
    public final d<p> f13009d1 = new d<>();

    /* renamed from: e1, reason: collision with root package name */
    public final C0559z<List<f>> f13010e1;

    /* renamed from: f1, reason: collision with root package name */
    public final d<p> f13011f1;

    /* renamed from: g1, reason: collision with root package name */
    public final O9.f f13012g1;

    /* renamed from: h1, reason: collision with root package name */
    public BioStatus f13013h1;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SettingsViewModel.kt */
    public static final class BioStatus {

        /* renamed from: a, reason: collision with root package name */
        public static final BioStatus f13014a;

        /* renamed from: b, reason: collision with root package name */
        public static final BioStatus f13015b;

        /* renamed from: c, reason: collision with root package name */
        public static final BioStatus f13016c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ BioStatus[] f13017d;

        static {
            BioStatus bioStatus = new BioStatus("UNAVAILABLE", 0);
            f13014a = bioStatus;
            BioStatus bioStatus2 = new BioStatus("SUCCESS", 1);
            f13015b = bioStatus2;
            BioStatus bioStatus3 = new BioStatus("NONE_ENROLLED", 2);
            f13016c = bioStatus3;
            f13017d = new BioStatus[]{bioStatus, bioStatus2, bioStatus3};
        }

        public BioStatus() {
            throw null;
        }

        public static BioStatus valueOf(String str) {
            return (BioStatus) Enum.valueOf(BioStatus.class, str);
        }

        public static BioStatus[] values() {
            return (BioStatus[]) f13017d.clone();
        }
    }

    public SettingsViewModel(a aVar, C1040h c1040h, c6.i iVar, C1029A c1029a, a aVar2, C1036d c1036d, C1035c c1035c) {
        this.f12999T0 = aVar;
        this.f13000U0 = c1040h;
        this.f13001V0 = iVar;
        this.f13002W0 = c1029a;
        this.f13003X0 = aVar2;
        this.f13004Y0 = c1036d;
        this.f13005Z0 = c1035c;
        new C0559z();
        this.f13010e1 = new C0559z<>();
        this.f13011f1 = new d<>();
        this.f13012g1 = org.koin.java.a.a(Application.class);
        this.f13013h1 = BioStatus.f13014a;
    }

    public final Context h0() {
        return (Context) this.f13012g1.getValue();
    }

    public final String i0(String str) {
        Object obj;
        List<f> value = this.f13010e1.getValue();
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
            if (kotlin.jvm.internal.f.b(((f) obj).f30276c, str)) {
                break;
            }
        }
        f fVar = (f) obj;
        if (fVar != null) {
            return fVar.f30277d;
        }
        return null;
    }

    public final List<C1546a> j0() {
        String str;
        CorporateDetailsDomain.a aVar;
        CorporateDetailsDomain value = this.f13007b1.getValue();
        if (value == null || (aVar = value.f10804a) == null || (str = aVar.f10937z) == null) {
            str = "";
        }
        return m.q(new C1546a(str, "Select company"), new C1546a(h0().getString(R.string.password), "Change password"), new C1546a(h0().getString(R.string.passcode), "Change app passcode"), new C1546a(h0().getString(R.string.support), "Contact your personal manager"), new C1546a(h0().getString(R.string.face_id), "Biometry on or off", true, Boolean.valueOf(this.f12999T0.M()), this.f13013h1 == BioStatus.f13015b), new C1546a(h0().getString(R.string.about_us_and_legal), "Terms & Conditions and Privacy Policy"), new C1546a(h0().getString(R.string.deactivate_account), h0().getString(R.string.permanently_deactivate_account)));
    }

    public final void k0() {
        j jVar = new j(2, this);
        this.f419K0 = jVar;
        jVar.invoke();
    }
}
