package org.bouncycastle.est;

import java.io.OutputStream;
import java.net.URL;
import java.util.Map;
import org.bouncycastle.est.HttpUtil;

/* loaded from: classes2.dex */
public class ESTRequest {
    final byte[] data;
    final ESTClient estClient;
    HttpUtil.Headers headers;
    final ESTHijacker hijacker;
    final ESTSourceConnectionListener listener;
    final String method;
    final URL url;

    public ESTRequest(String str, URL url, byte[] bArr, ESTHijacker eSTHijacker, ESTSourceConnectionListener eSTSourceConnectionListener, HttpUtil.Headers headers, ESTClient eSTClient) {
        new HttpUtil.Headers();
        this.method = str;
        this.url = url;
        this.data = bArr;
        this.hijacker = eSTHijacker;
        this.listener = eSTSourceConnectionListener;
        this.headers = headers;
        this.estClient = eSTClient;
    }

    public ESTClient getClient() {
        return this.estClient;
    }

    public Map<String, String[]> getHeaders() {
        return (Map) this.headers.clone();
    }

    public ESTHijacker getHijacker() {
        return this.hijacker;
    }

    public ESTSourceConnectionListener getListener() {
        return this.listener;
    }

    public String getMethod() {
        return this.method;
    }

    public URL getURL() {
        return this.url;
    }

    public void writeData(OutputStream outputStream) {
        byte[] bArr = this.data;
        if (bArr != null) {
            outputStream.write(bArr);
        }
    }
}
