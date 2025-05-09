package t7;

import O9.p;
import P9.m;
import android.os.Build;
import ca.InterfaceC0635a;
import com.luminary.business.domain.entity.cryptowallet.CryptowalletDomain;
import com.luminary.business.presentation.ui.fragments.crypto.verify_transaction.VerifyTransactionFragment;
import com.luminary.business.presentation.ui.fragments.newcompany.NewCompanyViewModel;
import com.luminary.business.presentation.utils.filepiker.FilePickerContractor;
import com.luminary.mobile.R;
import u5.j;
import v5.i;
import y8.DialogC1623d;

/* compiled from: R8$$SyntheticClass */
/* renamed from: t7.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1488b implements InterfaceC0635a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29915a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VerifyTransactionFragment f29916b;

    public /* synthetic */ C1488b(VerifyTransactionFragment verifyTransactionFragment, int i) {
        this.f29915a = i;
        this.f29916b = verifyTransactionFragment;
    }

    @Override // ca.InterfaceC0635a
    public final Object invoke() {
        CryptowalletDomain cryptowalletDomain;
        Long l10;
        CryptowalletDomain cryptowalletDomain2;
        String str;
        CryptowalletDomain cryptowalletDomain3;
        String str2;
        String str3;
        switch (this.f29915a) {
            case 0:
                this.f29916b.f12176u0.a(FilePickerContractor.FileTypeEnum.Image);
                break;
            case 1:
                int i = Build.VERSION.SDK_INT;
                VerifyTransactionFragment verifyTransactionFragment = this.f29916b;
                if (i < 29) {
                    verifyTransactionFragment.f12174r0.a("android.permission.WRITE_EXTERNAL_STORAGE");
                } else {
                    verifyTransactionFragment.s0.a("android.permission.CAMERA");
                }
                break;
            case 2:
                VerifyTransactionFragment verifyTransactionFragment2 = this.f29916b;
                String str4 = verifyTransactionFragment2.f12175t0;
                if (str4 == null) {
                    str4 = "";
                }
                m.n(str4);
                com.luminary.business.presentation.ui.fragments.crypto.verify_transaction.a aVar = verifyTransactionFragment2.f12173q0;
                if (aVar != null && (cryptowalletDomain = aVar.f12184a) != null && (l10 = cryptowalletDomain.f11072a) != null) {
                    final long longValue = l10.longValue();
                    final f fVar = (f) verifyTransactionFragment2.f12171o0.getValue();
                    final String valueOf = String.valueOf(verifyTransactionFragment2.u0().f29903p.getText());
                    String str5 = verifyTransactionFragment2.f12175t0;
                    final String str6 = str5 == null ? "" : str5;
                    InterfaceC0635a<p> interfaceC0635a = new InterfaceC0635a() { // from class: t7.d

                        /* renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ String f29921c = "ASSETS_SENT";

                        /* renamed from: f, reason: collision with root package name */
                        public final /* synthetic */ String f29924f = "";

                        @Override // ca.InterfaceC0635a
                        public final Object invoke() {
                            f fVar2 = f.this;
                            fVar2.l();
                            int h9 = fVar2.f29927T0.h();
                            Long valueOf2 = Long.valueOf(longValue);
                            Integer valueOf3 = Integer.valueOf(h9);
                            NewCompanyViewModel.UploadFileType uploadFileType = NewCompanyViewModel.UploadFileType.f12461a;
                            i iVar = new i(valueOf2, valueOf3, this.f29921c, valueOf, m.n(new j(str6, "CUSTOM", this.f29924f, null, null, null)));
                            fVar2.f29929V0.a(new C1491e(fVar2, 0), iVar);
                            return p.f3034a;
                        }
                    };
                    fVar.f419K0 = interfaceC0635a;
                    interfaceC0635a.invoke();
                }
                break;
            case 3:
                this.f29916b.u0().f29901n.callOnClick();
                break;
            case 4:
                VerifyTransactionFragment verifyTransactionFragment3 = this.f29916b;
                verifyTransactionFragment3.getClass();
                F8.e.a(verifyTransactionFragment3, null, null, new C1488b(verifyTransactionFragment3, 0), new C1488b(verifyTransactionFragment3, 1));
                break;
            case 5:
                VerifyTransactionFragment verifyTransactionFragment4 = this.f29916b;
                com.luminary.business.presentation.ui.fragments.crypto.verify_transaction.a aVar2 = verifyTransactionFragment4.f12173q0;
                if (aVar2 != null && (cryptowalletDomain2 = aVar2.f12184a) != null && (str = cryptowalletDomain2.f11081k) != null) {
                    verifyTransactionFragment4.r0(str);
                }
                break;
            default:
                VerifyTransactionFragment verifyTransactionFragment5 = this.f29916b;
                com.luminary.business.presentation.ui.fragments.crypto.verify_transaction.a aVar3 = verifyTransactionFragment5.f12173q0;
                DialogC1623d dialogC1623d = null;
                if (aVar3 != null && (cryptowalletDomain3 = aVar3.f12184a) != null && (str2 = cryptowalletDomain3.f11078g) != null && (str3 = cryptowalletDomain3.f11081k) != null) {
                    dialogC1623d = new DialogC1623d(verifyTransactionFragment5.requireContext(), str3, str2);
                }
                if (dialogC1623d != null) {
                    dialogC1623d.f31135s.f29099p.setText(verifyTransactionFragment5.getString(R.string.qr));
                }
                if (dialogC1623d != null) {
                    dialogC1623d.show();
                }
                break;
        }
        return p.f3034a;
    }
}
