package va;

import okhttp3.p;
import okio.ByteString;

/* compiled from: WebSocketListener.kt */
/* loaded from: classes2.dex */
public abstract class m {
    public abstract void onClosed(l lVar, int i, String str);

    public abstract void onFailure(l lVar, Throwable th, p pVar);

    public abstract void onMessage(l lVar, String str);

    public void onMessage(l lVar, ByteString byteString) {
    }

    public abstract void onOpen(l lVar, p pVar);

    public void onClosing(l lVar, int i, String str) {
    }
}
