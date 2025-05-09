package n8;

import D8.a;
import O9.p;
import P9.AbstractC0500b;
import P9.m;
import P9.n;
import P9.s;
import ca.InterfaceC0635a;
import com.luminary.business.presentation.ui.fragments.statements.StatementsDateFragment;
import com.luminary.business.presentation.ui.fragments.statements.StatementsSelectorDialog;
import com.luminary.business.presentation.utils.bottomDialog.BottomDialogType;
import com.luminary.mobile.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Triple;

/* compiled from: R8$$SyntheticClass */
/* renamed from: n8.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1074a implements InterfaceC0635a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24285a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StatementsDateFragment f24286b;

    public /* synthetic */ C1074a(StatementsDateFragment statementsDateFragment, int i) {
        this.f24285a = i;
        this.f24286b = statementsDateFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ca.InterfaceC0635a
    public final Object invoke() {
        Triple triple;
        final String num;
        final String num2;
        final String num3;
        final String num4;
        switch (this.f24285a) {
            case 0:
                this.f24286b.V0(true);
                return p.f3034a;
            case 1:
                BottomDialogType.a aVar = BottomDialogType.f13289k;
                StatementsDateFragment statementsDateFragment = this.f24286b;
                statementsDateFragment.requireContext();
                aVar.getClass();
                BottomDialogType b9 = BottomDialogType.a.b();
                b9.f13295a = statementsDateFragment.getString(R.string.could_not_generate_statement);
                a.C0010a.a(statementsDateFragment.w0(), b9, null, 6);
                return p.f3034a;
            case 2:
                this.f24286b.V0(false);
                return p.f3034a;
            case 3:
                StatementsDateFragment statementsDateFragment2 = this.f24286b;
                int ordinal = statementsDateFragment2.f13024u0.ordinal();
                if (ordinal == 0) {
                    triple = new Triple(StatementsSelectorDialog.DialogType.f13044b, s.U(statementsDateFragment2.T0().f13077d1, statementsDateFragment2.T0().f13080g1), Integer.valueOf(R.string.account));
                } else if (ordinal == 1) {
                    triple = new Triple(StatementsSelectorDialog.DialogType.f13048f, statementsDateFragment2.T0().f13081h1, Integer.valueOf(R.string.card_vault));
                } else {
                    if (ordinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    triple = new Triple(StatementsSelectorDialog.DialogType.f13049g, statementsDateFragment2.T0().f13084k1, Integer.valueOf(R.string.card));
                }
                StatementsSelectorDialog.DialogType dialogType = (StatementsSelectorDialog.DialogType) triple.f23099a;
                List list = (List) triple.f23100b;
                int intValue = ((Number) triple.f23101c).intValue();
                StatementsSelectorDialog statementsSelectorDialog = new StatementsSelectorDialog(statementsDateFragment2.requireContext(), dialogType);
                if (true ^ list.isEmpty()) {
                    statementsSelectorDialog.show();
                    StatementsSelectorDialog.l(statementsSelectorDialog, list);
                    statementsSelectorDialog.m(statementsDateFragment2.getString(intValue));
                }
                statementsSelectorDialog.f13042w = new c(statementsDateFragment2, 3);
                return p.f3034a;
            case 4:
                StatementsDateFragment statementsDateFragment3 = this.f24286b;
                statementsDateFragment3.getClass();
                StatementsSelectorDialog statementsSelectorDialog2 = new StatementsSelectorDialog(statementsDateFragment3.requireContext(), null);
                statementsSelectorDialog2.f13042w = new c(statementsDateFragment3, 2);
                statementsSelectorDialog2.show();
                List list2 = StatementsDateFragment.DateRangeType.f13033e;
                ArrayList arrayList = new ArrayList(n.u(list2, 10));
                Iterator it = ((AbstractC0500b) list2).iterator();
                while (it.hasNext()) {
                    StatementsDateFragment.DateRangeType dateRangeType = (StatementsDateFragment.DateRangeType) it.next();
                    arrayList.add(new StatementsSelectorDialog.a(statementsDateFragment3.getString(dateRangeType.f13034a), "", "", null, null, null, null, Integer.valueOf(dateRangeType.ordinal()), false, 376));
                }
                StatementsSelectorDialog.l(statementsSelectorDialog2, arrayList);
                statementsSelectorDialog2.m(statementsDateFragment3.getString(R.string.dynamic_date));
                return p.f3034a;
            case 5:
                StatementsDateFragment statementsDateFragment4 = this.f24286b;
                StatementsSelectorDialog statementsSelectorDialog3 = new StatementsSelectorDialog(statementsDateFragment4.requireContext(), StatementsSelectorDialog.DialogType.f13043a);
                statementsSelectorDialog3.f13040u = new c(statementsDateFragment4, 1);
                statementsSelectorDialog3.show();
                StatementsSelectorDialog.l(statementsSelectorDialog3, m.q(new StatementsSelectorDialog.a("PDF", "", "", null, null, null, null, null, false, 504), new StatementsSelectorDialog.a("CSV", "", "", null, null, null, null, null, false, 504)));
                statementsSelectorDialog3.m(statementsDateFragment4.getString(R.string.file_format));
                return p.f3034a;
            default:
                StatementsDateFragment statementsDateFragment5 = this.f24286b;
                String lowerCase = kotlin.jvm.internal.f.b(statementsDateFragment5.f13023t0, "PDF") ? "PDF".toLowerCase(Locale.ROOT) : "CSV".toLowerCase(Locale.ROOT);
                File file = new File(statementsDateFragment5.requireContext().getFilesDir().getAbsolutePath(), "Statements");
                if (!file.exists()) {
                    file.mkdirs();
                }
                o8.a m2 = statementsDateFragment5.T0().m(statementsDateFragment5.f13024u0);
                Date date = m2.f24395b;
                String F02 = date != null ? D9.b.F0(date, "yyyy-MM-dd") : null;
                Date date2 = m2.f24396c;
                String F03 = date2 != null ? D9.b.F0(date2, "yyyy-MM-dd") : null;
                int ordinal2 = statementsDateFragment5.f13024u0.ordinal();
                if (ordinal2 == 0) {
                    Integer num5 = statementsDateFragment5.f13020p0;
                    if (num5 != null && (num2 = num5.toString()) != null) {
                        final com.luminary.business.presentation.ui.fragments.statements.c T02 = statementsDateFragment5.T0();
                        file.getAbsolutePath();
                        T02.getClass();
                        final int i = 1;
                        final String str = lowerCase;
                        final String str2 = F02;
                        final String str3 = F03;
                        InterfaceC0635a<p> interfaceC0635a = new InterfaceC0635a() { // from class: n8.g
                            @Override // ca.InterfaceC0635a
                            public final Object invoke() {
                                Integer num6;
                                Integer num7;
                                Integer num8;
                                Integer num9;
                                switch (i) {
                                    case 0:
                                        com.luminary.business.presentation.ui.fragments.statements.c cVar = T02;
                                        u5.d u6 = cVar.f13069V0.u();
                                        if (u6 != null && (num6 = u6.f30237a) != null) {
                                            int intValue2 = num6.intValue();
                                            cVar.l();
                                            String str4 = str;
                                            String n10 = com.luminary.business.presentation.ui.fragments.statements.c.n(str4);
                                            cVar.f13074a1.a(new i(cVar, 12), new F5.a(String.valueOf(intValue2), num2, str2, str3, n10, str4, TimeZone.getDefault().getID()));
                                        }
                                        break;
                                    case 1:
                                        com.luminary.business.presentation.ui.fragments.statements.c cVar2 = T02;
                                        u5.d u10 = cVar2.f13069V0.u();
                                        if (u10 != null && (num7 = u10.f30237a) != null) {
                                            int intValue3 = num7.intValue();
                                            cVar2.l();
                                            String str5 = str;
                                            String n11 = com.luminary.business.presentation.ui.fragments.statements.c.n(str5);
                                            cVar2.f13068U0.a(new i(cVar2, 10), new F5.a(String.valueOf(intValue3), num2, str2, str3, n11, str5, TimeZone.getDefault().getID()));
                                        }
                                        break;
                                    case 2:
                                        com.luminary.business.presentation.ui.fragments.statements.c cVar3 = T02;
                                        u5.d u11 = cVar3.f13069V0.u();
                                        if (u11 != null && (num8 = u11.f30237a) != null) {
                                            int intValue4 = num8.intValue();
                                            cVar3.l();
                                            String str6 = str;
                                            String n12 = com.luminary.business.presentation.ui.fragments.statements.c.n(str6);
                                            cVar3.f13075b1.a(new i(cVar3, 11), new F5.a(String.valueOf(intValue4), num2, str2, str3, n12, str6, TimeZone.getDefault().getID()));
                                        }
                                        break;
                                    default:
                                        com.luminary.business.presentation.ui.fragments.statements.c cVar4 = T02;
                                        u5.d u12 = cVar4.f13069V0.u();
                                        if (u12 != null && (num9 = u12.f30237a) != null) {
                                            int intValue5 = num9.intValue();
                                            cVar4.l();
                                            String str7 = str;
                                            String n13 = com.luminary.business.presentation.ui.fragments.statements.c.n(str7);
                                            cVar4.f13071X0.a(new i(cVar4, 9), new F5.a(String.valueOf(intValue5), num2, str2, str3, n13, str7, TimeZone.getDefault().getID()));
                                        }
                                        break;
                                }
                                return p.f3034a;
                            }
                        };
                        T02.f419K0 = interfaceC0635a;
                        interfaceC0635a.invoke();
                    }
                    Integer num6 = statementsDateFragment5.f13021q0;
                    if (num6 != null && (num = num6.toString()) != null) {
                        final com.luminary.business.presentation.ui.fragments.statements.c T03 = statementsDateFragment5.T0();
                        file.getAbsolutePath();
                        T03.getClass();
                        final int i9 = 3;
                        final String str4 = lowerCase;
                        final String str5 = F02;
                        final String str6 = F03;
                        InterfaceC0635a<p> interfaceC0635a2 = new InterfaceC0635a() { // from class: n8.g
                            @Override // ca.InterfaceC0635a
                            public final Object invoke() {
                                Integer num62;
                                Integer num7;
                                Integer num8;
                                Integer num9;
                                switch (i9) {
                                    case 0:
                                        com.luminary.business.presentation.ui.fragments.statements.c cVar = T03;
                                        u5.d u6 = cVar.f13069V0.u();
                                        if (u6 != null && (num62 = u6.f30237a) != null) {
                                            int intValue2 = num62.intValue();
                                            cVar.l();
                                            String str42 = str4;
                                            String n10 = com.luminary.business.presentation.ui.fragments.statements.c.n(str42);
                                            cVar.f13074a1.a(new i(cVar, 12), new F5.a(String.valueOf(intValue2), num, str5, str6, n10, str42, TimeZone.getDefault().getID()));
                                        }
                                        break;
                                    case 1:
                                        com.luminary.business.presentation.ui.fragments.statements.c cVar2 = T03;
                                        u5.d u10 = cVar2.f13069V0.u();
                                        if (u10 != null && (num7 = u10.f30237a) != null) {
                                            int intValue3 = num7.intValue();
                                            cVar2.l();
                                            String str52 = str4;
                                            String n11 = com.luminary.business.presentation.ui.fragments.statements.c.n(str52);
                                            cVar2.f13068U0.a(new i(cVar2, 10), new F5.a(String.valueOf(intValue3), num, str5, str6, n11, str52, TimeZone.getDefault().getID()));
                                        }
                                        break;
                                    case 2:
                                        com.luminary.business.presentation.ui.fragments.statements.c cVar3 = T03;
                                        u5.d u11 = cVar3.f13069V0.u();
                                        if (u11 != null && (num8 = u11.f30237a) != null) {
                                            int intValue4 = num8.intValue();
                                            cVar3.l();
                                            String str62 = str4;
                                            String n12 = com.luminary.business.presentation.ui.fragments.statements.c.n(str62);
                                            cVar3.f13075b1.a(new i(cVar3, 11), new F5.a(String.valueOf(intValue4), num, str5, str6, n12, str62, TimeZone.getDefault().getID()));
                                        }
                                        break;
                                    default:
                                        com.luminary.business.presentation.ui.fragments.statements.c cVar4 = T03;
                                        u5.d u12 = cVar4.f13069V0.u();
                                        if (u12 != null && (num9 = u12.f30237a) != null) {
                                            int intValue5 = num9.intValue();
                                            cVar4.l();
                                            String str7 = str4;
                                            String n13 = com.luminary.business.presentation.ui.fragments.statements.c.n(str7);
                                            cVar4.f13071X0.a(new i(cVar4, 9), new F5.a(String.valueOf(intValue5), num, str5, str6, n13, str7, TimeZone.getDefault().getID()));
                                        }
                                        break;
                                }
                                return p.f3034a;
                            }
                        };
                        T03.f421M0 = interfaceC0635a2;
                        interfaceC0635a2.invoke();
                    }
                } else if (ordinal2 == 1) {
                    Integer num7 = statementsDateFragment5.f13022r0;
                    if (num7 != null && (num3 = num7.toString()) != null) {
                        final com.luminary.business.presentation.ui.fragments.statements.c T04 = statementsDateFragment5.T0();
                        file.getAbsolutePath();
                        T04.getClass();
                        final int i10 = 2;
                        final String str7 = lowerCase;
                        final String str8 = F02;
                        final String str9 = F03;
                        InterfaceC0635a<p> interfaceC0635a3 = new InterfaceC0635a() { // from class: n8.g
                            @Override // ca.InterfaceC0635a
                            public final Object invoke() {
                                Integer num62;
                                Integer num72;
                                Integer num8;
                                Integer num9;
                                switch (i10) {
                                    case 0:
                                        com.luminary.business.presentation.ui.fragments.statements.c cVar = T04;
                                        u5.d u6 = cVar.f13069V0.u();
                                        if (u6 != null && (num62 = u6.f30237a) != null) {
                                            int intValue2 = num62.intValue();
                                            cVar.l();
                                            String str42 = str7;
                                            String n10 = com.luminary.business.presentation.ui.fragments.statements.c.n(str42);
                                            cVar.f13074a1.a(new i(cVar, 12), new F5.a(String.valueOf(intValue2), num3, str8, str9, n10, str42, TimeZone.getDefault().getID()));
                                        }
                                        break;
                                    case 1:
                                        com.luminary.business.presentation.ui.fragments.statements.c cVar2 = T04;
                                        u5.d u10 = cVar2.f13069V0.u();
                                        if (u10 != null && (num72 = u10.f30237a) != null) {
                                            int intValue3 = num72.intValue();
                                            cVar2.l();
                                            String str52 = str7;
                                            String n11 = com.luminary.business.presentation.ui.fragments.statements.c.n(str52);
                                            cVar2.f13068U0.a(new i(cVar2, 10), new F5.a(String.valueOf(intValue3), num3, str8, str9, n11, str52, TimeZone.getDefault().getID()));
                                        }
                                        break;
                                    case 2:
                                        com.luminary.business.presentation.ui.fragments.statements.c cVar3 = T04;
                                        u5.d u11 = cVar3.f13069V0.u();
                                        if (u11 != null && (num8 = u11.f30237a) != null) {
                                            int intValue4 = num8.intValue();
                                            cVar3.l();
                                            String str62 = str7;
                                            String n12 = com.luminary.business.presentation.ui.fragments.statements.c.n(str62);
                                            cVar3.f13075b1.a(new i(cVar3, 11), new F5.a(String.valueOf(intValue4), num3, str8, str9, n12, str62, TimeZone.getDefault().getID()));
                                        }
                                        break;
                                    default:
                                        com.luminary.business.presentation.ui.fragments.statements.c cVar4 = T04;
                                        u5.d u12 = cVar4.f13069V0.u();
                                        if (u12 != null && (num9 = u12.f30237a) != null) {
                                            int intValue5 = num9.intValue();
                                            cVar4.l();
                                            String str72 = str7;
                                            String n13 = com.luminary.business.presentation.ui.fragments.statements.c.n(str72);
                                            cVar4.f13071X0.a(new i(cVar4, 9), new F5.a(String.valueOf(intValue5), num3, str8, str9, n13, str72, TimeZone.getDefault().getID()));
                                        }
                                        break;
                                }
                                return p.f3034a;
                            }
                        };
                        T04.f424Q0 = interfaceC0635a3;
                        interfaceC0635a3.invoke();
                    }
                } else {
                    if (ordinal2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Integer num8 = statementsDateFragment5.s0;
                    if (num8 != null && (num4 = num8.toString()) != null) {
                        final com.luminary.business.presentation.ui.fragments.statements.c T05 = statementsDateFragment5.T0();
                        file.getAbsolutePath();
                        T05.getClass();
                        final int i11 = 0;
                        final String str10 = lowerCase;
                        final String str11 = F02;
                        final String str12 = F03;
                        InterfaceC0635a<p> interfaceC0635a4 = new InterfaceC0635a() { // from class: n8.g
                            @Override // ca.InterfaceC0635a
                            public final Object invoke() {
                                Integer num62;
                                Integer num72;
                                Integer num82;
                                Integer num9;
                                switch (i11) {
                                    case 0:
                                        com.luminary.business.presentation.ui.fragments.statements.c cVar = T05;
                                        u5.d u6 = cVar.f13069V0.u();
                                        if (u6 != null && (num62 = u6.f30237a) != null) {
                                            int intValue2 = num62.intValue();
                                            cVar.l();
                                            String str42 = str10;
                                            String n10 = com.luminary.business.presentation.ui.fragments.statements.c.n(str42);
                                            cVar.f13074a1.a(new i(cVar, 12), new F5.a(String.valueOf(intValue2), num4, str11, str12, n10, str42, TimeZone.getDefault().getID()));
                                        }
                                        break;
                                    case 1:
                                        com.luminary.business.presentation.ui.fragments.statements.c cVar2 = T05;
                                        u5.d u10 = cVar2.f13069V0.u();
                                        if (u10 != null && (num72 = u10.f30237a) != null) {
                                            int intValue3 = num72.intValue();
                                            cVar2.l();
                                            String str52 = str10;
                                            String n11 = com.luminary.business.presentation.ui.fragments.statements.c.n(str52);
                                            cVar2.f13068U0.a(new i(cVar2, 10), new F5.a(String.valueOf(intValue3), num4, str11, str12, n11, str52, TimeZone.getDefault().getID()));
                                        }
                                        break;
                                    case 2:
                                        com.luminary.business.presentation.ui.fragments.statements.c cVar3 = T05;
                                        u5.d u11 = cVar3.f13069V0.u();
                                        if (u11 != null && (num82 = u11.f30237a) != null) {
                                            int intValue4 = num82.intValue();
                                            cVar3.l();
                                            String str62 = str10;
                                            String n12 = com.luminary.business.presentation.ui.fragments.statements.c.n(str62);
                                            cVar3.f13075b1.a(new i(cVar3, 11), new F5.a(String.valueOf(intValue4), num4, str11, str12, n12, str62, TimeZone.getDefault().getID()));
                                        }
                                        break;
                                    default:
                                        com.luminary.business.presentation.ui.fragments.statements.c cVar4 = T05;
                                        u5.d u12 = cVar4.f13069V0.u();
                                        if (u12 != null && (num9 = u12.f30237a) != null) {
                                            int intValue5 = num9.intValue();
                                            cVar4.l();
                                            String str72 = str10;
                                            String n13 = com.luminary.business.presentation.ui.fragments.statements.c.n(str72);
                                            cVar4.f13071X0.a(new i(cVar4, 9), new F5.a(String.valueOf(intValue5), num4, str11, str12, n13, str72, TimeZone.getDefault().getID()));
                                        }
                                        break;
                                }
                                return p.f3034a;
                            }
                        };
                        T05.f423P0 = interfaceC0635a4;
                        interfaceC0635a4.invoke();
                    }
                }
                return p.f3034a;
        }
    }
}
