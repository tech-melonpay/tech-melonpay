package com.luminary.business.presentation.ui.activity.splash;

import A6.c;
import O9.f;
import O9.p;
import P9.s;
import U4.b;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import androidx.lifecycle.A;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.luminary.business.presentation.ui.activity.ErrorActivity;
import com.luminary.business.presentation.ui.activity.main.MainActivity;
import com.luminary.business.presentation.ui.activity.splash.SplashActivity;
import com.luminary.business.presentation.ui.base.BaseActivity;
import com.luminary.business.presentation.ui.views.toolbar.CustomToolbarView;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.mobile.R;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import ka.C0969n;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.h;
import t6.AbstractC1296b;

/* compiled from: SplashActivity.kt */
/* loaded from: classes2.dex */
public final class SplashActivity extends BaseActivity<AbstractC1296b> {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f11443r = 0;

    /* renamed from: p, reason: collision with root package name */
    public final int f11444p = R.layout.activity_splash;

    /* renamed from: q, reason: collision with root package name */
    public final f f11445q = kotlin.a.b(LazyThreadSafetyMode.f23085a, new InterfaceC0635a<c>() { // from class: com.luminary.business.presentation.ui.activity.splash.SplashActivity$special$$inlined$inject$default$1
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [A6.c, java.lang.Object] */
        @Override // ca.InterfaceC0635a
        public final c invoke() {
            return b.l(this).a(null, null, h.a(c.class));
        }
    });

    /* compiled from: SplashActivity.kt */
    public static final class a implements A, d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f11447a;

