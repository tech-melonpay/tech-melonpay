package com.luminary.business.presentation.ui.fragments.accountdetails;

import B7.f;
import C.v;
import D6.c;
import F8.o;
import O9.p;
import P9.m;
import P9.s;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.Typed4EpoxyController;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.material.tabs.TabLayout;
import com.luminary.business.domain.entity.account.CardsDomain;
import com.luminary.business.presentation.entity.account.AccountDetailsUI;
import com.luminary.business.presentation.entity.transaction.TransactionUI;
import com.luminary.business.presentation.ui.fragments.accountdetails.AccountDetailsController;
import com.luminary.business.presentation.ui.fragments.home.newhome.b;
import com.luminary.business.presentation.ui.views.ButtonSmall;
import com.luminary.mobile.R;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import ka.C0969n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.collections.EmptyList;
import s6.C1215d;
import s6.C1217f;
import s6.C1218g;
import s6.C1219h;
import s6.C1229s;
import s6.n0;
import s6.p0;

/* compiled from: AccountDetailsController.kt */
/* loaded from: classes2.dex */
public final class AccountDetailsController extends Typed4EpoxyController<AccountDetailsUI, List<? extends b>, List<? extends CardsDomain>, Integer> {
    private final Context context;
    private final InterfaceC0646l<String, p> onCardClick;
    private final InterfaceC0646l<String, p> onCopyClick;
    private final InterfaceC0635a<Object> onInfoClick;
    private final InterfaceC0635a<Object> onLeftClick;
    private final InterfaceC0635a<Object> onRightClick;
    private final InterfaceC0646l<String, p> onTransactionClick;
    private List<? extends b> stickyHeaders = EmptyList.f23104a;
    private final TabLayout.d tabChangeListener;

