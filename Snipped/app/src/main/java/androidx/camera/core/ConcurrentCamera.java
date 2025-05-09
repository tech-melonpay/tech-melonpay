package androidx.camera.core;

import java.util.List;

/* loaded from: classes.dex */
public class ConcurrentCamera {
    private List<Camera> mCameras;

    public static final class SingleCameraConfig {
        private CameraSelector mCameraSelector;
        private androidx.lifecycle.r mLifecycleOwner;
        private UseCaseGroup mUseCaseGroup;

        public SingleCameraConfig(CameraSelector cameraSelector, UseCaseGroup useCaseGroup, androidx.lifecycle.r rVar) {
            this.mCameraSelector = cameraSelector;
            this.mUseCaseGroup = useCaseGroup;
            this.mLifecycleOwner = rVar;
        }

        public CameraSelector getCameraSelector() {
            return this.mCameraSelector;
        }

        public androidx.lifecycle.r getLifecycleOwner() {
            return this.mLifecycleOwner;
        }

        public UseCaseGroup getUseCaseGroup() {
            return this.mUseCaseGroup;
        }
    }

    public ConcurrentCamera(List<Camera> list) {
        this.mCameras = list;
    }

    public List<Camera> getCameras() {
        return this.mCameras;
    }
}
