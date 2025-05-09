package C;

import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.utils.AspectRatioUtil;
import androidx.camera.core.internal.utils.SizeUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: QualityRatioToResolutionsTable.java */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f570b;

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f571c;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f572a = new HashMap();

    /* compiled from: QualityRatioToResolutionsTable.java */
    public static abstract class a {
        public abstract int a();

        public abstract o b();
    }

    static {
        HashMap hashMap = new HashMap();
        f570b = hashMap;
        hashMap.put(o.f563d, Range.create(2160, 4319));
        hashMap.put(o.f562c, Range.create(1080, 1439));
        hashMap.put(o.f561b, Range.create(720, 1079));
        hashMap.put(o.f560a, Range.create(241, 719));
        HashMap hashMap2 = new HashMap();
        f571c = hashMap2;
        hashMap2.put(0, AspectRatioUtil.ASPECT_RATIO_4_3);
        hashMap2.put(1, AspectRatioUtil.ASPECT_RATIO_16_9);
    }

    public q(List list, HashMap hashMap) {
        HashMap hashMap2;
        Integer num;
        o oVar;
        HashMap hashMap3 = f570b;
        Iterator it = hashMap3.keySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            hashMap2 = f571c;
            if (!hasNext) {
                break;
            }
            o oVar2 = (o) it.next();
            this.f572a.put(new C0490f(oVar2, -1), new ArrayList());
            Iterator it2 = hashMap2.keySet().iterator();
            while (it2.hasNext()) {
                this.f572a.put(new C0490f(oVar2, ((Integer) it2.next()).intValue()), new ArrayList());
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            List list2 = (List) this.f572a.get(new C0490f((o) entry.getKey(), -1));
            Objects.requireNonNull(list2);
            list2.add((Size) entry.getValue());
        }
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            Size size = (Size) it3.next();
            Iterator it4 = hashMap3.entrySet().iterator();
            while (true) {
                num = null;
                if (!it4.hasNext()) {
                    oVar = null;
                    break;
                }
                Map.Entry entry2 = (Map.Entry) it4.next();
                if (((Range) entry2.getValue()).contains((Range) Integer.valueOf(size.getHeight()))) {
                    oVar = (o) entry2.getKey();
                    break;
                }
            }
            if (oVar != null) {
                Iterator it5 = hashMap2.entrySet().iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        break;
                    }
                    Map.Entry entry3 = (Map.Entry) it5.next();
                    if (AspectRatioUtil.hasMatchingAspectRatio(size, (Rational) entry3.getValue(), SizeUtil.RESOLUTION_QVGA)) {
                        num = (Integer) entry3.getKey();
                        break;
                    }
                }
                if (num != null) {
                    List list3 = (List) this.f572a.get(new C0490f(oVar, num.intValue()));
                    Objects.requireNonNull(list3);
                    list3.add(size);
                }
            }
        }
        for (Map.Entry entry4 : this.f572a.entrySet()) {
            Size size2 = (Size) hashMap.get(((a) entry4.getKey()).b());
            if (size2 != null) {
                Collections.sort((List) entry4.getValue(), new p(SizeUtil.getArea(size2), 0));
            }
        }
    }
}
