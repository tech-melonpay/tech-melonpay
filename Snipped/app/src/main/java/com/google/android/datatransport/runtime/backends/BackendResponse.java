package com.google.android.datatransport.runtime.backends;

/* loaded from: classes.dex */
public abstract class BackendResponse {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Status {

        /* renamed from: a, reason: collision with root package name */
        public static final Status f8954a;

        /* renamed from: b, reason: collision with root package name */
        public static final Status f8955b;

        /* renamed from: c, reason: collision with root package name */
        public static final Status f8956c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ Status[] f8957d;

        static {
            Status status = new Status("OK", 0);
            f8954a = status;
            Status status2 = new Status("TRANSIENT_ERROR", 1);
            f8955b = status2;
            Status status3 = new Status("FATAL_ERROR", 2);
            f8956c = status3;
            f8957d = new Status[]{status, status2, status3};
        }

        public Status() {
            throw null;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) f8957d.clone();
        }
    }

    public abstract long a();

    public abstract Status b();
}
