package androidx.camera.core;

/* loaded from: classes.dex */
final class ImageReaderFormatRecommender {

    public static abstract class FormatCombo {
        public static FormatCombo create(int i, int i9) {
            return new AutoValue_ImageReaderFormatRecommender_FormatCombo(i, i9);
        }

        public abstract int imageAnalysisFormat();

        public abstract int imageCaptureFormat();
    }

    private ImageReaderFormatRecommender() {
    }

    public static FormatCombo chooseCombo() {
        return FormatCombo.create(256, 35);
    }
}
