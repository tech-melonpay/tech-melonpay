package Ka;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import ka.C0969n;

/* compiled from: JvmOkio.kt */
/* loaded from: classes2.dex */
public final class x extends b {

    /* renamed from: m, reason: collision with root package name */
    public final Socket f2345m;

    public x(Socket socket) {
        this.f2345m = socket;
    }

    @Override // Ka.b
    public final IOException k(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // Ka.b
    public final void l() {
        String message;
        Socket socket = this.f2345m;
        try {
            socket.close();
        } catch (AssertionError e10) {
            Logger logger = p.f2319a;
            if (e10.getCause() == null || (message = e10.getMessage()) == null || !C0969n.Y(message, "getsockname failed", false)) {
                throw e10;
            }
            p.f2319a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e10);
        } catch (Exception e11) {
            p.f2319a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e11);
        }
    }
}
