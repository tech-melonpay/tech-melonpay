package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.customview.view.AbsSavedState;
import com.google.android.gms.actions.SearchIntents;
import com.luminary.mobile.R;
import g.C0756a;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import m.C1001c;
import m.Q;
import m.S;
import m.T;
import m.Z;
import m.c0;
import y0.C1596C;

/* loaded from: classes.dex */
public class SearchView extends LinearLayoutCompat implements k.b {

    /* renamed from: j0, reason: collision with root package name */
    public static final m f4985j0;

    /* renamed from: A, reason: collision with root package name */
    public final Rect f4986A;

    /* renamed from: B, reason: collision with root package name */
    public final int[] f4987B;

    /* renamed from: C, reason: collision with root package name */
    public final int[] f4988C;

    /* renamed from: D, reason: collision with root package name */
    public final ImageView f4989D;

    /* renamed from: E, reason: collision with root package name */
    public final Drawable f4990E;

    /* renamed from: F, reason: collision with root package name */
    public final int f4991F;

    /* renamed from: G, reason: collision with root package name */
    public final int f4992G;

    /* renamed from: H, reason: collision with root package name */
    public final Intent f4993H;

    /* renamed from: I, reason: collision with root package name */
    public final Intent f4994I;

    /* renamed from: J, reason: collision with root package name */
    public final CharSequence f4995J;

    /* renamed from: K, reason: collision with root package name */
    public k f4996K;

    /* renamed from: L, reason: collision with root package name */
    public View.OnFocusChangeListener f4997L;

    /* renamed from: M, reason: collision with root package name */
    public View.OnClickListener f4998M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f4999N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f5000O;

    /* renamed from: P, reason: collision with root package name */
    public C0.a f5001P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f5002Q;
    public CharSequence R;
    public boolean S;
    public boolean T;
    public int U;
    public boolean V;
    public String W;

    /* renamed from: a0, reason: collision with root package name */
    public CharSequence f5003a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f5004b0;

    /* renamed from: c0, reason: collision with root package name */
    public int f5005c0;

    /* renamed from: d0, reason: collision with root package name */
    public SearchableInfo f5006d0;

    /* renamed from: f0, reason: collision with root package name */
    public Bundle f5007f0;

    /* renamed from: g0, reason: collision with root package name */
    public final b f5008g0;

    /* renamed from: h0, reason: collision with root package name */
    public final c f5009h0;

    /* renamed from: i0, reason: collision with root package name */
    public final WeakHashMap<String, Drawable.ConstantState> f5010i0;

    /* renamed from: p, reason: collision with root package name */
    public final SearchAutoComplete f5011p;

    /* renamed from: q, reason: collision with root package name */
    public final View f5012q;

    /* renamed from: r, reason: collision with root package name */
    public final View f5013r;

    /* renamed from: s, reason: collision with root package name */
    public final View f5014s;

    /* renamed from: t, reason: collision with root package name */
    public final ImageView f5015t;

    /* renamed from: u, reason: collision with root package name */
    public final ImageView f5016u;

    /* renamed from: v, reason: collision with root package name */
    public final ImageView f5017v;

    /* renamed from: w, reason: collision with root package name */
    public final ImageView f5018w;

    /* renamed from: x, reason: collision with root package name */
    public final View f5019x;

    /* renamed from: y, reason: collision with root package name */
    public n f5020y;

