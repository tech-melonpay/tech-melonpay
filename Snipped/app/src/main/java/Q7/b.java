package Q7;

import C.v;
import D8.a;
import F8.e;
import F8.o;
import O9.p;
import P9.m;
import P9.s;
import android.os.Build;
import android.text.Editable;
import androidx.camera.core.n;
import androidx.navigation.NavController;
import ca.InterfaceC0635a;
import com.luminary.business.domain.entity.company.CorporateDetailsDomain;
import com.luminary.business.presentation.entity.company.TeamMemberUI;
import com.luminary.business.presentation.entity.company.UploadFileUI;
import com.luminary.business.presentation.ui.fragments.newcompany.addubo.AddUBOFragment;
import com.luminary.business.presentation.ui.fragments.newcompany.teammembers.TeamMembersFragment;
import com.luminary.business.presentation.ui.views.dialogs.SelectorDialog;
import com.luminary.business.presentation.utils.bottomDialog.BottomDialogType;
import com.luminary.business.presentation.utils.filepiker.FilePickerContractor;
import com.luminary.mobile.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import ka.C0967l;
import ka.C0969n;
import kotlin.Pair;
import kotlin.jvm.internal.f;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements InterfaceC0635a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3197a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AddUBOFragment f3198b;

    public /* synthetic */ b(AddUBOFragment addUBOFragment, int i) {
        this.f3197a = i;
        this.f3198b = addUBOFragment;
    }

    @Override // ca.InterfaceC0635a
    public final Object invoke() {
        AddUBOFragment addUBOFragment;
        TeamMemberUI teamMemberUI;
        TeamMemberUI.MemberUI memberUI;
        String a10;
        switch (this.f3197a) {
            case 0:
                AddUBOFragment addUBOFragment2 = this.f3198b;
                SelectorDialog selectorDialog = new SelectorDialog(addUBOFragment2.requireContext());
                selectorDialog.f13207w = new c(addUBOFragment2, 0);
                List r02 = C0969n.r0(C0967l.X(String.valueOf(addUBOFragment2.u0().f27968C.getText()), " ", "", false), new String[]{","});
                ArrayList arrayList = new ArrayList();
                for (Object obj : r02) {
                    if (true ^ f.b((String) obj, "")) {
                        arrayList.add(obj);
                    }
                }
                selectorDialog.f13204t = new ArrayList(arrayList);
                selectorDialog.show();
                selectorDialog.l();
                selectorDialog.m(m.q("Director", "Shareholder", "Other"), true);
                selectorDialog.n(addUBOFragment2.getString(R.string.positions));
                break;
            case 1:
                NavController g10 = U4.b.g(this.f3198b);
                g10.i(R.id.action_addUBOFragment_to_countrySelectFragment, v.h(g10, "isCountryCode", false, "fieldName", "COUNTRY_RESIDENCE"));
                break;
            case 2:
                NavController g11 = U4.b.g(this.f3198b);
                g11.i(R.id.action_addUBOFragment_to_countrySelectFragment, v.h(g11, "isCountryCode", false, "fieldName", "COUNTRY_CITIZENSHIP"));
                break;
            case 3:
                AddUBOFragment addUBOFragment3 = this.f3198b;
                TeamMembersFragment.UBOType uBOType = addUBOFragment3.f12493r0;
                TeamMembersFragment.UBOType uBOType2 = TeamMembersFragment.UBOType.f12694c;
                if (uBOType != uBOType2 || addUBOFragment3.f12494t0) {
                    Editable text = addUBOFragment3.u0().f27975J.getText();
                    if (text == null || text.length() == 0) {
                        break;
                    }
                } else {
                    Editable text2 = addUBOFragment3.u0().f27974I.getText();
                    if (text2 == null || text2.length() == 0) {
                        break;
                    }
                }
                float parseFloat = Float.parseFloat(D9.b.r0(String.valueOf(((addUBOFragment3.f12493r0 != uBOType2 || addUBOFragment3.f12494t0) ? addUBOFragment3.u0().f27975J : addUBOFragment3.u0().f27974I).getText())));
                float f10 = addUBOFragment3.f12492q0;
                if (parseFloat > f10) {
                    float f11 = 100 - f10;
                    String str = " " + f11;
                    List r03 = C0969n.r0(String.valueOf(f11), new String[]{"."});
                    if (r03.size() < 2) {
                        a10 = ".00%";
                    } else {
                        str = androidx.camera.core.impl.utils.a.j(s.J(r03), " ");
                        a10 = ((String) r03.get(1)).length() < 2 ? "." + r03.get(1) + "0%" : n.a(".", ((String) r03.get(1)).substring(0, 2), "%");
                    }
                    String n10 = v.n(str, a10);
                    BottomDialogType.a aVar = BottomDialogType.f13289k;
                    addUBOFragment3.requireContext();
                    aVar.getClass();
                    BottomDialogType b9 = BottomDialogType.a.b();
                    b9.f13295a = v.n(addUBOFragment3.getString(R.string.total_shares_amount_cannot_exceed_100_it_is_currently), n10);
                    b9.f13297c = addUBOFragment3.getString(R.string.back);
                    a.C0010a.a(addUBOFragment3.w0(), b9, null, 6);
                    break;
                } else {
                    com.luminary.business.presentation.ui.fragments.newcompany.addubo.a aVar2 = addUBOFragment3.f12490o0;
                    Integer num = (aVar2 == null || (teamMemberUI = aVar2.f12519d) == null || (memberUI = teamMemberUI.f11300e) == null) ? null : memberUI.f11302a;
                    if (aVar2 != null && aVar2.f12516a != null) {
                        if (addUBOFragment3.f12494t0) {
                            UploadFileUI uploadFileUI = addUBOFragment3.f12482A0;
                            if (uploadFileUI != null) {
                                uploadFileUI.f11316b = String.valueOf(addUBOFragment3.u0().f27994y.getText());
                            }
                            Pair pair = new Pair("EMAIL", String.valueOf(addUBOFragment3.u0().f27992w.getText()));
                            Pair pair2 = new Pair("FIRST_NAME", String.valueOf(addUBOFragment3.u0().f27994y.getText()));
                            Pair pair3 = new Pair("LAST_NAME", String.valueOf(addUBOFragment3.u0().f27966A.getText()));
                            List<String> list = addUBOFragment3.f12491p0;
                            ArrayList arrayList2 = new ArrayList(P9.n.u(list, 10));
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(((String) it.next()).toLowerCase(Locale.ROOT));
                            }
                            Pair pair4 = new Pair("POSITIONS", arrayList2);
                            Pair pair5 = new Pair("SHARED", String.valueOf(parseFloat));
                            Pair pair6 = new Pair("MEMBER", num != null ? num.toString() : null);
                            Pair pair7 = new Pair("COUNTRY_CITIZENSHIP", addUBOFragment3.f12499y0);
                            Pair pair8 = new Pair("COMPANY_NAME", "");
                            Pair pair9 = new Pair("COUNTRY_RESIDENCE", addUBOFragment3.f12497w0);
                            Pair pair10 = new Pair("IS_PEP", addUBOFragment3.u0().f27970E.isChecked() ? Boolean.TRUE : addUBOFragment3.u0().f27969D.isChecked() ? Boolean.FALSE : null);
                            if (addUBOFragment3.u0().f27972G.isChecked()) {
                                r5 = Boolean.TRUE;
                            } else if (addUBOFragment3.u0().f27971F.isChecked()) {
                                r5 = Boolean.FALSE;
                            }
                            Pair pair11 = new Pair("IS_US", r5);
                            CorporateDetailsDomain.SourceofWealth.a aVar3 = CorporateDetailsDomain.SourceofWealth.f10845b;
                            String valueOf = String.valueOf(addUBOFragment3.u0().f27976K.getText());
                            aVar3.getClass();
                            addUBOFragment3.getParentFragmentManager().f0("AddUBO", t0.c.b(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, new Pair("SOURCE_OF_WEALTH", String.valueOf(CorporateDetailsDomain.SourceofWealth.a.a(valueOf))), new Pair("LINK", String.valueOf(addUBOFragment3.u0().f27967B.getText())), new Pair("CURRICULUM_VITAE", addUBOFragment3.f12482A0)));
                            addUBOFragment = addUBOFragment3;
                        } else {
                            addUBOFragment = addUBOFragment3;
                            addUBOFragment.getParentFragmentManager().f0("AddUBO", t0.c.b(new Pair("EMAIL", String.valueOf(addUBOFragment3.u0().f27990u.getText())), new Pair("COMPANY_NAME", String.valueOf(addUBOFragment3.u0().f27985p.getText())), new Pair("COMPANY_NUMBER", String.valueOf(addUBOFragment3.u0().f27973H.getText())), new Pair("COUNTRY_OPERATION", addUBOFragment.f12495u0), new Pair("SHARED", String.valueOf(parseFloat)), new Pair("MEMBER", num != null ? num.toString() : null)));
                        }
                        addUBOFragment.requireActivity().onBackPressed();
                    }
                    break;
                }
                break;
            case 4:
                this.f3198b.f12483B0.a(FilePickerContractor.FileTypeEnum.PDF);
                break;
            case 5:
                this.f3198b.f12483B0.a(FilePickerContractor.FileTypeEnum.Image);
                break;
            case 6:
                int i = Build.VERSION.SDK_INT;
                AddUBOFragment addUBOFragment4 = this.f3198b;
                if (i < 29) {
                    addUBOFragment4.f12485D0.a("android.permission.WRITE_EXTERNAL_STORAGE");
                } else {
                    addUBOFragment4.f12486E0.a("android.permission.CAMERA");
                }
                break;
            case 7:
                this.f3198b.u0().f27983n.callOnClick();
                break;
            case 8:
                AddUBOFragment addUBOFragment5 = this.f3198b;
                addUBOFragment5.getClass();
                e.a(addUBOFragment5, null, new b(addUBOFragment5, 4), new b(addUBOFragment5, 5), new b(addUBOFragment5, 6));
                break;
            case 9:
                AddUBOFragment addUBOFragment6 = this.f3198b;
                addUBOFragment6.f12482A0 = null;
                addUBOFragment6.u0().f27982Q.setText("");
                o.b(addUBOFragment6.u0().f27980O);
                addUBOFragment6.u0().f27981P.setVisibility(0);
                break;
            case 10:
                AddUBOFragment addUBOFragment7 = this.f3198b;
                SelectorDialog selectorDialog2 = new SelectorDialog(addUBOFragment7.requireContext());
                selectorDialog2.f13206v = new c(addUBOFragment7, 1);
                selectorDialog2.show();
                CorporateDetailsDomain.SourceofWealth[] values = CorporateDetailsDomain.SourceofWealth.values();
                ArrayList arrayList3 = new ArrayList(values.length);
                for (CorporateDetailsDomain.SourceofWealth sourceofWealth : values) {
                    arrayList3.add(sourceofWealth.f10853a);
                }
                selectorDialog2.m(arrayList3, false);
                selectorDialog2.l();
                selectorDialog2.n(addUBOFragment7.getString(R.string.source_of_wealth));
                break;
            default:
                NavController g12 = U4.b.g(this.f3198b);
                g12.i(R.id.action_addUBOFragment_to_countrySelectFragment, v.h(g12, "isCountryCode", false, "fieldName", "COUNTRY_OPERATION"));
                break;
        }
        return p.f3034a;
    }
}
