package U0;

import android.os.Bundle;
import java.util.Collection;
import java.util.Set;

/* compiled from: NavAction.kt */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f3592a;

    /* renamed from: b, reason: collision with root package name */
    public androidx.navigation.g f3593b = null;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f3594c = null;

    public d(int i) {
        this.f3592a = i;
    }

    public final boolean equals(Object obj) {
        Set<String> keySet;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f3592a == dVar.f3592a && kotlin.jvm.internal.f.b(this.f3593b, dVar.f3593b)) {
            if (kotlin.jvm.internal.f.b(this.f3594c, dVar.f3594c)) {
                return true;
            }
            Bundle bundle = this.f3594c;
            if (bundle != null && (keySet = bundle.keySet()) != null) {
                Set<String> set = keySet;
                if ((set instanceof Collection) && set.isEmpty()) {
                    return true;
                }
                for (String str : set) {
                    Bundle bundle2 = this.f3594c;
                    Object obj2 = bundle2 != null ? bundle2.get(str) : null;
                    Bundle bundle3 = dVar.f3594c;
                    if (!kotlin.jvm.internal.f.b(obj2, bundle3 != null ? bundle3.get(str) : null)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Set<String> keySet;
        int hashCode = Integer.hashCode(this.f3592a) * 31;
        androidx.navigation.g gVar = this.f3593b;
        int hashCode2 = hashCode + (gVar != null ? gVar.hashCode() : 0);
        Bundle bundle = this.f3594c;
        if (bundle != null && (keySet = bundle.keySet()) != null) {
            for (String str : keySet) {
                int i = hashCode2 * 31;
                Bundle bundle2 = this.f3594c;
                Object obj = bundle2 != null ? bundle2.get(str) : null;
                hashCode2 = i + (obj != null ? obj.hashCode() : 0);
            }
        }
        return hashCode2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(d.class.getSimpleName());
        sb2.append("(0x");
        sb2.append(Integer.toHexString(this.f3592a));
        sb2.append(")");
        if (this.f3593b != null) {
            sb2.append(" navOptions=");
            sb2.append(this.f3593b);
        }
        return sb2.toString();
    }
}
