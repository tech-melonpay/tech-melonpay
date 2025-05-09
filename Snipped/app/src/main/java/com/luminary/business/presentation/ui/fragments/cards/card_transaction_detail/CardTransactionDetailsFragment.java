package com.luminary.business.presentation.ui.fragments.cards.card_transaction_detail;

import D9.b;
import F8.o;
import Fa.h;
import U6.a;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import ca.InterfaceC0635a;
import com.luminary.business.domain.entity.cards.CardTransactionDomain;
import com.luminary.business.domain.entity.cards.VaultDomain;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.mobile.R;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Locale;
import ka.C0967l;
import kotlin.jvm.internal.f;
import t6.Y2;

/* compiled from: CardTransactionDetailsFragment.kt */
/* loaded from: classes2.dex */
public final class CardTransactionDetailsFragment extends BaseFragment<Y2> {

    /* renamed from: n0, reason: collision with root package name */
    public final int f11774n0 = R.layout.fragment_card_transaction_details;

    /* renamed from: o0, reason: collision with root package name */
    public final h f11775o0 = new h(kotlin.jvm.internal.h.a(a.class), new InterfaceC0635a<Bundle>() { // from class: com.luminary.business.presentation.ui.fragments.cards.card_transaction_detail.CardTransactionDetailsFragment$special$$inlined$navArgs$1
        {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        public final Bundle invoke() {
            Fragment fragment = Fragment.this;
            Bundle arguments = fragment.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException(androidx.camera.core.impl.utils.a.k("Fragment ", fragment, " has null arguments"));
        }
    });

    public CardTransactionDetailsFragment() {
        org.koin.java.a.a(K5.a.class);
    }

    public static void U0(TextView textView, TextView textView2, String str) {
        if (str != null && str.length() != 0) {
            textView2.setText(str);
        } else {
            o.b(textView);
            o.b(textView2);
        }
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = true;
        toolbarStatus.f13276o = null;
        toolbarStatus.f13263a = getString(R.string.transaction_details);
        toolbarStatus.f13265c = 18;
        return toolbarStatus;
    }

    public final void T0(CardTransactionDomain cardTransactionDomain) {
        String plainString;
        String I10;
        String plainString2;
        String I11;
        Integer M8;
        String plainString3;
        String plainString4;
        Y2 u02 = u0();
        BigDecimal bigDecimal = cardTransactionDomain.f10757f;
        String str = null;
        String v10 = (bigDecimal == null || (plainString4 = bigDecimal.toPlainString()) == null) ? null : b.v(plainString4);
        String str2 = cardTransactionDomain.f10758g;
        u02.f28694n.setText(b.v0("-", v10, (bigDecimal == null || (plainString3 = bigDecimal.toPlainString()) == null) ? null : b.u(plainString3, str2), cardTransactionDomain.f10758g, 36, 20, false, true, false, 256));
        Y2 u03 = u0();
        String str3 = cardTransactionDomain.f10762l;
        u03.f28698r.setImageResource((str3 == null || (M8 = b.M(requireContext(), str3)) == null) ? 0 : M8.intValue());
        u0().f28699s.setText(cardTransactionDomain.f10763m);
        u0().f28700t.setText(getString(R.string.outgoing_payment));
        Y2 u04 = u0();
        Y2 u05 = u0();
        Date date = cardTransactionDomain.f10766p;
        U0(u04.f28695o, u05.f28696p, date != null ? b.F0(date, "HH:mm, EEE dd MMM") : null);
        U0(u0().f28684D, u0().f28685E, cardTransactionDomain.f10767q);
        U0(u0().f28702v, u0().f28703w, cardTransactionDomain.f10773w);
        U0(u0().f28704x, u0().f28705y, cardTransactionDomain.f10772v);
        U0(u0().f28688H, u0().f28689I, cardTransactionDomain.f10769s);
        U0(u0().f28692L, u0().f28693M, cardTransactionDomain.f10770t);
        U0(u0().f28686F, u0().f28687G, cardTransactionDomain.f10768r);
        U0(u0().f28706z, u0().f28681A, cardTransactionDomain.f10771u);
        Y2 u06 = u0();
        Y2 u07 = u0();
        BigDecimal bigDecimal2 = cardTransactionDomain.f10761k;
        U0(u06.f28690J, u07.f28691K, "-" + b.o(str3, (bigDecimal2 == null || (plainString2 = bigDecimal2.toPlainString()) == null || (I11 = b.I(plainString2, str3)) == null) ? null : C0967l.X(I11, "-", "", false)));
        Y2 u08 = u0();
        Y2 u09 = u0();
        if (bigDecimal != null && (plainString = bigDecimal.toPlainString()) != null && (I10 = b.I(plainString, str2)) != null) {
            str = C0967l.X(I10, "-", "", false);
        }
        U0(u08.f28682B, u09.f28683C, "-" + b.o(str2, str));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Integer M8;
        String plainString;
        String plainString2;
        String plainString3;
        String I10;
        Integer M10;
        String plainString4;
        String plainString5;
        super.onViewCreated(view, bundle);
        h hVar = this.f11775o0;
        CardTransactionDomain cardTransactionDomain = ((a) hVar.getValue()).f3669b;
        VaultDomain vaultDomain = ((a) hVar.getValue()).f3668a;
        Y2 u02 = u0();
        u02.f28701u.setText(cardTransactionDomain.f10765o);
        u02.f28697q.setImageResource(b.L(cardTransactionDomain));
        String str = cardTransactionDomain.f10756e;
        String lowerCase = str != null ? str.toLowerCase(Locale.ROOT) : null;
        if (lowerCase != null) {
            int hashCode = lowerCase.hashCode();
            Date date = cardTransactionDomain.f10766p;
            String str2 = cardTransactionDomain.f10758g;
            BigDecimal bigDecimal = cardTransactionDomain.f10757f;
            int i = 0;
            switch (hashCode) {
                case -1385570183:
                    if (lowerCase.equals("authorization")) {
                        T0(cardTransactionDomain);
                        break;
                    }
                    break;
                case -1199938726:
                    if (lowerCase.equals("accountadjustment")) {
                        Y2 u03 = u0();
                        String str3 = cardTransactionDomain.f10755d;
                        u03.f28694n.setText(b.v0(f.b(str3 != null ? str3.toLowerCase(Locale.ROOT) : null, "debit") ? "-" : "+", (bigDecimal == null || (plainString2 = bigDecimal.toPlainString()) == null) ? null : b.v(plainString2), (bigDecimal == null || (plainString = bigDecimal.toPlainString()) == null) ? null : b.u(plainString, str2), cardTransactionDomain.f10758g, 36, 20, false, true, false, 256));
                        Y2 u04 = u0();
                        if (str2 != null && (M8 = b.M(requireContext(), str2)) != null) {
                            i = M8.intValue();
                        }
                        u04.f28698r.setImageResource(i);
                        u0().f28699s.setText(vaultDomain.f10781d);
                        u0().f28700t.setText(getString(R.string.card_vault_topup));
                        U0(u0().f28695o, u0().f28696p, date != null ? b.F0(date, "HH:mm, EEE dd MMM") : null);
                        U0(u0().f28684D, u0().f28685E, cardTransactionDomain.f10767q);
                        U0(u0().f28702v, u0().f28703w, null);
                        U0(u0().f28704x, u0().f28705y, null);
                        U0(u0().f28688H, u0().f28689I, null);
                        U0(u0().f28692L, u0().f28693M, null);
                        U0(u0().f28686F, u0().f28687G, null);
                        U0(u0().f28706z, u0().f28681A, null);
                        U0(u0().f28690J, u0().f28691K, null);
                        U0(u0().f28682B, u0().f28683C, null);
                        break;
                    }
                    break;
                case 101254:
                    if (lowerCase.equals("fee")) {
                        u0().f28694n.setText(b.v0("-", (bigDecimal == null || (plainString5 = bigDecimal.toPlainString()) == null) ? null : b.v(plainString5), (bigDecimal == null || (plainString4 = bigDecimal.toPlainString()) == null) ? null : b.u(plainString4, str2), cardTransactionDomain.f10758g, 36, 20, false, true, false, 256));
                        u0().f28698r.setImageResource((str2 == null || (M10 = b.M(getContext(), str2)) == null) ? 0 : M10.intValue());
                        u0().f28699s.setText(getString(R.string.fx_fee));
                        u0().f28700t.setText(getString(R.string.authorization_foreign_exchange));
                        U0(u0().f28695o, u0().f28696p, date != null ? b.F0(date, "HH:mm, EEE dd MMM") : null);
                        U0(u0().f28684D, u0().f28685E, null);
                        U0(u0().f28702v, u0().f28703w, cardTransactionDomain.f10773w);
                        U0(u0().f28704x, u0().f28705y, cardTransactionDomain.f10772v);
                        U0(u0().f28688H, u0().f28689I, null);
                        U0(u0().f28692L, u0().f28693M, null);
                        U0(u0().f28686F, u0().f28687G, null);
                        U0(u0().f28706z, u0().f28681A, null);
                        U0(u0().f28690J, u0().f28691K, s3.b.j("-", b.o(str2, (bigDecimal == null || (plainString3 = bigDecimal.toPlainString()) == null || (I10 = b.I(plainString3, str2)) == null) ? null : C0967l.X(I10, "-", "", false))));
                        U0(u0().f28682B, u0().f28683C, null);
                        break;
                    }
                    break;
                case 2141246174:
                    if (lowerCase.equals("transaction")) {
                        T0(cardTransactionDomain);
                        break;
                    }
                    break;
            }
        }
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f11774n0;
    }
}
