package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.C0527a;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0530d;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.internal.CheckableImageButton;
import com.luminary.mobile.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import t2.C1279a;
import y0.C1596C;
import y0.E;
import y0.H;
import y0.L;

/* compiled from: MaterialDatePicker.java */
/* loaded from: classes.dex */
public final class l<S> extends DialogInterfaceOnCancelListenerC0530d {

    /* renamed from: A0, reason: collision with root package name */
    public CharSequence f9445A0;

    /* renamed from: B0, reason: collision with root package name */
    public TextView f9446B0;

    /* renamed from: C0, reason: collision with root package name */
    public TextView f9447C0;

    /* renamed from: D0, reason: collision with root package name */
    public CheckableImageButton f9448D0;

    /* renamed from: E0, reason: collision with root package name */
    public T2.f f9449E0;

    /* renamed from: F0, reason: collision with root package name */
    public Button f9450F0;

    /* renamed from: G0, reason: collision with root package name */
    public boolean f9451G0;

    /* renamed from: H0, reason: collision with root package name */
    public CharSequence f9452H0;

    /* renamed from: I0, reason: collision with root package name */
    public CharSequence f9453I0;

    /* renamed from: f0, reason: collision with root package name */
    public final LinkedHashSet<n<? super S>> f9454f0 = new LinkedHashSet<>();

    /* renamed from: g0, reason: collision with root package name */
    public final LinkedHashSet<View.OnClickListener> f9455g0 = new LinkedHashSet<>();

    /* renamed from: h0, reason: collision with root package name */
    public final LinkedHashSet<DialogInterface.OnCancelListener> f9456h0 = new LinkedHashSet<>();

    /* renamed from: i0, reason: collision with root package name */
    public final LinkedHashSet<DialogInterface.OnDismissListener> f9457i0 = new LinkedHashSet<>();

    /* renamed from: j0, reason: collision with root package name */
    public int f9458j0;

    /* renamed from: k0, reason: collision with root package name */
    public DateSelector<S> f9459k0;

    /* renamed from: l0, reason: collision with root package name */
    public t<S> f9460l0;

    /* renamed from: m0, reason: collision with root package name */
    public CalendarConstraints f9461m0;

    /* renamed from: n0, reason: collision with root package name */
    public DayViewDecorator f9462n0;

    /* renamed from: o0, reason: collision with root package name */
    public MaterialCalendar<S> f9463o0;

    /* renamed from: p0, reason: collision with root package name */
    public int f9464p0;

    /* renamed from: q0, reason: collision with root package name */
    public CharSequence f9465q0;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f9466r0;
    public int s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f9467t0;

    /* renamed from: u0, reason: collision with root package name */
    public CharSequence f9468u0;

    /* renamed from: v0, reason: collision with root package name */
    public int f9469v0;

    /* renamed from: w0, reason: collision with root package name */
    public CharSequence f9470w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f9471x0;

    /* renamed from: y0, reason: collision with root package name */
    public CharSequence f9472y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f9473z0;

