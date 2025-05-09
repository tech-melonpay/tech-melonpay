package L3;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import io.sentry.Y;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import java.util.Calendar;
import java.util.Date;

/* compiled from: CrashHandler.kt */
/* loaded from: classes.dex */
public final class a implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final StringBuilder f2489a = new StringBuilder();

    /* renamed from: b, reason: collision with root package name */
    public final StringBuilder f2490b = new StringBuilder();

    /* renamed from: c, reason: collision with root package name */
    public final StringBuilder f2491c = new StringBuilder();

    /* renamed from: d, reason: collision with root package name */
    public final Context f2492d;

    public a(Context context) {
        this.f2492d = context;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        String stringWriter2 = stringWriter.toString();
        StringBuilder sb2 = this.f2489a;
        sb2.append(stringWriter2);
        StringBuilder sb3 = this.f2490b;
        sb3.append("SDK: ");
        sb3.append(Build.VERSION.SDK_INT);
        sb3.append("\n");
        sb3.append("Release: ");
        sb3.append(Build.VERSION.RELEASE);
        sb3.append("\n");
        sb3.append("Incremental: ");
        sb3.append(Build.VERSION.INCREMENTAL);
        sb3.append("\n");
        Date time = Calendar.getInstance().getTime();
        StringBuilder sb4 = this.f2491c;
        sb4.append(time);
        sb4.append("\n");
        Log.d("Error", sb2.toString());
        Log.d("Software", sb3.toString());
        Log.d("Date", sb4.toString());
        try {
            Y.b().i(th);
        } catch (Exception e10) {
            Log.e("CustomExceptionHandler", "Failed to log crash to Crashlytics", e10);
        }
        Context context = this.f2492d;
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage != null) {
            launchIntentForPackage.addFlags(335544320);
        }
        context.startActivity(launchIntentForPackage);
        Process.killProcess(Process.myPid());
    }
}
