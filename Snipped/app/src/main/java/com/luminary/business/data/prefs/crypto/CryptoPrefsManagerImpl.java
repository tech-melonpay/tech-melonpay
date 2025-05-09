package com.luminary.business.data.prefs.crypto;

import I5.k;
import K5.a;
import android.content.SharedPreferences;
import androidx.security.crypto.EncryptedSharedPreferences;
import com.google.gson.g;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ka.C0967l;
import kotlin.jvm.internal.f;
import u5.d;
import w5.C1572a;

/* compiled from: CryptoPrefsManagerImpl.kt */
/* loaded from: classes.dex */
public final class CryptoPrefsManagerImpl implements a {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f10665a;

    /* renamed from: b, reason: collision with root package name */
    public final g f10666b;

    public CryptoPrefsManagerImpl(EncryptedSharedPreferences encryptedSharedPreferences, g gVar) {
        this.f10665a = encryptedSharedPreferences;
        this.f10666b = gVar;
    }

    @Override // K5.a
    public final boolean A() {
        return this.f10665a.getBoolean("PHONE_VALIDATION", false);
    }

    @Override // K5.a
    public final boolean B() {
        return this.f10665a.getString("PASS_CODE", null) != null;
    }

    @Override // K5.a
    public final boolean C() {
        return O().length() > 0 && (f.b(K(), "default") ^ true);
    }

    @Override // K5.a
    public final String D() {
        String string = this.f10665a.getString("fcm_token", null);
        return string == null ? "" : string;
    }

    @Override // K5.a
    public final boolean E() {
        return this.f10665a.getBoolean("IS_CRYPTO", false);
    }

    @Override // K5.a
    public final String F() {
        String string = this.f10665a.getString("TFA", "");
        return string == null ? "" : string;
    }

    @Override // K5.a
    public final boolean G() {
        return this.f10665a.getBoolean("FULL_LOGIN", false);
    }

    @Override // K5.a
    public final void H(long j10) {
        this.f10665a.edit().putLong("REFRESH_EXPIRE", (System.currentTimeMillis() / 1000) + j10).apply();
    }

    @Override // K5.a
    public final void I(boolean z10) {
        this.f10665a.edit().putBoolean("IS_CRYPTO", z10).apply();
    }

    @Override // K5.a
    public final void J() {
        this.f10665a.edit().putBoolean("FULL_LOGIN", true).apply();
    }

    @Override // K5.a
    public final String K() {
        String string = this.f10665a.getString("token_proxy", null);
        return string != null ? string : "default";
    }

    @Override // K5.a
    public final String L() {
        String string = this.f10665a.getString("URL_FOR_TFA", "");
        return string == null ? "" : string;
    }

    @Override // K5.a
    public final boolean M() {
        return this.f10665a.getBoolean("BIO_ENABLE", false);
    }

    @Override // K5.a
    public final void N(String str) {
        this.f10665a.edit().putString("URL_FOR_TFA", str).apply();
    }

    @Override // K5.a
    public final String O() {
        String string = this.f10665a.getString("REFRESH_TOKEN_PROXY", null);
        return string == null ? "" : string;
    }

    @Override // K5.a
    public final void P(ArrayList arrayList) {
        this.f10665a.edit().putString("LIST_CURRENCY", this.f10666b.h(arrayList)).apply();
    }

