package com.chuckerteam.chucker.internal.ui.transaction;

import C.N;
import S1.l;
import S1.m;
import U1.f;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.C0552s;
import androidx.lifecycle.W;
import androidx.viewpager.widget.ViewPager;
import ca.InterfaceC0635a;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.tabs.TabLayout;
import com.luminary.mobile.R;
import h.AbstractC0774a;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* compiled from: TransactionActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/chuckerteam/chucker/internal/ui/transaction/TransactionActivity;", "LT1/a;", "<init>", "()V", "com.github.ChuckerTeam.Chucker.library"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final class TransactionActivity extends T1.a {

    /* renamed from: k, reason: collision with root package name */
    public static int f8714k;
    public final H1.a i = new H1.a(h.a(U1.h.class), new InterfaceC0635a<W>() { // from class: com.chuckerteam.chucker.internal.ui.transaction.TransactionActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        public final W invoke() {
            return ComponentActivity.this.getViewModelStore();
        }
    }, new A8.b(this, 14), new InterfaceC0635a<R0.a>() { // from class: com.chuckerteam.chucker.internal.ui.transaction.TransactionActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        public final R0.a invoke() {
            return ComponentActivity.this.getDefaultViewModelCreationExtras();
        }
    });

    /* renamed from: j, reason: collision with root package name */
    public N f8715j;

    @Override // T1.a, androidx.fragment.app.ActivityC0533g, androidx.activity.ComponentActivity, j0.ActivityC0879h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View inflate = getLayoutInflater().inflate(R.layout.chucker_activity_transaction, (ViewGroup) null, false);
        int i = R.id.tabLayout;
        TabLayout tabLayout = (TabLayout) j3.e.q(R.id.tabLayout, inflate);
        if (tabLayout != null) {
            i = R.id.toolbar;
            MaterialToolbar materialToolbar = (MaterialToolbar) j3.e.q(R.id.toolbar, inflate);
            if (materialToolbar != null) {
                i = R.id.toolbarTitle;
                TextView textView = (TextView) j3.e.q(R.id.toolbarTitle, inflate);
                if (textView != null) {
                    i = R.id.viewPager;
                    ViewPager viewPager = (ViewPager) j3.e.q(R.id.viewPager, inflate);
                    if (viewPager != null) {
                        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) inflate;
                        this.f8715j = new N(coordinatorLayout, tabLayout, materialToolbar, textView, viewPager);
                        setContentView(coordinatorLayout);
                        setSupportActionBar(materialToolbar);
                        viewPager.setAdapter(new f(this, getSupportFragmentManager()));
                        viewPager.b(new U1.d());
                        viewPager.setCurrentItem(f8714k);
                        tabLayout.setupWithViewPager(viewPager);
                        AbstractC0774a supportActionBar = getSupportActionBar();
                        if (supportActionBar != null) {
                            supportActionBar.m(true);
                        }
                        s().f3652B0.observe(this, new U1.b(this, 0));
                        return;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.chucker_transaction, menu);
        MenuItem findItem = menu.findItem(R.id.encode_url);
        findItem.setOnMenuItemClickListener(new U1.c(this, 0));
        s().f3658p.observe(this, new U1.b(findItem, 1));
        return super.onCreateOptionsMenu(menu);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.share_text) {
            HttpTransaction value = s().f3655E0.getValue();
            if (value == null) {
                T1.a.l(this, getString(R.string.chucker_request_not_ready));
                return true;
            }
            BuildersKt__Builders_commonKt.launch$default(C0552s.a(this), null, null, new TransactionActivity$shareTransactionAsText$1(new m(value, ((Boolean) s().f3658p.getValue()).booleanValue()), this, null), 3, null);
            return true;
        }
        if (itemId == R.id.share_curl) {
            HttpTransaction value2 = s().f3655E0.getValue();
            if (value2 == null) {
                T1.a.l(this, getString(R.string.chucker_request_not_ready));
                return true;
            }
            BuildersKt__Builders_commonKt.launch$default(C0552s.a(this), null, null, new TransactionActivity$shareTransactionAsText$1(new l(value2, 0), this, null), 3, null);
            return true;
        }
        if (itemId == R.id.share_file) {
            BuildersKt__Builders_commonKt.launch$default(C0552s.a(this), null, null, new TransactionActivity$shareTransactionAsFile$1(this, new TransactionActivity$onOptionsItemSelected$3(this, null), "transaction.txt", null), 3, null);
            return true;
        }
        if (itemId != R.id.share_har) {
            return super.onOptionsItemSelected(menuItem);
        }
        BuildersKt__Builders_commonKt.launch$default(C0552s.a(this), null, null, new TransactionActivity$shareTransactionAsFile$1(this, new TransactionActivity$onOptionsItemSelected$4(this, null), "transaction.har", null), 3, null);
        return true;
    }

    public final U1.h s() {
        return (U1.h) this.i.getValue();
    }
}
