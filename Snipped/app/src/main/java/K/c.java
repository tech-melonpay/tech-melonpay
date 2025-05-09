package k;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;

/* compiled from: ContextThemeWrapper.java */
/* loaded from: classes.dex */
public final class c extends ContextWrapper {

    /* renamed from: f, reason: collision with root package name */
    public static Configuration f22600f;

    /* renamed from: a, reason: collision with root package name */
    public int f22601a;

    /* renamed from: b, reason: collision with root package name */
    public Resources.Theme f22602b;

    /* renamed from: c, reason: collision with root package name */
    public LayoutInflater f22603c;

    /* renamed from: d, reason: collision with root package name */
    public Configuration f22604d;

    /* renamed from: e, reason: collision with root package name */
    public Resources f22605e;

    public c() {
        super(null);
    }

    public final void a(Configuration configuration) {
        if (this.f22605e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f22604d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f22604d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.f22602b == null) {
            this.f22602b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f22602b.setTo(theme);
            }
        }
        this.f22602b.applyStyle(this.f22601a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        if (this.f22605e == null) {
            Configuration configuration = this.f22604d;
            if (configuration != null) {
                if (f22600f == null) {
                    Configuration configuration2 = new Configuration();
                    configuration2.fontScale = 0.0f;
                    f22600f = configuration2;
                }
                if (!configuration.equals(f22600f)) {
                    this.f22605e = createConfigurationContext(this.f22604d).getResources();
                }
            }
            this.f22605e = super.getResources();
        }
        return this.f22605e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f22603c == null) {
            this.f22603c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f22603c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f22602b;
        if (theme != null) {
            return theme;
        }
        if (this.f22601a == 0) {
            this.f22601a = 2132083344;
        }
        b();
        return this.f22602b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.f22601a != i) {
            this.f22601a = i;
            b();
        }
    }

    public c(Context context, int i) {
        super(context);
        this.f22601a = i;
    }
}
