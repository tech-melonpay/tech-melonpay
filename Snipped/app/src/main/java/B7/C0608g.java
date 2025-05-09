package b7;

import C.v;
import O9.p;
import ca.InterfaceC0635a;
import com.luminary.business.presentation.ui.fragments.company.list.MyCompaniesFragment;
import com.luminary.business.presentation.utils.bottomDialog.BottomDialogType;
import com.luminary.mobile.R;

/* compiled from: R8$$SyntheticClass */
/* renamed from: b7.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0608g implements InterfaceC0635a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8389a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MyCompaniesFragment f8390b;

    public /* synthetic */ C0608g(MyCompaniesFragment myCompaniesFragment, int i) {
        this.f8389a = i;
        this.f8390b = myCompaniesFragment;
    }

    @Override // ca.InterfaceC0635a
    public final Object invoke() {
        switch (this.f8389a) {
            case 0:
                MyCompaniesFragment myCompaniesFragment = this.f8390b;
                myCompaniesFragment.getClass();
                BottomDialogType.f13289k.getClass();
                BottomDialogType c2 = BottomDialogType.a.c();
                c2.f13301g = BottomDialogType.Type.PERSONAL;
                c2.f13295a = myCompaniesFragment.getString(R.string.are_you_a_director_of_the_company);
                c2.f13297c = myCompaniesFragment.getString(R.string.yes_continue);
                c2.f13298d = Integer.valueOf(R.drawable.button_bg);
                c2.f13299e = myCompaniesFragment.getString(R.string.go_back);
                myCompaniesFragment.w0().c(c2, new C0608g(myCompaniesFragment, 1), new C0608g(myCompaniesFragment, 2));
                break;
            case 1:
                v.w(U4.b.g(this.f8390b), R.id.action_myCompaniesFragment_to_selectCountryFragment);
                break;
            default:
                this.f8390b.w0().dismiss();
                break;
        }
        return p.f3034a;
    }
}
