package net.sf.scuba.smartcards;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public class CardFileInputStream extends InputStream {
    private static final Logger LOGGER = Logger.getLogger("net.sf.scuba");
    private final byte[] buffer;
    private int bufferLength;
    private int fileLength;
    private FileSystemStructured fs;
    private int markedOffset;
    private int offsetBufferInFile;
    private int offsetInBuffer;
    private FileInfo[] path;

    public CardFileInputStream(int i, FileSystemStructured fileSystemStructured) {
        this.fs = fileSystemStructured;
        synchronized (fileSystemStructured) {
            try {
                FileInfo[] selectedPath = fileSystemStructured.getSelectedPath();
                if (selectedPath == null || selectedPath.length < 1) {
                    throw new CardServiceException("No valid file selected, path = " + Arrays.toString(selectedPath));
                }
                FileInfo[] fileInfoArr = new FileInfo[selectedPath.length];
                this.path = fileInfoArr;
                System.arraycopy(selectedPath, 0, fileInfoArr, 0, selectedPath.length);
                this.fileLength = selectedPath[selectedPath.length - 1].getFileLength();
                this.buffer = new byte[i];
                this.bufferLength = 0;
                this.offsetBufferInFile = 0;
                this.offsetInBuffer = 0;
                this.markedOffset = -1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private int fillBufferFromFile(FileInfo[] fileInfoArr, int i, int i9) {
        synchronized (this.fs) {
            try {
                if (i9 > this.buffer.length) {
                    throw new IllegalArgumentException("length too big");
                }
                if (!Arrays.equals(this.fs.getSelectedPath(), fileInfoArr)) {
                    for (FileInfo fileInfo : fileInfoArr) {
                        this.fs.selectFile(fileInfo.getFID());
                    }
                }
                byte[] readBinary = this.fs.readBinary(i, i9);
                if (readBinary == null) {
                    return 0;
                }
                System.arraycopy(readBinary, 0, this.buffer, 0, readBinary.length);
                return readBinary.length;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.InputStream
    public synchronized int available() {
        return this.bufferLength - this.offsetInBuffer;
    }

    public int getLength() {
        return this.fileLength;
    }

    public int getPostion() {
        return this.offsetBufferInFile + this.offsetInBuffer;
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        synchronized (this.fs) {
            this.markedOffset = this.offsetBufferInFile + this.offsetInBuffer;
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        synchronized (this.fs) {
        }
        return true;
    }

    @Override // java.io.InputStream
    public int read() {
        synchronized (this.fs) {
            try {
                if (!Arrays.equals(this.path, this.fs.getSelectedPath())) {
                    for (FileInfo fileInfo : this.path) {
                        this.fs.selectFile(fileInfo.getFID());
                    }
                }
                int i = this.offsetBufferInFile;
                int i9 = this.offsetInBuffer;
                int i10 = i + i9;
                int i11 = this.fileLength;
                if (i10 >= i11) {
                    return -1;
                }
                if (i9 >= this.bufferLength) {
                    int min = Math.min(this.buffer.length, i11 - i10);
                    try {
                        int i12 = this.offsetBufferInFile + this.bufferLength;
                        int i13 = 0;
                        while (i13 == 0) {
                            i13 = fillBufferFromFile(this.path, i12, min);
                        }
                        this.offsetBufferInFile = i12;
                        this.offsetInBuffer = 0;
                        this.bufferLength = i13;
                    } catch (CardServiceException e10) {
                        throw new IOException("Unexpected exception", e10);
                    } catch (Exception e11) {
                        throw new IOException("Unexpected exception", e11);
                    }
                }
                byte[] bArr = this.buffer;
                int i14 = this.offsetInBuffer;
                int i15 = bArr[i14] & 255;
                this.offsetInBuffer = i14 + 1;
                return i15;
            } catch (CardServiceException e12) {
                throw new IOException("Unexpected exception", e12);
            }
        }
    }

    @Override // java.io.InputStream
    public void reset() {
        synchronized (this.fs) {
            try {
                int i = this.markedOffset;
                if (i < 0) {
                    throw new IOException("Mark not set");
                }
                this.offsetBufferInFile = i;
                this.offsetInBuffer = 0;
                this.bufferLength = 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.InputStream
    public long skip(long j10) {
        synchronized (this.fs) {
            try {
                int i = this.bufferLength;
                int i9 = this.offsetInBuffer;
                if (j10 < i - i9) {
                    this.offsetInBuffer = (int) (i9 + j10);
                } else {
                    this.offsetBufferInFile = (int) (this.offsetBufferInFile + i9 + j10);
                    this.offsetInBuffer = 0;
                    this.bufferLength = 0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return j10;
    }
}
