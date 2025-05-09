package com.sumsub.sns.internal.fingerprint;

import O9.f;
import O9.p;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class Fingerprinter {

    /* renamed from: c, reason: collision with root package name */
    public static final a f16976c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0635a<b> f16977a;

    /* renamed from: b, reason: collision with root package name */
    public final f f16978b = kotlin.a.a(new d());

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/sumsub/sns/internal/fingerprint/Fingerprinter$Version;", "", "", "intValue", "I", "getIntValue$idensic_mobile_sdk_aar_release", "()I", "<init>", "(Ljava/lang/String;II)V", "Companion", "a", "V_4", "V_5", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
    public enum Version {
        V_4(4),
        V_5(5);

        private final int intValue;

        Version(int i) {
            this.intValue = i;
        }

        /* renamed from: getIntValue$idensic_mobile_sdk_aar_release, reason: from getter */
        public final int getIntValue() {
            return this.intValue;
        }
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static final class c extends Lambda implements InterfaceC0635a<p> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f16980b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f16981c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC0646l interfaceC0646l, InterfaceC0646l interfaceC0646l2) {
            super(0);
            this.f16980b = interfaceC0646l;
            this.f16981c = interfaceC0646l2;
        }

        public final void a() {
            Object b9 = Fingerprinter.this.b();
            if (!(b9 instanceof Result.Failure)) {
                b9 = new Result(((b) b9).a());
            }
            Object a10 = com.sumsub.sns.internal.fingerprint.tools.b.a(b9);
            InterfaceC0646l interfaceC0646l = this.f16980b;
            if (Result.a(a10) == null) {
                interfaceC0646l.invoke(a10);
            } else {
                this.f16981c.invoke(kotlin.collections.a.p());
            }
        }

        @Override // ca.InterfaceC0635a
        public /* bridge */ /* synthetic */ p invoke() {
            a();
            return p.f3034a;
        }
    }

    public static final class d extends Lambda implements InterfaceC0635a<Result<? extends b>> {
        public d() {
            super(0);
        }

        public final Object a() {
            try {
                return (b) Fingerprinter.this.f16977a.invoke();
            } catch (Throwable th) {
                return new Result.Failure(th);
            }
        }

        @Override // ca.InterfaceC0635a
        public /* synthetic */ Result<? extends b> invoke() {
            return new Result<>(a());
        }
    }

    public Fingerprinter(InterfaceC0635a<b> interfaceC0635a) {
        this.f16977a = interfaceC0635a;
    }

    public final Object b() {
        return ((Result) this.f16978b.getValue()).f23091a;
    }

    public final void b(InterfaceC0646l<? super Map<String, String>, p> interfaceC0646l) {
        if (Result.a(com.sumsub.sns.internal.fingerprint.tools.threading.a.a(new c(interfaceC0646l, interfaceC0646l))) != null) {
            interfaceC0646l.invoke(kotlin.collections.a.p());
        }
    }
}
