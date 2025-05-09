package com.google.android.gms.measurement.internal;

import P9.z;
import android.content.Context;
import android.net.Uri;
import com.google.crypto.tink.shaded.protobuf.CodedOutputStream;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.squareup.picasso.Picasso;
import com.sumsub.sns.internal.core.common.q0;
import io.sentry.C;
import io.sentry.E;
import io.sentry.InterfaceC0859q;
import java.util.ArrayList;
import java.util.Map;
import k1.AbstractC0919C;
import kotlin.Pair;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.i;
import okhttp3.logging.HttpLoggingInterceptor;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements LibraryVersionComponent.VersionExtractor, Picasso.c, HttpLoggingInterceptor.a, C.b, AbstractC0919C.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8971a;

    public /* synthetic */ a(int i) {
        this.f8971a = i;
    }

    public static float d(float f10, float f11, float f12, float f13) {
        return ((f10 - f11) * f12) + f13;
    }

    public static int e(int i, int i9, int i10, int i11) {
        return CodedOutputStream.i0(i) + i9 + i10 + i11;
    }

    public static Object f(int i, ArrayList arrayList) {
        return arrayList.get(arrayList.size() - i);
    }

    public static String g(int i, String str) {
        return str + i;
    }

    public static String h(String str, Uri uri) {
        return str + uri;
    }

    public static String i(String str, Exception exc) {
        return str + exc;
    }

    public static String j(StringBuilder sb2, CharSequence charSequence, char c2) {
        sb2.append((Object) charSequence);
        sb2.append(c2);
        return sb2.toString();
    }

    public static String k(StringBuilder sb2, boolean z10, String str) {
        sb2.append(z10);
        sb2.append(str);
        return sb2.toString();
    }

    public static StringBuilder l(String str, int i, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i);
        sb2.append(str2);
        return sb2;
    }

    public static StringBuilder m(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        return sb2;
    }

    public static Map n(String str, String str2) {
        return z.o(new Pair(str, str2));
    }

    public static PropertyReference1Impl o(Class cls, String str, String str2, int i, i iVar) {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(cls, str, str2, i);
        iVar.getClass();
        return propertyReference1Impl;
    }

    public static PropertyReference1Impl p(i iVar, Class cls, String str, String str2, int i) {
        iVar.getClass();
        return new PropertyReference1Impl(cls, str, str2, i);
    }

    public static void q(zzfv zzfvVar, String str) {
        zzfvVar.zzay().zzj().zza(str);
    }

    public static void r(StringBuilder sb2, Double d10, String str, Double d11, String str2) {
        sb2.append(d10);
        sb2.append(str);
        sb2.append(d11);
        sb2.append(str2);
    }

    public static void s(Map map, String str, E e10, String str2, InterfaceC0859q interfaceC0859q) {
        Object obj = map.get(str);
        e10.P(str2);
        e10.Q(interfaceC0859q, obj);
    }

    public static int t(int i, int i9, int i10, int i11) {
        return ((i - i9) / i10) + i11;
    }

    public static int u(int i, int i9, int i10, int i11) {
        return i + i9 + i10 + i11;
    }

    @Override // io.sentry.C.b
    public Object a() {
        return null;
    }

    @Override // okhttp3.logging.HttpLoggingInterceptor.a
    public void b(String str) {
        q0.b.a(str);
    }

    @Override // k1.AbstractC0919C.h
    public void c(AbstractC0919C.g gVar, AbstractC0919C abstractC0919C, boolean z10) {
        switch (this.f8971a) {
            case 19:
                gVar.h(abstractC0919C);
                break;
            case 20:
                gVar.b(abstractC0919C);
                break;
            case 21:
                gVar.a(abstractC0919C);
                break;
            case 22:
                gVar.c();
                break;
            default:
                gVar.j();
                break;
        }
    }

    @Override // com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor
    public String extract(Object obj) {
        String lambda$getComponents$0;
        String lambda$getComponents$1;
        String lambda$getComponents$2;
        String lambda$getComponents$3;
        Context context = (Context) obj;
        switch (this.f8971a) {
            case 2:
                lambda$getComponents$0 = FirebaseCommonRegistrar.lambda$getComponents$0(context);
                return lambda$getComponents$0;
            case 3:
                lambda$getComponents$1 = FirebaseCommonRegistrar.lambda$getComponents$1(context);
                return lambda$getComponents$1;
            case 4:
                lambda$getComponents$2 = FirebaseCommonRegistrar.lambda$getComponents$2(context);
                return lambda$getComponents$2;
            default:
                lambda$getComponents$3 = FirebaseCommonRegistrar.lambda$getComponents$3(context);
                return lambda$getComponents$3;
        }
    }
}
