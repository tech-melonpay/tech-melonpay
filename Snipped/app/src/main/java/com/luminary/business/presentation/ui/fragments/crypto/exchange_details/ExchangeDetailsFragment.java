package com.luminary.business.presentation.ui.fragments.crypto.exchange_details;

import A7.c;
import C.v;
import F8.o;
import O9.f;
import O9.p;
import U4.b;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.A;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import androidx.navigation.NavController;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.luminary.business.domain.entity.cryptoaccount.CryptoAccountDomain;
import com.luminary.business.domain.entity.cryptowallet.CryptoExchangeDomain;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.crypto.exchange_details.ExchangeDetailsFragment;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.mobile.R;
import java.io.File;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Timer;
import ka.C0967l;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.h;
import p7.C1112c;
import p7.g;
import t6.G3;

/* compiled from: ExchangeDetailsFragment.kt */
/* loaded from: classes2.dex */
public final class ExchangeDetailsFragment extends BaseFragment<G3> {

    /* renamed from: n0, reason: collision with root package name */
    public final int f12095n0 = R.layout.fragment_crypto_exchange_details;

    /* renamed from: o0, reason: collision with root package name */
    public C1112c f12096o0;

    /* renamed from: p0, reason: collision with root package name */
    public final H1.a f12097p0;

    /* renamed from: q0, reason: collision with root package name */
    public final Timer f12098q0;

    /* renamed from: r0, reason: collision with root package name */
    public final f f12099r0;

    /* compiled from: ExchangeDetailsFragment.kt */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12104a;

        static {
            int[] iArr = new int[CryptoExchangeDomain.ExchangeStatus.values().length];
            try {
                CryptoExchangeDomain.ExchangeStatus.a aVar = CryptoExchangeDomain.ExchangeStatus.f11042a;
                iArr[14] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CryptoExchangeDomain.ExchangeStatus.a aVar2 = CryptoExchangeDomain.ExchangeStatus.f11042a;
                iArr[15] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                CryptoExchangeDomain.ExchangeStatus.a aVar3 = CryptoExchangeDomain.ExchangeStatus.f11042a;
                iArr[16] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f12104a = iArr;
        }
    }

    /* compiled from: ExchangeDetailsFragment.kt */
    public static final class b implements A, d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f12105a;