    /* JADX WARN: Multi-variable type inference failed */
    public AccountDetailsController(Context context, TabLayout.d dVar, InterfaceC0635a<? extends Object> interfaceC0635a, InterfaceC0635a<? extends Object> interfaceC0635a2, InterfaceC0635a<? extends Object> interfaceC0635a3, InterfaceC0646l<? super String, p> interfaceC0646l, InterfaceC0646l<? super String, p> interfaceC0646l2, InterfaceC0646l<? super String, p> interfaceC0646l3) {
        this.context = context;
        this.tabChangeListener = dVar;
        this.onLeftClick = interfaceC0635a;
        this.onRightClick = interfaceC0635a2;
        this.onInfoClick = interfaceC0635a3;
        this.onCopyClick = interfaceC0646l;
        this.onCardClick = interfaceC0646l2;
        this.onTransactionClick = interfaceC0646l3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$10$lambda$6$lambda$3(boolean z10, AccountDetailsController accountDetailsController, View view) {
        InterfaceC0635a<Object> interfaceC0635a;
        if (!z10 || (interfaceC0635a = accountDetailsController.onLeftClick) == null) {
            return;
        }
        interfaceC0635a.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$10$lambda$6$lambda$4(boolean z10, AccountDetailsController accountDetailsController, View view) {
        InterfaceC0635a<Object> interfaceC0635a;
        if (!z10 || (interfaceC0635a = accountDetailsController.onRightClick) == null) {
            return;
        }
        interfaceC0635a.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$10$lambda$6$lambda$5(C1215d c1215d, DataBindingEpoxyModel.DataBindingHolder dataBindingHolder, int i) {
        ((ButtonSmall) dataBindingHolder.getDataBinding().f1148d.findViewById(R.id.right_btn)).setTint(R.color.white);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean buildModels$lambda$10$lambda$9$lambda$7(AccountDetailsController accountDetailsController, AccountDetailsUI accountDetailsUI, View view) {
        InterfaceC0646l<String, p> interfaceC0646l = accountDetailsController.onCopyClick;
        if (interfaceC0646l == null) {
            return true;
        }
        interfaceC0646l.invoke(accountDetailsController.context.getString(R.string.bank_app_id) + ": " + accountDetailsUI.f11170g);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$10$lambda$9$lambda$8(AccountDetailsController accountDetailsController, View view) {
        InterfaceC0635a<Object> interfaceC0635a = accountDetailsController.onInfoClick;
        if (interfaceC0635a != null) {
            interfaceC0635a.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$15$lambda$14$lambda$13(b bVar, AccountDetailsController accountDetailsController, View view) {
        String str;
        InterfaceC0646l<String, p> interfaceC0646l;
        b.a aVar = (b.a) bVar;
        if (!D9.b.x0(aVar.f12265a) || (str = aVar.f12265a.f11371a) == null || (interfaceC0646l = accountDetailsController.onTransactionClick) == null) {
            return;
        }
        interfaceC0646l.invoke(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$2$lambda$1$lambda$0(AccountDetailsController accountDetailsController, int i, AccountDetailsUI accountDetailsUI, C1217f c1217f, DataBindingEpoxyModel.DataBindingHolder dataBindingHolder, int i9) {
        TabLayout.i iVar;
        TabLayout.i iVar2;
        Map<String, AccountDetailsUI.ProviderRequisiteUI> map;
        TabLayout tabLayout = (TabLayout) dataBindingHolder.getDataBinding().f1148d.findViewById(R.id.tab_accounts);
        tabLayout.a(accountDetailsController.tabChangeListener);
        TabLayout.g h9 = tabLayout.h(i);
        if (h9 != null) {
            h9.a();
        }
        TabLayout.g h10 = tabLayout.h(1);
        AccountDetailsUI.ProviderRequisiteUI providerRequisiteUI = (accountDetailsUI == null || (map = accountDetailsUI.f11169f) == null) ? null : map.get(ImagesContract.LOCAL);
        if (accountDetailsController.checkAccountVisibility(providerRequisiteUI) || accountDetailsController.checkBankVisibility(providerRequisiteUI)) {
            if (h10 == null || (iVar = h10.f9859h) == null) {
                return;
            }
            iVar.setVisibility(0);
            return;
        }
        if (h10 == null || (iVar2 = h10.f9859h) == null) {
            return;
        }
        o.b(iVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showAccountDetailData$lambda$17$lambda$16(AccountDetailsController accountDetailsController, AccountDetailsUI.ProviderRequisiteUI providerRequisiteUI, View view) {
        InterfaceC0646l<String, p> interfaceC0646l = accountDetailsController.onCopyClick;
        if (interfaceC0646l == null) {
            return true;
        }
        interfaceC0646l.invoke(accountDetailsController.getSummaryString(providerRequisiteUI));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showAccountDetailData$lambda$19$lambda$18(AccountDetailsController accountDetailsController, AccountDetailsUI.ProviderRequisiteUI providerRequisiteUI, View view) {
        InterfaceC0646l<String, p> interfaceC0646l = accountDetailsController.onCopyClick;
        if (interfaceC0646l == null) {
            return true;
        }
        interfaceC0646l.invoke(accountDetailsController.getSummaryString(providerRequisiteUI));
        return true;
    }

    @Override // com.airbnb.epoxy.Typed4EpoxyController
    public /* bridge */ /* synthetic */ void buildModels(AccountDetailsUI accountDetailsUI, List<? extends b> list, List<? extends CardsDomain> list2, Integer num) {
        buildModels2(accountDetailsUI, list, (List<CardsDomain>) list2, num);
    }

    public final boolean checkAccountVisibility(AccountDetailsUI.ProviderRequisiteUI providerRequisiteUI) {
        String str = providerRequisiteUI != null ? providerRequisiteUI.f11184j : null;
        if (str == null || str.length() == 0) {
            String str2 = providerRequisiteUI != null ? providerRequisiteUI.f11179d : null;
            if (str2 == null || str2.length() == 0) {
                String str3 = providerRequisiteUI != null ? providerRequisiteUI.f11181f : null;
                if (str3 == null || str3.length() == 0) {
                    String str4 = providerRequisiteUI != null ? providerRequisiteUI.f11178c : null;
                    if (str4 == null || str4.length() == 0) {
                        String str5 = providerRequisiteUI != null ? providerRequisiteUI.f11176a : null;
                        if (str5 == null || str5.length() == 0) {
                            String str6 = providerRequisiteUI != null ? providerRequisiteUI.f11180e : null;
                            if (str6 == null || str6.length() == 0) {
                                String str7 = providerRequisiteUI != null ? providerRequisiteUI.f11177b : null;
                                if (str7 == null || str7.length() == 0) {
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    public final boolean checkBankVisibility(AccountDetailsUI.ProviderRequisiteUI providerRequisiteUI) {
        String str = providerRequisiteUI != null ? providerRequisiteUI.i : null;
        if (str == null || str.length() == 0) {
            String str2 = providerRequisiteUI != null ? providerRequisiteUI.f11182g : null;
            if (str2 == null || str2.length() == 0) {
                String str3 = providerRequisiteUI != null ? providerRequisiteUI.f11183h : null;
                if (str3 == null || str3.length() == 0) {
                    String str4 = providerRequisiteUI != null ? providerRequisiteUI.f11185k : null;
                    if (str4 == null || str4.length() == 0) {
                        String str5 = providerRequisiteUI != null ? providerRequisiteUI.f11186l : null;
                        if (str5 == null || str5.length() == 0) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public final String getSummaryString(AccountDetailsUI.ProviderRequisiteUI providerRequisiteUI) {
        String str = providerRequisiteUI != null ? providerRequisiteUI.f11176a : null;
        String str2 = "";
        if (str != null && str.length() != 0) {
            str2 = s3.b.l("", this.context.getString(R.string.beneficiary), ": ", providerRequisiteUI != null ? providerRequisiteUI.f11176a : null, "\n");
        }
        String str3 = providerRequisiteUI != null ? providerRequisiteUI.f11177b : null;
        if (str3 != null && str3.length() != 0) {
            str2 = str2 + this.context.getString(R.string.beneficiary_address) + ": " + (providerRequisiteUI != null ? providerRequisiteUI.f11177b : null) + "\n";
        }
        String str4 = providerRequisiteUI != null ? providerRequisiteUI.f11178c : null;
        if (str4 != null && str4.length() != 0) {
            str2 = str2 + this.context.getString(R.string.sort_code) + ": " + (providerRequisiteUI != null ? providerRequisiteUI.f11178c : null) + "\n";
        }
        String str5 = providerRequisiteUI != null ? providerRequisiteUI.f11179d : null;
        if (str5 != null && str5.length() != 0) {
            str2 = str2 + this.context.getString(R.string.account_number) + ": " + (providerRequisiteUI != null ? providerRequisiteUI.f11179d : null) + "\n";
        }
        String str6 = providerRequisiteUI != null ? providerRequisiteUI.f11180e : null;
        if (str6 != null && str6.length() != 0) {
            str2 = str2 + this.context.getString(R.string.iban) + ": " + (providerRequisiteUI != null ? providerRequisiteUI.f11180e : null) + "\n";
        }
        String str7 = providerRequisiteUI != null ? providerRequisiteUI.f11181f : null;
        if (str7 != null && str7.length() != 0) {
            str2 = str2 + this.context.getString(R.string.swift_bic) + ": " + (providerRequisiteUI != null ? providerRequisiteUI.f11181f : null) + "\n";
        }
        String str8 = providerRequisiteUI != null ? providerRequisiteUI.f11182g : null;
        if (str8 != null && str8.length() != 0) {
            str2 = str2 + this.context.getString(R.string.bank_name) + ": " + (providerRequisiteUI != null ? providerRequisiteUI.f11182g : null) + "\n";
        }
        String str9 = providerRequisiteUI != null ? providerRequisiteUI.f11183h : null;
        if (str9 != null && str9.length() != 0) {
            str2 = str2 + this.context.getString(R.string.bank_address) + ": " + (providerRequisiteUI != null ? providerRequisiteUI.f11183h : null) + "\n";
        }
        String str10 = providerRequisiteUI != null ? providerRequisiteUI.f11184j : null;
        if (str10 == null || str10.length() == 0) {
            return str2;
        }
        return str2 + this.context.getString(R.string.reference) + ": " + (providerRequisiteUI != null ? providerRequisiteUI.f11184j : null) + "\n";
    }

    @Override // com.airbnb.epoxy.EpoxyController, com.airbnb.epoxy.stickyheader.StickyHeaderCallbacks
    public boolean isStickyHeader(int i) {
        if (i == 0) {
            return false;
        }
        return s.M(i - 1, this.stickyHeaders) instanceof b.c;
    }

    @Override // com.airbnb.epoxy.Typed4EpoxyController
    public /* bridge */ /* synthetic */ void setData(AccountDetailsUI accountDetailsUI, List<? extends b> list, List<? extends CardsDomain> list2, Integer num) {
        setData2(accountDetailsUI, list, (List<CardsDomain>) list2, num);
    }

    @Override // com.airbnb.epoxy.EpoxyController, com.airbnb.epoxy.stickyheader.StickyHeaderCallbacks
    public void setupStickyHeaderView(View view) {
        View findViewById;
        if (!(view instanceof ViewGroup) || (findViewById = view.findViewById(R.id.constraint_layout)) == null) {
            return;
        }
        findViewById.setBackgroundResource(R.drawable.cell_bg_full_16);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void showAccountDetailData(AccountDetailsUI.ProviderRequisiteUI providerRequisiteUI) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13 = "";
        int i = 1;
        if (checkAccountVisibility(providerRequisiteUI)) {
            C1219h c1219h = new C1219h();
            c1219h.b(new Number[]{Integer.valueOf(providerRequisiteUI != null ? providerRequisiteUI.hashCode() : 0)});
            c1219h.a(this.context.getString(R.string.account_details));
            c1219h.j(this.context.getString(R.string.beneficiary));
            if (providerRequisiteUI == null || (str6 = providerRequisiteUI.f11176a) == null) {
                str6 = "";
            }
            c1219h.r(C0969n.u0(str6).toString());
            String str14 = providerRequisiteUI != null ? providerRequisiteUI.f11176a : null;
            c1219h.d(Boolean.valueOf(!(str14 == null || str14.length() == 0)));
            c1219h.k(this.context.getString(R.string.account_number));
            if (providerRequisiteUI == null || (str7 = providerRequisiteUI.f11179d) == null) {
                str7 = "";
            }
            c1219h.s(C0969n.u0(str7).toString());
            String str15 = providerRequisiteUI != null ? providerRequisiteUI.f11179d : null;
            c1219h.e(Boolean.valueOf(!(str15 == null || str15.length() == 0)));
            c1219h.l(this.context.getString(R.string.sort_code));
            if (providerRequisiteUI == null || (str8 = providerRequisiteUI.f11178c) == null) {
                str8 = "";
            }
            c1219h.t(C0969n.u0(str8).toString());
            String str16 = providerRequisiteUI != null ? providerRequisiteUI.f11178c : null;
            c1219h.f(Boolean.valueOf(!(str16 == null || str16.length() == 0)));
            c1219h.m(this.context.getString(R.string.iban));
            if (providerRequisiteUI == null || (str9 = providerRequisiteUI.f11180e) == null) {
                str9 = "";
            }
            c1219h.u(C0969n.u0(str9).toString());
            String str17 = providerRequisiteUI != null ? providerRequisiteUI.f11180e : null;
            c1219h.g(Boolean.valueOf(!(str17 == null || str17.length() == 0)));
            c1219h.n(this.context.getString(R.string.swift_bic));
            if (providerRequisiteUI == null || (str10 = providerRequisiteUI.f11181f) == null) {
                str10 = "";
            }
            c1219h.v(C0969n.u0(str10).toString());
            String str18 = providerRequisiteUI != null ? providerRequisiteUI.f11181f : null;
            c1219h.h(Boolean.valueOf(!(str18 == null || str18.length() == 0)));
            c1219h.o(this.context.getString(R.string.reference));
            if (providerRequisiteUI == null || (str11 = providerRequisiteUI.f11184j) == null) {
                str11 = "";
            }
            c1219h.w(C0969n.u0(str11).toString());
            String str19 = providerRequisiteUI != null ? providerRequisiteUI.f11184j : null;
            c1219h.i(Boolean.valueOf(!(str19 == null || str19.length() == 0)));
            c1219h.p(this.context.getString(R.string.beneficiary_address));
            if (providerRequisiteUI == null || (str12 = providerRequisiteUI.f11177b) == null) {
                str12 = "";
            }
            c1219h.x(C0969n.u0(str12).toString());
            c1219h.c();
            c1219h.q(new c(this, providerRequisiteUI, r3));
            add(c1219h);
        }
        if (checkBankVisibility(providerRequisiteUI)) {
            C1218g c1218g = new C1218g();
            c1218g.c(new Number[]{Integer.valueOf(providerRequisiteUI != null ? providerRequisiteUI.hashCode() : 0)});
            c1218g.b(this.context.getString(R.string.bank_details));
            c1218g.l(this.context.getString(R.string.country_of_bank_account));
            if (providerRequisiteUI == null || (str = providerRequisiteUI.f11187m) == null) {
                str = "";
            }
            c1218g.r(C0969n.u0(str).toString());
            c1218g.a(providerRequisiteUI != null ? providerRequisiteUI.i : null);
            String str20 = providerRequisiteUI != null ? providerRequisiteUI.i : null;
            c1218g.e(Boolean.valueOf(!(str20 == null || str20.length() == 0)));
            c1218g.m(this.context.getString(R.string.bank_name));
            if (providerRequisiteUI == null || (str2 = providerRequisiteUI.f11182g) == null) {
                str2 = "";
            }
            c1218g.s(C0969n.u0(str2).toString());
            String str21 = providerRequisiteUI != null ? providerRequisiteUI.f11182g : null;
            c1218g.f(Boolean.valueOf(!(str21 == null || str21.length() == 0)));
            c1218g.n(this.context.getString(R.string.bank_address));
            if (providerRequisiteUI == null || (str3 = providerRequisiteUI.f11183h) == null) {
                str3 = "";
            }
            c1218g.t(C0969n.u0(str3).toString());
            String str22 = providerRequisiteUI != null ? providerRequisiteUI.f11183h : null;
            c1218g.g(Boolean.valueOf(!(str22 == null || str22.length() == 0)));
            c1218g.o(this.context.getString(R.string.correspondent_intermediary_bank_name));
            if (providerRequisiteUI == null || (str4 = providerRequisiteUI.f11185k) == null) {
                str4 = "";
            }
            c1218g.u(C0969n.u0(str4).toString());
            String str23 = providerRequisiteUI != null ? providerRequisiteUI.f11185k : null;
            c1218g.h(Boolean.valueOf(!(str23 == null || str23.length() == 0)));
            c1218g.p(this.context.getString(R.string.correspondent_intermediary_bank_swift_code));
            if (providerRequisiteUI != null && (str5 = providerRequisiteUI.f11186l) != null) {
                str13 = str5;
            }
            c1218g.v(C0969n.u0(str13).toString());
            String str24 = providerRequisiteUI != null ? providerRequisiteUI.f11186l : null;
            c1218g.i(Boolean.valueOf(((str24 == null || str24.length() == 0) ? 1 : 0) ^ 1));
            c1218g.d();
            c1218g.j();
            c1218g.k();
            c1218g.q(new c(this, providerRequisiteUI, i));
            add(c1218g);
        }
    }

    @Override // com.airbnb.epoxy.EpoxyController, com.airbnb.epoxy.stickyheader.StickyHeaderCallbacks
    public void teardownStickyHeaderView(View view) {
        View findViewById;
        if (!(view instanceof ViewGroup) || (findViewById = view.findViewById(R.id.constraint_layout)) == null) {
            return;
        }
        findViewById.setBackgroundResource(R.drawable.cell_bg_transaction_top);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v9, types: [D6.b] */
    /* JADX WARN: Type inference failed for: r3v24, types: [D6.b] */
    /* JADX WARN: Type inference failed for: r3v25, types: [D6.b] */
    /* renamed from: buildModels, reason: avoid collision after fix types in other method */
    public void buildModels2(AccountDetailsUI accountDetailsUI, List<? extends b> list, List<CardsDomain> list2, Integer num) {
        boolean z10;
        if (num != null) {
            int intValue = num.intValue();
            C1217f c1217f = new C1217f();
            c1217f.a();
            c1217f.b(new D6.a(this, intValue, accountDetailsUI));
            add(c1217f);
        }
        if (((num != null && num.intValue() == 0) || (num != null && num.intValue() == 1)) && accountDetailsUI != null) {
            Map<String, AccountDetailsUI.ProviderRequisiteUI> map = accountDetailsUI.f11169f;
            AccountDetailsUI.ProviderRequisiteUI providerRequisiteUI = map != null ? map.get(ImagesContract.LOCAL) : null;
            AccountDetailsUI.ProviderRequisiteUI providerRequisiteUI2 = map != null ? map.get("international") : null;
            Context context = this.context;
            String str = accountDetailsUI.f11171h;
            Integer M8 = str != null ? D9.b.M(context, str) : null;
            C1215d c1215d = new C1215d();
            c1215d.d();
            c1215d.g(accountDetailsUI.i);
            c1215d.a(F8.a.a(accountDetailsUI));
            c1215d.c(M8);
            c1215d.b(accountDetailsUI.i);
            c1215d.e();
            c1215d.f();
            final int i = 0;
            c1215d.i(new View.OnClickListener(this) { // from class: D6.b

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ AccountDetailsController f926b;

                {
                    this.f926b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i) {
                        case 0:
                            AccountDetailsController.buildModels$lambda$10$lambda$6$lambda$3(true, this.f926b, view);
                            break;
                        case 1:
                            AccountDetailsController.buildModels$lambda$10$lambda$6$lambda$4(true, this.f926b, view);
                            break;
                        default:
                            AccountDetailsController.buildModels$lambda$10$lambda$9$lambda$8(this.f926b, view);
                            break;
                    }
                }
            });
            final int i9 = 1;
            c1215d.j(new View.OnClickListener(this) { // from class: D6.b

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ AccountDetailsController f926b;

                {
                    this.f926b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i9) {
                        case 0:
                            AccountDetailsController.buildModels$lambda$10$lambda$6$lambda$3(true, this.f926b, view);
                            break;
                        case 1:
                            AccountDetailsController.buildModels$lambda$10$lambda$6$lambda$4(true, this.f926b, view);
                            break;
                        default:
                            AccountDetailsController.buildModels$lambda$10$lambda$9$lambda$8(this.f926b, view);
                            break;
                    }
                }
            });
            c1215d.h(new v());
            add(c1215d);
            if (num != null && num.intValue() == 0) {
                showAccountDetailData(providerRequisiteUI2);
            }
            if (num != null && num.intValue() == 1) {
                showAccountDetailData(providerRequisiteUI);
            }
            C1229s c1229s = new C1229s();
            c1229s.b();
            c1229s.a(this.context.getString(R.string.bank_app_accounts));
            c1229s.c();
            c1229s.d();
            c1229s.e(this.context.getString(R.string.beneficiary));
            String str2 = accountDetailsUI.f11166c;
            c1229s.i(str2 != null ? C0969n.u0(str2).toString() : null);
            c1229s.f(this.context.getString(R.string.email));
            c1229s.j(accountDetailsUI.f11175m);
            c1229s.g(new c(this, accountDetailsUI, 2));
            final int i10 = 2;
            c1229s.h(new View.OnClickListener(this) { // from class: D6.b

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ AccountDetailsController f926b;

                {
                    this.f926b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            AccountDetailsController.buildModels$lambda$10$lambda$6$lambda$3(true, this.f926b, view);
                            break;
                        case 1:
                            AccountDetailsController.buildModels$lambda$10$lambda$6$lambda$4(true, this.f926b, view);
                            break;
                        default:
                            AccountDetailsController.buildModels$lambda$10$lambda$9$lambda$8(this.f926b, view);
                            break;
                    }
                }
            });
            add(c1229s);
        }
        if (num != null && num.intValue() == 2) {
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (obj instanceof b.c) {
                        arrayList.add(obj);
                    }
                }
                z10 = arrayList.isEmpty();
            } else {
                z10 = false;
            }
            if (list != null) {
                int i11 = 0;
                for (Object obj2 : list) {
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        m.t();
                        throw null;
                    }
                    b bVar = (b) obj2;
                    if (bVar instanceof b.c) {
                        n0 n0Var = new n0();
                        b.c cVar = (b.c) bVar;
                        n0Var.a("section_header_" + cVar.f12267a + "_" + System.currentTimeMillis());
                        n0Var.d(cVar.f12267a);
                        Boolean bool = Boolean.FALSE;
                        n0Var.b(bool);
                        n0Var.c(bool);
                        add(n0Var);
                    } else {
                        if (!(bVar instanceof b.a)) {
                            if (!(bVar instanceof b.C0130b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw new NotImplementedError();
                        }
                        p0 p0Var = new p0();
                        b.a aVar = (b.a) bVar;
                        p0Var.e("transaction_" + aVar.f12265a.f11371a);
                        Context context2 = this.context;
                        TransactionUI transactionUI = aVar.f12265a;
                        p0Var.i(D9.b.S(transactionUI, context2));
                        p0Var.k(D9.b.U(D9.b.R(transactionUI, this.context)));
                        p0Var.f(Boolean.valueOf(transactionUI.f11388s));
                        Date date = transactionUI.f11382m;
                        p0Var.c(date != null ? D9.b.F0(date, "HH:mm, EEE dd MMM") : "");
                        p0Var.o(D9.b.A0(transactionUI));
                        p0Var.d(D9.b.f(transactionUI));
                        p0Var.b(D9.b.B(transactionUI, this.context));
                        p0Var.g(Boolean.valueOf(D9.b.a0(transactionUI)));
                        p0Var.l(Boolean.valueOf(D9.b.a0(transactionUI)));
                        p0Var.n(Boolean.valueOf(D9.b.y0(transactionUI)));
                        p0Var.m(Boolean.valueOf(!D9.b.b0(transactionUI)));
                        p0Var.p(Integer.valueOf(D9.b.I0(transactionUI)));
                        p0Var.j(new f(2, (b.a) bVar, this));
                        p0Var.h(Boolean.valueOf(i11 == list.size() - 1 || (s.M(i12, list) instanceof b.c)));
                        p0Var.a(Integer.valueOf((z10 && i11 == 0) ? R.drawable.cell_bg_transaction_top : ((s.M(i12, list) instanceof b.c) || i11 == list.size() - 1) ? R.drawable.cell_bg_transaction_bottom : R.drawable.cell_bg_middle));
                        add(p0Var);
                    }
                    i11 = i12;
                }
            }
        }
    }

    /* renamed from: setData, reason: avoid collision after fix types in other method */
    public void setData2(AccountDetailsUI accountDetailsUI, List<? extends b> list, List<CardsDomain> list2, Integer num) {
        this.stickyHeaders = list == null ? EmptyList.f23104a : list;
        super.setData((AccountDetailsController) accountDetailsUI, (AccountDetailsUI) list, (List<? extends b>) list2, (List<CardsDomain>) num);
    }
}
