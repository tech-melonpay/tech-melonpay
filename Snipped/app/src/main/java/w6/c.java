package W6;

import C.v;
import O9.p;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.NavController;
import ca.InterfaceC0635a;
import com.luminary.business.domain.entity.account.CardsDomain;
import com.luminary.business.domain.entity.cards.VaultDomain;
import com.luminary.business.presentation.ui.fragments.cards.details.CardDetailsFragment;
import com.luminary.business.presentation.utils.bottomDialog.BottomDialogType;
import com.luminary.mobile.R;
import java.io.Serializable;
import kotlin.Pair;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements InterfaceC0635a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3832a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CardDetailsFragment f3833b;

    public /* synthetic */ c(CardDetailsFragment cardDetailsFragment, int i) {
        this.f3832a = i;
        this.f3833b = cardDetailsFragment;
    }

    @Override // ca.InterfaceC0635a
    public final Object invoke() {
        Integer num;
        D5.b bVar;
        D5.b bVar2;
        switch (this.f3832a) {
            case 0:
                CardDetailsFragment cardDetailsFragment = this.f3833b;
                CardsDomain m2 = cardDetailsFragment.X0().m(cardDetailsFragment.f11789q0);
                if (m2 != null && (num = m2.f10724a) != null) {
                    U4.b.g(cardDetailsFragment).j(new h(num.intValue(), cardDetailsFragment.W0().f3834a));
                }
                return p.f3034a;
            case 1:
                CardDetailsFragment cardDetailsFragment2 = this.f3833b;
                cardDetailsFragment2.getClass();
                BottomDialogType.f13289k.getClass();
                BottomDialogType a10 = BottomDialogType.a.a();
                a10.f13301g = BottomDialogType.Type.HELP_BLACK;
                a10.f13295a = cardDetailsFragment2.getString(R.string.are_you_sure);
                a10.f13297c = cardDetailsFragment2.getString(R.string.close_card);
                a10.f13303j = Boolean.TRUE;
                cardDetailsFragment2.w0().c(a10, new c(cardDetailsFragment2, 4), new c(cardDetailsFragment2, 5));
                return p.f3034a;
            case 2:
                CardDetailsFragment cardDetailsFragment3 = this.f3833b;
                U4.b.g(cardDetailsFragment3).j(i.a(cardDetailsFragment3.W0().f3834a));
                return p.f3034a;
            case 3:
                CardDetailsFragment cardDetailsFragment4 = this.f3833b;
                U4.b.g(cardDetailsFragment4).j(new f(cardDetailsFragment4.W0().f3834a));
                return p.f3034a;
            case 4:
                CardDetailsFragment cardDetailsFragment5 = this.f3833b;
                VaultDomain vaultDomain = cardDetailsFragment5.W0().f3834a;
                if (vaultDomain == null) {
                    return null;
                }
                m X02 = cardDetailsFragment5.X0();
                CardsDomain m9 = cardDetailsFragment5.X0().m(cardDetailsFragment5.f11789q0);
                H7.c cVar = new H7.c(X02, String.valueOf(m9 != null ? m9.f10724a : null), vaultDomain.f10778a);
                X02.f421M0 = cVar;
                cVar.invoke();
                return p.f3034a;
            case 5:
                this.f3833b.w0().dismiss();
                return p.f3034a;
            case 6:
                CardDetailsFragment cardDetailsFragment6 = this.f3833b;
                U4.b.g(cardDetailsFragment6).j(i.a(cardDetailsFragment6.W0().f3834a));
                return p.f3034a;
            case 7:
                CardDetailsFragment cardDetailsFragment7 = this.f3833b;
                CardsDomain m10 = cardDetailsFragment7.X0().m(cardDetailsFragment7.f11789q0);
                Boolean bool = null;
                Integer num2 = m10 != null ? m10.f10724a : null;
                String str = m10 != null ? m10.f10727d : null;
                String str2 = m10 != null ? m10.f10730g : null;
                CardsDomain value = cardDetailsFragment7.X0().f3866d1.getValue();
                Boolean bool2 = (value == null || (bVar2 = value.f10735m) == null) ? null : bVar2.f920c;
                CardsDomain value2 = cardDetailsFragment7.X0().f3866d1.getValue();
                if (value2 != null && (bVar = value2.f10735m) != null) {
                    bool = bVar.f918a;
                }
                if (num2 != null && str != null && str2 != null && bool2 != null && bool != null) {
                    NavController g10 = U4.b.g(cardDetailsFragment7);
                    int intValue = num2.intValue();
                    boolean booleanValue = bool2.booleanValue();
                    boolean booleanValue2 = bool.booleanValue();
                    g10.getClass();
                    Bundle bundle = new Bundle();
                    bundle.putInt("cardId", intValue);
                    bundle.putString("cardNumber", str2);
                    bundle.putString("cardName", str);
                    bundle.putBoolean("internetActive", booleanValue);
                    bundle.putBoolean("contactlessActive", booleanValue2);
                    g10.i(R.id.actionToCardLimitsFragment, bundle);
                }
                return p.f3034a;
            case 8:
                CardDetailsFragment cardDetailsFragment8 = this.f3833b;
                if (cardDetailsFragment8.u0().f28474o.getVisibility() == 0) {
                    final m X03 = cardDetailsFragment8.X0();
                    CardsDomain m11 = cardDetailsFragment8.X0().m(cardDetailsFragment8.f11789q0);
                    final String valueOf = String.valueOf(m11 != null ? m11.f10724a : null);
                    final int i = 1;
                    InterfaceC0635a<p> interfaceC0635a = new InterfaceC0635a() { // from class: W6.j
                        @Override // ca.InterfaceC0635a
                        public final Object invoke() {
                            switch (i) {
                                case 0:
                                    m mVar = X03;
                                    String valueOf2 = String.valueOf(mVar.f3856T0.h());
                                    mVar.l();
                                    Pair pair = new Pair(valueOf2, valueOf);
                                    mVar.f3858V0.a(new k(mVar, 5), pair);
                                    break;
                                default:
                                    m mVar2 = X03;
                                    String valueOf3 = String.valueOf(mVar2.f3856T0.h());
                                    mVar2.l();
                                    Pair pair2 = new Pair(valueOf3, valueOf);
                                    mVar2.f3859W0.a(new k(mVar2, 8), pair2);
                                    break;
                            }
                            return p.f3034a;
                        }
                    };
                    X03.f420L0 = interfaceC0635a;
                    interfaceC0635a.invoke();
                }
                return p.f3034a;
            case 9:
                CardDetailsFragment cardDetailsFragment9 = this.f3833b;
                Serializable serializable = cardDetailsFragment9.W0().f3834a;
                if (serializable != null) {
                    NavController g11 = U4.b.g(cardDetailsFragment9);
                    Bundle g12 = v.g(g11);
                    if (Parcelable.class.isAssignableFrom(VaultDomain.class)) {
                        g12.putParcelable("vault", (Parcelable) serializable);
                    } else {
                        if (!Serializable.class.isAssignableFrom(VaultDomain.class)) {
                            throw new UnsupportedOperationException(VaultDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                        }
                        g12.putSerializable("vault", serializable);
                    }
                    g11.i(R.id.action_cardDetailsFragment_to_cardTransactionsFragment, g12);
                }
                return p.f3034a;
            case 10:
                CardDetailsFragment cardDetailsFragment10 = this.f3833b;
                Serializable serializable2 = cardDetailsFragment10.W0().f3834a;
                if (serializable2 != null) {
                    NavController g13 = U4.b.g(cardDetailsFragment10);
                    Bundle g14 = v.g(g13);
                    if (Parcelable.class.isAssignableFrom(VaultDomain.class)) {
                        g14.putParcelable("vault", (Parcelable) serializable2);
                    } else {
                        if (!Serializable.class.isAssignableFrom(VaultDomain.class)) {
                            throw new UnsupportedOperationException(VaultDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                        }
                        g14.putSerializable("vault", serializable2);
                    }
                    g13.i(R.id.action_cardDetailsFragment_to_cardTransactionsFragment, g14);
                }
                return p.f3034a;
            case 11:
                CardDetailsFragment cardDetailsFragment11 = this.f3833b;
                CardsDomain m12 = cardDetailsFragment11.X0().m(cardDetailsFragment11.f11789q0);
                if (m12 == null || !F8.c.a(m12)) {
                    final m X04 = cardDetailsFragment11.X0();
                    CardsDomain m13 = cardDetailsFragment11.X0().m(cardDetailsFragment11.f11789q0);
                    final String valueOf2 = String.valueOf(m13 != null ? m13.f10724a : null);
                    final int i9 = 0;
                    InterfaceC0635a<p> interfaceC0635a2 = new InterfaceC0635a() { // from class: W6.j
                        @Override // ca.InterfaceC0635a
                        public final Object invoke() {
                            switch (i9) {
                                case 0:
                                    m mVar = X04;
                                    String valueOf22 = String.valueOf(mVar.f3856T0.h());
                                    mVar.l();
                                    Pair pair = new Pair(valueOf22, valueOf2);
                                    mVar.f3858V0.a(new k(mVar, 5), pair);
                                    break;
                                default:
                                    m mVar2 = X04;
                                    String valueOf3 = String.valueOf(mVar2.f3856T0.h());
                                    mVar2.l();
                                    Pair pair2 = new Pair(valueOf3, valueOf2);
                                    mVar2.f3859W0.a(new k(mVar2, 8), pair2);
                                    break;
                            }
                            return p.f3034a;
                        }
                    };
                    X04.f419K0 = interfaceC0635a2;
                    interfaceC0635a2.invoke();
                } else {
                    final m X05 = cardDetailsFragment11.X0();
                    CardsDomain m14 = cardDetailsFragment11.X0().m(cardDetailsFragment11.f11789q0);
                    final String valueOf3 = String.valueOf(m14 != null ? m14.f10724a : null);
                    final int i10 = 1;
                    InterfaceC0635a<p> interfaceC0635a3 = new InterfaceC0635a() { // from class: W6.j
                        @Override // ca.InterfaceC0635a
                        public final Object invoke() {
                            switch (i10) {
                                case 0:
                                    m mVar = X05;
                                    String valueOf22 = String.valueOf(mVar.f3856T0.h());
                                    mVar.l();
                                    Pair pair = new Pair(valueOf22, valueOf3);
                                    mVar.f3858V0.a(new k(mVar, 5), pair);
                                    break;
                                default:
                                    m mVar2 = X05;
                                    String valueOf32 = String.valueOf(mVar2.f3856T0.h());
                                    mVar2.l();
                                    Pair pair2 = new Pair(valueOf32, valueOf3);
                                    mVar2.f3859W0.a(new k(mVar2, 8), pair2);
                                    break;
                            }
                            return p.f3034a;
                        }
                    };
                    X05.f420L0 = interfaceC0635a3;
                    interfaceC0635a3.invoke();
                }
                return p.f3034a;
            default:
                CardDetailsFragment cardDetailsFragment12 = this.f3833b;
                CardsDomain m15 = cardDetailsFragment12.X0().m(cardDetailsFragment12.f11789q0);
                if (m15 != null) {
                    U4.b.g(cardDetailsFragment12).j(new e(m15, null));
                }
                return p.f3034a;
        }
    }
}
