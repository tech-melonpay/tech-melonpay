package y0;

import android.os.Build;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import com.luminary.mobile.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;
import y0.C1596C;

/* compiled from: KeyEventDispatcher.java */
/* renamed from: y0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1603g {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f31073a = false;

    /* renamed from: b, reason: collision with root package name */
    public static Method f31074b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f31075c = false;

    /* renamed from: d, reason: collision with root package name */
    public static Field f31076d;

    /* compiled from: KeyEventDispatcher.java */
    /* renamed from: y0.g$a */
    public interface a {
        boolean superDispatchKeyEvent(KeyEvent keyEvent);
    }

    public static boolean a(View view, KeyEvent keyEvent) {
        WeakReference<View> weakReference;
        int indexOfKey;
        WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList<WeakReference<View>> arrayList = C1596C.m.f30977d;
        C1596C.m mVar = (C1596C.m) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (mVar == null) {
            mVar = new C1596C.m();
            view.setTag(R.id.tag_unhandled_key_event_manager, mVar);
        }
        WeakReference<KeyEvent> weakReference2 = mVar.f30980c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        mVar.f30980c = new WeakReference<>(keyEvent);
        if (mVar.f30979b == null) {
            mVar.f30979b = new SparseArray<>();
        }
        SparseArray<WeakReference<View>> sparseArray = mVar.f30979b;
        if (keyEvent.getAction() != 1 || (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) < 0) {
            weakReference = null;
        } else {
            weakReference = sparseArray.valueAt(indexOfKey);
            sparseArray.removeAt(indexOfKey);
        }
        if (weakReference == null) {
            weakReference = sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = weakReference.get();
        if (view2 != null && view2.isAttachedToWindow()) {
            C1596C.m.b(view2, keyEvent);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"LambdaLast"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean b(y0.C1603g.a r5, android.view.View r6, android.view.Window.Callback r7, android.view.KeyEvent r8) {
        /*
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto Lf
            boolean r5 = r5.superDispatchKeyEvent(r8)
            return r5
        Lf:
            boolean r1 = r7 instanceof android.app.Activity
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L81
            android.app.Activity r7 = (android.app.Activity) r7
            r7.onUserInteraction()
            android.view.Window r5 = r7.getWindow()
            r6 = 8
            boolean r6 = r5.hasFeature(r6)
            if (r6 == 0) goto L64
            android.app.ActionBar r6 = r7.getActionBar()
            int r0 = r8.getKeyCode()
            r1 = 82
            if (r0 != r1) goto L64
            if (r6 == 0) goto L64
            boolean r0 = y0.C1603g.f31073a
            if (r0 != 0) goto L4c
            java.lang.Class r0 = r6.getClass()     // Catch: java.lang.NoSuchMethodException -> L4a
            java.lang.String r1 = "onMenuKeyEvent"
            java.lang.Class<android.view.KeyEvent> r4 = android.view.KeyEvent.class
            java.lang.Class[] r4 = new java.lang.Class[]{r4}     // Catch: java.lang.NoSuchMethodException -> L4a
            java.lang.reflect.Method r0 = r0.getMethod(r1, r4)     // Catch: java.lang.NoSuchMethodException -> L4a
            y0.C1603g.f31074b = r0     // Catch: java.lang.NoSuchMethodException -> L4a
        L4a:
            y0.C1603g.f31073a = r3
        L4c:
            java.lang.reflect.Method r0 = y0.C1603g.f31074b
            if (r0 == 0) goto L64
            java.lang.Object[] r1 = new java.lang.Object[]{r8}     // Catch: java.lang.Throwable -> L64
            java.lang.Object r6 = r0.invoke(r6, r1)     // Catch: java.lang.Throwable -> L64
            if (r6 != 0) goto L5b
            goto L64
        L5b:
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L64
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L64
            if (r6 == 0) goto L64
            goto L80
        L64:
            boolean r6 = r5.superDispatchKeyEvent(r8)
            if (r6 == 0) goto L6b
            goto L80
        L6b:
            android.view.View r5 = r5.getDecorView()
            boolean r6 = y0.C1596C.c(r5, r8)
            if (r6 == 0) goto L76
            goto L80
        L76:
            if (r5 == 0) goto L7c
            android.view.KeyEvent$DispatcherState r2 = r5.getKeyDispatcherState()
        L7c:
            boolean r3 = r8.dispatch(r7, r2, r7)
        L80:
            return r3
        L81:
            boolean r1 = r7 instanceof android.app.Dialog
            if (r1 == 0) goto Ld4
            android.app.Dialog r7 = (android.app.Dialog) r7
            boolean r5 = y0.C1603g.f31075c
            if (r5 != 0) goto L9a
            java.lang.Class<android.app.Dialog> r5 = android.app.Dialog.class
            java.lang.String r6 = "mOnKeyListener"
            java.lang.reflect.Field r5 = r5.getDeclaredField(r6)     // Catch: java.lang.NoSuchFieldException -> L98
            y0.C1603g.f31076d = r5     // Catch: java.lang.NoSuchFieldException -> L98
            r5.setAccessible(r3)     // Catch: java.lang.NoSuchFieldException -> L98
        L98:
            y0.C1603g.f31075c = r3
        L9a:
            java.lang.reflect.Field r5 = y0.C1603g.f31076d
            if (r5 == 0) goto La5
            java.lang.Object r5 = r5.get(r7)     // Catch: java.lang.IllegalAccessException -> La5
            android.content.DialogInterface$OnKeyListener r5 = (android.content.DialogInterface.OnKeyListener) r5     // Catch: java.lang.IllegalAccessException -> La5
            goto La6
        La5:
            r5 = r2
        La6:
            if (r5 == 0) goto Lb3
            int r6 = r8.getKeyCode()
            boolean r5 = r5.onKey(r7, r6, r8)
            if (r5 == 0) goto Lb3
            goto Ld3
        Lb3:
            android.view.Window r5 = r7.getWindow()
            boolean r6 = r5.superDispatchKeyEvent(r8)
            if (r6 == 0) goto Lbe
            goto Ld3
        Lbe:
            android.view.View r5 = r5.getDecorView()
            boolean r6 = y0.C1596C.c(r5, r8)
            if (r6 == 0) goto Lc9
            goto Ld3
        Lc9:
            if (r5 == 0) goto Lcf
            android.view.KeyEvent$DispatcherState r2 = r5.getKeyDispatcherState()
        Lcf:
            boolean r3 = r8.dispatch(r7, r2, r7)
        Ld3:
            return r3
        Ld4:
            if (r6 == 0) goto Ldc
            boolean r6 = y0.C1596C.c(r6, r8)
            if (r6 != 0) goto Le2
        Ldc:
            boolean r5 = r5.superDispatchKeyEvent(r8)
            if (r5 == 0) goto Le3
        Le2:
            r0 = r3
        Le3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.C1603g.b(y0.g$a, android.view.View, android.view.Window$Callback, android.view.KeyEvent):boolean");
    }
}
