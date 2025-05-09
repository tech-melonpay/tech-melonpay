package kotlin.reflect;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: KVisibility.kt */
/* loaded from: classes2.dex */
public final class KVisibility {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ KVisibility[] f23198a = {new KVisibility("PUBLIC", 0), new KVisibility("PROTECTED", 1), new KVisibility("INTERNAL", 2), new KVisibility("PRIVATE", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    KVisibility EF5;

    public KVisibility() {
        throw null;
    }

    public static KVisibility valueOf(String str) {
        return (KVisibility) Enum.valueOf(KVisibility.class, str);
    }

    public static KVisibility[] values() {
        return (KVisibility[]) f23198a.clone();
    }
}
