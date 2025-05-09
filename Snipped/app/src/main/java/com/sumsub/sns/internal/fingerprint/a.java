package com.sumsub.sns.internal.fingerprint;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.admin.DevicePolicyManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.hardware.SensorManager;
import android.hardware.input.InputManager;
import android.media.MediaCodecList;
import android.media.RingtoneManager;
import android.os.Environment;
import android.os.StatFs;
import ca.InterfaceC0635a;
import com.sumsub.sns.internal.fingerprint.fingerprintingsignals.x;
import com.sumsub.sns.internal.fingerprint.infoproviders.a0;
import com.sumsub.sns.internal.fingerprint.infoproviders.c0;
import com.sumsub.sns.internal.fingerprint.infoproviders.f0;
import com.sumsub.sns.internal.fingerprint.infoproviders.i0;
import com.sumsub.sns.internal.fingerprint.infoproviders.k0;
import com.sumsub.sns.internal.fingerprint.infoproviders.s;
import com.sumsub.sns.internal.fingerprint.infoproviders.u;
import com.sumsub.sns.internal.fingerprint.infoproviders.z;
import java.io.File;
import kotlin.Result;
import kotlin.jvm.internal.Lambda;
import p0.C1098b;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f16983a = new a();

    /* renamed from: com.sumsub.sns.internal.fingerprint.a$a, reason: collision with other inner class name */
    public static final class C0254a extends Lambda implements InterfaceC0635a<MediaCodecList> {

        /* renamed from: a, reason: collision with root package name */
        public static final C0254a f16984a = new C0254a();

        public C0254a() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MediaCodecList invoke() {
            return new MediaCodecList(1);
        }
    }

    public static final class b extends Lambda implements InterfaceC0635a<RingtoneManager> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f16985a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context) {
            super(0);
            this.f16985a = context;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RingtoneManager invoke() {
            return new RingtoneManager(this.f16985a);
        }
    }

    public static final class c extends Lambda implements InterfaceC0635a<AssetManager> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f16986a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context) {
            super(0);
            this.f16986a = context;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AssetManager invoke() {
            return this.f16986a.getAssets();
        }
    }

    public static final class d extends Lambda implements InterfaceC0635a<Configuration> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f16987a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context) {
            super(0);
            this.f16987a = context;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Configuration invoke() {
            return this.f16987a.getResources().getConfiguration();
        }
    }

    public static final class e extends Lambda implements InterfaceC0635a<DevicePolicyManager> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f16988a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Context context) {
            super(0);
            this.f16988a = context;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DevicePolicyManager invoke() {
            return (DevicePolicyManager) this.f16988a.getSystemService("device_policy");
        }
    }

    public static final class f extends Lambda implements InterfaceC0635a<KeyguardManager> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f16989a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Context context) {
            super(0);
            this.f16989a = context;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final KeyguardManager invoke() {
            return (KeyguardManager) this.f16989a.getSystemService("keyguard");
        }
    }

    public static final class g extends Lambda implements InterfaceC0635a<C1098b> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f16990a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Context context) {
            super(0);
            this.f16990a = context;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1098b invoke() {
            return new C1098b(this.f16990a);
        }
    }

    public static final class h extends Lambda implements InterfaceC0635a<com.sumsub.sns.internal.fingerprint.b> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f16991a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Context context) {
            super(0);
            this.f16991a = context;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.sumsub.sns.internal.fingerprint.b invoke() {
            return new com.sumsub.sns.internal.fingerprint.b(a.f16983a.g(this.f16991a));
        }
    }

    public static final class i extends Lambda implements InterfaceC0635a<ActivityManager> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f16992a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Context context) {
            super(0);
            this.f16992a = context;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ActivityManager invoke() {
            return (ActivityManager) this.f16992a.getSystemService("activity");
        }
    }

    public static final class j extends Lambda implements InterfaceC0635a<InputManager> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f16993a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Context context) {
            super(0);
            this.f16993a = context;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InputManager invoke() {
            return (InputManager) this.f16993a.getSystemService("input");
        }
    }

    public static final class k extends Lambda implements InterfaceC0635a<ActivityManager> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f16994a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Context context) {
            super(0);
            this.f16994a = context;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ActivityManager invoke() {
            return (ActivityManager) this.f16994a.getSystemService("activity");
        }
    }

    public static final class l extends Lambda implements InterfaceC0635a<StatFs> {

        /* renamed from: a, reason: collision with root package name */
        public static final l f16995a = new l();

        public l() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final StatFs invoke() {
            return new StatFs(Environment.getRootDirectory().getAbsolutePath());
        }
    }

    public static final class m extends Lambda implements InterfaceC0635a<StatFs> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f16996a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Context context) {
            super(0);
            this.f16996a = context;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final StatFs invoke() {
            File externalFilesDir = this.f16996a.getExternalFilesDir(null);
            if (externalFilesDir == null) {
                return null;
            }
            if (!externalFilesDir.canRead()) {
                externalFilesDir = null;
            }
            if (externalFilesDir != null) {
                return new StatFs(externalFilesDir.getAbsolutePath());
            }
            return null;
        }
    }

    public static final class n extends Lambda implements InterfaceC0635a<PackageManager> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f16997a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Context context) {
            super(0);
            this.f16997a = context;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PackageManager invoke() {
            return this.f16997a.getPackageManager();
        }
    }

    public static final class o extends Lambda implements InterfaceC0635a<SensorManager> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f16998a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(Context context) {
            super(0);
            this.f16998a = context;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SensorManager invoke() {
            return (SensorManager) this.f16998a.getSystemService("sensor");
        }
    }

    public static final class p extends Lambda implements InterfaceC0635a<ContentResolver> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f16999a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(Context context) {
            super(0);
            this.f16999a = context;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ContentResolver invoke() {
            return this.f16999a.getContentResolver();
        }
    }

    public final com.sumsub.sns.internal.fingerprint.infoproviders.h b() {
        Object a10 = com.sumsub.sns.internal.fingerprint.tools.threading.safe.c.a(0L, C0254a.f16984a, 1, null);
        return new com.sumsub.sns.internal.fingerprint.infoproviders.h((MediaCodecList) (a10 instanceof Result.Failure ? null : a10));
    }

    public final com.sumsub.sns.internal.fingerprint.infoproviders.k c() {
        return new com.sumsub.sns.internal.fingerprint.infoproviders.k();
    }

    public final c0 d() {
        return new c0();
    }

    public final s e(Context context) {
        Object a10 = com.sumsub.sns.internal.fingerprint.tools.threading.safe.c.a(0L, new g(context), 1, null);
        return new s((C1098b) (a10 instanceof Result.Failure ? null : a10));
    }

    public final Fingerprinter f(Context context) {
        return new Fingerprinter(new h(context));
    }

    public final x g(Context context) {
        return new x(c(), j(context), l(context), i(context), b(context), a(), h(context), d(), b(), d(context), k(context), m(context), c(context), e(context));
    }

    public final u h(Context context) {
        Object a10 = com.sumsub.sns.internal.fingerprint.tools.threading.safe.c.a(0L, new i(context), 1, null);
        return new u((ActivityManager) (a10 instanceof Result.Failure ? null : a10));
    }

    public final com.sumsub.sns.internal.fingerprint.infoproviders.x i(Context context) {
        Object a10 = com.sumsub.sns.internal.fingerprint.tools.threading.safe.c.a(0L, new j(context), 1, null);
        return new com.sumsub.sns.internal.fingerprint.infoproviders.x((InputManager) (a10 instanceof Result.Failure ? null : a10));
    }

    public final z j(Context context) {
        Object a10 = com.sumsub.sns.internal.fingerprint.tools.threading.safe.c.a(0L, new k(context), 1, null);
        if (a10 instanceof Result.Failure) {
            a10 = null;
        }
        ActivityManager activityManager = (ActivityManager) a10;
        Object a11 = com.sumsub.sns.internal.fingerprint.tools.threading.safe.c.a(0L, l.f16995a, 1, null);
        if (a11 instanceof Result.Failure) {
            a11 = null;
        }
        StatFs statFs = (StatFs) a11;
        Object a12 = com.sumsub.sns.internal.fingerprint.tools.threading.safe.c.a(0L, new m(context), 1, null);
        return new a0(activityManager, statFs, (StatFs) (a12 instanceof Result.Failure ? null : a12));
    }

    public final f0 k(Context context) {
        Object a10 = com.sumsub.sns.internal.fingerprint.tools.threading.safe.c.a(0L, new n(context), 1, null);
        return new f0((PackageManager) (a10 instanceof Result.Failure ? null : a10));
    }

    public final i0 l(Context context) {
        Object a10 = com.sumsub.sns.internal.fingerprint.tools.threading.safe.c.a(0L, new o(context), 1, null);
        return new i0((SensorManager) (a10 instanceof Result.Failure ? null : a10));
    }

    public final k0 m(Context context) {
        Object a10 = com.sumsub.sns.internal.fingerprint.tools.threading.safe.c.a(0L, new p(context), 1, null);
        return new k0((ContentResolver) (a10 instanceof Result.Failure ? null : a10));
    }

    public static final Fingerprinter a(Context context) {
        return f16983a.f(context);
    }

    public final com.sumsub.sns.internal.fingerprint.infoproviders.n c(Context context) {
        Object a10 = com.sumsub.sns.internal.fingerprint.tools.threading.safe.c.a(0L, new b(context), 1, null);
        if (a10 instanceof Result.Failure) {
            a10 = null;
        }
        RingtoneManager ringtoneManager = (RingtoneManager) a10;
        Object a11 = com.sumsub.sns.internal.fingerprint.tools.threading.safe.c.a(0L, new c(context), 1, null);
        if (a11 instanceof Result.Failure) {
            a11 = null;
        }
        AssetManager assetManager = (AssetManager) a11;
        Object a12 = com.sumsub.sns.internal.fingerprint.tools.threading.safe.c.a(0L, new d(context), 1, null);
        return new com.sumsub.sns.internal.fingerprint.infoproviders.n(ringtoneManager, assetManager, (Configuration) (a12 instanceof Result.Failure ? null : a12));
    }

    public final com.sumsub.sns.internal.fingerprint.infoproviders.p d(Context context) {
        Object a10 = com.sumsub.sns.internal.fingerprint.tools.threading.safe.c.a(0L, new e(context), 1, null);
        if (a10 instanceof Result.Failure) {
            a10 = null;
        }
        DevicePolicyManager devicePolicyManager = (DevicePolicyManager) a10;
        Object a11 = com.sumsub.sns.internal.fingerprint.tools.threading.safe.c.a(0L, new f(context), 1, null);
        return new com.sumsub.sns.internal.fingerprint.infoproviders.p(devicePolicyManager, (KeyguardManager) (a11 instanceof Result.Failure ? null : a11));
    }

    public final com.sumsub.sns.internal.fingerprint.infoproviders.e a() {
        return new com.sumsub.sns.internal.fingerprint.infoproviders.f();
    }

    public final com.sumsub.sns.internal.fingerprint.infoproviders.b b(Context context) {
        return new com.sumsub.sns.internal.fingerprint.infoproviders.b(context);
    }
}
