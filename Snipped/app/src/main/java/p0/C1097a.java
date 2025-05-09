package p0;

import android.hardware.fingerprint.FingerprintManager;
import androidx.lifecycle.C0559z;
import java.lang.ref.WeakReference;
import p0.C1098b;
import q.C1125a;
import q.k;

/* compiled from: FingerprintManagerCompat.java */
/* renamed from: p0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1097a extends FingerprintManager.AuthenticationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1098b.a f25581a;

    public C1097a(C1125a c1125a) {
        this.f25581a = c1125a;
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationError(int i, CharSequence charSequence) {
        ((C1125a) this.f25581a).f25750a.f25753c.a(i, charSequence);
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationFailed() {
        WeakReference<k> weakReference = ((k.a) ((C1125a) this.f25581a).f25750a.f25753c).f25811a;
        if (weakReference.get() == null || !weakReference.get().f25795J0) {
            return;
        }
        k kVar = weakReference.get();
        if (kVar.f25802R0 == null) {
            kVar.f25802R0 = new C0559z<>();
        }
        k.q(kVar.f25802R0, Boolean.TRUE);
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationHelp(int i, CharSequence charSequence) {
        WeakReference<k> weakReference = ((k.a) ((C1125a) this.f25581a).f25750a.f25753c).f25811a;
        if (weakReference.get() != null) {
            k kVar = weakReference.get();
            if (kVar.f25801Q0 == null) {
                kVar.f25801Q0 = new C0559z<>();
            }
            k.q(kVar.f25801Q0, charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0042  */
    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onAuthenticationSucceeded(android.hardware.fingerprint.FingerprintManager.AuthenticationResult r4) {
        /*
            r3 = this;
            android.hardware.fingerprint.FingerprintManager$CryptoObject r4 = r4.getCryptoObject()
            r0 = 0
            if (r4 != 0) goto L9
        L7:
            r1 = r0
            goto L38
        L9:
            javax.crypto.Cipher r1 = r4.getCipher()
            if (r1 == 0) goto L19
            p0.b$b r1 = new p0.b$b
            javax.crypto.Cipher r4 = r4.getCipher()
            r1.<init>(r4)
            goto L38
        L19:
            java.security.Signature r1 = r4.getSignature()
            if (r1 == 0) goto L29
            p0.b$b r1 = new p0.b$b
            java.security.Signature r4 = r4.getSignature()
            r1.<init>(r4)
            goto L38
        L29:
            javax.crypto.Mac r1 = r4.getMac()
            if (r1 == 0) goto L7
            p0.b$b r1 = new p0.b$b
            javax.crypto.Mac r4 = r4.getMac()
            r1.<init>(r4)
        L38:
            p0.b$a r4 = r3.f25581a
            q.a r4 = (q.C1125a) r4
            r4.getClass()
            if (r1 != 0) goto L42
            goto L5f
        L42:
            javax.crypto.Cipher r2 = r1.f25584b
            if (r2 == 0) goto L4c
            q.i$c r0 = new q.i$c
            r0.<init>(r2)
            goto L5f
        L4c:
            java.security.Signature r2 = r1.f25583a
            if (r2 == 0) goto L56
            q.i$c r0 = new q.i$c
            r0.<init>(r2)
            goto L5f
        L56:
            javax.crypto.Mac r1 = r1.f25585c
            if (r1 == 0) goto L5f
            q.i$c r0 = new q.i$c
            r0.<init>(r1)
        L5f:
            q.i$b r1 = new q.i$b
            r2 = 2
            r1.<init>(r0, r2)
            q.b r4 = r4.f25750a
            q.b$c r4 = r4.f25753c
            r4.b(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.C1097a.onAuthenticationSucceeded(android.hardware.fingerprint.FingerprintManager$AuthenticationResult):void");
    }
}
