package com.squareup.picasso;

import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import com.google.firebase.analytics.FirebaseAnalytics;

/* compiled from: ContactsPhotoRequestHandler.java */
/* loaded from: classes2.dex */
public final class d extends m {

    /* renamed from: b, reason: collision with root package name */
    public static final UriMatcher f13437b;

    /* renamed from: a, reason: collision with root package name */
    public final Context f13438a;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f13437b = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "display_photo/#", 4);
    }

    public d(Context context) {
        this.f13438a = context;
    }

    @Override // com.squareup.picasso.m
    public final boolean b(k kVar) {
        Uri uri = kVar.f13467c;
        return FirebaseAnalytics.Param.CONTENT.equals(uri.getScheme()) && ContactsContract.Contacts.CONTENT_URI.getHost().equals(uri.getHost()) && f13437b.match(kVar.f13467c) != -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    @Override // com.squareup.picasso.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.squareup.picasso.m.a e(com.squareup.picasso.k r5, int r6) {
        /*
            r4 = this;
            android.content.Context r6 = r4.f13438a
            android.content.ContentResolver r6 = r6.getContentResolver()
            android.net.Uri r5 = r5.f13467c
            android.content.UriMatcher r0 = com.squareup.picasso.d.f13437b
            int r0 = r0.match(r5)
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L2d
            r3 = 2
            if (r0 == r3) goto L28
            r3 = 3
            if (r0 == r3) goto L35
            r2 = 4
            if (r0 != r2) goto L1c
            goto L28
        L1c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Invalid uri: "
            java.lang.String r5 = com.google.android.gms.measurement.internal.a.h(r0, r5)
            r6.<init>(r5)
            throw r6
        L28:
            java.io.InputStream r5 = r6.openInputStream(r5)
            goto L39
        L2d:
            android.net.Uri r5 = android.provider.ContactsContract.Contacts.lookupContact(r6, r5)
            if (r5 != 0) goto L35
            r5 = r1
            goto L39
        L35:
            java.io.InputStream r5 = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(r6, r5, r2)
        L39:
            if (r5 != 0) goto L3c
            return r1
        L3c:
            com.squareup.picasso.m$a r6 = new com.squareup.picasso.m$a
            Ka.d r5 = Ja.a.C(r5)
            com.squareup.picasso.Picasso$LoadedFrom r0 = com.squareup.picasso.Picasso.LoadedFrom.DISK
            r6.<init>(r5, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.d.e(com.squareup.picasso.k, int):com.squareup.picasso.m$a");
    }
}
