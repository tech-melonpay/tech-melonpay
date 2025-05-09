package io.github.g00fy2.versioncompare;

/* loaded from: classes2.dex */
public final class VersionComparator {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ReleaseType {

        /* renamed from: a, reason: collision with root package name */
        public static final ReleaseType f21522a;

        /* renamed from: b, reason: collision with root package name */
        public static final ReleaseType f21523b;

        /* renamed from: c, reason: collision with root package name */
        public static final ReleaseType f21524c;

        /* renamed from: d, reason: collision with root package name */
        public static final ReleaseType f21525d;

        /* renamed from: e, reason: collision with root package name */
        public static final ReleaseType f21526e;

        /* renamed from: f, reason: collision with root package name */
        public static final ReleaseType f21527f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ ReleaseType[] f21528g;

        static {
            ReleaseType releaseType = new ReleaseType("SNAPSHOT", 0);
            f21522a = releaseType;
            ReleaseType releaseType2 = new ReleaseType("PRE_ALPHA", 1);
            f21523b = releaseType2;
            ReleaseType releaseType3 = new ReleaseType("ALPHA", 2);
            f21524c = releaseType3;
            ReleaseType releaseType4 = new ReleaseType("BETA", 3);
            f21525d = releaseType4;
            ReleaseType releaseType5 = new ReleaseType("RC", 4);
            f21526e = releaseType5;
            ReleaseType releaseType6 = new ReleaseType("STABLE", 5);
            f21527f = releaseType6;
            f21528g = new ReleaseType[]{releaseType, releaseType2, releaseType3, releaseType4, releaseType5, releaseType6};
        }

        public ReleaseType() {
            throw null;
        }

        public static ReleaseType valueOf(String str) {
            return (ReleaseType) Enum.valueOf(ReleaseType.class, str);
        }

        public static ReleaseType[] values() {
            return (ReleaseType[]) f21528g.clone();
        }
    }

    public static long a(String str) {
        if (str.length() > 19) {
            str = str.substring(0, 19);
        }
        return Long.parseLong(str);
    }
}
