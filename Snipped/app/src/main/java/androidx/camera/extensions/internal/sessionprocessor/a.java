package androidx.camera.extensions.internal.sessionprocessor;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.LongSparseArray;
import java.util.HashMap;
import pa.C1124b;

/* compiled from: CaptureResultImageMatcher.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f5444a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final LongSparseArray<TotalCaptureResult> f5445b = new LongSparseArray<>();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f5446c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final LongSparseArray<b> f5447d = new LongSparseArray<>();

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0063a f5448e;

    /* compiled from: CaptureResultImageMatcher.java */
    /* renamed from: androidx.camera.extensions.internal.sessionprocessor.a$a, reason: collision with other inner class name */
    public interface InterfaceC0063a {
        void a(b bVar, TotalCaptureResult totalCaptureResult, int i);
    }

    public final void a(TotalCaptureResult totalCaptureResult, int i) {
        synchronized (this.f5444a) {
            try {
                Long l10 = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP);
                long longValue = l10 != null ? l10.longValue() : -1L;
                if (longValue == -1) {
                    return;
                }
                this.f5445b.put(longValue, totalCaptureResult);
                this.f5446c.put(totalCaptureResult, Integer.valueOf(i));
                d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.f5444a) {
            try {
                this.f5445b.clear();
                for (int i = 0; i < this.f5447d.size(); i++) {
                    this.f5447d.get(this.f5447d.keyAt(i)).a();
                }
                this.f5447d.clear();
                this.f5446c.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(b bVar) {
        synchronized (this.f5444a) {
            this.f5447d.put(bVar.get().getTimestamp(), bVar);
        }
        d();
    }

    public final void d() {
        InterfaceC0063a interfaceC0063a;
        b bVar;
        TotalCaptureResult totalCaptureResult;
        Integer num;
        synchronized (this.f5444a) {
            try {
                interfaceC0063a = null;
                bVar = null;
                totalCaptureResult = null;
                for (int size = this.f5445b.size() - 1; size >= 0; size--) {
                    TotalCaptureResult valueAt = this.f5445b.valueAt(size);
                    Long l10 = (Long) valueAt.get(CaptureResult.SENSOR_TIMESTAMP);
                    long longValue = l10 != null ? l10.longValue() : -1L;
                    b bVar2 = this.f5447d.get(longValue);
                    if (bVar2 != null) {
                        this.f5447d.remove(longValue);
                        this.f5445b.removeAt(size);
                        totalCaptureResult = valueAt;
                        bVar = bVar2;
                    }
                }
                e();
            } finally {
            }
        }
        if (bVar == null || totalCaptureResult == null) {
            return;
        }
        synchronized (this.f5444a) {
            try {
                InterfaceC0063a interfaceC0063a2 = this.f5448e;
                if (interfaceC0063a2 != null) {
                    interfaceC0063a = interfaceC0063a2;
                    num = (Integer) this.f5446c.get(totalCaptureResult);
                } else {
                    bVar.a();
                    num = null;
                }
            } finally {
            }
        }
        if (interfaceC0063a != null) {
            interfaceC0063a.a(bVar, totalCaptureResult, num.intValue());
        }
    }

    public final void e() {
        synchronized (this.f5444a) {
            try {
                if (this.f5447d.size() != 0 && this.f5445b.size() != 0) {
                    long keyAt = this.f5447d.keyAt(0);
                    Long valueOf = Long.valueOf(keyAt);
                    long keyAt2 = this.f5445b.keyAt(0);
                    C1124b.l(!Long.valueOf(keyAt2).equals(valueOf));
                    if (keyAt2 > keyAt) {
                        for (int size = this.f5447d.size() - 1; size >= 0; size--) {
                            if (this.f5447d.keyAt(size) < keyAt2) {
                                this.f5447d.valueAt(size).a();
                                this.f5447d.removeAt(size);
                            }
                        }
                    } else {
                        for (int size2 = this.f5445b.size() - 1; size2 >= 0; size2--) {
                            if (this.f5445b.keyAt(size2) < keyAt) {
                                this.f5445b.removeAt(size2);
                            }
                        }
                    }
                }
            } finally {
            }
        }
    }
}
