package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* loaded from: classes.dex */
final class TopicsStore {
    private static WeakReference<TopicsStore> topicsStoreWeakReference;
    private final SharedPreferences sharedPreferences;
    private final Executor syncExecutor;
    private SharedPreferencesQueue topicOperationsQueue;

    private TopicsStore(SharedPreferences sharedPreferences, Executor executor) {
        this.syncExecutor = executor;
        this.sharedPreferences = sharedPreferences;
    }

    public static synchronized TopicsStore getInstance(Context context, Executor executor) {
        synchronized (TopicsStore.class) {
            try {
                WeakReference<TopicsStore> weakReference = topicsStoreWeakReference;
                TopicsStore topicsStore = weakReference != null ? weakReference.get() : null;
                if (topicsStore != null) {
                    return topicsStore;
                }
                TopicsStore topicsStore2 = new TopicsStore(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                topicsStore2.initStore();
                topicsStoreWeakReference = new WeakReference<>(topicsStore2);
                return topicsStore2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private synchronized void initStore() {
        this.topicOperationsQueue = SharedPreferencesQueue.createInstance(this.sharedPreferences, "topic_operation_queue", ",", this.syncExecutor);
    }

    public synchronized boolean addTopicOperation(TopicOperation topicOperation) {
        return this.topicOperationsQueue.add(topicOperation.serialize());
    }

    public synchronized TopicOperation getNextTopicOperation() {
        return TopicOperation.from(this.topicOperationsQueue.peek());
    }

    public synchronized boolean removeTopicOperation(TopicOperation topicOperation) {
        return this.topicOperationsQueue.remove(topicOperation.serialize());
    }
}
