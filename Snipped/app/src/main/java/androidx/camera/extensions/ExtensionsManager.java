package androidx.camera.extensions;

import androidx.camera.core.CameraProvider;
import androidx.camera.core.Logger;
import androidx.camera.extensions.impl.InitializerImpl;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* loaded from: classes.dex */
public final class ExtensionsManager {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f5439a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static ExtensionsManager f5440b;

    /* renamed from: androidx.camera.extensions.ExtensionsManager$1, reason: invalid class name */
    class AnonymousClass1 implements InitializerImpl.OnExtensionsInitializedCallback {
        final /* synthetic */ CameraProvider val$cameraProvider;
        final /* synthetic */ CallbackToFutureAdapter.a val$completer;

        public AnonymousClass1(CallbackToFutureAdapter.a aVar, CameraProvider cameraProvider) {
            this.val$completer = aVar;
            this.val$cameraProvider = cameraProvider;
        }

        public void onFailure(int i) {
            Logger.e("ExtensionsManager", "Failed to initialize extensions");
            CallbackToFutureAdapter.a aVar = this.val$completer;
            ExtensionsAvailability extensionsAvailability = ExtensionsAvailability.LIBRARY_AVAILABLE;
            aVar.b(ExtensionsManager.a());
        }

        public void onSuccess() {
            Logger.d("ExtensionsManager", "Successfully initialized extensions");
            CallbackToFutureAdapter.a aVar = this.val$completer;
            ExtensionsAvailability extensionsAvailability = ExtensionsAvailability.LIBRARY_AVAILABLE;
            aVar.b(ExtensionsManager.a());
        }
    }

    /* renamed from: androidx.camera.extensions.ExtensionsManager$2, reason: invalid class name */
    class AnonymousClass2 implements InitializerImpl.OnExtensionsDeinitializedCallback {
        final /* synthetic */ CallbackToFutureAdapter.a val$completer;

        public AnonymousClass2(CallbackToFutureAdapter.a aVar) {
            this.val$completer = aVar;
        }

        public void onFailure(int i) {
            this.val$completer.c(new Exception("Failed to deinitialize extensions."));
        }

        public void onSuccess() {
            this.val$completer.b(null);
        }
    }

    public enum ExtensionsAvailability {
        LIBRARY_AVAILABLE,
        LIBRARY_UNAVAILABLE_ERROR_LOADING,
        LIBRARY_UNAVAILABLE_MISSING_IMPLEMENTATION,
        NONE
    }

    public static ExtensionsManager a() {
        synchronized (f5439a) {
            try {
                ExtensionsManager extensionsManager = f5440b;
                if (extensionsManager != null) {
                    return extensionsManager;
                }
                ExtensionsManager extensionsManager2 = new ExtensionsManager();
                f5440b = extensionsManager2;
                return extensionsManager2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
