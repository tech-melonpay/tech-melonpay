package B6;

import C.v;
import F8.o;
import K5.a;
import M6.n;
import M6.w;
import O9.p;
import P9.s;
import U4.b;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import androidx.fragment.app.FragmentManager;
import ca.InterfaceC0635a;
import ca.InterfaceC0650p;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.luminary.business.domain.entity.cryptoaccount.CryptoAccountDomain;
import com.luminary.business.domain.entity.cryptowallet.CryptoExchangeCreateRequestDomain;
import com.luminary.business.domain.entity.cryptowallet.CryptowalletDomain;
import com.luminary.business.presentation.entity.company.BankAccountOutside;
import com.luminary.business.presentation.entity.company.CompanyDetailsUI;
import com.luminary.business.presentation.entity.company.UploadFileUI;
import com.luminary.business.presentation.entity.payment.PaymentUI;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.auth.accountinformation.AccountInformationFragment;
import com.luminary.business.presentation.ui.fragments.auth.register.RegisterAddressFragment;
import com.luminary.business.presentation.ui.fragments.auth.register.RegisterFragment;
import com.luminary.business.presentation.ui.fragments.auth.register.validation.ValidationFragment;
import com.luminary.business.presentation.ui.fragments.cardSecurityVerification.CardSecurityVerificationFragment;
import com.luminary.business.presentation.ui.fragments.cardSecurityVerification.editCardSecurityVerification.EditCardSecurityVerificationFragment;
import com.luminary.business.presentation.ui.fragments.cards.details.CardDetailsFragment;
import com.luminary.business.presentation.ui.fragments.crypto.buy_external_account.BuyExternalAccountDetailsFragment;
import com.luminary.business.presentation.ui.fragments.crypto.create_exchange_details.CreateExchangeDetailsFragment;
import com.luminary.business.presentation.ui.fragments.crypto.crypto_exchange.CryptoExchangeFragment;
import com.luminary.business.presentation.ui.fragments.crypto.sell_external_account.SellExternalAccountInfoFragment;
import com.luminary.business.presentation.ui.fragments.crypto.sell_external_account.SellExternalAccountSelectFragment;
import com.luminary.business.presentation.ui.fragments.crypto.withdraw_crypto.WithdrawCryptoFragment;
import com.luminary.business.presentation.ui.fragments.invoices.invoices_new.InvoicesNewFragment;
import com.luminary.business.presentation.ui.fragments.newcompany.NewCompanyViewModel;
import com.luminary.business.presentation.ui.fragments.newcompany.additionalinformation.AdditionalInformationFragment;
import com.luminary.business.presentation.ui.fragments.newcompany.addubo.AddUBOFragment;
import com.luminary.business.presentation.ui.fragments.newcompany.businessactivity.AddBankFragment;
import com.luminary.business.presentation.ui.fragments.newcompany.businessactivity.BusinessActivityFragment;
import com.luminary.business.presentation.ui.fragments.newcompany.confirmaddress.ConfirmAddressCompanyFragment;
import com.luminary.business.presentation.ui.fragments.newcompany.positionincompany.PositionInCompanyFragment;
import com.luminary.business.presentation.ui.fragments.newcompany.teammembers.TeamMembersFragment;
import com.luminary.business.presentation.ui.fragments.newcompany.upload.UploadDocumentsFragment;
import com.luminary.business.presentation.ui.fragments.newpayment.paymentdetails.PaymentDetailsFragment;
import com.luminary.business.presentation.ui.fragments.newpayment.swift.NewPaymentSwiftBankInfoFragment;
import com.luminary.business.presentation.ui.fragments.newpayment.to_bank_account.NewPaymentToBankAccountBankInfoFragment;
import com.luminary.business.presentation.ui.fragments.settings.SettingsFragment;
import com.luminary.business.presentation.ui.views.tagview.TagView;
import com.luminary.business.presentation.utils.bottomDialog.BottomDialogType;
import com.luminary.mobile.R;
import i7.C0830e;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Executor;
import k0.C0913a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.d;
import kotlin.jvm.internal.h;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.flow.internal.SafeCollector;
import kotlinx.coroutines.flow.internal.SafeCollector_commonKt;
import kotlinx.coroutines.future.FutureKt;
import q.i;
import r7.C1157e;
import r7.C1159g;
import t6.C2;
import t6.K5;
import u5.b;
import z8.C1652b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class h implements InterfaceC0650p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f408a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f409b;

    public /* synthetic */ h(Object obj, int i) {
        this.f408a = i;
        this.f409b = obj;
    }

    private final Object a(Object obj, Object obj2) {
        Object obj3;
        String str;
        Bundle bundle = (Bundle) obj2;
        if (!kotlin.jvm.internal.f.b((String) obj, "payment")) {
            return p.f3034a;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            obj3 = bundle.getSerializable("requisites", CryptoExchangeCreateRequestDomain.ExternalAccountRequisitesDomain.class);
        } else {
            Object serializable = bundle.getSerializable("requisites");
            if (!(serializable instanceof CryptoExchangeCreateRequestDomain.ExternalAccountRequisitesDomain)) {
                serializable = null;
            }
            obj3 = (CryptoExchangeCreateRequestDomain.ExternalAccountRequisitesDomain) serializable;
        }
        boolean z10 = bundle.getBoolean("show_template");
        SellExternalAccountInfoFragment sellExternalAccountInfoFragment = (SellExternalAccountInfoFragment) this.f409b;
        sellExternalAccountInfoFragment.f12132q0 = z10;
        sellExternalAccountInfoFragment.f12131p0 = (CryptoExchangeCreateRequestDomain.ExternalAccountRequisitesDomain) obj3;
        o.b(sellExternalAccountInfoFragment.u0().f28086w);
        sellExternalAccountInfoFragment.u0().f28082s.setVisibility(0);
        K5 u02 = sellExternalAccountInfoFragment.u0();
        CryptoExchangeCreateRequestDomain.ExternalAccountRequisitesDomain externalAccountRequisitesDomain = sellExternalAccountInfoFragment.f12131p0;
        if (externalAccountRequisitesDomain == null || (str = externalAccountRequisitesDomain.f10999c) == null) {
            str = "";
        }
        u02.f28089z.setText(str);
        K5 u03 = sellExternalAccountInfoFragment.u0();
        CryptoExchangeCreateRequestDomain.ExternalAccountRequisitesDomain externalAccountRequisitesDomain2 = sellExternalAccountInfoFragment.f12131p0;
        u03.f28088y.setText(v.p(externalAccountRequisitesDomain2 != null ? externalAccountRequisitesDomain2.f10998b : null, "    ", externalAccountRequisitesDomain2 != null ? externalAccountRequisitesDomain2.f11001e : null));
        sellExternalAccountInfoFragment.u0().f28081r.setEnabled((sellExternalAccountInfoFragment.f12130o0.i && sellExternalAccountInfoFragment.f12131p0 == null) ? false : true);
        return p.f3034a;
    }

    private final Object b(Object obj, Object obj2) {
        String str;
        Bundle bundle = (Bundle) obj2;
        if (!kotlin.jvm.internal.f.b((String) obj, "country")) {
            return p.f3034a;
        }
        String string = bundle.getString("selected_country");
        String str2 = "";
        if (string == null) {
            string = "";
        }
        SellExternalAccountSelectFragment sellExternalAccountSelectFragment = (SellExternalAccountSelectFragment) this.f409b;
        sellExternalAccountSelectFragment.f12138t0 = string;
        String string2 = bundle.getString("selected_country_code");
        if (string2 == null) {
            string2 = "";
        }
        sellExternalAccountSelectFragment.f12139u0 = string2;
        sellExternalAccountSelectFragment.u0().f28204z.setText(sellExternalAccountSelectFragment.f12138t0);
        CryptoExchangeCreateRequestDomain.ExternalAccountRequisitesDomain externalAccountRequisitesDomain = sellExternalAccountSelectFragment.f12136q0;
        if (externalAccountRequisitesDomain == null) {
            externalAccountRequisitesDomain = null;
        }
        externalAccountRequisitesDomain.f11007l = sellExternalAccountSelectFragment.f12139u0;
        sellExternalAccountSelectFragment.u0().f28190F.k(sellExternalAccountSelectFragment.u0().f28190F.h(1), true);
        String str3 = sellExternalAccountSelectFragment.f12139u0;
        if (str3 != null) {
            C1159g T02 = sellExternalAccountSelectFragment.T0();
            C1157e c1157e = sellExternalAccountSelectFragment.f12134o0;
            if (c1157e != null && (str = c1157e.f26317a) != null) {
                str2 = str;
            }
            T02.getClass();
            D7.e eVar = new D7.e(str3, str2, 8, T02);
            T02.f419K0 = eVar;
            eVar.invoke();
        }
        return p.f3034a;
    }

    @Override // ca.InterfaceC0650p
    public final Object invoke(Object obj, Object obj2) {
        String string;
        InterfaceC0635a<p> interfaceC0635a;
        TabLayout.g h9;
        String string2;
        String string3;
        ArrayList<BankAccountOutside> arrayList;
        Object obj3;
        List list;
        Object obj4;
        String str;
        String str2;
        CryptoAccountDomain cryptoAccountDomain;
        int checkContext$lambda$0;
        Object asDeferred$lambda$5;
        Object obj5;
        Long l10;
        switch (this.f408a) {
            case 0:
                Bundle bundle = (Bundle) obj2;
                LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f23085a;
                final BaseFragment baseFragment = (BaseFragment) this.f409b;
                O9.f b9 = kotlin.a.b(lazyThreadSafetyMode, new InterfaceC0635a<K5.a>() { // from class: com.luminary.business.presentation.ui.base.BaseFragment$onViewCreated$lambda$13$$inlined$inject$default$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r0v2, types: [K5.a, java.lang.Object] */
                    @Override // ca.InterfaceC0635a
                    public final a invoke() {
                        return b.l(baseFragment).a(null, null, h.a(a.class));
                    }
                });
                if (!kotlin.jvm.internal.f.b((String) obj, "TFA")) {
                    return p.f3034a;
                }
                if (bundle.getBoolean("SUCCESS") && (string = bundle.getString("CODE")) != null) {
                    ((K5.a) b9.getValue()).R(string);
                    i iVar = baseFragment.f11471m0;
                    if (iVar instanceof J6.g) {
                        if ((iVar != null ? iVar.f413E0 : null) == null) {
                            J6.g gVar = (J6.g) iVar;
                            gVar.l();
                            gVar.f2185X0.a(new J6.f(gVar, 1), s3.b.j("Bearer ", gVar.f414F0));
                        }
                    }
                    if (iVar instanceof w) {
                        if ((iVar != null ? iVar.f413E0 : null) == null) {
                            w wVar = (w) iVar;
                            wVar.l();
                            wVar.f2707h1.a(new n(wVar, 15), s3.b.j("Bearer ", wVar.f414F0));
                        }
                    }
                    if (iVar != null && (interfaceC0635a = iVar.f413E0) != null) {
                        interfaceC0635a.invoke();
                    }
                }
                return p.f3034a;
            case 1:
                if (!kotlin.jvm.internal.f.b((String) obj, "invoice_detail")) {
                    return p.f3034a;
                }
                InvoicesNewFragment invoicesNewFragment = (InvoicesNewFragment) this.f409b;
                invoicesNewFragment.T0().m(true);
                invoicesNewFragment.T0().m(false);
                F7.e T02 = invoicesNewFragment.T0();
                LinkedHashMap linkedHashMap = invoicesNewFragment.f12329t0;
                InvoicesNewFragment.a aVar = (InvoicesNewFragment.a) linkedHashMap.get(0);
                Date date = aVar != null ? aVar.f12337a : null;
                InvoicesNewFragment.a aVar2 = (InvoicesNewFragment.a) linkedHashMap.get(0);
                T02.n(true, date, aVar2 != null ? aVar2.f12338b : null, invoicesNewFragment.s0, invoicesNewFragment.f12328r0);
                F7.e T03 = invoicesNewFragment.T0();
                InvoicesNewFragment.a aVar3 = (InvoicesNewFragment.a) linkedHashMap.get(1);
                Date date2 = aVar3 != null ? aVar3.f12337a : null;
                InvoicesNewFragment.a aVar4 = (InvoicesNewFragment.a) linkedHashMap.get(1);
                T03.n(false, date2, aVar4 != null ? aVar4.f12338b : null, invoicesNewFragment.s0, invoicesNewFragment.f12328r0);
                return p.f3034a;
            case 2:
                Bundle bundle2 = (Bundle) obj2;
                if (!kotlin.jvm.internal.f.b((String) obj, "country")) {
                    return p.f3034a;
                }
                String string4 = bundle2.getString("field");
                boolean b10 = kotlin.jvm.internal.f.b(string4, FirebaseAnalytics.Param.TAX);
                AccountInformationFragment accountInformationFragment = (AccountInformationFragment) this.f409b;
                if (b10) {
                    String string5 = bundle2.getString("selected_country_code");
                    if (string5 == null) {
                        string5 = "";
                    }
                    accountInformationFragment.f11531u0 = string5;
                    String string6 = bundle2.getString("selected_country");
                    accountInformationFragment.f11532v0 = string6 != null ? string6 : "";
                    accountInformationFragment.u0().f27671s.setText(accountInformationFragment.f11532v0);
                } else if (kotlin.jvm.internal.f.b(string4, "birth")) {
                    String string7 = bundle2.getString("selected_country_code");
                    if (string7 == null) {
                        string7 = "";
                    }
                    accountInformationFragment.f11527p0 = string7;
                    String string8 = bundle2.getString("selected_country");
                    accountInformationFragment.f11528q0 = string8 != null ? string8 : "";
                    accountInformationFragment.u0().f27670r.setText(accountInformationFragment.f11528q0);
                } else if (kotlin.jvm.internal.f.b(string4, "citizenship")) {
                    String string9 = bundle2.getString("selected_country_code");
                    if (string9 == null) {
                        string9 = "";
                    }
                    accountInformationFragment.f11529r0 = string9;
                    String string10 = bundle2.getString("selected_country");
                    accountInformationFragment.s0 = string10 != null ? string10 : "";
                    accountInformationFragment.u0().f27669q.setText(accountInformationFragment.s0);
                } else if (kotlin.jvm.internal.f.b(string4, "secondary_citizenship")) {
                    String string11 = bundle2.getString("selected_country");
                    if (string11 == null) {
                        string11 = "";
                    }
                    String string12 = bundle2.getString("selected_country_code");
                    accountInformationFragment.f11530t0.add(new Pair<>(string11, string12 != null ? string12 : ""));
                    accountInformationFragment.f11530t0 = new ArrayList<>(s.F(accountInformationFragment.f11530t0));
                    accountInformationFragment.u0().f27663A.setText(string11);
                    accountInformationFragment.u0().f27675w.setChecked(true);
                }
                C2 u02 = accountInformationFragment.u0();
                ArrayList<Pair<String, String>> arrayList2 = accountInformationFragment.f11530t0;
                TagView tagView = u02.f27668p;
                tagView.f13240a.clear();
                tagView.removeAllViews();
                ArrayList arrayList3 = new ArrayList();
                Iterator<Pair<String, String>> it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(new C1652b(it.next().f23089a));
                }
                if (!arrayList3.isEmpty()) {
                    tagView.setVisibility(0);
                }
                tagView.a(arrayList3);
                accountInformationFragment.T0();
                return p.f3034a;
            case 3:
                Bundle bundle3 = (Bundle) obj2;
                if (!kotlin.jvm.internal.f.b((String) obj, "country")) {
                    return p.f3034a;
                }
                String string13 = bundle3.getString("selected_country");
                RegisterAddressFragment registerAddressFragment = (RegisterAddressFragment) this.f409b;
                registerAddressFragment.f11631p0 = string13;
                registerAddressFragment.f11632q0 = bundle3.getString("selected_country_code");
                registerAddressFragment.u0().f29688x.setText(registerAddressFragment.f11631p0);
                registerAddressFragment.U0();
                registerAddressFragment.Z0();
                registerAddressFragment.u0().S.setVisibility(0);
                if (registerAddressFragment.X0()) {
                    registerAddressFragment.u0().S.setDisplayedChild(0);
                } else {
                    registerAddressFragment.u0().S.setDisplayedChild(1);
                }
                return p.f3034a;
            case 4:
                Bundle bundle4 = (Bundle) obj2;
                if (!kotlin.jvm.internal.f.b((String) obj, "country")) {
                    return p.f3034a;
                }
                String string14 = bundle4.getString("selected_country");
                if (string14 == null) {
                    string14 = "";
                }
                RegisterFragment registerFragment = (RegisterFragment) this.f409b;
                registerFragment.f11668q0 = string14;
                registerFragment.u0().f29754I.setText(s3.b.j("+", registerFragment.f11668q0));
                registerFragment.T0();
                return p.f3034a;
            case 5:
                Bundle bundle5 = (Bundle) obj2;
                if (!kotlin.jvm.internal.f.b((String) obj, "country")) {
                    return p.f3034a;
                }
                String string15 = bundle5.getString("selected_country");
                if (string15 == null) {
                    string15 = "";
                }
                ValidationFragment validationFragment = (ValidationFragment) this.f409b;
                validationFragment.f11707t0 = string15;
                validationFragment.u0().f29624q.setText(s3.b.j("+", validationFragment.f11707t0));
                return p.f3034a;
            case 6:
                Bundle bundle6 = (Bundle) obj2;
                if (!kotlin.jvm.internal.f.b((String) obj, "country")) {
                    return p.f3034a;
                }
                String string16 = bundle6.getString("selected_country_code");
                if (string16 == null) {
                    string16 = "";
                }
                AdditionalInformationFragment additionalInformationFragment = (AdditionalInformationFragment) this.f409b;
                additionalInformationFragment.f12474r0 = string16;
                String string17 = bundle6.getString("selected_country");
                additionalInformationFragment.s0 = string17 != null ? string17 : "";
                additionalInformationFragment.u0().f29656p.setText(additionalInformationFragment.s0);
                additionalInformationFragment.U0();
                return p.f3034a;
            case 7:
                Bundle bundle7 = (Bundle) obj2;
                if (!kotlin.jvm.internal.f.b((String) obj, "country")) {
                    return p.f3034a;
                }
                String string18 = bundle7.getString("field");
                AddUBOFragment addUBOFragment = (AddUBOFragment) this.f409b;
                if (string18 != null) {
                    int hashCode = string18.hashCode();
                    if (hashCode != -1916704834) {
                        if (hashCode != -1802553797) {
                            if (hashCode == -1455362723 && string18.equals("COUNTRY_RESIDENCE")) {
                                String string19 = bundle7.getString("selected_country_code");
                                if (string19 == null) {
                                    string19 = "";
                                }
                                addUBOFragment.f12497w0 = string19;
                                String string20 = bundle7.getString("selected_country");
                                addUBOFragment.f12498x0 = string20 != null ? string20 : "";
                                addUBOFragment.u0().f27988s.setText(addUBOFragment.f12498x0);
                            }
                        } else if (string18.equals("COUNTRY_CITIZENSHIP")) {
                            String string21 = bundle7.getString("selected_country_code");
                            if (string21 == null) {
                                string21 = "";
                            }
                            addUBOFragment.f12499y0 = string21;
                            String string22 = bundle7.getString("selected_country");
                            addUBOFragment.f12500z0 = string22 != null ? string22 : "";
                            addUBOFragment.u0().f27986q.setText(addUBOFragment.f12500z0);
                        }
                    } else if (string18.equals("COUNTRY_OPERATION")) {
                        String string23 = bundle7.getString("selected_country_code");
                        if (string23 == null) {
                            string23 = "";
                        }
                        addUBOFragment.f12495u0 = string23;
                        String string24 = bundle7.getString("selected_country");
                        addUBOFragment.f12496v0 = string24 != null ? string24 : "";
                        addUBOFragment.u0().f27987r.setText(addUBOFragment.f12496v0);
                    }
                }
                addUBOFragment.V0();
                if (addUBOFragment.f12493r0 == TeamMembersFragment.UBOType.f12694c && (h9 = addUBOFragment.u0().f27977L.h(addUBOFragment.s0)) != null) {
                    h9.a();
                }
                return p.f3034a;
            case 8:
                Bundle bundle8 = (Bundle) obj2;
                if (!kotlin.jvm.internal.f.b((String) obj, "country")) {
                    return p.f3034a;
                }
                String string25 = bundle8.getString("selected_country");
                if (string25 == null) {
                    string25 = "";
                }
                CardSecurityVerificationFragment cardSecurityVerificationFragment = (CardSecurityVerificationFragment) this.f409b;
                cardSecurityVerificationFragment.f11734q0 = string25;
                cardSecurityVerificationFragment.u0().f28625r.setText(s3.b.j("+", cardSecurityVerificationFragment.f11734q0));
                Editable text = cardSecurityVerificationFragment.u0().f28627t.getText();
                if (text == null || text.length() == 0) {
                    cardSecurityVerificationFragment.u0().f28626s.setError(null);
                } else {
                    cardSecurityVerificationFragment.X0(String.valueOf(cardSecurityVerificationFragment.u0().f28627t.getText()));
                    if (cardSecurityVerificationFragment.f11736t0) {
                        cardSecurityVerificationFragment.u0().f28626s.setError(null);
                    } else {
                        cardSecurityVerificationFragment.u0().f28626s.setErrorWithoutFocus(cardSecurityVerificationFragment.getString(R.string.invalid_phone));
                    }
                }
                Editable text2 = cardSecurityVerificationFragment.u0().f28624q.getText();
                if (text2 == null || text2.length() == 0) {
                    cardSecurityVerificationFragment.u0().f28623p.setError(null);
                } else {
                    cardSecurityVerificationFragment.W0(String.valueOf(cardSecurityVerificationFragment.u0().f28624q.getText()), true);
                }
                return p.f3034a;
            case 9:
                Bundle bundle9 = (Bundle) obj2;
                if (!kotlin.jvm.internal.f.b((String) obj, "country")) {
                    return p.f3034a;
                }
                String string26 = bundle9.getString("selected_country");
                if (string26 == null) {
                    string26 = "";
                }
                AddBankFragment addBankFragment = (AddBankFragment) this.f409b;
                addBankFragment.f12523q0 = string26;
                BankAccountOutside bankAccountOutside = addBankFragment.f12521o0;
                if (bankAccountOutside == null) {
                    bankAccountOutside = null;
                }
                String string27 = bundle9.getString("selected_country_code");
                bankAccountOutside.f11189b = string27 != null ? string27 : "";
                addBankFragment.u0().f27888r.setText(addBankFragment.f12523q0);
                addBankFragment.T0();
                return p.f3034a;
            case 10:
                Bundle bundle10 = (Bundle) obj2;
                if (kotlin.jvm.internal.f.b((String) obj, "NEW_BANK_OUTSIDE")) {
                    String string28 = bundle10.getString(AppMeasurementSdk.ConditionalUserProperty.NAME);
                    BusinessActivityFragment businessActivityFragment = (BusinessActivityFragment) this.f409b;
                    if (string28 != null && (string2 = bundle10.getString("country")) != null && (string3 = bundle10.getString("country_full")) != null) {
                        String string29 = bundle10.getString("info");
                        if (string29 == null) {
                            string29 = "";
                        }
                        BankAccountOutside bankAccountOutside2 = new BankAccountOutside(string28, string2, string3, string29);
                        CompanyDetailsUI companyDetailsUI = businessActivityFragment.V0().f12446k1;
                        if (companyDetailsUI == null) {
                            companyDetailsUI = null;
                        }
                        CompanyDetailsUI.CompanyUI companyUI = companyDetailsUI.f11192a;
                        if ((companyUI != null ? companyUI.f11241m0 : null) == null) {
                            CompanyDetailsUI companyDetailsUI2 = businessActivityFragment.V0().f12446k1;
                            if (companyDetailsUI2 == null) {
                                companyDetailsUI2 = null;
                            }
                            CompanyDetailsUI.CompanyUI companyUI2 = companyDetailsUI2.f11192a;
                            if (companyUI2 != null) {
                                companyUI2.f11241m0 = new ArrayList<>();
                            }
                        }
                        CompanyDetailsUI companyDetailsUI3 = businessActivityFragment.V0().f12446k1;
                        CompanyDetailsUI.CompanyUI companyUI3 = (companyDetailsUI3 != null ? companyDetailsUI3 : null).f11192a;
                        if (companyUI3 != null && (arrayList = companyUI3.f11241m0) != null) {
                            arrayList.add(bankAccountOutside2);
                        }
                        businessActivityFragment.T0();
                    }
                    businessActivityFragment.W0(businessActivityFragment.u0().f28163u, businessActivityFragment.f12534r0);
                    businessActivityFragment.W0(businessActivityFragment.u0().f28168z, businessActivityFragment.f12533q0);
                    businessActivityFragment.X0(businessActivityFragment.u0().f28161s, businessActivityFragment.f12535t0);
                }
                return p.f3034a;
            case 11:
                Bundle bundle11 = (Bundle) obj2;
                if (!kotlin.jvm.internal.f.b((String) obj, "country")) {
                    return p.f3034a;
                }
                String string30 = bundle11.getString("selected_country");
                if (string30 == null) {
                    string30 = "";
                }
                EditCardSecurityVerificationFragment editCardSecurityVerificationFragment = (EditCardSecurityVerificationFragment) this.f409b;
                editCardSecurityVerificationFragment.f11748o0 = string30;
                editCardSecurityVerificationFragment.u0().f28625r.setText(s3.b.j("+", editCardSecurityVerificationFragment.f11748o0));
                Editable text3 = editCardSecurityVerificationFragment.u0().f28627t.getText();
                if (text3 == null || text3.length() == 0) {
                    editCardSecurityVerificationFragment.u0().f28626s.setError(null);
                } else {
                    editCardSecurityVerificationFragment.V0(String.valueOf(editCardSecurityVerificationFragment.u0().f28627t.getText()));
                    if (editCardSecurityVerificationFragment.f11750q0) {
                        editCardSecurityVerificationFragment.u0().f28626s.setError(null);
                    } else {
                        editCardSecurityVerificationFragment.u0().f28626s.setErrorWithoutFocus(editCardSecurityVerificationFragment.getString(R.string.invalid_phone));
                    }
                }
                Editable text4 = editCardSecurityVerificationFragment.u0().f28624q.getText();
                if (text4 == null || text4.length() == 0) {
                    editCardSecurityVerificationFragment.u0().f28623p.setError(null);
                } else {
                    editCardSecurityVerificationFragment.U0(String.valueOf(editCardSecurityVerificationFragment.u0().f28624q.getText()), true);
                }
                return p.f3034a;
            case 12:
                Bundle bundle12 = (Bundle) obj2;
                if (!kotlin.jvm.internal.f.b((String) obj, "position_in_company")) {
                    return p.f3034a;
                }
                String valueOf = String.valueOf(bundle12.getString("company_id"));
                ConfirmAddressCompanyFragment confirmAddressCompanyFragment = (ConfirmAddressCompanyFragment) this.f409b;
                confirmAddressCompanyFragment.f12550r0 = valueOf;
                if (valueOf.length() != 0) {
                    confirmAddressCompanyFragment.f12549q0 = true;
                }
                return p.f3034a;
            case 13:
                Bundle bundle13 = (Bundle) obj2;
                if (!kotlin.jvm.internal.f.b((String) obj, "additional_information")) {
                    return p.f3034a;
                }
                String valueOf2 = String.valueOf(bundle13.getString("company_id"));
                PositionInCompanyFragment positionInCompanyFragment = (PositionInCompanyFragment) this.f409b;
                positionInCompanyFragment.s0 = valueOf2;
                positionInCompanyFragment.f12624r0 = true;
                return p.f3034a;
            case 14:
                if (!kotlin.jvm.internal.f.b((String) obj, "edit")) {
                    return p.f3034a;
                }
                ((CardDetailsFragment) this.f409b).L0();
                return p.f3034a;
            case 15:
                Bundle bundle14 = (Bundle) obj2;
                if (!kotlin.jvm.internal.f.b((String) obj, "AddUBO")) {
                    return p.f3034a;
                }
                TeamMembersFragment teamMembersFragment = (TeamMembersFragment) this.f409b;
                com.luminary.business.presentation.ui.fragments.newcompany.teammembers.a aVar5 = teamMembersFragment.f12685p0;
                String str3 = aVar5 != null ? aVar5.f12700c : null;
                String string31 = bundle14.getString("MEMBER");
                String string32 = bundle14.getString("EMAIL");
                String string33 = bundle14.getString("FIRST_NAME");
                String str4 = string33 == null ? "" : string33;
                String string34 = bundle14.getString("LAST_NAME");
                String str5 = string34 == null ? "" : string34;
                String string35 = bundle14.getString("COMPANY_NAME");
                String str6 = string35 == null ? "" : string35;
                String string36 = bundle14.getString("COMPANY_NUMBER");
                String str7 = string36 == null ? "" : string36;
                String string37 = bundle14.getString("COUNTRY_OPERATION");
                String string38 = bundle14.getString("SHARED");
                ArrayList<String> stringArrayList = bundle14.getStringArrayList("POSITIONS");
                List c02 = stringArrayList != null ? s.c0(stringArrayList) : null;
                String string39 = bundle14.getString("COUNTRY_CITIZENSHIP");
                String string40 = bundle14.getString("COUNTRY_RESIDENCE");
                boolean z10 = bundle14.getBoolean("IS_PEP");
                boolean z11 = bundle14.getBoolean("IS_US");
                String string41 = bundle14.getString("SOURCE_OF_WEALTH");
                String string42 = bundle14.getString("LINK");
                if (Build.VERSION.SDK_INT >= 33) {
                    obj3 = bundle14.getSerializable("CURRICULUM_VITAE", UploadFileUI.class);
                } else {
                    Object serializable = bundle14.getSerializable("CURRICULUM_VITAE");
                    obj3 = (UploadFileUI) (!(serializable instanceof UploadFileUI) ? null : serializable);
                }
                UploadFileUI uploadFileUI = (UploadFileUI) obj3;
                String str8 = teamMembersFragment.f12686q0 == TeamMembersFragment.UBOType.f12694c ? "shareholder" : "ubo";
                if (string32 != null && string32.length() != 0 && string38 != null && string38.length() != 0 && ((((list = c02) != null && !list.isEmpty()) || (string37 != null && string37.length() != 0)) && str3 != null && str3.length() != 0)) {
                    if (string31 == null || string31.length() == 0) {
                        NewCompanyViewModel T04 = teamMembersFragment.T0();
                        if (c02 == null) {
                            c02 = EmptyList.f23104a;
                        }
                        D7.d dVar = new D7.d(T04, str3, new u5.b(new b.a(string32, str4, str5, str6, str7, string37, string39, string40, Boolean.valueOf(z10), Boolean.valueOf(z11), string41, string42), c02, str8, string38), uploadFileUI, 2);
                        T04.N0 = dVar;
                        dVar.invoke();
                    } else {
                        NewCompanyViewModel T05 = teamMembersFragment.T0();
                        if (c02 == null) {
                            c02 = EmptyList.f23104a;
                        }
                        E6.c cVar = new E6.c(T05, str3, string31, new u5.b(new b.a(string32, str4, str5, str6, str7, string37, string39, string40, Boolean.valueOf(z10), Boolean.valueOf(z11), string41, string42), c02, str8, string38), uploadFileUI, 1);
                        T05.f422O0 = cVar;
                        cVar.invoke();
                    }
                }
                return p.f3034a;
            case 16:
                Bundle bundle15 = (Bundle) obj2;
                if (!kotlin.jvm.internal.f.b((String) obj, "additional_document")) {
                    return p.f3034a;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    obj4 = bundle15.getSerializable("document", UploadFileUI.class);
                } else {
                    Object serializable2 = bundle15.getSerializable("document");
                    if (!(serializable2 instanceof UploadFileUI)) {
                        serializable2 = null;
                    }
                    obj4 = (UploadFileUI) serializable2;
                }
                UploadFileUI uploadFileUI2 = (UploadFileUI) obj4;
                UploadDocumentsFragment uploadDocumentsFragment = (UploadDocumentsFragment) this.f409b;
                if (uploadFileUI2 != null) {
                    uploadDocumentsFragment.f12732y0.add(uploadFileUI2);
                }
                uploadDocumentsFragment.U0();
                uploadDocumentsFragment.Y0();
                return p.f3034a;
            case 17:
                Bundle bundle16 = (Bundle) obj2;
                if (!kotlin.jvm.internal.f.b((String) obj, "signer")) {
                    return p.f3034a;
                }
                String string43 = bundle16.getString("signer_status");
                boolean b11 = kotlin.jvm.internal.f.b(string43, "PSI_REJECTED");
                PaymentDetailsFragment paymentDetailsFragment = (PaymentDetailsFragment) this.f409b;
                if (b11) {
                    paymentDetailsFragment.u0().f28759r.setVisibility(0);
                } else if (kotlin.jvm.internal.f.b(string43, "PSI_COMPLETED")) {
                    BottomDialogType.a aVar6 = BottomDialogType.f13289k;
                    paymentDetailsFragment.requireContext();
                    aVar6.getClass();
                    BottomDialogType d10 = BottomDialogType.a.d();
                    d10.f13295a = paymentDetailsFragment.getString(R.string.your_payment_was_successful, D9.b.o(paymentDetailsFragment.U0().f20568a.f11337h, paymentDetailsFragment.U0().f20568a.f11332c.toPlainString()), String.valueOf(paymentDetailsFragment.U0().f20568a.f11334e));
                    d10.f13297c = paymentDetailsFragment.getString(R.string.done);
                    o.b(paymentDetailsFragment.u0().f28759r);
                    paymentDetailsFragment.w0().c(d10, new e8.a(paymentDetailsFragment, 2), null);
                }
                return p.f3034a;
            case 18:
                Bundle bundle17 = (Bundle) obj2;
                if (!kotlin.jvm.internal.f.b((String) obj, "country")) {
                    return p.f3034a;
                }
                String string44 = bundle17.getString("selected_country");
                if (string44 == null) {
                    string44 = "";
                }
                NewPaymentSwiftBankInfoFragment newPaymentSwiftBankInfoFragment = (NewPaymentSwiftBankInfoFragment) this.f409b;
                newPaymentSwiftBankInfoFragment.f12835r0 = string44;
                String string45 = bundle17.getString("selected_country_code");
                newPaymentSwiftBankInfoFragment.s0 = string45 != null ? string45 : "";
                newPaymentSwiftBankInfoFragment.u0().f28942z.setText(newPaymentSwiftBankInfoFragment.f12835r0);
                PaymentUI paymentUI = newPaymentSwiftBankInfoFragment.f12834q0;
                if (paymentUI == null) {
                    paymentUI = null;
                }
                paymentUI.f11352x = newPaymentSwiftBankInfoFragment.s0;
                newPaymentSwiftBankInfoFragment.V0();
                return p.f3034a;
            case 19:
                Bundle bundle18 = (Bundle) obj2;
                if (!kotlin.jvm.internal.f.b((String) obj, "country")) {
                    return p.f3034a;
                }
                String string46 = bundle18.getString("selected_country");
                if (string46 == null) {
                    string46 = "";
                }
                NewPaymentToBankAccountBankInfoFragment newPaymentToBankAccountBankInfoFragment = (NewPaymentToBankAccountBankInfoFragment) this.f409b;
                newPaymentToBankAccountBankInfoFragment.f12872r0 = string46;
                String string47 = bundle18.getString("selected_country_code");
                newPaymentToBankAccountBankInfoFragment.s0 = string47 != null ? string47 : "";
                newPaymentToBankAccountBankInfoFragment.u0().f29059B.setText(newPaymentToBankAccountBankInfoFragment.f12872r0);
                PaymentUI paymentUI2 = newPaymentToBankAccountBankInfoFragment.f12871q0;
                if (paymentUI2 == null) {
                    paymentUI2 = null;
                }
                paymentUI2.f11352x = newPaymentToBankAccountBankInfoFragment.s0;
                newPaymentToBankAccountBankInfoFragment.W0();
                return p.f3034a;
            case 20:
                Bundle bundle19 = (Bundle) obj2;
                if (!kotlin.jvm.internal.f.b((String) obj, "country")) {
                    return p.f3034a;
                }
                String string48 = bundle19.getString("selected_country");
                if (string48 == null) {
                    string48 = "";
                }
                BuyExternalAccountDetailsFragment buyExternalAccountDetailsFragment = (BuyExternalAccountDetailsFragment) this.f409b;
                buyExternalAccountDetailsFragment.f11955q0 = string48;
                String string49 = bundle19.getString("selected_country_code");
                if (string49 == null) {
                    string49 = "";
                }
                buyExternalAccountDetailsFragment.f11956r0 = string49;
                buyExternalAccountDetailsFragment.u0().f28259r.setText(buyExternalAccountDetailsFragment.f11955q0);
                if (buyExternalAccountDetailsFragment.T0().f21501W0.getValue() != null) {
                    buyExternalAccountDetailsFragment.T0().f21501W0.getValue().f11009B = buyExternalAccountDetailsFragment.f11956r0;
                    C0830e T06 = buyExternalAccountDetailsFragment.T0();
                    String str9 = buyExternalAccountDetailsFragment.f11956r0;
                    A7.c cVar2 = new A7.c(18, T06, str9 != null ? str9 : "");
                    T06.f419K0 = cVar2;
                    cVar2.invoke();
                } else {
                    final C0830e T07 = buyExternalAccountDetailsFragment.T0();
                    com.luminary.business.presentation.ui.fragments.crypto.buy_external_account.a aVar7 = buyExternalAccountDetailsFragment.f11954p0;
                    final Long l11 = (aVar7 == null || (cryptoAccountDomain = aVar7.f11962a) == null) ? null : cryptoAccountDomain.f10963a;
                    final String str10 = (aVar7 == null || (str2 = aVar7.f11964c) == null) ? "" : str2;
                    final String str11 = (aVar7 == null || (str = aVar7.f11965d) == null) ? "" : str;
                    final Float valueOf3 = aVar7 != null ? Float.valueOf(aVar7.f11967f) : null;
                    final String str12 = buyExternalAccountDetailsFragment.f11956r0;
                    InterfaceC0635a<p> interfaceC0635a2 = new InterfaceC0635a() { // from class: i7.c

                        /* renamed from: f, reason: collision with root package name */
                        public final /* synthetic */ boolean f21492f;

                        /* renamed from: g, reason: collision with root package name */
                        public final /* synthetic */ CryptoExchangeCreateRequestDomain.ExternalAccountRequisitesDomain f21493g;
                        public final /* synthetic */ Boolean i;

                        /* renamed from: j, reason: collision with root package name */
                        public final /* synthetic */ String f21495j;

                        {
                            Boolean bool = Boolean.FALSE;
                            this.f21492f = true;
                            this.f21493g = null;
                            this.i = bool;
                            this.f21495j = null;
                        }

                        @Override // ca.InterfaceC0635a
                        public final Object invoke() {
                            String plainString;
                            String I10;
                            C0830e c0830e = T07;
                            c0830e.l();
                            int h10 = c0830e.f21498T0.h();
                            Float f10 = valueOf3;
                            String str13 = str10;
                            c0830e.f21500V0.a(new C0829d(c0830e, 2), new Pair(Integer.valueOf(h10), new CryptoExchangeCreateRequestDomain(str13, str11, (f10 == null || (plainString = new BigDecimal(String.valueOf(f10.floatValue())).toPlainString()) == null || (I10 = D9.b.I(plainString, str13)) == null) ? null : D9.b.r0(I10), l11, null, null, null, Boolean.valueOf(this.f21492f), this.f21493g, str12, this.i, this.f21495j)));
                            return p.f3034a;
                        }
                    };
                    T07.f420L0 = interfaceC0635a2;
                    interfaceC0635a2.invoke();
                }
                return p.f3034a;
            case 21:
                Bundle bundle20 = (Bundle) obj2;
                if (!kotlin.jvm.internal.f.b((String) obj, "signer")) {
                    return p.f3034a;
                }
                String string50 = bundle20.getString("signer_status");
                boolean b12 = kotlin.jvm.internal.f.b(string50, "PSI_REJECTED");
                CreateExchangeDetailsFragment createExchangeDetailsFragment = (CreateExchangeDetailsFragment) this.f409b;
                if (b12) {
                    BottomDialogType.a aVar8 = BottomDialogType.f13289k;
                    createExchangeDetailsFragment.requireContext();
                    aVar8.getClass();
                    BottomDialogType b13 = BottomDialogType.a.b();
                    b13.f13295a = createExchangeDetailsFragment.getString(R.string.time_expired);
                    b13.f13297c = createExchangeDetailsFragment.getString(R.string.done);
                    createExchangeDetailsFragment.w0().c(b13, new g(12), null);
                } else if (kotlin.jvm.internal.f.b(string50, "PSI_COMPLETED")) {
                    createExchangeDetailsFragment.U0();
                }
                return p.f3034a;
            case 22:
                checkContext$lambda$0 = SafeCollector_commonKt.checkContext$lambda$0((SafeCollector) this.f409b, ((Integer) obj).intValue(), (d.b) obj2);
                return Integer.valueOf(checkContext$lambda$0);
            case 23:
                asDeferred$lambda$5 = FutureKt.asDeferred$lambda$5((CompletableDeferred) this.f409b, obj, (Throwable) obj2);
                return asDeferred$lambda$5;
            case 24:
                Bundle bundle21 = (Bundle) obj2;
                if (!kotlin.jvm.internal.f.b((String) obj, "signer")) {
                    return p.f3034a;
                }
                String string51 = bundle21.getString("signer_status");
                if (kotlin.jvm.internal.f.b(string51, "PSI_REJECTED")) {
                    BottomDialogType.a aVar9 = BottomDialogType.f13289k;
                    CryptoExchangeFragment cryptoExchangeFragment = (CryptoExchangeFragment) this.f409b;
                    cryptoExchangeFragment.requireContext();
                    aVar9.getClass();
                    BottomDialogType b14 = BottomDialogType.a.b();
                    b14.f13295a = cryptoExchangeFragment.getString(R.string.time_expired);
                    b14.f13297c = cryptoExchangeFragment.getString(R.string.done);
                    cryptoExchangeFragment.w0().c(b14, new g(15), null);
                } else {
                    kotlin.jvm.internal.f.b(string51, "PSI_COMPLETED");
                }
                return p.f3034a;
            case 25:
                int intValue = ((Integer) obj).intValue();
                final boolean booleanValue = ((Boolean) obj2).booleanValue();
                if (intValue == 2) {
                    final SettingsFragment settingsFragment = (SettingsFragment) this.f409b;
                    settingsFragment.getClass();
                    if (System.currentTimeMillis() - settingsFragment.f12992z0 >= 1000 && booleanValue != settingsFragment.T0().f12999T0.M()) {
                        BottomDialogType.f13289k.getClass();
                        BottomDialogType c2 = BottomDialogType.a.c();
                        c2.f13295a = booleanValue ? settingsFragment.getString(R.string.would_you_like_to_activate_touch_id) : settingsFragment.getString(R.string.would_you_like_to_de_activate_touch_id);
                        c2.f13297c = settingsFragment.getString(R.string.yes_proceed);
                        c2.f13299e = settingsFragment.getString(R.string.no);
                        c2.f13300f = booleanValue ? Integer.valueOf(R.drawable.img_bio_active) : Integer.valueOf(R.drawable.img_bio_de_activated);
                        settingsFragment.w0().c(c2, new InterfaceC0635a() { // from class: m8.h
                            @Override // ca.InterfaceC0635a
                            public final Object invoke() {
                                boolean z12 = booleanValue;
                                SettingsFragment settingsFragment2 = settingsFragment;
                                if (!z12) {
                                    settingsFragment2.T0().f12999T0.m();
                                } else if (!settingsFragment2.T0().f12999T0.M()) {
                                    Executor mainExecutor = C0913a.getMainExecutor(settingsFragment2.requireContext());
                                    settingsFragment2.getClass();
                                    if (mainExecutor == null) {
                                        mainExecutor = null;
                                    }
                                    i iVar2 = new i(settingsFragment2);
                                    q.i iVar3 = new q.i();
                                    if (mainExecutor == null) {
                                        throw new IllegalArgumentException("Executor must not be null.");
                                    }
                                    FragmentManager childFragmentManager = settingsFragment2.getChildFragmentManager();
                                    R0.e eVar = new R0.e(settingsFragment2.getViewModelStore(), settingsFragment2.getDefaultViewModelProviderFactory(), settingsFragment2.getDefaultViewModelCreationExtras());
                                    kotlin.jvm.internal.b a10 = kotlin.jvm.internal.h.a(q.k.class);
                                    String b15 = a10.b();
                                    if (b15 == null) {
                                        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
                                    }
                                    q.k kVar = (q.k) eVar.a(a10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b15));
                                    settingsFragment2.getLifecycle().a(new i.e(kVar));
                                    iVar3.f25772b = false;
                                    iVar3.f25771a = childFragmentManager;
                                    kVar.f25809k = mainExecutor;
                                    kVar.f25810p = iVar2;
                                    settingsFragment2.f12983p0 = iVar3;
                                    i.d.a aVar10 = new i.d.a();
                                    aVar10.f25783a = "Biometric login for my app";
                                    aVar10.f25784b = "Log in using your biometric credential";
                                    aVar10.f25785c = settingsFragment2.getString(R.string.cancel);
                                    i.d a11 = aVar10.a();
                                    q.i iVar4 = settingsFragment2.f12983p0;
                                    (iVar4 != null ? iVar4 : null).a(a11);
                                }
                                return p.f3034a;
                            }
                        }, new m8.e(settingsFragment, 6));
                    }
                }
                return p.f3034a;
            case 26:
                return a(obj, obj2);
            case 27:
                return b(obj, obj2);
            default:
                Bundle bundle22 = (Bundle) obj2;
                if (!kotlin.jvm.internal.f.b((String) obj, "withdraw")) {
                    return p.f3034a;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    obj5 = bundle22.getSerializable("wallet", CryptowalletDomain.class);
                } else {
                    Object serializable3 = bundle22.getSerializable("wallet");
                    if (!(serializable3 instanceof CryptowalletDomain)) {
                        serializable3 = null;
                    }
                    obj5 = (CryptowalletDomain) serializable3;
                }
                CryptowalletDomain cryptowalletDomain = (CryptowalletDomain) obj5;
                Integer valueOf4 = (cryptowalletDomain == null || (l10 = cryptowalletDomain.f11072a) == null) ? null : Integer.valueOf((int) l10.longValue());
                WithdrawCryptoFragment withdrawCryptoFragment = (WithdrawCryptoFragment) this.f409b;
                withdrawCryptoFragment.s0 = valueOf4;
                withdrawCryptoFragment.f12191u0 = cryptowalletDomain != null ? cryptowalletDomain.f11074c : null;
                withdrawCryptoFragment.u0().f27759w.setDisplayedChild(1);
                withdrawCryptoFragment.T0();
                withdrawCryptoFragment.U0();
                return p.f3034a;
        }
    }
}
