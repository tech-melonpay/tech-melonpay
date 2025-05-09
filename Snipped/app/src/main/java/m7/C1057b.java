package m7;

import C.v;
import F8.o;
import J5.b;
import O9.p;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannedString;
import androidx.navigation.NavController;
import ca.InterfaceC0646l;
import com.luminary.business.domain.entity.account.BankAccountDomain;
import com.luminary.business.domain.entity.cryptoaccount.CryptoAccountDomain;
import com.luminary.business.domain.entity.cryptowallet.CryptoExchangeDomain;
import com.luminary.business.domain.entity.payments.Confirmation;
import com.luminary.business.domain.entity.payments.QRCode;
import com.luminary.business.presentation.entity.payment.SignerUI;
import com.luminary.business.presentation.ui.fragments.crypto.crypto_exchange.CryptoExchangeFragment;
import com.luminary.business.presentation.ui.fragments.statements.StatementsSelectorDialog;
import com.luminary.mobile.R;
import java.io.Serializable;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ka.C0966k;
import kotlin.Pair;
import t6.E3;
import v5.C1545a;
import w5.C1572a;

/* compiled from: R8$$SyntheticClass */
/* renamed from: m7.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1057b implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23958a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CryptoExchangeFragment f23959b;

    public /* synthetic */ C1057b(CryptoExchangeFragment cryptoExchangeFragment, int i) {
        this.f23958a = i;
        this.f23959b = cryptoExchangeFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        Integer g10;
        Object obj2;
        Integer g11;
        Object obj3;
        QRCode qRCode;
        QRCode qRCode2;
        Object obj4;
        String str;
        Integer z10;
        Object obj5;
        String str2;
        String str3;
        Integer z11;
        String plainString;
        String I10;
        switch (this.f23958a) {
            case 0:
                CryptoExchangeDomain cryptoExchangeDomain = (CryptoExchangeDomain) obj;
                CryptoExchangeFragment cryptoExchangeFragment = this.f23959b;
                DecimalFormat decimalFormat = new DecimalFormat((K3.a.c(cryptoExchangeFragment.f12021E0) && K3.a.c(cryptoExchangeFragment.f12022F0)) ? "#.###" : "#.######");
                String str4 = cryptoExchangeDomain.f11027l;
                if (str4 == null) {
                    str4 = "";
                }
                String o10 = D9.b.o(str4, "1");
                String str5 = cryptoExchangeDomain.f11028m;
                String str6 = str5 != null ? str5 : "";
                Double d10 = cryptoExchangeDomain.f11025j;
                String p10 = v.p(o10, " = ", D9.b.o(str6, decimalFormat.format(d10)));
                cryptoExchangeFragment.f12034r0 = d10;
                cryptoExchangeFragment.u0().f27784r.setText(p10);
                Double R = C0966k.R(D9.b.r0(String.valueOf(cryptoExchangeFragment.u0().f27787u.getText())));
                Double d11 = cryptoExchangeFragment.f12034r0;
                cryptoExchangeFragment.X0(Double.valueOf((d11 != null ? d11.doubleValue() : 0.0d) * (R != null ? R.doubleValue() : 0.0d)));
                cryptoExchangeFragment.u0().f27780n.setClickable(true);
                cryptoExchangeFragment.u0().f27781o.setClickable(cryptoExchangeFragment.u0().f27780n.isClickable());
                return p.f3034a;
            case 1:
                List list = (List) obj;
                if (list == null) {
                    return p.f3034a;
                }
                CryptoExchangeFragment cryptoExchangeFragment2 = this.f23959b;
                cryptoExchangeFragment2.s0.clear();
                List list2 = list;
                ArrayList arrayList = new ArrayList();
                for (Object obj6 : list2) {
                    if (((BankAccountDomain) obj6).i != null) {
                        arrayList.add(obj6);
                    }
                }
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        if (kotlin.jvm.internal.f.b(cryptoExchangeFragment2.f12019C0, Boolean.FALSE)) {
                            if (K3.a.c(cryptoExchangeFragment2.f12021E0)) {
                                if (cryptoExchangeFragment2.f12038w0 == null) {
                                    Iterator it2 = list2.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            obj3 = it2.next();
                                            if (kotlin.jvm.internal.f.b(cryptoExchangeFragment2.f12021E0, ((BankAccountDomain) obj3).f10701h)) {
                                            }
                                        } else {
                                            obj3 = null;
                                        }
                                    }
                                    cryptoExchangeFragment2.f12038w0 = (BankAccountDomain) obj3;
                                }
                                BankAccountDomain bankAccountDomain = cryptoExchangeFragment2.f12038w0;
                                if (bankAccountDomain != null && (g11 = F8.b.g(bankAccountDomain, cryptoExchangeFragment2.requireContext())) != null) {
                                    cryptoExchangeFragment2.u0().f27788v.setImageResource(g11.intValue());
                                }
                                E3 u02 = cryptoExchangeFragment2.u0();
                                BankAccountDomain bankAccountDomain2 = cryptoExchangeFragment2.f12038w0;
                                u02.f27787u.setCurrency(bankAccountDomain2 != null ? K3.a.a(bankAccountDomain2.f10701h) : "");
                                E3 u03 = cryptoExchangeFragment2.u0();
                                BankAccountDomain bankAccountDomain3 = cryptoExchangeFragment2.f12038w0;
                                u03.f27787u.setCurrencyNameToInput(bankAccountDomain3 != null ? bankAccountDomain3.f10701h : null);
                                E3 u04 = cryptoExchangeFragment2.u0();
                                BankAccountDomain bankAccountDomain4 = cryptoExchangeFragment2.f12038w0;
                                u04.f27776C.setText(cryptoExchangeFragment2.getString(R.string.balance, bankAccountDomain4 != null ? F8.b.f(bankAccountDomain4) : null));
                            }
                            if (K3.a.c(cryptoExchangeFragment2.f12022F0)) {
                                if (cryptoExchangeFragment2.f12041z0 == null) {
                                    Iterator it3 = list2.iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            obj2 = it3.next();
                                            if (kotlin.jvm.internal.f.b(cryptoExchangeFragment2.f12022F0, ((BankAccountDomain) obj2).f10701h)) {
                                            }
                                        } else {
                                            obj2 = null;
                                        }
                                    }
                                    cryptoExchangeFragment2.f12041z0 = (BankAccountDomain) obj2;
                                }
                                BankAccountDomain bankAccountDomain5 = cryptoExchangeFragment2.f12041z0;
                                if (bankAccountDomain5 != null && (g10 = F8.b.g(bankAccountDomain5, cryptoExchangeFragment2.requireContext())) != null) {
                                    cryptoExchangeFragment2.u0().f27789w.setImageResource(g10.intValue());
                                }
                                E3 u05 = cryptoExchangeFragment2.u0();
                                BankAccountDomain bankAccountDomain6 = cryptoExchangeFragment2.f12041z0;
                                u05.f27775B.setCurrency(bankAccountDomain6 != null ? K3.a.a(bankAccountDomain6.f10701h) : "");
                                E3 u06 = cryptoExchangeFragment2.u0();
                                BankAccountDomain bankAccountDomain7 = cryptoExchangeFragment2.f12041z0;
                                u06.f27775B.setCurrencyNameToInput(bankAccountDomain7 != null ? bankAccountDomain7.f10701h : null);
                                cryptoExchangeFragment2.b1();
                            }
                        }
                        cryptoExchangeFragment2.Z0();
                        return p.f3034a;
                    }
                    BankAccountDomain bankAccountDomain8 = (BankAccountDomain) it.next();
                    ArrayList arrayList2 = cryptoExchangeFragment2.s0;
                    String str7 = bankAccountDomain8.i;
                    String str8 = str7 == null ? "" : str7;
                    String str9 = bankAccountDomain8.f10701h;
                    arrayList2.add(new StatementsSelectorDialog.a(str8, D9.b.D(str9), str9 == null ? "" : str9, F8.b.b(bankAccountDomain8), F8.b.c(bankAccountDomain8), null, bankAccountDomain8.f10701h, bankAccountDomain8.f10694a, false, 288));
                }
                break;
            case 2:
                v5.b bVar = (v5.b) obj;
                if (bVar == null) {
                    return p.f3034a;
                }
                F5.b bVar2 = bVar.f30604b;
                String str10 = bVar2 != null ? bVar2.f1176F : null;
                CryptoExchangeFragment cryptoExchangeFragment3 = this.f23959b;
                if (str10 == null) {
                    U4.b.g(cryptoExchangeFragment3).l();
                } else {
                    String str11 = bVar2.f1188a;
                    Confirmation confirmation = bVar2.f1180J;
                    Parcelable signerUI = new SignerUI(str11, bVar2.f1176F, (confirmation == null || (qRCode2 = confirmation.f11095b) == null) ? null : qRCode2.f11129a, (confirmation == null || (qRCode = confirmation.f11095b) == null) ? null : qRCode.f11131c);
                    NavController g12 = U4.b.g(cryptoExchangeFragment3);
                    Bundle g13 = v.g(g12);
                    if (Parcelable.class.isAssignableFrom(SignerUI.class)) {
                        g13.putParcelable("signer", signerUI);
                    } else {
                        if (!Serializable.class.isAssignableFrom(SignerUI.class)) {
                            throw new UnsupportedOperationException(SignerUI.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                        }
                        g13.putSerializable("signer", (Serializable) signerUI);
                    }
                    g12.i(R.id.action_cryptoExchangeFragment_to_timerFragment, g13);
                }
                cryptoExchangeFragment3.a1().f24004Z0.postValue(null);
                return p.f3034a;
            case 3:
                List list3 = (List) obj;
                if (list3 == null) {
                    return p.f3034a;
                }
                CryptoExchangeFragment cryptoExchangeFragment4 = this.f23959b;
                cryptoExchangeFragment4.f12037v0.clear();
                List list4 = list3;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj7 : list4) {
                    CryptoAccountDomain cryptoAccountDomain = (CryptoAccountDomain) obj7;
                    if (cryptoAccountDomain.f10969g != null) {
                        if (cryptoAccountDomain.f10967e != CryptoAccountDomain.WalletStatus.f10985h) {
                            arrayList3.add(obj7);
                        }
                    }
                }
                Iterator it4 = arrayList3.iterator();
                while (true) {
                    boolean hasNext = it4.hasNext();
                    O9.f fVar = cryptoExchangeFragment4.f12032p0;
                    Integer num = null;
                    if (!hasNext) {
                        if (D9.b.Z(cryptoExchangeFragment4.f12021E0)) {
                            Iterator it5 = list4.iterator();
                            while (true) {
                                if (it5.hasNext()) {
                                    obj5 = it5.next();
                                    if (kotlin.jvm.internal.f.b(((CryptoAccountDomain) obj5).f10969g, cryptoExchangeFragment4.f12021E0)) {
                                    }
                                } else {
                                    obj5 = null;
                                }
                            }
                            CryptoAccountDomain cryptoAccountDomain2 = (CryptoAccountDomain) obj5;
                            cryptoExchangeFragment4.f12039x0 = cryptoAccountDomain2;
                            if (cryptoAccountDomain2 != null && (str3 = cryptoAccountDomain2.f10969g) != null && (z11 = D9.b.z(str3)) != null) {
                                cryptoExchangeFragment4.u0().f27788v.setImageResource(z11.intValue());
                            }
                            E3 u07 = cryptoExchangeFragment4.u0();
                            CryptoAccountDomain cryptoAccountDomain3 = cryptoExchangeFragment4.f12039x0;
                            u07.f27787u.setCurrencyNameToInput(cryptoAccountDomain3 != null ? cryptoAccountDomain3.f10969g : null);
                            E3 u08 = cryptoExchangeFragment4.u0();
                            CryptoAccountDomain cryptoAccountDomain4 = cryptoExchangeFragment4.f12039x0;
                            if (cryptoAccountDomain4 != null) {
                                K5.a aVar = (K5.a) fVar.getValue();
                                CryptoAccountDomain cryptoAccountDomain5 = cryptoExchangeFragment4.f12039x0;
                                str2 = cryptoAccountDomain4.c(aVar.Q(cryptoAccountDomain5 != null ? cryptoAccountDomain5.f10969g : null));
                            } else {
                                str2 = null;
                            }
                            u08.f27776C.setText(cryptoExchangeFragment4.getString(R.string.balance, str2));
                        }
                        if (D9.b.Z(cryptoExchangeFragment4.f12022F0)) {
                            Iterator it6 = list4.iterator();
                            while (true) {
                                if (it6.hasNext()) {
                                    obj4 = it6.next();
                                    if (kotlin.jvm.internal.f.b(((CryptoAccountDomain) obj4).f10969g, cryptoExchangeFragment4.f12022F0)) {
                                    }
                                } else {
                                    obj4 = null;
                                }
                            }
                            CryptoAccountDomain cryptoAccountDomain6 = (CryptoAccountDomain) obj4;
                            cryptoExchangeFragment4.f12017A0 = cryptoAccountDomain6;
                            if (cryptoAccountDomain6 != null && (str = cryptoAccountDomain6.f10969g) != null && (z10 = D9.b.z(str)) != null) {
                                cryptoExchangeFragment4.u0().f27789w.setImageResource(z10.intValue());
                            }
                            E3 u09 = cryptoExchangeFragment4.u0();
                            CryptoAccountDomain cryptoAccountDomain7 = cryptoExchangeFragment4.f12017A0;
                            u09.f27775B.setCurrencyNameToInput(cryptoAccountDomain7 != null ? cryptoAccountDomain7.f10969g : null);
                            cryptoExchangeFragment4.b1();
                        }
                        cryptoExchangeFragment4.Z0();
                        return p.f3034a;
                    }
                    CryptoAccountDomain cryptoAccountDomain8 = (CryptoAccountDomain) it4.next();
                    ArrayList arrayList4 = cryptoExchangeFragment4.f12037v0;
                    String str12 = cryptoAccountDomain8.f10969g;
                    String str13 = str12 == null ? "" : str12;
                    String G02 = D9.b.G0(str12, cryptoAccountDomain8.f10968f);
                    String str14 = cryptoAccountDomain8.f10969g;
                    String str15 = str14 == null ? "" : str14;
                    String a10 = cryptoAccountDomain8.a();
                    String b9 = cryptoAccountDomain8.b(((K5.a) fVar.getValue()).Q(str14));
                    SpannedString a11 = defpackage.a.a(cryptoAccountDomain8, 15, 10);
                    Long l10 = cryptoAccountDomain8.f10963a;
                    if (l10 != null) {
                        num = Integer.valueOf((int) l10.longValue());
                    }
                    arrayList4.add(new StatementsSelectorDialog.a(str13, G02, str15, a10, b9, a11, cryptoAccountDomain8.f10969g, num, false, 256));
                }
                break;
            case 4:
                C1545a c1545a = (C1545a) obj;
                if (c1545a == null) {
                    return p.f3034a;
                }
                CryptoExchangeFragment cryptoExchangeFragment5 = this.f23959b;
                cryptoExchangeFragment5.f12036u0.clear();
                List<C1572a> list5 = c1545a.f30602b;
                ArrayList arrayList5 = new ArrayList();
                for (Object obj8 : list5) {
                    if (((C1572a) obj8).f30827b != null) {
                        arrayList5.add(obj8);
                    }
                }
                Iterator it7 = arrayList5.iterator();
                while (it7.hasNext()) {
                    C1572a c1572a = (C1572a) it7.next();
                    ArrayList arrayList6 = cryptoExchangeFragment5.f12036u0;
                    String str16 = c1572a.f30827b;
                    String str17 = str16 == null ? "" : str16;
                    String str18 = c1572a.f30830e;
                    arrayList6.add(new StatementsSelectorDialog.a(str17, str18 == null ? "" : str18, str16 == null ? "" : str16, "", "", null, str16, null, false, 416));
                }
                ArrayList arrayList7 = cryptoExchangeFragment5.f12035t0;
                arrayList7.clear();
                Iterator<T> it8 = c1545a.f30601a.iterator();
                while (it8.hasNext()) {
                    String str19 = ((C1572a) it8.next()).f30827b;
                    if (str19 != null) {
                        arrayList7.add(new StatementsSelectorDialog.a(str19, D9.b.A(str19), str19, "", "", null, str19, null, false, 416));
                    }
                }
                return p.f3034a;
            case 5:
                Pair pair = (Pair) obj;
                boolean booleanValue = ((Boolean) pair.f23089a).booleanValue();
                b.a aVar2 = (b.a) pair.f23090b;
                CryptoExchangeFragment cryptoExchangeFragment6 = this.f23959b;
                cryptoExchangeFragment6.c1(booleanValue, aVar2);
                cryptoExchangeFragment6.u0().f27785s.setTextColor(cryptoExchangeFragment6.getResources().getColor(R.color.middle_gray, null));
                cryptoExchangeFragment6.f12023G0 = null;
                cryptoExchangeFragment6.f12024H0 = "";
                cryptoExchangeFragment6.f12034r0 = null;
                cryptoExchangeFragment6.f1();
                return p.f3034a;
            case 6:
                String str20 = (String) obj;
                if (str20 == null || str20.length() == 0) {
                    return p.f3034a;
                }
                CryptoExchangeFragment cryptoExchangeFragment7 = this.f23959b;
                cryptoExchangeFragment7.u0().f27777D.setVisibility(0);
                cryptoExchangeFragment7.u0().f27777D.setText(str20);
                DecimalFormat decimalFormat2 = new DecimalFormat((K3.a.c(cryptoExchangeFragment7.f12021E0) && K3.a.c(cryptoExchangeFragment7.f12022F0)) ? "0.000" : "0.000000");
                String o11 = D9.b.o(cryptoExchangeFragment7.f12021E0, "1");
                String str21 = cryptoExchangeFragment7.f12022F0;
                if (str21 == null) {
                    str21 = "";
                }
                cryptoExchangeFragment7.u0().f27784r.setText(v.p(o11, " = ", D9.b.o(str21, decimalFormat2.format(0L))));
                cryptoExchangeFragment7.u0().f27785s.setText(cryptoExchangeFragment7.getString(R.string.fee_value, "0.00"));
                cryptoExchangeFragment7.f12023G0 = null;
                cryptoExchangeFragment7.f12024H0 = "";
                cryptoExchangeFragment7.f12034r0 = null;
                cryptoExchangeFragment7.a1().f24011g1.postValue(null);
                return p.f3034a;
            case 7:
                return Boolean.valueOf(kotlin.jvm.internal.f.b(((StatementsSelectorDialog.a) obj).f13058g, this.f23959b.f12022F0));
            case 8:
                return Boolean.valueOf(kotlin.jvm.internal.f.b(((StatementsSelectorDialog.a) obj).f13058g, this.f23959b.f12021E0));
            default:
                v5.h hVar = (v5.h) obj;
                CryptoExchangeFragment cryptoExchangeFragment8 = this.f23959b;
                o.b(cryptoExchangeFragment8.u0().f27777D);
                DecimalFormat decimalFormat3 = new DecimalFormat((K3.a.c(cryptoExchangeFragment8.f12021E0) && K3.a.c(cryptoExchangeFragment8.f12022F0)) ? "#.###" : "#.######");
                String str22 = hVar.f30636a;
                String str23 = "";
                if (str22 == null) {
                    str22 = "";
                }
                String o12 = D9.b.o(str22, "1");
                String str24 = hVar.f30637b;
                if (str24 == null) {
                    str24 = "";
                }
                Double d12 = hVar.f30644j;
                String p11 = v.p(o12, " = ", D9.b.o(str24, decimalFormat3.format(d12)));
                cryptoExchangeFragment8.f12034r0 = d12;
                cryptoExchangeFragment8.u0().f27784r.setText(p11);
                boolean a12 = kotlin.jvm.internal.f.a(C0966k.R(D9.b.r0(String.valueOf(cryptoExchangeFragment8.u0().f27787u.getText()))));
                Double d13 = hVar.f30640e;
                if (a12) {
                    cryptoExchangeFragment8.X0(Double.valueOf(0.0d));
                } else {
                    cryptoExchangeFragment8.X0(d13);
                }
                Double d14 = hVar.i;
                cryptoExchangeFragment8.f12023G0 = Float.valueOf(d14 != null ? (float) d14.doubleValue() : 0.0f);
                cryptoExchangeFragment8.Y0(hVar.f30643h, d14, hVar.f30642g);
                cryptoExchangeFragment8.f1();
                if (d13 != null) {
                    double doubleValue = d13.doubleValue();
                    Double d15 = hVar.f30645k;
                    Double d16 = hVar.f30639d;
                    if (doubleValue >= 0.0d || kotlin.jvm.internal.f.a(d16)) {
                        if ((d16 != null ? d16.doubleValue() : 0.0d) >= (d15 != null ? d15.doubleValue() : 0.0d) || kotlin.jvm.internal.f.a(d16)) {
                            cryptoExchangeFragment8.d1(null, false);
                            cryptoExchangeFragment8.u0().f27785s.setTextColor(cryptoExchangeFragment8.getResources().getColor(R.color.middle_gray, null));
                        }
                    }
                    String str25 = cryptoExchangeFragment8.f12024H0;
                    if (d15 != null && (plainString = new BigDecimal(String.valueOf(d15.doubleValue())).toPlainString()) != null && (I10 = D9.b.I(plainString, cryptoExchangeFragment8.f12024H0)) != null) {
                        str23 = I10;
                    }
                    cryptoExchangeFragment8.d1(D9.b.o(str25, str23), true);
                    cryptoExchangeFragment8.X0(d13);
                    cryptoExchangeFragment8.u0().f27785s.setTextColor(cryptoExchangeFragment8.getResources().getColor(R.color.error, null));
                    cryptoExchangeFragment8.u0().f27780n.setEnabled(false);
                    cryptoExchangeFragment8.u0().f27781o.setEnabled(cryptoExchangeFragment8.u0().f27780n.isEnabled());
                }
                cryptoExchangeFragment8.u0().f27780n.setClickable(true);
                cryptoExchangeFragment8.u0().f27781o.setClickable(cryptoExchangeFragment8.u0().f27780n.isClickable());
                return p.f3034a;
        }
    }
}
