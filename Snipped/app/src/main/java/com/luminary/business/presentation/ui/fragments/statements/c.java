package com.luminary.business.presentation.ui.fragments.statements;

import B6.i;
import O9.p;
import P9.z;
import a6.g;
import androidx.lifecycle.C0559z;
import b6.k;
import b6.s;
import ca.InterfaceC0635a;
import com.luminary.business.domain.entity.account.BankAccountDomain;
import com.luminary.business.domain.entity.account.CardsDomain;
import com.luminary.business.domain.entity.cards.VaultDomain;
import com.luminary.business.domain.entity.cryptoaccount.CryptoAccountDomain;
import com.luminary.business.presentation.ui.fragments.statements.StatementsSelectorDialog;
import com.luminary.business.presentation.ui.fragments.statements.domain.StatementsType;
import d6.C0689c;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.EmptyList;
import o6.h;

/* compiled from: StatementsViewModel.kt */
/* loaded from: classes2.dex */
public final class c extends i {

    /* renamed from: T0, reason: collision with root package name */
    public final g f13067T0;

    /* renamed from: U0, reason: collision with root package name */
    public final o6.g f13068U0;

    /* renamed from: V0, reason: collision with root package name */
    public final K5.a f13069V0;

    /* renamed from: W0, reason: collision with root package name */
    public final C0689c f13070W0;

    /* renamed from: X0, reason: collision with root package name */
    public final o6.c f13071X0;

    /* renamed from: Y0, reason: collision with root package name */
    public final s f13072Y0;

    /* renamed from: Z0, reason: collision with root package name */
    public final k f13073Z0;

    /* renamed from: a1, reason: collision with root package name */
    public final o6.b f13074a1;

    /* renamed from: b1, reason: collision with root package name */
    public final h f13075b1;

    /* renamed from: c1, reason: collision with root package name */
    public List<BankAccountDomain> f13076c1;

    /* renamed from: d1, reason: collision with root package name */
    public List<StatementsSelectorDialog.a> f13077d1;

    /* renamed from: e1, reason: collision with root package name */
    public final C0559z<String> f13078e1;

    /* renamed from: f1, reason: collision with root package name */
    public List<CryptoAccountDomain> f13079f1;

    /* renamed from: g1, reason: collision with root package name */
    public List<StatementsSelectorDialog.a> f13080g1;

    /* renamed from: h1, reason: collision with root package name */
    public List<StatementsSelectorDialog.a> f13081h1;

    /* renamed from: i1, reason: collision with root package name */
    public List<VaultDomain> f13082i1;

    /* renamed from: j1, reason: collision with root package name */
    public List<CardsDomain> f13083j1;

    /* renamed from: k1, reason: collision with root package name */
    public List<StatementsSelectorDialog.a> f13084k1;

    /* renamed from: l1, reason: collision with root package name */
    public final LinkedHashMap f13085l1;

