package com.luminary.business.presentation.ui.fragments.auth.login.blocked;

import F8.o;
import J6.g;
import O9.p;
import U4.b;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import ca.InterfaceC0635a;
import com.luminary.business.presentation.entity.register.RegisterSuccessUI;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.auth.login.blocked.UserBlockedFragment;
import com.luminary.business.presentation.ui.fragments.auth.login.blocked.a;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.mobile.R;
import java.util.Collections;
import kotlin.jvm.internal.h;
import t6.AbstractC1430r6;

/* compiled from: UserBlockedFragment.kt */
/* loaded from: classes2.dex */
public final class UserBlockedFragment extends BaseFragment<AbstractC1430r6> {

    /* renamed from: n0, reason: collision with root package name */
    public final int f11606n0 = R.layout.fragment_user_blocked;

    /* renamed from: o0, reason: collision with root package name */
    public a f11607o0;

    /* JADX WARN: Type inference failed for: r0v1, types: [com.luminary.business.presentation.ui.fragments.auth.login.blocked.UserBlockedFragment$special$$inlined$viewModel$default$1] */
    public UserBlockedFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.auth.login.blocked.UserBlockedFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        E.a(this, h.a(g.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.auth.login.blocked.UserBlockedFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.auth.login.blocked.UserBlockedFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return b.n((X) r02.invoke(), h.a(g.class), null, null, b.l(this));
            }
        });
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = false;
        toolbarStatus.f13263a = getString(R.string.account_has_been_blocked);
        toolbarStatus.f13266d = getString(R.string.please_contact_customer_support);
        toolbarStatus.f13265c = 18;
        return toolbarStatus;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f11607o0 = a.C0115a.a(arguments);
        }
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        RegisterSuccessUI registerSuccessUI;
        super.onViewCreated(view, bundle);
        a aVar = this.f11607o0;
        if (aVar != null && (registerSuccessUI = aVar.f11612a) != null) {
            AbstractC1430r6 u02 = u0();
            StringBuilder sb2 = new StringBuilder();
            String str = registerSuccessUI.f11360a;
            sb2.append(str);
            sb2.append(" ");
            String str2 = registerSuccessUI.f11361b;
            sb2.append(str2);
            u02.f29544q.setText(sb2.toString());
            u02.f29546s.setText(D9.b.U(str + " " + str2));
            u02.f29543p.setText(registerSuccessUI.f11362c);
            u02.f29545r.setText(registerSuccessUI.f11363d);
        }
        final int i = 0;
        o.c(u0().f29542o, 500L, new InterfaceC0635a(this) { // from class: K6.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UserBlockedFragment f2257b;

            {
                this.f2257b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                switch (i) {
                    case 0:
                        b.g(this.f2257b).m(R.id.welcomeFragment, false);
                        break;
                    default:
                        BaseFragment.q0(this.f2257b, Collections.singletonList("support@com"));
                        break;
                }
                return p.f3034a;
            }
        });
        final int i9 = 1;
        o.c(u0().f29541n, 500L, new InterfaceC0635a(this) { // from class: K6.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UserBlockedFragment f2257b;

            {
                this.f2257b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                switch (i9) {
                    case 0:
                        b.g(this.f2257b).m(R.id.welcomeFragment, false);
                        break;
                    default:
                        BaseFragment.q0(this.f2257b, Collections.singletonList("support@com"));
                        break;
                }
                return p.f3034a;
            }
        });
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f11606n0;
    }
}
