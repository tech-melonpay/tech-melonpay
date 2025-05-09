package pl.droidsonroids.gif;

/* loaded from: classes3.dex */
public enum GifError {
    /* JADX INFO: Fake field, exist only in values array */
    EF1("NO_ERROR", "No error"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("OPEN_FAILED", "Failed to open given input"),
    /* JADX INFO: Fake field, exist only in values array */
    EF3("READ_FAILED", "Failed to read from given input"),
    /* JADX INFO: Fake field, exist only in values array */
    EF4("NOT_GIF_FILE", "Data is not in GIF format"),
    /* JADX INFO: Fake field, exist only in values array */
    EF5("NO_SCRN_DSCR", "No screen descriptor detected"),
    /* JADX INFO: Fake field, exist only in values array */
    EF6("NO_IMAG_DSCR", "No image descriptor detected"),
    /* JADX INFO: Fake field, exist only in values array */
    EF7("NO_COLOR_MAP", "Neither global nor local color map found"),
    /* JADX INFO: Fake field, exist only in values array */
    EF8("WRONG_RECORD", "Wrong record type detected"),
    /* JADX INFO: Fake field, exist only in values array */
    EF9("DATA_TOO_BIG", "Number of pixels bigger than width * height"),
    /* JADX INFO: Fake field, exist only in values array */
    EF10("NOT_ENOUGH_MEM", "Failed to allocate required memory"),
    /* JADX INFO: Fake field, exist only in values array */
    EF11("CLOSE_FAILED", "Failed to close given input"),
    /* JADX INFO: Fake field, exist only in values array */
    EF12("NOT_READABLE", "Given file was not opened for read"),
    /* JADX INFO: Fake field, exist only in values array */
    EF0("IMAGE_DEFECT", "Image is defective, decoding aborted"),
    /* JADX INFO: Fake field, exist only in values array */
    EF0("EOF_TOO_SOON", "Image EOF detected before image complete"),
    /* JADX INFO: Fake field, exist only in values array */
    EF0("NO_FRAMES", "No frames found, at least one frame required"),
    /* JADX INFO: Fake field, exist only in values array */
    EF0("INVALID_SCR_DIMS", "Invalid screen size, dimensions must be positive"),
    /* JADX INFO: Fake field, exist only in values array */
    EF0("INVALID_IMG_DIMS", "Invalid image size, dimensions must be positive"),
    /* JADX INFO: Fake field, exist only in values array */
    EF0("IMG_NOT_CONFINED", "Image size exceeds screen size"),
    /* JADX INFO: Fake field, exist only in values array */
    EF0("REWIND_FAILED", "Input source rewind failed, animation stopped"),
    /* JADX INFO: Fake field, exist only in values array */
    EF0("INVALID_BYTE_BUFFER", "Invalid and/or indirect byte buffer specified"),
    f25744c("UNKNOWN", "Unknown error");


    /* renamed from: a, reason: collision with root package name */
    public final String f25746a;

    /* renamed from: b, reason: collision with root package name */
    public int f25747b;

    GifError(String str, String str2) {
        this.f25747b = r2;
        this.f25746a = str2;
    }
}
