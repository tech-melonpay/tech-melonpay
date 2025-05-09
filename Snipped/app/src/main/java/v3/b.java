package v3;

import java.util.logging.Logger;

/* compiled from: MetadataParser.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f30563b = Logger.getLogger(b.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final boolean f30564a = false;

    /* JADX WARN: Removed duplicated region for block: B:31:0x0066 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List a(java.io.InputStream r8) {
        /*
            r7 = this;
            java.util.logging.Logger r0 = v3.b.f30563b
            java.lang.String r1 = "Error closing input stream (ignored)"
            if (r8 != 0) goto L19
            boolean r8 = r7.f30564a
            if (r8 != 0) goto L11
            java.util.List r8 = java.util.Collections.emptyList()
            java.util.List r8 = (java.util.List) r8
            return r8
        L11:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Source cannot be null"
            r8.<init>(r0)
            throw r8
        L19:
            r2 = 0
            java.io.ObjectInputStream r3 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L4d
            r3.<init>(r8)     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L4d
            com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadataCollection r2 = new com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadataCollection     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46
            r2.<init>()     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46
            r2.readExternal(r3)     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46
            java.util.ArrayList r4 = r2.f10498a     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46
            if (r4 != 0) goto L3c
            java.util.ArrayList r8 = r2.f10498a     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46
            r3.close()     // Catch: java.io.IOException -> L35
            goto L3b
        L35:
            r2 = move-exception
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            r0.log(r3, r1, r2)
        L3b:
            return r8
        L3c:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46
            java.lang.String r4 = "Empty metadata"
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46
            throw r2     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46
        L44:
            r2 = move-exception
            goto L59
        L46:
            r2 = move-exception
            goto L51
        L48:
            r3 = move-exception
            r6 = r3
            r3 = r2
            r2 = r6
            goto L59
        L4d:
            r3 = move-exception
            r6 = r3
            r3 = r2
            r2 = r6
        L51:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L44
            java.lang.String r5 = "Unable to parse metadata file"
            r4.<init>(r5, r2)     // Catch: java.lang.Throwable -> L44
            throw r4     // Catch: java.lang.Throwable -> L44
        L59:
            if (r3 == 0) goto L66
            r3.close()     // Catch: java.io.IOException -> L5f
            goto L70
        L5f:
            r8 = move-exception
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            r0.log(r3, r1, r8)
            goto L70
        L66:
            r8.close()     // Catch: java.io.IOException -> L6a
            goto L70
        L6a:
            r8 = move-exception
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            r0.log(r3, r1, r8)
        L70:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: v3.b.a(java.io.InputStream):java.util.List");
    }
}
