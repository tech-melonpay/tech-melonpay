package com.sumsub.sns.internal.core.data.source.analythic;

import com.sumsub.sns.core.data.model.SNSTrackEvents;
import com.sumsub.sns.internal.log.cacher.e;
import java.util.List;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final e<List<SNSTrackEvents>> f15830a;

    public a(e<List<SNSTrackEvents>> eVar) {
        this.f15830a = eVar;
    }

    public final Object a(List<SNSTrackEvents> list, T9.a<? super Boolean> aVar) {
        return this.f15830a.send(list, aVar);
    }
}
