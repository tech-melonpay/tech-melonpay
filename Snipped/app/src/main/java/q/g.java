package q;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.ActivityC0533g;
import androidx.fragment.app.C0527a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.A;
import androidx.lifecycle.C0559z;
import com.luminary.mobile.R;
import java.lang.ref.WeakReference;
import java.security.Signature;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import p0.C1098b;
import pa.C1124b;
import q.C1126b;
import q.i;
import q.k;
import q.l;

/* compiled from: BiometricFragment.java */
/* loaded from: classes.dex */
public class g extends Fragment {

    /* renamed from: f0, reason: collision with root package name */
    public k f25761f0;

    /* renamed from: g0, reason: collision with root package name */
    public final Handler f25762g0 = new Handler(Looper.getMainLooper());

    /* compiled from: BiometricFragment.java */
    public static class a {
        public static Intent a(KeyguardManager keyguardManager, CharSequence charSequence, CharSequence charSequence2) {
            return keyguardManager.createConfirmDeviceCredentialIntent(charSequence, charSequence2);
        }
    }

    /* compiled from: BiometricFragment.java */
    public static class b {
        public static void a(BiometricPrompt biometricPrompt, BiometricPrompt.CryptoObject cryptoObject, CancellationSignal cancellationSignal, Executor executor, BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallback) {
            biometricPrompt.authenticate(cryptoObject, cancellationSignal, executor, biometricPrompt$AuthenticationCallback);
        }

        public static void b(BiometricPrompt biometricPrompt, CancellationSignal cancellationSignal, Executor executor, BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallback) {
            biometricPrompt.authenticate(cancellationSignal, executor, biometricPrompt$AuthenticationCallback);
        }

        public static BiometricPrompt c(BiometricPrompt.Builder builder) {
            return builder.build();
        }

        public static BiometricPrompt.Builder d(Context context) {
            return new BiometricPrompt.Builder(context);
        }

        public static void e(BiometricPrompt.Builder builder, CharSequence charSequence, Executor executor, DialogInterface.OnClickListener onClickListener) {
            builder.setNegativeButton(charSequence, executor, onClickListener);
        }

        public static void f(BiometricPrompt.Builder builder, CharSequence charSequence) {
            builder.setSubtitle(charSequence);
        }

        public static void g(BiometricPrompt.Builder builder, CharSequence charSequence) {
            builder.setTitle(charSequence);
        }
    }

    /* compiled from: BiometricFragment.java */
    public static class c {
        public static void a(BiometricPrompt.Builder builder, boolean z10) {
            builder.setConfirmationRequired(z10);
        }

        public static void b(BiometricPrompt.Builder builder, boolean z10) {
            builder.setDeviceCredentialAllowed(z10);
        }
    }

    /* compiled from: BiometricFragment.java */
    public static class d {
        public static void a(BiometricPrompt.Builder builder, int i) {
            builder.setAllowedAuthenticators(i);
        }
    }

    /* compiled from: BiometricFragment.java */
    public static class e implements Executor {

