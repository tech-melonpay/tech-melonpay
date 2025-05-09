package org.bouncycastle.est.jcajce;

import com.bumptech.glide.load.Key;
import java.io.OutputStream;
import java.net.URL;
import java.nio.charset.Charset;
import org.bouncycastle.est.ESTClient;
import org.bouncycastle.est.ESTClientSourceProvider;
import org.bouncycastle.est.ESTException;
import org.bouncycastle.est.ESTRequest;
import org.bouncycastle.est.ESTRequestBuilder;
import org.bouncycastle.est.ESTResponse;
import org.jmrtd.PassportService;

/* loaded from: classes2.dex */
class DefaultESTClient implements ESTClient {
    private final ESTClientSourceProvider sslSocketProvider;
    private static final Charset utf8 = Charset.forName(Key.STRING_CHARSET_NAME);
    private static byte[] CRLF = {PassportService.SFI_DG13, 10};

    public class PrintingOutputStream extends OutputStream {
        private final OutputStream tgt;

        public PrintingOutputStream(OutputStream outputStream) {
            this.tgt = outputStream;
        }

        @Override // java.io.OutputStream
        public void write(int i) {
            System.out.print(String.valueOf((char) i));
            this.tgt.write(i);
        }
    }

    public DefaultESTClient(ESTClientSourceProvider eSTClientSourceProvider) {
        this.sslSocketProvider = eSTClientSourceProvider;
    }

    private static void writeLine(OutputStream outputStream, String str) {
        outputStream.write(str.getBytes());
        outputStream.write(CRLF);
    }

