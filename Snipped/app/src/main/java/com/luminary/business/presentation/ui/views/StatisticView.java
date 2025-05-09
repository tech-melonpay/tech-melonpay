package com.luminary.business.presentation.ui.views;

import F0.d;
import F0.f;
import F8.o;
import I5.p;
import P9.m;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapperImpl;
import com.luminary.business.presentation.ui.views.StatisticView;
import com.luminary.business.presentation.ui.views.dialogs.SortStatisticsDialog;
import com.luminary.mobile.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import t6.M6;

/* compiled from: StatisticView.kt */
/* loaded from: classes2.dex */
public final class StatisticView extends ConstraintLayout {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f13174b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final M6 f13175a;

    public StatisticView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater from = LayoutInflater.from(getContext());
        int i = M6.f28205o;
        DataBinderMapperImpl dataBinderMapperImpl = d.f1140a;
        this.f13175a = (M6) f.f(from, R.layout.statistic_view, this, true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [T, android.view.View] */
    /* JADX WARN: Type inference failed for: r0v20, types: [T, android.view.View] */
    /* JADX WARN: Type inference failed for: r0v24, types: [T, android.view.View] */
    /* JADX WARN: Type inference failed for: r3v2, types: [T, android.view.View] */
    public final void a(ArrayList<p.a.C0022a> arrayList, ArrayList<String> arrayList2, int i, String str, SortStatisticsDialog.StatisticType statisticType) {
        String format;
        final Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
        Iterator<p.a.C0022a> it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float parseFloat = Float.parseFloat(it.next().f1872a);
        while (it.hasNext()) {
            parseFloat = Math.max(parseFloat, Float.parseFloat(it.next().f1872a));
        }
        ref$FloatRef.f23176a = parseFloat;
        M6 m62 = this.f13175a;
        m62.f28206n.removeAllViews();
        Iterator<p.a.C0022a> it2 = arrayList.iterator();
        int i9 = 0;
        while (it2.hasNext()) {
            p.a.C0022a next = it2.next();
            int i10 = i9 + 1;
            if (i9 < 0) {
                m.t();
                throw null;
            }
            final p.a.C0022a c0022a = next;
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.item_line_statistic, (ViewGroup) null);
            final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ref$ObjectRef.f23179a = inflate.findViewById(R.id.fullLine);
            TextView textView = (TextView) inflate.findViewById(R.id.titleTextView);
            String str2 = arrayList2.get(i9);
            if (str2.length() == 0) {
                format = "";
            } else {
                Date parse = new SimpleDateFormat("yyyy-MM-dd", Locale.US).parse(str2);
                switch (statisticType.ordinal()) {
                    case 0:
                        throw new NotImplementedError();
                    case 1:
                        format = new SimpleDateFormat("EE", Locale.ENGLISH).format(parse);
                        break;
                    case 2:
                        format = new SimpleDateFormat("dd.MM").format(parse);
                        break;
                    case 3:
                        format = new SimpleDateFormat("MMM", Locale.ENGLISH).format(parse);
                        break;
                    case 4:
                        format = new SimpleDateFormat("EE", Locale.ENGLISH).format(parse);
                        break;
                    case 5:
                        format = new SimpleDateFormat("dd.MM").format(parse);
                        break;
                    case 6:
                        format = new SimpleDateFormat("MMM", Locale.ENGLISH).format(parse);
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
            textView.setText(format);
            final Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
            ref$ObjectRef2.f23179a = inflate.findViewById(R.id.shortText);
            final Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
            ref$ObjectRef3.f23179a = inflate.findViewById(R.id.longText);
            ((TextView) ref$ObjectRef2.f23179a).setText(str + c0022a.b() + c0022a.a());
            final Ref$ObjectRef ref$ObjectRef4 = new Ref$ObjectRef();
            ?? findViewById = inflate.findViewById(R.id.currentLine);
            ref$ObjectRef4.f23179a = findViewById;
            findViewById.setBackgroundResource(i == 0 ? R.drawable.bg_line_active_incoming : R.drawable.bg_line_active_outgoing);
            LinearLayout linearLayout = m62.f28206n;
            linearLayout.addView(inflate);
            linearLayout.post(new Runnable() { // from class: v8.b
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public final void run() {
                    int i11 = StatisticView.f13174b;
                    Ref$ObjectRef ref$ObjectRef5 = Ref$ObjectRef.this;
                    View view = (View) ref$ObjectRef5.f23179a;
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                    int parseFloat2 = (int) (Float.parseFloat(c0022a.f1872a) * (((View) ref$ObjectRef.f23179a).getWidth() / ref$FloatRef.f23176a));
                    layoutParams.width = parseFloat2;
                    Ref$ObjectRef ref$ObjectRef6 = ref$ObjectRef3;
                    Ref$ObjectRef ref$ObjectRef7 = ref$ObjectRef2;
                    if (parseFloat2 == 0) {
                        o.b((View) ref$ObjectRef5.f23179a);
                        ((View) ref$ObjectRef6.f23179a).setVisibility(0);
                        ((TextView) ref$ObjectRef6.f23179a).setText(((TextView) ref$ObjectRef7.f23179a).getText());
                        o.b((View) ref$ObjectRef7.f23179a);
                    } else {
                        ((View) ref$ObjectRef5.f23179a).setVisibility(0);
                        if (((TextView) ref$ObjectRef7.f23179a).getRight() > layoutParams.width) {
                            ((View) ref$ObjectRef6.f23179a).setVisibility(0);
                            ((TextView) ref$ObjectRef6.f23179a).setText(((TextView) ref$ObjectRef7.f23179a).getText());
                            o.b((View) ref$ObjectRef7.f23179a);
                        }
                    }
                    view.setLayoutParams(layoutParams);
                }
            });
            i9 = i10;
        }
    }
}