        /* renamed from: a, reason: collision with root package name */
        public final Handler f25763a = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.f25763a.post(runnable);
        }
    }

    /* compiled from: BiometricFragment.java */
    public static class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<g> f25764a;

        public f(g gVar) {
            this.f25764a = new WeakReference<>(gVar);
        }

        @Override // java.lang.Runnable
        public final void run() {
            WeakReference<g> weakReference = this.f25764a;
            if (weakReference.get() != null) {
                weakReference.get().w0();
            }
        }
    }

    /* compiled from: BiometricFragment.java */
    /* renamed from: q.g$g, reason: collision with other inner class name */
    public static class RunnableC0454g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<k> f25765a;

        public RunnableC0454g(k kVar) {
            this.f25765a = new WeakReference<>(kVar);
        }

        @Override // java.lang.Runnable
        public final void run() {
            WeakReference<k> weakReference = this.f25765a;
            if (weakReference.get() != null) {
                weakReference.get().f25797L0 = false;
            }
        }
    }

    /* compiled from: BiometricFragment.java */
    public static class h implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<k> f25766a;

        public h(k kVar) {
            this.f25766a = new WeakReference<>(kVar);
        }

        @Override // java.lang.Runnable
        public final void run() {
            WeakReference<k> weakReference = this.f25766a;
            if (weakReference.get() != null) {
                weakReference.get().f25798M0 = false;
            }
        }
    }

    public final void c(int i) {
        if (i == 3 || !this.f25761f0.f25798M0) {
            if (q0()) {
                this.f25761f0.f25793H0 = i;
                if (i == 1) {
                    t0(10, C1124b.B(getContext(), 10));
                }
            }
            k kVar = this.f25761f0;
            if (kVar.f25790E0 == null) {
                kVar.f25790E0 = new l();
            }
            l lVar = kVar.f25790E0;
            CancellationSignal cancellationSignal = lVar.f25815b;
            if (cancellationSignal != null) {
                try {
                    l.b.a(cancellationSignal);
                } catch (NullPointerException e10) {
                    Log.e("CancelSignalProvider", "Got NPE while canceling biometric authentication.", e10);
                }
                lVar.f25815b = null;
            }
            t0.d dVar = lVar.f25816c;
            if (dVar != null) {
                try {
                    dVar.a();
                } catch (NullPointerException e11) {
                    Log.e("CancelSignalProvider", "Got NPE while canceling fingerprint authentication.", e11);
                }
                lVar.f25816c = null;
            }
        }
    }

    public final void dismiss() {
        o0();
        k kVar = this.f25761f0;
        kVar.f25794I0 = false;
        if (!kVar.f25796K0 && isAdded()) {
            FragmentManager parentFragmentManager = getParentFragmentManager();
            parentFragmentManager.getClass();
            C0527a c0527a = new C0527a(parentFragmentManager);
            c0527a.l(this);
            c0527a.i(true, true);
        }
        Context context = getContext();
        if (context != null) {
            String str = Build.MODEL;
            if (Build.VERSION.SDK_INT == 29 && str != null) {
                for (String str2 : context.getResources().getStringArray(R.array.delay_showing_prompt_models)) {
                    if (str.equals(str2)) {
                        k kVar2 = this.f25761f0;
                        kVar2.f25797L0 = true;
                        this.f25762g0.postDelayed(new RunnableC0454g(kVar2), 600L);
                        return;
                    }
                }
            }
        }
    }

    public final void o0() {
        this.f25761f0.f25794I0 = false;
        if (isAdded()) {
            FragmentManager parentFragmentManager = getParentFragmentManager();
            n nVar = (n) parentFragmentManager.G("androidx.biometric.FingerprintDialogFragment");
            if (nVar != null) {
                if (nVar.isAdded()) {
                    nVar.dismissAllowingStateLoss();
                    return;
                }
                C0527a c0527a = new C0527a(parentFragmentManager);
                c0527a.l(nVar);
                c0527a.i(true, true);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i9, Intent intent) {
        super.onActivityResult(i, i9, intent);
        int i10 = 1;
        if (i == 1) {
            k kVar = this.f25761f0;
            kVar.f25796K0 = false;
            if (i9 != -1) {
                s0(10, getString(R.string.generic_error_user_canceled));
                return;
            }
            if (kVar.N0) {
                kVar.N0 = false;
                i10 = -1;
            }
            u0(new i.b(null, i10));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f25761f0 == null) {
            this.f25761f0 = i.b(this, getArguments().getBoolean("host_activity", true));
        }
        k kVar = this.f25761f0;
        ActivityC0533g activity = getActivity();
        kVar.getClass();
        new WeakReference(activity);
        k kVar2 = this.f25761f0;
        if (kVar2.f25799O0 == null) {
            kVar2.f25799O0 = new C0559z<>();
        }
        final int i = 0;
        kVar2.f25799O0.observe(this, new A(this) { // from class: q.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f25760b;

            {
                this.f25760b = this;
            }

            @Override // androidx.lifecycle.A
            public final void onChanged(Object obj) {
                int i9;
                KeyguardManager a10;
                switch (i) {
                    case 0:
                        i.b bVar = (i.b) obj;
                        g gVar = this.f25760b;
                        if (bVar != null) {
                            gVar.u0(bVar);
                            k kVar3 = gVar.f25761f0;
                            if (kVar3.f25799O0 == null) {
                                kVar3.f25799O0 = new C0559z<>();
                            }
                            k.q(kVar3.f25799O0, null);
                            break;
                        } else {
                            gVar.getClass();
                            break;
                        }
                    case 1:
                        d dVar = (d) obj;
                        g gVar2 = this.f25760b;
                        gVar2.getClass();
                        if (dVar != null) {
                            int i10 = dVar.f25755a;
                            switch (i10) {
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                    break;
                                case 6:
                                default:
                                    i10 = 8;
                                    break;
                            }
                            Context context = gVar2.getContext();
                            int i11 = Build.VERSION.SDK_INT;
                            if (i11 >= 29 || !((i10 == 7 || i10 == 9) && context != null && (a10 = p.a(context)) != null && p.b(a10) && C1127c.a(gVar2.f25761f0.k()))) {
                                boolean q02 = gVar2.q0();
                                CharSequence charSequence = dVar.f25756b;
                                if (q02) {
                                    if (charSequence == null) {
                                        charSequence = C1124b.B(gVar2.getContext(), i10);
                                    }
                                    if (i10 == 5) {
                                        int i12 = gVar2.f25761f0.f25793H0;
                                        if (i12 == 0 || i12 == 3) {
                                            gVar2.t0(i10, charSequence);
                                        }
                                        gVar2.dismiss();
                                    } else {
                                        if (gVar2.f25761f0.f25804T0) {
                                            gVar2.s0(i10, charSequence);
                                        } else {
                                            gVar2.v0(charSequence);
                                            Handler handler = gVar2.f25762g0;
                                            Z0.a aVar = new Z0.a(gVar2, i10, charSequence, 3);
                                            Context context2 = gVar2.getContext();
                                            if (context2 != null) {
                                                String str = Build.MODEL;
                                                if (i11 == 28 && str != null) {
                                                    i9 = 0;
                                                    for (String str2 : context2.getResources().getStringArray(R.array.hide_fingerprint_instantly_prefixes)) {
                                                        if (str.startsWith(str2)) {
                                                            handler.postDelayed(aVar, i9);
                                                        }
                                                    }
                                                }
                                            }
                                            i9 = 2000;
                                            handler.postDelayed(aVar, i9);
                                        }
                                        gVar2.f25761f0.f25804T0 = true;
                                    }
                                } else {
                                    if (charSequence == null) {
                                        charSequence = gVar2.getString(R.string.default_error_msg) + " " + i10;
                                    }
                                    gVar2.s0(i10, charSequence);
                                }
                            } else {
                                gVar2.r0();
                            }
                            gVar2.f25761f0.m(null);
                            break;
                        }
                        break;
                    case 2:
                        CharSequence charSequence2 = (CharSequence) obj;
                        g gVar3 = this.f25760b;
                        if (charSequence2 != null) {
                            if (gVar3.q0()) {
                                gVar3.v0(charSequence2);
                            }
                            gVar3.f25761f0.m(null);
                            break;
                        } else {
                            gVar3.getClass();
                            break;
                        }
                    case 3:
                        g gVar4 = this.f25760b;
                        gVar4.getClass();
                        if (((Boolean) obj).booleanValue()) {
                            if (gVar4.q0()) {
                                gVar4.v0(gVar4.getString(R.string.fingerprint_not_recognized));
                            }
                            k kVar4 = gVar4.f25761f0;
                            if (kVar4.f25795J0) {
                                Executor executor = kVar4.f25809k;
                                if (executor == null) {
                                    executor = new k.b();
                                }
                                executor.execute(new e(gVar4, 3));
                            } else {
                                Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                            }
                            k kVar5 = gVar4.f25761f0;
                            if (kVar5.f25802R0 == null) {
                                kVar5.f25802R0 = new C0559z<>();
                            }
                            k.q(kVar5.f25802R0, Boolean.FALSE);
                            break;
                        }
                        break;
                    case 4:
                        g gVar5 = this.f25760b;
                        gVar5.getClass();
                        if (((Boolean) obj).booleanValue()) {
                            if (gVar5.p0()) {
                                gVar5.r0();
                            } else {
                                CharSequence l10 = gVar5.f25761f0.l();
                                if (l10 == null) {
                                    l10 = gVar5.getString(R.string.default_error_msg);
                                }
                                gVar5.s0(13, l10);
                                gVar5.c(2);
                            }
                            gVar5.f25761f0.p(false);
                            break;
                        }
                        break;
                    default:
                        g gVar6 = this.f25760b;
                        gVar6.getClass();
                        if (((Boolean) obj).booleanValue()) {
                            gVar6.c(1);
                            gVar6.dismiss();
                            k kVar6 = gVar6.f25761f0;
                            if (kVar6.f25805U0 == null) {
                                kVar6.f25805U0 = new C0559z<>();
                            }
                            k.q(kVar6.f25805U0, Boolean.FALSE);
                            break;
                        }
                        break;
                }
            }
        });
        k kVar3 = this.f25761f0;
        if (kVar3.f25800P0 == null) {
            kVar3.f25800P0 = new C0559z<>();
        }
        final int i9 = 1;
        kVar3.f25800P0.observe(this, new A(this) { // from class: q.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f25760b;

            {
                this.f25760b = this;
            }

            @Override // androidx.lifecycle.A
            public final void onChanged(Object obj) {
                int i92;
                KeyguardManager a10;
                switch (i9) {
                    case 0:
                        i.b bVar = (i.b) obj;
                        g gVar = this.f25760b;
                        if (bVar != null) {
                            gVar.u0(bVar);
                            k kVar32 = gVar.f25761f0;
                            if (kVar32.f25799O0 == null) {
                                kVar32.f25799O0 = new C0559z<>();
                            }
                            k.q(kVar32.f25799O0, null);
                            break;
                        } else {
                            gVar.getClass();
                            break;
                        }
                    case 1:
                        d dVar = (d) obj;
                        g gVar2 = this.f25760b;
                        gVar2.getClass();
                        if (dVar != null) {
                            int i10 = dVar.f25755a;
                            switch (i10) {
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                    break;
                                case 6:
                                default:
                                    i10 = 8;
                                    break;
                            }
                            Context context = gVar2.getContext();
                            int i11 = Build.VERSION.SDK_INT;
                            if (i11 >= 29 || !((i10 == 7 || i10 == 9) && context != null && (a10 = p.a(context)) != null && p.b(a10) && C1127c.a(gVar2.f25761f0.k()))) {
                                boolean q02 = gVar2.q0();
                                CharSequence charSequence = dVar.f25756b;
                                if (q02) {
                                    if (charSequence == null) {
                                        charSequence = C1124b.B(gVar2.getContext(), i10);
                                    }
                                    if (i10 == 5) {
                                        int i12 = gVar2.f25761f0.f25793H0;
                                        if (i12 == 0 || i12 == 3) {
                                            gVar2.t0(i10, charSequence);
                                        }
                                        gVar2.dismiss();
                                    } else {
                                        if (gVar2.f25761f0.f25804T0) {
                                            gVar2.s0(i10, charSequence);
                                        } else {
                                            gVar2.v0(charSequence);
                                            Handler handler = gVar2.f25762g0;
                                            Z0.a aVar = new Z0.a(gVar2, i10, charSequence, 3);
                                            Context context2 = gVar2.getContext();
                                            if (context2 != null) {
                                                String str = Build.MODEL;
                                                if (i11 == 28 && str != null) {
                                                    i92 = 0;
                                                    for (String str2 : context2.getResources().getStringArray(R.array.hide_fingerprint_instantly_prefixes)) {
                                                        if (str.startsWith(str2)) {
                                                            handler.postDelayed(aVar, i92);
                                                        }
                                                    }
                                                }
                                            }
                                            i92 = 2000;
                                            handler.postDelayed(aVar, i92);
                                        }
                                        gVar2.f25761f0.f25804T0 = true;
                                    }
                                } else {
                                    if (charSequence == null) {
                                        charSequence = gVar2.getString(R.string.default_error_msg) + " " + i10;
                                    }
                                    gVar2.s0(i10, charSequence);
                                }
                            } else {
                                gVar2.r0();
                            }
                            gVar2.f25761f0.m(null);
                            break;
                        }
                        break;
                    case 2:
                        CharSequence charSequence2 = (CharSequence) obj;
                        g gVar3 = this.f25760b;
                        if (charSequence2 != null) {
                            if (gVar3.q0()) {
                                gVar3.v0(charSequence2);
                            }
                            gVar3.f25761f0.m(null);
                            break;
                        } else {
                            gVar3.getClass();
                            break;
                        }
                    case 3:
                        g gVar4 = this.f25760b;
                        gVar4.getClass();
                        if (((Boolean) obj).booleanValue()) {
                            if (gVar4.q0()) {
                                gVar4.v0(gVar4.getString(R.string.fingerprint_not_recognized));
                            }
                            k kVar4 = gVar4.f25761f0;
                            if (kVar4.f25795J0) {
                                Executor executor = kVar4.f25809k;
                                if (executor == null) {
                                    executor = new k.b();
                                }
                                executor.execute(new e(gVar4, 3));
                            } else {
                                Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                            }
                            k kVar5 = gVar4.f25761f0;
                            if (kVar5.f25802R0 == null) {
                                kVar5.f25802R0 = new C0559z<>();
                            }
                            k.q(kVar5.f25802R0, Boolean.FALSE);
                            break;
                        }
                        break;
                    case 4:
                        g gVar5 = this.f25760b;
                        gVar5.getClass();
                        if (((Boolean) obj).booleanValue()) {
                            if (gVar5.p0()) {
                                gVar5.r0();
                            } else {
                                CharSequence l10 = gVar5.f25761f0.l();
                                if (l10 == null) {
                                    l10 = gVar5.getString(R.string.default_error_msg);
                                }
                                gVar5.s0(13, l10);
                                gVar5.c(2);
                            }
                            gVar5.f25761f0.p(false);
                            break;
                        }
                        break;
                    default:
                        g gVar6 = this.f25760b;
                        gVar6.getClass();
                        if (((Boolean) obj).booleanValue()) {
                            gVar6.c(1);
                            gVar6.dismiss();
                            k kVar6 = gVar6.f25761f0;
                            if (kVar6.f25805U0 == null) {
                                kVar6.f25805U0 = new C0559z<>();
                            }
                            k.q(kVar6.f25805U0, Boolean.FALSE);
                            break;
                        }
                        break;
                }
            }
        });
        k kVar4 = this.f25761f0;
        if (kVar4.f25801Q0 == null) {
            kVar4.f25801Q0 = new C0559z<>();
        }
        final int i10 = 2;
        kVar4.f25801Q0.observe(this, new A(this) { // from class: q.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f25760b;

            {
                this.f25760b = this;
            }

            @Override // androidx.lifecycle.A
            public final void onChanged(Object obj) {
                int i92;
                KeyguardManager a10;
                switch (i10) {
                    case 0:
                        i.b bVar = (i.b) obj;
                        g gVar = this.f25760b;
                        if (bVar != null) {
                            gVar.u0(bVar);
                            k kVar32 = gVar.f25761f0;
                            if (kVar32.f25799O0 == null) {
                                kVar32.f25799O0 = new C0559z<>();
                            }
                            k.q(kVar32.f25799O0, null);
                            break;
                        } else {
                            gVar.getClass();
                            break;
                        }
                    case 1:
                        d dVar = (d) obj;
                        g gVar2 = this.f25760b;
                        gVar2.getClass();
                        if (dVar != null) {
                            int i102 = dVar.f25755a;
                            switch (i102) {
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                    break;
                                case 6:
                                default:
                                    i102 = 8;
                                    break;
                            }
                            Context context = gVar2.getContext();
                            int i11 = Build.VERSION.SDK_INT;
                            if (i11 >= 29 || !((i102 == 7 || i102 == 9) && context != null && (a10 = p.a(context)) != null && p.b(a10) && C1127c.a(gVar2.f25761f0.k()))) {
                                boolean q02 = gVar2.q0();
                                CharSequence charSequence = dVar.f25756b;
                                if (q02) {
                                    if (charSequence == null) {
                                        charSequence = C1124b.B(gVar2.getContext(), i102);
                                    }
                                    if (i102 == 5) {
                                        int i12 = gVar2.f25761f0.f25793H0;
                                        if (i12 == 0 || i12 == 3) {
                                            gVar2.t0(i102, charSequence);
                                        }
                                        gVar2.dismiss();
                                    } else {
                                        if (gVar2.f25761f0.f25804T0) {
                                            gVar2.s0(i102, charSequence);
                                        } else {
                                            gVar2.v0(charSequence);
                                            Handler handler = gVar2.f25762g0;
                                            Z0.a aVar = new Z0.a(gVar2, i102, charSequence, 3);
                                            Context context2 = gVar2.getContext();
                                            if (context2 != null) {
                                                String str = Build.MODEL;
                                                if (i11 == 28 && str != null) {
                                                    i92 = 0;
                                                    for (String str2 : context2.getResources().getStringArray(R.array.hide_fingerprint_instantly_prefixes)) {
                                                        if (str.startsWith(str2)) {
                                                            handler.postDelayed(aVar, i92);
                                                        }
                                                    }
                                                }
                                            }
                                            i92 = 2000;
                                            handler.postDelayed(aVar, i92);
                                        }
                                        gVar2.f25761f0.f25804T0 = true;
                                    }
                                } else {
                                    if (charSequence == null) {
                                        charSequence = gVar2.getString(R.string.default_error_msg) + " " + i102;
                                    }
                                    gVar2.s0(i102, charSequence);
                                }
                            } else {
                                gVar2.r0();
                            }
                            gVar2.f25761f0.m(null);
                            break;
                        }
                        break;
                    case 2:
                        CharSequence charSequence2 = (CharSequence) obj;
                        g gVar3 = this.f25760b;
                        if (charSequence2 != null) {
                            if (gVar3.q0()) {
                                gVar3.v0(charSequence2);
                            }
                            gVar3.f25761f0.m(null);
                            break;
                        } else {
                            gVar3.getClass();
                            break;
                        }
                    case 3:
                        g gVar4 = this.f25760b;
                        gVar4.getClass();
                        if (((Boolean) obj).booleanValue()) {
                            if (gVar4.q0()) {
                                gVar4.v0(gVar4.getString(R.string.fingerprint_not_recognized));
                            }
                            k kVar42 = gVar4.f25761f0;
                            if (kVar42.f25795J0) {
                                Executor executor = kVar42.f25809k;
                                if (executor == null) {
                                    executor = new k.b();
                                }
                                executor.execute(new e(gVar4, 3));
                            } else {
                                Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                            }
                            k kVar5 = gVar4.f25761f0;
                            if (kVar5.f25802R0 == null) {
                                kVar5.f25802R0 = new C0559z<>();
                            }
                            k.q(kVar5.f25802R0, Boolean.FALSE);
                            break;
                        }
                        break;
                    case 4:
                        g gVar5 = this.f25760b;
                        gVar5.getClass();
                        if (((Boolean) obj).booleanValue()) {
                            if (gVar5.p0()) {
                                gVar5.r0();
                            } else {
                                CharSequence l10 = gVar5.f25761f0.l();
                                if (l10 == null) {
                                    l10 = gVar5.getString(R.string.default_error_msg);
                                }
                                gVar5.s0(13, l10);
                                gVar5.c(2);
                            }
                            gVar5.f25761f0.p(false);
                            break;
                        }
                        break;
                    default:
                        g gVar6 = this.f25760b;
                        gVar6.getClass();
                        if (((Boolean) obj).booleanValue()) {
                            gVar6.c(1);
                            gVar6.dismiss();
                            k kVar6 = gVar6.f25761f0;
                            if (kVar6.f25805U0 == null) {
                                kVar6.f25805U0 = new C0559z<>();
                            }
                            k.q(kVar6.f25805U0, Boolean.FALSE);
                            break;
                        }
                        break;
                }
            }
        });
        k kVar5 = this.f25761f0;
        if (kVar5.f25802R0 == null) {
            kVar5.f25802R0 = new C0559z<>();
        }
        final int i11 = 3;
        kVar5.f25802R0.observe(this, new A(this) { // from class: q.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f25760b;

            {
                this.f25760b = this;
            }

            @Override // androidx.lifecycle.A
            public final void onChanged(Object obj) {
                int i92;
                KeyguardManager a10;
                switch (i11) {
                    case 0:
                        i.b bVar = (i.b) obj;
                        g gVar = this.f25760b;
                        if (bVar != null) {
                            gVar.u0(bVar);
                            k kVar32 = gVar.f25761f0;
                            if (kVar32.f25799O0 == null) {
                                kVar32.f25799O0 = new C0559z<>();
                            }
                            k.q(kVar32.f25799O0, null);
                            break;
                        } else {
                            gVar.getClass();
                            break;
                        }
                    case 1:
                        d dVar = (d) obj;
                        g gVar2 = this.f25760b;
                        gVar2.getClass();
                        if (dVar != null) {
                            int i102 = dVar.f25755a;
                            switch (i102) {
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                    break;
                                case 6:
                                default:
                                    i102 = 8;
                                    break;
                            }
                            Context context = gVar2.getContext();
                            int i112 = Build.VERSION.SDK_INT;
                            if (i112 >= 29 || !((i102 == 7 || i102 == 9) && context != null && (a10 = p.a(context)) != null && p.b(a10) && C1127c.a(gVar2.f25761f0.k()))) {
                                boolean q02 = gVar2.q0();
                                CharSequence charSequence = dVar.f25756b;
                                if (q02) {
                                    if (charSequence == null) {
                                        charSequence = C1124b.B(gVar2.getContext(), i102);
                                    }
                                    if (i102 == 5) {
                                        int i12 = gVar2.f25761f0.f25793H0;
                                        if (i12 == 0 || i12 == 3) {
                                            gVar2.t0(i102, charSequence);
                                        }
                                        gVar2.dismiss();
                                    } else {
                                        if (gVar2.f25761f0.f25804T0) {
                                            gVar2.s0(i102, charSequence);
                                        } else {
                                            gVar2.v0(charSequence);
                                            Handler handler = gVar2.f25762g0;
                                            Z0.a aVar = new Z0.a(gVar2, i102, charSequence, 3);
                                            Context context2 = gVar2.getContext();
                                            if (context2 != null) {
                                                String str = Build.MODEL;
                                                if (i112 == 28 && str != null) {
                                                    i92 = 0;
                                                    for (String str2 : context2.getResources().getStringArray(R.array.hide_fingerprint_instantly_prefixes)) {
                                                        if (str.startsWith(str2)) {
                                                            handler.postDelayed(aVar, i92);
                                                        }
                                                    }
                                                }
                                            }
                                            i92 = 2000;
                                            handler.postDelayed(aVar, i92);
                                        }
                                        gVar2.f25761f0.f25804T0 = true;
                                    }
                                } else {
                                    if (charSequence == null) {
                                        charSequence = gVar2.getString(R.string.default_error_msg) + " " + i102;
                                    }
                                    gVar2.s0(i102, charSequence);
                                }
                            } else {
                                gVar2.r0();
                            }
                            gVar2.f25761f0.m(null);
                            break;
                        }
                        break;
                    case 2:
                        CharSequence charSequence2 = (CharSequence) obj;
                        g gVar3 = this.f25760b;
                        if (charSequence2 != null) {
                            if (gVar3.q0()) {
                                gVar3.v0(charSequence2);
                            }
                            gVar3.f25761f0.m(null);
                            break;
                        } else {
                            gVar3.getClass();
                            break;
                        }
                    case 3:
                        g gVar4 = this.f25760b;
                        gVar4.getClass();
                        if (((Boolean) obj).booleanValue()) {
                            if (gVar4.q0()) {
                                gVar4.v0(gVar4.getString(R.string.fingerprint_not_recognized));
                            }
                            k kVar42 = gVar4.f25761f0;
                            if (kVar42.f25795J0) {
                                Executor executor = kVar42.f25809k;
                                if (executor == null) {
                                    executor = new k.b();
                                }
                                executor.execute(new e(gVar4, 3));
                            } else {
                                Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                            }
                            k kVar52 = gVar4.f25761f0;
                            if (kVar52.f25802R0 == null) {
                                kVar52.f25802R0 = new C0559z<>();
                            }
                            k.q(kVar52.f25802R0, Boolean.FALSE);
                            break;
                        }
                        break;
                    case 4:
                        g gVar5 = this.f25760b;
                        gVar5.getClass();
                        if (((Boolean) obj).booleanValue()) {
                            if (gVar5.p0()) {
                                gVar5.r0();
                            } else {
                                CharSequence l10 = gVar5.f25761f0.l();
                                if (l10 == null) {
                                    l10 = gVar5.getString(R.string.default_error_msg);
                                }
                                gVar5.s0(13, l10);
                                gVar5.c(2);
                            }
                            gVar5.f25761f0.p(false);
                            break;
                        }
                        break;
                    default:
                        g gVar6 = this.f25760b;
                        gVar6.getClass();
                        if (((Boolean) obj).booleanValue()) {
                            gVar6.c(1);
                            gVar6.dismiss();
                            k kVar6 = gVar6.f25761f0;
                            if (kVar6.f25805U0 == null) {
                                kVar6.f25805U0 = new C0559z<>();
                            }
                            k.q(kVar6.f25805U0, Boolean.FALSE);
                            break;
                        }
                        break;
                }
            }
        });
        k kVar6 = this.f25761f0;
        if (kVar6.f25803S0 == null) {
            kVar6.f25803S0 = new C0559z<>();
        }
        final int i12 = 4;
        kVar6.f25803S0.observe(this, new A(this) { // from class: q.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f25760b;

            {
                this.f25760b = this;
            }

            @Override // androidx.lifecycle.A
            public final void onChanged(Object obj) {
                int i92;
                KeyguardManager a10;
                switch (i12) {
                    case 0:
                        i.b bVar = (i.b) obj;
                        g gVar = this.f25760b;
                        if (bVar != null) {
                            gVar.u0(bVar);
                            k kVar32 = gVar.f25761f0;
                            if (kVar32.f25799O0 == null) {
                                kVar32.f25799O0 = new C0559z<>();
                            }
                            k.q(kVar32.f25799O0, null);
                            break;
                        } else {
                            gVar.getClass();
                            break;
                        }
                    case 1:
                        d dVar = (d) obj;
                        g gVar2 = this.f25760b;
                        gVar2.getClass();
                        if (dVar != null) {
                            int i102 = dVar.f25755a;
                            switch (i102) {
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                    break;
                                case 6:
                                default:
                                    i102 = 8;
                                    break;
                            }
                            Context context = gVar2.getContext();
                            int i112 = Build.VERSION.SDK_INT;
                            if (i112 >= 29 || !((i102 == 7 || i102 == 9) && context != null && (a10 = p.a(context)) != null && p.b(a10) && C1127c.a(gVar2.f25761f0.k()))) {
                                boolean q02 = gVar2.q0();
                                CharSequence charSequence = dVar.f25756b;
                                if (q02) {
                                    if (charSequence == null) {
                                        charSequence = C1124b.B(gVar2.getContext(), i102);
                                    }
                                    if (i102 == 5) {
                                        int i122 = gVar2.f25761f0.f25793H0;
                                        if (i122 == 0 || i122 == 3) {
                                            gVar2.t0(i102, charSequence);
                                        }
                                        gVar2.dismiss();
                                    } else {
                                        if (gVar2.f25761f0.f25804T0) {
                                            gVar2.s0(i102, charSequence);
                                        } else {
                                            gVar2.v0(charSequence);
                                            Handler handler = gVar2.f25762g0;
                                            Z0.a aVar = new Z0.a(gVar2, i102, charSequence, 3);
                                            Context context2 = gVar2.getContext();
                                            if (context2 != null) {
                                                String str = Build.MODEL;
                                                if (i112 == 28 && str != null) {
                                                    i92 = 0;
                                                    for (String str2 : context2.getResources().getStringArray(R.array.hide_fingerprint_instantly_prefixes)) {
                                                        if (str.startsWith(str2)) {
                                                            handler.postDelayed(aVar, i92);
                                                        }
                                                    }
                                                }
                                            }
                                            i92 = 2000;
                                            handler.postDelayed(aVar, i92);
                                        }
                                        gVar2.f25761f0.f25804T0 = true;
                                    }
                                } else {
                                    if (charSequence == null) {
                                        charSequence = gVar2.getString(R.string.default_error_msg) + " " + i102;
                                    }
                                    gVar2.s0(i102, charSequence);
                                }
                            } else {
                                gVar2.r0();
                            }
                            gVar2.f25761f0.m(null);
                            break;
                        }
                        break;
                    case 2:
                        CharSequence charSequence2 = (CharSequence) obj;
                        g gVar3 = this.f25760b;
                        if (charSequence2 != null) {
                            if (gVar3.q0()) {
                                gVar3.v0(charSequence2);
                            }
                            gVar3.f25761f0.m(null);
                            break;
                        } else {
                            gVar3.getClass();
                            break;
                        }
                    case 3:
                        g gVar4 = this.f25760b;
                        gVar4.getClass();
                        if (((Boolean) obj).booleanValue()) {
                            if (gVar4.q0()) {
                                gVar4.v0(gVar4.getString(R.string.fingerprint_not_recognized));
                            }
                            k kVar42 = gVar4.f25761f0;
                            if (kVar42.f25795J0) {
                                Executor executor = kVar42.f25809k;
                                if (executor == null) {
                                    executor = new k.b();
                                }
                                executor.execute(new e(gVar4, 3));
                            } else {
                                Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                            }
                            k kVar52 = gVar4.f25761f0;
                            if (kVar52.f25802R0 == null) {
                                kVar52.f25802R0 = new C0559z<>();
                            }
                            k.q(kVar52.f25802R0, Boolean.FALSE);
                            break;
                        }
                        break;
                    case 4:
                        g gVar5 = this.f25760b;
                        gVar5.getClass();
                        if (((Boolean) obj).booleanValue()) {
                            if (gVar5.p0()) {
                                gVar5.r0();
                            } else {
                                CharSequence l10 = gVar5.f25761f0.l();
                                if (l10 == null) {
                                    l10 = gVar5.getString(R.string.default_error_msg);
                                }
                                gVar5.s0(13, l10);
                                gVar5.c(2);
                            }
                            gVar5.f25761f0.p(false);
                            break;
                        }
                        break;
                    default:
                        g gVar6 = this.f25760b;
                        gVar6.getClass();
                        if (((Boolean) obj).booleanValue()) {
                            gVar6.c(1);
                            gVar6.dismiss();
                            k kVar62 = gVar6.f25761f0;
                            if (kVar62.f25805U0 == null) {
                                kVar62.f25805U0 = new C0559z<>();
                            }
                            k.q(kVar62.f25805U0, Boolean.FALSE);
                            break;
                        }
                        break;
                }
            }
        });
        k kVar7 = this.f25761f0;
        if (kVar7.f25805U0 == null) {
            kVar7.f25805U0 = new C0559z<>();
        }
        final int i13 = 5;
        kVar7.f25805U0.observe(this, new A(this) { // from class: q.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f25760b;

            {
                this.f25760b = this;
            }

            @Override // androidx.lifecycle.A
            public final void onChanged(Object obj) {
                int i92;
                KeyguardManager a10;
                switch (i13) {
                    case 0:
                        i.b bVar = (i.b) obj;
                        g gVar = this.f25760b;
                        if (bVar != null) {
                            gVar.u0(bVar);
                            k kVar32 = gVar.f25761f0;
                            if (kVar32.f25799O0 == null) {
                                kVar32.f25799O0 = new C0559z<>();
                            }
                            k.q(kVar32.f25799O0, null);
                            break;
                        } else {
                            gVar.getClass();
                            break;
                        }
                    case 1:
                        d dVar = (d) obj;
                        g gVar2 = this.f25760b;
                        gVar2.getClass();
                        if (dVar != null) {
                            int i102 = dVar.f25755a;
                            switch (i102) {
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                    break;
                                case 6:
                                default:
                                    i102 = 8;
                                    break;
                            }
                            Context context = gVar2.getContext();
                            int i112 = Build.VERSION.SDK_INT;
                            if (i112 >= 29 || !((i102 == 7 || i102 == 9) && context != null && (a10 = p.a(context)) != null && p.b(a10) && C1127c.a(gVar2.f25761f0.k()))) {
                                boolean q02 = gVar2.q0();
                                CharSequence charSequence = dVar.f25756b;
                                if (q02) {
                                    if (charSequence == null) {
                                        charSequence = C1124b.B(gVar2.getContext(), i102);
                                    }
                                    if (i102 == 5) {
                                        int i122 = gVar2.f25761f0.f25793H0;
                                        if (i122 == 0 || i122 == 3) {
                                            gVar2.t0(i102, charSequence);
                                        }
                                        gVar2.dismiss();
                                    } else {
                                        if (gVar2.f25761f0.f25804T0) {
                                            gVar2.s0(i102, charSequence);
                                        } else {
                                            gVar2.v0(charSequence);
                                            Handler handler = gVar2.f25762g0;
                                            Z0.a aVar = new Z0.a(gVar2, i102, charSequence, 3);
                                            Context context2 = gVar2.getContext();
                                            if (context2 != null) {
                                                String str = Build.MODEL;
                                                if (i112 == 28 && str != null) {
                                                    i92 = 0;
                                                    for (String str2 : context2.getResources().getStringArray(R.array.hide_fingerprint_instantly_prefixes)) {
                                                        if (str.startsWith(str2)) {
                                                            handler.postDelayed(aVar, i92);
                                                        }
                                                    }
                                                }
                                            }
                                            i92 = 2000;
                                            handler.postDelayed(aVar, i92);
                                        }
                                        gVar2.f25761f0.f25804T0 = true;
                                    }
                                } else {
                                    if (charSequence == null) {
                                        charSequence = gVar2.getString(R.string.default_error_msg) + " " + i102;
                                    }
                                    gVar2.s0(i102, charSequence);
                                }
                            } else {
                                gVar2.r0();
                            }
                            gVar2.f25761f0.m(null);
                            break;
                        }
                        break;
                    case 2:
                        CharSequence charSequence2 = (CharSequence) obj;
                        g gVar3 = this.f25760b;
                        if (charSequence2 != null) {
                            if (gVar3.q0()) {
                                gVar3.v0(charSequence2);
                            }
                            gVar3.f25761f0.m(null);
                            break;
                        } else {
                            gVar3.getClass();
                            break;
                        }
                    case 3:
                        g gVar4 = this.f25760b;
                        gVar4.getClass();
                        if (((Boolean) obj).booleanValue()) {
                            if (gVar4.q0()) {
                                gVar4.v0(gVar4.getString(R.string.fingerprint_not_recognized));
                            }
                            k kVar42 = gVar4.f25761f0;
                            if (kVar42.f25795J0) {
                                Executor executor = kVar42.f25809k;
                                if (executor == null) {
                                    executor = new k.b();
                                }
                                executor.execute(new e(gVar4, 3));
                            } else {
                                Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                            }
                            k kVar52 = gVar4.f25761f0;
                            if (kVar52.f25802R0 == null) {
                                kVar52.f25802R0 = new C0559z<>();
                            }
                            k.q(kVar52.f25802R0, Boolean.FALSE);
                            break;
                        }
                        break;
                    case 4:
                        g gVar5 = this.f25760b;
                        gVar5.getClass();
                        if (((Boolean) obj).booleanValue()) {
                            if (gVar5.p0()) {
                                gVar5.r0();
                            } else {
                                CharSequence l10 = gVar5.f25761f0.l();
                                if (l10 == null) {
                                    l10 = gVar5.getString(R.string.default_error_msg);
                                }
                                gVar5.s0(13, l10);
                                gVar5.c(2);
                            }
                            gVar5.f25761f0.p(false);
                            break;
                        }
                        break;
                    default:
                        g gVar6 = this.f25760b;
                        gVar6.getClass();
                        if (((Boolean) obj).booleanValue()) {
                            gVar6.c(1);
                            gVar6.dismiss();
                            k kVar62 = gVar6.f25761f0;
                            if (kVar62.f25805U0 == null) {
                                kVar62.f25805U0 = new C0559z<>();
                            }
                            k.q(kVar62.f25805U0, Boolean.FALSE);
                            break;
                        }
                        break;
                }
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        if (Build.VERSION.SDK_INT == 29 && C1127c.a(this.f25761f0.k())) {
            k kVar = this.f25761f0;
            kVar.f25798M0 = true;
            this.f25762g0.postDelayed(new h(kVar), 250L);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        if (Build.VERSION.SDK_INT >= 29 || this.f25761f0.f25796K0) {
            return;
        }
        ActivityC0533g activity = getActivity();
        if (activity == null || !activity.isChangingConfigurations()) {
            c(0);
        }
    }

    public final boolean p0() {
        return Build.VERSION.SDK_INT <= 28 && C1127c.a(this.f25761f0.k());
    }

    public final boolean q0() {
        int i = Build.VERSION.SDK_INT;
        if (i < 28) {
            return true;
        }
        Context context = getContext();
        if (context != null && this.f25761f0.f25788C0 != null) {
            String str = Build.MANUFACTURER;
            String str2 = Build.MODEL;
            if (i == 28) {
                if (str != null) {
                    for (String str3 : context.getResources().getStringArray(R.array.crypto_fingerprint_fallback_vendors)) {
                        if (str.equalsIgnoreCase(str3)) {
                            return true;
                        }
                    }
                }
                if (str2 != null) {
                    for (String str4 : context.getResources().getStringArray(R.array.crypto_fingerprint_fallback_prefixes)) {
                        if (str2.startsWith(str4)) {
                            return true;
                        }
                    }
                }
            }
        }
        if (i == 28) {
            Bundle arguments = getArguments();
            Context context2 = getContext();
            if (!arguments.getBoolean("has_fingerprint", (context2 == null || context2.getPackageManager() == null || !q.a(context2.getPackageManager())) ? false : true)) {
                return true;
            }
        }
        return false;
    }

    public final void r0() {
        Context context = getContext();
        KeyguardManager a10 = context != null ? p.a(context) : null;
        if (a10 == null) {
            s0(12, getString(R.string.generic_error_no_keyguard));
            return;
        }
        k kVar = this.f25761f0;
        i.d dVar = kVar.f25787B0;
        CharSequence charSequence = dVar != null ? dVar.f25780a : null;
        CharSequence charSequence2 = dVar != null ? dVar.f25781b : null;
        kVar.getClass();
        Intent a11 = a.a(a10, charSequence, charSequence2 != null ? charSequence2 : null);
        if (a11 == null) {
            s0(14, getString(R.string.generic_error_no_device_credential));
            return;
        }
        this.f25761f0.f25796K0 = true;
        if (q0()) {
            o0();
        }
        a11.setFlags(134742016);
        startActivityForResult(a11, 1);
    }

    public final void s0(int i, CharSequence charSequence) {
        t0(i, charSequence);
        dismiss();
    }

    public final void t0(int i, CharSequence charSequence) {
        k kVar = this.f25761f0;
        if (kVar.f25796K0) {
            Log.v("BiometricFragment", "Error not sent to client. User is confirming their device credential.");
            return;
        }
        if (!kVar.f25795J0) {
            Log.w("BiometricFragment", "Error not sent to client. Client is not awaiting a result.");
            return;
        }
        kVar.f25795J0 = false;
        Executor executor = kVar.f25809k;
        if (executor == null) {
            executor = new k.b();
        }
        executor.execute(new q.e(this, i, charSequence));
    }

    public final void u0(i.b bVar) {
        k kVar = this.f25761f0;
        if (kVar.f25795J0) {
            kVar.f25795J0 = false;
            Executor executor = kVar.f25809k;
            if (executor == null) {
                executor = new k.b();
            }
            executor.execute(new q.e(this, bVar));
        } else {
            Log.w("BiometricFragment", "Success not sent to client. Client is not awaiting a result.");
        }
        dismiss();
    }

    public final void v0(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = getString(R.string.default_error_msg);
        }
        this.f25761f0.o(2);
        this.f25761f0.n(charSequence);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void w0() {
        int i;
        if (this.f25761f0.f25794I0) {
            return;
        }
        if (getContext() == null) {
            Log.w("BiometricFragment", "Not showing biometric prompt. Context is null.");
            return;
        }
        k kVar = this.f25761f0;
        kVar.f25794I0 = true;
        kVar.f25795J0 = true;
        int i9 = Build.VERSION.SDK_INT;
        Context context = getContext();
        if (context != null) {
            String str = Build.MANUFACTURER;
            if (i9 == 29) {
                if (str != null) {
                    for (String str2 : context.getResources().getStringArray(R.array.keyguard_biometric_and_credential_exclude_vendors)) {
                        if (str.equalsIgnoreCase(str2)) {
                            i = true;
                            break;
                        }
                    }
                }
                i = false;
                if ((i ^ true) != false) {
                    int k3 = this.f25761f0.k();
                    if ((k3 & 255) == 255 && C1127c.a(k3)) {
                        this.f25761f0.N0 = true;
                        r0();
                        return;
                    }
                }
            }
        }
        r6 = null;
        r6 = null;
        r6 = null;
        r6 = null;
        C1098b.C0448b c0448b = null;
        if (!q0()) {
            BiometricPrompt.Builder d10 = b.d(requireContext().getApplicationContext());
            k kVar2 = this.f25761f0;
            i.d dVar = kVar2.f25787B0;
            CharSequence charSequence = dVar != null ? dVar.f25780a : null;
            CharSequence charSequence2 = dVar != null ? dVar.f25781b : null;
            kVar2.getClass();
            if (charSequence != null) {
                b.g(d10, charSequence);
            }
            if (charSequence2 != null) {
                b.f(d10, charSequence2);
            }
            CharSequence l10 = this.f25761f0.l();
            if (!TextUtils.isEmpty(l10)) {
                Executor executor = this.f25761f0.f25809k;
                if (executor == null) {
                    executor = new k.b();
                }
                k kVar3 = this.f25761f0;
                if (kVar3.f25791F0 == null) {
                    kVar3.f25791F0 = new k.c(kVar3);
                }
                b.e(d10, l10, executor, kVar3.f25791F0);
            }
            if (i9 >= 29) {
                i.d dVar2 = this.f25761f0.f25787B0;
                c.a(d10, true);
            }
            int k10 = this.f25761f0.k();
            if (i9 >= 30) {
                d.a(d10, k10);
            } else if (i9 >= 29) {
                c.b(d10, C1127c.a(k10));
            }
            BiometricPrompt c2 = b.c(d10);
            Context context2 = getContext();
            BiometricPrompt.CryptoObject b9 = m.b(this.f25761f0.f25788C0);
            k kVar4 = this.f25761f0;
            if (kVar4.f25790E0 == null) {
                kVar4.f25790E0 = new l();
            }
            l lVar = kVar4.f25790E0;
            if (lVar.f25815b == null) {
                lVar.f25814a.getClass();
                lVar.f25815b = l.b.b();
            }
            CancellationSignal cancellationSignal = lVar.f25815b;
            e eVar = new e();
            k kVar5 = this.f25761f0;
            if (kVar5.f25789D0 == null) {
                kVar5.f25789D0 = new C1126b(new k.a(kVar5));
            }
            C1126b c1126b = kVar5.f25789D0;
            if (c1126b.f25751a == null) {
                c1126b.f25751a = C1126b.a.a(c1126b.f25753c);
            }
            BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallback = c1126b.f25751a;
            try {
                if (b9 == null) {
                    b.b(c2, cancellationSignal, eVar, biometricPrompt$AuthenticationCallback);
                } else {
                    b.a(c2, b9, cancellationSignal, eVar, biometricPrompt$AuthenticationCallback);
                }
                return;
            } catch (NullPointerException e10) {
                Log.e("BiometricFragment", "Got NPE while authenticating with biometric prompt.", e10);
                s0(1, context2 != null ? context2.getString(R.string.default_error_msg) : "");
                return;
            }
        }
        Context applicationContext = requireContext().getApplicationContext();
        C1098b c1098b = new C1098b(applicationContext);
        int i10 = !c1098b.d() ? 12 : !c1098b.c() ? 11 : 0;
        if (i10 != 0) {
            s0(i10, C1124b.B(applicationContext, i10));
            return;
        }
        if (isAdded()) {
            this.f25761f0.f25804T0 = true;
            String str3 = Build.MODEL;
            if (Build.VERSION.SDK_INT == 28 && str3 != null) {
                for (String str4 : applicationContext.getResources().getStringArray(R.array.hide_fingerprint_instantly_prefixes)) {
                    if (str3.startsWith(str4)) {
                        break;
                    }
                }
            }
            this.f25762g0.postDelayed(new q.e(this, 0), 500L);
            boolean z10 = getArguments().getBoolean("host_activity", true);
            n nVar = new n();
            Bundle bundle = new Bundle();
            bundle.putBoolean("host_activity", z10);
            nVar.setArguments(bundle);
            nVar.show(getParentFragmentManager(), "androidx.biometric.FingerprintDialogFragment");
            k kVar6 = this.f25761f0;
            kVar6.f25793H0 = 0;
            i.c cVar = kVar6.f25788C0;
            if (cVar != null) {
                Cipher cipher = cVar.f25776b;
                if (cipher != null) {
                    c0448b = new C1098b.C0448b(cipher);
                } else {
                    Signature signature = cVar.f25775a;
                    if (signature != null) {
                        c0448b = new C1098b.C0448b(signature);
                    } else {
                        Mac mac = cVar.f25777c;
                        if (mac != null) {
                            c0448b = new C1098b.C0448b(mac);
                        } else if (i9 >= 30 && cVar.f25778d != null) {
                            Log.e("CryptoObjectUtils", "Identity credential is not supported by FingerprintManager.");
                        } else if (i9 >= 33 && cVar.f25779e != null) {
                            Log.e("CryptoObjectUtils", "Presentation session is not supported by FingerprintManager.");
                        }
                    }
                }
            }
            k kVar7 = this.f25761f0;
            if (kVar7.f25790E0 == null) {
                kVar7.f25790E0 = new l();
            }
            l lVar2 = kVar7.f25790E0;
            if (lVar2.f25816c == null) {
                lVar2.f25814a.getClass();
                lVar2.f25816c = new t0.d();
            }
            t0.d dVar3 = lVar2.f25816c;
            k kVar8 = this.f25761f0;
            if (kVar8.f25789D0 == null) {
                kVar8.f25789D0 = new C1126b(new k.a(kVar8));
            }
            C1126b c1126b2 = kVar8.f25789D0;
            if (c1126b2.f25752b == null) {
                c1126b2.f25752b = new C1125a(c1126b2);
            }
            try {
                c1098b.a(c0448b, dVar3, c1126b2.f25752b);
            } catch (NullPointerException e11) {
                Log.e("BiometricFragment", "Got NPE while authenticating with fingerprint.", e11);
                s0(1, C1124b.B(applicationContext, 1));
            }
        }
    }
}
