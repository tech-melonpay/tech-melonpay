package com.sumsub.sns.videoident.service;

import O9.p;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import androidx.lifecycle.C0552s;
import androidx.lifecycle.ServiceC0555v;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.internal.core.a;
import com.sumsub.sns.internal.core.common.SNSSession;
import com.sumsub.sns.internal.core.common.k0;
import com.sumsub.sns.internal.core.data.model.SNSMessage;
import com.sumsub.sns.internal.core.data.source.dynamic.b;
import com.sumsub.sns.internal.log.LoggerType;
import com.sumsub.sns.internal.videoident.videoident.SNSVideoIdent;
import com.sumsub.sns.internal.videoident.videoident.chat.SNSVideoChatController;
import com.sumsub.sns.internal.videoident.videoident.chat.SNSVideoChatState;
import j0.z;
import j3.e;
import k0.C0913a;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import sa.AbstractC1244a;
import t0.C1275b;

@Metadata(d1 = {"\u0000\u0087\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001>\u0018\u0000 E2\u00020\u0001:\u0001EB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\u0003J\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0012\u0010\u0003J\u0019\u0010\u0015\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u00020\u001b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010!\u001a\u00020\u001e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0006H\u0016¢\u0006\u0004\b#\u0010\u0003R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010'\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010-\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0017\u00100\u001a\u00020/8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R$\u00105\u001a\u00020\u001b2\u0006\u00104\u001a\u00020\u001b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b5\u00107R\u0018\u00109\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010<\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010D\u001a\u0004\u0018\u00010A8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bB\u0010C¨\u0006F"}, d2 = {"Lcom/sumsub/sns/videoident/service/SNSVideoChatService;", "Landroidx/lifecycle/v;", "<init>", "()V", "Lcom/sumsub/sns/internal/videoident/videoident/chat/SNSVideoChatState;", "state", "LO9/p;", "handleChatState", "(Lcom/sumsub/sns/internal/videoident/videoident/chat/SNSVideoChatState;)V", "registerDismissReceiver", "stopCallAndService", "doStopForeground", "unRegisterDismissReceiver", "", "message", "Landroid/app/Notification;", "createNotification", "(Ljava/lang/String;)Landroid/app/Notification;", "onCreate", "Landroid/content/Intent;", "rootIntent", "onTaskRemoved", "(Landroid/content/Intent;)V", "intent", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "", "onUnbind", "(Landroid/content/Intent;)Z", "", "flags", "startId", "onStartCommand", "(Landroid/content/Intent;II)I", "onDestroy", "Lcom/sumsub/sns/videoident/service/NotificationState;", "notificationState", "Lcom/sumsub/sns/videoident/service/NotificationState;", "notificationChannelName", "Ljava/lang/String;", "Lcom/sumsub/sns/internal/core/data/source/dynamic/b$c;", "strings", "Lcom/sumsub/sns/internal/core/data/source/dynamic/b$c;", "Lcom/sumsub/sns/internal/core/common/SNSSession;", "session", "Lcom/sumsub/sns/internal/core/common/SNSSession;", "Lcom/sumsub/sns/internal/videoident/videoident/chat/SNSVideoChatController;", "videoChatController", "Lcom/sumsub/sns/internal/videoident/videoident/chat/SNSVideoChatController;", "getVideoChatController", "()Lcom/sumsub/sns/internal/videoident/videoident/chat/SNSVideoChatController;", "<set-?>", "isInForeground", "Z", "()Z", "Lcom/sumsub/sns/videoident/service/SNSServiceBinder;", "binder", "Lcom/sumsub/sns/videoident/service/SNSServiceBinder;", "Landroid/content/BroadcastReceiver;", "dismissReceiver", "Landroid/content/BroadcastReceiver;", "com/sumsub/sns/videoident/service/SNSVideoChatService$activityLifecycleCallbacks$1", "activityLifecycleCallbacks", "Lcom/sumsub/sns/videoident/service/SNSVideoChatService$activityLifecycleCallbacks$1;", "Lcom/sumsub/sns/internal/core/a;", "getServiceLocator", "()Lcom/sumsub/sns/internal/core/a;", "serviceLocator", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SNSVideoChatService extends ServiceC0555v {
    public static final String ACTION_INTERNAL_CLOSE = "com.sumsub.sns.videoident.ACTION_INTERNAL_CLOSE";
    public static final String ACTION_START_FOREGROUND = "com.sumsub.sns.videoident.ACTION_START_FOREGROUND";
    public static final String NOTIFICATION_CHANNEL_ID = "video_identification_service";
    public static final int NOTIFICATION_ID = 11;
    public static final String SNS_EXTRA_SESSION = "sns_extra_session";
    private SNSServiceBinder binder;
    private BroadcastReceiver dismissReceiver;
    private boolean isInForeground;
    private SNSSession session;
    private NotificationState notificationState = NotificationState.NONE;
    private String notificationChannelName = "";
    private b.c strings = new b.c(null, null, 3, null);
    private final SNSVideoChatController videoChatController = new SNSVideoChatController();
    private final SNSVideoChatService$activityLifecycleCallbacks$1 activityLifecycleCallbacks = new Application.ActivityLifecycleCallbacks() { // from class: com.sumsub.sns.videoident.service.SNSVideoChatService$activityLifecycleCallbacks$1
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            a serviceLocator;
            if (activity instanceof k0) {
                serviceLocator = SNSVideoChatService.this.getServiceLocator();
                if (serviceLocator == null) {
                    if (SNSVideoChatService.this.getIsInForeground()) {
                        Logger.e$default(com.sumsub.sns.internal.log.a.f17535a.a(LoggerType.KIBANA), SNSVideoIdent.logTag, "can't get service locator instance", null, 4, null);
                        return;
                    }
                    return;
                }
                com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, "onActivityStarted: chatState=" + SNSVideoChatService.this.getVideoChatController().l().getValue(), null, 4, null);
                if (SNSVideoChatService.this.getVideoChatController().l().getValue() instanceof SNSVideoChatState.d) {
                    SNSVideoChatController videoChatController = SNSVideoChatService.this.getVideoChatController();
                    AbstractC1244a t3 = serviceLocator.t();
                    videoChatController.a(t3.b(e.B(t3.f27066b, h.d(SNSMessage.ClientMessage.UserVisibilityState.class)), SNSMessage.ClientMessage.UserVisibilityState.INSTANCE.b()));
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            a serviceLocator;
            if (activity instanceof k0) {
                serviceLocator = SNSVideoChatService.this.getServiceLocator();
                if (serviceLocator == null) {
                    if (SNSVideoChatService.this.getIsInForeground()) {
                        Logger.e$default(com.sumsub.sns.internal.log.a.f17535a.a(LoggerType.KIBANA), SNSVideoIdent.logTag, "can't get service locator instance", null, 4, null);
                        return;
                    }
                    return;
                }
                com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, "onActivityStopped: chatState=" + SNSVideoChatService.this.getVideoChatController().l().getValue(), null, 4, null);
                if (SNSVideoChatService.this.getVideoChatController().l().getValue() instanceof SNSVideoChatState.d) {
                    SNSVideoChatController videoChatController = SNSVideoChatService.this.getVideoChatController();
                    AbstractC1244a t3 = serviceLocator.t();
                    videoChatController.a(t3.b(e.B(t3.f27066b, h.d(SNSMessage.ClientMessage.UserVisibilityState.class)), SNSMessage.ClientMessage.UserVisibilityState.INSTANCE.a()));
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        }
    };

    /* JADX WARN: Removed duplicated region for block: B:139:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x05a9  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0674  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x068c  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x06a4 A[LOOP:6: B:202:0x069e->B:204:0x06a4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x06c0  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x06dc  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x01ef A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0337 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0459  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final android.app.Notification createNotification(java.lang.String r35) {
        /*
            Method dump skipped, instructions count: 1822
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.videoident.service.SNSVideoChatService.createNotification(java.lang.String):android.app.Notification");
    }

    private final void doStopForeground() {
        com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, "doStopForeground", null, 4, null);
        stopForeground(1);
        this.isInForeground = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a getServiceLocator() {
        SNSSession sNSSession = this.session;
        if (sNSSession != null) {
            return a.f14918z.a(getApplicationContext(), sNSSession);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingPermission"})
    public final void handleChatState(SNSVideoChatState state) {
        NotificationState notificationState;
        String message;
        if (getServiceLocator() == null) {
            if (this.isInForeground) {
                Logger.e$default(com.sumsub.sns.internal.log.a.f17535a.a(LoggerType.KIBANA), SNSVideoIdent.logTag, "can't get service locator instance", null, 4, null);
                return;
            }
            return;
        }
        if (state instanceof SNSVideoChatState.e) {
            notificationState = NotificationState.WAITING;
        } else if (state instanceof SNSVideoChatState.d) {
            notificationState = NotificationState.CALL;
        } else if ((state instanceof SNSVideoChatState.c) && this.isInForeground) {
            doStopForeground();
            notificationState = NotificationState.NONE;
        } else {
            notificationState = null;
        }
        if (notificationState == null || this.notificationState == notificationState) {
            return;
        }
        com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, "updating notification state=" + notificationState + ", isInForeground=" + this.isInForeground, null, 4, null);
        if (!this.isInForeground || notificationState == NotificationState.NONE) {
            return;
        }
        this.notificationState = notificationState;
        message = SNSVideoChatServiceKt.getMessage(notificationState, this.strings);
        Notification createNotification = createNotification(message);
        z zVar = new z(this);
        Bundle bundle = createNotification.extras;
        if (bundle == null || !bundle.getBoolean("android.support.useSideChannel")) {
            zVar.f22391a.notify(null, 11, createNotification);
            return;
        }
        z.a aVar = new z.a(getPackageName(), createNotification);
        synchronized (z.f22389e) {
            try {
                if (z.f22390f == null) {
                    z.f22390f = new z.c(getApplicationContext());
                }
                z.f22390f.f22399b.obtainMessage(0, aVar).sendToTarget();
            } catch (Throwable th) {
                throw th;
            }
        }
        zVar.f22391a.cancel(null, 11);
    }

    private final void registerDismissReceiver() {
        if (this.dismissReceiver != null) {
            return;
        }
        this.dismissReceiver = new BroadcastReceiver() { // from class: com.sumsub.sns.videoident.service.SNSVideoChatService$registerDismissReceiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, androidx.camera.core.impl.utils.a.n(new StringBuilder(), intent != null ? intent.getAction() : null, " received. Finishing..."), null, 4, null);
                if (!f.b(intent != null ? intent.getAction() : null, "com.sumsub.sns.intent.ACTION_CLOSE")) {
                    if (!f.b(intent != null ? intent.getAction() : null, SNSVideoChatService.ACTION_INTERNAL_CLOSE)) {
                        return;
                    }
                }
                SNSVideoChatService.this.stopCallAndService();
            }
        };
        Context applicationContext = getApplicationContext();
        BroadcastReceiver broadcastReceiver = this.dismissReceiver;
        IntentFilter intentFilter = new IntentFilter("com.sumsub.sns.intent.ACTION_CLOSE");
        intentFilter.addAction(ACTION_INTERNAL_CLOSE);
        p pVar = p.f3034a;
        C0913a.registerReceiver(applicationContext, broadcastReceiver, intentFilter, 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopCallAndService() {
        com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, "stopCallAndService", null, 4, null);
        this.videoChatController.a();
        doStopForeground();
        stopSelf();
    }

    private final void unRegisterDismissReceiver() {
        BroadcastReceiver broadcastReceiver = this.dismissReceiver;
        if (broadcastReceiver != null) {
            getApplicationContext().unregisterReceiver(broadcastReceiver);
            this.dismissReceiver = null;
        }
    }

    public final SNSVideoChatController getVideoChatController() {
        return this.videoChatController;
    }

    /* renamed from: isInForeground, reason: from getter */
    public final boolean getIsInForeground() {
        return this.isInForeground;
    }

    @Override // androidx.lifecycle.ServiceC0555v, android.app.Service
    public IBinder onBind(Intent intent) {
        super.onBind(intent);
        com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, "service bind, isInForeground=" + this.isInForeground, null, 4, null);
        SNSServiceBinder sNSServiceBinder = new SNSServiceBinder(this);
        this.binder = sNSServiceBinder;
        return sNSServiceBinder;
    }

    @Override // androidx.lifecycle.ServiceC0555v, android.app.Service
    @SuppressLint({"NewApi"})
    public void onCreate() {
        super.onCreate();
        com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, "service created", null, 4, null);
        registerDismissReceiver();
        Context applicationContext = getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(this.activityLifecycleCallbacks);
        }
        C0552s.a(this).b(new SNSVideoChatService$onCreate$1(this, null));
    }

    @Override // androidx.lifecycle.ServiceC0555v, android.app.Service
    public void onDestroy() {
        com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, "service destroyed, isInForeground=" + this.isInForeground, null, 4, null);
        unRegisterDismissReceiver();
        Context applicationContext = getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this.activityLifecycleCallbacks);
        }
        this.videoChatController.b();
        this.isInForeground = false;
        super.onDestroy();
    }

    @Override // androidx.lifecycle.ServiceC0555v, android.app.Service
    public int onStartCommand(Intent intent, int flags, int startId) {
        String message;
        super.onStartCommand(intent, flags, startId);
        com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, "service onStartCommand: " + intent, null, 4, null);
        if (!f.b(ACTION_START_FOREGROUND, intent != null ? intent.getAction() : null)) {
            return 2;
        }
        Bundle extras = intent.getExtras();
        this.session = extras != null ? (SNSSession) C1275b.a(extras, SNSSession.class, SNS_EXTRA_SESSION) : null;
        String a10 = this.strings.a("sns_videoident_state_followIntructions_title");
        if (a10 == null) {
            a10 = "Video Identification";
        }
        this.notificationChannelName = a10;
        NotificationState notificationState = NotificationState.WAITING;
        message = SNSVideoChatServiceKt.getMessage(notificationState, this.strings);
        Notification createNotification = createNotification(message);
        if (Build.VERSION.SDK_INT >= 30) {
            startForeground(11, createNotification, 128);
        } else {
            startForeground(11, createNotification);
        }
        this.notificationState = notificationState;
        this.isInForeground = true;
        return 2;
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent rootIntent) {
        com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, "service task removed: " + rootIntent, null, 4, null);
        stopCallAndService();
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, "service unBind, isInForeground=" + this.isInForeground, null, 4, null);
        this.binder = null;
        return super.onUnbind(intent);
    }
}
