package f;

import P9.l;
import P9.n;
import P9.z;
import android.content.Context;
import android.content.Intent;
import f.AbstractC0728a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import k0.C0913a;
import kotlin.Pair;

/* compiled from: ActivityResultContracts.kt */
/* loaded from: classes.dex */
public final class f extends AbstractC0728a<String[], Map<String, Boolean>> {
    @Override // f.AbstractC0728a
    public final Intent createIntent(Context context, String[] strArr) {
        return new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
    }

    @Override // f.AbstractC0728a
    public final AbstractC0728a.C0395a<Map<String, Boolean>> getSynchronousResult(Context context, String[] strArr) {
        String[] strArr2 = strArr;
        if (strArr2.length == 0) {
            return new AbstractC0728a.C0395a<>((Serializable) kotlin.collections.a.p());
        }
        for (String str : strArr2) {
            if (C0913a.checkSelfPermission(context, str) != 0) {
                return null;
            }
        }
        int n10 = z.n(strArr2.length);
        if (n10 < 16) {
            n10 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(n10);
        for (String str2 : strArr2) {
            linkedHashMap.put(str2, Boolean.TRUE);
        }
        return new AbstractC0728a.C0395a<>(linkedHashMap);
    }

    @Override // f.AbstractC0728a
    public final Map<String, Boolean> parseResult(int i, Intent intent) {
        if (i != -1) {
            return kotlin.collections.a.p();
        }
        if (intent == null) {
            return kotlin.collections.a.p();
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return kotlin.collections.a.p();
        }
        ArrayList arrayList = new ArrayList(intArrayExtra.length);
        for (int i9 : intArrayExtra) {
            arrayList.add(Boolean.valueOf(i9 == 0));
        }
        ArrayList o10 = l.o(stringArrayExtra);
        Iterator it = o10.iterator();
        Iterator it2 = arrayList.iterator();
        ArrayList arrayList2 = new ArrayList(Math.min(n.u(o10, 10), n.u(arrayList, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList2.add(new Pair(it.next(), it2.next()));
        }
        return kotlin.collections.a.v(arrayList2);
    }
}
