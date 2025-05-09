package C8;

import F8.o;
import O9.p;
import U4.b;
import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.RequestOptions;
import com.google.android.material.imageview.ShapeableImageView;
import k0.C0913a;
import kotlin.jvm.internal.f;

/* compiled from: DatabindingAdapters.kt */
/* loaded from: classes2.dex */
public final class a {
    public static final void a(View view, Integer num) {
        Drawable drawable;
        if ((num != null && num.intValue() == 0) || num == null || (drawable = C0913a.getDrawable(view.getContext(), num.intValue())) == null) {
            return;
        }
        view.setBackground(drawable);
    }

    public static final void b(View view, boolean z10) {
        view.setVisibility(z10 ? 0 : 8);
    }

    public static final void c(TextView textView, Integer num) {
        if ((num != null && num.intValue() == 0) || num == null) {
            return;
        }
        textView.setTextColor(num.intValue());
    }

    public static final void d(ImageView imageView, Integer num) {
        Drawable drawable;
        if ((num != null && num.intValue() == 0) || num == null || (drawable = C0913a.getDrawable(imageView.getContext(), num.intValue())) == null) {
            return;
        }
        Glide.with(imageView.getContext()).load(drawable).into(imageView);
    }

    public static final void e(ShapeableImageView shapeableImageView, String str) {
        if (str != null) {
            Glide.with(shapeableImageView.getContext().getApplicationContext()).load(str).transition(DrawableTransitionOptions.withCrossFade()).timeout(6000).apply((BaseRequestOptions<?>) RequestOptions.circleCropTransform()).into(shapeableImageView);
        }
    }

    public static final void f(int i, View view) {
        g(view, 0, b.C(i * Resources.getSystem().getDisplayMetrics().density), 7);
    }

    public static void g(View view, int i, int i9, int i10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int marginStart = layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() : 0;
        if ((i10 & 2) != 0) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            i = marginLayoutParams != null ? marginLayoutParams.topMargin : 0;
        }
        ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
        int marginEnd = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams3).getMarginEnd() : 0;
        if ((i10 & 8) != 0) {
            ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
            i9 = marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0;
        }
        ViewGroup.LayoutParams layoutParams5 = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams5 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams5 : null;
        if (marginLayoutParams3 != null) {
            marginLayoutParams3.setMargins(marginStart, i, marginEnd, i9);
            p pVar = p.f3034a;
        }
    }

    public static final void h(int i, View view) {
        g(view, b.C(i * Resources.getSystem().getDisplayMetrics().density), 0, 13);
    }

    @SuppressLint({"DiscouragedApi"})
    public static final void i(ShapeableImageView shapeableImageView, String str) {
        Glide.with(shapeableImageView).load(Integer.valueOf(shapeableImageView.getContext().getResources().getIdentifier(s3.b.j("ic_", str), "drawable", shapeableImageView.getContext().getPackageName()))).into(shapeableImageView);
    }

    public static final void j(View view, Boolean bool) {
        if (f.b(bool, Boolean.FALSE)) {
            o.b(view);
        } else {
            view.setVisibility(0);
        }
    }
}
