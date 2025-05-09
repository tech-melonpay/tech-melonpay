package f3;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: SharedPrefKeysetWriter.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences.Editor f20635a;

    /* renamed from: b, reason: collision with root package name */
    public final String f20636b;

    public d(Context context, String str) {
        this.f20636b = str;
        this.f20635a = context.getApplicationContext().getSharedPreferences("crypto_prefs", 0).edit();
    }
}
