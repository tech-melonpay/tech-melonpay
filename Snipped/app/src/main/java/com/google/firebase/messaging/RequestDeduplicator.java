package com.google.firebase.messaging;

import android.util.Log;
import androidx.collection.a;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* loaded from: classes.dex */
class RequestDeduplicator {
    private final Executor executor;
    private final Map<String, Task<String>> getTokenRequests = new a();

    /* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
    public interface GetTokenRequest {
        Task<String> start();
    }

    public RequestDeduplicator(Executor executor) {
        this.executor = executor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized Task<String> getOrStartGetTokenRequest(final String str, GetTokenRequest getTokenRequest) {
        try {
            Task<String> task = this.getTokenRequests.get(str);
            if (task != null) {
                if (Log.isLoggable(Constants.TAG, 3)) {
                    String valueOf = String.valueOf(str);
                    Log.d(Constants.TAG, valueOf.length() != 0 ? "Joining ongoing request for: ".concat(valueOf) : new String("Joining ongoing request for: "));
                }
                return task;
            }
            if (Log.isLoggable(Constants.TAG, 3)) {
                String valueOf2 = String.valueOf(str);
                Log.d(Constants.TAG, valueOf2.length() != 0 ? "Making new request for: ".concat(valueOf2) : new String("Making new request for: "));
            }
            Task continueWithTask = getTokenRequest.start().continueWithTask(this.executor, new Continuation() { // from class: com.google.firebase.messaging.RequestDeduplicator$$ExternalSyntheticLambda0
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task2) {
                    RequestDeduplicator.this.m31x7161fc54(str, task2);
                    return task2;
                }
            });
            this.getTokenRequests.put(str, continueWithTask);
            return continueWithTask;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: lambda$getOrStartGetTokenRequest$0$com-google-firebase-messaging-RequestDeduplicator, reason: not valid java name */
    public /* synthetic */ Task m31x7161fc54(String str, Task task) {
        synchronized (this) {
            this.getTokenRequests.remove(str);
        }
        return task;
    }
}
