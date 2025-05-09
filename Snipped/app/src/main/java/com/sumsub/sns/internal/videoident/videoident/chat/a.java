package com.sumsub.sns.internal.videoident.videoident.chat;

import O9.p;
import android.graphics.Bitmap;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.sumsub.sns.internal.videoident.videoident.SNSVideoIdent;
import java.util.concurrent.atomic.AtomicReference;
import tvi.webrtc.VideoProcessor;
import tvi.webrtc.VideoSink;

/* loaded from: classes2.dex */
public final class a implements VideoProcessor {

    /* renamed from: a, reason: collision with root package name */
    public VideoSink f19567a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference<Boolean> f19568b = new AtomicReference<>(Boolean.FALSE);

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC0635a<p> f19569c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC0646l<? super Bitmap, p> f19570d;

    public a(VideoSink videoSink) {
        this.f19567a = videoSink;
    }

    public final void a(InterfaceC0635a<p> interfaceC0635a) {
        this.f19569c = interfaceC0635a;
    }

    public final void e() {
        if (this.f19568b.get().booleanValue()) {
            com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, "makePhoto: already making photo", null, 4, null);
        } else {
            this.f19568b.set(Boolean.TRUE);
        }
    }

    public final void a(InterfaceC0646l<? super Bitmap, p> interfaceC0646l) {
        this.f19570d = interfaceC0646l;
    }
}
