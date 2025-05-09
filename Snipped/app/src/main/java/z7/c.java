package Z7;

import C.v;
import U0.i;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.presentation.entity.company.TeamMemberUI;
import com.luminary.mobile.R;
import java.io.Serializable;
import kotlin.jvm.internal.f;

/* compiled from: TeamMembersFragmentDirections.kt */
/* loaded from: classes2.dex */
public final class c implements i {

    /* renamed from: a, reason: collision with root package name */
    public final String f4230a;

    /* renamed from: b, reason: collision with root package name */
    public final float f4231b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4232c;

    /* renamed from: d, reason: collision with root package name */
    public final TeamMemberUI f4233d;

    public c(String str, float f10, String str2, TeamMemberUI teamMemberUI) {
        this.f4230a = str;
        this.f4231b = f10;
        this.f4232c = str2;
        this.f4233d = teamMemberUI;
    }

    @Override // U0.i
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("companiId", this.f4230a);
        bundle.putFloat("maxShare", this.f4231b);
        bundle.putString("type", this.f4232c);
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(TeamMemberUI.class);
        Parcelable parcelable = this.f4233d;
        if (isAssignableFrom) {
            bundle.putParcelable("editMemberUI", parcelable);
        } else {
            if (!Serializable.class.isAssignableFrom(TeamMemberUI.class)) {
                throw new UnsupportedOperationException(TeamMemberUI.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle.putSerializable("editMemberUI", (Serializable) parcelable);
        }
        return bundle;
    }

    @Override // U0.i
    public final int b() {
        return R.id.action_teamMembersFragment_to_addUBOFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return f.b(this.f4230a, cVar.f4230a) && Float.compare(this.f4231b, cVar.f4231b) == 0 && f.b(this.f4232c, cVar.f4232c) && f.b(this.f4233d, cVar.f4233d);
    }

    public final int hashCode() {
        int c2 = v.c(v.a(this.f4230a.hashCode() * 31, this.f4231b, 31), 31, this.f4232c);
        TeamMemberUI teamMemberUI = this.f4233d;
        return c2 + (teamMemberUI == null ? 0 : teamMemberUI.hashCode());
    }

    public final String toString() {
        return "ActionTeamMembersFragmentToAddUBOFragment(companiId=" + this.f4230a + ", maxShare=" + this.f4231b + ", type=" + this.f4232c + ", editMemberUI=" + this.f4233d + ")";
    }
}
