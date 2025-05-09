package com.luminary.business.presentation.ui.fragments.newcard.cardtype;

import A7.c;
import B2.d;
import F8.o;
import O9.p;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.B;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ca.InterfaceC0646l;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.newcard.cardtype.a;
import com.luminary.business.presentation.ui.views.CyclicCarousel;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.mobile.R;
import java.util.Collections;
import s6.C1221j;
import t6.G5;

/* compiled from: SelectCardTypeFragment.kt */
/* loaded from: classes2.dex */
public final class SelectCardTypeFragment extends BaseFragment<G5> {

    /* renamed from: n0, reason: collision with root package name */
    public final int f12398n0 = R.layout.fragment_select_card_type;

    /* renamed from: o0, reason: collision with root package name */
    public int f12399o0 = -1;

    /* renamed from: p0, reason: collision with root package name */
    public int f12400p0;

    /* renamed from: q0, reason: collision with root package name */
    public com.luminary.business.presentation.ui.fragments.newcard.cardtype.a f12401q0;

    /* compiled from: SelectCardTypeFragment.kt */
    public final class a extends B {

        /* renamed from: f, reason: collision with root package name */
        public final InterfaceC0646l<Integer, p> f12402f;

        public a(C7.a aVar) {
            this.f12402f = aVar;
        }

        @Override // androidx.recyclerview.widget.B, androidx.recyclerview.widget.M
        public final View d(RecyclerView.n nVar) {
            View d10 = super.d(nVar);
            if (d10 != null) {
                int position = nVar.getPosition(d10);
                InterfaceC0646l<Integer, p> interfaceC0646l = this.f12402f;
                SelectCardTypeFragment selectCardTypeFragment = SelectCardTypeFragment.this;
                if (position == 0) {
                    interfaceC0646l.invoke(1);
                    selectCardTypeFragment.f12399o0 = 1;
                } else if (position != selectCardTypeFragment.f12399o0) {
                    interfaceC0646l.invoke(Integer.valueOf(position));
                    selectCardTypeFragment.f12399o0 = position;
                }
            }
            return d10;
        }
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        String str;
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = true;
        toolbarStatus.f13265c = 18;
        com.luminary.business.presentation.ui.fragments.newcard.cardtype.a aVar = this.f12401q0;
        if (aVar == null || (str = aVar.f12405b) == null) {
            str = "";
        }
        toolbarStatus.f13263a = str;
        return toolbarStatus;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f12401q0 = a.C0131a.a(arguments);
        }
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        a aVar = new a(new C7.a(this, 5));
        CyclicCarousel cyclicCarousel = u0().f27914o;
        cyclicCarousel.setSaveEnabled(true);
        cyclicCarousel.setLayoutManager(new LinearLayoutManager(cyclicCarousel.getContext(), 0, false));
        C1221j c1221j = new C1221j();
        c1221j.a();
        Integer valueOf = Integer.valueOf(R.drawable.img_card_virtual_luminary);
        c1221j.onMutation();
        c1221j.f26903a = valueOf;
        cyclicCarousel.setModels(Collections.singletonList(c1221j));
        cyclicCarousel.setOnFlingListener(null);
        aVar.a(cyclicCarousel);
        cyclicCarousel.setPaddingDp(16);
        u0().f27914o.scrollToPosition(23560);
        G5 u02 = u0();
        u02.f1148d.postDelayed(new d(this, 10), 100L);
        com.luminary.business.presentation.ui.fragments.newcard.cardtype.a aVar2 = this.f12401q0;
        if (aVar2 != null) {
            G5 u03 = u0();
            o.c(u03.f27913n, 500L, new c(5, this, aVar2));
        }
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f12398n0;
    }
}