        public a(InterfaceC0646l interfaceC0646l) {
            this.f11447a = interfaceC0646l;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof d)) {
                return kotlin.jvm.internal.f.b(getFunctionDelegate(), ((d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f11447a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f11447a.invoke(obj);
        }
    }

    public final c A() {
        return (c) this.f11445q.getValue();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseActivity, androidx.fragment.app.ActivityC0533g, androidx.activity.ComponentActivity, j0.ActivityC0879h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        File[] listFiles;
        this.f11451k = A();
        super.onCreate(bundle);
        A().getClass();
        File file = new File(getFilesDir().getAbsolutePath(), "Statements");
        if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null && listFiles.length != 0) {
            for (File file2 : file.listFiles()) {
                file2.delete();
            }
        }
        final int i = 0;
        A().f100X0.observe(this, new a(new InterfaceC0646l(this) { // from class: A6.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SplashActivity f93b;

            {
                this.f93b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                final SplashActivity splashActivity = this.f93b;
                switch (i) {
                    case 0:
                        int i9 = SplashActivity.f11443r;
                        splashActivity.getClass();
                        splashActivity.startActivity(new Intent(splashActivity, (Class<?>) MainActivity.class));
                        splashActivity.finish();
                        break;
                    case 1:
                        final String str = (String) obj;
                        int i10 = SplashActivity.f11443r;
                        splashActivity.getClass();
                        m8.b bVar = new m8.b(splashActivity);
                        bVar.f24015r = new InterfaceC0635a() { // from class: com.luminary.business.presentation.ui.activity.splash.a
                            @Override // ca.InterfaceC0635a
                            public final Object invoke() {
                                int i11 = SplashActivity.f11443r;
                                SplashActivity splashActivity2 = SplashActivity.this;
                                SplashActivity$showUpdateDialog$1$1 splashActivity$showUpdateDialog$1$1 = new SplashActivity$showUpdateDialog$1$1(0, splashActivity2, SplashActivity.class, "showInfoDialog", "showInfoDialog()V", 0);
                                splashActivity2.getClass();
                                String str2 = str;
                                if (str2 != null && str2.length() != 0) {
                                    try {
                                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str2));
                                        List<ResolveInfo> queryIntentActivities = splashActivity2.getApplicationContext().getPackageManager().queryIntentActivities(intent, 0);
                                        ArrayList arrayList = new ArrayList();
                                        for (Object obj2 : queryIntentActivities) {
                                            if (!C0969n.Y(((ResolveInfo) obj2).activityInfo.packageName, "com.opay.webview", true)) {
                                                arrayList.add(obj2);
                                            }
                                        }
                                        intent.setPackage(((ResolveInfo) s.J(arrayList)).activityInfo.packageName);
                                        splashActivity2.startActivity(intent);
                                    } catch (Exception unused) {
                                        splashActivity$showUpdateDialog$1$1.invoke();
                                    }
                                }
                                return p.f3034a;
                            }
                        };
                        bVar.show();
                        break;
                    default:
                        int i11 = SplashActivity.f11443r;
                        splashActivity.getClass();
                        splashActivity.startActivity(new Intent(splashActivity, (Class<?>) ErrorActivity.class));
                        break;
                }
                return p.f3034a;
            }
        }));
        final int i9 = 1;
        A().f101Y0.observe(this, new a(new InterfaceC0646l(this) { // from class: A6.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SplashActivity f93b;

            {
                this.f93b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                final SplashActivity splashActivity = this.f93b;
                switch (i9) {
                    case 0:
                        int i92 = SplashActivity.f11443r;
                        splashActivity.getClass();
                        splashActivity.startActivity(new Intent(splashActivity, (Class<?>) MainActivity.class));
                        splashActivity.finish();
                        break;
                    case 1:
                        final String str = (String) obj;
                        int i10 = SplashActivity.f11443r;
                        splashActivity.getClass();
                        m8.b bVar = new m8.b(splashActivity);
                        bVar.f24015r = new InterfaceC0635a() { // from class: com.luminary.business.presentation.ui.activity.splash.a
                            @Override // ca.InterfaceC0635a
                            public final Object invoke() {
                                int i11 = SplashActivity.f11443r;
                                SplashActivity splashActivity2 = SplashActivity.this;
                                SplashActivity$showUpdateDialog$1$1 splashActivity$showUpdateDialog$1$1 = new SplashActivity$showUpdateDialog$1$1(0, splashActivity2, SplashActivity.class, "showInfoDialog", "showInfoDialog()V", 0);
                                splashActivity2.getClass();
                                String str2 = str;
                                if (str2 != null && str2.length() != 0) {
                                    try {
                                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str2));
                                        List<ResolveInfo> queryIntentActivities = splashActivity2.getApplicationContext().getPackageManager().queryIntentActivities(intent, 0);
                                        ArrayList arrayList = new ArrayList();
                                        for (Object obj2 : queryIntentActivities) {
                                            if (!C0969n.Y(((ResolveInfo) obj2).activityInfo.packageName, "com.opay.webview", true)) {
                                                arrayList.add(obj2);
                                            }
                                        }
                                        intent.setPackage(((ResolveInfo) s.J(arrayList)).activityInfo.packageName);
                                        splashActivity2.startActivity(intent);
                                    } catch (Exception unused) {
                                        splashActivity$showUpdateDialog$1$1.invoke();
                                    }
                                }
                                return p.f3034a;
                            }
                        };
                        bVar.show();
                        break;
                    default:
                        int i11 = SplashActivity.f11443r;
                        splashActivity.getClass();
                        splashActivity.startActivity(new Intent(splashActivity, (Class<?>) ErrorActivity.class));
                        break;
                }
                return p.f3034a;
            }
        }));
        final int i10 = 2;
        A().f410B0.observe(this, new a(new InterfaceC0646l(this) { // from class: A6.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SplashActivity f93b;

            {
                this.f93b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                final SplashActivity splashActivity = this.f93b;
                switch (i10) {
                    case 0:
                        int i92 = SplashActivity.f11443r;
                        splashActivity.getClass();
                        splashActivity.startActivity(new Intent(splashActivity, (Class<?>) MainActivity.class));
                        splashActivity.finish();
                        break;
                    case 1:
                        final String str = (String) obj;
                        int i102 = SplashActivity.f11443r;
                        splashActivity.getClass();
                        m8.b bVar = new m8.b(splashActivity);
                        bVar.f24015r = new InterfaceC0635a() { // from class: com.luminary.business.presentation.ui.activity.splash.a
                            @Override // ca.InterfaceC0635a
                            public final Object invoke() {
                                int i11 = SplashActivity.f11443r;
                                SplashActivity splashActivity2 = SplashActivity.this;
                                SplashActivity$showUpdateDialog$1$1 splashActivity$showUpdateDialog$1$1 = new SplashActivity$showUpdateDialog$1$1(0, splashActivity2, SplashActivity.class, "showInfoDialog", "showInfoDialog()V", 0);
                                splashActivity2.getClass();
                                String str2 = str;
                                if (str2 != null && str2.length() != 0) {
                                    try {
                                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str2));
                                        List<ResolveInfo> queryIntentActivities = splashActivity2.getApplicationContext().getPackageManager().queryIntentActivities(intent, 0);
                                        ArrayList arrayList = new ArrayList();
                                        for (Object obj2 : queryIntentActivities) {
                                            if (!C0969n.Y(((ResolveInfo) obj2).activityInfo.packageName, "com.opay.webview", true)) {
                                                arrayList.add(obj2);
                                            }
                                        }
                                        intent.setPackage(((ResolveInfo) s.J(arrayList)).activityInfo.packageName);
                                        splashActivity2.startActivity(intent);
                                    } catch (Exception unused) {
                                        splashActivity$showUpdateDialog$1$1.invoke();
                                    }
                                }
                                return p.f3034a;
                            }
                        };
                        bVar.show();
                        break;
                    default:
                        int i11 = SplashActivity.f11443r;
                        splashActivity.getClass();
                        splashActivity.startActivity(new Intent(splashActivity, (Class<?>) ErrorActivity.class));
                        break;
                }
                return p.f3034a;
            }
        }));
    }

    @Override // androidx.fragment.app.ActivityC0533g, android.app.Activity
    public final void onResume() {
        super.onResume();
        c A10 = A();
        A10.getClass();
        A10.f96T0.a(new A6.b(A10, 0), "https://api8d9t8.luminaryinc.com/cdn/versions.json");
    }

    @Override // com.luminary.business.presentation.ui.base.BaseActivity
    public final int t() {
        return this.f11444p;
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
