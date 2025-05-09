package sa;

import kotlinx.serialization.json.ClassDiscriminatorMode;

/* compiled from: JsonConfiguration.kt */
/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f27089a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f27090b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f27091c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f27092d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f27093e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f27094f;

    /* renamed from: g, reason: collision with root package name */
    public final String f27095g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f27096h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final String f27097j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f27098k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f27099l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f27100m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f27101n;

    /* renamed from: o, reason: collision with root package name */
    public final ClassDiscriminatorMode f27102o;

    public f(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, String str, boolean z16, boolean z17, String str2, boolean z18, boolean z19, boolean z20, boolean z21, ClassDiscriminatorMode classDiscriminatorMode) {
        this.f27089a = z10;
        this.f27090b = z11;
        this.f27091c = z12;
        this.f27092d = z13;
        this.f27093e = z14;
        this.f27094f = z15;
        this.f27095g = str;
        this.f27096h = z16;
        this.i = z17;
        this.f27097j = str2;
        this.f27098k = z18;
        this.f27099l = z19;
        this.f27100m = z20;
        this.f27101n = z21;
        this.f27102o = classDiscriminatorMode;
    }

    public final String toString() {
        return "JsonConfiguration(encodeDefaults=" + this.f27089a + ", ignoreUnknownKeys=" + this.f27090b + ", isLenient=" + this.f27091c + ", allowStructuredMapKeys=" + this.f27092d + ", prettyPrint=" + this.f27093e + ", explicitNulls=" + this.f27094f + ", prettyPrintIndent='" + this.f27095g + "', coerceInputValues=" + this.f27096h + ", useArrayPolymorphism=" + this.i + ", classDiscriminator='" + this.f27097j + "', allowSpecialFloatingPointValues=" + this.f27098k + ", useAlternativeNames=" + this.f27099l + ", namingStrategy=null, decodeEnumsCaseInsensitive=" + this.f27100m + ", allowTrailingComma=" + this.f27101n + ", classDiscriminatorMode=" + this.f27102o + ')';
    }
}
