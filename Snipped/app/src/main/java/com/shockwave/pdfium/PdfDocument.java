package com.shockwave.pdfium;

import android.graphics.RectF;
import android.os.ParcelFileDescriptor;
import androidx.collection.a;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class PdfDocument {

    /* renamed from: a, reason: collision with root package name */
    public long f13345a;

    /* renamed from: b, reason: collision with root package name */
    public ParcelFileDescriptor f13346b;

    /* renamed from: c, reason: collision with root package name */
    public final a f13347c = new a();

    public static class Bookmark {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f13348a = new ArrayList();
    }

    public static class Link {

        /* renamed from: a, reason: collision with root package name */
        public RectF f13349a;

        /* renamed from: b, reason: collision with root package name */
        public Integer f13350b;

        /* renamed from: c, reason: collision with root package name */
        public String f13351c;
    }

    public static class Meta {
    }
}
