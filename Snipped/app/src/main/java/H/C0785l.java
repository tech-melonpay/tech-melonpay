package h;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import m.C1001c;
import m.C1003e;
import m.C1004f;
import m.C1016s;
import m.C1023z;

/* compiled from: AppCompatViewInflater.java */
/* renamed from: h.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0785l {

    /* renamed from: b, reason: collision with root package name */
    public static final Class<?>[] f20947b = {Context.class, AttributeSet.class};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f20948c = {R.attr.onClick};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f20949d = {R.attr.accessibilityHeading};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f20950e = {R.attr.accessibilityPaneTitle};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f20951f = {R.attr.screenReaderFocusable};

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f20952g = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: h, reason: collision with root package name */
    public static final androidx.collection.g<String, Constructor<? extends View>> f20953h = new androidx.collection.g<>();

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f20954a = new Object[2];

    /* compiled from: AppCompatViewInflater.java */
    /* renamed from: h.l$a */
    public static class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final View f20955a;

        /* renamed from: b, reason: collision with root package name */
        public final String f20956b;

        /* renamed from: c, reason: collision with root package name */
        public Method f20957c;

        /* renamed from: d, reason: collision with root package name */
        public Context f20958d;

        public a(View view, String str) {
            this.f20955a = view;
            this.f20956b = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            String str;
            Method method;
            if (this.f20957c == null) {
                View view2 = this.f20955a;
                Context context = view2.getContext();
                while (true) {
                    String str2 = this.f20956b;
                    if (context == null) {
                        int id = view2.getId();
                        if (id == -1) {
                            str = "";
                        } else {
                            str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                        }
                        StringBuilder m2 = com.google.android.gms.measurement.internal.a.m("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                        m2.append(view2.getClass());
                        m2.append(str);
                        throw new IllegalStateException(m2.toString());
                    }
                    try {
                        if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                            this.f20957c = method;
                            this.f20958d = context;
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                    context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
                }
            }
            try {
                this.f20957c.invoke(this.f20958d, view);
            } catch (IllegalAccessException e10) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e10);
            } catch (InvocationTargetException e11) {
                throw new IllegalStateException("Could not execute method for android:onClick", e11);
            }
        }
    }

    public C1001c a(Context context, AttributeSet attributeSet) {
        return new C1001c(context, attributeSet);
    }

    public C1003e b(Context context, AttributeSet attributeSet) {
        return new C1003e(context, attributeSet);
    }

    public C1004f c(Context context, AttributeSet attributeSet) {
        return new C1004f(context, attributeSet);
    }

    public C1016s d(Context context, AttributeSet attributeSet) {
        return new C1016s(context, attributeSet);
    }

    public C1023z e(Context context, AttributeSet attributeSet) {
        return new C1023z(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String concat;
        androidx.collection.g<String, Constructor<? extends View>> gVar = f20953h;
        Constructor<? extends View> constructor = gVar.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    concat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                concat = str;
            }
            constructor = Class.forName(concat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f20947b);
            gVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return constructor.newInstance(this.f20954a);
    }
}
