package com.sumsub.sentry;

import ca.InterfaceC0635a;
import com.google.android.gms.common.internal.ImagesContract;
import com.sumsub.log.logger.Logger;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import na.InterfaceC1078b;
import na.InterfaceC1080d;
import okhttp3.i;
import okhttp3.k;
import okhttp3.o;
import qa.InterfaceC1142b;
import qa.InterfaceC1143c;
import qa.InterfaceC1144d;
import qa.InterfaceC1145e;
import ra.InterfaceC1162A;
import va.h;

@InterfaceC1080d
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0012'B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B%\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0012\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0016J#\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0019J\u001b\u0010\u0012\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001aH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u001cJ\u0017\u0010\u0012\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u0012\u0010\u001fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010 R\u001b\u0010%\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u0012\u0010$\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006("}, d2 = {"Lcom/sumsub/sentry/g0;", "Lcom/sumsub/sns/internal/log/cacher/a;", "Lcom/sumsub/sentry/v;", "", ImagesContract.URL, "<init>", "(Ljava/lang/String;)V", "", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILjava/lang/String;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sentry/g0;Lqa/c;Lpa/f;)V", "value", "", "(Lcom/sumsub/sentry/v;LT9/a;)Ljava/lang/Object;", "Ljava/io/OutputStream;", "outputStream", "(Lcom/sumsub/sentry/v;Ljava/io/OutputStream;LT9/a;)Ljava/lang/Object;", "Ljava/io/InputStream;", "inputStream", "(Ljava/io/InputStream;LT9/a;)Ljava/lang/Object;", "", "bytes", "([B)Z", "Ljava/lang/String;", "Lva/h;", "b", "LO9/f;", "()Lva/h;", "sentryOkHttpClient", "Companion", "c", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class g0 implements com.sumsub.sns.internal.log.cacher.a<v> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c, reason: collision with root package name */
    public static final String f13640c = "SentrySink";

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String url;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final O9.f sentryOkHttpClient;

    public static final class a implements InterfaceC1162A<g0> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f13643a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ pa.f f13644b;

        static {
            a aVar = new a();
            f13643a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sentry.SentrySink", aVar, 1);
            pluginGeneratedSerialDescriptor.k(ImagesContract.URL, false);
            f13644b = pluginGeneratedSerialDescriptor;
        }

        @Override // na.InterfaceC1077a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public g0 deserialize(InterfaceC1144d interfaceC1144d) {
            pa.f descriptor = getDescriptor();
            InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
            ra.i0 i0Var = null;
            boolean z10 = true;
            int i = 0;
            String str = null;
            while (z10) {
                int q10 = c2.q(descriptor);
                if (q10 == -1) {
                    z10 = false;
                } else {
                    if (q10 != 0) {
                        throw new UnknownFieldException(q10);
                    }
                    str = c2.y(descriptor, 0);
                    i = 1;
                }
            }
            c2.b(descriptor);
            return new g0(i, str, i0Var);
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] childSerializers() {
            return new InterfaceC1078b[]{ra.m0.f26414a};
        }

        @Override // na.InterfaceC1081e, na.InterfaceC1077a
        public pa.f getDescriptor() {
            return f13644b;
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] typeParametersSerializers() {
            return ra.a0.f26382b;
        }

        @Override // na.InterfaceC1081e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(InterfaceC1145e interfaceC1145e, g0 g0Var) {
            pa.f descriptor = getDescriptor();
            InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
            g0.a(g0Var, c2, descriptor);
            c2.b(descriptor);
        }
    }

    public static final class b extends Lambda implements InterfaceC0635a<va.h> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f13645a = new b();

        public b() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final va.h invoke() {
            h.a aVar = new h.a();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            aVar.f30753x = wa.b.b("timeout", 30L, timeUnit);
            aVar.a(30L, timeUnit);
            aVar.b(30L, timeUnit);
            aVar.c(30L, timeUnit);
            aVar.f30728B = wa.b.b("interval", 20L, timeUnit);
            return new va.h(aVar);
        }
    }

    /* renamed from: com.sumsub.sentry.g0$c, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC1078b<g0> serializer() {
            return a.f13643a;
        }

        public Companion() {
        }
    }

    public static final class d extends Lambda implements InterfaceC0635a<va.h> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f13646a = new d();

        public d() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final va.h invoke() {
            h.a aVar = new h.a();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            aVar.f30753x = wa.b.b("timeout", 30L, timeUnit);
            aVar.a(30L, timeUnit);
            aVar.b(30L, timeUnit);
            aVar.c(30L, timeUnit);
            aVar.f30728B = wa.b.b("interval", 20L, timeUnit);
            return new va.h(aVar);
        }
    }

    public /* synthetic */ g0(int i, String str, ra.i0 i0Var) {
        if (1 != (i & 1)) {
            ra.a0.h(i, 1, a.f13643a.getDescriptor());
            throw null;
        }
        this.url = str;
        this.sentryOkHttpClient = kotlin.a.a(b.f13645a);
    }

    @Override // com.sumsub.sns.internal.log.cacher.a
    public /* bridge */ /* synthetic */ Object a(v vVar, OutputStream outputStream, T9.a aVar) {
        return a2(vVar, outputStream, (T9.a<? super O9.p>) aVar);
    }

    @Override // com.sumsub.sns.internal.log.cacher.c
    public /* bridge */ /* synthetic */ Object send(Object obj, T9.a aVar) {
        return a((v) obj, (T9.a<? super Boolean>) aVar);
    }

    public static final void a(g0 self, InterfaceC1143c output, pa.f serialDesc) {
        output.x(serialDesc, 0, self.url);
    }

    public final va.h a() {
        return (va.h) this.sentryOkHttpClient.getValue();
    }

    public Object a(v vVar, T9.a<? super Boolean> aVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        try {
            m.f13714a.a(vVar, gZIPOutputStream);
            O9.p pVar = O9.p.f3034a;
            U4.b.d(gZIPOutputStream, null);
            return Boolean.valueOf(a(byteArrayOutputStream.toByteArray()));
        } finally {
        }
    }

    public g0(String str) {
        this.url = str;
        this.sentryOkHttpClient = kotlin.a.a(d.f13646a);
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    public Object a2(v vVar, OutputStream outputStream, T9.a<? super O9.p> aVar) {
        m.f13714a.a(vVar, outputStream);
        return O9.p.f3034a;
    }

    @Override // com.sumsub.sns.internal.log.cacher.a
    public Object a(InputStream inputStream, T9.a<? super Boolean> aVar) {
        boolean z10;
        Logger.d$default(com.sumsub.sns.internal.log.a.f17535a, f13640c, "Resend envelope from cache", null, 4, null);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(U4.b.w(inputStream));
                O9.p pVar = O9.p.f3034a;
                U4.b.d(gZIPOutputStream, null);
                z10 = a(byteArrayOutputStream.toByteArray());
            } finally {
            }
        } catch (Exception e10) {
            Logger.d$default(com.sumsub.sns.internal.log.a.f17535a, f13640c, com.google.android.gms.measurement.internal.a.i("Can't resend envelope from cache: ", e10), null, 4, null);
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    public final boolean a(byte[] bytes) {
        try {
            k.a aVar = new k.a();
            aVar.g(this.url + "api/2/envelope/");
            aVar.f24652c.g("Content-Encoding", "gzip");
            aVar.f24652c.g("Accept", "application/json");
            aVar.f24652c.g("Connection", "close");
            aVar.f24652c.g("User-Agent", "1.32.0");
            aVar.f24652c.g("X-Sentry-Auth", "Sentry sentry_version=7,sentry_client=1.32.0,sentry_key=5ed67192b2104fb682468a5be4dee5da");
            o.a aVar2 = okhttp3.o.Companion;
            Pattern pattern = okhttp3.i.f24542d;
            aVar.d("POST", o.a.b(aVar2, bytes, i.a.a("application/x-sentry-envelope"), 6));
            return a().a(aVar.b()).execute().j();
        } catch (Exception unused) {
            return false;
        }
    }
}
