package M;

import C.N;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Size;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.processing.DefaultSurfaceProcessor;
import androidx.camera.core.processing.ShaderProvider;
import androidx.camera.view.PreviewView;
import androidx.camera.view.c;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.sentry.C0852j;
import io.sentry.C0855m;
import io.sentry.I;
import io.sentry.SentryLevel;
import io.sentry.Session;
import io.sentry.Y;
import io.sentry.a0;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.a;
import io.sentry.i0;
import j2.AbstractC0888g;
import j2.AbstractC0892k;
import j2.C0882a;
import j2.C0887f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import n2.C1060a;
import p2.AbstractC1103d;
import p2.C1101b;
import p2.InterfaceC1102c;
import p2.j;
import q2.InterfaceC1129a;
import s2.C1203a;
import t0.d;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements CallbackToFutureAdapter.b, SurfaceRequest.TransformationInfoListener, c.a, d.a, InterfaceC1129a.InterfaceC0457a, j.a, a.InterfaceC0411a, Y.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2502a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2503b;
    public final /* synthetic */ Object i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f2504j;

    public /* synthetic */ b(PreviewView.a aVar, androidx.camera.view.a aVar2, CameraInternal cameraInternal) {
        this.f2502a = 2;
        this.i = aVar;
        this.f2503b = aVar2;
        this.f2504j = cameraInternal;
    }

    public void a(Session session) {
        Session.State state;
        Map<String, String> map;
        N n10;
        Boolean bool;
        a0 a0Var = (a0) this.f2503b;
        boolean z10 = false;
        if (session == null) {
            a0Var.f21934a.getLogger().h(SentryLevel.INFO, "Session is null on scope.withSession", new Object[0]);
            return;
        }
        a0Var.getClass();
        i0 i0Var = (i0) this.i;
        N n11 = i0Var.f22040s;
        String str = null;
        if (n11 != null) {
            Iterator it = ((ArrayList) n11.f535b).iterator();
            while (it.hasNext()) {
                H9.b bVar = ((H9.f) it.next()).f1602f;
                if (bVar != null && (bool = bVar.f1573d) != null && !bool.booleanValue()) {
                    state = Session.State.Crashed;
                    break;
                }
            }
        }
        state = null;
        if (Session.State.Crashed == state || ((n10 = i0Var.f22040s) != null && !((ArrayList) n10.f535b).isEmpty())) {
            z10 = true;
        }
        H9.d dVar = i0Var.f21920d;
        if (dVar != null && (map = dVar.f1587f) != null && map.containsKey("user-agent")) {
            str = i0Var.f21920d.f1587f.get("user-agent");
        }
        if (session.c(state, str, z10) && J9.b.c((C0852j) this.f2504j, E9.c.class)) {
            session.b(I.n());
        }
    }

    @Override // p2.j.a, androidx.camera.core.impl.utils.futures.AsyncFunction
    public Object apply(Object obj) {
        long insert;
        switch (this.f2502a) {
            case 7:
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                j jVar = (j) this.f2503b;
                long simpleQueryForLong = jVar.i().compileStatement("PRAGMA page_size").simpleQueryForLong() * jVar.i().compileStatement("PRAGMA page_count").simpleQueryForLong();
                AbstractC1103d abstractC1103d = jVar.f25605d;
                if (simpleQueryForLong >= abstractC1103d.e()) {
                    return -1L;
                }
                AbstractC0892k abstractC0892k = (AbstractC0892k) this.i;
                Long j10 = j.j(sQLiteDatabase, abstractC0892k);
                if (j10 != null) {
                    insert = j10.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", abstractC0892k.b());
                    contentValues.put("priority", Integer.valueOf(C1203a.a(abstractC0892k.d())));
                    contentValues.put("next_request_ms", (Integer) 0);
                    if (abstractC0892k.c() != null) {
                        contentValues.put("extras", Base64.encodeToString(abstractC0892k.c(), 0));
                    }
                    insert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int d10 = abstractC1103d.d();
                AbstractC0888g abstractC0888g = (AbstractC0888g) this.f2504j;
                byte[] bArr = abstractC0888g.d().f22439b;
                boolean z10 = bArr.length <= d10;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(insert));
                contentValues2.put("transport_name", abstractC0888g.g());
                contentValues2.put("timestamp_ms", Long.valueOf(abstractC0888g.e()));
                contentValues2.put("uptime_ms", Long.valueOf(abstractC0888g.h()));
                contentValues2.put("payload_encoding", abstractC0888g.d().f22438a.f20764a);
                contentValues2.put("code", abstractC0888g.c());
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z10));
                contentValues2.put("payload", z10 ? bArr : new byte[0]);
                long insert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z10) {
                    int ceil = (int) Math.ceil(bArr.length / d10);
                    for (int i = 1; i <= ceil; i++) {
                        byte[] copyOfRange = Arrays.copyOfRange(bArr, (i - 1) * d10, Math.min(i * d10, bArr.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(insert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i));
                        contentValues3.put("bytes", copyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(abstractC0888g.b()).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(insert2));
                    contentValues4.put(AppMeasurementSdk.ConditionalUserProperty.NAME, (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(insert2);
            default:
                Cursor cursor = (Cursor) obj;
                j jVar2 = (j) this.f2503b;
                jVar2.getClass();
                while (cursor.moveToNext()) {
                    long j11 = cursor.getLong(0);
                    boolean z11 = cursor.getInt(7) != 0;
                    C0882a.C0415a c0415a = new C0882a.C0415a();
                    c0415a.f22420f = new HashMap();
                    String string = cursor.getString(1);
                    if (string == null) {
                        throw new NullPointerException("Null transportName");
                    }
                    c0415a.f22415a = string;
                    c0415a.f22418d = Long.valueOf(cursor.getLong(2));
                    c0415a.f22419e = Long.valueOf(cursor.getLong(3));
                    if (z11) {
                        String string2 = cursor.getString(4);
                        c0415a.f22417c = new C0887f(string2 == null ? j.f25601e : new g2.b(string2), cursor.getBlob(5));
                    } else {
                        String string3 = cursor.getString(4);
                        g2.b bVar = string3 == null ? j.f25601e : new g2.b(string3);
                        Cursor query = jVar2.i().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j11)}, null, null, "sequence_num");
                        try {
                            Cursor cursor2 = query;
                            ArrayList arrayList = new ArrayList();
                            int i9 = 0;
                            while (cursor2.moveToNext()) {
                                byte[] blob = cursor2.getBlob(0);
                                arrayList.add(blob);
                                i9 += blob.length;
                            }
                            byte[] bArr2 = new byte[i9];
                            int i10 = 0;
                            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                byte[] bArr3 = (byte[]) arrayList.get(i11);
                                System.arraycopy(bArr3, 0, bArr2, i10, bArr3.length);
                                i10 += bArr3.length;
                            }
                            query.close();
                            c0415a.f22417c = new C0887f(bVar, bArr2);
                        } catch (Throwable th) {
                            query.close();
                            throw th;
                        }
                    }
                    if (!cursor.isNull(6)) {
                        c0415a.f22416b = Integer.valueOf(cursor.getInt(6));
                    }
                    ((List) this.f2504j).add(new C1101b(j11, (AbstractC0892k) this.i, c0415a.b()));
                }
                return null;
        }
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.b
    public Object attachCompleter(CallbackToFutureAdapter.a aVar) {
        Object lambda$initGlRenderer$9;
        switch (this.f2502a) {
            case 0:
                ((androidx.camera.view.a) this.f2503b).getClass();
                CameraInfo cameraInfo = (CameraInfo) this.i;
                c cVar = new c(aVar, cameraInfo);
                ((List) this.f2504j).add(cVar);
                ((CameraInfoInternal) cameraInfo).addSessionCaptureCallback(CameraXExecutors.directExecutor(), cVar);
                return "waitForCaptureResult";
            default:
                lambda$initGlRenderer$9 = ((DefaultSurfaceProcessor) this.f2503b).lambda$initGlRenderer$9((DynamicRange) this.i, (ShaderProvider) this.f2504j, aVar);
                return lambda$initGlRenderer$9;
        }
    }

    public void b() {
        androidx.camera.view.a aVar;
        AtomicReference<androidx.camera.view.a> atomicReference = PreviewView.this.f5813f;
        while (true) {
            aVar = (androidx.camera.view.a) this.f2503b;
            if (atomicReference.compareAndSet(aVar, null)) {
                aVar.a(PreviewView.StreamState.f5827a);
                break;
            } else if (atomicReference.get() != aVar) {
                break;
            }
        }
        FutureChain futureChain = aVar.f5837e;
        if (futureChain != null) {
            futureChain.cancel(false);
            aVar.f5837e = null;
        }
        ((CameraInternal) this.f2504j).getCameraState().removeObserver(aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x03df  */
    @Override // io.sentry.Y.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(io.sentry.SentryOptions r22) {
        /*
            Method dump skipped, instructions count: 1194
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: M.b.c(io.sentry.SentryOptions):void");
    }

    @Override // q2.InterfaceC1129a.InterfaceC0457a
    public Object execute() {
        C1060a c1060a = (C1060a) this.f2503b;
        InterfaceC1102c interfaceC1102c = c1060a.f24091d;
        AbstractC0888g abstractC0888g = (AbstractC0888g) this.f2504j;
        AbstractC0892k abstractC0892k = (AbstractC0892k) this.i;
        interfaceC1102c.b0(abstractC0892k, abstractC0888g);
        c1060a.f24088a.b(abstractC0892k, 1);
        return null;
    }

    @Override // androidx.camera.core.SurfaceRequest.TransformationInfoListener
    public void onTransformationInfoUpdate(SurfaceRequest.TransformationInfo transformationInfo) {
        androidx.camera.view.c cVar;
        PreviewView.a aVar = (PreviewView.a) this.f2503b;
        aVar.getClass();
        Logger.d("PreviewView", "Preview transformation info updated. " + transformationInfo);
        boolean z10 = ((CameraInternal) this.i).getCameraInfoInternal().getLensFacing() == 0;
        PreviewView previewView = PreviewView.this;
        androidx.camera.view.b bVar = previewView.f5810c;
        Size resolution = ((SurfaceRequest) this.f2504j).getResolution();
        bVar.getClass();
        Logger.d("PreviewTransform", "Transformation info set: " + transformationInfo + " " + resolution + " " + z10);
        bVar.f5840b = transformationInfo.getCropRect();
        bVar.f5841c = transformationInfo.getRotationDegrees();
        bVar.f5843e = transformationInfo.getTargetRotation();
        bVar.f5839a = resolution;
        bVar.f5844f = z10;
        bVar.f5845g = transformationInfo.hasCameraTransform();
        bVar.f5842d = transformationInfo.getSensorToBufferTransform();
        if (transformationInfo.getTargetRotation() == -1 || ((cVar = previewView.f5809b) != null && (cVar instanceof androidx.camera.view.d))) {
            previewView.f5811d = true;
        } else {
            previewView.f5811d = false;
        }
        previewView.a();
    }

    public /* synthetic */ b(io.sentry.android.core.b bVar, SentryAndroidOptions sentryAndroidOptions) {
        this.f2502a = 10;
        C0855m c0855m = C0855m.f22069a;
        this.f2503b = bVar;
        this.i = c0855m;
        this.f2504j = sentryAndroidOptions;
    }

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, int i) {
        this.f2502a = i;
        this.f2503b = obj;
        this.i = obj2;
        this.f2504j = obj3;
    }

    public /* synthetic */ b(j jVar, ArrayList arrayList, AbstractC0892k abstractC0892k) {
        this.f2502a = 8;
        this.f2503b = jVar;
        this.f2504j = arrayList;
        this.i = abstractC0892k;
    }
}
