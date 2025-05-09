package h2;

import android.content.Context;
import android.net.ConnectivityManager;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import i2.g;
import java.net.MalformedURLException;
import java.net.URL;
import k2.j;

/* compiled from: CctTransportBackend.java */
/* loaded from: classes.dex */
public final class b implements j {

    /* renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f21031b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f21032c;

    /* renamed from: e, reason: collision with root package name */
    public final r2.a f21034e;

    /* renamed from: f, reason: collision with root package name */
    public final r2.a f21035f;

    /* renamed from: a, reason: collision with root package name */
    public final DataEncoder f21030a = new JsonDataEncoderBuilder().configureWith(com.google.android.datatransport.cct.internal.a.f8913a).ignoreNullValues(true).build();

    /* renamed from: d, reason: collision with root package name */
    public final URL f21033d = c(C0794a.f21024c);

    /* renamed from: g, reason: collision with root package name */
    public final int f21036g = 40000;

    /* compiled from: CctTransportBackend.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final URL f21037a;

        /* renamed from: b, reason: collision with root package name */
        public final g f21038b;

        /* renamed from: c, reason: collision with root package name */
        public final String f21039c;

        public a(URL url, g gVar, String str) {
            this.f21037a = url;
            this.f21038b = gVar;
            this.f21039c = str;
        }
    }

    /* compiled from: CctTransportBackend.java */
    /* renamed from: h2.b$b, reason: collision with other inner class name */
    public static final class C0405b {

        /* renamed from: a, reason: collision with root package name */
        public final int f21040a;

        /* renamed from: b, reason: collision with root package name */
        public final URL f21041b;

        /* renamed from: c, reason: collision with root package name */
        public final long f21042c;

        public C0405b(int i, URL url, long j10) {
            this.f21040a = i;
            this.f21041b = url;
            this.f21042c = j10;
        }
    }

    public b(Context context, r2.a aVar, r2.a aVar2) {
        this.f21032c = context;
        this.f21031b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f21034e = aVar2;
        this.f21035f = aVar;
    }

    public static URL c(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException(s3.b.j("Invalid url: ", str), e10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a1, code lost:
    
        if (com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype.f8907a.get(r0) != null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0108  */
    @Override // k2.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final j2.C0882a a(j2.AbstractC0888g r7) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.b.a(j2.g):j2.a");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x042e A[Catch: IOException -> 0x043b, TryCatch #15 {IOException -> 0x043b, blocks: (B:67:0x0271, B:68:0x0279, B:70:0x02bc, B:80:0x02f0, B:89:0x034d, B:91:0x0406, B:93:0x040a, B:95:0x041d, B:100:0x0428, B:102:0x042e, B:109:0x0446, B:111:0x044e, B:122:0x035a, B:133:0x0391, B:159:0x03ae, B:158:0x03ab, B:161:0x03af, B:188:0x03de, B:190:0x03f3, B:153:0x03a5, B:124:0x035e, B:126:0x0368, B:131:0x0388, B:145:0x03a2, B:144:0x039f, B:129:0x0370, B:139:0x0399), top: B:66:0x0271, inners: #5, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0428 A[ADDED_TO_REGION, EDGE_INSN: B:120:0x0428->B:100:0x0428 BREAK  A[LOOP:3: B:68:0x0279->B:97:0x0423], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x040a A[Catch: IOException -> 0x043b, TryCatch #15 {IOException -> 0x043b, blocks: (B:67:0x0271, B:68:0x0279, B:70:0x02bc, B:80:0x02f0, B:89:0x034d, B:91:0x0406, B:93:0x040a, B:95:0x041d, B:100:0x0428, B:102:0x042e, B:109:0x0446, B:111:0x044e, B:122:0x035a, B:133:0x0391, B:159:0x03ae, B:158:0x03ab, B:161:0x03af, B:188:0x03de, B:190:0x03f3, B:153:0x03a5, B:124:0x035e, B:126:0x0368, B:131:0x0388, B:145:0x03a2, B:144:0x039f, B:129:0x0370, B:139:0x0399), top: B:66:0x0271, inners: #5, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x041d A[Catch: IOException -> 0x043b, TryCatch #15 {IOException -> 0x043b, blocks: (B:67:0x0271, B:68:0x0279, B:70:0x02bc, B:80:0x02f0, B:89:0x034d, B:91:0x0406, B:93:0x040a, B:95:0x041d, B:100:0x0428, B:102:0x042e, B:109:0x0446, B:111:0x044e, B:122:0x035a, B:133:0x0391, B:159:0x03ae, B:158:0x03ab, B:161:0x03af, B:188:0x03de, B:190:0x03f3, B:153:0x03a5, B:124:0x035e, B:126:0x0368, B:131:0x0388, B:145:0x03a2, B:144:0x039f, B:129:0x0370, B:139:0x0399), top: B:66:0x0271, inners: #5, #8 }] */
    @Override // k2.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.datatransport.runtime.backends.a b(k2.a r36) {
        /*
            Method dump skipped, instructions count: 1130
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.b.b(k2.a):com.google.android.datatransport.runtime.backends.a");
    }
}
