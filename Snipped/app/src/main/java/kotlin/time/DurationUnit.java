package kotlin.time;

import java.util.concurrent.TimeUnit;

/* compiled from: DurationUnitJvm.kt */
/* loaded from: classes2.dex */
public enum DurationUnit {
    NANOSECONDS(TimeUnit.NANOSECONDS),
    MICROSECONDS(TimeUnit.MICROSECONDS),
    MILLISECONDS(TimeUnit.MILLISECONDS),
    SECONDS(TimeUnit.SECONDS),
    MINUTES(TimeUnit.MINUTES),
    HOURS(TimeUnit.HOURS),
    DAYS(TimeUnit.DAYS);


    /* renamed from: a, reason: collision with root package name */
    public final TimeUnit f23215a;

    DurationUnit(TimeUnit timeUnit) {
        this.f23215a = timeUnit;
    }
}
