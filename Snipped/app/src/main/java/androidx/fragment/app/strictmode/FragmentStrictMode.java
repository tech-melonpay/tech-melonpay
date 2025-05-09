package androidx.fragment.app.strictmode;

import B6.d;
import P9.s;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.fragment.app.Fragment;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.f;

/* compiled from: FragmentStrictMode.kt */
/* loaded from: classes.dex */
public final class FragmentStrictMode {

    /* renamed from: a, reason: collision with root package name */
    public static final a f6888a = a.f6898c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FragmentStrictMode.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/fragment/app/strictmode/FragmentStrictMode$Flag;", "", "fragment_release"}, k = 1, mv = {1, 8, 0})
    public static final class Flag {

        /* renamed from: a, reason: collision with root package name */
        public static final Flag f6889a;

        /* renamed from: b, reason: collision with root package name */
        public static final Flag f6890b;

        /* renamed from: c, reason: collision with root package name */
        public static final Flag f6891c;

        /* renamed from: d, reason: collision with root package name */
        public static final Flag f6892d;

        /* renamed from: e, reason: collision with root package name */
        public static final Flag f6893e;

        /* renamed from: f, reason: collision with root package name */
        public static final Flag f6894f;

        /* renamed from: g, reason: collision with root package name */
        public static final Flag f6895g;

        /* renamed from: h, reason: collision with root package name */
        public static final Flag f6896h;
        public static final Flag i;

        /* renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ Flag[] f6897j;

        static {
            Flag flag = new Flag("PENALTY_LOG", 0);
            f6889a = flag;
            Flag flag2 = new Flag("PENALTY_DEATH", 1);
            f6890b = flag2;
            Flag flag3 = new Flag("DETECT_FRAGMENT_REUSE", 2);
            f6891c = flag3;
            Flag flag4 = new Flag("DETECT_FRAGMENT_TAG_USAGE", 3);
            f6892d = flag4;
            Flag flag5 = new Flag("DETECT_WRONG_NESTED_HIERARCHY", 4);
            f6893e = flag5;
            Flag flag6 = new Flag("DETECT_RETAIN_INSTANCE_USAGE", 5);
            f6894f = flag6;
            Flag flag7 = new Flag("DETECT_SET_USER_VISIBLE_HINT", 6);
            f6895g = flag7;
            Flag flag8 = new Flag("DETECT_TARGET_FRAGMENT_USAGE", 7);
            f6896h = flag8;
            Flag flag9 = new Flag("DETECT_WRONG_FRAGMENT_CONTAINER", 8);
            i = flag9;
            f6897j = new Flag[]{flag, flag2, flag3, flag4, flag5, flag6, flag7, flag8, flag9};
        }

        public Flag() {
            throw null;
        }

        public static Flag valueOf(String str) {
            return (Flag) Enum.valueOf(Flag.class, str);
        }

        public static Flag[] values() {
            return (Flag[]) f6897j.clone();
        }
    }

    /* compiled from: FragmentStrictMode.kt */
    public static final class a {

        /* renamed from: c, reason: collision with root package name */
        public static final a f6898c = new a(EmptySet.f23106a, kotlin.collections.a.p());

        /* renamed from: a, reason: collision with root package name */
        public final Set<Flag> f6899a;

        /* renamed from: b, reason: collision with root package name */
        public final LinkedHashMap f6900b;

        public a(EmptySet emptySet, Map map) {
            this.f6899a = emptySet;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ((EmptySet) map.entrySet()).getClass();
            this.f6900b = linkedHashMap;
        }
    }

    public static a a(Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded()) {
                fragment.getParentFragmentManager();
            }
            fragment = fragment.getParentFragment();
        }
        return f6888a;
    }

    public static void b(a aVar, Violation violation) {
        Fragment fragment = violation.f6901a;
        String name = fragment.getClass().getName();
        Flag flag = Flag.f6889a;
        Set<Flag> set = aVar.f6899a;
        if (set.contains(flag)) {
            Log.d("FragmentStrictMode", "Policy violation in ".concat(name), violation);
        }
        if (set.contains(Flag.f6890b)) {
            d dVar = new d(23, name, violation);
            if (!fragment.isAdded()) {
                dVar.run();
                throw null;
            }
            Handler handler = fragment.getParentFragmentManager().f6755x.f6870c;
            if (f.b(handler.getLooper(), Looper.myLooper())) {
                dVar.run();
                throw null;
            }
            handler.post(dVar);
        }
    }

    public static void c(Violation violation) {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(violation.f6901a.getClass().getName()), violation);
        }
    }

    public static final void d(Fragment fragment, String str) {
        FragmentReuseViolation fragmentReuseViolation = new FragmentReuseViolation(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + str);
        c(fragmentReuseViolation);
        a a10 = a(fragment);
        if (a10.f6899a.contains(Flag.f6891c) && e(a10, fragment.getClass(), FragmentReuseViolation.class)) {
            b(a10, fragmentReuseViolation);
        }
    }

    public static boolean e(a aVar, Class cls, Class cls2) {
        Set set = (Set) aVar.f6900b.get(cls.getName());
        if (set == null) {
            return true;
        }
        if (f.b(cls2.getSuperclass(), Violation.class) || !s.E(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }
}
