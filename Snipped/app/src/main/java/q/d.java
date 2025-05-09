package q;

import java.util.Arrays;

/* compiled from: BiometricErrorData.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f25755a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f25756b;

    public d(int i, CharSequence charSequence) {
        this.f25755a = i;
        this.f25756b = charSequence;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f25755a != dVar.f25755a) {
            return false;
        }
        CharSequence charSequence = this.f25756b;
        String charSequence2 = charSequence != null ? charSequence.toString() : null;
        CharSequence charSequence3 = dVar.f25756b;
        String charSequence4 = charSequence3 != null ? charSequence3.toString() : null;
        return (charSequence2 == null && charSequence4 == null) || (charSequence2 != null && charSequence2.equals(charSequence4));
    }

    public final int hashCode() {
        Integer valueOf = Integer.valueOf(this.f25755a);
        CharSequence charSequence = this.f25756b;
        return Arrays.hashCode(new Object[]{valueOf, charSequence != null ? charSequence.toString() : null});
    }
}
