package E2;

import J2.i;
import T2.f;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.widget.ListAdapter;
import androidx.appcompat.app.b;
import com.luminary.mobile.R;
import java.util.WeakHashMap;
import k.c;
import k0.C0913a;
import t2.C1279a;
import y0.C1596C;
import y0.E;

/* compiled from: MaterialAlertDialogBuilder.java */
/* loaded from: classes.dex */
public class b extends b.a {
    private static final int DEF_STYLE_ATTR = 2130968622;
    private static final int DEF_STYLE_RES = 2132083022;
    private static final int MATERIAL_ALERT_DIALOG_THEME_OVERLAY = 2130969421;
    private Drawable background;
    private final Rect backgroundInsets;

    public b(Context context) {
        this(context, 0);
    }

    private static Context createMaterialAlertDialogThemedContext(Context context) {
        int materialAlertDialogThemeOverlay = getMaterialAlertDialogThemeOverlay(context);
        Context a10 = Y2.a.a(context, null, DEF_STYLE_ATTR, DEF_STYLE_RES);
        return materialAlertDialogThemeOverlay == 0 ? a10 : new c(a10, materialAlertDialogThemeOverlay);
    }

    private static int getMaterialAlertDialogThemeOverlay(Context context) {
        TypedValue a10 = P2.b.a(context, MATERIAL_ALERT_DIALOG_THEME_OVERLAY);
        if (a10 == null) {
            return 0;
        }
        return a10.data;
    }

    private static int getOverridingThemeResId(Context context, int i) {
        return i == 0 ? getMaterialAlertDialogThemeOverlay(context) : i;
    }

    @Override // androidx.appcompat.app.b.a
    public androidx.appcompat.app.b create() {
        androidx.appcompat.app.b create = super.create();
        Window window = create.getWindow();
        View decorView = window.getDecorView();
        Drawable drawable = this.background;
        if (drawable instanceof f) {
            WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
            ((f) drawable).n(C1596C.d.e(decorView));
        }
        Drawable drawable2 = this.background;
        Rect rect = this.backgroundInsets;
        window.setBackgroundDrawable(new InsetDrawable(drawable2, rect.left, rect.top, rect.right, rect.bottom));
        decorView.setOnTouchListener(new a(create, this.backgroundInsets));
        return create;
    }

    public Drawable getBackground() {
        return this.background;
    }

    @Override // androidx.appcompat.app.b.a
    public b setCancelable(boolean z10) {
        return (b) super.setCancelable(z10);
    }

    @Override // androidx.appcompat.app.b.a
    public b setItems(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
        return (b) super.setItems(charSequenceArr, onClickListener);
    }

    @Override // androidx.appcompat.app.b.a
    public b setMessage(CharSequence charSequence) {
        return (b) super.setMessage(charSequence);
    }

    @Override // androidx.appcompat.app.b.a
    public b setNeutralButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        return (b) super.setNeutralButton(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.b.a
    public b setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        return (b) super.setOnCancelListener(onCancelListener);
    }

    @Override // androidx.appcompat.app.b.a
    public b setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        return (b) super.setOnDismissListener(onDismissListener);
    }

    @Override // androidx.appcompat.app.b.a
    public b setPositiveButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        return (b) super.setPositiveButton(charSequence, onClickListener);
    }

    public b(Context context, int i) {
        super(createMaterialAlertDialogThemedContext(context), getOverridingThemeResId(context, i));
        Context context2 = getContext();
        Resources.Theme theme = context2.getTheme();
        int i9 = DEF_STYLE_ATTR;
        int i10 = DEF_STYLE_RES;
        int[] iArr = C1279a.f27501s;
        i.a(context2, null, i9, i10);
        i.b(context2, null, iArr, i9, i10, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(null, iArr, i9, i10);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_start));
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(3, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_top));
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(1, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_end));
        int dimensionPixelSize4 = obtainStyledAttributes.getDimensionPixelSize(0, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_bottom));
        obtainStyledAttributes.recycle();
        if (context2.getResources().getConfiguration().getLayoutDirection() == 1) {
            dimensionPixelSize3 = dimensionPixelSize;
            dimensionPixelSize = dimensionPixelSize3;
        }
        this.backgroundInsets = new Rect(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4);
        TypedValue c2 = P2.b.c(context2, R.attr.colorSurface, getClass().getCanonicalName());
        int i11 = c2.resourceId;
        int color = i11 != 0 ? C0913a.getColor(context2, i11) : c2.data;
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(null, iArr, i9, i10);
        int color2 = obtainStyledAttributes2.getColor(4, color);
        obtainStyledAttributes2.recycle();
        f fVar = new f(context2, null, i9, i10);
        fVar.k(context2);
        fVar.o(ColorStateList.valueOf(color2));
        if (Build.VERSION.SDK_INT >= 28) {
            TypedValue typedValue = new TypedValue();
            theme.resolveAttribute(android.R.attr.dialogCornerRadius, typedValue, true);
            float dimension = typedValue.getDimension(getContext().getResources().getDisplayMetrics());
            if (typedValue.type == 5 && dimension >= 0.0f) {
                fVar.m(dimension);
            }
        }
        this.background = fVar;
    }

    @Override // androidx.appcompat.app.b.a
    public b setAdapter(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
        return (b) super.setAdapter(listAdapter, onClickListener);
    }

    @Override // androidx.appcompat.app.b.a
    public b setCustomTitle(View view) {
        return (b) super.setCustomTitle(view);
    }

    @Override // androidx.appcompat.app.b.a
    public b setIcon(Drawable drawable) {
        return (b) super.setIcon(drawable);
    }

    @Override // androidx.appcompat.app.b.a
    public b setNegativeButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        return (b) super.setNegativeButton(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.b.a
    public b setOnKeyListener(DialogInterface.OnKeyListener onKeyListener) {
        return (b) super.setOnKeyListener(onKeyListener);
    }

    @Override // androidx.appcompat.app.b.a
    public b setSingleChoiceItems(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
        return (b) super.setSingleChoiceItems(listAdapter, i, onClickListener);
    }

    @Override // androidx.appcompat.app.b.a
    public b setTitle(CharSequence charSequence) {
        return (b) super.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.b.a
    public b setView(View view) {
        return (b) super.setView(view);
    }
}
