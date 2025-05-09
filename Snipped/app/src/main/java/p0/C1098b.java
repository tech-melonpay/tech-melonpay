package p0;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.CancellationSignal;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import q.C1125a;
import t0.d;

/* compiled from: FingerprintManagerCompat.java */
@Deprecated
/* renamed from: p0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1098b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f25582a;

    /* compiled from: FingerprintManagerCompat.java */
    /* renamed from: p0.b$a */
    public static abstract class a {
    }

    public C1098b(Context context) {
        this.f25582a = context;
    }

    public static FingerprintManager b(Context context) {
        if (context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
            return (FingerprintManager) context.getSystemService(FingerprintManager.class);
        }
        return null;
    }

    @Deprecated
    public final void a(C0448b c0448b, d dVar, C1125a c1125a) {
        CancellationSignal cancellationSignal;
        CancellationSignal cancellationSignal2;
        FingerprintManager.CryptoObject cryptoObject = null;
        if (dVar != null) {
            synchronized (dVar) {
                try {
                    if (dVar.f27397c == null) {
                        CancellationSignal cancellationSignal3 = new CancellationSignal();
                        dVar.f27397c = cancellationSignal3;
                        if (dVar.f27395a) {
                            cancellationSignal3.cancel();
                        }
                    }
                    cancellationSignal2 = dVar.f27397c;
                } finally {
                }
            }
            cancellationSignal = cancellationSignal2;
        } else {
            cancellationSignal = null;
        }
        FingerprintManager b9 = b(this.f25582a);
        if (b9 != null) {
            if (c0448b != null) {
                Cipher cipher = c0448b.f25584b;
                if (cipher != null) {
                    cryptoObject = new FingerprintManager.CryptoObject(cipher);
                } else {
                    Signature signature = c0448b.f25583a;
                    if (signature != null) {
                        cryptoObject = new FingerprintManager.CryptoObject(signature);
                    } else {
                        Mac mac = c0448b.f25585c;
                        if (mac != null) {
                            cryptoObject = new FingerprintManager.CryptoObject(mac);
                        }
                    }
                }
            }
            b9.authenticate(cryptoObject, cancellationSignal, 0, new C1097a(c1125a), null);
        }
    }

    public final boolean c() {
        FingerprintManager b9 = b(this.f25582a);
        return b9 != null && b9.hasEnrolledFingerprints();
    }

    public final boolean d() {
        FingerprintManager b9 = b(this.f25582a);
        return b9 != null && b9.isHardwareDetected();
    }

    /* compiled from: FingerprintManagerCompat.java */
    /* renamed from: p0.b$b, reason: collision with other inner class name */
    public static class C0448b {

        /* renamed from: a, reason: collision with root package name */
        public final Signature f25583a;

        /* renamed from: b, reason: collision with root package name */
        public final Cipher f25584b;

        /* renamed from: c, reason: collision with root package name */
        public final Mac f25585c;

        public C0448b(Signature signature) {
            this.f25583a = signature;
            this.f25584b = null;
            this.f25585c = null;
        }

        public C0448b(Cipher cipher) {
            this.f25584b = cipher;
            this.f25583a = null;
            this.f25585c = null;
        }

        public C0448b(Mac mac) {
            this.f25585c = mac;
            this.f25584b = null;
            this.f25583a = null;
        }
    }
}
