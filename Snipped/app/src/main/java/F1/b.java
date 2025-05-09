package F1;

import android.animation.TypeEvaluator;

/* compiled from: CircularProgressIndicator.java */
/* loaded from: classes.dex */
public final class b implements TypeEvaluator<Double> {
    @Override // android.animation.TypeEvaluator
    public final Double evaluate(float f10, Double d10, Double d11) {
        Double d12 = d10;
        return Double.valueOf(((d11.doubleValue() - d12.doubleValue()) * f10) + d12.doubleValue());
    }
}
