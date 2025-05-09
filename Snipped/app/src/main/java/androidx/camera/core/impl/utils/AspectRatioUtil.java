package androidx.camera.core.impl.utils;

import android.graphics.RectF;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.internal.utils.SizeUtil;
import java.util.Comparator;
import pa.C1124b;

/* loaded from: classes.dex */
public final class AspectRatioUtil {
    private static final int ALIGN16 = 16;
    public static final Rational ASPECT_RATIO_4_3 = new Rational(4, 3);
    public static final Rational ASPECT_RATIO_3_4 = new Rational(3, 4);
    public static final Rational ASPECT_RATIO_16_9 = new Rational(16, 9);
    public static final Rational ASPECT_RATIO_9_16 = new Rational(9, 16);

    public static final class CompareAspectRatiosByMappingAreaInFullFovAspectRatioSpace implements Comparator<Rational> {
        private final Rational mFullFovRatio;
        private final Rational mTargetRatio;
        private final RectF mTransformedMappingArea;

        public CompareAspectRatiosByMappingAreaInFullFovAspectRatioSpace(Rational rational, Rational rational2) {
            this.mTargetRatio = rational;
            this.mFullFovRatio = rational2 == null ? new Rational(4, 3) : rational2;
            this.mTransformedMappingArea = getTransformedMappingArea(rational);
        }

        private float getMappingAreaSize(RectF rectF) {
            return rectF.height() * rectF.width();
        }

        private float getOverlappingAreaSize(RectF rectF, RectF rectF2) {
            return (rectF.width() < rectF2.width() ? rectF.width() : rectF2.width()) * (rectF.height() < rectF2.height() ? rectF.height() : rectF2.height());
        }

        private RectF getTransformedMappingArea(Rational rational) {
            return rational.floatValue() == this.mFullFovRatio.floatValue() ? new RectF(0.0f, 0.0f, this.mFullFovRatio.getNumerator(), this.mFullFovRatio.getDenominator()) : rational.floatValue() > this.mFullFovRatio.floatValue() ? new RectF(0.0f, 0.0f, this.mFullFovRatio.getNumerator(), (rational.getDenominator() * this.mFullFovRatio.getNumerator()) / rational.getNumerator()) : new RectF(0.0f, 0.0f, (rational.getNumerator() * this.mFullFovRatio.getDenominator()) / rational.getDenominator(), this.mFullFovRatio.getDenominator());
        }

        private boolean isMappingAreaCovered(RectF rectF, RectF rectF2) {
            return rectF.width() >= rectF2.width() && rectF.height() >= rectF2.height();
        }

        @Override // java.util.Comparator
        public int compare(Rational rational, Rational rational2) {
            if (rational.equals(rational2)) {
                return 0;
            }
            RectF transformedMappingArea = getTransformedMappingArea(rational);
            RectF transformedMappingArea2 = getTransformedMappingArea(rational2);
            boolean isMappingAreaCovered = isMappingAreaCovered(transformedMappingArea, this.mTransformedMappingArea);
            boolean isMappingAreaCovered2 = isMappingAreaCovered(transformedMappingArea2, this.mTransformedMappingArea);
            if (isMappingAreaCovered && isMappingAreaCovered2) {
                return (int) Math.signum(getMappingAreaSize(transformedMappingArea) - getMappingAreaSize(transformedMappingArea2));
            }
            if (isMappingAreaCovered) {
                return -1;
            }
            if (isMappingAreaCovered2) {
                return 1;
            }
            return -((int) Math.signum(getOverlappingAreaSize(transformedMappingArea, this.mTransformedMappingArea) - getOverlappingAreaSize(transformedMappingArea2, this.mTransformedMappingArea)));
        }
    }

    private AspectRatioUtil() {
    }

    public static boolean hasMatchingAspectRatio(Size size, Rational rational) {
        return hasMatchingAspectRatio(size, rational, SizeUtil.RESOLUTION_VGA);
    }

    private static boolean isPossibleMod16FromAspectRatio(Size size, Rational rational) {
        int width = size.getWidth();
        int height = size.getHeight();
        Rational rational2 = new Rational(rational.getDenominator(), rational.getNumerator());
        int i = width % 16;
        if (i == 0 && height % 16 == 0) {
            return ratioIntersectsMod16Segment(Math.max(0, height + (-16)), width, rational) || ratioIntersectsMod16Segment(Math.max(0, width + (-16)), height, rational2);
        }
        if (i == 0) {
            return ratioIntersectsMod16Segment(height, width, rational);
        }
        if (height % 16 == 0) {
            return ratioIntersectsMod16Segment(width, height, rational2);
        }
        return false;
    }

    private static boolean ratioIntersectsMod16Segment(int i, int i9, Rational rational) {
        C1124b.l(i9 % 16 == 0);
        double numerator = (rational.getNumerator() * i) / rational.getDenominator();
        return numerator > ((double) Math.max(0, i9 + (-16))) && numerator < ((double) (i9 + 16));
    }

    public static boolean hasMatchingAspectRatio(Size size, Rational rational, Size size2) {
        if (rational == null) {
            return false;
        }
        if (rational.equals(new Rational(size.getWidth(), size.getHeight()))) {
            return true;
        }
        if (SizeUtil.getArea(size) >= SizeUtil.getArea(size2)) {
            return isPossibleMod16FromAspectRatio(size, rational);
        }
        return false;
    }
}
