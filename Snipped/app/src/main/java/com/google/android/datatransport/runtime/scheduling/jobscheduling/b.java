package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import java.util.Set;

/* compiled from: AutoValue_SchedulerConfig_ConfigValue.java */
/* loaded from: classes.dex */
public final class b extends SchedulerConfig.a {

    /* renamed from: a, reason: collision with root package name */
    public final long f8968a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8969b;

    /* renamed from: c, reason: collision with root package name */
    public final Set<SchedulerConfig.Flag> f8970c;

    public b(long j10, long j11, Set set) {
        this.f8968a = j10;
        this.f8969b = j11;
        this.f8970c = set;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.a
    public final long a() {
        return this.f8968a;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.a
    public final Set<SchedulerConfig.Flag> b() {
        return this.f8970c;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.a
    public final long c() {
        return this.f8969b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SchedulerConfig.a)) {
            return false;
        }
        SchedulerConfig.a aVar = (SchedulerConfig.a) obj;
        return this.f8968a == aVar.a() && this.f8969b == aVar.c() && this.f8970c.equals(aVar.b());
    }

    public final int hashCode() {
        long j10 = this.f8968a;
        int i = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        long j11 = this.f8969b;
        return ((i ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f8970c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f8968a + ", maxAllowedDelay=" + this.f8969b + ", flags=" + this.f8970c + "}";
    }
}
