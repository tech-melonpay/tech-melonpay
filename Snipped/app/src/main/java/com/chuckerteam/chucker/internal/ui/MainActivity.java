package com.chuckerteam.chucker.internal.ui;

import O9.p;
import S1.j;
import U1.e;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.LongSparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.appcompat.widget.SearchView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.A;
import androidx.lifecycle.C0552s;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.recyclerview.widget.C0567e;
import androidx.recyclerview.widget.D;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RunnableC0566d;
import androidx.recyclerview.widget.r;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.chuckerteam.chucker.internal.ui.MainActivity;
import com.chuckerteam.chucker.internal.ui.transaction.TransactionActivity;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.google.android.material.snackbar.g;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.luminary.mobile.R;
import e.AbstractC0704c;
import e.InterfaceC0702a;
import f.C0729b;
import f.g;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import k0.C0913a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import l0.C0975a;
import q0.InterfaceMenuC1128a;

/* compiled from: MainActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/chuckerteam/chucker/internal/ui/MainActivity;", "LT1/a;", "Landroidx/appcompat/widget/SearchView$k;", "<init>", "()V", "ExportType", "com.github.ChuckerTeam.Chucker.library"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final class MainActivity extends T1.a implements SearchView.k {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f8665o = 0;

    /* renamed from: j, reason: collision with root package name */
    public H1.a f8666j;

    /* renamed from: k, reason: collision with root package name */
    public e f8667k;

    /* renamed from: m, reason: collision with root package name */
    public final AbstractC0704c<String> f8669m;

    /* renamed from: n, reason: collision with root package name */
    public final AbstractC0704c<String> f8670n;
    public final H1.a i = new H1.a(h.a(T1.c.class), new InterfaceC0635a<W>() { // from class: com.chuckerteam.chucker.internal.ui.MainActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        public final W invoke() {
            return ComponentActivity.this.getViewModelStore();
        }
    }, new InterfaceC0635a<T>() { // from class: com.chuckerteam.chucker.internal.ui.MainActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        public final T invoke() {
            return ComponentActivity.this.getDefaultViewModelProviderFactory();
        }
    }, new InterfaceC0635a<R0.a>() { // from class: com.chuckerteam.chucker.internal.ui.MainActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        public final R0.a invoke() {
            return ComponentActivity.this.getDefaultViewModelCreationExtras();
        }
    });

    /* renamed from: l, reason: collision with root package name */
    public final AbstractC0704c<String> f8668l = registerForActivityResult(new g(), new A0.b(this, 16));

    /* compiled from: MainActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/chuckerteam/chucker/internal/ui/MainActivity$ExportType;", "", "com.github.ChuckerTeam.Chucker.library"}, k = 1, mv = {2, 0, 0})
    public enum ExportType {
        TEXT("text/plain"),
        HAR("application/har+json");

        ExportType(String str) {
        }
    }

    /* compiled from: MainActivity.kt */
    public static final class a implements A, d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f8677a;

        public a(T1.b bVar) {
            this.f8677a = bVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof d)) {
                return f.b(getFunctionDelegate(), ((d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f8677a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f8677a.invoke(obj);
        }
    }

    public MainActivity() {
        ExportType exportType = ExportType.TEXT;
        final int i = 0;
        this.f8669m = registerForActivityResult(new C0729b("text/plain"), new InterfaceC0702a(this) { // from class: com.chuckerteam.chucker.internal.ui.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MainActivity f8708b;

            {
                this.f8708b = this;
            }

            @Override // e.InterfaceC0702a
            public final void a(Object obj) {
                MainActivity mainActivity = this.f8708b;
                Uri uri = (Uri) obj;
                switch (i) {
                    case 0:
                        int i9 = MainActivity.f8665o;
                        mainActivity.n(uri, MainActivity.ExportType.TEXT);
                        break;
                    default:
                        int i10 = MainActivity.f8665o;
                        mainActivity.n(uri, MainActivity.ExportType.HAR);
                        break;
                }
            }
        });
        final int i9 = 1;
        this.f8670n = registerForActivityResult(new C0729b("application/har+json"), new InterfaceC0702a(this) { // from class: com.chuckerteam.chucker.internal.ui.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MainActivity f8708b;

            {
                this.f8708b = this;
            }

            @Override // e.InterfaceC0702a
            public final void a(Object obj) {
                MainActivity mainActivity = this.f8708b;
                Uri uri = (Uri) obj;
                switch (i9) {
                    case 0:
                        int i92 = MainActivity.f8665o;
                        mainActivity.n(uri, MainActivity.ExportType.TEXT);
                        break;
                    default:
                        int i10 = MainActivity.f8665o;
                        mainActivity.n(uri, MainActivity.ExportType.HAR);
                        break;
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m(com.chuckerteam.chucker.internal.ui.MainActivity r6, com.chuckerteam.chucker.internal.ui.MainActivity.ExportType r7, T9.a r8) {
        /*
            r6.getClass()
            boolean r0 = r8 instanceof com.chuckerteam.chucker.internal.ui.MainActivity$prepareDataToSave$1
            if (r0 == 0) goto L16
            r0 = r8
            com.chuckerteam.chucker.internal.ui.MainActivity$prepareDataToSave$1 r0 = (com.chuckerteam.chucker.internal.ui.MainActivity$prepareDataToSave$1) r0
            int r1 = r0.f8699y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f8699y = r1
            goto L1b
        L16:
            com.chuckerteam.chucker.internal.ui.MainActivity$prepareDataToSave$1 r0 = new com.chuckerteam.chucker.internal.ui.MainActivity$prepareDataToSave$1
            r0.<init>(r6, r8)
        L1b:
            java.lang.Object r8 = r0.f8697w
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f8699y
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L40
            if (r2 == r3) goto L35
            if (r2 != r4) goto L2d
            kotlin.b.b(r8)
            goto L93
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            java.lang.Object r6 = r0.f8696v
            r7 = r6
            com.chuckerteam.chucker.internal.ui.MainActivity$ExportType r7 = (com.chuckerteam.chucker.internal.ui.MainActivity.ExportType) r7
            com.chuckerteam.chucker.internal.ui.MainActivity r6 = r0.f8695u
            kotlin.b.b(r8)
            goto L64
        L40:
            kotlin.b.b(r8)
            H1.a r8 = r6.i
            java.lang.Object r8 = r8.getValue()
            T1.c r8 = (T1.c) r8
            r0.f8695u = r6
            r0.f8696v = r7
            r0.f8699y = r3
            C.N r8 = Ja.a.f2210a
            if (r8 == 0) goto L95
            java.lang.Object r8 = r8.f535b
            com.chuckerteam.chucker.internal.data.room.ChuckerDatabase r8 = (com.chuckerteam.chucker.internal.data.room.ChuckerDatabase) r8
            R1.a r8 = r8.a()
            java.lang.Object r8 = r8.b(r0)
            if (r8 != r1) goto L64
            goto L94
        L64:
            java.util.List r8 = (java.util.List) r8
            boolean r2 = r8.isEmpty()
            r3 = 0
            if (r2 == 0) goto L7d
            android.content.Context r7 = r6.getApplicationContext()
            r8 = 2132017412(0x7f140104, float:1.9673102E38)
            java.lang.String r7 = r7.getString(r8)
            T1.a.l(r6, r7)
            r1 = r3
            goto L94
        L7d:
            kotlinx.coroutines.CoroutineDispatcher r2 = kotlinx.coroutines.Dispatchers.getIO()
            com.chuckerteam.chucker.internal.ui.MainActivity$prepareDataToSave$2 r5 = new com.chuckerteam.chucker.internal.ui.MainActivity$prepareDataToSave$2
            r5.<init>(r7, r8, r6, r3)
            r0.f8695u = r3
            r0.f8696v = r3
            r0.f8699y = r4
            java.lang.Object r8 = kotlinx.coroutines.BuildersKt.withContext(r2, r5, r0)
            if (r8 != r1) goto L93
            goto L94
        L93:
            r1 = r8
        L94:
            return r1
        L95:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "You can't access the transaction repository if you don't initialize it!"
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chuckerteam.chucker.internal.ui.MainActivity.m(com.chuckerteam.chucker.internal.ui.MainActivity, com.chuckerteam.chucker.internal.ui.MainActivity$ExportType, T9.a):java.lang.Object");
    }

    @Override // androidx.appcompat.widget.SearchView.k
    public final void b(String str) {
        ((T1.c) this.i.getValue()).f3441k.setValue(str);
    }

    public final void n(Uri uri, ExportType exportType) {
        if (uri == null) {
            Toast.makeText(getApplicationContext(), R.string.chucker_save_failed_to_open_document, 0).show();
        } else {
            BuildersKt__Builders_commonKt.launch$default(C0552s.a(this), null, null, new MainActivity$onSaveToFileActivityResult$1(uri, this, exportType, null), 3, null);
        }
    }

    @Override // androidx.appcompat.widget.SearchView.k
    public final boolean n0() {
        return true;
    }

    public final void o(final ExportType exportType) {
        int i;
        int ordinal = exportType.ordinal();
        if (ordinal == 0) {
            i = R.string.chucker_save_text_http_confirmation;
        } else {
            if (ordinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.string.chucker_save_har_http_confirmation;
        }
        String string = getString(R.string.chucker_save);
        String string2 = getString(i);
        String string3 = getString(R.string.chucker_save);
        new E2.b(this).setTitle((CharSequence) string).setMessage((CharSequence) string2).setPositiveButton((CharSequence) string3, (DialogInterface.OnClickListener) new S1.c(0, new InterfaceC0635a() { // from class: com.chuckerteam.chucker.internal.ui.c
            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                int i9 = MainActivity.f8665o;
                int ordinal2 = MainActivity.ExportType.this.ordinal();
                MainActivity mainActivity = this;
                if (ordinal2 == 0) {
                    mainActivity.f8669m.a("transactions.txt");
                } else {
                    if (ordinal2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    mainActivity.f8670n.a("transactions.har");
                }
                return p.f3034a;
            }
        })).setNegativeButton((CharSequence) getString(R.string.chucker_cancel), (DialogInterface.OnClickListener) new S1.c()).show();
    }

    /* JADX WARN: Type inference failed for: r3v10, types: [T1.b] */
    /* JADX WARN: Type inference failed for: r3v22, types: [T1.b] */
    @Override // T1.a, androidx.fragment.app.ActivityC0533g, androidx.activity.ComponentActivity, j0.ActivityC0879h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ViewGroup viewGroup;
        int i = 8;
        final int i9 = 0;
        final int i10 = 1;
        super.onCreate(bundle);
        View inflate = getLayoutInflater().inflate(R.layout.chucker_activity_main, (ViewGroup) null, false);
        int i11 = R.id.appBarLayout;
        if (((AppBarLayout) j3.e.q(R.id.appBarLayout, inflate)) != null) {
            i11 = R.id.toolbar;
            MaterialToolbar materialToolbar = (MaterialToolbar) j3.e.q(R.id.toolbar, inflate);
            if (materialToolbar != null) {
                i11 = R.id.transactionsRecyclerView;
                RecyclerView recyclerView = (RecyclerView) j3.e.q(R.id.transactionsRecyclerView, inflate);
                if (recyclerView != null) {
                    i11 = R.id.tutorialDescription;
                    if (((TextView) j3.e.q(R.id.tutorialDescription, inflate)) != null) {
                        i11 = R.id.tutorialGroup;
                        Group group = (Group) j3.e.q(R.id.tutorialGroup, inflate);
                        if (group != null) {
                            i11 = R.id.tutorialLink;
                            TextView textView = (TextView) j3.e.q(R.id.tutorialLink, inflate);
                            if (textView != null) {
                                i11 = R.id.tutorialTitle;
                                if (((TextView) j3.e.q(R.id.tutorialTitle, inflate)) != null) {
                                    this.f8666j = new H1.a((ConstraintLayout) inflate, materialToolbar, recyclerView, group, textView);
                                    this.f8667k = new e(this, new InterfaceC0646l(this) { // from class: T1.b

                                        /* renamed from: b, reason: collision with root package name */
                                        public final /* synthetic */ MainActivity f3440b;

                                        {
                                            this.f3440b = this;
                                        }

                                        @Override // ca.InterfaceC0646l
                                        public final Object invoke(Object obj) {
                                            MainActivity mainActivity = this.f3440b;
                                            switch (i9) {
                                                case 0:
                                                    long longValue = ((Long) obj).longValue();
                                                    int i12 = MainActivity.f8665o;
                                                    Intent intent = new Intent(mainActivity, (Class<?>) TransactionActivity.class);
                                                    intent.putExtra(FirebaseAnalytics.Param.TRANSACTION_ID, longValue);
                                                    mainActivity.startActivity(intent);
                                                    break;
                                                default:
                                                    List<T> list = (List) obj;
                                                    e eVar = mainActivity.f8667k;
                                                    if (eVar == null) {
                                                        eVar = null;
                                                    }
                                                    C0567e<T> c0567e = eVar.f7410d;
                                                    int i13 = c0567e.f7633g + 1;
                                                    c0567e.f7633g = i13;
                                                    List<T> list2 = c0567e.f7631e;
                                                    if (list != list2) {
                                                        Collection collection = c0567e.f7632f;
                                                        D d10 = c0567e.f7627a;
                                                        if (list == 0) {
                                                            int size = list2.size();
                                                            c0567e.f7631e = null;
                                                            c0567e.f7632f = Collections.emptyList();
                                                            d10.onRemoved(0, size);
                                                            c0567e.a(collection, null);
                                                        } else if (list2 == 0) {
                                                            c0567e.f7631e = list;
                                                            c0567e.f7632f = Collections.unmodifiableList(list);
                                                            d10.onInserted(0, list.size());
                                                            c0567e.a(collection, null);
                                                        } else {
                                                            c0567e.f7628b.f7614b.execute(new RunnableC0566d(c0567e, list2, list, i13));
                                                        }
                                                    }
                                                    H1.a aVar = mainActivity.f8666j;
                                                    ((Group) (aVar != null ? aVar : null).f1420d).setVisibility(list.isEmpty() ? 0 : 8);
                                                    break;
                                            }
                                            return p.f3034a;
                                        }
                                    });
                                    H1.a aVar = this.f8666j;
                                    if (aVar == null) {
                                        aVar = null;
                                    }
                                    setContentView((ConstraintLayout) aVar.f1417a);
                                    setSupportActionBar((MaterialToolbar) aVar.f1418b);
                                    ((MaterialToolbar) aVar.f1418b).setSubtitle(getApplicationInfo().loadLabel(getPackageManager()));
                                    ((TextView) aVar.f1421e).setMovementMethod(LinkMovementMethod.getInstance());
                                    RecyclerView recyclerView2 = (RecyclerView) aVar.f1419c;
                                    recyclerView2.setHasFixedSize(true);
                                    recyclerView2.addItemDecoration(new r(this));
                                    e eVar = this.f8667k;
                                    if (eVar == null) {
                                        eVar = null;
                                    }
                                    recyclerView2.setAdapter(eVar);
                                    ((T1.c) this.i.getValue()).f3442p.observe(this, new a(new InterfaceC0646l(this) { // from class: T1.b

                                        /* renamed from: b, reason: collision with root package name */
                                        public final /* synthetic */ MainActivity f3440b;

                                        {
                                            this.f3440b = this;
                                        }

                                        @Override // ca.InterfaceC0646l
                                        public final Object invoke(Object obj) {
                                            MainActivity mainActivity = this.f3440b;
                                            switch (i10) {
                                                case 0:
                                                    long longValue = ((Long) obj).longValue();
                                                    int i12 = MainActivity.f8665o;
                                                    Intent intent = new Intent(mainActivity, (Class<?>) TransactionActivity.class);
                                                    intent.putExtra(FirebaseAnalytics.Param.TRANSACTION_ID, longValue);
                                                    mainActivity.startActivity(intent);
                                                    break;
                                                default:
                                                    List<T> list = (List) obj;
                                                    e eVar2 = mainActivity.f8667k;
                                                    if (eVar2 == null) {
                                                        eVar2 = null;
                                                    }
                                                    C0567e<T> c0567e = eVar2.f7410d;
                                                    int i13 = c0567e.f7633g + 1;
                                                    c0567e.f7633g = i13;
                                                    List<T> list2 = c0567e.f7631e;
                                                    if (list != list2) {
                                                        Collection collection = c0567e.f7632f;
                                                        D d10 = c0567e.f7627a;
                                                        if (list == 0) {
                                                            int size = list2.size();
                                                            c0567e.f7631e = null;
                                                            c0567e.f7632f = Collections.emptyList();
                                                            d10.onRemoved(0, size);
                                                            c0567e.a(collection, null);
                                                        } else if (list2 == 0) {
                                                            c0567e.f7631e = list;
                                                            c0567e.f7632f = Collections.unmodifiableList(list);
                                                            d10.onInserted(0, list.size());
                                                            c0567e.a(collection, null);
                                                        } else {
                                                            c0567e.f7628b.f7614b.execute(new RunnableC0566d(c0567e, list2, list, i13));
                                                        }
                                                    }
                                                    H1.a aVar2 = mainActivity.f8666j;
                                                    ((Group) (aVar2 != null ? aVar2 : null).f1420d).setVisibility(list.isEmpty() ? 0 : 8);
                                                    break;
                                            }
                                            return p.f3034a;
                                        }
                                    }));
                                    if (Build.VERSION.SDK_INT < 33 || C0913a.checkSelfPermission(this, "android.permission.POST_NOTIFICATIONS") == 0) {
                                        return;
                                    }
                                    if (!shouldShowRequestPermissionRationale("android.permission.POST_NOTIFICATIONS")) {
                                        this.f8668l.a("android.permission.POST_NOTIFICATIONS");
                                        return;
                                    }
                                    H1.a aVar2 = this.f8666j;
                                    if (aVar2 == null) {
                                        aVar2 = null;
                                    }
                                    View view = (ConstraintLayout) aVar2.f1417a;
                                    String string = getApplicationContext().getString(R.string.chucker_notifications_permission_not_granted);
                                    int[] iArr = Snackbar.f9777C;
                                    ViewGroup viewGroup2 = null;
                                    while (true) {
                                        if (view instanceof CoordinatorLayout) {
                                            viewGroup = (ViewGroup) view;
                                            break;
                                        }
                                        if (view instanceof FrameLayout) {
                                            if (view.getId() == 16908290) {
                                                viewGroup = (ViewGroup) view;
                                                break;
                                            }
                                            viewGroup2 = (ViewGroup) view;
                                        }
                                        if (view != null) {
                                            Object parent = view.getParent();
                                            view = parent instanceof View ? (View) parent : null;
                                        }
                                        if (view == null) {
                                            viewGroup = viewGroup2;
                                            break;
                                        }
                                    }
                                    if (viewGroup == null) {
                                        throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
                                    }
                                    Context context = viewGroup.getContext();
                                    LayoutInflater from = LayoutInflater.from(context);
                                    TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Snackbar.f9777C);
                                    int resourceId = obtainStyledAttributes.getResourceId(0, -1);
                                    int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
                                    obtainStyledAttributes.recycle();
                                    SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) from.inflate((resourceId == -1 || resourceId2 == -1) ? R.layout.design_layout_snackbar_include : R.layout.mtrl_layout_snackbar_include, viewGroup, false);
                                    Snackbar snackbar = new Snackbar(context, viewGroup, snackbarContentLayout, snackbarContentLayout);
                                    ((SnackbarContentLayout) snackbar.i.getChildAt(0)).getMessageView().setText(string);
                                    snackbar.f9752k = 0;
                                    String string2 = getApplicationContext().getString(R.string.chucker_change);
                                    J7.b bVar = new J7.b(this, 1);
                                    Button actionView = ((SnackbarContentLayout) snackbar.i.getChildAt(0)).getActionView();
                                    if (TextUtils.isEmpty(string2)) {
                                        actionView.setVisibility(8);
                                        actionView.setOnClickListener(null);
                                        snackbar.f9779B = false;
                                    } else {
                                        snackbar.f9779B = true;
                                        actionView.setVisibility(0);
                                        actionView.setText(string2);
                                        actionView.setOnClickListener(new B7.f(i, snackbar, bVar));
                                    }
                                    com.google.android.material.snackbar.g b9 = com.google.android.material.snackbar.g.b();
                                    int g10 = snackbar.g();
                                    BaseTransientBottomBar.c cVar = snackbar.f9761t;
                                    synchronized (b9.f9791a) {
                                        try {
                                            if (b9.c(cVar)) {
                                                g.c cVar2 = b9.f9793c;
                                                cVar2.f9797b = g10;
                                                b9.f9792b.removeCallbacksAndMessages(cVar2);
                                                b9.f(b9.f9793c);
                                                return;
                                            }
                                            g.c cVar3 = b9.f9794d;
                                            if (cVar3 == null || cVar == null || cVar3.f9796a.get() != cVar) {
                                                b9.f9794d = new g.c(g10, cVar);
                                            } else {
                                                b9.f9794d.f9797b = g10;
                                            }
                                            g.c cVar4 = b9.f9793c;
                                            if (cVar4 == null || !b9.a(cVar4, 4)) {
                                                b9.f9793c = null;
                                                g.c cVar5 = b9.f9794d;
                                                if (cVar5 != null) {
                                                    b9.f9793c = cVar5;
                                                    b9.f9794d = null;
                                                    g.b bVar2 = cVar5.f9796a.get();
                                                    if (bVar2 != null) {
                                                        bVar2.a();
                                                    } else {
                                                        b9.f9793c = null;
                                                    }
                                                }
                                                return;
                                            }
                                            return;
                                        } finally {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i11)));
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.chucker_transactions_list, menu);
        if (menu instanceof InterfaceMenuC1128a) {
            ((InterfaceMenuC1128a) menu).setGroupDividerEnabled(true);
        } else if (Build.VERSION.SDK_INT >= 28) {
            C0975a.b(menu);
        }
        SearchView searchView = (SearchView) menu.findItem(R.id.search).getActionView();
        searchView.setOnQueryTextListener(this);
        searchView.setIconifiedByDefault(true);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.clear) {
            String string = getString(R.string.chucker_clear);
            String string2 = getString(R.string.chucker_clear_http_confirmation);
            String string3 = getString(R.string.chucker_clear);
            final int i = 0;
            new E2.b(this).setTitle((CharSequence) string).setMessage((CharSequence) string2).setPositiveButton((CharSequence) string3, (DialogInterface.OnClickListener) new S1.c(0, new InterfaceC0635a(this) { // from class: com.chuckerteam.chucker.internal.ui.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ MainActivity f8706b;

                {
                    this.f8706b = this;
                }

                @Override // ca.InterfaceC0635a
                public final Object invoke() {
                    switch (i) {
                        case 0:
                            int i9 = MainActivity.f8665o;
                            BuildersKt__Builders_commonKt.launch$default(C0552s.b((T1.c) this.f8706b.i.getValue()), null, null, new MainViewModel$clearTransactions$1(2, null), 3, null);
                            LongSparseArray<HttpTransaction> longSparseArray = j.f3355c;
                            synchronized (longSparseArray) {
                                longSparseArray.clear();
                                j.f3356d.clear();
                            }
                            return p.f3034a;
                        case 1:
                            int i10 = MainActivity.f8665o;
                            MainActivity$onOptionsItemSelected$2$1 mainActivity$onOptionsItemSelected$2$1 = new MainActivity$onOptionsItemSelected$2$1(2, null);
                            MainActivity mainActivity = this.f8706b;
                            BuildersKt__Builders_commonKt.launch$default(C0552s.a(mainActivity), null, null, new MainActivity$exportTransactions$1(mainActivity, mainActivity.getApplicationContext(), mainActivity$onOptionsItemSelected$2$1, "transactions.txt", null), 3, null);
                            return p.f3034a;
                        default:
                            int i11 = MainActivity.f8665o;
                            MainActivity mainActivity2 = this.f8706b;
                            MainActivity$onOptionsItemSelected$3$1 mainActivity$onOptionsItemSelected$3$1 = new MainActivity$onOptionsItemSelected$3$1(mainActivity2, null);
                            BuildersKt__Builders_commonKt.launch$default(C0552s.a(mainActivity2), null, null, new MainActivity$exportTransactions$1(mainActivity2, mainActivity2.getApplicationContext(), mainActivity$onOptionsItemSelected$3$1, "transactions.har", null), 3, null);
                            return p.f3034a;
                    }
                }
            })).setNegativeButton((CharSequence) getString(R.string.chucker_cancel), (DialogInterface.OnClickListener) new S1.c()).show();
            return true;
        }
        if (itemId == R.id.share_text) {
            String string4 = getString(R.string.chucker_export);
            String string5 = getString(R.string.chucker_export_text_http_confirmation);
            String string6 = getString(R.string.chucker_export);
            final int i9 = 1;
            new E2.b(this).setTitle((CharSequence) string4).setMessage((CharSequence) string5).setPositiveButton((CharSequence) string6, (DialogInterface.OnClickListener) new S1.c(0, new InterfaceC0635a(this) { // from class: com.chuckerteam.chucker.internal.ui.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ MainActivity f8706b;

                {
                    this.f8706b = this;
                }

                @Override // ca.InterfaceC0635a
                public final Object invoke() {
                    switch (i9) {
                        case 0:
                            int i92 = MainActivity.f8665o;
                            BuildersKt__Builders_commonKt.launch$default(C0552s.b((T1.c) this.f8706b.i.getValue()), null, null, new MainViewModel$clearTransactions$1(2, null), 3, null);
                            LongSparseArray<HttpTransaction> longSparseArray = j.f3355c;
                            synchronized (longSparseArray) {
                                longSparseArray.clear();
                                j.f3356d.clear();
                            }
                            return p.f3034a;
                        case 1:
                            int i10 = MainActivity.f8665o;
                            MainActivity$onOptionsItemSelected$2$1 mainActivity$onOptionsItemSelected$2$1 = new MainActivity$onOptionsItemSelected$2$1(2, null);
                            MainActivity mainActivity = this.f8706b;
                            BuildersKt__Builders_commonKt.launch$default(C0552s.a(mainActivity), null, null, new MainActivity$exportTransactions$1(mainActivity, mainActivity.getApplicationContext(), mainActivity$onOptionsItemSelected$2$1, "transactions.txt", null), 3, null);
                            return p.f3034a;
                        default:
                            int i11 = MainActivity.f8665o;
                            MainActivity mainActivity2 = this.f8706b;
                            MainActivity$onOptionsItemSelected$3$1 mainActivity$onOptionsItemSelected$3$1 = new MainActivity$onOptionsItemSelected$3$1(mainActivity2, null);
                            BuildersKt__Builders_commonKt.launch$default(C0552s.a(mainActivity2), null, null, new MainActivity$exportTransactions$1(mainActivity2, mainActivity2.getApplicationContext(), mainActivity$onOptionsItemSelected$3$1, "transactions.har", null), 3, null);
                            return p.f3034a;
                    }
                }
            })).setNegativeButton((CharSequence) getString(R.string.chucker_cancel), (DialogInterface.OnClickListener) new S1.c()).show();
            return true;
        }
        if (itemId != R.id.share_har) {
            if (itemId == R.id.save_text) {
                o(ExportType.TEXT);
                return true;
            }
            if (itemId != R.id.save_har) {
                return super.onOptionsItemSelected(menuItem);
            }
            o(ExportType.HAR);
            return true;
        }
        String string7 = getString(R.string.chucker_export);
        String string8 = getString(R.string.chucker_export_har_http_confirmation);
        String string9 = getString(R.string.chucker_export);
        final int i10 = 2;
        new E2.b(this).setTitle((CharSequence) string7).setMessage((CharSequence) string8).setPositiveButton((CharSequence) string9, (DialogInterface.OnClickListener) new S1.c(0, new InterfaceC0635a(this) { // from class: com.chuckerteam.chucker.internal.ui.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MainActivity f8706b;

            {
                this.f8706b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        int i92 = MainActivity.f8665o;
                        BuildersKt__Builders_commonKt.launch$default(C0552s.b((T1.c) this.f8706b.i.getValue()), null, null, new MainViewModel$clearTransactions$1(2, null), 3, null);
                        LongSparseArray<HttpTransaction> longSparseArray = j.f3355c;
                        synchronized (longSparseArray) {
                            longSparseArray.clear();
                            j.f3356d.clear();
                        }
                        return p.f3034a;
                    case 1:
                        int i102 = MainActivity.f8665o;
                        MainActivity$onOptionsItemSelected$2$1 mainActivity$onOptionsItemSelected$2$1 = new MainActivity$onOptionsItemSelected$2$1(2, null);
                        MainActivity mainActivity = this.f8706b;
                        BuildersKt__Builders_commonKt.launch$default(C0552s.a(mainActivity), null, null, new MainActivity$exportTransactions$1(mainActivity, mainActivity.getApplicationContext(), mainActivity$onOptionsItemSelected$2$1, "transactions.txt", null), 3, null);
                        return p.f3034a;
                    default:
                        int i11 = MainActivity.f8665o;
                        MainActivity mainActivity2 = this.f8706b;
                        MainActivity$onOptionsItemSelected$3$1 mainActivity$onOptionsItemSelected$3$1 = new MainActivity$onOptionsItemSelected$3$1(mainActivity2, null);
                        BuildersKt__Builders_commonKt.launch$default(C0552s.a(mainActivity2), null, null, new MainActivity$exportTransactions$1(mainActivity2, mainActivity2.getApplicationContext(), mainActivity$onOptionsItemSelected$3$1, "transactions.har", null), 3, null);
                        return p.f3034a;
                }
            }
        })).setNegativeButton((CharSequence) getString(R.string.chucker_cancel), (DialogInterface.OnClickListener) new S1.c()).show();
        return true;
    }
}
