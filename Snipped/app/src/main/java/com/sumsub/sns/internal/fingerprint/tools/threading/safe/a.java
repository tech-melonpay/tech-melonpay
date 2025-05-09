package com.sumsub.sns.internal.fingerprint.tools.threading.safe;

import C.v;
import P9.s;
import ca.InterfaceC0646l;
import java.util.List;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class a extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final List<StackTraceElement> f17361a;

    /* renamed from: com.sumsub.sns.internal.fingerprint.tools.threading.safe.a$a, reason: collision with other inner class name */
    public static final class C0258a extends Lambda implements InterfaceC0646l<StackTraceElement, CharSequence> {

        /* renamed from: a, reason: collision with root package name */
        public static final C0258a f17362a = new C0258a();

        public C0258a() {
            super(1);
        }

        @Override // ca.InterfaceC0646l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(StackTraceElement stackTraceElement) {
            return stackTraceElement.toString();
        }
    }

    public a(TimeoutException timeoutException, List<StackTraceElement> list) {
        super(timeoutException);
        this.f17361a = list;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb2 = new StringBuilder("The execution took too long to complete. Original exception: ");
        sb2.append(getCause());
        sb2.append(", execution thread stacktrace: ");
        List<StackTraceElement> list = this.f17361a;
        return v.q(sb2, list != null ? s.P(list, null, null, null, C0258a.f17362a, 31) : null, '.');
    }
}
