package C;

import S1.i;
import a5.C0512b;
import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.video.VideoEncoderSession;
import androidx.camera.video.internal.encoder.EncoderImpl;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.AbstractC0557x;
import androidx.lifecycle.C0558y;
import androidx.viewpager.widget.ViewPager;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.chuckerteam.chucker.internal.data.room.ChuckerDatabase;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.tabs.TabLayout;
import com.luminary.business.presentation.utils.kyc.KycStatus;
import com.luminary.mobile.R;
import com.shockwave.pdfium.PdfDocument;
import com.shockwave.pdfium.PdfiumCore;
import com.sumsub.sns.core.data.listener.SNSCompleteHandler;
import com.sumsub.sns.core.data.model.SNSCompletionResult;
import com.sumsub.sns.core.data.model.SNSSDKState;
import h.LayoutInflaterFactory2C0778e;
import io.michaelrocks.libphonenumber.android.Phonemetadata$PhoneNumberDesc;
import io.sentry.InterfaceC0859q;
import io.sentry.InterfaceC0861t;
import io.sentry.SentryLevel;
import java.io.File;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Currency;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.regex.Matcher;
import k0.C0913a;
import k1.InterfaceC0935p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;
import l2.InterfaceC0982b;
import m.e0;
import n.C1058a;
import org.koin.core.logger.Level;
import r2.b;
import u9.RunnableC1537h;
import y0.C1596C;

/* compiled from: VideoEncoderSession.java */
/* loaded from: classes.dex */
public final class N implements FutureCallback, U8.r, y0.p, SNSCompleteHandler, InterfaceC0861t, InterfaceC0935p, InterfaceC0982b {

    /* renamed from: c, reason: collision with root package name */
    public static Class f528c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f529d;

    /* renamed from: e, reason: collision with root package name */
    public static Method f530e;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f531f;

    /* renamed from: g, reason: collision with root package name */
    public static Method f532g;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f533h;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f534a;

    /* renamed from: b, reason: collision with root package name */
    public Object f535b;

    public /* synthetic */ N(int i, char c2) {
        this.f534a = i;
    }

    public static void g() {
        if (f529d) {
            return;
        }
        try {
            f528c = Class.forName("android.view.GhostView");
        } catch (ClassNotFoundException e10) {
            Log.i("GhostViewApi21", "Failed to retrieve GhostView class", e10);
        }
        f529d = true;
    }

