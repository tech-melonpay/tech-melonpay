package E3;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import com.google.android.gms.internal.mlkit_vision_barcode.zzad;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrn;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrw;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
/* loaded from: classes.dex */
public final class d extends A3.e {

    /* renamed from: a, reason: collision with root package name */
    public final A3.g f1048a;

    public d(A3.g gVar) {
        this.f1048a = gVar;
    }

    @Override // A3.e
    public final Object create(Object obj) {
        boolean z10;
        C3.a aVar = (C3.a) obj;
        A3.g gVar = this.f1048a;
        Context b9 = gVar.b();
        AtomicReference atomicReference = a.f1044a;
        if (atomicReference.get() != null) {
            z10 = ((Boolean) atomicReference.get()).booleanValue();
        } else {
            Context b10 = A3.g.c().b();
            int i = g.f1049a;
            boolean z11 = DynamiteModule.getLocalVersion(b10, ModuleDescriptor.MODULE_ID) > 0;
            atomicReference.set(Boolean.valueOf(z11));
            z10 = z11;
        }
        zzrw.zzb(true != z10 ? "play-services-mlkit-barcode-scanning" : "barcode-scanning");
        int i9 = g.f1049a;
        if (!(DynamiteModule.getLocalVersion(b9, ModuleDescriptor.MODULE_ID) > 0) && GoogleApiAvailabilityLight.getInstance().getApkVersion(b9) < 204500000) {
            zzad zzadVar = new zzad();
            aVar.getClass();
            zzadVar.zza = 0;
        }
        f fVar = new f();
        new AtomicInteger(0);
        new AtomicBoolean(false);
        new ArrayDeque();
        new AtomicReference();
        new LinkedList();
        Preconditions.checkNotNull(gVar, "MlKitContext can not be null");
        Preconditions.checkNotNull(aVar, "BarcodeScannerOptions can not be null");
        zzrn.zza(gVar.b());
        return fVar;
    }
}
