package N4;

import com.luminary.business.domain.entity.cryptoaccount.CryptoAccountDomain;
import j4.C0896a;

/* compiled from: CryptoAccountRawMapper.kt */
/* loaded from: classes.dex */
public final class a {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final CryptoAccountDomain a(C0896a c0896a) {
        CryptoAccountDomain.WalletStatus walletStatus;
        Long g10 = c0896a.g();
        Long d10 = c0896a.d();
        String b9 = c0896a.b();
        String i = c0896a.i();
        CryptoAccountDomain.WalletStatus.a aVar = CryptoAccountDomain.WalletStatus.f10978a;
        String l10 = c0896a.l();
        if (l10 == null) {
            l10 = "";
        }
        aVar.getClass();
        switch (l10.hashCode()) {
            case -2052298979:
                if (l10.equals("ASSETS_RECEIVED")) {
                    walletStatus = CryptoAccountDomain.WalletStatus.f10979b;
                    break;
                }
                walletStatus = CryptoAccountDomain.WalletStatus.f10979b;
                break;
            case -2026521607:
                if (l10.equals("DELETED")) {
                    walletStatus = CryptoAccountDomain.WalletStatus.f10983f;
                    break;
                }
                walletStatus = CryptoAccountDomain.WalletStatus.f10979b;
                break;
            case -1363898457:
                if (l10.equals("ACCEPTED")) {
                    walletStatus = CryptoAccountDomain.WalletStatus.f10981d;
                    break;
                }
                walletStatus = CryptoAccountDomain.WalletStatus.f10979b;
                break;
            case -906145362:
                if (l10.equals("WAITING_DECISION")) {
                    walletStatus = CryptoAccountDomain.WalletStatus.f10979b;
                    break;
                }
                walletStatus = CryptoAccountDomain.WalletStatus.f10979b;
                break;
            case -225166217:
                if (l10.equals("ADD_DATA_REQUESTED")) {
                    walletStatus = CryptoAccountDomain.WalletStatus.f10980c;
                    break;
                }
                walletStatus = CryptoAccountDomain.WalletStatus.f10979b;
                break;
            case 77184:
                if (l10.equals("NEW")) {
                    walletStatus = CryptoAccountDomain.WalletStatus.f10979b;
                    break;
                }
                walletStatus = CryptoAccountDomain.WalletStatus.f10979b;
                break;
            case 38884052:
                if (l10.equals("ASSETS_SENT")) {
                    walletStatus = CryptoAccountDomain.WalletStatus.f10979b;
                    break;
                }
                walletStatus = CryptoAccountDomain.WalletStatus.f10979b;
                break;
            case 174130302:
                if (l10.equals("REJECTED")) {
                    walletStatus = CryptoAccountDomain.WalletStatus.f10982e;
                    break;
                }
                walletStatus = CryptoAccountDomain.WalletStatus.f10979b;
                break;
            case 696544716:
                if (l10.equals("BLOCKED")) {
                    walletStatus = CryptoAccountDomain.WalletStatus.f10985h;
                    break;
                }
                walletStatus = CryptoAccountDomain.WalletStatus.f10979b;
                break;
            case 797688210:
                if (l10.equals("ASSETS_REQUESTED")) {
                    walletStatus = CryptoAccountDomain.WalletStatus.f10980c;
                    break;
                }
                walletStatus = CryptoAccountDomain.WalletStatus.f10979b;
                break;
            case 1024499391:
                if (l10.equals("UNDER_REVIEW")) {
                    walletStatus = CryptoAccountDomain.WalletStatus.f10979b;
                    break;
                }
                walletStatus = CryptoAccountDomain.WalletStatus.f10979b;
                break;
            case 1925346054:
                if (l10.equals("ACTIVE")) {
                    walletStatus = CryptoAccountDomain.WalletStatus.f10984g;
                    break;
                }
                walletStatus = CryptoAccountDomain.WalletStatus.f10979b;
                break;
            default:
                walletStatus = CryptoAccountDomain.WalletStatus.f10979b;
                break;
        }
        return new CryptoAccountDomain(g10, d10, b9, i, walletStatus, c0896a.h(), c0896a.m(), c0896a.e(), c0896a.q(), c0896a.p(), c0896a.o(), c0896a.k(), c0896a.j(), c0896a.f(), c0896a.n(), c0896a.c());
    }
}
