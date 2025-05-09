package com.google.firebase.heartbeatinfo;

import android.content.Context;
import android.content.SharedPreferences;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class HeartBeatInfoStorage {
    private static final SimpleDateFormat FORMATTER = new SimpleDateFormat("dd/MM/yyyy z");
    private static final String GLOBAL = "fire-global";
    private static final int HEART_BEAT_COUNT_LIMIT = 200;
    private static final String HEART_BEAT_COUNT_TAG = "fire-count";
    private static final String PREFERENCES_NAME = "FirebaseAppHeartBeat";
    private static final String STORAGE_PREFERENCES_NAME = "FirebaseAppHeartBeatStorage";
    private static HeartBeatInfoStorage instance;
    private final SharedPreferences heartBeatSharedPreferences;
    private final SharedPreferences sharedPreferences;

    private HeartBeatInfoStorage(Context context) {
        this.sharedPreferences = context.getSharedPreferences(PREFERENCES_NAME, 0);
        this.heartBeatSharedPreferences = context.getSharedPreferences(STORAGE_PREFERENCES_NAME, 0);
    }

    private synchronized void cleanUpStoredHeartBeats() {
        try {
            long j10 = this.sharedPreferences.getLong(HEART_BEAT_COUNT_TAG, 0L);
            ArrayList arrayList = new ArrayList();
            Iterator<Map.Entry<String, ?>> it = this.heartBeatSharedPreferences.getAll().entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(Long.valueOf(Long.parseLong(it.next().getKey())));
            }
            Collections.sort(arrayList);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                this.heartBeatSharedPreferences.edit().remove(String.valueOf((Long) it2.next())).apply();
                j10--;
                this.sharedPreferences.edit().putLong(HEART_BEAT_COUNT_TAG, j10).apply();
                if (j10 <= 100) {
                    return;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static synchronized HeartBeatInfoStorage getInstance(Context context) {
        HeartBeatInfoStorage heartBeatInfoStorage;
        synchronized (HeartBeatInfoStorage.class) {
            try {
                if (instance == null) {
                    instance = new HeartBeatInfoStorage(context);
                }
                heartBeatInfoStorage = instance;
            } catch (Throwable th) {
                throw th;
            }
        }
        return heartBeatInfoStorage;
    }

    public static boolean isSameDateUtc(long j10, long j11) {
        Date date = new Date(j10);
        Date date2 = new Date(j11);
        SimpleDateFormat simpleDateFormat = FORMATTER;
        return !simpleDateFormat.format(date).equals(simpleDateFormat.format(date2));
    }

    public synchronized void clearStoredHeartBeats() {
        this.heartBeatSharedPreferences.edit().clear().apply();
        this.sharedPreferences.edit().remove(HEART_BEAT_COUNT_TAG).apply();
    }

    public int getHeartBeatCount() {
        return (int) this.sharedPreferences.getLong(HEART_BEAT_COUNT_TAG, 0L);
    }

    public synchronized long getLastGlobalHeartBeat() {
        return this.sharedPreferences.getLong(GLOBAL, -1L);
    }

    public synchronized List<SdkHeartBeatResult> getStoredHeartBeats(boolean z10) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (Map.Entry<String, ?> entry : this.heartBeatSharedPreferences.getAll().entrySet()) {
                arrayList.add(SdkHeartBeatResult.create((String) entry.getValue(), Long.parseLong(entry.getKey())));
            }
            Collections.sort(arrayList);
            if (z10) {
                clearStoredHeartBeats();
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public synchronized boolean shouldSendGlobalHeartBeat(long j10) {
        return shouldSendSdkHeartBeat(GLOBAL, j10);
    }

    public synchronized boolean shouldSendSdkHeartBeat(String str, long j10) {
        if (!this.sharedPreferences.contains(str)) {
            this.sharedPreferences.edit().putLong(str, j10).apply();
            return true;
        }
        if (!isSameDateUtc(this.sharedPreferences.getLong(str, -1L), j10)) {
            return false;
        }
        this.sharedPreferences.edit().putLong(str, j10).apply();
        return true;
    }

    public synchronized void storeHeartBeatInformation(String str, long j10) {
        long j11 = this.sharedPreferences.getLong(HEART_BEAT_COUNT_TAG, 0L);
        this.heartBeatSharedPreferences.edit().putString(String.valueOf(j10), str).apply();
        long j12 = j11 + 1;
        this.sharedPreferences.edit().putLong(HEART_BEAT_COUNT_TAG, j12).apply();
        if (j12 > 200) {
            cleanUpStoredHeartBeats();
        }
    }

    public synchronized void updateGlobalHeartBeat(long j10) {
        this.sharedPreferences.edit().putLong(GLOBAL, j10).apply();
    }

    public HeartBeatInfoStorage(SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2) {
        this.sharedPreferences = sharedPreferences;
        this.heartBeatSharedPreferences = sharedPreferences2;
    }
}
