package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final String f4498a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f4499b;

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence f4500c;

    /* renamed from: d, reason: collision with root package name */
    public final CharSequence f4501d;

    /* renamed from: e, reason: collision with root package name */
    public final Bitmap f4502e;

    /* renamed from: f, reason: collision with root package name */
    public final Uri f4503f;

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f4504g;

    /* renamed from: h, reason: collision with root package name */
    public final Uri f4505h;
    public Object i;

    public static class a implements Parcelable.Creator<MediaDescriptionCompat> {
        @Override // android.os.Parcelable.Creator
        public final MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final MediaDescriptionCompat[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }
    }

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f4498a = str;
        this.f4499b = charSequence;
        this.f4500c = charSequence2;
        this.f4501d = charSequence3;
        this.f4502e = bitmap;
        this.f4503f = uri;
        this.f4504g = bundle;
        this.f4505h = uri2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.support.v4.media.MediaDescriptionCompat a(java.lang.Object r14) {
        /*
            r0 = 0
            if (r14 == 0) goto L5b
            r1 = r14
            android.media.MediaDescription r1 = (android.media.MediaDescription) r1
            java.lang.String r3 = r1.getMediaId()
            java.lang.CharSequence r4 = r1.getTitle()
            java.lang.CharSequence r5 = r1.getSubtitle()
            java.lang.CharSequence r6 = r1.getDescription()
            android.graphics.Bitmap r7 = r1.getIconBitmap()
            android.net.Uri r8 = r1.getIconUri()
            android.os.Bundle r2 = r1.getExtras()
            java.lang.String r9 = "android.support.v4.media.description.MEDIA_URI"
            if (r2 == 0) goto L30
            android.support.v4.media.session.MediaSessionCompat.a(r2)
            android.os.Parcelable r10 = r2.getParcelable(r9)
            android.net.Uri r10 = (android.net.Uri) r10
            goto L31
        L30:
            r10 = r0
        L31:
            if (r10 == 0) goto L4a
            java.lang.String r11 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r12 = r2.containsKey(r11)
            if (r12 == 0) goto L44
            int r12 = r2.size()
            r13 = 2
            if (r12 != r13) goto L44
            r9 = r0
            goto L4b
        L44:
            r2.remove(r9)
            r2.remove(r11)
        L4a:
            r9 = r2
        L4b:
            if (r10 == 0) goto L4e
            goto L53
        L4e:
            android.net.Uri r0 = r1.getMediaUri()
            r10 = r0
        L53:
            android.support.v4.media.MediaDescriptionCompat r0 = new android.support.v4.media.MediaDescriptionCompat
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r0.i = r14
        L5b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaDescriptionCompat.a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f4499b) + ", " + ((Object) this.f4500c) + ", " + ((Object) this.f4501d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Object obj = this.i;
        if (obj == null) {
            MediaDescription.Builder builder = new MediaDescription.Builder();
            builder.setMediaId(this.f4498a);
            builder.setTitle(this.f4499b);
            builder.setSubtitle(this.f4500c);
            builder.setDescription(this.f4501d);
            builder.setIconBitmap(this.f4502e);
            builder.setIconUri(this.f4503f);
            builder.setExtras(this.f4504g);
            builder.setMediaUri(this.f4505h);
            obj = builder.build();
            this.i = obj;
        }
        ((MediaDescription) obj).writeToParcel(parcel, i);
    }
}