        public b(C7.a aVar) {
            this.f12105a = aVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof d)) {
                return kotlin.jvm.internal.f.b(getFunctionDelegate(), ((d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f12105a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f12105a.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.luminary.business.presentation.ui.fragments.crypto.exchange_details.ExchangeDetailsFragment$special$$inlined$viewModel$default$1] */
    public ExchangeDetailsFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.crypto.exchange_details.ExchangeDetailsFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f12097p0 = E.a(this, h.a(g.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.crypto.exchange_details.ExchangeDetailsFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.crypto.exchange_details.ExchangeDetailsFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return b.n((X) r02.invoke(), h.a(g.class), null, null, b.l(this));
            }
        });
        this.f12098q0 = new Timer();
        this.f12099r0 = org.koin.java.a.a(K5.a.class);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        C1112c c1112c = this.f12096o0;
        CryptoExchangeDomain cryptoExchangeDomain = c1112c != null ? c1112c.f25695a : null;
        if ((cryptoExchangeDomain != null ? cryptoExchangeDomain.f11023g : null) == CryptoExchangeDomain.MovementType.f11061b) {
            toolbarStatus.f13263a = getString(R.string.deposit_details);
        } else {
            if ((cryptoExchangeDomain != null ? cryptoExchangeDomain.f11023g : null) == CryptoExchangeDomain.MovementType.f11062c) {
                toolbarStatus.f13263a = getString(R.string.withdrawal_details);
            } else {
                toolbarStatus.f13263a = getString(R.string.exchange_details);
            }
        }
        toolbarStatus.f13267e = true;
        toolbarStatus.f13276o = null;
        toolbarStatus.f13265c = 18;
        return toolbarStatus;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11471m0 = (g) this.f12097p0.getValue();
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (!v.y(arguments, C1112c.class, "exchange")) {
                throw new IllegalArgumentException("Required argument \"exchange\" is missing and does not have an android:defaultValue");
            }
            if (!Parcelable.class.isAssignableFrom(CryptoExchangeDomain.class) && !Serializable.class.isAssignableFrom(CryptoExchangeDomain.class)) {
                throw new UnsupportedOperationException(CryptoExchangeDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            this.f12096o0 = new C1112c((CryptoExchangeDomain) arguments.get("exchange"));
        }
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f12098q0.cancel();
        super.onDestroyView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        Integer z10;
        String str2;
        String str3;
        String str4;
        Date date;
        String str5;
        String plainString;
        String str6;
        String plainString2;
        String str7;
        String str8;
        CryptoExchangeDomain.ExchangeStatus exchangeStatus;
        String name;
        String str9;
        Integer M8;
        super.onViewCreated(view, bundle);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        C1112c c1112c = this.f12096o0;
        ref$ObjectRef.f23179a = c1112c != null ? c1112c.f25695a : 0;
        ((g) this.f12097p0.getValue()).f25708V0.observe(getViewLifecycleOwner(), new b(new C7.a(this, 29)));
        CryptoExchangeDomain cryptoExchangeDomain = (CryptoExchangeDomain) ref$ObjectRef.f23179a;
        if (K3.a.c(cryptoExchangeDomain != null ? cryptoExchangeDomain.f11028m : null)) {
            CryptoExchangeDomain cryptoExchangeDomain2 = (CryptoExchangeDomain) ref$ObjectRef.f23179a;
            if (cryptoExchangeDomain2 != null && (str9 = cryptoExchangeDomain2.f11028m) != null && (M8 = D9.b.M(getContext(), str9)) != null) {
                u0().f27909z.setImageResource(M8.intValue());
            }
        } else {
            CryptoExchangeDomain cryptoExchangeDomain3 = (CryptoExchangeDomain) ref$ObjectRef.f23179a;
            if (cryptoExchangeDomain3 != null && (str = cryptoExchangeDomain3.f11028m) != null && (z10 = D9.b.z(str)) != null) {
                u0().f27909z.setImageResource(z10.intValue());
            }
        }
        G3 u02 = u0();
        CryptoExchangeDomain cryptoExchangeDomain4 = (CryptoExchangeDomain) ref$ObjectRef.f23179a;
        u02.f27894F.setText((cryptoExchangeDomain4 == null || (exchangeStatus = cryptoExchangeDomain4.f11008A) == null || (name = exchangeStatus.name()) == null) ? null : D9.b.l(C0967l.X(name, "_", " ", false)));
        CryptoExchangeDomain cryptoExchangeDomain5 = (CryptoExchangeDomain) ref$ObjectRef.f23179a;
        CryptoExchangeDomain.ExchangeStatus exchangeStatus2 = cryptoExchangeDomain5 != null ? cryptoExchangeDomain5.f11008A : null;
        int i = exchangeStatus2 == null ? -1 : a.f12104a[exchangeStatus2.ordinal()];
        if (i == 1) {
            o.b(u0().f27901r);
        } else if (i == 2) {
            o.b(u0().f27901r);
        } else if (i != 3) {
            o.b(u0().f27901r);
        } else {
            u0().f27901r.setVisibility(0);
        }
        final int i9 = 0;
        o.c(u0().f27900q, 500L, new InterfaceC0635a(this) { // from class: p7.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExchangeDetailsFragment f25691b;

            {
                this.f25691b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                CryptoExchangeDomain cryptoExchangeDomain6;
                switch (i9) {
                    case 0:
                        ExchangeDetailsFragment exchangeDetailsFragment = this.f25691b;
                        File file = new File(exchangeDetailsFragment.requireContext().getFilesDir().getAbsolutePath(), "Statements");
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        g gVar = (g) exchangeDetailsFragment.f12097p0.getValue();
                        String absolutePath = file.getAbsolutePath();
                        C1112c c1112c2 = exchangeDetailsFragment.f12096o0;
                        D7.e eVar = new D7.e(absolutePath, String.valueOf((c1112c2 == null || (cryptoExchangeDomain6 = c1112c2.f25695a) == null) ? null : cryptoExchangeDomain6.f11017a), 7, gVar);
                        gVar.f419K0 = eVar;
                        eVar.invoke();
                        break;
                    case 1:
                        NavController g10 = U4.b.g(this.f25691b);
                        g10.getClass();
                        Bundle bundle2 = new Bundle();
                        bundle2.putBoolean("actionRequired", true);
                        g10.i(R.id.action_exchangeDetailsFragment_to_exchangeListFragment2, bundle2);
                        break;
                    case 2:
                        ExchangeDetailsFragment exchangeDetailsFragment2 = this.f25691b;
                        exchangeDetailsFragment2.r0(exchangeDetailsFragment2.u0().f27903t.getText().toString());
                        break;
                    default:
                        ExchangeDetailsFragment exchangeDetailsFragment3 = this.f25691b;
                        exchangeDetailsFragment3.r0(exchangeDetailsFragment3.u0().f27903t.getText().toString());
                        break;
                }
                return p.f3034a;
            }
        });
        final CryptoExchangeDomain cryptoExchangeDomain6 = (CryptoExchangeDomain) ref$ObjectRef.f23179a;
        str2 = "";
        if ((cryptoExchangeDomain6 != null ? cryptoExchangeDomain6.f11023g : null) == CryptoExchangeDomain.MovementType.f11061b) {
            u0().f27897n.setText(D9.b.q(cryptoExchangeDomain6, false, "+", 30, 18, true));
            if (cryptoExchangeDomain6.f()) {
                u0().f27908y.setImageResource(R.drawable.ic_progress);
            } else {
                u0().f27908y.setImageResource(R.drawable.ic_transaction_income);
            }
            u0().f27890B.setText(getString(R.string.deposit));
            u0().f27889A.setText(getString(R.string.value_deposit, cryptoExchangeDomain6.f11028m));
            u0().f27904u.setText(getString(R.string.from_address));
            u0().f27892D.setText(getString(R.string.crypto));
            u0().f27895G.setText(getString(R.string.network));
            u0().f27906w.setText(getString(R.string.time_and_date));
            G3 u03 = u0();
            String str10 = cryptoExchangeDomain6.f11015H;
            if (str10 == null) {
                str10 = "";
            }
            u03.f27905v.setText(str10);
            G3 u04 = u0();
            CryptoAccountDomain cryptoAccountDomain = cryptoExchangeDomain6.f11021e;
            if (cryptoAccountDomain == null || (str8 = cryptoAccountDomain.f10969g) == null) {
                str8 = "";
            }
            u04.f27893E.setText(str8);
            u0().f27896H.setText(cryptoAccountDomain != null ? cryptoAccountDomain.f10968f : null);
            G3 u05 = u0();
            Date date2 = cryptoExchangeDomain6.f11032q;
            u05.f27907x.setText(date2 != null ? D9.b.F0(date2, "HH:mm, EEE dd MMM") : "");
            String str11 = cryptoExchangeDomain6.f11011D;
            if (str11 == null || str11.length() == 0) {
                o.b(u0().f27902s);
                o.b(u0().f27903t);
            } else {
                u0().f27902s.setText(getString(R.string.transaction_hash));
                u0().f27903t.setText(str11);
                u0().f27903t.setPaintFlags(u0().f27903t.getPaintFlags() | 8);
                final int i10 = 2;
                o.c(u0().f27903t, 500L, new InterfaceC0635a(this) { // from class: p7.a

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ ExchangeDetailsFragment f25691b;

                    {
                        this.f25691b = this;
                    }

                    @Override // ca.InterfaceC0635a
                    public final Object invoke() {
                        CryptoExchangeDomain cryptoExchangeDomain62;
                        switch (i10) {
                            case 0:
                                ExchangeDetailsFragment exchangeDetailsFragment = this.f25691b;
                                File file = new File(exchangeDetailsFragment.requireContext().getFilesDir().getAbsolutePath(), "Statements");
                                if (!file.exists()) {
                                    file.mkdirs();
                                }
                                g gVar = (g) exchangeDetailsFragment.f12097p0.getValue();
                                String absolutePath = file.getAbsolutePath();
                                C1112c c1112c2 = exchangeDetailsFragment.f12096o0;
                                D7.e eVar = new D7.e(absolutePath, String.valueOf((c1112c2 == null || (cryptoExchangeDomain62 = c1112c2.f25695a) == null) ? null : cryptoExchangeDomain62.f11017a), 7, gVar);
                                gVar.f419K0 = eVar;
                                eVar.invoke();
                                break;
                            case 1:
                                NavController g10 = U4.b.g(this.f25691b);
                                g10.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putBoolean("actionRequired", true);
                                g10.i(R.id.action_exchangeDetailsFragment_to_exchangeListFragment2, bundle2);
                                break;
                            case 2:
                                ExchangeDetailsFragment exchangeDetailsFragment2 = this.f25691b;
                                exchangeDetailsFragment2.r0(exchangeDetailsFragment2.u0().f27903t.getText().toString());
                                break;
                            default:
                                ExchangeDetailsFragment exchangeDetailsFragment3 = this.f25691b;
                                exchangeDetailsFragment3.r0(exchangeDetailsFragment3.u0().f27903t.getText().toString());
                                break;
                        }
                        return p.f3034a;
                    }
                });
            }
            o.b(u0().f27891C);
            u0().f27898o.setTint(R.color.main_button_text_color);
            u0().f27898o.setText(getString(R.string.withdraw));
            u0().f27898o.setIcon(Integer.valueOf(R.drawable.ic_arrowtopright));
            final int i11 = 0;
            o.c(u0().f27898o, 500L, new InterfaceC0635a(this) { // from class: p7.b

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ExchangeDetailsFragment f25693b;

                {
                    this.f25693b = this;
                }

                @Override // ca.InterfaceC0635a
                public final Object invoke() {
                    switch (i11) {
                        case 0:
                            NavController g10 = U4.b.g(this.f25693b);
                            CryptoExchangeDomain cryptoExchangeDomain7 = cryptoExchangeDomain6;
                            Integer num = cryptoExchangeDomain7.f11022f;
                            int intValue = num != null ? num.intValue() : 0;
                            String str12 = cryptoExchangeDomain7.f11015H;
                            if (str12 == null) {
                                str12 = "";
                            }
                            g10.j(new C1114e(intValue, str12, cryptoExchangeDomain7.f11021e));
                            break;
                        default:
                            NavController g11 = U4.b.g(this.f25693b);
                            CryptoExchangeDomain cryptoExchangeDomain8 = cryptoExchangeDomain6;
                            Integer num2 = cryptoExchangeDomain8.f11022f;
                            int intValue2 = num2 != null ? num2.intValue() : 0;
                            String str13 = cryptoExchangeDomain8.f11016I;
                            if (str13 == null) {
                                str13 = "";
                            }
                            g11.j(new C1114e(intValue2, str13, cryptoExchangeDomain8.f11021e));
                            break;
                    }
                    return p.f3034a;
                }
            });
            o.b(u0().f27899p);
            return;
        }
        if ((cryptoExchangeDomain6 != null ? cryptoExchangeDomain6.f11023g : null) == CryptoExchangeDomain.MovementType.f11062c) {
            u0().f27890B.setText(getString(R.string.withdrawal));
            u0().f27897n.setText(D9.b.q(cryptoExchangeDomain6, true, "-", 30, 18, true));
            u0().f27889A.setText(getString(R.string.value_withdrawal, cryptoExchangeDomain6.f11027l));
            if (cryptoExchangeDomain6.f()) {
                u0().f27908y.setImageResource(R.drawable.ic_progress);
            } else {
                u0().f27908y.setImageResource(R.drawable.ic_transaction_out);
            }
            u0().f27904u.setText(getString(R.string.to_address));
            u0().f27892D.setText(getString(R.string.crypto));
            u0().f27895G.setText(getString(R.string.network));
            u0().f27906w.setText(getString(R.string.time_and_date));
            G3 u06 = u0();
            String str12 = cryptoExchangeDomain6.f11016I;
            if (str12 == null) {
                str12 = "";
            }
            u06.f27905v.setText(str12);
            G3 u07 = u0();
            CryptoAccountDomain cryptoAccountDomain2 = cryptoExchangeDomain6.f11021e;
            if (cryptoAccountDomain2 == null || (str7 = cryptoAccountDomain2.f10969g) == null) {
                str7 = "";
            }
            u07.f27893E.setText(str7);
            u0().f27896H.setText(cryptoAccountDomain2 != null ? cryptoAccountDomain2.f10968f : null);
            G3 u08 = u0();
            Date date3 = cryptoExchangeDomain6.f11032q;
            u08.f27907x.setText(date3 != null ? D9.b.F0(date3, "HH:mm, EEE dd MMM") : "");
            String str13 = cryptoExchangeDomain6.f11011D;
            if (str13 == null || str13.length() == 0) {
                o.b(u0().f27902s);
                o.b(u0().f27903t);
            } else {
                u0().f27902s.setText(getString(R.string.transaction_hash));
                u0().f27903t.setText(str13);
                u0().f27903t.setPaintFlags(u0().f27903t.getPaintFlags() | 8);
                final int i12 = 3;
                o.c(u0().f27903t, 500L, new InterfaceC0635a(this) { // from class: p7.a

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ ExchangeDetailsFragment f25691b;

                    {
                        this.f25691b = this;
                    }

                    @Override // ca.InterfaceC0635a
                    public final Object invoke() {
                        CryptoExchangeDomain cryptoExchangeDomain62;
                        switch (i12) {
                            case 0:
                                ExchangeDetailsFragment exchangeDetailsFragment = this.f25691b;
                                File file = new File(exchangeDetailsFragment.requireContext().getFilesDir().getAbsolutePath(), "Statements");
                                if (!file.exists()) {
                                    file.mkdirs();
                                }
                                g gVar = (g) exchangeDetailsFragment.f12097p0.getValue();
                                String absolutePath = file.getAbsolutePath();
                                C1112c c1112c2 = exchangeDetailsFragment.f12096o0;
                                D7.e eVar = new D7.e(absolutePath, String.valueOf((c1112c2 == null || (cryptoExchangeDomain62 = c1112c2.f25695a) == null) ? null : cryptoExchangeDomain62.f11017a), 7, gVar);
                                gVar.f419K0 = eVar;
                                eVar.invoke();
                                break;
                            case 1:
                                NavController g10 = U4.b.g(this.f25691b);
                                g10.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putBoolean("actionRequired", true);
                                g10.i(R.id.action_exchangeDetailsFragment_to_exchangeListFragment2, bundle2);
                                break;
                            case 2:
                                ExchangeDetailsFragment exchangeDetailsFragment2 = this.f25691b;
                                exchangeDetailsFragment2.r0(exchangeDetailsFragment2.u0().f27903t.getText().toString());
                                break;
                            default:
                                ExchangeDetailsFragment exchangeDetailsFragment3 = this.f25691b;
                                exchangeDetailsFragment3.r0(exchangeDetailsFragment3.u0().f27903t.getText().toString());
                                break;
                        }
                        return p.f3034a;
                    }
                });
            }
            o.b(u0().f27891C);
            u0().f27898o.setIcon(Integer.valueOf(R.drawable.ic_arrowtopright));
            u0().f27898o.setTint(R.color.main_button_text_color);
            u0().f27898o.setText(getString(R.string.withdraw_again));
            final int i13 = 1;
            o.c(u0().f27898o, 500L, new InterfaceC0635a(this) { // from class: p7.b

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ExchangeDetailsFragment f25693b;

                {
                    this.f25693b = this;
                }

                @Override // ca.InterfaceC0635a
                public final Object invoke() {
                    switch (i13) {
                        case 0:
                            NavController g10 = U4.b.g(this.f25693b);
                            CryptoExchangeDomain cryptoExchangeDomain7 = cryptoExchangeDomain6;
                            Integer num = cryptoExchangeDomain7.f11022f;
                            int intValue = num != null ? num.intValue() : 0;
                            String str122 = cryptoExchangeDomain7.f11015H;
                            if (str122 == null) {
                                str122 = "";
                            }
                            g10.j(new C1114e(intValue, str122, cryptoExchangeDomain7.f11021e));
                            break;
                        default:
                            NavController g11 = U4.b.g(this.f25693b);
                            CryptoExchangeDomain cryptoExchangeDomain8 = cryptoExchangeDomain6;
                            Integer num2 = cryptoExchangeDomain8.f11022f;
                            int intValue2 = num2 != null ? num2.intValue() : 0;
                            String str132 = cryptoExchangeDomain8.f11016I;
                            if (str132 == null) {
                                str132 = "";
                            }
                            g11.j(new C1114e(intValue2, str132, cryptoExchangeDomain8.f11021e));
                            break;
                    }
                    return p.f3034a;
                }
            });
            o.b(u0().f27899p);
            return;
        }
        G3 u09 = u0();
        CryptoExchangeDomain cryptoExchangeDomain7 = (CryptoExchangeDomain) ref$ObjectRef.f23179a;
        u09.f27897n.setText(cryptoExchangeDomain7 != null ? D9.b.q(cryptoExchangeDomain7, false, "+", 30, 18, false) : null);
        u0().f27890B.setText(getString(R.string.exchange));
        G3 u010 = u0();
        CryptoExchangeDomain cryptoExchangeDomain8 = (CryptoExchangeDomain) ref$ObjectRef.f23179a;
        if (cryptoExchangeDomain8 == null || (str3 = cryptoExchangeDomain8.f11027l) == null) {
            str3 = "";
        }
        if (cryptoExchangeDomain8 == null || (str4 = cryptoExchangeDomain8.f11028m) == null) {
            str4 = "";
        }
        u010.f27889A.setText(getString(R.string.exchange_two_currency, str3, str4));
        o.b(u0().f27904u);
        o.b(u0().f27905v);
        u0().f27892D.setText(getString(R.string.you_sold));
        u0().f27895G.setText(getString(R.string.you_received));
        u0().f27906w.setText(getString(R.string.fee));
        G3 u011 = u0();
        CryptoExchangeDomain cryptoExchangeDomain9 = (CryptoExchangeDomain) ref$ObjectRef.f23179a;
        f fVar = this.f12099r0;
        u011.f27893E.setText(cryptoExchangeDomain9 != null ? D9.b.H(cryptoExchangeDomain9, true, ((K5.a) fVar.getValue()).Q(((CryptoExchangeDomain) ref$ObjectRef.f23179a).f11027l)) : null);
        G3 u012 = u0();
        CryptoExchangeDomain cryptoExchangeDomain10 = (CryptoExchangeDomain) ref$ObjectRef.f23179a;
        u012.f27896H.setText(cryptoExchangeDomain10 != null ? D9.b.H(cryptoExchangeDomain10, false, ((K5.a) fVar.getValue()).Q(((CryptoExchangeDomain) ref$ObjectRef.f23179a).f11028m)) : null);
        CryptoExchangeDomain cryptoExchangeDomain11 = (CryptoExchangeDomain) ref$ObjectRef.f23179a;
        if ((cryptoExchangeDomain11 != null ? cryptoExchangeDomain11.f11012E : null) == null) {
            if ((cryptoExchangeDomain11 != null ? cryptoExchangeDomain11.f11031p : null) == null) {
                o.b(u0().f27907x);
                o.b(u0().f27906w);
            } else {
                G3 u013 = u0();
                CryptoExchangeDomain cryptoExchangeDomain12 = (CryptoExchangeDomain) ref$ObjectRef.f23179a;
                String str14 = cryptoExchangeDomain12.f11010C;
                if (str14 == null) {
                    str14 = "";
                }
                u013.f27907x.setText(D9.b.o(str14, cryptoExchangeDomain12.c(((K5.a) fVar.getValue()).Q(((CryptoExchangeDomain) ref$ObjectRef.f23179a).f11010C))));
            }
        } else if (kotlin.jvm.internal.f.b(cryptoExchangeDomain11.f11013F, "fixed")) {
            G3 u014 = u0();
            CryptoExchangeDomain cryptoExchangeDomain13 = (CryptoExchangeDomain) ref$ObjectRef.f23179a;
            String str15 = cryptoExchangeDomain13.f11010C;
            if (str15 == null) {
                str15 = "";
            }
            Double d10 = cryptoExchangeDomain13.f11012E;
            if (d10 == null || (plainString2 = new BigDecimal(String.valueOf(d10.doubleValue())).toPlainString()) == null || (str6 = D9.b.I(plainString2, ((CryptoExchangeDomain) ref$ObjectRef.f23179a).f11010C)) == null) {
                str6 = "";
            }
            u014.f27907x.setText(D9.b.o(str15, str6));
        } else if (kotlin.jvm.internal.f.b(((CryptoExchangeDomain) ref$ObjectRef.f23179a).f11013F, "percent")) {
            G3 u015 = u0();
            Double d11 = ((CryptoExchangeDomain) ref$ObjectRef.f23179a).f11012E;
            if (d11 == null || (plainString = new BigDecimal(String.valueOf(d11.doubleValue())).toPlainString()) == null || (str5 = D9.b.I(plainString, "%")) == null) {
                str5 = "";
            }
            u015.f27907x.setText(D9.b.o("%", str5));
        }
        u0().f27902s.setText(getString(R.string.time_and_date));
        G3 u016 = u0();
        CryptoExchangeDomain cryptoExchangeDomain14 = (CryptoExchangeDomain) ref$ObjectRef.f23179a;
        if (cryptoExchangeDomain14 != null && (date = cryptoExchangeDomain14.f11033r) != null) {
            str2 = D9.b.F0(date, "HH:mm, EEE dd MMM");
        }
        u016.f27903t.setText(str2);
        o.b(u0().f27901r);
        CryptoExchangeDomain cryptoExchangeDomain15 = (CryptoExchangeDomain) ref$ObjectRef.f23179a;
        if (cryptoExchangeDomain15 == null || !cryptoExchangeDomain15.e()) {
            CryptoExchangeDomain cryptoExchangeDomain16 = (CryptoExchangeDomain) ref$ObjectRef.f23179a;
            if (cryptoExchangeDomain16 == null || !cryptoExchangeDomain16.d()) {
                CryptoExchangeDomain cryptoExchangeDomain17 = (CryptoExchangeDomain) ref$ObjectRef.f23179a;
                if (cryptoExchangeDomain17 == null || !cryptoExchangeDomain17.f()) {
                    o.b(u0().f27891C);
                    o.b(u0().f27899p);
                    u0().f27898o.setVisibility(0);
                    u0().f27898o.setTint(R.color.main_button_text_color);
                } else {
                    u0().f27908y.setImageResource(R.drawable.ic_progress);
                    o.b(u0().f27899p);
                    o.b(u0().f27898o);
                    o.b(u0().f27901r);
                }
            } else {
                o.b(u0().f27891C);
                o.b(u0().f27901r);
                u0().f27899p.setVisibility(0);
                final int i14 = 1;
                o.c(u0().f27899p, 500L, new InterfaceC0635a(this) { // from class: p7.a

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ ExchangeDetailsFragment f25691b;

                    {
                        this.f25691b = this;
                    }

                    @Override // ca.InterfaceC0635a
                    public final Object invoke() {
                        CryptoExchangeDomain cryptoExchangeDomain62;
                        switch (i14) {
                            case 0:
                                ExchangeDetailsFragment exchangeDetailsFragment = this.f25691b;
                                File file = new File(exchangeDetailsFragment.requireContext().getFilesDir().getAbsolutePath(), "Statements");
                                if (!file.exists()) {
                                    file.mkdirs();
                                }
                                g gVar = (g) exchangeDetailsFragment.f12097p0.getValue();
                                String absolutePath = file.getAbsolutePath();
                                C1112c c1112c2 = exchangeDetailsFragment.f12096o0;
                                D7.e eVar = new D7.e(absolutePath, String.valueOf((c1112c2 == null || (cryptoExchangeDomain62 = c1112c2.f25695a) == null) ? null : cryptoExchangeDomain62.f11017a), 7, gVar);
                                gVar.f419K0 = eVar;
                                eVar.invoke();
                                break;
                            case 1:
                                NavController g10 = U4.b.g(this.f25691b);
                                g10.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putBoolean("actionRequired", true);
                                g10.i(R.id.action_exchangeDetailsFragment_to_exchangeListFragment2, bundle2);
                                break;
                            case 2:
                                ExchangeDetailsFragment exchangeDetailsFragment2 = this.f25691b;
                                exchangeDetailsFragment2.r0(exchangeDetailsFragment2.u0().f27903t.getText().toString());
                                break;
                            default:
                                ExchangeDetailsFragment exchangeDetailsFragment3 = this.f25691b;
                                exchangeDetailsFragment3.r0(exchangeDetailsFragment3.u0().f27903t.getText().toString());
                                break;
                        }
                        return p.f3034a;
                    }
                });
                o.b(u0().f27898o);
            }
        } else {
            u0().f27897n.setTextColor(requireContext().getColor(R.color.neutral_400));
            u0().f27889A.setTextColor(requireContext().getColor(R.color.neutral_400));
            u0().f27901r.setVisibility(0);
            o.b(u0().f27891C);
            o.b(u0().f27899p);
            o.b(u0().f27898o);
        }
        u0().f27898o.setText(getString(R.string.exchange_again));
        u0().f27898o.setIcon(Integer.valueOf(R.drawable.ic_exchange_button));
        o.c(u0().f27898o, 500L, new c(20, ref$ObjectRef, this));
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f12095n0;
    }
}
