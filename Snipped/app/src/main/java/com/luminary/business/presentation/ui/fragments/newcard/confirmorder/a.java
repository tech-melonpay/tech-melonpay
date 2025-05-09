package com.luminary.business.presentation.ui.fragments.newcard.confirmorder;

import C.v;
import U0.e;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.internal.f;

/* compiled from: ConfirmOrderFragmentArgs.kt */
/* loaded from: classes2.dex */
public final class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final String f12415a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12416b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12417c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12418d;

    /* compiled from: ConfirmOrderFragmentArgs.kt */
    /* renamed from: com.luminary.business.presentation.ui.fragments.newcard.confirmorder.a$a, reason: collision with other inner class name */
    public static final class C0132a {
        public static a a(Bundle bundle) {
            if (!v.y(bundle, a.class, "accountNumber")) {
                throw new IllegalArgumentException("Required argument \"accountNumber\" is missing and does not have an android:defaultValue");
            }
            String string = bundle.getString("accountNumber");
            if (string == null) {
                throw new IllegalArgumentException("Argument \"accountNumber\" is marked as non-null but was passed a null value.");
            }
            if (!bundle.containsKey("cardType")) {
                throw new IllegalArgumentException("Required argument \"cardType\" is missing and does not have an android:defaultValue");
            }
            int i = bundle.getInt("cardType");
            if (!bundle.containsKey("accountName")) {
                throw new IllegalArgumentException("Required argument \"accountName\" is missing and does not have an android:defaultValue");
            }
            String string2 = bundle.getString("accountName");
            if (string2 == null) {
                throw new IllegalArgumentException("Argument \"accountName\" is marked as non-null but was passed a null value.");
            }
            if (!bundle.containsKey(FirebaseAnalytics.Param.CURRENCY)) {
                throw new IllegalArgumentException("Required argument \"currency\" is missing and does not have an android:defaultValue");
            }
            String string3 = bundle.getString(FirebaseAnalytics.Param.CURRENCY);
            if (string3 != null) {
                return new a(i, string, string2, string3);
            }
            throw new IllegalArgumentException("Argument \"currency\" is marked as non-null but was passed a null value.");
        }
    }

    public a(int i, String str, String str2, String str3) {
        this.f12415a = str;
        this.f12416b = i;
        this.f12417c = str2;
        this.f12418d = str3;
    }

    public static final a fromBundle(Bundle bundle) {
        return C0132a.a(bundle);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return f.b(this.f12415a, aVar.f12415a) && this.f12416b == aVar.f12416b && f.b(this.f12417c, aVar.f12417c) && f.b(this.f12418d, aVar.f12418d);
    }

    public final int hashCode() {
        return this.f12418d.hashCode() + v.c(v.b(this.f12416b, this.f12415a.hashCode() * 31, 31), 31, this.f12417c);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ConfirmOrderFragmentArgs(accountNumber=");
        sb2.append(this.f12415a);
        sb2.append(", cardType=");
        sb2.append(this.f12416b);
        sb2.append(", accountName=");
        sb2.append(this.f12417c);
        sb2.append(", currency=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f12418d, ")");
    }
}
