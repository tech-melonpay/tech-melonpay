package com.google.mlkit.common.sdkinternal.model;

import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: com.google.mlkit:common@@18.7.0 */
@KeepForSdk
/* loaded from: classes.dex */
public final class BaseModel {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ BaseModel[] f10524a = {new BaseModel("FACE_DETECTION", 0), new BaseModel("SMART_REPLY", 1), new BaseModel("TRANSLATE", 2), new BaseModel("ENTITY_EXTRACTION", 3), new BaseModel("TOXICITY_DETECTION", 4), new BaseModel("IMAGE_CAPTIONING", 5)};

    /* JADX INFO: Fake field, exist only in values array */
    BaseModel EF5;

    public static BaseModel[] values() {
        return (BaseModel[]) f10524a.clone();
    }
}
