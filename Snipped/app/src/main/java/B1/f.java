package B1;

import B1.f;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.Rect;
import android.os.Build;
import android.util.Size;
import android.view.View;
import androidx.camera.core.Logger;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.DBUtil;
import androidx.viewpager.widget.ViewPager;
import androidx.work.impl.WorkDatabase;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import ca.InterfaceC0650p;
import com.google.gson.JsonIOException;
import com.google.gson.Strictness;
import com.google.gson.stream.JsonToken;
import ia.InterfaceC0835c;
import io.sentry.DataCategory;
import io.sentry.I;
import io.sentry.InterfaceC0859q;
import io.sentry.SentryItemType;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.c0;
import io.sentry.clientreport.DiscardReason;
import io.sentry.g0;
import java.io.BufferedInputStream;
import java.io.CharConversionException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import ka.C0956a;
import kotlin.Result;
import l2.InterfaceC0982b;
import na.InterfaceC1077a;
import na.InterfaceC1078b;
import r3.C1149a;
import ra.C1176k;
import ra.C1182q;
import ra.S;
import ra.Z;
import v3.C1543a;
import va.i;
import w3.C1566a;
import y0.C1596C;
import y0.J;

/* compiled from: PreferenceDao_Impl.java */
/* loaded from: classes.dex */
public final class f implements C9.e, qb.f, InterfaceC0859q, InterfaceC0982b, y0.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f228a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f229b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f230c;

    public /* synthetic */ f(int i, Object obj, Object obj2) {
        this.f228a = i;
        this.f229b = obj;
        this.f230c = obj2;
    }

    public static DataCategory l(SentryItemType sentryItemType) {
        return SentryItemType.Event.equals(sentryItemType) ? DataCategory.Error : SentryItemType.Session.equals(sentryItemType) ? DataCategory.Session : SentryItemType.Transaction.equals(sentryItemType) ? DataCategory.Transaction : SentryItemType.UserFeedback.equals(sentryItemType) ? DataCategory.UserReport : SentryItemType.Attachment.equals(sentryItemType) ? DataCategory.Attachment : DataCategory.Default;
    }

    @Override // C9.e
    public void a(DiscardReason discardReason, DataCategory dataCategory) {
        try {
            t(discardReason.getReason(), dataCategory.getCategory(), 1L);
        } catch (Throwable th) {
            ((SentryOptions) this.f230c).getLogger().d(SentryLevel.ERROR, th, "Unable to record lost event.", new Object[0]);
        }
    }

    @Override // qb.f
    public Object b(Object obj) {
        Charset charset;
        switch (this.f228a) {
            case 5:
                return ((I3.b) this.f230c).a((InterfaceC1077a) this.f229b, (va.i) obj);
            default:
                va.i iVar = (va.i) obj;
                i.a aVar = iVar.f30756a;
                if (aVar == null) {
                    Ka.i p10 = iVar.p();
                    okhttp3.i j10 = iVar.j();
                    if (j10 == null || (charset = j10.a(C0956a.f23054b)) == null) {
                        charset = C0956a.f23054b;
                    }
                    aVar = new i.a(p10, charset);
                    iVar.f30756a = aVar;
                }
                com.google.gson.g gVar = (com.google.gson.g) this.f229b;
                gVar.getClass();
                C1149a c1149a = new C1149a(aVar);
                Strictness strictness = gVar.f10344n;
                if (strictness == null) {
                    strictness = Strictness.f10314b;
                }
                c1149a.f26150b = strictness;
                try {
                    Object a10 = ((com.google.gson.r) this.f230c).a(c1149a);
                    if (c1149a.k0() == JsonToken.f10418j) {
                        return a10;
                    }
                    throw new JsonIOException("JSON document was not fully consumed.");
                } finally {
                    iVar.close();
                }
        }
    }

    @Override // y0.p
    public J c(View view, J j10) {
        J j11 = C1596C.j(view, j10);
        if (j11.f31013a.m()) {
            return j11;
        }
        int b9 = j11.b();
        Rect rect = (Rect) this.f229b;
        rect.left = b9;
        rect.top = j11.d();
        rect.right = j11.c();
        rect.bottom = j11.a();
        ViewPager viewPager = (ViewPager) this.f230c;
        int childCount = viewPager.getChildCount();
        for (int i = 0; i < childCount; i++) {
            J b10 = C1596C.b(viewPager.getChildAt(i), j11);
            rect.left = Math.min(b10.b(), rect.left);
            rect.top = Math.min(b10.d(), rect.top);
            rect.right = Math.min(b10.c(), rect.right);
            rect.bottom = Math.min(b10.a(), rect.bottom);
        }
        return j11.f(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // io.sentry.InterfaceC0859q
    public void d(SentryLevel sentryLevel, Throwable th, String str, Object... objArr) {
        InterfaceC0859q interfaceC0859q = (InterfaceC0859q) this.f230c;
        if (interfaceC0859q == null || !j(sentryLevel)) {
            return;
        }
        interfaceC0859q.d(sentryLevel, th, str, objArr);
    }

    @Override // C9.e
    public void e(DiscardReason discardReason, f fVar) {
        if (fVar == null) {
            return;
        }
        try {
            Iterator it = ((Iterable) fVar.f230c).iterator();
            while (it.hasNext()) {
                i(discardReason, (g0) it.next());
            }
        } catch (Throwable th) {
            ((SentryOptions) this.f230c).getLogger().d(SentryLevel.ERROR, th, "Unable to record lost envelope.", new Object[0]);
        }
    }

    @Override // io.sentry.InterfaceC0859q
    public void f(SentryLevel sentryLevel, String str, Throwable th) {
        InterfaceC0859q interfaceC0859q = (InterfaceC0859q) this.f230c;
        if (interfaceC0859q == null || !j(sentryLevel)) {
            return;
        }
        interfaceC0859q.f(sentryLevel, str, th);
    }

    @Override // C9.e
    public f g(f fVar) {
        SentryOptions sentryOptions = (SentryOptions) this.f230c;
        Date n10 = I.n();
        C9.a aVar = (C9.a) this.f229b;
        aVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<C9.c, AtomicLong> entry : aVar.f688a.entrySet()) {
            long andSet = entry.getValue().getAndSet(0L);
            Long valueOf = Long.valueOf(andSet);
            if (andSet > 0) {
                arrayList.add(new C9.d(entry.getKey().f692a, entry.getKey().f693b, valueOf));
            }
        }
        C9.b bVar = arrayList.isEmpty() ? null : new C9.b(n10, arrayList);
        if (bVar == null) {
            return fVar;
        }
        try {
            sentryOptions.getLogger().h(SentryLevel.DEBUG, "Attaching client report to envelope.", new Object[0]);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = ((Iterable) fVar.f230c).iterator();
            while (it.hasNext()) {
                arrayList2.add((g0) it.next());
            }
            arrayList2.add(g0.a(sentryOptions.getSerializer(), bVar));
            return new f((c0) fVar.f229b, arrayList2);
        } catch (Throwable th) {
            sentryOptions.getLogger().d(SentryLevel.ERROR, th, "Unable to attach client report to envelope.", new Object[0]);
            return fVar;
        }
    }

    @Override // N9.a
    public Object get() {
        return new k2.i((Context) ((N9.a) this.f229b).get(), (k2.g) ((N9.a) this.f230c).get());
    }

    @Override // io.sentry.InterfaceC0859q
    public void h(SentryLevel sentryLevel, String str, Object... objArr) {
        InterfaceC0859q interfaceC0859q = (InterfaceC0859q) this.f230c;
        if (interfaceC0859q == null || !j(sentryLevel)) {
            return;
        }
        interfaceC0859q.h(sentryLevel, str, objArr);
    }

    @Override // C9.e
    public void i(DiscardReason discardReason, g0 g0Var) {
        SentryOptions sentryOptions = (SentryOptions) this.f230c;
        if (g0Var == null) {
            return;
        }
        try {
            SentryItemType sentryItemType = g0Var.f22004a.f22011c;
            if (SentryItemType.ClientReport.equals(sentryItemType)) {
                try {
                    u(g0Var.d(sentryOptions.getSerializer()));
                } catch (Exception unused) {
                    sentryOptions.getLogger().h(SentryLevel.ERROR, "Unable to restore counts from previous client report.", new Object[0]);
                }
            } else {
                t(discardReason.getReason(), l(sentryItemType).getCategory(), 1L);
            }
        } catch (Throwable th) {
            sentryOptions.getLogger().d(SentryLevel.ERROR, th, "Unable to record lost envelope item.", new Object[0]);
        }
    }

    @Override // io.sentry.InterfaceC0859q
    public boolean j(SentryLevel sentryLevel) {
        SentryOptions sentryOptions = (SentryOptions) this.f229b;
        return sentryLevel != null && sentryOptions.isDebug() && sentryLevel.ordinal() >= sentryOptions.getDiagnosticLevel().ordinal();
    }

    public Size[] k(Size[] sizeArr, int i) {
        List emptyList;
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList(Arrays.asList(sizeArr));
        if (((w.n) this.f229b) != null) {
            Size[] sizeArr2 = (i == 34 && "motorola".equalsIgnoreCase(Build.BRAND) && "moto e5 play".equalsIgnoreCase(Build.MODEL)) ? new Size[]{new Size(1920, 1080), new Size(1440, 1080), new Size(1280, 720), new Size(960, 720), new Size(864, 480), new Size(720, 480)} : new Size[0];
            if (sizeArr2.length > 0) {
                arrayList2.addAll(Arrays.asList(sizeArr2));
            }
        }
        m3.b bVar = (m3.b) this.f230c;
        bVar.getClass();
        if (((w.l) w.k.f30775a.get(w.l.class)) == null) {
            emptyList = new ArrayList();
        } else {
            String str = Build.BRAND;
            boolean z10 = "OnePlus".equalsIgnoreCase(str) && "OnePlus6".equalsIgnoreCase(Build.DEVICE);
            String str2 = bVar.f23896a;
            if (z10) {
                arrayList = new ArrayList();
                if (str2.equals("0") && i == 256) {
                    arrayList.add(new Size(4160, 3120));
                    arrayList.add(new Size(4000, 3000));
                }
            } else if ("OnePlus".equalsIgnoreCase(str) && "OnePlus6T".equalsIgnoreCase(Build.DEVICE)) {
                arrayList = new ArrayList();
                if (str2.equals("0") && i == 256) {
                    arrayList.add(new Size(4160, 3120));
                    arrayList.add(new Size(4000, 3000));
                }
            } else {
                if ("HUAWEI".equalsIgnoreCase(str) && "HWANE".equalsIgnoreCase(Build.DEVICE)) {
                    ArrayList arrayList3 = new ArrayList();
                    if (str2.equals("0") && (i == 34 || i == 35)) {
                        arrayList3.add(new Size(720, 720));
                        arrayList3.add(new Size(400, 400));
                    }
                    emptyList = arrayList3;
                } else if (w.l.d()) {
                    arrayList = new ArrayList();
                    if (str2.equals("0")) {
                        if (i == 34) {
                            arrayList.add(new Size(4128, 3096));
                            arrayList.add(new Size(4128, 2322));
                            arrayList.add(new Size(3088, 3088));
                            arrayList.add(new Size(3264, 2448));
                            arrayList.add(new Size(3264, 1836));
                            arrayList.add(new Size(2048, 1536));
                            arrayList.add(new Size(2048, 1152));
                            arrayList.add(new Size(1920, 1080));
                        } else if (i == 35) {
                            arrayList.add(new Size(4128, 2322));
                            arrayList.add(new Size(3088, 3088));
                            arrayList.add(new Size(3264, 2448));
                            arrayList.add(new Size(3264, 1836));
                            arrayList.add(new Size(2048, 1536));
                            arrayList.add(new Size(2048, 1152));
                            arrayList.add(new Size(1920, 1080));
                        }
                    } else if (str2.equals("1") && (i == 34 || i == 35)) {
                        arrayList.add(new Size(3264, 2448));
                        arrayList.add(new Size(3264, 1836));
                        arrayList.add(new Size(2448, 2448));
                        arrayList.add(new Size(1920, 1920));
                        arrayList.add(new Size(2048, 1536));
                        arrayList.add(new Size(2048, 1152));
                        arrayList.add(new Size(1920, 1080));
                    }
                } else if (w.l.c()) {
                    arrayList = new ArrayList();
                    if (str2.equals("0")) {
                        if (i == 34) {
                            arrayList.add(new Size(4128, 3096));
                            arrayList.add(new Size(4128, 2322));
                            arrayList.add(new Size(3088, 3088));
                            arrayList.add(new Size(3264, 2448));
                            arrayList.add(new Size(3264, 1836));
                            arrayList.add(new Size(2048, 1536));
                            arrayList.add(new Size(2048, 1152));
                            arrayList.add(new Size(1920, 1080));
                        } else if (i == 35) {
                            arrayList.add(new Size(2048, 1536));
                            arrayList.add(new Size(2048, 1152));
                            arrayList.add(new Size(1920, 1080));
                        }
                    } else if (str2.equals("1") && (i == 34 || i == 35)) {
                        arrayList.add(new Size(2576, 1932));
                        arrayList.add(new Size(2560, 1440));
                        arrayList.add(new Size(1920, 1920));
                        arrayList.add(new Size(2048, 1536));
                        arrayList.add(new Size(2048, 1152));
                        arrayList.add(new Size(1920, 1080));
                    }
                } else {
                    Logger.w("ExcludedSupportedSizesQuirk", "Cannot retrieve list of supported sizes to exclude on this device.");
                    emptyList = Collections.emptyList();
                }
            }
            emptyList = arrayList;
        }
        if (!emptyList.isEmpty()) {
            arrayList2.removeAll(emptyList);
        }
        if (arrayList2.isEmpty()) {
            Logger.w("OutputSizesCorrector", "Sizes array becomes empty after excluding problematic output sizes.");
        }
        return (Size[]) arrayList2.toArray(new Size[0]);
    }

    public InterfaceC1078b m(final InterfaceC0835c interfaceC0835c) {
        Object obj;
        Object putIfAbsent;
        switch (this.f228a) {
            case 13:
                obj = ((C1182q) this.f230c).get(((kotlin.jvm.internal.a) interfaceC0835c).g());
                S s10 = (S) obj;
                Object obj2 = s10.reference.get();
                if (obj2 == null) {
                    obj2 = s10.a(new InterfaceC0635a<Object>() { // from class: kotlinx.serialization.internal.ClassValueCache$get$$inlined$getOrSet$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // ca.InterfaceC0635a
                        public final Object invoke() {
                            return new C1176k((InterfaceC1078b) ((InterfaceC0646l) f.this.f229b).invoke(interfaceC0835c));
                        }
                    });
                }
                return ((C1176k) obj2).f26409a;
            default:
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f230c;
                Class<?> g10 = ((kotlin.jvm.internal.a) interfaceC0835c).g();
                Object obj3 = concurrentHashMap.get(g10);
                if (obj3 == null && (putIfAbsent = concurrentHashMap.putIfAbsent(g10, (obj3 = new C1176k((InterfaceC1078b) ((InterfaceC0646l) this.f229b).invoke(interfaceC0835c))))) != null) {
                    obj3 = putIfAbsent;
                }
                return ((C1176k) obj3).f26409a;
        }
    }

    public Object n(InterfaceC0835c interfaceC0835c, ArrayList arrayList) {
        Object obj;
        Object failure;
        Object failure2;
        Object putIfAbsent;
        switch (this.f228a) {
            case 16:
                obj = ((C1182q) this.f230c).get(((kotlin.jvm.internal.a) interfaceC0835c).g());
                S s10 = (S) obj;
                Object obj2 = s10.reference.get();
                if (obj2 == null) {
                    obj2 = s10.a(new InterfaceC0635a<Object>() { // from class: kotlinx.serialization.internal.ClassValueParametrizedCache$get-gIAlu-s$$inlined$getOrSet$1
                        @Override // ca.InterfaceC0635a
                        public final Object invoke() {
                            return new Z();
                        }
                    });
                }
                Z z10 = (Z) obj2;
                ArrayList arrayList2 = new ArrayList(P9.n.u(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new ra.I((ia.k) it.next()));
                }
                ConcurrentHashMap<List<ra.I>, Result<InterfaceC1078b<T>>> concurrentHashMap = z10.f26380a;
                Object obj3 = concurrentHashMap.get(arrayList2);
                if (obj3 == null) {
                    try {
                        failure = (InterfaceC1078b) ((InterfaceC0650p) this.f229b).invoke(interfaceC0835c, arrayList);
                    } catch (Throwable th) {
                        failure = new Result.Failure(th);
                    }
                    Result result = new Result(failure);
                    Object putIfAbsent2 = concurrentHashMap.putIfAbsent(arrayList2, result);
                    obj3 = putIfAbsent2 == null ? result : putIfAbsent2;
                }
                return ((Result) obj3).f23091a;
            default:
                ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) this.f230c;
                Class<?> g10 = ((kotlin.jvm.internal.a) interfaceC0835c).g();
                Object obj4 = concurrentHashMap2.get(g10);
                if (obj4 == null && (putIfAbsent = concurrentHashMap2.putIfAbsent(g10, (obj4 = new Z()))) != null) {
                    obj4 = putIfAbsent;
                }
                Z z11 = (Z) obj4;
                ArrayList arrayList3 = new ArrayList(P9.n.u(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(new ra.I((ia.k) it2.next()));
                }
                ConcurrentHashMap<List<ra.I>, Result<InterfaceC1078b<T>>> concurrentHashMap3 = z11.f26380a;
                Object obj5 = concurrentHashMap3.get(arrayList3);
                if (obj5 == null) {
                    try {
                        failure2 = (InterfaceC1078b) ((InterfaceC0650p) this.f229b).invoke(interfaceC0835c, arrayList);
                    } catch (Throwable th2) {
                        failure2 = new Result.Failure(th2);
                    }
                    Result result2 = new Result(failure2);
                    Object putIfAbsent3 = concurrentHashMap3.putIfAbsent(arrayList3, result2);
                    obj5 = putIfAbsent3 == null ? result2 : putIfAbsent3;
                }
                return ((Result) obj5).f23091a;
        }
    }

    public Long o(String str) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT long_value FROM Preference where `key`=?", 1);
        acquire.bindString(1, str);
        RoomDatabase roomDatabase = (RoomDatabase) this.f229b;
        roomDatabase.assertNotSuspendingTransaction();
        Long l10 = null;
        Cursor query = DBUtil.query(roomDatabase, acquire, false, null);
        try {
            if (query.moveToFirst() && !query.isNull(0)) {
                l10 = Long.valueOf(query.getLong(0));
            }
            return l10;
        } finally {
            query.close();
            acquire.release();
        }
    }

    public ArrayList p(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr == null || stackTraceElementArr.length <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            if (stackTraceElement != null) {
                String className = stackTraceElement.getClassName();
                if (!className.startsWith("io.sentry.") || className.startsWith("io.sentry.samples.") || className.startsWith("io.sentry.mobile.")) {
                    H9.j jVar = new H9.j();
                    boolean z10 = true;
                    if (!className.isEmpty()) {
                        List list = (List) this.f230c;
                        if (list != null) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                if (className.startsWith((String) it.next())) {
                                    break;
                                }
                            }
                        }
                        List list2 = (List) this.f229b;
                        if (list2 != null) {
                            Iterator it2 = list2.iterator();
                            while (it2.hasNext() && !className.startsWith((String) it2.next())) {
                            }
                        }
                        z10 = false;
                    }
                    jVar.f1626h = Boolean.valueOf(z10);
                    jVar.f1621c = className;
                    jVar.f1620b = stackTraceElement.getMethodName();
                    jVar.f1619a = stackTraceElement.getFileName();
                    if (stackTraceElement.getLineNumber() >= 0) {
                        jVar.f1622d = Integer.valueOf(stackTraceElement.getLineNumber());
                    }
                    jVar.f1627j = Boolean.valueOf(stackTraceElement.isNativeMethod());
                    arrayList.add(jVar);
                }
            }
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    public void q(d dVar) {
        RoomDatabase roomDatabase = (RoomDatabase) this.f229b;
        roomDatabase.assertNotSuspendingTransaction();
        roomDatabase.beginTransaction();
        try {
            ((e) this.f230c).insert((e) dVar);
            roomDatabase.setTransactionSuccessful();
        } finally {
            roomDatabase.endTransaction();
        }
    }

    public Properties r() {
        String str = (String) this.f229b;
        try {
            File file = new File(str);
            if (!file.isFile() || !file.canRead()) {
                return null;
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                Properties properties = new Properties();
                properties.load(bufferedInputStream);
                bufferedInputStream.close();
                return properties;
            } finally {
            }
        } catch (IOException e10) {
            ((InterfaceC0859q) this.f230c).d(SentryLevel.ERROR, e10, "Failed to load Sentry configuration from file: %s", str);
            return null;
        }
    }

    public byte[] s() {
        String str = (String) this.f230c;
        try {
            String string = ((SharedPreferences) this.f229b).getString(str, null);
            if (string != null) {
                return j3.e.l(string);
            }
            throw new FileNotFoundException("can't read keyset; the pref value " + str + " does not exist");
        } catch (ClassCastException | IllegalArgumentException unused) {
            throw new CharConversionException(androidx.camera.core.n.a("can't read keyset; the pref value ", str, " is not a valid hex string"));
        }
    }

    public void t(String str, String str2, Long l10) {
        AtomicLong atomicLong = ((C9.a) this.f229b).f688a.get(new C9.c(str, str2));
        if (atomicLong != null) {
            atomicLong.addAndGet(l10.longValue());
        }
    }

    public void u(C9.b bVar) {
        if (bVar == null) {
            return;
        }
        for (C9.d dVar : bVar.f690b) {
            t(dVar.f694a, dVar.f695b, dVar.f696c);
        }
    }

    public f(String str, HashMap hashMap) {
        this.f228a = 9;
        D9.b.t0(str, "url is required");
        try {
            this.f229b = URI.create(str).toURL();
            this.f230c = hashMap;
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException("Failed to compose the Sentry's server URL.", e10);
        }
    }

    public f(SentryOptions sentryOptions, InterfaceC0859q interfaceC0859q) {
        this.f228a = 8;
        D9.b.t0(sentryOptions, "SentryOptions is required.");
        this.f229b = sentryOptions;
        this.f230c = interfaceC0859q;
    }

    public f(WorkDatabase workDatabase) {
        this.f228a = 0;
        this.f229b = workDatabase;
        this.f230c = new e(workDatabase, 0);
    }

    public f(SentryOptions sentryOptions) {
        this.f228a = 1;
        this.f230c = sentryOptions;
        this.f229b = new C9.a();
    }

    public f(c0 c0Var, ArrayList arrayList) {
        this.f228a = 10;
        D9.b.t0(c0Var, "SentryEnvelopeHeader is required.");
        this.f229b = c0Var;
        this.f230c = arrayList;
    }

    public f(m3.b bVar, C1543a c1543a, v3.b bVar2) {
        this.f228a = 20;
        C1566a c1566a = new C1566a();
        z1.g gVar = new z1.g();
        gVar.f31252a = c1543a;
        gVar.f31253b = bVar2;
        gVar.f31254c = c1566a;
        gVar.f31255d = new ConcurrentHashMap();
        this.f229b = bVar;
        this.f230c = gVar;
    }

    public f(int i, InterfaceC0646l interfaceC0646l) {
        this.f228a = i;
        switch (i) {
            case 17:
                this.f229b = interfaceC0646l;
                this.f230c = new ConcurrentHashMap();
                break;
            default:
                this.f229b = interfaceC0646l;
                this.f230c = new C1182q();
                break;
        }
    }

    public f(H9.g gVar, H9.e eVar, g0 g0Var) {
        this.f228a = 10;
        this.f229b = new c0(gVar, eVar, null);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(g0Var);
        this.f230c = arrayList;
    }

    public f(Context context, String str) {
        this.f228a = 7;
        this.f230c = str;
        this.f229b = context.getApplicationContext().getSharedPreferences("crypto_prefs", 0);
    }

    public f(String str) {
        this.f228a = 21;
        this.f229b = (w.n) w.k.f30775a.get(w.n.class);
        this.f230c = new m3.b(str, false);
    }

    public f(InterfaceC0650p interfaceC0650p, int i) {
        this.f228a = i;
        switch (i) {
            case 18:
                this.f229b = interfaceC0650p;
                this.f230c = new ConcurrentHashMap();
                break;
            default:
                this.f229b = interfaceC0650p;
                this.f230c = new C1182q();
                break;
        }
    }

    public f(ArrayList arrayList, ArrayList arrayList2) {
        this.f228a = 14;
        int size = arrayList.size();
        this.f229b = new int[size];
        this.f230c = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.f229b)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.f230c)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public f(int i, int i9) {
        this.f228a = 14;
        this.f229b = new int[]{i, i9};
        this.f230c = new float[]{0.0f, 1.0f};
    }

    public f(int i, int i9, int i10) {
        this.f228a = 14;
        this.f229b = new int[]{i, i9, i10};
        this.f230c = new float[]{0.0f, 0.5f, 1.0f};
    }

    public f(ViewPager viewPager) {
        this.f228a = 15;
        this.f230c = viewPager;
        this.f229b = new Rect();
    }
}
