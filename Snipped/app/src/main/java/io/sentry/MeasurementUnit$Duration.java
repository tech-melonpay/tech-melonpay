package io.sentry;

import java.util.Locale;

/* loaded from: classes2.dex */
public enum MeasurementUnit$Duration {
    NANOSECOND,
    MICROSECOND,
    MILLISECOND,
    SECOND,
    MINUTE,
    HOUR,
    DAY,
    WEEK;

    public String apiName() {
        return name().toLowerCase(Locale.ROOT);
    }
}
