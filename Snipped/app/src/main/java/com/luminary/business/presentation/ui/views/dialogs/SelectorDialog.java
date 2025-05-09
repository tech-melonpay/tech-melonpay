package com.luminary.business.presentation.ui.views.dialogs;

import F0.d;
import F0.f;
import F8.o;
import J7.b;
import O9.p;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.databinding.DataBinderMapperImpl;
import ca.InterfaceC0646l;
import com.airbnb.epoxy.Typed2EpoxyController;
import com.luminary.mobile.R;
import g8.g;
import java.util.ArrayList;
import java.util.List;
import n8.e;
import s6.b0;
import t6.K6;
import u7.C1522a;
import v8.DialogC1549a;
import y8.ViewOnClickListenerC1624e;

/* compiled from: SelectorDialog.kt */
/* loaded from: classes2.dex */
public final class SelectorDialog extends DialogC1549a {

    /* renamed from: q, reason: collision with root package name */
    public final K6 f13201q;

    /* renamed from: r, reason: collision with root package name */
    public SelectorController f13202r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f13203s;

    /* renamed from: t, reason: collision with root package name */
    public ArrayList f13204t;

    /* renamed from: u, reason: collision with root package name */
    public List<String> f13205u;

    /* renamed from: v, reason: collision with root package name */
    public InterfaceC0646l<? super String, p> f13206v;

    /* renamed from: w, reason: collision with root package name */
    public InterfaceC0646l<? super List<String>, p> f13207w;

    /* renamed from: x, reason: collision with root package name */
    public InterfaceC0646l<? super String, p> f13208x;

    /* compiled from: SelectorDialog.kt */
    public static final class SelectorController extends Typed2EpoxyController<List<? extends String>, List<? extends String>> {
        private boolean multiSelect;
        private final InterfaceC0646l<String, p> onClick;

        /* JADX WARN: Multi-variable type inference failed */
        public SelectorController(InterfaceC0646l<? super String, p> interfaceC0646l) {
            this.onClick = interfaceC0646l;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void buildModels$lambda$2$lambda$1$lambda$0(SelectorController selectorController, String str, View view) {
            InterfaceC0646l<String, p> interfaceC0646l = selectorController.onClick;
            if (interfaceC0646l != null) {
                interfaceC0646l.invoke(str);
            }
        }

        @Override // com.airbnb.epoxy.Typed2EpoxyController
        public /* bridge */ /* synthetic */ void buildModels(List<? extends String> list, List<? extends String> list2) {
            buildModels2((List<String>) list, (List<String>) list2);
        }

        public final void setMultiSelect(boolean z10) {
            this.multiSelect = z10;
        }

        /* renamed from: buildModels, reason: avoid collision after fix types in other method */
        public void buildModels2(List<String> list, List<String> list2) {
            if (list != null) {
                for (String str : list) {
                    Boolean valueOf = list2 != null ? Boolean.valueOf(list2.contains(str)) : null;
                    b0 b0Var = new b0();
                    b0Var.a("selector_" + str);
                    b0Var.d(str);
                    b0Var.c(valueOf);
                    b0Var.b(Boolean.valueOf(this.multiSelect));
                    b0Var.e(new ViewOnClickListenerC1624e(0, this, str));
                    add(b0Var);
                }
            }
        }
    }

    public SelectorDialog(Context context) {
        super(context, R.style.MyBottomSheetDialogTheme);
        LayoutInflater from = LayoutInflater.from(context);
        int i = K6.f28090t;
        DataBinderMapperImpl dataBinderMapperImpl = d.f1140a;
        K6 k62 = (K6) f.f(from, R.layout.selector_dialog, null, false, null);
        this.f13201q = k62;
        this.f13204t = new ArrayList();
        setCancelable(false);
        setContentView(k62.f1148d);
        setCanceledOnTouchOutside(false);
        j().setHideable(true);
        o.c(k62.f28091n, 500L, new g(this, 24));
        k62.f28092o.setOnClickListener(new b(this, 25));
    }

    public final void l() {
        o.b(this.f13201q.f28094q);
    }

    public final void m(List<String> list, boolean z10) {
        this.f13205u = list;
        this.f13203s = z10;
        if (!z10) {
            o.b(this.f13201q.f28091n);
        }
        SelectorController selectorController = this.f13202r;
        if (selectorController != null) {
            selectorController.setMultiSelect(z10);
        }
        SelectorController selectorController2 = this.f13202r;
        if (selectorController2 != null) {
            selectorController2.setData(list, this.f13204t);
        }
    }

    public final void n(String str) {
        this.f13201q.f28096s.setText(str);
    }

    @Override // com.google.android.material.bottomsheet.e, h.DialogC0783j, c.DialogC0616g, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        SelectorController selectorController = new SelectorController(new C1522a(this, 2));
        this.f13202r = selectorController;
        K6 k62 = this.f13201q;
        k62.f28093p.setAdapter(selectorController.getAdapter());
        k62.f28095r.addTextChangedListener(new a());
        k62.f28091n.setEnabled((this.f13204t.isEmpty() ^ true) && this.f13203s);
        View view = k62.f1148d;
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new e(view, this, 1));
        }
    }

    /* compiled from: TextView.kt */
    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            InterfaceC0646l<? super String, p> interfaceC0646l = SelectorDialog.this.f13208x;
            if (interfaceC0646l != null) {
                interfaceC0646l.invoke(String.valueOf(charSequence));
            }
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }
}
