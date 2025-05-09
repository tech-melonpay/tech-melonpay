package H3;

import C.v;
import android.app.Dialog;
import android.content.Context;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.hbb20.CountryCodePicker;
import com.luminary.mobile.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: CountryCodeAdapter.java */
/* loaded from: classes.dex */
public final class e extends RecyclerView.Adapter<a> implements V1.b {

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f1461d;

    /* renamed from: e, reason: collision with root package name */
    public List<com.hbb20.a> f1462e;

    /* renamed from: f, reason: collision with root package name */
    public TextView f1463f;

    /* renamed from: g, reason: collision with root package name */
    public CountryCodePicker f1464g;

    /* renamed from: h, reason: collision with root package name */
    public LayoutInflater f1465h;
    public EditText i;

    /* renamed from: j, reason: collision with root package name */
    public Dialog f1466j;

    /* renamed from: k, reason: collision with root package name */
    public Context f1467k;

    /* renamed from: l, reason: collision with root package name */
    public ImageView f1468l;

    /* renamed from: m, reason: collision with root package name */
    public int f1469m;

    /* compiled from: CountryCodeAdapter.java */
    public class a extends RecyclerView.C {

        /* renamed from: e, reason: collision with root package name */
        public final RelativeLayout f1470e;

        /* renamed from: f, reason: collision with root package name */
        public final TextView f1471f;

        /* renamed from: g, reason: collision with root package name */
        public final TextView f1472g;

        /* renamed from: h, reason: collision with root package name */
        public final ImageView f1473h;
        public final LinearLayout i;

        /* renamed from: j, reason: collision with root package name */
        public final View f1474j;

        public a(View view) {
            super(view);
            RelativeLayout relativeLayout = (RelativeLayout) view;
            this.f1470e = relativeLayout;
            TextView textView = (TextView) relativeLayout.findViewById(R.id.textView_countryName);
            this.f1471f = textView;
            TextView textView2 = (TextView) relativeLayout.findViewById(R.id.textView_code);
            this.f1472g = textView2;
            this.f1473h = (ImageView) relativeLayout.findViewById(R.id.image_flag);
            this.i = (LinearLayout) relativeLayout.findViewById(R.id.linear_flag_holder);
            View findViewById = relativeLayout.findViewById(R.id.preferenceDivider);
            this.f1474j = findViewById;
            int dialogTextColor = e.this.f1464g.getDialogTextColor();
            CountryCodePicker countryCodePicker = e.this.f1464g;
            if (dialogTextColor != 0) {
                textView.setTextColor(countryCodePicker.getDialogTextColor());
                textView2.setTextColor(countryCodePicker.getDialogTextColor());
                findViewById.setBackgroundColor(countryCodePicker.getDialogTextColor());
            }
            if (countryCodePicker.getCcpDialogRippleEnable()) {
                TypedValue typedValue = new TypedValue();
                e.this.f1467k.getTheme().resolveAttribute(android.R.attr.selectableItemBackground, typedValue, true);
                int i = typedValue.resourceId;
                if (i != 0) {
                    relativeLayout.setBackgroundResource(i);
                } else {
                    relativeLayout.setBackgroundResource(typedValue.data);
                }
            }
            try {
                if (countryCodePicker.getDialogTypeFace() != null) {
                    if (countryCodePicker.getDialogTypeFaceStyle() != -99) {
                        textView2.setTypeface(countryCodePicker.getDialogTypeFace(), countryCodePicker.getDialogTypeFaceStyle());
                        textView.setTypeface(countryCodePicker.getDialogTypeFace(), countryCodePicker.getDialogTypeFaceStyle());
                    } else {
                        textView2.setTypeface(countryCodePicker.getDialogTypeFace());
                        textView.setTypeface(countryCodePicker.getDialogTypeFace());
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    @Override // V1.b
    public final String c(int i) {
        com.hbb20.a aVar = (com.hbb20.a) this.f1461d.get(i);
        return this.f1469m > i ? "★" : aVar != null ? aVar.f10621c.substring(0, 1) : "☺";
    }

    public final ArrayList d(String str) {
        ArrayList arrayList = new ArrayList();
        this.f1469m = 0;
        CountryCodePicker countryCodePicker = this.f1464g;
        ArrayList arrayList2 = countryCodePicker.V;
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = countryCodePicker.V.iterator();
            while (it.hasNext()) {
                com.hbb20.a aVar = (com.hbb20.a) it.next();
                if (aVar.l(str)) {
                    arrayList.add(aVar);
                    this.f1469m++;
                }
            }
            if (arrayList.size() > 0) {
                arrayList.add(null);
                this.f1469m++;
            }
        }
        for (com.hbb20.a aVar2 : this.f1462e) {
            if (aVar2.l(str)) {
                arrayList.add(aVar2);
            }
        }
        return arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f1461d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(a aVar, int i) {
        a aVar2 = aVar;
        com.hbb20.a aVar3 = (com.hbb20.a) this.f1461d.get(i);
        View view = aVar2.f1474j;
        LinearLayout linearLayout = aVar2.i;
        TextView textView = aVar2.f1471f;
        TextView textView2 = aVar2.f1472g;
        if (aVar3 != null) {
            view.setVisibility(8);
            textView.setVisibility(0);
            textView2.setVisibility(0);
            e eVar = e.this;
            if (eVar.f1464g.f10598z) {
                textView2.setVisibility(0);
            } else {
                textView2.setVisibility(8);
            }
            CountryCodePicker countryCodePicker = eVar.f1464g;
            StringBuilder s10 = v.s((countryCodePicker.getCcpDialogShowFlag() && countryCodePicker.f10546M) ? com.hbb20.a.h(aVar3).concat("   ") : "");
            s10.append(aVar3.f10621c);
            String sb2 = s10.toString();
            if (countryCodePicker.getCcpDialogShowNameCode()) {
                StringBuilder r8 = androidx.camera.core.impl.utils.a.r(sb2, " (");
                r8.append(aVar3.f10619a.toUpperCase(Locale.US));
                r8.append(")");
                sb2 = r8.toString();
            }
            textView.setText(sb2);
            textView2.setText("+" + aVar3.f10620b);
            if (!countryCodePicker.getCcpDialogShowFlag() || countryCodePicker.f10546M) {
                linearLayout.setVisibility(8);
            } else {
                linearLayout.setVisibility(0);
                ImageView imageView = aVar2.f1473h;
                if (aVar3.f10623e == -99) {
                    aVar3.f10623e = com.hbb20.a.i(aVar3);
                }
                imageView.setImageResource(aVar3.f10623e);
            }
        } else {
            view.setVisibility(0);
            textView.setVisibility(8);
            textView2.setVisibility(8);
            linearLayout.setVisibility(8);
        }
        int size = this.f1461d.size();
        RelativeLayout relativeLayout = aVar2.f1470e;
        if (size <= i || this.f1461d.get(i) == null) {
            relativeLayout.setOnClickListener(null);
        } else {
            relativeLayout.setOnClickListener(new d(this, i));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(this.f1465h.inflate(R.layout.layout_recycler_country_tile, viewGroup, false));
    }
}
