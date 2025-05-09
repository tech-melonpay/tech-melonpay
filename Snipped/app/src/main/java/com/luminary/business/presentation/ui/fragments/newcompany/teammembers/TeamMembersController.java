package com.luminary.business.presentation.ui.fragments.newcompany.teammembers;

import B7.f;
import C.v;
import O9.p;
import P9.s;
import android.view.View;
import ca.InterfaceC0646l;
import com.airbnb.epoxy.TypedEpoxyController;
import com.luminary.business.presentation.entity.company.TeamMemberUI;
import java.util.List;
import ka.C0969n;
import s6.C1224m;

/* compiled from: TeamMembersController.kt */
/* loaded from: classes2.dex */
public final class TeamMembersController extends TypedEpoxyController<List<? extends TeamMemberUI>> {
    private final InterfaceC0646l<Integer, p> onClick;

    /* JADX WARN: Multi-variable type inference failed */
    public TeamMembersController(InterfaceC0646l<? super Integer, p> interfaceC0646l) {
        this.onClick = interfaceC0646l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$3$lambda$2$lambda$1(TeamMemberUI teamMemberUI, TeamMembersController teamMembersController, View view) {
        TeamMemberUI.MemberUI memberUI;
        Integer num;
        if (!teamMemberUI.f11301f || (memberUI = teamMemberUI.f11300e) == null || (num = memberUI.f11302a) == null) {
            return;
        }
        int intValue = num.intValue();
        InterfaceC0646l<Integer, p> interfaceC0646l = teamMembersController.onClick;
        if (interfaceC0646l != null) {
            interfaceC0646l.invoke(Integer.valueOf(intValue));
        }
    }

    @Override // com.airbnb.epoxy.TypedEpoxyController
    public /* bridge */ /* synthetic */ void buildModels(List<? extends TeamMemberUI> list) {
        buildModels2((List<TeamMemberUI>) list);
    }

    /* renamed from: buildModels, reason: avoid collision after fix types in other method */
    public void buildModels2(List<TeamMemberUI> list) {
        String str;
        if (list != null) {
            for (TeamMemberUI teamMemberUI : list) {
                C1224m c1224m = new C1224m();
                TeamMemberUI.MemberUI memberUI = teamMemberUI.f11300e;
                c1224m.a("company_" + (memberUI != null ? memberUI.f11302a : null));
                TeamMemberUI.MemberUI memberUI2 = teamMemberUI.f11300e;
                String str2 = memberUI2 != null ? memberUI2.f11306e : null;
                c1224m.f((str2 == null || str2.length() == 0) ? v.p(memberUI2 != null ? memberUI2.f11304c : null, " ", memberUI2 != null ? memberUI2.f11305d : null) : String.valueOf(memberUI2 != null ? memberUI2.f11306e : null));
                Float f10 = teamMemberUI.f11298c;
                if (f10 == null || (str = f10.toString()) == null) {
                    str = "";
                }
                if (C0969n.Y(str, ".", false)) {
                    String str3 = (String) s.R(C0969n.r0(str, new String[]{"."}));
                    if ((str3 != null ? str3 : "").length() == 1) {
                        str = str.concat("0");
                    }
                } else {
                    str = str.concat(".00");
                }
                c1224m.h(str + "%");
                c1224m.i();
                c1224m.b();
                boolean z10 = teamMemberUI.f11301f;
                c1224m.c(Boolean.valueOf(z10));
                c1224m.d(Boolean.valueOf(!z10));
                c1224m.e();
                c1224m.g(new f(9, teamMemberUI, this));
                add(c1224m);
            }
        }
    }
}
