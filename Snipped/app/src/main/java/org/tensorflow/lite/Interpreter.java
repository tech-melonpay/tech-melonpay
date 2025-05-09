package org.tensorflow.lite;

import java.io.File;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Map;
import org.tensorflow.lite.InterpreterApi;
import org.tensorflow.lite.InterpreterImpl;

/* loaded from: classes3.dex */
public final class Interpreter extends InterpreterImpl implements InterpreterApi {
    private final String[] signatureKeyList;
    private final NativeInterpreterWrapperExperimental wrapperExperimental;

    public static class Options extends InterpreterImpl.Options {
        public Options() {
        }

        public Options setAllowBufferHandleOutput(boolean z10) {
            this.allowBufferHandleOutput = Boolean.valueOf(z10);
            return this;
        }

        @Deprecated
        public Options setAllowFp16PrecisionForFp32(boolean z10) {
            this.allowFp16PrecisionForFp32 = Boolean.valueOf(z10);
            return this;
        }

        public Options(InterpreterApi.Options options) {
            super(options);
        }

        @Override // org.tensorflow.lite.InterpreterApi.Options
        public Options addDelegate(Delegate delegate) {
            super.addDelegate(delegate);
            return this;
        }

        @Override // org.tensorflow.lite.InterpreterApi.Options
        public Options addDelegateFactory(DelegateFactory delegateFactory) {
            super.addDelegateFactory(delegateFactory);
            return this;
        }

        @Override // org.tensorflow.lite.InterpreterApi.Options
        public Options setCancellable(boolean z10) {
            super.setCancellable(z10);
            return this;
        }

        @Override // org.tensorflow.lite.InterpreterApi.Options
        public Options setNumThreads(int i) {
            super.setNumThreads(i);
            return this;
        }

        @Override // org.tensorflow.lite.InterpreterApi.Options
        public Options setRuntime(InterpreterApi.Options.TfLiteRuntime tfLiteRuntime) {
            super.setRuntime(tfLiteRuntime);
            return this;
        }

        @Override // org.tensorflow.lite.InterpreterApi.Options
        public Options setUseNNAPI(boolean z10) {
            super.setUseNNAPI(z10);
            return this;
        }

        @Override // org.tensorflow.lite.InterpreterApi.Options
        public Options setUseXNNPACK(boolean z10) {
            super.setUseXNNPACK(z10);
            return this;
        }

        public Options(InterpreterImpl.Options options) {
            super(options);
        }
    }

    public Interpreter(File file) {
        this(file, (Options) null);
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public /* bridge */ /* synthetic */ void allocateTensors() {
        super.allocateTensors();
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi, java.lang.AutoCloseable
    public /* bridge */ /* synthetic */ void close() {
        super.close();
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public /* bridge */ /* synthetic */ int getInputIndex(String str) {
        return super.getInputIndex(str);
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public /* bridge */ /* synthetic */ Tensor getInputTensor(int i) {
        return super.getInputTensor(i);
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public /* bridge */ /* synthetic */ int getInputTensorCount() {
        return super.getInputTensorCount();
    }

    public Tensor getInputTensorFromSignature(String str, String str2) {
        checkNotClosed();
        if (str2 == null) {
            String[] strArr = this.signatureKeyList;
            if (strArr.length == 1) {
                str2 = strArr[0];
            }
        }
        if (str2 != null) {
            return this.wrapper.getInputTensor(str, str2);
        }
        throw new IllegalArgumentException("Input error: SignatureDef signatureKey should not be null. null is only allowed if the model has a single Signature. Available Signatures: " + Arrays.toString(this.signatureKeyList));
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public /* bridge */ /* synthetic */ Long getLastNativeInferenceDurationNanoseconds() {
        return super.getLastNativeInferenceDurationNanoseconds();
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public /* bridge */ /* synthetic */ int getOutputIndex(String str) {
        return super.getOutputIndex(str);
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public /* bridge */ /* synthetic */ Tensor getOutputTensor(int i) {
        return super.getOutputTensor(i);
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public /* bridge */ /* synthetic */ int getOutputTensorCount() {
        return super.getOutputTensorCount();
    }

    public Tensor getOutputTensorFromSignature(String str, String str2) {
        checkNotClosed();
        if (str2 == null) {
            String[] strArr = this.signatureKeyList;
            if (strArr.length == 1) {
                str2 = strArr[0];
            }
        }
        if (str2 != null) {
            return this.wrapper.getOutputTensor(str, str2);
        }
        throw new IllegalArgumentException("Input error: SignatureDef signatureKey should not be null. null is only allowed if the model has a single Signature. Available Signatures: " + Arrays.toString(this.signatureKeyList));
    }

    public String[] getSignatureInputs(String str) {
        checkNotClosed();
        return this.wrapper.getSignatureInputs(str);
    }

    public String[] getSignatureKeys() {
        checkNotClosed();
        return this.wrapper.getSignatureKeys();
    }

    public String[] getSignatureOutputs(String str) {
        checkNotClosed();
        return this.wrapper.getSignatureOutputs(str);
    }

    public void resetVariableTensors() {
        checkNotClosed();
        this.wrapperExperimental.resetVariableTensors();
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public /* bridge */ /* synthetic */ void resizeInput(int i, int[] iArr) {
        super.resizeInput(i, iArr);
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public /* bridge */ /* synthetic */ void run(Object obj, Object obj2) {
        super.run(obj, obj2);
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public /* bridge */ /* synthetic */ void runForMultipleInputsOutputs(Object[] objArr, Map map) {
        super.runForMultipleInputsOutputs(objArr, map);
    }

    public void runSignature(Map<String, Object> map, Map<String, Object> map2, String str) {
        checkNotClosed();
        if (str == null) {
            String[] strArr = this.signatureKeyList;
            if (strArr.length == 1) {
                str = strArr[0];
            }
        }
        if (str != null) {
            this.wrapper.runSignature(map, map2, str);
        } else {
            throw new IllegalArgumentException("Input error: SignatureDef signatureKey should not be null. null is only allowed if the model has a single Signature. Available Signatures: " + Arrays.toString(this.signatureKeyList));
        }
    }

    public void setCancelled(boolean z10) {
        this.wrapper.setCancelled(z10);
    }

    public Interpreter(File file, Options options) {
        this(new NativeInterpreterWrapperExperimental(file.getAbsolutePath(), options));
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public /* bridge */ /* synthetic */ void resizeInput(int i, int[] iArr, boolean z10) {
        super.resizeInput(i, iArr, z10);
    }

    public Interpreter(ByteBuffer byteBuffer) {
        this(byteBuffer, (Options) null);
    }

    public Interpreter(ByteBuffer byteBuffer, Options options) {
        this(new NativeInterpreterWrapperExperimental(byteBuffer, options));
    }

    private Interpreter(NativeInterpreterWrapperExperimental nativeInterpreterWrapperExperimental) {
        super(nativeInterpreterWrapperExperimental);
        this.wrapperExperimental = nativeInterpreterWrapperExperimental;
        this.signatureKeyList = getSignatureKeys();
    }

    public void runSignature(Map<String, Object> map, Map<String, Object> map2) {
        checkNotClosed();
        runSignature(map, map2, null);
    }
}
