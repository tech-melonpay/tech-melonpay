package h;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.ActivityC0533g;
import androidx.lifecycle.C0552s;
import b1.C0582b;
import com.luminary.mobile.R;
import h.AbstractC0777d;
import j0.H;
import k.AbstractC0912a;
import m.d0;

/* compiled from: AppCompatActivity.java */
/* renamed from: h.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class ActivityC0775b extends ActivityC0533g implements InterfaceC0776c, H.a {
    private AbstractC0777d mDelegate;
    private Resources mResources;

    /* compiled from: AppCompatActivity.java */
    /* renamed from: h.b$a */
    public class a implements C0582b.InterfaceC0093b {
        public a() {
        }

        @Override // b1.C0582b.InterfaceC0093b
        public final Bundle b() {
            Bundle bundle = new Bundle();
            ActivityC0775b.this.getDelegate().getClass();
            return bundle;
        }
    }

    /* compiled from: AppCompatActivity.java */
    /* renamed from: h.b$b, reason: collision with other inner class name */
    public class C0402b implements d.b {
        public C0402b() {
        }

        @Override // d.b
        public final void a(Context context) {
            ActivityC0775b activityC0775b = ActivityC0775b.this;
            AbstractC0777d delegate = activityC0775b.getDelegate();
            delegate.j();
            activityC0775b.getSavedStateRegistry().a("androidx:appcompat");
            delegate.n();
        }
    }

    public ActivityC0775b() {
        initDelegate();
    }

    private void initDelegate() {
        getSavedStateRegistry().c("androidx:appcompat", new a());
        addOnContextAvailableListener(new C0402b());
    }

    private void initViewTreeOwners() {
        C0552s.c(getWindow().getDecorView(), this);
        getWindow().getDecorView().setTag(R.id.view_tree_view_model_store_owner, this);
        U4.b.D(getWindow().getDecorView(), this);
        getWindow().getDecorView().setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
    }

    private boolean performMenuItemShortcut(KeyEvent keyEvent) {
        return false;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        getDelegate().c(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(getDelegate().d(context));
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        AbstractC0774a supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.a()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // j0.ActivityC0879h, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        AbstractC0774a supportActionBar = getSupportActionBar();
        if (keyCode == 82 && supportActionBar != null && supportActionBar.j(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i) {
        return (T) getDelegate().e(i);
    }

    public AbstractC0777d getDelegate() {
        if (this.mDelegate == null) {
            AbstractC0777d.c cVar = AbstractC0777d.f20849a;
            this.mDelegate = new LayoutInflaterFactory2C0778e(this, null, this, this);
        }
        return this.mDelegate;
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return getDelegate().h();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        Resources resources = this.mResources;
        if (resources == null) {
            int i = d0.f23752a;
        }
        return resources == null ? super.getResources() : resources;
    }

    public AbstractC0774a getSupportActionBar() {
        return getDelegate().i();
    }

    @Override // j0.H.a
    public Intent getSupportParentActivityIntent() {
        return j0.l.a(this);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        getDelegate().k();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getDelegate().m(configuration);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        onSupportContentChanged();
    }

    public void onCreateSupportNavigateUpTaskStack(H h9) {
        h9.getClass();
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = j0.l.a(this);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(h9.f22244b.getPackageManager());
            }
            h9.a(component);
            h9.f22243a.add(supportParentActivityIntent);
        }
    }

    @Override // androidx.fragment.app.ActivityC0533g, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getDelegate().o();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (performMenuItemShortcut(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // androidx.fragment.app.ActivityC0533g, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        AbstractC0774a supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.d() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        getDelegate().p();
    }

    @Override // androidx.fragment.app.ActivityC0533g, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        getDelegate().q();
    }

    @Override // androidx.fragment.app.ActivityC0533g, android.app.Activity
    public void onStart() {
        super.onStart();
        getDelegate().r();
    }

    @Override // androidx.fragment.app.ActivityC0533g, android.app.Activity
    public void onStop() {
        super.onStop();
        getDelegate().s();
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (!supportShouldUpRecreateTask(supportParentActivityIntent)) {
            supportNavigateUpTo(supportParentActivityIntent);
            return true;
        }
        H h9 = new H(this);
        onCreateSupportNavigateUpTaskStack(h9);
        onPrepareSupportNavigateUpTaskStack(h9);
        h9.b();
        try {
            finishAffinity();
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        getDelegate().A(charSequence);
    }

    @Override // h.InterfaceC0776c
    public AbstractC0912a onWindowStartingSupportActionMode(AbstractC0912a.InterfaceC0418a interfaceC0418a) {
        return null;
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        AbstractC0774a supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.k()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i) {
        initViewTreeOwners();
        getDelegate().v(i);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        getDelegate().y(toolbar);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(i);
        getDelegate().z(i);
    }

    public void supportNavigateUpTo(Intent intent) {
        navigateUpTo(intent);
    }

    public boolean supportShouldUpRecreateTask(Intent intent) {
        return shouldUpRecreateTask(intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        initViewTreeOwners();
        getDelegate().w(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        getDelegate().x(view, layoutParams);
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public void onLocalesChanged(t0.g gVar) {
    }

    public void onNightModeChanged(int i) {
    }

    public void onPrepareSupportNavigateUpTaskStack(H h9) {
    }

    @Override // h.InterfaceC0776c
    public void onSupportActionModeFinished(AbstractC0912a abstractC0912a) {
    }

    @Override // h.InterfaceC0776c
    public void onSupportActionModeStarted(AbstractC0912a abstractC0912a) {
    }
}
