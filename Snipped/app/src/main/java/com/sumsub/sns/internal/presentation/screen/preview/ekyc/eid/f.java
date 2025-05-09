package com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid;

import com.sumsub.sns.core.data.model.SNSGeneralException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public class f extends SNSGeneralException {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f18217a;

    public /* synthetic */ f(boolean z10, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }

    public final boolean a() {
        return this.f18217a;
    }

    public f(boolean z10, String str, String str2) {
        super(str, str2);
        this.f18217a = z10;
    }
}
