package io.michaelrocks.libphonenumber.android;

import C.v;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class Phonenumber$PhoneNumber implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f21652c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f21654e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f21656g;

    /* renamed from: a, reason: collision with root package name */
    public int f21650a = 0;

    /* renamed from: b, reason: collision with root package name */
    public long f21651b = 0;

    /* renamed from: d, reason: collision with root package name */
    public String f21653d = "";

    /* renamed from: f, reason: collision with root package name */
    public boolean f21655f = false;

    /* renamed from: h, reason: collision with root package name */
    public int f21657h = 1;
    public final String i = "";

    /* renamed from: k, reason: collision with root package name */
    public final String f21659k = "";

    /* renamed from: j, reason: collision with root package name */
    public final CountryCodeSource f21658j = CountryCodeSource.f21663d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class CountryCodeSource {

        /* renamed from: a, reason: collision with root package name */
        public static final CountryCodeSource f21660a;

        /* renamed from: b, reason: collision with root package name */
        public static final CountryCodeSource f21661b;

        /* renamed from: c, reason: collision with root package name */
        public static final CountryCodeSource f21662c;

        /* renamed from: d, reason: collision with root package name */
        public static final CountryCodeSource f21663d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ CountryCodeSource[] f21664e;

        static {
            CountryCodeSource countryCodeSource = new CountryCodeSource("FROM_NUMBER_WITH_PLUS_SIGN", 0);
            f21660a = countryCodeSource;
            CountryCodeSource countryCodeSource2 = new CountryCodeSource("FROM_NUMBER_WITH_IDD", 1);
            f21661b = countryCodeSource2;
            CountryCodeSource countryCodeSource3 = new CountryCodeSource("FROM_NUMBER_WITHOUT_PLUS_SIGN", 2);
            CountryCodeSource countryCodeSource4 = new CountryCodeSource("FROM_DEFAULT_COUNTRY", 3);
            f21662c = countryCodeSource4;
            CountryCodeSource countryCodeSource5 = new CountryCodeSource("UNSPECIFIED", 4);
            f21663d = countryCodeSource5;
            f21664e = new CountryCodeSource[]{countryCodeSource, countryCodeSource2, countryCodeSource3, countryCodeSource4, countryCodeSource5};
        }

        public CountryCodeSource() {
            throw null;
        }

        public static CountryCodeSource valueOf(String str) {
            return (CountryCodeSource) Enum.valueOf(CountryCodeSource.class, str);
        }

        public static CountryCodeSource[] values() {
            return (CountryCodeSource[]) f21664e.clone();
        }
    }

    public final boolean equals(Object obj) {
        Phonenumber$PhoneNumber phonenumber$PhoneNumber;
        return (obj instanceof Phonenumber$PhoneNumber) && (phonenumber$PhoneNumber = (Phonenumber$PhoneNumber) obj) != null && (this == phonenumber$PhoneNumber || (this.f21650a == phonenumber$PhoneNumber.f21650a && this.f21651b == phonenumber$PhoneNumber.f21651b && this.f21653d.equals(phonenumber$PhoneNumber.f21653d) && this.f21655f == phonenumber$PhoneNumber.f21655f && this.f21657h == phonenumber$PhoneNumber.f21657h && this.i.equals(phonenumber$PhoneNumber.i) && this.f21658j == phonenumber$PhoneNumber.f21658j && this.f21659k.equals(phonenumber$PhoneNumber.f21659k)));
    }

    public final int hashCode() {
        return ((this.f21659k.hashCode() + ((this.f21658j.hashCode() + v.c((((v.c((Long.valueOf(this.f21651b).hashCode() + ((2173 + this.f21650a) * 53)) * 53, 53, this.f21653d) + (this.f21655f ? 1231 : 1237)) * 53) + this.f21657h) * 53, 53, this.i)) * 53)) * 53) + 1237;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Country Code: ");
        sb2.append(this.f21650a);
        sb2.append(" National Number: ");
        sb2.append(this.f21651b);
        if (this.f21654e && this.f21655f) {
            sb2.append(" Leading Zero(s): true");
        }
        if (this.f21656g) {
            sb2.append(" Number of leading zeros: ");
            sb2.append(this.f21657h);
        }
        if (this.f21652c) {
            sb2.append(" Extension: ");
            sb2.append(this.f21653d);
        }
        return sb2.toString();
    }
}
