package com.sumsub.sns.internal.core.common;

import ca.InterfaceC0635a;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import ka.C0969n;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final c0 f15062a = new c0();

    /* renamed from: b, reason: collision with root package name */
    public static final Set<String> f15063b = P9.l.w(new String[]{"zh-tw", "pt-br"});

    /* renamed from: c, reason: collision with root package name */
    public static final O9.f f15064c = kotlin.a.a(a.f15065a);

    public static final class a extends Lambda implements InterfaceC0635a<HashMap<String, Locale>> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f15065a = new a();

        public a() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HashMap<String, Locale> invoke() {
            String[] iSOCountries = Locale.getISOCountries();
            HashMap<String, Locale> hashMap = new HashMap<>(iSOCountries.length);
            for (String str : iSOCountries) {
                Locale locale = new Locale("", str);
                hashMap.put(locale.getISO3Country().toUpperCase(Locale.ROOT), locale);
            }
            hashMap.put("RKS", new Locale("", "XK"));
            hashMap.put("ANT", new Locale("", "NL"));
            return hashMap;
        }
    }

    public final Map<String, Locale> a() {
        return (Map) f15064c.getValue();
    }

    public final String a(String str) {
        Locale locale = a().get(str);
        String country = locale != null ? locale.getCountry() : null;
        return country == null ? str : country;
    }

    public final String a(Locale locale) {
        if (!C0969n.i0(locale.getCountry())) {
            String str = locale.getLanguage() + '-' + locale.getCountry().toLowerCase(Locale.ROOT);
            if (f15063b.contains(str)) {
                return str;
            }
        }
        return locale.getLanguage();
    }
}
