package m;

import C0.a;
import android.R;
import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: SuggestionsAdapter.java */
/* loaded from: classes.dex */
public final class T extends C0.c implements View.OnClickListener {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f23696x = 0;

    /* renamed from: k, reason: collision with root package name */
    public final SearchView f23697k;

    /* renamed from: l, reason: collision with root package name */
    public final SearchableInfo f23698l;

    /* renamed from: m, reason: collision with root package name */
    public final Context f23699m;

    /* renamed from: n, reason: collision with root package name */
    public final WeakHashMap<String, Drawable.ConstantState> f23700n;

    /* renamed from: o, reason: collision with root package name */
    public final int f23701o;

    /* renamed from: p, reason: collision with root package name */
    public int f23702p;

    /* renamed from: q, reason: collision with root package name */
    public ColorStateList f23703q;

    /* renamed from: r, reason: collision with root package name */
    public int f23704r;

    /* renamed from: s, reason: collision with root package name */
    public int f23705s;

    /* renamed from: t, reason: collision with root package name */
    public int f23706t;

    /* renamed from: u, reason: collision with root package name */
    public int f23707u;

    /* renamed from: v, reason: collision with root package name */
    public int f23708v;

    /* renamed from: w, reason: collision with root package name */
    public int f23709w;

    /* compiled from: SuggestionsAdapter.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final TextView f23710a;

        /* renamed from: b, reason: collision with root package name */
        public final TextView f23711b;

        /* renamed from: c, reason: collision with root package name */
        public final ImageView f23712c;

        /* renamed from: d, reason: collision with root package name */
        public final ImageView f23713d;

        /* renamed from: e, reason: collision with root package name */
        public final ImageView f23714e;

        public a(View view) {
            this.f23710a = (TextView) view.findViewById(R.id.text1);
            this.f23711b = (TextView) view.findViewById(R.id.text2);
            this.f23712c = (ImageView) view.findViewById(R.id.icon1);
            this.f23713d = (ImageView) view.findViewById(R.id.icon2);
            this.f23714e = (ImageView) view.findViewById(com.luminary.mobile.R.id.edit_query);
        }
    }

    public T(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.f593b = true;
        this.f594c = null;
        this.f592a = false;
        this.f595d = -1;
        this.f596e = new a.C0006a();
        this.f597f = new a.b();
        this.i = suggestionRowLayout;
        this.f602h = suggestionRowLayout;
        this.f603j = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f23702p = 1;
        this.f23704r = -1;
        this.f23705s = -1;
        this.f23706t = -1;
        this.f23707u = -1;
        this.f23708v = -1;
        this.f23709w = -1;
        this.f23697k = searchView;
        this.f23698l = searchableInfo;
        this.f23701o = searchView.getSuggestionCommitIconResId();
        this.f23699m = context;
        this.f23700n = weakHashMap;
    }

    public static String i(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e10);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013e  */
    @Override // C0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(android.view.View r22, android.database.Cursor r23) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m.T.b(android.view.View, android.database.Cursor):void");
    }

    @Override // C0.a
    public final void c(Cursor cursor) {
        try {
            super.c(cursor);
            if (cursor != null) {
                this.f23704r = cursor.getColumnIndex("suggest_text_1");
                this.f23705s = cursor.getColumnIndex("suggest_text_2");
                this.f23706t = cursor.getColumnIndex("suggest_text_2_url");
                this.f23707u = cursor.getColumnIndex("suggest_icon_1");
                this.f23708v = cursor.getColumnIndex("suggest_icon_2");
                this.f23709w = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e10);
        }
    }

    @Override // C0.a
    public final String d(Cursor cursor) {
        String i;
        String i9;
        if (cursor == null) {
            return null;
        }
        String i10 = i(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (i10 != null) {
            return i10;
        }
        SearchableInfo searchableInfo = this.f23698l;
        if (searchableInfo.shouldRewriteQueryFromData() && (i9 = i(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return i9;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (i = i(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return i;
    }

    @Override // C0.a
    public final View e(ViewGroup viewGroup) {
        View inflate = this.f603j.inflate(this.f602h, viewGroup, false);
        inflate.setTag(new a(inflate));
        ((ImageView) inflate.findViewById(com.luminary.mobile.R.id.edit_query)).setImageResource(this.f23701o);
        return inflate;
    }

    public final Drawable f(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException(com.google.android.gms.measurement.internal.a.h("No authority: ", uri));
        }
        try {
            Resources resourcesForApplication = this.f23699m.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException(com.google.android.gms.measurement.internal.a.h("No path: ", uri));
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    parseInt = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException(com.google.android.gms.measurement.internal.a.h("Single path segment is not a resource ID: ", uri));
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException(com.google.android.gms.measurement.internal.a.h("More than two path segments: ", uri));
                }
                parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (parseInt != 0) {
                return resourcesForApplication.getDrawable(parseInt);
            }
            throw new FileNotFoundException(com.google.android.gms.measurement.internal.a.h("No resource found for: ", uri));
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException(com.google.android.gms.measurement.internal.a.h("No package found for authority: ", uri));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.drawable.Drawable g(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m.T.g(java.lang.String):android.graphics.drawable.Drawable");
    }

    @Override // C0.a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View inflate = this.f603j.inflate(this.i, viewGroup, false);
            if (inflate != null) {
                ((a) inflate.getTag()).f23710a.setText(e10.toString());
            }
            return inflate;
        }
    }

    @Override // C0.a, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View e11 = e(viewGroup);
            ((a) e11.getTag()).f23710a.setText(e10.toString());
            return e11;
        }
    }

    public final Cursor h(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme(FirebaseAnalytics.Param.CONTENT).authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        fragment.appendQueryParameter("limit", String.valueOf(50));
        return this.f23699m.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.f594c;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f594c;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f23697k.r((CharSequence) tag);
        }
    }
}
