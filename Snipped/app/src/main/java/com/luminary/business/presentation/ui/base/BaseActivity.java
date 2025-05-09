package com.luminary.business.presentation.ui.base;

import A8.b;
import B6.i;
import B6.j;
import D8.a;
import F0.f;
import F8.o;
import K8.a;
import O9.p;
import android.R;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBinderMapperImpl;
import androidx.lifecycle.A;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.luminary.business.presentation.ui.base.BaseActivity;
import com.luminary.business.presentation.ui.views.toolbar.CustomToolbarView;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.business.presentation.utils.bottomDialog.BottomDialogType;
import h.ActivityC0775b;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.h;

/* compiled from: BaseActivity.kt */
/* loaded from: classes2.dex */
public abstract class BaseActivity<V extends f> extends ActivityC0775b {
    public final O9.f i;

    /* renamed from: j, reason: collision with root package name */
    public final O9.f f11450j;

    /* renamed from: k, reason: collision with root package name */
    public i f11451k;

    /* renamed from: l, reason: collision with root package name */
    public int f11452l;

    /* renamed from: m, reason: collision with root package name */
    public V f11453m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f11454n;

    /* renamed from: o, reason: collision with root package name */
    public B6.a f11455o;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BaseActivity.kt */
    public static final class VibrateType {

        /* renamed from: a, reason: collision with root package name */
        public static final VibrateType f11459a;

        /* renamed from: b, reason: collision with root package name */
        public static final VibrateType f11460b;

        /* renamed from: c, reason: collision with root package name */
        public static final VibrateType f11461c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ VibrateType[] f11462d;

        static {
            VibrateType vibrateType = new VibrateType("DEFAULT_AMPLITUDE", 0);
            f11459a = vibrateType;
            VibrateType vibrateType2 = new VibrateType("EFFECT_CLICK", 1);
            f11460b = vibrateType2;
            VibrateType vibrateType3 = new VibrateType("EFFECT_DOUBLE_CLICK", 2);
            VibrateType vibrateType4 = new VibrateType("EFFECT_HEAVY_CLICK", 3);
            VibrateType vibrateType5 = new VibrateType("EFFECT_TICK", 4);
            f11461c = vibrateType5;
            f11462d = new VibrateType[]{vibrateType, vibrateType2, vibrateType3, vibrateType4, vibrateType5};
        }

        public VibrateType() {
            throw null;
        }

        public static VibrateType valueOf(String str) {
            return (VibrateType) Enum.valueOf(VibrateType.class, str);
        }

        public static VibrateType[] values() {
            return (VibrateType[]) f11462d.clone();
        }
    }

    /* compiled from: BaseActivity.kt */
    public static final class a implements A, d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f11463a;

