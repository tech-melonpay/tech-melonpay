package androidx.activity;

import B6.d;
import O9.p;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.ComponentActivity;
import androidx.activity.result.IntentSenderRequest;
import androidx.fragment.app.C0532f;
import androidx.lifecycle.C0552s;
import androidx.lifecycle.C0553t;
import androidx.lifecycle.F;
import androidx.lifecycle.InterfaceC0543i;
import androidx.lifecycle.InterfaceC0550p;
import androidx.lifecycle.J;
import androidx.lifecycle.L;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.S;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import androidx.lifecycle.r;
import b1.C0582b;
import b1.C0583c;
import b1.InterfaceC0584d;
import c.C0617h;
import c.InterfaceC0619j;
import c.RunnableC0613d;
import ca.InterfaceC0635a;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import com.luminary.mobile.R;
import d.C0679a;
import e.AbstractC0704c;
import e.InterfaceC0702a;
import e.InterfaceC0703b;
import f.AbstractC0728a;
import j0.ActivityC0879h;
import j0.D;
import j0.InterfaceC0869A;
import j0.InterfaceC0870B;
import j0.InterfaceC0873b;
import j0.k;
import j1.C0880a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import k0.InterfaceC0915c;
import k0.InterfaceC0916d;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.j;
import x0.InterfaceC1579a;
import y0.C1605i;
import y0.InterfaceC1604h;
import y0.InterfaceC1606j;

/* compiled from: ComponentActivity.kt */
/* loaded from: classes.dex */
public class ComponentActivity extends ActivityC0879h implements X, InterfaceC0543i, InterfaceC0584d, InterfaceC0619j, e.f, InterfaceC0703b, InterfaceC0915c, InterfaceC0916d, InterfaceC0869A, InterfaceC0870B, InterfaceC1604h {
    private static final c Companion = new c();
    private W _viewModelStore;
    private final androidx.activity.result.a activityResultRegistry;
    private int contentLayoutId;
    private final O9.f defaultViewModelProviderFactory$delegate;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;
    private final O9.f fullyDrawnReporter$delegate;
    private final AtomicInteger nextLocalRequestCode;
    private final O9.f onBackPressedDispatcher$delegate;
    private final CopyOnWriteArrayList<InterfaceC1579a<Configuration>> onConfigurationChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC1579a<k>> onMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC1579a<Intent>> onNewIntentListeners;
    private final CopyOnWriteArrayList<InterfaceC1579a<D>> onPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC1579a<Integer>> onTrimMemoryListeners;
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;
    private final e reportFullyDrawnExecutor;
    private final C0583c savedStateRegistryController;
    private final C0679a contextAwareHelper = new C0679a();
    private final C1605i menuHostHelper = new C1605i(new RunnableC0613d(this, 0));

    /* compiled from: ComponentActivity.kt */
    public static final class a implements InterfaceC0550p {
        public a() {
        }

        @Override // androidx.lifecycle.InterfaceC0550p
        public final void d(r rVar, Lifecycle.Event event) {
            ComponentActivity componentActivity = ComponentActivity.this;
            componentActivity.ensureViewModelStore();
            componentActivity.getLifecycle().c(this);
        }
    }

    /* compiled from: ComponentActivity.kt */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f4538a = new b();

