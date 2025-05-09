package s1;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;

/* compiled from: WorkerFactory.java */
/* renamed from: s1.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1202l {

    /* renamed from: a, reason: collision with root package name */
    public static final String f26520a = AbstractC1197g.e("WorkerFactory");

    public final ListenableWorker a(Context context, String str, WorkerParameters workerParameters) {
        Class cls;
        String str2 = f26520a;
        ListenableWorker listenableWorker = null;
        try {
            cls = Class.forName(str).asSubclass(ListenableWorker.class);
        } catch (Throwable th) {
            AbstractC1197g.c().b(str2, s3.b.j("Invalid class: ", str), th);
            cls = null;
        }
        if (cls != null) {
            try {
                listenableWorker = (ListenableWorker) cls.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
            } catch (Throwable th2) {
                AbstractC1197g.c().b(str2, s3.b.j("Could not instantiate ", str), th2);
            }
        }
        if (listenableWorker == null || !listenableWorker.f8088d) {
            return listenableWorker;
        }
        throw new IllegalStateException(s3.b.l("WorkerFactory (", getClass().getName(), ") returned an instance of a ListenableWorker (", str, ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker."));
    }
}
