package com.google.i18n.phonenumbers;

import C.v;
import java.io.Serializable;

/* loaded from: classes.dex */
public class Phonenumber$PhoneNumber implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: a, reason: collision with root package name */
    public boolean f10505a;

    /* renamed from: b, reason: collision with root package name */
    public int f10506b = 0;

    /* renamed from: c, reason: collision with root package name */
    public long f10507c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final String f10508d = "";

    /* renamed from: e, reason: collision with root package name */
    public final int f10509e = 1;

    /* renamed from: f, reason: collision with root package name */
    public final String f10510f = "";

    /* renamed from: h, reason: collision with root package name */
    public final String f10512h = "";

    /* renamed from: g, reason: collision with root package name */
    public final CountryCodeSource f10511g = CountryCodeSource.f10513a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class CountryCodeSource {

        /* renamed from: a, reason: collision with root package name */
        public static final CountryCodeSource f10513a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ CountryCodeSource[] f10514b;

        /* JADX INFO: Fake field, exist only in values array */
        CountryCodeSource EF0;

        static {
            CountryCodeSource countryCodeSource = new CountryCodeSource("FROM_NUMBER_WITH_PLUS_SIGN", 0);
            CountryCodeSource countryCodeSource2 = new CountryCodeSource("FROM_NUMBER_WITH_IDD", 1);
            CountryCodeSource countryCodeSource3 = new CountryCodeSource("FROM_NUMBER_WITHOUT_PLUS_SIGN", 2);
            CountryCodeSource countryCodeSource4 = new CountryCodeSource("FROM_DEFAULT_COUNTRY", 3);
            CountryCodeSource countryCodeSource5 = new CountryCodeSource("UNSPECIFIED", 4);
            f10513a = countryCodeSource5;
            f10514b = new CountryCodeSource[]{countryCodeSource, countryCodeSource2, countryCodeSource3, countryCodeSource4, countryCodeSource5};
        }

        public CountryCodeSource() {
            throw null;
        }

        public static CountryCodeSource valueOf(String str) {
            return (CountryCodeSource) Enum.valueOf(CountryCodeSource.class, str);
        }

        public static CountryCodeSource[] values() {
            return (CountryCodeSource[]) f10514b.clone();
        }
    }

    public final boolean equals(Object obj) {
        Phonenumber$PhoneNumber phonenumber$PhoneNumber;
        return (obj instanceof Phonenumber$PhoneNumber) && (phonenumber$PhoneNumber = (Phonenumber$PhoneNumber) obj) != null && (this == phonenumber$PhoneNumber || (this.f10506b == phonenumber$PhoneNumber.f10506b && this.f10507c == phonenumber$PhoneNumber.f10507c && this.f10508d.equals(phonenumber$PhoneNumber.f10508d) && this.f10509e == phonenumber$PhoneNumber.f10509e && this.f10510f.equals(phonenumber$PhoneNumber.f10510f) && this.f10511g == phonenumber$PhoneNumber.f10511g && this.f10512h.equals(phonenumber$PhoneNumber.f10512h)));
    }

    public final int hashCode() {
        return ((this.f10512h.hashCode() + ((this.f10511g.hashCode() + v.c((((((this.f10508d.hashCode() + ((Long.valueOf(this.f10507c).hashCode() + ((2173 + this.f10506b) * 53)) * 53)) * 53) + 1237) * 53) + this.f10509e) * 53, 53, this.f10510f)) * 53)) * 53) + 1237;
    }

    public final String toString() {
        return "Country Code: " + this.f10506b + " National Number: " + this.f10507c;
    }
}
