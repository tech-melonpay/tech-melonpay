package androidx.camera.core.impl;

import androidx.camera.core.impl.SurfaceConfig;

/* loaded from: classes.dex */
final class AutoValue_SurfaceConfig extends SurfaceConfig {
    private final SurfaceConfig.ConfigSize configSize;
    private final SurfaceConfig.ConfigType configType;
    private final long streamUseCase;

    public AutoValue_SurfaceConfig(SurfaceConfig.ConfigType configType, SurfaceConfig.ConfigSize configSize, long j10) {
        if (configType == null) {
            throw new NullPointerException("Null configType");
        }
        this.configType = configType;
        if (configSize == null) {
            throw new NullPointerException("Null configSize");
        }
        this.configSize = configSize;
        this.streamUseCase = j10;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SurfaceConfig)) {
            return false;
        }
        SurfaceConfig surfaceConfig = (SurfaceConfig) obj;
        return this.configType.equals(surfaceConfig.getConfigType()) && this.configSize.equals(surfaceConfig.getConfigSize()) && this.streamUseCase == surfaceConfig.getStreamUseCase();
    }

    @Override // androidx.camera.core.impl.SurfaceConfig
    public SurfaceConfig.ConfigSize getConfigSize() {
        return this.configSize;
    }

    @Override // androidx.camera.core.impl.SurfaceConfig
    public SurfaceConfig.ConfigType getConfigType() {
        return this.configType;
    }

    @Override // androidx.camera.core.impl.SurfaceConfig
    public long getStreamUseCase() {
        return this.streamUseCase;
    }

    public int hashCode() {
        int hashCode = (((this.configType.hashCode() ^ 1000003) * 1000003) ^ this.configSize.hashCode()) * 1000003;
        long j10 = this.streamUseCase;
        return hashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "SurfaceConfig{configType=" + this.configType + ", configSize=" + this.configSize + ", streamUseCase=" + this.streamUseCase + "}";
    }
}
