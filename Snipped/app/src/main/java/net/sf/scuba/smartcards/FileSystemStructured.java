package net.sf.scuba.smartcards;

/* loaded from: classes2.dex */
public interface FileSystemStructured {
    FileInfo[] getSelectedPath();

    byte[] readBinary(int i, int i9);

    void selectFile(short s10);
}
