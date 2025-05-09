package P7;

import U0.i;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.presentation.entity.company.TeamMemberUI;
import com.luminary.mobile.R;
import java.io.Serializable;

/* compiled from: AdditionalInformationFragmentDirections.kt */
/* loaded from: classes2.dex */
public final class f implements i {

    /* renamed from: a, reason: collision with root package name */
    public final String f3099a;

    /* renamed from: b, reason: collision with root package name */
    public final TeamMemberUI f3100b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3101c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3102d;

    public f(String str, TeamMemberUI teamMemberUI, String str2, boolean z10) {
        this.f3099a = str;
        this.f3100b = teamMemberUI;
        this.f3101c = str2;
        this.f3102d = z10;
    }

    @Override // U0.i
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("companyId", this.f3099a);
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(TeamMemberUI.class);
        Parcelable parcelable = this.f3100b;
        if (isAssignableFrom) {
            bundle.putParcelable("memberUI", parcelable);
        } else {
            if (!Serializable.class.isAssignableFrom(TeamMemberUI.class)) {
                throw new UnsupportedOperationException(TeamMemberUI.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle.putSerializable("memberUI", (Serializable) parcelable);
        }
        bundle.putString("companyIdProxy", this.f3101c);
        bundle.putBoolean("isEdit", this.f3102d);
        return bundle;
    }

    @Override // U0.i
    public final int b() {
        return R.id.action_additionalInformationFragment_to_teamMembersFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return kotlin.jvm.internal.f.b(this.f3099a, fVar.f3099a) && kotlin.jvm.internal.f.b(this.f3100b, fVar.f3100b) && kotlin.jvm.internal.f.b(this.f3101c, fVar.f3101c) && this.f3102d == fVar.f3102d;
    }

    public final int hashCode() {
        int hashCode = this.f3099a.hashCode() * 31;
        TeamMemberUI teamMemberUI = this.f3100b;
        int hashCode2 = (hashCode + (teamMemberUI == null ? 0 : teamMemberUI.hashCode())) * 31;
        String str = this.f3101c;
        return Boolean.hashCode(this.f3102d) + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ActionAdditionalInformationFragmentToTeamMembersFragment(companyId=" + this.f3099a + ", memberUI=" + this.f3100b + ", companyIdProxy=" + this.f3101c + ", isEdit=" + this.f3102d + ")";
    }
}
