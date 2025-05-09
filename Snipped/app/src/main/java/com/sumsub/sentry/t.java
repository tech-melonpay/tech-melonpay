package com.sumsub.sentry;

import android.content.Context;
import com.sumsub.log.logger.Logger;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import ka.C0956a;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final t f13782a = new t();

    /* renamed from: c, reason: collision with root package name */
    public static boolean f13783c;

    /* renamed from: d, reason: collision with root package name */
    public static String f13784d;

    public final void a(Context context) {
        if (a()) {
            return;
        }
        String str = null;
        try {
            Reader inputStreamReader = new InputStreamReader(context.getAssets().open("sentry/build_uuid.prop"), C0956a.f23054b);
            BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
            try {
                String y10 = U4.b.y(bufferedReader);
                U4.b.d(bufferedReader, null);
                Logger.d$default(com.sumsub.sns.internal.log.a.f17535a, "Sentry", "SDK build UUID read from assets: ".concat(y10), null, 4, null);
                str = y10;
            } finally {
            }
        } catch (Exception e10) {
            com.sumsub.sns.internal.log.a.f17535a.e("Sentry", "Failed to read build UUID", e10);
        }
        f13784d = str;
    }

    public final void a(z zVar) {
        String str = f13784d;
        if (str == null) {
            return;
        }
        f fVar = new f((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Long) null, (String) null, 511, (DefaultConstructorMarker) null);
        fVar.a("proguard");
        fVar.b(str);
        zVar.getDebugMeta().a().add(fVar);
    }

    public final boolean a() {
        boolean z10 = f13783c;
        f13783c = true;
        return z10;
    }
}
