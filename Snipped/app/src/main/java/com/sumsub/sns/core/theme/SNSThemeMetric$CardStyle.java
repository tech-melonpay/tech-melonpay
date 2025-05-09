package com.sumsub.sns.core.theme;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"com/sumsub/sns/core/theme/SNSThemeMetric$CardStyle", "", "Lcom/sumsub/sns/core/theme/SNSThemeMetric$CardStyle;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "BORDERED", "PLAIN", "DEFAULT", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public enum SNSThemeMetric$CardStyle {
    BORDERED("bordered"),
    PLAIN("plain"),
    DEFAULT("default");

    private final String value;

    SNSThemeMetric$CardStyle(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
