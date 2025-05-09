package com.luminary.business.presentation.ui.activity.passcode;

import B6.g;
import C.v;
import F8.o;
import O9.f;
import O9.p;
import R0.e;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import androidx.fragment.app.FragmentManager;
import c.AbstractC0618i;
import ca.InterfaceC0635a;
import com.luminary.business.presentation.ui.activity.passcode.PasscodeActivity;
import com.luminary.business.presentation.ui.base.BaseActivity;
import com.luminary.business.presentation.ui.views.toolbar.CustomToolbarView;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.business.presentation.utils.bottomDialog.BottomDialogType;
import com.luminary.mobile.R;
import java.util.concurrent.Executor;
import k0.C0913a;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.h;
import q.h;
import q.i;
import q.k;
import t6.AbstractC1312d;
import z6.C1646a;
import z6.C1648c;

/* compiled from: PasscodeActivity.kt */
/* loaded from: classes2.dex */
public final class PasscodeActivity extends BaseActivity<AbstractC1312d> {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f11423y = 0;

    /* renamed from: r, reason: collision with root package name */
    public i f11426r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f11427s;

    /* renamed from: v, reason: collision with root package name */
    public boolean f11430v;

    /* renamed from: p, reason: collision with root package name */
    public final int f11424p = R.layout.activity_passcode;

