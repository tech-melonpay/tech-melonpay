package com.sumsub.sns.internal.core.domain;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.common.GoogleApiAvailability;
import java.util.Locale;
import ka.C0969n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final a f16393a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f16394a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f16395b;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public b() {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.domain.f.b.<init>():void");
        }

        public final boolean c() {
            return this.f16394a;
        }

        public final boolean d() {
            return this.f16395b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f16394a == bVar.f16394a && this.f16395b == bVar.f16395b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        public int hashCode() {
            boolean z10 = this.f16394a;
            ?? r02 = z10;
            if (z10) {
                r02 = 1;
            }
            int i = r02 * 31;
            boolean z11 = this.f16395b;
            return i + (z11 ? 1 : z11 ? 1 : 0);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("FaceDetectorConfig(mlKit=");
            sb2.append(this.f16394a);
            sb2.append(", tflow=");
            return androidx.camera.core.impl.utils.a.o(sb2, this.f16395b, ')');
        }

        public b(boolean z10, boolean z11) {
            this.f16394a = z10;
            this.f16395b = z11;
        }

        public /* synthetic */ b(boolean z10, boolean z11, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z10, (i & 2) != 0 ? false : z11);
        }
    }

    public final boolean a(Context context) {
        if (context == null) {
            g.a(g.f16396a, "FaceDetectorFactory", "@isGooglePlayServicesAvailable, Context is null", null, 4, null);
            return false;
        }
        try {
            boolean z10 = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0;
            g.a(g.f16396a, "FaceDetectorFactory", "@isGooglePlayServicesAvailable, Has connection to GP Services: " + z10, null, 4, null);
            return z10;
        } catch (Throwable th) {
            g.f16396a.a("FaceDetectorFactory", "@isGooglePlayServicesAvailable, Failed to check GP Services", th);
            return false;
        }
    }

    public final m b(Context context) {
        b a10 = a();
        if (a10.d() && context != null) {
            try {
                g.a(g.f16396a, "FaceDetectorFactory", "Using TensorFlow Face detector", null, 4, null);
                return new o(context.getApplicationContext());
            } catch (Throwable th) {
                g.f16396a.a("FaceDetectorFactory", "Using native Face detector", th);
                return new k();
            }
        }
        if (a(context, a10.c())) {
            g.a(g.f16396a, "FaceDetectorFactory", "MLKit is disabled. Using native Face detector", null, 4, null);
            return new k();
        }
        try {
            Class.forName("com.google.mlkit.vision.face.FaceDetection");
            g.a(g.f16396a, "FaceDetectorFactory", "Using MLKit Face detector", null, 4, null);
            return new j();
        } catch (Throwable th2) {
            g.f16396a.a("FaceDetectorFactory", "Using native Face detector", th2);
            return new k();
        }
    }

    public final boolean a(Context context, boolean z10) {
        String lowerCase;
        g gVar = g.f16396a;
        g.a(gVar, "FaceDetectorFactory", "@isMlKitDisabled, Checking is MLKit disabled", null, 4, null);
        if (!z10) {
            g.a(gVar, "FaceDetectorFactory", "@isMlKitDisabled, MLKit disabled with FF", null, 4, null);
            return true;
        }
        String str = Build.MANUFACTURER;
        if (str != null && (lowerCase = str.toLowerCase(Locale.ROOT)) != null && C0969n.Y(lowerCase, "huawei", false)) {
            g.a(gVar, "FaceDetectorFactory", "@isMlKitDisabled, manufacturer is Huawei", null, 4, null);
            return true;
        }
        if (a(context)) {
            return false;
        }
        g.a(gVar, "FaceDetectorFactory", "@isMlKitDisabled, no connection to GP Services", null, 4, null);
        return true;
    }

    public final b a() {
        boolean z10 = false;
        try {
            JSONObject jSONObject = new JSONObject(com.sumsub.sns.internal.ff.a.f16930a.l().f());
            return new b(jSONObject.optBoolean("mlkit", false), jSONObject.optBoolean("tflow", false));
        } catch (Exception e10) {
            com.sumsub.sns.internal.log.b.b(com.sumsub.sns.internal.log.a.f17535a, "FaceDetectorFactory", "Failed to parse config: " + com.sumsub.sns.internal.ff.a.f16930a.l().f(), e10);
            return new b(z10, z10, 3, null);
        }
    }
}
