package u8;

import J5.b;
import O9.p;
import ca.InterfaceC0635a;
import com.luminary.business.domain.entity.account.BankAccountDomain;
import com.luminary.business.presentation.ui.fragments.transfer.TransferFragment;
import com.luminary.mobile.R;
import java.math.BigDecimal;
import java.util.Locale;
import ka.C0966k;
import kotlin.Pair;
import w6.C1573a;
import w7.C1574a;
import w7.C1575b;

/* compiled from: R8$$SyntheticClass */
/* renamed from: u8.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1528d implements InterfaceC0635a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30349a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransferFragment f30350b;

    public /* synthetic */ C1528d(TransferFragment transferFragment, int i) {
        this.f30349a = i;
        this.f30350b = transferFragment;
    }

    @Override // ca.InterfaceC0635a
    public final Object invoke() {
        String str;
        BankAccountDomain bankAccountDomain;
        String str2;
        Double R;
        BigDecimal bigDecimal;
        switch (this.f30349a) {
            case 0:
                break;
            case 1:
                TransferFragment transferFragment = this.f30350b;
                C1573a c1573a = transferFragment.f13143p0;
                BankAccountDomain bankAccountDomain2 = c1573a.f30837a;
                if (bankAccountDomain2 != null && (str = bankAccountDomain2.f10700g) != null && (bankAccountDomain = c1573a.f30838b) != null && (str2 = bankAccountDomain.f10700g) != null && (R = C0966k.R(D9.b.r0(c1573a.f30840d))) != null) {
                    double doubleValue = R.doubleValue();
                    C1573a c1573a2 = transferFragment.f13143p0;
                    BankAccountDomain bankAccountDomain3 = c1573a2.f30837a;
                    if (((bankAccountDomain3 == null || (bigDecimal = bankAccountDomain3.f10698e) == null) ? 0.0d : bigDecimal.doubleValue()) < doubleValue) {
                        transferFragment.T0().d(new b.c(transferFragment.getString(R.string.you_dont_have_enough_money_to_make_transfer)));
                    } else {
                        C1575b T02 = transferFragment.T0();
                        String str3 = c1573a2.f30837a.f10701h;
                        String upperCase = str3 != null ? str3.toUpperCase(Locale.ROOT) : "";
                        String valueOf = String.valueOf(doubleValue);
                        String str4 = c1573a2.f30839c;
                        int h9 = T02.f30847V0.h();
                        T02.l();
                        T02.f30845T0.a(new C1574a(T02, 0), new Pair(String.valueOf(h9), new x5.d(str, str2, valueOf, upperCase, str4)));
                    }
                }
                break;
            default:
                this.f30350b.u0().f29480n.callOnClick();
                break;
        }
        return p.f3034a;
    }
}
