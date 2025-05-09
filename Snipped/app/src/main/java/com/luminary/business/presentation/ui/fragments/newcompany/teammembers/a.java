package com.luminary.business.presentation.ui.fragments.newcompany.teammembers;

import C.v;
import U0.e;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.presentation.entity.company.TeamMemberUI;
import java.io.Serializable;
import kotlin.jvm.internal.f;

/* compiled from: TeamMembersFragmentArgs.kt */
/* loaded from: classes2.dex */
public final class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final String f12698a;

    /* renamed from: b, reason: collision with root package name */
    public final TeamMemberUI f12699b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12700c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f12701d;

    /* compiled from: TeamMembersFragmentArgs.kt */
    /* renamed from: com.luminary.business.presentation.ui.fragments.newcompany.teammembers.a$a, reason: collision with other inner class name */
    public static final class C0136a {
        public static a a(Bundle bundle) {
            if (!v.y(bundle, a.class, "companyId")) {
                throw new IllegalArgumentException("Required argument \"companyId\" is missing and does not have an android:defaultValue");
            }
            String string = bundle.getString("companyId");
            if (string == null) {
                throw new IllegalArgumentException("Argument \"companyId\" is marked as non-null but was passed a null value.");
            }
            if (!bundle.containsKey("memberUI")) {
                throw new IllegalArgumentException("Required argument \"memberUI\" is missing and does not have an android:defaultValue");
            }
            if (!Parcelable.class.isAssignableFrom(TeamMemberUI.class) && !Serializable.class.isAssignableFrom(TeamMemberUI.class)) {
                throw new UnsupportedOperationException(TeamMemberUI.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            TeamMemberUI teamMemberUI = (TeamMemberUI) bundle.get("memberUI");
            if (bundle.containsKey("companyIdProxy")) {
                return new a(string, teamMemberUI, bundle.getString("companyIdProxy"), bundle.containsKey("isEdit") ? bundle.getBoolean("isEdit") : false);
            }
            throw new IllegalArgumentException("Required argument \"companyIdProxy\" is missing and does not have an android:defaultValue");
        }
    }

    public a(String str, TeamMemberUI teamMemberUI, String str2, boolean z10) {
        this.f12698a = str;
        this.f12699b = teamMemberUI;
        this.f12700c = str2;
        this.f12701d = z10;
    }

    public static final a fromBundle(Bundle bundle) {
        return C0136a.a(bundle);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return f.b(this.f12698a, aVar.f12698a) && f.b(this.f12699b, aVar.f12699b) && f.b(this.f12700c, aVar.f12700c) && this.f12701d == aVar.f12701d;
    }

    public final int hashCode() {
        int hashCode = this.f12698a.hashCode() * 31;
        TeamMemberUI teamMemberUI = this.f12699b;
        int hashCode2 = (hashCode + (teamMemberUI == null ? 0 : teamMemberUI.hashCode())) * 31;
        String str = this.f12700c;
        return Boolean.hashCode(this.f12701d) + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "TeamMembersFragmentArgs(companyId=" + this.f12698a + ", memberUI=" + this.f12699b + ", companyIdProxy=" + this.f12700c + ", isEdit=" + this.f12701d + ")";
    }
}