    /* renamed from: z, reason: collision with root package name */
    public final Rect f5021z;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        public boolean f5022c;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f5022c = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SearchView.SavedState{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" isIconified=");
            return com.google.android.gms.measurement.internal.a.k(sb2, this.f5022c, "}");
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.f5022c));
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            SearchView.this.u();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C0.a aVar = SearchView.this.f5001P;
            if (aVar instanceof T) {
                aVar.c(null);
            }
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            SearchView searchView = SearchView.this;
            ImageView imageView = searchView.f5015t;
            SearchAutoComplete searchAutoComplete = searchView.f5011p;
            if (view == imageView) {
                searchView.y(false);
                searchAutoComplete.requestFocus();
                searchAutoComplete.setImeVisibility(true);
                View.OnClickListener onClickListener = searchView.f4998M;
                if (onClickListener != null) {
                    onClickListener.onClick(searchView);
                    return;
                }
                return;
            }
            if (view == searchView.f5017v) {
                searchView.o();
                return;
            }
            if (view == searchView.f5016u) {
                searchView.s();
                return;
            }
            if (view != searchView.f5018w) {
                if (view == searchAutoComplete) {
                    searchView.n();
                    return;
                }
                return;
            }
            SearchableInfo searchableInfo = searchView.f5006d0;
            if (searchableInfo == null) {
                return;
            }
            try {
                if (!searchableInfo.getVoiceSearchLaunchWebSearch()) {
                    if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                        searchView.getContext().startActivity(searchView.m(searchView.f4994I, searchableInfo));
                    }
                } else {
                    Intent intent = new Intent(searchView.f4993H);
                    ComponentName searchActivity = searchableInfo.getSearchActivity();
                    intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                    searchView.getContext().startActivity(intent);
                }
            } catch (ActivityNotFoundException unused) {
                Log.w("SearchView", "Could not find voice search activity");
            }
        }
    }

    public class e implements View.OnKeyListener {
        public e() {
        }

        @Override // android.view.View.OnKeyListener
        public final boolean onKey(View view, int i, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f5006d0 == null) {
                return false;
            }
            SearchAutoComplete searchAutoComplete = searchView.f5011p;
            if (!searchAutoComplete.isPopupShowing() || searchAutoComplete.getListSelection() == -1) {
                if (TextUtils.getTrimmedLength(searchAutoComplete.getText()) == 0 || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                    return false;
                }
                view.cancelLongPress();
                searchView.getContext().startActivity(searchView.l(null, "android.intent.action.SEARCH", null, searchAutoComplete.getText().toString()));
                return true;
            }
            if (searchView.f5006d0 == null || searchView.f5001P == null || keyEvent.getAction() != 0 || !keyEvent.hasNoModifiers()) {
                return false;
            }
            if (i == 66 || i == 84 || i == 61) {
                searchView.p(searchAutoComplete.getListSelection());
            } else {
                if (i != 21 && i != 22) {
                    if (i != 19) {
                        return false;
                    }
                    searchAutoComplete.getListSelection();
                    return false;
                }
                searchAutoComplete.setSelection(i == 21 ? 0 : searchAutoComplete.length());
                searchAutoComplete.setListSelection(0);
                searchAutoComplete.clearListSelection();
                searchAutoComplete.a();
            }
            return true;
        }
    }

    public class f implements TextView.OnEditorActionListener {
        public f() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            SearchView.this.s();
            return true;
        }
    }

    public class g implements AdapterView.OnItemClickListener {
        public g() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j10) {
            SearchView.this.p(i);
        }
    }

    public static class i {
        public static void a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        public static void b(SearchAutoComplete searchAutoComplete, int i) {
            searchAutoComplete.setInputMethodMode(i);
        }
    }

    public interface j {
    }

    public interface k {
        void b(String str);

        boolean n0();
    }

    public interface l {
    }

    public static class m {

        /* renamed from: a, reason: collision with root package name */
        public Method f5036a;

        /* renamed from: b, reason: collision with root package name */
        public Method f5037b;

        /* renamed from: c, reason: collision with root package name */
        public Method f5038c;

        public static void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }
    }

    public static class n extends TouchDelegate {

        /* renamed from: a, reason: collision with root package name */
        public final View f5039a;

        /* renamed from: b, reason: collision with root package name */
        public final Rect f5040b;

        /* renamed from: c, reason: collision with root package name */
        public final Rect f5041c;

        /* renamed from: d, reason: collision with root package name */
        public final Rect f5042d;

        /* renamed from: e, reason: collision with root package name */
        public final int f5043e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f5044f;

        public n(Rect rect, Rect rect2, SearchAutoComplete searchAutoComplete) {
            super(rect, searchAutoComplete);
            int scaledTouchSlop = ViewConfiguration.get(searchAutoComplete.getContext()).getScaledTouchSlop();
            this.f5043e = scaledTouchSlop;
            Rect rect3 = new Rect();
            this.f5040b = rect3;
            Rect rect4 = new Rect();
            this.f5042d = rect4;
            Rect rect5 = new Rect();
            this.f5041c = rect5;
            rect3.set(rect);
            rect4.set(rect);
            int i = -scaledTouchSlop;
            rect4.inset(i, i);
            rect5.set(rect2);
            this.f5039a = searchAutoComplete;
        }

        @Override // android.view.TouchDelegate
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z10;
            boolean z11;
            int x9 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z12 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z11 = this.f5044f;
                    if (z11 && !this.f5042d.contains(x9, y10)) {
                        z12 = z11;
                        z10 = false;
                    }
                } else {
                    if (action == 3) {
                        z11 = this.f5044f;
                        this.f5044f = false;
                    }
                    z10 = true;
                    z12 = false;
                }
                z12 = z11;
                z10 = true;
            } else {
                if (this.f5040b.contains(x9, y10)) {
                    this.f5044f = true;
                    z10 = true;
                }
                z10 = true;
                z12 = false;
            }
            if (!z12) {
                return false;
            }
            Rect rect = this.f5041c;
            View view = this.f5039a;
            if (!z10 || rect.contains(x9, y10)) {
                motionEvent.setLocation(x9 - rect.left, y10 - rect.top);
            } else {
                motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
            }
            return view.dispatchTouchEvent(motionEvent);
        }
    }

    static {
        m mVar = null;
        if (Build.VERSION.SDK_INT < 29) {
            m mVar2 = new m();
            mVar2.f5036a = null;
            mVar2.f5037b = null;
            mVar2.f5038c = null;
            m.a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                mVar2.f5036a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                mVar2.f5037b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                mVar2.f5038c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
            mVar = mVar2;
        }
        f4985j0 = mVar;
    }

    public SearchView(Context context) {
        super(context, null, R.attr.searchViewStyle);
        this.f5021z = new Rect();
        this.f4986A = new Rect();
        this.f4987B = new int[2];
        this.f4988C = new int[2];
        this.f5008g0 = new b();
        this.f5009h0 = new c();
        this.f5010i0 = new WeakHashMap<>();
        d dVar = new d();
        e eVar = new e();
        f fVar = new f();
        g gVar = new g();
        h hVar = new h();
        a aVar = new a();
        int[] iArr = C0756a.f20748u;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, iArr, R.attr.searchViewStyle, 0);
        Z z10 = new Z(context, obtainStyledAttributes);
        C1596C.n(this, context, iArr, null, obtainStyledAttributes, R.attr.searchViewStyle);
        LayoutInflater.from(context).inflate(obtainStyledAttributes.getResourceId(19, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f5011p = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f5012q = findViewById(R.id.search_edit_frame);
        View findViewById = findViewById(R.id.search_plate);
        this.f5013r = findViewById;
        View findViewById2 = findViewById(R.id.submit_area);
        this.f5014s = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.f5015t = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.f5016u = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.f5017v = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.f5018w = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.f4989D = imageView5;
        findViewById.setBackground(z10.b(20));
        findViewById2.setBackground(z10.b(25));
        imageView.setImageDrawable(z10.b(23));
        imageView2.setImageDrawable(z10.b(15));
        imageView3.setImageDrawable(z10.b(12));
        imageView4.setImageDrawable(z10.b(28));
        imageView5.setImageDrawable(z10.b(23));
        this.f4990E = z10.b(22);
        c0.a(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.f4991F = obtainStyledAttributes.getResourceId(26, R.layout.abc_search_dropdown_item_icons_2line);
        this.f4992G = obtainStyledAttributes.getResourceId(13, 0);
        imageView.setOnClickListener(dVar);
        imageView3.setOnClickListener(dVar);
        imageView2.setOnClickListener(dVar);
        imageView4.setOnClickListener(dVar);
        searchAutoComplete.setOnClickListener(dVar);
        searchAutoComplete.addTextChangedListener(aVar);
        searchAutoComplete.setOnEditorActionListener(fVar);
        searchAutoComplete.setOnItemClickListener(gVar);
        searchAutoComplete.setOnItemSelectedListener(hVar);
        searchAutoComplete.setOnKeyListener(eVar);
        searchAutoComplete.setOnFocusChangeListener(new Q(this));
        setIconifiedByDefault(obtainStyledAttributes.getBoolean(18, true));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.f4995J = obtainStyledAttributes.getText(14);
        this.R = obtainStyledAttributes.getText(21);
        int i9 = obtainStyledAttributes.getInt(6, -1);
        if (i9 != -1) {
            setImeOptions(i9);
        }
        int i10 = obtainStyledAttributes.getInt(5, -1);
        if (i10 != -1) {
            setInputType(i10);
        }
        setFocusable(obtainStyledAttributes.getBoolean(1, true));
        z10.g();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f4993H = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f4994I = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f5019x = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new S(this));
        }
        y(this.f4999N);
        v();
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        SearchAutoComplete searchAutoComplete = this.f5011p;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // k.b
    public final void c() {
        if (this.f5004b0) {
            return;
        }
        this.f5004b0 = true;
        SearchAutoComplete searchAutoComplete = this.f5011p;
        int imeOptions = searchAutoComplete.getImeOptions();
        this.f5005c0 = imeOptions;
        searchAutoComplete.setImeOptions(imeOptions | 33554432);
        searchAutoComplete.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.T = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.f5011p;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.T = false;
    }

    @Override // k.b
    public final void e() {
        SearchAutoComplete searchAutoComplete = this.f5011p;
        searchAutoComplete.setText("");
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.f5003a0 = "";
        clearFocus();
        y(true);
        searchAutoComplete.setImeOptions(this.f5005c0);
        this.f5004b0 = false;
    }

    public int getImeOptions() {
        return this.f5011p.getImeOptions();
    }

    public int getInputType() {
        return this.f5011p.getInputType();
    }

    public int getMaxWidth() {
        return this.U;
    }

    public CharSequence getQuery() {
        return this.f5011p.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.R;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f5006d0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f4995J : getContext().getText(this.f5006d0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f4992G;
    }

    public int getSuggestionRowLayout() {
        return this.f4991F;
    }

    public C0.a getSuggestionsAdapter() {
        return this.f5001P;
    }

    public final Intent l(Uri uri, String str, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f5003a0);
        if (str3 != null) {
            intent.putExtra(SearchIntents.EXTRA_QUERY, str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f5007f0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f5006d0.getSearchActivity());
        return intent;
    }

    public final Intent m(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f5007f0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void n() {
        int i9 = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.f5011p;
        if (i9 >= 29) {
            i.a(searchAutoComplete);
            return;
        }
        m mVar = f4985j0;
        mVar.getClass();
        m.a();
        Method method = mVar.f5036a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, null);
            } catch (Exception unused) {
            }
        }
        mVar.getClass();
        m.a();
        Method method2 = mVar.f5037b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, null);
            } catch (Exception unused2) {
            }
        }
    }

    public final void o() {
        SearchAutoComplete searchAutoComplete = this.f5011p;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.f4999N) {
            clearFocus();
            y(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f5008g0);
        post(this.f5009h0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        if (z10) {
            int[] iArr = this.f4987B;
            SearchAutoComplete searchAutoComplete = this.f5011p;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.f4988C;
            getLocationInWindow(iArr2);
            int i13 = iArr[1] - iArr2[1];
            int i14 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i14;
            int height = searchAutoComplete.getHeight() + i13;
            Rect rect = this.f5021z;
            rect.set(i14, i13, width, height);
            int i15 = rect.left;
            int i16 = rect.right;
            int i17 = i12 - i10;
            Rect rect2 = this.f4986A;
            rect2.set(i15, 0, i16, i17);
            n nVar = this.f5020y;
            if (nVar == null) {
                n nVar2 = new n(rect2, rect, searchAutoComplete);
                this.f5020y = nVar2;
                setTouchDelegate(nVar2);
            } else {
                nVar.f5040b.set(rect2);
                Rect rect3 = nVar.f5042d;
                rect3.set(rect2);
                int i18 = -nVar.f5043e;
                rect3.inset(i18, i18);
                nVar.f5041c.set(rect);
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i9, int i10) {
        int i11;
        if (this.f5000O) {
            super.onMeasure(i9, i10);
            return;
        }
        int mode = View.MeasureSpec.getMode(i9);
        int size = View.MeasureSpec.getSize(i9);
        if (mode == Integer.MIN_VALUE) {
            int i12 = this.U;
            size = i12 > 0 ? Math.min(i12, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.U;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i11 = this.U) > 0) {
            size = Math.min(i11, size);
        }
        int mode2 = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f6536a);
        y(savedState.f5022c);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f5022c = this.f5000O;
        return savedState;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        post(this.f5008g0);
    }

    public final void p(int i9) {
        int i10;
        String i11;
        Cursor cursor = this.f5001P.f594c;
        if (cursor != null && cursor.moveToPosition(i9)) {
            Intent intent = null;
            try {
                int i12 = T.f23696x;
                String i13 = T.i(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (i13 == null) {
                    i13 = this.f5006d0.getSuggestIntentAction();
                }
                if (i13 == null) {
                    i13 = "android.intent.action.SEARCH";
                }
                String i14 = T.i(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (i14 == null) {
                    i14 = this.f5006d0.getSuggestIntentData();
                }
                if (i14 != null && (i11 = T.i(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    i14 = i14 + "/" + Uri.encode(i11);
                }
                intent = l(i14 == null ? null : Uri.parse(i14), i13, T.i(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), T.i(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e10) {
                try {
                    i10 = cursor.getPosition();
                } catch (RuntimeException unused) {
                    i10 = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + i10 + " returned exception.", e10);
            }
            if (intent != null) {
                try {
                    getContext().startActivity(intent);
                } catch (RuntimeException e11) {
                    Log.e("SearchView", "Failed launch activity: " + intent, e11);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.f5011p;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void q(int i9) {
        Editable text = this.f5011p.getText();
        Cursor cursor = this.f5001P.f594c;
        if (cursor == null) {
            return;
        }
        if (!cursor.moveToPosition(i9)) {
            setQuery(text);
            return;
        }
        String d10 = this.f5001P.d(cursor);
        if (d10 != null) {
            setQuery(d10);
        } else {
            setQuery(text);
        }
    }

    public final void r(CharSequence charSequence) {
        setQuery(charSequence);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i9, Rect rect) {
        if (this.T || !isFocusable()) {
            return false;
        }
        if (this.f5000O) {
            return super.requestFocus(i9, rect);
        }
        boolean requestFocus = this.f5011p.requestFocus(i9, rect);
        if (requestFocus) {
            y(false);
        }
        return requestFocus;
    }

    public final void s() {
        SearchAutoComplete searchAutoComplete = this.f5011p;
        Editable text = searchAutoComplete.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        k kVar = this.f4996K;
        if (kVar != null) {
            text.toString();
            if (kVar.n0()) {
                return;
            }
        }
        if (this.f5006d0 != null) {
            getContext().startActivity(l(null, "android.intent.action.SEARCH", null, text.toString()));
        }
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public void setAppSearchData(Bundle bundle) {
        this.f5007f0 = bundle;
    }

    public void setIconified(boolean z10) {
        if (z10) {
            o();
            return;
        }
        y(false);
        SearchAutoComplete searchAutoComplete = this.f5011p;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f4998M;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z10) {
        if (this.f4999N == z10) {
            return;
        }
        this.f4999N = z10;
        y(z10);
        v();
    }

    public void setImeOptions(int i9) {
        this.f5011p.setImeOptions(i9);
    }

    public void setInputType(int i9) {
        this.f5011p.setInputType(i9);
    }

    public void setMaxWidth(int i9) {
        this.U = i9;
        requestLayout();
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f4997L = onFocusChangeListener;
    }

    public void setOnQueryTextListener(k kVar) {
        this.f4996K = kVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f4998M = onClickListener;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.R = charSequence;
        v();
    }

    public void setQueryRefinementEnabled(boolean z10) {
        this.S = z10;
        C0.a aVar = this.f5001P;
        if (aVar instanceof T) {
            ((T) aVar).f23702p = z10 ? 2 : 1;
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f5006d0 = searchableInfo;
        Intent intent = null;
        SearchAutoComplete searchAutoComplete = this.f5011p;
        if (searchableInfo != null) {
            searchAutoComplete.setThreshold(searchableInfo.getSuggestThreshold());
            searchAutoComplete.setImeOptions(this.f5006d0.getImeOptions());
            int inputType = this.f5006d0.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.f5006d0.getSuggestAuthority() != null) {
                    inputType |= 589824;
                }
            }
            searchAutoComplete.setInputType(inputType);
            C0.a aVar = this.f5001P;
            if (aVar != null) {
                aVar.c(null);
            }
            if (this.f5006d0.getSuggestAuthority() != null) {
                T t3 = new T(getContext(), this, this.f5006d0, this.f5010i0);
                this.f5001P = t3;
                searchAutoComplete.setAdapter(t3);
                ((T) this.f5001P).f23702p = this.S ? 2 : 1;
            }
            v();
        }
        SearchableInfo searchableInfo2 = this.f5006d0;
        boolean z10 = false;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.f5006d0.getVoiceSearchLaunchWebSearch()) {
                intent = this.f4993H;
            } else if (this.f5006d0.getVoiceSearchLaunchRecognizer()) {
                intent = this.f4994I;
            }
            if (intent != null) {
                z10 = getContext().getPackageManager().resolveActivity(intent, 65536) != null;
            }
        }
        this.V = z10;
        if (z10) {
            searchAutoComplete.setPrivateImeOptions("nm");
        }
        y(this.f5000O);
    }

    public void setSubmitButtonEnabled(boolean z10) {
        this.f5002Q = z10;
        y(this.f5000O);
    }

    public void setSuggestionsAdapter(C0.a aVar) {
        this.f5001P = aVar;
        this.f5011p.setAdapter(aVar);
    }

    public final void t() {
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f5011p.getText());
        if (!z11 && (!this.f4999N || this.f5004b0)) {
            z10 = false;
        }
        int i9 = z10 ? 0 : 8;
        ImageView imageView = this.f5017v;
        imageView.setVisibility(i9);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(z11 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public final void u() {
        int[] iArr = this.f5011p.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f5013r.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f5014s.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void v() {
        Drawable drawable;
        CharSequence queryHint = getQueryHint();
        if (queryHint == null) {
            queryHint = "";
        }
        boolean z10 = this.f4999N;
        SearchAutoComplete searchAutoComplete = this.f5011p;
        if (z10 && (drawable = this.f4990E) != null) {
            int textSize = (int) (searchAutoComplete.getTextSize() * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    public final void w() {
        this.f5014s.setVisibility(((this.f5002Q || this.V) && !this.f5000O && (this.f5016u.getVisibility() == 0 || this.f5018w.getVisibility() == 0)) ? 0 : 8);
    }

    public final void x(boolean z10) {
        boolean z11 = this.f5002Q;
        this.f5016u.setVisibility((!z11 || !(z11 || this.V) || this.f5000O || !hasFocus() || (!z10 && this.V)) ? 8 : 0);
    }

    public final void y(boolean z10) {
        this.f5000O = z10;
        int i9 = 8;
        int i10 = z10 ? 0 : 8;
        boolean isEmpty = TextUtils.isEmpty(this.f5011p.getText());
        this.f5015t.setVisibility(i10);
        x(!isEmpty);
        this.f5012q.setVisibility(z10 ? 8 : 0);
        ImageView imageView = this.f4989D;
        imageView.setVisibility((imageView.getDrawable() == null || this.f4999N) ? 8 : 0);
        t();
        if (this.V && !this.f5000O && isEmpty) {
            this.f5016u.setVisibility(8);
            i9 = 0;
        }
        this.f5018w.setVisibility(i9);
        w();
    }

    public static class SearchAutoComplete extends C1001c {

        /* renamed from: a, reason: collision with root package name */
        public int f5023a;

        /* renamed from: b, reason: collision with root package name */
        public SearchView f5024b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f5025c;

        /* renamed from: d, reason: collision with root package name */
        public final a f5026d;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                SearchAutoComplete searchAutoComplete = SearchAutoComplete.this;
                if (searchAutoComplete.f5025c) {
                    ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
                    searchAutoComplete.f5025c = false;
                }
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet, R.attr.autoCompleteTextViewStyle);
            this.f5026d = new a();
            this.f5023a = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i9 = configuration.screenHeightDp;
            if (i >= 960 && i9 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i < 600) {
                return (i < 640 || i9 < 480) ? 160 : 192;
            }
            return 192;
        }

        public final void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                i.b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            m mVar = SearchView.f4985j0;
            mVar.getClass();
            m.a();
            Method method = mVar.f5038c;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.f5023a <= 0 || super.enoughToFilter();
        }

        @Override // m.C1001c, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f5025c) {
                a aVar = this.f5026d;
                removeCallbacks(aVar);
                post(aVar);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z10, int i, Rect rect) {
            super.onFocusChanged(z10, i, rect);
            SearchView searchView = this.f5024b;
            searchView.y(searchView.f5000O);
            searchView.post(searchView.f5008g0);
            if (searchView.f5011p.hasFocus()) {
                searchView.n();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f5024b.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z10) {
            super.onWindowFocusChanged(z10);
            if (z10 && this.f5024b.hasFocus() && getVisibility() == 0) {
                this.f5025c = true;
                Context context = getContext();
                m mVar = SearchView.f4985j0;
                if (context.getResources().getConfiguration().orientation == 2) {
                    a();
                }
            }
        }

        public void setImeVisibility(boolean z10) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            a aVar = this.f5026d;
            if (!z10) {
                this.f5025c = false;
                removeCallbacks(aVar);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f5025c = true;
                    return;
                }
                this.f5025c = false;
                removeCallbacks(aVar);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f5024b = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f5023a = i;
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }
    }

    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            SearchView searchView = SearchView.this;
            Editable text = searchView.f5011p.getText();
            searchView.f5003a0 = text;
            boolean isEmpty = TextUtils.isEmpty(text);
            searchView.x(!isEmpty);
            int i11 = 8;
            if (searchView.V && !searchView.f5000O && isEmpty) {
                searchView.f5016u.setVisibility(8);
                i11 = 0;
            }
            searchView.f5018w.setVisibility(i11);
            searchView.t();
            searchView.w();
            if (searchView.f4996K != null && !TextUtils.equals(charSequence, searchView.W)) {
                searchView.f4996K.b(charSequence.toString());
            }
            searchView.W = charSequence.toString();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }

    public class h implements AdapterView.OnItemSelectedListener {
        public h() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j10) {
            SearchView.this.q(i);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public void setOnCloseListener(j jVar) {
    }

    public void setOnSuggestionListener(l lVar) {
    }
}
