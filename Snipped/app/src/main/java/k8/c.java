package K8;

import B6.j;
import C.v;
import F0.f;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.view.LayoutInflater;
import androidx.databinding.DataBinderMapperImpl;
import androidx.security.crypto.EncryptedSharedPreferences;
import b3.InterfaceC0586a;
import b3.g;
import b3.p;
import c1.C0622a;
import c3.C0623a;
import ca.InterfaceC0650p;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.google.android.gms.stats.CodePackage;
import com.luminary.business.data.TokenManager;
import com.luminary.business.data.prefs.crypto.CryptoPrefsManagerImpl;
import com.luminary.business.presentation.utils.bottomDialog.BottomDialogManagerImpl;
import com.luminary.business.presentation.utils.loader.LoadingView;
import com.luminary.mobile.R;
import d5.InterfaceC0686a;
import e3.C0712a;
import e3.C0713b;
import e3.C0714c;
import f3.C0741a;
import j5.InterfaceC0897a;
import java.security.KeyStore;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import javax.crypto.KeyGenerator;
import kotlin.Pair;
import kotlin.coroutines.CombinedContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.c;
import kotlin.coroutines.d;
import kotlin.jvm.internal.h;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.koin.android.error.MissingAndroidContextException;
import org.koin.core.error.NoParameterFoundException;
import t6.I6;
import y4.InterfaceC1613a;
import z4.InterfaceC1644a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements InterfaceC0650p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2275a;

    public /* synthetic */ c(int i) {
        this.f2275a = i;
    }

    @Override // ca.InterfaceC0650p
    public final Object invoke(Object obj, Object obj2) {
        CompletableJob Job$default;
        CombinedContext combinedContext;
        g a10;
        g a11;
        boolean z10 = true;
        boolean z11 = false;
        switch (this.f2275a) {
            case 0:
                gb.a aVar = (gb.a) obj2;
                kotlin.jvm.internal.b a12 = h.a(Context.class);
                List<Object> list = aVar.f20845a;
                if (list.size() <= 0) {
                    throw new NoParameterFoundException("Can't get injected parameter #0 from " + aVar + " for type '" + kb.a.a(a12) + '\'');
                }
                Context context = (Context) list.get(0);
                b bVar = new b();
                LoadingView loadingView = new LoadingView(context);
                LayoutInflater from = LayoutInflater.from(context);
                int i = I6.f28014o;
                DataBinderMapperImpl dataBinderMapperImpl = F0.d.f1140a;
                I6 i62 = (I6) f.f(from, R.layout.loading_dialog, null, false, null);
                MainCoroutineDispatcher main = Dispatchers.getMain();
                Job$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
                loadingView.f13337a = CoroutineScopeKt.CoroutineScope(main.plus(Job$default));
                loadingView.setCancelable(false);
                loadingView.setContentView(i62.f1148d);
                loadingView.setCanceledOnTouchOutside(false);
                bVar.f2274a = loadingView;
                return bVar;
            case 1:
                return new BottomDialogManagerImpl();
            case 2:
                HttpTransaction httpTransaction = (HttpTransaction) obj;
                HttpTransaction httpTransaction2 = (HttpTransaction) obj2;
                if (httpTransaction != null && !httpTransaction.hasTheSameContent(httpTransaction2)) {
                    z11 = true;
                }
                return Boolean.valueOf(!z11);
            case 3:
                return new Pair(obj, obj2);
            case 4:
                String str = (String) obj;
                d.b bVar2 = (d.b) obj2;
                if (str.length() == 0) {
                    return bVar2.toString();
                }
                return str + ", " + bVar2;
            case 5:
                d.b bVar3 = (d.b) obj2;
                kotlin.coroutines.d minusKey = ((kotlin.coroutines.d) obj).minusKey(bVar3.getKey());
                EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.f23155a;
                if (minusKey == emptyCoroutineContext) {
                    return bVar3;
                }
                c.a aVar2 = c.a.f23157a;
                kotlin.coroutines.c cVar = (kotlin.coroutines.c) minusKey.get(aVar2);
                if (cVar == null) {
                    combinedContext = new CombinedContext(minusKey, bVar3);
                } else {
                    kotlin.coroutines.d minusKey2 = minusKey.minusKey(aVar2);
                    if (minusKey2 == emptyCoroutineContext) {
                        return new CombinedContext(bVar3, cVar);
                    }
                    combinedContext = new CombinedContext(new CombinedContext(minusKey2, bVar3), cVar);
                }
                return combinedContext;
            case 6:
                HttpTransaction httpTransaction3 = (HttpTransaction) obj;
                return httpTransaction3 != null ? v.p(httpTransaction3.getMethod(), " ", httpTransaction3.getFormattedPath(((Boolean) obj2).booleanValue())) : "";
            case 7:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                if (booleanValue && booleanValue2) {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case 8:
                org.koin.core.scope.a aVar3 = (org.koin.core.scope.a) obj;
                KeyGenParameterSpec keyGenParameterSpec = C0622a.f8509a;
                if (keyGenParameterSpec.getKeySize() != 256) {
                    throw new IllegalArgumentException("invalid key size, want 256 bits got " + keyGenParameterSpec.getKeySize() + " bits");
                }
                if (!Arrays.equals(keyGenParameterSpec.getBlockModes(), new String[]{CodePackage.GCM})) {
                    throw new IllegalArgumentException("invalid block mode, want GCM got " + Arrays.toString(keyGenParameterSpec.getBlockModes()));
                }
                if (keyGenParameterSpec.getPurposes() != 3) {
                    throw new IllegalArgumentException("invalid purposes mode, want PURPOSE_ENCRYPT | PURPOSE_DECRYPT got " + keyGenParameterSpec.getPurposes());
                }
                if (!Arrays.equals(keyGenParameterSpec.getEncryptionPaddings(), new String[]{"NoPadding"})) {
                    throw new IllegalArgumentException("invalid padding mode, want NoPadding got " + Arrays.toString(keyGenParameterSpec.getEncryptionPaddings()));
                }
                if (keyGenParameterSpec.isUserAuthenticationRequired() && keyGenParameterSpec.getUserAuthenticationValidityDurationSeconds() < 1) {
                    throw new IllegalArgumentException("per-operation authentication is not supported (UserAuthenticationValidityDurationSeconds must be >0)");
                }
                String keystoreAlias = keyGenParameterSpec.getKeystoreAlias();
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                keyStore.load(null);
                if (!keyStore.containsAlias(keystoreAlias)) {
                    KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                    keyGenerator.init(keyGenParameterSpec);
                    keyGenerator.generateKey();
                }
                String keystoreAlias2 = keyGenParameterSpec.getKeystoreAlias();
                try {
                    Context context2 = (Context) aVar3.a(null, null, h.a(Context.class));
                    EncryptedSharedPreferences.PrefKeyEncryptionScheme prefKeyEncryptionScheme = EncryptedSharedPreferences.PrefKeyEncryptionScheme.f7860b;
                    EncryptedSharedPreferences.PrefValueEncryptionScheme prefValueEncryptionScheme = EncryptedSharedPreferences.PrefValueEncryptionScheme.f7863b;
                    int i9 = C0713b.f20507a;
                    p.f(new C0712a(), true);
                    p.g(new C0714c());
                    C0623a.a();
                    C0741a.C0397a c0397a = new C0741a.C0397a();
                    c0397a.f20629e = prefKeyEncryptionScheme.f7862a;
                    c0397a.d(context2, "__androidx_security_crypto_encrypted_prefs_key_keyset__");
                    String concat = "android-keystore://".concat(keystoreAlias2);
                    if (!concat.startsWith("android-keystore://")) {
                        throw new IllegalArgumentException("key URI must start with android-keystore://");
                    }
                    c0397a.f20627c = concat;
                    C0741a a13 = c0397a.a();
                    synchronized (a13) {
                        a10 = a13.f20624b.a();
                    }
                    C0741a.C0397a c0397a2 = new C0741a.C0397a();
                    c0397a2.f20629e = prefValueEncryptionScheme.f7865a;
                    c0397a2.d(context2, "__androidx_security_crypto_encrypted_prefs_value_keyset__");
                    String concat2 = "android-keystore://".concat(keystoreAlias2);
                    if (!concat2.startsWith("android-keystore://")) {
                        throw new IllegalArgumentException("key URI must start with android-keystore://");
                    }
                    c0397a2.f20627c = concat2;
                    C0741a a14 = c0397a2.a();
                    synchronized (a14) {
                        a11 = a14.f20624b.a();
                    }
                    return new CryptoPrefsManagerImpl(new EncryptedSharedPreferences(context2.getSharedPreferences("crypto_prefs", 0), (InterfaceC0586a) a11.a(InterfaceC0586a.class), (b3.c) a10.a(b3.c.class)), (com.google.gson.g) aVar3.a(null, null, h.a(com.google.gson.g.class)));
                } catch (Exception unused) {
                    throw new MissingAndroidContextException("Can't resolve Context instance. Please use androidContext() function in your KoinApplication configuration.");
                }
            case 9:
                fb.a aVar4 = Z4.a.f4187a;
                return "2.2.2.131 (37)";
            case 10:
                int i10 = Build.VERSION.SDK_INT;
                String str2 = Build.MANUFACTURER;
                String str3 = Build.MODEL;
                return "com.luminary.mobile (LuminaryProd; " + i10 + ", " + (str3.toLowerCase(Locale.getDefault()).startsWith(str2.toLowerCase(Locale.getDefault())) ? D9.b.k(str3) : v.p(D9.b.k(str2), " ", str3)) + ")";
            case 11:
                fb.a aVar5 = Z4.a.f4187a;
                return "2.2.2.131";
            case 12:
                return new TokenManager((K5.a) ((org.koin.core.scope.a) obj).a(null, null, h.a(K5.a.class)));
            case 13:
                try {
                    return new j((Application) ((org.koin.core.scope.a) obj).a(null, null, h.a(Application.class)));
                } catch (Exception unused2) {
                    throw new MissingAndroidContextException("Can't resolve Application instance. Please use androidContext() function in your KoinApplication configuration.");
                }
            case 14:
                org.koin.core.scope.a aVar6 = (org.koin.core.scope.a) obj;
                return new S3.a((E4.a) aVar6.a(null, null, h.a(E4.a.class)), (com.google.gson.g) aVar6.a(null, null, h.a(com.google.gson.g.class)));
            case 15:
                org.koin.core.scope.a aVar7 = (org.koin.core.scope.a) obj;
                return new W3.c((I4.a) aVar7.a(null, null, h.a(I4.a.class)), (com.google.gson.g) aVar7.a(null, null, h.a(com.google.gson.g.class)), (Context) aVar7.a(null, null, h.a(Context.class)));
            case 16:
                org.koin.core.scope.a aVar8 = (org.koin.core.scope.a) obj;
                return new T3.a((F4.a) aVar8.a(null, null, h.a(F4.a.class)), (com.google.gson.g) aVar8.a(null, null, h.a(com.google.gson.g.class)));
            case 17:
                org.koin.core.scope.a aVar9 = (org.koin.core.scope.a) obj;
                return new U3.a((G4.a) aVar9.a(null, null, h.a(G4.a.class)), (com.google.gson.g) aVar9.a(null, null, h.a(com.google.gson.g.class)));
            case 18:
                org.koin.core.scope.a aVar10 = (org.koin.core.scope.a) obj;
                return new V3.a((H4.a) aVar10.a(null, null, h.a(H4.a.class)), (com.google.gson.g) aVar10.a(null, null, h.a(com.google.gson.g.class)));
            case 19:
                org.koin.core.scope.a aVar11 = (org.koin.core.scope.a) obj;
                return new Z3.b((J4.a) aVar11.a(null, null, h.a(J4.a.class)), (com.google.gson.g) aVar11.a(null, null, h.a(com.google.gson.g.class)), (String) aVar11.a(null, new hb.a("version"), h.a(String.class)), (String) aVar11.a(null, new hb.a("app_info"), h.a(String.class)));
            case 20:
                org.koin.core.scope.a aVar12 = (org.koin.core.scope.a) obj;
                return new Q3.b((C4.a) aVar12.a(null, null, h.a(C4.a.class)), (com.google.gson.g) aVar12.a(null, null, h.a(com.google.gson.g.class)));
            case 21:
                org.koin.core.scope.a aVar13 = (org.koin.core.scope.a) obj;
                return new P3.a((B4.a) aVar13.a(null, null, h.a(B4.a.class)), (com.google.gson.g) aVar13.a(null, null, h.a(com.google.gson.g.class)));
            case 22:
                org.koin.core.scope.a aVar14 = (org.koin.core.scope.a) obj;
                return new X3.a((I4.a) aVar14.a(null, null, h.a(I4.a.class)), (com.google.gson.g) aVar14.a(null, null, h.a(com.google.gson.g.class)));
            case 23:
                org.koin.core.scope.a aVar15 = (org.koin.core.scope.a) obj;
                return new R3.a((D4.a) aVar15.a(null, null, h.a(D4.a.class)), (com.google.gson.g) aVar15.a(null, null, h.a(com.google.gson.g.class)));
            case 24:
                org.koin.core.scope.a aVar16 = (org.koin.core.scope.a) obj;
                return new M3.a((InterfaceC1613a) aVar16.a(null, null, h.a(InterfaceC1613a.class)), (com.google.gson.g) aVar16.a(null, null, h.a(com.google.gson.g.class)));
            case 25:
                org.koin.core.scope.a aVar17 = (org.koin.core.scope.a) obj;
                return new O3.a((A4.a) aVar17.a(null, null, h.a(A4.a.class)), (com.google.gson.g) aVar17.a(null, null, h.a(com.google.gson.g.class)));
            case 26:
                org.koin.core.scope.a aVar18 = (org.koin.core.scope.a) obj;
                I4.a aVar19 = (I4.a) aVar18.a(null, null, h.a(I4.a.class));
                return new Y3.a(aVar19);
            case 27:
                org.koin.core.scope.a aVar20 = (org.koin.core.scope.a) obj;
                return new N3.b((InterfaceC1644a) aVar20.a(null, null, h.a(InterfaceC1644a.class)), (com.google.gson.g) aVar20.a(null, null, h.a(com.google.gson.g.class)));
            case 28:
                return new W4.b((InterfaceC0686a) ((org.koin.core.scope.a) obj).a(null, null, h.a(InterfaceC0686a.class)));
            default:
                return new W4.h((InterfaceC0897a) ((org.koin.core.scope.a) obj).a(null, null, h.a(InterfaceC0897a.class)));
        }
    }
}
