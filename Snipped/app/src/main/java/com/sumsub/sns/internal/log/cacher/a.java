package com.sumsub.sns.internal.log.cacher;

import O9.p;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public interface a<Payload> extends c<Payload> {
    Object a(InputStream inputStream, T9.a<? super Boolean> aVar);

    Object a(Payload payload, OutputStream outputStream, T9.a<? super p> aVar);
}
