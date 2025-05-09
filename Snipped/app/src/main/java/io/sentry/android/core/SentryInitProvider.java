package io.sentry.android.core;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import io.sentry.Y;

/* loaded from: classes2.dex */
public final class SentryInitProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        if (SentryInitProvider.class.getName().equals(providerInfo.authority)) {
            throw new IllegalStateException("An applicationId is required to fulfill the manifest placeholder.");
        }
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    @Override // android.content.ContentProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onCreate() {
        /*
            r7 = this;
            u9.e r0 = new u9.e
            r0.<init>()
            android.content.Context r1 = r7.getContext()
            r2 = 0
            if (r1 != 0) goto L16
            io.sentry.SentryLevel r1 = io.sentry.SentryLevel.FATAL
            java.lang.String r3 = "App. Context from ContentProvider is null"
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r0.h(r1, r3, r4)
            return r2
        L16:
            r3 = 0
            r4 = 1
            android.os.Bundle r3 = u9.x.a(r1, r0, r3)     // Catch: java.lang.Throwable -> L25
            if (r3 == 0) goto L28
            java.lang.String r5 = "io.sentry.auto-init"
            boolean r3 = u9.x.b(r3, r0, r5, r4)     // Catch: java.lang.Throwable -> L25
            goto L29
        L25:
            r2 = move-exception
            r3 = r4
            goto L34
        L28:
            r3 = r4
        L29:
            io.sentry.SentryLevel r5 = io.sentry.SentryLevel.INFO     // Catch: java.lang.Throwable -> L33
            java.lang.String r6 = "Retrieving auto-init from AndroidManifest.xml"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L33
            r0.h(r5, r6, r2)     // Catch: java.lang.Throwable -> L33
            goto L3b
        L33:
            r2 = move-exception
        L34:
            io.sentry.SentryLevel r5 = io.sentry.SentryLevel.ERROR
            java.lang.String r6 = "Failed to read auto-init from android manifest metadata."
            r0.f(r5, r6, r2)
        L3b:
            if (r3 == 0) goto L47
            s3.b r2 = new s3.b
            r3 = 18
            r2.<init>(r3)
            u9.E.b(r1, r0, r2)
        L47:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.SentryInitProvider.onCreate():boolean");
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final void shutdown() {
        Y.a();
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
