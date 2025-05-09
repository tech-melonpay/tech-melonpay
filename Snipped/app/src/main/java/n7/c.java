package n7;

import android.view.View;
import com.luminary.business.presentation.ui.fragments.crypto.crypto_wallet_list.CryptoListFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24252a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CryptoListFragment f24253b;

    public /* synthetic */ c(CryptoListFragment cryptoListFragment, int i) {
        this.f24252a = i;
        this.f24253b = cryptoListFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f24252a) {
            case 0:
                CryptoListFragment cryptoListFragment = this.f24253b;
                if (cryptoListFragment.isAdded()) {
                    cryptoListFragment.f12067r0 = true;
                    cryptoListFragment.L0();
                    break;
                }
                break;
            case 1:
                CryptoListFragment cryptoListFragment2 = this.f24253b;
                if (cryptoListFragment2.isAdded()) {
                    cryptoListFragment2.f12067r0 = false;
                    cryptoListFragment2.L0();
                    break;
                }
                break;
            case 2:
                CryptoListFragment cryptoListFragment3 = this.f24253b;
                if (cryptoListFragment3.isAdded()) {
                    cryptoListFragment3.f12067r0 = true;
                    cryptoListFragment3.L0();
                    break;
                }
                break;
            default:
                CryptoListFragment cryptoListFragment4 = this.f24253b;
                if (cryptoListFragment4.isAdded()) {
                    cryptoListFragment4.f12067r0 = false;
                    cryptoListFragment4.L0();
                    break;
                }
                break;
        }
    }
}
