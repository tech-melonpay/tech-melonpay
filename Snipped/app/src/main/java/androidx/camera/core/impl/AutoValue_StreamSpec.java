package androidx.camera.core.impl;

import C.v;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.impl.StreamSpec;

/* loaded from: classes.dex */
final class AutoValue_StreamSpec extends StreamSpec {
    private final DynamicRange dynamicRange;
    private final Range<Integer> expectedFrameRateRange;
    private final Config implementationOptions;
    private final Size resolution;

    public static final class Builder extends StreamSpec.Builder {
        private DynamicRange dynamicRange;
        private Range<Integer> expectedFrameRateRange;
        private Config implementationOptions;
        private Size resolution;

        @Override // androidx.camera.core.impl.StreamSpec.Builder
        public StreamSpec build() {
            String str = this.resolution == null ? " resolution" : "";
            if (this.dynamicRange == null) {
                str = v.n(str, " dynamicRange");
            }
            if (this.expectedFrameRateRange == null) {
                str = v.n(str, " expectedFrameRateRange");
            }
            if (str.isEmpty()) {
                return new AutoValue_StreamSpec(this.resolution, this.dynamicRange, this.expectedFrameRateRange, this.implementationOptions);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        @Override // androidx.camera.core.impl.StreamSpec.Builder
        public StreamSpec.Builder setDynamicRange(DynamicRange dynamicRange) {
            if (dynamicRange == null) {
                throw new NullPointerException("Null dynamicRange");
            }
            this.dynamicRange = dynamicRange;
            return this;
        }

        @Override // androidx.camera.core.impl.StreamSpec.Builder
        public StreamSpec.Builder setExpectedFrameRateRange(Range<Integer> range) {
            if (range == null) {
                throw new NullPointerException("Null expectedFrameRateRange");
            }
            this.expectedFrameRateRange = range;
            return this;
        }

        @Override // androidx.camera.core.impl.StreamSpec.Builder
        public StreamSpec.Builder setImplementationOptions(Config config) {
            this.implementationOptions = config;
            return this;
        }

        @Override // androidx.camera.core.impl.StreamSpec.Builder
        public StreamSpec.Builder setResolution(Size size) {
            if (size == null) {
                throw new NullPointerException("Null resolution");
            }
            this.resolution = size;
            return this;
        }

        public Builder() {
        }

        private Builder(StreamSpec streamSpec) {
            this.resolution = streamSpec.getResolution();
            this.dynamicRange = streamSpec.getDynamicRange();
            this.expectedFrameRateRange = streamSpec.getExpectedFrameRateRange();
            this.implementationOptions = streamSpec.getImplementationOptions();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StreamSpec)) {
            return false;
        }
        StreamSpec streamSpec = (StreamSpec) obj;
        if (this.resolution.equals(streamSpec.getResolution()) && this.dynamicRange.equals(streamSpec.getDynamicRange()) && this.expectedFrameRateRange.equals(streamSpec.getExpectedFrameRateRange())) {
            Config config = this.implementationOptions;
            if (config == null) {
                if (streamSpec.getImplementationOptions() == null) {
                    return true;
                }
            } else if (config.equals(streamSpec.getImplementationOptions())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.impl.StreamSpec
    public DynamicRange getDynamicRange() {
        return this.dynamicRange;
    }

    @Override // androidx.camera.core.impl.StreamSpec
    public Range<Integer> getExpectedFrameRateRange() {
        return this.expectedFrameRateRange;
    }

    @Override // androidx.camera.core.impl.StreamSpec
    public Config getImplementationOptions() {
        return this.implementationOptions;
    }

    @Override // androidx.camera.core.impl.StreamSpec
    public Size getResolution() {
        return this.resolution;
    }

    public int hashCode() {
        int hashCode = (((((this.resolution.hashCode() ^ 1000003) * 1000003) ^ this.dynamicRange.hashCode()) * 1000003) ^ this.expectedFrameRateRange.hashCode()) * 1000003;
        Config config = this.implementationOptions;
        return hashCode ^ (config == null ? 0 : config.hashCode());
    }

    @Override // androidx.camera.core.impl.StreamSpec
    public StreamSpec.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        return "StreamSpec{resolution=" + this.resolution + ", dynamicRange=" + this.dynamicRange + ", expectedFrameRateRange=" + this.expectedFrameRateRange + ", implementationOptions=" + this.implementationOptions + "}";
    }

    private AutoValue_StreamSpec(Size size, DynamicRange dynamicRange, Range<Integer> range, Config config) {
        this.resolution = size;
        this.dynamicRange = dynamicRange;
        this.expectedFrameRateRange = range;
        this.implementationOptions = config;
    }
}
