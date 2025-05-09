package com.luminary.business.presentation.ui.fragments.cards.details.card;

import C.v;
import F8.o;
import P9.s;
import X6.b;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.A;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.google.android.material.imageview.ShapeableImageView;
import com.luminary.business.domain.entity.account.CardsDomain;
import com.luminary.mobile.R;
import h4.e;
import java.util.Locale;
import ka.C0970o;
import kotlin.Pair;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import kotlin.text.Regex;
import t6.Q2;

/* compiled from: CardFragment.kt */
/* loaded from: classes2.dex */
public final class CardFragment extends Fragment {

    /* renamed from: f0, reason: collision with root package name */
    public Q2 f11802f0;

    /* renamed from: g0, reason: collision with root package name */
    public CardsDomain f11803g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f11804h0 = true;

    /* renamed from: i0, reason: collision with root package name */
    public String f11805i0 = "";

    /* renamed from: j0, reason: collision with root package name */
    public final H1.a f11806j0;

    /* compiled from: CardFragment.kt */
    public static final class a implements A, d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f11811a;

        public a(C7.a aVar) {
            this.f11811a = aVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof d)) {
                return f.b(getFunctionDelegate(), ((d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f11811a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f11811a.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.luminary.business.presentation.ui.fragments.cards.details.card.CardFragment$special$$inlined$viewModel$default$1] */
    public CardFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.cards.details.card.CardFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f11806j0 = E.a(this, h.a(b.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.cards.details.card.CardFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.cards.details.card.CardFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return U4.b.n((X) r02.invoke(), h.a(b.class), null, null, U4.b.l(this));
            }
        });
    }

    public final void o0() {
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2;
        ConstraintLayout constraintLayout3;
        String str = this.f11805i0;
        if (f.b(str != null ? str.toLowerCase(Locale.ROOT) : null, "closed")) {
            Q2 q22 = this.f11802f0;
            if (q22 != null && (constraintLayout3 = q22.f28379n) != null) {
                constraintLayout3.setAlpha(0.5f);
            }
            q0(true);
            return;
        }
        String str2 = this.f11805i0;
        if (f.b(str2 != null ? str2.toLowerCase(Locale.ROOT) : null, "blocked")) {
            q0(false);
            Q2 q23 = this.f11802f0;
            if (q23 == null || (constraintLayout2 = q23.f28379n) == null) {
                return;
            }
            constraintLayout2.setAlpha(0.5f);
            return;
        }
        q0(false);
        Q2 q24 = this.f11802f0;
        if (q24 == null || (constraintLayout = q24.f28379n) == null) {
            return;
        }
        constraintLayout.setAlpha(1.0f);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = Q2.f28378y;
        DataBinderMapperImpl dataBinderMapperImpl = F0.d.f1140a;
        Q2 q22 = (Q2) F0.f.f(layoutInflater, R.layout.fragment_card, viewGroup, false, null);
        this.f11802f0 = q22;
        return q22.f28383r;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        CardsDomain cardsDomain;
        ShapeableImageView shapeableImageView;
        TextView textView;
        ImageView imageView;
        ImageView imageView2;
        Object obj;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                obj = arguments.getSerializable("card", CardsDomain.class);
            } else {
                Object serializable = arguments.getSerializable("card");
                if (!(serializable instanceof CardsDomain)) {
                    serializable = null;
                }
                obj = (CardsDomain) serializable;
            }
            cardsDomain = (CardsDomain) obj;
        } else {
            cardsDomain = null;
        }
        this.f11803g0 = cardsDomain;
        int i = getResources().getDisplayMetrics().widthPixels;
        Q2 q22 = this.f11802f0;
        ViewGroup.LayoutParams layoutParams = (q22 == null || (imageView2 = q22.f28380o) == null) ? null : imageView2.getLayoutParams();
        int T = (i - ((int) D9.b.T(100))) - ((int) D9.b.T(13));
        if (layoutParams != null) {
            layoutParams.width = T;
        }
        if (layoutParams != null) {
            layoutParams.height = (int) (T * 0.63d);
        }
        Q2 q23 = this.f11802f0;
        if (q23 != null && (imageView = q23.f28380o) != null) {
            imageView.setLayoutParams(layoutParams);
        }
        Q2 q24 = this.f11802f0;
        if (q24 != null && (textView = q24.f28387v) != null) {
            CardsDomain cardsDomain2 = this.f11803g0;
            textView.setText(cardsDomain2 != null ? cardsDomain2.f10727d : null);
        }
        p0();
        Q2 q25 = this.f11802f0;
        if (q25 != null && (shapeableImageView = q25.f28382q) != null) {
            o.c(shapeableImageView, 500L, new A8.b(this, 16));
        }
        ((b) this.f11806j0.getValue()).f4029V0.observe(getViewLifecycleOwner(), new a(new C7.a(this, 13)));
        CardsDomain cardsDomain3 = this.f11803g0;
        this.f11805i0 = cardsDomain3 != null ? cardsDomain3.i : null;
        o0();
    }

    public final void p0() {
        Integer num;
        ShapeableImageView shapeableImageView;
        TextView textView;
        TextView textView2;
        TextView textView3;
        if (!this.f11804h0) {
            H1.a aVar = this.f11806j0;
            if (((b) aVar.getValue()).f4029V0.getValue() != null) {
                r0();
                return;
            }
            CardsDomain cardsDomain = this.f11803g0;
            if (cardsDomain == null || (num = cardsDomain.f10724a) == null) {
                return;
            }
            int intValue = num.intValue();
            b bVar = (b) aVar.getValue();
            int h9 = bVar.f4028U0.h();
            bVar.l();
            bVar.f4027T0.a(new X6.a(bVar, 0), new Pair(String.valueOf(h9), Integer.valueOf(intValue)));
            return;
        }
        Q2 q22 = this.f11802f0;
        if (q22 != null && (textView3 = q22.f28389x) != null) {
            textView3.setText("**/**");
        }
        Q2 q23 = this.f11802f0;
        if (q23 != null && (textView2 = q23.f28385t) != null) {
            textView2.setText("***");
        }
        Q2 q24 = this.f11802f0;
        if (q24 != null && (textView = q24.f28386u) != null) {
            CardsDomain cardsDomain2 = this.f11803g0;
            if (cardsDomain2 != null) {
                String str = cardsDomain2.f10730g;
                r2 = s3.b.j("**** **** **** ", str != null ? C0970o.A0(4, str) : null);
            }
            textView.setText(r2);
        }
        Q2 q25 = this.f11802f0;
        if (q25 == null || (shapeableImageView = q25.f28382q) == null) {
            return;
        }
        shapeableImageView.setBackgroundResource(R.color.main_color);
    }

    public final void q0(boolean z10) {
        ImageView imageView;
        TextView textView;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        Q2 q22 = this.f11802f0;
        if (q22 != null && (textView4 = q22.f28389x) != null) {
            textView4.setVisibility(z10 ? 8 : 0);
        }
        Q2 q23 = this.f11802f0;
        if (q23 != null && (textView3 = q23.f28388w) != null) {
            textView3.setVisibility(z10 ? 8 : 0);
        }
        Q2 q24 = this.f11802f0;
        if (q24 != null && (textView2 = q24.f28384s) != null) {
            textView2.setVisibility(z10 ? 8 : 0);
        }
        Q2 q25 = this.f11802f0;
        if (q25 != null && (textView = q25.f28385t) != null) {
            textView.setVisibility(z10 ? 8 : 0);
        }
        Q2 q26 = this.f11802f0;
        if (q26 == null || (imageView = q26.f28381p) == null) {
            return;
        }
        imageView.setVisibility(z10 ^ true ? 8 : 0);
    }

    public final void r0() {
        ShapeableImageView shapeableImageView;
        TextView textView;
        String P4;
        TextView textView2;
        TextView textView3;
        String str;
        Q2 q22 = this.f11802f0;
        if (q22 != null && (textView3 = q22.f28389x) != null) {
            CardsDomain cardsDomain = this.f11803g0;
            textView3.setText((cardsDomain == null || (str = cardsDomain.f10731h) == null) ? null : v.p(str.substring(5, 7), "/", str.substring(2, 4)));
        }
        Q2 q23 = this.f11802f0;
        H1.a aVar = this.f11806j0;
        if (q23 != null && (textView2 = q23.f28385t) != null) {
            e value = ((b) aVar.getValue()).f4029V0.getValue();
            textView2.setText(value != null ? value.f21081b : null);
        }
        Q2 q24 = this.f11802f0;
        if (q24 != null && (textView = q24.f28386u) != null) {
            e value2 = ((b) aVar.getValue()).f4029V0.getValue();
            if (value2 != null) {
                String str2 = value2.f21080a;
                r2 = str2 != null ? new Regex("\\D").c(str2, "") : null;
                r2 = (r2 == null || (P4 = s.P(C0970o.v0(4, r2), " ", null, null, null, 62)) == null) ? "" : P4;
            }
            textView.setText(r2);
        }
        Q2 q25 = this.f11802f0;
        if (q25 == null || (shapeableImageView = q25.f28382q) == null) {
            return;
        }
        shapeableImageView.setBackgroundResource(R.color.black);
    }
}
