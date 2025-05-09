package com.squareup.picasso;

import android.net.Uri;
import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes2.dex */
public final class MediaStoreRequestHandler extends e {

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f13359b = {"orientation"};

    public enum PicassoKind {
        MICRO(3, 96, 96),
        MINI(1, 512, 384),
        FULL(2, -1, -1);


        /* renamed from: a, reason: collision with root package name */
        public final int f13364a;

        /* renamed from: b, reason: collision with root package name */
        public final int f13365b;

        /* renamed from: c, reason: collision with root package name */
        public final int f13366c;

        PicassoKind(int i, int i9, int i10) {
            this.f13364a = i;
            this.f13365b = i9;
            this.f13366c = i10;
        }
    }

    @Override // com.squareup.picasso.e, com.squareup.picasso.m
    public final boolean b(k kVar) {
        Uri uri = kVar.f13467c;
        return FirebaseAnalytics.Param.CONTENT.equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x003e, code lost:
    
        if (r1 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002d, code lost:
    
        if (r1 != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002f, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0032, code lost:
    
        r12 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c1  */
    @Override // com.squareup.picasso.e, com.squareup.picasso.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.squareup.picasso.m.a e(com.squareup.picasso.k r19, int r20) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.MediaStoreRequestHandler.e(com.squareup.picasso.k, int):com.squareup.picasso.m$a");
    }
}
