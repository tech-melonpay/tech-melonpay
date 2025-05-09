package io.sentry;

import java.util.Locale;

/* loaded from: classes2.dex */
public enum SentryLevel implements F {
    DEBUG,
    INFO,
    WARNING,
    ERROR,
    FATAL;

    public static final class a implements A<SentryLevel> {
        @Override // io.sentry.A
        public final SentryLevel a(D d10, InterfaceC0859q interfaceC0859q) {
            return SentryLevel.valueOf(d10.r0().toUpperCase(Locale.ROOT));
        }
    }

    @Override // io.sentry.F
    public void serialize(E e10, InterfaceC0859q interfaceC0859q) {
        e10.H(name().toLowerCase(Locale.ROOT));
    }
}
