package com.sumsub.sns.internal.videoident.videoident.chat;

import O9.m;
import O9.p;
import P9.i;
import P9.s;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.AudioManager;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import ca.InterfaceC0650p;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.internal.core.SNSDebugConstants;
import com.sumsub.sns.internal.core.common.x;
import com.sumsub.sns.internal.log.LoggerType;
import com.sumsub.sns.internal.videoident.videoident.SNSVideoIdent;
import com.sumsub.sns.internal.videoident.videoident.chat.FocusStatus;
import com.sumsub.sns.internal.videoident.videoident.chat.SNSVideoChatState;
import com.sumsub.sns.internal.videoident.videoident.twilio.CameraCapturerCompat;
import com.twilio.audioswitch.AudioSwitch;
import com.twilio.video.ConnectOptions;
import com.twilio.video.H264Codec;
import com.twilio.video.LocalAudioTrack;
import com.twilio.video.LocalDataTrack;
import com.twilio.video.LocalDataTrackPublication;
import com.twilio.video.LocalParticipant;
import com.twilio.video.LocalVideoTrack;
import com.twilio.video.Room;
import com.twilio.video.TwilioException;
import com.twilio.video.Video;
import com.twilio.video.VideoCodec;
import com.twilio.video.VideoDimensions;
import com.twilio.video.VideoFormat;
import com.twilio.video.VideoView;
import com.twilio.video.Vp8Codec;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import k0.C0913a;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.bouncycastle.tls.CipherSuite;
import sa.AbstractC1244a;
import tvi.webrtc.VideoProcessor;
import tvi.webrtc.VideoSink;
import tvi.webrtc.VideoSource;

/* loaded from: classes2.dex */
public final class SNSVideoChatController {

    /* renamed from: a, reason: collision with root package name */
    public com.sumsub.sns.internal.videoident.videoident.chat.e f19516a;

    /* renamed from: b, reason: collision with root package name */
    public Job f19517b;

    /* renamed from: c, reason: collision with root package name */
    public long f19518c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f19519d;

    /* renamed from: e, reason: collision with root package name */
    public Flow<Long> f19520e = FlowKt.flow(new e(null));

    /* renamed from: f, reason: collision with root package name */
    public final CoroutineScope f19521f;

    /* renamed from: h, reason: collision with root package name */
    public final d f19522h;
    public LocalDataTrack i;

    /* renamed from: j, reason: collision with root package name */
    public LocalAudioTrack f19523j;

    /* renamed from: k, reason: collision with root package name */
    public LocalVideoTrack f19524k;

    /* renamed from: l, reason: collision with root package name */
    public com.sumsub.sns.internal.videoident.videoident.chat.a f19525l;

    /* renamed from: m, reason: collision with root package name */
    public LocalParticipant f19526m;

    /* renamed from: n, reason: collision with root package name */
    public Room f19527n;

    /* renamed from: o, reason: collision with root package name */
    public final MutableStateFlow<SNSVideoChatState> f19528o;

    /* renamed from: p, reason: collision with root package name */
    public final MutableSharedFlow<String> f19529p;

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC0646l<? super Long, p> f19530q;

    /* renamed from: r, reason: collision with root package name */
    public final Flow<String> f19531r;

    /* renamed from: s, reason: collision with root package name */
    public InterfaceC0635a<p> f19532s;

    /* renamed from: t, reason: collision with root package name */
    public InterfaceC0646l<? super Bitmap, p> f19533t;

    /* renamed from: u, reason: collision with root package name */
    public InterfaceC0635a<p> f19534u;

    /* renamed from: v, reason: collision with root package name */
    public final a f19535v;

    /* renamed from: w, reason: collision with root package name */
    public final f f19536w;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/sumsub/sns/internal/videoident/videoident/chat/SNSVideoChatController$CameraId;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "FRONT", "BACK", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum CameraId {
        FRONT("FRONT"),
        BACK("BACK");

        private final String value;

        CameraId(String str) {
            this.value = str;
        }

        public final String getValue() {
            return this.value;
        }
    }

    public static final class a implements LocalParticipant.Listener {
    }