        public final OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }
    }

    /* compiled from: ComponentActivity.kt */
    public static final class c {
    }

    /* compiled from: ComponentActivity.kt */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public Object f4539a;

        /* renamed from: b, reason: collision with root package name */
        public W f4540b;
    }

    /* compiled from: ComponentActivity.kt */
    public interface e extends Executor {
        void d();

        void i(View view);
    }

    /* compiled from: ComponentActivity.kt */
    public final class f implements e, ViewTreeObserver.OnDrawListener, Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final long f4542a = SystemClock.uptimeMillis() + ModuleDescriptor.MODULE_VERSION;

        /* renamed from: b, reason: collision with root package name */
        public Runnable f4543b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f4544c;

        public f() {
        }

        @Override // androidx.activity.ComponentActivity.e
        public final void d() {
            ComponentActivity componentActivity = ComponentActivity.this;
            componentActivity.getWindow().getDecorView().removeCallbacks(this);
            componentActivity.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.f4543b = runnable;
            View decorView = ComponentActivity.this.getWindow().getDecorView();
            if (!this.f4544c) {
                decorView.postOnAnimation(new B2.d(this, 29));
            } else if (kotlin.jvm.internal.f.b(Looper.myLooper(), Looper.getMainLooper())) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        @Override // androidx.activity.ComponentActivity.e
        public final void i(View view) {
            if (this.f4544c) {
                return;
            }
            this.f4544c = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public final void onDraw() {
            boolean z10;
            Runnable runnable = this.f4543b;
            if (runnable == null) {
                if (SystemClock.uptimeMillis() > this.f4542a) {
                    this.f4544c = false;
                    ComponentActivity.this.getWindow().getDecorView().post(this);
                    return;
                }
                return;
            }
            runnable.run();
            this.f4543b = null;
            C0617h fullyDrawnReporter = ComponentActivity.this.getFullyDrawnReporter();
            synchronized (fullyDrawnReporter.f8502b) {
                z10 = fullyDrawnReporter.f8503c;
            }
            if (z10) {
                this.f4544c = false;
                ComponentActivity.this.getWindow().getDecorView().post(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }
    }

    /* compiled from: ComponentActivity.kt */
    public static final class g extends androidx.activity.result.a {
        public g() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.activity.result.a
        public final void b(int i, AbstractC0728a abstractC0728a, Object obj) {
            Bundle bundle;
            ComponentActivity componentActivity = ComponentActivity.this;
            AbstractC0728a.C0395a synchronousResult = abstractC0728a.getSynchronousResult(componentActivity, obj);
            if (synchronousResult != null) {
                new Handler(Looper.getMainLooper()).post(new Z0.a(this, i, synchronousResult, 1));
                return;
            }
            Intent createIntent = abstractC0728a.createIntent(componentActivity, obj);
            if (createIntent.getExtras() != null && createIntent.getExtras().getClassLoader() == null) {
                createIntent.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (createIntent.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                Bundle bundleExtra = createIntent.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                createIntent.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                bundle = bundleExtra;
            } else {
                bundle = null;
            }
            if (!kotlin.jvm.internal.f.b("androidx.activity.result.contract.action.REQUEST_PERMISSIONS", createIntent.getAction())) {
                if (!kotlin.jvm.internal.f.b("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST", createIntent.getAction())) {
                    componentActivity.startActivityForResult(createIntent, i, bundle);
                    return;
                }
                IntentSenderRequest intentSenderRequest = (IntentSenderRequest) createIntent.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                try {
                    componentActivity.startIntentSenderForResult(intentSenderRequest.f4578a, i, intentSenderRequest.f4579b, intentSenderRequest.f4580c, intentSenderRequest.f4581d, 0, bundle);
                    return;
                } catch (IntentSender.SendIntentException e10) {
                    new Handler(Looper.getMainLooper()).post(new Z0.a(this, i, e10, 2));
                    return;
                }
            }
            String[] stringArrayExtra = createIntent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            HashSet hashSet = new HashSet();
            for (int i9 = 0; i9 < stringArrayExtra.length; i9++) {
                if (TextUtils.isEmpty(stringArrayExtra[i9])) {
                    throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.n(new StringBuilder("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
                }
                if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(stringArrayExtra[i9], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(Integer.valueOf(i9));
                }
            }
            int size = hashSet.size();
            String[] strArr = size > 0 ? new String[stringArrayExtra.length - size] : stringArrayExtra;
            if (size > 0) {
                if (size == stringArrayExtra.length) {
                    return;
                }
                int i10 = 0;
                for (int i11 = 0; i11 < stringArrayExtra.length; i11++) {
                    if (!hashSet.contains(Integer.valueOf(i11))) {
                        strArr[i10] = stringArrayExtra[i11];
                        i10++;
                    }
                }
            }
            if (componentActivity instanceof InterfaceC0873b) {
                ((InterfaceC0873b) componentActivity).validateRequestPermissionsRequestCode(i);
            }
            componentActivity.requestPermissions(stringArrayExtra, i);
        }
    }

    public ComponentActivity() {
        C0583c c0583c = new C0583c(this);
        this.savedStateRegistryController = c0583c;
        this.reportFullyDrawnExecutor = createFullyDrawnExecutor();
        this.fullyDrawnReporter$delegate = kotlin.a.a(new InterfaceC0635a<C0617h>() { // from class: androidx.activity.ComponentActivity$fullyDrawnReporter$2
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final C0617h invoke() {
                ComponentActivity.e eVar;
                final ComponentActivity componentActivity = ComponentActivity.this;
                eVar = componentActivity.reportFullyDrawnExecutor;
                return new C0617h(eVar, new InterfaceC0635a<p>() { // from class: androidx.activity.ComponentActivity$fullyDrawnReporter$2.1
                    {
                        super(0);
                    }

                    @Override // ca.InterfaceC0635a
                    public final p invoke() {
                        ComponentActivity.this.reportFullyDrawn();
                        return p.f3034a;
                    }
                });
            }
        });
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new g();
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.".toString());
        }
        final int i = 0;
        getLifecycle().a(new InterfaceC0550p(this) { // from class: c.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ComponentActivity f8495b;

            {
                this.f8495b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0550p
            public final void d(r rVar, Lifecycle.Event event) {
                switch (i) {
                    case 0:
                        ComponentActivity._init_$lambda$2(this.f8495b, rVar, event);
                        break;
                    default:
                        ComponentActivity._init_$lambda$3(this.f8495b, rVar, event);
                        break;
                }
            }
        });
        final int i9 = 1;
        getLifecycle().a(new InterfaceC0550p(this) { // from class: c.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ComponentActivity f8495b;

            {
                this.f8495b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0550p
            public final void d(r rVar, Lifecycle.Event event) {
                switch (i9) {
                    case 0:
                        ComponentActivity._init_$lambda$2(this.f8495b, rVar, event);
                        break;
                    default:
                        ComponentActivity._init_$lambda$3(this.f8495b, rVar, event);
                        break;
                }
            }
        });
        getLifecycle().a(new a());
        c0583c.a();
        J.b(this);
        getSavedStateRegistry().c("android:support:activity-result", new W0.e(this, 5));
        addOnContextAvailableListener(new C0532f(this, 1));
        this.defaultViewModelProviderFactory$delegate = kotlin.a.a(new InterfaceC0635a<L>() { // from class: androidx.activity.ComponentActivity$defaultViewModelProviderFactory$2
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final L invoke() {
                ComponentActivity componentActivity = ComponentActivity.this;
                return new L(componentActivity.getApplication(), componentActivity, componentActivity.getIntent() != null ? componentActivity.getIntent().getExtras() : null);
            }
        });
        this.onBackPressedDispatcher$delegate = kotlin.a.a(new InterfaceC0635a<androidx.activity.a>() { // from class: androidx.activity.ComponentActivity$onBackPressedDispatcher$2
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final a invoke() {
                ComponentActivity componentActivity = ComponentActivity.this;
                a aVar = new a(new RunnableC0613d(componentActivity, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (f.b(Looper.myLooper(), Looper.getMainLooper())) {
                        componentActivity.addObserverForBackInvoker(aVar);
                    } else {
                        new Handler(Looper.getMainLooper()).post(new d(28, componentActivity, aVar));
                    }
                }
                return aVar;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(ComponentActivity componentActivity, r rVar, Lifecycle.Event event) {
        Window window;
        View peekDecorView;
        if (event != Lifecycle.Event.ON_STOP || (window = componentActivity.getWindow()) == null || (peekDecorView = window.peekDecorView()) == null) {
            return;
        }
        peekDecorView.cancelPendingInputEvents();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$3(ComponentActivity componentActivity, r rVar, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            componentActivity.contextAwareHelper.f20370b = null;
            if (!componentActivity.isChangingConfigurations()) {
                componentActivity.getViewModelStore().a();
            }
            componentActivity.reportFullyDrawnExecutor.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle _init_$lambda$4(ComponentActivity componentActivity) {
        Bundle bundle = new Bundle();
        androidx.activity.result.a aVar = componentActivity.activityResultRegistry;
        aVar.getClass();
        LinkedHashMap linkedHashMap = aVar.f4583b;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(aVar.f4585d));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(aVar.f4588g));
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$5(ComponentActivity componentActivity, Context context) {
        Bundle a10 = componentActivity.getSavedStateRegistry().a("android:support:activity-result");
        if (a10 != null) {
            androidx.activity.result.a aVar = componentActivity.activityResultRegistry;
            aVar.getClass();
            ArrayList<Integer> integerArrayList = a10.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = a10.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            ArrayList<String> stringArrayList2 = a10.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                aVar.f4585d.addAll(stringArrayList2);
            }
            Bundle bundle = a10.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            Bundle bundle2 = aVar.f4588g;
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            int size = stringArrayList.size();
            for (int i = 0; i < size; i++) {
                String str = stringArrayList.get(i);
                LinkedHashMap linkedHashMap = aVar.f4583b;
                boolean containsKey = linkedHashMap.containsKey(str);
                LinkedHashMap linkedHashMap2 = aVar.f4582a;
                if (containsKey) {
                    Integer num = (Integer) linkedHashMap.remove(str);
                    if (!bundle2.containsKey(str)) {
                        j.b(linkedHashMap2);
                        linkedHashMap2.remove(num);
                    }
                }
                int intValue = integerArrayList.get(i).intValue();
                String str2 = stringArrayList.get(i);
                linkedHashMap2.put(Integer.valueOf(intValue), str2);
                linkedHashMap.put(str2, Integer.valueOf(intValue));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addObserverForBackInvoker(androidx.activity.a aVar) {
        getLifecycle().a(new W0.c(2, aVar, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addObserverForBackInvoker$lambda$7(androidx.activity.a aVar, ComponentActivity componentActivity, r rVar, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            aVar.f4560f = b.f4538a.a(componentActivity);
            aVar.e(aVar.f4562h);
        }
    }

    private final e createFullyDrawnExecutor() {
        return new f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ensureViewModelStore() {
        if (this._viewModelStore == null) {
            d dVar = (d) getLastNonConfigurationInstance();
            if (dVar != null) {
                this._viewModelStore = dVar.f4540b;
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new W();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void menuHostHelper$lambda$0(ComponentActivity componentActivity) {
        componentActivity.invalidateMenu();
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        this.reportFullyDrawnExecutor.i(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    @Override // y0.InterfaceC1604h
    public void addMenuProvider(InterfaceC1606j interfaceC1606j) {
        C1605i c1605i = this.menuHostHelper;
        c1605i.f31078b.add(interfaceC1606j);
        c1605i.f31077a.run();
    }

    @Override // k0.InterfaceC0915c
    public final void addOnConfigurationChangedListener(InterfaceC1579a<Configuration> interfaceC1579a) {
        this.onConfigurationChangedListeners.add(interfaceC1579a);
    }

    public final void addOnContextAvailableListener(d.b bVar) {
        C0679a c0679a = this.contextAwareHelper;
        Context context = c0679a.f20370b;
        if (context != null) {
            bVar.a(context);
        }
        c0679a.f20369a.add(bVar);
    }

    @Override // j0.InterfaceC0869A
    public final void addOnMultiWindowModeChangedListener(InterfaceC1579a<k> interfaceC1579a) {
        this.onMultiWindowModeChangedListeners.add(interfaceC1579a);
    }

    public final void addOnNewIntentListener(InterfaceC1579a<Intent> interfaceC1579a) {
        this.onNewIntentListeners.add(interfaceC1579a);
    }

    @Override // j0.InterfaceC0870B
    public final void addOnPictureInPictureModeChangedListener(InterfaceC1579a<D> interfaceC1579a) {
        this.onPictureInPictureModeChangedListeners.add(interfaceC1579a);
    }

    @Override // k0.InterfaceC0916d
    public final void addOnTrimMemoryListener(InterfaceC1579a<Integer> interfaceC1579a) {
        this.onTrimMemoryListeners.add(interfaceC1579a);
    }

    @Override // e.f
    public final androidx.activity.result.a getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    @Override // androidx.lifecycle.InterfaceC0543i
    public R0.a getDefaultViewModelCreationExtras() {
        R0.c cVar = new R0.c(0);
        if (getApplication() != null) {
            cVar.b(S.f7046d, getApplication());
        }
        cVar.b(J.f6965a, this);
        cVar.b(J.f6966b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            cVar.b(J.f6967c, extras);
        }
        return cVar;
    }

    @Override // androidx.lifecycle.InterfaceC0543i
    public T getDefaultViewModelProviderFactory() {
        return (T) this.defaultViewModelProviderFactory$delegate.getValue();
    }

    public C0617h getFullyDrawnReporter() {
        return (C0617h) this.fullyDrawnReporter$delegate.getValue();
    }

    @Override // j0.ActivityC0879h, androidx.lifecycle.r
    public Lifecycle getLifecycle() {
        return super.getLifecycle();
    }

    @Override // c.InterfaceC0619j
    public final androidx.activity.a getOnBackPressedDispatcher() {
        return (androidx.activity.a) this.onBackPressedDispatcher$delegate.getValue();
    }

    @Override // b1.InterfaceC0584d
    public final C0582b getSavedStateRegistry() {
        return this.savedStateRegistryController.f8286b;
    }

    @Override // androidx.lifecycle.X
    public W getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.".toString());
        }
        ensureViewModelStore();
        return this._viewModelStore;
    }

    public void initializeViewTreeOwners() {
        C0552s.c(getWindow().getDecorView(), this);
        getWindow().getDecorView().setTag(R.id.view_tree_view_model_store_owner, this);
        U4.b.D(getWindow().getDecorView(), this);
        getWindow().getDecorView().setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        getWindow().getDecorView().setTag(R.id.report_drawn, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i9, Intent intent) {
        if (this.activityResultRegistry.a(i, i9, intent)) {
            return;
        }
        super.onActivityResult(i, i9, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        getOnBackPressedDispatcher().d();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<InterfaceC1579a<Configuration>> it = this.onConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    @Override // j0.ActivityC0879h, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.savedStateRegistryController.b(bundle);
        C0679a c0679a = this.contextAwareHelper;
        c0679a.f20370b = this;
        Iterator it = c0679a.f20369a.iterator();
        while (it.hasNext()) {
            ((d.b) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i = F.f6953b;
        F.b.b(this);
        int i9 = this.contentLayoutId;
        if (i9 != 0) {
            setContentView(i9);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        C1605i c1605i = this.menuHostHelper;
        MenuInflater menuInflater = getMenuInflater();
        Iterator<InterfaceC1606j> it = c1605i.f31078b.iterator();
        while (it.hasNext()) {
            it.next().c(menu, menuInflater);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        boolean z10 = true;
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i != 0) {
            return false;
        }
        Iterator<InterfaceC1606j> it = this.menuHostHelper.f31078b.iterator();
        while (true) {
            if (!it.hasNext()) {
                z10 = false;
                break;
            }
            if (it.next().a(menuItem)) {
                break;
            }
        }
        return z10;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z10) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<InterfaceC1579a<k>> it = this.onMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new k(z10));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator<InterfaceC1579a<Intent>> it = this.onNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        Iterator<InterfaceC1606j> it = this.menuHostHelper.f31078b.iterator();
        while (it.hasNext()) {
            it.next().b(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z10) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<InterfaceC1579a<D>> it = this.onPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new D(z10));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator<InterfaceC1606j> it = this.menuHostHelper.f31078b.iterator();
        while (it.hasNext()) {
            it.next().d(menu);
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (this.activityResultRegistry.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        d dVar;
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        W w2 = this._viewModelStore;
        if (w2 == null && (dVar = (d) getLastNonConfigurationInstance()) != null) {
            w2 = dVar.f4540b;
        }
        if (w2 == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        d dVar2 = new d();
        dVar2.f4539a = onRetainCustomNonConfigurationInstance;
        dVar2.f4540b = w2;
        return dVar2;
    }

    @Override // j0.ActivityC0879h, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        if (getLifecycle() instanceof C0553t) {
            ((C0553t) getLifecycle()).h(Lifecycle.State.f6977c);
        }
        super.onSaveInstanceState(bundle);
        this.savedStateRegistryController.c(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator<InterfaceC1579a<Integer>> it = this.onTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.onUserLeaveHintListeners.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    public final <I, O> AbstractC0704c<I> registerForActivityResult(AbstractC0728a<I, O> abstractC0728a, androidx.activity.result.a aVar, InterfaceC0702a<O> interfaceC0702a) {
        return aVar.c("activity_rq#" + this.nextLocalRequestCode.getAndIncrement(), this, abstractC0728a, interfaceC0702a);
    }

    @Override // y0.InterfaceC1604h
    public void removeMenuProvider(InterfaceC1606j interfaceC1606j) {
        C1605i c1605i = this.menuHostHelper;
        c1605i.f31078b.remove(interfaceC1606j);
        if (((C1605i.a) c1605i.f31079c.remove(interfaceC1606j)) != null) {
            throw null;
        }
        c1605i.f31077a.run();
    }

    @Override // k0.InterfaceC0915c
    public final void removeOnConfigurationChangedListener(InterfaceC1579a<Configuration> interfaceC1579a) {
        this.onConfigurationChangedListeners.remove(interfaceC1579a);
    }

    @Override // j0.InterfaceC0869A
    public final void removeOnMultiWindowModeChangedListener(InterfaceC1579a<k> interfaceC1579a) {
        this.onMultiWindowModeChangedListeners.remove(interfaceC1579a);
    }

    @Override // j0.InterfaceC0870B
    public final void removeOnPictureInPictureModeChangedListener(InterfaceC1579a<D> interfaceC1579a) {
        this.onPictureInPictureModeChangedListeners.remove(interfaceC1579a);
    }

    @Override // k0.InterfaceC0916d
    public final void removeOnTrimMemoryListener(InterfaceC1579a<Integer> interfaceC1579a) {
        this.onTrimMemoryListeners.remove(interfaceC1579a);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (C0880a.b()) {
                C0880a.a("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            C0617h fullyDrawnReporter = getFullyDrawnReporter();
            synchronized (fullyDrawnReporter.f8502b) {
                try {
                    fullyDrawnReporter.f8503c = true;
                    Iterator it = fullyDrawnReporter.f8504d.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC0635a) it.next()).invoke();
                    }
                    fullyDrawnReporter.f8504d.clear();
                    p pVar = p.f3034a;
                } finally {
                }
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        initializeViewTreeOwners();
        this.reportFullyDrawnExecutor.i(getWindow().getDecorView());
        super.setContentView(i);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i) {
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i9, int i10, int i11) {
        super.startIntentSenderForResult(intentSender, i, intent, i9, i10, i11);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i9, int i10, int i11, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i, intent, i9, i10, i11, bundle);
    }

    @Override // e.InterfaceC0703b
    public final <I, O> AbstractC0704c<I> registerForActivityResult(AbstractC0728a<I, O> abstractC0728a, InterfaceC0702a<O> interfaceC0702a) {
        return registerForActivityResult(abstractC0728a, this.activityResultRegistry, interfaceC0702a);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z10, Configuration configuration) {
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z10, configuration);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<InterfaceC1579a<k>> it = this.onMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new k(z10));
            }
        } catch (Throwable th) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z10, Configuration configuration) {
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z10, configuration);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<InterfaceC1579a<D>> it = this.onPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new D(z10));
            }
        } catch (Throwable th) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        this.reportFullyDrawnExecutor.i(getWindow().getDecorView());
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        this.reportFullyDrawnExecutor.i(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }
}
