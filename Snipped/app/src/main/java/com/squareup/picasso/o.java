package com.squareup.picasso;

import android.os.Process;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.ThreadFactory;
import ka.C0956a;
import okio.ByteString;

/* compiled from: Utils.java */
/* loaded from: classes2.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final StringBuilder f13496a = new StringBuilder();

    /* renamed from: b, reason: collision with root package name */
    public static final ByteString f13497b;

    /* renamed from: c, reason: collision with root package name */
    public static final ByteString f13498c;

    /* compiled from: Utils.java */
    public static class a extends Thread {
        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            Process.setThreadPriority(10);
            super.run();
        }
    }

    /* compiled from: Utils.java */
    public static class b implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new a(runnable);
        }
    }

    static {
        ByteString byteString = new ByteString("RIFF".getBytes(C0956a.f23054b));
        byteString.f24699c = "RIFF";
        f13497b = byteString;
        ByteString byteString2 = new ByteString("WEBP".getBytes(C0956a.f23054b));
        byteString2.f24699c = "WEBP";
        f13498c = byteString2;
    }

    public static String a(c cVar, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        com.squareup.picasso.a aVar = cVar.f13423k;
        if (aVar != null) {
            sb2.append(aVar.f13396b.b());
        }
        ArrayList arrayList = cVar.f13424l;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (i > 0 || aVar != null) {
                    sb2.append(", ");
                }
                sb2.append(((com.squareup.picasso.a) arrayList.get(i)).f13396b.b());
            }
        }
        return sb2.toString();
    }

    public static void b(String str, String str2, String str3) {
        c(str, str2, str3, "");
    }

    public static void c(String str, String str2, String str3, String str4) {
        Log.d("Picasso", String.format("%1$-11s %2$-12s %3$s %4$s", str, str2, str3, str4));
    }
}
