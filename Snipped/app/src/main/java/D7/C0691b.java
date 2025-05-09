package d7;

import O9.p;
import ca.InterfaceC0646l;
import com.luminary.business.presentation.ui.fragments.createNewCardVault.CreateNewCardVaultFragment;
import com.luminary.mobile.R;
import t6.AbstractC1477y3;

/* compiled from: FragmentExt.kt */
/* renamed from: d7.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0691b implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20443a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CreateNewCardVaultFragment f20444b;

    public /* synthetic */ C0691b(CreateNewCardVaultFragment createNewCardVaultFragment, int i) {
        this.f20443a = i;
        this.f20444b = createNewCardVaultFragment;
    }

    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        switch (this.f20443a) {
            case 0:
                Boolean bool = (Boolean) obj;
                CreateNewCardVaultFragment createNewCardVaultFragment = this.f20444b;
                AbstractC1477y3 u02 = createNewCardVaultFragment.u0();
                u02.f29847q.setEnabled(bool.booleanValue());
                createNewCardVaultFragment.u0().f29848r.setEnabled(bool.booleanValue());
                break;
            default:
                Boolean bool2 = (Boolean) obj;
                if (bool2 != null) {
                    boolean booleanValue = bool2.booleanValue();
                    CreateNewCardVaultFragment createNewCardVaultFragment2 = this.f20444b;
                    if (booleanValue) {
                        AbstractC1477y3 u03 = createNewCardVaultFragment2.u0();
                        u03.f29845o.setErrorWithoutFocusWithPaddings(createNewCardVaultFragment2.getString(R.string.insufficient_balance));
                    } else {
                        createNewCardVaultFragment2.u0().f29851u.setVisibility(0);
                        createNewCardVaultFragment2.u0().f29845o.setError(null);
                    }
                }
                break;
        }
        return p.f3034a;
    }
}
