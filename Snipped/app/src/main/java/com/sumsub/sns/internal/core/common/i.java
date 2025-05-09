package com.sumsub.sns.internal.core.common;

import U8.g;
import U8.i;
import V8.p;
import android.R;
import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.nfc.NfcAdapter;
import android.nfc.NfcManager;
import android.os.Build;
import android.os.LocaleList;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AlignmentSpan;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.camera.core.CameraInfo;
import androidx.fragment.app.ActivityC0533g;
import ca.InterfaceC0646l;
import ca.InterfaceC0650p;
import com.sumsub.sns.R$id;
import com.sumsub.sns.internal.core.common.f0;
import com.sumsub.sns.internal.core.data.model.Document;
import f9.C0753a;
import g9.C0771a;
import g9.C0772b;
import java.io.Closeable;
import java.io.File;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import k0.C0913a;
import ka.C0961f;
import ka.C0969n;
import ka.InterfaceC0960e;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import l0.C0975a;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static U8.e f15120a;

    @V9.d(c = "com.sumsub.sns.internal.core.common.CommonExtensionsKt$copyContentsToCacheFile$2", f = "CommonExtensions.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super String>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f15122a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f15123b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f15124c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Uri f15125d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, Uri uri, T9.a<? super b> aVar) {
            super(2, aVar);
            this.f15124c = context;
            this.f15125d = uri;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super String> aVar) {
            return ((b) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            b bVar = new b(this.f15124c, this.f15125d, aVar);
            bVar.f15123b = obj;
            return bVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x0080, code lost:
        
            if (r0 != null) goto L55;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
                int r0 = r8.f15122a
                if (r0 != 0) goto Lc8
                kotlin.b.b(r9)
                java.lang.Object r9 = r8.f15123b
                kotlinx.coroutines.CoroutineScope r9 = (kotlinx.coroutines.CoroutineScope) r9
                android.content.Context r0 = r8.f15124c
                r1 = 0
                if (r0 == 0) goto L23
                android.content.ContentResolver r2 = r0.getContentResolver()
                if (r2 == 0) goto L23
                android.net.Uri r3 = r8.f15125d
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                android.database.Cursor r0 = r2.query(r3, r4, r5, r6, r7)
                goto L24
            L23:
                r0 = r1
            L24:
                r2 = -1
                if (r0 == 0) goto L2e
                java.lang.String r3 = "_display_name"
                int r3 = r0.getColumnIndex(r3)
                goto L2f
            L2e:
                r3 = r2
            L2f:
                if (r0 == 0) goto L34
                r0.moveToFirst()
            L34:
                if (r3 != r2) goto L3c
                if (r0 == 0) goto L3b
                r0.close()
            L3b:
                return r1
            L3c:
                if (r0 == 0) goto L43
                java.lang.String r3 = r0.getString(r3)
                goto L44
            L43:
                r3 = r1
            L44:
                if (r0 == 0) goto L49
                r0.close()
            L49:
                if (r3 == 0) goto Lc7
                int r0 = r3.length()
                if (r0 != 0) goto L53
                goto Lc7
            L53:
                java.lang.String r0 = "."
                r4 = 0
                r5 = 6
                int r0 = ka.C0969n.k0(r3, r0, r4, r5)
                java.lang.Integer r4 = new java.lang.Integer
                r4.<init>(r0)
                int r0 = r4.intValue()
                if (r0 <= r2) goto L67
                goto L68
            L67:
                r4 = r1
            L68:
                if (r4 == 0) goto L83
                int r0 = r4.intValue()
                java.lang.String r0 = r3.substring(r0)
                if (r0 == 0) goto L83
                r2 = 47
                boolean r2 = ka.C0969n.Z(r0, r2)
                r2 = r2 ^ 1
                if (r2 == 0) goto L7f
                goto L80
            L7f:
                r0 = r1
            L80:
                if (r0 == 0) goto L83
                goto L85
            L83:
                java.lang.String r0 = ""
            L85:
                java.lang.String r2 = "from_gallery"
                android.content.Context r3 = r8.f15124c     // Catch: java.lang.Exception -> Lb4
                java.io.File r3 = r3.getCacheDir()     // Catch: java.lang.Exception -> Lb4
                java.io.File r0 = java.io.File.createTempFile(r2, r0, r3)     // Catch: java.lang.Exception -> Lb4
                java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Exception -> Lb4
                r2.<init>(r0)     // Catch: java.lang.Exception -> Lb4
                android.content.Context r3 = r8.f15124c     // Catch: java.lang.Exception -> Lb4
                android.content.ContentResolver r3 = r3.getContentResolver()     // Catch: java.lang.Exception -> Lb4
                android.net.Uri r4 = r8.f15125d     // Catch: java.lang.Exception -> Lb4
                java.io.InputStream r3 = r3.openInputStream(r4)     // Catch: java.lang.Exception -> Lb4
                if (r3 != 0) goto La5
                return r1
            La5:
                boolean r2 = com.sumsub.sns.internal.core.common.r0.a(r3, r2)     // Catch: java.lang.Exception -> Lb4
                com.sumsub.sns.internal.core.common.i.a(r3)     // Catch: java.lang.Exception -> Lb4
                java.lang.String r9 = r0.getPath()     // Catch: java.lang.Exception -> Lb4
                if (r2 == 0) goto Lb3
                r1 = r9
            Lb3:
                return r1
            Lb4:
                r0 = move-exception
                com.sumsub.sns.internal.log.a r2 = com.sumsub.sns.internal.log.a.f17535a
                java.lang.String r3 = com.sumsub.sns.internal.log.c.a(r9)
                java.lang.String r9 = "Error copying content: "
                java.lang.String r4 = com.google.android.gms.measurement.internal.a.i(r9, r0)
                r7 = 0
                r5 = 0
                r6 = 4
                com.sumsub.log.logger.Logger.e$default(r2, r3, r4, r5, r6, r7)
            Lc7:
                return r1
            Lc8:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.common.i.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.common.CommonExtensionsKt", f = "CommonExtensions.kt", l = {241, 245}, m = "copyFileFromActivityResultToCacheDir")
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f15126a;

        /* renamed from: b, reason: collision with root package name */
        public int f15127b;

        public c(T9.a<? super c> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f15126a = obj;
            this.f15127b |= Integer.MIN_VALUE;
            return i.a((Context) null, (String) null, (Uri) null, this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.common.CommonExtensionsKt", f = "CommonExtensions.kt", l = {273, 280, 284}, m = "copyFromImageGalleryToCacheIfPossible")
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f15128a;

        /* renamed from: b, reason: collision with root package name */
        public Object f15129b;

        /* renamed from: c, reason: collision with root package name */
        public Object f15130c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f15131d;

        /* renamed from: e, reason: collision with root package name */
        public int f15132e;

        public d(T9.a<? super d> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f15131d = obj;
            this.f15132e |= Integer.MIN_VALUE;
            return i.c(null, null, this);
        }
    }

    public static final int b(int i) {
        if (i == 90) {
            return 6;
        }
        if (i != 180) {
            return i != 270 ? 1 : 8;
        }
        return 3;
    }

    public static final String c(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            return CameraInfo.IMPLEMENTATION_TYPE_UNKNOWN;
        }
    }

    public static final f0 d(Context context) {
        try {
            Object systemService = context.getSystemService("nfc");
            NfcManager nfcManager = systemService instanceof NfcManager ? (NfcManager) systemService : null;
            NfcAdapter defaultAdapter = nfcManager != null ? nfcManager.getDefaultAdapter() : null;
            return (defaultAdapter == null || !defaultAdapter.isEnabled()) ? defaultAdapter != null ? f0.a.f15116b : f0.d.f15119b : f0.b.f15117b;
        } catch (Exception e10) {
            return new f0.c(e10);
        }
    }

    public static final void e(View view) {
        int i = R$id.ANIMATION_TAG;
        if (kotlin.jvm.internal.f.b(view.getTag(i), 1) || view.getVisibility() == 0) {
            return;
        }
        view.setTag(i, 1);
        view.setAlpha(0.0f);
        view.setVisibility(0);
        view.animate().alpha(1.0f).setDuration(100L).withEndAction(new com.google.android.material.datepicker.c(2, view)).start();
    }

    public static final void f(View view) {
        view.setTag(R$id.ANIMATION_TAG, 0);
    }

    public static final boolean g(View view) {
        return view.postDelayed(new com.google.android.material.datepicker.c(3, view), view.getResources().getInteger(R.integer.config_shortAnimTime));
    }

    public static final void h(View view) {
        if (view.requestFocus()) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 1);
        }
    }

    public static final String a(Object obj) {
        return obj.getClass().getSimpleName() + '@' + System.identityHashCode(obj);
    }

    @SuppressLint({"DefaultLocale"})
    public static final String b() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        Locale locale = Locale.ROOT;
        if (str2.toLowerCase(locale).startsWith(str.toLowerCase(locale))) {
            if (str2.length() <= 0) {
                return str2;
            }
            StringBuilder sb2 = new StringBuilder();
            char charAt = str2.charAt(0);
            sb2.append((Object) (Character.isLowerCase(charAt) ? j3.e.F(charAt) : String.valueOf(charAt)));
            sb2.append(str2.substring(1));
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        if (str.length() > 0) {
            StringBuilder sb4 = new StringBuilder();
            char charAt2 = str.charAt(0);
            sb4.append((Object) (Character.isLowerCase(charAt2) ? j3.e.F(charAt2) : String.valueOf(charAt2)));
            sb4.append(str.substring(1));
            str = sb4.toString();
        }
        sb3.append(str);
        sb3.append(' ');
        sb3.append(str2);
        return sb3.toString();
    }

    public static final Spanned a(CharSequence charSequence, Context context) {
        try {
            U8.e eVar = f15120a;
            if (eVar == null) {
                U8.f fVar = new U8.f(context);
                ArrayList arrayList = fVar.f3676b;
                arrayList.add(new V8.o());
                arrayList.add(new Y8.d());
                arrayList.add(new C0753a());
                arrayList.add(new g9.d());
                arrayList.add(new a());
                eVar = fVar.a();
                f15120a = eVar;
            }
            return eVar.a(charSequence.toString());
        } catch (Exception unused) {
            return new SpannableString(charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(android.net.Uri r16, android.content.Context r17, T9.a<? super android.net.Uri> r18) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.common.i.c(android.net.Uri, android.content.Context, T9.a):java.lang.Object");
    }

    public static final class a extends U8.a {

        /* renamed from: com.sumsub.sns.internal.core.common.i$a$a, reason: collision with other inner class name */
        public static final class C0196a extends U8.d {
            @Override // U8.d, U8.c
            public void resolve(View view, String str) {
                try {
                    super.resolve(view, str);
                } catch (Exception unused) {
                    i.a(view.getContext(), Uri.parse(str));
                }
            }
        }

        public static final class b extends Lambda implements InterfaceC0646l<InterfaceC0960e, CharSequence> {

            /* renamed from: a, reason: collision with root package name */
            public static final b f15121a = new b();

            public b() {
                super(1);
            }

            @Override // ca.InterfaceC0646l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(InterfaceC0960e interfaceC0960e) {
                return androidx.camera.core.impl.utils.a.n(new StringBuilder("@@"), interfaceC0960e.a().get(1), "$$");
            }
        }

        public static final void a(g9.d dVar) {
            com.sumsub.sns.internal.core.common.b bVar = new com.sumsub.sns.internal.core.common.b();
            C0771a c0771a = dVar.f20844a;
            if (c0771a.f20837a) {
                throw new IllegalStateException("SimpleExtBuilder is already built, do not mutate SimpleExtPlugin after configuration is finished");
            }
            ((ArrayList) c0771a.f20838b).add(new C0772b(bVar));
        }

        @Override // U8.a, U8.i
        public void configure(i.a aVar) {
            U8.q qVar = (U8.q) aVar;
            U8.i b9 = U8.q.b(g9.d.class, qVar.f3706b);
            if (b9 == null) {
                List<U8.i> list = qVar.f3705a;
                U8.i b10 = U8.q.b(g9.d.class, list);
                if (b10 == null) {
                    throw new IllegalStateException("Requested plugin is not added: " + g9.d.class.getName() + ", plugins: " + list);
                }
                qVar.a(b10);
                b9 = b10;
            }
            a((g9.d) b9);
        }

        @Override // U8.a, U8.i
        public void configureConfiguration(g.a aVar) {
            aVar.f3686d = new C0196a();
        }

        @Override // U8.a, U8.i
        public void configureTheme(p.a aVar) {
            super.configureTheme(aVar);
            aVar.f3764d = i.a(4);
            aVar.f3766f = 0;
        }

        @Override // U8.a, U8.i
        public String processMarkdown(String str) {
            Regex regex = new Regex("^><\\s*(.+\\S)\\s*$", RegexOption.MULTILINE);
            b bVar = b.f15121a;
            Matcher matcher = regex.f23200a.matcher(str);
            int i = 0;
            C0961f c0961f = !matcher.find(0) ? null : new C0961f(matcher, str);
            if (c0961f == null) {
                return str.toString();
            }
            int length = str.length();
            StringBuilder sb2 = new StringBuilder(length);
            do {
                sb2.append((CharSequence) str, i, c0961f.b().f21226a);
                sb2.append(bVar.invoke(c0961f));
                i = c0961f.b().f21227b + 1;
                c0961f = c0961f.next();
                if (i >= length) {
                    break;
                }
            } while (c0961f != null);
            if (i < length) {
                sb2.append((CharSequence) str, i, length);
            }
            return sb2.toString();
        }

        public static final Object a(g gVar, U8.r rVar) {
            return new AlignmentSpan.Standard(Layout.Alignment.ALIGN_CENTER);
        }
    }

    public static final int b(Context context) {
        long j10;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            if (Build.VERSION.SDK_INT >= 28) {
                j10 = C0975a.a(packageInfo);
            } else {
                j10 = packageInfo.versionCode;
            }
            return (int) j10;
        } catch (Exception unused) {
            return -1;
        }
    }

    public static final void d(View view) {
        view.setVisibility(8);
        view.setTag(R$id.ANIMATION_TAG, 0);
    }

    public static final Object b(Uri uri, Context context, T9.a<? super String> aVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new b(context, uri, null), aVar);
    }

    public static final void b(View view, boolean z10) {
        view.setVisibility(z10 ? 0 : 4);
    }

    public static final void b(View view) {
        ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static final int b(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    public static final int a(int i) {
        return (int) (i * Resources.getSystem().getDisplayMetrics().density);
    }

    public static final Locale a() {
        return LocaleList.getDefault().get(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList] */
    public static final com.sumsub.sns.internal.core.data.model.remote.o b(Map<?, ?> map) {
        Object obj = map.get("regex");
        ?? r22 = 0;
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = map.get("placeholders");
        List list = obj2 instanceof List ? (List) obj2 : null;
        if (list != null) {
            r22 = new ArrayList();
            for (Object obj3 : list) {
                if (obj3 instanceof String) {
                    r22.add(obj3);
                }
            }
        } else {
            Object obj4 = map.get("placeholder");
            String str2 = obj4 instanceof String ? (String) obj4 : null;
            if (str2 != null) {
                r22 = Collections.singletonList(str2);
            }
        }
        return new com.sumsub.sns.internal.core.data.model.remote.o(r22, str);
    }

    public static final String a(String str) {
        return Base64.getEncoder().encodeToString(str.getBytes(StandardCharsets.UTF_8));
    }

    public static final boolean a(Context context, Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            try {
                context.startActivity(intent);
                return true;
            } catch (Exception e10) {
                com.sumsub.sns.internal.log.a.f17535a.e(com.sumsub.sns.internal.log.c.a(context), "Error while opening activity", e10);
            }
        }
        return false;
    }

    @SuppressLint({"DiscouragedApi"})
    public static final int a(Context context, String str) {
        return context.getResources().getIdentifier(str, "drawable", context.getPackageName());
    }

    public static final CharSequence a(x0 x0Var, String str, String str2, String str3) {
        CharSequence a10 = x0Var.a(str);
        if (a10 != null) {
            return a10;
        }
        CharSequence a11 = x0Var.a(str2);
        if (a11 != null) {
            return a11;
        }
        CharSequence a12 = str3 != null ? x0Var.a(str3) : null;
        return a12 == null ? "" : a12;
    }

    public static final void b(View... viewArr) {
        for (View view : viewArr) {
            if (view != null) {
                view.setVisibility(4);
            }
        }
    }

    public static final String a(Uri uri, Context context) {
        String path = uri.getPath();
        if (path == null || path.length() == 0) {
            return null;
        }
        String type = context.getContentResolver().getType(uri);
        if (type != null) {
            return type;
        }
        try {
            return URLConnection.guessContentTypeFromName(new File(uri.getPath()).getName());
        } catch (Exception unused) {
            return type;
        }
    }

    public static final void c(View view) {
        int i = R$id.ANIMATION_TAG;
        if (kotlin.jvm.internal.f.b(view.getTag(i), 1) || view.getAlpha() != 1.0f) {
            return;
        }
        view.setTag(i, 1);
        view.setAlpha(1.0f);
        view.animate().alpha(0.0f).setDuration(100L).withEndAction(new com.google.android.material.datepicker.c(1, view)).start();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007e A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(android.content.Context r5, java.lang.String r6, android.net.Uri r7, T9.a<? super android.net.Uri> r8) {
        /*
            boolean r0 = r8 instanceof com.sumsub.sns.internal.core.common.i.c
            if (r0 == 0) goto L13
            r0 = r8
            com.sumsub.sns.internal.core.common.i$c r0 = (com.sumsub.sns.internal.core.common.i.c) r0
            int r1 = r0.f15127b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15127b = r1
            goto L18
        L13:
            com.sumsub.sns.internal.core.common.i$c r0 = new com.sumsub.sns.internal.core.common.i$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f15126a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f15127b
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L36
            if (r2 == r3) goto L32
            if (r2 != r4) goto L2a
            kotlin.b.b(r8)
            goto L7a
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            kotlin.b.b(r8)
            goto L93
        L36:
            kotlin.b.b(r8)
            if (r6 != 0) goto L3f
            java.lang.String r6 = a(r7, r5)
        L3f:
            if (r6 == 0) goto L8a
            int r8 = r6.length()
            if (r8 != 0) goto L48
            goto L8a
        L48:
            java.lang.String r8 = "image"
            boolean r8 = r6.startsWith(r8)
            if (r8 != 0) goto L8a
            java.lang.String r8 = "/image"
            boolean r6 = r6.endsWith(r8)
            if (r6 == 0) goto L59
            goto L8a
        L59:
            java.lang.String r6 = r7.toString()
            java.lang.String r8 = "content://"
            boolean r6 = r6.startsWith(r8)
            if (r6 != 0) goto L71
            java.lang.String r6 = r7.toString()
            java.lang.String r8 = "file://"
            boolean r6 = r6.startsWith(r8)
            if (r6 == 0) goto L96
        L71:
            r0.f15127b = r4
            java.lang.Object r8 = b(r7, r5, r0)
            if (r8 != r1) goto L7a
            return r1
        L7a:
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto L80
            r7 = 0
            goto L96
        L80:
            java.io.File r5 = new java.io.File
            r5.<init>(r8)
            android.net.Uri r7 = android.net.Uri.fromFile(r5)
            goto L96
        L8a:
            r0.f15127b = r3
            java.lang.Object r8 = c(r7, r5, r0)
            if (r8 != r1) goto L93
            return r1
        L93:
            r7 = r8
            android.net.Uri r7 = (android.net.Uri) r7
        L96:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.common.i.a(android.content.Context, java.lang.String, android.net.Uri, T9.a):java.lang.Object");
    }

    public static final void c(View... viewArr) {
        for (View view : viewArr) {
            if (view != null) {
                view.setVisibility(0);
            }
        }
    }

    public static final Map<String, com.sumsub.sns.internal.core.data.model.remote.o> c(Map<String, ? extends Object> map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            Map map2 = value instanceof Map ? (Map) value : null;
            com.sumsub.sns.internal.core.data.model.remote.o b9 = map2 != null ? b((Map<?, ?>) map2) : null;
            Pair pair = b9 != null ? new Pair(key, b9) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return kotlin.collections.a.v(arrayList);
    }

    public static final void a(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", activity.getPackageName(), null));
        activity.startActivity(intent);
    }

    public static final void a(View view, boolean z10) {
        view.setVisibility(z10 ? 8 : 0);
    }

    public static final ColorStateList a(TypedArray typedArray, Context context, int i) {
        switch (typedArray.getType(i)) {
            case 28:
            case 29:
            case 30:
            case 31:
                return ColorStateList.valueOf(typedArray.getColor(i, 0));
            default:
                int resourceId = typedArray.getResourceId(i, -1);
                if (resourceId != -1) {
                    return C0913a.getColorStateList(context, resourceId);
                }
                return ColorStateList.valueOf(0);
        }
    }

    public static final boolean a(Configuration configuration) {
        return (configuration.uiMode & 48) == 32;
    }

    public static final int a(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.data;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> a(Map<K, ? extends V> map, K k3, V v10) {
        if (v10 == null && !map.containsKey(k3)) {
            return map;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map);
        if (v10 == null) {
            linkedHashMap.remove(k3);
        } else {
            linkedHashMap.put(k3, v10);
        }
        return linkedHashMap;
    }

    public static final ActivityC0533g a(Context context) {
        if (context instanceof ActivityC0533g) {
            return (ActivityC0533g) context;
        }
        if (context instanceof k.c) {
            Context baseContext = ((k.c) context).getBaseContext();
            if (baseContext instanceof ActivityC0533g) {
                return (ActivityC0533g) baseContext;
            }
        }
        return null;
    }

    public static final void a(TextView textView, CharSequence charSequence) {
        if (charSequence != null && !C0969n.i0(charSequence)) {
            textView.setText(charSequence);
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            textView.setText((CharSequence) null);
        }
    }

    public static final <T> List<T> a(List<? extends T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static final void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final void a(ViewGroup viewGroup) {
        LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
        if (layoutTransition != null) {
            layoutTransition.enableTransitionType(4);
            layoutTransition.setDuration(100L);
        }
    }

    public static final List<Document> a(List<Document> list, com.sumsub.sns.internal.core.data.model.g gVar) {
        List<String> j10;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Document document = (Document) obj;
            if (gVar.I().k() && ((j10 = gVar.I().j()) == null || !j10.contains(document.getType().c()))) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final void a(View... viewArr) {
        for (View view : viewArr) {
            if (view != null) {
                view.setVisibility(8);
            }
        }
    }

    public static final void a(Integer num, Integer num2, Integer num3, Integer num4, View... viewArr) {
        int length = viewArr.length;
        for (int i = 0; i < length; i++) {
            View view = viewArr[i];
            ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                if (num != null) {
                    marginLayoutParams.setMarginStart(num.intValue());
                }
                if (num2 != null) {
                    marginLayoutParams.setMarginEnd(num2.intValue());
                }
                if (num3 != null) {
                    marginLayoutParams.topMargin = num3.intValue();
                }
                if (num4 != null) {
                    marginLayoutParams.bottomMargin = num4.intValue();
                }
            }
        }
    }

    public static final <A, B> Map<A, B> a(Map<A, ? extends B> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<A, ? extends B> entry : map.entrySet()) {
            if (entry.getValue() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }
}
