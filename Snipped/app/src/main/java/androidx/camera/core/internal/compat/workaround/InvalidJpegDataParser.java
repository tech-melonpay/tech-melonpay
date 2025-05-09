package androidx.camera.core.internal.compat.workaround;

import androidx.camera.core.internal.compat.quirk.DeviceQuirks;
import androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk;

/* loaded from: classes.dex */
public class InvalidJpegDataParser {
    private final boolean mHasQuirk;

    public InvalidJpegDataParser() {
        this.mHasQuirk = DeviceQuirks.get(LargeJpegImageQuirk.class) != null;
    }

    public int getValidDataLength(byte[] bArr) {
        byte b9;
        if (!this.mHasQuirk) {
            return bArr.length;
        }
        int i = 2;
        while (i + 4 <= bArr.length && (b9 = bArr[i]) == -1) {
            int i9 = i + 2;
            int i10 = ((bArr[i9] & 255) << 8) | (bArr[i + 3] & 255);
            if (b9 == -1 && bArr[i + 1] == -38) {
                while (true) {
                    int i11 = i9 + 2;
                    if (i11 > bArr.length) {
                        return bArr.length;
                    }
                    if (bArr[i9] == -1 && bArr[i9 + 1] == -39) {
                        return i11;
                    }
                    i9++;
                }
            } else {
                i += i10 + 2;
            }
        }
        return bArr.length;
    }
}
