package Fa;

import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import ka.C0969n;
import ka.C0970o;

/* compiled from: AndroidLog.kt */
/* loaded from: classes2.dex */
public final class d extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public static final d f1289a = new d();

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        int min;
        CopyOnWriteArraySet<Logger> copyOnWriteArraySet = c.f1287a;
        String loggerName = logRecord.getLoggerName();
        int intValue = logRecord.getLevel().intValue();
        Level level = Level.INFO;
        int i = intValue > level.intValue() ? 5 : logRecord.getLevel().intValue() == level.intValue() ? 4 : 3;
        String message = logRecord.getMessage();
        Throwable thrown = logRecord.getThrown();
        String str = c.f1288b.get(loggerName);
        if (str == null) {
            str = C0970o.z0(23, loggerName);
        }
        if (Log.isLoggable(str, i)) {
            if (thrown != null) {
                message = message + '\n' + Log.getStackTraceString(thrown);
            }
            int length = message.length();
            int i9 = 0;
            while (i9 < length) {
                int f02 = C0969n.f0(message, '\n', i9, false, 4);
                if (f02 == -1) {
                    f02 = length;
                }
                while (true) {
                    min = Math.min(f02, i9 + 4000);
                    Log.println(i, str, message.substring(i9, min));
                    if (min >= f02) {
                        break;
                    } else {
                        i9 = min;
                    }
                }
                i9 = min + 1;
            }
        }
    }

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }
}
