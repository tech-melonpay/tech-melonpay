package androidx.camera.video;

import a3.InterfaceFutureC0509a;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.video.VideoOutput;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.CancellationException;

/* compiled from: VideoCapture.java */
/* loaded from: classes.dex */
public final class o implements FutureCallback<Void> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceFutureC0509a f5795a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f5796b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f5797c;

    public o(n nVar, CallbackToFutureAdapter.c cVar, boolean z10) {
        this.f5797c = nVar;
        this.f5795a = cVar;
        this.f5796b = z10;
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
    public final void onFailure(Throwable th) {
        if (th instanceof CancellationException) {
            return;
        }
        Logger.e("VideoCapture", "Surface update completed with unexpected exception", th);
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
    public final void onSuccess(Void r32) {
        VideoOutput.SourceState sourceState;
        n nVar = this.f5797c;
        if (this.f5795a != nVar.f5782e || (sourceState = nVar.f5784g) == VideoOutput.SourceState.f5569c) {
            return;
        }
        VideoOutput.SourceState sourceState2 = this.f5796b ? VideoOutput.SourceState.f5567a : VideoOutput.SourceState.f5568b;
        if (sourceState2 != sourceState) {
            nVar.f5784g = sourceState2;
            nVar.f().e(sourceState2);
        }
    }
}
