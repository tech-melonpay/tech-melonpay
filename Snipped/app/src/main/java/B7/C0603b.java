package b7;

import C.v;
import O9.p;
import ca.InterfaceC0635a;
import com.luminary.business.presentation.ui.fragments.company.list.CompaniesListFragment;
import com.luminary.business.presentation.utils.bottomDialog.BottomDialogType;
import com.luminary.mobile.R;

/* compiled from: R8$$SyntheticClass */
/* renamed from: b7.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0603b implements InterfaceC0635a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8368a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CompaniesListFragment f8369b;

    public /* synthetic */ C0603b(CompaniesListFragment companiesListFragment, int i) {
        this.f8368a = i;
        this.f8369b = companiesListFragment;
    }

    @Override // ca.InterfaceC0635a
    public final Object invoke() {
        switch (this.f8368a) {
            case 0:
                v.w(U4.b.g(this.f8369b), R.id.action_companiesListFragment_to_selectCountryFragment);
                break;
            case 1:
                this.f8369b.w0().dismiss();
                break;
            case 2:
                this.f8369b.requireActivity().onBackPressed();
                break;
            default:
                CompaniesListFragment companiesListFragment = this.f8369b;
                companiesListFragment.getClass();
                BottomDialogType.f13289k.getClass();
                BottomDialogType c2 = BottomDialogType.a.c();
                c2.f13301g = BottomDialogType.Type.PERSONAL;
                c2.f13295a = companiesListFragment.getString(R.string.are_you_a_director_of_the_company);
                c2.f13297c = companiesListFragment.getString(R.string.yes_continue);
                c2.f13298d = Integer.valueOf(R.drawable.button_bg);
                c2.f13299e = companiesListFragment.getString(R.string.go_back);
                companiesListFragment.w0().c(c2, new C0603b(companiesListFragment, 0), new C0603b(companiesListFragment, 1));
                break;
        }
        return p.f3034a;
    }
}
