package com.luminary.business.presentation.ui.fragments.statements;

import F8.o;
import android.widget.EditText;
import com.google.android.material.tabs.TabLayout;
import com.luminary.business.presentation.ui.fragments.statements.domain.StatementsType;
import com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout;
import java.util.Date;
import t6.Z5;

/* compiled from: StatementsDateFragment.kt */
/* loaded from: classes2.dex */
public final class a implements TabLayout.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ StatementsDateFragment f13064a;

    public a(StatementsDateFragment statementsDateFragment) {
        this.f13064a = statementsDateFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.material.tabs.TabLayout.c
    public final void a(TabLayout.g gVar) {
        StatementsType statementsType = (StatementsType) StatementsType.f13090f.get(gVar != null ? gVar.f9855d : 0);
        StatementsDateFragment statementsDateFragment = this.f13064a;
        statementsDateFragment.f13024u0 = statementsType;
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
        statementsDateFragment.u0().f28773s.setHint(statementsDateFragment.getString(statementsDateFragment.f13024u0.f13091a));
        o8.a m2 = statementsDateFragment.T0().m(statementsDateFragment.f13024u0);
        statementsDateFragment.u0().f28773s.setHint(statementsDateFragment.getString(statementsDateFragment.f13024u0.f13091a));
        statementsDateFragment.U0(m2.f24398e);
        statementsDateFragment.W0();
        Z5 u03 = statementsDateFragment.u0();
        Date date = m2.f24395b;
        u03.f28771q.setText(date != null ? D9.b.F0(date, "yyyy-MM-dd") : null);
        Z5 u04 = statementsDateFragment.u0();
        Date date2 = m2.f24396c;
        u04.f28775u.setText(date2 != null ? D9.b.F0(date2, "yyyy-MM-dd") : null);
        statementsDateFragment.u0().f28777w.setText(m2.f24397d);
    }
}
