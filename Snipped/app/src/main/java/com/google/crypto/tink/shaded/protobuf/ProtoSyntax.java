package com.google.crypto.tink.shaded.protobuf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ProtoSyntax {

    /* renamed from: a, reason: collision with root package name */
    public static final ProtoSyntax f10155a;

    /* renamed from: b, reason: collision with root package name */
    public static final ProtoSyntax f10156b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ ProtoSyntax[] f10157c;

    static {
        ProtoSyntax protoSyntax = new ProtoSyntax("PROTO2", 0);
        f10155a = protoSyntax;
        ProtoSyntax protoSyntax2 = new ProtoSyntax("PROTO3", 1);
        f10156b = protoSyntax2;
        f10157c = new ProtoSyntax[]{protoSyntax, protoSyntax2};
    }

    public ProtoSyntax() {
        throw null;
    }

    public static ProtoSyntax valueOf(String str) {
        return (ProtoSyntax) Enum.valueOf(ProtoSyntax.class, str);
    }

    public static ProtoSyntax[] values() {
        return (ProtoSyntax[]) f10157c.clone();
    }
}
