package com.luminary.business.presentation.ui.views.toolbar;

import A8.b;
import A8.c;
import F0.d;
import F0.f;
import F8.o;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapperImpl;
import ca.InterfaceC0635a;
import com.luminary.business.presentation.ui.views.ButtonSmall;
import com.luminary.mobile.R;
import t6.P6;

/* compiled from: CustomToolbarView.kt */
/* loaded from: classes2.dex */
public final class CustomToolbarView extends Toolbar {

    /* renamed from: b0, reason: collision with root package name */
    public static final /* synthetic */ int f13254b0 = 0;
    public State U;
    public ToolbarStatus V;
    public final P6 W;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f13255a0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CustomToolbarView.kt */
    public static final class State {

        /* renamed from: a, reason: collision with root package name */
        public static final State f13256a;

        /* renamed from: b, reason: collision with root package name */
        public static final State f13257b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ State[] f13258c;

        static {
            State state = new State("EXPANDED", 0);
            f13256a = state;
            State state2 = new State("COLLAPSED", 1);
            f13257b = state2;
            f13258c = new State[]{state, state2};
        }

        public State() {
            throw null;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) f13258c.clone();
        }
    }

    public CustomToolbarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.V = ToolbarStatus.gone;
        LayoutInflater from = LayoutInflater.from(getContext());
        int i = P6.f28325C;
        DataBinderMapperImpl dataBinderMapperImpl = d.f1140a;
        P6 p62 = (P6) f.f(from, R.layout.view_toolbar_content, this, true, null);
        this.W = p62;
        p62.f28337w.addTextChangedListener(new c(this, 0));
    }

    public final State getState() {
        return this.U;
    }

    public final void setBackButton(InterfaceC0635a<? extends Object> interfaceC0635a) {
        if (this.V.f13267e) {
            o.c(this.W.f28330p, 500L, new b(interfaceC0635a, 0));
        }
    }

    public final void setBadge(int i) {
        P6 p62 = this.W;
        if (i > 0) {
            p62.f28334t.setVisibility(0);
        } else {
            o.b(p62.f28334t);
        }
    }

    public final void setState(State state) {
        this.U = state;
        P6 p62 = this.W;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) p62.f28337w.getLayoutParams();
        ButtonSmall buttonSmall = p62.f28328n;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) buttonSmall.getLayoutParams();
        ButtonSmall buttonSmall2 = p62.f28329o;
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) buttonSmall2.getLayoutParams();
        ButtonSmall buttonSmall3 = p62.f28331q;
        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) buttonSmall3.getLayoutParams();
        ButtonSmall buttonSmall4 = p62.f28330p;
        ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) buttonSmall4.getLayoutParams();
        State state2 = State.f13257b;
        ConstraintLayout constraintLayout = p62.f28335u;
        if (state == state2) {
            marginLayoutParams2.bottomMargin = (int) D9.b.T(8);
            marginLayoutParams.bottomMargin = (int) D9.b.T(8);
            marginLayoutParams3.bottomMargin = (int) D9.b.T(8);
            marginLayoutParams4.bottomMargin = (int) D9.b.T(8);
            marginLayoutParams5.bottomMargin = (int) D9.b.T(8);
            constraintLayout.setBackgroundColor(o.a(R.color.transparent, this));
        } else {
            marginLayoutParams.bottomMargin = (int) D9.b.T(12);
            marginLayoutParams2.bottomMargin = (int) D9.b.T(12);
            marginLayoutParams3.bottomMargin = (int) D9.b.T(12);
            marginLayoutParams4.bottomMargin = (int) D9.b.T(12);
            marginLayoutParams5.bottomMargin = (int) D9.b.T(12);
            constraintLayout.setBackgroundColor(o.a(R.color.background, this));
        }
        p62.f28337w.setLayoutParams(marginLayoutParams);
        buttonSmall.setLayoutParams(marginLayoutParams2);
        buttonSmall2.setLayoutParams(marginLayoutParams3);
        buttonSmall3.setLayoutParams(marginLayoutParams4);
        buttonSmall4.setLayoutParams(marginLayoutParams5);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0307  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setStatus(com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus r21) {
        /*
            Method dump skipped, instructions count: 934
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.luminary.business.presentation.ui.views.toolbar.CustomToolbarView.setStatus(com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus):void");
    }

    public final void w() {
        P6 p62 = this.W;
        if (p62.f28337w.getVisibility() == 0) {
            this.f13255a0 = false;
            A8.d dVar = this.V.f13273l;
            if (dVar != null) {
                dVar.b();
            }
            if (p62.f28337w.getText().toString().length() > 0) {
                p62.f28337w.setText(getContext().getString(R.string.empty));
            }
            o.b(p62.f28337w);
            o.b(p62.f28332r);
        }
    }
}
