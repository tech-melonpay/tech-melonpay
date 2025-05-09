package androidx.camera.core.impl;

import androidx.camera.core.Logger;
import androidx.camera.core.impl.SessionConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class UseCaseAttachState {
    private static final String TAG = "UseCaseAttachState";
    private final Map<String, UseCaseAttachInfo> mAttachedUseCasesToInfoMap = new LinkedHashMap();
    private final String mCameraId;

    public interface AttachStateFilter {
        boolean filter(UseCaseAttachInfo useCaseAttachInfo);
    }

    public static final class UseCaseAttachInfo {
        private final SessionConfig mSessionConfig;
        private final UseCaseConfig<?> mUseCaseConfig;
        private boolean mAttached = false;
        private boolean mActive = false;

        public UseCaseAttachInfo(SessionConfig sessionConfig, UseCaseConfig<?> useCaseConfig) {
            this.mSessionConfig = sessionConfig;
            this.mUseCaseConfig = useCaseConfig;
        }

        public boolean getActive() {
            return this.mActive;
        }

        public boolean getAttached() {
            return this.mAttached;
        }

        public SessionConfig getSessionConfig() {
            return this.mSessionConfig;
        }

        public UseCaseConfig<?> getUseCaseConfig() {
            return this.mUseCaseConfig;
        }

        public void setActive(boolean z10) {
            this.mActive = z10;
        }

        public void setAttached(boolean z10) {
            this.mAttached = z10;
        }
    }

    public UseCaseAttachState(String str) {
        this.mCameraId = str;
    }

    private UseCaseAttachInfo getOrCreateUseCaseAttachInfo(String str, SessionConfig sessionConfig, UseCaseConfig<?> useCaseConfig) {
        UseCaseAttachInfo useCaseAttachInfo = this.mAttachedUseCasesToInfoMap.get(str);
        if (useCaseAttachInfo != null) {
            return useCaseAttachInfo;
        }
        UseCaseAttachInfo useCaseAttachInfo2 = new UseCaseAttachInfo(sessionConfig, useCaseConfig);
        this.mAttachedUseCasesToInfoMap.put(str, useCaseAttachInfo2);
        return useCaseAttachInfo2;
    }

    private Collection<SessionConfig> getSessionConfigs(AttachStateFilter attachStateFilter) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, UseCaseAttachInfo> entry : this.mAttachedUseCasesToInfoMap.entrySet()) {
            if (attachStateFilter == null || attachStateFilter.filter(entry.getValue())) {
                arrayList.add(entry.getValue().getSessionConfig());
            }
        }
        return arrayList;
    }

    private Collection<UseCaseConfig<?>> getUseCaseConfigs(AttachStateFilter attachStateFilter) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, UseCaseAttachInfo> entry : this.mAttachedUseCasesToInfoMap.entrySet()) {
            if (attachStateFilter == null || attachStateFilter.filter(entry.getValue())) {
                arrayList.add(entry.getValue().getUseCaseConfig());
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$getActiveAndAttachedSessionConfigs$2(UseCaseAttachInfo useCaseAttachInfo) {
        return useCaseAttachInfo.getActive() && useCaseAttachInfo.getAttached();
    }

    public SessionConfig.ValidatingBuilder getActiveAndAttachedBuilder() {
        SessionConfig.ValidatingBuilder validatingBuilder = new SessionConfig.ValidatingBuilder();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, UseCaseAttachInfo> entry : this.mAttachedUseCasesToInfoMap.entrySet()) {
            UseCaseAttachInfo value = entry.getValue();
            if (value.getActive() && value.getAttached()) {
                String key = entry.getKey();
                validatingBuilder.add(value.getSessionConfig());
                arrayList.add(key);
            }
        }
        Logger.d(TAG, "Active and attached use case: " + arrayList + " for camera: " + this.mCameraId);
        return validatingBuilder;
    }

    public Collection<SessionConfig> getActiveAndAttachedSessionConfigs() {
        return Collections.unmodifiableCollection(getSessionConfigs(new j(2)));
    }

    public SessionConfig.ValidatingBuilder getAttachedBuilder() {
        SessionConfig.ValidatingBuilder validatingBuilder = new SessionConfig.ValidatingBuilder();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, UseCaseAttachInfo> entry : this.mAttachedUseCasesToInfoMap.entrySet()) {
            UseCaseAttachInfo value = entry.getValue();
            if (value.getAttached()) {
                validatingBuilder.add(value.getSessionConfig());
                arrayList.add(entry.getKey());
            }
        }
        Logger.d(TAG, "All use case: " + arrayList + " for camera: " + this.mCameraId);
        return validatingBuilder;
    }

    public Collection<SessionConfig> getAttachedSessionConfigs() {
        return Collections.unmodifiableCollection(getSessionConfigs(new j(0)));
    }

    public Collection<UseCaseConfig<?>> getAttachedUseCaseConfigs() {
        return Collections.unmodifiableCollection(getUseCaseConfigs(new j(1)));
    }

    public boolean isUseCaseAttached(String str) {
        if (this.mAttachedUseCasesToInfoMap.containsKey(str)) {
            return this.mAttachedUseCasesToInfoMap.get(str).getAttached();
        }
        return false;
    }

    public void removeUseCase(String str) {
        this.mAttachedUseCasesToInfoMap.remove(str);
    }

    public void setUseCaseActive(String str, SessionConfig sessionConfig, UseCaseConfig<?> useCaseConfig) {
        getOrCreateUseCaseAttachInfo(str, sessionConfig, useCaseConfig).setActive(true);
    }

    public void setUseCaseAttached(String str, SessionConfig sessionConfig, UseCaseConfig<?> useCaseConfig) {
        getOrCreateUseCaseAttachInfo(str, sessionConfig, useCaseConfig).setAttached(true);
    }

    public void setUseCaseDetached(String str) {
        if (this.mAttachedUseCasesToInfoMap.containsKey(str)) {
            UseCaseAttachInfo useCaseAttachInfo = this.mAttachedUseCasesToInfoMap.get(str);
            useCaseAttachInfo.setAttached(false);
            if (useCaseAttachInfo.getActive()) {
                return;
            }
            this.mAttachedUseCasesToInfoMap.remove(str);
        }
    }

    public void setUseCaseInactive(String str) {
        if (this.mAttachedUseCasesToInfoMap.containsKey(str)) {
            UseCaseAttachInfo useCaseAttachInfo = this.mAttachedUseCasesToInfoMap.get(str);
            useCaseAttachInfo.setActive(false);
            if (useCaseAttachInfo.getAttached()) {
                return;
            }
            this.mAttachedUseCasesToInfoMap.remove(str);
        }
    }

    public void updateUseCase(String str, SessionConfig sessionConfig, UseCaseConfig<?> useCaseConfig) {
        if (this.mAttachedUseCasesToInfoMap.containsKey(str)) {
            UseCaseAttachInfo useCaseAttachInfo = new UseCaseAttachInfo(sessionConfig, useCaseConfig);
            UseCaseAttachInfo useCaseAttachInfo2 = this.mAttachedUseCasesToInfoMap.get(str);
            useCaseAttachInfo.setAttached(useCaseAttachInfo2.getAttached());
            useCaseAttachInfo.setActive(useCaseAttachInfo2.getActive());
            this.mAttachedUseCasesToInfoMap.put(str, useCaseAttachInfo);
        }
    }
}
