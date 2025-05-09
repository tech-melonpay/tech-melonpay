package androidx.work;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class NetworkType {

    /* renamed from: a, reason: collision with root package name */
    public static final NetworkType f8092a;

    /* renamed from: b, reason: collision with root package name */
    public static final NetworkType f8093b;

    /* renamed from: c, reason: collision with root package name */
    public static final NetworkType f8094c;

    /* renamed from: d, reason: collision with root package name */
    public static final NetworkType f8095d;

    /* renamed from: e, reason: collision with root package name */
    public static final NetworkType f8096e;

    /* renamed from: f, reason: collision with root package name */
    public static final NetworkType f8097f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ NetworkType[] f8098g;

    static {
        NetworkType networkType = new NetworkType("NOT_REQUIRED", 0);
        f8092a = networkType;
        NetworkType networkType2 = new NetworkType("CONNECTED", 1);
        f8093b = networkType2;
        NetworkType networkType3 = new NetworkType("UNMETERED", 2);
        f8094c = networkType3;
        NetworkType networkType4 = new NetworkType("NOT_ROAMING", 3);
        f8095d = networkType4;
        NetworkType networkType5 = new NetworkType("METERED", 4);
        f8096e = networkType5;
        NetworkType networkType6 = new NetworkType("TEMPORARILY_UNMETERED", 5);
        f8097f = networkType6;
        f8098g = new NetworkType[]{networkType, networkType2, networkType3, networkType4, networkType5, networkType6};
    }

    public NetworkType() {
        throw null;
    }

    public static NetworkType valueOf(String str) {
        return (NetworkType) Enum.valueOf(NetworkType.class, str);
    }

    public static NetworkType[] values() {
        return (NetworkType[]) f8098g.clone();
    }
}
