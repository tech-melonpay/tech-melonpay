package G;

import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import java.util.concurrent.Executor;

/* compiled from: Api29Impl.java */
/* loaded from: classes.dex */
public final class d {
    public static AudioRecordingConfiguration a(AudioRecord audioRecord) {
        return audioRecord.getActiveRecordingConfiguration();
    }

    public static boolean b(AudioRecordingConfiguration audioRecordingConfiguration) {
        return audioRecordingConfiguration.isClientSilenced();
    }

    public static void c(AudioRecord audioRecord, Executor executor, AudioManager.AudioRecordingCallback audioRecordingCallback) {
        audioRecord.registerAudioRecordingCallback(executor, audioRecordingCallback);
    }

    public static void d(AudioRecord audioRecord, AudioManager.AudioRecordingCallback audioRecordingCallback) {
        audioRecord.unregisterAudioRecordingCallback(audioRecordingCallback);
    }
}
