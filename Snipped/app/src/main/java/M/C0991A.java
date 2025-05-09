package m;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* compiled from: AppCompatTextViewAutoSizeHelper.java */
/* renamed from: m.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0991A {

    /* renamed from: l, reason: collision with root package name */
    public static final RectF f23594l = new RectF();

    /* renamed from: m, reason: collision with root package name */
    @SuppressLint({"BanConcurrentHashMap"})
    public static final ConcurrentHashMap<String, Method> f23595m = new ConcurrentHashMap<>();

    /* renamed from: a, reason: collision with root package name */
    public int f23596a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f23597b = false;

    /* renamed from: c, reason: collision with root package name */
    public float f23598c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f23599d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f23600e = -1.0f;

    /* renamed from: f, reason: collision with root package name */
    public int[] f23601f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public boolean f23602g = false;

    /* renamed from: h, reason: collision with root package name */
    public TextPaint f23603h;
    public final TextView i;

    /* renamed from: j, reason: collision with root package name */
    public final Context f23604j;

    /* renamed from: k, reason: collision with root package name */
    public final b f23605k;

    /* compiled from: AppCompatTextViewAutoSizeHelper.java */
    /* renamed from: m.A$a */
    public static final class a {
        public static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i, int i9, TextView textView, TextPaint textPaint, d dVar) {
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i);
            StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i9 == -1) {
                i9 = Integer.MAX_VALUE;
            }
            hyphenationFrequency.setMaxLines(i9);
            try {
                dVar.a(obtain, textView);
            } catch (ClassCastException unused) {
                Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            return obtain.build();
        }
    }

    /* compiled from: AppCompatTextViewAutoSizeHelper.java */
    /* renamed from: m.A$b */
    public static class b extends d {
        @Override // m.C0991A.d
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) C0991A.e("getTextDirectionHeuristic", textView, TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* compiled from: AppCompatTextViewAutoSizeHelper.java */
    /* renamed from: m.A$c */
    public static class c extends b {
        @Override // m.C0991A.b, m.C0991A.d
        public void a(StaticLayout.Builder builder, TextView textView) {
            TextDirectionHeuristic textDirectionHeuristic;
            textDirectionHeuristic = textView.getTextDirectionHeuristic();
            builder.setTextDirection(textDirectionHeuristic);
        }

        @Override // m.C0991A.d
        public boolean b(TextView textView) {
            boolean isHorizontallyScrollable;
            isHorizontallyScrollable = textView.isHorizontallyScrollable();
            return isHorizontallyScrollable;
        }
    }

    /* compiled from: AppCompatTextViewAutoSizeHelper.java */
    /* renamed from: m.A$d */
    public static class d {
        public void a(StaticLayout.Builder builder, TextView textView) {
            throw null;
        }

        public boolean b(TextView textView) {
            return ((Boolean) C0991A.e("getHorizontallyScrolling", textView, Boolean.FALSE)).booleanValue();
        }
    }

    public C0991A(TextView textView) {
        this.i = textView;
        this.f23604j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f23605k = new c();
        } else {
            this.f23605k = new b();
        }
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i9 = 0; i9 < size; i9++) {
            iArr2[i9] = ((Integer) arrayList.get(i9)).intValue();
        }
        return iArr2;
    }

    public static Method d(String str) {
        try {
            ConcurrentHashMap<String, Method> concurrentHashMap = f23595m;
            Method method = concurrentHashMap.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, null)) != null) {
                method.setAccessible(true);
                concurrentHashMap.put(str, method);
            }
            return method;
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e10);
            return null;
        }
    }

    @SuppressLint({"BanUncheckedReflection"})
    public static Object e(String str, Object obj, Object obj2) {
        try {
            return d(str).invoke(obj, null);
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e10);
            return obj2;
        }
    }

    public final void a() {
        if (f()) {
            if (this.f23597b) {
                if (this.i.getMeasuredHeight() <= 0 || this.i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f23605k.b(this.i) ? PKIFailureInfo.badCertTemplate : (this.i.getMeasuredWidth() - this.i.getTotalPaddingLeft()) - this.i.getTotalPaddingRight();
                int height = (this.i.getHeight() - this.i.getCompoundPaddingBottom()) - this.i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f23594l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float c2 = c(rectF);
                        if (c2 != this.i.getTextSize()) {
                            g(0, c2);
                        }
                    } finally {
                    }
                }
            }
            this.f23597b = true;
        }
    }

    public final int c(RectF rectF) {
        CharSequence transformation;
        int length = this.f23601f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i = length - 1;
        int i9 = 0;
        int i10 = 1;
        while (i10 <= i) {
            int i11 = (i10 + i) / 2;
            int i12 = this.f23601f[i11];
            TextView textView = this.i;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
                text = transformation;
            }
            int maxLines = textView.getMaxLines();
            TextPaint textPaint = this.f23603h;
            if (textPaint == null) {
                this.f23603h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f23603h.set(textView.getPaint());
            this.f23603h.setTextSize(i12);
            StaticLayout a10 = a.a(text, (Layout.Alignment) e("getLayoutAlignment", textView, Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines, this.i, this.f23603h, this.f23605k);
            if ((maxLines == -1 || (a10.getLineCount() <= maxLines && a10.getLineEnd(a10.getLineCount() - 1) == text.length())) && a10.getHeight() <= rectF.bottom) {
                int i13 = i11 + 1;
                i9 = i10;
                i10 = i13;
            } else {
                i9 = i11 - 1;
                i = i9;
            }
        }
        return this.f23601f[i9];
    }

    public final boolean f() {
        return j() && this.f23596a != 0;
    }

    public final void g(int i, float f10) {
        Context context = this.f23604j;
        float applyDimension = TypedValue.applyDimension(i, f10, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.i;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean isInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f23597b = false;
                try {
                    Method d10 = d("nullLayouts");
                    if (d10 != null) {
                        d10.invoke(textView, null);
                    }
                } catch (Exception e10) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e10);
                }
                if (isInLayout) {
                    textView.forceLayout();
                } else {
                    textView.requestLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean h() {
        if (j() && this.f23596a == 1) {
            if (!this.f23602g || this.f23601f.length == 0) {
                int floor = ((int) Math.floor((this.f23600e - this.f23599d) / this.f23598c)) + 1;
                int[] iArr = new int[floor];
                for (int i = 0; i < floor; i++) {
                    iArr[i] = Math.round((i * this.f23598c) + this.f23599d);
                }
                this.f23601f = b(iArr);
            }
            this.f23597b = true;
        } else {
            this.f23597b = false;
        }
        return this.f23597b;
    }

    public final boolean i() {
        boolean z10 = this.f23601f.length > 0;
        this.f23602g = z10;
        if (z10) {
            this.f23596a = 1;
            this.f23599d = r0[0];
            this.f23600e = r0[r1 - 1];
            this.f23598c = -1.0f;
        }
        return z10;
    }

    public final boolean j() {
        return !(this.i instanceof C1009k);
    }

    public final void k(float f10, float f11, float f12) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f10 + "px) is less or equal to (0px)");
        }
        if (f11 <= f10) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f11 + "px) is less or equal to minimum auto-size text size (" + f10 + "px)");
        }
        if (f12 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f12 + "px) is less or equal to (0px)");
        }
        this.f23596a = 1;
        this.f23599d = f10;
        this.f23600e = f11;
        this.f23598c = f12;
        this.f23602g = false;
    }
}