    @Override // K5.a
    public final C1572a Q(String str) {
        String string;
        Object obj;
        if (str == null || str.length() == 0 || (string = this.f10665a.getString("LIST_CURRENCY", null)) == null) {
            return null;
        }
        Type type = new TypeToken<List<? extends C1572a>>() { // from class: com.luminary.business.data.prefs.crypto.CryptoPrefsManagerImpl$getActualCurrency$1$itemType$1
        }.getType();
        g gVar = this.f10666b;
        gVar.getClass();
        Iterator it = ((List) gVar.c(string, TypeToken.get(type))).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (f.b(((C1572a) obj).f30827b, str)) {
                break;
            }
        }
        C1572a c1572a = (C1572a) obj;
        if (c1572a == null) {
            return null;
        }
        Integer num = c1572a.f30832g;
        if (num != null && num.intValue() <= 0) {
            c1572a.f30832g = null;
        }
        return c1572a;
    }

    @Override // K5.a
    public final void R(String str) {
        this.f10665a.edit().putString("TFA", str).apply();
    }

    @Override // K5.a
    public final void S(int i) {
        this.f10665a.edit().putInt("COMPANY_ID", i).apply();
    }

    @Override // K5.a
    public final void T(G5.a aVar) {
        this.f10665a.edit().putString("SYSTEM_VARIABLES", this.f10666b.h(aVar)).apply();
    }

    @Override // K5.a
    public final void U(List<u5.f> list) {
        this.f10665a.edit().putString("LIST_COUNTRIES", this.f10666b.h(list)).apply();
    }

    @Override // K5.a
    public final void V(String str) {
        this.f10665a.edit().putString("token_proxy", str).apply();
    }

    @Override // K5.a
    public final String W() {
        String string = this.f10665a.getString("APP_ID", null);
        return string == null ? "" : string;
    }

    @Override // K5.a
    public final Integer X() {
        return Integer.valueOf(this.f10665a.getInt("CRYPTO_BADGE_COUNT", 0));
    }

    @Override // K5.a
    public final void Y(Integer num) {
        this.f10665a.edit().putInt("CRYPTO_BADGE_COUNT", num.intValue()).apply();
    }

    @Override // K5.a
    public final List<u5.f> a() {
        String string = this.f10665a.getString("COUNTRY_PHONES", null);
        if (string == null) {
            return new ArrayList();
        }
        Type type = new TypeToken<List<? extends u5.f>>() { // from class: com.luminary.business.data.prefs.crypto.CryptoPrefsManagerImpl$getCountryPhones$1$itemType$1
        }.getType();
        g gVar = this.f10666b;
        gVar.getClass();
        return (List) gVar.c(string, TypeToken.get(type));
    }

    @Override // K5.a
    public final long b() {
        return this.f10665a.getLong("REFRESH_EXPIRE", Long.MAX_VALUE);
    }

    @Override // K5.a
    public final void c(String str) {
        this.f10665a.edit().putString("fcm_token", str).apply();
    }

    @Override // K5.a
    public final void d(String str) {
        this.f10665a.edit().putString("KYC", str).apply();
    }

    @Override // K5.a
    public final boolean e() {
        return this.f10665a.getBoolean("EMAIL_VALIDATION", false);
    }

    @Override // K5.a
    public final List<u5.f> f() {
        String string = this.f10665a.getString("LIST_COUNTRIES", null);
        if (string == null) {
            return new ArrayList();
        }
        Type type = new TypeToken<List<? extends u5.f>>() { // from class: com.luminary.business.data.prefs.crypto.CryptoPrefsManagerImpl$getCountries$1$itemType$1
        }.getType();
        g gVar = this.f10666b;
        gVar.getClass();
        return (List) gVar.c(string, TypeToken.get(type));
    }

    @Override // K5.a
    public final void g(d dVar) {
        this.f10665a.edit().putString("CORPORATE_DETAILS", this.f10666b.h(dVar)).apply();
    }

    @Override // K5.a
    public final int h() {
        return this.f10665a.getInt("COMPANY_ID", 0);
    }

    @Override // K5.a
    public final void i(String str) {
        this.f10665a.edit().putString("PASS_CODE", str).apply();
    }

    @Override // K5.a
    public final void j(long j10) {
        this.f10665a.edit().putLong("USER_ID", j10).apply();
    }

    @Override // K5.a
    public final void k(String str) {
        this.f10665a.edit().putString("REFRESH_TOKEN_PROXY", str).apply();
    }

    @Override // K5.a
    public final G5.a l() {
        String string = this.f10665a.getString("SYSTEM_VARIABLES", null);
        if (string != null) {
            return (G5.a) this.f10666b.b(G5.a.class, string);
        }
        return null;
    }

    @Override // K5.a
    public final void m() {
        this.f10665a.edit().putBoolean("BIO_ENABLE", !M()).apply();
    }

    @Override // K5.a
    public final String n() {
        String string = this.f10665a.getString("token_proxy_basic", null);
        return string != null ? C0967l.X(string, "\n", "", false) : "";
    }

    @Override // K5.a
    public final void o(String str) {
        this.f10665a.edit().putString("USER_PHONE", str).apply();
    }

    @Override // K5.a
    public final void p() {
        this.f10665a.edit().putString("token", null).putString("REFRESH_TOKEN", null).putString("token_proxy", null).putString("token_proxy_basic", null).putString("USER_ID", null).putString("COMPANY_ID", null).putString("PASS_CODE", null).putBoolean("BIO_ENABLE", false).putString("CORPORATE_DETAILS", null).putString("PROXY_CLIENT", null).putBoolean("FULL_LOGIN", false).apply();
        x(null);
        t(false);
        z(false);
    }

    @Override // K5.a
    public final void q(String str) {
        this.f10665a.edit().putString("token_proxy_basic", str).apply();
    }

    @Override // K5.a
    public final boolean r(String str) {
        String string = this.f10665a.getString("PASS_CODE", null);
        if (string != null) {
            return f.b(str, string);
        }
        return false;
    }

    @Override // K5.a
    public final void s(List<u5.f> list) {
        this.f10665a.edit().putString("COUNTRY_PHONES", this.f10666b.h(list)).apply();
    }

    @Override // K5.a
    public final void t(boolean z10) {
        this.f10665a.edit().putBoolean("EMAIL_VALIDATION", z10).apply();
    }

    @Override // K5.a
    public final d u() {
        String string = this.f10665a.getString("CORPORATE_DETAILS", null);
        if (string != null) {
            return (d) this.f10666b.b(d.class, string);
        }
        return null;
    }

    @Override // K5.a
    public final long v() {
        return this.f10665a.getLong("ACCESS_EXPIRE", Long.MAX_VALUE);
    }

    @Override // K5.a
    public final void w(long j10) {
        this.f10665a.edit().putLong("ACCESS_EXPIRE", (System.currentTimeMillis() / 1000) + j10).apply();
    }

    @Override // K5.a
    public final void x(k kVar) {
        SharedPreferences sharedPreferences = this.f10665a;
        if (kVar != null) {
            sharedPreferences.edit().putString("REGISTER_EMAIL", kVar.f1817c).putString("REGISTER_PHONE_AREA", kVar.f1821e).putString("REGISTER_PHONE", kVar.f1823f).apply();
        }
        if (kVar == null) {
            sharedPreferences.edit().remove("REGISTER_EMAIL").remove("REGISTER_PHONE_AREA").remove("REGISTER_PHONE").apply();
        }
    }

    @Override // K5.a
    public final long y() {
        return this.f10665a.getLong("USER_ID", 0L);
    }

    @Override // K5.a
    public final void z(boolean z10) {
        this.f10665a.edit().putBoolean("PHONE_VALIDATION", z10).apply();
    }
}
