package com.google.android.gms.common.data;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
@ShowFirstParty
@KeepForSdk
@SafeParcelable.Class(creator = "BitmapTeleporterCreator")
/* loaded from: classes.dex */
public class BitmapTeleporter extends AbstractSafeParcelable implements ReflectedParcelable {

    @KeepForSdk
    public static final Parcelable.Creator<BitmapTeleporter> CREATOR = new zaa();

    @SafeParcelable.VersionField(id = 1)
    final int zaa;

    @SafeParcelable.Field(id = 2)
    ParcelFileDescriptor zab;

    @SafeParcelable.Field(id = 3)
    final int zac;
    private Bitmap zad;
    private boolean zae;
    private File zaf;

    @SafeParcelable.Constructor
    public BitmapTeleporter(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) ParcelFileDescriptor parcelFileDescriptor, @SafeParcelable.Param(id = 3) int i9) {
        this.zaa = i;
        this.zab = parcelFileDescriptor;
        this.zac = i9;
        this.zad = null;
        this.zae = false;
    }

    private static final void zaa(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e10) {
            Log.w("BitmapTeleporter", "Could not close stream", e10);
        }
    }

    @KeepForSdk
    public Bitmap get() {
        if (!this.zae) {
            DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream((ParcelFileDescriptor) Preconditions.checkNotNull(this.zab)));
            try {
                try {
                    byte[] bArr = new byte[dataInputStream.readInt()];
                    int readInt = dataInputStream.readInt();
                    int readInt2 = dataInputStream.readInt();
                    Bitmap.Config valueOf = Bitmap.Config.valueOf(dataInputStream.readUTF());
                    dataInputStream.read(bArr);
                    zaa(dataInputStream);
                    ByteBuffer wrap = ByteBuffer.wrap(bArr);
                    Bitmap createBitmap = Bitmap.createBitmap(readInt, readInt2, valueOf);
                    createBitmap.copyPixelsFromBuffer(wrap);
                    this.zad = createBitmap;
                    this.zae = true;
                } catch (IOException e10) {
                    throw new IllegalStateException("Could not read from parcel file descriptor", e10);
                }
            } catch (Throwable th) {
                zaa(dataInputStream);
                throw th;
            }
        }
        return this.zad;
    }

    @KeepForSdk
    public void release() {
        if (this.zae) {
            return;
        }
        try {
            ((ParcelFileDescriptor) Preconditions.checkNotNull(this.zab)).close();
        } catch (IOException e10) {
            Log.w("BitmapTeleporter", "Could not close PFD", e10);
        }
    }

    @KeepForSdk
    public void setTempDir(File file) {
        if (file == null) {
            throw new NullPointerException("Cannot set null temp directory");
        }
        this.zaf = file;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (this.zab == null) {
            Bitmap bitmap = (Bitmap) Preconditions.checkNotNull(this.zad);
            ByteBuffer allocate = ByteBuffer.allocate(bitmap.getHeight() * bitmap.getRowBytes());
            bitmap.copyPixelsToBuffer(allocate);
            byte[] array = allocate.array();
            File file = this.zaf;
            if (file == null) {
                throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel");
            }
            try {
                File createTempFile = File.createTempFile("teleporter", ".tmp", file);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                    this.zab = ParcelFileDescriptor.open(createTempFile, 268435456);
                    createTempFile.delete();
                    DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(fileOutputStream));
                    try {
                        try {
                            dataOutputStream.writeInt(array.length);
                            dataOutputStream.writeInt(bitmap.getWidth());
                            dataOutputStream.writeInt(bitmap.getHeight());
                            dataOutputStream.writeUTF(bitmap.getConfig().toString());
                            dataOutputStream.write(array);
                        } catch (IOException e10) {
                            throw new IllegalStateException("Could not write into unlinked file", e10);
                        }
                    } finally {
                        zaa(dataOutputStream);
                    }
                } catch (FileNotFoundException unused) {
                    throw new IllegalStateException("Temporary file is somehow already deleted");
                }
            } catch (IOException e11) {
                throw new IllegalStateException("Could not create temporary file", e11);
            }
        }
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zaa);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zab, i | 1, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zac);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        this.zab = null;
    }

    @KeepForSdk
    public BitmapTeleporter(Bitmap bitmap) {
        this.zaa = 1;
        this.zab = null;
        this.zac = 0;
        this.zad = bitmap;
        this.zae = true;
    }
}
