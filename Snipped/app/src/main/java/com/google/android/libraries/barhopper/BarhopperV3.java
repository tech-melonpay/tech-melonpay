package com.google.android.libraries.barhopper;

import G3.a;
import android.graphics.Bitmap;
import android.util.Log;
import androidx.camera.core.n;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdj;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdo;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeo;
import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: com.google.mlkit:barcode-scanning@@17.1.0 */
/* loaded from: classes.dex */
public class BarhopperV3 implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public long f8972a;

    public BarhopperV3() {
        System.loadLibrary("barhopper_v3");
    }

    private native void closeNative(long j10);

    private native long createNativeWithClientOptions(byte[] bArr);

    private native byte[] recognizeBitmapNative(long j10, Bitmap bitmap, RecognitionOptions recognitionOptions);

    private native byte[] recognizeBufferNative(long j10, int i, int i9, ByteBuffer byteBuffer, RecognitionOptions recognitionOptions);

    private native byte[] recognizeNative(long j10, int i, int i9, byte[] bArr, RecognitionOptions recognitionOptions);

    public static a y(byte[] bArr) {
        bArr.getClass();
        try {
            return a.a(bArr, zzdo.zza());
        } catch (zzeo e10) {
            throw new IllegalStateException("Received unexpected BarhopperResponse buffer: {0}", e10);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j10 = this.f8972a;
        if (j10 != 0) {
            closeNative(j10);
            this.f8972a = 0L;
        }
    }

    public final void d(Z2.a aVar) {
        if (this.f8972a != 0) {
            Log.w("BarhopperV3", "Native context already exists.");
            return;
        }
        try {
            int zzE = aVar.zzE();
            byte[] bArr = new byte[zzE];
            zzdj zzA = zzdj.zzA(bArr, 0, zzE);
            aVar.zzaa(zzA);
            zzA.zzB();
            long createNativeWithClientOptions = createNativeWithClientOptions(bArr);
            this.f8972a = createNativeWithClientOptions;
            if (createNativeWithClientOptions == 0) {
                throw new IllegalArgumentException("Failed to create native context with client options.");
            }
        } catch (IOException e10) {
            throw new RuntimeException(n.a("Serializing ", aVar.getClass().getName(), " to a byte array threw an IOException (should never happen)."), e10);
        }
    }

    public final a i(int i, int i9, ByteBuffer byteBuffer, RecognitionOptions recognitionOptions) {
        long j10 = this.f8972a;
        if (j10 != 0) {
            return y(recognizeBufferNative(j10, i, i9, byteBuffer, recognitionOptions));
        }
        throw new IllegalStateException("Native context does not exist.");
    }

    public final a j(int i, int i9, byte[] bArr, RecognitionOptions recognitionOptions) {
        long j10 = this.f8972a;
        if (j10 != 0) {
            return y(recognizeNative(j10, i, i9, bArr, recognitionOptions));
        }
        throw new IllegalStateException("Native context does not exist.");
    }

    public final a p(Bitmap bitmap, RecognitionOptions recognitionOptions) {
        if (this.f8972a == 0) {
            throw new IllegalStateException("Native context does not exist.");
        }
        Bitmap.Config config = bitmap.getConfig();
        Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
        if (config != config2) {
            Log.d("BarhopperV3", "Input bitmap config is not ARGB_8888. Converting it to ARGB_8888 from ".concat(String.valueOf(bitmap.getConfig())));
            bitmap = bitmap.copy(config2, bitmap.isMutable());
        }
        return y(recognizeBitmapNative(this.f8972a, bitmap, recognitionOptions));
    }
}
