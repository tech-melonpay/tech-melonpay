package com.sumsub.sns.internal.core.data.network.interceptor;

import android.util.Base64;
import com.google.android.gms.common.internal.ImagesContract;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.core.data.listener.SNSErrorHandler;
import com.sumsub.sns.core.data.listener.TokenExpirationHandler;
import com.sumsub.sns.core.data.model.SNSException;
import com.sumsub.sns.internal.core.common.e0;
import com.sumsub.sns.internal.core.common.g0;
import com.sumsub.sns.internal.core.common.x;
import j3.e;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.util.List;
import ka.C0956a;
import ka.C0969n;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import na.InterfaceC1078b;
import na.InterfaceC1080d;
import oa.C1095a;
import okhttp3.h;
import okhttp3.k;
import okhttp3.p;
import pa.f;
import qa.InterfaceC1142b;
import qa.InterfaceC1143c;
import qa.InterfaceC1144d;
import qa.InterfaceC1145e;
import ra.InterfaceC1162A;
import ra.a0;
import ra.i0;
import ra.m0;
import sa.AbstractC1244a;
import va.g;

/* loaded from: classes2.dex */
public final class c implements g {

    /* renamed from: d, reason: collision with root package name */
    public static final a f15813d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.b<String> f15814a;

    /* renamed from: b, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.b<String> f15815b;

    /* renamed from: c, reason: collision with root package name */
    public int f15816c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0003\u0018\u0000 \u001b2\u00020\u0001:\u0002\u0012\u0018B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B3\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u0014\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0015R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u0014\u0012\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u0019\u0010\u0015¨\u0006\u001c"}, d2 = {"Lcom/sumsub/sns/internal/core/data/network/interceptor/c$b;", "", "", "accessToken", "redirectUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sns/internal/core/data/network/interceptor/c$b;Lqa/c;Lpa/f;)V", "Ljava/lang/String;", "()Ljava/lang/String;", "getAccessToken$annotations", "()V", "b", "c", "getRedirectUrl$annotations", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
    @InterfaceC1080d
    public static final class b {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final String accessToken;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final String redirectUrl;

        public static final class a implements InterfaceC1162A<b> {

            /* renamed from: a, reason: collision with root package name */
            public static final a f15819a;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ f f15820b;

            static {
                a aVar = new a();
                f15819a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.network.interceptor.TokenInterceptor.JWTPayload", aVar, 2);
                pluginGeneratedSerialDescriptor.k("jti", true);
                pluginGeneratedSerialDescriptor.k(ImagesContract.URL, true);
                f15820b = pluginGeneratedSerialDescriptor;
            }

            @Override // na.InterfaceC1077a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public b deserialize(InterfaceC1144d interfaceC1144d) {
                f descriptor = getDescriptor();
                InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
                i0 i0Var = null;
                boolean z10 = true;
                int i = 0;
                Object obj = null;
                Object obj2 = null;
                while (z10) {
                    int q10 = c2.q(descriptor);
                    if (q10 == -1) {
                        z10 = false;
                    } else if (q10 == 0) {
                        obj = c2.D(descriptor, 0, m0.f26414a, obj);
                        i |= 1;
                    } else {
                        if (q10 != 1) {
                            throw new UnknownFieldException(q10);
                        }
                        obj2 = c2.D(descriptor, 1, m0.f26414a, obj2);
                        i |= 2;
                    }
                }
                c2.b(descriptor);
                return new b(i, (String) obj, (String) obj2, i0Var);
            }

            @Override // ra.InterfaceC1162A
            public InterfaceC1078b<?>[] childSerializers() {
                m0 m0Var = m0.f26414a;
                return new InterfaceC1078b[]{C1095a.a(m0Var), C1095a.a(m0Var)};
            }

            @Override // na.InterfaceC1081e, na.InterfaceC1077a
            public f getDescriptor() {
                return f15820b;
            }

            @Override // ra.InterfaceC1162A
            public InterfaceC1078b<?>[] typeParametersSerializers() {
                return a0.f26382b;
            }

            @Override // na.InterfaceC1081e
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void serialize(InterfaceC1145e interfaceC1145e, b bVar) {
                f descriptor = getDescriptor();
                InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
                b.a(bVar, c2, descriptor);
                c2.b(descriptor);
            }
        }

        /* renamed from: com.sumsub.sns.internal.core.data.network.interceptor.c$b$b, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final InterfaceC1078b<b> serializer() {
                return a.f15819a;
            }

            public Companion() {
            }
        }

        public b() {
            this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static final void a(b self, InterfaceC1143c output, f serialDesc) {
            if (output.D() || self.accessToken != null) {
                output.e(serialDesc, 0, m0.f26414a, self.accessToken);
            }
            if (!output.D() && self.redirectUrl == null) {
                return;
            }
            output.e(serialDesc, 1, m0.f26414a, self.redirectUrl);
        }

        /* renamed from: c, reason: from getter */
        public final String getRedirectUrl() {
            return this.redirectUrl;
        }

        public /* synthetic */ b(int i, String str, String str2, i0 i0Var) {
            if ((i & 1) == 0) {
                this.accessToken = null;
            } else {
                this.accessToken = str;
            }
            if ((i & 2) == 0) {
                this.redirectUrl = null;
            } else {
                this.redirectUrl = str2;
            }
        }

        /* renamed from: a, reason: from getter */
        public final String getAccessToken() {
            return this.accessToken;
        }

        public b(String str, String str2) {
            this.accessToken = str;
            this.redirectUrl = str2;
        }

        public /* synthetic */ b(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
        }

        public static /* synthetic */ void b() {
        }

        public static /* synthetic */ void d() {
        }
    }

    public c(com.sumsub.sns.internal.core.b<String> bVar, com.sumsub.sns.internal.core.b<String> bVar2) {
        this.f15814a = bVar;
        this.f15815b = bVar2;
    }

    public final boolean a() {
        String str;
        TokenExpirationHandler tokenExpirationHandler;
        try {
            tokenExpirationHandler = e0.f15081a.getTokenExpirationHandler();
        } catch (Exception e10) {
            com.sumsub.sns.internal.log.a aVar = com.sumsub.sns.internal.log.a.f17535a;
            String a10 = com.sumsub.sns.internal.log.c.a(this);
            String message = e10.getMessage();
            if (message == null) {
                message = "";
            }
            aVar.e(a10, message, e10);
        }
        if (tokenExpirationHandler != null) {
            str = tokenExpirationHandler.onTokenExpired();
            if (str == null && g0.b(str)) {
                String str2 = e0.f15081a.isDebug() ? str : null;
                if (str2 != null) {
                    Logger.d$default(com.sumsub.sns.internal.log.a.f17535a, com.sumsub.sns.internal.log.c.a(this), "New token is available. Token is ".concat(str2), null, 4, null);
                }
                this.f15814a.a(str);
                return true;
            }
        }
        str = null;
        return str == null ? false : false;
    }

    public final k b(k kVar) {
        if (!g0.b(this.f15814a.get())) {
            Logger.d$default(com.sumsub.sns.internal.log.a.f17535a, com.sumsub.sns.internal.log.c.a(this), "Invalid token, try to refresh", null, 4, null);
            return null;
        }
        try {
            return a(kVar);
        } catch (Exception e10) {
            com.sumsub.sns.internal.log.a aVar = com.sumsub.sns.internal.log.a.f17535a;
            String a10 = com.sumsub.sns.internal.log.c.a(this);
            String message = e10.getMessage();
            if (message == null) {
                message = "";
            }
            aVar.e(a10, message, e10);
            SNSErrorHandler errorHandler = e0.f15081a.getErrorHandler();
            if (errorHandler == null) {
                return null;
            }
            errorHandler.onError(new SNSException.Unknown(e10));
            return null;
        }
    }

    public final k c(k kVar) {
        if (!a()) {
            return null;
        }
        try {
            return a(kVar);
        } catch (Exception e10) {
            com.sumsub.sns.internal.log.a aVar = com.sumsub.sns.internal.log.a.f17535a;
            String a10 = com.sumsub.sns.internal.log.c.a(this);
            String message = e10.getMessage();
            if (message == null) {
                message = "";
            }
            Logger.e$default(aVar, a10, message, null, 4, null);
            return null;
        }
    }

    @Override // va.g
    public synchronized p intercept(g.a aVar) {
        k request = aVar.request();
        k b9 = b(request);
        if (b9 != null) {
            request = b9;
        }
        p a10 = aVar.a(request);
        if (a10.f24674d != 401) {
            this.f15816c = 0;
            return a10;
        }
        Logger.d$default(com.sumsub.sns.internal.log.a.f17535a, com.sumsub.sns.internal.log.c.a(this), "Token is expired. Attempts(" + this.f15816c + "). Headers are " + a10.f24676f + ", try to refresh...", null, 4, null);
        while (true) {
            k c2 = c(request);
            if (c2 != null) {
                request = c2;
            }
            a10.close();
            a10 = aVar.a(request);
            if (a10.f24674d != 401) {
                this.f15816c = 0;
                break;
            }
            int i = this.f15816c + 1;
            this.f15816c = i;
            if (i >= 3) {
                break;
            }
        }
        if (this.f15816c >= 3) {
            this.f15816c = 0;
        }
        return a10;
    }

    public final k a(k kVar) {
        String redirectUrl;
        String accessToken;
        String str;
        String str2;
        k.a a10 = kVar.a();
        a10.f24652c.f("X-Access-Token");
        String str3 = this.f15814a.get();
        h hVar = null;
        if (!str3.startsWith("_act-jwt-") && !str3.startsWith("_act-sbx-jwt-")) {
            a10.a("X-Access-Token", str3);
        } else {
            try {
                List r02 = C0969n.r0(C0969n.n0(C0969n.n0(str3, "_act-jwt-"), "_act-sbx-jwt-"), new String[]{"."});
                String str4 = (String) r02.get(0);
                String str5 = (String) r02.get(1);
                byte[] decode = Base64.decode(URLDecoder.decode(str4, "utf-8"), 2);
                Charset charset = C0956a.f23054b;
                String str6 = new String(decode, charset);
                String str7 = new String(Base64.decode(URLDecoder.decode(str5, "utf-8"), 2), charset);
                Logger.d$default(com.sumsub.sns.internal.log.a.f17535a, com.sumsub.sns.internal.log.c.a(this), "JWT: header=" + str6 + " payload=" + str7, null, 4, null);
                AbstractC1244a a11 = x.a(false, 1, null);
                b bVar = (b) a11.c(e.B(a11.f27066b, kotlin.jvm.internal.h.b(b.class)), str7);
                if (bVar != null && (accessToken = bVar.getAccessToken()) != null) {
                    this.f15814a.a(accessToken);
                    a10.a("X-Access-Token", accessToken);
                }
                if (bVar != null && (redirectUrl = bVar.getRedirectUrl()) != null) {
                    this.f15815b.a(redirectUrl);
                }
            } catch (Exception unused) {
                a10.a("X-Access-Token", str3);
            }
        }
        String str8 = this.f15815b.get();
        if (str8 != null) {
            try {
                h.a aVar = new h.a();
                aVar.d(null, str8);
                hVar = aVar.a();
            } catch (IllegalArgumentException unused2) {
            }
            h hVar2 = kVar.f24644a;
            h.a f10 = hVar2.f();
            if (hVar == null || (str = hVar.f24525a) == null) {
                str = hVar2.f24525a;
            }
            f10.e(str);
            if (hVar == null || (str2 = hVar.f24528d) == null) {
                str2 = hVar2.f24528d;
            }
            f10.c(str2);
            h a12 = f10.a();
            Logger.d$default(com.sumsub.sns.internal.log.a.f17535a, com.sumsub.sns.internal.log.c.a(this), "Substitute url: " + hVar2 + " -> " + a12, null, 4, null);
            a10.f24650a = a12;
        }
        return a10.b();
    }
}