    @Override // io.sentry.InterfaceC0861t
    public void a(long j10) {
        synchronized (((ScheduledExecutorService) this.f535b)) {
            if (!((ScheduledExecutorService) this.f535b).isShutdown()) {
                ((ScheduledExecutorService) this.f535b).shutdown();
                try {
                    if (!((ScheduledExecutorService) this.f535b).awaitTermination(j10, TimeUnit.MILLISECONDS)) {
                        ((ScheduledExecutorService) this.f535b).shutdownNow();
                    }
                } catch (InterruptedException unused) {
                    ((ScheduledExecutorService) this.f535b).shutdownNow();
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // y0.p
    public y0.J c(View view, y0.J j10) {
        boolean z10;
        boolean z11;
        boolean z12;
        y0.J j11;
        switch (this.f534a) {
            case 7:
                int a10 = j10.a();
                BaseTransientBottomBar baseTransientBottomBar = (BaseTransientBottomBar) this.f535b;
                baseTransientBottomBar.f9754m = a10;
                baseTransientBottomBar.f9755n = j10.b();
                baseTransientBottomBar.f9756o = j10.c();
                baseTransientBottomBar.f();
                return j10;
            case 14:
                int d10 = j10.d();
                LayoutInflaterFactory2C0778e layoutInflaterFactory2C0778e = (LayoutInflaterFactory2C0778e) this.f535b;
                layoutInflaterFactory2C0778e.getClass();
                int d11 = j10.d();
                ActionBarContextView actionBarContextView = layoutInflaterFactory2C0778e.f20902v;
                if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
                    z10 = false;
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutInflaterFactory2C0778e.f20902v.getLayoutParams();
                    if (layoutInflaterFactory2C0778e.f20902v.isShown()) {
                        if (layoutInflaterFactory2C0778e.f20885d0 == null) {
                            layoutInflaterFactory2C0778e.f20885d0 = new Rect();
                            layoutInflaterFactory2C0778e.f20886f0 = new Rect();
                        }
                        Rect rect = layoutInflaterFactory2C0778e.f20885d0;
                        Rect rect2 = layoutInflaterFactory2C0778e.f20886f0;
                        rect.set(j10.b(), j10.d(), j10.c(), j10.a());
                        ViewGroup viewGroup = layoutInflaterFactory2C0778e.f20865B;
                        if (Build.VERSION.SDK_INT >= 29) {
                            boolean z13 = e0.f23753a;
                            e0.a.a(viewGroup, rect, rect2);
                        } else {
                            if (!e0.f23753a) {
                                e0.f23753a = true;
                                try {
                                    Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                                    e0.f23754b = declaredMethod;
                                    if (!declaredMethod.isAccessible()) {
                                        e0.f23754b.setAccessible(true);
                                    }
                                } catch (NoSuchMethodException unused) {
                                    Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                                }
                            }
                            Method method = e0.f23754b;
                            if (method != null) {
                                try {
                                    method.invoke(viewGroup, rect, rect2);
                                } catch (Exception e10) {
                                    Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e10);
                                }
                            }
                        }
                        int i = rect.top;
                        int i9 = rect.left;
                        int i10 = rect.right;
                        ViewGroup viewGroup2 = layoutInflaterFactory2C0778e.f20865B;
                        WeakHashMap<View, y0.E> weakHashMap = C1596C.f30963a;
                        y0.J a11 = C1596C.e.a(viewGroup2);
                        int b9 = a11 == null ? 0 : a11.b();
                        int c2 = a11 == null ? 0 : a11.c();
                        if (marginLayoutParams.topMargin == i && marginLayoutParams.leftMargin == i9 && marginLayoutParams.rightMargin == i10) {
                            z12 = false;
                        } else {
                            marginLayoutParams.topMargin = i;
                            marginLayoutParams.leftMargin = i9;
                            marginLayoutParams.rightMargin = i10;
                            z12 = true;
                        }
                        Context context = layoutInflaterFactory2C0778e.f20891k;
                        if (i <= 0 || layoutInflaterFactory2C0778e.f20867D != null) {
                            View view2 = layoutInflaterFactory2C0778e.f20867D;
                            if (view2 != null) {
                                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                                int i11 = marginLayoutParams2.height;
                                int i12 = marginLayoutParams.topMargin;
                                if (i11 != i12 || marginLayoutParams2.leftMargin != b9 || marginLayoutParams2.rightMargin != c2) {
                                    marginLayoutParams2.height = i12;
                                    marginLayoutParams2.leftMargin = b9;
                                    marginLayoutParams2.rightMargin = c2;
                                    layoutInflaterFactory2C0778e.f20867D.setLayoutParams(marginLayoutParams2);
                                }
                            }
                        } else {
                            View view3 = new View(context);
                            layoutInflaterFactory2C0778e.f20867D = view3;
                            view3.setVisibility(8);
                            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                            layoutParams.leftMargin = b9;
                            layoutParams.rightMargin = c2;
                            layoutInflaterFactory2C0778e.f20865B.addView(layoutInflaterFactory2C0778e.f20867D, -1, layoutParams);
                        }
                        View view4 = layoutInflaterFactory2C0778e.f20867D;
                        boolean z14 = view4 != null;
                        if (z14 && view4.getVisibility() != 0) {
                            View view5 = layoutInflaterFactory2C0778e.f20867D;
                            view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? C0913a.getColor(context, R.color.abc_decor_view_status_guard_light) : C0913a.getColor(context, R.color.abc_decor_view_status_guard));
                        }
                        if (!layoutInflaterFactory2C0778e.f20872I && z14) {
                            d11 = 0;
                        }
                        z10 = z14;
                        z11 = z12;
                    } else if (marginLayoutParams.topMargin != 0) {
                        marginLayoutParams.topMargin = 0;
                        z10 = false;
                        z11 = true;
                    } else {
                        z10 = false;
                        z11 = false;
                    }
                    if (z11) {
                        layoutInflaterFactory2C0778e.f20902v.setLayoutParams(marginLayoutParams);
                    }
                }
                View view6 = layoutInflaterFactory2C0778e.f20867D;
                if (view6 != null) {
                    view6.setVisibility(z10 ? 0 : 8);
                }
                return C1596C.j(view, d10 != d11 ? j10.f(j10.b(), d11, j10.c(), j10.a()) : j10);
            case 25:
                AppBarLayout appBarLayout = (AppBarLayout) this.f535b;
                appBarLayout.getClass();
                WeakHashMap<View, y0.E> weakHashMap2 = C1596C.f30963a;
                j11 = appBarLayout.getFitsSystemWindows() ? j10 : null;
                if (!Objects.equals(appBarLayout.f8980g, j11)) {
                    appBarLayout.f8980g = j11;
                    if (appBarLayout.f8994v != null && appBarLayout.getTopInset() > 0) {
                        r3 = 1;
                    }
                    appBarLayout.setWillNotDraw(r3 ^ 1);
                    appBarLayout.requestLayout();
                }
                return j10;
            default:
                CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) this.f535b;
                collapsingToolbarLayout.getClass();
                WeakHashMap<View, y0.E> weakHashMap3 = C1596C.f30963a;
                j11 = collapsingToolbarLayout.getFitsSystemWindows() ? j10 : null;
                if (!Objects.equals(collapsingToolbarLayout.f9013A, j11)) {
                    collapsingToolbarLayout.f9013A = j11;
                    collapsingToolbarLayout.requestLayout();
                }
                return j10.f31013a.c();
        }
    }

