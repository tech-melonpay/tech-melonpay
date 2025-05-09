package q;

import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
import android.os.Build;
import android.security.identity.IdentityCredential;
import android.security.identity.PresentationSession;
import androidx.lifecycle.C0559z;
import java.lang.ref.WeakReference;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import q.i;
import q.k;
import q.m;

/* compiled from: AuthenticationCallbackProvider.java */
/* renamed from: q.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1126b {

    /* renamed from: a, reason: collision with root package name */
    public BiometricPrompt$AuthenticationCallback f25751a;

    /* renamed from: b, reason: collision with root package name */
    public C1125a f25752b;

    /* renamed from: c, reason: collision with root package name */
    public final c f25753c;

    /* compiled from: AuthenticationCallbackProvider.java */
    /* renamed from: q.b$b, reason: collision with other inner class name */
    public static class C0453b {
        public static int a(BiometricPrompt.AuthenticationResult authenticationResult) {
            return authenticationResult.getAuthenticationType();
        }
    }

    /* compiled from: AuthenticationCallbackProvider.java */
    /* renamed from: q.b$c */
    public static class c {
        public void a(int i, CharSequence charSequence) {
            throw null;
        }

        public void b(i.b bVar) {
            throw null;
        }
    }

    public C1126b(k.a aVar) {
        this.f25753c = aVar;
    }

    /* compiled from: AuthenticationCallbackProvider.java */
    /* renamed from: q.b$a */
    public static class a {
        public static BiometricPrompt$AuthenticationCallback a(c cVar) {
            return new C0452a(cVar);
        }

        public static BiometricPrompt.CryptoObject b(BiometricPrompt.AuthenticationResult authenticationResult) {
            return authenticationResult.getCryptoObject();
        }

        /* compiled from: AuthenticationCallbackProvider.java */
        /* renamed from: q.b$a$a, reason: collision with other inner class name */
        public class C0452a extends BiometricPrompt$AuthenticationCallback {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ c f25754a;

            public C0452a(c cVar) {
                this.f25754a = cVar;
            }

            public void onAuthenticationError(int i, CharSequence charSequence) {
                this.f25754a.a(i, charSequence);
            }

            public void onAuthenticationFailed() {
                WeakReference<k> weakReference = ((k.a) this.f25754a).f25811a;
                if (weakReference.get() == null || !weakReference.get().f25795J0) {
                    return;
                }
                k kVar = weakReference.get();
                if (kVar.f25802R0 == null) {
                    kVar.f25802R0 = new C0559z<>();
                }
                k.q(kVar.f25802R0, Boolean.TRUE);
            }

            public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
                BiometricPrompt.CryptoObject b9;
                PresentationSession b10;
                IdentityCredential b11;
                i.c cVar = null;
                if (authenticationResult != null && (b9 = a.b(authenticationResult)) != null) {
                    Cipher d10 = m.b.d(b9);
                    if (d10 != null) {
                        cVar = new i.c(d10);
                    } else {
                        Signature f10 = m.b.f(b9);
                        if (f10 != null) {
                            cVar = new i.c(f10);
                        } else {
                            Mac e10 = m.b.e(b9);
                            if (e10 != null) {
                                cVar = new i.c(e10);
                            } else {
                                int i = Build.VERSION.SDK_INT;
                                if (i >= 30 && (b11 = m.c.b(b9)) != null) {
                                    cVar = new i.c(b11);
                                } else if (i >= 33 && (b10 = m.d.b(b9)) != null) {
                                    cVar = new i.c(b10);
                                }
                            }
                        }
                    }
                }
                int i9 = Build.VERSION.SDK_INT;
                int i10 = -1;
                if (i9 >= 30) {
                    if (authenticationResult != null) {
                        i10 = C0453b.a(authenticationResult);
                    }
                } else if (i9 != 29) {
                    i10 = 2;
                }
                this.f25754a.b(new i.b(cVar, i10));
            }

            public void onAuthenticationHelp(int i, CharSequence charSequence) {
            }
        }
    }
}
