package okhttp3.logging;

import kotlin.Metadata;
import kotlin.collections.EmptySet;
import va.g;

/* compiled from: HttpLoggingInterceptor.kt */
/* loaded from: classes2.dex */
public final class HttpLoggingInterceptor implements g {

    /* renamed from: a, reason: collision with root package name */
    public final a f24657a;

    /* renamed from: b, reason: collision with root package name */
    public volatile EmptySet f24658b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Level f24659c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: HttpLoggingInterceptor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Level;", "", "okhttp-logging-interceptor"}, k = 1, mv = {1, 8, 0})
    public static final class Level {

        /* renamed from: a, reason: collision with root package name */
        public static final Level f24660a;

        /* renamed from: b, reason: collision with root package name */
        public static final Level f24661b;

        /* renamed from: c, reason: collision with root package name */
        public static final Level f24662c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ Level[] f24663d;

        static {
            Level level = new Level("NONE", 0);
            f24660a = level;
            Level level2 = new Level("BASIC", 1);
            Level level3 = new Level("HEADERS", 2);
            f24661b = level3;
            Level level4 = new Level("BODY", 3);
            f24662c = level4;
            f24663d = new Level[]{level, level2, level3, level4};
        }

        public Level() {
            throw null;
        }

        public static Level valueOf(String str) {
            return (Level) Enum.valueOf(Level.class, str);
        }

        public static Level[] values() {
            return (Level[]) f24663d.clone();
        }
    }

    /* compiled from: HttpLoggingInterceptor.kt */
    public interface a {

        /* renamed from: h, reason: collision with root package name */
        public static final okhttp3.logging.a f24664h = new okhttp3.logging.a();

        void b(String str);
    }

    public HttpLoggingInterceptor(a aVar) {
        this.f24657a = aVar;
        this.f24658b = EmptySet.f23106a;
        this.f24659c = Level.f24660a;
    }

    public final void a(okhttp3.g gVar, int i) {
        EmptySet emptySet = this.f24658b;
        String c2 = gVar.c(i);
        emptySet.getClass();
        boolean z10 = c2 instanceof Void;
        String f10 = gVar.f(i);
        this.f24657a.b(gVar.c(i) + ": " + f10);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00eb A[LOOP:0: B:35:0x00e9->B:36:0x00eb, LOOP_END] */
    @Override // va.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final okhttp3.p intercept(va.g.a r24) {
        /*
            Method dump skipped, instructions count: 948
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.logging.HttpLoggingInterceptor.intercept(va.g$a):okhttp3.p");
    }

    public /* synthetic */ HttpLoggingInterceptor() {
        this(a.f24664h);
    }
}
