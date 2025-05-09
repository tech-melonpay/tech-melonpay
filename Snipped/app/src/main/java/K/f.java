package k;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import g.C0756a;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import l.MenuItemC0973c;
import m.C0996F;
import m.Z;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.xmlpull.v1.XmlPullParserException;
import q0.InterfaceMenuC1128a;
import y0.AbstractC1598b;

/* compiled from: SupportMenuInflater.java */
/* loaded from: classes.dex */
public final class f extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    public static final Class<?>[] f22618e;

    /* renamed from: f, reason: collision with root package name */
    public static final Class<?>[] f22619f;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f22620a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f22621b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f22622c;

    /* renamed from: d, reason: collision with root package name */
    public Object f22623d;

    /* compiled from: SupportMenuInflater.java */
    public static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c, reason: collision with root package name */
        public static final Class<?>[] f22624c = {MenuItem.class};

        /* renamed from: a, reason: collision with root package name */
        public Object f22625a;

        /* renamed from: b, reason: collision with root package name */
        public Method f22626b;

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            Method method = this.f22626b;
            try {
                Class<?> returnType = method.getReturnType();
                Class<?> cls = Boolean.TYPE;
                Object obj = this.f22625a;
                if (returnType == cls) {
                    return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
                }
                method.invoke(obj, menuItem);
                return true;
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* compiled from: SupportMenuInflater.java */
    public class b {

        /* renamed from: A, reason: collision with root package name */
        public CharSequence f22627A;

        /* renamed from: B, reason: collision with root package name */
        public CharSequence f22628B;

        /* renamed from: a, reason: collision with root package name */
        public final Menu f22632a;

        /* renamed from: h, reason: collision with root package name */
        public boolean f22639h;
        public int i;

        /* renamed from: j, reason: collision with root package name */
        public int f22640j;

        /* renamed from: k, reason: collision with root package name */
        public CharSequence f22641k;

        /* renamed from: l, reason: collision with root package name */
        public CharSequence f22642l;

        /* renamed from: m, reason: collision with root package name */
        public int f22643m;

        /* renamed from: n, reason: collision with root package name */
        public char f22644n;

        /* renamed from: o, reason: collision with root package name */
        public int f22645o;

        /* renamed from: p, reason: collision with root package name */
        public char f22646p;

        /* renamed from: q, reason: collision with root package name */
        public int f22647q;

        /* renamed from: r, reason: collision with root package name */
        public int f22648r;

        /* renamed from: s, reason: collision with root package name */
        public boolean f22649s;

        /* renamed from: t, reason: collision with root package name */
        public boolean f22650t;

        /* renamed from: u, reason: collision with root package name */
        public boolean f22651u;

        /* renamed from: v, reason: collision with root package name */
        public int f22652v;

        /* renamed from: w, reason: collision with root package name */
        public int f22653w;

        /* renamed from: x, reason: collision with root package name */
        public String f22654x;

        /* renamed from: y, reason: collision with root package name */
        public String f22655y;

        /* renamed from: z, reason: collision with root package name */
        public AbstractC1598b f22656z;

        /* renamed from: C, reason: collision with root package name */
        public ColorStateList f22629C = null;

        /* renamed from: D, reason: collision with root package name */
        public PorterDuff.Mode f22630D = null;

        /* renamed from: b, reason: collision with root package name */
        public int f22633b = 0;

        /* renamed from: c, reason: collision with root package name */
        public int f22634c = 0;

        /* renamed from: d, reason: collision with root package name */
        public int f22635d = 0;

        /* renamed from: e, reason: collision with root package name */
        public int f22636e = 0;

        /* renamed from: f, reason: collision with root package name */
        public boolean f22637f = true;

        /* renamed from: g, reason: collision with root package name */
        public boolean f22638g = true;

        public b(Menu menu) {
            this.f22632a = menu;
        }

        public final <T> T a(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, f.this.f22622c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e10) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e10);
                return null;
            }
        }

        public final void b(MenuItem menuItem) {
            boolean z10 = false;
            menuItem.setChecked(this.f22649s).setVisible(this.f22650t).setEnabled(this.f22651u).setCheckable(this.f22648r >= 1).setTitleCondensed(this.f22642l).setIcon(this.f22643m);
            int i = this.f22652v;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            String str = this.f22655y;
            f fVar = f.this;
            if (str != null) {
                if (fVar.f22622c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                if (fVar.f22623d == null) {
                    fVar.f22623d = f.a(fVar.f22622c);
                }
                Object obj = fVar.f22623d;
                String str2 = this.f22655y;
                a aVar = new a();
                aVar.f22625a = obj;
                Class<?> cls = obj.getClass();
                try {
                    aVar.f22626b = cls.getMethod(str2, a.f22624c);
                    menuItem.setOnMenuItemClickListener(aVar);
                } catch (Exception e10) {
                    StringBuilder m2 = com.google.android.gms.measurement.internal.a.m("Couldn't resolve menu item onClick handler ", str2, " in class ");
                    m2.append(cls.getName());
                    InflateException inflateException = new InflateException(m2.toString());
                    inflateException.initCause(e10);
                    throw inflateException;
                }
            }
            if (this.f22648r >= 2) {
                if (menuItem instanceof androidx.appcompat.view.menu.h) {
                    ((androidx.appcompat.view.menu.h) menuItem).g(true);
                } else if (menuItem instanceof MenuItemC0973c) {
                    MenuItemC0973c menuItemC0973c = (MenuItemC0973c) menuItem;
                    try {
                        Method method = menuItemC0973c.f23448e;
                        q0.b bVar = menuItemC0973c.f23447d;
                        if (method == null) {
                            menuItemC0973c.f23448e = bVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                        }
                        menuItemC0973c.f23448e.invoke(bVar, Boolean.TRUE);
                    } catch (Exception e11) {
                        Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e11);
                    }
                }
            }
            String str3 = this.f22654x;
            if (str3 != null) {
                menuItem.setActionView((View) a(str3, f.f22618e, fVar.f22620a));
                z10 = true;
            }
            int i9 = this.f22653w;
            if (i9 > 0) {
                if (z10) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i9);
                }
            }
            AbstractC1598b abstractC1598b = this.f22656z;
            if (abstractC1598b != null) {
                if (menuItem instanceof q0.b) {
                    ((q0.b) menuItem).a(abstractC1598b);
                } else {
                    Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
                }
            }
            CharSequence charSequence = this.f22627A;
            boolean z11 = menuItem instanceof q0.b;
            if (z11) {
                ((q0.b) menuItem).setContentDescription(charSequence);
            } else {
                menuItem.setContentDescription(charSequence);
            }
            CharSequence charSequence2 = this.f22628B;
            if (z11) {
                ((q0.b) menuItem).setTooltipText(charSequence2);
            } else {
                menuItem.setTooltipText(charSequence2);
            }
            char c2 = this.f22644n;
            int i10 = this.f22645o;
            if (z11) {
                ((q0.b) menuItem).setAlphabeticShortcut(c2, i10);
            } else {
                menuItem.setAlphabeticShortcut(c2, i10);
            }
            char c10 = this.f22646p;
            int i11 = this.f22647q;
            if (z11) {
                ((q0.b) menuItem).setNumericShortcut(c10, i11);
            } else {
                menuItem.setNumericShortcut(c10, i11);
            }
            PorterDuff.Mode mode = this.f22630D;
            if (mode != null) {
                if (z11) {
                    ((q0.b) menuItem).setIconTintMode(mode);
                } else {
                    menuItem.setIconTintMode(mode);
                }
            }
            ColorStateList colorStateList = this.f22629C;
            if (colorStateList != null) {
                if (z11) {
                    ((q0.b) menuItem).setIconTintList(colorStateList);
                } else {
                    menuItem.setIconTintList(colorStateList);
                }
            }
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f22618e = clsArr;
        f22619f = clsArr;
    }

    public f(Context context) {
        super(context);
        this.f22622c = context;
        Object[] objArr = {context};
        this.f22620a = objArr;
        this.f22621b = objArr;
    }

    public static Object a(Context context) {
        return context instanceof Activity ? context : context instanceof ContextWrapper ? a(((ContextWrapper) context).getBaseContext()) : context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v59 */
    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) {
        ?? r42;
        int i;
        boolean z10;
        ColorStateList colorStateList;
        b bVar = new b(menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            r42 = 1;
            i = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlResourceParser.next();
            } else {
                eventType = xmlResourceParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z11 = false;
        boolean z12 = false;
        String str = null;
        while (!z11) {
            if (eventType == r42) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != i) {
                if (eventType == 3) {
                    String name2 = xmlResourceParser.getName();
                    if (z12 && name2.equals(str)) {
                        z10 = r42;
                        z12 = false;
                        str = null;
                        eventType = xmlResourceParser.next();
                        r42 = z10;
                        i = 2;
                        z12 = z12;
                    } else if (name2.equals("group")) {
                        bVar.f22633b = 0;
                        bVar.f22634c = 0;
                        bVar.f22635d = 0;
                        bVar.f22636e = 0;
                        bVar.f22637f = r42;
                        bVar.f22638g = r42;
                    } else if (name2.equals("item")) {
                        if (!bVar.f22639h) {
                            AbstractC1598b abstractC1598b = bVar.f22656z;
                            if (abstractC1598b == null || !abstractC1598b.a()) {
                                bVar.f22639h = r42;
                                bVar.b(bVar.f22632a.add(bVar.f22633b, bVar.i, bVar.f22640j, bVar.f22641k));
                            } else {
                                bVar.f22639h = r42;
                                bVar.b(bVar.f22632a.addSubMenu(bVar.f22633b, bVar.i, bVar.f22640j, bVar.f22641k).getItem());
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z10 = r42;
                        z11 = z10;
                    }
                }
                z10 = r42;
            } else {
                if (!z12) {
                    String name3 = xmlResourceParser.getName();
                    boolean equals = name3.equals("group");
                    f fVar = f.this;
                    if (equals) {
                        TypedArray obtainStyledAttributes = fVar.f22622c.obtainStyledAttributes(attributeSet, C0756a.f20743p);
                        bVar.f22633b = obtainStyledAttributes.getResourceId(r42, 0);
                        bVar.f22634c = obtainStyledAttributes.getInt(3, 0);
                        bVar.f22635d = obtainStyledAttributes.getInt(4, 0);
                        bVar.f22636e = obtainStyledAttributes.getInt(5, 0);
                        bVar.f22637f = obtainStyledAttributes.getBoolean(2, r42);
                        bVar.f22638g = obtainStyledAttributes.getBoolean(0, r42);
                        obtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            Z e10 = Z.e(fVar.f22622c, attributeSet, C0756a.f20744q);
                            TypedArray typedArray = e10.f23728b;
                            bVar.i = typedArray.getResourceId(2, 0);
                            bVar.f22640j = (typedArray.getInt(5, bVar.f22634c) & (-65536)) | (typedArray.getInt(6, bVar.f22635d) & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
                            bVar.f22641k = typedArray.getText(7);
                            bVar.f22642l = typedArray.getText(8);
                            bVar.f22643m = typedArray.getResourceId(0, 0);
                            String string = typedArray.getString(9);
                            bVar.f22644n = string == null ? (char) 0 : string.charAt(0);
                            bVar.f22645o = typedArray.getInt(16, 4096);
                            String string2 = typedArray.getString(10);
                            bVar.f22646p = string2 == null ? (char) 0 : string2.charAt(0);
                            bVar.f22647q = typedArray.getInt(20, 4096);
                            if (typedArray.hasValue(11)) {
                                bVar.f22648r = typedArray.getBoolean(11, false) ? 1 : 0;
                            } else {
                                bVar.f22648r = bVar.f22636e;
                            }
                            bVar.f22649s = typedArray.getBoolean(3, false);
                            bVar.f22650t = typedArray.getBoolean(4, bVar.f22637f);
                            bVar.f22651u = typedArray.getBoolean(1, bVar.f22638g);
                            bVar.f22652v = typedArray.getInt(21, -1);
                            bVar.f22655y = typedArray.getString(12);
                            bVar.f22653w = typedArray.getResourceId(13, 0);
                            bVar.f22654x = typedArray.getString(15);
                            String string3 = typedArray.getString(14);
                            boolean z13 = string3 != null;
                            if (z13 && bVar.f22653w == 0 && bVar.f22654x == null) {
                                bVar.f22656z = (AbstractC1598b) bVar.a(string3, f22619f, fVar.f22621b);
                            } else {
                                if (z13) {
                                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                }
                                bVar.f22656z = null;
                            }
                            bVar.f22627A = typedArray.getText(17);
                            bVar.f22628B = typedArray.getText(22);
                            if (typedArray.hasValue(19)) {
                                bVar.f22630D = C0996F.b(typedArray.getInt(19, -1), bVar.f22630D);
                                colorStateList = null;
                            } else {
                                colorStateList = null;
                                bVar.f22630D = null;
                            }
                            if (typedArray.hasValue(18)) {
                                bVar.f22629C = e10.a(18);
                            } else {
                                bVar.f22629C = colorStateList;
                            }
                            e10.g();
                            bVar.f22639h = false;
                            z10 = true;
                        } else if (name3.equals("menu")) {
                            z10 = true;
                            bVar.f22639h = true;
                            SubMenu addSubMenu = bVar.f22632a.addSubMenu(bVar.f22633b, bVar.i, bVar.f22640j, bVar.f22641k);
                            bVar.b(addSubMenu.getItem());
                            b(xmlResourceParser, attributeSet, addSubMenu);
                        } else {
                            z10 = true;
                            str = name3;
                            z12 = true;
                        }
                        eventType = xmlResourceParser.next();
                        r42 = z10;
                        i = 2;
                        z12 = z12;
                    }
                }
                z10 = r42;
            }
            eventType = xmlResourceParser.next();
            r42 = z10;
            i = 2;
            z12 = z12;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof InterfaceMenuC1128a)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        boolean z10 = false;
        try {
            try {
                xmlResourceParser = this.f22622c.getResources().getLayout(i);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
                if (menu instanceof androidx.appcompat.view.menu.f) {
                    androidx.appcompat.view.menu.f fVar = (androidx.appcompat.view.menu.f) menu;
                    if (!fVar.f4760p) {
                        fVar.w();
                        z10 = true;
                    }
                }
                b(xmlResourceParser, asAttributeSet, menu);
                if (z10) {
                    ((androidx.appcompat.view.menu.f) menu).v();
                }
                xmlResourceParser.close();
            } catch (IOException e10) {
                throw new InflateException("Error inflating menu XML", e10);
            } catch (XmlPullParserException e11) {
                throw new InflateException("Error inflating menu XML", e11);
            }
        } catch (Throwable th) {
            if (z10) {
                ((androidx.appcompat.view.menu.f) menu).v();
            }
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
