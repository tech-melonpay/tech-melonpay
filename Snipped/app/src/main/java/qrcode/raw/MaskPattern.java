package qrcode.raw;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: QRCodeEnums.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lqrcode/raw/MaskPattern;", "", "qrcode-kotlin_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class MaskPattern {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ MaskPattern[] f26138a = {new MaskPattern("PATTERN000", 0), new MaskPattern("PATTERN001", 1), new MaskPattern("PATTERN010", 2), new MaskPattern("PATTERN011", 3), new MaskPattern("PATTERN100", 4), new MaskPattern("PATTERN101", 5), new MaskPattern("PATTERN110", 6), new MaskPattern("PATTERN111", 7)};

    /* JADX INFO: Fake field, exist only in values array */
    MaskPattern EF5;

    public MaskPattern() {
        throw null;
    }

    public static MaskPattern valueOf(String str) {
        return (MaskPattern) Enum.valueOf(MaskPattern.class, str);
    }

    public static MaskPattern[] values() {
        return (MaskPattern[]) f26138a.clone();
    }
}
