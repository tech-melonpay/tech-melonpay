package q;

import android.os.Build;
import android.security.identity.IdentityCredential;
import android.security.identity.PresentationSession;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.DefaultLifecycleObserver;
import java.lang.ref.WeakReference;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* compiled from: BiometricPrompt.java */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public FragmentManager f25771a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f25772b;

    /* compiled from: BiometricPrompt.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final c f25773a;

        /* renamed from: b, reason: collision with root package name */
        public final int f25774b;

        public b(c cVar, int i) {
            this.f25773a = cVar;
            this.f25774b = i;
        }
    }

    /* compiled from: BiometricPrompt.java */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final CharSequence f25780a;

        /* renamed from: b, reason: collision with root package name */
        public final CharSequence f25781b;

        /* renamed from: c, reason: collision with root package name */
        public final CharSequence f25782c;

        /* compiled from: BiometricPrompt.java */
        public static class a {

            /* renamed from: a, reason: collision with root package name */
            public CharSequence f25783a = null;

            /* renamed from: b, reason: collision with root package name */
            public CharSequence f25784b = null;

            /* renamed from: c, reason: collision with root package name */
            public CharSequence f25785c = null;

            public final d a() {
                if (TextUtils.isEmpty(this.f25783a)) {
                    throw new IllegalArgumentException("Title must be set and non-empty.");
                }
                if (C1127c.b(0)) {
                    if (TextUtils.isEmpty(this.f25785c)) {
                        throw new IllegalArgumentException("Negative text must be set and non-empty.");
                    }
                    TextUtils.isEmpty(this.f25785c);
                    return new d(this.f25783a, this.f25784b, this.f25785c);
                }
                throw new IllegalArgumentException("Authenticator combination is unsupported on API " + Build.VERSION.SDK_INT + ": " + String.valueOf(0));
            }
        }

        public d(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
            this.f25780a = charSequence;
            this.f25781b = charSequence2;
            this.f25782c = charSequence3;
        }
    }

    /* compiled from: BiometricPrompt.java */
    public static class e implements DefaultLifecycleObserver {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<k> f25786a;

        public e(k kVar) {
            this.f25786a = new WeakReference<>(kVar);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onDestroy(androidx.lifecycle.r rVar) {
            WeakReference<k> weakReference = this.f25786a;
            if (weakReference.get() != null) {
                weakReference.get().f25810p = null;
            }
        }
    }

    public static k b(Fragment fragment, boolean z10) {
        Fragment activity = z10 ? fragment.getActivity() : null;
        if (activity == null) {
            activity = fragment.getParentFragment();
        }
        if (activity == null) {
            throw new IllegalStateException("view model not found");
        }
        R0.e eVar = new R0.e(activity.getViewModelStore(), activity.getDefaultViewModelProviderFactory(), activity.getDefaultViewModelCreationExtras());
        kotlin.jvm.internal.b a10 = kotlin.jvm.internal.h.a(k.class);
        String b9 = a10.b();
        if (b9 != null) {
            return (k) eVar.a(a10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b9));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00eb, code lost:
    
        if (r5.getBoolean("has_iris", r2) == false) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(q.i.d r9) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q.i.a(q.i$d):void");
    }

    /* compiled from: BiometricPrompt.java */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final Signature f25775a;

        /* renamed from: b, reason: collision with root package name */
        public final Cipher f25776b;

        /* renamed from: c, reason: collision with root package name */
        public final Mac f25777c;

        /* renamed from: d, reason: collision with root package name */
        public final IdentityCredential f25778d;

        /* renamed from: e, reason: collision with root package name */
        public final PresentationSession f25779e;

        public c(Signature signature) {
            this.f25775a = signature;
            this.f25776b = null;
            this.f25777c = null;
            this.f25778d = null;
            this.f25779e = null;
        }

        public c(Cipher cipher) {
            this.f25775a = null;
            this.f25776b = cipher;
            this.f25777c = null;
            this.f25778d = null;
            this.f25779e = null;
        }

        public c(Mac mac) {
            this.f25775a = null;
            this.f25776b = null;
            this.f25777c = mac;
            this.f25778d = null;
            this.f25779e = null;
        }

        public c(IdentityCredential identityCredential) {
            this.f25775a = null;
            this.f25776b = null;
            this.f25777c = null;
            this.f25778d = identityCredential;
            this.f25779e = null;
        }

        public c(PresentationSession presentationSession) {
            this.f25775a = null;
            this.f25776b = null;
            this.f25777c = null;
            this.f25778d = null;
            this.f25779e = presentationSession;
        }
    }

    /* compiled from: BiometricPrompt.java */
    public static abstract class a {
        public void a() {
        }

        public void b() {
        }

        public void c() {
        }
    }
}
