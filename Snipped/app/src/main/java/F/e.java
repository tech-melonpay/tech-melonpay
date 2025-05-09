package F;

import android.view.View;
import androidx.camera.core.Logger;
import androidx.camera.video.internal.audio.f;
import androidx.camera.video.internal.encoder.EncoderImpl;
import com.google.android.material.sidesheet.SideSheetBehavior;
import m0.f;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1137a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1138b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1139c;

    public /* synthetic */ e(int i, int i9, Object obj) {
        this.f1137a = i9;
        this.f1139c = obj;
        this.f1138b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1137a) {
            case 0:
                f fVar = (f) this.f1139c;
                int i = fVar.f5676l;
                int i9 = this.f1138b;
                if (i == i9) {
                    return;
                }
                int i10 = fVar.f5673h;
                fVar.f5676l = (i9 / i10) * i10;
                StringBuilder l10 = com.google.android.gms.measurement.internal.a.l("Update buffer size from ", i, " to ");
                l10.append(fVar.f5676l);
                Logger.d("BufferedAudioStream", l10.toString());
                return;
            case 1:
                EncoderImpl.c cVar = (EncoderImpl.c) this.f1139c;
                boolean z10 = cVar.i;
                EncoderImpl encoderImpl = cVar.f5739j;
                if (z10) {
                    Logger.w(encoderImpl.f5693a, "Receives input frame after codec is reset.");
                    return;
                }
                switch (encoderImpl.f5711t.ordinal()) {
                    case 0:
                    case 7:
                    case 8:
                        return;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        encoderImpl.f5702k.offer(Integer.valueOf(this.f1138b));
                        encoderImpl.d();
                        return;
                    default:
                        throw new IllegalStateException("Unknown state: " + encoderImpl.f5711t);
                }
            case 2:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f1139c;
                View view = (View) sideSheetBehavior.f9722q.get();
                if (view != null) {
                    sideSheetBehavior.startSettling(view, this.f1138b, false);
                    return;
                }
                return;
            case 3:
                com.sumsub.sns.core.presentation.form.d.a((com.sumsub.sns.core.presentation.form.d) this.f1139c, this.f1138b);
                return;
            default:
                ((f.c) this.f1139c).b(this.f1138b);
                return;
        }
    }
}
