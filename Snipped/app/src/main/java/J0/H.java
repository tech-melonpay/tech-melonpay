package j0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import k0.C0913a;

/* compiled from: TaskStackBuilder.java */
/* loaded from: classes.dex */
public final class H implements Iterable<Intent> {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<Intent> f22243a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    public final Context f22244b;

    /* compiled from: TaskStackBuilder.java */
    public interface a {
        Intent getSupportParentActivityIntent();
    }

    public H(Context context) {
        this.f22244b = context;
    }

    public final void a(ComponentName componentName) {
        Context context = this.f22244b;
        ArrayList<Intent> arrayList = this.f22243a;
        int size = arrayList.size();
        try {
            for (Intent b9 = l.b(context, componentName); b9 != null; b9 = l.b(context, b9.getComponent())) {
                arrayList.add(size, b9);
            }
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e10);
        }
    }

    public final void b() {
        ArrayList<Intent> arrayList = this.f22243a;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        Context context = this.f22244b;
        if (C0913a.startActivities(context, intentArr, null)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    @Override // java.lang.Iterable
    @Deprecated
    public final Iterator<Intent> iterator() {
        return this.f22243a.iterator();
    }
}
