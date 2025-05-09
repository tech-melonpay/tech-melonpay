package z;

import androidx.camera.core.ExtendableBuilder;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.MutableConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.ReadableConfig;

/* compiled from: CaptureRequestOptions.java */
/* loaded from: classes.dex */
public class e implements ReadableConfig {

    /* renamed from: a, reason: collision with root package name */
    public final Config f31213a;

    /* compiled from: CaptureRequestOptions.java */
    public static final class a implements ExtendableBuilder<e> {

        /* renamed from: a, reason: collision with root package name */
        public final MutableOptionsBundle f31214a = MutableOptionsBundle.create();

        public static a b(Config config) {
            a aVar = new a();
            config.findOptions("camera2.captureRequest.option.", new B.e(11, aVar, config));
            return aVar;
        }

        @Override // androidx.camera.core.ExtendableBuilder
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e build() {
            return new e(OptionsBundle.from(this.f31214a));
        }

        @Override // androidx.camera.core.ExtendableBuilder
        public final MutableConfig getMutableConfig() {
            return this.f31214a;
        }
    }

    public e(Config config) {
        this.f31213a = config;
    }

    @Override // androidx.camera.core.impl.ReadableConfig
    public final Config getConfig() {
        return this.f31213a;
    }
}
