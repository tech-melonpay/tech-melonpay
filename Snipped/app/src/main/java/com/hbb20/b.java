package com.hbb20;

import android.content.Context;
import android.util.SparseArray;
import com.hbb20.CountryCodePicker;
import java.util.HashMap;
import java.util.Map;

/* compiled from: CCPCountryGroup.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static SparseArray<b> f10624d;

    /* renamed from: a, reason: collision with root package name */
    public final String f10625a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10626b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap<String, String> f10627c;

    public b(String str, int i, HashMap<String, String> hashMap) {
        this.f10625a = str;
        this.f10626b = i;
        this.f10627c = hashMap;
    }

    public static b b(int i) {
        if (f10624d == null) {
            f10624d = new SparseArray<>();
            HashMap hashMap = new HashMap();
            hashMap.put("ag", "268");
            hashMap.put("ai", "264");
            hashMap.put("as", "684");
            hashMap.put("bb", "246");
            hashMap.put("bm", "441");
            hashMap.put("bs", "242");
            hashMap.put("ca", "204/226/236/249/250/289/306/343/365/403/416/418/431/437/438/450/506/514/519/579/581/587/600/601/604/613/639/647/705/709/769/778/780/782/807/819/825/867/873/902/905/");
            hashMap.put("dm", "767");
            hashMap.put("do", "809/829/849");
            hashMap.put("gd", "473");
            hashMap.put("gu", "671");
            hashMap.put("jm", "876");
            hashMap.put("kn", "869");
            hashMap.put("ky", "345");
            hashMap.put("lc", "758");
            hashMap.put("mp", "670");
            hashMap.put("ms", "664");
            hashMap.put("pr", "787");
            hashMap.put("sx", "721");
            hashMap.put("tc", "649");
            hashMap.put("tt", "868");
            hashMap.put("vc", "784");
            hashMap.put("vg", "284");
            hashMap.put("vi", "340");
            f10624d.put(1, new b("us", 3, hashMap));
            HashMap hashMap2 = new HashMap();
            hashMap2.put("gg", "1481");
            hashMap2.put("im", "1624");
            hashMap2.put("je", "1534");
            f10624d.put(44, new b("gb", 4, hashMap2));
            HashMap hashMap3 = new HashMap();
            hashMap3.put("ax", "18");
            f10624d.put(358, new b("fi", 2, hashMap3));
        }
        return f10624d.get(i);
    }

    public final a a(Context context, CountryCodePicker.Language language, String str) {
        String str2 = this.f10625a;
        for (Map.Entry<String, String> entry : this.f10627c.entrySet()) {
            if (entry.getValue().contains(str)) {
                str2 = entry.getKey();
            }
        }
        return a.g(context, language, str2);
    }
}
