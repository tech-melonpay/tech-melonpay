package n7;

import C.v;
import D8.a;
import O9.p;
import P9.s;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.NavController;
import ca.InterfaceC0646l;
import com.luminary.business.domain.entity.cryptoaccount.CryptoAccountDomain;
import com.luminary.business.domain.entity.cryptowallet.CryptowalletDomain;
import com.luminary.business.presentation.ui.fragments.crypto.crypto_wallet_list.CryptoListFragment;
import com.luminary.business.presentation.utils.bottomDialog.BottomDialogType;
import com.luminary.mobile.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import t6.I3;
import v5.C1545a;
import w5.C1572a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24250a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CryptoListFragment f24251b;

    public /* synthetic */ b(CryptoListFragment cryptoListFragment, int i) {
        this.f24250a = i;
        this.f24251b = cryptoListFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        C1572a c1572a;
        String str;
        ArrayList<String> arrayList;
        ArrayList<String> arrayList2;
        List<C1572a> list;
        Object obj2;
        CryptowalletDomain cryptowalletDomain;
        Object obj3;
        switch (this.f24250a) {
            case 0:
                this.f24251b.getClass();
                return p.f3034a;
            case 1:
                String str2 = (String) obj;
                CryptoListFragment cryptoListFragment = this.f24251b;
                cryptoListFragment.u0().f28004v.setText(str2);
                cryptoListFragment.f12073y0 = str2;
                cryptoListFragment.W0();
                return p.f3034a;
            case 2:
                String str3 = (String) obj;
                CryptoListFragment cryptoListFragment2 = this.f24251b;
                cryptoListFragment2.u0().f27999q.setText("       ".concat(str3));
                Integer z10 = D9.b.z(str3);
                if (z10 != null) {
                    cryptoListFragment2.u0().f28003u.setImageResource(z10.intValue());
                }
                C1545a value = cryptoListFragment2.U0().f24283a1.getValue();
                String str4 = null;
                if (value == null || (list = value.f30602b) == null) {
                    c1572a = null;
                } else {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            if (kotlin.jvm.internal.f.b(((C1572a) obj2).f30827b, str3)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    c1572a = (C1572a) obj2;
                }
                cryptoListFragment2.f12072x0 = c1572a != null ? c1572a.f30827b : null;
                if (c1572a != null && (arrayList2 = c1572a.f30829d) != null) {
                    str4 = (String) s.L(arrayList2);
                }
                cryptoListFragment2.f12073y0 = str4;
                I3 u02 = cryptoListFragment2.u0();
                if (c1572a == null || (arrayList = c1572a.f30829d) == null || (str = (String) s.L(arrayList)) == null) {
                    str = "";
                }
                u02.f28004v.setText(str);
                cryptoListFragment2.W0();
                return p.f3034a;
            case 3:
                CryptoListFragment cryptoListFragment3 = this.f24251b;
                cryptoListFragment3.getClass();
                BottomDialogType.f13289k.getClass();
                BottomDialogType a10 = BottomDialogType.a.a();
                a10.f13295a = cryptoListFragment3.getString(R.string.we_are_verifying_your_address);
                a10.f13301g = BottomDialogType.Type.CLOCK;
                a10.f13297c = cryptoListFragment3.getString(R.string.done);
                a.C0010a.a(cryptoListFragment3.w0(), a10, new d(cryptoListFragment3, 0), 4);
                return p.f3034a;
            case 4:
                int intValue = ((Integer) obj).intValue();
                CryptoListFragment cryptoListFragment4 = this.f24251b;
                List<CryptowalletDomain> value2 = cryptoListFragment4.U0().f24281Y0.getValue();
                CryptoAccountDomain cryptoAccountDomain = null;
                if (value2 != null) {
                    Iterator<T> it2 = value2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj3 = it2.next();
                            Long l10 = ((CryptowalletDomain) obj3).f11072a;
                            if (l10 == null || intValue != ((int) l10.longValue())) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    cryptowalletDomain = (CryptowalletDomain) obj3;
                } else {
                    cryptowalletDomain = null;
                }
                if (cryptowalletDomain != null) {
                    boolean z11 = cryptoListFragment4.f12067r0;
                    String str5 = cryptowalletDomain.f11077f;
                    String str6 = cryptowalletDomain.f11078g;
                    if (z11) {
                        List<CryptoAccountDomain> value3 = cryptoListFragment4.U0().f24282Z0.getValue();
                        if (value3 != null) {
                            Iterator<T> it3 = value3.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    Object next = it3.next();
                                    CryptoAccountDomain cryptoAccountDomain2 = (CryptoAccountDomain) next;
                                    if (kotlin.jvm.internal.f.b(cryptoAccountDomain2.f10969g, str6) && kotlin.jvm.internal.f.b(cryptoAccountDomain2.f10968f, str5)) {
                                        cryptoAccountDomain = next;
                                    }
                                }
                            }
                            cryptoAccountDomain = cryptoAccountDomain;
                        }
                        if (cryptoAccountDomain != null) {
                            U4.b.g(cryptoListFragment4).j(new e(cryptowalletDomain, cryptoAccountDomain));
                        }
                    } else {
                        com.luminary.business.presentation.ui.fragments.crypto.crypto_wallet_list.a aVar = cryptoListFragment4.f12065p0;
                        if ((aVar != null ? aVar.f12088b : null) == CryptoListFragment.DIRECTION.f12080b) {
                            cryptoListFragment4.getParentFragmentManager().f0("withdraw", t0.c.b(new Pair("wallet", cryptowalletDomain)));
                            cryptoListFragment4.requireActivity().getOnBackPressedDispatcher().d();
                        } else {
                            List<CryptoAccountDomain> value4 = cryptoListFragment4.U0().f24282Z0.getValue();
                            if (value4 != null) {
                                Iterator<T> it4 = value4.iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        Object next2 = it4.next();
                                        CryptoAccountDomain cryptoAccountDomain3 = (CryptoAccountDomain) next2;
                                        if (kotlin.jvm.internal.f.b(cryptoAccountDomain3.f10969g, str6) && kotlin.jvm.internal.f.b(cryptoAccountDomain3.f10968f, str5)) {
                                            cryptoAccountDomain = next2;
                                        }
                                    }
                                }
                                cryptoAccountDomain = cryptoAccountDomain;
                            }
                            if (cryptoAccountDomain != null) {
                                NavController g10 = U4.b.g(cryptoListFragment4);
                                Long l11 = cryptowalletDomain.f11072a;
                                int longValue = l11 != null ? (int) l11.longValue() : 0;
                                String str7 = cryptowalletDomain.f11074c;
                                if (str7 == null) {
                                    str7 = "";
                                }
                                g10.j(new f(longValue, str7, cryptoAccountDomain));
                            }
                        }
                    }
                }
                return p.f3034a;
            default:
                int intValue2 = ((Integer) obj).intValue();
                CryptoListFragment cryptoListFragment5 = this.f24251b;
                List<CryptowalletDomain> value5 = cryptoListFragment5.U0().f24281Y0.getValue();
                Serializable serializable = null;
                if (value5 != null) {
                    Iterator<T> it5 = value5.iterator();
                    while (true) {
                        if (it5.hasNext()) {
                            Object next3 = it5.next();
                            Long l12 = ((CryptowalletDomain) next3).f11072a;
                            if (l12 != null && intValue2 == ((int) l12.longValue())) {
                                serializable = next3;
                            }
                        }
                    }
                    serializable = (CryptowalletDomain) serializable;
                }
                if (serializable != null) {
                    NavController g11 = U4.b.g(cryptoListFragment5);
                    Bundle g12 = v.g(g11);
                    if (Parcelable.class.isAssignableFrom(CryptowalletDomain.class)) {
                        g12.putParcelable("wallet", (Parcelable) serializable);
                    } else {
                        if (!Serializable.class.isAssignableFrom(CryptowalletDomain.class)) {
                            throw new UnsupportedOperationException(CryptowalletDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                        }
                        g12.putSerializable("wallet", serializable);
                    }
                    g11.i(R.id.action_cryptoListFragment_to_verifyTransactionFragment, g12);
                }
                return p.f3034a;
        }
    }
}
