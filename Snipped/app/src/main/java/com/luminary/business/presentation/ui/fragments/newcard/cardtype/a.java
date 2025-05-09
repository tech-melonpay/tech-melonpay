package com.luminary.business.presentation.ui.fragments.newcard.cardtype;

import C.v;
import U0.e;
import android.os.Bundle;
import kotlin.jvm.internal.f;

/* compiled from: SelectCardTypeFragmentArgs.kt */
/* loaded from: classes2.dex */
public final class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final String f12404a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12405b;

    /* compiled from: SelectCardTypeFragmentArgs.kt */
    /* renamed from: com.luminary.business.presentation.ui.fragments.newcard.cardtype.a$a, reason: collision with other inner class name */
    public static final class C0131a {
        public static a a(Bundle bundle) {
            if (!v.y(bundle, a.class, "accountNumber")) {
                throw new IllegalArgumentException("Required argument \"accountNumber\" is missing and does not have an android:defaultValue");
            }
            String string = bundle.getString("accountNumber");
            if (string == null) {
                throw new IllegalArgumentException("Argument \"accountNumber\" is marked as non-null but was passed a null value.");
            }
            if (!bundle.containsKey("accountName")) {
                throw new IllegalArgumentException("Required argument \"accountName\" is missing and does not have an android:defaultValue");
            }
            String string2 = bundle.getString("accountName");
            if (string2 != null) {
                return new a(string, string2);
            }
            throw new IllegalArgumentException("Argument \"accountName\" is marked as non-null but was passed a null value.");
        }
    }

    public a(String str, String str2) {
        this.f12404a = str;
        this.f12405b = str2;
    }

    public static final a fromBundle(Bundle bundle) {
        return C0131a.a(bundle);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return f.b(this.f12404a, aVar.f12404a) && f.b(this.f12405b, aVar.f12405b);
    }

    public final int hashCode() {
        return this.f12405b.hashCode() + (this.f12404a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectCardTypeFragmentArgs(accountNumber=");
        sb2.append(this.f12404a);
        sb2.append(", accountName=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f12405b, ")");
    }
}
