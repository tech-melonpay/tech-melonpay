package com.shockwave.pdfium;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.RectF;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.shockwave.pdfium.PdfDocument;
import com.shockwave.pdfium.util.Size;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class PdfiumCore {

    /* renamed from: b, reason: collision with root package name */
    public static final Object f13352b;

    /* renamed from: c, reason: collision with root package name */
    public static Field f13353c;

    /* renamed from: a, reason: collision with root package name */
    public int f13354a;

    static {
        try {
            System.loadLibrary("c++_shared");
            System.loadLibrary("modpng");
            System.loadLibrary("modft2");
            System.loadLibrary("modpdfium");
            System.loadLibrary("jniPdfium");
        } catch (UnsatisfiedLinkError e10) {
            Log.e("com.shockwave.pdfium.PdfiumCore", "Native libraries failed to load - " + e10);
        }
        f13352b = new Object();
        f13353c = null;
    }

    private native void nativeCloseDocument(long j10);

    private native void nativeClosePage(long j10);

    private native long nativeGetBookmarkDestIndex(long j10, long j11);

    private native String nativeGetBookmarkTitle(long j10);

    private native Integer nativeGetDestPageIndex(long j10, long j11);

    private native String nativeGetDocumentMetaText(long j10, String str);

    private native Long nativeGetFirstChildBookmark(long j10, Long l10);

    private native RectF nativeGetLinkRect(long j10);

    private native String nativeGetLinkURI(long j10, long j11);

    private native int nativeGetPageCount(long j10);

    private native long[] nativeGetPageLinks(long j10);

    private native Size nativeGetPageSizeByIndex(long j10, int i, int i9);

    private native Long nativeGetSiblingBookmark(long j10, long j11);

    private native long nativeLoadPage(long j10, int i);

    private native long nativeOpenDocument(int i, String str);

    private native Point nativePageCoordsToDevice(long j10, int i, int i9, int i10, int i11, int i12, double d10, double d11);

    private native void nativeRenderPageBitmap(long j10, Bitmap bitmap, int i, int i9, int i10, int i11, int i12, boolean z10);

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(PdfDocument pdfDocument) {
        synchronized (f13352b) {
            try {
                Iterator it = pdfDocument.f13347c.keySet().iterator();
                while (it.hasNext()) {
                    nativeClosePage(((Long) pdfDocument.f13347c.get((Integer) it.next())).longValue());
                }
                pdfDocument.f13347c.clear();
                nativeCloseDocument(pdfDocument.f13345a);
                ParcelFileDescriptor parcelFileDescriptor = pdfDocument.f13346b;
                if (parcelFileDescriptor != null) {
                    try {
                        parcelFileDescriptor.close();
                    } catch (IOException unused) {
                    }
                    pdfDocument.f13346b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final PdfDocument.Meta b(PdfDocument pdfDocument) {
        PdfDocument.Meta meta;
        synchronized (f13352b) {
            meta = new PdfDocument.Meta();
            nativeGetDocumentMetaText(pdfDocument.f13345a, "Title");
            nativeGetDocumentMetaText(pdfDocument.f13345a, "Author");
            nativeGetDocumentMetaText(pdfDocument.f13345a, "Subject");
            nativeGetDocumentMetaText(pdfDocument.f13345a, "Keywords");
            nativeGetDocumentMetaText(pdfDocument.f13345a, "Creator");
            nativeGetDocumentMetaText(pdfDocument.f13345a, "Producer");
            nativeGetDocumentMetaText(pdfDocument.f13345a, "CreationDate");
            nativeGetDocumentMetaText(pdfDocument.f13345a, "ModDate");
        }
        return meta;
    }

    public final int c(PdfDocument pdfDocument) {
        int nativeGetPageCount;
        synchronized (f13352b) {
            nativeGetPageCount = nativeGetPageCount(pdfDocument.f13345a);
        }
        return nativeGetPageCount;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ArrayList d(PdfDocument pdfDocument, int i) {
        synchronized (f13352b) {
            try {
                ArrayList arrayList = new ArrayList();
                Long l10 = (Long) pdfDocument.f13347c.get(Integer.valueOf(i));
                if (l10 == null) {
                    return arrayList;
                }
                for (long j10 : nativeGetPageLinks(l10.longValue())) {
                    Integer nativeGetDestPageIndex = nativeGetDestPageIndex(pdfDocument.f13345a, j10);
                    String nativeGetLinkURI = nativeGetLinkURI(pdfDocument.f13345a, j10);
                    RectF nativeGetLinkRect = nativeGetLinkRect(j10);
                    if (nativeGetLinkRect != null && (nativeGetDestPageIndex != null || nativeGetLinkURI != null)) {
                        PdfDocument.Link link = new PdfDocument.Link();
                        link.f13349a = nativeGetLinkRect;
                        link.f13350b = nativeGetDestPageIndex;
                        link.f13351c = nativeGetLinkURI;
                        arrayList.add(link);
                    }
                }
                return arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Size e(PdfDocument pdfDocument, int i) {
        Size nativeGetPageSizeByIndex;
        synchronized (f13352b) {
            nativeGetPageSizeByIndex = nativeGetPageSizeByIndex(pdfDocument.f13345a, i, this.f13354a);
        }
        return nativeGetPageSizeByIndex;
    }

    public final ArrayList f(PdfDocument pdfDocument) {
        ArrayList arrayList;
        synchronized (f13352b) {
            try {
                arrayList = new ArrayList();
                Long nativeGetFirstChildBookmark = nativeGetFirstChildBookmark(pdfDocument.f13345a, null);
                if (nativeGetFirstChildBookmark != null) {
                    j(arrayList, pdfDocument, nativeGetFirstChildBookmark.longValue());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Point g(PdfDocument pdfDocument, int i, int i9, int i10, int i11, int i12, double d10, double d11) {
        return nativePageCoordsToDevice(((Long) pdfDocument.f13347c.get(Integer.valueOf(i))).longValue(), i9, i10, i11, i12, 0, d10, d11);
    }

    public final PdfDocument h(ParcelFileDescriptor parcelFileDescriptor, String str) {
        PdfDocument pdfDocument = new PdfDocument();
        pdfDocument.f13346b = parcelFileDescriptor;
        synchronized (f13352b) {
            int i = -1;
            try {
                if (f13353c == null) {
                    Field declaredField = FileDescriptor.class.getDeclaredField("descriptor");
                    f13353c = declaredField;
                    declaredField.setAccessible(true);
                }
                i = f13353c.getInt(parcelFileDescriptor.getFileDescriptor());
            } catch (IllegalAccessException e10) {
                e10.printStackTrace();
            } catch (NoSuchFieldException e11) {
                e11.printStackTrace();
            }
            pdfDocument.f13345a = nativeOpenDocument(i, str);
        }
        return pdfDocument;
    }

    public final void i(PdfDocument pdfDocument, int i) {
        synchronized (f13352b) {
            pdfDocument.f13347c.put(Integer.valueOf(i), Long.valueOf(nativeLoadPage(pdfDocument.f13345a, i)));
        }
    }

    public final void j(ArrayList arrayList, PdfDocument pdfDocument, long j10) {
        PdfDocument.Bookmark bookmark = new PdfDocument.Bookmark();
        nativeGetBookmarkTitle(j10);
        nativeGetBookmarkDestIndex(pdfDocument.f13345a, j10);
        arrayList.add(bookmark);
        Long nativeGetFirstChildBookmark = nativeGetFirstChildBookmark(pdfDocument.f13345a, Long.valueOf(j10));
        if (nativeGetFirstChildBookmark != null) {
            j(bookmark.f13348a, pdfDocument, nativeGetFirstChildBookmark.longValue());
        }
        Long nativeGetSiblingBookmark = nativeGetSiblingBookmark(pdfDocument.f13345a, j10);
        if (nativeGetSiblingBookmark != null) {
            j(arrayList, pdfDocument, nativeGetSiblingBookmark.longValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k(PdfDocument pdfDocument, Bitmap bitmap, int i, int i9, int i10, int i11, int i12, boolean z10) {
        synchronized (f13352b) {
            try {
                try {
                } catch (NullPointerException e10) {
                    e = e10;
                } catch (Exception e11) {
                    e = e11;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
                try {
                    nativeRenderPageBitmap(((Long) pdfDocument.f13347c.get(Integer.valueOf(i))).longValue(), bitmap, this.f13354a, i9, i10, i11, i12, z10);
                } catch (NullPointerException e12) {
                    e = e12;
                    Log.e("com.shockwave.pdfium.PdfiumCore", "mContext may be null");
                    e.printStackTrace();
                } catch (Exception e13) {
                    e = e13;
                    Log.e("com.shockwave.pdfium.PdfiumCore", "Exception throw from native");
                    e.printStackTrace();
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }
}
