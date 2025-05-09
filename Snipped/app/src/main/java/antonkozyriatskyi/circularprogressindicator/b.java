package antonkozyriatskyi.circularprogressindicator;

import antonkozyriatskyi.circularprogressindicator.CircularProgressIndicator;

/* compiled from: PatternProgressTextAdapter.java */
/* loaded from: classes.dex */
public final class b implements CircularProgressIndicator.b {

    /* renamed from: a, reason: collision with root package name */
    public String f8270a;

    @Override // antonkozyriatskyi.circularprogressindicator.CircularProgressIndicator.b
    public final String d(double d10) {
        return String.format(this.f8270a, Double.valueOf(d10));
    }
}
