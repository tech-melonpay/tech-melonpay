package com.github.barteksc.pdfviewer.util;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class SnapEdge {

    /* renamed from: a, reason: collision with root package name */
    public static final SnapEdge f8878a;

    /* renamed from: b, reason: collision with root package name */
    public static final SnapEdge f8879b;

    /* renamed from: c, reason: collision with root package name */
    public static final SnapEdge f8880c;

    /* renamed from: d, reason: collision with root package name */
    public static final SnapEdge f8881d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ SnapEdge[] f8882e;

    static {
        SnapEdge snapEdge = new SnapEdge("START", 0);
        f8878a = snapEdge;
        SnapEdge snapEdge2 = new SnapEdge("CENTER", 1);
        f8879b = snapEdge2;
        SnapEdge snapEdge3 = new SnapEdge("END", 2);
        f8880c = snapEdge3;
        SnapEdge snapEdge4 = new SnapEdge("NONE", 3);
        f8881d = snapEdge4;
        f8882e = new SnapEdge[]{snapEdge, snapEdge2, snapEdge3, snapEdge4};
    }

    public SnapEdge() {
        throw null;
    }

    public static SnapEdge valueOf(String str) {
        return (SnapEdge) Enum.valueOf(SnapEdge.class, str);
    }

    public static SnapEdge[] values() {
        return (SnapEdge[]) f8882e.clone();
    }
}
