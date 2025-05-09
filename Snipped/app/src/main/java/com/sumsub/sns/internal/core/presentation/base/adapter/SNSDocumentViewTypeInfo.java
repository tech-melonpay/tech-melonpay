package com.sumsub.sns.internal.core.presentation.base.adapter;

import com.sumsub.sns.internal.core.data.model.Document;
import kotlin.Metadata;

/* loaded from: classes2.dex */
public final class SNSDocumentViewTypeInfo {

    /* renamed from: a, reason: collision with root package name */
    public final Type f16447a;

    /* renamed from: b, reason: collision with root package name */
    public final Document f16448b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/sumsub/sns/internal/core/presentation/base/adapter/SNSDocumentViewTypeInfo$Type;", "", "(Ljava/lang/String;I)V", "DOCUMENT", "VIDEO_IDENTIFICATION", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum Type {
        DOCUMENT,
        VIDEO_IDENTIFICATION
    }

    public SNSDocumentViewTypeInfo(Type type, Document document) {
        this.f16447a = type;
        this.f16448b = document;
    }

    public final Document c() {
        return this.f16448b;
    }

    public final Type d() {
        return this.f16447a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SNSDocumentViewTypeInfo)) {
            return false;
        }
        SNSDocumentViewTypeInfo sNSDocumentViewTypeInfo = (SNSDocumentViewTypeInfo) obj;
        return this.f16447a == sNSDocumentViewTypeInfo.f16447a && kotlin.jvm.internal.f.b(this.f16448b, sNSDocumentViewTypeInfo.f16448b);
    }

    public int hashCode() {
        return this.f16448b.hashCode() + (this.f16447a.hashCode() * 31);
    }

    public String toString() {
        return "SNSDocumentViewTypeInfo(type=" + this.f16447a + ", document=" + this.f16448b + ')';
    }
}
