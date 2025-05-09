package com.sumsub.sns.internal.core.common;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.pdf.PdfRenderer;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.webkit.MimeTypeMap;
import ca.InterfaceC0650p;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes2.dex */
public final class m0 {

    @V9.d(c = "com.sumsub.sns.internal.core.common.SNSBitmapExtensionsKt$asJpegInputStream$2", f = "SNSBitmapExtensions.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super ByteArrayInputStream>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f15144a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Bitmap f15145b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Bitmap bitmap, T9.a<? super a> aVar) {
            super(2, aVar);
            this.f15145b = bitmap;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super ByteArrayInputStream> aVar) {
            return ((a) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return new a(this.f15145b, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f15144a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                if (!this.f15145b.compress(Bitmap.CompressFormat.JPEG, 75, byteArrayOutputStream)) {
                    return null;
                }
                byteArrayOutputStream.flush();
                return new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            } catch (IOException unused) {
                return null;
            }
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.common.SNSBitmapExtensionsKt$decodeImage$2", f = "SNSBitmapExtensions.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super Bitmap>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f15146a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f15147b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ File f15148c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f15149d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(File file, int i, T9.a<? super b> aVar) {
            super(2, aVar);
            this.f15148c = file;
            this.f15149d = i;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super Bitmap> aVar) {
            return ((b) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            b bVar = new b(this.f15148c, this.f15149d, aVar);
            bVar.f15147b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Bitmap bitmap;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f15146a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f15147b;
            L0.a aVar = new L0.a(this.f15148c);
            try {
                String absolutePath = this.f15148c.getAbsolutePath();
                int i = this.f15149d;
                bitmap = m0.b(absolutePath, i, i);
            } catch (Throwable th) {
                com.sumsub.sns.internal.log.b.b(com.sumsub.sns.internal.log.a.f17535a, com.sumsub.sns.internal.log.c.a(coroutineScope), "Error while decoding image", th);
                bitmap = null;
            }
            if (bitmap == null) {
                return null;
            }
            if (aVar.n() == 0) {
                return bitmap;
            }
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            Matrix matrix = new Matrix();
            matrix.setRotate(aVar.n());
            O9.p pVar = O9.p.f3034a;
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
            bitmap.recycle();
            return createBitmap;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.common.SNSBitmapExtensionsKt$decodePdf$2", f = "SNSBitmapExtensions.kt", l = {}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super Bitmap>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f15150a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f15151b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ File f15152c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f15153d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(File file, int i, T9.a<? super c> aVar) {
            super(2, aVar);
            this.f15152c = file;
            this.f15153d = i;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super Bitmap> aVar) {
            return ((c) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            c cVar = new c(this.f15152c, this.f15153d, aVar);
            cVar.f15151b = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i;
            int i9;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f15150a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f15151b;
            try {
                PdfRenderer pdfRenderer = new PdfRenderer(ParcelFileDescriptor.open(this.f15152c, 268435456));
                PdfRenderer.Page openPage = pdfRenderer.openPage(0);
                if (openPage.getWidth() < openPage.getHeight()) {
                    i = U4.b.C((openPage.getWidth() / openPage.getHeight()) * this.f15153d);
                } else {
                    i = this.f15153d;
                }
                if (openPage.getHeight() < openPage.getWidth()) {
                    i9 = U4.b.C((openPage.getHeight() / openPage.getWidth()) * this.f15153d);
                } else {
                    i9 = this.f15153d;
                }
                Bitmap createBitmap = Bitmap.createBitmap(i, i9, Bitmap.Config.ARGB_8888);
                createBitmap.eraseColor(-1);
                openPage.render(createBitmap, new Rect(0, 0, i, i9), null, 1);
                openPage.close();
                pdfRenderer.close();
                return createBitmap;
            } catch (Exception e10) {
                com.sumsub.sns.internal.log.a aVar = com.sumsub.sns.internal.log.a.f17535a;
                String a10 = com.sumsub.sns.internal.log.c.a(coroutineScope);
                String message = e10.getMessage();
                if (message == null) {
                    message = "";
                }
                aVar.e(a10, message, e10);
                return null;
            }
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.common.SNSBitmapExtensionsKt$saveToTempJpgFile$2", f = "SNSBitmapExtensions.kt", l = {107}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super File>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f15154a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Bitmap f15155b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f15156c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Context f15157d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Bitmap bitmap, String str, Context context, T9.a<? super d> aVar) {
            super(2, aVar);
            this.f15155b = bitmap;
            this.f15156c = str;
            this.f15157d = context;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super File> aVar) {
            return ((d) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return new d(this.f15155b, this.f15156c, this.f15157d, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f15154a;
            if (i == 0) {
                kotlin.b.b(obj);
                Bitmap bitmap = this.f15155b;
                this.f15154a = 1;
                obj = m0.a(bitmap, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            InputStream inputStream = (InputStream) obj;
            if (inputStream == null) {
                return null;
            }
            try {
                File createTempFile = File.createTempFile(this.f15156c, ".jpg", this.f15157d.getCacheDir());
                if (r0.a(inputStream, new FileOutputStream(createTempFile))) {
                    return createTempFile;
                }
                return null;
            } catch (IOException unused) {
                return null;
            }
        }
    }

    public static final Bitmap b(String str, int i, int i9) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inSampleSize = a(options, i, i9);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(str, options);
    }

    public static final Object a(File file, int i, T9.a<? super Bitmap> aVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new b(file, i, null), aVar);
    }

    public static final int a(BitmapFactory.Options options, int i, int i9) {
        Integer valueOf = Integer.valueOf(options.outHeight);
        Integer valueOf2 = Integer.valueOf(options.outWidth);
        int intValue = valueOf.intValue();
        int intValue2 = valueOf2.intValue();
        int i10 = 1;
        if (intValue > i9 || intValue2 > i) {
            int i11 = intValue / 2;
            int i12 = intValue2 / 2;
            while (i11 / i10 >= i9 && i12 / i10 >= i) {
                i10 *= 2;
            }
        }
        return i10;
    }

    public static final Object a(Bitmap bitmap, Context context, String str, T9.a<? super File> aVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new d(bitmap, str, context, null), aVar);
    }

    public static final Object b(File file, int i, T9.a<? super Bitmap> aVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new c(file, i, null), aVar);
    }

    public static final Object a(Bitmap bitmap, T9.a<? super InputStream> aVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new a(bitmap, null), aVar);
    }

    public static final String a(File file) {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(Uri.fromFile(file).toString());
        if (fileExtensionFromUrl != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
        }
        return null;
    }
}
