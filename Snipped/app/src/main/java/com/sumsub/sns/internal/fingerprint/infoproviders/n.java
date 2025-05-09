package com.sumsub.sns.internal.fingerprint.infoproviders;

import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.media.RingtoneManager;
import android.net.Uri;
import ca.InterfaceC0635a;
import java.util.ArrayList;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Result;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class n implements m {

    /* renamed from: a, reason: collision with root package name */
    public final RingtoneManager f17335a;

    /* renamed from: b, reason: collision with root package name */
    public final AssetManager f17336b;

    /* renamed from: c, reason: collision with root package name */
    public final Configuration f17337c;

    public static final class a extends Lambda implements InterfaceC0635a<String[]> {
        public a() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String[] invoke() {
            String[] locales;
            AssetManager assetManager = n.this.f17336b;
            if (assetManager != null && (locales = assetManager.getLocales()) != null) {
                ArrayList arrayList = new ArrayList(locales.length);
                for (String str : locales) {
                    arrayList.add(String.valueOf(str));
                }
                String[] strArr = (String[]) arrayList.toArray(new String[0]);
                if (strArr != null) {
                    return strArr;
                }
            }
            return new String[0];
        }
    }

    public static final class b extends Lambda implements InterfaceC0635a<String> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f17339a = new b();

        public b() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Locale.getDefault().getLanguage();
        }
    }

    public static final class c extends Lambda implements InterfaceC0635a<String> {
        public c() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            Locale locale;
            Configuration configuration = n.this.f17337c;
            String country = (configuration == null || (locale = configuration.locale) == null) ? null : locale.getCountry();
            return country == null ? "" : country;
        }
    }

    public static final class d extends Lambda implements InterfaceC0635a<String> {
        public d() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            Uri ringtoneUri;
            String uri;
            RingtoneManager ringtoneManager = n.this.f17335a;
            return (ringtoneManager == null || (ringtoneUri = ringtoneManager.getRingtoneUri(0)) == null || (uri = ringtoneUri.toString()) == null) ? "" : uri;
        }
    }

    public static final class e extends Lambda implements InterfaceC0635a<String> {

        /* renamed from: a, reason: collision with root package name */
        public static final e f17342a = new e();

        public e() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return TimeZone.getDefault().getDisplayName();
        }
    }

    public n(RingtoneManager ringtoneManager, AssetManager assetManager, Configuration configuration) {
        this.f17335a = ringtoneManager;
        this.f17336b = assetManager;
        this.f17337c = configuration;
    }

    @Override // com.sumsub.sns.internal.fingerprint.infoproviders.m
    public String[] d() {
        Object a10 = com.sumsub.sns.internal.fingerprint.tools.threading.safe.c.a(0L, new a(), 1, null);
        String[] strArr = new String[0];
        if (a10 instanceof Result.Failure) {
            a10 = strArr;
        }
        return (String[]) a10;
    }

    @Override // com.sumsub.sns.internal.fingerprint.infoproviders.m
    public String e() {
        Object a10 = com.sumsub.sns.internal.fingerprint.tools.threading.safe.c.a(0L, b.f17339a, 1, null);
        if (a10 instanceof Result.Failure) {
            a10 = "";
        }
        return (String) a10;
    }

    @Override // com.sumsub.sns.internal.fingerprint.infoproviders.m
    public String a() {
        Object a10 = com.sumsub.sns.internal.fingerprint.tools.threading.safe.c.a(0L, e.f17342a, 1, null);
        if (a10 instanceof Result.Failure) {
            a10 = "";
        }
        return (String) a10;
    }

    @Override // com.sumsub.sns.internal.fingerprint.infoproviders.m
    public String b() {
        Object a10 = com.sumsub.sns.internal.fingerprint.tools.threading.safe.c.a(0L, new c(), 1, null);
        if (a10 instanceof Result.Failure) {
            a10 = "";
        }
        return (String) a10;
    }

    @Override // com.sumsub.sns.internal.fingerprint.infoproviders.m
    public String c() {
        Object a10 = com.sumsub.sns.internal.fingerprint.tools.threading.safe.c.a(0L, new d(), 1, null);
        if (a10 instanceof Result.Failure) {
            a10 = "";
        }
        return (String) a10;
    }
}
