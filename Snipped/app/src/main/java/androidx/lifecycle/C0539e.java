package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;

/* compiled from: DefaultLifecycleObserverAdapter.kt */
/* renamed from: androidx.lifecycle.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0539e implements InterfaceC0550p {

    /* renamed from: a, reason: collision with root package name */
    public final DefaultLifecycleObserver f7079a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0550p f7080b;

    /* compiled from: DefaultLifecycleObserverAdapter.kt */
    /* renamed from: androidx.lifecycle.e$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7081a;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Lifecycle.Event.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Lifecycle.Event.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f7081a = iArr;
        }
    }

    public C0539e(DefaultLifecycleObserver defaultLifecycleObserver, InterfaceC0550p interfaceC0550p) {
        this.f7079a = defaultLifecycleObserver;
        this.f7080b = interfaceC0550p;
    }

    @Override // androidx.lifecycle.InterfaceC0550p
    public final void d(r rVar, Lifecycle.Event event) {
        int i = a.f7081a[event.ordinal()];
        DefaultLifecycleObserver defaultLifecycleObserver = this.f7079a;
        switch (i) {
            case 1:
                defaultLifecycleObserver.onCreate(rVar);
                break;
            case 2:
                defaultLifecycleObserver.onStart(rVar);
                break;
            case 3:
                defaultLifecycleObserver.onResume(rVar);
                break;
            case 4:
                defaultLifecycleObserver.onPause(rVar);
                break;
            case 5:
                defaultLifecycleObserver.onStop(rVar);
                break;
            case 6:
                defaultLifecycleObserver.onDestroy(rVar);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        InterfaceC0550p interfaceC0550p = this.f7080b;
        if (interfaceC0550p != null) {
            interfaceC0550p.d(rVar, event);
        }
    }
}
