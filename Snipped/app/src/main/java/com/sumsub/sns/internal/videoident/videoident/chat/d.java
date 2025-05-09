package com.sumsub.sns.internal.videoident.videoident.chat;

import android.os.Handler;
import android.os.HandlerThread;
import com.sumsub.sns.internal.core.SNSDebugConstants;
import com.sumsub.sns.internal.videoident.videoident.SNSVideoIdent;
import com.twilio.video.RemoteAudioTrack;
import com.twilio.video.RemoteDataTrack;
import com.twilio.video.RemoteParticipant;
import com.twilio.video.RemoteVideoTrack;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import tvi.webrtc.VideoSink;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineScope f19576a = CoroutineScopeKt.CoroutineScope(Dispatchers.getMain());

    /* renamed from: b, reason: collision with root package name */
    public final Handler f19577b;

    /* renamed from: c, reason: collision with root package name */
    public final MutableSharedFlow<String> f19578c;

    /* renamed from: d, reason: collision with root package name */
    public RemoteVideoTrack f19579d;

    /* renamed from: e, reason: collision with root package name */
    public VideoSink f19580e;

    /* renamed from: f, reason: collision with root package name */
    public MutableStateFlow<com.sumsub.sns.internal.videoident.videoident.chat.b> f19581f;

    /* renamed from: g, reason: collision with root package name */
    public RemoteAudioTrack f19582g;

    /* renamed from: h, reason: collision with root package name */
    public final SharedFlow<String> f19583h;
    public final StateFlow<com.sumsub.sns.internal.videoident.videoident.chat.b> i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f19584j;

    /* renamed from: k, reason: collision with root package name */
    public final a f19585k;

    /* renamed from: l, reason: collision with root package name */
    public final b f19586l;

    public static final class a implements RemoteDataTrack.Listener {
        public a() {
        }
    }

    public static final class b implements RemoteParticipant.Listener {
        public b() {
        }
    }

    public d() {
        HandlerThread handlerThread = new HandlerThread("RemoteDataTrack");
        com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, "init messageReceiveThread", null, 4, null);
        handlerThread.start();
        this.f19577b = new Handler(handlerThread.getLooper());
        MutableSharedFlow<String> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 10, BufferOverflow.DROP_LATEST, 1, null);
        this.f19578c = MutableSharedFlow$default;
        MutableStateFlow<com.sumsub.sns.internal.videoident.videoident.chat.b> MutableStateFlow = StateFlowKt.MutableStateFlow(com.sumsub.sns.internal.videoident.videoident.chat.b.f19571e.a());
        this.f19581f = MutableStateFlow;
        this.f19583h = MutableSharedFlow$default;
        this.i = MutableStateFlow;
        this.f19584j = true;
        this.f19585k = new a();
        this.f19586l = new b();
    }

    public final void a(boolean z10) {
        this.f19584j = z10;
        RemoteAudioTrack remoteAudioTrack = this.f19582g;
        if (remoteAudioTrack != null) {
            remoteAudioTrack.enablePlayback(z10 && !SNSDebugConstants.INSTANCE.getMuteVideoIdent());
        }
    }

    public final void b() {
        RemoteVideoTrack remoteVideoTrack;
        VideoSink videoSink = this.f19580e;
        if (videoSink != null && (remoteVideoTrack = this.f19579d) != null) {
            remoteVideoTrack.removeSink(videoSink);
        }
        this.f19579d = null;
        this.f19580e = null;
    }

    public final SharedFlow<String> c() {
        return this.f19583h;
    }

    public final StateFlow<com.sumsub.sns.internal.videoident.videoident.chat.b> e() {
        return this.i;
    }

    public final void g() {
        b();
        this.f19581f.setValue(com.sumsub.sns.internal.videoident.videoident.chat.b.f19571e.b());
    }

    public final void a() {
        b();
        CoroutineScopeKt.cancel$default(this.f19576a, null, 1, null);
        this.f19577b.getLooper().quit();
    }

    public final void b(VideoSink videoSink) {
        this.f19580e = null;
        RemoteVideoTrack remoteVideoTrack = this.f19579d;
        if (remoteVideoTrack != null) {
            remoteVideoTrack.removeSink(videoSink);
        }
    }

    public final void a(VideoSink videoSink) {
        if (this.f19580e == videoSink) {
            com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, "bindRemoteView: already added ", null, 4, null);
            return;
        }
        this.f19580e = videoSink;
        RemoteVideoTrack remoteVideoTrack = this.f19579d;
        if (remoteVideoTrack != null) {
            remoteVideoTrack.addSink(videoSink);
        }
    }
}
