package com.luminary.business.presentation.ui.views.tagview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.luminary.mobile.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import pa.C1124b;
import s6.a0;
import z8.C1652b;
import z8.ViewTreeObserverOnGlobalLayoutListenerC1653c;

/* loaded from: classes2.dex */
public class TagView extends RelativeLayout {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f13239l = 0;

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f13240a;

    /* renamed from: b, reason: collision with root package name */
    public final LayoutInflater f13241b;

    /* renamed from: c, reason: collision with root package name */
    public e f13242c;

    /* renamed from: d, reason: collision with root package name */
    public int f13243d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f13244e;

    /* renamed from: f, reason: collision with root package name */
    public int f13245f;

    /* renamed from: g, reason: collision with root package name */
    public int f13246g;

    /* renamed from: h, reason: collision with root package name */
    public int f13247h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f13248j;

    /* renamed from: k, reason: collision with root package name */
    public int f13249k;

    public class a implements View.OnClickListener {
        public a(C1652b c1652b, int i) {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i = TagView.f13239l;
            TagView.this.getClass();
        }
    }

    public class b implements View.OnLongClickListener {
        public b(C1652b c1652b, int i) {
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            int i = TagView.f13239l;
            TagView.this.getClass();
            return true;
        }
    }

    public class c implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f13252a;

        public c(C1652b c1652b, int i) {
            this.f13252a = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            e eVar = TagView.this.f13242c;
            if (eVar != null) {
                eVar.d(this.f13252a);
            }
        }
    }

    public interface d {
    }

    public interface e {
        void d(int i);
    }

    public interface f {
    }

    public TagView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13240a = new ArrayList();
        this.f13244e = false;
        this.f13241b = (LayoutInflater) context.getSystemService("layout_inflater");
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC1653c(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a0.f26781f, 0, 0);
        this.f13245f = (int) obtainStyledAttributes.getDimension(0, C1124b.v(getContext(), 5.0f));
        this.f13246g = (int) obtainStyledAttributes.getDimension(1, C1124b.v(getContext(), 5.0f));
        this.f13247h = (int) obtainStyledAttributes.getDimension(3, C1124b.v(getContext(), 0.0f));
        this.i = (int) obtainStyledAttributes.getDimension(4, C1124b.v(getContext(), 0.0f));
        this.f13248j = (int) obtainStyledAttributes.getDimension(5, C1124b.v(getContext(), 0.0f));
        this.f13249k = (int) obtainStyledAttributes.getDimension(2, C1124b.v(getContext(), 0.0f));
        obtainStyledAttributes.recycle();
    }

    public final void a(ArrayList arrayList) {
        this.f13240a = new ArrayList();
        if (arrayList.isEmpty()) {
            b();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f13240a.add((C1652b) it.next());
        }
        b();
    }

    public final void b() {
        if (this.f13244e) {
            removeAllViews();
            float paddingRight = getPaddingRight() + getPaddingLeft();
            Iterator it = this.f13240a.iterator();
            ViewGroup viewGroup = null;
            C1652b c1652b = null;
            int i = 1;
            int i9 = 1;
            int i10 = 1;
            while (it.hasNext()) {
                C1652b c1652b2 = (C1652b) it.next();
                int i11 = i - 1;
                View inflate = this.f13241b.inflate(R.layout.tagview_item, viewGroup);
                inflate.setId(i);
                TextView textView = (TextView) inflate.findViewById(R.id.tv_tag_item_contain);
                textView.setText(c1652b2.f31340a);
                textView.setLayoutParams((LinearLayout.LayoutParams) textView.getLayoutParams());
                textView.setTextColor(c1652b2.f31341b);
                textView.setTextSize(2, c1652b2.f31342c);
                inflate.setOnClickListener(new a(c1652b2, i11));
                inflate.setOnLongClickListener(new b(c1652b2, i11));
                float measureText = textView.getPaint().measureText(c1652b2.f31340a) + this.f13247h + this.i;
                ImageView imageView = (ImageView) inflate.findViewById(R.id.tv_tag_item_delete);
                if (c1652b2.f31343d) {
                    imageView.setVisibility(0);
                    int v10 = C1124b.v(getContext(), 2.0f);
                    imageView.setPadding(v10, this.f13248j, this.i + v10, this.f13249k);
                    imageView.setOnClickListener(new c(c1652b2, i11));
                    measureText += C1124b.v(getContext(), 50.0f) + this.f13247h + this.i;
                } else {
                    imageView.setVisibility(8);
                }
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.bottomMargin = this.f13245f;
                if (this.f13243d <= paddingRight + measureText + C1124b.v(getContext(), 2.0f)) {
                    if (c1652b != null) {
                        layoutParams.addRule(3, i10);
                    }
                    paddingRight = getPaddingRight() + getPaddingLeft();
                    i9 = i;
                    i10 = i9;
                } else {
                    layoutParams.addRule(6, i9);
                    if (i != i9) {
                        layoutParams.addRule(1, i11);
                        int i12 = this.f13246g;
                        layoutParams.leftMargin = i12;
                        paddingRight += i12;
                        if (c1652b.f31342c < c1652b2.f31342c) {
                            i10 = i;
                        }
                    }
                }
                paddingRight += measureText;
                addView(inflate, layoutParams);
                i++;
                c1652b = c1652b2;
                viewGroup = null;
            }
        }
    }

    public final void c(int i) {
        if (i < this.f13240a.size()) {
            this.f13240a.remove(i);
            b();
        }
    }

    public int getLineMargin() {
        return this.f13245f;
    }

    public int getTagMargin() {
        return this.f13246g;
    }

    public List<C1652b> getTags() {
        return this.f13240a;
    }

    public int getTextPaddingLeft() {
        return this.f13247h;
    }

    public int getTextPaddingRight() {
        return this.i;
    }

    public int getTextPaddingTop() {
        return this.f13248j;
    }

    public int gettextPaddingBottom() {
        return this.f13249k;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        b();
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i, int i9) {
        super.onMeasure(i, i9);
        if (getMeasuredWidth() <= 0) {
            return;
        }
        this.f13243d = getMeasuredWidth();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i9, int i10, int i11) {
        super.onSizeChanged(i, i9, i10, i11);
        this.f13243d = i;
    }

    public void setLineMargin(float f10) {
        this.f13245f = C1124b.v(getContext(), f10);
    }

    public void setOnTagDeleteListener(e eVar) {
        this.f13242c = eVar;
    }

    public void setTagMargin(float f10) {
        this.f13246g = C1124b.v(getContext(), f10);
    }

    public void setTextPaddingLeft(float f10) {
        this.f13247h = C1124b.v(getContext(), f10);
    }

    public void setTextPaddingRight(float f10) {
        this.i = C1124b.v(getContext(), f10);
    }

    public void setTextPaddingTop(float f10) {
        this.f13248j = C1124b.v(getContext(), f10);
    }

    public void settextPaddingBottom(float f10) {
        this.f13249k = C1124b.v(getContext(), f10);
    }

    public void setOnTagClickListener(d dVar) {
    }

    public void setOnTagLongClickListener(f fVar) {
    }
}
