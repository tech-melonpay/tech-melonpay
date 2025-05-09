package i2;

import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;
import i2.h;
import java.util.Arrays;

/* compiled from: AutoValue_LogEvent.java */
/* loaded from: classes.dex */
public final class d extends h {

    /* renamed from: a, reason: collision with root package name */
    public final long f21296a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f21297b;

    /* renamed from: c, reason: collision with root package name */
    public final long f21298c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f21299d;

    /* renamed from: e, reason: collision with root package name */
    public final String f21300e;

    /* renamed from: f, reason: collision with root package name */
    public final long f21301f;

    /* renamed from: g, reason: collision with root package name */
    public final NetworkConnectionInfo f21302g;

    /* compiled from: AutoValue_LogEvent.java */
    public static final class a extends h.a {

        /* renamed from: a, reason: collision with root package name */
        public Long f21303a;

        /* renamed from: b, reason: collision with root package name */
        public Integer f21304b;

        /* renamed from: c, reason: collision with root package name */
        public Long f21305c;

        /* renamed from: d, reason: collision with root package name */
        public byte[] f21306d;

        /* renamed from: e, reason: collision with root package name */
        public String f21307e;

        /* renamed from: f, reason: collision with root package name */
        public Long f21308f;

        /* renamed from: g, reason: collision with root package name */
        public NetworkConnectionInfo f21309g;
    }

    public d(long j10, Integer num, long j11, byte[] bArr, String str, long j12, NetworkConnectionInfo networkConnectionInfo) {
        this.f21296a = j10;
        this.f21297b = num;
        this.f21298c = j11;
        this.f21299d = bArr;
        this.f21300e = str;
        this.f21301f = j12;
        this.f21302g = networkConnectionInfo;
    }

    @Override // i2.h
    public final Integer a() {
        return this.f21297b;
    }

    @Override // i2.h
    public final long b() {
        return this.f21296a;
    }

    @Override // i2.h
    public final long c() {
        return this.f21298c;
    }

    @Override // i2.h
    public final NetworkConnectionInfo d() {
        return this.f21302g;
    }

    @Override // i2.h
    public final byte[] e() {
        return this.f21299d;
    }

    public final boolean equals(Object obj) {
        Integer num;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f21296a == hVar.b() && ((num = this.f21297b) != null ? num.equals(hVar.a()) : hVar.a() == null) && this.f21298c == hVar.c()) {
            if (Arrays.equals(this.f21299d, hVar instanceof d ? ((d) hVar).f21299d : hVar.e()) && ((str = this.f21300e) != null ? str.equals(hVar.f()) : hVar.f() == null) && this.f21301f == hVar.g()) {
                NetworkConnectionInfo networkConnectionInfo = this.f21302g;
                if (networkConnectionInfo == null) {
                    if (hVar.d() == null) {
                        return true;
                    }
                } else if (networkConnectionInfo.equals(hVar.d())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // i2.h
    public final String f() {
        return this.f21300e;
    }

    @Override // i2.h
    public final long g() {
        return this.f21301f;
    }

    public final int hashCode() {
        long j10 = this.f21296a;
        int i = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f21297b;
        int hashCode = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        long j11 = this.f21298c;
        int hashCode2 = (((hashCode ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f21299d)) * 1000003;
        String str = this.f21300e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j12 = this.f21301f;
        int i9 = (hashCode3 ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        NetworkConnectionInfo networkConnectionInfo = this.f21302g;
        return i9 ^ (networkConnectionInfo != null ? networkConnectionInfo.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f21296a + ", eventCode=" + this.f21297b + ", eventUptimeMs=" + this.f21298c + ", sourceExtension=" + Arrays.toString(this.f21299d) + ", sourceExtensionJsonProto3=" + this.f21300e + ", timezoneOffsetSeconds=" + this.f21301f + ", networkConnectionInfo=" + this.f21302g + "}";
    }
}
