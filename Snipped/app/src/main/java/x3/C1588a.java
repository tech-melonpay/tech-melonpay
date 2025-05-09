package x3;

import A3.b;
import A3.d;
import A3.h;
import A3.k;
import A3.m;
import com.google.android.gms.internal.mlkit_common.zzpy;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import java.lang.ref.ReferenceQueue;
import java.util.Set;
import y3.C1612a;
import z3.c;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* renamed from: x3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1588a implements ComponentFactory {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C1588a f30930b = new C1588a(0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ C1588a f30931c = new C1588a(1);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ C1588a f30932d = new C1588a(2);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ C1588a f30933e = new C1588a(3);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ C1588a f30934f = new C1588a(4);

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ C1588a f30935g = new C1588a(5);

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ C1588a f30936h = new C1588a(6);
    public static final /* synthetic */ C1588a i = new C1588a(7);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30937a;

    public /* synthetic */ C1588a(int i9) {
        this.f30937a = i9;
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        switch (this.f30937a) {
            case 0:
                return new B3.a();
            case 1:
                return new h();
            case 2:
                return new c(componentContainer.setOf(c.a.class));
            case 3:
                return new d(componentContainer.getProvider(h.class));
            case 4:
                A3.a aVar = new A3.a();
                ReferenceQueue referenceQueue = aVar.f60a;
                Set set = aVar.f61b;
                set.add(new m(aVar, referenceQueue, set));
                Thread thread = new Thread(new k(0, referenceQueue, set), "MlKitCleaner");
                thread.setDaemon(true);
                thread.start();
                return aVar;
            case 5:
                return new b();
            case 6:
                zzpy.zzb("common");
                return new C1612a();
            default:
                return new c.a(componentContainer.getProvider(C1612a.class));
        }
    }
}
