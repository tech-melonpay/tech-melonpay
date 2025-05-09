package q;

import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;
import p0.C1098b;

/* compiled from: BiometricManager.java */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final d f25767a;

    /* renamed from: b, reason: collision with root package name */
    public final BiometricManager f25768b;

    /* renamed from: c, reason: collision with root package name */
    public final C1098b f25769c;

    /* compiled from: BiometricManager.java */
    public static class a {
        public static int a(BiometricManager biometricManager) {
            return biometricManager.canAuthenticate();
        }

        public static BiometricManager b(Context context) {
            return (BiometricManager) context.getSystemService(BiometricManager.class);
        }

        public static Method c() {
            try {
                return BiometricManager.class.getMethod("canAuthenticate", BiometricPrompt.CryptoObject.class);
            } catch (NoSuchMethodException unused) {
                return null;
            }
        }
    }

    /* compiled from: BiometricManager.java */
    public static class b {
        public static int a(BiometricManager biometricManager, int i) {
            return biometricManager.canAuthenticate(i);
        }
    }

    /* compiled from: BiometricManager.java */
    public static class c implements d {

        /* renamed from: a, reason: collision with root package name */
        public final Context f25770a;

        public c(Context context) {
            this.f25770a = context.getApplicationContext();
        }
    }

    /* compiled from: BiometricManager.java */
    public interface d {
    }

    public h(c cVar) {
        this.f25767a = cVar;
        int i = Build.VERSION.SDK_INT;
        Context context = cVar.f25770a;
        this.f25768b = i >= 29 ? a.b(context) : null;
        this.f25769c = i <= 29 ? new C1098b(context) : null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x00f4, code lost:
    
        if (b() == 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00f8, code lost:
    
        r9 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x012b, code lost:
    
        if (b() == 0) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(int r12) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q.h.a(int):int");
    }

    public final int b() {
        C1098b c1098b = this.f25769c;
        if (c1098b == null) {
            Log.e("BiometricManager", "Failure in canAuthenticate(). FingerprintManager was null.");
            return 1;
        }
        if (c1098b.d()) {
            return !c1098b.c() ? 11 : 0;
        }
        return 12;
    }
}