    @Override // org.bouncycastle.est.ESTClient
    public ESTResponse doRequest(ESTRequest eSTRequest) {
        ESTResponse performRequest;
        int i = 15;
        while (true) {
            performRequest = performRequest(eSTRequest);
            ESTRequest redirectURL = redirectURL(performRequest);
            if (redirectURL == null || i - 1 <= 0) {
                break;
            }
            eSTRequest = redirectURL;
        }
        if (i != 0) {
            return performRequest;
        }
        throw new ESTException("Too many redirects..");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006a A[Catch: all -> 0x0028, TryCatch #0 {all -> 0x0028, blocks: (B:3:0x0003, B:5:0x001f, B:6:0x002b, B:8:0x0039, B:11:0x0042, B:12:0x0050, B:14:0x006a, B:15:0x0075, B:17:0x008b, B:18:0x0090, B:21:0x009d, B:22:0x00b3, B:23:0x00bc, B:24:0x00ec, B:26:0x00f2, B:27:0x00ff, B:29:0x0102, B:32:0x0124, B:34:0x0138, B:40:0x0148, B:42:0x00b7, B:44:0x0047), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008b A[Catch: all -> 0x0028, TryCatch #0 {all -> 0x0028, blocks: (B:3:0x0003, B:5:0x001f, B:6:0x002b, B:8:0x0039, B:11:0x0042, B:12:0x0050, B:14:0x006a, B:15:0x0075, B:17:0x008b, B:18:0x0090, B:21:0x009d, B:22:0x00b3, B:23:0x00bc, B:24:0x00ec, B:26:0x00f2, B:27:0x00ff, B:29:0x0102, B:32:0x0124, B:34:0x0138, B:40:0x0148, B:42:0x00b7, B:44:0x0047), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009d A[Catch: all -> 0x0028, TRY_ENTER, TryCatch #0 {all -> 0x0028, blocks: (B:3:0x0003, B:5:0x001f, B:6:0x002b, B:8:0x0039, B:11:0x0042, B:12:0x0050, B:14:0x006a, B:15:0x0075, B:17:0x008b, B:18:0x0090, B:21:0x009d, B:22:0x00b3, B:23:0x00bc, B:24:0x00ec, B:26:0x00f2, B:27:0x00ff, B:29:0x0102, B:32:0x0124, B:34:0x0138, B:40:0x0148, B:42:0x00b7, B:44:0x0047), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f2 A[Catch: all -> 0x0028, TryCatch #0 {all -> 0x0028, blocks: (B:3:0x0003, B:5:0x001f, B:6:0x002b, B:8:0x0039, B:11:0x0042, B:12:0x0050, B:14:0x006a, B:15:0x0075, B:17:0x008b, B:18:0x0090, B:21:0x009d, B:22:0x00b3, B:23:0x00bc, B:24:0x00ec, B:26:0x00f2, B:27:0x00ff, B:29:0x0102, B:32:0x0124, B:34:0x0138, B:40:0x0148, B:42:0x00b7, B:44:0x0047), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0138 A[Catch: all -> 0x0028, TRY_LEAVE, TryCatch #0 {all -> 0x0028, blocks: (B:3:0x0003, B:5:0x001f, B:6:0x002b, B:8:0x0039, B:11:0x0042, B:12:0x0050, B:14:0x006a, B:15:0x0075, B:17:0x008b, B:18:0x0090, B:21:0x009d, B:22:0x00b3, B:23:0x00bc, B:24:0x00ec, B:26:0x00f2, B:27:0x00ff, B:29:0x0102, B:32:0x0124, B:34:0x0138, B:40:0x0148, B:42:0x00b7, B:44:0x0047), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0148 A[Catch: all -> 0x0028, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0028, blocks: (B:3:0x0003, B:5:0x001f, B:6:0x002b, B:8:0x0039, B:11:0x0042, B:12:0x0050, B:14:0x006a, B:15:0x0075, B:17:0x008b, B:18:0x0090, B:21:0x009d, B:22:0x00b3, B:23:0x00bc, B:24:0x00ec, B:26:0x00f2, B:27:0x00ff, B:29:0x0102, B:32:0x0124, B:34:0x0138, B:40:0x0148, B:42:0x00b7, B:44:0x0047), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b7 A[Catch: all -> 0x0028, TryCatch #0 {all -> 0x0028, blocks: (B:3:0x0003, B:5:0x001f, B:6:0x002b, B:8:0x0039, B:11:0x0042, B:12:0x0050, B:14:0x006a, B:15:0x0075, B:17:0x008b, B:18:0x0090, B:21:0x009d, B:22:0x00b3, B:23:0x00bc, B:24:0x00ec, B:26:0x00f2, B:27:0x00ff, B:29:0x0102, B:32:0x0124, B:34:0x0138, B:40:0x0148, B:42:0x00b7, B:44:0x0047), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.bouncycastle.est.ESTResponse performRequest(org.bouncycastle.est.ESTRequest r9) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.est.jcajce.DefaultESTClient.performRequest(org.bouncycastle.est.ESTRequest):org.bouncycastle.est.ESTResponse");
    }

    public ESTRequest redirectURL(ESTResponse eSTResponse) {
        ESTRequest eSTRequest;
        ESTRequestBuilder withURL;
        if (eSTResponse.getStatusCode() < 300 || eSTResponse.getStatusCode() > 399) {
            eSTRequest = null;
        } else {
            switch (eSTResponse.getStatusCode()) {
                case 301:
                case 302:
                case 303:
                case 306:
                case 307:
                    String header = eSTResponse.getHeader("Location");
                    if (!"".equals(header)) {
                        ESTRequestBuilder eSTRequestBuilder = new ESTRequestBuilder(eSTResponse.getOriginalRequest());
                        if (header.startsWith("http")) {
                            withURL = eSTRequestBuilder.withURL(new URL(header));
                        } else {
                            URL url = eSTResponse.getOriginalRequest().getURL();
                            withURL = eSTRequestBuilder.withURL(new URL(url.getProtocol(), url.getHost(), url.getPort(), header));
                        }
                        eSTRequest = withURL.build();
                        break;
                    } else {
                        throw new ESTException("Redirect status type: " + eSTResponse.getStatusCode() + " but no location header");
                    }
                case 304:
                case 305:
                default:
                    throw new ESTException("Client does not handle http status code: " + eSTResponse.getStatusCode());
            }
        }
        if (eSTRequest != null) {
            eSTResponse.close();
        }
        return eSTRequest;
    }
}
