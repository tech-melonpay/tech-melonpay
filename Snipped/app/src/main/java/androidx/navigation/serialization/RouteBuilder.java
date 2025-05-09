package androidx.navigation.serialization;

import kotlin.Metadata;
import na.InterfaceC1078b;

/* compiled from: RouteBuilder.kt */
/* loaded from: classes.dex */
public final class RouteBuilder<T> {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1078b<T> f7332a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7333b;

    /* renamed from: c, reason: collision with root package name */
    public String f7334c = "";

    /* renamed from: d, reason: collision with root package name */
    public String f7335d = "";

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RouteBuilder.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/navigation/serialization/RouteBuilder$ParamType;", "", "navigation-common_release"}, k = 1, mv = {1, 8, 0})
    public static final class ParamType {

        /* renamed from: a, reason: collision with root package name */
        public static final ParamType f7336a;

        /* renamed from: b, reason: collision with root package name */
        public static final ParamType f7337b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ ParamType[] f7338c;

        static {
            ParamType paramType = new ParamType("PATH", 0);
            f7336a = paramType;
            ParamType paramType2 = new ParamType("QUERY", 1);
            f7337b = paramType2;
            f7338c = new ParamType[]{paramType, paramType2};
        }

        public ParamType() {
            throw null;
        }

        public static ParamType valueOf(String str) {
            return (ParamType) Enum.valueOf(ParamType.class, str);
        }

        public static ParamType[] values() {
            return (ParamType[]) f7338c.clone();
        }
    }

    public RouteBuilder(InterfaceC1078b<T> interfaceC1078b) {
        this.f7332a = interfaceC1078b;
        this.f7333b = interfaceC1078b.getDescriptor().a();
    }
}
