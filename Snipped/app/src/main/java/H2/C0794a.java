package h2;

import com.bumptech.glide.load.Key;
import j2.InterfaceC0886e;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* compiled from: CCTDestination.java */
/* renamed from: h2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0794a implements InterfaceC0886e {

    /* renamed from: c, reason: collision with root package name */
    public static final String f21024c;

    /* renamed from: d, reason: collision with root package name */
    public static final Set<g2.b> f21025d;

    /* renamed from: e, reason: collision with root package name */
    public static final C0794a f21026e;

    /* renamed from: f, reason: collision with root package name */
    public static final C0794a f21027f;

    /* renamed from: a, reason: collision with root package name */
    public final String f21028a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21029b;

    static {
        String r8 = U4.b.r("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f21024c = r8;
        String r10 = U4.b.r("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String r11 = U4.b.r("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f21025d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new g2.b("proto"), new g2.b("json"))));
        f21026e = new C0794a(r8, null);
        f21027f = new C0794a(r10, r11);
    }

    public C0794a(String str, String str2) {
        this.f21028a = str;
        this.f21029b = str2;
    }

    public static C0794a a(byte[] bArr) {
        String str = new String(bArr, Charset.forName(Key.STRING_CHARSET_NAME));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
        if (split.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = split[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new C0794a(str2, str3);
    }

    public final byte[] b() {
        String str = this.f21028a;
        String str2 = this.f21029b;
        if (str2 == null && str == null) {
            return null;
        }
        if (str2 == null) {
            str2 = "";
        }
        return s3.b.k("1$", str, "\\", str2).getBytes(Charset.forName(Key.STRING_CHARSET_NAME));
    }
}