        public a(InterfaceC0646l interfaceC0646l) {
            this.f11463a = interfaceC0646l;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof d)) {
                return kotlin.jvm.internal.f.b(getFunctionDelegate(), ((d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f11463a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f11463a.invoke(obj);
        }
    }

    public BaseActivity() {
        final b bVar = new b(this, 1);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f23085a;
        this.i = kotlin.a.b(lazyThreadSafetyMode, new InterfaceC0635a<K8.a>() { // from class: com.luminary.business.presentation.ui.base.BaseActivity$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [K8.a, java.lang.Object] */
            @Override // ca.InterfaceC0635a
            public final a invoke() {
                return U4.b.l(this).a(bVar, null, h.a(a.class));
            }
        });
        this.f11450j = kotlin.a.b(lazyThreadSafetyMode, new InterfaceC0635a<D8.a>() { // from class: com.luminary.business.presentation.ui.base.BaseActivity$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [D8.a, java.lang.Object] */
            @Override // ca.InterfaceC0635a
            public final D8.a invoke() {
                return U4.b.l(this).a(null, null, h.a(D8.a.class));
            }
        });
        this.f11452l = 40;
        this.f11454n = true;
    }

    @Override // androidx.fragment.app.ActivityC0533g, androidx.activity.ComponentActivity, j0.ActivityC0879h, android.app.Activity
    public void onCreate(Bundle bundle) {
        J8.d dVar;
        J8.d<p> dVar2;
        J8.d<p> dVar3;
        j jVar;
        final int i = 0;
        super.onCreate(bundle);
        int t3 = t();
        DataBinderMapperImpl dataBinderMapperImpl = F0.d.f1140a;
        setContentView(t3);
        this.f11453m = (V) F0.d.a(null, (ViewGroup) getWindow().getDecorView().findViewById(R.id.content), 0, t3);
        i iVar = this.f11451k;
        if (iVar != null && (jVar = (j) iVar.f427k.getValue()) != null) {
            jVar.observe(this, new a(new InterfaceC0646l(this) { // from class: B6.c

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ BaseActivity f399b;

                {
                    this.f399b = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r4v2, types: [T, android.view.View] */
                @Override // ca.InterfaceC0646l
                public final Object invoke(Object obj) {
                    i iVar2;
                    j jVar2;
                    J8.d dVar4;
                    switch (i) {
                        case 0:
                            Boolean bool = (Boolean) obj;
                            if (bool != null) {
                                boolean booleanValue = bool.booleanValue();
                                BaseActivity baseActivity = this.f399b;
                                F0.f fVar = baseActivity.f11453m;
                                if (fVar == null) {
                                    fVar = null;
                                }
                                LinearLayout linearLayout = (LinearLayout) fVar.f1148d.findViewById(com.luminary.mobile.R.id.llRootStatus);
                                if (linearLayout != null) {
                                    F0.f fVar2 = baseActivity.f11453m;
                                    if (fVar2 == null) {
                                        fVar2 = null;
                                    }
                                    ((FrameLayout) fVar2.f1148d).removeView(linearLayout);
                                }
                                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                                ref$ObjectRef.f23179a = LayoutInflater.from(baseActivity).inflate(com.luminary.mobile.R.layout.view_inet_status, (ViewGroup) null);
                                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                                float f10 = 20;
                                layoutParams.setMargins(U4.b.C(Resources.getSystem().getDisplayMetrics().density * f10), U4.b.C(baseActivity.f11452l * Resources.getSystem().getDisplayMetrics().density), U4.b.C(f10 * Resources.getSystem().getDisplayMetrics().density), ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                                ((View) ref$ObjectRef.f23179a).setLayoutParams(layoutParams);
                                ((ImageView) ((View) ref$ObjectRef.f23179a).findViewById(com.luminary.mobile.R.id.ivStatus)).setImageResource(booleanValue ? com.luminary.mobile.R.drawable.ic_connection_restored : com.luminary.mobile.R.drawable.ic_connection_lost);
                                ((TextView) ((View) ref$ObjectRef.f23179a).findViewById(com.luminary.mobile.R.id.tvTitle)).setText(booleanValue ? com.luminary.mobile.R.string.connection_restored : com.luminary.mobile.R.string.no_internet_connection);
                                o.c(((View) ref$ObjectRef.f23179a).findViewById(com.luminary.mobile.R.id.ivClose), 500L, new A7.c(2, baseActivity, ref$ObjectRef));
                                if (booleanValue) {
                                    ((View) ref$ObjectRef.f23179a).postDelayed(new d(0, baseActivity, ref$ObjectRef), 3000L);
                                }
                                F0.f fVar3 = baseActivity.f11453m;
                                if (fVar3 == null) {
                                    fVar3 = null;
                                }
                                ((FrameLayout) fVar3.f1148d).addView((View) ref$ObjectRef.f23179a);
                                if (bool.booleanValue() && (iVar2 = baseActivity.f11451k) != null && (jVar2 = (j) iVar2.f427k.getValue()) != null) {
                                    jVar2.postValue(null);
                                }
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            ((K8.a) this.f399b.i.getValue()).a();
                            break;
                        case 2:
                            ((K8.a) this.f399b.i.getValue()).c();
                            break;
                        default:
                            String str = (String) obj;
                            if (str != null) {
                                BaseActivity baseActivity2 = this.f399b;
                                baseActivity2.x(str);
                                i iVar3 = baseActivity2.f11451k;
                                if (iVar3 != null && (dVar4 = iVar3.f417I0) != null) {
                                    dVar4.postValue(null);
                                }
                                break;
                            } else {
                                break;
                            }
                            break;
                    }
                    return p.f3034a;
                }
            }));
        }
        i iVar2 = this.f11451k;
        if (iVar2 != null && (dVar3 = iVar2.f415G0) != null) {
            final int i9 = 1;
            dVar3.observe(this, new a(new InterfaceC0646l(this) { // from class: B6.c

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ BaseActivity f399b;

                {
                    this.f399b = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r4v2, types: [T, android.view.View] */
                @Override // ca.InterfaceC0646l
                public final Object invoke(Object obj) {
                    i iVar22;
                    j jVar2;
                    J8.d dVar4;
                    switch (i9) {
                        case 0:
                            Boolean bool = (Boolean) obj;
                            if (bool != null) {
                                boolean booleanValue = bool.booleanValue();
                                BaseActivity baseActivity = this.f399b;
                                F0.f fVar = baseActivity.f11453m;
                                if (fVar == null) {
                                    fVar = null;
                                }
                                LinearLayout linearLayout = (LinearLayout) fVar.f1148d.findViewById(com.luminary.mobile.R.id.llRootStatus);
                                if (linearLayout != null) {
                                    F0.f fVar2 = baseActivity.f11453m;
                                    if (fVar2 == null) {
                                        fVar2 = null;
                                    }
                                    ((FrameLayout) fVar2.f1148d).removeView(linearLayout);
                                }
                                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                                ref$ObjectRef.f23179a = LayoutInflater.from(baseActivity).inflate(com.luminary.mobile.R.layout.view_inet_status, (ViewGroup) null);
                                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                                float f10 = 20;
                                layoutParams.setMargins(U4.b.C(Resources.getSystem().getDisplayMetrics().density * f10), U4.b.C(baseActivity.f11452l * Resources.getSystem().getDisplayMetrics().density), U4.b.C(f10 * Resources.getSystem().getDisplayMetrics().density), ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                                ((View) ref$ObjectRef.f23179a).setLayoutParams(layoutParams);
                                ((ImageView) ((View) ref$ObjectRef.f23179a).findViewById(com.luminary.mobile.R.id.ivStatus)).setImageResource(booleanValue ? com.luminary.mobile.R.drawable.ic_connection_restored : com.luminary.mobile.R.drawable.ic_connection_lost);
                                ((TextView) ((View) ref$ObjectRef.f23179a).findViewById(com.luminary.mobile.R.id.tvTitle)).setText(booleanValue ? com.luminary.mobile.R.string.connection_restored : com.luminary.mobile.R.string.no_internet_connection);
                                o.c(((View) ref$ObjectRef.f23179a).findViewById(com.luminary.mobile.R.id.ivClose), 500L, new A7.c(2, baseActivity, ref$ObjectRef));
                                if (booleanValue) {
                                    ((View) ref$ObjectRef.f23179a).postDelayed(new d(0, baseActivity, ref$ObjectRef), 3000L);
                                }
                                F0.f fVar3 = baseActivity.f11453m;
                                if (fVar3 == null) {
                                    fVar3 = null;
                                }
                                ((FrameLayout) fVar3.f1148d).addView((View) ref$ObjectRef.f23179a);
                                if (bool.booleanValue() && (iVar22 = baseActivity.f11451k) != null && (jVar2 = (j) iVar22.f427k.getValue()) != null) {
                                    jVar2.postValue(null);
                                }
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            ((K8.a) this.f399b.i.getValue()).a();
                            break;
                        case 2:
                            ((K8.a) this.f399b.i.getValue()).c();
                            break;
                        default:
                            String str = (String) obj;
                            if (str != null) {
                                BaseActivity baseActivity2 = this.f399b;
                                baseActivity2.x(str);
                                i iVar3 = baseActivity2.f11451k;
                                if (iVar3 != null && (dVar4 = iVar3.f417I0) != null) {
                                    dVar4.postValue(null);
                                }
                                break;
                            } else {
                                break;
                            }
                            break;
                    }
                    return p.f3034a;
                }
            }));
        }
        i iVar3 = this.f11451k;
        if (iVar3 != null && (dVar2 = iVar3.f416H0) != null) {
            final int i10 = 2;
            dVar2.observe(this, new a(new InterfaceC0646l(this) { // from class: B6.c

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ BaseActivity f399b;

                {
                    this.f399b = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r4v2, types: [T, android.view.View] */
                @Override // ca.InterfaceC0646l
                public final Object invoke(Object obj) {
                    i iVar22;
                    j jVar2;
                    J8.d dVar4;
                    switch (i10) {
                        case 0:
                            Boolean bool = (Boolean) obj;
                            if (bool != null) {
                                boolean booleanValue = bool.booleanValue();
                                BaseActivity baseActivity = this.f399b;
                                F0.f fVar = baseActivity.f11453m;
                                if (fVar == null) {
                                    fVar = null;
                                }
                                LinearLayout linearLayout = (LinearLayout) fVar.f1148d.findViewById(com.luminary.mobile.R.id.llRootStatus);
                                if (linearLayout != null) {
                                    F0.f fVar2 = baseActivity.f11453m;
                                    if (fVar2 == null) {
                                        fVar2 = null;
                                    }
                                    ((FrameLayout) fVar2.f1148d).removeView(linearLayout);
                                }
                                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                                ref$ObjectRef.f23179a = LayoutInflater.from(baseActivity).inflate(com.luminary.mobile.R.layout.view_inet_status, (ViewGroup) null);
                                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                                float f10 = 20;
                                layoutParams.setMargins(U4.b.C(Resources.getSystem().getDisplayMetrics().density * f10), U4.b.C(baseActivity.f11452l * Resources.getSystem().getDisplayMetrics().density), U4.b.C(f10 * Resources.getSystem().getDisplayMetrics().density), ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                                ((View) ref$ObjectRef.f23179a).setLayoutParams(layoutParams);
                                ((ImageView) ((View) ref$ObjectRef.f23179a).findViewById(com.luminary.mobile.R.id.ivStatus)).setImageResource(booleanValue ? com.luminary.mobile.R.drawable.ic_connection_restored : com.luminary.mobile.R.drawable.ic_connection_lost);
                                ((TextView) ((View) ref$ObjectRef.f23179a).findViewById(com.luminary.mobile.R.id.tvTitle)).setText(booleanValue ? com.luminary.mobile.R.string.connection_restored : com.luminary.mobile.R.string.no_internet_connection);
                                o.c(((View) ref$ObjectRef.f23179a).findViewById(com.luminary.mobile.R.id.ivClose), 500L, new A7.c(2, baseActivity, ref$ObjectRef));
                                if (booleanValue) {
                                    ((View) ref$ObjectRef.f23179a).postDelayed(new d(0, baseActivity, ref$ObjectRef), 3000L);
                                }
                                F0.f fVar3 = baseActivity.f11453m;
                                if (fVar3 == null) {
                                    fVar3 = null;
                                }
                                ((FrameLayout) fVar3.f1148d).addView((View) ref$ObjectRef.f23179a);
                                if (bool.booleanValue() && (iVar22 = baseActivity.f11451k) != null && (jVar2 = (j) iVar22.f427k.getValue()) != null) {
                                    jVar2.postValue(null);
                                }
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            ((K8.a) this.f399b.i.getValue()).a();
                            break;
                        case 2:
                            ((K8.a) this.f399b.i.getValue()).c();
                            break;
                        default:
                            String str = (String) obj;
                            if (str != null) {
                                BaseActivity baseActivity2 = this.f399b;
                                baseActivity2.x(str);
                                i iVar32 = baseActivity2.f11451k;
                                if (iVar32 != null && (dVar4 = iVar32.f417I0) != null) {
                                    dVar4.postValue(null);
                                }
                                break;
                            } else {
                                break;
                            }
                            break;
                    }
                    return p.f3034a;
                }
            }));
        }
        i iVar4 = this.f11451k;
        if (iVar4 == null || (dVar = iVar4.f417I0) == null) {
            return;
        }
        final int i11 = 3;
        dVar.observe(this, new a(new InterfaceC0646l(this) { // from class: B6.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BaseActivity f399b;

            {
                this.f399b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v2, types: [T, android.view.View] */
            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                i iVar22;
                j jVar2;
                J8.d dVar4;
                switch (i11) {
                    case 0:
                        Boolean bool = (Boolean) obj;
                        if (bool != null) {
                            boolean booleanValue = bool.booleanValue();
                            BaseActivity baseActivity = this.f399b;
                            F0.f fVar = baseActivity.f11453m;
                            if (fVar == null) {
                                fVar = null;
                            }
                            LinearLayout linearLayout = (LinearLayout) fVar.f1148d.findViewById(com.luminary.mobile.R.id.llRootStatus);
                            if (linearLayout != null) {
                                F0.f fVar2 = baseActivity.f11453m;
                                if (fVar2 == null) {
                                    fVar2 = null;
                                }
                                ((FrameLayout) fVar2.f1148d).removeView(linearLayout);
                            }
                            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                            ref$ObjectRef.f23179a = LayoutInflater.from(baseActivity).inflate(com.luminary.mobile.R.layout.view_inet_status, (ViewGroup) null);
                            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                            float f10 = 20;
                            layoutParams.setMargins(U4.b.C(Resources.getSystem().getDisplayMetrics().density * f10), U4.b.C(baseActivity.f11452l * Resources.getSystem().getDisplayMetrics().density), U4.b.C(f10 * Resources.getSystem().getDisplayMetrics().density), ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                            ((View) ref$ObjectRef.f23179a).setLayoutParams(layoutParams);
                            ((ImageView) ((View) ref$ObjectRef.f23179a).findViewById(com.luminary.mobile.R.id.ivStatus)).setImageResource(booleanValue ? com.luminary.mobile.R.drawable.ic_connection_restored : com.luminary.mobile.R.drawable.ic_connection_lost);
                            ((TextView) ((View) ref$ObjectRef.f23179a).findViewById(com.luminary.mobile.R.id.tvTitle)).setText(booleanValue ? com.luminary.mobile.R.string.connection_restored : com.luminary.mobile.R.string.no_internet_connection);
                            o.c(((View) ref$ObjectRef.f23179a).findViewById(com.luminary.mobile.R.id.ivClose), 500L, new A7.c(2, baseActivity, ref$ObjectRef));
                            if (booleanValue) {
                                ((View) ref$ObjectRef.f23179a).postDelayed(new d(0, baseActivity, ref$ObjectRef), 3000L);
                            }
                            F0.f fVar3 = baseActivity.f11453m;
                            if (fVar3 == null) {
                                fVar3 = null;
                            }
                            ((FrameLayout) fVar3.f1148d).addView((View) ref$ObjectRef.f23179a);
                            if (bool.booleanValue() && (iVar22 = baseActivity.f11451k) != null && (jVar2 = (j) iVar22.f427k.getValue()) != null) {
                                jVar2.postValue(null);
                            }
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        ((K8.a) this.f399b.i.getValue()).a();
                        break;
                    case 2:
                        ((K8.a) this.f399b.i.getValue()).c();
                        break;
                    default:
                        String str = (String) obj;
                        if (str != null) {
                            BaseActivity baseActivity2 = this.f399b;
                            baseActivity2.x(str);
                            i iVar32 = baseActivity2.f11451k;
                            if (iVar32 != null && (dVar4 = iVar32.f417I0) != null) {
                                dVar4.postValue(null);
                            }
                            break;
                        } else {
                            break;
                        }
                        break;
                }
                return p.f3034a;
            }
        }));
    }

    @Override // h.ActivityC0775b, androidx.fragment.app.ActivityC0533g, android.app.Activity
    public final void onDestroy() {
        ((K8.a) this.i.getValue()).b();
        super.onDestroy();
    }

    @Override // h.ActivityC0775b, androidx.fragment.app.ActivityC0533g, android.app.Activity
    public void onStart() {
        super.onStart();
        ((D8.a) this.f11450j.getValue()).b(this);
    }

    public abstract void s();

    public abstract int t();

    public abstract void u(String str);

    public abstract void v(int i);

    public abstract void w();

    public final void x(String str) {
        NetworkInfo activeNetworkInfo;
        NetworkCapabilities networkCapabilities;
        BottomDialogType.f13289k.getClass();
        BottomDialogType b9 = BottomDialogType.a.b();
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService("connectivity");
        if (Build.VERSION.SDK_INT < 29 ? (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected() : (networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())) == null || !(networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(3))) {
            b9.f13295a = getString(com.luminary.mobile.R.string.could_not_connect_to_the_server);
        } else {
            b9.f13296b = str;
        }
        a.C0010a.a((D8.a) this.f11450j.getValue(), b9, null, 6);
    }

    public abstract void y();

    public abstract void z(ToolbarStatus toolbarStatus, CustomToolbarView.State state);
}
