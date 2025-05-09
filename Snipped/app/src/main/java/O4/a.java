package O4;

import com.luminary.business.domain.entity.cryptowallet.CryptowalletDomain;
import k4.C0944b;

/* compiled from: CryptowalletRawMapper.kt */
/* loaded from: classes.dex */
public final class a {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final CryptowalletDomain a(C0944b c0944b) {
        CryptowalletDomain.WalletStatus walletStatus;
        Long f10 = c0944b.f();
        Long c2 = c0944b.c();
        String b9 = c0944b.b();
        String h9 = c0944b.h();
        CryptowalletDomain.WalletStatus.a aVar = CryptowalletDomain.WalletStatus.f11086a;
        String k3 = c0944b.k();
        if (k3 == null) {
            k3 = "";
        }
        aVar.getClass();
        switch (k3.hashCode()) {
            case -2052298979:
                if (k3.equals("ASSETS_RECEIVED")) {
                    walletStatus = CryptowalletDomain.WalletStatus.f11087b;
                    break;
                }
                walletStatus = CryptowalletDomain.WalletStatus.f11087b;
                break;
            case -2026521607:
                if (k3.equals("DELETED")) {
                    walletStatus = CryptowalletDomain.WalletStatus.f11091f;
                    break;
                }
                walletStatus = CryptowalletDomain.WalletStatus.f11087b;
                break;
            case -1363898457:
                if (k3.equals("ACCEPTED")) {
                    walletStatus = CryptowalletDomain.WalletStatus.f11089d;
                    break;
                }
                walletStatus = CryptowalletDomain.WalletStatus.f11087b;
                break;
            case -906145362:
                if (k3.equals("WAITING_DECISION")) {
                    walletStatus = CryptowalletDomain.WalletStatus.f11087b;
                    break;
                }
                walletStatus = CryptowalletDomain.WalletStatus.f11087b;
                break;
            case -225166217:
                if (k3.equals("ADD_DATA_REQUESTED")) {
                    walletStatus = CryptowalletDomain.WalletStatus.f11088c;
                    break;
                }
                walletStatus = CryptowalletDomain.WalletStatus.f11087b;
                break;
            case 77184:
                if (k3.equals("NEW")) {
                    walletStatus = CryptowalletDomain.WalletStatus.f11087b;
                    break;
                }
                walletStatus = CryptowalletDomain.WalletStatus.f11087b;
                break;
            case 38884052:
                if (k3.equals("ASSETS_SENT")) {
                    walletStatus = CryptowalletDomain.WalletStatus.f11087b;
                    break;
                }
                walletStatus = CryptowalletDomain.WalletStatus.f11087b;
                break;
            case 174130302:
                if (k3.equals("REJECTED")) {
                    walletStatus = CryptowalletDomain.WalletStatus.f11090e;
                    break;
                }
                walletStatus = CryptowalletDomain.WalletStatus.f11087b;
                break;
            case 797688210:
                if (k3.equals("ASSETS_REQUESTED")) {
                    walletStatus = CryptowalletDomain.WalletStatus.f11088c;
                    break;
                }
                walletStatus = CryptowalletDomain.WalletStatus.f11087b;
                break;
            case 1024499391:
                if (k3.equals("UNDER_REVIEW")) {
                    walletStatus = CryptowalletDomain.WalletStatus.f11087b;
                    break;
                }
                walletStatus = CryptowalletDomain.WalletStatus.f11087b;
                break;
            default:
                walletStatus = CryptowalletDomain.WalletStatus.f11087b;
                break;
        }
        return new CryptowalletDomain(f10, c2, b9, h9, walletStatus, c0944b.g(), c0944b.l(), c0944b.d(), c0944b.p(), c0944b.o(), c0944b.n(), c0944b.j(), c0944b.i(), c0944b.e(), c0944b.m());
    }
}