    /* compiled from: MaterialDatePicker.java */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            l lVar = l.this;
            Iterator<n<? super S>> it = lVar.f9454f0.iterator();
            while (it.hasNext()) {
                it.next().a(lVar.o0().a0());
            }
            lVar.dismiss();
        }
    }

    /* compiled from: MaterialDatePicker.java */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            l lVar = l.this;
            Iterator<View.OnClickListener> it = lVar.f9455g0.iterator();
            while (it.hasNext()) {
                it.next().onClick(view);
            }
            lVar.dismiss();
        }
    }

    /* compiled from: MaterialDatePicker.java */
    public class c extends s<S> {
        public c() {
        }

        @Override // com.google.android.material.datepicker.s
        public final void a() {
            l.this.f9450F0.setEnabled(false);
        }

        @Override // com.google.android.material.datepicker.s
        public final void b(S s10) {
            l lVar = l.this;
            String i = lVar.o0().i(lVar.getContext());
            lVar.f9447C0.setContentDescription(lVar.o0().M(lVar.requireContext()));
            lVar.f9447C0.setText(i);
            lVar.f9450F0.setEnabled(lVar.o0().Q());
        }
    }

    /* compiled from: MaterialDatePicker.java */
    public static final class d<S> {

        /* renamed from: a, reason: collision with root package name */
        public final DateSelector<S> f9477a;

        /* renamed from: c, reason: collision with root package name */
        public CalendarConstraints f9479c;

        /* renamed from: b, reason: collision with root package name */
        public int f9478b = 0;

        /* renamed from: d, reason: collision with root package name */
        public int f9480d = 0;

        /* renamed from: e, reason: collision with root package name */
        public S f9481e = null;

        public d(DateSelector<S> dateSelector) {
            this.f9477a = dateSelector;
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0058, code lost:
        
            if (r2.compareTo(r3.f9366b) <= 0) goto L26;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.google.android.material.datepicker.l<S> a() {
            /*
                r5 = this;
                com.google.android.material.datepicker.CalendarConstraints r0 = r5.f9479c
                if (r0 != 0) goto Lf
                com.google.android.material.datepicker.CalendarConstraints$b r0 = new com.google.android.material.datepicker.CalendarConstraints$b
                r0.<init>()
                com.google.android.material.datepicker.CalendarConstraints r0 = r0.a()
                r5.f9479c = r0
            Lf:
                int r0 = r5.f9480d
                com.google.android.material.datepicker.DateSelector<S> r1 = r5.f9477a
                if (r0 != 0) goto L1b
                int r0 = r1.H()
                r5.f9480d = r0
            L1b:
                S r0 = r5.f9481e
                if (r0 == 0) goto L22
                r1.D(r0)
            L22:
                com.google.android.material.datepicker.CalendarConstraints r0 = r5.f9479c
                com.google.android.material.datepicker.Month r2 = r0.f9368d
                if (r2 != 0) goto L7d
                java.util.ArrayList r2 = r1.W()
                boolean r2 = r2.isEmpty()
                if (r2 != 0) goto L5b
                java.util.ArrayList r2 = r1.W()
                java.util.Iterator r2 = r2.iterator()
                java.lang.Object r2 = r2.next()
                java.lang.Long r2 = (java.lang.Long) r2
                long r2 = r2.longValue()
                com.google.android.material.datepicker.Month r2 = com.google.android.material.datepicker.Month.d(r2)
                com.google.android.material.datepicker.CalendarConstraints r3 = r5.f9479c
                com.google.android.material.datepicker.Month r4 = r3.f9365a
                int r4 = r2.compareTo(r4)
                if (r4 < 0) goto L5b
                com.google.android.material.datepicker.Month r3 = r3.f9366b
                int r3 = r2.compareTo(r3)
                if (r3 > 0) goto L5b
                goto L7b
            L5b:
                com.google.android.material.datepicker.Month r2 = new com.google.android.material.datepicker.Month
                java.util.Calendar r3 = com.google.android.material.datepicker.y.f()
                r2.<init>(r3)
                com.google.android.material.datepicker.CalendarConstraints r3 = r5.f9479c
                com.google.android.material.datepicker.Month r4 = r3.f9365a
                int r4 = r2.compareTo(r4)
                if (r4 < 0) goto L77
                com.google.android.material.datepicker.Month r3 = r3.f9366b
                int r3 = r2.compareTo(r3)
                if (r3 > 0) goto L77
                goto L7b
            L77:
                com.google.android.material.datepicker.CalendarConstraints r2 = r5.f9479c
                com.google.android.material.datepicker.Month r2 = r2.f9365a
            L7b:
                r0.f9368d = r2
            L7d:
                com.google.android.material.datepicker.l r0 = new com.google.android.material.datepicker.l
                r0.<init>()
                android.os.Bundle r2 = new android.os.Bundle
                r2.<init>()
                int r3 = r5.f9478b
                java.lang.String r4 = "OVERRIDE_THEME_RES_ID"
                r2.putInt(r4, r3)
                java.lang.String r3 = "DATE_SELECTOR_KEY"
                r2.putParcelable(r3, r1)
                java.lang.String r1 = "CALENDAR_CONSTRAINTS_KEY"
                com.google.android.material.datepicker.CalendarConstraints r3 = r5.f9479c
                r2.putParcelable(r1, r3)
                java.lang.String r1 = "DAY_VIEW_DECORATOR_KEY"
                r3 = 0
                r2.putParcelable(r1, r3)
                java.lang.String r1 = "TITLE_TEXT_RES_ID_KEY"
                int r4 = r5.f9480d
                r2.putInt(r1, r4)
                java.lang.String r1 = "TITLE_TEXT_KEY"
                r2.putCharSequence(r1, r3)
                java.lang.String r1 = "INPUT_MODE_KEY"
                r4 = 0
                r2.putInt(r1, r4)
                java.lang.String r1 = "POSITIVE_BUTTON_TEXT_RES_ID_KEY"
                r2.putInt(r1, r4)
                java.lang.String r1 = "POSITIVE_BUTTON_TEXT_KEY"
                r2.putCharSequence(r1, r3)
                java.lang.String r1 = "POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY"
                r2.putInt(r1, r4)
                java.lang.String r1 = "POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY"
                r2.putCharSequence(r1, r3)
                java.lang.String r1 = "NEGATIVE_BUTTON_TEXT_RES_ID_KEY"
                r2.putInt(r1, r4)
                java.lang.String r1 = "NEGATIVE_BUTTON_TEXT_KEY"
                r2.putCharSequence(r1, r3)
                java.lang.String r1 = "NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY"
                r2.putInt(r1, r4)
                java.lang.String r1 = "NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY"
                r2.putCharSequence(r1, r3)
                r0.setArguments(r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.l.d.a():com.google.android.material.datepicker.l");
        }
    }

    public static int p0(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Month month = new Month(y.f());
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width);
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding);
        int i = month.f9404d;
        return ((i - 1) * dimensionPixelOffset2) + (dimensionPixelSize * i) + (dimensionPixelOffset * 2);
    }

    public static boolean q0(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(P2.b.c(context, R.attr.materialCalendarStyle, MaterialCalendar.class.getCanonicalName()).data, new int[]{i});
        boolean z10 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z10;
    }

    public final DateSelector<S> o0() {
        if (this.f9459k0 == null) {
            this.f9459k0 = (DateSelector) getArguments().getParcelable("DATE_SELECTOR_KEY");
        }
        return this.f9459k0;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0530d, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.f9456h0.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0530d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f9458j0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f9459k0 = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f9461m0 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f9462n0 = (DayViewDecorator) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f9464p0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f9465q0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.s0 = bundle.getInt("INPUT_MODE_KEY");
        this.f9467t0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f9468u0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f9469v0 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f9470w0 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.f9471x0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f9472y0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.f9473z0 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f9445A0 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence charSequence = this.f9465q0;
        if (charSequence == null) {
            charSequence = requireContext().getResources().getText(this.f9464p0);
        }
        this.f9452H0 = charSequence;
        if (charSequence != null) {
            CharSequence[] split = TextUtils.split(String.valueOf(charSequence), "\n");
            if (split.length > 1) {
                charSequence = split[0];
            }
        } else {
            charSequence = null;
        }
        this.f9453I0 = charSequence;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0530d
    public final Dialog onCreateDialog(Bundle bundle) {
        Context requireContext = requireContext();
        Context requireContext2 = requireContext();
        int i = this.f9458j0;
        if (i == 0) {
            i = o0().N(requireContext2);
        }
        Dialog dialog = new Dialog(requireContext, i);
        Context context = dialog.getContext();
        this.f9466r0 = q0(context, android.R.attr.windowFullscreen);
        this.f9449E0 = new T2.f(context, null, R.attr.materialCalendarStyle, 2132083878);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, C1279a.f27505w, R.attr.materialCalendarStyle, 2132083878);
        int color = obtainStyledAttributes.getColor(1, 0);
        obtainStyledAttributes.recycle();
        this.f9449E0.k(context);
        this.f9449E0.o(ColorStateList.valueOf(color));
        T2.f fVar = this.f9449E0;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
        fVar.n(C1596C.d.e(decorView));
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.f9466r0 ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        DayViewDecorator dayViewDecorator = this.f9462n0;
        if (dayViewDecorator != null) {
            dayViewDecorator.getClass();
        }
        if (this.f9466r0) {
            inflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(p0(context), -2));
        } else {
            inflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(p0(context), -1));
        }
        TextView textView = (TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text);
        this.f9447C0 = textView;
        WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
        textView.setAccessibilityLiveRegion(1);
        this.f9448D0 = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.f9446B0 = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        this.f9448D0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f9448D0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, U4.b.j(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], U4.b.j(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.f9448D0.setChecked(this.s0 != 0);
        C1596C.o(this.f9448D0, null);
        s0(this.f9448D0);
        this.f9448D0.setOnClickListener(new J7.b(this, 7));
        this.f9450F0 = (Button) inflate.findViewById(R.id.confirm_button);
        if (o0().Q()) {
            this.f9450F0.setEnabled(true);
        } else {
            this.f9450F0.setEnabled(false);
        }
        this.f9450F0.setTag("CONFIRM_BUTTON_TAG");
        CharSequence charSequence = this.f9468u0;
        if (charSequence != null) {
            this.f9450F0.setText(charSequence);
        } else {
            int i = this.f9467t0;
            if (i != 0) {
                this.f9450F0.setText(i);
            }
        }
        CharSequence charSequence2 = this.f9470w0;
        if (charSequence2 != null) {
            this.f9450F0.setContentDescription(charSequence2);
        } else if (this.f9469v0 != 0) {
            this.f9450F0.setContentDescription(getContext().getResources().getText(this.f9469v0));
        }
        this.f9450F0.setOnClickListener(new a());
        Button button = (Button) inflate.findViewById(R.id.cancel_button);
        button.setTag("CANCEL_BUTTON_TAG");
        CharSequence charSequence3 = this.f9472y0;
        if (charSequence3 != null) {
            button.setText(charSequence3);
        } else {
            int i9 = this.f9471x0;
            if (i9 != 0) {
                button.setText(i9);
            }
        }
        CharSequence charSequence4 = this.f9445A0;
        if (charSequence4 != null) {
            button.setContentDescription(charSequence4);
        } else if (this.f9473z0 != 0) {
            button.setContentDescription(getContext().getResources().getText(this.f9473z0));
        }
        button.setOnClickListener(new b());
        return inflate;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0530d, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.f9457i0.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0530d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f9458j0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f9459k0);
        CalendarConstraints calendarConstraints = this.f9461m0;
        CalendarConstraints.b bVar = new CalendarConstraints.b();
        bVar.f9374a = CalendarConstraints.b.f9372f;
        bVar.f9375b = CalendarConstraints.b.f9373g;
        bVar.f9378e = new DateValidatorPointForward(Long.MIN_VALUE);
        bVar.f9374a = calendarConstraints.f9365a.f9406f;
        bVar.f9375b = calendarConstraints.f9366b.f9406f;
        bVar.f9376c = Long.valueOf(calendarConstraints.f9368d.f9406f);
        bVar.f9377d = calendarConstraints.f9369e;
        bVar.f9378e = calendarConstraints.f9367c;
        MaterialCalendar<S> materialCalendar = this.f9463o0;
        Month month = materialCalendar == null ? null : materialCalendar.f9385k0;
        if (month != null) {
            bVar.f9376c = Long.valueOf(month.f9406f);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar.a());
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f9462n0);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f9464p0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f9465q0);
        bundle.putInt("INPUT_MODE_KEY", this.s0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f9467t0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f9468u0);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f9469v0);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f9470w0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f9471x0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f9472y0);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f9473z0);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f9445A0);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0530d, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.f9466r0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f9449E0);
            if (!this.f9451G0) {
                View findViewById = requireView().findViewById(R.id.fullscreen_header);
                ColorStateList a10 = F2.a.a(findViewById.getBackground());
                Integer valueOf = a10 != null ? Integer.valueOf(a10.getDefaultColor()) : null;
                int i = Build.VERSION.SDK_INT;
                boolean z10 = false;
                boolean z11 = valueOf == null || valueOf.intValue() == 0;
                int y10 = D9.b.y(window.getContext(), android.R.attr.colorBackground, -16777216);
                if (z11) {
                    valueOf = Integer.valueOf(y10);
                }
                H.a(window, false);
                window.getContext();
                int h9 = i < 27 ? n0.a.h(D9.b.y(window.getContext(), android.R.attr.navigationBarColor, -16777216), 128) : 0;
                window.setStatusBarColor(0);
                window.setNavigationBarColor(h9);
                boolean z12 = D9.b.Y(0) || D9.b.Y(valueOf.intValue());
                y0.t tVar = new y0.t(window.getDecorView());
                int i9 = Build.VERSION.SDK_INT;
                (i9 >= 35 ? new L.f(window, tVar) : i9 >= 30 ? new L.d(window, tVar) : new L.c(window, tVar)).d(z12);
                boolean Y = D9.b.Y(y10);
                if (D9.b.Y(h9) || (h9 == 0 && Y)) {
                    z10 = true;
                }
                y0.t tVar2 = new y0.t(window.getDecorView());
                int i10 = Build.VERSION.SDK_INT;
                (i10 >= 35 ? new L.f(window, tVar2) : i10 >= 30 ? new L.d(window, tVar2) : new L.c(window, tVar2)).c(z10);
                m mVar = new m(findViewById, findViewById.getLayoutParams().height, findViewById.getPaddingTop());
                WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
                C1596C.d.m(findViewById, mVar);
                this.f9451G0 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f9449E0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new E2.a(requireDialog(), rect));
        }
        r0();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0530d, androidx.fragment.app.Fragment
    public final void onStop() {
        this.f9460l0.f9506f0.clear();
        super.onStop();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.fragment.app.Fragment, com.google.android.material.datepicker.o] */
    public final void r0() {
        Context requireContext = requireContext();
        int i = this.f9458j0;
        if (i == 0) {
            i = o0().N(requireContext);
        }
        DateSelector<S> o02 = o0();
        CalendarConstraints calendarConstraints = this.f9461m0;
        DayViewDecorator dayViewDecorator = this.f9462n0;
        MaterialCalendar<S> materialCalendar = new MaterialCalendar<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable("GRID_SELECTOR_KEY", o02);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", dayViewDecorator);
        bundle.putParcelable("CURRENT_MONTH_KEY", calendarConstraints.f9368d);
        materialCalendar.setArguments(bundle);
        this.f9463o0 = materialCalendar;
        if (this.s0 == 1) {
            DateSelector<S> o03 = o0();
            CalendarConstraints calendarConstraints2 = this.f9461m0;
            ?? oVar = new o();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i);
            bundle2.putParcelable("DATE_SELECTOR_KEY", o03);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints2);
            oVar.setArguments(bundle2);
            materialCalendar = oVar;
        }
        this.f9460l0 = materialCalendar;
        this.f9446B0.setText((this.s0 == 1 && getResources().getConfiguration().orientation == 2) ? this.f9453I0 : this.f9452H0);
        String i9 = o0().i(getContext());
        this.f9447C0.setContentDescription(o0().M(requireContext()));
        this.f9447C0.setText(i9);
        FragmentManager childFragmentManager = getChildFragmentManager();
        childFragmentManager.getClass();
        C0527a c0527a = new C0527a(childFragmentManager);
        c0527a.e(R.id.mtrl_calendar_frame, this.f9460l0, null);
        c0527a.j();
        this.f9460l0.c(new c());
    }

    public final void s0(CheckableImageButton checkableImageButton) {
        this.f9448D0.setContentDescription(this.s0 == 1 ? checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
    }
}
