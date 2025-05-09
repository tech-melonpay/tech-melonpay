package com.sumsub.sns.core.presentation.util;

import android.os.Bundle;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final C0171a f14355b = new C0171a(null);

    /* renamed from: a, reason: collision with root package name */
    public String f14356a;

    /* renamed from: com.sumsub.sns.core.presentation.util.a$a, reason: collision with other inner class name */
    public static final class C0171a {
        public /* synthetic */ C0171a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C0171a() {
        }
    }

    public final String a() {
        String str = this.f14356a;
        if (str == null) {
            return null;
        }
        return str;
    }

    public final void b(Bundle bundle) {
        String str = this.f14356a;
        if (str == null) {
            str = null;
        }
        bundle.putString("fragment_unique_id", str);
    }

    public final void a(Bundle bundle) {
        this.f14356a = bundle != null ? bundle.getString("fragment_unique_id", "") : UUID.randomUUID().toString();
    }
}
