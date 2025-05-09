package com.luminary.business.di.remote;

import Ka.f;
import P9.m;
import com.luminary.business.data.TokenManager;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.regex.Pattern;
import ka.C0956a;
import ka.C0969n;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import okhttp3.Protocol;
import okhttp3.h;
import okhttp3.i;
import okhttp3.k;
import okhttp3.p;
import r5.b;
import va.g;
import va.j;

/* compiled from: RenewingProxyInterceptor.kt */
/* loaded from: classes.dex */
public final class RenewingProxyInterceptor implements g {

    /* renamed from: d, reason: collision with root package name */
    public static final ArrayList<String> f10667d = m.n("allcountries", "countryphones", "housekeeping/sysvariables/public", "availablecurrencies/list", "cdn/versions.json", "oauth/token", "housekeeping/system/liveness_check", "two-factor");

    /* renamed from: a, reason: collision with root package name */
    public final String f10668a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10669b;

    /* renamed from: c, reason: collision with root package name */
    public final TokenManager f10670c;

    public RenewingProxyInterceptor(String str, String str2, TokenManager tokenManager) {
        this.f10668a = str;
        this.f10669b = str2;
        this.f10670c = tokenManager;
    }

    public static p a(k kVar) {
        p.a aVar = new p.a();
        aVar.f24686c = 401;
        aVar.f24687d = "Token expired";
        String h9 = new com.google.gson.g().h(new b());
        Pattern pattern = i.f24542d;
        i a10 = i.a.a("application/json");
        Charset charset = C0956a.f23054b;
        Charset a11 = a10.a(null);
        if (a11 == null) {
            a10 = i.a.b(a10 + "; charset=utf-8");
        } else {
            charset = a11;
        }
        f fVar = new f();
        fVar.k0(h9, 0, h9.length(), charset);
        aVar.f24690g = new j(a10, fVar.f2294b, fVar);
        aVar.f24684a = kVar;
        aVar.f24685b = Protocol.HTTP_2;
        return aVar.a();
    }

    @Override // va.g
    public final p intercept(g.a aVar) {
        Object runBlocking$default;
        Object runBlocking$default2;
        Aa.f fVar = (Aa.f) aVar;
        ArrayList<String> arrayList = f10667d;
        boolean z10 = arrayList instanceof Collection;
        k kVar = fVar.f152e;
        if (!z10 || !arrayList.isEmpty()) {
            for (String str : arrayList) {
                h hVar = kVar.f24644a;
                hVar.getClass();
                try {
                    if (C0969n.Y(new URL(hVar.i).getPath(), str, false)) {
                        return fVar.a(kVar);
                    }
                } catch (MalformedURLException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        TokenManager tokenManager = this.f10670c;
        tokenManager.getClass();
        long j10 = 1000;
        if (System.currentTimeMillis() / j10 > tokenManager.f10650f) {
            return a(kVar);
        }
        if (System.currentTimeMillis() / j10 > tokenManager.f10649e) {
            runBlocking$default2 = BuildersKt__BuildersKt.runBlocking$default(null, new RenewingProxyInterceptor$intercept$2(this, aVar, kVar, null), 1, null);
            return (p) runBlocking$default2;
        }
        p a10 = fVar.a(kVar);
        if (a10.f24674d != 401) {
            return a10;
        }
        try {
            Integer a11 = ((b) new com.google.gson.g().b(b.class, a10.y().y())).a();
            if (a11 != null) {
                if (a11.intValue() == 3002) {
                    return a10;
                }
            }
        } catch (Exception unused) {
        }
        wa.b.c(a10);
        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new RenewingProxyInterceptor$intercept$3(this, aVar, kVar, null), 1, null);
        return (p) runBlocking$default;
    }
}
