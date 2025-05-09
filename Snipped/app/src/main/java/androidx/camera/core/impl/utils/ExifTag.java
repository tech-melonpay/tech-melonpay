package androidx.camera.core.impl.utils;

/* loaded from: classes.dex */
class ExifTag {
    public final String name;
    public final int number;
    public final int primaryFormat;
    public final int secondaryFormat;

    public ExifTag(String str, int i, int i9) {
        this.name = str;
        this.number = i;
        this.primaryFormat = i9;
        this.secondaryFormat = -1;
    }

    public boolean isFormatCompatible(int i) {
        int i9;
        int i10 = this.primaryFormat;
        if (i10 == 7 || i == 7 || i10 == i || (i9 = this.secondaryFormat) == i) {
            return true;
        }
        if ((i10 == 4 || i9 == 4) && i == 3) {
            return true;
        }
        if ((i10 == 9 || i9 == 9) && i == 8) {
            return true;
        }
        return (i10 == 12 || i9 == 12) && i == 11;
    }

    public ExifTag(String str, int i, int i9, int i10) {
        this.name = str;
        this.number = i;
        this.primaryFormat = i9;
        this.secondaryFormat = i10;
    }
}
