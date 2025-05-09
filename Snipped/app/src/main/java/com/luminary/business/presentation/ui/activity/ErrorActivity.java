package com.luminary.business.presentation.ui.activity;

import B6.i;
import O9.f;
import U4.b;
import android.os.Bundle;
import c.AbstractC0618i;
import ca.InterfaceC0635a;
import com.luminary.business.presentation.ui.base.BaseActivity;
import com.luminary.business.presentation.ui.views.toolbar.CustomToolbarView;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.mobile.R;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.h;
import t6.C1288a;

/* compiled from: ErrorActivity.kt */
/* loaded from: classes2.dex */
public final class ErrorActivity extends BaseActivity<C1288a> {

    /* renamed from: p, reason: collision with root package name */
    public final int f11398p = R.layout.activity_error;

    /* renamed from: q, reason: collision with root package name */
    public final f f11399q = kotlin.a.b(LazyThreadSafetyMode.f23085a, new InterfaceC0635a<i>() { // from class: com.luminary.business.presentation.ui.activity.ErrorActivity$special$$inlined$inject$default$1
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [B6.i, java.lang.Object] */
        @Override // ca.InterfaceC0635a
        public final i invoke() {
            return b.l(this).a(null, null, h.a(i.class));
        }
    });

    /* renamed from: r, reason: collision with root package name */
    public final a f11400r = new a(true);

    @Override // com.luminary.business.presentation.ui.base.BaseActivity, androidx.fragment.app.ActivityC0533g, androidx.activity.ComponentActivity, j0.ActivityC0879h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        this.f11451k = (i) this.f11399q.getValue();
        this.f11452l = 16;
        super.onCreate(bundle);
        getOnBackPressedDispatcher().b(this.f11400r);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseActivity
    public final int t() {
        return this.f11398p;
    }

    /* compiled from: ErrorActivity.kt */
    public static final class a extends AbstractC0618i {
        @Override // c.AbstractC0618i
        public final void b() {
        }
    }

    @Override // com.luminary.business.presentation.ui.base.BaseActivity
    public final void s() {
    }

    @Override // com.luminary.business.presentation.ui.base.BaseActivity
    public final void w() {
    }

    @Override // com.luminary.business.presentation.ui.base.BaseActivity
    public final void y() {
    }

    @Override // com.luminary.business.presentation.ui.base.BaseActivity
    public final void u(String str) {
    }

    @Override // com.luminary.business.presentation.ui.base.BaseActivity
    public final void v(int i) {
    }

    @Override // com.luminary.business.presentation.ui.base.BaseActivity
    public final void z(ToolbarStatus toolbarStatus, CustomToolbarView.State state) {
    }
}
