package com.luminary.business.presentation.ui.fragments.exchange_old.exchangeaccountlist;

import C.v;
import U0.e;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.internal.f;
import org.bouncycastle.i18n.MessageBundle;

/* compiled from: ExchangeAccountListFragmentArgs.kt */
/* loaded from: classes2.dex */
public final class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final int f12222a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12223b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12224c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12225d;

    /* compiled from: ExchangeAccountListFragmentArgs.kt */
    /* renamed from: com.luminary.business.presentation.ui.fragments.exchange_old.exchangeaccountlist.a$a, reason: collision with other inner class name */
    public static final class C0128a {
        public static a a(Bundle bundle) {
            if (!v.y(bundle, a.class, "way")) {
                throw new IllegalArgumentException("Required argument \"way\" is missing and does not have an android:defaultValue");
            }
            int i = bundle.getInt("way");
            if (!bundle.containsKey("exceptAccount")) {
                throw new IllegalArgumentException("Required argument \"exceptAccount\" is missing and does not have an android:defaultValue");
            }
            String string = bundle.getString("exceptAccount");
            if (!bundle.containsKey(MessageBundle.TITLE_ENTRY)) {
                throw new IllegalArgumentException("Required argument \"title\" is missing and does not have an android:defaultValue");
            }
            String string2 = bundle.getString(MessageBundle.TITLE_ENTRY);
            if (string2 == null) {
                throw new IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value.");
            }
            if (bundle.containsKey(FirebaseAnalytics.Param.CURRENCY)) {
                return new a(i, string, string2, bundle.getString(FirebaseAnalytics.Param.CURRENCY));
            }
            throw new IllegalArgumentException("Required argument \"currency\" is missing and does not have an android:defaultValue");
        }
    }

    public a(int i, String str, String str2, String str3) {
        this.f12222a = i;
        this.f12223b = str;
        this.f12224c = str2;
        this.f12225d = str3;
    }

    public static final a fromBundle(Bundle bundle) {
        return C0128a.a(bundle);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f12222a == aVar.f12222a && f.b(this.f12223b, aVar.f12223b) && f.b(this.f12224c, aVar.f12224c) && f.b(this.f12225d, aVar.f12225d);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f12222a) * 31;
        String str = this.f12223b;
        int c2 = v.c((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f12224c);
        String str2 = this.f12225d;
        return c2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ExchangeAccountListFragmentArgs(way=");
        sb2.append(this.f12222a);
        sb2.append(", exceptAccount=");
        sb2.append(this.f12223b);
        sb2.append(", title=");
        sb2.append(this.f12224c);
        sb2.append(", currency=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f12225d, ")");
    }
}
