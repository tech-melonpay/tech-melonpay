package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.c;
import b0.C0580a;
import e0.C0707a;
import f0.C0735c;
import f0.C0736d;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: ConstraintSet.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f6328d = {0, 4, 8};

    /* renamed from: e, reason: collision with root package name */
    public static final SparseIntArray f6329e;

    /* renamed from: f, reason: collision with root package name */
    public static final SparseIntArray f6330f;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap<String, ConstraintAttribute> f6331a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6332b = true;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap<Integer, a> f6333c = new HashMap<>();

    /* compiled from: ConstraintSet.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f6334a;

        /* renamed from: b, reason: collision with root package name */
        public final d f6335b;

        /* renamed from: c, reason: collision with root package name */
        public final c f6336c;

        /* renamed from: d, reason: collision with root package name */
        public final C0071b f6337d;

        /* renamed from: e, reason: collision with root package name */
        public final e f6338e;

        /* renamed from: f, reason: collision with root package name */
        public HashMap<String, ConstraintAttribute> f6339f;

        /* compiled from: ConstraintSet.java */
        /* renamed from: androidx.constraintlayout.widget.b$a$a, reason: collision with other inner class name */
        public static class C0070a {

            /* renamed from: a, reason: collision with root package name */
            public int[] f6340a = new int[10];

            /* renamed from: b, reason: collision with root package name */
            public int[] f6341b = new int[10];

            /* renamed from: c, reason: collision with root package name */
            public int f6342c = 0;

            /* renamed from: d, reason: collision with root package name */
            public int[] f6343d = new int[10];

            /* renamed from: e, reason: collision with root package name */
            public float[] f6344e = new float[10];

            /* renamed from: f, reason: collision with root package name */
            public int f6345f = 0;

            /* renamed from: g, reason: collision with root package name */
            public int[] f6346g = new int[5];

            /* renamed from: h, reason: collision with root package name */
            public String[] f6347h = new String[5];
            public int i = 0;

            /* renamed from: j, reason: collision with root package name */
            public int[] f6348j = new int[4];

            /* renamed from: k, reason: collision with root package name */
            public boolean[] f6349k = new boolean[4];

            /* renamed from: l, reason: collision with root package name */
            public int f6350l = 0;

            public final void a(int i, float f10) {
                int i9 = this.f6345f;
                int[] iArr = this.f6343d;
                if (i9 >= iArr.length) {
                    this.f6343d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f6344e;
                    this.f6344e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f6343d;
                int i10 = this.f6345f;
                iArr2[i10] = i;
                float[] fArr2 = this.f6344e;
                this.f6345f = i10 + 1;
                fArr2[i10] = f10;
            }

            public final void b(int i, int i9) {
                int i10 = this.f6342c;
                int[] iArr = this.f6340a;
                if (i10 >= iArr.length) {
                    this.f6340a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f6341b;
                    this.f6341b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f6340a;
                int i11 = this.f6342c;
                iArr3[i11] = i;
                int[] iArr4 = this.f6341b;
                this.f6342c = i11 + 1;
                iArr4[i11] = i9;
            }

            public final void c(int i, String str) {
                int i9 = this.i;
                int[] iArr = this.f6346g;
                if (i9 >= iArr.length) {
                    this.f6346g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f6347h;
                    this.f6347h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f6346g;
                int i10 = this.i;
                iArr2[i10] = i;
                String[] strArr2 = this.f6347h;
                this.i = i10 + 1;
                strArr2[i10] = str;
            }

            public final void d(int i, boolean z10) {
                int i9 = this.f6350l;
                int[] iArr = this.f6348j;
                if (i9 >= iArr.length) {
                    this.f6348j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f6349k;
                    this.f6349k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f6348j;
                int i10 = this.f6350l;
                iArr2[i10] = i;
                boolean[] zArr2 = this.f6349k;
                this.f6350l = i10 + 1;
                zArr2[i10] = z10;
            }
        }

        public a() {
            d dVar = new d();
            dVar.f6419a = 0;
            dVar.f6420b = 0;
            dVar.f6421c = 1.0f;
            dVar.f6422d = Float.NaN;
            this.f6335b = dVar;
            c cVar = new c();
            cVar.f6411a = -1;
            cVar.f6412b = 0;
            cVar.f6413c = -1;
            cVar.f6414d = Float.NaN;
            cVar.f6415e = Float.NaN;
            cVar.f6416f = Float.NaN;
            cVar.f6417g = -1;
            cVar.f6418h = null;
            cVar.i = -1;
            this.f6336c = cVar;
            this.f6337d = new C0071b();
            e eVar = new e();
            eVar.f6424a = 0.0f;
            eVar.f6425b = 0.0f;
            eVar.f6426c = 0.0f;
            eVar.f6427d = 1.0f;
            eVar.f6428e = 1.0f;
            eVar.f6429f = Float.NaN;
            eVar.f6430g = Float.NaN;
            eVar.f6431h = -1;
            eVar.i = 0.0f;
            eVar.f6432j = 0.0f;
            eVar.f6433k = 0.0f;
            eVar.f6434l = false;
            eVar.f6435m = 0.0f;
            this.f6338e = eVar;
            this.f6339f = new HashMap<>();
        }

        public final void a(ConstraintLayout.a aVar) {
            C0071b c0071b = this.f6337d;
            aVar.f6276e = c0071b.f6384h;
            aVar.f6278f = c0071b.i;
            aVar.f6280g = c0071b.f6387j;
            aVar.f6282h = c0071b.f6389k;
            aVar.i = c0071b.f6391l;
            aVar.f6285j = c0071b.f6393m;
            aVar.f6287k = c0071b.f6395n;
            aVar.f6289l = c0071b.f6397o;
            aVar.f6291m = c0071b.f6399p;
            aVar.f6293n = c0071b.f6400q;
            aVar.f6295o = c0071b.f6401r;
            aVar.f6302s = c0071b.f6402s;
            aVar.f6303t = c0071b.f6403t;
            aVar.f6304u = c0071b.f6404u;
            aVar.f6305v = c0071b.f6405v;
            ((ViewGroup.MarginLayoutParams) aVar).leftMargin = c0071b.f6357F;
            ((ViewGroup.MarginLayoutParams) aVar).rightMargin = c0071b.f6358G;
            ((ViewGroup.MarginLayoutParams) aVar).topMargin = c0071b.f6359H;
            ((ViewGroup.MarginLayoutParams) aVar).bottomMargin = c0071b.f6360I;
            aVar.f6250A = c0071b.R;
            aVar.f6251B = c0071b.f6368Q;
            aVar.f6307x = c0071b.f6365N;
            aVar.f6309z = c0071b.f6367P;
            aVar.f6254E = c0071b.f6406w;
            aVar.f6255F = c0071b.f6407x;
            aVar.f6297p = c0071b.f6409z;
            aVar.f6299q = c0071b.f6352A;
            aVar.f6301r = c0071b.f6353B;
            aVar.f6256G = c0071b.f6408y;
            aVar.T = c0071b.f6354C;
            aVar.U = c0071b.f6355D;
            aVar.f6258I = c0071b.T;
            aVar.f6257H = c0071b.U;
            aVar.f6260K = c0071b.W;
            aVar.f6259J = c0071b.V;
            aVar.W = c0071b.f6392l0;
            aVar.X = c0071b.f6394m0;
            aVar.f6261L = c0071b.X;
            aVar.f6262M = c0071b.Y;
            aVar.f6265P = c0071b.f6369Z;
            aVar.f6266Q = c0071b.f6371a0;
            aVar.f6263N = c0071b.f6373b0;
            aVar.f6264O = c0071b.f6375c0;
            aVar.R = c0071b.f6377d0;
            aVar.S = c0071b.f6379e0;
            aVar.V = c0071b.f6356E;
            aVar.f6272c = c0071b.f6380f;
            aVar.f6268a = c0071b.f6376d;
            aVar.f6270b = c0071b.f6378e;
            ((ViewGroup.MarginLayoutParams) aVar).width = c0071b.f6372b;
            ((ViewGroup.MarginLayoutParams) aVar).height = c0071b.f6374c;
            String str = c0071b.f6390k0;
            if (str != null) {
                aVar.Y = str;
            }
            aVar.f6267Z = c0071b.f6398o0;
            aVar.setMarginStart(c0071b.f6362K);
            aVar.setMarginEnd(c0071b.f6361J);
            aVar.a();
        }

        public final void b(int i, ConstraintLayout.a aVar) {
            this.f6334a = i;
            int i9 = aVar.f6276e;
            C0071b c0071b = this.f6337d;
            c0071b.f6384h = i9;
            c0071b.i = aVar.f6278f;
            c0071b.f6387j = aVar.f6280g;
            c0071b.f6389k = aVar.f6282h;
            c0071b.f6391l = aVar.i;
            c0071b.f6393m = aVar.f6285j;
            c0071b.f6395n = aVar.f6287k;
            c0071b.f6397o = aVar.f6289l;
            c0071b.f6399p = aVar.f6291m;
            c0071b.f6400q = aVar.f6293n;
            c0071b.f6401r = aVar.f6295o;
            c0071b.f6402s = aVar.f6302s;
            c0071b.f6403t = aVar.f6303t;
            c0071b.f6404u = aVar.f6304u;
            c0071b.f6405v = aVar.f6305v;
            c0071b.f6406w = aVar.f6254E;
            c0071b.f6407x = aVar.f6255F;
            c0071b.f6408y = aVar.f6256G;
            c0071b.f6409z = aVar.f6297p;
            c0071b.f6352A = aVar.f6299q;
            c0071b.f6353B = aVar.f6301r;
            c0071b.f6354C = aVar.T;
            c0071b.f6355D = aVar.U;
            c0071b.f6356E = aVar.V;
            c0071b.f6380f = aVar.f6272c;
            c0071b.f6376d = aVar.f6268a;
            c0071b.f6378e = aVar.f6270b;
            c0071b.f6372b = ((ViewGroup.MarginLayoutParams) aVar).width;
            c0071b.f6374c = ((ViewGroup.MarginLayoutParams) aVar).height;
            c0071b.f6357F = ((ViewGroup.MarginLayoutParams) aVar).leftMargin;
            c0071b.f6358G = ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
            c0071b.f6359H = ((ViewGroup.MarginLayoutParams) aVar).topMargin;
            c0071b.f6360I = ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
            c0071b.f6363L = aVar.f6253D;
            c0071b.T = aVar.f6258I;
            c0071b.U = aVar.f6257H;
            c0071b.W = aVar.f6260K;
            c0071b.V = aVar.f6259J;
            c0071b.f6392l0 = aVar.W;
            c0071b.f6394m0 = aVar.X;
            c0071b.X = aVar.f6261L;
            c0071b.Y = aVar.f6262M;
            c0071b.f6369Z = aVar.f6265P;
            c0071b.f6371a0 = aVar.f6266Q;
            c0071b.f6373b0 = aVar.f6263N;
            c0071b.f6375c0 = aVar.f6264O;
            c0071b.f6377d0 = aVar.R;
            c0071b.f6379e0 = aVar.S;
            c0071b.f6390k0 = aVar.Y;
            c0071b.f6365N = aVar.f6307x;
            c0071b.f6367P = aVar.f6309z;
            c0071b.f6364M = aVar.f6306w;
            c0071b.f6366O = aVar.f6308y;
            c0071b.R = aVar.f6250A;
            c0071b.f6368Q = aVar.f6251B;
            c0071b.S = aVar.f6252C;
            c0071b.f6398o0 = aVar.f6267Z;
            c0071b.f6361J = aVar.getMarginEnd();
            c0071b.f6362K = aVar.getMarginStart();
        }

        public final void c(int i, c.a aVar) {
            b(i, aVar);
            this.f6335b.f6421c = aVar.f6441r0;
            float f10 = aVar.f6443u0;
            e eVar = this.f6338e;
            eVar.f6424a = f10;
            eVar.f6425b = aVar.f6444v0;
            eVar.f6426c = aVar.f6445w0;
            eVar.f6427d = aVar.f6446x0;
            eVar.f6428e = aVar.f6447y0;
            eVar.f6429f = aVar.f6448z0;
            eVar.f6430g = aVar.f6437A0;
            eVar.i = aVar.f6438B0;
            eVar.f6432j = aVar.f6439C0;
            eVar.f6433k = aVar.f6440D0;
            eVar.f6435m = aVar.f6442t0;
            eVar.f6434l = aVar.s0;
        }

        public final Object clone() {
            a aVar = new a();
            C0071b c0071b = aVar.f6337d;
            c0071b.getClass();
            C0071b c0071b2 = this.f6337d;
            c0071b.f6370a = c0071b2.f6370a;
            c0071b.f6372b = c0071b2.f6372b;
            c0071b.f6374c = c0071b2.f6374c;
            c0071b.f6376d = c0071b2.f6376d;
            c0071b.f6378e = c0071b2.f6378e;
            c0071b.f6380f = c0071b2.f6380f;
            c0071b.f6382g = c0071b2.f6382g;
            c0071b.f6384h = c0071b2.f6384h;
            c0071b.i = c0071b2.i;
            c0071b.f6387j = c0071b2.f6387j;
            c0071b.f6389k = c0071b2.f6389k;
            c0071b.f6391l = c0071b2.f6391l;
            c0071b.f6393m = c0071b2.f6393m;
            c0071b.f6395n = c0071b2.f6395n;
            c0071b.f6397o = c0071b2.f6397o;
            c0071b.f6399p = c0071b2.f6399p;
            c0071b.f6400q = c0071b2.f6400q;
            c0071b.f6401r = c0071b2.f6401r;
            c0071b.f6402s = c0071b2.f6402s;
            c0071b.f6403t = c0071b2.f6403t;
            c0071b.f6404u = c0071b2.f6404u;
            c0071b.f6405v = c0071b2.f6405v;
            c0071b.f6406w = c0071b2.f6406w;
            c0071b.f6407x = c0071b2.f6407x;
            c0071b.f6408y = c0071b2.f6408y;
            c0071b.f6409z = c0071b2.f6409z;
            c0071b.f6352A = c0071b2.f6352A;
            c0071b.f6353B = c0071b2.f6353B;
            c0071b.f6354C = c0071b2.f6354C;
            c0071b.f6355D = c0071b2.f6355D;
            c0071b.f6356E = c0071b2.f6356E;
            c0071b.f6357F = c0071b2.f6357F;
            c0071b.f6358G = c0071b2.f6358G;
            c0071b.f6359H = c0071b2.f6359H;
            c0071b.f6360I = c0071b2.f6360I;
            c0071b.f6361J = c0071b2.f6361J;
            c0071b.f6362K = c0071b2.f6362K;
            c0071b.f6363L = c0071b2.f6363L;
            c0071b.f6364M = c0071b2.f6364M;
            c0071b.f6365N = c0071b2.f6365N;
            c0071b.f6366O = c0071b2.f6366O;
            c0071b.f6367P = c0071b2.f6367P;
            c0071b.f6368Q = c0071b2.f6368Q;
            c0071b.R = c0071b2.R;
            c0071b.S = c0071b2.S;
            c0071b.T = c0071b2.T;
            c0071b.U = c0071b2.U;
            c0071b.V = c0071b2.V;
            c0071b.W = c0071b2.W;
            c0071b.X = c0071b2.X;
            c0071b.Y = c0071b2.Y;
            c0071b.f6369Z = c0071b2.f6369Z;
            c0071b.f6371a0 = c0071b2.f6371a0;
            c0071b.f6373b0 = c0071b2.f6373b0;
            c0071b.f6375c0 = c0071b2.f6375c0;
            c0071b.f6377d0 = c0071b2.f6377d0;
            c0071b.f6379e0 = c0071b2.f6379e0;
            c0071b.f6381f0 = c0071b2.f6381f0;
            c0071b.f6383g0 = c0071b2.f6383g0;
            c0071b.f6385h0 = c0071b2.f6385h0;
            c0071b.f6390k0 = c0071b2.f6390k0;
            int[] iArr = c0071b2.f6386i0;
            if (iArr == null || c0071b2.f6388j0 != null) {
                c0071b.f6386i0 = null;
            } else {
                c0071b.f6386i0 = Arrays.copyOf(iArr, iArr.length);
            }
            c0071b.f6388j0 = c0071b2.f6388j0;
            c0071b.f6392l0 = c0071b2.f6392l0;
            c0071b.f6394m0 = c0071b2.f6394m0;
            c0071b.f6396n0 = c0071b2.f6396n0;
            c0071b.f6398o0 = c0071b2.f6398o0;
            c cVar = aVar.f6336c;
            cVar.getClass();
            c cVar2 = this.f6336c;
            cVar2.getClass();
            cVar.f6411a = cVar2.f6411a;
            cVar.f6413c = cVar2.f6413c;
            cVar.f6415e = cVar2.f6415e;
            cVar.f6414d = cVar2.f6414d;
            d dVar = aVar.f6335b;
            dVar.getClass();
            d dVar2 = this.f6335b;
            dVar2.getClass();
            dVar.f6419a = dVar2.f6419a;
            dVar.f6421c = dVar2.f6421c;
            dVar.f6422d = dVar2.f6422d;
            dVar.f6420b = dVar2.f6420b;
            e eVar = aVar.f6338e;
            eVar.getClass();
            e eVar2 = this.f6338e;
            eVar2.getClass();
            eVar.f6424a = eVar2.f6424a;
            eVar.f6425b = eVar2.f6425b;
            eVar.f6426c = eVar2.f6426c;
            eVar.f6427d = eVar2.f6427d;
            eVar.f6428e = eVar2.f6428e;
            eVar.f6429f = eVar2.f6429f;
            eVar.f6430g = eVar2.f6430g;
            eVar.f6431h = eVar2.f6431h;
            eVar.i = eVar2.i;
            eVar.f6432j = eVar2.f6432j;
            eVar.f6433k = eVar2.f6433k;
            eVar.f6434l = eVar2.f6434l;
            eVar.f6435m = eVar2.f6435m;
            aVar.f6334a = this.f6334a;
            return aVar;
        }
    }

    /* compiled from: ConstraintSet.java */
    /* renamed from: androidx.constraintlayout.widget.b$b, reason: collision with other inner class name */
    public static class C0071b {

        /* renamed from: p0, reason: collision with root package name */
        public static final SparseIntArray f6351p0;

        /* renamed from: b, reason: collision with root package name */
        public int f6372b;

        /* renamed from: c, reason: collision with root package name */
        public int f6374c;

        /* renamed from: i0, reason: collision with root package name */
        public int[] f6386i0;

        /* renamed from: j0, reason: collision with root package name */
        public String f6388j0;

        /* renamed from: k0, reason: collision with root package name */
        public String f6390k0;

        /* renamed from: a, reason: collision with root package name */
        public boolean f6370a = false;

        /* renamed from: d, reason: collision with root package name */
        public int f6376d = -1;

        /* renamed from: e, reason: collision with root package name */
        public int f6378e = -1;

        /* renamed from: f, reason: collision with root package name */
        public float f6380f = -1.0f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f6382g = true;

        /* renamed from: h, reason: collision with root package name */
        public int f6384h = -1;
        public int i = -1;

        /* renamed from: j, reason: collision with root package name */
        public int f6387j = -1;

        /* renamed from: k, reason: collision with root package name */
        public int f6389k = -1;

        /* renamed from: l, reason: collision with root package name */
        public int f6391l = -1;

        /* renamed from: m, reason: collision with root package name */
        public int f6393m = -1;

        /* renamed from: n, reason: collision with root package name */
        public int f6395n = -1;

        /* renamed from: o, reason: collision with root package name */
        public int f6397o = -1;

        /* renamed from: p, reason: collision with root package name */
        public int f6399p = -1;

        /* renamed from: q, reason: collision with root package name */
        public int f6400q = -1;

        /* renamed from: r, reason: collision with root package name */
        public int f6401r = -1;

        /* renamed from: s, reason: collision with root package name */
        public int f6402s = -1;

        /* renamed from: t, reason: collision with root package name */
        public int f6403t = -1;

        /* renamed from: u, reason: collision with root package name */
        public int f6404u = -1;

        /* renamed from: v, reason: collision with root package name */
        public int f6405v = -1;

        /* renamed from: w, reason: collision with root package name */
        public float f6406w = 0.5f;

        /* renamed from: x, reason: collision with root package name */
        public float f6407x = 0.5f;

        /* renamed from: y, reason: collision with root package name */
        public String f6408y = null;

        /* renamed from: z, reason: collision with root package name */
        public int f6409z = -1;

        /* renamed from: A, reason: collision with root package name */
        public int f6352A = 0;

        /* renamed from: B, reason: collision with root package name */
        public float f6353B = 0.0f;

        /* renamed from: C, reason: collision with root package name */
        public int f6354C = -1;

        /* renamed from: D, reason: collision with root package name */
        public int f6355D = -1;

        /* renamed from: E, reason: collision with root package name */
        public int f6356E = -1;

        /* renamed from: F, reason: collision with root package name */
        public int f6357F = 0;

        /* renamed from: G, reason: collision with root package name */
        public int f6358G = 0;

        /* renamed from: H, reason: collision with root package name */
        public int f6359H = 0;

        /* renamed from: I, reason: collision with root package name */
        public int f6360I = 0;

        /* renamed from: J, reason: collision with root package name */
        public int f6361J = 0;

        /* renamed from: K, reason: collision with root package name */
        public int f6362K = 0;

        /* renamed from: L, reason: collision with root package name */
        public int f6363L = 0;

        /* renamed from: M, reason: collision with root package name */
        public int f6364M = Integer.MIN_VALUE;

        /* renamed from: N, reason: collision with root package name */
        public int f6365N = Integer.MIN_VALUE;

        /* renamed from: O, reason: collision with root package name */
        public int f6366O = Integer.MIN_VALUE;

        /* renamed from: P, reason: collision with root package name */
        public int f6367P = Integer.MIN_VALUE;

        /* renamed from: Q, reason: collision with root package name */
        public int f6368Q = Integer.MIN_VALUE;
        public int R = Integer.MIN_VALUE;
        public int S = Integer.MIN_VALUE;
        public float T = -1.0f;
        public float U = -1.0f;
        public int V = 0;
        public int W = 0;
        public int X = 0;
        public int Y = 0;

        /* renamed from: Z, reason: collision with root package name */
        public int f6369Z = 0;

        /* renamed from: a0, reason: collision with root package name */
        public int f6371a0 = 0;

        /* renamed from: b0, reason: collision with root package name */
        public int f6373b0 = 0;

        /* renamed from: c0, reason: collision with root package name */
        public int f6375c0 = 0;

        /* renamed from: d0, reason: collision with root package name */
        public float f6377d0 = 1.0f;

        /* renamed from: e0, reason: collision with root package name */
        public float f6379e0 = 1.0f;

        /* renamed from: f0, reason: collision with root package name */
        public int f6381f0 = -1;

        /* renamed from: g0, reason: collision with root package name */
        public int f6383g0 = 0;

        /* renamed from: h0, reason: collision with root package name */
        public int f6385h0 = -1;

        /* renamed from: l0, reason: collision with root package name */
        public boolean f6392l0 = false;

        /* renamed from: m0, reason: collision with root package name */
        public boolean f6394m0 = false;

        /* renamed from: n0, reason: collision with root package name */
        public boolean f6396n0 = true;

        /* renamed from: o0, reason: collision with root package name */
        public int f6398o0 = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f6351p0 = sparseIntArray;
            sparseIntArray.append(43, 24);
            sparseIntArray.append(44, 25);
            sparseIntArray.append(46, 28);
            sparseIntArray.append(47, 29);
            sparseIntArray.append(52, 35);
            sparseIntArray.append(51, 34);
            sparseIntArray.append(24, 4);
            sparseIntArray.append(23, 3);
            sparseIntArray.append(19, 1);
            sparseIntArray.append(61, 6);
            sparseIntArray.append(62, 7);
            sparseIntArray.append(31, 17);
            sparseIntArray.append(32, 18);
            sparseIntArray.append(33, 19);
            sparseIntArray.append(15, 90);
            sparseIntArray.append(0, 26);
            sparseIntArray.append(48, 31);
            sparseIntArray.append(49, 32);
            sparseIntArray.append(30, 10);
            sparseIntArray.append(29, 9);
            sparseIntArray.append(66, 13);
            sparseIntArray.append(69, 16);
            sparseIntArray.append(67, 14);
            sparseIntArray.append(64, 11);
            sparseIntArray.append(68, 15);
            sparseIntArray.append(65, 12);
            sparseIntArray.append(55, 38);
            sparseIntArray.append(41, 37);
            sparseIntArray.append(40, 39);
            sparseIntArray.append(54, 40);
            sparseIntArray.append(39, 20);
            sparseIntArray.append(53, 36);
            sparseIntArray.append(28, 5);
            sparseIntArray.append(42, 91);
            sparseIntArray.append(50, 91);
            sparseIntArray.append(45, 91);
            sparseIntArray.append(22, 91);
            sparseIntArray.append(18, 91);
            sparseIntArray.append(3, 23);
            sparseIntArray.append(5, 27);
            sparseIntArray.append(7, 30);
            sparseIntArray.append(8, 8);
            sparseIntArray.append(4, 33);
            sparseIntArray.append(6, 2);
            sparseIntArray.append(1, 22);
            sparseIntArray.append(2, 21);
            sparseIntArray.append(56, 41);
            sparseIntArray.append(34, 42);
            sparseIntArray.append(17, 87);
            sparseIntArray.append(16, 88);
            sparseIntArray.append(71, 76);
            sparseIntArray.append(25, 61);
            sparseIntArray.append(27, 62);
            sparseIntArray.append(26, 63);
            sparseIntArray.append(60, 69);
            sparseIntArray.append(38, 70);
            sparseIntArray.append(12, 71);
            sparseIntArray.append(10, 72);
            sparseIntArray.append(11, 73);
            sparseIntArray.append(13, 74);
            sparseIntArray.append(9, 75);
            sparseIntArray.append(58, 84);
            sparseIntArray.append(59, 86);
            sparseIntArray.append(58, 83);
            sparseIntArray.append(37, 85);
            sparseIntArray.append(56, 87);
            sparseIntArray.append(34, 88);
            sparseIntArray.append(91, 89);
            sparseIntArray.append(15, 90);
        }

        public final void a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0736d.f20595f);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                SparseIntArray sparseIntArray = f6351p0;
                int i9 = sparseIntArray.get(index);
                switch (i9) {
                    case 1:
                        this.f6399p = b.g(obtainStyledAttributes, index, this.f6399p);
                        break;
                    case 2:
                        this.f6360I = obtainStyledAttributes.getDimensionPixelSize(index, this.f6360I);
                        break;
                    case 3:
                        this.f6397o = b.g(obtainStyledAttributes, index, this.f6397o);
                        break;
                    case 4:
                        this.f6395n = b.g(obtainStyledAttributes, index, this.f6395n);
                        break;
                    case 5:
                        this.f6408y = obtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.f6354C = obtainStyledAttributes.getDimensionPixelOffset(index, this.f6354C);
                        break;
                    case 7:
                        this.f6355D = obtainStyledAttributes.getDimensionPixelOffset(index, this.f6355D);
                        break;
                    case 8:
                        this.f6361J = obtainStyledAttributes.getDimensionPixelSize(index, this.f6361J);
                        break;
                    case 9:
                        this.f6405v = b.g(obtainStyledAttributes, index, this.f6405v);
                        break;
                    case 10:
                        this.f6404u = b.g(obtainStyledAttributes, index, this.f6404u);
                        break;
                    case 11:
                        this.f6367P = obtainStyledAttributes.getDimensionPixelSize(index, this.f6367P);
                        break;
                    case 12:
                        this.f6368Q = obtainStyledAttributes.getDimensionPixelSize(index, this.f6368Q);
                        break;
                    case 13:
                        this.f6364M = obtainStyledAttributes.getDimensionPixelSize(index, this.f6364M);
                        break;
                    case 14:
                        this.f6366O = obtainStyledAttributes.getDimensionPixelSize(index, this.f6366O);
                        break;
                    case 15:
                        this.R = obtainStyledAttributes.getDimensionPixelSize(index, this.R);
                        break;
                    case 16:
                        this.f6365N = obtainStyledAttributes.getDimensionPixelSize(index, this.f6365N);
                        break;
                    case 17:
                        this.f6376d = obtainStyledAttributes.getDimensionPixelOffset(index, this.f6376d);
                        break;
                    case 18:
                        this.f6378e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f6378e);
                        break;
                    case 19:
                        this.f6380f = obtainStyledAttributes.getFloat(index, this.f6380f);
                        break;
                    case 20:
                        this.f6406w = obtainStyledAttributes.getFloat(index, this.f6406w);
                        break;
                    case 21:
                        this.f6374c = obtainStyledAttributes.getLayoutDimension(index, this.f6374c);
                        break;
                    case 22:
                        this.f6372b = obtainStyledAttributes.getLayoutDimension(index, this.f6372b);
                        break;
                    case 23:
                        this.f6357F = obtainStyledAttributes.getDimensionPixelSize(index, this.f6357F);
                        break;
                    case 24:
                        this.f6384h = b.g(obtainStyledAttributes, index, this.f6384h);
                        break;
                    case 25:
                        this.i = b.g(obtainStyledAttributes, index, this.i);
                        break;
                    case 26:
                        this.f6356E = obtainStyledAttributes.getInt(index, this.f6356E);
                        break;
                    case 27:
                        this.f6358G = obtainStyledAttributes.getDimensionPixelSize(index, this.f6358G);
                        break;
                    case 28:
                        this.f6387j = b.g(obtainStyledAttributes, index, this.f6387j);
                        break;
                    case 29:
                        this.f6389k = b.g(obtainStyledAttributes, index, this.f6389k);
                        break;
                    case 30:
                        this.f6362K = obtainStyledAttributes.getDimensionPixelSize(index, this.f6362K);
                        break;
                    case 31:
                        this.f6402s = b.g(obtainStyledAttributes, index, this.f6402s);
                        break;
                    case 32:
                        this.f6403t = b.g(obtainStyledAttributes, index, this.f6403t);
                        break;
                    case 33:
                        this.f6359H = obtainStyledAttributes.getDimensionPixelSize(index, this.f6359H);
                        break;
                    case 34:
                        this.f6393m = b.g(obtainStyledAttributes, index, this.f6393m);
                        break;
                    case 35:
                        this.f6391l = b.g(obtainStyledAttributes, index, this.f6391l);
                        break;
                    case 36:
                        this.f6407x = obtainStyledAttributes.getFloat(index, this.f6407x);
                        break;
                    case 37:
                        this.U = obtainStyledAttributes.getFloat(index, this.U);
                        break;
                    case 38:
                        this.T = obtainStyledAttributes.getFloat(index, this.T);
                        break;
                    case 39:
                        this.V = obtainStyledAttributes.getInt(index, this.V);
                        break;
                    case 40:
                        this.W = obtainStyledAttributes.getInt(index, this.W);
                        break;
                    case 41:
                        b.h(this, obtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        b.h(this, obtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i9) {
                            case 61:
                                this.f6409z = b.g(obtainStyledAttributes, index, this.f6409z);
                                break;
                            case 62:
                                this.f6352A = obtainStyledAttributes.getDimensionPixelSize(index, this.f6352A);
                                break;
                            case 63:
                                this.f6353B = obtainStyledAttributes.getFloat(index, this.f6353B);
                                break;
                            default:
                                switch (i9) {
                                    case 69:
                                        this.f6377d0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 70:
                                        this.f6379e0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 71:
                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        break;
                                    case 72:
                                        this.f6381f0 = obtainStyledAttributes.getInt(index, this.f6381f0);
                                        break;
                                    case 73:
                                        this.f6383g0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f6383g0);
                                        break;
                                    case 74:
                                        this.f6388j0 = obtainStyledAttributes.getString(index);
                                        break;
                                    case 75:
                                        this.f6396n0 = obtainStyledAttributes.getBoolean(index, this.f6396n0);
                                        break;
                                    case 76:
                                        this.f6398o0 = obtainStyledAttributes.getInt(index, this.f6398o0);
                                        break;
                                    case 77:
                                        this.f6400q = b.g(obtainStyledAttributes, index, this.f6400q);
                                        break;
                                    case 78:
                                        this.f6401r = b.g(obtainStyledAttributes, index, this.f6401r);
                                        break;
                                    case 79:
                                        this.S = obtainStyledAttributes.getDimensionPixelSize(index, this.S);
                                        break;
                                    case 80:
                                        this.f6363L = obtainStyledAttributes.getDimensionPixelSize(index, this.f6363L);
                                        break;
                                    case 81:
                                        this.X = obtainStyledAttributes.getInt(index, this.X);
                                        break;
                                    case 82:
                                        this.Y = obtainStyledAttributes.getInt(index, this.Y);
                                        break;
                                    case 83:
                                        this.f6371a0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f6371a0);
                                        break;
                                    case 84:
                                        this.f6369Z = obtainStyledAttributes.getDimensionPixelSize(index, this.f6369Z);
                                        break;
                                    case 85:
                                        this.f6375c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f6375c0);
                                        break;
                                    case 86:
                                        this.f6373b0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f6373b0);
                                        break;
                                    case 87:
                                        this.f6392l0 = obtainStyledAttributes.getBoolean(index, this.f6392l0);
                                        break;
                                    case 88:
                                        this.f6394m0 = obtainStyledAttributes.getBoolean(index, this.f6394m0);
                                        break;
                                    case 89:
                                        this.f6390k0 = obtainStyledAttributes.getString(index);
                                        break;
                                    case 90:
                                        this.f6382g = obtainStyledAttributes.getBoolean(index, this.f6382g);
                                        break;
                                    case 91:
                                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                        break;
                                    default:
                                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                        break;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet.java */
    public static class c {

        /* renamed from: j, reason: collision with root package name */
        public static final SparseIntArray f6410j;

        /* renamed from: a, reason: collision with root package name */
        public int f6411a;

        /* renamed from: b, reason: collision with root package name */
        public int f6412b;

        /* renamed from: c, reason: collision with root package name */
        public int f6413c;

        /* renamed from: d, reason: collision with root package name */
        public float f6414d;

        /* renamed from: e, reason: collision with root package name */
        public float f6415e;

        /* renamed from: f, reason: collision with root package name */
        public float f6416f;

        /* renamed from: g, reason: collision with root package name */
        public int f6417g;

        /* renamed from: h, reason: collision with root package name */
        public String f6418h;
        public int i;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f6410j = sparseIntArray;
            sparseIntArray.append(3, 1);
            sparseIntArray.append(5, 2);
            sparseIntArray.append(9, 3);
            sparseIntArray.append(2, 4);
            sparseIntArray.append(1, 5);
            sparseIntArray.append(0, 6);
            sparseIntArray.append(4, 7);
            sparseIntArray.append(8, 8);
            sparseIntArray.append(7, 9);
            sparseIntArray.append(6, 10);
        }

        public final void a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0736d.f20596g);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (f6410j.get(index)) {
                    case 1:
                        this.f6415e = obtainStyledAttributes.getFloat(index, this.f6415e);
                        break;
                    case 2:
                        this.f6413c = obtainStyledAttributes.getInt(index, this.f6413c);
                        break;
                    case 3:
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            String str = C0580a.f8275b[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f6411a = b.g(obtainStyledAttributes, index, this.f6411a);
                        break;
                    case 6:
                        this.f6412b = obtainStyledAttributes.getInteger(index, this.f6412b);
                        break;
                    case 7:
                        this.f6414d = obtainStyledAttributes.getFloat(index, this.f6414d);
                        break;
                    case 8:
                        this.f6417g = obtainStyledAttributes.getInteger(index, this.f6417g);
                        break;
                    case 9:
                        this.f6416f = obtainStyledAttributes.getFloat(index, this.f6416f);
                        break;
                    case 10:
                        int i9 = obtainStyledAttributes.peekValue(index).type;
                        if (i9 == 1) {
                            this.i = obtainStyledAttributes.getResourceId(index, -1);
                            break;
                        } else if (i9 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            this.f6418h = string;
                            if (string.indexOf("/") > 0) {
                                this.i = obtainStyledAttributes.getResourceId(index, -1);
                                break;
                            } else {
                                break;
                            }
                        } else {
                            obtainStyledAttributes.getInteger(index, this.i);
                            break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet.java */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public int f6419a;

        /* renamed from: b, reason: collision with root package name */
        public int f6420b;

        /* renamed from: c, reason: collision with root package name */
        public float f6421c;

        /* renamed from: d, reason: collision with root package name */
        public float f6422d;

        public final void a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0736d.i);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 1) {
                    this.f6421c = obtainStyledAttributes.getFloat(index, this.f6421c);
                } else if (index == 0) {
                    int i9 = obtainStyledAttributes.getInt(index, this.f6419a);
                    this.f6419a = i9;
                    this.f6419a = b.f6328d[i9];
                } else if (index == 4) {
                    this.f6420b = obtainStyledAttributes.getInt(index, this.f6420b);
                } else if (index == 3) {
                    this.f6422d = obtainStyledAttributes.getFloat(index, this.f6422d);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet.java */
    public static class e {

        /* renamed from: n, reason: collision with root package name */
        public static final SparseIntArray f6423n;

        /* renamed from: a, reason: collision with root package name */
        public float f6424a;

        /* renamed from: b, reason: collision with root package name */
        public float f6425b;

        /* renamed from: c, reason: collision with root package name */
        public float f6426c;

        /* renamed from: d, reason: collision with root package name */
        public float f6427d;

        /* renamed from: e, reason: collision with root package name */
        public float f6428e;

        /* renamed from: f, reason: collision with root package name */
        public float f6429f;

        /* renamed from: g, reason: collision with root package name */
        public float f6430g;

        /* renamed from: h, reason: collision with root package name */
        public int f6431h;
        public float i;

        /* renamed from: j, reason: collision with root package name */
        public float f6432j;

        /* renamed from: k, reason: collision with root package name */
        public float f6433k;

        /* renamed from: l, reason: collision with root package name */
        public boolean f6434l;

        /* renamed from: m, reason: collision with root package name */
        public float f6435m;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f6423n = sparseIntArray;
            sparseIntArray.append(6, 1);
            sparseIntArray.append(7, 2);
            sparseIntArray.append(8, 3);
            sparseIntArray.append(4, 4);
            sparseIntArray.append(5, 5);
            sparseIntArray.append(0, 6);
            sparseIntArray.append(1, 7);
            sparseIntArray.append(2, 8);
            sparseIntArray.append(3, 9);
            sparseIntArray.append(9, 10);
            sparseIntArray.append(10, 11);
            sparseIntArray.append(11, 12);
        }

        public final void a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0736d.f20599k);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (f6423n.get(index)) {
                    case 1:
                        this.f6424a = obtainStyledAttributes.getFloat(index, this.f6424a);
                        break;
                    case 2:
                        this.f6425b = obtainStyledAttributes.getFloat(index, this.f6425b);
                        break;
                    case 3:
                        this.f6426c = obtainStyledAttributes.getFloat(index, this.f6426c);
                        break;
                    case 4:
                        this.f6427d = obtainStyledAttributes.getFloat(index, this.f6427d);
                        break;
                    case 5:
                        this.f6428e = obtainStyledAttributes.getFloat(index, this.f6428e);
                        break;
                    case 6:
                        this.f6429f = obtainStyledAttributes.getDimension(index, this.f6429f);
                        break;
                    case 7:
                        this.f6430g = obtainStyledAttributes.getDimension(index, this.f6430g);
                        break;
                    case 8:
                        this.i = obtainStyledAttributes.getDimension(index, this.i);
                        break;
                    case 9:
                        this.f6432j = obtainStyledAttributes.getDimension(index, this.f6432j);
                        break;
                    case 10:
                        this.f6433k = obtainStyledAttributes.getDimension(index, this.f6433k);
                        break;
                    case 11:
                        this.f6434l = true;
                        this.f6435m = obtainStyledAttributes.getDimension(index, this.f6435m);
                        break;
                    case 12:
                        this.f6431h = b.g(obtainStyledAttributes, index, this.f6431h);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6329e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f6330f = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    public static int[] c(Barrier barrier, String str) {
        int i;
        Object designInformation;
        String[] split = str.split(",");
        Context context = barrier.getContext();
        int[] iArr = new int[split.length];
        int i9 = 0;
        int i10 = 0;
        while (i9 < split.length) {
            String trim = split[i9].trim();
            try {
                i = C0735c.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout) && (designInformation = ((ConstraintLayout) barrier.getParent()).getDesignInformation(0, trim)) != null && (designInformation instanceof Integer)) {
                i = ((Integer) designInformation).intValue();
            }
            iArr[i10] = i;
            i9++;
            i10++;
        }
        return i10 != split.length ? Arrays.copyOf(iArr, i10) : iArr;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:127:0x05d0. Please report as an issue. */
    public static a d(Context context, AttributeSet attributeSet, boolean z10) {
        int i;
        boolean z11;
        int i9;
        String str;
        a aVar = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z10 ? C0736d.f20592c : C0736d.f20590a);
        int[] iArr = f6328d;
        String[] strArr = C0580a.f8275b;
        SparseIntArray sparseIntArray = f6329e;
        d dVar = aVar.f6335b;
        e eVar = aVar.f6338e;
        c cVar = aVar.f6336c;
        C0071b c0071b = aVar.f6337d;
        String str2 = "Unknown attribute 0x";
        if (z10) {
            int indexCount = obtainStyledAttributes.getIndexCount();
            a.C0070a c0070a = new a.C0070a();
            cVar.getClass();
            c0071b.getClass();
            dVar.getClass();
            eVar.getClass();
            int i10 = 0;
            while (i10 < indexCount) {
                int i11 = indexCount;
                int index = obtainStyledAttributes.getIndex(i10);
                int i12 = i10;
                switch (f6330f.get(index)) {
                    case 2:
                        str = str2;
                        c0070a.b(2, obtainStyledAttributes.getDimensionPixelSize(index, c0071b.f6360I));
                        break;
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 25:
                    case 26:
                    case 29:
                    case 30:
                    case 32:
                    case 33:
                    case 35:
                    case 36:
                    case 61:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        StringBuilder sb2 = new StringBuilder(str2);
                        str = str2;
                        sb2.append(Integer.toHexString(index));
                        sb2.append("   ");
                        sb2.append(sparseIntArray.get(index));
                        Log.w("ConstraintSet", sb2.toString());
                        break;
                    case 5:
                        str = str2;
                        c0070a.c(5, obtainStyledAttributes.getString(index));
                        break;
                    case 6:
                        str = str2;
                        c0070a.b(6, obtainStyledAttributes.getDimensionPixelOffset(index, c0071b.f6354C));
                        break;
                    case 7:
                        str = str2;
                        c0070a.b(7, obtainStyledAttributes.getDimensionPixelOffset(index, c0071b.f6355D));
                        break;
                    case 8:
                        str = str2;
                        c0070a.b(8, obtainStyledAttributes.getDimensionPixelSize(index, c0071b.f6361J));
                        break;
                    case 11:
                        str = str2;
                        c0070a.b(11, obtainStyledAttributes.getDimensionPixelSize(index, c0071b.f6367P));
                        break;
                    case 12:
                        str = str2;
                        c0070a.b(12, obtainStyledAttributes.getDimensionPixelSize(index, c0071b.f6368Q));
                        break;
                    case 13:
                        str = str2;
                        c0070a.b(13, obtainStyledAttributes.getDimensionPixelSize(index, c0071b.f6364M));
                        break;
                    case 14:
                        str = str2;
                        c0070a.b(14, obtainStyledAttributes.getDimensionPixelSize(index, c0071b.f6366O));
                        break;
                    case 15:
                        str = str2;
                        c0070a.b(15, obtainStyledAttributes.getDimensionPixelSize(index, c0071b.R));
                        break;
                    case 16:
                        str = str2;
                        c0070a.b(16, obtainStyledAttributes.getDimensionPixelSize(index, c0071b.f6365N));
                        break;
                    case 17:
                        str = str2;
                        c0070a.b(17, obtainStyledAttributes.getDimensionPixelOffset(index, c0071b.f6376d));
                        break;
                    case 18:
                        str = str2;
                        c0070a.b(18, obtainStyledAttributes.getDimensionPixelOffset(index, c0071b.f6378e));
                        break;
                    case 19:
                        str = str2;
                        c0070a.a(19, obtainStyledAttributes.getFloat(index, c0071b.f6380f));
                        break;
                    case 20:
                        str = str2;
                        c0070a.a(20, obtainStyledAttributes.getFloat(index, c0071b.f6406w));
                        break;
                    case 21:
                        str = str2;
                        c0070a.b(21, obtainStyledAttributes.getLayoutDimension(index, c0071b.f6374c));
                        break;
                    case 22:
                        str = str2;
                        c0070a.b(22, iArr[obtainStyledAttributes.getInt(index, dVar.f6419a)]);
                        break;
                    case 23:
                        str = str2;
                        c0070a.b(23, obtainStyledAttributes.getLayoutDimension(index, c0071b.f6372b));
                        break;
                    case 24:
                        str = str2;
                        c0070a.b(24, obtainStyledAttributes.getDimensionPixelSize(index, c0071b.f6357F));
                        break;
                    case 27:
                        str = str2;
                        c0070a.b(27, obtainStyledAttributes.getInt(index, c0071b.f6356E));
                        break;
                    case 28:
                        str = str2;
                        c0070a.b(28, obtainStyledAttributes.getDimensionPixelSize(index, c0071b.f6358G));
                        break;
                    case 31:
                        str = str2;
                        c0070a.b(31, obtainStyledAttributes.getDimensionPixelSize(index, c0071b.f6362K));
                        break;
                    case 34:
                        str = str2;
                        c0070a.b(34, obtainStyledAttributes.getDimensionPixelSize(index, c0071b.f6359H));
                        break;
                    case 37:
                        str = str2;
                        c0070a.a(37, obtainStyledAttributes.getFloat(index, c0071b.f6407x));
                        break;
                    case 38:
                        str = str2;
                        int resourceId = obtainStyledAttributes.getResourceId(index, aVar.f6334a);
                        aVar.f6334a = resourceId;
                        c0070a.b(38, resourceId);
                        break;
                    case 39:
                        str = str2;
                        c0070a.a(39, obtainStyledAttributes.getFloat(index, c0071b.U));
                        break;
                    case 40:
                        str = str2;
                        c0070a.a(40, obtainStyledAttributes.getFloat(index, c0071b.T));
                        break;
                    case 41:
                        str = str2;
                        c0070a.b(41, obtainStyledAttributes.getInt(index, c0071b.V));
                        break;
                    case 42:
                        str = str2;
                        c0070a.b(42, obtainStyledAttributes.getInt(index, c0071b.W));
                        break;
                    case 43:
                        str = str2;
                        c0070a.a(43, obtainStyledAttributes.getFloat(index, dVar.f6421c));
                        break;
                    case 44:
                        str = str2;
                        c0070a.d(44, true);
                        c0070a.a(44, obtainStyledAttributes.getDimension(index, eVar.f6435m));
                        break;
                    case 45:
                        str = str2;
                        c0070a.a(45, obtainStyledAttributes.getFloat(index, eVar.f6425b));
                        break;
                    case 46:
                        str = str2;
                        c0070a.a(46, obtainStyledAttributes.getFloat(index, eVar.f6426c));
                        break;
                    case 47:
                        str = str2;
                        c0070a.a(47, obtainStyledAttributes.getFloat(index, eVar.f6427d));
                        break;
                    case 48:
                        str = str2;
                        c0070a.a(48, obtainStyledAttributes.getFloat(index, eVar.f6428e));
                        break;
                    case 49:
                        str = str2;
                        c0070a.a(49, obtainStyledAttributes.getDimension(index, eVar.f6429f));
                        break;
                    case 50:
                        str = str2;
                        c0070a.a(50, obtainStyledAttributes.getDimension(index, eVar.f6430g));
                        break;
                    case 51:
                        str = str2;
                        c0070a.a(51, obtainStyledAttributes.getDimension(index, eVar.i));
                        break;
                    case 52:
                        str = str2;
                        c0070a.a(52, obtainStyledAttributes.getDimension(index, eVar.f6432j));
                        break;
                    case 53:
                        str = str2;
                        c0070a.a(53, obtainStyledAttributes.getDimension(index, eVar.f6433k));
                        break;
                    case 54:
                        str = str2;
                        c0070a.b(54, obtainStyledAttributes.getInt(index, c0071b.X));
                        break;
                    case 55:
                        str = str2;
                        c0070a.b(55, obtainStyledAttributes.getInt(index, c0071b.Y));
                        break;
                    case 56:
                        str = str2;
                        c0070a.b(56, obtainStyledAttributes.getDimensionPixelSize(index, c0071b.f6369Z));
                        break;
                    case 57:
                        str = str2;
                        c0070a.b(57, obtainStyledAttributes.getDimensionPixelSize(index, c0071b.f6371a0));
                        break;
                    case 58:
                        str = str2;
                        c0070a.b(58, obtainStyledAttributes.getDimensionPixelSize(index, c0071b.f6373b0));
                        break;
                    case 59:
                        str = str2;
                        c0070a.b(59, obtainStyledAttributes.getDimensionPixelSize(index, c0071b.f6375c0));
                        break;
                    case 60:
                        str = str2;
                        c0070a.a(60, obtainStyledAttributes.getFloat(index, eVar.f6424a));
                        break;
                    case 62:
                        str = str2;
                        c0070a.b(62, obtainStyledAttributes.getDimensionPixelSize(index, c0071b.f6352A));
                        break;
                    case 63:
                        str = str2;
                        c0070a.a(63, obtainStyledAttributes.getFloat(index, c0071b.f6353B));
                        break;
                    case 64:
                        str = str2;
                        c0070a.b(64, g(obtainStyledAttributes, index, cVar.f6411a));
                        break;
                    case 65:
                        str = str2;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            c0070a.c(65, obtainStyledAttributes.getString(index));
                            break;
                        } else {
                            c0070a.c(65, strArr[obtainStyledAttributes.getInteger(index, 0)]);
                            break;
                        }
                    case 66:
                        str = str2;
                        c0070a.b(66, obtainStyledAttributes.getInt(index, 0));
                        break;
                    case 67:
                        str = str2;
                        c0070a.a(67, obtainStyledAttributes.getFloat(index, cVar.f6415e));
                        break;
                    case 68:
                        str = str2;
                        c0070a.a(68, obtainStyledAttributes.getFloat(index, dVar.f6422d));
                        break;
                    case 69:
                        str = str2;
                        c0070a.a(69, obtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 70:
                        str = str2;
                        c0070a.a(70, obtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 71:
                        str = str2;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        str = str2;
                        c0070a.b(72, obtainStyledAttributes.getInt(index, c0071b.f6381f0));
                        break;
                    case 73:
                        str = str2;
                        c0070a.b(73, obtainStyledAttributes.getDimensionPixelSize(index, c0071b.f6383g0));
                        break;
                    case 74:
                        str = str2;
                        c0070a.c(74, obtainStyledAttributes.getString(index));
                        break;
                    case 75:
                        str = str2;
                        c0070a.d(75, obtainStyledAttributes.getBoolean(index, c0071b.f6396n0));
                        break;
                    case 76:
                        str = str2;
                        c0070a.b(76, obtainStyledAttributes.getInt(index, cVar.f6413c));
                        break;
                    case 77:
                        str = str2;
                        c0070a.c(77, obtainStyledAttributes.getString(index));
                        break;
                    case 78:
                        str = str2;
                        c0070a.b(78, obtainStyledAttributes.getInt(index, dVar.f6420b));
                        break;
                    case 79:
                        str = str2;
                        c0070a.a(79, obtainStyledAttributes.getFloat(index, cVar.f6414d));
                        break;
                    case 80:
                        str = str2;
                        c0070a.d(80, obtainStyledAttributes.getBoolean(index, c0071b.f6392l0));
                        break;
                    case 81:
                        str = str2;
                        c0070a.d(81, obtainStyledAttributes.getBoolean(index, c0071b.f6394m0));
                        break;
                    case 82:
                        str = str2;
                        c0070a.b(82, obtainStyledAttributes.getInteger(index, cVar.f6412b));
                        break;
                    case 83:
                        str = str2;
                        c0070a.b(83, g(obtainStyledAttributes, index, eVar.f6431h));
                        break;
                    case 84:
                        str = str2;
                        c0070a.b(84, obtainStyledAttributes.getInteger(index, cVar.f6417g));
                        break;
                    case 85:
                        str = str2;
                        c0070a.a(85, obtainStyledAttributes.getFloat(index, cVar.f6416f));
                        break;
                    case 86:
                        str = str2;
                        int i13 = obtainStyledAttributes.peekValue(index).type;
                        if (i13 == 1) {
                            int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                            cVar.i = resourceId2;
                            c0070a.b(89, resourceId2);
                            if (cVar.i != -1) {
                                c0070a.b(88, -2);
                                break;
                            }
                        } else if (i13 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            cVar.f6418h = string;
                            c0070a.c(90, string);
                            if (cVar.f6418h.indexOf("/") > 0) {
                                int resourceId3 = obtainStyledAttributes.getResourceId(index, -1);
                                cVar.i = resourceId3;
                                c0070a.b(89, resourceId3);
                                c0070a.b(88, -2);
                                break;
                            } else {
                                c0070a.b(88, -1);
                                break;
                            }
                        } else {
                            c0070a.b(88, obtainStyledAttributes.getInteger(index, cVar.i));
                            break;
                        }
                        break;
                    case 87:
                        str = str2;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        break;
                    case 93:
                        str = str2;
                        c0070a.b(93, obtainStyledAttributes.getDimensionPixelSize(index, c0071b.f6363L));
                        break;
                    case 94:
                        str = str2;
                        c0070a.b(94, obtainStyledAttributes.getDimensionPixelSize(index, c0071b.S));
                        break;
                    case 95:
                        str = str2;
                        h(c0070a, obtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        str = str2;
                        h(c0070a, obtainStyledAttributes, index, 1);
                        continue;
                    case 97:
                        str = str2;
                        c0070a.b(97, obtainStyledAttributes.getInt(index, c0071b.f6398o0));
                        break;
                    case 98:
                        str = str2;
                        int i14 = MotionLayout.f6202u;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            aVar.f6334a = obtainStyledAttributes.getResourceId(index, aVar.f6334a);
                            break;
                        }
                    case 99:
                        str = str2;
                        c0070a.d(99, obtainStyledAttributes.getBoolean(index, c0071b.f6382g));
                        break;
                }
                i10 = i12 + 1;
                str2 = str;
                indexCount = i11;
            }
        } else {
            int i15 = 1;
            int i16 = 0;
            for (int indexCount2 = obtainStyledAttributes.getIndexCount(); i16 < indexCount2; indexCount2 = i) {
                int index2 = obtainStyledAttributes.getIndex(i16);
                if (index2 != i15 && 23 != index2) {
                    if (24 != index2) {
                        cVar.getClass();
                        c0071b.getClass();
                        dVar.getClass();
                        eVar.getClass();
                    }
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        i = indexCount2;
                        c0071b.f6399p = g(obtainStyledAttributes, index2, c0071b.f6399p);
                        i9 = 1;
                        break;
                    case 2:
                        i = indexCount2;
                        c0071b.f6360I = obtainStyledAttributes.getDimensionPixelSize(index2, c0071b.f6360I);
                        i9 = 1;
                        break;
                    case 3:
                        i = indexCount2;
                        c0071b.f6397o = g(obtainStyledAttributes, index2, c0071b.f6397o);
                        i9 = 1;
                        break;
                    case 4:
                        i = indexCount2;
                        c0071b.f6395n = g(obtainStyledAttributes, index2, c0071b.f6395n);
                        i9 = 1;
                        break;
                    case 5:
                        i = indexCount2;
                        c0071b.f6408y = obtainStyledAttributes.getString(index2);
                        i9 = 1;
                        break;
                    case 6:
                        i = indexCount2;
                        c0071b.f6354C = obtainStyledAttributes.getDimensionPixelOffset(index2, c0071b.f6354C);
                        i9 = 1;
                        break;
                    case 7:
                        i = indexCount2;
                        c0071b.f6355D = obtainStyledAttributes.getDimensionPixelOffset(index2, c0071b.f6355D);
                        i9 = 1;
                        break;
                    case 8:
                        i = indexCount2;
                        c0071b.f6361J = obtainStyledAttributes.getDimensionPixelSize(index2, c0071b.f6361J);
                        i9 = 1;
                        break;
                    case 9:
                        i = indexCount2;
                        c0071b.f6405v = g(obtainStyledAttributes, index2, c0071b.f6405v);
                        i9 = 1;
                        break;
                    case 10:
                        i = indexCount2;
                        c0071b.f6404u = g(obtainStyledAttributes, index2, c0071b.f6404u);
                        i9 = 1;
                        break;
                    case 11:
                        i = indexCount2;
                        c0071b.f6367P = obtainStyledAttributes.getDimensionPixelSize(index2, c0071b.f6367P);
                        i9 = 1;
                        break;
                    case 12:
                        i = indexCount2;
                        c0071b.f6368Q = obtainStyledAttributes.getDimensionPixelSize(index2, c0071b.f6368Q);
                        i9 = 1;
                        break;
                    case 13:
                        i = indexCount2;
                        c0071b.f6364M = obtainStyledAttributes.getDimensionPixelSize(index2, c0071b.f6364M);
                        i9 = 1;
                        break;
                    case 14:
                        i = indexCount2;
                        c0071b.f6366O = obtainStyledAttributes.getDimensionPixelSize(index2, c0071b.f6366O);
                        i9 = 1;
                        break;
                    case 15:
                        i = indexCount2;
                        c0071b.R = obtainStyledAttributes.getDimensionPixelSize(index2, c0071b.R);
                        i9 = 1;
                        break;
                    case 16:
                        i = indexCount2;
                        c0071b.f6365N = obtainStyledAttributes.getDimensionPixelSize(index2, c0071b.f6365N);
                        i9 = 1;
                        break;
                    case 17:
                        i = indexCount2;
                        c0071b.f6376d = obtainStyledAttributes.getDimensionPixelOffset(index2, c0071b.f6376d);
                        i9 = 1;
                        break;
                    case 18:
                        i = indexCount2;
                        c0071b.f6378e = obtainStyledAttributes.getDimensionPixelOffset(index2, c0071b.f6378e);
                        i9 = 1;
                        break;
                    case 19:
                        i = indexCount2;
                        c0071b.f6380f = obtainStyledAttributes.getFloat(index2, c0071b.f6380f);
                        i9 = 1;
                        break;
                    case 20:
                        i = indexCount2;
                        c0071b.f6406w = obtainStyledAttributes.getFloat(index2, c0071b.f6406w);
                        i9 = 1;
                        break;
                    case 21:
                        i = indexCount2;
                        c0071b.f6374c = obtainStyledAttributes.getLayoutDimension(index2, c0071b.f6374c);
                        i9 = 1;
                        break;
                    case 22:
                        i = indexCount2;
                        dVar.f6419a = iArr[obtainStyledAttributes.getInt(index2, dVar.f6419a)];
                        i9 = 1;
                        break;
                    case 23:
                        i = indexCount2;
                        c0071b.f6372b = obtainStyledAttributes.getLayoutDimension(index2, c0071b.f6372b);
                        i9 = 1;
                        break;
                    case 24:
                        i = indexCount2;
                        c0071b.f6357F = obtainStyledAttributes.getDimensionPixelSize(index2, c0071b.f6357F);
                        i9 = 1;
                        break;
                    case 25:
                        i = indexCount2;
                        c0071b.f6384h = g(obtainStyledAttributes, index2, c0071b.f6384h);
                        i9 = 1;
                        break;
                    case 26:
                        i = indexCount2;
                        c0071b.i = g(obtainStyledAttributes, index2, c0071b.i);
                        i9 = 1;
                        break;
                    case 27:
                        i = indexCount2;
                        c0071b.f6356E = obtainStyledAttributes.getInt(index2, c0071b.f6356E);
                        i9 = 1;
                        break;
                    case 28:
                        i = indexCount2;
                        c0071b.f6358G = obtainStyledAttributes.getDimensionPixelSize(index2, c0071b.f6358G);
                        i9 = 1;
                        break;
                    case 29:
                        i = indexCount2;
                        c0071b.f6387j = g(obtainStyledAttributes, index2, c0071b.f6387j);
                        i9 = 1;
                        break;
                    case 30:
                        i = indexCount2;
                        c0071b.f6389k = g(obtainStyledAttributes, index2, c0071b.f6389k);
                        i9 = 1;
                        break;
                    case 31:
                        i = indexCount2;
                        c0071b.f6362K = obtainStyledAttributes.getDimensionPixelSize(index2, c0071b.f6362K);
                        i9 = 1;
                        break;
                    case 32:
                        i = indexCount2;
                        c0071b.f6402s = g(obtainStyledAttributes, index2, c0071b.f6402s);
                        i9 = 1;
                        break;
                    case 33:
                        i = indexCount2;
                        c0071b.f6403t = g(obtainStyledAttributes, index2, c0071b.f6403t);
                        i9 = 1;
                        break;
                    case 34:
                        i = indexCount2;
                        c0071b.f6359H = obtainStyledAttributes.getDimensionPixelSize(index2, c0071b.f6359H);
                        i9 = 1;
                        break;
                    case 35:
                        i = indexCount2;
                        c0071b.f6393m = g(obtainStyledAttributes, index2, c0071b.f6393m);
                        i9 = 1;
                        break;
                    case 36:
                        i = indexCount2;
                        c0071b.f6391l = g(obtainStyledAttributes, index2, c0071b.f6391l);
                        i9 = 1;
                        break;
                    case 37:
                        i = indexCount2;
                        c0071b.f6407x = obtainStyledAttributes.getFloat(index2, c0071b.f6407x);
                        i9 = 1;
                        break;
                    case 38:
                        i = indexCount2;
                        aVar.f6334a = obtainStyledAttributes.getResourceId(index2, aVar.f6334a);
                        i9 = 1;
                        break;
                    case 39:
                        i = indexCount2;
                        c0071b.U = obtainStyledAttributes.getFloat(index2, c0071b.U);
                        i9 = 1;
                        break;
                    case 40:
                        i = indexCount2;
                        c0071b.T = obtainStyledAttributes.getFloat(index2, c0071b.T);
                        i9 = 1;
                        break;
                    case 41:
                        i = indexCount2;
                        c0071b.V = obtainStyledAttributes.getInt(index2, c0071b.V);
                        i9 = 1;
                        break;
                    case 42:
                        i = indexCount2;
                        c0071b.W = obtainStyledAttributes.getInt(index2, c0071b.W);
                        i9 = 1;
                        break;
                    case 43:
                        i = indexCount2;
                        dVar.f6421c = obtainStyledAttributes.getFloat(index2, dVar.f6421c);
                        i9 = 1;
                        break;
                    case 44:
                        i = indexCount2;
                        eVar.f6434l = true;
                        eVar.f6435m = obtainStyledAttributes.getDimension(index2, eVar.f6435m);
                        i9 = 1;
                        break;
                    case 45:
                        i = indexCount2;
                        eVar.f6425b = obtainStyledAttributes.getFloat(index2, eVar.f6425b);
                        i9 = 1;
                        break;
                    case 46:
                        i = indexCount2;
                        eVar.f6426c = obtainStyledAttributes.getFloat(index2, eVar.f6426c);
                        i9 = 1;
                        break;
                    case 47:
                        i = indexCount2;
                        eVar.f6427d = obtainStyledAttributes.getFloat(index2, eVar.f6427d);
                        i9 = 1;
                        break;
                    case 48:
                        i = indexCount2;
                        eVar.f6428e = obtainStyledAttributes.getFloat(index2, eVar.f6428e);
                        i9 = 1;
                        break;
                    case 49:
                        i = indexCount2;
                        eVar.f6429f = obtainStyledAttributes.getDimension(index2, eVar.f6429f);
                        i9 = 1;
                        break;
                    case 50:
                        i = indexCount2;
                        eVar.f6430g = obtainStyledAttributes.getDimension(index2, eVar.f6430g);
                        i9 = 1;
                        break;
                    case 51:
                        i = indexCount2;
                        eVar.i = obtainStyledAttributes.getDimension(index2, eVar.i);
                        i9 = 1;
                        break;
                    case 52:
                        i = indexCount2;
                        eVar.f6432j = obtainStyledAttributes.getDimension(index2, eVar.f6432j);
                        i9 = 1;
                        break;
                    case 53:
                        i = indexCount2;
                        eVar.f6433k = obtainStyledAttributes.getDimension(index2, eVar.f6433k);
                        i9 = 1;
                        break;
                    case 54:
                        i = indexCount2;
                        c0071b.X = obtainStyledAttributes.getInt(index2, c0071b.X);
                        i9 = 1;
                        break;
                    case 55:
                        i = indexCount2;
                        c0071b.Y = obtainStyledAttributes.getInt(index2, c0071b.Y);
                        i9 = 1;
                        break;
                    case 56:
                        i = indexCount2;
                        c0071b.f6369Z = obtainStyledAttributes.getDimensionPixelSize(index2, c0071b.f6369Z);
                        i9 = 1;
                        break;
                    case 57:
                        i = indexCount2;
                        c0071b.f6371a0 = obtainStyledAttributes.getDimensionPixelSize(index2, c0071b.f6371a0);
                        i9 = 1;
                        break;
                    case 58:
                        i = indexCount2;
                        c0071b.f6373b0 = obtainStyledAttributes.getDimensionPixelSize(index2, c0071b.f6373b0);
                        i9 = 1;
                        break;
                    case 59:
                        i = indexCount2;
                        c0071b.f6375c0 = obtainStyledAttributes.getDimensionPixelSize(index2, c0071b.f6375c0);
                        i9 = 1;
                        break;
                    case 60:
                        i = indexCount2;
                        eVar.f6424a = obtainStyledAttributes.getFloat(index2, eVar.f6424a);
                        i9 = 1;
                        break;
                    case 61:
                        i = indexCount2;
                        c0071b.f6409z = g(obtainStyledAttributes, index2, c0071b.f6409z);
                        i9 = 1;
                        break;
                    case 62:
                        i = indexCount2;
                        c0071b.f6352A = obtainStyledAttributes.getDimensionPixelSize(index2, c0071b.f6352A);
                        i9 = 1;
                        break;
                    case 63:
                        i = indexCount2;
                        c0071b.f6353B = obtainStyledAttributes.getFloat(index2, c0071b.f6353B);
                        i9 = 1;
                        break;
                    case 64:
                        i = indexCount2;
                        cVar.f6411a = g(obtainStyledAttributes, index2, cVar.f6411a);
                        i9 = 1;
                        break;
                    case 65:
                        i = indexCount2;
                        if (obtainStyledAttributes.peekValue(index2).type == 3) {
                            obtainStyledAttributes.getString(index2);
                            cVar.getClass();
                            i9 = 1;
                            break;
                        } else {
                            String str3 = strArr[obtainStyledAttributes.getInteger(index2, 0)];
                            cVar.getClass();
                            i9 = 1;
                            break;
                        }
                    case 66:
                        i = indexCount2;
                        z11 = false;
                        obtainStyledAttributes.getInt(index2, 0);
                        cVar.getClass();
                        i9 = 1;
                        break;
                    case 67:
                        i = indexCount2;
                        cVar.f6415e = obtainStyledAttributes.getFloat(index2, cVar.f6415e);
                        i9 = 1;
                        break;
                    case 68:
                        i = indexCount2;
                        dVar.f6422d = obtainStyledAttributes.getFloat(index2, dVar.f6422d);
                        i9 = 1;
                        break;
                    case 69:
                        i = indexCount2;
                        c0071b.f6377d0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        i9 = 1;
                        break;
                    case 70:
                        i = indexCount2;
                        c0071b.f6379e0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        i9 = 1;
                        break;
                    case 71:
                        i = indexCount2;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        i9 = 1;
                        break;
                    case 72:
                        i = indexCount2;
                        c0071b.f6381f0 = obtainStyledAttributes.getInt(index2, c0071b.f6381f0);
                        i9 = 1;
                        break;
                    case 73:
                        i = indexCount2;
                        c0071b.f6383g0 = obtainStyledAttributes.getDimensionPixelSize(index2, c0071b.f6383g0);
                        i9 = 1;
                        break;
                    case 74:
                        i = indexCount2;
                        c0071b.f6388j0 = obtainStyledAttributes.getString(index2);
                        i9 = 1;
                        break;
                    case 75:
                        i = indexCount2;
                        c0071b.f6396n0 = obtainStyledAttributes.getBoolean(index2, c0071b.f6396n0);
                        i9 = 1;
                        break;
                    case 76:
                        i = indexCount2;
                        cVar.f6413c = obtainStyledAttributes.getInt(index2, cVar.f6413c);
                        i9 = 1;
                        break;
                    case 77:
                        i = indexCount2;
                        c0071b.f6390k0 = obtainStyledAttributes.getString(index2);
                        i9 = 1;
                        break;
                    case 78:
                        i = indexCount2;
                        dVar.f6420b = obtainStyledAttributes.getInt(index2, dVar.f6420b);
                        i9 = 1;
                        break;
                    case 79:
                        i = indexCount2;
                        cVar.f6414d = obtainStyledAttributes.getFloat(index2, cVar.f6414d);
                        i9 = 1;
                        break;
                    case 80:
                        i = indexCount2;
                        c0071b.f6392l0 = obtainStyledAttributes.getBoolean(index2, c0071b.f6392l0);
                        i9 = 1;
                        break;
                    case 81:
                        i = indexCount2;
                        c0071b.f6394m0 = obtainStyledAttributes.getBoolean(index2, c0071b.f6394m0);
                        i9 = 1;
                        break;
                    case 82:
                        i = indexCount2;
                        cVar.f6412b = obtainStyledAttributes.getInteger(index2, cVar.f6412b);
                        i9 = 1;
                        break;
                    case 83:
                        i = indexCount2;
                        eVar.f6431h = g(obtainStyledAttributes, index2, eVar.f6431h);
                        i9 = 1;
                        break;
                    case 84:
                        i = indexCount2;
                        cVar.f6417g = obtainStyledAttributes.getInteger(index2, cVar.f6417g);
                        i9 = 1;
                        break;
                    case 85:
                        i = indexCount2;
                        cVar.f6416f = obtainStyledAttributes.getFloat(index2, cVar.f6416f);
                        i9 = 1;
                        break;
                    case 86:
                        i = indexCount2;
                        int i17 = obtainStyledAttributes.peekValue(index2).type;
                        if (i17 == 1) {
                            cVar.i = obtainStyledAttributes.getResourceId(index2, -1);
                        } else if (i17 == 3) {
                            String string2 = obtainStyledAttributes.getString(index2);
                            cVar.f6418h = string2;
                            if (string2.indexOf("/") > 0) {
                                cVar.i = obtainStyledAttributes.getResourceId(index2, -1);
                            }
                        } else {
                            obtainStyledAttributes.getInteger(index2, cVar.i);
                        }
                        i9 = 1;
                        break;
                    case 87:
                        i = indexCount2;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        i9 = 1;
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        i = indexCount2;
                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        i9 = 1;
                        break;
                    case 91:
                        i = indexCount2;
                        c0071b.f6400q = g(obtainStyledAttributes, index2, c0071b.f6400q);
                        i9 = 1;
                        break;
                    case 92:
                        i = indexCount2;
                        c0071b.f6401r = g(obtainStyledAttributes, index2, c0071b.f6401r);
                        i9 = 1;
                        break;
                    case 93:
                        i = indexCount2;
                        c0071b.f6363L = obtainStyledAttributes.getDimensionPixelSize(index2, c0071b.f6363L);
                        i9 = 1;
                        break;
                    case 94:
                        i = indexCount2;
                        c0071b.S = obtainStyledAttributes.getDimensionPixelSize(index2, c0071b.S);
                        i9 = 1;
                        break;
                    case 95:
                        i = indexCount2;
                        z11 = false;
                        h(c0071b, obtainStyledAttributes, index2, 0);
                        i9 = 1;
                        break;
                    case 96:
                        i = indexCount2;
                        i9 = 1;
                        h(c0071b, obtainStyledAttributes, index2, 1);
                        break;
                    case 97:
                        i = indexCount2;
                        c0071b.f6398o0 = obtainStyledAttributes.getInt(index2, c0071b.f6398o0);
                        i9 = 1;
                        break;
                }
                i16 += i9;
                i15 = i9;
            }
            if (c0071b.f6388j0 != null) {
                c0071b.f6386i0 = null;
            }
        }
        obtainStyledAttributes.recycle();
        return aVar;
    }

    public static int g(TypedArray typedArray, int i, int i9) {
        int resourceId = typedArray.getResourceId(i, i9);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void h(java.lang.Object r7, android.content.res.TypedArray r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.b.h(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    public static void i(ConstraintLayout.a aVar, String str) {
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            char c2 = 65535;
            int i = 0;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (substring.equalsIgnoreCase("W")) {
                    c2 = 0;
                } else if (substring.equalsIgnoreCase("H")) {
                    c2 = 1;
                }
                i = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            try {
                if (indexOf2 < 0 || indexOf2 >= length - 1) {
                    String substring2 = str.substring(i);
                    if (substring2.length() > 0) {
                        Float.parseFloat(substring2);
                    }
                } else {
                    String substring3 = str.substring(i, indexOf2);
                    String substring4 = str.substring(indexOf2 + 1);
                    if (substring3.length() > 0 && substring4.length() > 0) {
                        float parseFloat = Float.parseFloat(substring3);
                        float parseFloat2 = Float.parseFloat(substring4);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            if (c2 == 1) {
                                Math.abs(parseFloat2 / parseFloat);
                            } else {
                                Math.abs(parseFloat / parseFloat2);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        aVar.f6256G = str;
    }

    public final void a(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashMap<Integer, a> hashMap = this.f6333c;
        HashSet hashSet = new HashSet(hashMap.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + C0707a.b(childAt));
            } else {
                if (this.f6332b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (hashMap.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        a aVar = hashMap.get(Integer.valueOf(id));
                        if (aVar != null) {
                            if (childAt instanceof Barrier) {
                                C0071b c0071b = aVar.f6337d;
                                c0071b.f6385h0 = 1;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id);
                                barrier.setType(c0071b.f6381f0);
                                barrier.setMargin(c0071b.f6383g0);
                                barrier.setAllowsGoneWidget(c0071b.f6396n0);
                                int[] iArr = c0071b.f6386i0;
                                if (iArr != null) {
                                    barrier.setReferencedIds(iArr);
                                } else {
                                    String str = c0071b.f6388j0;
                                    if (str != null) {
                                        int[] c2 = c(barrier, str);
                                        c0071b.f6386i0 = c2;
                                        barrier.setReferencedIds(c2);
                                    }
                                }
                            }
                            ConstraintLayout.a aVar2 = (ConstraintLayout.a) childAt.getLayoutParams();
                            aVar2.a();
                            aVar.a(aVar2);
                            ConstraintAttribute.b(childAt, aVar.f6339f);
                            childAt.setLayoutParams(aVar2);
                            d dVar = aVar.f6335b;
                            if (dVar.f6420b == 0) {
                                childAt.setVisibility(dVar.f6419a);
                            }
                            childAt.setAlpha(dVar.f6421c);
                            e eVar = aVar.f6338e;
                            childAt.setRotation(eVar.f6424a);
                            childAt.setRotationX(eVar.f6425b);
                            childAt.setRotationY(eVar.f6426c);
                            childAt.setScaleX(eVar.f6427d);
                            childAt.setScaleY(eVar.f6428e);
                            if (eVar.f6431h != -1) {
                                if (((View) childAt.getParent()).findViewById(eVar.f6431h) != null) {
                                    float bottom = (r7.getBottom() + r7.getTop()) / 2.0f;
                                    float right = (r7.getRight() + r7.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(right - childAt.getLeft());
                                        childAt.setPivotY(bottom - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(eVar.f6429f)) {
                                    childAt.setPivotX(eVar.f6429f);
                                }
                                if (!Float.isNaN(eVar.f6430g)) {
                                    childAt.setPivotY(eVar.f6430g);
                                }
                            }
                            childAt.setTranslationX(eVar.i);
                            childAt.setTranslationY(eVar.f6432j);
                            childAt.setTranslationZ(eVar.f6433k);
                            if (eVar.f6434l) {
                                childAt.setElevation(eVar.f6435m);
                            }
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar3 = hashMap.get(num);
            if (aVar3 != null) {
                C0071b c0071b2 = aVar3.f6337d;
                if (c0071b2.f6385h0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    int[] iArr2 = c0071b2.f6386i0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = c0071b2.f6388j0;
                        if (str2 != null) {
                            int[] c10 = c(barrier2, str2);
                            c0071b2.f6386i0 = c10;
                            barrier2.setReferencedIds(c10);
                        }
                    }
                    barrier2.setType(c0071b2.f6381f0);
                    barrier2.setMargin(c0071b2.f6383g0);
                    ConstraintLayout.a generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    barrier2.k();
                    aVar3.a(generateDefaultLayoutParams);
                    constraintLayout.addView(barrier2, generateDefaultLayoutParams);
                }
                if (c0071b2.f6370a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ConstraintLayout.a generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                    aVar3.a(generateDefaultLayoutParams2);
                    constraintLayout.addView(guideline, generateDefaultLayoutParams2);
                }
            }
        }
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt2 = constraintLayout.getChildAt(i9);
            if (childAt2 instanceof androidx.constraintlayout.widget.a) {
                ((androidx.constraintlayout.widget.a) childAt2).f(constraintLayout);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        int i;
        HashMap<Integer, a> hashMap;
        HashMap<Integer, a> hashMap2;
        b bVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap<Integer, a> hashMap3 = bVar.f6333c;
        hashMap3.clear();
        int i9 = 0;
        while (i9 < childCount) {
            View childAt = constraintLayout.getChildAt(i9);
            ConstraintLayout.a aVar = (ConstraintLayout.a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (bVar.f6332b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap3.containsKey(Integer.valueOf(id))) {
                hashMap3.put(Integer.valueOf(id), new a());
            }
            a aVar2 = hashMap3.get(Integer.valueOf(id));
            if (aVar2 == null) {
                i = childCount;
                hashMap = hashMap3;
            } else {
                HashMap<String, ConstraintAttribute> hashMap4 = bVar.f6331a;
                HashMap<String, ConstraintAttribute> hashMap5 = new HashMap<>();
                Class<?> cls = childAt.getClass();
                for (String str : hashMap4.keySet()) {
                    ConstraintAttribute constraintAttribute = hashMap4.get(str);
                    int i10 = childCount;
                    try {
                        if (str.equals("BackgroundColor")) {
                            hashMap2 = hashMap3;
                            try {
                                hashMap5.put(str, new ConstraintAttribute(constraintAttribute, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                            } catch (IllegalAccessException e10) {
                                e = e10;
                                StringBuilder m2 = com.google.android.gms.measurement.internal.a.m(" Custom Attribute \"", str, "\" not found on ");
                                m2.append(cls.getName());
                                Log.e("TransitionLayout", m2.toString(), e);
                                childCount = i10;
                                hashMap3 = hashMap2;
                            } catch (NoSuchMethodException e11) {
                                e = e11;
                                Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e);
                                childCount = i10;
                                hashMap3 = hashMap2;
                            } catch (InvocationTargetException e12) {
                                e = e12;
                                StringBuilder m9 = com.google.android.gms.measurement.internal.a.m(" Custom Attribute \"", str, "\" not found on ");
                                m9.append(cls.getName());
                                Log.e("TransitionLayout", m9.toString(), e);
                                childCount = i10;
                                hashMap3 = hashMap2;
                            }
                        } else {
                            hashMap2 = hashMap3;
                            hashMap5.put(str, new ConstraintAttribute(constraintAttribute, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e13) {
                        e = e13;
                        hashMap2 = hashMap3;
                    } catch (NoSuchMethodException e14) {
                        e = e14;
                        hashMap2 = hashMap3;
                    } catch (InvocationTargetException e15) {
                        e = e15;
                        hashMap2 = hashMap3;
                    }
                    childCount = i10;
                    hashMap3 = hashMap2;
                }
                i = childCount;
                hashMap = hashMap3;
                aVar2.f6339f = hashMap5;
                aVar2.b(id, aVar);
                int visibility = childAt.getVisibility();
                d dVar = aVar2.f6335b;
                dVar.f6419a = visibility;
                dVar.f6421c = childAt.getAlpha();
                float rotation = childAt.getRotation();
                e eVar = aVar2.f6338e;
                eVar.f6424a = rotation;
                eVar.f6425b = childAt.getRotationX();
                eVar.f6426c = childAt.getRotationY();
                eVar.f6427d = childAt.getScaleX();
                eVar.f6428e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    eVar.f6429f = pivotX;
                    eVar.f6430g = pivotY;
                }
                eVar.i = childAt.getTranslationX();
                eVar.f6432j = childAt.getTranslationY();
                eVar.f6433k = childAt.getTranslationZ();
                if (eVar.f6434l) {
                    eVar.f6435m = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    boolean allowsGoneWidget = barrier.getAllowsGoneWidget();
                    C0071b c0071b = aVar2.f6337d;
                    c0071b.f6396n0 = allowsGoneWidget;
                    c0071b.f6386i0 = barrier.getReferencedIds();
                    c0071b.f6381f0 = barrier.getType();
                    c0071b.f6383g0 = barrier.getMargin();
                }
            }
            i9++;
            bVar = this;
            childCount = i;
            hashMap3 = hashMap;
        }
    }

    public final a e(int i) {
        HashMap<Integer, a> hashMap = this.f6333c;
        if (!hashMap.containsKey(Integer.valueOf(i))) {
            hashMap.put(Integer.valueOf(i), new a());
        }
        return hashMap.get(Integer.valueOf(i));
    }

    public final void f(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    a d10 = d(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        d10.f6337d.f6370a = true;
                    }
                    this.f6333c.put(Integer.valueOf(d10.f6334a), d10);
                }
            }
        } catch (IOException e10) {
            Log.e("ConstraintSet", "Error parsing resource: " + i, e10);
        } catch (XmlPullParserException e11) {
            Log.e("ConstraintSet", "Error parsing resource: " + i, e11);
        }
    }
}
