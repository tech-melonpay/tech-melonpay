package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import java.util.Map;

/* compiled from: AutoValue_SchedulerConfig.java */
/* loaded from: classes.dex */
public final class a extends SchedulerConfig {

    /* renamed from: a, reason: collision with root package name */
    public final r2.a f8966a;

    /* renamed from: b, reason: collision with root package name */
    public final Map<Priority, SchedulerConfig.a> f8967b;

    public a(r2.a aVar, Map<Priority, SchedulerConfig.a> map) {
        if (aVar == null) {
            throw new NullPointerException("Null clock");
        }
        this.f8966a = aVar;
        if (map == null) {
            throw new NullPointerException("Null values");
        }
        this.f8967b = map;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig
    public final r2.a a() {
        return this.f8966a;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig
    public final Map<Priority, SchedulerConfig.a> c() {
        return this.f8967b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SchedulerConfig)) {
            return false;
        }
        SchedulerConfig schedulerConfig = (SchedulerConfig) obj;
        return this.f8966a.equals(schedulerConfig.a()) && this.f8967b.equals(schedulerConfig.c());
    }

    public final int hashCode() {
        return ((this.f8966a.hashCode() ^ 1000003) * 1000003) ^ this.f8967b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f8966a + ", values=" + this.f8967b + "}";
    }
}
