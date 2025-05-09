package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.fragment.app.w;
import androidx.lifecycle.Lifecycle;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: BackStackRecord.java */
/* renamed from: androidx.fragment.app.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0527a extends w implements FragmentManager.o {

    /* renamed from: r, reason: collision with root package name */
    public final FragmentManager f6838r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f6839s;

    /* renamed from: t, reason: collision with root package name */
    public int f6840t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f6841u;

    public C0527a(FragmentManager fragmentManager) {
        fragmentManager.L();
        l<?> lVar = fragmentManager.f6755x;
        if (lVar != null) {
            lVar.f6869b.getClassLoader();
        }
        this.f6840t = -1;
        this.f6841u = false;
        this.f6838r = fragmentManager;
    }

    @Override // androidx.fragment.app.FragmentManager.o
    public final boolean a(ArrayList<C0527a> arrayList, ArrayList<Boolean> arrayList2) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f6925g) {
            return true;
        }
        this.f6838r.f6736d.add(this);
        return true;
    }

    @Override // androidx.fragment.app.w
    public final void d(int i, Fragment fragment, String str, int i9) {
        String str2 = fragment.mPreviousWho;
        if (str2 != null) {
            FragmentStrictMode.d(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = fragment.mTag;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb2 = new StringBuilder("Can't change tag of fragment ");
                sb2.append(fragment);
                sb2.append(": was ");
                throw new IllegalStateException(s3.b.n(sb2, fragment.mTag, " now ", str));
            }
            fragment.mTag = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i10 = fragment.mFragmentId;
            if (i10 != 0 && i10 != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i);
            }
            fragment.mFragmentId = i;
            fragment.mContainerId = i;
        }
        b(new w.a(fragment, i9));
        fragment.mFragmentManager = this.f6838r;
    }

    public final void f(int i) {
        if (this.f6925g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            ArrayList<w.a> arrayList = this.f6919a;
            int size = arrayList.size();
            for (int i9 = 0; i9 < size; i9++) {
                w.a aVar = arrayList.get(i9);
                Fragment fragment = aVar.f6936b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f6936b + " to " + aVar.f6936b.mBackStackNesting);
                    }
                }
            }
        }
    }

    public final void g() {
        ArrayList<w.a> arrayList = this.f6919a;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            w.a aVar = arrayList.get(size);
            if (aVar.f6937c) {
                if (aVar.f6935a == 8) {
                    aVar.f6937c = false;
                    arrayList.remove(size - 1);
                    size--;
                } else {
                    int i = aVar.f6936b.mContainerId;
                    aVar.f6935a = 2;
                    aVar.f6937c = false;
                    for (int i9 = size - 1; i9 >= 0; i9--) {
                        w.a aVar2 = arrayList.get(i9);
                        if (aVar2.f6937c && aVar2.f6936b.mContainerId == i) {
                            arrayList.remove(i9);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    public final int h() {
        return i(false, true);
    }

    public final int i(boolean z10, boolean z11) {
        if (this.f6839s) {
            throw new IllegalStateException("commit already called");
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new F());
            k("  ", printWriter, true);
            printWriter.close();
        }
        this.f6839s = true;
        boolean z12 = this.f6925g;
        FragmentManager fragmentManager = this.f6838r;
        if (z12) {
            this.f6840t = fragmentManager.f6742k.getAndIncrement();
        } else {
            this.f6840t = -1;
        }
        if (z11) {
            fragmentManager.z(this, z10);
        }
        return this.f6840t;
    }

    public final void j() {
        if (this.f6925g) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f6926h = false;
        this.f6838r.C(this, false);
    }

    public final void k(String str, PrintWriter printWriter, boolean z10) {
        String str2;
        if (z10) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.i);
            printWriter.print(" mIndex=");
            printWriter.print(this.f6840t);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f6839s);
            if (this.f6924f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f6924f));
            }
            if (this.f6920b != 0 || this.f6921c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f6920b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f6921c));
            }
            if (this.f6922d != 0 || this.f6923e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f6922d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f6923e));
            }
            if (this.f6927j != 0 || this.f6928k != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f6927j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f6928k);
            }
            if (this.f6929l != 0 || this.f6930m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f6929l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f6930m);
            }
        }
        ArrayList<w.a> arrayList = this.f6919a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            w.a aVar = arrayList.get(i);
            switch (aVar.f6935a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.f6935a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f6936b);
            if (z10) {
                if (aVar.f6938d != 0 || aVar.f6939e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f6938d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f6939e));
                }
                if (aVar.f6940f != 0 || aVar.f6941g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f6940f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f6941g));
                }
            }
        }
    }

    public final C0527a l(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f6838r) {
            b(new w.a(fragment, 3));
            return this;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public final C0527a m(Fragment fragment, Lifecycle.State state) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        FragmentManager fragmentManager2 = this.f6838r;
        if (fragmentManager != fragmentManager2) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + fragmentManager2);
        }
        if (state == Lifecycle.State.f6976b && fragment.mState > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + state + " after the Fragment has been created");
        }
        if (state == Lifecycle.State.f6975a) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + state + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
        }
        w.a aVar = new w.a();
        aVar.f6935a = 10;
        aVar.f6936b = fragment;
        aVar.f6937c = false;
        aVar.f6942h = fragment.mMaxState;
        aVar.i = state;
        b(aVar);
        return this;
    }

    public final C0527a n(Fragment fragment) {
        FragmentManager fragmentManager;
        if (fragment == null || (fragmentManager = fragment.mFragmentManager) == null || fragmentManager == this.f6838r) {
            b(new w.a(fragment, 8));
            return this;
        }
        throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f6840t >= 0) {
            sb2.append(" #");
            sb2.append(this.f6840t);
        }
        if (this.i != null) {
            sb2.append(" ");
            sb2.append(this.i);
        }
        sb2.append("}");
        return sb2.toString();
    }

    public C0527a(C0527a c0527a) {
        c0527a.f6838r.L();
        l<?> lVar = c0527a.f6838r.f6755x;
        if (lVar != null) {
            lVar.f6869b.getClassLoader();
        }
        Iterator<w.a> it = c0527a.f6919a.iterator();
        while (it.hasNext()) {
            w.a next = it.next();
            ArrayList<w.a> arrayList = this.f6919a;
            w.a aVar = new w.a();
            aVar.f6935a = next.f6935a;
            aVar.f6936b = next.f6936b;
            aVar.f6937c = next.f6937c;
            aVar.f6938d = next.f6938d;
            aVar.f6939e = next.f6939e;
            aVar.f6940f = next.f6940f;
            aVar.f6941g = next.f6941g;
            aVar.f6942h = next.f6942h;
            aVar.i = next.i;
            arrayList.add(aVar);
        }
        this.f6920b = c0527a.f6920b;
        this.f6921c = c0527a.f6921c;
        this.f6922d = c0527a.f6922d;
        this.f6923e = c0527a.f6923e;
        this.f6924f = c0527a.f6924f;
        this.f6925g = c0527a.f6925g;
        this.f6926h = c0527a.f6926h;
        this.i = c0527a.i;
        this.f6929l = c0527a.f6929l;
        this.f6930m = c0527a.f6930m;
        this.f6927j = c0527a.f6927j;
        this.f6928k = c0527a.f6928k;
        if (c0527a.f6931n != null) {
            ArrayList<String> arrayList2 = new ArrayList<>();
            this.f6931n = arrayList2;
            arrayList2.addAll(c0527a.f6931n);
        }
        if (c0527a.f6932o != null) {
            ArrayList<String> arrayList3 = new ArrayList<>();
            this.f6932o = arrayList3;
            arrayList3.addAll(c0527a.f6932o);
        }
        this.f6933p = c0527a.f6933p;
        this.f6840t = -1;
        this.f6841u = false;
        this.f6838r = c0527a.f6838r;
        this.f6839s = c0527a.f6839s;
        this.f6840t = c0527a.f6840t;
        this.f6841u = c0527a.f6841u;
    }
}
