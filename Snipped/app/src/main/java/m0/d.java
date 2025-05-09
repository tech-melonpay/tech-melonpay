package m0;

import android.content.res.ColorStateList;
import android.graphics.Shader;

/* compiled from: ComplexColorCompat.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Shader f23843a;

    /* renamed from: b, reason: collision with root package name */
    public final ColorStateList f23844b;

    /* renamed from: c, reason: collision with root package name */
    public int f23845c;

    public d(Shader shader, ColorStateList colorStateList, int i) {
        this.f23843a = shader;
        this.f23844b = colorStateList;
        this.f23845c = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x01c8, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r2.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static m0.d a(android.content.res.Resources.Theme r29, android.content.res.Resources r30, int r31) {
        /*
            Method dump skipped, instructions count: 659
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.d.a(android.content.res.Resources$Theme, android.content.res.Resources, int):m0.d");
    }

    public final boolean b() {
        ColorStateList colorStateList;
        return this.f23843a == null && (colorStateList = this.f23844b) != null && colorStateList.isStateful();
    }
}
