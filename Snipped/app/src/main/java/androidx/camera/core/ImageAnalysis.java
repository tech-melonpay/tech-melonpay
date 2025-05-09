package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Pair;
import android.util.Size;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ConfigProvider;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.ImageAnalysisConfig;
import androidx.camera.core.impl.ImageInputConfig;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.ImmediateSurface;
import androidx.camera.core.impl.MutableConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.internal.TargetConfig;
import androidx.camera.core.internal.ThreadConfig;
import androidx.camera.core.internal.UseCaseEventConfig;
import androidx.camera.core.internal.compat.quirk.OnePixelShiftQuirk;
import androidx.camera.core.internal.utils.SizeUtil;
import androidx.camera.core.resolutionselector.AspectRatioStrategy;
import androidx.camera.core.resolutionselector.ResolutionSelector;
import androidx.camera.core.resolutionselector.ResolutionStrategy;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;
import org.bouncycastle.tls.CipherSuite;

/* loaded from: classes.dex */
public final class ImageAnalysis extends UseCase {
    public static final int COORDINATE_SYSTEM_ORIGINAL = 0;
    private static final int DEFAULT_BACKPRESSURE_STRATEGY = 0;
    private static final int DEFAULT_IMAGE_QUEUE_DEPTH = 6;
    private static final int DEFAULT_OUTPUT_IMAGE_FORMAT = 1;
    private static final boolean DEFAULT_OUTPUT_IMAGE_ROTATION_ENABLED = false;
    private static final int NON_BLOCKING_IMAGE_DEPTH = 4;
    public static final int OUTPUT_IMAGE_FORMAT_RGBA_8888 = 2;
    public static final int OUTPUT_IMAGE_FORMAT_YUV_420_888 = 1;
    public static final int STRATEGY_BLOCK_PRODUCER = 1;
    public static final int STRATEGY_KEEP_ONLY_LATEST = 0;
    private static final String TAG = "ImageAnalysis";
    private final Object mAnalysisLock;
    private DeferrableSurface mDeferrableSurface;
    final ImageAnalysisAbstractAnalyzer mImageAnalysisAbstractAnalyzer;
    SessionConfig.Builder mSessionConfigBuilder;
    private Analyzer mSubscribedAnalyzer;
    public static final Defaults DEFAULT_CONFIG = new Defaults();
    private static final Boolean DEFAULT_ONE_PIXEL_SHIFT_ENABLED = null;

    @Retention(RetentionPolicy.SOURCE)
    public @interface BackpressureStrategy {
    }

    public static final class Builder implements ImageOutputConfig.Builder<Builder>, ThreadConfig.Builder<Builder>, UseCaseConfig.Builder<ImageAnalysis, ImageAnalysisConfig, Builder>, ImageInputConfig.Builder<Builder> {
        private final MutableOptionsBundle mMutableConfig;

        public Builder() {
            this(MutableOptionsBundle.create());
        }

        public static Builder fromConfig(Config config) {
            return new Builder(MutableOptionsBundle.from(config));
        }

        @Override // androidx.camera.core.ExtendableBuilder
        public MutableConfig getMutableConfig() {
            return this.mMutableConfig;
        }

