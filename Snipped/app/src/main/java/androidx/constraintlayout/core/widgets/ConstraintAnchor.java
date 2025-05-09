package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import com.sumsub.sns.internal.core.data.model.p;
import d0.j;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class ConstraintAnchor {

    /* renamed from: b, reason: collision with root package name */
    public int f5987b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5988c;

    /* renamed from: d, reason: collision with root package name */
    public final ConstraintWidget f5989d;

    /* renamed from: e, reason: collision with root package name */
    public final Type f5990e;

    /* renamed from: f, reason: collision with root package name */
    public ConstraintAnchor f5991f;
    public SolverVariable i;

    /* renamed from: a, reason: collision with root package name */
    public HashSet<ConstraintAnchor> f5986a = null;

    /* renamed from: g, reason: collision with root package name */
    public int f5992g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f5993h = Integer.MIN_VALUE;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Type {

        /* renamed from: a, reason: collision with root package name */
        public static final Type f5994a;

        /* renamed from: b, reason: collision with root package name */
        public static final Type f5995b;

        /* renamed from: c, reason: collision with root package name */
        public static final Type f5996c;

        /* renamed from: d, reason: collision with root package name */
        public static final Type f5997d;

        /* renamed from: e, reason: collision with root package name */
        public static final Type f5998e;

        /* renamed from: f, reason: collision with root package name */
        public static final Type f5999f;

        /* renamed from: g, reason: collision with root package name */
        public static final Type f6000g;

        /* renamed from: h, reason: collision with root package name */
        public static final Type f6001h;
        public static final /* synthetic */ Type[] i;

        /* JADX INFO: Fake field, exist only in values array */
        Type EF0;

        static {
            Type type = new Type("NONE", 0);
            Type type2 = new Type("LEFT", 1);
            f5994a = type2;
            Type type3 = new Type("TOP", 2);
            f5995b = type3;
            Type type4 = new Type("RIGHT", 3);
            f5996c = type4;
            Type type5 = new Type("BOTTOM", 4);
            f5997d = type5;
            Type type6 = new Type("BASELINE", 5);
            f5998e = type6;
            Type type7 = new Type("CENTER", 6);
            f5999f = type7;
            Type type8 = new Type("CENTER_X", 7);
            f6000g = type8;
            Type type9 = new Type("CENTER_Y", 8);
            f6001h = type9;
            i = new Type[]{type, type2, type3, type4, type5, type6, type7, type8, type9};
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) i.clone();
        }
    }

    public ConstraintAnchor(ConstraintWidget constraintWidget, Type type) {
        this.f5989d = constraintWidget;
        this.f5990e = type;
    }

    public final void a(ConstraintAnchor constraintAnchor, int i) {
        b(constraintAnchor, i, Integer.MIN_VALUE, false);
    }

    public final boolean b(ConstraintAnchor constraintAnchor, int i, int i9, boolean z10) {
        if (constraintAnchor == null) {
            j();
            return true;
        }
        if (!z10 && !i(constraintAnchor)) {
            return false;
        }
        this.f5991f = constraintAnchor;
        if (constraintAnchor.f5986a == null) {
            constraintAnchor.f5986a = new HashSet<>();
        }
        HashSet<ConstraintAnchor> hashSet = this.f5991f.f5986a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f5992g = i;
        this.f5993h = i9;
        return true;
    }

    public final void c(int i, j jVar, ArrayList arrayList) {
        HashSet<ConstraintAnchor> hashSet = this.f5986a;
        if (hashSet != null) {
            Iterator<ConstraintAnchor> it = hashSet.iterator();
            while (it.hasNext()) {
                d0.g.a(it.next().f5989d, i, arrayList, jVar);
            }
        }
    }

    public final int d() {
        if (this.f5988c) {
            return this.f5987b;
        }
        return 0;
    }

    public final int e() {
        ConstraintAnchor constraintAnchor;
        if (this.f5989d.f6038j0 == 8) {
            return 0;
        }
        int i = this.f5993h;
        return (i == Integer.MIN_VALUE || (constraintAnchor = this.f5991f) == null || constraintAnchor.f5989d.f6038j0 != 8) ? this.f5992g : i;
    }

    public final ConstraintAnchor f() {
        Type type = this.f5990e;
        int ordinal = type.ordinal();
        ConstraintWidget constraintWidget = this.f5989d;
        switch (ordinal) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return constraintWidget.f6014M;
            case 2:
                return constraintWidget.f6015N;
            case 3:
                return constraintWidget.f6012K;
            case 4:
                return constraintWidget.f6013L;
            default:
                throw new AssertionError(type.name());
        }
    }

    public final boolean g() {
        HashSet<ConstraintAnchor> hashSet = this.f5986a;
        if (hashSet == null) {
            return false;
        }
        Iterator<ConstraintAnchor> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f5991f != null;
    }

    public final boolean i(ConstraintAnchor constraintAnchor) {
        if (constraintAnchor == null) {
            return false;
        }
        Type type = Type.f5998e;
        Type type2 = this.f5990e;
        ConstraintWidget constraintWidget = constraintAnchor.f5989d;
        Type type3 = constraintAnchor.f5990e;
        if (type3 == type2) {
            return type2 != type || (constraintWidget.f6007F && this.f5989d.f6007F);
        }
        int ordinal = type2.ordinal();
        Type type4 = Type.f5996c;
        Type type5 = Type.f5994a;
        Type type6 = Type.f6001h;
        Type type7 = Type.f6000g;
        switch (ordinal) {
            case 0:
            case 7:
            case 8:
                return false;
            case 1:
            case 3:
                boolean z10 = type3 == type5 || type3 == type4;
                if (constraintWidget instanceof f) {
                    return z10 || type3 == type7;
                }
                return z10;
            case 2:
            case 4:
                boolean z11 = type3 == Type.f5995b || type3 == Type.f5997d;
                if (constraintWidget instanceof f) {
                    return z11 || type3 == type6;
                }
                return z11;
            case 5:
                return (type3 == type5 || type3 == type4) ? false : true;
            case 6:
                return (type3 == type || type3 == type7 || type3 == type6) ? false : true;
            default:
                throw new AssertionError(type2.name());
        }
    }

    public final void j() {
        HashSet<ConstraintAnchor> hashSet;
        ConstraintAnchor constraintAnchor = this.f5991f;
        if (constraintAnchor != null && (hashSet = constraintAnchor.f5986a) != null) {
            hashSet.remove(this);
            if (this.f5991f.f5986a.size() == 0) {
                this.f5991f.f5986a = null;
            }
        }
        this.f5986a = null;
        this.f5991f = null;
        this.f5992g = 0;
        this.f5993h = Integer.MIN_VALUE;
        this.f5988c = false;
        this.f5987b = 0;
    }

    public final void k() {
        SolverVariable solverVariable = this.i;
        if (solverVariable == null) {
            this.i = new SolverVariable(SolverVariable.Type.f5946a);
        } else {
            solverVariable.d();
        }
    }

    public final void l(int i) {
        this.f5987b = i;
        this.f5988c = true;
    }

    public final String toString() {
        return this.f5989d.f6040k0 + p.f15541a + this.f5990e.toString();
    }
}
