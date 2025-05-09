package com.google.android.material.navigation;

import android.view.MenuItem;
import androidx.appcompat.view.menu.f;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.luminary.business.presentation.ui.activity.main.MainActivity;
import com.luminary.mobile.R;
import y6.C1616b;

/* compiled from: NavigationBarView.java */
/* loaded from: classes.dex */
public final class a implements f.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NavigationBarView f9696a;

    public a(BottomNavigationView bottomNavigationView) {
        this.f9696a = bottomNavigationView;
    }

    @Override // androidx.appcompat.view.menu.f.a
    public final boolean a(f fVar, MenuItem menuItem) {
        NavigationBarView navigationBarView = this.f9696a;
        navigationBarView.getClass();
        NavigationBarView.b bVar = navigationBarView.f9694e;
        if (bVar == null) {
            return false;
        }
        MainActivity mainActivity = (MainActivity) ((C1616b) bVar).f31119a;
        if (!mainActivity.f11412t) {
            return false;
        }
        int itemId = menuItem.getItemId();
        if (itemId == R.id.navigation_home) {
            mainActivity.C().i(R.id.action_global_homeFragment, null);
            return false;
        }
        if (itemId == R.id.navigation_cards) {
            mainActivity.C().i(R.id.action_global_cardsFragment, null);
            return false;
        }
        if (itemId == R.id.navigation_exchange) {
            mainActivity.C().i(R.id.action_global_exchangeListFragment, null);
            return false;
        }
        if (itemId != R.id.navigation_payments) {
            if (itemId != R.id.navigation_hub) {
                return false;
            }
            mainActivity.C().i(R.id.action_global_hubFragment, null);
            return false;
        }
        if (mainActivity.B().E()) {
            mainActivity.C().i(R.id.action_global_cryptoListFragment, null);
            return false;
        }
        mainActivity.C().i(R.id.action_global_paymentsFragment, null);
        return false;
    }

    @Override // androidx.appcompat.view.menu.f.a
    public final void b(f fVar) {
    }
}
