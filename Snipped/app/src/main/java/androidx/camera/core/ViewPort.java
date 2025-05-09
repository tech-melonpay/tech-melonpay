package androidx.camera.core;

import android.util.Rational;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import pa.C1124b;

/* loaded from: classes.dex */
public final class ViewPort {
    public static final int FILL_CENTER = 1;
    public static final int FILL_END = 2;
    public static final int FILL_START = 0;
    public static final int FIT = 3;
    private Rational mAspectRatio;
    private int mLayoutDirection;
    private int mRotation;
    private int mScaleType;

    public static final class Builder {
        private static final int DEFAULT_LAYOUT_DIRECTION = 0;
        private static final int DEFAULT_SCALE_TYPE = 1;
        private final Rational mAspectRatio;
        private final int mRotation;
        private int mScaleType = 1;
        private int mLayoutDirection = 0;

        public Builder(Rational rational, int i) {
            this.mAspectRatio = rational;
            this.mRotation = i;
        }

        public ViewPort build() {
            C1124b.p(this.mAspectRatio, "The crop aspect ratio must be set.");
            return new ViewPort(this.mScaleType, this.mAspectRatio, this.mRotation, this.mLayoutDirection);
        }

        public Builder setLayoutDirection(int i) {
            this.mLayoutDirection = i;
            return this;
        }

        public Builder setScaleType(int i) {
            this.mScaleType = i;
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface LayoutDirection {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ScaleType {
    }

    public ViewPort(int i, Rational rational, int i9, int i10) {
        this.mScaleType = i;
        this.mAspectRatio = rational;
        this.mRotation = i9;
        this.mLayoutDirection = i10;
    }

    public Rational getAspectRatio() {
        return this.mAspectRatio;
    }

    public int getLayoutDirection() {
        return this.mLayoutDirection;
    }

    public int getRotation() {
        return this.mRotation;
    }

    public int getScaleType() {
        return this.mScaleType;
    }
}
