package com.sumsub.sns.internal.fingerprint.infoproviders;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import ca.InterfaceC0635a;
import com.sumsub.sns.internal.fingerprint.tools.threading.safe.c;
import kotlin.Result;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class b implements com.sumsub.sns.internal.fingerprint.infoproviders.a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f17302a;

    public static final class a extends Lambda implements InterfaceC0635a<String> {
        public a() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            int intExtra;
            Intent registerReceiver = b.this.f17302a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            return (registerReceiver == null || (intExtra = registerReceiver.getIntExtra("health", -1)) == -1) ? "" : b.this.a(intExtra);
        }
    }

    /* renamed from: com.sumsub.sns.internal.fingerprint.infoproviders.b$b, reason: collision with other inner class name */
    public static final class C0257b extends Lambda implements InterfaceC0635a<String> {
        public C0257b() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return String.valueOf(((Double) Class.forName("com.android.internal.os.PowerProfile").getMethod("getBatteryCapacity", null).invoke(Class.forName("com.android.internal.os.PowerProfile").getConstructor(Context.class).newInstance(b.this.f17302a), null)).doubleValue());
        }
    }

    public b(Context context) {
        this.f17302a = context;
    }

    @Override // com.sumsub.sns.internal.fingerprint.infoproviders.a
    @SuppressLint({"PrivateApi"})
    public String b() {
        Object a10 = c.a(0L, new C0257b(), 1, null);
        if (a10 instanceof Result.Failure) {
            a10 = "";
        }
        return (String) a10;
    }

    @Override // com.sumsub.sns.internal.fingerprint.infoproviders.a
    public String a() {
        Object a10 = c.a(0L, new a(), 1, null);
        if (a10 instanceof Result.Failure) {
            a10 = "";
        }
        return (String) a10;
    }

    public final String a(int i) {
        switch (i) {
            case 2:
                return "good";
            case 3:
                return "overheat";
            case 4:
                return "dead";
            case 5:
                return "over voltage";
            case 6:
                return "unspecified failure";
            case 7:
                return "cold";
            default:
                return "unknown";
        }
    }
}
