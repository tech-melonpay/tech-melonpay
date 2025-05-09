package U4;

import Fa.h;
import I5.j;
import I5.k;
import I5.m;
import P9.n;
import Y8.e;
import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0530d;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.T;
import androidx.lifecycle.X;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.i;
import b1.InterfaceC0584d;
import ca.InterfaceC0635a;
import ca.InterfaceC0650p;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.Strictness;
import com.google.gson.l;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import com.luminary.business.domain.entity.transaction.PaymentType;
import com.luminary.business.domain.entity.user.BusinessSectorType;
import com.luminary.mobile.R;
import f2.c;
import ia.InterfaceC0835c;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import kotlin.Result;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$2;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.RestrictedContinuationImpl;
import m.N;
import org.koin.core.error.DefinitionOverrideException;
import r3.C1149a;
import r4.d;
import u4.C1520b;

/* compiled from: ProxyTokenMapper.kt */
/* loaded from: classes.dex */
public class b implements c {
    public static String A(e eVar) {
        String name = eVar.name();
        if ("br".equals(name)) {
            return "\n";
        }
        if ("img".equals(name)) {
            String str = eVar.d().get("alt");
            return (str == null || str.length() == 0) ? "￼" : str;
        }
        if ("iframe".equals(name)) {
            return " ";
        }
        return null;
    }

