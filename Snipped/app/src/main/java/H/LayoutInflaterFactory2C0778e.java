package h;

import C.N;
import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import com.google.firebase.analytics.FirebaseAnalytics;
import g.C0756a;
import h.C0787n;
import j0.C0877f;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.WeakHashMap;
import k.AbstractC0912a;
import k.e;
import m.C1008j;
import m.InterfaceC0994D;
import m.Z;
import m.e0;
import pa.C1124b;
import y0.C1596C;
import y0.E;

/* compiled from: AppCompatDelegateImpl.java */
/* renamed from: h.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class LayoutInflaterFactory2C0778e extends AbstractC0777d implements f.a, LayoutInflater.Factory2 {

    /* renamed from: j0, reason: collision with root package name */
    public static final androidx.collection.g<String, Integer> f20861j0 = new androidx.collection.g<>();

    /* renamed from: k0, reason: collision with root package name */
    public static final int[] f20862k0 = {R.attr.windowBackground};

    /* renamed from: l0, reason: collision with root package name */
    public static final boolean f20863l0 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: A, reason: collision with root package name */
    public boolean f20864A;

    /* renamed from: B, reason: collision with root package name */
    public ViewGroup f20865B;

    /* renamed from: C, reason: collision with root package name */
    public TextView f20866C;

    /* renamed from: D, reason: collision with root package name */
    public View f20867D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f20868E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f20869F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f20870G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f20871H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f20872I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f20873J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f20874K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f20875L;

    /* renamed from: M, reason: collision with root package name */
    public m[] f20876M;

    /* renamed from: N, reason: collision with root package name */
    public m f20877N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f20878O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f20879P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f20880Q;
    public boolean R;
    public Configuration S;
    public final int T;
    public int U;
    public int V;
    public boolean W;
    public k X;
    public i Y;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f20881Z;

    /* renamed from: a0, reason: collision with root package name */
    public int f20882a0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f20884c0;

    /* renamed from: d0, reason: collision with root package name */
    public Rect f20885d0;

    /* renamed from: f0, reason: collision with root package name */
    public Rect f20886f0;

    /* renamed from: g0, reason: collision with root package name */
    public C0785l f20887g0;

    /* renamed from: h0, reason: collision with root package name */
    public OnBackInvokedDispatcher f20888h0;

    /* renamed from: i0, reason: collision with root package name */
    public OnBackInvokedCallback f20889i0;

    /* renamed from: j, reason: collision with root package name */
    public final Object f20890j;

    /* renamed from: k, reason: collision with root package name */
    public final Context f20891k;

    /* renamed from: l, reason: collision with root package name */
    public Window f20892l;

    /* renamed from: m, reason: collision with root package name */
    public h f20893m;

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC0776c f20894n;

    /* renamed from: o, reason: collision with root package name */
    public AbstractC0774a f20895o;

    /* renamed from: p, reason: collision with root package name */
    public k.f f20896p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f20897q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC0994D f20898r;

    /* renamed from: s, reason: collision with root package name */
    public c f20899s;

    /* renamed from: t, reason: collision with root package name */
    public n f20900t;

    /* renamed from: u, reason: collision with root package name */
    public AbstractC0912a f20901u;

    /* renamed from: v, reason: collision with root package name */
    public ActionBarContextView f20902v;

    /* renamed from: w, reason: collision with root package name */
    public PopupWindow f20903w;

    /* renamed from: x, reason: collision with root package name */
    public RunnableC0780g f20904x;

    /* renamed from: y, reason: collision with root package name */
    public E f20905y = null;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f20906z = true;

    /* renamed from: b0, reason: collision with root package name */
    public final a f20883b0 = new a();

    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: h.e$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            LayoutInflaterFactory2C0778e layoutInflaterFactory2C0778e = LayoutInflaterFactory2C0778e.this;
            if ((layoutInflaterFactory2C0778e.f20882a0 & 1) != 0) {
                layoutInflaterFactory2C0778e.J(0);
            }
            if ((layoutInflaterFactory2C0778e.f20882a0 & 4096) != 0) {
                layoutInflaterFactory2C0778e.J(108);
            }
            layoutInflaterFactory2C0778e.f20881Z = false;
            layoutInflaterFactory2C0778e.f20882a0 = 0;
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: h.e$b */
    public interface b {
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: h.e$c */
    public final class c implements j.a {
        public c() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final void c(androidx.appcompat.view.menu.f fVar, boolean z10) {
            LayoutInflaterFactory2C0778e.this.F(fVar);
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final boolean d(androidx.appcompat.view.menu.f fVar) {
            Window.Callback callback = LayoutInflaterFactory2C0778e.this.f20892l.getCallback();
            if (callback == null) {
                return true;
            }
            callback.onMenuOpened(108, fVar);
            return true;
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: h.e$d */
    public class d implements AbstractC0912a.InterfaceC0418a {

        /* renamed from: a, reason: collision with root package name */
        public final AbstractC0912a.InterfaceC0418a f20909a;

        /* compiled from: AppCompatDelegateImpl.java */
        /* renamed from: h.e$d$a */
        public class a extends C1124b {
            public a() {
            }

            @Override // y0.F
            public final void c() {
                d dVar = d.this;
                LayoutInflaterFactory2C0778e.this.f20902v.setVisibility(8);
                LayoutInflaterFactory2C0778e layoutInflaterFactory2C0778e = LayoutInflaterFactory2C0778e.this;
                PopupWindow popupWindow = layoutInflaterFactory2C0778e.f20903w;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflaterFactory2C0778e.f20902v.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C0778e.f20902v.getParent();
                    WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
                    C1596C.c.c(view);
                }
                layoutInflaterFactory2C0778e.f20902v.h();
                layoutInflaterFactory2C0778e.f20905y.d(null);
                layoutInflaterFactory2C0778e.f20905y = null;
                ViewGroup viewGroup = layoutInflaterFactory2C0778e.f20865B;
                WeakHashMap<View, E> weakHashMap2 = C1596C.f30963a;
                C1596C.c.c(viewGroup);
            }
        }

        public d(e.a aVar) {
            this.f20909a = aVar;
        }

        @Override // k.AbstractC0912a.InterfaceC0418a
        public final boolean a(AbstractC0912a abstractC0912a, MenuItem menuItem) {
            return this.f20909a.a(abstractC0912a, menuItem);
        }

        @Override // k.AbstractC0912a.InterfaceC0418a
        public final boolean b(AbstractC0912a abstractC0912a, androidx.appcompat.view.menu.f fVar) {
            ViewGroup viewGroup = LayoutInflaterFactory2C0778e.this.f20865B;
            WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
            C1596C.c.c(viewGroup);
            return this.f20909a.b(abstractC0912a, fVar);
        }

        @Override // k.AbstractC0912a.InterfaceC0418a
        public final boolean c(AbstractC0912a abstractC0912a, androidx.appcompat.view.menu.f fVar) {
            return this.f20909a.c(abstractC0912a, fVar);
        }

        @Override // k.AbstractC0912a.InterfaceC0418a
        public final void d(AbstractC0912a abstractC0912a) {
            this.f20909a.d(abstractC0912a);
            LayoutInflaterFactory2C0778e layoutInflaterFactory2C0778e = LayoutInflaterFactory2C0778e.this;
            if (layoutInflaterFactory2C0778e.f20903w != null) {
                layoutInflaterFactory2C0778e.f20892l.getDecorView().removeCallbacks(layoutInflaterFactory2C0778e.f20904x);
            }
            if (layoutInflaterFactory2C0778e.f20902v != null) {
                E e10 = layoutInflaterFactory2C0778e.f20905y;
                if (e10 != null) {
                    e10.b();
                }
                E a10 = C1596C.a(layoutInflaterFactory2C0778e.f20902v);
                a10.a(0.0f);
                layoutInflaterFactory2C0778e.f20905y = a10;
                a10.d(new a());
            }
            InterfaceC0776c interfaceC0776c = layoutInflaterFactory2C0778e.f20894n;
            if (interfaceC0776c != null) {
                interfaceC0776c.onSupportActionModeFinished(layoutInflaterFactory2C0778e.f20901u);
            }
            layoutInflaterFactory2C0778e.f20901u = null;
            ViewGroup viewGroup = layoutInflaterFactory2C0778e.f20865B;
            WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
            C1596C.c.c(viewGroup);
            layoutInflaterFactory2C0778e.W();
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: h.e$e, reason: collision with other inner class name */
    public static class C0404e {
        public static boolean a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        public static String b(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: h.e$f */
    public static class f {
        public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }

        public static t0.g b(Configuration configuration) {
            return t0.g.a(configuration.getLocales().toLanguageTags());
        }

        public static void c(t0.g gVar) {
            LocaleList.setDefault(LocaleList.forLanguageTags(gVar.f27402a.a()));
        }

        public static void d(Configuration configuration, t0.g gVar) {
            configuration.setLocales(LocaleList.forLanguageTags(gVar.f27402a.a()));
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: h.e$g */
    public static class g {
        public static OnBackInvokedDispatcher a(Activity activity) {
            OnBackInvokedDispatcher onBackInvokedDispatcher;
            onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
            return onBackInvokedDispatcher;
        }

        public static OnBackInvokedCallback b(Object obj, LayoutInflaterFactory2C0778e layoutInflaterFactory2C0778e) {
            Objects.requireNonNull(layoutInflaterFactory2C0778e);
            L2.d dVar = new L2.d(layoutInflaterFactory2C0778e, 2);
            L2.c.m(obj).registerOnBackInvokedCallback(1000000, dVar);
            return dVar;
        }

        public static void c(Object obj, Object obj2) {
            L2.c.m(obj).unregisterOnBackInvokedCallback(L2.c.i(obj2));
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: h.e$i */
    public class i extends j {

        /* renamed from: c, reason: collision with root package name */
        public final PowerManager f20917c;

        public i(Context context) {
            super();
            this.f20917c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // h.LayoutInflaterFactory2C0778e.j
        public final IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // h.LayoutInflaterFactory2C0778e.j
        public final int c() {
            return C0404e.a(this.f20917c) ? 2 : 1;
        }

        @Override // h.LayoutInflaterFactory2C0778e.j
        public final void d() {
            LayoutInflaterFactory2C0778e.this.B(true, true);
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: h.e$j */
    public abstract class j {

        /* renamed from: a, reason: collision with root package name */
        public a f20919a;

        /* compiled from: AppCompatDelegateImpl.java */
        /* renamed from: h.e$j$a */
        public class a extends BroadcastReceiver {
            public a() {
            }

            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                j.this.d();
            }
        }

        public j() {
        }

        public final void a() {
            a aVar = this.f20919a;
            if (aVar != null) {
                try {
                    LayoutInflaterFactory2C0778e.this.f20891k.unregisterReceiver(aVar);
                } catch (IllegalArgumentException unused) {
                }
                this.f20919a = null;
            }
        }

        public abstract IntentFilter b();

        public abstract int c();

        public abstract void d();

        public final void e() {
            a();
            IntentFilter b9 = b();
            if (b9.countActions() == 0) {
                return;
            }
            if (this.f20919a == null) {
                this.f20919a = new a();
            }
            LayoutInflaterFactory2C0778e.this.f20891k.registerReceiver(this.f20919a, b9);
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: h.e$k */
    public class k extends j {

        /* renamed from: c, reason: collision with root package name */
        public final C0789p f20922c;

        public k(C0789p c0789p) {
            super();
            this.f20922c = c0789p;
        }

        @Override // h.LayoutInflaterFactory2C0778e.j
        public final IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        /* JADX WARN: Removed duplicated region for block: B:5:0x00fb A[ORIG_RETURN, RETURN] */
        @Override // h.LayoutInflaterFactory2C0778e.j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int c() {
            /*
                Method dump skipped, instructions count: 253
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: h.LayoutInflaterFactory2C0778e.k.c():int");
        }

        @Override // h.LayoutInflaterFactory2C0778e.j
        public final void d() {
            LayoutInflaterFactory2C0778e.this.B(true, true);
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: h.e$l */
    public class l extends ContentFrameLayout {
        public l(k.c cVar) {
            super(cVar, null);
        }

        @Override // android.view.ViewGroup, android.view.View
        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return LayoutInflaterFactory2C0778e.this.I(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                int x9 = (int) motionEvent.getX();
                int y10 = (int) motionEvent.getY();
                if (x9 < -5 || y10 < -5 || x9 > getWidth() + 5 || y10 > getHeight() + 5) {
                    LayoutInflaterFactory2C0778e layoutInflaterFactory2C0778e = LayoutInflaterFactory2C0778e.this;
                    layoutInflaterFactory2C0778e.G(layoutInflaterFactory2C0778e.N(0), true);
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public final void setBackgroundResource(int i) {
            setBackgroundDrawable(U4.b.j(getContext(), i));
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: h.e$m */
    public static final class m {

        /* renamed from: a, reason: collision with root package name */
        public int f20924a;

        /* renamed from: b, reason: collision with root package name */
        public int f20925b;

        /* renamed from: c, reason: collision with root package name */
        public int f20926c;

        /* renamed from: d, reason: collision with root package name */
        public int f20927d;

        /* renamed from: e, reason: collision with root package name */
        public l f20928e;

        /* renamed from: f, reason: collision with root package name */
        public View f20929f;

        /* renamed from: g, reason: collision with root package name */
        public View f20930g;

        /* renamed from: h, reason: collision with root package name */
        public androidx.appcompat.view.menu.f f20931h;
        public androidx.appcompat.view.menu.d i;

        /* renamed from: j, reason: collision with root package name */
        public k.c f20932j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f20933k;

        /* renamed from: l, reason: collision with root package name */
        public boolean f20934l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f20935m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f20936n;

        /* renamed from: o, reason: collision with root package name */
        public boolean f20937o;

        /* renamed from: p, reason: collision with root package name */
        public Bundle f20938p;
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: h.e$n */
    public final class n implements j.a {
        public n() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final void c(androidx.appcompat.view.menu.f fVar, boolean z10) {
            m mVar;
            androidx.appcompat.view.menu.f k3 = fVar.k();
            int i = 0;
            boolean z11 = k3 != fVar;
            if (z11) {
                fVar = k3;
            }
            LayoutInflaterFactory2C0778e layoutInflaterFactory2C0778e = LayoutInflaterFactory2C0778e.this;
            m[] mVarArr = layoutInflaterFactory2C0778e.f20876M;
            int length = mVarArr != null ? mVarArr.length : 0;
            while (true) {
                if (i < length) {
                    mVar = mVarArr[i];
                    if (mVar != null && mVar.f20931h == fVar) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    mVar = null;
                    break;
                }
            }
            if (mVar != null) {
                if (!z11) {
                    layoutInflaterFactory2C0778e.G(mVar, z10);
                } else {
                    layoutInflaterFactory2C0778e.E(mVar.f20924a, mVar, k3);
                    layoutInflaterFactory2C0778e.G(mVar, true);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final boolean d(androidx.appcompat.view.menu.f fVar) {
            Window.Callback callback;
            if (fVar != fVar.k()) {
                return true;
            }
            LayoutInflaterFactory2C0778e layoutInflaterFactory2C0778e = LayoutInflaterFactory2C0778e.this;
            if (!layoutInflaterFactory2C0778e.f20870G || (callback = layoutInflaterFactory2C0778e.f20892l.getCallback()) == null || layoutInflaterFactory2C0778e.R) {
                return true;
            }
            callback.onMenuOpened(108, fVar);
            return true;
        }
    }

    public LayoutInflaterFactory2C0778e(Context context, Window window, InterfaceC0776c interfaceC0776c, Object obj) {
        androidx.collection.g<String, Integer> gVar;
        Integer num;
        ActivityC0775b activityC0775b = null;
        this.T = -100;
        this.f20891k = context;
        this.f20894n = interfaceC0776c;
        this.f20890j = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof ActivityC0775b)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    } else {
                        activityC0775b = (ActivityC0775b) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (activityC0775b != null) {
                this.T = activityC0775b.getDelegate().g();
            }
        }
        if (this.T == -100 && (num = (gVar = f20861j0).get(this.f20890j.getClass().getName())) != null) {
            this.T = num.intValue();
            gVar.remove(this.f20890j.getClass().getName());
        }
        if (window != null) {
            C(window);
        }
        C1008j.d();
    }

    public static t0.g D(Context context) {
        t0.g gVar;
        t0.g gVar2;
        if (Build.VERSION.SDK_INT >= 33 || (gVar = AbstractC0777d.f20851c) == null) {
            return null;
        }
        t0.g b9 = f.b(context.getApplicationContext().getResources().getConfiguration());
        t0.h hVar = gVar.f27402a;
        if (hVar.isEmpty()) {
            gVar2 = t0.g.f27401b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i9 = 0;
            while (i9 < b9.f27402a.size() + hVar.size()) {
                Locale locale = i9 < hVar.size() ? hVar.get(i9) : b9.f27402a.get(i9 - hVar.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i9++;
            }
            gVar2 = new t0.g(new t0.i(new LocaleList((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return gVar2.f27402a.isEmpty() ? b9 : gVar2;
    }

    public static Configuration H(Context context, int i9, t0.g gVar, Configuration configuration, boolean z10) {
        int i10 = i9 != 1 ? i9 != 2 ? z10 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i10 | (configuration2.uiMode & (-49));
        if (gVar != null) {
            f.d(configuration2, gVar);
        }
        return configuration2;
    }

    @Override // h.AbstractC0777d
    public final void A(CharSequence charSequence) {
        this.f20897q = charSequence;
        InterfaceC0994D interfaceC0994D = this.f20898r;
        if (interfaceC0994D != null) {
            interfaceC0994D.setWindowTitle(charSequence);
            return;
        }
        AbstractC0774a abstractC0774a = this.f20895o;
        if (abstractC0774a != null) {
            abstractC0774a.o(charSequence);
            return;
        }
        TextView textView = this.f20866C;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0100 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean B(boolean r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h.LayoutInflaterFactory2C0778e.B(boolean, boolean):boolean");
    }

    public final void C(Window window) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        if (this.f20892l != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof h) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        h hVar = new h(callback);
        this.f20893m = hVar;
        window.setCallback(hVar);
        Z e10 = Z.e(this.f20891k, null, f20862k0);
        Drawable c2 = e10.c(0);
        if (c2 != null) {
            window.setBackgroundDrawable(c2);
        }
        e10.g();
        this.f20892l = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f20888h0) != null) {
            return;
        }
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f20889i0) != null) {
            g.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f20889i0 = null;
        }
        Object obj = this.f20890j;
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.f20888h0 = g.a(activity);
                W();
            }
        }
        this.f20888h0 = null;
        W();
    }

    public final void E(int i9, m mVar, androidx.appcompat.view.menu.f fVar) {
        if (fVar == null) {
            if (mVar == null && i9 >= 0) {
                m[] mVarArr = this.f20876M;
                if (i9 < mVarArr.length) {
                    mVar = mVarArr[i9];
                }
            }
            if (mVar != null) {
                fVar = mVar.f20931h;
            }
        }
        if ((mVar == null || mVar.f20935m) && !this.R) {
            h hVar = this.f20893m;
            Window.Callback callback = this.f20892l.getCallback();
            hVar.getClass();
            try {
                hVar.f20915e = true;
                callback.onPanelClosed(i9, fVar);
            } finally {
                hVar.f20915e = false;
            }
        }
    }

    public final void F(androidx.appcompat.view.menu.f fVar) {
        if (this.f20875L) {
            return;
        }
        this.f20875L = true;
        this.f20898r.i();
        Window.Callback callback = this.f20892l.getCallback();
        if (callback != null && !this.R) {
            callback.onPanelClosed(108, fVar);
        }
        this.f20875L = false;
    }

    public final void G(m mVar, boolean z10) {
        l lVar;
        InterfaceC0994D interfaceC0994D;
        if (z10 && mVar.f20924a == 0 && (interfaceC0994D = this.f20898r) != null && interfaceC0994D.a()) {
            F(mVar.f20931h);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f20891k.getSystemService("window");
        if (windowManager != null && mVar.f20935m && (lVar = mVar.f20928e) != null) {
            windowManager.removeView(lVar);
            if (z10) {
                E(mVar.f20924a, mVar, null);
            }
        }
        mVar.f20933k = false;
        mVar.f20934l = false;
        mVar.f20935m = false;
        mVar.f20929f = null;
        mVar.f20936n = true;
        if (this.f20877N == mVar) {
            this.f20877N = null;
        }
        if (mVar.f20924a == 0) {
            W();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean I(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h.LayoutInflaterFactory2C0778e.I(android.view.KeyEvent):boolean");
    }

    public final void J(int i9) {
        m N10 = N(i9);
        if (N10.f20931h != null) {
            Bundle bundle = new Bundle();
            N10.f20931h.t(bundle);
            if (bundle.size() > 0) {
                N10.f20938p = bundle;
            }
            N10.f20931h.w();
            N10.f20931h.clear();
        }
        N10.f20937o = true;
        N10.f20936n = true;
        if ((i9 == 108 || i9 == 0) && this.f20898r != null) {
            m N11 = N(0);
            N11.f20933k = false;
            U(N11, null);
        }
    }

    public final void K() {
        ViewGroup viewGroup;
        if (this.f20864A) {
            return;
        }
        int[] iArr = C0756a.f20737j;
        Context context = this.f20891k;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!obtainStyledAttributes.hasValue(117)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(126, false)) {
            u(1);
        } else if (obtainStyledAttributes.getBoolean(117, false)) {
            u(108);
        }
        if (obtainStyledAttributes.getBoolean(118, false)) {
            u(109);
        }
        if (obtainStyledAttributes.getBoolean(119, false)) {
            u(10);
        }
        this.f20873J = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        L();
        this.f20892l.getDecorView();
        LayoutInflater from = LayoutInflater.from(context);
        if (this.f20874K) {
            viewGroup = this.f20872I ? (ViewGroup) from.inflate(com.luminary.mobile.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(com.luminary.mobile.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.f20873J) {
            viewGroup = (ViewGroup) from.inflate(com.luminary.mobile.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.f20871H = false;
            this.f20870G = false;
        } else if (this.f20870G) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.luminary.mobile.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new k.c(context, typedValue.resourceId) : context).inflate(com.luminary.mobile.R.layout.abc_screen_toolbar, (ViewGroup) null);
            InterfaceC0994D interfaceC0994D = (InterfaceC0994D) viewGroup.findViewById(com.luminary.mobile.R.id.decor_content_parent);
            this.f20898r = interfaceC0994D;
            interfaceC0994D.setWindowCallback(this.f20892l.getCallback());
            if (this.f20871H) {
                this.f20898r.h(109);
            }
            if (this.f20868E) {
                this.f20898r.h(2);
            }
            if (this.f20869F) {
                this.f20898r.h(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            StringBuilder sb2 = new StringBuilder("AppCompat does not support the current theme features: { windowActionBar: ");
            sb2.append(this.f20870G);
            sb2.append(", windowActionBarOverlay: ");
            sb2.append(this.f20871H);
            sb2.append(", android:windowIsFloating: ");
            sb2.append(this.f20873J);
            sb2.append(", windowActionModeOverlay: ");
            sb2.append(this.f20872I);
            sb2.append(", windowNoTitle: ");
            throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.k(sb2, this.f20874K, " }"));
        }
        N n10 = new N(this, 14);
        WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
        C1596C.d.m(viewGroup, n10);
        if (this.f20898r == null) {
            this.f20866C = (TextView) viewGroup.findViewById(com.luminary.mobile.R.id.title);
        }
        boolean z10 = e0.f23753a;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException e10) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e10);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e11) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e11);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.luminary.mobile.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f20892l.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f20892l.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new C0779f(this));
        this.f20865B = viewGroup;
        Object obj = this.f20890j;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f20897q;
        if (!TextUtils.isEmpty(title)) {
            InterfaceC0994D interfaceC0994D2 = this.f20898r;
            if (interfaceC0994D2 != null) {
                interfaceC0994D2.setWindowTitle(title);
            } else {
                AbstractC0774a abstractC0774a = this.f20895o;
                if (abstractC0774a != null) {
                    abstractC0774a.o(title);
                } else {
                    TextView textView = this.f20866C;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f20865B.findViewById(R.id.content);
        View decorView = this.f20892l.getDecorView();
        contentFrameLayout2.f4969g.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        obtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        obtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (obtainStyledAttributes2.hasValue(122)) {
            obtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (obtainStyledAttributes2.hasValue(123)) {
            obtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (obtainStyledAttributes2.hasValue(120)) {
            obtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (obtainStyledAttributes2.hasValue(121)) {
            obtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        obtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.f20864A = true;
        m N10 = N(0);
        if (this.R || N10.f20931h != null) {
            return;
        }
        P(108);
    }

    public final void L() {
        if (this.f20892l == null) {
            Object obj = this.f20890j;
            if (obj instanceof Activity) {
                C(((Activity) obj).getWindow());
            }
        }
        if (this.f20892l == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final j M(Context context) {
        if (this.X == null) {
            if (C0789p.f20978d == null) {
                Context applicationContext = context.getApplicationContext();
                C0789p.f20978d = new C0789p(applicationContext, (LocationManager) applicationContext.getSystemService(FirebaseAnalytics.Param.LOCATION));
            }
            this.X = new k(C0789p.f20978d);
        }
        return this.X;
    }

    public final m N(int i9) {
        m[] mVarArr = this.f20876M;
        if (mVarArr == null || mVarArr.length <= i9) {
            m[] mVarArr2 = new m[i9 + 1];
            if (mVarArr != null) {
                System.arraycopy(mVarArr, 0, mVarArr2, 0, mVarArr.length);
            }
            this.f20876M = mVarArr2;
            mVarArr = mVarArr2;
        }
        m mVar = mVarArr[i9];
        if (mVar != null) {
            return mVar;
        }
        m mVar2 = new m();
        mVar2.f20924a = i9;
        mVar2.f20936n = false;
        mVarArr[i9] = mVar2;
        return mVar2;
    }

    public final void O() {
        K();
        if (this.f20870G && this.f20895o == null) {
            Object obj = this.f20890j;
            if (obj instanceof Activity) {
                this.f20895o = new C0790q((Activity) obj, this.f20871H);
            } else if (obj instanceof Dialog) {
                this.f20895o = new C0790q((Dialog) obj);
            }
            AbstractC0774a abstractC0774a = this.f20895o;
            if (abstractC0774a != null) {
                abstractC0774a.l(this.f20884c0);
            }
        }
    }

    public final void P(int i9) {
        this.f20882a0 = (1 << i9) | this.f20882a0;
        if (this.f20881Z) {
            return;
        }
        View decorView = this.f20892l.getDecorView();
        WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
        decorView.postOnAnimation(this.f20883b0);
        this.f20881Z = true;
    }

    public final int Q(Context context, int i9) {
        if (i9 == -100) {
            return -1;
        }
        if (i9 != -1) {
            if (i9 == 0) {
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                return M(context).c();
            }
            if (i9 != 1 && i9 != 2) {
                if (i9 != 3) {
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
                if (this.Y == null) {
                    this.Y = new i(context);
                }
                return this.Y.c();
            }
        }
        return i9;
    }

    public final boolean R() {
        boolean z10 = this.f20878O;
        this.f20878O = false;
        m N10 = N(0);
        if (N10.f20935m) {
            if (!z10) {
                G(N10, true);
            }
            return true;
        }
        AbstractC0912a abstractC0912a = this.f20901u;
        if (abstractC0912a != null) {
            abstractC0912a.c();
            return true;
        }
        O();
        AbstractC0774a abstractC0774a = this.f20895o;
        return abstractC0774a != null && abstractC0774a.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0172, code lost:
    
        if (r3.f4736f.getCount() > 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0152, code lost:
    
        if (r3 != null) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void S(h.LayoutInflaterFactory2C0778e.m r18, android.view.KeyEvent r19) {
        /*
            Method dump skipped, instructions count: 471
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h.LayoutInflaterFactory2C0778e.S(h.e$m, android.view.KeyEvent):void");
    }

    public final boolean T(m mVar, int i9, KeyEvent keyEvent) {
        androidx.appcompat.view.menu.f fVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((mVar.f20933k || U(mVar, keyEvent)) && (fVar = mVar.f20931h) != null) {
            return fVar.performShortcut(i9, keyEvent, 1);
        }
        return false;
    }

    public final boolean U(m mVar, KeyEvent keyEvent) {
        InterfaceC0994D interfaceC0994D;
        InterfaceC0994D interfaceC0994D2;
        Resources.Theme theme;
        InterfaceC0994D interfaceC0994D3;
        InterfaceC0994D interfaceC0994D4;
        if (this.R) {
            return false;
        }
        if (mVar.f20933k) {
            return true;
        }
        m mVar2 = this.f20877N;
        if (mVar2 != null && mVar2 != mVar) {
            G(mVar2, false);
        }
        Window.Callback callback = this.f20892l.getCallback();
        int i9 = mVar.f20924a;
        if (callback != null) {
            mVar.f20930g = callback.onCreatePanelView(i9);
        }
        boolean z10 = i9 == 0 || i9 == 108;
        if (z10 && (interfaceC0994D4 = this.f20898r) != null) {
            interfaceC0994D4.b();
        }
        if (mVar.f20930g == null && (!z10 || !(this.f20895o instanceof C0787n))) {
            androidx.appcompat.view.menu.f fVar = mVar.f20931h;
            if (fVar == null || mVar.f20937o) {
                if (fVar == null) {
                    Context context = this.f20891k;
                    if ((i9 == 0 || i9 == 108) && this.f20898r != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(com.luminary.mobile.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(com.luminary.mobile.R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(com.luminary.mobile.R.attr.actionBarWidgetTheme, typedValue, true);
                            theme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (theme == null) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                            }
                            theme.applyStyle(typedValue.resourceId, true);
                        }
                        if (theme != null) {
                            k.c cVar = new k.c(context, 0);
                            cVar.getTheme().setTo(theme);
                            context = cVar;
                        }
                    }
                    androidx.appcompat.view.menu.f fVar2 = new androidx.appcompat.view.menu.f(context);
                    fVar2.f4750e = this;
                    androidx.appcompat.view.menu.f fVar3 = mVar.f20931h;
                    if (fVar2 != fVar3) {
                        if (fVar3 != null) {
                            fVar3.r(mVar.i);
                        }
                        mVar.f20931h = fVar2;
                        androidx.appcompat.view.menu.d dVar = mVar.i;
                        if (dVar != null) {
                            fVar2.b(dVar, fVar2.f4746a);
                        }
                    }
                    if (mVar.f20931h == null) {
                        return false;
                    }
                }
                if (z10 && (interfaceC0994D2 = this.f20898r) != null) {
                    if (this.f20899s == null) {
                        this.f20899s = new c();
                    }
                    interfaceC0994D2.c(mVar.f20931h, this.f20899s);
                }
                mVar.f20931h.w();
                if (!callback.onCreatePanelMenu(i9, mVar.f20931h)) {
                    androidx.appcompat.view.menu.f fVar4 = mVar.f20931h;
                    if (fVar4 != null) {
                        if (fVar4 != null) {
                            fVar4.r(mVar.i);
                        }
                        mVar.f20931h = null;
                    }
                    if (z10 && (interfaceC0994D = this.f20898r) != null) {
                        interfaceC0994D.c(null, this.f20899s);
                    }
                    return false;
                }
                mVar.f20937o = false;
            }
            mVar.f20931h.w();
            Bundle bundle = mVar.f20938p;
            if (bundle != null) {
                mVar.f20931h.s(bundle);
                mVar.f20938p = null;
            }
            if (!callback.onPreparePanel(0, mVar.f20930g, mVar.f20931h)) {
                if (z10 && (interfaceC0994D3 = this.f20898r) != null) {
                    interfaceC0994D3.c(null, this.f20899s);
                }
                mVar.f20931h.v();
                return false;
            }
            mVar.f20931h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            mVar.f20931h.v();
        }
        mVar.f20933k = true;
        mVar.f20934l = false;
        this.f20877N = mVar;
        return true;
    }

    public final void V() {
        if (this.f20864A) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void W() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z10 = false;
            if (this.f20888h0 != null && (N(0).f20935m || this.f20901u != null)) {
                z10 = true;
            }
            if (z10 && this.f20889i0 == null) {
                this.f20889i0 = g.b(this.f20888h0, this);
            } else {
                if (z10 || (onBackInvokedCallback = this.f20889i0) == null) {
                    return;
                }
                g.c(this.f20888h0, onBackInvokedCallback);
                this.f20889i0 = null;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.f.a
    public final boolean a(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
        m mVar;
        Window.Callback callback = this.f20892l.getCallback();
        if (callback != null && !this.R) {
            androidx.appcompat.view.menu.f k3 = fVar.k();
            m[] mVarArr = this.f20876M;
            int length = mVarArr != null ? mVarArr.length : 0;
            int i9 = 0;
            while (true) {
                if (i9 < length) {
                    mVar = mVarArr[i9];
                    if (mVar != null && mVar.f20931h == k3) {
                        break;
                    }
                    i9++;
                } else {
                    mVar = null;
                    break;
                }
            }
            if (mVar != null) {
                return callback.onMenuItemSelected(mVar.f20924a, menuItem);
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.f.a
    public final void b(androidx.appcompat.view.menu.f fVar) {
        InterfaceC0994D interfaceC0994D = this.f20898r;
        if (interfaceC0994D == null || !interfaceC0994D.d() || (ViewConfiguration.get(this.f20891k).hasPermanentMenuKey() && !this.f20898r.e())) {
            m N10 = N(0);
            N10.f20936n = true;
            G(N10, false);
            S(N10, null);
            return;
        }
        Window.Callback callback = this.f20892l.getCallback();
        if (this.f20898r.a()) {
            this.f20898r.f();
            if (this.R) {
                return;
            }
            callback.onPanelClosed(108, N(0).f20931h);
            return;
        }
        if (callback == null || this.R) {
            return;
        }
        if (this.f20881Z && (1 & this.f20882a0) != 0) {
            View decorView = this.f20892l.getDecorView();
            a aVar = this.f20883b0;
            decorView.removeCallbacks(aVar);
            aVar.run();
        }
        m N11 = N(0);
        androidx.appcompat.view.menu.f fVar2 = N11.f20931h;
        if (fVar2 == null || N11.f20937o || !callback.onPreparePanel(0, N11.f20930g, fVar2)) {
            return;
        }
        callback.onMenuOpened(108, N11.f20931h);
        this.f20898r.g();
    }

    @Override // h.AbstractC0777d
    public final void c(View view, ViewGroup.LayoutParams layoutParams) {
        K();
        ((ViewGroup) this.f20865B.findViewById(R.id.content)).addView(view, layoutParams);
        this.f20893m.a(this.f20892l.getCallback());
    }

    @Override // h.AbstractC0777d
    public final Context d(Context context) {
        Configuration configuration;
        this.f20879P = true;
        int i9 = this.T;
        if (i9 == -100) {
            i9 = AbstractC0777d.f20850b;
        }
        int Q4 = Q(context, i9);
        if (AbstractC0777d.l(context) && AbstractC0777d.l(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (AbstractC0777d.i) {
                    try {
                        t0.g gVar = AbstractC0777d.f20851c;
                        if (gVar == null) {
                            if (AbstractC0777d.f20852d == null) {
                                AbstractC0777d.f20852d = t0.g.a(C0877f.b(context));
                            }
                            if (!AbstractC0777d.f20852d.f27402a.isEmpty()) {
                                AbstractC0777d.f20851c = AbstractC0777d.f20852d;
                            }
                        } else if (!gVar.equals(AbstractC0777d.f20852d)) {
                            t0.g gVar2 = AbstractC0777d.f20851c;
                            AbstractC0777d.f20852d = gVar2;
                            C0877f.a(context, gVar2.f27402a.a());
                        }
                    } finally {
                    }
                }
            } else if (!AbstractC0777d.f20854f) {
                AbstractC0777d.f20849a.execute(new Z0.e(context, 2));
            }
        }
        t0.g D2 = D(context);
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(H(context, Q4, D2, null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof k.c) {
            try {
                ((k.c) context).a(H(context, Q4, D2, null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f20863l0) {
            return context;
        }
        Configuration configuration2 = new Configuration();
        configuration2.uiMode = -1;
        configuration2.fontScale = 0.0f;
        Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
        Configuration configuration4 = context.getResources().getConfiguration();
        configuration3.uiMode = configuration4.uiMode;
        if (configuration3.equals(configuration4)) {
            configuration = null;
        } else {
            configuration = new Configuration();
            configuration.fontScale = 0.0f;
            if (configuration3.diff(configuration4) != 0) {
                float f10 = configuration3.fontScale;
                float f11 = configuration4.fontScale;
                if (f10 != f11) {
                    configuration.fontScale = f11;
                }
                int i10 = configuration3.mcc;
                int i11 = configuration4.mcc;
                if (i10 != i11) {
                    configuration.mcc = i11;
                }
                int i12 = configuration3.mnc;
                int i13 = configuration4.mnc;
                if (i12 != i13) {
                    configuration.mnc = i13;
                }
                f.a(configuration3, configuration4, configuration);
                int i14 = configuration3.touchscreen;
                int i15 = configuration4.touchscreen;
                if (i14 != i15) {
                    configuration.touchscreen = i15;
                }
                int i16 = configuration3.keyboard;
                int i17 = configuration4.keyboard;
                if (i16 != i17) {
                    configuration.keyboard = i17;
                }
                int i18 = configuration3.keyboardHidden;
                int i19 = configuration4.keyboardHidden;
                if (i18 != i19) {
                    configuration.keyboardHidden = i19;
                }
                int i20 = configuration3.navigation;
                int i21 = configuration4.navigation;
                if (i20 != i21) {
                    configuration.navigation = i21;
                }
                int i22 = configuration3.navigationHidden;
                int i23 = configuration4.navigationHidden;
                if (i22 != i23) {
                    configuration.navigationHidden = i23;
                }
                int i24 = configuration3.orientation;
                int i25 = configuration4.orientation;
                if (i24 != i25) {
                    configuration.orientation = i25;
                }
                int i26 = configuration3.screenLayout & 15;
                int i27 = configuration4.screenLayout & 15;
                if (i26 != i27) {
                    configuration.screenLayout |= i27;
                }
                int i28 = configuration3.screenLayout & 192;
                int i29 = configuration4.screenLayout & 192;
                if (i28 != i29) {
                    configuration.screenLayout |= i29;
                }
                int i30 = configuration3.screenLayout & 48;
                int i31 = configuration4.screenLayout & 48;
                if (i30 != i31) {
                    configuration.screenLayout |= i31;
                }
                int i32 = configuration3.screenLayout & 768;
                int i33 = configuration4.screenLayout & 768;
                if (i32 != i33) {
                    configuration.screenLayout |= i33;
                }
                int i34 = configuration3.colorMode & 3;
                int i35 = configuration4.colorMode & 3;
                if (i34 != i35) {
                    configuration.colorMode |= i35;
                }
                int i36 = configuration3.colorMode & 12;
                int i37 = configuration4.colorMode & 12;
                if (i36 != i37) {
                    configuration.colorMode |= i37;
                }
                int i38 = configuration3.uiMode & 15;
                int i39 = configuration4.uiMode & 15;
                if (i38 != i39) {
                    configuration.uiMode |= i39;
                }
                int i40 = configuration3.uiMode & 48;
                int i41 = configuration4.uiMode & 48;
                if (i40 != i41) {
                    configuration.uiMode |= i41;
                }
                int i42 = configuration3.screenWidthDp;
                int i43 = configuration4.screenWidthDp;
                if (i42 != i43) {
                    configuration.screenWidthDp = i43;
                }
                int i44 = configuration3.screenHeightDp;
                int i45 = configuration4.screenHeightDp;
                if (i44 != i45) {
                    configuration.screenHeightDp = i45;
                }
                int i46 = configuration3.smallestScreenWidthDp;
                int i47 = configuration4.smallestScreenWidthDp;
                if (i46 != i47) {
                    configuration.smallestScreenWidthDp = i47;
                }
                int i48 = configuration3.densityDpi;
                int i49 = configuration4.densityDpi;
                if (i48 != i49) {
                    configuration.densityDpi = i49;
                }
            }
        }
        Configuration H10 = H(context, Q4, D2, configuration, true);
        k.c cVar = new k.c(context, 2132083343);
        cVar.a(H10);
        try {
            if (context.getTheme() != null) {
                Resources.Theme theme = cVar.getTheme();
                if (Build.VERSION.SDK_INT >= 29) {
                    m0.h.a(theme);
                } else {
                    synchronized (m0.g.f23866a) {
                        if (!m0.g.f23868c) {
                            try {
                                Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                m0.g.f23867b = declaredMethod;
                                declaredMethod.setAccessible(true);
                            } catch (NoSuchMethodException e10) {
                                Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e10);
                            }
                            m0.g.f23868c = true;
                        }
                        Method method = m0.g.f23867b;
                        if (method != null) {
                            try {
                                method.invoke(theme, null);
                            } catch (IllegalAccessException | InvocationTargetException e11) {
                                Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e11);
                                m0.g.f23867b = null;
                            }
                        }
                    }
                }
            }
        } catch (NullPointerException unused3) {
        }
        return cVar;
    }

    @Override // h.AbstractC0777d
    public final <T extends View> T e(int i9) {
        K();
        return (T) this.f20892l.findViewById(i9);
    }

    @Override // h.AbstractC0777d
    public final Context f() {
        return this.f20891k;
    }

    @Override // h.AbstractC0777d
    public final int g() {
        return this.T;
    }

    @Override // h.AbstractC0777d
    public final MenuInflater h() {
        if (this.f20896p == null) {
            O();
            AbstractC0774a abstractC0774a = this.f20895o;
            this.f20896p = new k.f(abstractC0774a != null ? abstractC0774a.e() : this.f20891k);
        }
        return this.f20896p;
    }

    @Override // h.AbstractC0777d
    public final AbstractC0774a i() {
        O();
        return this.f20895o;
    }

    @Override // h.AbstractC0777d
    public final void j() {
        LayoutInflater from = LayoutInflater.from(this.f20891k);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else {
            if (from.getFactory2() instanceof LayoutInflaterFactory2C0778e) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // h.AbstractC0777d
    public final void k() {
        if (this.f20895o != null) {
            O();
            if (this.f20895o.f()) {
                return;
            }
            P(0);
        }
    }

    @Override // h.AbstractC0777d
    public final void m(Configuration configuration) {
        if (this.f20870G && this.f20864A) {
            O();
            AbstractC0774a abstractC0774a = this.f20895o;
            if (abstractC0774a != null) {
                abstractC0774a.g();
            }
        }
        C1008j a10 = C1008j.a();
        Context context = this.f20891k;
        synchronized (a10) {
            m.N n10 = a10.f23778a;
            synchronized (n10) {
                androidx.collection.d<WeakReference<Drawable.ConstantState>> dVar = n10.f23682b.get(context);
                if (dVar != null) {
                    dVar.clear();
                }
            }
        }
        this.S = new Configuration(this.f20891k.getResources().getConfiguration());
        B(false, false);
    }

    @Override // h.AbstractC0777d
    public final void n() {
        String str;
        this.f20879P = true;
        B(false, true);
        L();
        Object obj = this.f20890j;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    str = j0.l.c(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e10) {
                    throw new IllegalArgumentException(e10);
                }
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                AbstractC0774a abstractC0774a = this.f20895o;
                if (abstractC0774a == null) {
                    this.f20884c0 = true;
                } else {
                    abstractC0774a.l(true);
                }
            }
            synchronized (AbstractC0777d.f20856h) {
                AbstractC0777d.t(this);
                AbstractC0777d.f20855g.add(new WeakReference<>(this));
            }
        }
        this.S = new Configuration(this.f20891k.getResources().getConfiguration());
        this.f20880Q = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // h.AbstractC0777d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f20890j
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = h.AbstractC0777d.f20856h
            monitor-enter(r0)
            h.AbstractC0777d.t(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
        L11:
            boolean r0 = r3.f20881Z
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.f20892l
            android.view.View r0 = r0.getDecorView()
            h.e$a r1 = r3.f20883b0
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.R = r0
            int r0 = r3.T
            r1 = -100
            if (r0 == r1) goto L4d
            java.lang.Object r0 = r3.f20890j
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L4d
            androidx.collection.g<java.lang.String, java.lang.Integer> r0 = h.LayoutInflaterFactory2C0778e.f20861j0
            java.lang.Object r1 = r3.f20890j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.T
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5c
        L4d:
            androidx.collection.g<java.lang.String, java.lang.Integer> r0 = h.LayoutInflaterFactory2C0778e.f20861j0
            java.lang.Object r1 = r3.f20890j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5c:
            h.a r0 = r3.f20895o
            if (r0 == 0) goto L63
            r0.h()
        L63:
            h.e$k r0 = r3.X
            if (r0 == 0) goto L6a
            r0.a()
        L6a:
            h.e$i r0 = r3.Y
            if (r0 == 0) goto L71
            r0.a()
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.LayoutInflaterFactory2C0778e.o():void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x010d, code lost:
    
        if (r10.equals("ImageButton") == false) goto L24;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View onCreateView(android.view.View r9, java.lang.String r10, android.content.Context r11, android.util.AttributeSet r12) {
        /*
            Method dump skipped, instructions count: 720
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h.LayoutInflaterFactory2C0778e.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    @Override // h.AbstractC0777d
    public final void p() {
        K();
    }

    @Override // h.AbstractC0777d
    public final void q() {
        O();
        AbstractC0774a abstractC0774a = this.f20895o;
        if (abstractC0774a != null) {
            abstractC0774a.n(true);
        }
    }

    @Override // h.AbstractC0777d
    public final void r() {
        B(true, false);
    }

    @Override // h.AbstractC0777d
    public final void s() {
        O();
        AbstractC0774a abstractC0774a = this.f20895o;
        if (abstractC0774a != null) {
            abstractC0774a.n(false);
        }
    }

    @Override // h.AbstractC0777d
    public final boolean u(int i9) {
        if (i9 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i9 = 108;
        } else if (i9 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i9 = 109;
        }
        if (this.f20874K && i9 == 108) {
            return false;
        }
        if (this.f20870G && i9 == 1) {
            this.f20870G = false;
        }
        if (i9 == 1) {
            V();
            this.f20874K = true;
            return true;
        }
        if (i9 == 2) {
            V();
            this.f20868E = true;
            return true;
        }
        if (i9 == 5) {
            V();
            this.f20869F = true;
            return true;
        }
        if (i9 == 10) {
            V();
            this.f20872I = true;
            return true;
        }
        if (i9 == 108) {
            V();
            this.f20870G = true;
            return true;
        }
        if (i9 != 109) {
            return this.f20892l.requestFeature(i9);
        }
        V();
        this.f20871H = true;
        return true;
    }

    @Override // h.AbstractC0777d
    public final void v(int i9) {
        K();
        ViewGroup viewGroup = (ViewGroup) this.f20865B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f20891k).inflate(i9, viewGroup);
        this.f20893m.a(this.f20892l.getCallback());
    }

    @Override // h.AbstractC0777d
    public final void w(View view) {
        K();
        ViewGroup viewGroup = (ViewGroup) this.f20865B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f20893m.a(this.f20892l.getCallback());
    }

    @Override // h.AbstractC0777d
    public final void x(View view, ViewGroup.LayoutParams layoutParams) {
        K();
        ViewGroup viewGroup = (ViewGroup) this.f20865B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f20893m.a(this.f20892l.getCallback());
    }

    @Override // h.AbstractC0777d
    public final void y(Toolbar toolbar) {
        Object obj = this.f20890j;
        if (obj instanceof Activity) {
            O();
            AbstractC0774a abstractC0774a = this.f20895o;
            if (abstractC0774a instanceof C0790q) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.f20896p = null;
            if (abstractC0774a != null) {
                abstractC0774a.h();
            }
            this.f20895o = null;
            if (toolbar != null) {
                C0787n c0787n = new C0787n(toolbar, obj instanceof Activity ? ((Activity) obj).getTitle() : this.f20897q, this.f20893m);
                this.f20895o = c0787n;
                this.f20893m.f20912b = c0787n.f20962c;
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                this.f20893m.f20912b = null;
            }
            k();
        }
    }

    @Override // h.AbstractC0777d
    public final void z(int i9) {
        this.U = i9;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: h.e$h */
    public class h extends k.h {

        /* renamed from: b, reason: collision with root package name */
        public b f20912b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f20913c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f20914d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f20915e;

        public h(Window.Callback callback) {
            super(callback);
        }

        public final void a(Window.Callback callback) {
            try {
                this.f20913c = true;
                callback.onContentChanged();
            } finally {
                this.f20913c = false;
            }
        }

        @Override // android.view.Window.Callback
        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            boolean z10 = this.f20914d;
            Window.Callback callback = this.f22666a;
            return z10 ? callback.dispatchKeyEvent(keyEvent) : LayoutInflaterFactory2C0778e.this.I(keyEvent) || callback.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.Window.Callback
        public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            if (this.f22666a.dispatchKeyShortcutEvent(keyEvent)) {
                return true;
            }
            int keyCode = keyEvent.getKeyCode();
            LayoutInflaterFactory2C0778e layoutInflaterFactory2C0778e = LayoutInflaterFactory2C0778e.this;
            layoutInflaterFactory2C0778e.O();
            AbstractC0774a abstractC0774a = layoutInflaterFactory2C0778e.f20895o;
            if (abstractC0774a != null && abstractC0774a.i(keyCode, keyEvent)) {
                return true;
            }
            m mVar = layoutInflaterFactory2C0778e.f20877N;
            if (mVar != null && layoutInflaterFactory2C0778e.T(mVar, keyEvent.getKeyCode(), keyEvent)) {
                m mVar2 = layoutInflaterFactory2C0778e.f20877N;
                if (mVar2 == null) {
                    return true;
                }
                mVar2.f20934l = true;
                return true;
            }
            if (layoutInflaterFactory2C0778e.f20877N == null) {
                m N10 = layoutInflaterFactory2C0778e.N(0);
                layoutInflaterFactory2C0778e.U(N10, keyEvent);
                boolean T = layoutInflaterFactory2C0778e.T(N10, keyEvent.getKeyCode(), keyEvent);
                N10.f20933k = false;
                if (T) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.view.Window.Callback
        public final void onContentChanged() {
            if (this.f20913c) {
                this.f22666a.onContentChanged();
            }
        }

        @Override // android.view.Window.Callback
        public final boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof androidx.appcompat.view.menu.f)) {
                return this.f22666a.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        @Override // android.view.Window.Callback
        public final View onCreatePanelView(int i) {
            b bVar = this.f20912b;
            if (bVar != null) {
                View view = i == 0 ? new View(C0787n.this.f20960a.f5103a.getContext()) : null;
                if (view != null) {
                    return view;
                }
            }
            return this.f22666a.onCreatePanelView(i);
        }

        @Override // k.h, android.view.Window.Callback
        public final boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            LayoutInflaterFactory2C0778e layoutInflaterFactory2C0778e = LayoutInflaterFactory2C0778e.this;
            if (i == 108) {
                layoutInflaterFactory2C0778e.O();
                AbstractC0774a abstractC0774a = layoutInflaterFactory2C0778e.f20895o;
                if (abstractC0774a != null) {
                    abstractC0774a.c(true);
                }
            } else {
                layoutInflaterFactory2C0778e.getClass();
            }
            return true;
        }

        @Override // k.h, android.view.Window.Callback
        public final void onPanelClosed(int i, Menu menu) {
            if (this.f20915e) {
                this.f22666a.onPanelClosed(i, menu);
                return;
            }
            super.onPanelClosed(i, menu);
            LayoutInflaterFactory2C0778e layoutInflaterFactory2C0778e = LayoutInflaterFactory2C0778e.this;
            if (i == 108) {
                layoutInflaterFactory2C0778e.O();
                AbstractC0774a abstractC0774a = layoutInflaterFactory2C0778e.f20895o;
                if (abstractC0774a != null) {
                    abstractC0774a.c(false);
                    return;
                }
                return;
            }
            if (i != 0) {
                layoutInflaterFactory2C0778e.getClass();
                return;
            }
            m N10 = layoutInflaterFactory2C0778e.N(i);
            if (N10.f20935m) {
                layoutInflaterFactory2C0778e.G(N10, false);
            }
        }

        @Override // android.view.Window.Callback
        public final boolean onPreparePanel(int i, View view, Menu menu) {
            androidx.appcompat.view.menu.f fVar = menu instanceof androidx.appcompat.view.menu.f ? (androidx.appcompat.view.menu.f) menu : null;
            if (i == 0 && fVar == null) {
                return false;
            }
            if (fVar != null) {
                fVar.f4768x = true;
            }
            b bVar = this.f20912b;
            if (bVar != null) {
                C0787n.e eVar = (C0787n.e) bVar;
                if (i == 0) {
                    C0787n c0787n = C0787n.this;
                    if (!c0787n.f20963d) {
                        c0787n.f20960a.f5114m = true;
                        c0787n.f20963d = true;
                    }
                }
            }
            boolean onPreparePanel = this.f22666a.onPreparePanel(i, view, menu);
            if (fVar != null) {
                fVar.f4768x = false;
            }
            return onPreparePanel;
        }

        @Override // k.h, android.view.Window.Callback
        public final void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            androidx.appcompat.view.menu.f fVar = LayoutInflaterFactory2C0778e.this.N(0).f20931h;
            if (fVar != null) {
                super.onProvideKeyboardShortcuts(list, fVar, i);
            } else {
                super.onProvideKeyboardShortcuts(list, menu, i);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0058  */
        @Override // android.view.Window.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback r10, int r11) {
            /*
                Method dump skipped, instructions count: 470
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: h.LayoutInflaterFactory2C0778e.h.onWindowStartingActionMode(android.view.ActionMode$Callback, int):android.view.ActionMode");
        }

        @Override // android.view.Window.Callback
        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }
    }
}
