package com.google.gson.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class JsonToken {

    /* renamed from: a, reason: collision with root package name */
    public static final JsonToken f10410a;

    /* renamed from: b, reason: collision with root package name */
    public static final JsonToken f10411b;

    /* renamed from: c, reason: collision with root package name */
    public static final JsonToken f10412c;

    /* renamed from: d, reason: collision with root package name */
    public static final JsonToken f10413d;

    /* renamed from: e, reason: collision with root package name */
    public static final JsonToken f10414e;

    /* renamed from: f, reason: collision with root package name */
    public static final JsonToken f10415f;

    /* renamed from: g, reason: collision with root package name */
    public static final JsonToken f10416g;

    /* renamed from: h, reason: collision with root package name */
    public static final JsonToken f10417h;
    public static final JsonToken i;

    /* renamed from: j, reason: collision with root package name */
    public static final JsonToken f10418j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ JsonToken[] f10419k;

    static {
        JsonToken jsonToken = new JsonToken("BEGIN_ARRAY", 0);
        f10410a = jsonToken;
        JsonToken jsonToken2 = new JsonToken("END_ARRAY", 1);
        f10411b = jsonToken2;
        JsonToken jsonToken3 = new JsonToken("BEGIN_OBJECT", 2);
        f10412c = jsonToken3;
        JsonToken jsonToken4 = new JsonToken("END_OBJECT", 3);
        f10413d = jsonToken4;
        JsonToken jsonToken5 = new JsonToken("NAME", 4);
        f10414e = jsonToken5;
        JsonToken jsonToken6 = new JsonToken("STRING", 5);
        f10415f = jsonToken6;
        JsonToken jsonToken7 = new JsonToken("NUMBER", 6);
        f10416g = jsonToken7;
        JsonToken jsonToken8 = new JsonToken("BOOLEAN", 7);
        f10417h = jsonToken8;
        JsonToken jsonToken9 = new JsonToken("NULL", 8);
        i = jsonToken9;
        JsonToken jsonToken10 = new JsonToken("END_DOCUMENT", 9);
        f10418j = jsonToken10;
        f10419k = new JsonToken[]{jsonToken, jsonToken2, jsonToken3, jsonToken4, jsonToken5, jsonToken6, jsonToken7, jsonToken8, jsonToken9, jsonToken10};
    }

    public JsonToken() {
        throw null;
    }

    public static JsonToken valueOf(String str) {
        return (JsonToken) Enum.valueOf(JsonToken.class, str);
    }

    public static JsonToken[] values() {
        return (JsonToken[]) f10419k.clone();
    }
}
