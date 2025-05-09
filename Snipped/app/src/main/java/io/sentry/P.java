package io.sentry;

import io.sentry.android.core.SentryAndroidOptions;

/* compiled from: OptionsContainer.java */
/* loaded from: classes2.dex */
public final class P implements m3.i {

    /* renamed from: a, reason: collision with root package name */
    public final Class f21834a;

    public P() {
        this.f21834a = SentryAndroidOptions.class;
    }

    @Override // m3.i
    public Object a() {
        Class cls = this.f21834a;
        try {
            return m3.o.f23922a.a(cls);
        } catch (Exception e10) {
            throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e10);
        }
    }

    public P(Class cls) {
        this.f21834a = cls;
    }
}
