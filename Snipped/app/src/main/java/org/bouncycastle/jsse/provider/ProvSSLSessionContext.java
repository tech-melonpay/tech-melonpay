package org.bouncycastle.jsse.provider;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Logger;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;
import org.bouncycastle.tls.SessionID;
import org.bouncycastle.tls.crypto.TlsCrypto;

/* loaded from: classes.dex */
class ProvSSLSessionContext implements SSLSessionContext {
    private static final Logger LOG = Logger.getLogger(ProvSSLSessionContext.class.getName());
    private static final int provSessionCacheSize = PropertyUtils.getIntegerSystemProperty("javax.net.ssl.sessionCacheSize", 20480, 0, Integer.MAX_VALUE);
    protected final TlsCrypto crypto;
    protected final ProvSSLContextSpi sslContext;
    protected final Map<SessionID, SessionEntry> sessionsByID = new LinkedHashMap<SessionID, SessionEntry>(16, 0.75f, true) { // from class: org.bouncycastle.jsse.provider.ProvSSLSessionContext.1
        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<SessionID, SessionEntry> entry) {
            boolean z10 = ProvSSLSessionContext.this.sessionCacheSize > 0 && size() > ProvSSLSessionContext.this.sessionCacheSize;
            if (z10) {
                ProvSSLSessionContext.this.removeSessionByPeer(entry.getValue());
            }
            return z10;
        }
    };
    protected final Map<String, SessionEntry> sessionsByPeer = new HashMap();
    protected final ReferenceQueue<ProvSSLSession> sessionsQueue = new ReferenceQueue<>();
    protected int sessionCacheSize = provSessionCacheSize;
    protected int sessionTimeoutSeconds = 86400;

    public static final class SessionEntry extends SoftReference<ProvSSLSession> {
        private final String peerKey;
        private final SessionID sessionID;

        public SessionEntry(SessionID sessionID, ProvSSLSession provSSLSession, ReferenceQueue<ProvSSLSession> referenceQueue) {
            super(provSSLSession, referenceQueue);
            if (sessionID == null || provSSLSession == null || referenceQueue == null) {
                throw null;
            }
            this.sessionID = sessionID;
            this.peerKey = ProvSSLSessionContext.makePeerKey(provSSLSession);
        }

        public String getPeerKey() {
            return this.peerKey;
        }

        public SessionID getSessionID() {
            return this.sessionID;
        }
    }

    public ProvSSLSessionContext(ProvSSLContextSpi provSSLContextSpi, TlsCrypto tlsCrypto) {
        this.sslContext = provSSLContextSpi;
        this.crypto = tlsCrypto;
    }

    private ProvSSLSession accessSession(SessionEntry sessionEntry) {
        if (sessionEntry == null) {
            return null;
        }
        ProvSSLSession provSSLSession = sessionEntry.get();
        if (provSSLSession != null) {
            long currentTimeMillis = System.currentTimeMillis();
            if (!invalidateIfCreatedBefore(sessionEntry, getCreationTimeLimit(currentTimeMillis))) {
                provSSLSession.accessedAt(currentTimeMillis);
                return provSSLSession;
            }
        }
        removeSession(sessionEntry);
        return null;
    }

    private long getCreationTimeLimit(long j10) {
        int i = this.sessionTimeoutSeconds;
        if (i < 1) {
            return Long.MIN_VALUE;
        }
        return j10 - (i * 1000);
    }

    private boolean invalidateIfCreatedBefore(SessionEntry sessionEntry, long j10) {
        ProvSSLSession provSSLSession = sessionEntry.get();
        if (provSSLSession == null) {
            return true;
        }
        if (provSSLSession.getCreationTime() < j10) {
            provSSLSession.invalidate();
        }
        return !provSSLSession.isValid();
    }

    private static String makePeerKey(String str, int i) {
        if (str == null || i < 0) {
            return null;
        }
        return (str + ':' + Integer.toString(i)).toLowerCase(Locale.ENGLISH);
    }

    private static SessionID makeSessionID(byte[] bArr) {
        if (bArr == null || bArr.length < 1) {
            return null;
        }
        return new SessionID(bArr);
    }

    private static <K, V> void mapAdd(Map<K, V> map, K k3, V v10) {
        if (map == null || v10 == null) {
            throw null;
        }
        if (k3 != null) {
            map.put(k3, v10);
        }
    }

    private static <K, V> V mapGet(Map<K, V> map, K k3) {
        map.getClass();
        if (k3 == null) {
            return null;
        }
        return map.get(k3);
    }

    private static <K, V> V mapRemove(Map<K, V> map, K k3) {
        map.getClass();
        if (k3 == null) {
            return null;
        }
        return map.remove(k3);
    }

    private void processQueue() {
        int i = 0;
        while (true) {
            SessionEntry sessionEntry = (SessionEntry) this.sessionsQueue.poll();
            if (sessionEntry == null) {
                break;
            }
            removeSession(sessionEntry);
            i++;
        }
        if (i > 0) {
            LOG.fine("Processed " + i + " session entries (soft references) from the reference queue");
        }
    }

    private void removeAllExpiredSessions() {
        processQueue();
        long creationTimeLimit = getCreationTimeLimit(System.currentTimeMillis());
        Iterator<SessionEntry> it = this.sessionsByID.values().iterator();
        while (it.hasNext()) {
            SessionEntry next = it.next();
            if (invalidateIfCreatedBefore(next, creationTimeLimit)) {
                it.remove();
                removeSessionByPeer(next);
            }
        }
    }

    private void removeSession(SessionEntry sessionEntry) {
        mapRemove(this.sessionsByID, sessionEntry.getSessionID(), sessionEntry);
        removeSessionByPeer(sessionEntry);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean removeSessionByPeer(SessionEntry sessionEntry) {
        return mapRemove(this.sessionsByPeer, sessionEntry.getPeerKey(), sessionEntry);
    }

    public TlsCrypto getCrypto() {
        return this.crypto;
    }

    @Override // javax.net.ssl.SSLSessionContext
    public synchronized Enumeration<byte[]> getIds() {
        ArrayList arrayList;
        try {
            removeAllExpiredSessions();
            arrayList = new ArrayList(this.sessionsByID.size());
            Iterator<SessionID> it = this.sessionsByID.keySet().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getBytes());
            }
        } catch (Throwable th) {
            throw th;
        }
        return Collections.enumeration(arrayList);
    }

    public ProvSSLContextSpi getSSLContext() {
        return this.sslContext;
    }

    @Override // javax.net.ssl.SSLSessionContext
    public SSLSession getSession(byte[] bArr) {
        if (bArr != null) {
            return getSessionImpl(bArr);
        }
        throw new NullPointerException("'sessionID' cannot be null");
    }

    @Override // javax.net.ssl.SSLSessionContext
    public synchronized int getSessionCacheSize() {
        return this.sessionCacheSize;
    }

    public synchronized ProvSSLSession getSessionImpl(String str, int i) {
        ProvSSLSession accessSession;
        processQueue();
        SessionEntry sessionEntry = (SessionEntry) mapGet(this.sessionsByPeer, makePeerKey(str, i));
        accessSession = accessSession(sessionEntry);
        if (accessSession != null) {
            this.sessionsByID.get(sessionEntry.getSessionID());
        }
        return accessSession;
    }

    @Override // javax.net.ssl.SSLSessionContext
    public synchronized int getSessionTimeout() {
        return this.sessionTimeoutSeconds;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0045 A[Catch: all -> 0x0027, TRY_LEAVE, TryCatch #0 {all -> 0x0027, blocks: (B:3:0x0001, B:7:0x0020, B:11:0x0045, B:16:0x0029, B:18:0x0036, B:20:0x0018), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized org.bouncycastle.jsse.provider.ProvSSLSession reportSession(java.lang.String r10, int r11, org.bouncycastle.tls.TlsSession r12, org.bouncycastle.jsse.provider.JsseSessionParameters r13) {
        /*
            r9 = this;
            monitor-enter(r9)
            r9.processQueue()     // Catch: java.lang.Throwable -> L27
            byte[] r0 = r12.getSessionID()     // Catch: java.lang.Throwable -> L27
            org.bouncycastle.tls.SessionID r0 = makeSessionID(r0)     // Catch: java.lang.Throwable -> L27
            java.util.Map<org.bouncycastle.tls.SessionID, org.bouncycastle.jsse.provider.ProvSSLSessionContext$SessionEntry> r1 = r9.sessionsByID     // Catch: java.lang.Throwable -> L27
            java.lang.Object r1 = mapGet(r1, r0)     // Catch: java.lang.Throwable -> L27
            org.bouncycastle.jsse.provider.ProvSSLSessionContext$SessionEntry r1 = (org.bouncycastle.jsse.provider.ProvSSLSessionContext.SessionEntry) r1     // Catch: java.lang.Throwable -> L27
            if (r1 != 0) goto L18
            r2 = 0
            goto L1e
        L18:
            java.lang.Object r2 = r1.get()     // Catch: java.lang.Throwable -> L27
            org.bouncycastle.jsse.provider.ProvSSLSession r2 = (org.bouncycastle.jsse.provider.ProvSSLSession) r2     // Catch: java.lang.Throwable -> L27
        L1e:
            if (r2 == 0) goto L29
            org.bouncycastle.tls.TlsSession r3 = r2.getTlsSession()     // Catch: java.lang.Throwable -> L27
            if (r3 == r12) goto L43
            goto L29
        L27:
            r10 = move-exception
            goto L50
        L29:
            org.bouncycastle.jsse.provider.ProvSSLSession r8 = new org.bouncycastle.jsse.provider.ProvSSLSession     // Catch: java.lang.Throwable -> L27
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L42
            org.bouncycastle.jsse.provider.ProvSSLSessionContext$SessionEntry r1 = new org.bouncycastle.jsse.provider.ProvSSLSessionContext$SessionEntry     // Catch: java.lang.Throwable -> L27
            java.lang.ref.ReferenceQueue<org.bouncycastle.jsse.provider.ProvSSLSession> r10 = r9.sessionsQueue     // Catch: java.lang.Throwable -> L27
            r1.<init>(r0, r8, r10)     // Catch: java.lang.Throwable -> L27
            java.util.Map<org.bouncycastle.tls.SessionID, org.bouncycastle.jsse.provider.ProvSSLSessionContext$SessionEntry> r10 = r9.sessionsByID     // Catch: java.lang.Throwable -> L27
            r10.put(r0, r1)     // Catch: java.lang.Throwable -> L27
        L42:
            r2 = r8
        L43:
            if (r1 == 0) goto L4e
            java.util.Map<java.lang.String, org.bouncycastle.jsse.provider.ProvSSLSessionContext$SessionEntry> r10 = r9.sessionsByPeer     // Catch: java.lang.Throwable -> L27
            java.lang.String r11 = r1.getPeerKey()     // Catch: java.lang.Throwable -> L27
            mapAdd(r10, r11, r1)     // Catch: java.lang.Throwable -> L27
        L4e:
            monitor-exit(r9)
            return r2
        L50:
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jsse.provider.ProvSSLSessionContext.reportSession(java.lang.String, int, org.bouncycastle.tls.TlsSession, org.bouncycastle.jsse.provider.JsseSessionParameters):org.bouncycastle.jsse.provider.ProvSSLSession");
    }

    @Override // javax.net.ssl.SSLSessionContext
    public synchronized void setSessionCacheSize(int i) {
        int size;
        if (this.sessionCacheSize == i) {
            return;
        }
        if (i < 0) {
            throw new IllegalArgumentException("'size' cannot be < 0");
        }
        this.sessionCacheSize = i;
        removeAllExpiredSessions();
        if (this.sessionCacheSize > 0 && (size = this.sessionsByID.size()) > this.sessionCacheSize) {
            Iterator<SessionEntry> it = this.sessionsByID.values().iterator();
            for (size = this.sessionsByID.size(); it.hasNext() && size > this.sessionCacheSize; size--) {
                SessionEntry next = it.next();
                it.remove();
                removeSessionByPeer(next);
            }
        }
    }

    @Override // javax.net.ssl.SSLSessionContext
    public synchronized void setSessionTimeout(int i) {
        if (this.sessionTimeoutSeconds == i) {
            return;
        }
        if (i < 0) {
            throw new IllegalArgumentException("'seconds' cannot be < 0");
        }
        this.sessionTimeoutSeconds = i;
        removeAllExpiredSessions();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String makePeerKey(ProvSSLSession provSSLSession) {
        if (provSSLSession == null) {
            return null;
        }
        return makePeerKey(provSSLSession.getPeerHost(), provSSLSession.getPeerPort());
    }

    private static <K, V> boolean mapRemove(Map<K, V> map, K k3, V v10) {
        if (map == null || v10 == null) {
            throw null;
        }
        if (k3 == null) {
            return false;
        }
        V remove = map.remove(k3);
        if (remove == v10) {
            return true;
        }
        if (remove == null) {
            return false;
        }
        map.put(k3, remove);
        return false;
    }

    public synchronized ProvSSLSession getSessionImpl(byte[] bArr) {
        processQueue();
        return accessSession((SessionEntry) mapGet(this.sessionsByID, makeSessionID(bArr)));
    }

    public synchronized void removeSession(byte[] bArr) {
        SessionEntry sessionEntry = (SessionEntry) mapRemove(this.sessionsByID, makeSessionID(bArr));
        if (sessionEntry != null) {
            removeSessionByPeer(sessionEntry);
        }
    }
}
