package com.google.android.gms.internal.mlkit_common;

import android.util.Log;
import com.sumsub.sentry.q;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes.dex */
final class zzo {
    private static final Method zza;
    private static final Method zzb;
    private static final Method zzc;
    private static final Field zzd;
    private static final Field zze;
    private static final Field zzf;
    private static final Object zzg;
    private static final Throwable zzh;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.reflect.AccessibleObject, java.lang.reflect.Field] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.reflect.Field] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v7 */
    static {
        Throwable th;
        Object obj;
        Field field;
        Method method;
        Method method2;
        Method method3;
        ?? r72;
        Field field2;
        Class<?> cls;
        Class<?> cls2;
        Class<?> cls3;
        try {
            cls = Class.forName("libcore.io.Libcore");
            cls2 = Class.forName("libcore.io.StructStat");
            Class<?> cls4 = Class.forName("libcore.io.OsConstants");
            cls3 = Class.forName("libcore.io.ForwardingOs");
            method = cls4.getDeclaredMethod("S_ISLNK", Integer.TYPE);
        } catch (Throwable th2) {
            th = th2;
            obj = null;
            field = null;
            method = null;
            method2 = null;
        }
        try {
            method.setAccessible(true);
            method3 = cls3.getDeclaredMethod("lstat", String.class);
            try {
                method2 = cls3.getDeclaredMethod("fstat", FileDescriptor.class);
                try {
                    Field declaredField = cls.getDeclaredField(q.f13755g);
                    declaredField.setAccessible(true);
                    obj = declaredField.get(cls);
                } catch (Throwable th3) {
                    th = th3;
                    obj = null;
                    field = null;
                }
                try {
                    r72 = cls2.getField("st_dev");
                    try {
                        field2 = cls2.getField("st_ino");
                        try {
                            field = cls2.getField("st_mode");
                        } catch (Throwable th4) {
                            th = th4;
                            field = null;
                        }
                        try {
                            r72.setAccessible(true);
                            field2.setAccessible(true);
                            field.setAccessible(true);
                        } catch (Throwable th5) {
                            th = th5;
                            try {
                                Log.d("StructStatHelper", "Reflection failed", th);
                                zza = method;
                                zzb = method3;
                                zzc = method2;
                                zzd = r72;
                                zze = field2;
                                zzf = field;
                                zzg = obj;
                                zzh = th;
                            } finally {
                                zza = method;
                                zzb = method3;
                                zzc = method2;
                                zzd = r72;
                                zze = field2;
                                zzf = field;
                                zzg = obj;
                                zzh = null;
                            }
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        field = null;
                        field2 = null;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    field = null;
                    r72 = field;
                    field2 = r72;
                    Log.d("StructStatHelper", "Reflection failed", th);
                    zza = method;
                    zzb = method3;
                    zzc = method2;
                    zzd = r72;
                    zze = field2;
                    zzf = field;
                    zzg = obj;
                    zzh = th;
                }
            } catch (Throwable th8) {
                th = th8;
                obj = null;
                field = null;
                method2 = null;
                r72 = 0;
            }
        } catch (Throwable th9) {
            th = th9;
            obj = null;
            field = null;
            method2 = null;
            method3 = method2;
            r72 = method3;
            field2 = r72;
            Log.d("StructStatHelper", "Reflection failed", th);
            zza = method;
            zzb = method3;
            zzc = method2;
            zzd = r72;
            zze = field2;
            zzf = field;
            zzg = obj;
            zzh = th;
        }
    }

    public static zzq zza(final FileDescriptor fileDescriptor) {
        return (zzq) zzf(new Callable() { // from class: com.google.android.gms.internal.mlkit_common.zzn
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzq zze2;
                zze2 = zzo.zze(zzo.zzc.invoke(zzo.zzg, fileDescriptor));
                return zze2;
            }
        });
    }

    public static zzq zzd(final String str) {
        return (zzq) zzf(new Callable() { // from class: com.google.android.gms.internal.mlkit_common.zzm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzq zze2;
                zze2 = zzo.zze(zzo.zzb.invoke(zzo.zzg, str));
                return zze2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzq zze(Object obj) {
        long longValue = ((Long) zzd.get(obj)).longValue();
        long longValue2 = ((Long) zze.get(obj)).longValue();
        Integer num = (Integer) zzf.get(obj);
        num.getClass();
        return new zzq(longValue, longValue2, ((Boolean) zza.invoke(null, num)).booleanValue());
    }

    private static Object zzf(Callable callable) {
        try {
            Throwable th = zzh;
            if (th == null) {
                return callable.call();
            }
            throw new IOException(th);
        } catch (Throwable th2) {
            throw new IOException(th2);
        }
    }
}
