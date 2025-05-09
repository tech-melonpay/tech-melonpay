package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import m1.AbstractC1025a;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC1025a abstractC1025a) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        Object obj = remoteActionCompat.f6481a;
        if (abstractC1025a.h(1)) {
            obj = abstractC1025a.m();
        }
        remoteActionCompat.f6481a = (IconCompat) obj;
        CharSequence charSequence = remoteActionCompat.f6482b;
        if (abstractC1025a.h(2)) {
            charSequence = abstractC1025a.g();
        }
        remoteActionCompat.f6482b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f6483c;
        if (abstractC1025a.h(3)) {
            charSequence2 = abstractC1025a.g();
        }
        remoteActionCompat.f6483c = charSequence2;
        Parcelable parcelable = remoteActionCompat.f6484d;
        if (abstractC1025a.h(4)) {
            parcelable = abstractC1025a.k();
        }
        remoteActionCompat.f6484d = (PendingIntent) parcelable;
        boolean z10 = remoteActionCompat.f6485e;
        if (abstractC1025a.h(5)) {
            z10 = abstractC1025a.e();
        }
        remoteActionCompat.f6485e = z10;
        boolean z11 = remoteActionCompat.f6486f;
        if (abstractC1025a.h(6)) {
            z11 = abstractC1025a.e();
        }
        remoteActionCompat.f6486f = z11;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC1025a abstractC1025a) {
        abstractC1025a.getClass();
        IconCompat iconCompat = remoteActionCompat.f6481a;
        abstractC1025a.n(1);
        abstractC1025a.v(iconCompat);
        CharSequence charSequence = remoteActionCompat.f6482b;
        abstractC1025a.n(2);
        abstractC1025a.q(charSequence);
        CharSequence charSequence2 = remoteActionCompat.f6483c;
        abstractC1025a.n(3);
        abstractC1025a.q(charSequence2);
        PendingIntent pendingIntent = remoteActionCompat.f6484d;
        abstractC1025a.n(4);
        abstractC1025a.t(pendingIntent);
        boolean z10 = remoteActionCompat.f6485e;
        abstractC1025a.n(5);
        abstractC1025a.o(z10);
        boolean z11 = remoteActionCompat.f6486f;
        abstractC1025a.n(6);
        abstractC1025a.o(z11);
    }
}
