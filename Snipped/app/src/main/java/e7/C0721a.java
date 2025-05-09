package e7;

import O9.p;
import android.os.Bundle;
import androidx.navigation.NavController;
import ca.InterfaceC0635a;
import com.luminary.business.domain.entity.cards.VaultDomain;
import com.luminary.business.presentation.ui.fragments.createNewVirtualCard.CreateNewVirtualCardFragment;
import com.luminary.business.presentation.ui.fragments.statements.StatementsSelectorDialog;
import com.luminary.mobile.R;
import java.util.List;
import t6.A3;

/* compiled from: R8$$SyntheticClass */
/* renamed from: e7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0721a implements InterfaceC0635a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20536a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CreateNewVirtualCardFragment f20537b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ A3 f20538c;

    public /* synthetic */ C0721a(CreateNewVirtualCardFragment createNewVirtualCardFragment, A3 a32) {
        this.f20537b = createNewVirtualCardFragment;
        this.f20538c = a32;
    }

    @Override // ca.InterfaceC0635a
    public final Object invoke() {
        switch (this.f20536a) {
            case 0:
                String valueOf = String.valueOf(this.f20538c.f27608q.getText());
                CreateNewVirtualCardFragment createNewVirtualCardFragment = this.f20537b;
                NavController g10 = U4.b.g(createNewVirtualCardFragment);
                String str = createNewVirtualCardFragment.T0().f20542b;
                String str2 = createNewVirtualCardFragment.T0().f20543c;
                String name = createNewVirtualCardFragment.f11918p0.name();
                String str3 = createNewVirtualCardFragment.T0().f20544d;
                VaultDomain vaultDomain = createNewVirtualCardFragment.U0().f20554X0;
                String valueOf2 = String.valueOf(vaultDomain != null ? Integer.valueOf(vaultDomain.f10778a) : null);
                g10.getClass();
                Bundle bundle = new Bundle();
                bundle.putString("accountId", str);
                bundle.putString("programId", str2);
                bundle.putString("cardName", valueOf);
                bundle.putString("vaultName", str3);
                bundle.putString("navigationType", name);
                bundle.putString("vaultId", valueOf2);
                g10.i(R.id.actionToCardSecurityVerificationFragment, bundle);
                break;
            default:
                CreateNewVirtualCardFragment createNewVirtualCardFragment2 = this.f20537b;
                StatementsSelectorDialog statementsSelectorDialog = new StatementsSelectorDialog(createNewVirtualCardFragment2.requireContext(), StatementsSelectorDialog.DialogType.f13047e);
                statementsSelectorDialog.f13042w = new J8.c(10, this.f20538c, createNewVirtualCardFragment2);
                List<VaultDomain> value = createNewVirtualCardFragment2.U0().f20553W0.getValue();
                List<VaultDomain> list = value;
                if (list != null && !list.isEmpty()) {
                    statementsSelectorDialog.show();
                    StatementsSelectorDialog.l(statementsSelectorDialog, C0724d.a(value));
                    statementsSelectorDialog.m(createNewVirtualCardFragment2.getString(R.string.select_vault));
                }
                break;
        }
        return p.f3034a;
    }

    public /* synthetic */ C0721a(A3 a32, CreateNewVirtualCardFragment createNewVirtualCardFragment) {
        this.f20538c = a32;
        this.f20537b = createNewVirtualCardFragment;
    }
}