    public static int B(double d10) {
        if (Double.isNaN(d10)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if (d10 > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d10 < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d10);
    }

    public static int C(float f10) {
        if (Float.isNaN(f10)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f10);
    }

    public static final void D(View view, InterfaceC0584d interfaceC0584d) {
        view.setTag(R.id.view_tree_saved_state_registry_owner, interfaceC0584d);
    }

    public static Date E(String str) {
        Object failure;
        Object failure2;
        Object failure3;
        Object failure4;
        Object failure5;
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS", locale);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        try {
            failure = simpleDateFormat.parse(str);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a10 = Result.a(failure);
        if (a10 != null) {
            a10.printStackTrace();
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        Date date = (Date) failure;
        if (date != null) {
            return date;
        }
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm", locale);
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
        try {
            failure2 = simpleDateFormat2.parse(str);
        } catch (Throwable th2) {
            failure2 = new Result.Failure(th2);
        }
        Throwable a11 = Result.a(failure2);
        if (a11 != null) {
            a11.printStackTrace();
        }
        if (failure2 instanceof Result.Failure) {
            failure2 = null;
        }
        Date date2 = (Date) failure2;
        if (date2 != null) {
            return date2;
        }
        SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", locale);
        simpleDateFormat3.setTimeZone(TimeZone.getTimeZone("UTC"));
        try {
            failure3 = simpleDateFormat3.parse(str);
        } catch (Throwable th3) {
            failure3 = new Result.Failure(th3);
        }
        Throwable a12 = Result.a(failure3);
        if (a12 != null) {
            a12.printStackTrace();
        }
        if (failure3 instanceof Result.Failure) {
            failure3 = null;
        }
        Date date3 = (Date) failure3;
        if (date3 != null) {
            return date3;
        }
        SimpleDateFormat simpleDateFormat4 = new SimpleDateFormat("yyyy-MM-dd", locale);
        simpleDateFormat4.setTimeZone(TimeZone.getTimeZone("UTC"));
        try {
            failure4 = simpleDateFormat4.parse(str);
        } catch (Throwable th4) {
            failure4 = new Result.Failure(th4);
        }
        Throwable a13 = Result.a(failure4);
        if (a13 != null) {
            a13.printStackTrace();
        }
        if (failure4 instanceof Result.Failure) {
            failure4 = null;
        }
        Date date4 = (Date) failure4;
        if (date4 != null) {
            return date4;
        }
        SimpleDateFormat simpleDateFormat5 = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss", locale);
        simpleDateFormat5.setTimeZone(TimeZone.getTimeZone("UTC"));
        try {
            failure5 = simpleDateFormat5.parse(str);
        } catch (Throwable th5) {
            failure5 = new Result.Failure(th5);
        }
        Throwable a14 = Result.a(failure5);
        if (a14 != null) {
            a14.printStackTrace();
        }
        return (Date) (failure5 instanceof Result.Failure ? null : failure5);
    }

    public static final j F(r4.b bVar) {
        return new j(bVar.b(), bVar.f(), bVar.h(), bVar.d(), bVar.c(), bVar.j(), bVar.i(), bVar.e(), bVar.g());
    }

    public static final F5.b G(C1520b c1520b) {
        String C10 = c1520b.C();
        Integer l10 = c1520b.l();
        String H10 = c1520b.H();
        String G8 = c1520b.G();
        Date E8 = G8 != null ? E(G8) : null;
        int i = c1520b.i();
        String r8 = c1520b.r();
        String F10 = c1520b.F();
        BigDecimal b9 = c1520b.b();
        String p10 = c1520b.p();
        String q10 = c1520b.q();
        String A10 = c1520b.A();
        String t3 = c1520b.t();
        String z10 = c1520b.z();
        String v10 = c1520b.v();
        String y10 = c1520b.y();
        BigDecimal u6 = c1520b.u();
        String w2 = c1520b.w();
        String S = c1520b.S();
        String K2 = c1520b.K();
        String P4 = c1520b.P();
        String R = c1520b.R();
        String M8 = c1520b.M();
        String Q4 = c1520b.Q();
        BigDecimal L7 = c1520b.L();
        String N10 = c1520b.N();
        String J3 = c1520b.J();
        String o10 = c1520b.o();
        Date E10 = o10 != null ? E(o10) : null;
        String T = c1520b.T();
        String E11 = c1520b.E();
        String D2 = c1520b.D();
        Boolean B10 = c1520b.B();
        String I10 = c1520b.I();
        String x9 = c1520b.x();
        String O6 = c1520b.O();
        p4.a m2 = c1520b.m();
        B5.a aVar = m2 != null ? new B5.a(m2.b(), m2.f(), m2.e(), m2.d(), m2.c()) : null;
        p4.b n10 = c1520b.n();
        return new F5.b(C10, l10, H10, E8, i, r8, F10, b9, p10, q10, A10, t3, z10, v10, y10, u6, w2, S, K2, P4, R, M8, Q4, L7, N10, J3, E10, T, E11, D2, B10, I10, x9, O6, aVar, n10 != null ? Ja.a.F(n10) : null, c1520b.e(), c1520b.f(), c1520b.k(), c1520b.g(), c1520b.h(), c1520b.j(), c1520b.c(), c1520b.d(), c1520b.s());
    }

    public static final List H(List list) {
        if (list == null) {
            return EmptyList.f23104a;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(n.u(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(G((C1520b) it.next()));
        }
        return arrayList;
    }

    public static final k I(d dVar) {
        Integer B10 = dVar.B();
        String h02 = dVar.h0();
        String w2 = dVar.w();
        Boolean x9 = dVar.x();
        String P4 = dVar.P();
        String O6 = dVar.O();
        Boolean Q4 = dVar.Q();
        String e02 = dVar.e0();
        String y10 = dVar.y();
        String J3 = dVar.J();
        String b9 = dVar.b();
        String A10 = dVar.A();
        String c02 = dVar.c0();
        String k3 = dVar.k();
        String S = dVar.S();
        String t3 = dVar.t();
        String R = dVar.R();
        Long h9 = dVar.h();
        Integer C10 = dVar.C();
        String D2 = dVar.D();
        String E8 = dVar.E();
        String U = dVar.U();
        Integer N10 = dVar.N();
        Integer M8 = dVar.M();
        Integer L7 = dVar.L();
        String n10 = dVar.n();
        String o10 = dVar.o();
        String s10 = dVar.s();
        String d02 = dVar.d0();
        String l02 = dVar.l0();
        String g02 = dVar.g0();
        String u6 = dVar.u();
        String j10 = dVar.j();
        return new k(B10, h02, w2, x9, P4, O6, Q4, e02, y10, J3, b9, A10, c02, k3, S, t3, R, h9, C10, D2, E8, U, N10, M8, L7, n10, o10, s10, d02, l02, g02, u6, j10 != null ? BusinessSectorType.valueOf(j10) : null, dVar.i(), dVar.m(), dVar.r(), dVar.l(), dVar.q(), dVar.v(), dVar.p(), dVar.T(), dVar.j0(), dVar.k0(), dVar.i0(), dVar.V(), dVar.X(), dVar.I(), dVar.H(), dVar.g(), dVar.c(), dVar.f0(), dVar.e(), dVar.f(), dVar.d(), dVar.Y(), dVar.a0(), dVar.Z(), dVar.G(), dVar.b0(), dVar.z(), dVar.W(), dVar.K(), dVar.F());
    }

    public static final r4.e J(m mVar) {
        return new r4.e(mVar.f1850a, mVar.f1851b, mVar.f1852c, mVar.f1853d, mVar.f1854e, mVar.f1855f, mVar.f1856g, mVar.f1857h, mVar.i, mVar.f1858j, mVar.f1859k, mVar.f1860l, mVar.f1861m, mVar.f1862n, mVar.f1863o);
    }

    public static final H5.b K(v4.d dVar) {
        PaymentType paymentType;
        Long s10 = dVar.s();
        Long k3 = dVar.k();
        String A10 = dVar.A();
        String w2 = dVar.w();
        String u6 = dVar.u();
        String t3 = dVar.t();
        String v10 = dVar.v();
        if (v10 == null || (paymentType = PaymentType.valueOf(v10)) == null) {
            paymentType = PaymentType.f11147a;
        }
        PaymentType paymentType2 = paymentType;
        String n10 = dVar.n();
        String r8 = dVar.r();
        String j10 = dVar.j();
        String p10 = dVar.p();
        String q10 = dVar.q();
        String x9 = dVar.x();
        String m2 = dVar.m();
        Date E8 = m2 != null ? E(m2) : null;
        String z10 = dVar.z();
        return new H5.b(s10, k3, A10, w2, u6, t3, paymentType2, n10, r8, j10, p10, q10, x9, E8, z10 != null ? E(z10) : null, dVar.a(), dVar.l(), dVar.d(), dVar.e(), dVar.i(), dVar.f(), dVar.g(), dVar.h(), dVar.b(), dVar.c(), dVar.y(), dVar.o());
    }

    public static Object L(InterfaceC0650p interfaceC0650p, Object obj, T9.a aVar) {
        kotlin.coroutines.d context = aVar.getContext();
        BaseContinuationImpl intrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1 = context == EmptyCoroutineContext.f23155a ? new IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1(aVar) : new IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$2(aVar, context);
        kotlin.jvm.internal.j.c(2, interfaceC0650p);
        return interfaceC0650p.invoke(obj, intrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1);
    }

    public static void M(ByteArrayOutputStream byteArrayOutputStream, long j10, int i) {
        byte[] bArr = new byte[i];
        for (int i9 = 0; i9 < i; i9++) {
            bArr[i9] = (byte) ((j10 >> (i9 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void N(ByteArrayOutputStream byteArrayOutputStream, int i) {
        M(byteArrayOutputStream, i, 2);
    }

    public static final StackTraceElement c(String str, Exception exc) {
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        return new StackTraceElement("_COROUTINE.".concat(str), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
    }

    public static final void d(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                O9.m.a(th, th2);
            }
        }
    }

    public static byte[] e(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static T9.a f(final InterfaceC0650p interfaceC0650p, final Object obj, final T9.a aVar) {
        if (interfaceC0650p instanceof BaseContinuationImpl) {
            return ((BaseContinuationImpl) interfaceC0650p).create(obj, aVar);
        }
        final kotlin.coroutines.d context = aVar.getContext();
        return context == EmptyCoroutineContext.f23155a ? new RestrictedContinuationImpl(aVar) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$3

            /* renamed from: u, reason: collision with root package name */
            public int f23166u;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj2) {
                int i = this.f23166u;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("This coroutine had already completed".toString());
                    }
                    this.f23166u = 2;
                    b.b(obj2);
                    return obj2;
                }
                this.f23166u = 1;
                b.b(obj2);
                InterfaceC0650p interfaceC0650p2 = InterfaceC0650p.this;
                kotlin.jvm.internal.j.c(2, interfaceC0650p2);
                return interfaceC0650p2.invoke(obj, this);
            }
        } : new ContinuationImpl(aVar, context) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$4

            /* renamed from: u, reason: collision with root package name */
            public int f23169u;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj2) {
                int i = this.f23169u;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("This coroutine had already completed".toString());
                    }
                    this.f23169u = 2;
                    b.b(obj2);
                    return obj2;
                }
                this.f23169u = 1;
                b.b(obj2);
                InterfaceC0650p interfaceC0650p2 = interfaceC0650p;
                kotlin.jvm.internal.j.c(2, interfaceC0650p2);
                return interfaceC0650p2.invoke(obj, this);
            }
        };
    }

    public static final NavController g(Fragment fragment) {
        Dialog dialog;
        Window window;
        for (Fragment fragment2 = fragment; fragment2 != null; fragment2 = fragment2.getParentFragment()) {
            if (fragment2 instanceof NavHostFragment) {
                return ((NavHostFragment) fragment2).o0();
            }
            Fragment fragment3 = fragment2.getParentFragmentManager().f6716A;
            if (fragment3 instanceof NavHostFragment) {
                return ((NavHostFragment) fragment3).o0();
            }
        }
        View view = fragment.getView();
        if (view != null) {
            return i.a(view);
        }
        View view2 = null;
        DialogInterfaceOnCancelListenerC0530d dialogInterfaceOnCancelListenerC0530d = fragment instanceof DialogInterfaceOnCancelListenerC0530d ? (DialogInterfaceOnCancelListenerC0530d) fragment : null;
        if (dialogInterfaceOnCancelListenerC0530d != null && (dialog = dialogInterfaceOnCancelListenerC0530d.getDialog()) != null && (window = dialog.getWindow()) != null) {
            view2 = window.getDecorView();
        }
        if (view2 != null) {
            return i.a(view2);
        }
        throw new IllegalStateException(androidx.camera.core.impl.utils.a.k("Fragment ", fragment, " does not have a NavController set"));
    }

    public static int h(float f10) {
        return ((int) (f10 + 16384.0d)) - 16384;
    }

    public static void i() {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
    }

    public static Drawable j(Context context, int i) {
        return N.c().e(context, i);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class k(InterfaceC0835c interfaceC0835c) {
        Class<?> g10 = ((kotlin.jvm.internal.a) interfaceC0835c).g();
        if (!g10.isPrimitive()) {
            return g10;
        }
        String name = g10.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (!name.equals("double")) {
                }
                break;
            case 104431:
                if (!name.equals("int")) {
                }
                break;
            case 3039496:
                if (!name.equals("byte")) {
                }
                break;
            case 3052374:
                if (!name.equals("char")) {
                }
                break;
            case 3327612:
                if (!name.equals("long")) {
                }
                break;
            case 3625364:
                if (!name.equals("void")) {
                }
                break;
            case 64711720:
                if (!name.equals("boolean")) {
                }
                break;
            case 97526364:
                if (!name.equals("float")) {
                }
                break;
            case 109413500:
                if (!name.equals("short")) {
                }
                break;
        }
        return g10;
    }

    public static final org.koin.core.scope.a l(ComponentCallbacks componentCallbacks) {
        if (componentCallbacks instanceof Va.a) {
            return ((Va.a) componentCallbacks).a();
        }
        if (componentCallbacks instanceof ab.b) {
            return ((ab.b) componentCallbacks).a();
        }
        if (componentCallbacks instanceof ab.a) {
            return ((ib.a) ((ab.a) componentCallbacks).b().f1299b).f21521b;
        }
        h hVar = bb.a.f8486b;
        if (hVar != null) {
            return ((ib.a) hVar.f1299b).f21521b;
        }
        throw new IllegalStateException("KoinApplication has not been started".toString());
    }

    public static final int m(int i, int i9, int i10) {
        if (i10 > 0) {
            if (i >= i9) {
                return i9;
            }
            int i11 = i9 % i10;
            if (i11 < 0) {
                i11 += i10;
            }
            int i12 = i % i10;
            if (i12 < 0) {
                i12 += i10;
            }
            int i13 = (i11 - i12) % i10;
            if (i13 < 0) {
                i13 += i10;
            }
            return i9 - i13;
        }
        if (i10 >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        }
        if (i <= i9) {
            return i9;
        }
        int i14 = -i10;
        int i15 = i % i14;
        if (i15 < 0) {
            i15 += i14;
        }
        int i16 = i9 % i14;
        if (i16 < 0) {
            i16 += i14;
        }
        int i17 = (i15 - i16) % i14;
        if (i17 < 0) {
            i17 += i14;
        }
        return i9 + i17;
    }

    public static final T n(X x9, kotlin.jvm.internal.b bVar, hb.a aVar, InterfaceC0635a interfaceC0635a, org.koin.core.scope.a aVar2) {
        return new Ya.a(aVar2, new Wa.a(bVar, aVar, interfaceC0635a, x9, null));
    }

    public static final String o(InterfaceC0835c interfaceC0835c, hb.a aVar, hb.a aVar2) {
        String str;
        if (aVar == null || (str = aVar.a()) == null) {
            str = "";
        }
        return kb.a.a(interfaceC0835c) + ':' + str + ':' + aVar2;
    }

    public static T9.a p(T9.a aVar) {
        T9.a<Object> intercepted;
        ContinuationImpl continuationImpl = aVar instanceof ContinuationImpl ? (ContinuationImpl) aVar : null;
        return (continuationImpl == null || (intercepted = continuationImpl.intercepted()) == null) ? aVar : intercepted;
    }

    public static boolean q(EditText editText) {
        return editText.getInputType() != 0;
    }

    public static String r(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb2 = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb2.append(str.charAt(i));
            if (str2.length() > i) {
                sb2.append(str2.charAt(i));
            }
        }
        return sb2.toString();
    }

