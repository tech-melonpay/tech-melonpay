package org.tensorflow.lite.nnapi;

import org.tensorflow.lite.Delegate;
import org.tensorflow.lite.InterpreterFactoryApi;
import org.tensorflow.lite.TensorFlowLite;

/* loaded from: classes3.dex */
public class NnApiDelegate implements Delegate, AutoCloseable {
    private PrivateInterface impl;
    private boolean initialized;
    private Options options;

    public static final class Options {
        public static final int EXECUTION_PREFERENCE_FAST_SINGLE_ANSWER = 1;
        public static final int EXECUTION_PREFERENCE_LOW_POWER = 0;
        public static final int EXECUTION_PREFERENCE_SUSTAINED_SPEED = 2;
        public static final int EXECUTION_PREFERENCE_UNDEFINED = -1;
        private int executionPreference = -1;
        private String acceleratorName = null;
        private String cacheDir = null;
        private String modelToken = null;
        private Integer maxDelegatedPartitions = null;
        private Boolean useNnapiCpu = null;
        private Boolean allowFp16 = null;
        private long nnApiSupportLibraryHandle = 0;

        public String getAcceleratorName() {
            return this.acceleratorName;
        }

        public boolean getAllowFp16() {
            Boolean bool = this.allowFp16;
            return bool != null && bool.booleanValue();
        }

        public String getCacheDir() {
            return this.cacheDir;
        }

        public int getExecutionPreference() {
            return this.executionPreference;
        }

        public int getMaxNumberOfDelegatedPartitions() {
            Integer num = this.maxDelegatedPartitions;
            if (num == null) {
                return -1;
            }
            return num.intValue();
        }

        public String getModelToken() {
            return this.modelToken;
        }

        public long getNnApiSupportLibraryHandle() {
            return this.nnApiSupportLibraryHandle;
        }

        public Boolean getUseNnapiCpu() {
            return this.useNnapiCpu;
        }

        public Options setAcceleratorName(String str) {
            this.acceleratorName = str;
            return this;
        }

        public Options setAllowFp16(boolean z10) {
            this.allowFp16 = Boolean.valueOf(z10);
            return this;
        }

        public Options setCacheDir(String str) {
            this.cacheDir = str;
            return this;
        }

        public Options setExecutionPreference(int i) {
            this.executionPreference = i;
            return this;
        }

        public Options setMaxNumberOfDelegatedPartitions(int i) {
            this.maxDelegatedPartitions = Integer.valueOf(i);
            return this;
        }

        public Options setModelToken(String str) {
            this.modelToken = str;
            return this;
        }

        public Options setNnApiSupportLibraryHandle(long j10) {
            this.nnApiSupportLibraryHandle = j10;
            return this;
        }

        public Options setUseNnapiCpu(boolean z10) {
            this.useNnapiCpu = Boolean.valueOf(z10);
            return this;
        }
    }

    public interface PrivateInterface extends Delegate, AutoCloseable {
        @Override // org.tensorflow.lite.Delegate, java.io.Closeable, java.lang.AutoCloseable
        void close();

        int getNnapiErrno();
    }

    public NnApiDelegate(Options options) {
        TensorFlowLite.init();
        this.options = options;
    }

    private void checkNotClosed() {
        if (this.impl == null) {
            throw new IllegalStateException(this.initialized ? "Should not access delegate after delegate has been closed." : "Should not access delegate before interpreter has been constructed.");
        }
    }

    @Override // org.tensorflow.lite.Delegate, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        PrivateInterface privateInterface = this.impl;
        if (privateInterface != null) {
            privateInterface.close();
            this.impl = null;
        }
    }

    @Override // org.tensorflow.lite.Delegate
    public long getNativeHandle() {
        checkNotClosed();
        return this.impl.getNativeHandle();
    }

    public int getNnapiErrno() {
        if (!this.initialized) {
            return 0;
        }
        checkNotClosed();
        return this.impl.getNnapiErrno();
    }

    public boolean hasErrors() {
        return getNnapiErrno() != 0;
    }

    public void initWithInterpreterFactoryApi(InterpreterFactoryApi interpreterFactoryApi) {
        this.impl = interpreterFactoryApi.createNnApiDelegateImpl(this.options);
        this.initialized = true;
    }

    public NnApiDelegate() {
        this(new Options());
    }
}
