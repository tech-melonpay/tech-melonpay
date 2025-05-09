package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.Priority;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class SchedulerConfig {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Flag {

        /* renamed from: a, reason: collision with root package name */
        public static final Flag f8962a;

        /* renamed from: b, reason: collision with root package name */
        public static final Flag f8963b;

        /* renamed from: c, reason: collision with root package name */
        public static final Flag f8964c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ Flag[] f8965d;

        static {
            Flag flag = new Flag("NETWORK_UNMETERED", 0);
            f8962a = flag;
            Flag flag2 = new Flag("DEVICE_IDLE", 1);
            f8963b = flag2;
            Flag flag3 = new Flag("DEVICE_CHARGING", 2);
            f8964c = flag3;
            f8965d = new Flag[]{flag, flag2, flag3};
        }

        public Flag() {
            throw null;
        }

        public static Flag valueOf(String str) {
            return (Flag) Enum.valueOf(Flag.class, str);
        }

        public static Flag[] values() {
            return (Flag[]) f8965d.clone();
        }
    }

    public static abstract class a {
        public abstract long a();

        public abstract Set<Flag> b();

        public abstract long c();
    }

    public abstract r2.a a();

    public final long b(Priority priority, long j10, int i) {
        long a10 = j10 - a().a();
        a aVar = c().get(priority);
        long a11 = aVar.a();
        return Math.min(Math.max((long) (Math.pow(3.0d, i - 1) * a11 * Math.max(1.0d, Math.log(10000.0d) / Math.log((a11 > 1 ? a11 : 2L) * r12))), a10), aVar.c());
    }

    public abstract Map<Priority, a> c();
}
