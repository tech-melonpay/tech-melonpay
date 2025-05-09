package B;

import C.I;
import C.u;
import C.y;
import a3.InterfaceFutureC0509a;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.view.Surface;
import androidx.camera.camera2.internal.p;
import androidx.camera.core.CameraX;
import androidx.camera.core.Logger;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.video.n;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import ca.InterfaceC0646l;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.OnModelBoundListener;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.tasks.OnFailureListener;
import com.luminary.business.presentation.ui.fragments.invoices.invoices_new.InvoicesNewController;
import io.sentry.C;
import io.sentry.D;
import io.sentry.InterfaceC0864w;
import io.sentry.SentryLevel;
import io.sentry.U;
import io.sentry.V;
import j2.AbstractC0892k;
import j2.C0882a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p2.C1101b;
import p2.h;
import p2.j;
import q2.InterfaceC1129a;
import s6.C1209D;
import t.C1266s;
import t.r;
import z.e;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements CallbackToFutureAdapter.b, OnModelBoundListener, OnFailureListener, C.b, InterfaceC1129a.InterfaceC0457a, j.a, AsyncFunction, V, Config.OptionMatcher {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f178a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f179b;
    public final /* synthetic */ Object i;

    public /* synthetic */ e(int i, Object obj, Object obj2) {
        this.f178a = i;
        this.f179b = obj;
        this.i = obj2;
    }

    @Override // io.sentry.C.b
    public Object a() {
        D d10 = (D) this.i;
        ((C) this.f179b).getClass();
        try {
            try {
                return Integer.valueOf(d10.T());
            } catch (Exception unused) {
                return Double.valueOf(d10.N());
            }
        } catch (Exception unused2) {
            return Long.valueOf(d10.Y());
        }
    }

    @Override // p2.j.a, androidx.camera.core.impl.utils.futures.AsyncFunction
    public InterfaceFutureC0509a apply(Object obj) {
        List list = (List) obj;
        p pVar = (p) this.f179b;
        pVar.getClass();
        Logger.d("SyncCaptureSessionBase", "[" + pVar + "] getSurface...done");
        if (list.contains(null)) {
            return Futures.immediateFailedFuture(new DeferrableSurface.SurfaceClosedException("Surface closed", (DeferrableSurface) ((List) this.i).get(list.indexOf(null))));
        }
        return list.isEmpty() ? Futures.immediateFailedFuture(new IllegalArgumentException("Unable to open capture session without surfaces")) : Futures.immediateFuture(list);
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.b
    public Object attachCompleter(CallbackToFutureAdapter.a aVar) {
        switch (this.f178a) {
            case 0:
                g gVar = (g) this.f179b;
                CameraX cameraX = (CameraX) this.i;
                synchronized (gVar.f183a) {
                    Futures.addCallback(FutureChain.from(gVar.f185c).transformAsync(new A0.b(cameraX, 1), CameraXExecutors.directExecutor()), new f(cameraX, aVar), CameraXExecutors.directExecutor());
                }
                return "ProcessCameraProvider-initializeCameraX";
            case 1:
                ((n) this.f179b).getClass();
                Integer valueOf = Integer.valueOf(aVar.hashCode());
                SessionConfig.Builder builder = (SessionConfig.Builder) this.i;
                builder.addTag("androidx.camera.video.VideoCapture.streamUpdate", valueOf);
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                I i = new I(atomicBoolean, aVar, builder);
                aVar.a(new y(atomicBoolean, builder, i, 1), CameraXExecutors.directExecutor());
                builder.addRepeatingCameraCaptureCallback(i);
                return String.format("%s[0x%x]", "androidx.camera.video.VideoCapture.streamUpdate", Integer.valueOf(aVar.hashCode()));
            case 2:
            default:
                ((r.c) this.f179b).getClass();
                ((CaptureConfig.Builder) this.i).addCameraCaptureCallback(new C1266s(aVar));
                return "submitStillCapture";
            case 3:
                androidx.camera.view.e eVar = (androidx.camera.view.e) this.f179b;
                eVar.getClass();
                Logger.d("TextureViewImpl", "Surface set on Preview.");
                SurfaceRequest surfaceRequest = eVar.f5864h;
                Executor directExecutor = CameraXExecutors.directExecutor();
                u uVar = new u(aVar, 3);
                Surface surface = (Surface) this.i;
                surfaceRequest.provideSurface(surface, directExecutor, uVar);
                return "provideSurface[request=" + eVar.f5864h + " surface=" + surface + "]";
        }
    }

    @Override // io.sentry.V
    public void c(U u6) {
        w9.b bVar = (w9.b) this.f179b;
        InterfaceC0864w interfaceC0864w = (InterfaceC0864w) this.i;
        bVar.getClass();
        synchronized (u6.f21907n) {
            if (u6.f21896b == null) {
                u6.b(interfaceC0864w);
            } else {
                bVar.f30853c.getLogger().h(SentryLevel.DEBUG, "Transaction '%s' won't be bound to the Scope since there's one already in there.", interfaceC0864w.getName());
            }
        }
    }

    @Override // q2.InterfaceC1129a.InterfaceC0457a
    public Object execute() {
        return ((o2.c) this.f179b).f24349c.g((AbstractC0892k) this.i);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        com.sumsub.sns.internal.core.domain.j.a((InterfaceC0646l) this.f179b, (Bitmap) this.i, exc);
    }

    @Override // com.airbnb.epoxy.OnModelBoundListener
    public void onModelBound(EpoxyModel epoxyModel, Object obj, int i) {
        InvoicesNewController.buildModels$lambda$2$lambda$1$lambda$0((InvoicesNewController) this.f179b, (Integer) this.i, (C1209D) epoxyModel, (DataBindingEpoxyModel.DataBindingHolder) obj, i);
    }

    @Override // androidx.camera.core.impl.Config.OptionMatcher
    public boolean onOptionMatched(Config.Option option) {
        MutableOptionsBundle mutableOptionsBundle = ((e.a) this.f179b).f31214a;
        Config config = (Config) this.i;
        mutableOptionsBundle.insertOption(option, config.getOptionPriority(option), config.retrieveOption(option));
        return true;
    }

    @Override // p2.j.a, androidx.camera.core.impl.utils.futures.AsyncFunction
    public Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        j jVar = (j) this.f179b;
        jVar.getClass();
        ArrayList arrayList = new ArrayList();
        AbstractC0892k abstractC0892k = (AbstractC0892k) this.i;
        Long j10 = j.j(sQLiteDatabase, abstractC0892k);
        if (j10 != null) {
            j.A(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{j10.toString()}, null, null, null, String.valueOf(jVar.f25605d.c())), new M.b(jVar, arrayList, abstractC0892k));
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i = 0; i < arrayList.size(); i++) {
            sb2.append(((h) arrayList.get(i)).b());
            if (i < arrayList.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        Cursor query = sQLiteDatabase.query("event_metadata", new String[]{"event_id", AppMeasurementSdk.ConditionalUserProperty.NAME, "value"}, sb2.toString(), null, null, null, null);
        try {
            Cursor cursor = query;
            while (cursor.moveToNext()) {
                long j11 = cursor.getLong(0);
                Set set = (Set) hashMap.get(Long.valueOf(j11));
                if (set == null) {
                    set = new HashSet();
                    hashMap.put(Long.valueOf(j11), set);
                }
                set.add(new j.b(cursor.getString(1), cursor.getString(2)));
            }
            query.close();
            ListIterator listIterator = arrayList.listIterator();
            while (listIterator.hasNext()) {
                h hVar = (h) listIterator.next();
                if (hashMap.containsKey(Long.valueOf(hVar.b()))) {
                    C0882a.C0415a i9 = hVar.a().i();
                    for (j.b bVar : (Set) hashMap.get(Long.valueOf(hVar.b()))) {
                        i9.a(bVar.f25606a, bVar.f25607b);
                    }
                    listIterator.set(new C1101b(hVar.b(), hVar.c(), i9.b()));
                }
            }
            return arrayList;
        } catch (Throwable th) {
            query.close();
            throw th;
        }
    }
}
