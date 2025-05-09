package j0;

import android.app.Notification;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.os.Build;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import j0.E;
import java.util.Iterator;
import java.util.Set;

/* compiled from: NotificationCompatBuilder.java */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final Context f22381a;

    /* renamed from: b, reason: collision with root package name */
    public final Notification.Builder f22382b;

    /* renamed from: c, reason: collision with root package name */
    public final r f22383c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f22384d;

    /* renamed from: e, reason: collision with root package name */
    public final int f22385e;

    /* compiled from: NotificationCompatBuilder.java */
    public static class a {
        public static void a(Notification.Builder builder, Person person) {
            builder.addPerson(person);
        }

        public static void b(Notification.Action.Builder builder, int i) {
            builder.setSemanticAction(i);
        }
    }

    /* compiled from: NotificationCompatBuilder.java */
    public static class b {
        public static void a(Notification.Builder builder, boolean z10) {
            builder.setAllowSystemGeneratedContextualActions(z10);
        }

        public static void b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            builder.setBubbleMetadata(bubbleMetadata);
        }

        public static void c(Notification.Action.Builder builder, boolean z10) {
            builder.setContextual(z10);
        }

        public static void d(Notification.Builder builder, Object obj) {
            builder.setLocusId((LocusId) obj);
        }
    }

    /* compiled from: NotificationCompatBuilder.java */
    public static class c {
        public static void a(Notification.Action.Builder builder, boolean z10) {
            builder.setAuthenticationRequired(z10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:159:0x0477  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public x(j0.r r23) {
        /*
            Method dump skipped, instructions count: 1216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.x.<init>(j0.r):void");
    }

    public final void a(m mVar) {
        IconCompat a10 = mVar.a();
        Notification.Action.Builder builder = new Notification.Action.Builder(a10 != null ? a10.f(null) : null, mVar.i, mVar.f22286j);
        E[] eArr = mVar.f22280c;
        if (eArr != null) {
            RemoteInput[] remoteInputArr = new RemoteInput[eArr.length];
            for (int i = 0; i < eArr.length; i++) {
                E e10 = eArr[i];
                RemoteInput.Builder addExtras = new RemoteInput.Builder(e10.f22236a).setLabel(e10.f22237b).setChoices(e10.f22238c).setAllowFreeFormInput(e10.f22239d).addExtras(e10.f22241f);
                Set<String> set = e10.f22242g;
                if (set != null) {
                    Iterator<String> it = set.iterator();
                    while (it.hasNext()) {
                        addExtras.setAllowDataType(it.next(), true);
                    }
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    E.a.b(addExtras, e10.f22240e);
                }
                remoteInputArr[i] = addExtras.build();
            }
            for (RemoteInput remoteInput : remoteInputArr) {
                builder.addRemoteInput(remoteInput);
            }
        }
        Bundle bundle = mVar.f22278a;
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        boolean z10 = mVar.f22281d;
        bundle2.putBoolean("android.support.allowGeneratedReplies", z10);
        int i9 = Build.VERSION.SDK_INT;
        builder.setAllowGeneratedReplies(z10);
        int i10 = mVar.f22283f;
        bundle2.putInt("android.support.action.semanticAction", i10);
        if (i9 >= 28) {
            a.b(builder, i10);
        }
        if (i9 >= 29) {
            b.c(builder, mVar.f22284g);
        }
        if (i9 >= 31) {
            c.a(builder, mVar.f22287k);
        }
        bundle2.putBoolean("android.support.action.showsUserInterface", mVar.f22282e);
        builder.addExtras(bundle2);
        this.f22382b.addAction(builder.build());
    }
}
