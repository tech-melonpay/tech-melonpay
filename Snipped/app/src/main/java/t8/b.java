package t8;

import O9.p;
import android.os.Build;
import ca.InterfaceC0635a;
import com.luminary.business.domain.entity.transaction.PaymentType;
import com.luminary.business.presentation.entity.payment.PaymentUI;
import com.luminary.business.presentation.ui.fragments.transactions.TransactionDetailsFragment;
import com.luminary.business.presentation.utils.filepiker.FilePickerContractor;
import com.luminary.mobile.R;
import java.io.File;
import java.math.BigDecimal;
import java.util.Locale;
import s6.L;
import s6.M;
import s6.N;
import s6.O;
import s6.P;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements InterfaceC0635a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29934a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransactionDetailsFragment f29935b;

    public /* synthetic */ b(TransactionDetailsFragment transactionDetailsFragment, int i) {
        this.f29934a = i;
        this.f29935b = transactionDetailsFragment;
    }

    @Override // ca.InterfaceC0635a
    public final Object invoke() {
        String str;
        F5.b value;
        switch (this.f29934a) {
            case 0:
                this.f29935b.f13129q0.a(FilePickerContractor.FileTypeEnum.Image);
                break;
            case 1:
                int i = Build.VERSION.SDK_INT;
                TransactionDetailsFragment transactionDetailsFragment = this.f29935b;
                if (i < 29) {
                    transactionDetailsFragment.f13131t0.a("android.permission.WRITE_EXTERNAL_STORAGE");
                } else {
                    transactionDetailsFragment.f13132u0.a("android.permission.CAMERA");
                }
                break;
            case 2:
                TransactionDetailsFragment transactionDetailsFragment2 = this.f29935b;
                F5.b value2 = transactionDetailsFragment2.U0().f29964a1.getValue();
                if (value2 != null) {
                    transactionDetailsFragment2.U0();
                    BigDecimal bigDecimal = value2.f1195h;
                    if (bigDecimal == null) {
                        bigDecimal = BigDecimal.ZERO;
                    }
                    BigDecimal scale = bigDecimal.abs().setScale(2);
                    String str2 = D9.b.c0(value2) ? value2.f1197k : value2.f1204r;
                    PaymentUI paymentUI = new PaymentUI(PaymentType.f11147a, scale, "", str2 == null ? "" : str2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 134217696);
                    paymentUI.f11343o = String.valueOf(value2.f1192e);
                    String str3 = value2.i;
                    if (str3 != null) {
                        paymentUI.f11337h = str3;
                    }
                    paymentUI.i = K3.a.a(str3);
                    paymentUI.f11336g = value2.f1196j;
                    paymentUI.f11333d = D9.b.c0(value2) ? value2.f1201o : value2.f1209w;
                    paymentUI.f11335f = D9.b.c0(value2) ? value2.f1198l : value2.f1205s;
                    paymentUI.f11338j = D9.b.c0(value2) ? value2.f1199m : value2.f1207u;
                    paymentUI.f11339k = D9.b.c0(value2) ? value2.f1200n : value2.f1208v;
                    if (!D9.b.c0(value2) ? (str = value2.f1178H) == null : (str = value2.f1177G) == null) {
                        str = "";
                    }
                    paymentUI.f11347s = str;
                    paymentUI.f11348t = value2.f1181K;
                    paymentUI.f11349u = value2.f1182L;
                    paymentUI.f11350v = value2.f1183M;
                    paymentUI.f11351w = value2.f1184N;
                    paymentUI.f11352x = value2.f1185O;
                    paymentUI.f11353y = value2.f1186P;
                    paymentUI.f11354z = value2.f1187Q;
                    paymentUI.f11329A = value2.R;
                    String str4 = value2.f1194g;
                    if (kotlin.jvm.internal.f.b(str4 != null ? str4.toLowerCase(Locale.ROOT) : null, "swift")) {
                        U4.b.g(transactionDetailsFragment2).j(new N(paymentUI, false, R.id.transactionDetailsFragment));
                    } else {
                        if (kotlin.jvm.internal.f.b(str4 != null ? str4.toLowerCase(Locale.ROOT) : null, "to_bank_account")) {
                            U4.b.g(transactionDetailsFragment2).j(new O(paymentUI, false, R.id.transactionDetailsFragment));
                        } else {
                            if (kotlin.jvm.internal.f.b(str4 != null ? str4.toLowerCase(Locale.ROOT) : null, "sepa")) {
                                U4.b.g(transactionDetailsFragment2).j(new M(paymentUI, false, R.id.transactionDetailsFragment));
                            } else {
                                if (kotlin.jvm.internal.f.b(str4 != null ? str4.toLowerCase(Locale.ROOT) : null, "internal")) {
                                    U4.b.g(transactionDetailsFragment2).j(new L(paymentUI, false, R.id.transactionDetailsFragment));
                                } else {
                                    if (kotlin.jvm.internal.f.b(str4 != null ? str4.toLowerCase(Locale.ROOT) : null, "fasterpayment")) {
                                        U4.b.g(transactionDetailsFragment2).j(new P(paymentUI, false, R.id.transactionDetailsFragment));
                                    }
                                }
                            }
                        }
                    }
                }
                break;
            case 3:
                TransactionDetailsFragment transactionDetailsFragment3 = this.f29935b;
                F5.b value3 = transactionDetailsFragment3.U0().f29964a1.getValue();
                String str5 = value3 != null ? value3.f1188a : null;
                if (str5 != null && (value = transactionDetailsFragment3.U0().f29964a1.getValue()) != null) {
                    if (kotlin.jvm.internal.f.b(value.f1175E, Boolean.TRUE)) {
                        File file = new File(transactionDetailsFragment3.requireContext().getFilesDir().getAbsolutePath(), "Statements");
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        j U02 = transactionDetailsFragment3.U0();
                        E7.f fVar = new E7.f(U02, str5, file.getAbsolutePath());
                        U02.f420L0 = fVar;
                        fVar.invoke();
                        break;
                    }
                }
                F8.e.a(transactionDetailsFragment3, null, new b(transactionDetailsFragment3, 4), new b(transactionDetailsFragment3, 0), new b(transactionDetailsFragment3, 1));
                break;
            default:
                this.f29935b.f13129q0.a(FilePickerContractor.FileTypeEnum.PDF);
                break;
        }
        return p.f3034a;
    }
}