    public c(g gVar, o6.g gVar2, K5.a aVar, C0689c c0689c, o6.c cVar, s sVar, k kVar, o6.b bVar, h hVar) {
        this.f13067T0 = gVar;
        this.f13068U0 = gVar2;
        this.f13069V0 = aVar;
        this.f13070W0 = c0689c;
        this.f13071X0 = cVar;
        this.f13072Y0 = sVar;
        this.f13073Z0 = kVar;
        this.f13074a1 = bVar;
        this.f13075b1 = hVar;
        EmptyList emptyList = EmptyList.f23104a;
        this.f13077d1 = emptyList;
        this.f13078e1 = new C0559z<>();
        this.f13080g1 = emptyList;
        this.f13081h1 = emptyList;
        this.f13084k1 = emptyList;
        StatementsType statementsType = StatementsType.f13086b;
        Pair pair = new Pair(statementsType, new o8.a(statementsType));
        StatementsType statementsType2 = StatementsType.f13087c;
        Pair pair2 = new Pair(statementsType2, new o8.a(statementsType2));
        StatementsType statementsType3 = StatementsType.f13088d;
        Pair[] pairArr = {pair, pair2, new Pair(statementsType3, new o8.a(statementsType3))};
        LinkedHashMap linkedHashMap = new LinkedHashMap(z.n(3));
        kotlin.collections.a.u(linkedHashMap, pairArr);
        this.f13085l1 = linkedHashMap;
        final int i = 0;
        InterfaceC0635a<p> interfaceC0635a = new InterfaceC0635a(this) { // from class: n8.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.luminary.business.presentation.ui.fragments.statements.c f24308b;

            {
                this.f24308b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                Integer num;
                switch (i) {
                    case 0:
                        com.luminary.business.presentation.ui.fragments.statements.c cVar2 = this.f24308b;
                        u5.d u6 = cVar2.f13069V0.u();
                        if (u6 != null && (num = u6.f30237a) != null) {
                            cVar2.f13067T0.a(new i(cVar2, 4), String.valueOf(num.intValue()));
                        }
                        break;
                    case 1:
                        com.luminary.business.presentation.ui.fragments.statements.c cVar3 = this.f24308b;
                        cVar3.l();
                        cVar3.f13070W0.a(new i(cVar3, 6), Integer.valueOf(cVar3.f13069V0.h()));
                        break;
                    case 2:
                        com.luminary.business.presentation.ui.fragments.statements.c cVar4 = this.f24308b;
                        int h9 = cVar4.f13069V0.h();
                        cVar4.l();
                        cVar4.f13073Z0.a(new i(cVar4, 3), new Triple(String.valueOf(h9), null, null));
                        break;
                    default:
                        com.luminary.business.presentation.ui.fragments.statements.c cVar5 = this.f24308b;
                        int h10 = cVar5.f13069V0.h();
                        cVar5.l();
                        cVar5.f13072Y0.a(new i(cVar5, 5), String.valueOf(h10));
                        break;
                }
                return p.f3034a;
            }
        };
        this.f418J0 = interfaceC0635a;
        interfaceC0635a.invoke();
        final int i9 = 1;
        InterfaceC0635a<p> interfaceC0635a2 = new InterfaceC0635a(this) { // from class: n8.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.luminary.business.presentation.ui.fragments.statements.c f24308b;

            {
                this.f24308b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                Integer num;
                switch (i9) {
                    case 0:
                        com.luminary.business.presentation.ui.fragments.statements.c cVar2 = this.f24308b;
                        u5.d u6 = cVar2.f13069V0.u();
                        if (u6 != null && (num = u6.f30237a) != null) {
                            cVar2.f13067T0.a(new i(cVar2, 4), String.valueOf(num.intValue()));
                        }
                        break;
                    case 1:
                        com.luminary.business.presentation.ui.fragments.statements.c cVar3 = this.f24308b;
                        cVar3.l();
                        cVar3.f13070W0.a(new i(cVar3, 6), Integer.valueOf(cVar3.f13069V0.h()));
                        break;
                    case 2:
                        com.luminary.business.presentation.ui.fragments.statements.c cVar4 = this.f24308b;
                        int h9 = cVar4.f13069V0.h();
                        cVar4.l();
                        cVar4.f13073Z0.a(new i(cVar4, 3), new Triple(String.valueOf(h9), null, null));
                        break;
                    default:
                        com.luminary.business.presentation.ui.fragments.statements.c cVar5 = this.f24308b;
                        int h10 = cVar5.f13069V0.h();
                        cVar5.l();
                        cVar5.f13072Y0.a(new i(cVar5, 5), String.valueOf(h10));
                        break;
                }
                return p.f3034a;
            }
        };
        this.f420L0 = interfaceC0635a2;
        interfaceC0635a2.invoke();
        final int i10 = 3;
        InterfaceC0635a<p> interfaceC0635a3 = new InterfaceC0635a(this) { // from class: n8.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.luminary.business.presentation.ui.fragments.statements.c f24308b;

            {
                this.f24308b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                Integer num;
                switch (i10) {
                    case 0:
                        com.luminary.business.presentation.ui.fragments.statements.c cVar2 = this.f24308b;
                        u5.d u6 = cVar2.f13069V0.u();
                        if (u6 != null && (num = u6.f30237a) != null) {
                            cVar2.f13067T0.a(new i(cVar2, 4), String.valueOf(num.intValue()));
                        }
                        break;
                    case 1:
                        com.luminary.business.presentation.ui.fragments.statements.c cVar3 = this.f24308b;
                        cVar3.l();
                        cVar3.f13070W0.a(new i(cVar3, 6), Integer.valueOf(cVar3.f13069V0.h()));
                        break;
                    case 2:
                        com.luminary.business.presentation.ui.fragments.statements.c cVar4 = this.f24308b;
                        int h9 = cVar4.f13069V0.h();
                        cVar4.l();
                        cVar4.f13073Z0.a(new i(cVar4, 3), new Triple(String.valueOf(h9), null, null));
                        break;
                    default:
                        com.luminary.business.presentation.ui.fragments.statements.c cVar5 = this.f24308b;
                        int h10 = cVar5.f13069V0.h();
                        cVar5.l();
                        cVar5.f13072Y0.a(new i(cVar5, 5), String.valueOf(h10));
                        break;
                }
                return p.f3034a;
            }
        };
        this.N0 = interfaceC0635a3;
        interfaceC0635a3.invoke();
        final int i11 = 2;
        InterfaceC0635a<p> interfaceC0635a4 = new InterfaceC0635a(this) { // from class: n8.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.luminary.business.presentation.ui.fragments.statements.c f24308b;

            {
                this.f24308b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                Integer num;
                switch (i11) {
                    case 0:
                        com.luminary.business.presentation.ui.fragments.statements.c cVar2 = this.f24308b;
                        u5.d u6 = cVar2.f13069V0.u();
                        if (u6 != null && (num = u6.f30237a) != null) {
                            cVar2.f13067T0.a(new i(cVar2, 4), String.valueOf(num.intValue()));
                        }
                        break;
                    case 1:
                        com.luminary.business.presentation.ui.fragments.statements.c cVar3 = this.f24308b;
                        cVar3.l();
                        cVar3.f13070W0.a(new i(cVar3, 6), Integer.valueOf(cVar3.f13069V0.h()));
                        break;
                    case 2:
                        com.luminary.business.presentation.ui.fragments.statements.c cVar4 = this.f24308b;
                        int h9 = cVar4.f13069V0.h();
                        cVar4.l();
                        cVar4.f13073Z0.a(new i(cVar4, 3), new Triple(String.valueOf(h9), null, null));
                        break;
                    default:
                        com.luminary.business.presentation.ui.fragments.statements.c cVar5 = this.f24308b;
                        int h10 = cVar5.f13069V0.h();
                        cVar5.l();
                        cVar5.f13072Y0.a(new i(cVar5, 5), String.valueOf(h10));
                        break;
                }
                return p.f3034a;
            }
        };
        this.f422O0 = interfaceC0635a4;
        interfaceC0635a4.invoke();
    }

    public static String n(String str) {
        return "statement_" + Calendar.getInstance().getTimeInMillis() + "." + str.toLowerCase(Locale.ROOT);
    }

    public final o8.a m(StatementsType statementsType) {
        o8.a aVar = (o8.a) this.f13085l1.get(statementsType);
        return aVar == null ? new o8.a(statementsType) : aVar;
    }
}
