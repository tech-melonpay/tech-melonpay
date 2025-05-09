package com.luminary.business.presentation.ui.fragments.newcompany.confirmaddress;

import C.v;
import U0.e;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.presentation.entity.company.CreateCompanyUI;
import java.io.Serializable;
import kotlin.jvm.internal.f;

/* compiled from: ConfirmAddressCompanyFragmentArgs.kt */
/* loaded from: classes2.dex */
public final class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final CreateCompanyUI f12574a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f12575b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12576c;

    /* compiled from: ConfirmAddressCompanyFragmentArgs.kt */
    /* renamed from: com.luminary.business.presentation.ui.fragments.newcompany.confirmaddress.a$a, reason: collision with other inner class name */
    public static final class C0134a {
        public static a a(Bundle bundle) {
            if (!v.y(bundle, a.class, "createCompany")) {
                throw new IllegalArgumentException("Required argument \"createCompany\" is missing and does not have an android:defaultValue");
            }
            if (!Parcelable.class.isAssignableFrom(CreateCompanyUI.class) && !Serializable.class.isAssignableFrom(CreateCompanyUI.class)) {
                throw new UnsupportedOperationException(CreateCompanyUI.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            CreateCompanyUI createCompanyUI = (CreateCompanyUI) bundle.get("createCompany");
            if (createCompanyUI == null) {
                throw new IllegalArgumentException("Argument \"createCompany\" is marked as non-null but was passed a null value.");
            }
            if (!bundle.containsKey("mEdit")) {
                throw new IllegalArgumentException("Required argument \"mEdit\" is missing and does not have an android:defaultValue");
            }
            boolean z10 = bundle.getBoolean("mEdit");
            if (!bundle.containsKey("companyId")) {
                throw new IllegalArgumentException("Required argument \"companyId\" is missing and does not have an android:defaultValue");
            }
            String string = bundle.getString("companyId");
            if (string != null) {
                return new a(createCompanyUI, z10, string);
            }
            throw new IllegalArgumentException("Argument \"companyId\" is marked as non-null but was passed a null value.");
        }
    }

    public a(CreateCompanyUI createCompanyUI, boolean z10, String str) {
        this.f12574a = createCompanyUI;
        this.f12575b = z10;
        this.f12576c = str;
    }

    public static final a fromBundle(Bundle bundle) {
        return C0134a.a(bundle);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return f.b(this.f12574a, aVar.f12574a) && this.f12575b == aVar.f12575b && f.b(this.f12576c, aVar.f12576c);
    }

    public final int hashCode() {
        return this.f12576c.hashCode() + v.d(this.f12574a.hashCode() * 31, 31, this.f12575b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ConfirmAddressCompanyFragmentArgs(createCompany=");
        sb2.append(this.f12574a);
        sb2.append(", mEdit=");
        sb2.append(this.f12575b);
        sb2.append(", companyId=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f12576c, ")");
    }
}
