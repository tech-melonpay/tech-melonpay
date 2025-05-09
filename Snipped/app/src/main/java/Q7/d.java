package Q7;

import com.google.android.material.tabs.TabLayout;
import com.luminary.business.presentation.ui.fragments.newcompany.addubo.AddUBOFragment;
import com.luminary.business.presentation.ui.fragments.newcompany.teammembers.TeamMembersFragment;

/* compiled from: AddUBOFragment.kt */
/* loaded from: classes2.dex */
public final class d implements TabLayout.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AddUBOFragment f3201a;

    public d(AddUBOFragment addUBOFragment) {
        this.f3201a = addUBOFragment;
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void a(TabLayout.g gVar) {
        AddUBOFragment addUBOFragment = this.f3201a;
        if (addUBOFragment.f12493r0 == TeamMembersFragment.UBOType.f12694c) {
            if (gVar == null || gVar.f9855d == 0) {
                addUBOFragment.u0().R.setDisplayedChild(0);
                addUBOFragment.f12494t0 = true;
            } else {
                addUBOFragment.u0().R.setDisplayedChild(1);
                addUBOFragment.f12494t0 = false;
            }
            addUBOFragment.s0 = gVar != null ? gVar.f9855d : 0;
            addUBOFragment.V0();
        }
    }
}
