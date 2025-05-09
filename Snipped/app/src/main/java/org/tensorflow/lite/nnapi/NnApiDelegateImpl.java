package org.tensorflow.lite.nnapi;

import org.tensorflow.lite.Delegate;
import org.tensorflow.lite.TensorFlowLite;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* loaded from: classes3.dex */
public class NnApiDelegateImpl implements NnApiDelegate.PrivateInterface, Delegate, AutoCloseable {
    private static final long INVALID_DELEGATE_HANDLE = 0;
    private long delegateHandle;

    public NnApiDelegateImpl(NnApiDelegate.Options options) {
        TensorFlowLite.init();
        this.delegateHandle = createDelegate(options.getExecutionPreference(), options.getAcceleratorName(), options.getCacheDir(), options.getModelToken(), options.getMaxNumberOfDelegatedPartitions(), options.getUseNnapiCpu() != null, options.getUseNnapiCpu() == null || !options.getUseNnapiCpu().booleanValue(), options.getAllowFp16(), options.getNnApiSupportLibraryHandle());
    }

    private void checkNotClosed() {
        if (this.delegateHandle == 0) {
            throw new IllegalStateException("Should not access delegate after it has been closed.");
        }
    }

    private static native long createDelegate(int i, String str, String str2, String str3, int i9, boolean z10, boolean z11, boolean z12, long j10);

    private static native void deleteDelegate(long j10);

    private static native int getNnapiErrno(long j10);

    @Override // org.tensorflow.lite.nnapi.NnApiDelegate.PrivateInterface, org.tensorflow.lite.Delegate, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j10 = this.delegateHandle;
        if (j10 != 0) {
            deleteDelegate(j10);
            this.delegateHandle = 0L;
        }
    }

    @Override // org.tensorflow.lite.Delegate
    public long getNativeHandle() {
        return this.delegateHandle;
    }

    @Override // org.tensorflow.lite.nnapi.NnApiDelegate.PrivateInterface
    public int getNnapiErrno() {
        checkNotClosed();
        return getNnapiErrno(this.delegateHandle);
    }
}
