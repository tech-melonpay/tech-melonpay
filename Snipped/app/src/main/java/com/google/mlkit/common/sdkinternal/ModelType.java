package com.google.mlkit.common.sdkinternal;

import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: com.google.mlkit:common@@18.7.0 */
@KeepForSdk
/* loaded from: classes.dex */
public final class ModelType {

    /* renamed from: a, reason: collision with root package name */
    @KeepForSdk
    public static final ModelType f10519a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ ModelType[] f10520b;

    static {
        ModelType modelType = new ModelType("UNKNOWN", 0);
        f10519a = modelType;
        f10520b = new ModelType[]{modelType, new ModelType("BASE", 1), new ModelType("TRANSLATE", 2), new ModelType("ENTITY_EXTRACTION", 3), new ModelType("CUSTOM", 4), new ModelType("DIGITAL_INK", 5), new ModelType("TOXICITY_DETECTION", 6), new ModelType("IMAGE_CAPTIONING", 7)};
    }

    public static ModelType[] values() {
        return (ModelType[]) f10520b.clone();
    }
}
