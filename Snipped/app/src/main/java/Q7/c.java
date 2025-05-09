package Q7;

import O9.p;
import P9.n;
import P9.s;
import ca.InterfaceC0646l;
import com.luminary.business.presentation.ui.fragments.newcompany.NewCompanyViewModel;
import com.luminary.business.presentation.ui.fragments.newcompany.addubo.AddUBOFragment;
import com.luminary.business.presentation.ui.fragments.newcompany.teammembers.TeamMembersFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import t6.I2;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3199a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AddUBOFragment f3200b;

    public /* synthetic */ c(AddUBOFragment addUBOFragment, int i) {
        this.f3199a = i;
        this.f3200b = addUBOFragment;
    }

    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        switch (this.f3199a) {
            case 0:
                AddUBOFragment addUBOFragment = this.f3200b;
                List list = (List) obj;
                addUBOFragment.u0().f27968C.setText(s.P(list, ", ", null, null, null, 62));
                ArrayList arrayList = new ArrayList(n.u(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((String) it.next()).toLowerCase(Locale.ROOT));
                }
                addUBOFragment.f12491p0 = arrayList;
                addUBOFragment.V0();
                break;
            case 1:
                AddUBOFragment addUBOFragment2 = this.f3200b;
                addUBOFragment2.u0().f27976K.setText((String) obj);
                addUBOFragment2.u0().f27976K.setSelection(0);
                addUBOFragment2.V0();
                break;
            default:
                AddUBOFragment addUBOFragment3 = this.f3200b;
                I2 u02 = addUBOFragment3.u0();
                NewCompanyViewModel T02 = addUBOFragment3.T0();
                String str = addUBOFragment3.f12499y0;
                if (str == null) {
                    str = "";
                }
                u02.f27986q.setText(T02.i0(str));
                I2 u03 = addUBOFragment3.u0();
                NewCompanyViewModel T03 = addUBOFragment3.T0();
                String str2 = addUBOFragment3.f12497w0;
                if (str2 == null) {
                    str2 = "";
                }
                u03.f27988s.setText(T03.i0(str2));
                if (addUBOFragment3.f12493r0 == TeamMembersFragment.UBOType.f12694c && !addUBOFragment3.f12494t0) {
                    I2 u04 = addUBOFragment3.u0();
                    NewCompanyViewModel T04 = addUBOFragment3.T0();
                    String str3 = addUBOFragment3.f12495u0;
                    u04.f27987r.setText(T04.i0(str3 != null ? str3 : ""));
                }
                break;
        }
        return p.f3034a;
    }
}
