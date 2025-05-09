package com.google.gson;

/* compiled from: FormattingStyle.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final c f10320d = new c("", "", false);

    /* renamed from: e, reason: collision with root package name */
    public static final c f10321e = new c("\n", "  ", true);

    /* renamed from: a, reason: collision with root package name */
    public final String f10322a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10323b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f10324c;

    public c(String str, String str2, boolean z10) {
        if (!str.matches("[\r\n]*")) {
            throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
        }
        if (!str2.matches("[ \t]*")) {
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        this.f10322a = str;
        this.f10323b = str2;
        this.f10324c = z10;
    }
}
