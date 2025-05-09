package t;

import a3.InterfaceFutureC0509a;
import androidx.camera.core.impl.CameraCaptureMetaData;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.Set;
import t.r;

/* compiled from: R8$$SyntheticClass */
/* renamed from: t.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1267t implements CallbackToFutureAdapter.b, AsyncFunction {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r.f f27384a;

    public /* synthetic */ C1267t(r.f fVar) {
        this.f27384a = fVar;
    }

    @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
    public InterfaceFutureC0509a apply(Object obj) {
        s3.b bVar = new s3.b(9);
        long j10 = r.f.f27367e;
        C1257i c1257i = this.f27384a.f27369a;
        Set<CameraCaptureMetaData.AfState> set = r.f27336h;
        r.e eVar = new r.e(j10, bVar);
        c1257i.a(eVar);
        return eVar.f27363b;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.b
    public Object attachCompleter(CallbackToFutureAdapter.a aVar) {
        this.f27384a.f27369a.i.a(aVar, true);
        return "TorchOn";
    }
}
