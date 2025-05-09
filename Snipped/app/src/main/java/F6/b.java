package F6;

import C.v;
import O9.p;
import ca.InterfaceC0635a;
import com.luminary.business.presentation.ui.fragments.auth.WelcomeFragment;
import com.luminary.business.presentation.utils.bottomDialog.BottomDialogType;
import com.luminary.mobile.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements InterfaceC0635a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1215a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WelcomeFragment f1216b;

    public /* synthetic */ b(WelcomeFragment welcomeFragment, int i) {
        this.f1215a = i;
        this.f1216b = welcomeFragment;
    }

    @Override // ca.InterfaceC0635a
    public final Object invoke() {
        switch (this.f1215a) {
            case 0:
                v.w(U4.b.g(this.f1216b), R.id.action_welcomeFragment_to_loginFragment);
                break;
            case 1:
                WelcomeFragment welcomeFragment = this.f1216b;
                welcomeFragment.getClass();
                BottomDialogType.f13289k.getClass();
                BottomDialogType c2 = BottomDialogType.a.c();
                c2.f13301g = BottomDialogType.Type.PERSONAL;
                c2.f13295a = welcomeFragment.getString(R.string.are_you_a_director_of_the_company);
                c2.f13297c = welcomeFragment.getString(R.string.yes_continue);
                c2.f13298d = Integer.valueOf(R.drawable.button_bg);
                c2.f13299e = welcomeFragment.getString(R.string.go_back);
                welcomeFragment.w0().c(c2, new b(welcomeFragment, 2), new b(welcomeFragment, 3));
                break;
            case 2:
                WelcomeFragment welcomeFragment2 = this.f1216b;
                welcomeFragment2.T0().f1236U0.p();
                v.w(U4.b.g(welcomeFragment2), R.id.action_welcomeFragment_to_registerFragment);
                break;
            default:
                this.f1216b.w0().dismiss();
                break;
        }
        return p.f3034a;
    }
}
