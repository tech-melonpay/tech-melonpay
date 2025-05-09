package kotlinx.serialization.json.internal;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WriteMode.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/json/internal/WriteMode;", "", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class WriteMode {

    /* renamed from: c, reason: collision with root package name */
    public static final WriteMode f23398c;

    /* renamed from: d, reason: collision with root package name */
    public static final WriteMode f23399d;

    /* renamed from: e, reason: collision with root package name */
    public static final WriteMode f23400e;

    /* renamed from: f, reason: collision with root package name */
    public static final WriteMode f23401f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ WriteMode[] f23402g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ W9.a f23403h;

    /* renamed from: a, reason: collision with root package name */
    public final char f23404a;

    /* renamed from: b, reason: collision with root package name */
    public final char f23405b;

    static {
        WriteMode writeMode = new WriteMode("OBJ", 0, '{', '}');
        f23398c = writeMode;
        WriteMode writeMode2 = new WriteMode("LIST", 1, '[', ']');
        f23399d = writeMode2;
        WriteMode writeMode3 = new WriteMode("MAP", 2, '{', '}');
        f23400e = writeMode3;
        WriteMode writeMode4 = new WriteMode("POLY_OBJ", 3, '[', ']');
        f23401f = writeMode4;
        WriteMode[] writeModeArr = {writeMode, writeMode2, writeMode3, writeMode4};
        f23402g = writeModeArr;
        f23403h = kotlin.enums.a.a(writeModeArr);
    }

    public WriteMode(String str, int i, char c2, char c10) {
        this.f23404a = c2;
        this.f23405b = c10;
    }

    public static WriteMode valueOf(String str) {
        return (WriteMode) Enum.valueOf(WriteMode.class, str);
    }

    public static WriteMode[] values() {
        return (WriteMode[]) f23402g.clone();
    }
}
