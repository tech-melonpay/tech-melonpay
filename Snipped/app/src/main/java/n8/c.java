package n8;

import F8.o;
import O9.p;
import P9.s;
import android.widget.EditText;
import ca.InterfaceC0646l;
import com.luminary.business.presentation.ui.fragments.statements.StatementsDateFragment;
import com.luminary.business.presentation.ui.fragments.statements.StatementsSelectorDialog;
import com.luminary.business.presentation.ui.fragments.statements.domain.StatementsType;
import com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import t6.Z5;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24291a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StatementsDateFragment f24292b;

    public /* synthetic */ c(StatementsDateFragment statementsDateFragment, int i) {
        this.f24291a = i;
        this.f24292b = statementsDateFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        Pair pair;
        int i = 1;
        StatementsDateFragment statementsDateFragment = this.f24292b;
        switch (this.f24291a) {
            case 0:
                statementsDateFragment.N0((String) obj, new C1074a(statementsDateFragment, i));
                return p.f3034a;
            case 1:
                String str = (String) obj;
                statementsDateFragment.u0().f28770p.setText(str);
                statementsDateFragment.f13023t0 = str;
                statementsDateFragment.W0();
                statementsDateFragment.W0();
                return p.f3034a;
            case 2:
                StatementsSelectorDialog.a aVar = (StatementsSelectorDialog.a) obj;
                statementsDateFragment.u0().f28777w.setText(aVar.f13052a);
                W9.a aVar2 = StatementsDateFragment.DateRangeType.f13033e;
                Integer num = aVar.f13059h;
                StatementsDateFragment.DateRangeType dateRangeType = (StatementsDateFragment.DateRangeType) s.M(num != null ? num.intValue() : 0, aVar2);
                if (dateRangeType == null) {
                    dateRangeType = StatementsDateFragment.DateRangeType.f13030b;
                }
                statementsDateFragment.f13025v0 = dateRangeType;
                LocalDate now = LocalDate.now();
                int ordinal = dateRangeType.ordinal();
                if (ordinal == 0) {
                    pair = new Pair(D9.b.w0(D9.b.E0(now.minusDays(29L))), D9.b.u0(D9.b.E0(now)));
                } else if (ordinal != 1) {
                    if (ordinal == 2) {
                        int monthValue = (now.getMonthValue() - 1) / 3;
                        int i9 = monthValue + 1;
                        int i10 = i9 != 1 ? monthValue : 4;
                        int year = now.getYear();
                        if (i9 == 1) {
                            year--;
                        }
                        LocalDate atDay = YearMonth.of(year, ((i10 - 1) * 3) + 1).atDay(1);
                        pair = new Pair(D9.b.w0(D9.b.E0(atDay)), D9.b.u0(D9.b.E0(atDay.plusMonths(2L).with(TemporalAdjusters.lastDayOfMonth()))));
                    } else if (ordinal == 3) {
                        pair = new Pair(null, null);
                    } else {
                        if (ordinal != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        pair = new Pair(D9.b.w0(D9.b.E0(now.withDayOfYear(1))), D9.b.u0(D9.b.E0(now)));
                    }
                } else {
                    LocalDate minusMonths = now.minusMonths(1L);
                    pair = new Pair(D9.b.w0(D9.b.E0(YearMonth.of(minusMonths.getYear(), minusMonths.getMonth()).atDay(1))), D9.b.u0(D9.b.E0(YearMonth.of(minusMonths.getYear(), minusMonths.getMonth()).atEndOfMonth())));
                }
                com.luminary.business.presentation.ui.fragments.statements.c T02 = statementsDateFragment.T0();
                StatementsType statementsType = statementsDateFragment.f13024u0;
                LinkedHashMap linkedHashMap = T02.f13085l1;
                o8.a m2 = T02.m(statementsType);
                Date date = (Date) pair.f23089a;
                m2.f24395b = date;
                Date date2 = (Date) pair.f23090b;
                m2.f24396c = date2;
                m2.f24397d = statementsDateFragment.getString(statementsDateFragment.f13025v0.f13034a);
                p pVar = p.f3034a;
                linkedHashMap.put(statementsType, m2);
                statementsDateFragment.u0().f28771q.setText(D9.b.F0(date, "yyyy-MM-dd"));
                statementsDateFragment.u0().f28775u.setText(D9.b.F0(date2, "yyyy-MM-dd"));
                statementsDateFragment.W0();
                return p.f3034a;
            default:
                StatementsSelectorDialog.a aVar3 = (StatementsSelectorDialog.a) obj;
                Z5 u02 = statementsDateFragment.u0();
                o.b(u02.f28772r);
                o.b(u02.f28769o);
                CustomTextInputLayout customTextInputLayout = u02.f28773s;
                EditText editText = customTextInputLayout.getEditText();
                if (editText != null) {
                    EditText editText2 = customTextInputLayout.getEditText();
                    editText.setText(String.valueOf(editText2 != null ? editText2.getText() : null));
                }
                u02.f28774t.setText("");
                com.luminary.business.presentation.ui.fragments.statements.c T03 = statementsDateFragment.T0();
                StatementsType statementsType2 = statementsDateFragment.f13024u0;
                LinkedHashMap linkedHashMap2 = T03.f13085l1;
                o8.a m9 = T03.m(statementsType2);
                m9.f24398e = aVar3;
                p pVar2 = p.f3034a;
                linkedHashMap2.put(statementsType2, m9);
                statementsDateFragment.U0(aVar3);
                return p.f3034a;
        }
    }
}
