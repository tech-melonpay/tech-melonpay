package com.sumsub.sns.videoident.presentation;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import ca.InterfaceC0635a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.sumsub.sns.internal.videoident.videoident.SNSVideoIdent;
import com.sumsub.sns.internal.videoident.videoident.chat.SNSVideoChatController;
import com.sumsub.sns.videoident.service.SNSServiceBinder;
import com.sumsub.sns.videoident.service.SNSVideoChatService;
import com.twilio.video.VideoView;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import tvi.webrtc.VideoSink;

@Metadata(d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\"\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R(\u0010\u0014\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00128F@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"com/sumsub/sns/videoident/presentation/SNSVideoIdentFragment$serviceConnection$1", "Landroid/content/ServiceConnection;", "Landroid/content/ComponentName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "Landroid/os/IBinder;", "binder", "LO9/p;", "onServiceConnected", "(Landroid/content/ComponentName;Landroid/os/IBinder;)V", "onServiceDisconnected", "(Landroid/content/ComponentName;)V", "", "connected", "Z", "getConnected", "()Z", "setConnected", "(Z)V", "Lcom/sumsub/sns/videoident/service/SNSVideoChatService;", "<set-?>", "service", "Lcom/sumsub/sns/videoident/service/SNSVideoChatService;", "getService", "()Lcom/sumsub/sns/videoident/service/SNSVideoChatService;", "Ljava/lang/ref/WeakReference;", "serviceReference", "Ljava/lang/ref/WeakReference;", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SNSVideoIdentFragment$serviceConnection$1 implements ServiceConnection {
    private boolean connected;
    private SNSVideoChatService service;
    private WeakReference<SNSVideoChatService> serviceReference;
    final /* synthetic */ SNSVideoIdentFragment this$0;

    public SNSVideoIdentFragment$serviceConnection$1(SNSVideoIdentFragment sNSVideoIdentFragment) {
        this.this$0 = sNSVideoIdentFragment;
    }

    public final boolean getConnected() {
        return this.connected;
    }

    public final SNSVideoChatService getService() {
        WeakReference<SNSVideoChatService> weakReference;
        if (this.connected && (weakReference = this.serviceReference) != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName name, IBinder binder) {
        SNSVideoChatController videoChatController;
        VideoView localVideoView;
        VideoView localVideoView2;
        String str;
        InterfaceC0635a interfaceC0635a;
        com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, "onServiceConnected", null, 4, null);
        if (binder instanceof SNSServiceBinder) {
            SNSServiceBinder sNSServiceBinder = (SNSServiceBinder) binder;
            this.serviceReference = sNSServiceBinder.getService();
            SNSVideoChatService sNSVideoChatService = sNSServiceBinder.getService().get();
            if (sNSVideoChatService == null || (videoChatController = sNSVideoChatService.getVideoChatController()) == null) {
                return;
            }
            SNSVideoIdentFragment sNSVideoIdentFragment = this.this$0;
            this.connected = true;
            com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, "onServiceConnected: connected", null, 4, null);
            sNSVideoIdentFragment.attachChatControllerListeners(videoChatController);
            localVideoView = sNSVideoIdentFragment.getLocalVideoView();
            if (localVideoView == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            videoChatController.a(localVideoView);
            localVideoView2 = sNSVideoIdentFragment.getLocalVideoView();
            if (localVideoView2 == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            videoChatController.a((VideoSink) localVideoView2);
            str = sNSVideoIdentFragment.currentCameraId;
            if (str != null) {
                SNSVideoChatController.CameraId c2 = videoChatController.c();
                if (!f.b(c2 != null ? c2.getValue() : null, str)) {
                    sNSVideoIdentFragment.switchCameraAndUpdateMirroring();
                }
                sNSVideoIdentFragment.currentCameraId = null;
            }
            sNSVideoIdentFragment.handleState(sNSVideoIdentFragment.getViewModel().c(), (Bundle) null);
            interfaceC0635a = sNSVideoIdentFragment.startServiceAndConnectToRoom;
            if (interfaceC0635a != null) {
                interfaceC0635a.invoke();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName name) {
        SNSVideoChatService sNSVideoChatService;
        com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, "onServiceDisconnected", null, 4, null);
        this.connected = false;
        WeakReference<SNSVideoChatService> weakReference = this.serviceReference;
        if (weakReference != null && (sNSVideoChatService = weakReference.get()) != null) {
            this.this$0.detachChatControllerListeners(sNSVideoChatService.getVideoChatController());
        }
        this.serviceReference = null;
    }

    public final void setConnected(boolean z10) {
        this.connected = z10;
    }
}