    public static final void s(db.b bVar, String str) {
        throw new DefinitionOverrideException("Already existing definition for " + bVar.f20487a + " at " + str);
    }

    public static l t(C1149a c1149a) {
        Strictness strictness = c1149a.f26150b;
        if (strictness == Strictness.f10314b) {
            c1149a.f26150b = Strictness.f10313a;
        }
        try {
            try {
                return j3.e.z(c1149a);
            } catch (OutOfMemoryError e10) {
                throw new JsonParseException("Failed parsing JSON source: " + c1149a + " to Json", e10);
            } catch (StackOverflowError e11) {
                throw new JsonParseException("Failed parsing JSON source: " + c1149a + " to Json", e11);
            }
        } finally {
            c1149a.p0(strictness);
        }
    }

    public static l u(String str) {
        try {
            C1149a c1149a = new C1149a(new StringReader(str));
            l t3 = t(c1149a);
            t3.getClass();
            if (!(t3 instanceof com.google.gson.m) && c1149a.k0() != JsonToken.f10418j) {
                throw new JsonSyntaxException("Did not consume the entire document.");
            }
            return t3;
        } catch (MalformedJsonException e10) {
            throw new JsonSyntaxException(e10);
        } catch (IOException e11) {
            throw new JsonIOException(e11);
        } catch (NumberFormatException e12) {
            throw new JsonSyntaxException(e12);
        }
    }

