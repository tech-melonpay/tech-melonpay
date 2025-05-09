package I9;

import I9.l;
import androidx.camera.core.n;
import com.bumptech.glide.load.Key;
import io.sentry.InterfaceC0859q;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: HttpConnection.java */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    public static final Charset f1931e = Charset.forName(Key.STRING_CHARSET_NAME);

    /* renamed from: a, reason: collision with root package name */
    public final Proxy f1932a;

    /* renamed from: b, reason: collision with root package name */
    public final B1.f f1933b;

    /* renamed from: c, reason: collision with root package name */
    public final SentryOptions f1934c;

    /* renamed from: d, reason: collision with root package name */
    public final k f1935d;

    public d(SentryOptions sentryOptions, B1.f fVar, k kVar) {
        Proxy proxy;
        String str;
        String str2;
        this.f1933b = fVar;
        this.f1934c = sentryOptions;
        this.f1935d = kVar;
        SentryOptions.d proxy2 = sentryOptions.getProxy();
        if (proxy2 != null && (str = proxy2.f21868b) != null && (str2 = proxy2.f21867a) != null) {
            try {
                proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(str2, Integer.parseInt(str)));
            } catch (NumberFormatException e10) {
                this.f1934c.getLogger().d(SentryLevel.ERROR, e10, n.a("Failed to parse Sentry Proxy port: ", str, ". Proxy is ignored"), new Object[0]);
            }
            this.f1932a = proxy;
            if (proxy != null || sentryOptions.getProxy() == null) {
            }
            String str3 = sentryOptions.getProxy().f21869c;
            String str4 = sentryOptions.getProxy().f21870d;
            if (str3 == null || str4 == null) {
                return;
            }
            Authenticator.setDefault(new j(str3, str4));
            return;
        }
        proxy = null;
        this.f1932a = proxy;
        if (proxy != null) {
        }
    }

    public static void a(HttpURLConnection httpURLConnection) {
        try {
            httpURLConnection.getInputStream().close();
        } catch (IOException unused) {
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            throw th;
        }
        httpURLConnection.disconnect();
    }

    public static String b(HttpURLConnection httpURLConnection) {
        try {
            InputStream errorStream = httpURLConnection.getErrorStream();
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f1931e));
                try {
                    StringBuilder sb2 = new StringBuilder();
                    boolean z10 = true;
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        if (!z10) {
                            sb2.append("\n");
                        }
                        sb2.append(readLine);
                        z10 = false;
                    }
                    String sb3 = sb2.toString();
                    bufferedReader.close();
                    if (errorStream != null) {
                        errorStream.close();
                    }
                    return sb3;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return "Failed to obtain error message while analyzing send failure.";
        }
    }

    public final l c(HttpURLConnection httpURLConnection) {
        SentryOptions sentryOptions = this.f1934c;
        try {
            try {
                int responseCode = httpURLConnection.getResponseCode();
                e(httpURLConnection, responseCode);
                if (responseCode == 200) {
                    sentryOptions.getLogger().h(SentryLevel.DEBUG, "Envelope sent successfully.", new Object[0]);
                    return l.b.f1944a;
                }
                InterfaceC0859q logger = sentryOptions.getLogger();
                SentryLevel sentryLevel = SentryLevel.ERROR;
                logger.h(sentryLevel, "Request failed, API returned %s", Integer.valueOf(responseCode));
                if (sentryOptions.isDebug()) {
                    sentryOptions.getLogger().h(sentryLevel, b(httpURLConnection), new Object[0]);
                }
                return new l.a(responseCode);
            } catch (IOException e10) {
                sentryOptions.getLogger().d(SentryLevel.ERROR, e10, "Error reading and logging the response stream", new Object[0]);
                a(httpURLConnection);
                return new l.a(-1);
            }
        } finally {
            a(httpURLConnection);
        }
    }

    public final l d(B1.f fVar) {
        B1.f fVar2 = this.f1933b;
        Proxy proxy = this.f1932a;
        HttpURLConnection httpURLConnection = (HttpURLConnection) (proxy == null ? ((URL) fVar2.f229b).openConnection() : ((URL) fVar2.f229b).openConnection(proxy));
        for (Map.Entry entry : ((Map) fVar2.f230c).entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/x-sentry-envelope");
        httpURLConnection.setRequestProperty("Accept", "application/json");
        httpURLConnection.setRequestProperty("Connection", "close");
        SentryOptions sentryOptions = this.f1934c;
        httpURLConnection.setConnectTimeout(sentryOptions.getConnectionTimeoutMillis());
        httpURLConnection.setReadTimeout(sentryOptions.getReadTimeoutMillis());
        HostnameVerifier hostnameVerifier = sentryOptions.getHostnameVerifier();
        boolean z10 = httpURLConnection instanceof HttpsURLConnection;
        if (z10 && hostnameVerifier != null) {
            ((HttpsURLConnection) httpURLConnection).setHostnameVerifier(hostnameVerifier);
        }
        SSLSocketFactory sslSocketFactory = sentryOptions.getSslSocketFactory();
        if (z10 && sslSocketFactory != null) {
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sslSocketFactory);
        }
        httpURLConnection.connect();
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    sentryOptions.getSerializer().k(fVar, gZIPOutputStream);
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                } finally {
                }
            } finally {
            }
        } finally {
            try {
                return c(httpURLConnection);
            } finally {
            }
        }
        return c(httpURLConnection);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bb A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(java.net.HttpURLConnection r19, int r20) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: I9.d.e(java.net.HttpURLConnection, int):void");
    }
}
