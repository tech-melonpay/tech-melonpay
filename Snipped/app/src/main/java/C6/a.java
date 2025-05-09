package C6;

import com.airbnb.epoxy.EpoxyModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.f;

/* compiled from: ModelsWrap.kt */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final List<EpoxyModel<?>> f680a;

    public a(ArrayList arrayList) {
        this.f680a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && f.b(this.f680a, ((a) obj).f680a);
    }

    public final int hashCode() {
        return this.f680a.hashCode();
    }

    public final String toString() {
        return "ModelsWrap(list=" + this.f680a + ")";
    }
}
