package com.sumsub.sns.internal.camera.photo.presentation.document;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.f;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"com/sumsub/sns/internal/camera/photo/presentation/document/DocCapture$PreferredMode", "", "Lcom/sumsub/sns/internal/camera/photo/presentation/document/DocCapture$PreferredMode;", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "a", "MANUAL", "AUTO", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public enum DocCapture$PreferredMode {
    MANUAL("m"),
    AUTO("a");


    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String value;

    /* renamed from: com.sumsub.sns.internal.camera.photo.presentation.document.DocCapture$PreferredMode$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final DocCapture$PreferredMode a(String str) {
            for (DocCapture$PreferredMode docCapture$PreferredMode : DocCapture$PreferredMode.values()) {
                if (f.b(docCapture$PreferredMode.getValue(), str)) {
                    return docCapture$PreferredMode;
                }
            }
            return null;
        }

        public Companion() {
        }
    }

    DocCapture$PreferredMode(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
