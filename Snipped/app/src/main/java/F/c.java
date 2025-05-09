package F;

import F.a;

/* compiled from: AutoValue_AudioSettings.java */
/* loaded from: classes.dex */
public final class c extends F.a {

    /* renamed from: b, reason: collision with root package name */
    public final int f1127b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1128c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1129d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1130e;

    /* compiled from: AutoValue_AudioSettings.java */
    public static final class a extends a.AbstractC0014a {

        /* renamed from: a, reason: collision with root package name */
        public Integer f1131a;

        /* renamed from: b, reason: collision with root package name */
        public Integer f1132b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f1133c;

        /* renamed from: d, reason: collision with root package name */
        public Integer f1134d;
    }

    public c(int i, int i9, int i10, int i11) {
        this.f1127b = i;
        this.f1128c = i9;
        this.f1129d = i10;
        this.f1130e = i11;
    }

    @Override // F.a
    public final int a() {
        return this.f1130e;
    }

    @Override // F.a
    public final int b() {
        return this.f1127b;
    }

    @Override // F.a
    public final int d() {
        return this.f1129d;
    }

    @Override // F.a
    public final int e() {
        return this.f1128c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.a)) {
            return false;
        }
        F.a aVar = (F.a) obj;
        return this.f1127b == aVar.b() && this.f1128c == aVar.e() && this.f1129d == aVar.d() && this.f1130e == aVar.a();
    }

    public final int hashCode() {
        return ((((((this.f1127b ^ 1000003) * 1000003) ^ this.f1128c) * 1000003) ^ this.f1129d) * 1000003) ^ this.f1130e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AudioSettings{audioSource=");
        sb2.append(this.f1127b);
        sb2.append(", sampleRate=");
        sb2.append(this.f1128c);
        sb2.append(", channelCount=");
        sb2.append(this.f1129d);
        sb2.append(", audioFormat=");
        return s3.b.m(sb2, this.f1130e, "}");
    }
}
