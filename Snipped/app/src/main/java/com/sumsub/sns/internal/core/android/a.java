package com.sumsub.sns.internal.core.android;

import O9.p;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.r;
import ca.InterfaceC0646l;
import ca.InterfaceC0650p;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.geo.presentation.d;
import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.internal.core.analytics.f;
import com.sumsub.sns.internal.core.analytics.l;
import com.sumsub.sns.internal.log.LoggerType;
import e.AbstractC0704c;
import e.InterfaceC0702a;
import f.AbstractC0728a;
import f.C0731d;
import f.C0732e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ka.C0969n;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class a implements DefaultLifecycleObserver {

    /* renamed from: j, reason: collision with root package name */
    public static final C0192a f15010j = new C0192a(null);

    /* renamed from: a, reason: collision with root package name */
    public final androidx.activity.result.a f15011a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15012b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f15013c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0650p<String, Uri, p> f15014d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0650p<String, List<? extends Uri>, p> f15015e;

    /* renamed from: f, reason: collision with root package name */
    public AbstractC0704c<String[]> f15016f;

    /* renamed from: g, reason: collision with root package name */
    public AbstractC0704c<String[]> f15017g;

    /* renamed from: h, reason: collision with root package name */
    public String f15018h;
    public final List<b<?, ?>> i;

    /* renamed from: com.sumsub.sns.internal.core.android.a$a, reason: collision with other inner class name */
    public static final class C0192a {
        public /* synthetic */ C0192a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C0192a() {
        }
    }

    public static final class b<I, O> {

        /* renamed from: a, reason: collision with root package name */
        public final String f15019a;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC0646l<I, Intent> f15020b;

        /* renamed from: c, reason: collision with root package name */
        public final InterfaceC0650p<Integer, Intent, O> f15021c;

        /* renamed from: d, reason: collision with root package name */
        public final InterfaceC0646l<O, p> f15022d;

        /* renamed from: e, reason: collision with root package name */
        public AbstractC0704c<I> f15023e;

        /* renamed from: com.sumsub.sns.internal.core.android.a$b$b, reason: collision with other inner class name */
        public static final class C0193b extends AbstractC0728a<I, O> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ b<I, O> f15024a;

            public C0193b(b<I, O> bVar) {
                this.f15024a = bVar;
            }

            @Override // f.AbstractC0728a
            public Intent createIntent(Context context, I i) {
                return this.f15024a.d().invoke(i);
            }

            @Override // f.AbstractC0728a
            public O parseResult(int i, Intent intent) {
                return this.f15024a.f().invoke(Integer.valueOf(i), intent);
            }
        }

        public final InterfaceC0702a<O> a() {
            return new d(this, 2);
        }

        public final AbstractC0728a<I, O> b() {
            return new C0193b(this);
        }

        public final InterfaceC0646l<I, Intent> d() {
            return this.f15020b;
        }

        public final InterfaceC0650p<Integer, Intent, O> f() {
            return this.f15021c;
        }

        public final void g() {
            AbstractC0704c<I> abstractC0704c = this.f15023e;
            if (abstractC0704c != null) {
                abstractC0704c.b();
            }
            this.f15023e = null;
        }

        public static final void a(b bVar, Object obj) {
            Logger.v$default(com.sumsub.sns.internal.log.a.f17535a, com.sumsub.sns.internal.log.c.a(bVar), "PickerLifecycleObserver.callback: " + bVar.f15019a, null, 4, null);
            bVar.f15022d.invoke(obj);
        }

        public final void a(androidx.activity.result.a aVar, String str) {
            this.f15023e = aVar.d(this.f15019a + '_' + str, b(), a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(androidx.activity.result.a aVar, String str, String[] strArr, InterfaceC0650p<? super String, ? super Uri, p> interfaceC0650p, InterfaceC0650p<? super String, ? super List<? extends Uri>, p> interfaceC0650p2) {
        this.f15011a = aVar;
        this.f15012b = str;
        this.f15013c = strArr;
        this.f15014d = interfaceC0650p;
        this.f15015e = interfaceC0650p2;
        this.i = new ArrayList();
    }

    public final String[] a() {
        return this.f15013c;
    }

    public final String b() {
        return this.f15018h;
    }

    public final void c(String str) {
        this.f15018h = str;
    }

    public final void d() {
        l.a(f.a(0L, 1, null).a(c() ? Screen.SystemImagePicker : Screen.SystemDocumentPicker).a().m().c(), false, 1, null);
    }

    public final void e() {
        l.a(f.a(0L, 1, null).a(c() ? Screen.SystemImagePicker : Screen.SystemDocumentPicker).a().o().c(), false, 1, null);
    }

    public final void f() {
        l.a(f.a(0L, 1, null).a(c() ? Screen.SystemImagePicker : Screen.SystemDocumentPicker).a().b().c(), false, 1, null);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(r rVar) {
        Logger.v$default(com.sumsub.sns.internal.log.a.f17535a, com.sumsub.sns.internal.log.c.a(this), "PickerLifecycleObserver.onCreate: requestId=" + this.f15018h, null, 4, null);
        final int i = 0;
        this.f15016f = this.f15011a.d("singlePicker_" + this.f15012b, new C0731d(), new InterfaceC0702a(this) { // from class: com.sumsub.sns.internal.core.android.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a f15026b;

            {
                this.f15026b = this;
            }

            @Override // e.InterfaceC0702a
            public final void a(Object obj) {
                switch (i) {
                    case 0:
                        a.a(this.f15026b, (Uri) obj);
                        break;
                    default:
                        a.a(this.f15026b, (List) obj);
                        break;
                }
            }
        });
        final int i9 = 1;
        this.f15017g = this.f15011a.d("multiplePicker_" + this.f15012b, new C0732e(), new InterfaceC0702a(this) { // from class: com.sumsub.sns.internal.core.android.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a f15026b;

            {
                this.f15026b = this;
            }

            @Override // e.InterfaceC0702a
            public final void a(Object obj) {
                switch (i9) {
                    case 0:
                        a.a(this.f15026b, (Uri) obj);
                        break;
                    default:
                        a.a(this.f15026b, (List) obj);
                        break;
                }
            }
        });
        Iterator<T> it = this.i.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(this.f15011a, this.f15012b);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(r rVar) {
        super.onDestroy(rVar);
        AbstractC0704c<String[]> abstractC0704c = this.f15016f;
        if (abstractC0704c != null) {
            abstractC0704c.b();
        }
        AbstractC0704c<String[]> abstractC0704c2 = this.f15017g;
        if (abstractC0704c2 != null) {
            abstractC0704c2.b();
        }
        Iterator<T> it = this.i.iterator();
        while (it.hasNext()) {
            ((b) it.next()).g();
        }
    }

    public static final void a(a aVar, Uri uri) {
        if (uri == null) {
            aVar.d();
        } else {
            aVar.e();
        }
        Logger.v$default(com.sumsub.sns.internal.log.a.f17535a, com.sumsub.sns.internal.log.c.a(aVar), "PickerLifecycleObserver.getSingleContent.callback requestId=" + aVar.f15018h, null, 4, null);
        String str = aVar.f15018h;
        if (str != null) {
            InterfaceC0650p<String, Uri, p> interfaceC0650p = aVar.f15014d;
            if (interfaceC0650p != null) {
                interfaceC0650p.invoke(str, uri);
            }
            aVar.f15018h = null;
        }
    }

    public final boolean c() {
        String[] strArr = this.f15013c;
        if (strArr == null) {
            return false;
        }
        for (String str : strArr) {
            if (!C0969n.Y(str, "image", false)) {
                return false;
            }
        }
        return true;
    }

    public /* synthetic */ a(androidx.activity.result.a aVar, String str, String[] strArr, InterfaceC0650p interfaceC0650p, InterfaceC0650p interfaceC0650p2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : strArr, (i & 8) != 0 ? null : interfaceC0650p, (i & 16) != 0 ? null : interfaceC0650p2);
    }

    public static final void a(a aVar, List list) {
        Logger.v$default(com.sumsub.sns.internal.log.a.f17535a, com.sumsub.sns.internal.log.c.a(aVar), "PickerLifecycleObserver.getMultipleContent.callback requestId=" + aVar.f15018h, null, 4, null);
        if (list == null) {
            aVar.d();
        } else {
            aVar.e();
        }
        String str = aVar.f15018h;
        if (str != null) {
            InterfaceC0650p<String, List<? extends Uri>, p> interfaceC0650p = aVar.f15015e;
            if (interfaceC0650p != null) {
                interfaceC0650p.invoke(str, list);
            }
            aVar.f15018h = null;
        }
    }

    public final boolean a(String str) {
        Logger.v$default(com.sumsub.sns.internal.log.a.f17535a, com.sumsub.sns.internal.log.c.a(this), s3.b.j("PickerLifecycleObserver.selectFile: ", str), null, 4, null);
        f();
        this.f15018h = str;
        try {
            AbstractC0704c<String[]> abstractC0704c = this.f15016f;
            if (abstractC0704c != null) {
                abstractC0704c.a(this.f15013c);
            }
            return true;
        } catch (ActivityNotFoundException e10) {
            com.sumsub.sns.internal.log.a.f17535a.a(LoggerType.KIBANA).e(com.sumsub.sns.internal.log.c.a(this), "PickerLifecycleObserver.selectMultipleFile: " + str, e10);
            return false;
        }
    }
}
