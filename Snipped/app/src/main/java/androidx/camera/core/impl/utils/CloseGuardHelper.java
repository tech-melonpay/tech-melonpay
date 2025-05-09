package androidx.camera.core.impl.utils;

import android.os.Build;
import android.util.CloseGuard;
import pa.C1124b;

/* loaded from: classes.dex */
public final class CloseGuardHelper {
    private final CloseGuardImpl mImpl;

    public static final class CloseGuardApi30Impl implements CloseGuardImpl {
        private final CloseGuard mPlatformImpl = new CloseGuard();

        @Override // androidx.camera.core.impl.utils.CloseGuardHelper.CloseGuardImpl
        public void close() {
            this.mPlatformImpl.close();
        }

        @Override // androidx.camera.core.impl.utils.CloseGuardHelper.CloseGuardImpl
        public void open(String str) {
            this.mPlatformImpl.open(str);
        }

        @Override // androidx.camera.core.impl.utils.CloseGuardHelper.CloseGuardImpl
        public void warnIfOpen() {
            this.mPlatformImpl.warnIfOpen();
        }
    }

    public interface CloseGuardImpl {
        void close();

        void open(String str);

        void warnIfOpen();
    }

    private CloseGuardHelper(CloseGuardImpl closeGuardImpl) {
        this.mImpl = closeGuardImpl;
    }

    public static CloseGuardHelper create() {
        return Build.VERSION.SDK_INT >= 30 ? new CloseGuardHelper(new CloseGuardApi30Impl()) : new CloseGuardHelper(new CloseGuardNoOpImpl());
    }

    public void close() {
        this.mImpl.close();
    }

    public void open(String str) {
        this.mImpl.open(str);
    }

    public void warnIfOpen() {
        this.mImpl.warnIfOpen();
    }

    public static final class CloseGuardNoOpImpl implements CloseGuardImpl {
        @Override // androidx.camera.core.impl.utils.CloseGuardHelper.CloseGuardImpl
        public void open(String str) {
            C1124b.p(str, "CloseMethodName must not be null.");
        }

        @Override // androidx.camera.core.impl.utils.CloseGuardHelper.CloseGuardImpl
        public void close() {
        }

        @Override // androidx.camera.core.impl.utils.CloseGuardHelper.CloseGuardImpl
        public void warnIfOpen() {
        }
    }
}
