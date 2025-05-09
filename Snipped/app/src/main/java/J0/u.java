package j0;

import android.app.Notification;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: NotificationCompat.java */
/* loaded from: classes.dex */
public final class u extends w {

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList<CharSequence> f22366e = new ArrayList<>();

    @Override // j0.w
    public final void b(x xVar) {
        Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(xVar.f22382b).setBigContentTitle(this.f22378b);
        if (this.f22380d) {
            bigContentTitle.setSummaryText(this.f22379c);
        }
        Iterator<CharSequence> it = this.f22366e.iterator();
        while (it.hasNext()) {
            bigContentTitle.addLine(it.next());
        }
    }

    @Override // j0.w
    public final void c(Bundle bundle) {
        super.c(bundle);
        bundle.remove("android.textLines");
    }

    @Override // j0.w
    public final String d() {
        return "androidx.core.app.NotificationCompat$InboxStyle";
    }

    @Override // j0.w
    public final void e(Bundle bundle) {
        super.e(bundle);
        ArrayList<CharSequence> arrayList = this.f22366e;
        arrayList.clear();
        if (bundle.containsKey("android.textLines")) {
            Collections.addAll(arrayList, bundle.getCharSequenceArray("android.textLines"));
        }
    }
}
