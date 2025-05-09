package com.luminary.business.presentation.ui.fragments.crypto.crypto_exchange;

import C.v;
import U0.e;
import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.f;

/* compiled from: CryptoExchangeFragmentArgs.kt */
/* loaded from: classes2.dex */
public final class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f12057a;

    /* renamed from: b, reason: collision with root package name */
    public final CryptoExchangeFragment$Companion$DirectionType f12058b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12059c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12060d;

    /* renamed from: e, reason: collision with root package name */
    public final float f12061e;

    /* compiled from: CryptoExchangeFragmentArgs.kt */
    /* renamed from: com.luminary.business.presentation.ui.fragments.crypto.crypto_exchange.a$a, reason: collision with other inner class name */
    public static final class C0122a {
        public static a a(Bundle bundle) {
            String str;
            String str2;
            if (!v.y(bundle, a.class, "onlyShow")) {
                throw new IllegalArgumentException("Required argument \"onlyShow\" is missing and does not have an android:defaultValue");
            }
            boolean z10 = bundle.getBoolean("onlyShow");
            if (bundle.containsKey("sourceCurrency")) {
                String string = bundle.getString("sourceCurrency");
                if (string == null) {
                    throw new IllegalArgumentException("Argument \"sourceCurrency\" is marked as non-null but was passed a null value.");
                }
                str = string;
            } else {
                str = "";
            }
            if (bundle.containsKey("destinationCurrency")) {
                String string2 = bundle.getString("destinationCurrency");
                if (string2 == null) {
                    throw new IllegalArgumentException("Argument \"destinationCurrency\" is marked as non-null but was passed a null value.");
                }
                str2 = string2;
            } else {
                str2 = "";
            }
            if (!bundle.containsKey("direction")) {
                throw new IllegalArgumentException("Required argument \"direction\" is missing and does not have an android:defaultValue");
            }
            if (!Parcelable.class.isAssignableFrom(CryptoExchangeFragment$Companion$DirectionType.class) && !Serializable.class.isAssignableFrom(CryptoExchangeFragment$Companion$DirectionType.class)) {
                throw new UnsupportedOperationException(CryptoExchangeFragment$Companion$DirectionType.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            CryptoExchangeFragment$Companion$DirectionType cryptoExchangeFragment$Companion$DirectionType = (CryptoExchangeFragment$Companion$DirectionType) bundle.get("direction");
            if (cryptoExchangeFragment$Companion$DirectionType != null) {
                return new a(z10, cryptoExchangeFragment$Companion$DirectionType, str, str2, bundle.containsKey("value") ? bundle.getFloat("value") : 0.0f);
            }
            throw new IllegalArgumentException("Argument \"direction\" is marked as non-null but was passed a null value.");
        }
    }

    public a(boolean z10, CryptoExchangeFragment$Companion$DirectionType cryptoExchangeFragment$Companion$DirectionType, String str, String str2, float f10) {
        this.f12057a = z10;
        this.f12058b = cryptoExchangeFragment$Companion$DirectionType;
        this.f12059c = str;
        this.f12060d = str2;
        this.f12061e = f10;
    }

    public static final a fromBundle(Bundle bundle) {
        return C0122a.a(bundle);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f12057a == aVar.f12057a && this.f12058b == aVar.f12058b && f.b(this.f12059c, aVar.f12059c) && f.b(this.f12060d, aVar.f12060d) && Float.compare(this.f12061e, aVar.f12061e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f12061e) + v.c(v.c((this.f12058b.hashCode() + (Boolean.hashCode(this.f12057a) * 31)) * 31, 31, this.f12059c), 31, this.f12060d);
    }

    public final String toString() {
        return "CryptoExchangeFragmentArgs(onlyShow=" + this.f12057a + ", direction=" + this.f12058b + ", sourceCurrency=" + this.f12059c + ", destinationCurrency=" + this.f12060d + ", value=" + this.f12061e + ")";
    }
}