    /* renamed from: q, reason: collision with root package name */
    public final f f11425q = kotlin.a.b(LazyThreadSafetyMode.f23085a, new InterfaceC0635a<C1648c>() { // from class: com.luminary.business.presentation.ui.activity.passcode.PasscodeActivity$special$$inlined$inject$default$1
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, z6.c] */
        @Override // ca.InterfaceC0635a
        public final C1648c invoke() {
            return U4.b.l(this).a(null, null, h.a(C1648c.class));
        }
    });

    /* renamed from: t, reason: collision with root package name */
    public String f11428t = "";

    /* renamed from: u, reason: collision with root package name */
    public String f11429u = "";

    /* renamed from: w, reason: collision with root package name */
    public NewSteps f11431w = NewSteps.f11437d;

    /* renamed from: x, reason: collision with root package name */
    public final b f11432x = new b(true);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PasscodeActivity.kt */
    public static final class NewSteps {

        /* renamed from: a, reason: collision with root package name */
        public static final NewSteps f11434a;

        /* renamed from: b, reason: collision with root package name */
        public static final NewSteps f11435b;

        /* renamed from: c, reason: collision with root package name */
        public static final NewSteps f11436c;

        /* renamed from: d, reason: collision with root package name */
        public static final NewSteps f11437d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ NewSteps[] f11438e;

        static {
            NewSteps newSteps = new NewSteps("CURRENT", 0);
            f11434a = newSteps;
            NewSteps newSteps2 = new NewSteps("NEW", 1);
            f11435b = newSteps2;
            NewSteps newSteps3 = new NewSteps("CONFIRM", 2);
            f11436c = newSteps3;
            NewSteps newSteps4 = new NewSteps("CHECK", 3);
            f11437d = newSteps4;
            f11438e = new NewSteps[]{newSteps, newSteps2, newSteps3, newSteps4};
        }

        public NewSteps() {
            throw null;
        }

        public static NewSteps valueOf(String str) {
            return (NewSteps) Enum.valueOf(NewSteps.class, str);
        }

        public static NewSteps[] values() {
            return (NewSteps[]) f11438e.clone();
        }
    }

    /* compiled from: PasscodeActivity.kt */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11439a;

        static {
            int[] iArr = new int[NewSteps.values().length];
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                NewSteps newSteps = NewSteps.f11434a;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                NewSteps newSteps2 = NewSteps.f11434a;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                NewSteps newSteps3 = NewSteps.f11434a;
                iArr[0] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f11439a = iArr;
            int[] iArr2 = new int[BaseActivity.VibrateType.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                BaseActivity.VibrateType vibrateType = BaseActivity.VibrateType.f11459a;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                BaseActivity.VibrateType vibrateType2 = BaseActivity.VibrateType.f11459a;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                BaseActivity.VibrateType vibrateType3 = BaseActivity.VibrateType.f11459a;
                iArr2[3] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                BaseActivity.VibrateType vibrateType4 = BaseActivity.VibrateType.f11459a;
                iArr2[4] = 5;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* compiled from: PasscodeActivity.kt */
    public static final class c extends i.a {
        public c() {
        }

        @Override // q.i.a
        public final void a() {
            BaseActivity.VibrateType vibrateType = BaseActivity.VibrateType.f11461c;
            PasscodeActivity passcodeActivity = PasscodeActivity.this;
            passcodeActivity.H(vibrateType);
            if (passcodeActivity.f11430v) {
                passcodeActivity.finish();
            }
        }

        @Override // q.i.a
        public final void b() {
            BaseActivity.VibrateType vibrateType = BaseActivity.VibrateType.f11461c;
            PasscodeActivity passcodeActivity = PasscodeActivity.this;
            passcodeActivity.H(vibrateType);
            if (passcodeActivity.f11430v) {
                passcodeActivity.finish();
            }
        }

        @Override // q.i.a
        public final void c() {
            PasscodeActivity passcodeActivity = PasscodeActivity.this;
            if (passcodeActivity.f11430v) {
                passcodeActivity.C().f31331U0.m();
            }
            if (passcodeActivity.getIntent().getBooleanExtra("DEACTIVATE_ACCOUNT", false)) {
                passcodeActivity.setResult(-1);
            }
            passcodeActivity.finish();
        }
    }

    public final void A(String str) {
        H(BaseActivity.VibrateType.f11460b);
        if (this.f11429u.length() > 5) {
            return;
        }
        String n10 = v.n(this.f11429u, str);
        this.f11429u = n10;
        if (n10.length() > 0) {
            E();
        }
        if (this.f11429u.length() == 5) {
            C().l();
            Object obj = this.f11453m;
            if (obj == null) {
                obj = null;
            }
            ((AbstractC1312d) obj).f1148d.postDelayed(new Runnable() { // from class: com.luminary.business.presentation.ui.activity.passcode.b
                @Override // java.lang.Runnable
                public final void run() {
                    PasscodeActivity passcodeActivity = PasscodeActivity.this;
                    int ordinal = passcodeActivity.f11431w.ordinal();
                    if (ordinal == 0) {
                        C1648c C10 = passcodeActivity.C();
                        if (C10.f31331U0.r(passcodeActivity.f11429u)) {
                            passcodeActivity.f11431w = PasscodeActivity.NewSteps.f11435b;
                            passcodeActivity.G();
                            passcodeActivity.E();
                        } else {
                            passcodeActivity.F();
                            passcodeActivity.H(BaseActivity.VibrateType.f11461c);
                            passcodeActivity.f11429u = "";
                        }
                    } else if (ordinal == 1) {
                        passcodeActivity.f11431w = PasscodeActivity.NewSteps.f11436c;
                        passcodeActivity.f11428t = passcodeActivity.f11429u;
                        passcodeActivity.G();
                        passcodeActivity.E();
                    } else if (ordinal != 2) {
                        if (ordinal != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        C1648c C11 = passcodeActivity.C();
                        if (C11.f31331U0.r(passcodeActivity.f11429u)) {
                            if (passcodeActivity.getIntent().getBooleanExtra("DEACTIVATE_ACCOUNT", false)) {
                                passcodeActivity.setResult(-1);
                            }
                            ((K8.a) passcodeActivity.i.getValue()).b();
                            passcodeActivity.finish();
                        } else {
                            passcodeActivity.F();
                            passcodeActivity.H(BaseActivity.VibrateType.f11461c);
                            passcodeActivity.f11429u = "";
                        }
                    } else if (!kotlin.jvm.internal.f.b(passcodeActivity.f11428t, passcodeActivity.f11429u)) {
                        passcodeActivity.F();
                        passcodeActivity.H(BaseActivity.VibrateType.f11461c);
                        passcodeActivity.f11429u = "";
                    } else if (passcodeActivity.C().f31331U0.B()) {
                        C1648c C12 = passcodeActivity.C();
                        C12.f31331U0.i(passcodeActivity.f11429u);
                        BottomDialogType.f13289k.getClass();
                        BottomDialogType d10 = BottomDialogType.a.d();
                        d10.f13295a = passcodeActivity.getString(R.string.new_passcode_has_been_set);
                        d10.f13297c = passcodeActivity.getString(R.string.done);
                        d10.f13299e = passcodeActivity.getString(R.string.done);
                        ((D8.a) passcodeActivity.f11450j.getValue()).c(d10, new C1646a(passcodeActivity, 12), new C1646a(passcodeActivity, 13));
                    } else {
                        C1648c C13 = passcodeActivity.C();
                        C13.f31331U0.i(passcodeActivity.f11429u);
                        passcodeActivity.B(true);
                    }
                    passcodeActivity.C().k();
                }
            }, 100L);
        }
    }

    public final void B(boolean z10) {
        int a10 = new q.h(new h.c(this)).a(32783);
        if (a10 == -2) {
            if (z10) {
                finish();
                return;
            }
            return;
        }
        if (a10 == -1) {
            if (z10) {
                finish();
                return;
            }
            return;
        }
        if (a10 == 0) {
            if (!z10) {
                if (C().f31331U0.M()) {
                    D();
                    return;
                }
                return;
            } else {
                if (C().f31331U0.M()) {
                    finish();
                    return;
                }
                BottomDialogType.f13289k.getClass();
                BottomDialogType c2 = BottomDialogType.a.c();
                c2.f13295a = getString(R.string.would_you_like_to_activate_touch_id);
                c2.f13297c = getString(R.string.yes_proceed);
                c2.f13299e = getString(R.string.go_back);
                c2.f13300f = Integer.valueOf(getResources().getBoolean(R.bool.isLuminary) ? R.drawable.img_bio_active_luminary : R.drawable.img_bio_active);
                ((D8.a) this.f11450j.getValue()).c(c2, new C1646a(this, 10), new C1646a(this, 11));
                return;
            }
        }
        if (a10 == 1) {
            if (z10) {
                finish();
            }
        } else if (a10 == 11) {
            if (z10) {
                finish();
            }
        } else if (a10 == 12) {
            if (z10) {
                finish();
            }
        } else if (a10 == 15 && z10) {
            finish();
        }
    }

    public final C1648c C() {
        return (C1648c) this.f11425q.getValue();
    }

    public final void D() {
        Executor mainExecutor = C0913a.getMainExecutor(this);
        if (mainExecutor == null) {
            mainExecutor = null;
        }
        c cVar = new c();
        i iVar = new i();
        if (mainExecutor == null) {
            throw new IllegalArgumentException("Executor must not be null.");
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        e eVar = new e(getViewModelStore(), getDefaultViewModelProviderFactory(), getDefaultViewModelCreationExtras());
        kotlin.jvm.internal.b a10 = kotlin.jvm.internal.h.a(k.class);
        String b9 = a10.b();
        if (b9 == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
        }
        k kVar = (k) eVar.a(a10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b9));
        iVar.f25772b = true;
        iVar.f25771a = supportFragmentManager;
        kVar.f25809k = mainExecutor;
        kVar.f25810p = cVar;
        this.f11426r = iVar;
        i.d.a aVar = new i.d.a();
        aVar.f25783a = "Biometric login for my app";
        aVar.f25784b = "Log in using your biometric credential";
        aVar.f25785c = "Use account password";
        i.d a11 = aVar.a();
        i iVar2 = this.f11426r;
        (iVar2 != null ? iVar2 : null).a(a11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void E() {
        Object obj = this.f11453m;
        if (obj == null) {
            obj = null;
        }
        o.b(((AbstractC1312d) obj).f28894r);
        int length = this.f11429u.length();
        if (length == 1) {
            Object obj2 = this.f11453m;
            if (obj2 == null) {
                obj2 = null;
            }
            ((AbstractC1312d) obj2).f28897u.setImageResource(R.drawable.elipse_active);
            Object obj3 = this.f11453m;
            if (obj3 == null) {
                obj3 = null;
            }
            ((AbstractC1312d) obj3).f28898v.setImageResource(R.drawable.elipse_disable);
            Object obj4 = this.f11453m;
            if (obj4 == null) {
                obj4 = null;
            }
            ((AbstractC1312d) obj4).f28899w.setImageResource(R.drawable.elipse_disable);
            Object obj5 = this.f11453m;
            if (obj5 == null) {
                obj5 = null;
            }
            ((AbstractC1312d) obj5).f28900x.setImageResource(R.drawable.elipse_disable);
            Object obj6 = this.f11453m;
            ((AbstractC1312d) (obj6 != null ? obj6 : null)).f28901y.setImageResource(R.drawable.elipse_disable);
            return;
        }
        if (length == 2) {
            Object obj7 = this.f11453m;
            if (obj7 == null) {
                obj7 = null;
            }
            ((AbstractC1312d) obj7).f28897u.setImageResource(R.drawable.elipse_active);
            Object obj8 = this.f11453m;
            if (obj8 == null) {
                obj8 = null;
            }
            ((AbstractC1312d) obj8).f28898v.setImageResource(R.drawable.elipse_active);
            Object obj9 = this.f11453m;
            if (obj9 == null) {
                obj9 = null;
            }
            ((AbstractC1312d) obj9).f28899w.setImageResource(R.drawable.elipse_disable);
            Object obj10 = this.f11453m;
            if (obj10 == null) {
                obj10 = null;
            }
            ((AbstractC1312d) obj10).f28900x.setImageResource(R.drawable.elipse_disable);
            Object obj11 = this.f11453m;
            ((AbstractC1312d) (obj11 != null ? obj11 : null)).f28901y.setImageResource(R.drawable.elipse_disable);
            return;
        }
        if (length == 3) {
            Object obj12 = this.f11453m;
            if (obj12 == null) {
                obj12 = null;
            }
            ((AbstractC1312d) obj12).f28897u.setImageResource(R.drawable.elipse_active);
            Object obj13 = this.f11453m;
            if (obj13 == null) {
                obj13 = null;
            }
            ((AbstractC1312d) obj13).f28898v.setImageResource(R.drawable.elipse_active);
            Object obj14 = this.f11453m;
            if (obj14 == null) {
                obj14 = null;
            }
            ((AbstractC1312d) obj14).f28899w.setImageResource(R.drawable.elipse_active);
            Object obj15 = this.f11453m;
            if (obj15 == null) {
                obj15 = null;
            }
            ((AbstractC1312d) obj15).f28900x.setImageResource(R.drawable.elipse_disable);
            Object obj16 = this.f11453m;
            ((AbstractC1312d) (obj16 != null ? obj16 : null)).f28901y.setImageResource(R.drawable.elipse_disable);
            return;
        }
        if (length == 4) {
            Object obj17 = this.f11453m;
            if (obj17 == null) {
                obj17 = null;
            }
            ((AbstractC1312d) obj17).f28897u.setImageResource(R.drawable.elipse_active);
            Object obj18 = this.f11453m;
            if (obj18 == null) {
                obj18 = null;
            }
            ((AbstractC1312d) obj18).f28898v.setImageResource(R.drawable.elipse_active);
            Object obj19 = this.f11453m;
            if (obj19 == null) {
                obj19 = null;
            }
            ((AbstractC1312d) obj19).f28899w.setImageResource(R.drawable.elipse_active);
            Object obj20 = this.f11453m;
            if (obj20 == null) {
                obj20 = null;
            }
            ((AbstractC1312d) obj20).f28900x.setImageResource(R.drawable.elipse_active);
            Object obj21 = this.f11453m;
            ((AbstractC1312d) (obj21 != null ? obj21 : null)).f28901y.setImageResource(R.drawable.elipse_disable);
            return;
        }
        if (length != 5) {
            Object obj22 = this.f11453m;
            if (obj22 == null) {
                obj22 = null;
            }
            ((AbstractC1312d) obj22).f28897u.setImageResource(R.drawable.elipse_disable);
            Object obj23 = this.f11453m;
            if (obj23 == null) {
                obj23 = null;
            }
            ((AbstractC1312d) obj23).f28898v.setImageResource(R.drawable.elipse_disable);
            Object obj24 = this.f11453m;
            if (obj24 == null) {
                obj24 = null;
            }
            ((AbstractC1312d) obj24).f28899w.setImageResource(R.drawable.elipse_disable);
            Object obj25 = this.f11453m;
            if (obj25 == null) {
                obj25 = null;
            }
            ((AbstractC1312d) obj25).f28900x.setImageResource(R.drawable.elipse_disable);
            Object obj26 = this.f11453m;
            ((AbstractC1312d) (obj26 != null ? obj26 : null)).f28901y.setImageResource(R.drawable.elipse_disable);
            return;
        }
        Object obj27 = this.f11453m;
        if (obj27 == null) {
            obj27 = null;
        }
        ((AbstractC1312d) obj27).f28897u.setImageResource(R.drawable.elipse_active);
        Object obj28 = this.f11453m;
        if (obj28 == null) {
            obj28 = null;
        }
        ((AbstractC1312d) obj28).f28898v.setImageResource(R.drawable.elipse_active);
        Object obj29 = this.f11453m;
        if (obj29 == null) {
            obj29 = null;
        }
        ((AbstractC1312d) obj29).f28899w.setImageResource(R.drawable.elipse_active);
        Object obj30 = this.f11453m;
        if (obj30 == null) {
            obj30 = null;
        }
        ((AbstractC1312d) obj30).f28900x.setImageResource(R.drawable.elipse_active);
        Object obj31 = this.f11453m;
        ((AbstractC1312d) (obj31 != null ? obj31 : null)).f28901y.setImageResource(R.drawable.elipse_active);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void F() {
        H(BaseActivity.VibrateType.f11459a);
        NewSteps newSteps = this.f11431w;
        String string = (newSteps == NewSteps.f11437d || newSteps == NewSteps.f11434a) ? getString(R.string.incorrect_passcode) : getString(R.string.passcodes_dont_match);
        Object obj = this.f11453m;
        if (obj == null) {
            obj = null;
        }
        ((AbstractC1312d) obj).f28894r.setText(string);
        Object obj2 = this.f11453m;
        if (obj2 == null) {
            obj2 = null;
        }
        ((AbstractC1312d) obj2).f28894r.setVisibility(0);
        Object obj3 = this.f11453m;
        if (obj3 == null) {
            obj3 = null;
        }
        ((AbstractC1312d) obj3).f28897u.setImageResource(R.drawable.elipse_error);
        Object obj4 = this.f11453m;
        if (obj4 == null) {
            obj4 = null;
        }
        ((AbstractC1312d) obj4).f28898v.setImageResource(R.drawable.elipse_error);
        Object obj5 = this.f11453m;
        if (obj5 == null) {
            obj5 = null;
        }
        ((AbstractC1312d) obj5).f28899w.setImageResource(R.drawable.elipse_error);
        Object obj6 = this.f11453m;
        if (obj6 == null) {
            obj6 = null;
        }
        ((AbstractC1312d) obj6).f28900x.setImageResource(R.drawable.elipse_error);
        Object obj7 = this.f11453m;
        ((AbstractC1312d) (obj7 != null ? obj7 : null)).f28901y.setImageResource(R.drawable.elipse_error);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void G() {
        int ordinal = this.f11431w.ordinal();
        b bVar = this.f11432x;
        if (ordinal == 1) {
            bVar.e(!this.f11427s);
        } else if (ordinal == 2) {
            bVar.e(!this.f11427s);
        } else if (ordinal != 3) {
            bVar.e(false);
        } else {
            bVar.e(true);
        }
        Object obj = this.f11453m;
        if (obj == null) {
            obj = null;
        }
        ((AbstractC1312d) obj).f28892p.setVisibility(this.f11427s ? 0 : 8);
        int ordinal2 = this.f11431w.ordinal();
        if (ordinal2 == 0) {
            Object obj2 = this.f11453m;
            if (obj2 == null) {
                obj2 = null;
            }
            ((AbstractC1312d) obj2).f28889J.setTextSize(18.0f);
            Object obj3 = this.f11453m;
            if (obj3 == null) {
                obj3 = null;
            }
            ((AbstractC1312d) obj3).f28889J.setText(getString(R.string.current_passcode));
        } else if (ordinal2 == 1) {
            Object obj4 = this.f11453m;
            if (obj4 == null) {
                obj4 = null;
            }
            ((AbstractC1312d) obj4).f28889J.setTextSize(18.0f);
            Object obj5 = this.f11453m;
            if (obj5 == null) {
                obj5 = null;
            }
            ((AbstractC1312d) obj5).f28889J.setText(this.f11427s ? getString(R.string.new_passcode) : getString(R.string.create_passcode));
        } else if (ordinal2 == 2) {
            Object obj6 = this.f11453m;
            if (obj6 == null) {
                obj6 = null;
            }
            ((AbstractC1312d) obj6).f28889J.setTextSize(18.0f);
            Object obj7 = this.f11453m;
            if (obj7 == null) {
                obj7 = null;
            }
            ((AbstractC1312d) obj7).f28889J.setText(getString(R.string.confirm_passcode));
        } else {
            if (ordinal2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            Object obj8 = this.f11453m;
            if (obj8 == null) {
                obj8 = null;
            }
            ((AbstractC1312d) obj8).f28889J.setTextSize(20.0f);
            Object obj9 = this.f11453m;
            if (obj9 == null) {
                obj9 = null;
            }
            ((AbstractC1312d) obj9).f28889J.setText(getString(getIntent().getBooleanExtra("DEACTIVATE_ACCOUNT", false) ? R.string.please_confirm_your_action_to_proceed : R.string.welcome_back_please_login));
        }
        this.f11429u = "";
        if (this.f11431w != NewSteps.f11437d) {
            Object obj10 = this.f11453m;
            if (obj10 == null) {
                obj10 = null;
            }
            o.b(((AbstractC1312d) obj10).f28891o);
        } else if (C().f31331U0.M()) {
            Object obj11 = this.f11453m;
            if (obj11 == null) {
                obj11 = null;
            }
            ((AbstractC1312d) obj11).f28891o.setVisibility(0);
        } else {
            Object obj12 = this.f11453m;
            if (obj12 == null) {
                obj12 = null;
            }
            o.b(((AbstractC1312d) obj12).f28891o);
        }
        if (a.f11439a[this.f11431w.ordinal()] != 1) {
            Object obj13 = this.f11453m;
            if (obj13 == null) {
                obj13 = null;
            }
            ((AbstractC1312d) obj13).f28896t.setVisibility(4);
            Object obj14 = this.f11453m;
            if (obj14 == null) {
                obj14 = null;
            }
            o.c(((AbstractC1312d) obj14).f28896t, 500L, new g(21));
            Object obj15 = this.f11453m;
            o.b(((AbstractC1312d) (obj15 != null ? obj15 : null)).f28895s);
            return;
        }
        if (!getIntent().getBooleanExtra("DEACTIVATE_ACCOUNT", false)) {
            Object obj16 = this.f11453m;
            ((AbstractC1312d) (obj16 != null ? obj16 : null)).f28896t.setVisibility(0);
            return;
        }
        Object obj17 = this.f11453m;
        if (obj17 == null) {
            obj17 = null;
        }
        ((AbstractC1312d) obj17).f28893q.setVisibility(0);
        Object obj18 = this.f11453m;
        if (obj18 == null) {
            obj18 = null;
        }
        ((AbstractC1312d) obj18).f28896t.setVisibility(4);
        Object obj19 = this.f11453m;
        o.c(((AbstractC1312d) (obj19 != null ? obj19 : null)).f28896t, 500L, new g(20));
    }

    public final void H(BaseActivity.VibrateType vibrateType) {
        VibrationEffect createOneShot;
        Vibrator vibrator = (Vibrator) getSystemService("vibrator");
        if (Build.VERSION.SDK_INT >= 29) {
            int ordinal = vibrateType.ordinal();
            if (ordinal == 0) {
                createOneShot = VibrationEffect.createOneShot(1000L, -1);
            } else if (ordinal == 1) {
                createOneShot = VibrationEffect.createPredefined(0);
            } else if (ordinal == 2) {
                createOneShot = VibrationEffect.createPredefined(1);
            } else if (ordinal == 3) {
                createOneShot = VibrationEffect.createPredefined(2);
            } else {
                if (ordinal != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                createOneShot = VibrationEffect.createPredefined(5);
            }
            vibrator.cancel();
            vibrator.vibrate(createOneShot);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.luminary.business.presentation.ui.base.BaseActivity, androidx.fragment.app.ActivityC0533g, androidx.activity.ComponentActivity, j0.ActivityC0879h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object obj;
        this.f11451k = C();
        super.onCreate(bundle);
        getOnBackPressedDispatcher().b(this.f11432x);
        Intent intent = getIntent();
        if (Build.VERSION.SDK_INT >= 33) {
            obj = intent.getSerializableExtra("IS_SETUP", Boolean.class);
        } else {
            Object serializableExtra = intent.getSerializableExtra("IS_SETUP");
            if (!(serializableExtra instanceof Boolean)) {
                serializableExtra = null;
            }
            obj = (Boolean) serializableExtra;
        }
        Boolean bool = (Boolean) obj;
        this.f11427s = bool != null ? bool.booleanValue() : false;
        E();
        Object obj2 = this.f11453m;
        if (obj2 == null) {
            obj2 = null;
        }
        o.c(((AbstractC1312d) obj2).f28892p, 500L, new C1646a(this, 1));
        Object obj3 = this.f11453m;
        if (obj3 == null) {
            obj3 = null;
        }
        o.c(((AbstractC1312d) obj3).f28902z, 0L, new C1646a(this, 2));
        Object obj4 = this.f11453m;
        if (obj4 == null) {
            obj4 = null;
        }
        o.c(((AbstractC1312d) obj4).f28880A, 0L, new C1646a(this, 3));
        Object obj5 = this.f11453m;
        if (obj5 == null) {
            obj5 = null;
        }
        o.c(((AbstractC1312d) obj5).f28881B, 0L, new C1646a(this, 4));
        Object obj6 = this.f11453m;
        if (obj6 == null) {
            obj6 = null;
        }
        o.c(((AbstractC1312d) obj6).f28882C, 0L, new C1646a(this, 5));
        Object obj7 = this.f11453m;
        if (obj7 == null) {
            obj7 = null;
        }
        o.c(((AbstractC1312d) obj7).f28883D, 0L, new C1646a(this, 6));
        Object obj8 = this.f11453m;
        if (obj8 == null) {
            obj8 = null;
        }
        o.c(((AbstractC1312d) obj8).f28884E, 0L, new C1646a(this, 7));
        Object obj9 = this.f11453m;
        if (obj9 == null) {
            obj9 = null;
        }
        o.c(((AbstractC1312d) obj9).f28885F, 0L, new C1646a(this, 8));
        Object obj10 = this.f11453m;
        if (obj10 == null) {
            obj10 = null;
        }
        o.c(((AbstractC1312d) obj10).f28886G, 0L, new C1646a(this, 9));
        Object obj11 = this.f11453m;
        if (obj11 == null) {
            obj11 = null;
        }
        o.c(((AbstractC1312d) obj11).f28887H, 0L, new C1646a(this, 14));
        Object obj12 = this.f11453m;
        if (obj12 == null) {
            obj12 = null;
        }
        o.c(((AbstractC1312d) obj12).f28888I, 0L, new C1646a(this, 15));
        Object obj13 = this.f11453m;
        if (obj13 == null) {
            obj13 = null;
        }
        o.c(((AbstractC1312d) obj13).f28890n, 0L, new C1646a(this, 16));
        Object obj14 = this.f11453m;
        if (obj14 == null) {
            obj14 = null;
        }
        o.c(((AbstractC1312d) obj14).f28895s, 500L, new g(22));
        Object obj15 = this.f11453m;
        if (obj15 == null) {
            obj15 = null;
        }
        o.c(((AbstractC1312d) obj15).f28896t, 500L, new C1646a(this, 17));
        Object obj16 = this.f11453m;
        if (obj16 == null) {
            obj16 = null;
        }
        o.c(((AbstractC1312d) obj16).f28893q, 500L, new C1646a(this, 0));
        Object obj17 = this.f11453m;
        o.c(((AbstractC1312d) (obj17 != null ? obj17 : null)).f28891o, 500L, new InterfaceC0635a() { // from class: com.luminary.business.presentation.ui.activity.passcode.a
            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                PasscodeActivity passcodeActivity = PasscodeActivity.this;
                if (passcodeActivity.f11431w == PasscodeActivity.NewSteps.f11437d) {
                    passcodeActivity.B(false);
                }
                return p.f3034a;
            }
        });
        this.f11431w = this.f11427s ? NewSteps.f11434a : !C().f31331U0.B() ? NewSteps.f11435b : NewSteps.f11437d;
        G();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseActivity
    public final int t() {
        return this.f11424p;
    }

    /* compiled from: PasscodeActivity.kt */
    public static final class b extends AbstractC0618i {
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
