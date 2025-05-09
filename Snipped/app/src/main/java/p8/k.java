package P8;

import android.os.Handler;
import android.os.Message;

/* compiled from: Utils.java */
/* loaded from: classes2.dex */
public final class k extends Handler {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        sendMessageDelayed(obtainMessage(), 1000L);
    }
}
