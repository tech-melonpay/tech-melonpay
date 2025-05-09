package com.luminary.business.presentation.ui.fragments.newcompany.addubo;

import C.v;
import U0.e;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.presentation.entity.company.TeamMemberUI;
import java.io.Serializable;
import kotlin.jvm.internal.f;

/* compiled from: AddUBOFragmentArgs.kt */
/* loaded from: classes2.dex */
public final class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final String f12516a;

    /* renamed from: b, reason: collision with root package name */
    public final float f12517b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12518c;

    /* renamed from: d, reason: collision with root package name */
    public final TeamMemberUI f12519d;

    /* compiled from: AddUBOFragmentArgs.kt */
    /* renamed from: com.luminary.business.presentation.ui.fragments.newcompany.addubo.a$a, reason: collision with other inner class name */
    public static final class C0133a {
        public static a a(Bundle bundle) {
            if (!v.y(bundle, a.class, "companiId")) {
                throw new IllegalArgumentException("Required argument \"companiId\" is missing and does not have an android:defaultValue");
            }
            String string = bundle.getString("companiId");
            if (string == null) {
                throw new IllegalArgumentException("Argument \"companiId\" is marked as non-null but was passed a null value.");
            }
            if (!bundle.containsKey("maxShare")) {
                throw new IllegalArgumentException("Required argument \"maxShare\" is missing and does not have an android:defaultValue");
            }
            float f10 = bundle.getFloat("maxShare");
            if (!bundle.containsKey("type")) {
                throw new IllegalArgumentException("Required argument \"type\" is missing and does not have an android:defaultValue");
            }
            String string2 = bundle.getString("type");
            if (string2 == null) {
                throw new IllegalArgumentException("Argument \"type\" is marked as non-null but was passed a null value.");
            }
            if (!bundle.containsKey("editMemberUI")) {
                throw new IllegalArgumentException("Required argument \"editMemberUI\" is missing and does not have an android:defaultValue");
            }
            if (Parcelable.class.isAssignableFrom(TeamMemberUI.class) || Serializable.class.isAssignableFrom(TeamMemberUI.class)) {
                return new a(string, f10, string2, (TeamMemberUI) bundle.get("editMemberUI"));
            }
            throw new UnsupportedOperationException(TeamMemberUI.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
    }

    public a(String str, float f10, String str2, TeamMemberUI teamMemberUI) {
        this.f12516a = str;
        this.f12517b = f10;
        this.f12518c = str2;
        this.f12519d = teamMemberUI;
    }

    public static final a fromBundle(Bundle bundle) {
        return C0133a.a(bundle);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return f.b(this.f12516a, aVar.f12516a) && Float.compare(this.f12517b, aVar.f12517b) == 0 && f.b(this.f12518c, aVar.f12518c) && f.b(this.f12519d, aVar.f12519d);
    }

    public final int hashCode() {
        int c2 = v.c(v.a(this.f12516a.hashCode() * 31, this.f12517b, 31), 31, this.f12518c);
        TeamMemberUI teamMemberUI = this.f12519d;
        return c2 + (teamMemberUI == null ? 0 : teamMemberUI.hashCode());
    }

    public final String toString() {
        return "AddUBOFragmentArgs(companiId=" + this.f12516a + ", maxShare=" + this.f12517b + ", type=" + this.f12518c + ", editMemberUI=" + this.f12519d + ")";
    }
}
