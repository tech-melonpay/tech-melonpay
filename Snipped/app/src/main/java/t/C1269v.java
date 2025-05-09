package t;

import android.content.Context;
import android.media.CamcorderProfile;
import android.util.Size;
import androidx.camera.core.impl.CameraDeviceSurfaceManager;
import androidx.camera.core.impl.SurfaceConfig;
import androidx.camera.core.impl.utils.MainThreadAsyncHandler;
import java.util.HashMap;
import java.util.Set;

/* compiled from: Camera2DeviceSurfaceManager.java */
/* renamed from: t.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1269v implements CameraDeviceSurfaceManager {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f27385a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1251c f27386b;

    /* compiled from: Camera2DeviceSurfaceManager.java */
    /* renamed from: t.v$a */
    public class a implements InterfaceC1251c {
        @Override // t.InterfaceC1251c
        public final CamcorderProfile a(int i, int i9) {
            return CamcorderProfile.get(i, i9);
        }

        @Override // t.InterfaceC1251c
        public final boolean b(int i, int i9) {
            return CamcorderProfile.hasProfile(i, i9);
        }
    }

    public C1269v(Context context, Object obj, Set<String> set) {
        a aVar = new a();
        this.f27385a = new HashMap();
        this.f27386b = aVar;
        u.v a10 = obj instanceof u.v ? (u.v) obj : u.v.a(context, MainThreadAsyncHandler.getInstance());
        context.getClass();
        for (String str : set) {
            this.f27385a.put(str, new g0(context, str, a10, this.f27386b));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:320:0x06ea, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x08b1, code lost:
    
        if (r5 != null) goto L326;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x08b3, code lost:
    
        if (r13 == false) goto L327;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x08e1, code lost:
    
        throw new java.lang.IllegalArgumentException(r29 + r11.f27223g + ".  May be attempting to bind too many use cases. Existing surfaces: " + r40 + " New configs: " + r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x08b5, code lost:
    
        r14 = r28;
        r9 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x08e2, code lost:
    
        r8 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:589:0x0aac, code lost:
    
        if (r4 < r13) goto L586;
     */
    /* JADX WARN: Code restructure failed: missing block: B:603:0x0b4b, code lost:
    
        if (t.g0.f(r12) < t.g0.f(r6)) goto L424;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x052d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:496:0x0d25  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x0d65  */
    /* JADX WARN: Removed duplicated region for block: B:596:0x0b17  */
    @Override // androidx.camera.core.impl.CameraDeviceSurfaceManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair<java.util.Map<androidx.camera.core.impl.UseCaseConfig<?>, androidx.camera.core.impl.StreamSpec>, java.util.Map<androidx.camera.core.impl.AttachedSurfaceInfo, androidx.camera.core.impl.StreamSpec>> getSuggestedStreamSpecs(int r38, java.lang.String r39, java.util.List<androidx.camera.core.impl.AttachedSurfaceInfo> r40, java.util.Map<androidx.camera.core.impl.UseCaseConfig<?>, java.util.List<android.util.Size>> r41) {
        /*
            Method dump skipped, instructions count: 3811
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t.C1269v.getSuggestedStreamSpecs(int, java.lang.String, java.util.List, java.util.Map):android.util.Pair");
    }

    @Override // androidx.camera.core.impl.CameraDeviceSurfaceManager
    public final SurfaceConfig transformSurfaceConfig(int i, String str, int i9, Size size) {
        g0 g0Var = (g0) this.f27385a.get(str);
        if (g0Var != null) {
            return SurfaceConfig.transformSurfaceConfig(i, i9, size, g0Var.h(i9));
        }
        return null;
    }
}