        public Builder setBackpressureStrategy(int i) {
            getMutableConfig().insertOption(ImageAnalysisConfig.OPTION_BACKPRESSURE_STRATEGY, Integer.valueOf(i));
            return this;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public /* bridge */ /* synthetic */ Builder setCustomOrderedResolutions(List list) {
            return setCustomOrderedResolutions((List<Size>) list);
        }

        public Builder setImageQueueDepth(int i) {
            getMutableConfig().insertOption(ImageAnalysisConfig.OPTION_IMAGE_QUEUE_DEPTH, Integer.valueOf(i));
            return this;
        }

        public Builder setImageReaderProxyProvider(ImageReaderProxyProvider imageReaderProxyProvider) {
            getMutableConfig().insertOption(ImageAnalysisConfig.OPTION_IMAGE_READER_PROXY_PROVIDER, imageReaderProxyProvider);
            return this;
        }

        public Builder setOnePixelShiftEnabled(boolean z10) {
            getMutableConfig().insertOption(ImageAnalysisConfig.OPTION_ONE_PIXEL_SHIFT_ENABLED, Boolean.valueOf(z10));
            return this;
        }

        public Builder setOutputImageFormat(int i) {
            getMutableConfig().insertOption(ImageAnalysisConfig.OPTION_OUTPUT_IMAGE_FORMAT, Integer.valueOf(i));
            return this;
        }

        public Builder setOutputImageRotationEnabled(boolean z10) {
            getMutableConfig().insertOption(ImageAnalysisConfig.OPTION_OUTPUT_IMAGE_ROTATION_ENABLED, Boolean.valueOf(z10));
            return this;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public /* bridge */ /* synthetic */ Builder setSupportedResolutions(List list) {
            return setSupportedResolutions((List<Pair<Integer, Size[]>>) list);
        }

        @Override // androidx.camera.core.internal.TargetConfig.Builder
        public /* bridge */ /* synthetic */ Object setTargetClass(Class cls) {
            return setTargetClass((Class<ImageAnalysis>) cls);
        }

        private Builder(MutableOptionsBundle mutableOptionsBundle) {
            this.mMutableConfig = mutableOptionsBundle;
            Class cls = (Class) mutableOptionsBundle.retrieveOption(TargetConfig.OPTION_TARGET_CLASS, null);
            if (cls == null || cls.equals(ImageAnalysis.class)) {
                setTargetClass(ImageAnalysis.class);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }

        public static Builder fromConfig(ImageAnalysisConfig imageAnalysisConfig) {
            return new Builder(MutableOptionsBundle.from((Config) imageAnalysisConfig));
        }

        @Override // androidx.camera.core.ExtendableBuilder
        public ImageAnalysis build() {
            ImageAnalysisConfig useCaseConfig = getUseCaseConfig();
            ImageOutputConfig.validateConfig(useCaseConfig);
            return new ImageAnalysis(useCaseConfig);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public ImageAnalysisConfig getUseCaseConfig() {
            return new ImageAnalysisConfig(OptionsBundle.from(this.mMutableConfig));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.internal.ThreadConfig.Builder
        public Builder setBackgroundExecutor(Executor executor) {
            getMutableConfig().insertOption(ThreadConfig.OPTION_BACKGROUND_EXECUTOR, executor);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public Builder setCameraSelector(CameraSelector cameraSelector) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_CAMERA_SELECTOR, cameraSelector);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public Builder setCaptureOptionUnpacker(CaptureConfig.OptionUnpacker optionUnpacker) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_CAPTURE_CONFIG_UNPACKER, optionUnpacker);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public Builder setCaptureType(UseCaseConfigFactory.CaptureType captureType) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_CAPTURE_TYPE, captureType);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public Builder setCustomOrderedResolutions(List<Size> list) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_CUSTOM_ORDERED_RESOLUTIONS, list);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public Builder setDefaultCaptureConfig(CaptureConfig captureConfig) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_DEFAULT_CAPTURE_CONFIG, captureConfig);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public Builder setDefaultResolution(Size size) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_DEFAULT_RESOLUTION, size);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public Builder setDefaultSessionConfig(SessionConfig sessionConfig) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_DEFAULT_SESSION_CONFIG, sessionConfig);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageInputConfig.Builder
        public Builder setDynamicRange(DynamicRange dynamicRange) {
            if (!Objects.equals(DynamicRange.SDR, dynamicRange)) {
                throw new UnsupportedOperationException("ImageAnalysis currently only supports SDR");
            }
            getMutableConfig().insertOption(ImageInputConfig.OPTION_INPUT_DYNAMIC_RANGE, dynamicRange);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public Builder setHighResolutionDisabled(boolean z10) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_HIGH_RESOLUTION_DISABLED, Boolean.valueOf(z10));
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public Builder setMaxResolution(Size size) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_MAX_RESOLUTION, size);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public Builder setMirrorMode(int i) {
            throw new UnsupportedOperationException("setMirrorMode is not supported.");
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public Builder setResolutionSelector(ResolutionSelector resolutionSelector) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_RESOLUTION_SELECTOR, resolutionSelector);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public Builder setSessionOptionUnpacker(SessionConfig.OptionUnpacker optionUnpacker) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_SESSION_CONFIG_UNPACKER, optionUnpacker);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public Builder setSupportedResolutions(List<Pair<Integer, Size[]>> list) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_SUPPORTED_RESOLUTIONS, list);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public Builder setSurfaceOccupancyPriority(int i) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_SURFACE_OCCUPANCY_PRIORITY, Integer.valueOf(i));
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @Deprecated
        public Builder setTargetAspectRatio(int i) {
            if (i == -1) {
                i = 0;
            }
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_TARGET_ASPECT_RATIO, Integer.valueOf(i));
            return this;
        }

        @Override // androidx.camera.core.internal.TargetConfig.Builder
        public Builder setTargetClass(Class<ImageAnalysis> cls) {
            getMutableConfig().insertOption(TargetConfig.OPTION_TARGET_CLASS, cls);
            if (getMutableConfig().retrieveOption(TargetConfig.OPTION_TARGET_NAME, null) == null) {
                setTargetName(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        @Override // androidx.camera.core.internal.TargetConfig.Builder
        public Builder setTargetName(String str) {
            getMutableConfig().insertOption(TargetConfig.OPTION_TARGET_NAME, str);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @Deprecated
        public Builder setTargetResolution(Size size) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_TARGET_RESOLUTION, size);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public Builder setTargetRotation(int i) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_TARGET_ROTATION, Integer.valueOf(i));
            return this;
        }

        @Override // androidx.camera.core.internal.UseCaseEventConfig.Builder
        public Builder setUseCaseEventCallback(UseCase.EventCallback eventCallback) {
            getMutableConfig().insertOption(UseCaseEventConfig.OPTION_USE_CASE_EVENT_CALLBACK, eventCallback);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public Builder setZslDisabled(boolean z10) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_ZSL_DISABLED, Boolean.valueOf(z10));
            return this;
        }
    }

    public static final class Defaults implements ConfigProvider<ImageAnalysisConfig> {
        private static final int DEFAULT_ASPECT_RATIO = 0;
        private static final ImageAnalysisConfig DEFAULT_CONFIG;
        private static final DynamicRange DEFAULT_DYNAMIC_RANGE;
        private static final ResolutionSelector DEFAULT_RESOLUTION_SELECTOR;
        private static final int DEFAULT_SURFACE_OCCUPANCY_PRIORITY = 1;
        private static final Size DEFAULT_TARGET_RESOLUTION;

        static {
            Size size = new Size(640, 480);
            DEFAULT_TARGET_RESOLUTION = size;
            DynamicRange dynamicRange = DynamicRange.SDR;
            DEFAULT_DYNAMIC_RANGE = dynamicRange;
            ResolutionSelector build = new ResolutionSelector.Builder().setAspectRatioStrategy(AspectRatioStrategy.RATIO_4_3_FALLBACK_AUTO_STRATEGY).setResolutionStrategy(new ResolutionStrategy(SizeUtil.RESOLUTION_VGA, 1)).build();
            DEFAULT_RESOLUTION_SELECTOR = build;
            DEFAULT_CONFIG = new Builder().setDefaultResolution(size).setSurfaceOccupancyPriority(1).setTargetAspectRatio(0).setResolutionSelector(build).setCaptureType(UseCaseConfigFactory.CaptureType.IMAGE_ANALYSIS).setDynamicRange(dynamicRange).getUseCaseConfig();
        }

        @Override // androidx.camera.core.impl.ConfigProvider
        public ImageAnalysisConfig getConfig() {
            return DEFAULT_CONFIG;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface OutputImageFormat {
    }

    public ImageAnalysis(ImageAnalysisConfig imageAnalysisConfig) {
        super(imageAnalysisConfig);
        this.mAnalysisLock = new Object();
        if (((ImageAnalysisConfig) getCurrentConfig()).getBackpressureStrategy(0) == 1) {
            this.mImageAnalysisAbstractAnalyzer = new ImageAnalysisBlockingAnalyzer();
        } else {
            this.mImageAnalysisAbstractAnalyzer = new ImageAnalysisNonBlockingAnalyzer(imageAnalysisConfig.getBackgroundExecutor(CameraXExecutors.highPriorityExecutor()));
        }
        this.mImageAnalysisAbstractAnalyzer.setOutputImageFormat(getOutputImageFormat());
        this.mImageAnalysisAbstractAnalyzer.setOutputImageRotationEnabled(isOutputImageRotationEnabled());
    }

    private boolean isFlipWH(CameraInternal cameraInternal) {
        return isOutputImageRotationEnabled() && getRelativeRotation(cameraInternal) % CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256 != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createPipeline$0(SafeCloseImageReaderProxy safeCloseImageReaderProxy, SafeCloseImageReaderProxy safeCloseImageReaderProxy2) {
        safeCloseImageReaderProxy.safeClose();
        if (safeCloseImageReaderProxy2 != null) {
            safeCloseImageReaderProxy2.safeClose();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createPipeline$1(String str, ImageAnalysisConfig imageAnalysisConfig, StreamSpec streamSpec, SessionConfig sessionConfig, SessionConfig.SessionError sessionError) {
        clearPipeline();
        this.mImageAnalysisAbstractAnalyzer.clearCache();
        if (isCurrentCamera(str)) {
            updateSessionConfig(createPipeline(str, imageAnalysisConfig, streamSpec).build());
            notifyReset();
        }
    }

    private void tryUpdateRelativeRotation() {
        CameraInternal camera = getCamera();
        if (camera != null) {
            this.mImageAnalysisAbstractAnalyzer.setRelativeRotation(getRelativeRotation(camera));
        }
    }

    public void clearAnalyzer() {
        synchronized (this.mAnalysisLock) {
            try {
                this.mImageAnalysisAbstractAnalyzer.setAnalyzer(null, null);
                if (this.mSubscribedAnalyzer != null) {
                    notifyInactive();
                }
                this.mSubscribedAnalyzer = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void clearPipeline() {
        Threads.checkMainThread();
        DeferrableSurface deferrableSurface = this.mDeferrableSurface;
        if (deferrableSurface != null) {
            deferrableSurface.close();
            this.mDeferrableSurface = null;
        }
    }

    public SessionConfig.Builder createPipeline(String str, ImageAnalysisConfig imageAnalysisConfig, StreamSpec streamSpec) {
        Threads.checkMainThread();
        Size resolution = streamSpec.getResolution();
        Executor backgroundExecutor = imageAnalysisConfig.getBackgroundExecutor(CameraXExecutors.highPriorityExecutor());
        backgroundExecutor.getClass();
        boolean z10 = true;
        int imageQueueDepth = getBackpressureStrategy() == 1 ? getImageQueueDepth() : 4;
        SafeCloseImageReaderProxy safeCloseImageReaderProxy = imageAnalysisConfig.getImageReaderProxyProvider() != null ? new SafeCloseImageReaderProxy(imageAnalysisConfig.getImageReaderProxyProvider().newInstance(resolution.getWidth(), resolution.getHeight(), getImageFormat(), imageQueueDepth, 0L)) : new SafeCloseImageReaderProxy(ImageReaderProxys.createIsolatedReader(resolution.getWidth(), resolution.getHeight(), getImageFormat(), imageQueueDepth));
        boolean isFlipWH = getCamera() != null ? isFlipWH(getCamera()) : false;
        int height = isFlipWH ? resolution.getHeight() : resolution.getWidth();
        int width = isFlipWH ? resolution.getWidth() : resolution.getHeight();
        int i = getOutputImageFormat() == 2 ? 1 : 35;
        boolean z11 = getImageFormat() == 35 && getOutputImageFormat() == 2;
        if (getImageFormat() != 35 || ((getCamera() == null || getRelativeRotation(getCamera()) == 0) && !Boolean.TRUE.equals(getOnePixelShiftEnabled()))) {
            z10 = false;
        }
        SafeCloseImageReaderProxy safeCloseImageReaderProxy2 = (z11 || z10) ? new SafeCloseImageReaderProxy(ImageReaderProxys.createIsolatedReader(height, width, i, safeCloseImageReaderProxy.getMaxImages())) : null;
        if (safeCloseImageReaderProxy2 != null) {
            this.mImageAnalysisAbstractAnalyzer.setProcessedImageReaderProxy(safeCloseImageReaderProxy2);
        }
        tryUpdateRelativeRotation();
        safeCloseImageReaderProxy.setOnImageAvailableListener(this.mImageAnalysisAbstractAnalyzer, backgroundExecutor);
        SessionConfig.Builder createFrom = SessionConfig.Builder.createFrom(imageAnalysisConfig, streamSpec.getResolution());
        if (streamSpec.getImplementationOptions() != null) {
            createFrom.addImplementationOptions(streamSpec.getImplementationOptions());
        }
        DeferrableSurface deferrableSurface = this.mDeferrableSurface;
        if (deferrableSurface != null) {
            deferrableSurface.close();
        }
        ImmediateSurface immediateSurface = new ImmediateSurface(safeCloseImageReaderProxy.getSurface(), resolution, getImageFormat());
        this.mDeferrableSurface = immediateSurface;
        immediateSurface.getTerminationFuture().addListener(new a(5, safeCloseImageReaderProxy, safeCloseImageReaderProxy2), CameraXExecutors.mainThreadExecutor());
        createFrom.setExpectedFrameRateRange(streamSpec.getExpectedFrameRateRange());
        createFrom.addSurface(this.mDeferrableSurface, streamSpec.getDynamicRange());
        createFrom.addErrorListener(new h(this, str, imageAnalysisConfig, streamSpec, 0));
        return createFrom;
    }

    @ExperimentalUseCaseApi
    public Executor getBackgroundExecutor() {
        return ((ImageAnalysisConfig) getCurrentConfig()).getBackgroundExecutor(null);
    }

    public int getBackpressureStrategy() {
        return ((ImageAnalysisConfig) getCurrentConfig()).getBackpressureStrategy(0);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.camera.core.impl.UseCaseConfig, androidx.camera.core.impl.UseCaseConfig<?>] */
    @Override // androidx.camera.core.UseCase
    public UseCaseConfig<?> getDefaultConfig(boolean z10, UseCaseConfigFactory useCaseConfigFactory) {
        Defaults defaults = DEFAULT_CONFIG;
        Config config = useCaseConfigFactory.getConfig(defaults.getConfig().getCaptureType(), 1);
        if (z10) {
            config = Config.mergeConfigs(config, defaults.getConfig());
        }
        if (config == null) {
            return null;
        }
        return getUseCaseConfigBuilder(config).getUseCaseConfig();
    }

    public int getImageQueueDepth() {
        return ((ImageAnalysisConfig) getCurrentConfig()).getImageQueueDepth(6);
    }

    public Boolean getOnePixelShiftEnabled() {
        return ((ImageAnalysisConfig) getCurrentConfig()).getOnePixelShiftEnabled(DEFAULT_ONE_PIXEL_SHIFT_ENABLED);
    }

    public int getOutputImageFormat() {
        return ((ImageAnalysisConfig) getCurrentConfig()).getOutputImageFormat(1);
    }

    public ResolutionInfo getResolutionInfo() {
        return getResolutionInfoInternal();
    }

    public ResolutionSelector getResolutionSelector() {
        return ((ImageOutputConfig) getCurrentConfig()).getResolutionSelector(null);
    }

    public int getTargetRotation() {
        return getTargetRotationInternal();
    }

    @Override // androidx.camera.core.UseCase
    public UseCaseConfig.Builder<?, ?, ?> getUseCaseConfigBuilder(Config config) {
        return Builder.fromConfig(config);
    }

    public boolean isOutputImageRotationEnabled() {
        return ((ImageAnalysisConfig) getCurrentConfig()).isOutputImageRotationEnabled(Boolean.FALSE).booleanValue();
    }

    @Override // androidx.camera.core.UseCase
    public void onBind() {
        this.mImageAnalysisAbstractAnalyzer.attach();
    }

    /* JADX WARN: Type inference failed for: r6v14, types: [androidx.camera.core.impl.UseCaseConfig, androidx.camera.core.impl.UseCaseConfig<?>] */
    /* JADX WARN: Type inference failed for: r6v4, types: [androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.UseCaseConfig] */
    /* JADX WARN: Type inference failed for: r6v9, types: [androidx.camera.core.impl.UseCaseConfig, androidx.camera.core.impl.UseCaseConfig<?>] */
    @Override // androidx.camera.core.UseCase
    public UseCaseConfig<?> onMergeConfig(CameraInfoInternal cameraInfoInternal, UseCaseConfig.Builder<?, ?, ?> builder) {
        Size defaultTargetResolution;
        Boolean onePixelShiftEnabled = getOnePixelShiftEnabled();
        boolean contains = cameraInfoInternal.getCameraQuirks().contains(OnePixelShiftQuirk.class);
        ImageAnalysisAbstractAnalyzer imageAnalysisAbstractAnalyzer = this.mImageAnalysisAbstractAnalyzer;
        if (onePixelShiftEnabled != null) {
            contains = onePixelShiftEnabled.booleanValue();
        }
        imageAnalysisAbstractAnalyzer.setOnePixelShiftEnabled(contains);
        synchronized (this.mAnalysisLock) {
            try {
                Analyzer analyzer = this.mSubscribedAnalyzer;
                defaultTargetResolution = analyzer != null ? analyzer.getDefaultTargetResolution() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (defaultTargetResolution == null) {
            return builder.getUseCaseConfig();
        }
        if (cameraInfoInternal.getSensorRotationDegrees(((Integer) builder.getMutableConfig().retrieveOption(ImageOutputConfig.OPTION_TARGET_ROTATION, 0)).intValue()) % CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256 == 90) {
            defaultTargetResolution = new Size(defaultTargetResolution.getHeight(), defaultTargetResolution.getWidth());
        }
        ?? useCaseConfig = builder.getUseCaseConfig();
        Config.Option<Size> option = ImageOutputConfig.OPTION_TARGET_RESOLUTION;
        if (!useCaseConfig.containsOption(option)) {
            builder.getMutableConfig().insertOption(option, defaultTargetResolution);
        }
        MutableConfig mutableConfig = builder.getMutableConfig();
        Config.Option<ResolutionSelector> option2 = ImageOutputConfig.OPTION_RESOLUTION_SELECTOR;
        ResolutionSelector resolutionSelector = (ResolutionSelector) mutableConfig.retrieveOption(option2, null);
        if (resolutionSelector != null && resolutionSelector.getResolutionStrategy() == null) {
            ResolutionSelector.Builder fromResolutionSelector = ResolutionSelector.Builder.fromResolutionSelector(resolutionSelector);
            fromResolutionSelector.setResolutionStrategy(new ResolutionStrategy(defaultTargetResolution, 1));
            builder.getMutableConfig().insertOption(option2, fromResolutionSelector.build());
        }
        return builder.getUseCaseConfig();
    }

    @Override // androidx.camera.core.UseCase
    public StreamSpec onSuggestedStreamSpecImplementationOptionsUpdated(Config config) {
        this.mSessionConfigBuilder.addImplementationOptions(config);
        updateSessionConfig(this.mSessionConfigBuilder.build());
        return getAttachedStreamSpec().toBuilder().setImplementationOptions(config).build();
    }

    @Override // androidx.camera.core.UseCase
    public StreamSpec onSuggestedStreamSpecUpdated(StreamSpec streamSpec) {
        SessionConfig.Builder createPipeline = createPipeline(getCameraId(), (ImageAnalysisConfig) getCurrentConfig(), streamSpec);
        this.mSessionConfigBuilder = createPipeline;
        updateSessionConfig(createPipeline.build());
        return streamSpec;
    }

    @Override // androidx.camera.core.UseCase
    public void onUnbind() {
        clearPipeline();
        this.mImageAnalysisAbstractAnalyzer.detach();
    }

    public void setAnalyzer(Executor executor, Analyzer analyzer) {
        synchronized (this.mAnalysisLock) {
            try {
                this.mImageAnalysisAbstractAnalyzer.setAnalyzer(executor, new e(analyzer));
                if (this.mSubscribedAnalyzer == null) {
                    notifyActive();
                }
                this.mSubscribedAnalyzer = analyzer;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.UseCase
    public void setSensorToBufferTransformMatrix(Matrix matrix) {
        super.setSensorToBufferTransformMatrix(matrix);
        this.mImageAnalysisAbstractAnalyzer.setSensorToBufferTransformMatrix(matrix);
    }

    public void setTargetRotation(int i) {
        if (setTargetRotationInternal(i)) {
            tryUpdateRelativeRotation();
        }
    }

    @Override // androidx.camera.core.UseCase
    public void setViewPortCropRect(Rect rect) {
        super.setViewPortCropRect(rect);
        this.mImageAnalysisAbstractAnalyzer.setViewPortCropRect(rect);
    }

    public String toString() {
        return "ImageAnalysis:" + getName();
    }

    public interface Analyzer {
        void analyze(ImageProxy imageProxy);

        default Size getDefaultTargetResolution() {
            return null;
        }

        default int getTargetCoordinateSystem() {
            return 0;
        }

        default void updateTransform(Matrix matrix) {
        }
    }
}
