package com.sumsub.sns.internal.fingerprint.infoproviders;

import android.app.KeyguardManager;
import android.app.admin.DevicePolicyManager;
import ca.InterfaceC0635a;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class p implements o {

    /* renamed from: a, reason: collision with root package name */
    public final DevicePolicyManager f17343a;

    /* renamed from: b, reason: collision with root package name */
    public final KeyguardManager f17344b;

    public static final class a extends Lambda implements InterfaceC0635a<String> {
        public a() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            String b9;
            DevicePolicyManager devicePolicyManager = p.this.f17343a;
            b9 = q.b(devicePolicyManager != null ? devicePolicyManager.getStorageEncryptionStatus() : 0);
            return b9;
        }
    }

    public static final class b extends Lambda implements InterfaceC0635a<Boolean> {
        public b() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            KeyguardManager keyguardManager = p.this.f17344b;
            return Boolean.valueOf(keyguardManager != null ? keyguardManager.isKeyguardSecure() : false);
        }
    }

    public static final class c extends Lambda implements InterfaceC0635a<List<? extends Pair<? extends String, ? extends String>>> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f17347a = new c();

        public c() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<Pair<String, String>> invoke() {
            Provider[] providers = Security.getProviders();
            ArrayList arrayList = new ArrayList(providers.length);
            int length = providers.length;
            for (int i = 0; i < length; i++) {
                Provider provider = providers[i];
                String name = provider != null ? provider.getName() : null;
                String str = "";
                if (name == null) {
                    name = "";
                }
                String info = provider.getInfo();
                if (info != null) {
                    str = info;
                }
                arrayList.add(new Pair(name, str));
            }
            return arrayList;
        }
    }

    public p(DevicePolicyManager devicePolicyManager, KeyguardManager keyguardManager) {
        this.f17343a = devicePolicyManager;
        this.f17344b = keyguardManager;
    }

    @Override // com.sumsub.sns.internal.fingerprint.infoproviders.o
    public boolean c() {
        Object a10 = com.sumsub.sns.internal.fingerprint.tools.threading.safe.c.a(0L, new b(), 1, null);
        Boolean bool = Boolean.FALSE;
        if (a10 instanceof Result.Failure) {
            a10 = bool;
        }
        return ((Boolean) a10).booleanValue();
    }

    @Override // com.sumsub.sns.internal.fingerprint.infoproviders.o
    public List<Pair<String, String>> a() {
        Object a10 = com.sumsub.sns.internal.fingerprint.tools.threading.safe.c.a(0L, c.f17347a, 1, null);
        EmptyList emptyList = EmptyList.f23104a;
        if (a10 instanceof Result.Failure) {
            a10 = emptyList;
        }
        return (List) a10;
    }

    @Override // com.sumsub.sns.internal.fingerprint.infoproviders.o
    public String b() {
        Object a10 = com.sumsub.sns.internal.fingerprint.tools.threading.safe.c.a(0L, new a(), 1, null);
        if (a10 instanceof Result.Failure) {
            a10 = "";
        }
        return (String) a10;
    }
}
