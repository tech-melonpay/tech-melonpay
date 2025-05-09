package u9;

import io.sentry.android.core.SentryAndroidOptions;

/* compiled from: R8$$SyntheticClass */
/* renamed from: u9.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1535f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30409a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SentryAndroidOptions f30410b;

    public /* synthetic */ C1535f(SentryAndroidOptions sentryAndroidOptions, int i) {
        this.f30409a = i;
        this.f30410b = sentryAndroidOptions;
    }

    public final String a() {
        switch (this.f30409a) {
            case 0:
                return this.f30410b.getCacheDirPath();
            default:
                return this.f30410b.getOutboxPath();
        }
    }
}
