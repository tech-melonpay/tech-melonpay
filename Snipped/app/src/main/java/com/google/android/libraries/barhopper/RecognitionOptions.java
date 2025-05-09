package com.google.android.libraries.barhopper;

import com.google.android.apps.common.proguard.UsedByNative;

/* compiled from: com.google.mlkit:barcode-scanning@@17.1.0 */
@UsedByNative("jni_common.cc")
/* loaded from: classes.dex */
public class RecognitionOptions {

    @UsedByNative("jni_common.cc")
    private int barcodeFormats = 0;

    @UsedByNative("jni_common.cc")
    private boolean outputUnrecognizedBarcodes = false;

    @UsedByNative("jni_common.cc")
    private boolean useQrMobilenetV3 = false;

    @UsedByNative("jni_common.cc")
    private boolean enableQrAlignmentGrid = false;

    @UsedByNative("jni_common.cc")
    private boolean enableUseKeypointAsFinderPattern = false;

    @UsedByNative("jni_common.cc")
    private OnedRecognitionOptions onedRecognitionOptions = new OnedRecognitionOptions();

    public final void a(int i) {
        this.barcodeFormats = i;
    }

    public final void b(boolean z10) {
        this.outputUnrecognizedBarcodes = z10;
    }
}
