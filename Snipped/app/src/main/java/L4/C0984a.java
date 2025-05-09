package l4;

import e4.C0715a;
import java.util.ArrayList;
import kotlin.jvm.internal.f;

/* compiled from: CurrenciesRaw.kt */
/* renamed from: l4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0984a extends C0715a {

    /* renamed from: b, reason: collision with root package name */
    @l3.b("fiat")
    private ArrayList<b> f23543b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("crypto")
    private ArrayList<b> f23544c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0984a() {
        super(0);
        ArrayList<b> arrayList = new ArrayList<>();
        ArrayList<b> arrayList2 = new ArrayList<>();
        this.f23543b = arrayList;
        this.f23544c = arrayList2;
    }

    public final ArrayList<b> b() {
        return this.f23544c;
    }

    public final ArrayList<b> c() {
        return this.f23543b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0984a)) {
            return false;
        }
        C0984a c0984a = (C0984a) obj;
        return f.b(this.f23543b, c0984a.f23543b) && f.b(this.f23544c, c0984a.f23544c);
    }

    public final int hashCode() {
        return this.f23544c.hashCode() + (this.f23543b.hashCode() * 31);
    }

    public final String toString() {
        return "CurrenciesRaw(fiat=" + this.f23543b + ", crypto=" + this.f23544c + ")";
    }
}
