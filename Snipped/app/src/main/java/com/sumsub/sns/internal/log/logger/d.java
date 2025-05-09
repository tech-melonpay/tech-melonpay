package com.sumsub.sns.internal.log.logger;

import android.util.Log;
import com.sumsub.log.logger.Logger;

/* loaded from: classes2.dex */
public final class d implements Logger {

    /* renamed from: a, reason: collision with root package name */
    public static final d f17576a = new d();

    @Override // com.sumsub.log.logger.Logger
    public void d(String str, String str2, Throwable th) {
        if (th == null) {
            Log.d(str, str2);
        } else {
            Log.d(str, str2, th);
        }
    }

    @Override // com.sumsub.log.logger.Logger
    public void e(String str, String str2, Throwable th) {
        if (th == null) {
            Log.e(str, str2);
        } else {
            Log.e(str, str2, th);
        }
    }

    @Override // com.sumsub.log.logger.Logger
    public void i(String str, String str2, Throwable th) {
        if (th == null) {
            Log.i(str, str2);
        } else {
            Log.i(str, str2, th);
        }
    }

    @Override // com.sumsub.log.logger.Logger
    public void v(String str, String str2, Throwable th) {
        if (th == null) {
            Log.v(str, str2);
        } else {
            Log.v(str, str2, th);
        }
    }

    @Override // com.sumsub.log.logger.Logger
    public void w(String str, String str2, Throwable th) {
        if (th == null) {
            Log.w(str, str2);
        } else {
            Log.w(str, str2, th);
        }
    }
}
