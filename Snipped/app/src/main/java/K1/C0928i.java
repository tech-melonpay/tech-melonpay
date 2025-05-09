package k1;

import android.graphics.Rect;
import android.view.ViewGroup;
import k1.AbstractC0919C;

/* compiled from: CircularPropagation.java */
/* renamed from: k1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0928i extends X {
    @Override // k1.X
    public final long a(ViewGroup viewGroup, AbstractC0919C abstractC0919C, L l10, L l11) {
        int i;
        int round;
        int i9;
        Integer num;
        if (l10 == null && l11 == null) {
            return 0L;
        }
        if (l11 == null || !(l10 == null || (num = (Integer) l10.f22761a.get("android:visibilityPropagation:visibility")) == null || num.intValue() != 0)) {
            i = -1;
        } else {
            l10 = l11;
            i = 1;
        }
        int b9 = X.b(l10, 0);
        int b10 = X.b(l10, 1);
        AbstractC0919C.d dVar = abstractC0919C.f22688B;
        Rect a10 = dVar == null ? null : dVar.a();
        if (a10 != null) {
            i9 = a10.centerX();
            round = a10.centerY();
        } else {
            viewGroup.getLocationOnScreen(new int[2]);
            int round2 = Math.round(viewGroup.getTranslationX() + (viewGroup.getWidth() / 2) + r6[0]);
            round = Math.round(viewGroup.getTranslationY() + (viewGroup.getHeight() / 2) + r6[1]);
            i9 = round2;
        }
        float f10 = i9 - b9;
        float f11 = round - b10;
        float sqrt = (float) Math.sqrt((f11 * f11) + (f10 * f10));
        float width = viewGroup.getWidth() - 0.0f;
        float height = viewGroup.getHeight() - 0.0f;
        float sqrt2 = sqrt / ((float) Math.sqrt((height * height) + (width * width)));
        long j10 = abstractC0919C.f22695c;
        if (j10 < 0) {
            j10 = 300;
        }
        return Math.round(((j10 * i) / 3.0f) * sqrt2);
    }
}
