package k7;

import O9.p;
import P9.s;
import ca.InterfaceC0646l;
import com.luminary.business.domain.entity.cryptoaccount.CryptoAccountDomain;
import com.luminary.business.presentation.ui.fragments.crypto.create_new_account.CreateAccountFragment;
import com.luminary.business.presentation.utils.bottomDialog.BottomDialogType;
import com.luminary.mobile.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.f;
import w5.C1572a;

/* compiled from: R8$$SyntheticClass */
/* renamed from: k7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0948a implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23028a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CreateAccountFragment f23029b;

    public /* synthetic */ C0948a(CreateAccountFragment createAccountFragment, int i) {
        this.f23028a = i;
        this.f23029b = createAccountFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        String str;
        switch (this.f23028a) {
            case 0:
                this.f23029b.getClass();
                break;
            case 1:
                if (((CryptoAccountDomain) obj) != null) {
                    BottomDialogType.a aVar = BottomDialogType.f13289k;
                    CreateAccountFragment createAccountFragment = this.f23029b;
                    createAccountFragment.requireContext();
                    aVar.getClass();
                    BottomDialogType d10 = BottomDialogType.a.d();
                    C1572a c1572a = createAccountFragment.f11991p0;
                    if (c1572a == null || (str = c1572a.f30827b) == null) {
                        str = "";
                    }
                    d10.f13295a = createAccountFragment.getString(R.string.wallet_is_now_active, str);
                    d10.f13297c = createAccountFragment.getString(R.string.done);
                    createAccountFragment.w0().c(d10, new C0949b(createAccountFragment, 4), null);
                    createAccountFragment.U0().f23042Z0.postValue(null);
                    break;
                } else {
                    break;
                }
                break;
            case 2:
                CreateAccountFragment createAccountFragment2 = this.f23029b;
                createAccountFragment2.u0().f29513r.setText((String) obj);
                createAccountFragment2.V0();
                break;
            default:
                String str2 = (String) obj;
                CreateAccountFragment createAccountFragment3 = this.f23029b;
                createAccountFragment3.u0().f29511p.setText("       ".concat(str2));
                Integer z10 = D9.b.z(str2);
                if (z10 != null) {
                    createAccountFragment3.u0().f29512q.setImageResource(z10.intValue());
                }
                List<C1572a> value = createAccountFragment3.U0().f23040X0.getValue();
                C1572a c1572a2 = null;
                if (value != null) {
                    Iterator<T> it = value.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (f.b(((C1572a) next).f30827b, str2)) {
                                c1572a2 = next;
                            }
                        }
                    }
                    c1572a2 = c1572a2;
                }
                createAccountFragment3.f11991p0 = c1572a2;
                createAccountFragment3.u0().f29513r.setText((CharSequence) s.L(createAccountFragment3.T0()));
                createAccountFragment3.V0();
                break;
        }
        return p.f3034a;
    }
}
