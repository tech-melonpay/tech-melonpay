package t;

import android.media.CamcorderProfile;
import android.media.EncoderProfiles;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.EncoderProfilesProvider;
import java.util.HashMap;

/* compiled from: Camera2EncoderProfilesProvider.java */
/* renamed from: t.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1270w implements EncoderProfilesProvider {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f27387a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27388b;

    /* renamed from: c, reason: collision with root package name */
    public final int f27389c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f27390d = new HashMap();

    /* compiled from: Camera2EncoderProfilesProvider.java */
    /* renamed from: t.w$a */
    public static class a {
        public static EncoderProfiles a(String str, int i) {
            return CamcorderProfile.getAll(str, i);
        }
    }

    public C1270w(String str) {
        boolean z10;
        int i;
        this.f27388b = str;
        try {
            i = Integer.parseInt(str);
            z10 = true;
        } catch (NumberFormatException unused) {
            Logger.w("Camera2EncoderProfilesProvider", "Camera id is not an integer: " + str + ", unable to create Camera2EncoderProfilesProvider");
            z10 = false;
            i = -1;
        }
        this.f27387a = z10;
        this.f27389c = i;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:12|(4:14|(2:16|(1:18)(2:19|20))|24|25)|26|27|(1:29)|24|25) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0057, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0058, code lost:
    
        androidx.camera.core.Logger.w("Camera2EncoderProfilesProvider", "Unable to get CamcorderProfile by quality: " + r8, r0);
        r0 = null;
     */
    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.camera.core.impl.EncoderProfilesProxy getAll(int r8) {
        /*
            r7 = this;
            boolean r0 = r7.f27387a
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r7.f27389c
            boolean r2 = android.media.CamcorderProfile.hasProfile(r0, r8)
            if (r2 != 0) goto Lf
            return r1
        Lf:
            java.util.HashMap r2 = r7.f27390d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            boolean r3 = r2.containsKey(r3)
            if (r3 == 0) goto L26
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Object r8 = r2.get(r8)
            androidx.camera.core.impl.EncoderProfilesProxy r8 = (androidx.camera.core.impl.EncoderProfilesProxy) r8
            return r8
        L26:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 31
            java.lang.String r5 = "Camera2EncoderProfilesProvider"
            if (r3 < r4) goto L52
            java.lang.String r3 = r7.f27388b
            android.media.EncoderProfiles r3 = t.C1270w.a.a(r3, r8)
            if (r3 != 0) goto L37
            goto L70
        L37:
            androidx.camera.core.impl.Quirks r4 = w.k.f30775a
            java.lang.Class<w.w> r6 = w.w.class
            androidx.camera.core.impl.Quirk r4 = r4.get(r6)
            if (r4 == 0) goto L47
            java.lang.String r3 = "EncoderProfiles contains invalid video profiles, use CamcorderProfile to create EncoderProfilesProxy."
            androidx.camera.core.Logger.d(r5, r3)
            goto L52
        L47:
            androidx.camera.core.impl.EncoderProfilesProxy r1 = androidx.camera.core.impl.compat.EncoderProfilesProxyCompat.from(r3)     // Catch: java.lang.NullPointerException -> L4c
            goto L70
        L4c:
            r3 = move-exception
            java.lang.String r4 = "Failed to create EncoderProfilesProxy, EncoderProfiles might  contain invalid video profiles. Use CamcorderProfile instead."
            androidx.camera.core.Logger.w(r5, r4, r3)
        L52:
            android.media.CamcorderProfile r0 = android.media.CamcorderProfile.get(r0, r8)     // Catch: java.lang.RuntimeException -> L57
            goto L6a
        L57:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Unable to get CamcorderProfile by quality: "
            r3.<init>(r4)
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            androidx.camera.core.Logger.w(r5, r3, r0)
            r0 = r1
        L6a:
            if (r0 == 0) goto L70
            androidx.camera.core.impl.EncoderProfilesProxy r1 = androidx.camera.core.impl.compat.EncoderProfilesProxyCompat.from(r0)
        L70:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r2.put(r8, r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: t.C1270w.getAll(int):androidx.camera.core.impl.EncoderProfilesProxy");
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public final boolean hasProfile(int i) {
        if (this.f27387a) {
            return CamcorderProfile.hasProfile(this.f27389c, i);
        }
        return false;
    }
}
