package com.chuckerteam.chucker.internal.support;

import Ka.c;
import Ka.s;
import Ka.y;
import Ka.z;
import O9.p;
import V9.d;
import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import ca.InterfaceC0650p;
import java.io.OutputStream;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: FileSaver.kt */
@d(c = "com.chuckerteam.chucker.internal.support.FileSaver$saveFile$2", f = "FileSaver.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FileSaver$saveFile$2 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super Boolean>, Object> {

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f8631u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ ContentResolver f8632v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Uri f8633w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ y f8634x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileSaver$saveFile$2(y yVar, T9.a aVar, ContentResolver contentResolver, Uri uri) {
        super(2, aVar);
        this.f8632v = contentResolver;
        this.f8633w = uri;
        this.f8634x = yVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final T9.a<p> create(Object obj, T9.a<?> aVar) {
        FileSaver$saveFile$2 fileSaver$saveFile$2 = new FileSaver$saveFile$2(this.f8634x, aVar, this.f8632v, this.f8633w);
        fileSaver$saveFile$2.f8631u = obj;
        return fileSaver$saveFile$2;
    }

    @Override // ca.InterfaceC0650p
    public final Object invoke(CoroutineScope coroutineScope, T9.a<? super Boolean> aVar) {
        return ((FileSaver$saveFile$2) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        kotlin.b.b(obj);
        ContentResolver contentResolver = this.f8632v;
        Uri uri = this.f8633w;
        y yVar = this.f8634x;
        try {
            OutputStream openOutputStream = contentResolver.openOutputStream(uri);
            failure = null;
            if (openOutputStream != null) {
                try {
                    Logger logger = Ka.p.f2319a;
                    s sVar = new s(new c(1, openOutputStream, new z()));
                    try {
                        long c02 = sVar.c0(yVar);
                        U4.b.d(sVar, null);
                        Object l10 = new Long(c02);
                        U4.b.d(openOutputStream, null);
                        failure = l10;
                    } finally {
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a10 = Result.a(failure);
        if (a10 == null) {
            return Boolean.TRUE;
        }
        Log.e("Chucker", "Failed to save data to a file", a10);
        return Boolean.FALSE;
    }
}
