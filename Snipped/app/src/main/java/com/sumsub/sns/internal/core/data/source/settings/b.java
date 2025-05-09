package com.sumsub.sns.internal.core.data.source.settings;

import java.util.UUID;

/* loaded from: classes2.dex */
public interface b {
    String a();

    void a(String str);

    void a(UUID uuid);

    String b();

    void b(String str);

    void c(String str);

    void d();

    void d(String str);

    default void e() {
        c(null);
        a((String) null);
    }

    String f();

    UUID g();

    String h();

    boolean i();
}