    @Override // io.sentry.InterfaceC0861t
    public Future d(RunnableC1537h runnableC1537h) {
        return ((ScheduledExecutorService) this.f535b).schedule(runnableC1537h, 30000L, TimeUnit.MILLISECONDS);
    }

    public PdfDocument e(Context context, PdfiumCore pdfiumCore, String str) {
        switch (this.f534a) {
            case 11:
                return pdfiumCore.h(ParcelFileDescriptor.open((File) this.f535b, 268435456), str);
            default:
                return pdfiumCore.h(context.getContentResolver().openFileDescriptor((Uri) this.f535b, "r"), str);
        }
    }

    public void f(String str) {
        ((Level) this.f535b).compareTo(Level.f25554a);
    }

    @Override // N9.a
    public Object get() {
        switch (this.f534a) {
            case 20:
                return this.f535b;
            default:
                r2.a aVar = (r2.a) ((N9.a) this.f535b).get();
                HashMap hashMap = new HashMap();
                Priority priority = Priority.f8901a;
                Set emptySet = Collections.emptySet();
                if (emptySet == null) {
                    throw new NullPointerException("Null flags");
                }
                Long l10 = 30000L;
                Long l11 = 86400000L;
                hashMap.put(priority, new com.google.android.datatransport.runtime.scheduling.jobscheduling.b(l10.longValue(), l11.longValue(), emptySet));
                Priority priority2 = Priority.f8903c;
                Set emptySet2 = Collections.emptySet();
                if (emptySet2 == null) {
                    throw new NullPointerException("Null flags");
                }
                Long l12 = 1000L;
                Long l13 = 86400000L;
                hashMap.put(priority2, new com.google.android.datatransport.runtime.scheduling.jobscheduling.b(l12.longValue(), l13.longValue(), emptySet2));
                Priority priority3 = Priority.f8902b;
                if (Collections.emptySet() == null) {
                    throw new NullPointerException("Null flags");
                }
                Long l14 = 86400000L;
                Long l15 = 86400000L;
                Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(SchedulerConfig.Flag.f8962a, SchedulerConfig.Flag.f8963b)));
                if (unmodifiableSet == null) {
                    throw new NullPointerException("Null flags");
                }
                hashMap.put(priority3, new com.google.android.datatransport.runtime.scheduling.jobscheduling.b(l14.longValue(), l15.longValue(), unmodifiableSet));
                if (aVar == null) {
                    throw new NullPointerException("missing required property: clock");
                }
                if (hashMap.keySet().size() < Priority.values().length) {
                    throw new IllegalStateException("Not all priorities have been configured");
                }
                new HashMap();
                return new com.google.android.datatransport.runtime.scheduling.jobscheduling.a(aVar, hashMap);
        }
    }

    public AbstractC0557x h(String str, String str2) {
        String a10 = str2.length() > 0 ? androidx.camera.core.n.a("%", str2, "%") : "%";
        return ((ChuckerDatabase) this.f535b).a().a(str.concat("%"), a10, a10);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [T, java.lang.Object] */
    public C0558y i(long j10) {
        AbstractC0557x<HttpTransaction> c2 = ((ChuckerDatabase) this.f535b).a().c(j10);
        K8.c cVar = new K8.c(2);
        Z0.c cVar2 = C1058a.f24058e;
        C0558y c0558y = new C0558y();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.f23179a = S1.i.f3353a;
        c0558y.a(c2, new i.a(new S1.h(cVar2, ref$ObjectRef, cVar, c0558y)));
        return c0558y;
    }

    public boolean j(Level level) {
        return ((Level) this.f535b).compareTo(level) <= 0;
    }

    public void k(InterfaceC0635a interfaceC0635a) {
        Level level = Level.f25554a;
        if (j(level)) {
            ((Level) this.f535b).compareTo(level);
        }
    }

    public boolean l(CharSequence charSequence, Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc) {
        String str = phonemetadata$PhoneNumberDesc.f21645b;
        if (str.length() == 0) {
            return false;
        }
        Matcher matcher = ((io.michaelrocks.libphonenumber.android.internal.a) this.f535b).a(str).matcher(charSequence);
        if (matcher.lookingAt()) {
            return matcher.matches();
        }
        return false;
    }

    public N m(N n10) {
        int[] iArr = (int[]) this.f535b;
        int length = iArr.length;
        int[] iArr2 = (int[]) n10.f535b;
        if (length - iArr2.length < 0) {
            return this;
        }
        int i = iArr[0];
        int[] iArr3 = mb.g.f24052b;
        int i9 = iArr3[i] - iArr3[iArr2[0]];
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        int length2 = iArr2.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length2) {
            copyOf[i11] = mb.g.a(mb.g.f24052b[iArr2[i10]] + i9) ^ copyOf[i11];
            i10++;
            i11++;
        }
        return new N(copyOf, 0).m(n10);
    }

    public void n() {
        W1.d dVar = (W1.d) this.f535b;
        dVar.f3800b.cancel();
        View view = dVar.f3799a;
        if (view.getVisibility() == 4) {
            view.setVisibility(0);
            dVar.a();
            dVar.f3801c.start();
        }
    }

    public void o(io.sentry.E e10, InterfaceC0859q interfaceC0859q, Object obj) {
        if (obj == null) {
            e10.A();
            return;
        }
        if (obj instanceof Character) {
            e10.H(Character.toString(((Character) obj).charValue()));
            return;
        }
        if (obj instanceof String) {
            e10.H((String) obj);
            return;
        }
        if (obj instanceof Boolean) {
            e10.M(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Number) {
            e10.G((Number) obj);
            return;
        }
        if (obj instanceof Date) {
            try {
                e10.H(io.sentry.I.q((Date) obj));
                return;
            } catch (Exception e11) {
                interfaceC0859q.f(SentryLevel.ERROR, "Error when serializing Date", e11);
                e10.A();
                return;
            }
        }
        if (obj instanceof TimeZone) {
            try {
                e10.H(((TimeZone) obj).getID());
                return;
            } catch (Exception e12) {
                interfaceC0859q.f(SentryLevel.ERROR, "Error when serializing TimeZone", e12);
                e10.A();
                return;
            }
        }
        if (obj instanceof io.sentry.F) {
            ((io.sentry.F) obj).serialize(e10, interfaceC0859q);
            return;
        }
        if (obj instanceof Collection) {
            p(e10, interfaceC0859q, (Collection) obj);
            return;
        }
        if (obj.getClass().isArray()) {
            p(e10, interfaceC0859q, Arrays.asList((Object[]) obj));
            return;
        }
        if (obj instanceof Map) {
            q(e10, interfaceC0859q, (Map) obj);
            return;
        }
        if (obj instanceof Locale) {
            e10.H(obj.toString());
            return;
        }
        if (obj instanceof AtomicIntegerArray) {
            AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
            int length = atomicIntegerArray.length();
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                arrayList.add(Integer.valueOf(atomicIntegerArray.get(i)));
            }
            p(e10, interfaceC0859q, arrayList);
            return;
        }
        if (obj instanceof AtomicBoolean) {
            e10.M(((AtomicBoolean) obj).get());
            return;
        }
        if (obj instanceof URI) {
            e10.H(obj.toString());
            return;
        }
        if (obj instanceof InetAddress) {
            e10.H(obj.toString());
            return;
        }
        if (obj instanceof UUID) {
            e10.H(obj.toString());
            return;
        }
        if (obj instanceof Currency) {
            e10.H(obj.toString());
            return;
        }
        if (obj instanceof Calendar) {
            q(e10, interfaceC0859q, D9.b.h((Calendar) obj));
            return;
        }
        if (obj.getClass().isEnum()) {
            e10.H(obj.toString());
            return;
        }
        try {
            o(e10, interfaceC0859q, ((Na.a) this.f535b).f(interfaceC0859q, obj));
        } catch (Exception e13) {
            interfaceC0859q.f(SentryLevel.ERROR, "Failed serializing unknown object.", e13);
            e10.H("[OBJECT]");
        }
    }

    @Override // com.sumsub.sns.core.data.listener.SNSCompleteHandler
    public void onComplete(SNSCompletionResult sNSCompletionResult, SNSSDKState sNSSDKState) {
        boolean z10 = sNSCompletionResult instanceof SNSCompletionResult.SuccessTermination;
        C0512b c0512b = (C0512b) this.f535b;
        if (!z10) {
            if (!(sNSCompletionResult instanceof SNSCompletionResult.AbnormalTermination)) {
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC0646l<? super KycStatus, O9.p> interfaceC0646l = c0512b.f4450a;
            (interfaceC0646l != null ? interfaceC0646l : null).invoke(KycStatus.f13330b);
            return;
        }
        if (kotlin.jvm.internal.f.b(sNSSDKState.getName(), "Approved")) {
            InterfaceC0646l<? super KycStatus, O9.p> interfaceC0646l2 = c0512b.f4450a;
            (interfaceC0646l2 != null ? interfaceC0646l2 : null).invoke(KycStatus.f13329a);
        } else {
            InterfaceC0646l<? super KycStatus, O9.p> interfaceC0646l3 = c0512b.f4450a;
            (interfaceC0646l3 != null ? interfaceC0646l3 : null).invoke(KycStatus.f13330b);
        }
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
    public void onFailure(Throwable th) {
        switch (this.f534a) {
            case 0:
                Logger.w("VideoEncoderSession", "VideoEncoder configuration failed.", th);
                ((VideoEncoderSession) this.f535b).b();
                break;
            default:
                ((EncoderImpl) this.f535b).c(0, "Unable to acquire InputBuffer.", th);
                break;
        }
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
    public void onSuccess(Object obj) {
        switch (this.f534a) {
            case 0:
                break;
            default:
                J.t tVar = (J.t) obj;
                EncoderImpl encoderImpl = (EncoderImpl) this.f535b;
                encoderImpl.f5708q.getClass();
                tVar.e(D9.b.H0());
                tVar.a();
                tVar.d();
                Futures.addCallback(tVar.b(), new J.n(this), encoderImpl.f5700h);
                break;
        }
    }

    public void p(io.sentry.E e10, InterfaceC0859q interfaceC0859q, Collection collection) {
        e10.N();
        e10.d();
        int i = e10.f2732c;
        int[] iArr = e10.f2731b;
        if (i == iArr.length) {
            e10.f2731b = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = e10.f2731b;
        int i9 = e10.f2732c;
        e10.f2732c = i9 + 1;
        iArr2[i9] = 1;
        e10.f2730a.write(91);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            o(e10, interfaceC0859q, it.next());
        }
        e10.j(']', 1, 2);
    }

    public void q(io.sentry.E e10, InterfaceC0859q interfaceC0859q, Map map) {
        e10.i();
        for (Object obj : map.keySet()) {
            if (obj instanceof String) {
                e10.P((String) obj);
                o(e10, interfaceC0859q, map.get(obj));
            }
        }
        e10.p();
    }

    @Override // k1.InterfaceC0935p
    public void setVisibility(int i) {
        ((View) this.f535b).setVisibility(i);
    }

    @Override // io.sentry.InterfaceC0861t
    public Future submit(Runnable runnable) {
        return ((ScheduledExecutorService) this.f535b).submit(runnable);
    }

    public /* synthetic */ N(Object obj, int i) {
        this.f534a = i;
        this.f535b = obj;
    }

    public N(List list) {
        this.f534a = 18;
        this.f535b = new ArrayList(list == null ? new ArrayList(0) : list);
    }

    public N(int[] iArr, int i) {
        this.f534a = 21;
        int length = iArr.length;
        int i9 = 0;
        while (true) {
            if (i9 >= length) {
                i9 = -1;
                break;
            } else if (iArr[i9] != 0) {
                break;
            } else {
                i9++;
            }
        }
        i9 = i9 < 0 ? 0 : i9;
        int length2 = (iArr.length - i9) + i;
        int[] iArr2 = new int[length2];
        for (int i10 = 0; i10 < length2; i10++) {
            iArr2[i10] = 0;
        }
        this.f535b = iArr2;
        int length3 = iArr.length - i9;
        for (int i11 = 0; i11 < length3; i11++) {
            iArr2[i11] = iArr[i9 + i11];
        }
    }

    public N(int i) {
        this.f534a = 15;
        this.f535b = new Na.a(i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public N(int i, byte b9) {
        this(Level.f25557d, 13);
        this.f534a = i;
        switch (i) {
            case 6:
                this.f535b = new HashMap(3);
                break;
            case 13:
                break;
            case 17:
                this.f535b = Executors.newSingleThreadScheduledExecutor();
                break;
            case 22:
                this.f535b = b.a.f26146a;
                break;
            case 24:
                this.f535b = new com.google.i18n.phonenumbers.internal.a();
                break;
            case 27:
                this.f535b = new za.g(ya.d.f31189h, TimeUnit.MINUTES);
                break;
            case 28:
                this.f535b = (w.C) w.k.f30775a.get(w.C.class);
                break;
            case 29:
                this.f535b = (w.o) w.k.f30775a.get(w.o.class);
                break;
            default:
                this.f535b = new io.michaelrocks.libphonenumber.android.internal.a(100);
                break;
        }
    }

    public N(CoordinatorLayout coordinatorLayout, TabLayout tabLayout, MaterialToolbar materialToolbar, TextView textView, ViewPager viewPager) {
        this.f534a = 1;
        this.f535b = textView;
    }

    @Override // k1.InterfaceC0935p
    public void b(View view, ViewGroup viewGroup) {
    }
}
