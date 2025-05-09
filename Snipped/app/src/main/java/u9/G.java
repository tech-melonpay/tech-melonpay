package u9;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import io.sentry.C0844b;
import io.sentry.C0852j;
import io.sentry.C0855m;
import io.sentry.InterfaceC0858p;
import io.sentry.InterfaceC0859q;
import io.sentry.InterfaceC0867z;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.core.SentryAndroidOptions;
import java.io.Closeable;

/* compiled from: TempSensorBreadcrumbsIntegration.java */
/* loaded from: classes2.dex */
public final class G implements InterfaceC0867z, Closeable, SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final Context f30376a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0858p f30377b;

    /* renamed from: c, reason: collision with root package name */
    public SentryAndroidOptions f30378c;

    /* renamed from: d, reason: collision with root package name */
    public SensorManager f30379d;

    public G(Context context) {
        this.f30376a = context;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        SensorManager sensorManager = this.f30379d;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
            this.f30379d = null;
            SentryAndroidOptions sentryAndroidOptions = this.f30378c;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().h(SentryLevel.DEBUG, "TempSensorBreadcrumbsIntegration removed.", new Object[0]);
            }
        }
    }

    @Override // io.sentry.InterfaceC0867z
    public final void d(SentryOptions sentryOptions) {
        this.f30377b = C0855m.f22069a;
        SentryAndroidOptions sentryAndroidOptions = sentryOptions instanceof SentryAndroidOptions ? (SentryAndroidOptions) sentryOptions : null;
        D9.b.t0(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f30378c = sentryAndroidOptions;
        InterfaceC0859q logger = sentryAndroidOptions.getLogger();
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        logger.h(sentryLevel, "enableSystemEventsBreadcrumbs enabled: %s", Boolean.valueOf(this.f30378c.isEnableSystemEventBreadcrumbs()));
        if (this.f30378c.isEnableSystemEventBreadcrumbs()) {
            try {
                SensorManager sensorManager = (SensorManager) this.f30376a.getSystemService("sensor");
                this.f30379d = sensorManager;
                if (sensorManager != null) {
                    Sensor defaultSensor = sensorManager.getDefaultSensor(13);
                    if (defaultSensor != null) {
                        this.f30379d.registerListener(this, defaultSensor, 3);
                        sentryOptions.getLogger().h(sentryLevel, "TempSensorBreadcrumbsIntegration installed.", new Object[0]);
                    } else {
                        this.f30378c.getLogger().h(SentryLevel.INFO, "TYPE_AMBIENT_TEMPERATURE is not available.", new Object[0]);
                    }
                } else {
                    this.f30378c.getLogger().h(SentryLevel.INFO, "SENSOR_SERVICE is not available.", new Object[0]);
                }
            } catch (Throwable th) {
                sentryOptions.getLogger().d(SentryLevel.ERROR, th, "Failed to init. the SENSOR_SERVICE.", new Object[0]);
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr == null || fArr.length == 0 || fArr[0] == 0.0f || this.f30377b == null) {
            return;
        }
        C0844b c0844b = new C0844b();
        c0844b.f21964c = "system";
        c0844b.f21966e = "device.event";
        c0844b.a("TYPE_AMBIENT_TEMPERATURE", "action");
        c0844b.a(Integer.valueOf(sensorEvent.accuracy), "accuracy");
        c0844b.a(Long.valueOf(sensorEvent.timestamp), "timestamp");
        c0844b.f21967f = SentryLevel.INFO;
        c0844b.a(Float.valueOf(sensorEvent.values[0]), "degree");
        C0852j c0852j = new C0852j();
        c0852j.a(sensorEvent, "android:sensorEvent");
        this.f30377b.e(c0844b, c0852j);
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
