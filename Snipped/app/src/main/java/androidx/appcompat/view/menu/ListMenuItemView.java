package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.k;
import com.luminary.mobile.R;
import g.C0756a;
import m.Z;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements k.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: a, reason: collision with root package name */
    public h f4672a;

    /* renamed from: b, reason: collision with root package name */
    public ImageView f4673b;

    /* renamed from: c, reason: collision with root package name */
    public RadioButton f4674c;

    /* renamed from: d, reason: collision with root package name */
    public TextView f4675d;

    /* renamed from: e, reason: collision with root package name */
    public CheckBox f4676e;

    /* renamed from: f, reason: collision with root package name */
    public TextView f4677f;

    /* renamed from: g, reason: collision with root package name */
    public ImageView f4678g;

    /* renamed from: h, reason: collision with root package name */
    public ImageView f4679h;
    public LinearLayout i;

    /* renamed from: j, reason: collision with root package name */
    public final Drawable f4680j;

    /* renamed from: k, reason: collision with root package name */
    public final int f4681k;

    /* renamed from: l, reason: collision with root package name */
    public final Context f4682l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4683m;

    /* renamed from: n, reason: collision with root package name */
    public final Drawable f4684n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f4685o;

    /* renamed from: p, reason: collision with root package name */
    public LayoutInflater f4686p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f4687q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Z f10 = Z.f(getContext(), attributeSet, C0756a.f20745r, R.attr.listMenuViewStyle, 0);
        this.f4680j = f10.b(5);
        TypedArray typedArray = f10.f23728b;
        this.f4681k = typedArray.getResourceId(1, -1);
        this.f4683m = typedArray.getBoolean(7, false);
        this.f4682l = context;
        this.f4684n = f10.b(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f4685o = obtainStyledAttributes.hasValue(0);
        f10.g();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f4686p == null) {
            this.f4686p = LayoutInflater.from(getContext());
        }
        return this.f4686p;
    }

    private void setSubMenuArrowVisible(boolean z10) {
        ImageView imageView = this.f4678g;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f4679h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f4679h.getLayoutParams();
        rect.top = this.f4679h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
    
        if ((r0.f4787n.n() ? r0.f4783j : r0.f4782h) != 0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0120  */
    @Override // androidx.appcompat.view.menu.k.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(androidx.appcompat.view.menu.h r11) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.d(androidx.appcompat.view.menu.h):void");
    }

    @Override // androidx.appcompat.view.menu.k.a
    public h getItemData() {
        return this.f4672a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f4680j);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f4675d = textView;
        int i = this.f4681k;
        if (i != -1) {
            textView.setTextAppearance(this.f4682l, i);
        }
        this.f4677f = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f4678g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f4684n);
        }
        this.f4679h = (ImageView) findViewById(R.id.group_divider);
        this.i = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i9) {
        if (this.f4673b != null && this.f4683m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f4673b.getLayoutParams();
            int i10 = layoutParams.height;
            if (i10 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i10;
            }
        }
        super.onMeasure(i, i9);
    }

    public void setCheckable(boolean z10) {
        CompoundButton compoundButton;
        View view;
        if (!z10 && this.f4674c == null && this.f4676e == null) {
            return;
        }
        if ((this.f4672a.f4797x & 4) != 0) {
            if (this.f4674c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f4674c = radioButton;
                LinearLayout linearLayout = this.i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f4674c;
            view = this.f4676e;
        } else {
            if (this.f4676e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f4676e = checkBox;
                LinearLayout linearLayout2 = this.i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f4676e;
            view = this.f4674c;
        }
        if (z10) {
            compoundButton.setChecked(this.f4672a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f4676e;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f4674c;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z10) {
        CompoundButton compoundButton;
        if ((this.f4672a.f4797x & 4) != 0) {
            if (this.f4674c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f4674c = radioButton;
                LinearLayout linearLayout = this.i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f4674c;
        } else {
            if (this.f4676e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f4676e = checkBox;
                LinearLayout linearLayout2 = this.i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f4676e;
        }
        compoundButton.setChecked(z10);
    }

    public void setForceShowIcon(boolean z10) {
        this.f4687q = z10;
        this.f4683m = z10;
    }

    public void setGroupDividerEnabled(boolean z10) {
        ImageView imageView = this.f4679h;
        if (imageView != null) {
            imageView.setVisibility((this.f4685o || !z10) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f4672a.f4787n.getClass();
        boolean z10 = this.f4687q;
        if (z10 || this.f4683m) {
            ImageView imageView = this.f4673b;
            if (imageView == null && drawable == null && !this.f4683m) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f4673b = imageView2;
                LinearLayout linearLayout = this.i;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f4683m) {
                this.f4673b.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f4673b;
            if (!z10) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f4673b.getVisibility() != 0) {
                this.f4673b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f4675d.getVisibility() != 8) {
                this.f4675d.setVisibility(8);
            }
        } else {
            this.f4675d.setText(charSequence);
            if (this.f4675d.getVisibility() != 0) {
                this.f4675d.setVisibility(0);
            }
        }
    }
}
