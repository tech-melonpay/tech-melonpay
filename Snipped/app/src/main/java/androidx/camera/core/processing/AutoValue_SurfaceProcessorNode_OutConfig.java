package androidx.camera.core.processing;

import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.processing.SurfaceProcessorNode;
import java.util.UUID;

/* loaded from: classes.dex */
final class AutoValue_SurfaceProcessorNode_OutConfig extends SurfaceProcessorNode.OutConfig {
    private final Rect cropRect;
    private final int format;
    private final boolean mirroring;
    private final int rotationDegrees;
    private final Size size;
    private final int targets;
    private final UUID uuid;

    public AutoValue_SurfaceProcessorNode_OutConfig(UUID uuid, int i, int i9, Rect rect, Size size, int i10, boolean z10) {
        if (uuid == null) {
            throw new NullPointerException("Null uuid");
        }
        this.uuid = uuid;
        this.targets = i;
        this.format = i9;
        if (rect == null) {
            throw new NullPointerException("Null cropRect");
        }
        this.cropRect = rect;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.size = size;
        this.rotationDegrees = i10;
        this.mirroring = z10;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SurfaceProcessorNode.OutConfig)) {
            return false;
        }
        SurfaceProcessorNode.OutConfig outConfig = (SurfaceProcessorNode.OutConfig) obj;
        return this.uuid.equals(outConfig.getUuid()) && this.targets == outConfig.getTargets() && this.format == outConfig.getFormat() && this.cropRect.equals(outConfig.getCropRect()) && this.size.equals(outConfig.getSize()) && this.rotationDegrees == outConfig.getRotationDegrees() && this.mirroring == outConfig.getMirroring();
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorNode.OutConfig
    public Rect getCropRect() {
        return this.cropRect;
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorNode.OutConfig
    public int getFormat() {
        return this.format;
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorNode.OutConfig
    public boolean getMirroring() {
        return this.mirroring;
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorNode.OutConfig
    public int getRotationDegrees() {
        return this.rotationDegrees;
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorNode.OutConfig
    public Size getSize() {
        return this.size;
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorNode.OutConfig
    public int getTargets() {
        return this.targets;
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorNode.OutConfig
    public UUID getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        return ((((((((((((this.uuid.hashCode() ^ 1000003) * 1000003) ^ this.targets) * 1000003) ^ this.format) * 1000003) ^ this.cropRect.hashCode()) * 1000003) ^ this.size.hashCode()) * 1000003) ^ this.rotationDegrees) * 1000003) ^ (this.mirroring ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("OutConfig{uuid=");
        sb2.append(this.uuid);
        sb2.append(", targets=");
        sb2.append(this.targets);
        sb2.append(", format=");
        sb2.append(this.format);
        sb2.append(", cropRect=");
        sb2.append(this.cropRect);
        sb2.append(", size=");
        sb2.append(this.size);
        sb2.append(", rotationDegrees=");
        sb2.append(this.rotationDegrees);
        sb2.append(", mirroring=");
        return com.google.android.gms.measurement.internal.a.k(sb2, this.mirroring, "}");
    }
}
