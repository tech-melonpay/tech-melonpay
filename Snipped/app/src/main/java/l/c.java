package L;

import H.k;
import J.x;
import android.os.Build;
import android.util.Range;
import android.util.Size;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import pa.C1124b;

/* compiled from: VideoEncoderInfoWrapper.java */
/* loaded from: classes.dex */
public final class c implements x {

    /* renamed from: a, reason: collision with root package name */
    public final x f2355a;

    /* renamed from: b, reason: collision with root package name */
    public final Range<Integer> f2356b;

    /* renamed from: c, reason: collision with root package name */
    public final Range<Integer> f2357c;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f2358d;

    public c(x xVar, Size size) {
        HashSet hashSet = new HashSet();
        this.f2358d = hashSet;
        this.f2355a = xVar;
        int a10 = xVar.a();
        this.f2356b = Range.create(Integer.valueOf(a10), Integer.valueOf(((int) Math.ceil(4096.0d / a10)) * a10));
        int e10 = xVar.e();
        this.f2357c = Range.create(Integer.valueOf(e10), Integer.valueOf(((int) Math.ceil(2160.0d / e10)) * e10));
        if (size != null) {
            hashSet.add(size);
        }
        List<String> list = k.f1370a;
        hashSet.addAll(k.f1370a.contains(Build.MODEL.toLowerCase(Locale.US)) ? Collections.singleton(new Size(1920, 1080)) : Collections.emptySet());
    }

    @Override // J.x
    public final int a() {
        return this.f2355a.a();
    }

    @Override // J.x
    public final Range<Integer> b() {
        return this.f2355a.b();
    }

    @Override // J.x
    public final Range<Integer> c(int i) {
        Integer valueOf = Integer.valueOf(i);
        Range<Integer> range = this.f2357c;
        boolean contains = range.contains((Range<Integer>) valueOf);
        x xVar = this.f2355a;
        C1124b.m(contains && i % xVar.e() == 0, "Not supported height: " + i + " which is not in " + range + " or can not be divided by alignment " + xVar.e());
        return this.f2356b;
    }

    @Override // J.x
    public final Range<Integer> d(int i) {
        Integer valueOf = Integer.valueOf(i);
        Range<Integer> range = this.f2356b;
        boolean contains = range.contains((Range<Integer>) valueOf);
        x xVar = this.f2355a;
        C1124b.m(contains && i % xVar.a() == 0, "Not supported width: " + i + " which is not in " + range + " or can not be divided by alignment " + xVar.a());
        return this.f2357c;
    }

    @Override // J.x
    public final int e() {
        return this.f2355a.e();
    }

    @Override // J.x
    public final Range<Integer> f() {
        return this.f2356b;
    }

    @Override // J.x
    public final boolean g(int i, int i9) {
        HashSet hashSet = this.f2358d;
        if (!hashSet.isEmpty() && hashSet.contains(new Size(i, i9))) {
            return true;
        }
        if (this.f2356b.contains((Range<Integer>) Integer.valueOf(i))) {
            if (this.f2357c.contains((Range<Integer>) Integer.valueOf(i9))) {
                x xVar = this.f2355a;
                if (i % xVar.a() == 0 && i9 % xVar.e() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // J.x
    public final Range<Integer> h() {
        return this.f2357c;
    }
}
