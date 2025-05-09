package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import com.luminary.mobile.R;
import k0.C0913a;
import m.N;

/* compiled from: AppCompatDrawableManager.java */
/* renamed from: m.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1008j {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f23776b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static C1008j f23777c;

    /* renamed from: a, reason: collision with root package name */
    public N f23778a;

    /* compiled from: AppCompatDrawableManager.java */
    /* renamed from: m.j$a */
    public class a implements N.b {

        /* renamed from: a, reason: collision with root package name */
        public final int[] f23779a = {2131230928, 2131230926, 2131230852};

        /* renamed from: b, reason: collision with root package name */
        public final int[] f23780b = {2131230876, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};

        /* renamed from: c, reason: collision with root package name */
        public final int[] f23781c = {2131230925, 2131230927, 2131230869, R.drawable.abc_text_cursor_material, 2131230922, 2131230923, 2131230924};

        /* renamed from: d, reason: collision with root package name */
        public final int[] f23782d = {2131230901, R.drawable.abc_cab_background_internal_bg, 2131230900};

        /* renamed from: e, reason: collision with root package name */
        public final int[] f23783e = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};

        /* renamed from: f, reason: collision with root package name */
        public final int[] f23784f = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};

        public static boolean a(int i, int[] iArr) {
            for (int i9 : iArr) {
                if (i9 == i) {
                    return true;
                }
            }
            return false;
        }

        public static ColorStateList b(Context context, int i) {
            int c2 = U.c(context, R.attr.colorControlHighlight);
            int b9 = U.b(context, R.attr.colorButtonNormal);
            int[] iArr = U.f23716b;
            int[] iArr2 = U.f23718d;
            int f10 = n0.a.f(c2, i);
            return new ColorStateList(new int[][]{iArr, iArr2, U.f23717c, U.f23720f}, new int[]{b9, f10, n0.a.f(c2, i), i});
        }

        public static LayerDrawable c(N n10, Context context, int i) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
            Drawable e10 = n10.e(context, R.drawable.abc_star_black_48dp);
            Drawable e11 = n10.e(context, R.drawable.abc_star_half_black_48dp);
            if ((e10 instanceof BitmapDrawable) && e10.getIntrinsicWidth() == dimensionPixelSize && e10.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) e10;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                e10.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                e10.draw(canvas);
                bitmapDrawable = new BitmapDrawable(createBitmap);
                bitmapDrawable2 = new BitmapDrawable(createBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((e11 instanceof BitmapDrawable) && e11.getIntrinsicWidth() == dimensionPixelSize && e11.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) e11;
            } else {
                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                e11.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                e11.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, android.R.id.background);
            layerDrawable.setId(1, android.R.id.secondaryProgress);
            layerDrawable.setId(2, android.R.id.progress);
            return layerDrawable;
        }

        public static void e(Drawable drawable, int i, PorterDuff.Mode mode) {
            Drawable mutate = drawable.mutate();
            if (mode == null) {
                mode = C1008j.f23776b;
            }
            mutate.setColorFilter(C1008j.c(i, mode));
        }

        public final ColorStateList d(Context context, int i) {
            if (i == R.drawable.abc_edit_text_material) {
                return C0913a.getColorStateList(context, R.color.abc_tint_edittext);
            }
            if (i == 2131230918) {
                return C0913a.getColorStateList(context, R.color.abc_tint_switch_track);
            }
            if (i != R.drawable.abc_switch_thumb_material) {
                if (i == R.drawable.abc_btn_default_mtrl_shape) {
                    return b(context, U.c(context, R.attr.colorButtonNormal));
                }
                if (i == R.drawable.abc_btn_borderless_material) {
                    return b(context, 0);
                }
                if (i == R.drawable.abc_btn_colored_material) {
                    return b(context, U.c(context, R.attr.colorAccent));
                }
                if (i == 2131230913 || i == R.drawable.abc_spinner_textfield_background_material) {
                    return C0913a.getColorStateList(context, R.color.abc_tint_spinner);
                }
                if (a(i, this.f23780b)) {
                    return U.d(context, R.attr.colorControlNormal);
                }
                if (a(i, this.f23783e)) {
                    return C0913a.getColorStateList(context, R.color.abc_tint_default);
                }
                if (a(i, this.f23784f)) {
                    return C0913a.getColorStateList(context, R.color.abc_tint_btn_checkable);
                }
                if (i == R.drawable.abc_seekbar_thumb_material) {
                    return C0913a.getColorStateList(context, R.color.abc_tint_seek_thumb);
                }
                return null;
            }
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList d10 = U.d(context, R.attr.colorSwitchThumbNormal);
            if (d10 == null || !d10.isStateful()) {
                iArr[0] = U.f23716b;
                iArr2[0] = U.b(context, R.attr.colorSwitchThumbNormal);
                iArr[1] = U.f23719e;
                iArr2[1] = U.c(context, R.attr.colorControlActivated);
                iArr[2] = U.f23720f;
                iArr2[2] = U.c(context, R.attr.colorSwitchThumbNormal);
            } else {
                int[] iArr3 = U.f23716b;
                iArr[0] = iArr3;
                iArr2[0] = d10.getColorForState(iArr3, 0);
                iArr[1] = U.f23719e;
                iArr2[1] = U.c(context, R.attr.colorControlActivated);
                iArr[2] = U.f23720f;
                iArr2[2] = d10.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }
    }

    public static synchronized C1008j a() {
        C1008j c1008j;
        synchronized (C1008j.class) {
            try {
                if (f23777c == null) {
                    d();
                }
                c1008j = f23777c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1008j;
    }

    public static synchronized PorterDuffColorFilter c(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter g10;
        synchronized (C1008j.class) {
            g10 = N.g(i, mode);
        }
        return g10;
    }

    public static synchronized void d() {
        synchronized (C1008j.class) {
            if (f23777c == null) {
                C1008j c1008j = new C1008j();
                f23777c = c1008j;
                c1008j.f23778a = N.c();
                N n10 = f23777c.f23778a;
                a aVar = new a();
                synchronized (n10) {
                    n10.f23685e = aVar;
                }
            }
        }
    }

    public static void e(Drawable drawable, X x9, int[] iArr) {
        PorterDuff.Mode mode = N.f23678f;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z10 = x9.f23726d;
        if (!z10 && !x9.f23725c) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilter = null;
        ColorStateList colorStateList = z10 ? x9.f23723a : null;
        PorterDuff.Mode mode2 = x9.f23725c ? x9.f23724b : N.f23678f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilter = N.g(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilter);
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.f23778a.e(context, i);
    }
}