    @V9.d(c = "com.sumsub.sns.internal.videoident.videoident.chat.SNSVideoChatController$participantController$1$1", f = "SNSVideoChatController.kt", l = {CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19537a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f19538b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ SNSVideoChatController f19539c;

        public static final class a<T> implements FlowCollector {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ SNSVideoChatController f19540a;

            public a(SNSVideoChatController sNSVideoChatController) {
                this.f19540a = sNSVideoChatController;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(com.sumsub.sns.internal.videoident.videoident.chat.b bVar, T9.a<? super p> aVar) {
                this.f19540a.a(bVar);
                return p.f3034a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(d dVar, SNSVideoChatController sNSVideoChatController, T9.a<? super b> aVar) {
            super(2, aVar);
            this.f19538b = dVar;
            this.f19539c = sNSVideoChatController;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
            return ((b) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            return new b(this.f19538b, this.f19539c, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f19537a;
            if (i == 0) {
                kotlin.b.b(obj);
                StateFlow<com.sumsub.sns.internal.videoident.videoident.chat.b> e10 = this.f19538b.e();
                a aVar = new a(this.f19539c);
                this.f19537a = 1;
                if (e10.collect(aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.videoident.videoident.chat.SNSVideoChatController$recordTimerFlow$1", f = "SNSVideoChatController.kt", l = {155, 158, 160}, m = "invokeSuspend")
    public static final class e extends SuspendLambda implements InterfaceC0650p<FlowCollector<? super Long>, T9.a<? super p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public long f19541a;

        /* renamed from: b, reason: collision with root package name */
        public int f19542b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f19543c;

        public e(T9.a<? super e> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(FlowCollector<? super Long> flowCollector, T9.a<? super p> aVar) {
            return ((e) create(flowCollector, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            e eVar = SNSVideoChatController.this.new e(aVar);
            eVar.f19543c = obj;
            return eVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0053  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x007f  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x007e A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x007c -> B:12:0x004b). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
                int r1 = r10.f19542b
                r2 = 1
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L2e
                if (r1 == r6) goto L24
                if (r1 == r5) goto L1a
                if (r1 != r4) goto L12
                goto L24
            L12:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1a:
                long r6 = r10.f19541a
                java.lang.Object r1 = r10.f19543c
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                kotlin.b.b(r11)
                goto L66
            L24:
                long r6 = r10.f19541a
                java.lang.Object r1 = r10.f19543c
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                kotlin.b.b(r11)
                goto L4b
            L2e:
                kotlin.b.b(r11)
                java.lang.Object r11 = r10.f19543c
                kotlinx.coroutines.flow.FlowCollector r11 = (kotlinx.coroutines.flow.FlowCollector) r11
                java.lang.Long r1 = new java.lang.Long
                r7 = 0
                r1.<init>(r7)
                r10.f19543c = r11
                r10.f19541a = r7
                r10.f19542b = r6
                java.lang.Object r1 = r11.emit(r1, r10)
                if (r1 != r0) goto L49
                return r0
            L49:
                r1 = r11
                r6 = r7
            L4b:
                com.sumsub.sns.internal.videoident.videoident.chat.SNSVideoChatController r11 = com.sumsub.sns.internal.videoident.videoident.chat.SNSVideoChatController.this
                boolean r11 = com.sumsub.sns.internal.videoident.videoident.chat.SNSVideoChatController.i(r11)
                if (r11 == 0) goto L7f
                java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.SECONDS
                long r8 = r11.toMillis(r2)
                r10.f19543c = r1
                r10.f19541a = r6
                r10.f19542b = r5
                java.lang.Object r11 = kotlinx.coroutines.DelayKt.delay(r8, r10)
                if (r11 != r0) goto L66
                return r0
            L66:
                java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.SECONDS
                long r8 = r11.toMillis(r2)
                long r6 = r6 + r8
                java.lang.Long r11 = new java.lang.Long
                r11.<init>(r6)
                r10.f19543c = r1
                r10.f19541a = r6
                r10.f19542b = r4
                java.lang.Object r11 = r1.emit(r11, r10)
                if (r11 != r0) goto L4b
                return r0
            L7f:
                O9.p r11 = O9.p.f3034a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.videoident.videoident.chat.SNSVideoChatController.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class f implements Room.Listener {
        public f() {
        }
    }

    public static final class g extends Lambda implements InterfaceC0635a<p> {

        @V9.d(c = "com.sumsub.sns.internal.videoident.videoident.chat.SNSVideoChatController$startLocalVideoTracking$2$1", f = "SNSVideoChatController.kt", l = {}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f19547a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SNSVideoChatController f19548b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SNSVideoChatController sNSVideoChatController, T9.a<? super a> aVar) {
                super(2, aVar);
                this.f19548b = sNSVideoChatController;
            }

            @Override // ca.InterfaceC0650p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
                return ((a) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final T9.a<p> create(Object obj, T9.a<?> aVar) {
                return new a(this.f19548b, aVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
                if (this.f19547a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
                InterfaceC0635a<p> e10 = this.f19548b.e();
                if (e10 != null) {
                    e10.invoke();
                }
                return p.f3034a;
            }
        }

        public g() {
            super(0);
        }

        public final void a() {
            BuildersKt__Builders_commonKt.launch$default(SNSVideoChatController.this.f19521f, null, null, new a(SNSVideoChatController.this, null), 3, null);
        }

        @Override // ca.InterfaceC0635a
        public /* bridge */ /* synthetic */ p invoke() {
            a();
            return p.f3034a;
        }
    }

    public static final class h extends Lambda implements InterfaceC0646l<Bitmap, p> {

        @V9.d(c = "com.sumsub.sns.internal.videoident.videoident.chat.SNSVideoChatController$startLocalVideoTracking$3$1", f = "SNSVideoChatController.kt", l = {}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f19550a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Bitmap f19551b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ SNSVideoChatController f19552c;

            @V9.d(c = "com.sumsub.sns.internal.videoident.videoident.chat.SNSVideoChatController$startLocalVideoTracking$3$1$1", f = "SNSVideoChatController.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.sumsub.sns.internal.videoident.videoident.chat.SNSVideoChatController$h$a$a, reason: collision with other inner class name */
            public static final class C0362a extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {

                /* renamed from: a, reason: collision with root package name */
                public int f19553a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ SNSVideoChatController f19554b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ Bitmap f19555c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0362a(SNSVideoChatController sNSVideoChatController, Bitmap bitmap, T9.a<? super C0362a> aVar) {
                    super(2, aVar);
                    this.f19554b = sNSVideoChatController;
                    this.f19555c = bitmap;
                }

                @Override // ca.InterfaceC0650p
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
                    return ((C0362a) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final T9.a<p> create(Object obj, T9.a<?> aVar) {
                    return new C0362a(this.f19554b, this.f19555c, aVar);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
                    if (this.f19553a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.b.b(obj);
                    InterfaceC0646l<Bitmap, p> f10 = this.f19554b.f();
                    if (f10 != null) {
                        f10.invoke(this.f19555c);
                    }
                    return p.f3034a;
                }
            }

            @V9.d(c = "com.sumsub.sns.internal.videoident.videoident.chat.SNSVideoChatController$startLocalVideoTracking$3$1$2", f = "SNSVideoChatController.kt", l = {}, m = "invokeSuspend")
            public static final class b extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {

                /* renamed from: a, reason: collision with root package name */
                public int f19556a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ SNSVideoChatController f19557b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(SNSVideoChatController sNSVideoChatController, T9.a<? super b> aVar) {
                    super(2, aVar);
                    this.f19557b = sNSVideoChatController;
                }

                @Override // ca.InterfaceC0650p
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
                    return ((b) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final T9.a<p> create(Object obj, T9.a<?> aVar) {
                    return new b(this.f19557b, aVar);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
                    if (this.f19556a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.b.b(obj);
                    InterfaceC0635a<p> g10 = this.f19557b.g();
                    if (g10 != null) {
                        g10.invoke();
                    }
                    return p.f3034a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Bitmap bitmap, SNSVideoChatController sNSVideoChatController, T9.a<? super a> aVar) {
                super(2, aVar);
                this.f19551b = bitmap;
                this.f19552c = sNSVideoChatController;
            }

            @Override // ca.InterfaceC0650p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
                return ((a) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final T9.a<p> create(Object obj, T9.a<?> aVar) {
                return new a(this.f19551b, this.f19552c, aVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
                if (this.f19550a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
                if (this.f19551b != null) {
                    BuildersKt__Builders_commonKt.launch$default(this.f19552c.f19521f, null, null, new C0362a(this.f19552c, this.f19551b, null), 3, null);
                } else {
                    BuildersKt__Builders_commonKt.launch$default(this.f19552c.f19521f, null, null, new b(this.f19552c, null), 3, null);
                }
                return p.f3034a;
            }
        }

        public h() {
            super(1);
        }

        public final void a(Bitmap bitmap) {
            VideoSource videoSource;
            LocalVideoTrack localVideoTrack = SNSVideoChatController.this.f19524k;
            if (localVideoTrack != null && (videoSource = localVideoTrack.getVideoSource()) != null) {
                videoSource.setVideoProcessor((VideoProcessor) null);
            }
            BuildersKt__Builders_commonKt.launch$default(SNSVideoChatController.this.f19521f, null, null, new a(bitmap, SNSVideoChatController.this, null), 3, null);
        }

        @Override // ca.InterfaceC0646l
        public /* bridge */ /* synthetic */ p invoke(Bitmap bitmap) {
            a(bitmap);
            return p.f3034a;
        }
    }

    public SNSVideoChatController() {
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getMain());
        this.f19521f = CoroutineScope;
        d dVar = new d();
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new b(dVar, this, null), 3, null);
        this.f19522h = dVar;
        this.f19528o = StateFlowKt.MutableStateFlow(new SNSVideoChatState.c(null, 1, null));
        MutableSharedFlow<String> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f19529p = MutableSharedFlow$default;
        this.f19531r = FlowKt.merge(dVar.c(), MutableSharedFlow$default);
        this.f19535v = new a();
        this.f19536w = new f();
    }

    public final VideoCodec a(VideoCodec videoCodec) {
        throw null;
    }

    public final void b(InterfaceC0646l<? super Long, p> interfaceC0646l) {
        this.f19530q = interfaceC0646l;
    }

    public final Flow<String> d() {
        return this.f19531r;
    }

    public final InterfaceC0635a<p> e() {
        return this.f19532s;
    }

    public final InterfaceC0646l<Bitmap, p> f() {
        return this.f19533t;
    }

    public final long h() {
        if (this.f19519d) {
            return ha.h.P(System.currentTimeMillis() - this.f19518c, 0L);
        }
        return 0L;
    }

    public final StateFlow<SNSVideoChatState> l() {
        return this.f19528o;
    }

    public final void o() {
        VideoSource videoSource;
        com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, "makePhoto", null, 4, null);
        LocalVideoTrack localVideoTrack = this.f19524k;
        if (localVideoTrack != null && (videoSource = localVideoTrack.getVideoSource()) != null) {
            videoSource.setVideoProcessor(this.f19525l);
        }
        com.sumsub.sns.internal.videoident.videoident.chat.a aVar = this.f19525l;
        if (aVar != null) {
            aVar.e();
        }
    }

    public final void p() {
        com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, "releaseLocalTracks", null, 4, null);
        LocalVideoTrack localVideoTrack = this.f19524k;
        if (localVideoTrack != null) {
            localVideoTrack.getVideoSource().setVideoProcessor((VideoProcessor) null);
            localVideoTrack.release();
            this.f19524k = null;
        }
        LocalAudioTrack localAudioTrack = this.f19523j;
        if (localAudioTrack != null) {
            localAudioTrack.release();
            this.f19523j = null;
        }
        LocalDataTrack localDataTrack = this.i;
        if (localDataTrack != null) {
            localDataTrack.release();
            this.i = null;
        }
    }

    public final void q() {
        LocalParticipant localParticipant;
        com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, "releaseLocalVideoTrack", null, 4, null);
        LocalVideoTrack localVideoTrack = this.f19524k;
        if (localVideoTrack != null && (localParticipant = this.f19526m) != null) {
            localParticipant.unpublishTrack(localVideoTrack);
        }
        LocalVideoTrack localVideoTrack2 = this.f19524k;
        if (localVideoTrack2 != null) {
            localVideoTrack2.release();
        }
        this.f19524k = null;
    }

    public final void s() {
        this.f19519d = false;
        Job job = this.f19517b;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            this.f19517b = null;
        }
    }

    public final CameraId t() {
        CameraCapturerCompat videoCapturer;
        LocalVideoTrack localVideoTrack = this.f19524k;
        if (localVideoTrack == null || (videoCapturer = localVideoTrack.getVideoCapturer()) == null) {
            return null;
        }
        CameraCapturerCompat cameraCapturerCompat = videoCapturer instanceof CameraCapturerCompat ? videoCapturer : null;
        if (cameraCapturerCompat == null) {
            return null;
        }
        try {
            CameraCapturerCompat.Source c2 = cameraCapturerCompat.c();
            if (c2 == null) {
                return null;
            }
            return c2 == CameraCapturerCompat.Source.FRONT_CAMERA ? CameraId.FRONT : CameraId.BACK;
        } catch (TwilioException e10) {
            com.sumsub.sns.internal.log.a.f17535a.a(LoggerType.KIBANA).e(SNSVideoIdent.logTag, "error switching camera", e10);
            com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, com.sumsub.sns.internal.videoident.videoident.twilio.b.a(e10), null, 4, null);
            return null;
        }
    }

    public final void a(InterfaceC0635a<p> interfaceC0635a) {
        this.f19532s = interfaceC0635a;
    }

    public final void b(InterfaceC0635a<p> interfaceC0635a) {
        this.f19534u = interfaceC0635a;
    }

    public final void c(VideoSink videoSink) {
        LocalVideoTrack localVideoTrack = this.f19524k;
        if (localVideoTrack != null) {
            localVideoTrack.removeSink(videoSink);
        }
        LocalVideoTrack localVideoTrack2 = this.f19524k;
        if (localVideoTrack2 != null) {
            localVideoTrack2.enable(false);
        }
    }

    public final void d(VideoSink videoSink) {
        this.f19522h.b(videoSink);
    }

    public final InterfaceC0635a<p> g() {
        return this.f19534u;
    }

    public final void a(InterfaceC0646l<? super Bitmap, p> interfaceC0646l) {
        this.f19533t = interfaceC0646l;
    }

    public final void b() {
        this.f19516a = null;
        CoroutineScopeKt.cancel$default(this.f19521f, null, 1, null);
        a();
        p();
        this.f19522h.a();
        s();
        com.sumsub.sns.internal.videoident.videoident.chat.e eVar = this.f19516a;
        if (eVar != null) {
            eVar.a();
        }
        this.f19516a = null;
    }

    public final FocusStatus a(int i) {
        FocusStatus bVar;
        if (i == -3 || i == -2 || i == -1) {
            bVar = new FocusStatus.b(i != -1);
        } else {
            if (i != 1 && i != 2 && i != 3 && i != 4) {
                return FocusStatus.c.f19515a;
            }
            bVar = new FocusStatus.a(i != 1);
        }
        return bVar;
    }

    public final CameraId c() {
        CameraCapturerCompat videoCapturer;
        CameraCapturerCompat.Source a10;
        CameraId b9;
        LocalVideoTrack localVideoTrack = this.f19524k;
        if (localVideoTrack == null || (videoCapturer = localVideoTrack.getVideoCapturer()) == null) {
            return null;
        }
        CameraCapturerCompat cameraCapturerCompat = videoCapturer instanceof CameraCapturerCompat ? videoCapturer : null;
        if (cameraCapturerCompat == null || (a10 = cameraCapturerCompat.a()) == null) {
            return null;
        }
        b9 = c.b(a10);
        return b9;
    }

    public final void a(VideoView videoView) {
        if (this.f19524k != null) {
            return;
        }
        Context applicationContext = videoView.getContext().getApplicationContext();
        this.f19516a = new com.sumsub.sns.internal.videoident.videoident.chat.e((AudioManager) applicationContext.getSystemService("audio"), new com.sumsub.sns.internal.videoident.videoident.twilio.a(new AudioSwitch(applicationContext, false, new AudioManager.OnAudioFocusChangeListener() { // from class: com.sumsub.sns.internal.videoident.videoident.chat.f
            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public final void onAudioFocusChange(int i) {
                SNSVideoChatController.a(SNSVideoChatController.this, i);
            }
        }, (List) null, 10, (DefaultConstructorMarker) null)));
        if (this.i == null) {
            this.i = LocalDataTrack.create(applicationContext);
        }
        a(applicationContext);
        a((VideoSink) videoView);
        if (this.f19523j != null) {
            com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, "startLocalMediaTracking: audio already started", null, 4, null);
            return;
        }
        if (C0913a.checkSelfPermission(applicationContext, "android.permission.RECORD_AUDIO") == 0) {
            LocalAudioTrack create = LocalAudioTrack.create(applicationContext, true);
            this.f19523j = create;
            if (create != null) {
                create.enable(true ^ SNSDebugConstants.INSTANCE.getMuteVideoIdent());
            }
        }
    }

    public final void b(VideoSink videoSink) {
        this.f19522h.a(videoSink);
    }

    public static final void a(SNSVideoChatController sNSVideoChatController, int i) {
        sNSVideoChatController.a(sNSVideoChatController.a(i));
    }

    public final void a(FocusStatus focusStatus) {
        com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, "handleFocusStatusChange: " + focusStatus, null, 4, null);
        boolean z10 = focusStatus instanceof FocusStatus.a;
        LocalAudioTrack localAudioTrack = this.f19523j;
        if (localAudioTrack != null) {
            localAudioTrack.enable(z10);
        }
        this.f19522h.a(z10);
    }

    public final LocalVideoTrack a(Context context) {
        if (this.f19524k != null) {
            com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, "startVideoTracking: video already started", null, 4, null);
            LocalVideoTrack localVideoTrack = this.f19524k;
            if (localVideoTrack != null) {
                return localVideoTrack;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
        CameraCapturerCompat cameraCapturerCompat = new CameraCapturerCompat();
        boolean a10 = cameraCapturerCompat.a(context, CameraCapturerCompat.Source.FRONT_CAMERA);
        com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, "startLocalVideoTracking: camera=" + cameraCapturerCompat.a(), null, 4, null);
        if (a10) {
            LocalVideoTrack create = LocalVideoTrack.create(context, true, cameraCapturerCompat, new VideoFormat(VideoDimensions.HD_1080P_VIDEO_DIMENSIONS, 24));
            if (create != null) {
                LocalParticipant localParticipant = this.f19526m;
                if (localParticipant != null) {
                    localParticipant.publishTrack(create);
                }
            } else {
                create = null;
            }
            this.f19524k = create;
        }
        if (this.f19524k == null) {
            Logger.e$default(com.sumsub.sns.internal.log.a.f17535a.a(LoggerType.KIBANA), SNSVideoIdent.logTag, "startLocalVideoTracking: error creating local video track", null, 4, null);
        }
        com.sumsub.sns.internal.videoident.videoident.chat.a aVar = new com.sumsub.sns.internal.videoident.videoident.chat.a(null);
        this.f19525l = aVar;
        aVar.a(new g());
        com.sumsub.sns.internal.videoident.videoident.chat.a aVar2 = this.f19525l;
        if (aVar2 != null) {
            aVar2.a(new h());
        }
        LocalVideoTrack localVideoTrack2 = this.f19524k;
        if (localVideoTrack2 != null) {
            return localVideoTrack2;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public final void a(VideoSink videoSink) {
        List sinks;
        LocalVideoTrack localVideoTrack = this.f19524k;
        if (localVideoTrack != null) {
            localVideoTrack.enable(true);
        }
        LocalVideoTrack localVideoTrack2 = this.f19524k;
        if (localVideoTrack2 != null && (sinks = localVideoTrack2.getSinks()) != null && sinks.contains(videoSink)) {
            com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, "bindLocalVideoView: already added", null, 4, null);
            return;
        }
        LocalVideoTrack localVideoTrack3 = this.f19524k;
        if (localVideoTrack3 != null) {
            localVideoTrack3.addSink(videoSink);
        }
    }

    public final void a(Context context, String str, String str2) {
        VideoCodec h264Codec;
        Map s10 = kotlin.collections.a.s(m.b(new Vp8Codec(), "vp8"), m.b(new H264Codec(), "h264"));
        com.sumsub.sns.internal.ff.a aVar = com.sumsub.sns.internal.ff.a.f16930a;
        String f10 = aVar.C().f();
        if (f10 == null) {
            f10 = aVar.C().b().c();
        }
        if (f10 != null) {
            AbstractC1244a a10 = x.a(false, 1, null);
            String b9 = ((com.sumsub.sns.internal.videoident.videoident.chat.h) a10.c(j3.e.B(a10.a(), kotlin.jvm.internal.h.d(com.sumsub.sns.internal.videoident.videoident.chat.h.class)), f10)).b();
            if (b9 == null || (h264Codec = (VideoCodec) s10.get(b9)) == null) {
                h264Codec = new H264Codec();
            }
            ConnectOptions.Builder preferVideoCodecs = new ConnectOptions.Builder(str).roomName(str2).preferVideoCodecs(i.l(a(h264Codec)));
            LocalAudioTrack localAudioTrack = this.f19523j;
            if (localAudioTrack != null) {
                preferVideoCodecs.audioTracks(i.l(localAudioTrack));
            }
            LocalDataTrack localDataTrack = this.i;
            if (localDataTrack != null) {
                preferVideoCodecs.dataTracks(i.l(localDataTrack));
            }
            LocalVideoTrack localVideoTrack = this.f19524k;
            if (localVideoTrack != null) {
                preferVideoCodecs.videoTracks(i.l(localVideoTrack));
            }
            ConnectOptions build = preferVideoCodecs.build();
            this.f19528o.setValue(SNSVideoChatState.b.f19558a);
            this.f19527n = Video.connect(context, build, this.f19536w);
            StringBuilder sb2 = new StringBuilder("connectToRoom: localDataTrack=");
            LocalDataTrack localDataTrack2 = this.i;
            sb2.append(localDataTrack2 != null ? localDataTrack2.getName() : null);
            com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, sb2.toString(), null, 4, null);
            return;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public final void a() {
        com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, "disconnect", null, 4, null);
        this.f19522h.g();
        Room room = this.f19527n;
        if (room != null) {
            room.disconnect();
        }
    }

    public final void a(String str) {
        List localDataTracks;
        LocalDataTrackPublication localDataTrackPublication;
        LocalDataTrack localDataTrack = this.i;
        if (localDataTrack != null) {
            LocalParticipant localParticipant = this.f19526m;
            LocalDataTrack localDataTrack2 = (localParticipant == null || (localDataTracks = localParticipant.getLocalDataTracks()) == null || (localDataTrackPublication = (LocalDataTrackPublication) s.J(localDataTracks)) == null) ? null : localDataTrackPublication.getLocalDataTrack();
            if (!kotlin.jvm.internal.f.b(this.i, localDataTrack2)) {
                com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, "sendMessage: published dt=" + localDataTrack2 + ", local dt=" + this.i, null, 4, null);
                Logger.w$default(com.sumsub.sns.internal.log.a.f17535a.a(LoggerType.KIBANA), SNSVideoIdent.logTag, "local data track changed", null, 4, null);
            }
            com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, s3.b.j("sendMessage: ", str), null, 4, null);
            localDataTrack.send(str);
        }
    }

    public final void a(com.sumsub.sns.internal.videoident.videoident.chat.b bVar) {
        if ((this.f19528o.getValue() instanceof SNSVideoChatState.d) && bVar.f()) {
            this.f19528o.setValue(new SNSVideoChatState.d(bVar.e(), bVar.h(), bVar.g(), false, 8, null));
        }
    }
}
