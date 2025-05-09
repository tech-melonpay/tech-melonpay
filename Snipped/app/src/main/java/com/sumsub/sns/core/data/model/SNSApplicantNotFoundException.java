package com.sumsub.sns.core.data.model;

import androidx.annotation.Keep;
import androidx.camera.core.n;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Keep
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/sumsub/sns/core/data/model/SNSApplicantNotFoundException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "applicantId", "", "(Ljava/lang/String;)V", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class SNSApplicantNotFoundException extends Exception {
    public SNSApplicantNotFoundException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public SNSApplicantNotFoundException(String str) {
        super(n.a("Applicant(", str, ") is not found"));
    }

    public /* synthetic */ SNSApplicantNotFoundException(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