    public static byte[] v(InputStream inputStream, int i) {
        byte[] bArr = new byte[i];
        int i9 = 0;
        while (i9 < i) {
            int read = inputStream.read(bArr, i9, i - i9);
            if (read < 0) {
                throw new IllegalStateException(com.google.android.gms.measurement.internal.a.g(i, "Not enough bytes to read: "));
            }
            i9 += read;
        }
        return bArr;
    }

    public static final byte[] w(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        byte[] bArr = new byte[8192];
        int read = inputStream.read(bArr);
        while (read >= 0) {
            byteArrayOutputStream.write(bArr, 0, read);
            read = inputStream.read(bArr);
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        if (r0.finished() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        throw new java.lang.IllegalStateException("Inflater did not finish");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] x(java.io.FileInputStream r8, int r9, int r10) {
        /*
            java.util.zip.Inflater r0 = new java.util.zip.Inflater
            r0.<init>()
            byte[] r1 = new byte[r10]     // Catch: java.lang.Throwable -> L2e
            r2 = 2048(0x800, float:2.87E-42)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L2e
            r3 = 0
            r4 = r3
            r5 = r4
        Le:
            boolean r6 = r0.finished()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L57
            boolean r6 = r0.needsDictionary()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L57
            if (r4 >= r9) goto L57
            int r6 = r8.read(r2)     // Catch: java.lang.Throwable -> L2e
            if (r6 < 0) goto L3b
            r0.setInput(r2, r3, r6)     // Catch: java.lang.Throwable -> L2e
            int r7 = r10 - r5
            int r7 = r0.inflate(r1, r5, r7)     // Catch: java.lang.Throwable -> L2e java.util.zip.DataFormatException -> L30
            int r5 = r5 + r7
            int r4 = r4 + r6
            goto Le
        L2e:
            r8 = move-exception
            goto L8a
        L30:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L3b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r8.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = "Invalid zip data. Stream ended after $totalBytesRead bytes. Expected "
            r8.append(r10)     // Catch: java.lang.Throwable -> L2e
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r9 = " bytes"
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L57:
            if (r4 != r9) goto L6b
            boolean r8 = r0.finished()     // Catch: java.lang.Throwable -> L2e
            if (r8 == 0) goto L63
            r0.end()
            return r1
        L63:
            java.lang.String r8 = "Inflater did not finish"
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L6b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r8.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = "Didn't read enough bytes during decompression. expected="
            r8.append(r10)     // Catch: java.lang.Throwable -> L2e
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r9 = " actual="
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            r8.append(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L8a:
            r0.end()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: U4.b.x(java.io.FileInputStream, int, int):byte[]");
    }

    public static final String y(Reader reader) {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[8192];
        int read = reader.read(cArr);
        while (read >= 0) {
            stringWriter.write(cArr, 0, read);
            read = reader.read(cArr);
        }
        return stringWriter.toString();
    }

    public static long z(InputStream inputStream, int i) {
        byte[] v10 = v(inputStream, i);
        long j10 = 0;
        for (int i9 = 0; i9 < i; i9++) {
            j10 += (v10[i9] & 255) << (i9 * 8);
        }
        return j10;
    }

    @Override // f2.c
    public boolean b(Context context, Bitmap bitmap, float f10) {
        return false;
    }

    @Override // f2.c
    public void release() {
    }

    @Override // f2.c
    public void a(Bitmap bitmap, Bitmap bitmap2) {
    }
}
