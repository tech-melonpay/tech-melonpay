package D6;

import C.v;
import D8.a;
import O9.p;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.NavController;
import ca.InterfaceC0635a;
import com.luminary.business.presentation.entity.account.AccountDetailsUI;
import com.luminary.business.presentation.ui.fragments.accountdetails.AccountDetailsFragment;
import com.luminary.business.presentation.ui.fragments.crypto.crypto_exchange.CryptoExchangeFragment$Companion$DirectionType;
import com.luminary.business.presentation.utils.bottomDialog.BottomDialogType;
import com.luminary.mobile.R;
import java.io.Serializable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements InterfaceC0635a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f932a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AccountDetailsFragment f933b;

    public /* synthetic */ e(AccountDetailsFragment accountDetailsFragment, int i) {
        this.f932a = i;
        this.f933b = accountDetailsFragment;
    }

    @Override // ca.InterfaceC0635a
    public final Object invoke() {
        Parcelable parcelable;
        AccountDetailsFragment accountDetailsFragment = this.f933b;
        switch (this.f932a) {
            case 0:
                com.luminary.business.presentation.ui.fragments.accountdetails.a aVar = accountDetailsFragment.f11483q0;
                if (aVar == null || (parcelable = aVar.f11500a) == null) {
                    return null;
                }
                NavController g10 = U4.b.g(accountDetailsFragment);
                Bundle g11 = v.g(g10);
                if (Parcelable.class.isAssignableFrom(AccountDetailsUI.class)) {
                    g11.putParcelable("account", parcelable);
                } else {
                    if (!Serializable.class.isAssignableFrom(AccountDetailsUI.class)) {
                        throw new UnsupportedOperationException(AccountDetailsUI.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                    }
                    g11.putSerializable("account", (Serializable) parcelable);
                }
                g10.i(R.id.action_accountDetailsFragment_to_editAccountFragment, g11);
                return p.f3034a;
            case 1:
                accountDetailsFragment.J0();
                return p.f3034a;
            case 2:
                NavController g12 = U4.b.g(accountDetailsFragment);
                CryptoExchangeFragment$Companion$DirectionType cryptoExchangeFragment$Companion$DirectionType = CryptoExchangeFragment$Companion$DirectionType.f12050a;
                g12.j(new f("", "", 0.0f));
                return p.f3034a;
            default:
                BottomDialogType.f13289k.getClass();
                BottomDialogType a10 = BottomDialogType.a.a();
                a10.f13295a = accountDetailsFragment.getString(R.string.what_is_bank_app_id);
                a10.f13296b = accountDetailsFragment.getString(R.string.what_is_bank_app_id_description);
                a10.f13300f = Integer.valueOf(R.drawable.img_rocket);
                a.C0010a.a(accountDetailsFragment.w0(), a10, null, 6);
                return p.f3034a;
        }
    }
}
