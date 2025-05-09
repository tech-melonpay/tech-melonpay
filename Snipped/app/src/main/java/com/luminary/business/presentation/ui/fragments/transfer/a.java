package com.luminary.business.presentation.ui.fragments.transfer;

import C.v;
import U0.e;
import android.os.Bundle;
import kotlin.jvm.internal.f;

/* compiled from: TransferFragmentArgs.kt */
/* loaded from: classes2.dex */
public final class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final String f13156a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13157b;

    /* renamed from: c, reason: collision with root package name */
    public final String f13158c;

    /* renamed from: d, reason: collision with root package name */
    public final String f13159d;

    /* compiled from: TransferFragmentArgs.kt */
    /* renamed from: com.luminary.business.presentation.ui.fragments.transfer.a$a, reason: collision with other inner class name */
    public static final class C0138a {
        public static a a(Bundle bundle) {
            if (!v.y(bundle, a.class, "fromAc")) {
                throw new IllegalArgumentException("Required argument \"fromAc\" is missing and does not have an android:defaultValue");
            }
            String string = bundle.getString("fromAc");
            if (!bundle.containsKey("toAc")) {
                throw new IllegalArgumentException("Required argument \"toAc\" is missing and does not have an android:defaultValue");
            }
            String string2 = bundle.getString("toAc");
            if (!bundle.containsKey("reference")) {
                throw new IllegalArgumentException("Required argument \"reference\" is missing and does not have an android:defaultValue");
            }
            String string3 = bundle.getString("reference");
            if (bundle.containsKey("amount")) {
                return new a(string, string2, string3, bundle.getString("amount"));
            }
            throw new IllegalArgumentException("Required argument \"amount\" is missing and does not have an android:defaultValue");
        }
    }

    public a(String str, String str2, String str3, String str4) {
        this.f13156a = str;
        this.f13157b = str2;
        this.f13158c = str3;
        this.f13159d = str4;
    }

    public static final a fromBundle(Bundle bundle) {
        return C0138a.a(bundle);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return f.b(this.f13156a, aVar.f13156a) && f.b(this.f13157b, aVar.f13157b) && f.b(this.f13158c, aVar.f13158c) && f.b(this.f13159d, aVar.f13159d);
    }

    public final int hashCode() {
        String str = this.f13156a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f13157b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f13158c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f13159d;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TransferFragmentArgs(fromAc=");
        sb2.append(this.f13156a);
        sb2.append(", toAc=");
        sb2.append(this.f13157b);
        sb2.append(", reference=");
        sb2.append(this.f13158c);
        sb2.append(", amount=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f13159d, ")");
    }
}
