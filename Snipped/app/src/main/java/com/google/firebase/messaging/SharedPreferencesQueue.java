package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* loaded from: classes.dex */
final class SharedPreferencesQueue {
    private final SharedPreferences sharedPreferences;
    private final Executor syncExecutor;
    private final ArrayDeque<String> internalQueue = new ArrayDeque<>();
    private boolean bulkOperation = false;
    private final String queueName = "topic_operation_queue";
    private final String itemSeparator = ",";

    private SharedPreferencesQueue(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.sharedPreferences = sharedPreferences;
        this.syncExecutor = executor;
    }

    private boolean checkAndSyncState(boolean z10) {
        if (!z10 || this.bulkOperation) {
            return z10;
        }
        syncStateAsync();
        return true;
    }

    public static SharedPreferencesQueue createInstance(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        SharedPreferencesQueue sharedPreferencesQueue = new SharedPreferencesQueue(sharedPreferences, "topic_operation_queue", ",", executor);
        sharedPreferencesQueue.initQueue();
        return sharedPreferencesQueue;
    }

    private void initQueue() {
        synchronized (this.internalQueue) {
            try {
                this.internalQueue.clear();
                String string = this.sharedPreferences.getString(this.queueName, "");
                if (!TextUtils.isEmpty(string) && string.contains(this.itemSeparator)) {
                    String[] split = string.split(this.itemSeparator, -1);
                    if (split.length == 0) {
                        Log.e(Constants.TAG, "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : split) {
                        if (!TextUtils.isEmpty(str)) {
                            this.internalQueue.add(str);
                        }
                    }
                }
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void syncState() {
        synchronized (this.internalQueue) {
            this.sharedPreferences.edit().putString(this.queueName, serialize()).commit();
        }
    }

    private void syncStateAsync() {
        this.syncExecutor.execute(new Runnable() { // from class: com.google.firebase.messaging.SharedPreferencesQueue$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                SharedPreferencesQueue.this.syncState();
            }
        });
    }

    public boolean add(String str) {
        boolean add;
        if (TextUtils.isEmpty(str) || str.contains(this.itemSeparator)) {
            return false;
        }
        synchronized (this.internalQueue) {
            add = this.internalQueue.add(str);
            checkAndSyncState(add);
        }
        return add;
    }

    public String peek() {
        String peek;
        synchronized (this.internalQueue) {
            peek = this.internalQueue.peek();
        }
        return peek;
    }

    public boolean remove(Object obj) {
        boolean remove;
        synchronized (this.internalQueue) {
            remove = this.internalQueue.remove(obj);
            checkAndSyncState(remove);
        }
        return remove;
    }

    public String serialize() {
        StringBuilder sb2 = new StringBuilder();
        Iterator<String> it = this.internalQueue.iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            sb2.append(this.itemSeparator);
        }
        return sb2.toString();
    }
}
