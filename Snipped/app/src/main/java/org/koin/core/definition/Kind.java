package org.koin.core.definition;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BeanDefinition.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lorg/koin/core/definition/Kind;", "", "koin-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class Kind {

    /* renamed from: a, reason: collision with root package name */
    public static final Kind f25548a;

    /* renamed from: b, reason: collision with root package name */
    public static final Kind f25549b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ Kind[] f25550c;

    static {
        Kind kind = new Kind("Singleton", 0);
        f25548a = kind;
        Kind kind2 = new Kind("Factory", 1);
        f25549b = kind2;
        f25550c = new Kind[]{kind, kind2, new Kind("Scoped", 2)};
    }

    public Kind() {
        throw null;
    }

    public static Kind valueOf(String str) {
        return (Kind) Enum.valueOf(Kind.class, str);
    }

    public static Kind[] values() {
        return (Kind[]) f25550c.clone();
    }
}
